package org.chromium.base.task;

import android.util.Pair;
import internal.org.chromium.build.NullUtil;
import internal.org.jni_zero.JNINamespace;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

@JNINamespace("base")
/* loaded from: classes10.dex */
public class TaskRunnerImpl implements TaskRunner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static int sPendingTaskMapNextIndex;
    private static final Runnable[] sPendingTaskTable;
    private boolean mDidOneTimeInitialization;
    private volatile long mNativeTaskRunnerAndroid;
    private List<Pair<Runnable, Long>> mPreNativeDelayedTasks;
    private final Object mPreNativeTaskLock;
    private Queue<Runnable> mPreNativeTasks;
    protected final Runnable mRunPreNativeTaskClosure;
    private final int mTaskRunnerType;
    protected final int mTaskTraits;
    private final String mTraceEvent;
    private static final ReferenceQueue<Object> sQueue = new ReferenceQueue<>();
    private static final Object sPendingTaskLock = new Object();
    private static final Map<Integer, Runnable> sPendingTaskMap = new HashMap();
    private static final Set<TaskRunnerCleaner> sCleaners = new HashSet();

    interface Natives {
        void destroy(long nativeTaskRunnerAndroid);

        long init(int taskRunnerType, int taskTraits);

        void postDelayedTask(long nativeTaskRunnerAndroid, long delay, int taskIndex);
    }

    static {
        Runnable[] runnableArr = new Runnable[50];
        sPendingTaskTable = runnableArr;
        sPendingTaskMapNextIndex = runnableArr.length;
    }

    int clearTaskQueueForTesting() {
        int i;
        synchronized (this.mPreNativeTaskLock) {
            if (this.mPreNativeTasks != null) {
                List list = (List) NullUtil.assumeNonNull(this.mPreNativeDelayedTasks);
                i = this.mPreNativeTasks.size() + list.size();
                this.mPreNativeTasks.clear();
                list.clear();
            } else {
                i = 0;
            }
        }
        return i;
    }

    private static class TaskRunnerCleaner extends WeakReference<TaskRunnerImpl> {
        final long mNativePtr;

        TaskRunnerCleaner(TaskRunnerImpl runner) {
            super(runner, TaskRunnerImpl.sQueue);
            this.mNativePtr = runner.mNativeTaskRunnerAndroid;
        }

        void destroy() {
            TaskRunnerImplJni.get().destroy(this.mNativePtr);
        }
    }

    private static void destroyGarbageCollectedTaskRunners() {
        while (true) {
            TaskRunnerCleaner taskRunnerCleaner = (TaskRunnerCleaner) sQueue.poll();
            if (taskRunnerCleaner == null) {
                return;
            }
            taskRunnerCleaner.destroy();
            Set<TaskRunnerCleaner> set = sCleaners;
            synchronized (set) {
                set.remove(taskRunnerCleaner);
            }
        }
    }

    TaskRunnerImpl(int traits) {
        this(traits, "TaskRunnerImpl", 0);
        destroyGarbageCollectedTaskRunners();
    }

    protected TaskRunnerImpl(int traits, String traceCategory, int taskRunnerType) {
        this.mRunPreNativeTaskClosure = new Runnable() { // from class: org.chromium.base.task.TaskRunnerImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TaskRunnerImpl.this.runPreNativeTask();
            }
        };
        this.mPreNativeTaskLock = new Object();
        this.mTaskTraits = traits;
        this.mTraceEvent = traceCategory + ".PreNativeTask.run";
        this.mTaskRunnerType = taskRunnerType;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable task) {
        postDelayedTask(task, 0L);
    }

    @Override // org.chromium.base.task.TaskRunner
    public final void postDelayedTask(Runnable task, long delay) {
        if (PostTask.ENABLE_TASK_ORIGINS) {
            task = PostTask.populateTaskOrigin(new TaskOriginException(), task);
        }
        if (this.mNativeTaskRunnerAndroid != 0) {
            queueDelayedTaskToNative(this.mNativeTaskRunnerAndroid, task, delay);
            return;
        }
        synchronized (this.mPreNativeTaskLock) {
            oneTimeInitialization();
            if (this.mNativeTaskRunnerAndroid != 0) {
                queueDelayedTaskToNative(this.mNativeTaskRunnerAndroid, task, delay);
                return;
            }
            if (delay == 0) {
                ((Queue) NullUtil.assumeNonNull(this.mPreNativeTasks)).add(task);
                schedulePreNativeTask();
            } else if (!schedulePreNativeDelayedTask(task, delay)) {
                ((List) NullUtil.assumeNonNull(this.mPreNativeDelayedTasks)).add(new Pair(task, Long.valueOf(delay)));
            }
        }
    }

    private void oneTimeInitialization() {
        if (this.mDidOneTimeInitialization) {
            return;
        }
        this.mDidOneTimeInitialization = true;
        if (!PostTask.registerPreNativeTaskRunner(this)) {
            initNativeTaskRunner();
        } else {
            this.mPreNativeTasks = new ArrayDeque();
            this.mPreNativeDelayedTasks = new ArrayList();
        }
    }

    protected void schedulePreNativeTask() {
        PostTask.getPrenativeThreadPoolExecutor().execute(this.mRunPreNativeTaskClosure);
    }

    protected boolean schedulePreNativeDelayedTask(Runnable task, long delay) {
        PostTask.DelayedExecutorForTesting prenativeThreadPoolDelayedExecutor = PostTask.getPrenativeThreadPoolDelayedExecutor();
        if (prenativeThreadPoolDelayedExecutor == null) {
            return false;
        }
        prenativeThreadPoolDelayedExecutor.scheduleDelayedTask(task, delay);
        return true;
    }

    protected void runPreNativeTask() {
        TraceEvent scoped = TraceEvent.scoped(this.mTraceEvent);
        try {
            synchronized (this.mPreNativeTaskLock) {
                Queue<Runnable> queue = this.mPreNativeTasks;
                if (queue == null) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    queue.poll().run();
                    if (scoped != null) {
                        scoped.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void initNativeTaskRunner() {
        long init = TaskRunnerImplJni.get().init(this.mTaskRunnerType, this.mTaskTraits);
        synchronized (this.mPreNativeTaskLock) {
            Queue<Runnable> queue = this.mPreNativeTasks;
            if (queue != null) {
                Iterator<Runnable> it = queue.iterator();
                while (it.hasNext()) {
                    queueDelayedTaskToNative(init, it.next(), 0L);
                }
                this.mPreNativeTasks = null;
            }
            List<Pair<Runnable, Long>> list = this.mPreNativeDelayedTasks;
            if (list != null) {
                for (Pair<Runnable, Long> pair : list) {
                    queueDelayedTaskToNative(init, (Runnable) pair.first, ((Long) pair.second).longValue());
                }
                this.mPreNativeDelayedTasks = null;
            }
            this.mNativeTaskRunnerAndroid = init;
        }
        Set<TaskRunnerCleaner> set = sCleaners;
        synchronized (set) {
            set.add(new TaskRunnerCleaner(this));
        }
        destroyGarbageCollectedTaskRunners();
    }

    private static void queueDelayedTaskToNative(long nativeTaskRunnerAndroid, Runnable task, long delay) {
        TaskRunnerImplJni.get().postDelayedTask(nativeTaskRunnerAndroid, delay, queueTask(task, delay == 0));
    }

    static void runTask(int taskIndex) {
        dequeueTask(taskIndex).run();
    }

    private static int queueTask(Runnable task, boolean useTable) {
        synchronized (sPendingTaskLock) {
            int i = 0;
            while (useTable) {
                Runnable[] runnableArr = sPendingTaskTable;
                if (i >= runnableArr.length) {
                    break;
                }
                if (runnableArr[i] == null) {
                    runnableArr[i] = task;
                    return i;
                }
                i++;
            }
            int i2 = sPendingTaskMapNextIndex;
            sPendingTaskMapNextIndex = i2 + 1;
            sPendingTaskMap.put(Integer.valueOf(i2), task);
            return i2;
        }
    }

    private static Runnable dequeueTask(int taskIndex) {
        Runnable remove;
        synchronized (sPendingTaskLock) {
            Runnable[] runnableArr = sPendingTaskTable;
            if (taskIndex < runnableArr.length) {
                remove = runnableArr[taskIndex];
                runnableArr[taskIndex] = null;
            } else {
                remove = sPendingTaskMap.remove(Integer.valueOf(taskIndex));
            }
        }
        return remove;
    }
}
