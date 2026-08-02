package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.cmo;
import defpackage.ddb;
import defpackage.dmo;
import defpackage.emo;
import defpackage.hlo;
import defpackage.ilo;
import defpackage.jlo;
import defpackage.slo;
import defpackage.tko;
import defpackage.uko;
import defpackage.vko;
import defpackage.wlo;
import defpackage.x3o;
import defpackage.xlo;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhcy {
    public static xlo a(Object obj) {
        return obj == null ? xlo.b : new xlo(obj);
    }

    public static wlo b(Throwable th) {
        th.getClass();
        wlo wloVar = new wlo();
        wloVar.e(th);
        return wloVar;
    }

    public static emo c(Executor executor, Callable callable) {
        emo emoVar = new emo(callable);
        executor.execute(emoVar);
        return emoVar;
    }

    public static emo d(zzhcf zzhcfVar, Executor executor) {
        emo emoVar = new emo();
        emoVar.h = new dmo(emoVar, zzhcfVar);
        executor.execute(emoVar);
        return emoVar;
    }

    public static uko e(ddb ddbVar, Class cls, zzgub zzgubVar, Executor executor) {
        int i = vko.k;
        uko ukoVar = new uko(ddbVar, cls, zzgubVar);
        ddbVar.addListener(ukoVar, zzhdp.a(executor, ukoVar));
        return ukoVar;
    }

    public static tko f(ddb ddbVar, Class cls, zzhcg zzhcgVar, Executor executor) {
        int i = vko.k;
        tko tkoVar = new tko(ddbVar, cls, zzhcgVar);
        ddbVar.addListener(tkoVar, zzhdp.a(executor, tkoVar));
        return tkoVar;
    }

    public static ddb g(ddb ddbVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (ddbVar.isDone()) {
            return ddbVar;
        }
        cmo cmoVar = new cmo();
        cmoVar.h = ddbVar;
        x3o x3oVar = new x3o();
        x3oVar.b = cmoVar;
        cmoVar.i = scheduledExecutorService.schedule(x3oVar, j, timeUnit);
        ddbVar.addListener(x3oVar, slo.a);
        return cmoVar;
    }

    public static hlo h(ddb ddbVar, zzhcg zzhcgVar, Executor executor) {
        int i = jlo.j;
        hlo hloVar = new hlo(ddbVar, zzhcgVar);
        ddbVar.addListener(hloVar, zzhdp.a(executor, hloVar));
        return hloVar;
    }

    public static ilo i(ddb ddbVar, zzgub zzgubVar, Executor executor) {
        int i = jlo.j;
        ilo iloVar = new ilo(ddbVar, zzgubVar);
        ddbVar.addListener(iloVar, zzhdp.a(executor, iloVar));
        return iloVar;
    }

    public static Object j(Future future) {
        if (future.isDone()) {
            return zzhdz.a(future);
        }
        a70.r(zzgvb.a("Future was expected to be done: %s", future));
        return null;
    }

    public static Object k(zzcgo zzcgoVar) {
        try {
            return zzhdz.a(zzcgoVar);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzhco((Error) e.getCause());
            }
            throw new zzhdy(e.getCause());
        }
    }
}
