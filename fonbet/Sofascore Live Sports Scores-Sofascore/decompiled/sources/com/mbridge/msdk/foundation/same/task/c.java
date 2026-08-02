package com.mbridge.msdk.foundation.same.task;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    private static volatile ThreadPoolExecutor a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("mb-task-loader-thread");
            return thread;
        }
    }

    private static int a(int i, String str) {
        int b;
        try {
            b = s0.a().b(str, i);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonTaskLoaderThreadPool", e.getMessage());
            }
        }
        return b <= 0 ? i : b;
    }

    public static ThreadPoolExecutor b() {
        c();
        if (a == null) {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), a(), new ThreadPoolExecutor.DiscardPolicy());
            a.allowCoreThreadTimeOut(true);
        }
        return a;
    }

    private static void c() {
        if (a != null) {
            return;
        }
        int a2 = a(10, "c_t_l_t_p_c");
        int a3 = a(50, "c_t_l_t_p_m");
        int a4 = a(5, "c_t_l_t_p_t");
        int i = a3 < a2 ? a2 : a3;
        try {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor for core " + a2 + " max " + i + " timeout " + a4);
            }
            long j = a4;
            if (j <= 0) {
                j = 1;
            }
            a = new ThreadPoolExecutor(a2, i, j, TimeUnit.SECONDS, new LinkedBlockingDeque(), a(), new ThreadPoolExecutor.DiscardPolicy());
            a.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor failed ", e);
            }
        }
    }

    private static ThreadFactory a() {
        return new a();
    }
}
