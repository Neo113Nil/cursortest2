package Lg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public static final Map f7191e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f7192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7194c;

    /* renamed from: d, reason: collision with root package name */
    public final RejectedExecutionHandler f7195d = new RejectedExecutionHandler() { // from class: Lg.n
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            o.this.h(runnable, threadPoolExecutor);
        }
    };

    public o(String str) {
        this.f7192a = str;
        i g10 = i.g();
        this.f7193b = g10.d("android_task_executor_maximum_pool_size", 1);
        this.f7194c = g10.d("android_task_executor_keep_alive_seconds", 3);
    }

    public ExecutorService b() {
        return c(this.f7193b <= 1, "");
    }

    public ExecutorService c(boolean z10, String str) {
        String d10 = d(z10, str);
        Map map = f7191e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(d10);
                if (executorService != null) {
                    return executorService;
                }
                ExecutorService e10 = e(z10);
                map.put(d10, e10);
                return e10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String d(boolean z10, String str) {
        if (z10) {
            return this.f7192a + "TransactionalExecutor" + str;
        }
        return this.f7192a + "Executor" + str;
    }

    public final ExecutorService e(boolean z10) {
        if (z10) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f7193b, this.f7194c, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f7195d);
        return threadPoolExecutor;
    }

    public ExecutorService f() {
        return c(true, "");
    }

    public ExecutorService g(String str) {
        if (this.f7193b == 0) {
            str = "";
        }
        return c(true, str);
    }

    public final /* synthetic */ void h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        f().execute(runnable);
    }

    public void i(String str) {
        Map map = f7191e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(str);
                if (executorService != null) {
                    executorService.shutdownNow();
                    map.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j() {
        Map map = f7191e;
        synchronized (map) {
            try {
                for (String str : new ArrayList(map.keySet())) {
                    if (str.startsWith(this.f7192a)) {
                        i(str);
                    } else {
                        f7191e.remove(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
