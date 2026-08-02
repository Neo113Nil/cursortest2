package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: e, reason: collision with root package name */
    public static Handler f20442e;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f20444b = e.PENDING;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f20445c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20446d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final FutureTask f20443a = new b(new a());

    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            d.this.f20446d.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = d.this.b();
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    public class b extends FutureTask {
        public b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                d.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                d.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f20449a;

        public c(Object obj) {
            this.f20449a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.d(this.f20449a);
        }
    }

    /* renamed from: androidx.loader.content.d$d, reason: collision with other inner class name */
    public static /* synthetic */ class C0387d {
        static final /* synthetic */ int[] $SwitchMap$androidx$loader$content$ModernAsyncTask$Status;

        static {
            int[] iArr = new int[e.values().length];
            $SwitchMap$androidx$loader$content$ModernAsyncTask$Status = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$loader$content$ModernAsyncTask$Status[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static Handler e() {
        Handler handler;
        synchronized (d.class) {
            try {
                if (f20442e == null) {
                    f20442e = new Handler(Looper.getMainLooper());
                }
                handler = f20442e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f20445c.set(true);
        return this.f20443a.cancel(z10);
    }

    public abstract Object b();

    public final void c(Executor executor) {
        if (this.f20444b == e.PENDING) {
            this.f20444b = e.RUNNING;
            executor.execute(this.f20443a);
            return;
        }
        int i10 = C0387d.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[this.f20444b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f20444b = e.FINISHED;
    }

    public final boolean f() {
        return this.f20445c.get();
    }

    public abstract void g(Object obj);

    public abstract void h(Object obj);

    public void i(Object obj) {
        e().post(new c(obj));
    }

    public void j(Object obj) {
        if (this.f20446d.get()) {
            return;
        }
        i(obj);
    }
}
