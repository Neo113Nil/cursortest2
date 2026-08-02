package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public abstract class ModernAsyncTask<Result> {
    public static Handler f;
    public volatile Status c = Status.PENDING;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final b b = new b(new a());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;

        static {
            Status status = new Status("PENDING", 0);
            PENDING = status;
            Status status2 = new Status("RUNNING", 1);
            RUNNING = status2;
            Status status3 = new Status("FINISHED", 2);
            FINISHED = status3;
            $VALUES = new Status[]{status, status2, status3};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public class a implements Callable<Result> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            modernAsyncTask.e.set(true);
            try {
                Process.setThreadPriority(10);
                modernAsyncTask.a();
                Binder.flushPendingCommands();
                return null;
            } finally {
            }
        }
    }

    public class b extends FutureTask<Result> {
        public b(a aVar) {
            super(aVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            AtomicBoolean atomicBoolean = modernAsyncTask.e;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                modernAsyncTask.d(result);
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                if (atomicBoolean.get()) {
                    return;
                }
                modernAsyncTask.d(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Object b;

        public c(Object obj) {
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            Object obj = this.b;
            if (modernAsyncTask.d.get()) {
                modernAsyncTask.b(obj);
            } else {
                modernAsyncTask.c(obj);
            }
            modernAsyncTask.c = Status.FINISHED;
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract void a();

    public final void d(Result result) {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new c(result));
    }

    public void b(Result result) {
    }

    public void c(Result result) {
    }
}
