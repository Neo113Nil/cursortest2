package org.chromium.base.task;

import android.os.Binder;
import android.os.Process;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.base.task.AsyncTask;

/* loaded from: classes10.dex */
public abstract class AsyncTask<Result> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String GET_STATUS_UMA_HISTOGRAM = "Android.Jank.AsyncTaskGetOnUiThreadStatus";
    private static final String TAG = "AsyncTask";
    private final AsyncTask<Result>.NamedFutureTask mFuture;
    private final Callable<Result> mWorker;
    public static final Executor THREAD_POOL_EXECUTOR = new Executor() { // from class: org.chromium.base.task.AsyncTask$$ExternalSyntheticLambda2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            PostTask.postTask(1, runnable);
        }
    };
    public static final Executor SERIAL_EXECUTOR = new SerialExecutor();
    private static final StealRunnableHandler STEAL_RUNNABLE_HANDLER = new StealRunnableHandler();
    private volatile int mStatus = 0;
    private final AtomicBoolean mCancelled = new AtomicBoolean();
    private final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final int mIterationIdForTesting = PostTask.sTestIterationForTesting;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int FINISHED = 2;
        public static final int NUM_ENTRIES = 3;
        public static final int PENDING = 0;
        public static final int RUNNING = 1;
    }

    protected abstract Result doInBackground();

    protected void onCancelled() {
    }

    protected abstract void onPostExecute(Result result);

    protected void onPreExecute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class StealRunnableHandler implements RejectedExecutionHandler {
        private StealRunnableHandler() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(final Runnable r, ThreadPoolExecutor executor) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: org.chromium.base.task.AsyncTask$StealRunnableHandler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncTask.StealRunnableHandler.lambda$rejectedExecution$0(r);
                }
            });
        }

        static /* synthetic */ void lambda$rejectedExecution$0(Runnable runnable) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            try {
                runnable.run();
            } finally {
                Process.setThreadPriority(Process.myTid(), threadPriority);
            }
        }
    }

    public static void takeOverAndroidThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        if (threadPoolExecutor.isShutdown()) {
            return;
        }
        threadPoolExecutor.setRejectedExecutionHandler(STEAL_RUNNABLE_HANDLER);
        threadPoolExecutor.shutdown();
    }

    public AsyncTask() {
        Callable<Result> callable = new Callable() { // from class: org.chromium.base.task.AsyncTask$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$new$1;
                lambda$new$1 = AsyncTask.this.lambda$new$1();
                return lambda$new$1;
            }
        };
        this.mWorker = callable;
        this.mFuture = new NamedFutureTask(callable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$1() throws Exception {
        Result result;
        this.mTaskInvoked.set(true);
        try {
            result = doInBackground();
            try {
                Binder.flushPendingCommands();
                return result;
            } catch (Throwable th) {
                th = th;
                try {
                    this.mCancelled.set(true);
                    throw th;
                } finally {
                    postResult(result);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            result = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResultIfNotInvoked(Result result) {
        if (this.mTaskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    private void postResult(final Result result) {
        if (this instanceof BackgroundOnlyAsyncTask) {
            this.mStatus = 2;
        } else if (this.mIterationIdForTesting == PostTask.sTestIterationForTesting) {
            ThreadUtils.postOnUiThread(new Runnable() { // from class: org.chromium.base.task.AsyncTask$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncTask.this.lambda$postResult$2(result);
                }
            });
        }
    }

    public final int getStatus() {
        return this.mStatus;
    }

    public final int getUmaStatus() {
        if (this.mStatus != 1 || this.mTaskInvoked.get()) {
            return this.mStatus;
        }
        return 0;
    }

    protected void onCancelled(Result result) {
        onCancelled();
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    public final boolean cancel(boolean mayInterruptIfRunning) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(mayInterruptIfRunning);
    }

    public final Result get() throws InterruptedException, ExecutionException {
        String str;
        int umaStatus = getUmaStatus();
        if (umaStatus != 2 && ThreadUtils.runningOnUiThread()) {
            RecordHistogram.recordEnumeratedHistogram(GET_STATUS_UMA_HISTOGRAM, umaStatus, 3);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length <= 1) {
                str = "";
            } else {
                str = stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName() + ".";
            }
            TraceEvent scoped = TraceEvent.scoped(str + "AsyncTask.get");
            try {
                Result result = this.mFuture.get();
                if (scoped != null) {
                    scoped.close();
                }
                return result;
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
        return this.mFuture.get();
    }

    public final Result get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        String str;
        int umaStatus = getUmaStatus();
        if (umaStatus != 2 && ThreadUtils.runningOnUiThread()) {
            RecordHistogram.recordEnumeratedHistogram(GET_STATUS_UMA_HISTOGRAM, umaStatus, 3);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length <= 1) {
                str = "";
            } else {
                str = stackTrace[1].getClassName() + "." + stackTrace[1].getMethodName() + ".";
            }
            TraceEvent scoped = TraceEvent.scoped(str + "AsyncTask.get");
            try {
                Result result = this.mFuture.get(timeout, unit);
                if (scoped != null) {
                    scoped.close();
                }
                return result;
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
        return this.mFuture.get(timeout, unit);
    }

    private void executionPreamble() {
        if (this.mStatus != 0) {
            int i = this.mStatus;
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.mStatus = 1;
        onPreExecute();
    }

    public final AsyncTask<Result> executeOnExecutor(Executor exec) {
        executionPreamble();
        exec.execute(this.mFuture);
        return this;
    }

    public final AsyncTask<Result> executeOnTaskRunner(TaskRunner taskRunner) {
        executionPreamble();
        taskRunner.execute(this.mFuture);
        return this;
    }

    public final AsyncTask<Result> executeWithTaskTraits(int taskTraits) {
        executionPreamble();
        PostTask.postTask(taskTraits, this.mFuture);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void lambda$postResult$2(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = 2;
    }

    class NamedFutureTask extends FutureTask<Result> {
        NamedFutureTask(Callable<Result> c) {
            super(c);
        }

        Class getBlamedClass() {
            return AsyncTask.this.getClass();
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            try {
                TraceEvent scoped = TraceEvent.scoped("AsyncTask.run: " + AsyncTask.this.mFuture.getBlamedClass().getName());
                try {
                    super.run();
                    if (scoped != null) {
                        scoped.close();
                    }
                } finally {
                }
            } finally {
                Thread.interrupted();
            }
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AsyncTask.this.postResultIfNotInvoked(get());
            } catch (InterruptedException e) {
                Log.w(AsyncTask.TAG, e.toString());
            } catch (CancellationException unused) {
                AsyncTask.this.postResultIfNotInvoked(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            }
        }
    }
}
