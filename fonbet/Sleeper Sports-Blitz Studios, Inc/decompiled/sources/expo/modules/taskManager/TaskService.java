package expo.modules.taskManager;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.modules.apploader.AppLoaderProvider;
import expo.modules.apploader.HeadlessAppLoader;
import expo.modules.core.interfaces.Consumer;
import expo.modules.core.interfaces.SingletonModule;
import expo.modules.interfaces.taskManager.TaskConsumerInterface;
import expo.modules.interfaces.taskManager.TaskExecutionCallback;
import expo.modules.interfaces.taskManager.TaskInterface;
import expo.modules.interfaces.taskManager.TaskManagerInterface;
import expo.modules.interfaces.taskManager.TaskManagerUtilsInterface;
import expo.modules.interfaces.taskManager.TaskServiceInterface;
import expo.modules.taskManager.exceptions.InvalidConsumerClassException;
import expo.modules.taskManager.exceptions.TaskNotFoundException;
import expo.modules.taskManager.exceptions.TaskRegisteringFailedException;
import expo.modules.taskManager.repository.TasksAndEventsRepository;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class TaskService implements SingletonModule, TaskServiceInterface {
    private static final int MAX_TASK_EXECUTION_TIME_MS = 15000;
    private static final String SHARED_PREFERENCES_NAME = "TaskManagerModule";
    private static final String TAG = "TaskService";
    private WeakReference<Context> mContextRef;
    private TaskManagerUtilsInterface mTaskManagerUtils;
    private TasksAndEventsRepository mTasksAndEventsRepository;
    private static final Map<String, WeakReference<TaskManagerInterface>> sTaskManagers = new HashMap();
    private static final Map<String, WeakReference<TaskManagerInterface>> sHeadlessTaskManagers = new HashMap();
    private static final Map<String, List<String>> sEvents = new HashMap();
    private static final Map<String, TaskExecutionCallback> sTaskCallbacks = new HashMap();
    private static final Map<String, Integer> sHeadlessTaskIds = new HashMap();

    static /* synthetic */ void lambda$executeTask$1() {
    }

    public TaskService(Context context) {
        this.mContextRef = new WeakReference<>(context);
        TasksAndEventsRepository create = TasksAndEventsRepository.create(context);
        this.mTasksAndEventsRepository = create;
        if (create.tasksExist()) {
            return;
        }
        this.mTasksAndEventsRepository.createTasks();
        restoreTasks();
    }

    @Override // expo.modules.core.interfaces.SingletonModule
    public String getName() {
        return TAG;
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public boolean hasRegisteredTask(String str, String str2) {
        return getTask(str, str2) != null;
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public void registerTask(String str, String str2, String str3, Class cls, Map<String, Object> map) throws TaskRegisteringFailedException {
        TaskService taskService;
        String str4;
        TaskInterface task = getTask(str, str2);
        Class unversionedClassForClass = Utils.unversionedClassForClass(cls);
        if (task != null && unversionedClassForClass != null && unversionedClassForClass.isInstance(task.getConsumer())) {
            task.setOptions(map);
            task.getConsumer().setOptions(map);
            taskService = this;
            str4 = str2;
        } else {
            taskService = this;
            str4 = str2;
            taskService.internalRegisterTask(str, str4, str3, cls, map);
        }
        taskService.mTasksAndEventsRepository.persistTasksForAppScopeKey(getSharedPreferences(), str4);
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public void unregisterTask(String str, String str2, Class cls) throws TaskNotFoundException, InvalidConsumerClassException {
        TaskInterface task = getTask(str, str2);
        Class unversionedClassForClass = Utils.unversionedClassForClass(cls);
        if (task == null) {
            throw new TaskNotFoundException(str, str2);
        }
        if (unversionedClassForClass != null && !unversionedClassForClass.isInstance(task.getConsumer())) {
            throw new InvalidConsumerClassException(str);
        }
        this.mTasksAndEventsRepository.removeTask(str2, str);
        Log.i(TAG, "Unregistering task '" + str + "' for app with scoping identifier '" + str2 + "'.");
        task.getConsumer().didUnregister();
        this.mTasksAndEventsRepository.persistTasksForAppScopeKey(getSharedPreferences(), str2);
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public void unregisterAllTasksForAppScopeKey(String str) {
        Map<String, TaskInterface> tasks = this.mTasksAndEventsRepository.getTasks(str);
        if (tasks != null) {
            Log.i(TAG, "Unregistering all tasks for app with scoping identifier '" + str + "'.");
            Iterator<TaskInterface> it = tasks.values().iterator();
            while (it.hasNext()) {
                it.next().getConsumer().didUnregister();
            }
            this.mTasksAndEventsRepository.removeTasks(str);
            removeAppFromConfig(str);
        }
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public boolean taskHasConsumerOfClass(String str, String str2, Class cls) {
        TaskInterface task = getTask(str, str2);
        return task != null && Utils.unversionedClassForClass(cls).isInstance(task.getConsumer());
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public Bundle getTaskOptions(String str, String str2) {
        TaskInterface task = getTask(str, str2);
        if (task != null) {
            return task.getOptionsBundle();
        }
        return null;
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public List<Bundle> getTasksForAppScopeKey(String str) {
        Map<String, TaskInterface> tasks = this.mTasksAndEventsRepository.getTasks(str);
        ArrayList arrayList = new ArrayList();
        if (tasks != null) {
            for (TaskInterface taskInterface : tasks.values()) {
                Bundle bundle = new Bundle();
                bundle.putString("taskName", taskInterface.getName());
                bundle.putString("taskType", taskInterface.getConsumer().taskType());
                bundle.putBundle("options", taskInterface.getOptionsBundle());
                arrayList.add(bundle);
            }
        }
        return arrayList;
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public List<TaskConsumerInterface> getTaskConsumers(String str) {
        Map<String, TaskInterface> tasks = this.mTasksAndEventsRepository.getTasks(str);
        ArrayList arrayList = new ArrayList();
        if (tasks != null) {
            Iterator<TaskInterface> it = tasks.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getConsumer());
            }
        }
        return arrayList;
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public void notifyTaskFinished(String str, final String str2, Map<String, Object> map) {
        String str3 = (String) map.get("eventId");
        Map<String, List<String>> map2 = sEvents;
        List<String> list = map2.get(str2);
        Log.i(TAG, "Finished task '" + str + "' with eventId '" + str3 + "'.");
        if (list != null) {
            list.remove(str3);
            if (list.isEmpty()) {
                map2.remove(str2);
                maybeFinishHeadlessTask(str2);
                new Handler().postDelayed(new Runnable() { // from class: expo.modules.taskManager.TaskService$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaskService.this.lambda$notifyTaskFinished$0(str2);
                    }
                }, 2000L);
            }
        }
        TaskExecutionCallback taskExecutionCallback = sTaskCallbacks.get(str3);
        if (taskExecutionCallback != null) {
            taskExecutionCallback.onFinished(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyTaskFinished$0(String str) {
        if (sEvents.containsKey(str)) {
            return;
        }
        invalidateAppRecord(str);
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public void setTaskManager(TaskManagerInterface taskManagerInterface, String str, String str2) {
        if (taskManagerInterface == null) {
            sTaskManagers.remove(str);
            return;
        }
        boolean isStartedByHeadlessLoader = isStartedByHeadlessLoader(str);
        (isStartedByHeadlessLoader ? sHeadlessTaskManagers : sTaskManagers).put(str, new WeakReference<>(taskManagerInterface));
        List<Bundle> events = this.mTasksAndEventsRepository.getEvents(str);
        if (events != null) {
            Iterator<Bundle> it = events.iterator();
            while (it.hasNext()) {
                taskManagerInterface.executeTaskWithBody(it.next());
            }
        }
        this.mTasksAndEventsRepository.removeEvents(str);
        if (isStartedByHeadlessLoader) {
            return;
        }
        maybeUpdateAppUrlForAppScopeKey(str2, str);
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public boolean isStartedByHeadlessLoader(String str) {
        HeadlessAppLoader appLoader = getAppLoader();
        if (appLoader != null) {
            return appLoader.isRunning(str);
        }
        return false;
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        Uri data = intent.getData();
        if (!TaskBroadcastReceiver.INTENT_ACTION.equals(action)) {
            Log.i(TAG, "Handling intent with action '" + action + "'.");
            Iterator<String> it = this.mTasksAndEventsRepository.allAppScopeKeysWithTasks().iterator();
            while (it.hasNext()) {
                for (TaskConsumerInterface taskConsumerInterface : getTaskConsumers(it.next())) {
                    if (taskConsumerInterface.canReceiveCustomBroadcast(action)) {
                        taskConsumerInterface.didReceiveBroadcast(intent);
                    }
                }
            }
            return;
        }
        if (data == null) {
            return;
        }
        String queryParameter = data.getQueryParameter(RemoteConfigConstants.RequestFieldKey.APP_ID);
        String queryParameter2 = data.getQueryParameter("taskName");
        TaskConsumerInterface taskConsumer = getTaskConsumer(queryParameter2, queryParameter);
        Log.i(TAG, "Handling intent with task name '" + queryParameter2 + "' and app scoping identifier '" + queryParameter + "'.");
        if (taskConsumer == null) {
            Log.w(TAG, "Task or consumer not found.");
            getTaskManagerUtils().cancelTaskIntent(this.mContextRef.get(), queryParameter, queryParameter2);
        } else {
            taskConsumer.didReceiveBroadcast(intent);
        }
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public boolean handleJob(JobService jobService, JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        String string = extras.getString(RemoteConfigConstants.RequestFieldKey.APP_ID);
        String string2 = extras.getString("taskName");
        TaskConsumerInterface taskConsumer = getTaskConsumer(string2, string);
        if (taskConsumer == null) {
            Log.w(TAG, "Task or consumer not found.");
            return false;
        }
        Log.i(TAG, "Handling job with task name '" + string2 + "' for app with scoping identifier '" + string + "'.");
        boolean didExecuteJob = taskConsumer.didExecuteJob(jobService, jobParameters);
        if (didExecuteJob) {
            finishJobAfterTimeout(jobService, jobParameters, 15000L);
        }
        return didExecuteJob;
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public boolean cancelJob(JobService jobService, JobParameters jobParameters) {
        TaskConsumerInterface consumer;
        PersistableBundle extras = jobParameters.getExtras();
        String string = extras.getString(RemoteConfigConstants.RequestFieldKey.APP_ID);
        String string2 = extras.getString("taskName");
        TaskInterface task = getTask(string2, string);
        if (task == null || (consumer = task.getConsumer()) == null) {
            return false;
        }
        Log.i(TAG, "Job for task '" + string2 + "' has been cancelled by the system.");
        return consumer.didCancelJob(jobService, jobParameters);
    }

    @Override // expo.modules.interfaces.taskManager.TaskServiceInterface
    public void executeTask(TaskInterface taskInterface, Bundle bundle, Error error, TaskExecutionCallback taskExecutionCallback) {
        final String appScopeKey = taskInterface.getAppScopeKey();
        TaskManagerInterface taskManager = getTaskManager(appScopeKey);
        Bundle createExecutionEventBody = createExecutionEventBody(taskInterface, bundle, error);
        Bundle bundle2 = createExecutionEventBody.getBundle("executionInfo");
        if (bundle2 == null) {
            return;
        }
        String string = bundle2.getString("eventId");
        if (taskExecutionCallback != null) {
            sTaskCallbacks.put(string, taskExecutionCallback);
        }
        Map<String, List<String>> map = sEvents;
        boolean z = map.get(appScopeKey) == null;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(string);
            map.put(appScopeKey, arrayList);
        } else {
            map.get(appScopeKey).add(string);
        }
        if (z) {
            maybeStartHeadlessTask(appScopeKey);
        }
        if (taskManager != null) {
            taskManager.executeTaskWithBody(createExecutionEventBody);
            return;
        }
        if (!this.mTasksAndEventsRepository.hasEvents(appScopeKey)) {
            this.mTasksAndEventsRepository.putEvents(appScopeKey, new ArrayList());
        }
        this.mTasksAndEventsRepository.putEventForAppScopeKey(appScopeKey, createExecutionEventBody);
        getAppLoader().loadApp(this.mContextRef.get(), new HeadlessAppLoader.Params(appScopeKey, taskInterface.getAppUrl()), new Runnable() { // from class: expo.modules.taskManager.TaskService$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                TaskService.lambda$executeTask$1();
            }
        }, new Consumer() { // from class: expo.modules.taskManager.TaskService$$ExternalSyntheticLambda5
            @Override // expo.modules.core.interfaces.Consumer
            public final void apply(Object obj) {
                TaskService.this.lambda$executeTask$2(appScopeKey, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeTask$2(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        sEvents.remove(str);
        this.mTasksAndEventsRepository.removeEvents(str);
        unregisterAllTasksForAppScopeKey(str);
    }

    private HeadlessAppLoader getAppLoader() {
        if (this.mContextRef.get() != null) {
            return AppLoaderProvider.getLoader("react-native-headless", this.mContextRef.get());
        }
        return null;
    }

    private void internalRegisterTask(String str, String str2, String str3, Class<TaskConsumerInterface> cls, Map<String, Object> map) throws TaskRegisteringFailedException {
        Context context = this.mContextRef.get();
        if (context == null) {
            return;
        }
        try {
            TaskConsumerInterface newInstance = cls.getDeclaredConstructor(Context.class, TaskManagerUtilsInterface.class).newInstance(context, getTaskManagerUtils());
            Task task = new Task(str, str2, str3, newInstance, map, this);
            Map<String, TaskInterface> tasks = this.mTasksAndEventsRepository.hasTasks(str2) ? this.mTasksAndEventsRepository.getTasks(str2) : new HashMap<>();
            tasks.put(str, task);
            this.mTasksAndEventsRepository.putTasks(str2, tasks);
            Log.i(TAG, "Registered task with name '" + str + "' for app with scoping identifier '" + str2 + "'.");
            newInstance.didRegister(task);
        } catch (Exception e) {
            throw new TaskRegisteringFailedException(cls, e);
        }
    }

    private Bundle createExecutionEventBody(TaskInterface taskInterface, Bundle bundle, Error error) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        Bundle errorBundleForError = errorBundleForError(error);
        bundle3.putString("eventId", UUID.randomUUID().toString());
        bundle3.putString("taskName", taskInterface.getName());
        bundle2.putBundle("executionInfo", bundle3);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle2.putBundle("data", bundle);
        bundle2.putBundle("error", errorBundleForError);
        return bundle2;
    }

    private Bundle errorBundleForError(Error error) {
        if (error == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("message", error.getMessage());
        return bundle;
    }

    private TaskInterface getTask(String str, String str2) {
        Map<String, TaskInterface> tasks = this.mTasksAndEventsRepository.getTasks(str2);
        if (tasks != null) {
            return tasks.get(str);
        }
        return null;
    }

    private TaskConsumerInterface getTaskConsumer(String str, String str2) {
        TaskInterface task;
        if (str == null || str2 == null || (task = getTask(str, str2)) == null) {
            return null;
        }
        return task.getConsumer();
    }

    private TaskManagerUtilsInterface getTaskManagerUtils() {
        if (this.mTaskManagerUtils == null) {
            this.mTaskManagerUtils = new TaskManagerUtils();
        }
        return this.mTaskManagerUtils;
    }

    private SharedPreferences getSharedPreferences() {
        Context context = this.mContextRef.get();
        if (context != null) {
            return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        }
        return null;
    }

    private void maybeUpdateAppUrlForAppScopeKey(String str, String str2) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        Map<String, Object> jsonToMap = sharedPreferences != null ? Utils.jsonToMap(sharedPreferences.getString(str2, "")) : null;
        if (jsonToMap == null || jsonToMap.isEmpty()) {
            return;
        }
        String str3 = (String) jsonToMap.get("appUrl");
        if (str3 == null || !str3.equals(str)) {
            jsonToMap.put("appUrl", str);
            sharedPreferences.edit().putString(str2, new JSONObject(jsonToMap).toString()).apply();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void restoreTasks() {
        for (Map.Entry<String, TasksAndEventsRepository.AppConfig> entry : this.mTasksAndEventsRepository.readPersistedTasks(getSharedPreferences()).entrySet()) {
            String key = entry.getKey();
            String str = entry.getValue().appUrl;
            Map<String, Object> map = entry.getValue().tasks;
            if (str != null && map != null && !map.isEmpty()) {
                for (String str2 : map.keySet()) {
                    HashMap hashMap = (HashMap) map.get(str2);
                    String str3 = (String) hashMap.get("consumerClass");
                    try {
                        Class<?> cls = Class.forName(str3);
                        int consumerVersion = Utils.getConsumerVersion(cls);
                        int intValue = ((Integer) hashMap.get("consumerVersion")).intValue();
                        if (consumerVersion != intValue) {
                            Log.w(TAG, "Task consumer '" + str3 + "' has version '" + consumerVersion + "' that is not compatible with the saved version '" + intValue + "'.");
                        } else {
                            try {
                                internalRegisterTask(str2, key, str, cls, (HashMap) hashMap.get("options"));
                            } catch (TaskRegisteringFailedException e) {
                                try {
                                    Log.e(TAG, e.getMessage());
                                } catch (ClassNotFoundException e2) {
                                    e = e2;
                                    Log.e(TAG, e.getMessage());
                                    e.printStackTrace();
                                } catch (NullPointerException e3) {
                                    e = e3;
                                    Log.e(TAG, e.getMessage());
                                    e.printStackTrace();
                                }
                            } catch (ClassNotFoundException e4) {
                                e = e4;
                                Log.e(TAG, e.getMessage());
                                e.printStackTrace();
                            } catch (NullPointerException e5) {
                                e = e5;
                                Log.e(TAG, e.getMessage());
                                e.printStackTrace();
                            }
                        }
                    } catch (ClassNotFoundException | NullPointerException e6) {
                        e = e6;
                    }
                }
            }
            this.mTasksAndEventsRepository.persistTasksForAppScopeKey(getSharedPreferences(), entry.getKey());
        }
    }

    private void removeAppFromConfig(String str) {
        getSharedPreferences().edit().remove(str).apply();
    }

    private TaskManagerInterface getTaskManager(String str) {
        WeakReference<TaskManagerInterface> weakReference = sTaskManagers.get(str);
        if ((weakReference == null ? null : weakReference.get()) == null) {
            weakReference = sHeadlessTaskManagers.get(str);
        }
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void invalidateAppRecord(String str) {
        if (getAppLoader() == null || !getAppLoader().invalidateApp(str)) {
            return;
        }
        sHeadlessTaskManagers.remove(str);
    }

    private void finishJobAfterTimeout(final JobService jobService, final JobParameters jobParameters, long j) {
        new Handler().postDelayed(new Runnable() { // from class: expo.modules.taskManager.TaskService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                jobService.jobFinished(jobParameters, false);
            }
        }, j);
    }

    private void maybeStartHeadlessTask(String str) {
        try {
            Context context = this.mContextRef.get();
            if (context == null) {
                return;
            }
            ReactContext reactContext = getReactContext(context);
            if (reactContext != null) {
                invokeStartHeadlessTask(reactContext, str);
            } else {
                waitForReactContextAndStartTask(context, str);
            }
        } catch (Exception e) {
            Log.w(TAG, "Failed to start headless task: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeStartHeadlessTask(ReactContext reactContext, final String str) {
        final HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(reactContext);
        final HeadlessJsTaskConfig headlessJsTaskConfig = new HeadlessJsTaskConfig("expo-task-manager", new WritableNativeMap(), 0L, true);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: expo.modules.taskManager.TaskService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TaskService.lambda$invokeStartHeadlessTask$4(HeadlessJsTaskContext.this, headlessJsTaskConfig, str);
            }
        });
    }

    static /* synthetic */ void lambda$invokeStartHeadlessTask$4(HeadlessJsTaskContext headlessJsTaskContext, HeadlessJsTaskConfig headlessJsTaskConfig, String str) {
        try {
            int startTask = headlessJsTaskContext.startTask(headlessJsTaskConfig);
            sHeadlessTaskIds.put(str, Integer.valueOf(startTask));
            Log.i(TAG, "Started headless task " + startTask + " to keep JS timers alive for '" + str + "'");
        } catch (Exception e) {
            Log.w(TAG, "Failed to start headless task: " + e.getMessage());
        }
    }

    private void waitForReactContextAndStartTask(Context context, final String str) {
        final ReactHost reactHost = ((ReactApplication) context.getApplicationContext()).getReactHost();
        if (reactHost == null) {
            return;
        }
        reactHost.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: expo.modules.taskManager.TaskService.1
            @Override // com.facebook.react.ReactInstanceEventListener
            public void onReactContextInitialized(ReactContext reactContext) {
                TaskService.this.invokeStartHeadlessTask(reactContext, str);
                reactHost.removeReactInstanceEventListener(this);
            }
        });
    }

    private void maybeFinishHeadlessTask(final String str) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: expo.modules.taskManager.TaskService$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TaskService.this.lambda$maybeFinishHeadlessTask$5(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeFinishHeadlessTask$5(String str) {
        ReactContext reactContext;
        Integer remove = sHeadlessTaskIds.remove(str);
        if (remove == null) {
            return;
        }
        try {
            Context context = this.mContextRef.get();
            if (context == null || (reactContext = getReactContext(context)) == null) {
                return;
            }
            HeadlessJsTaskContext.getInstance(reactContext).finishTask(remove.intValue());
            Log.i(TAG, "Finished headless task " + remove + " for '" + str + "'");
        } catch (Exception e) {
            Log.w(TAG, "Failed to finish headless task: " + e.getMessage());
        }
    }

    private ReactContext getReactContext(Context context) {
        ReactHost reactHost = ((ReactApplication) context.getApplicationContext()).getReactHost();
        if (reactHost != null) {
            return reactHost.getCurrentReactContext();
        }
        return null;
    }
}
