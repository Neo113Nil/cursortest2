package org.chromium.base.task;

import internal.org.chromium.build.BuildConfig;
import internal.org.chromium.build.NullUtil;
import internal.org.jni_zero.JNINamespace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.chromium.base.JavaUtils;
import org.chromium.base.Log;
import org.chromium.base.ResettersForTesting;
import org.chromium.base.ThreadUtils;

@JNINamespace("base")
/* loaded from: classes10.dex */
public class PostTask {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final boolean ENABLE_TASK_ORIGINS;
    private static final String TAG = "PostTask";
    private static volatile boolean sDisablePreNativeUiTasks;
    private static volatile boolean sNativeInitialized;
    private static final Object sPreNativeTaskRunnerLock;
    private static List<TaskRunnerImpl> sPreNativeTaskRunners;
    private static volatile DelayedExecutorForTesting sPrenativeThreadPoolDelayedExecutorForTesting;
    private static ChromeThreadPoolExecutor sPrenativeThreadPoolExecutor;
    private static volatile Executor sPrenativeThreadPoolExecutorForTesting;
    private static final ThreadLocal<TaskOriginException> sTaskOrigin;
    static int sTestIterationForTesting;
    private static final TaskRunner[] sTraitsToRunnerMap;

    public interface DelayedExecutorForTesting {
        void scheduleDelayedTask(Runnable task, long delay);
    }

    private static boolean isUiTaskTraits(int taskTraits) {
        return taskTraits >= 6;
    }

    public static void resetUiThreadForTesting() {
    }

    static {
        boolean z = BuildConfig.ENABLE_ASSERTS;
        ENABLE_TASK_ORIGINS = z;
        sPreNativeTaskRunnerLock = new Object();
        sPreNativeTaskRunners = new ArrayList();
        sPrenativeThreadPoolExecutor = new ChromeThreadPoolExecutor();
        sTaskOrigin = z ? new ThreadLocal<>() : null;
        sTraitsToRunnerMap = new TaskRunner[10];
        resetTaskRunner();
    }

    private static class TaskOriginRunnable implements Runnable {
        private final TaskOriginException mTaskOrigin;
        private final Runnable mWrappedRunnable;

        TaskOriginRunnable(TaskOriginException taskOrigin, Runnable wrappedRunnable) {
            this.mTaskOrigin = taskOrigin;
            this.mWrappedRunnable = wrappedRunnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ThreadLocal threadLocal = (ThreadLocal) NullUtil.assumeNonNull(PostTask.sTaskOrigin);
            threadLocal.set(this.mTaskOrigin);
            try {
                this.mWrappedRunnable.run();
            } catch (Throwable th) {
                try {
                    JavaUtils.throwUnchecked(PostTask.maybeAddTaskOrigin(th));
                } finally {
                    threadLocal.remove();
                }
            }
        }
    }

    public static SequencedTaskRunner createSequencedTaskRunner(int taskTraits) {
        if (isUiTaskTraits(taskTraits)) {
            return (SequencedTaskRunner) sTraitsToRunnerMap[taskTraits];
        }
        return new SequencedTaskRunnerImpl(taskTraits);
    }

    public static void postTask(int taskTraits, Runnable task) {
        postDelayedTask(taskTraits, task, 0L);
    }

    public static void postDelayedTask(int taskTraits, Runnable task, long delay) {
        sTraitsToRunnerMap[taskTraits].postDelayedTask(task, delay);
    }

    public static void runOrPostTask(int taskTraits, Runnable task) {
        if (canRunTaskImmediately(taskTraits)) {
            task.run();
        } else {
            postTask(taskTraits, task);
        }
    }

    public static boolean canRunTaskImmediately(int taskTraits) {
        return isUiTaskTraits(taskTraits) && ThreadUtils.runningOnUiThread() && canRunUiTaskBeforeNativeInit(taskTraits);
    }

    public static <T> T runSynchronously(int i, Callable<T> callable) {
        return (T) runSynchronouslyInternal(i, new FutureTask(callable));
    }

    public static void runSynchronously(int taskTraits, Runnable r) {
        runSynchronouslyInternal(taskTraits, new FutureTask(r, null));
    }

