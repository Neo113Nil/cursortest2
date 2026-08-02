package com.moloco.sdk.acm.eventprocessing;

import com.facebook.appevents.j;
import com.facebook.internal.t;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.nativead.model.h;
import com.moloco.sdk.internal.publisher.nativead.n;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g1;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k;
import defpackage.a70;
import defpackage.j2d;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public f(String str, y yVar, h hVar, r rVar, com.moloco.sdk.internal.services.events.c cVar, AdFormatType adFormatType, k kVar, t0 t0Var, com.moloco.sdk.acm.recorder.c cVar2) {
        str.getClass();
        yVar.getClass();
        hVar.getClass();
        adFormatType.getClass();
        this.a = str;
        this.b = yVar;
        this.c = hVar;
        this.d = t0Var;
        this.e = j.d(null, rVar, cVar, new com.moloco.sdk.acm.services.d(yVar, 5), new com.moloco.sdk.acm.services.d(this, 6), adFormatType, cVar2, null, 1632);
        this.f = new n(hVar.c, hVar.d, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x0048, B:13:0x004e, B:14:0x0055), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(sq3 sq3Var) {
        d dVar;
        int i;
        j2d j2dVar;
        ScheduledFuture scheduledFuture;
        try {
            if (sq3Var instanceof d) {
                dVar = (d) sq3Var;
                int i2 = dVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = dVar.t;
                    lu3 lu3Var = lu3.a;
                    i = dVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = (j2d) this.f;
                        dVar.r = this;
                        dVar.s = j2dVar;
                        dVar.v = 1;
                        if (j2dVar.e(dVar) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2d j2dVar2 = dVar.s;
                        f fVar = dVar.r;
                        y6a.M(obj);
                        j2dVar = j2dVar2;
                        this = fVar;
                    }
                    scheduledFuture = (ScheduledFuture) this.e;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.b();
                    Unit unit = Unit.a;
                    j2dVar.f(null);
                    return unit;
                }
            }
            scheduledFuture = (ScheduledFuture) this.e;
            if (scheduledFuture != null) {
            }
            this.b();
            Unit unit2 = Unit.a;
            j2dVar.f(null);
            return unit2;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        dVar = new d(this, sq3Var);
        Object obj2 = dVar.t;
        lu3 lu3Var2 = lu3.a;
        i = dVar.v;
        if (i != 0) {
        }
    }

    public void b() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c;
            com.appsflyer.b bVar = new com.appsflyer.b(this, 10);
            long j = ((com.moloco.sdk.acm.j) this.b).c;
            this.e = scheduledExecutorService.scheduleWithFixedDelay(bVar, j, j, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(sq3 sq3Var) {
        e eVar;
        int i;
        j2d j2dVar;
        try {
            if (sq3Var instanceof e) {
                eVar = (e) sq3Var;
                int i2 = eVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.t;
                    lu3 lu3Var = lu3.a;
                    i = eVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = (j2d) this.f;
                        eVar.r = this;
                        eVar.s = j2dVar;
                        eVar.v = 1;
                        if (j2dVar.e(eVar) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2d j2dVar2 = eVar.s;
                        f fVar = eVar.r;
                        y6a.M(obj);
                        j2dVar = j2dVar2;
                        this = fVar;
                    }
                    this.b();
                    return Unit.a;
                }
            }
            this.b();
            return Unit.a;
        } finally {
            j2dVar.f(null);
        }
        eVar = new e(this, sq3Var);
        Object obj2 = eVar.t;
        lu3 lu3Var2 = lu3.a;
        i = eVar.v;
        if (i != 0) {
        }
    }

    public f(com.moloco.sdk.internal.services.events.c cVar, List list, List list2, List list3) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n nVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n();
        f1 b = g1.b();
        cVar.getClass();
        b.getClass();
        this.a = cVar;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = nVar;
        this.f = b;
    }

    public f(t tVar, com.moloco.sdk.acm.j jVar, ku3 ku3Var) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.getClass();
        ku3Var.getClass();
        this.a = tVar;
        this.b = jVar;
        this.c = newSingleThreadScheduledExecutor;
        this.d = ku3Var;
        this.f = new j2d();
    }
}
