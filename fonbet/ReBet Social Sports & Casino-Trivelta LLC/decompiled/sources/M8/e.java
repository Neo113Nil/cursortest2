package M8;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.InterruptedIOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f7557d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f7558e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7559f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7560g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f7561h;

    /* renamed from: i, reason: collision with root package name */
    public static ExecutorService f7562i;

    /* renamed from: j, reason: collision with root package name */
    public static Executor f7563j;

    /* renamed from: a, reason: collision with root package name */
    public final Callable f7564a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f7565b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7566c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Executor a() {
            if (e.f7563j == null) {
                e.f7563j = new f(new Handler(Looper.getMainLooper()));
            }
            Executor executor = e.f7563j;
            Intrinsics.checkNotNull(executor);
            return executor;
        }

        public final ExecutorService b() {
            if (e.f7562i == null) {
                e.f7562i = new ThreadPoolExecutor(c(), e(), d(), TimeUnit.SECONDS, new LinkedBlockingQueue());
            }
            ExecutorService executorService = e.f7562i;
            Intrinsics.checkNotNull(executorService);
            return executorService;
        }

        public final int c() {
            return e.f7559f;
        }

        public final long d() {
            return e.f7561h;
        }

        public final int e() {
            return e.f7560g;
        }

        public a() {
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f7558e = availableProcessors;
        f7559f = availableProcessors + 2;
        f7560g = (availableProcessors * 2) + 2;
        f7561h = 1L;
    }

    public e(Callable callable, ExecutorService networkRequestExecutor, Executor completionExecutor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(networkRequestExecutor, "networkRequestExecutor");
        Intrinsics.checkNotNullParameter(completionExecutor, "completionExecutor");
        this.f7564a = callable;
        this.f7565b = networkRequestExecutor;
        this.f7566c = completionExecutor;
    }

    public static final void m(e this$0, final K8.a aVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            final Object call = this$0.f7564a.call();
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            }
            this$0.f7566c.execute(new Runnable() { // from class: M8.b
                @Override // java.lang.Runnable
                public final void run() {
                    e.n(K8.a.this, call);
                }
            });
        } catch (InterruptedIOException | InterruptedException unused) {
        } catch (ExecutionException e10) {
            Log.e(e.class.getName(), "Unable to perform async task, cancelling…", e10);
            this$0.f7566c.execute(new Runnable() { // from class: M8.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.o(K8.a.this, e10);
                }
            });
        } catch (Throwable th2) {
            this$0.f7566c.execute(new Runnable() { // from class: M8.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.p(K8.a.this, th2);
                }
            });
        }
    }

    public static final void n(K8.a aVar, Object obj) {
        if (aVar != null) {
            aVar.a(obj, null);
        }
    }

    public static final void o(K8.a aVar, ExecutionException e10) {
        Intrinsics.checkNotNullParameter(e10, "$e");
        if (aVar != null) {
            aVar.a(null, e10);
        }
    }

    public static final void p(K8.a aVar, Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "$e");
        if (aVar != null) {
            aVar.a(null, e10);
        }
    }

    public final Future l(final K8.a aVar) {
        Future<?> submit = this.f7565b.submit(new Runnable() { // from class: M8.a
            @Override // java.lang.Runnable
            public final void run() {
                e.m(e.this, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(submit, "networkRequestExecutor.s…}\n            }\n        }");
        return submit;
    }

    public final Object q() {
        return this.f7564a.call();
    }
}
