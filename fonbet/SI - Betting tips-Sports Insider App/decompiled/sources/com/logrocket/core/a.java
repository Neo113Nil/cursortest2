package com.logrocket.core;

import android.content.Context;
import android.content.Intent;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f6403b;

    public /* synthetic */ a(b bVar, int i5) {
        this.f6402a = i5;
        this.f6403b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6402a) {
            case 0:
                h0.b(new a(this.f6403b, 2));
                break;
            case 1:
                b bVar = this.f6403b;
                if (bVar.f6408b.compareAndSet(true, false)) {
                    LogRocketCore logRocketCore = bVar.f6407a;
                    AtomicLong atomicLong = logRocketCore.f6398w;
                    ArrayBlockingQueue arrayBlockingQueue = logRocketCore.C;
                    f fVar = logRocketCore.f6383f;
                    if (fVar.f6433i && logRocketCore.f6394s.compareAndSet(false, true)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - atomicLong.get() > logRocketCore.U) {
                            logRocketCore.f("Activity in inactive session, starting new session");
                            logRocketCore.f6382e.a("Activity in inactive session, starting new session");
                            f0 f0Var = logRocketCore.N;
                            JSONArray jSONArray = new JSONArray((Collection) logRocketCore.f6464c);
                            f0Var.getClass();
                            String a7 = f0.a();
                            f0 f0Var2 = new f0(f0Var.f6445a, a7, 0, f0Var.f6449e, f0Var.f6451g, jSONArray);
                            f0Var2.f6461s = logRocketCore.N;
                            StringBuilder p10 = d9.e.p("startNewSession ", a7, "/0 hardReset: false wasResumed: ");
                            p10.append(f0Var2.f6461s != null);
                            logRocketCore.f(p10.toString());
                            arrayBlockingQueue.add(new l(0, logRocketCore, f0Var2, false));
                            Intent intent = new Intent();
                            intent.setAction("LogRocketSDK.StartSessionFromInactive");
                            Context context = logRocketCore.f6396u;
                            intent.setPackage(context.getPackageName());
                            intent.putExtra("appID", fVar.f6425a);
                            context.sendBroadcast(intent);
                            i iVar = ApplicationInitProvider.f6379c;
                            iVar.getClass();
                            Iterator it = new HashSet(iVar.f6589b).iterator();
                            while (it.hasNext()) {
                                d dVar = logRocketCore.f6462a;
                                if (dVar.f6418f) {
                                    if (dVar.f6417e.isEmpty()) {
                                        h0.b(new aa.c(12, dVar));
                                    } else {
                                        h0.b(new androidx.appcompat.app.t(6, dVar, dVar.f6417e));
                                    }
                                }
                            }
                        }
                        atomicLong.set(currentTimeMillis);
                        if (logRocketCore.O == null) {
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, arrayBlockingQueue);
                            logRocketCore.O = threadPoolExecutor;
                            threadPoolExecutor.prestartCoreThread();
                        }
                        logRocketCore.q();
                        x xVar = logRocketCore.f6386i;
                        if (xVar.f6656m.compareAndSet(false, true)) {
                            xVar.c(false);
                            break;
                        }
                    }
                }
                break;
            default:
                b bVar2 = this.f6403b;
                if (bVar2.f6409c.decrementAndGet() == 0) {
                    LogRocketCore logRocketCore2 = bVar2.f6407a;
                    if (logRocketCore2.f6383f.f6433i && logRocketCore2.f6394s.compareAndSet(true, false)) {
                        logRocketCore2.f6398w.set(System.currentTimeMillis());
                        x xVar2 = logRocketCore2.f6386i;
                        if (xVar2.f6656m.compareAndSet(true, false)) {
                            xVar2.b();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
