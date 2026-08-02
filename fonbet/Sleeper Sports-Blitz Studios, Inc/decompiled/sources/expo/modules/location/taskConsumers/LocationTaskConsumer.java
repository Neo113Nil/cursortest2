package expo.modules.location.taskConsumers;

import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.rnlineargradient.LinearGradientManager;
import expo.modules.core.arguments.MapArguments;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.interfaces.taskManager.TaskConsumer;
import expo.modules.interfaces.taskManager.TaskConsumerInterface;
import expo.modules.interfaces.taskManager.TaskExecutionCallback;
import expo.modules.interfaces.taskManager.TaskInterface;
import expo.modules.interfaces.taskManager.TaskManagerUtilsInterface;
import expo.modules.location.AppForegroundedSingleton;
import expo.modules.location.LocationHelpers;
import expo.modules.location.records.LocationOptions;
import expo.modules.location.records.LocationResponse;
import expo.modules.location.services.LocationTaskService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocationTaskConsumer.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020#H\u0016J\u001c\u0010&\u001a\u00020#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020)0(H\u0016J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0016J\u0016\u0010-\u001a\u00020#2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130/H\u0002J\u0018\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020#H\u0002J\b\u00107\u001a\u00020#H\u0002J\b\u00108\u001a\u00020#H\u0002J\u0016\u00109\u001a\u00020#2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130/H\u0002J\u0016\u0010:\u001a\u00020#2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130/H\u0002J\b\u0010;\u001a\u00020#H\u0002J\b\u0010<\u001a\u00020\u0019H\u0002J\b\u0010=\u001a\u00020\rH\u0002J(\u0010>\u001a\u00020#2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020A0@j\b\u0012\u0004\u0012\u00020A`B2\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020#H\u0016J\b\u0010F\u001a\u00020#H\u0016J\b\u0010G\u001a\u00020#H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006I"}, d2 = {"Lexpo/modules/location/taskConsumers/LocationTaskConsumer;", "Lexpo/modules/interfaces/taskManager/TaskConsumer;", "Lexpo/modules/interfaces/taskManager/TaskConsumerInterface;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "context", "Landroid/content/Context;", "taskManagerUtils", "Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;", "<init>", "(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;)V", "mTask", "Lexpo/modules/interfaces/taskManager/TaskInterface;", "mPendingIntent", "Landroid/app/PendingIntent;", "mService", "Lexpo/modules/location/services/LocationTaskService;", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mLastReportedLocation", "Landroid/location/Location;", "mDeferredDistance", "", "mDeferredLocations", "", "mIsHostPaused", "", "mLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLocationClient$delegate", "Lkotlin/Lazy;", "taskType", "", "didRegister", "", "task", "didUnregister", "setOptions", "options", "", "", "didReceiveBroadcast", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "handleLocationUpdate", LinearGradientManager.PROP_LOCATIONS, "", "didExecuteJob", "jobService", "Landroid/app/job/JobService;", "params", "Landroid/app/job/JobParameters;", "startLocationUpdates", "stopLocationUpdates", "maybeStartForegroundService", "stopForegroundService", "reportLocationsImmediately", "deferLocations", "maybeReportDeferredLocations", "shouldReportDeferredLocations", "preparePendingIntent", "executeTaskWithLocationBundles", "locationBundles", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "callback", "Lexpo/modules/interfaces/taskManager/TaskExecutionCallback;", "onHostResume", "onHostPause", "onHostDestroy", "Companion", "expo-location_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationTaskConsumer extends TaskConsumer implements TaskConsumerInterface, LifecycleEventListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FOREGROUND_SERVICE_KEY = "foregroundService";
    private static final String TAG = "LocationTaskConsumer";
    private static long sLastTimestamp;
    private double mDeferredDistance;
    private final List<Location> mDeferredLocations;
    private boolean mIsHostPaused;
    private Location mLastReportedLocation;

    /* renamed from: mLocationClient$delegate, reason: from kotlin metadata */
    private final Lazy mLocationClient;
    private LocationRequest mLocationRequest;
    private PendingIntent mPendingIntent;
    private LocationTaskService mService;
    private TaskInterface mTask;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationTaskConsumer(final Context context, TaskManagerUtilsInterface taskManagerUtilsInterface) {
        super(context, taskManagerUtilsInterface);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDeferredLocations = new ArrayList();
        this.mLocationClient = LazyKt.lazy(new Function0() { // from class: expo.modules.location.taskConsumers.LocationTaskConsumer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FusedLocationProviderClient mLocationClient_delegate$lambda$0;
                mLocationClient_delegate$lambda$0 = LocationTaskConsumer.mLocationClient_delegate$lambda$0(context);
                return mLocationClient_delegate$lambda$0;
            }
        });
    }

    private final FusedLocationProviderClient getMLocationClient() {
        return (FusedLocationProviderClient) this.mLocationClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FusedLocationProviderClient mLocationClient_delegate$lambda$0(Context context) {
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        return fusedLocationProviderClient;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public String taskType() {
        return FirebaseAnalytics.Param.LOCATION;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didRegister(TaskInterface task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.mTask = task;
        startLocationUpdates();
        maybeStartForegroundService();
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didUnregister() {
        stopLocationUpdates();
        stopForegroundService();
        this.mTask = null;
        this.mPendingIntent = null;
        this.mLocationRequest = null;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void setOptions(Map<String, ? extends Object> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        super.setOptions(options);
        stopLocationUpdates();
        startLocationUpdates();
        maybeStartForegroundService();
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didReceiveBroadcast(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (this.mTask == null) {
            return;
        }
        LocationResult extractResult = LocationResult.extractResult(intent);
        if (extractResult != null) {
            List<Location> locations = extractResult.getLocations();
            Intrinsics.checkNotNullExpressionValue(locations, "getLocations(...)");
            handleLocationUpdate(locations);
            return;
        }
        try {
            Intrinsics.checkNotNull(getMLocationClient().getLastLocation().addOnCompleteListener(new OnCompleteListener() { // from class: expo.modules.location.taskConsumers.LocationTaskConsumer$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    LocationTaskConsumer.didReceiveBroadcast$lambda$2(LocationTaskConsumer.this, task);
                }
            }));
        } catch (SecurityException e) {
            Integer.valueOf(Log.e(TAG, "Cannot get last location: " + e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void didReceiveBroadcast$lambda$2(LocationTaskConsumer locationTaskConsumer, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Location location = (Location) task.getResult();
        if (location != null) {
            locationTaskConsumer.handleLocationUpdate(CollectionsKt.listOf(location));
        }
    }

    private final void handleLocationUpdate(List<? extends Location> locations) {
        if (locations.isEmpty()) {
            return;
        }
        if (!this.mIsHostPaused) {
            reportLocationsImmediately(locations);
        } else {
            deferLocations(locations);
            maybeReportDeferredLocations();
        }
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public boolean didExecuteJob(final JobService jobService, final JobParameters params) {
        Intrinsics.checkNotNullParameter(jobService, "jobService");
        Intrinsics.checkNotNullParameter(params, "params");
        List<PersistableBundle> extractDataFromJobParams = getTaskManagerUtils().extractDataFromJobParams(params);
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (PersistableBundle persistableBundle : extractDataFromJobParams) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            if (persistableBundle != null) {
                bundle2.putAll(persistableBundle.getPersistableBundle("coords"));
                bundle.putAll(persistableBundle);
                bundle.putBundle("coords", bundle2);
                arrayList.add(bundle);
            }
        }
        executeTaskWithLocationBundles(arrayList, new TaskExecutionCallback() { // from class: expo.modules.location.taskConsumers.LocationTaskConsumer$$ExternalSyntheticLambda2
            @Override // expo.modules.interfaces.taskManager.TaskExecutionCallback
            public final void onFinished(Map map) {
                jobService.jobFinished(params, false);
            }
        });
        return true;
    }

    private final void startLocationUpdates() {
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "The context has been abandoned");
            return;
        }
        if (!LocationHelpers.INSTANCE.isAnyProviderAvailable(context)) {
            Log.w(TAG, "There is no location provider available");
            return;
        }
        TaskInterface taskInterface = this.mTask;
        if (taskInterface == null) {
            Log.w(TAG, "Could not find a location task for the location update");
            return;
        }
        LocationHelpers.Companion companion = LocationHelpers.INSTANCE;
        Map<String, Object> options = taskInterface.getOptions();
        Intrinsics.checkNotNullExpressionValue(options, "getOptions(...)");
        this.mLocationRequest = companion.prepareLocationRequest$expo_location_release(new LocationOptions(options));
        PendingIntent preparePendingIntent = preparePendingIntent();
        this.mPendingIntent = preparePendingIntent;
        LocationRequest locationRequest = this.mLocationRequest;
        if (locationRequest == null) {
            Log.w(TAG, "Could not find a location request for the location update");
            return;
        }
        if (preparePendingIntent == null) {
            Log.w(TAG, "Could not find intent for the location update");
            return;
        }
        try {
            Intrinsics.checkNotNull(getMLocationClient().requestLocationUpdates(locationRequest, preparePendingIntent));
        } catch (SecurityException e) {
            Log.w(TAG, "Location request has been rejected.", e);
        }
    }

    private final void stopLocationUpdates() {
        PendingIntent pendingIntent = this.mPendingIntent;
        if (pendingIntent != null) {
            getMLocationClient().removeLocationUpdates(pendingIntent);
            pendingIntent.cancel();
        }
    }

    private final void maybeStartForegroundService() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (!AppForegroundedSingleton.INSTANCE.isForegrounded()) {
            Log.w(TAG, "Foreground location task cannot be started while the app is in the background!");
            return;
        }
        TaskInterface taskInterface = this.mTask;
        if (taskInterface == null) {
            Log.w(TAG, "Location task is null");
            return;
        }
        MapArguments mapArguments = new MapArguments(taskInterface.getOptions());
        Companion companion = INSTANCE;
        Map<String, ? extends Object> options = taskInterface.getOptions();
        Intrinsics.checkNotNullExpressionValue(options, "getOptions(...)");
        boolean shouldUseForegroundService = companion.shouldUseForegroundService(options);
        LocationTaskService locationTaskService = this.mService;
        if (locationTaskService != null && !shouldUseForegroundService) {
            stopForegroundService();
            return;
        }
        if (shouldUseForegroundService) {
            if (locationTaskService != null) {
                if (locationTaskService != null) {
                    Bundle bundle = mapArguments.getArguments(FOREGROUND_SERVICE_KEY).toBundle();
                    Intrinsics.checkNotNullExpressionValue(bundle, "toBundle(...)");
                    locationTaskService.startForeground(bundle);
                    return;
                }
                return;
            }
            Intent intent = new Intent(getContext(), (Class<?>) LocationTaskService.class);
            Bundle bundle2 = new Bundle();
            final Bundle bundle3 = mapArguments.getArguments(FOREGROUND_SERVICE_KEY).toBundle();
            bundle2.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, taskInterface.getAppScopeKey());
            bundle2.putString("taskName", taskInterface.getName());
            bundle2.putBoolean("killService", bundle3.getBoolean("killServiceOnDestroy", false));
            intent.putExtras(bundle2);
            getContext().startForegroundService(intent);
            getContext().bindService(intent, new ServiceConnection() { // from class: expo.modules.location.taskConsumers.LocationTaskConsumer$maybeStartForegroundService$1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName name, IBinder service) {
                    LocationTaskService locationTaskService2;
                    Context context;
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(service, "service");
                    LocationTaskConsumer locationTaskConsumer = LocationTaskConsumer.this;
                    LocationTaskService.ServiceBinder serviceBinder = service instanceof LocationTaskService.ServiceBinder ? (LocationTaskService.ServiceBinder) service : null;
                    locationTaskConsumer.mService = serviceBinder != null ? serviceBinder.getThis$0() : null;
                    locationTaskService2 = LocationTaskConsumer.this.mService;
                    if (locationTaskService2 != null) {
                        LocationTaskConsumer locationTaskConsumer2 = LocationTaskConsumer.this;
                        Bundle bundle4 = bundle3;
                        context = locationTaskConsumer2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "access$getContext(...)");
                        locationTaskService2.setParentContext(context);
                        Intrinsics.checkNotNull(bundle4);
                        locationTaskService2.startForeground(bundle4);
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                    LocationTaskService locationTaskService2;
                    Intrinsics.checkNotNullParameter(name, "name");
                    locationTaskService2 = LocationTaskConsumer.this.mService;
                    if (locationTaskService2 != null) {
                        locationTaskService2.stop();
                    }
                    LocationTaskConsumer.this.mService = null;
                }
            }, 1);
        }
    }

    private final void stopForegroundService() {
        LocationTaskService locationTaskService = this.mService;
        if (locationTaskService != null) {
            locationTaskService.stop();
        }
    }

    private final void reportLocationsImmediately(List<? extends Location> locations) {
        if (locations.isEmpty()) {
            return;
        }
        Context applicationContext = getContext().getApplicationContext();
        ArrayList arrayList = new ArrayList();
        Location location = null;
        for (Location location2 : locations) {
            long time = location2.getTime();
            if (time > sLastTimestamp) {
                arrayList.add((PersistableBundle) new LocationResponse(location2).toBundle$expo_location_release(PersistableBundle.class));
                sLastTimestamp = time;
                location = location2;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.mLastReportedLocation = location;
        getTaskManagerUtils().scheduleJob(applicationContext, this.mTask, arrayList);
    }

    private final void deferLocations(List<? extends Location> locations) {
        int size = this.mDeferredLocations.size();
        Location location = size > 0 ? this.mDeferredLocations.get(size - 1) : this.mLastReportedLocation;
        for (Location location2 : locations) {
            if (location != null) {
                this.mDeferredDistance += Math.abs(location2.distanceTo(location));
            }
            location = location2;
        }
        this.mDeferredLocations.addAll(locations);
    }

    private final void maybeReportDeferredLocations() {
        if (shouldReportDeferredLocations()) {
            Context applicationContext = getContext().getApplicationContext();
            ArrayList arrayList = new ArrayList();
            for (Location location : this.mDeferredLocations) {
                long time = location.getTime();
                if (time > sLastTimestamp) {
                    arrayList.add((PersistableBundle) new LocationResponse(location).toBundle$expo_location_release(PersistableBundle.class));
                    sLastTimestamp = time;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.mLastReportedLocation = this.mDeferredLocations.get(r2.size() - 1);
            this.mDeferredDistance = 0.0d;
            this.mDeferredLocations.clear();
            getTaskManagerUtils().scheduleJob(applicationContext, this.mTask, arrayList);
        }
    }

    private final boolean shouldReportDeferredLocations() {
        TaskInterface taskInterface = this.mTask;
        if (taskInterface == null || this.mDeferredLocations.isEmpty()) {
            return false;
        }
        if (!this.mIsHostPaused) {
            return true;
        }
        Location location = this.mLastReportedLocation;
        if (location == null) {
            location = this.mDeferredLocations.get(0);
        }
        List<Location> list = this.mDeferredLocations;
        Location location2 = list.get(list.size() - 1);
        Object obj = taskInterface.getOptions().get("deferredUpdatesDistance");
        Number number = obj instanceof Number ? (Number) obj : null;
        double doubleValue = number != null ? number.doubleValue() : 0.0d;
        Object obj2 = taskInterface.getOptions().get("deferredUpdatesInterval");
        Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
        return location2.getTime() - location.getTime() >= (number2 != null ? number2.longValue() : 0L) && this.mDeferredDistance >= doubleValue;
    }

    private final PendingIntent preparePendingIntent() {
        PendingIntent createTaskIntent = getTaskManagerUtils().createTaskIntent(getContext(), this.mTask);
        Intrinsics.checkNotNullExpressionValue(createTaskIntent, "createTaskIntent(...)");
        return createTaskIntent;
    }

    private final void executeTaskWithLocationBundles(ArrayList<Bundle> locationBundles, TaskExecutionCallback callback) {
        if (!locationBundles.isEmpty() && this.mTask != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(LinearGradientManager.PROP_LOCATIONS, locationBundles);
            TaskInterface taskInterface = this.mTask;
            if (taskInterface != null) {
                taskInterface.execute(bundle, null, callback);
                return;
            }
            return;
        }
        callback.onFinished(null);
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        this.mIsHostPaused = false;
        maybeReportDeferredLocations();
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
        this.mIsHostPaused = true;
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
        this.mIsHostPaused = true;
    }

    /* compiled from: LocationTaskConsumer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/location/taskConsumers/LocationTaskConsumer$Companion;", "", "<init>", "()V", "TAG", "", "FOREGROUND_SERVICE_KEY", "sLastTimestamp", "", "shouldUseForegroundService", "", "options", "", "expo-location_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean shouldUseForegroundService(Map<String, ? extends Object> options) {
            Intrinsics.checkNotNullParameter(options, "options");
            return options.containsKey(LocationTaskConsumer.FOREGROUND_SERVICE_KEY);
        }
    }
}