    private static <T> T runSynchronouslyInternal(int taskTraits, FutureTask<T> task) {
        runOrPostTask(taskTraits, ENABLE_TASK_ORIGINS ? populateTaskOrigin(null, task) : task);
        try {
            return task.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public static void setPrenativeThreadPoolExecutorForTesting(Executor executor) {
        sPrenativeThreadPoolExecutorForTesting = executor;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.task.PostTask$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PostTask.sPrenativeThreadPoolExecutorForTesting = null;
            }
        });
    }

    static Executor getPrenativeThreadPoolExecutor() {
        if (sPrenativeThreadPoolExecutorForTesting != null) {
            return sPrenativeThreadPoolExecutorForTesting;
        }
        return sPrenativeThreadPoolExecutor;
    }

    public static void setPrenativeThreadPoolDelayedExecutorForTesting(DelayedExecutorForTesting executor) {
        sPrenativeThreadPoolDelayedExecutorForTesting = executor;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.task.PostTask$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PostTask.sPrenativeThreadPoolDelayedExecutorForTesting = null;
            }
        });
    }

    static DelayedExecutorForTesting getPrenativeThreadPoolDelayedExecutor() {
        if (sPrenativeThreadPoolDelayedExecutorForTesting != null) {
            return sPrenativeThreadPoolDelayedExecutorForTesting;
        }
        return null;
    }

    public static Exception getTaskOrigin() {
        if (!ENABLE_TASK_ORIGINS) {
            return null;
        }
        ThreadLocal<TaskOriginException> threadLocal = sTaskOrigin;
        NullUtil.assumeNonNull(threadLocal);
        return threadLocal.get();
    }

    public static <T extends Throwable> T maybeAddTaskOrigin(T exception) {
        Exception taskOrigin = getTaskOrigin();
        if (taskOrigin != null) {
            Throwable th = exception;
            while (th.getCause() != null) {
                th = th.getCause();
            }
            try {
                th.initCause(taskOrigin);
            } catch (Exception unused) {
            }
        }
        return exception;
    }

    static Runnable populateTaskOrigin(TaskOriginException taskOrigin, Runnable origTask) {
        return origTask instanceof TaskOriginRunnable ? origTask : new TaskOriginRunnable(taskOrigin, origTask);
    }

    static boolean registerPreNativeTaskRunner(TaskRunnerImpl taskRunner) {
        synchronized (sPreNativeTaskRunnerLock) {
            List<TaskRunnerImpl> list = sPreNativeTaskRunners;
            if (list == null) {
                return false;
            }
            list.add(taskRunner);
            return true;
        }
    }

    private static void onNativeSchedulerReady() {
        List<TaskRunnerImpl> list;
        if (sNativeInitialized) {
            return;
        }
        sNativeInitialized = true;
        synchronized (sPreNativeTaskRunnerLock) {
            list = sPreNativeTaskRunners;
            sPreNativeTaskRunners = null;
        }
        Iterator<TaskRunnerImpl> it = list.iterator();
        while (it.hasNext()) {
            it.next().initNativeTaskRunner();
        }
    }

    public static void flushJobsAndResetForTesting() throws InterruptedException {
        ChromeThreadPoolExecutor chromeThreadPoolExecutor = sPrenativeThreadPoolExecutor;
        int size = chromeThreadPoolExecutor.getQueue().size() + chromeThreadPoolExecutor.getActiveCount();
        if (size > 0) {
            chromeThreadPoolExecutor.shutdownNow();
            chromeThreadPoolExecutor.awaitTermination(1L, TimeUnit.SECONDS);
            sPrenativeThreadPoolExecutor = new ChromeThreadPoolExecutor();
        }
        synchronized (sPreNativeTaskRunnerLock) {
            List<TaskRunnerImpl> list = sPreNativeTaskRunners;
            if (list != null) {
                Iterator<TaskRunnerImpl> it = list.iterator();
                while (it.hasNext()) {
                    size += it.next().clearTaskQueueForTesting();
                }
            }
            sTestIterationForTesting++;
        }
        sPrenativeThreadPoolExecutorForTesting = null;
        sPrenativeThreadPoolDelayedExecutorForTesting = null;
        if (size > 0) {
            Log.w(TAG, "%d background task(s) existed after test finished.", Integer.valueOf(size));
        }
    }

    public static void disablePreNativeUiTasks(boolean disable) {
        sDisablePreNativeUiTasks = disable;
    }

    static boolean canRunUiTaskBeforeNativeInit(int taskTraits) {
        return taskTraits == 9 || !sDisablePreNativeUiTasks;
    }

    private static void resetTaskRunner() {
        for (int i = 0; i <= 5; i++) {
            sTraitsToRunnerMap[i] = new TaskRunnerImpl(i);
        }
        for (int i2 = 6; i2 <= 9; i2++) {
            sTraitsToRunnerMap[i2] = new UiThreadTaskRunnerImpl(i2);
        }
    }

    public static TaskRunner getTaskRunner(int taskTraits) {
        return sTraitsToRunnerMap[taskTraits];
    }

    public static TaskRunner getUiBestEffortExecutor() {
        return sTraitsToRunnerMap[6];
    }

    public static TaskRunner getUiUserVisibleExecutor() {
        return sTraitsToRunnerMap[7];
    }

    public static TaskRunner getUiUserBlockingExecutor() {
        return sTraitsToRunnerMap[8];
    }

    public static TaskRunner getBackgroundBestEffortExecutor() {
        return sTraitsToRunnerMap[0];
    }

    public static TaskRunner getBackgroundBestEffortMayBlockExecutor() {
        return sTraitsToRunnerMap[1];
    }

    public static TaskRunner getBackgroundUserVisibleExecutor() {
        return sTraitsToRunnerMap[2];
    }

    public static TaskRunner getBackgroundUserBlockingExecutor() {
        return sTraitsToRunnerMap[4];
    }

    public static TaskRunner getBackgroundUserBlockingMayBlockExecutor() {
        return sTraitsToRunnerMap[5];
    }
}
