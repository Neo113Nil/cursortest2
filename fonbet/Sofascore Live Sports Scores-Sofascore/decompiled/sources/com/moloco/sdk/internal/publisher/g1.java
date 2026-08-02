package com.moloco.sdk.internal.publisher;

import android.net.Uri;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.a3;
import com.moloco.sdk.b3;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.j2;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.z2;
import defpackage.a70;
import defpackage.d11;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.jof;
import defpackage.lu3;
import defpackage.qp3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.un0;
import defpackage.wh4;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g1 {
    public static final MolocoInitStatus f;
    public static final MolocoInitStatus g;
    public final com.moloco.sdk.internal.services.i a;
    public final fdi b;
    public final jof c;
    public j2 d;
    public final fdi e;

    static {
        Initialization initialization = Initialization.SUCCESS;
        f = new MolocoInitStatus(initialization, "Already Initialized");
        g = new MolocoInitStatus(initialization, "Initialized");
    }

    public g1(com.moloco.sdk.internal.services.i iVar) {
        iVar.getClass();
        this.a = iVar;
        fdi a = gdi.a(null);
        this.b = a;
        this.c = un0.u(a);
        this.e = gdi.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        d1 d1Var;
        int i;
        if (sq3Var instanceof d1) {
            d1Var = (d1) sq3Var;
            int i2 = d1Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d1Var.t = i2 - Integer.MIN_VALUE;
                Object obj = d1Var.r;
                lu3 lu3Var = lu3.a;
                i = d1Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "Moloco SDK awaiting init to receive AdFactory", null, false, 12, null);
                    d11 d11Var = new d11(2, rq3Var, 19);
                    d1Var.t = 1;
                    obj = rd0.z(this.e, d11Var, d1Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                obj.getClass();
                com.moloco.sdk.internal.h hVar = (com.moloco.sdk.internal.h) obj;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "Moloco SDK init completed, AdFactory received", null, false, 12, null);
                return hVar;
            }
        }
        d1Var = new d1(this, sq3Var);
        Object obj2 = d1Var.r;
        lu3 lu3Var2 = lu3.a;
        i = d1Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        obj2.getClass();
        com.moloco.sdk.internal.h hVar2 = (com.moloco.sdk.internal.h) obj2;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "Moloco SDK init completed, AdFactory received", null, false, 12, null);
        return hVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x02b8, code lost:
    
        if (kotlin.Unit.a != r9) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c6, code lost:
    
        if (kotlin.Unit.a == r9) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.moloco.sdk.internal.l0 l0Var, long j, com.moloco.sdk.internal.services.init.p pVar, com.moloco.sdk.acm.recorder.c cVar, com.moloco.sdk.acm.h hVar, sq3 sq3Var) {
        e1 e1Var;
        int i;
        g1 g1Var;
        j2 j2Var;
        long j2;
        com.moloco.sdk.acm.h hVar2;
        com.moloco.sdk.internal.l0 l0Var2;
        Object obj;
        com.moloco.sdk.acm.h hVar3;
        com.moloco.sdk.internal.services.init.j jVar;
        j2 j2Var2;
        com.moloco.sdk.acm.h hVar4;
        Object obj2;
        g1 g1Var2;
        com.moloco.sdk.internal.h hVar5;
        com.moloco.sdk.internal.l0 l0Var3 = l0Var;
        long j3 = j;
        com.moloco.sdk.internal.services.init.p pVar2 = pVar;
        Object obj3 = cVar;
        com.moloco.sdk.acm.h hVar6 = hVar;
        if (sq3Var instanceof e1) {
            e1Var = (e1) sq3Var;
            int i2 = e1Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e1Var.z = i2 - Integer.MIN_VALUE;
                Object obj4 = e1Var.x;
                lu3 lu3Var = lu3.a;
                i = e1Var.z;
                if (i != 0) {
                    y6a.M(obj4);
                    if (l0Var3 instanceof com.moloco.sdk.internal.j0) {
                        fdi fdiVar = this.b;
                        Initialization initialization = Initialization.FAILURE;
                        e1Var.r = l0Var3;
                        e1Var.s = pVar2;
                        e1Var.t = obj3;
                        e1Var.u = hVar6;
                        e1Var.w = j3;
                        e1Var.z = 1;
                        fdiVar.l(initialization);
                    } else {
                        if (!(l0Var3 instanceof com.moloco.sdk.internal.k0)) {
                            zzl.b();
                            return null;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "sdk init success", null, false, 12, null);
                        j2 j2Var3 = (j2) ((com.moloco.sdk.internal.k0) l0Var3).a;
                        this.d = j2Var3;
                        fdi fdiVar2 = this.b;
                        Initialization initialization2 = Initialization.SUCCESS;
                        e1Var.r = this;
                        e1Var.s = pVar2;
                        e1Var.t = obj3;
                        e1Var.u = hVar6;
                        e1Var.v = j2Var3;
                        e1Var.w = j3;
                        e1Var.z = 3;
                        fdiVar2.l(initialization2);
                        if (Unit.a != lu3Var) {
                            g1Var = this;
                            j2Var = j2Var3;
                            j2 = j3;
                            hVar2 = hVar6;
                            e1Var.r = g1Var;
                            e1Var.s = obj3;
                            e1Var.t = hVar2;
                            e1Var.u = j2Var;
                            e1Var.v = null;
                            e1Var.z = 4;
                            pVar2.getClass();
                            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking success", false, 4, null);
                            Uri build = Uri.parse(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING).buildUpon().build();
                            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVar = pVar2.a;
                            String uri = build.toString();
                            uri.getClass();
                            a3 h = b3.h();
                            h.h(j2);
                            h.i((z2) z2.h().build());
                            byte[] byteArray = ((b3) h.build()).toByteArray();
                            byteArray.getClass();
                            eVar.a(uri, byteArray, qp3.b, null);
                            if (Unit.a != lu3Var) {
                            }
                        }
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    long j4 = e1Var.w;
                    com.moloco.sdk.acm.h hVar7 = (com.moloco.sdk.acm.h) e1Var.u;
                    Object obj5 = (com.moloco.sdk.acm.recorder.b) e1Var.t;
                    pVar2 = (com.moloco.sdk.internal.services.init.p) e1Var.s;
                    com.moloco.sdk.internal.l0 l0Var4 = (com.moloco.sdk.internal.l0) e1Var.r;
                    y6a.M(obj4);
                    hVar6 = hVar7;
                    obj3 = obj5;
                    j3 = j4;
                    l0Var3 = l0Var4;
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "sdk init failed", null, false, 12, null);
                    com.moloco.sdk.internal.services.init.j jVar2 = (com.moloco.sdk.internal.services.init.j) ((com.moloco.sdk.internal.j0) l0Var3).a;
                    e1Var.r = l0Var3;
                    e1Var.s = obj3;
                    e1Var.t = hVar6;
                    e1Var.u = null;
                    e1Var.z = 2;
                    if (pVar2.a(jVar2, j3) != lu3Var) {
                        l0Var2 = l0Var3;
                        obj = obj3;
                        hVar3 = hVar6;
                        jVar = (com.moloco.sdk.internal.services.init.j) ((com.moloco.sdk.internal.j0) l0Var2).a;
                        if (!(jVar instanceof com.moloco.sdk.internal.services.init.h)) {
                        }
                    }
                    return lu3Var;
                }
                if (i == 2) {
                    hVar3 = (com.moloco.sdk.acm.h) e1Var.t;
                    obj = (com.moloco.sdk.acm.recorder.b) e1Var.s;
                    l0Var2 = (com.moloco.sdk.internal.l0) e1Var.r;
                    y6a.M(obj4);
                    jVar = (com.moloco.sdk.internal.services.init.j) ((com.moloco.sdk.internal.j0) l0Var2).a;
                    if (!(jVar instanceof com.moloco.sdk.internal.services.init.h)) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("sdk_init_failure");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                        com.moloco.sdk.internal.services.init.h hVar8 = (com.moloco.sdk.internal.services.init.h) jVar;
                        dVar.a("reason", hVar8.a.name());
                        com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) obj;
                        cVar2.a(dVar);
                        hVar3.a("result", "failure");
                        hVar3.a("reason", hVar8.a.name());
                        cVar2.b(hVar3);
                    } else {
                        if (!(jVar instanceof com.moloco.sdk.internal.services.init.i)) {
                            zzl.b();
                            return null;
                        }
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("sdk_init_failure");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        com.moloco.sdk.internal.services.init.i iVar = (com.moloco.sdk.internal.services.init.i) jVar;
                        dVar2.a("reason", String.valueOf(iVar.a));
                        com.moloco.sdk.acm.recorder.c cVar3 = (com.moloco.sdk.acm.recorder.c) obj;
                        cVar3.a(dVar2);
                        hVar3.a("result", "failure");
                        hVar3.a("reason", String.valueOf(iVar.a));
                        cVar3.b(hVar3);
                    }
                } else {
                    if (i == 3) {
                        j2 = e1Var.w;
                        j2Var = e1Var.v;
                        hVar2 = (com.moloco.sdk.acm.h) e1Var.u;
                        Object obj6 = (com.moloco.sdk.acm.recorder.b) e1Var.t;
                        com.moloco.sdk.internal.services.init.p pVar3 = (com.moloco.sdk.internal.services.init.p) e1Var.s;
                        g1Var = (g1) e1Var.r;
                        y6a.M(obj4);
                        obj3 = obj6;
                        pVar2 = pVar3;
                        e1Var.r = g1Var;
                        e1Var.s = obj3;
                        e1Var.t = hVar2;
                        e1Var.u = j2Var;
                        e1Var.v = null;
                        e1Var.z = 4;
                        pVar2.getClass();
                        try {
                            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking success", false, 4, null);
                            Uri build2 = Uri.parse(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING).buildUpon().build();
                            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVar2 = pVar2.a;
                            String uri2 = build2.toString();
                            uri2.getClass();
                            a3 h2 = b3.h();
                            h2.h(j2);
                            h2.i((z2) z2.h().build());
                            byte[] byteArray2 = ((b3) h2.build()).toByteArray();
                            byteArray2.getClass();
                            eVar2.a(uri2, byteArray2, qp3.b, null);
                        } catch (Exception e) {
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifySuccess post request", e, false, 8, null);
                        }
                        if (Unit.a != lu3Var) {
                            j2Var2 = j2Var;
                            hVar4 = hVar2;
                            obj2 = obj3;
                            g1Var2 = g1Var;
                            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                            com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("sdk_init_success");
                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                            String j5 = j2Var2.j();
                            j5.getClass();
                            dVar3.a("country", j5);
                            com.moloco.sdk.acm.recorder.c cVar4 = (com.moloco.sdk.acm.recorder.c) obj2;
                            cVar4.a(dVar3);
                            hVar4.a("result", "success");
                            String j6 = j2Var2.j();
                            j6.getClass();
                            hVar4.a("country", j6);
                            cVar4.b(hVar4);
                            fdi fdiVar3 = g1Var2.e;
                            com.moloco.sdk.service_locator.f fVar = com.moloco.sdk.service_locator.f.a;
                            hVar5 = com.moloco.sdk.service_locator.f.b;
                            if (hVar5 == null) {
                            }
                            e1Var.r = null;
                            e1Var.s = null;
                            e1Var.t = null;
                            e1Var.u = null;
                            e1Var.z = 5;
                            fdiVar3.m(null, hVar5);
                        }
                        return lu3Var;
                    }
                    if (i == 4) {
                        j2Var2 = (j2) e1Var.u;
                        hVar4 = (com.moloco.sdk.acm.h) e1Var.t;
                        obj2 = (com.moloco.sdk.acm.recorder.b) e1Var.s;
                        g1Var2 = (g1) e1Var.r;
                        y6a.M(obj4);
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr32 = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar32 = new com.moloco.sdk.acm.d("sdk_init_success");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr32 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        String j52 = j2Var2.j();
                        j52.getClass();
                        dVar32.a("country", j52);
                        com.moloco.sdk.acm.recorder.c cVar42 = (com.moloco.sdk.acm.recorder.c) obj2;
                        cVar42.a(dVar32);
                        hVar4.a("result", "success");
                        String j62 = j2Var2.j();
                        j62.getClass();
                        hVar4.a("country", j62);
                        cVar42.b(hVar4);
                        fdi fdiVar32 = g1Var2.e;
                        com.moloco.sdk.service_locator.f fVar2 = com.moloco.sdk.service_locator.f.a;
                        hVar5 = com.moloco.sdk.service_locator.f.b;
                        if (hVar5 == null) {
                            synchronized (fVar2) {
                                hVar5 = com.moloco.sdk.service_locator.f.b;
                                if (hVar5 == null) {
                                    hVar5 = new com.moloco.sdk.internal.h(j2Var2, com.moloco.sdk.service_locator.l.a(), new com.moloco.sdk.internal.services.z(com.moloco.sdk.service_locator.i.a(), com.moloco.sdk.service_locator.l.a()));
                                    com.moloco.sdk.service_locator.f.b = hVar5;
                                }
                            }
                        }
                        e1Var.r = null;
                        e1Var.s = null;
                        e1Var.t = null;
                        e1Var.u = null;
                        e1Var.z = 5;
                        fdiVar32.m(null, hVar5);
                    } else {
                        if (i != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj4);
                    }
                }
                return Unit.a;
            }
        }
        e1Var = new e1(this, sq3Var);
        Object obj42 = e1Var.x;
        lu3 lu3Var2 = lu3.a;
        i = e1Var.z;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        if (r20.a(r0, 0) != r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.p pVar, com.moloco.sdk.acm.recorder.c cVar, sq3 sq3Var) {
        f1 f1Var;
        lu3 lu3Var;
        int i;
        com.moloco.sdk.internal.services.init.h hVar;
        Object R;
        com.moloco.sdk.internal.services.init.h hVar2;
        g1 g1Var = this;
        com.moloco.sdk.acm.recorder.c cVar2 = cVar;
        if (sq3Var instanceof f1) {
            f1Var = (f1) sq3Var;
            int i2 = f1Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f1Var.w = i2 - Integer.MIN_VALUE;
                f1 f1Var2 = f1Var;
                Object obj = f1Var2.u;
                lu3Var = lu3.a;
                i = f1Var2.w;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, "InitializationHandler", "initialize()", null, false, 12, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    cVar2.a(new com.moloco.sdk.acm.d("sdk_init_attempt"));
                    try {
                        com.moloco.sdk.service_locator.j.b();
                        f1Var2.w = 3;
                        hs4 hs4Var = z45.a;
                        R = xw3.R(hq4.c, new wh4(cVar2, g1Var, str, mediationInfo, pVar, null), f1Var2);
                    } catch (IllegalStateException unused) {
                        MolocoLogger.error$default(molocoLogger, "InitializationHandler", "PersistentHttpRequest is not available, failing to initialize", null, false, 12, null);
                        hVar = new com.moloco.sdk.internal.services.init.h(com.moloco.sdk.internal.services.init.b.e);
                        f1Var2.r = g1Var;
                        f1Var2.s = cVar2;
                        f1Var2.t = hVar;
                        f1Var2.w = 1;
                    }
                    return R == lu3Var ? lu3Var : R;
                }
                if (i != 1) {
                    if (i == 2) {
                        hVar2 = (com.moloco.sdk.internal.services.init.h) f1Var2.r;
                        y6a.M(obj);
                        return new com.moloco.sdk.internal.j0(hVar2);
                    }
                    if (i == 3) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.moloco.sdk.internal.services.init.h hVar3 = f1Var2.t;
                com.moloco.sdk.acm.recorder.c cVar3 = f1Var2.s;
                g1 g1Var2 = (g1) f1Var2.r;
                y6a.M(obj);
                hVar = hVar3;
                cVar2 = cVar3;
                g1Var = g1Var2;
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("sdk_init_failure");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar.a("reason", hVar.a.name());
                cVar2.a(dVar);
                fdi fdiVar = g1Var.b;
                Initialization initialization = Initialization.FAILURE;
                f1Var2.r = hVar;
                f1Var2.s = null;
                f1Var2.t = null;
                f1Var2.w = 2;
                fdiVar.l(initialization);
                if (Unit.a != lu3Var) {
                    hVar2 = hVar;
                    return new com.moloco.sdk.internal.j0(hVar2);
                }
            }
        }
        f1Var = new f1(g1Var, sq3Var);
        f1 f1Var22 = f1Var;
        Object obj2 = f1Var22.u;
        lu3Var = lu3.a;
        i = f1Var22.w;
        if (i != 0) {
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr22 = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("sdk_init_failure");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar2.a("reason", hVar.a.name());
        cVar2.a(dVar2);
        fdi fdiVar2 = g1Var.b;
        Initialization initialization2 = Initialization.FAILURE;
        f1Var22.r = hVar;
        f1Var22.s = null;
        f1Var22.t = null;
        f1Var22.w = 2;
        fdiVar2.l(initialization2);
        if (Unit.a != lu3Var) {
        }
    }
}
