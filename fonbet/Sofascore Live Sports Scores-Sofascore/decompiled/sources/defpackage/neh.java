package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class neh {
    public static final neh c = new neh(new x3f(2));
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public neh(x3f x3fVar) {
    }

    public static Object a(meh mehVar) {
        Object obj;
        neh nehVar = c;
        synchronized (nehVar) {
            try {
                leh lehVar = (leh) nehVar.a.get(mehVar);
                if (lehVar == null) {
                    lehVar = new leh(mehVar.c());
                    nehVar.a.put(mehVar, lehVar);
                }
                ScheduledFuture scheduledFuture = lehVar.c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    lehVar.c = null;
                }
                lehVar.b++;
                obj = lehVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(meh mehVar, Object obj) {
        neh nehVar = c;
        synchronized (nehVar) {
            try {
                leh lehVar = (leh) nehVar.a.get(mehVar);
                if (lehVar == null) {
                    throw new IllegalArgumentException("No cached instance found for " + mehVar);
                }
                z1a.r("Releasing the wrong instance", obj == lehVar.a);
                z1a.D("Refcount has already reached zero", lehVar.b > 0);
                int i = lehVar.b - 1;
                lehVar.b = i;
                if (i == 0) {
                    z1a.D("Destroy task already scheduled", lehVar.c == null);
                    ScheduledExecutorService scheduledExecutorService = nehVar.b;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(n49.e("grpc-shared-destroyer-%d"));
                        nehVar.b = scheduledExecutorService;
                    }
                    lehVar.c = scheduledExecutorService.schedule(new sib(new n2(nehVar, lehVar, mehVar, obj, 4)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
