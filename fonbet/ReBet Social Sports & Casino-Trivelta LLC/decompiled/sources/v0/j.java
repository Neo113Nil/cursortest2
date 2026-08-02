package v0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x0.InterfaceC6772a;

/* loaded from: classes.dex */
public abstract class j {

    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public String f66814a;

        /* renamed from: b, reason: collision with root package name */
        public int f66815b;

        /* renamed from: v0.j$a$a, reason: collision with other inner class name */
        public static class C0934a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            public final int f66816a;

            public C0934a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f66816a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f66816a);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f66814a = str;
            this.f66815b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0934a(runnable, this.f66814a, this.f66815b);
        }
    }

    public static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f66817a;

        public b(Handler handler) {
            this.f66817a = (Handler) x0.f.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f66817a.post((Runnable) x0.f.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f66817a + " is shutting down");
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Callable f66818a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC6772a f66819b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f66820c;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6772a f66821a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f66822b;

            public a(InterfaceC6772a interfaceC6772a, Object obj) {
                this.f66821a = interfaceC6772a;
                this.f66822b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f66821a.accept(this.f66822b);
            }
        }

        public c(Handler handler, Callable callable, InterfaceC6772a interfaceC6772a) {
            this.f66818a = callable;
            this.f66819b = interfaceC6772a;
            this.f66820c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f66818a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f66820c.post(new a(this.f66819b, obj));
        }
    }

    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(Handler handler) {
        return new b(handler);
    }

    public static void c(Executor executor, Callable callable, InterfaceC6772a interfaceC6772a) {
        executor.execute(new c(AbstractC6595b.a(), callable, interfaceC6772a));
    }

    public static Object d(ExecutorService executorService, Callable callable, int i10) {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
