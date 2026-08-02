package com.logrocket.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogRocketCore f6625b;

    public /* synthetic */ m(LogRocketCore logRocketCore, int i5) {
        this.f6624a = i5;
        this.f6625b = logRocketCore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        switch (this.f6624a) {
            case 0:
                LogRocketCore logRocketCore = this.f6625b;
                ba.d dVar = logRocketCore.f6382e;
                ScheduledExecutorService scheduledExecutorService = logRocketCore.L;
                ArrayBlockingQueue arrayBlockingQueue = logRocketCore.C;
                com.google.firebase.messaging.x xVar = logRocketCore.f6399x;
                if (((l4.e) xVar.f6184c).f19359a <= 10485760) {
                    return;
                }
                logRocketCore.f6400y.set(true);
                arrayBlockingQueue.clear();
                ThreadPoolExecutor threadPoolExecutor = logRocketCore.O;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdownNow();
                }
                scheduledExecutorService.shutdownNow();
                if (logRocketCore.J.get()) {
                    return;
                }
                f0 f0Var = logRocketCore.N;
                logRocketCore.N = new f0(f0Var.f6445a, f0.a(), 0, f0Var.f6448d, System.currentTimeMillis(), System.currentTimeMillis(), f0Var.f6449e, f0Var.f6450f, f0Var.f6451g, f0Var.f6452h, f0Var.f6453i, false, new JSONArray(), null, f0Var.q, y9.d.ANONYMOUS, null);
                try {
                    xVar.t();
                    xVar.K(f0Var);
                    xVar.N(logRocketCore.N);
                    logRocketCore.j.f24485n = Boolean.FALSE;
                    logRocketCore.p();
                    if (scheduledExecutorService.isShutdown()) {
                        logRocketCore.q();
                    }
                    if (logRocketCore.O.isShutdown()) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, arrayBlockingQueue);
                        logRocketCore.O = threadPoolExecutor2;
                        threadPoolExecutor2.prestartCoreThread();
                    }
                    logRocketCore.f("Session reset by limited lookback loop. Old session: " + f0Var.f6446b + "/" + f0Var.f6447c + " New session: " + logRocketCore.N.f6446b + "/" + logRocketCore.N.f6447c);
                    logRocketCore.o();
                    LogRocketCore.k("Session reset by limited lookback loop.");
                    return;
                } catch (IOException e7) {
                    dVar.e("Error while starting new session.", e7);
                    logRocketCore.s("IOException");
                    return;
                } catch (y9.l e9) {
                    dVar.e("Error while starting new session.", e9);
                    logRocketCore.s(e9.f25758a);
                    return;
                }
            default:
                LogRocketCore logRocketCore2 = this.f6625b;
                synchronized (logRocketCore2.D) {
                    logRocketCore2.Q = null;
                }
                if (logRocketCore2.f6394s.get()) {
                    if (logRocketCore2.M.get() > 0) {
                        synchronized (logRocketCore2.G) {
                            hashMap = new HashMap(logRocketCore2.G);
                            logRocketCore2.G.clear();
                        }
                        int andSet = logRocketCore2.M.getAndSet(0);
                        String str = (String) logRocketCore2.K.f681c;
                        wg.d s8 = wg.h.s();
                        s8.d();
                        wg.h.p((wg.h) s8.f6816b, andSet);
                        s8.d();
                        wg.h.r((wg.h) s8.f6816b).putAll(hashMap);
                        if (str != null) {
                            s8.d();
                            wg.h.q((wg.h) s8.f6816b, str);
                        }
                        logRocketCore2.a(11, s8);
                    }
                    logRocketCore2.q();
                    return;
                }
                return;
        }
    }
}
