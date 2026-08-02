package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import android.util.Base64;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.j2;
import defpackage.hoi;
import defpackage.im5;
import defpackage.km5;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ com.moloco.sdk.acm.recorder.b s;
    public final /* synthetic */ a t;
    public final /* synthetic */ g u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.moloco.sdk.acm.recorder.b bVar, a aVar, g gVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = bVar;
        this.t = aVar;
        this.u = gVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new f(this.s, this.t, this.u, rq3Var, 0);
            default:
                return new f(this.s, this.t, this.u, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((f) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.r;
        com.moloco.sdk.acm.recorder.b bVar = this.s;
        a aVar = this.t;
        g gVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar;
                com.moloco.sdk.acm.h c = cVar.c("SDKInitCacheClear");
                try {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Clearing cache for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                    SharedPreferences.Editor edit = gVar.a.edit();
                    edit.getClass();
                    km5.a.getClass();
                    im5.a.getClass();
                    edit.remove(aVar.a());
                    if (edit.commit()) {
                        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully cleared cache for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("SDKInitCacheClear");
                        dVar.a("Result", "success");
                        ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar);
                        c.a("Result", "success");
                        ((com.moloco.sdk.acm.recorder.c) bVar).b(c);
                    } else {
                        MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to clear cache for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("SDKInitCacheClear");
                        dVar2.a("Result", "failure");
                        dVar2.a("Reason", "commit_failure");
                        ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar2);
                        c.a("Result", "failure");
                        c.a("Reason", "commit_failure");
                        ((com.moloco.sdk.acm.recorder.c) bVar).b(c);
                    }
                } catch (Exception e) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to clear cache for cacheKey: " + aVar.a() + " with exception", e, false, 8, null);
                    com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("SDKInitCacheClear");
                    dVar3.a("Result", "failure");
                    dVar3.a("Reason", e.getClass().getSimpleName());
                    cVar.a(dVar3);
                    c.a("Result", "failure");
                    c.a("Reason", e.getClass().getSimpleName());
                    cVar.b(c);
                }
                return Unit.a;
            default:
                SharedPreferences sharedPreferences = gVar.a;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) bVar;
                com.moloco.sdk.acm.h c2 = cVar2.c("SDKInitCacheRead");
                try {
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Reading cache for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                    g.a(aVar, sharedPreferences);
                    obj2 = null;
                    try {
                        String string = sharedPreferences.getString(aVar.a(), null);
                        j2 u = string != null ? j2.u(Base64.decode(string, 0)) : null;
                        if (u != null) {
                            MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Successfully read cache for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                            c2.a("Result", "success");
                            ((com.moloco.sdk.acm.recorder.c) bVar).b(c2);
                            com.moloco.sdk.acm.d dVar4 = new com.moloco.sdk.acm.d("SDKInitCacheRead");
                            dVar4.a("Result", "success");
                            ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar4);
                        } else {
                            MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Failed to read from cache (cache_miss) for cacheKey: ".concat(aVar.a()), null, false, 12, null);
                            c2.a("Result", "failure");
                            c2.a("Reason", "cache_miss");
                            ((com.moloco.sdk.acm.recorder.c) bVar).b(c2);
                            com.moloco.sdk.acm.d dVar5 = new com.moloco.sdk.acm.d("SDKInitCacheRead");
                            dVar5.a("Result", "failure");
                            dVar5.a("Reason", "cache_miss");
                            ((com.moloco.sdk.acm.recorder.c) bVar).a(dVar5);
                        }
                        return u;
                    } catch (Exception e2) {
                        e = e2;
                        Exception exc = e;
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to read cache for cacheKey: " + aVar.a() + " with exception", exc, false, 8, null);
                        c2.a("Result", "failure");
                        c2.a("Reason", exc.getClass().getSimpleName());
                        cVar2.b(c2);
                        com.moloco.sdk.acm.d dVar6 = new com.moloco.sdk.acm.d("SDKInitCacheRead");
                        dVar6.a("Result", "failure");
                        dVar6.a("Reason", exc.getClass().getSimpleName());
                        cVar2.a(dVar6);
                        return obj2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    obj2 = null;
                }
        }
    }
}
