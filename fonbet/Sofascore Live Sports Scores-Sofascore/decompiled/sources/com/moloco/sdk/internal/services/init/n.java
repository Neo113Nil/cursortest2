package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.j2;
import com.moloco.sdk.publisher.MediationInfo;
import defpackage.a70;
import defpackage.ad2;
import defpackage.fsf;
import defpackage.kuj;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.t53;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.zk9;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n {
    public final e a;
    public final g b;
    public final ad2 c;
    public j2 d;

    public n(e eVar, g gVar, ad2 ad2Var) {
        eVar.getClass();
        this.a = eVar;
        this.b = gVar;
        this.c = ad2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, MediationInfo mediationInfo, sq3 sq3Var) {
        m mVar;
        int i;
        com.moloco.sdk.acm.recorder.c cVar;
        com.moloco.sdk.acm.h hVar;
        l0 l0Var;
        if (sq3Var instanceof m) {
            mVar = (m) sq3Var;
            int i2 = mVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.v = i2 - Integer.MIN_VALUE;
                Object obj = mVar.t;
                Object obj2 = lu3.a;
                i = mVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
                    String name = mediationInfo.getName();
                    aVar.getClass();
                    com.moloco.sdk.acm.recorder.c a = com.moloco.sdk.acm.recorder.a.a(name);
                    com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                    com.moloco.sdk.acm.h c = a.c("sdk_perform_init_time_ms");
                    mVar.r = a;
                    mVar.s = c;
                    mVar.v = 1;
                    Object c2 = c(str, mediationInfo, a, mVar);
                    if (c2 == obj2) {
                        return obj2;
                    }
                    cVar = a;
                    obj = c2;
                    hVar = c;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hVar = mVar.s;
                    cVar = mVar.r;
                    y6a.M(obj);
                }
                c cVar2 = (c) obj;
                l0Var = cVar2.a;
                String str2 = cVar2.b;
                if (!(l0Var instanceof j0)) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("sdk_perform_init_attempt");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar.a("result", "failure");
                    dVar.a("state", str2);
                    cVar.a(dVar);
                    hVar.a("result", "failure");
                    hVar.a("state", str2);
                    cVar.b(hVar);
                } else {
                    if (!(l0Var instanceof k0)) {
                        zzl.b();
                        return null;
                    }
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("sdk_perform_init_attempt");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar2.a("result", "success");
                    dVar2.a("state", str2);
                    cVar.a(dVar2);
                    hVar.a("result", "success");
                    hVar.a("state", str2);
                    cVar.b(hVar);
                }
                return cVar2.a;
            }
        }
        mVar = new m(this, sq3Var);
        Object obj3 = mVar.t;
        Object obj22 = lu3.a;
        i = mVar.v;
        if (i != 0) {
        }
        c cVar22 = (c) obj3;
        l0Var = cVar22.a;
        String str22 = cVar22.b;
        if (!(l0Var instanceof j0)) {
        }
        return cVar22.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0321 -> B:14:0x032a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.b bVar, boolean z, sq3 sq3Var) {
        l lVar;
        n nVar;
        int i;
        Object obj;
        boolean z2;
        fsf g;
        l lVar2;
        int i2;
        int i3;
        String str2;
        MediationInfo mediationInfo2;
        com.moloco.sdk.acm.recorder.b bVar2;
        Throwable th;
        fsf fsfVar;
        Object obj2;
        j2 j2Var;
        boolean z3;
        int i4;
        com.moloco.sdk.acm.recorder.b bVar3;
        Object obj3;
        com.moloco.sdk.acm.recorder.b bVar4;
        j2 j2Var2;
        a aVar;
        g gVar;
        boolean z4;
        lu3 lu3Var;
        Object R;
        int i5;
        String str3;
        com.moloco.sdk.acm.recorder.b bVar5;
        fsf fsfVar2;
        MediationInfo mediationInfo3;
        Object obj4;
        Object obj5;
        Object valueOf;
        int i6;
        if (sq3Var instanceof l) {
            lVar = (l) sq3Var;
            int i7 = lVar.D;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.D = i7 - Integer.MIN_VALUE;
                nVar = this;
                Object obj6 = lVar.B;
                lu3 lu3Var2 = lu3.a;
                i = lVar.D;
                String str4 = "attempt";
                String str5 = "sdk_fetch_init_attempt";
                if (i != 0) {
                    obj = null;
                    z2 = z;
                    g = lnb.g(obj6);
                    lVar2 = lVar;
                    i2 = 0;
                    i3 = 3;
                    str2 = str;
                    mediationInfo2 = mediationInfo;
                    bVar2 = bVar;
                    if (i2 < i3) {
                    }
                } else if (i == 1) {
                    obj = null;
                    int i8 = lVar.A;
                    int i9 = lVar.z;
                    int i10 = lVar.y;
                    boolean z5 = lVar.x;
                    fsf fsfVar3 = lVar.w;
                    fsf fsfVar4 = lVar.v;
                    com.moloco.sdk.acm.recorder.b bVar6 = (com.moloco.sdk.acm.recorder.b) lVar.u;
                    MediationInfo mediationInfo4 = (MediationInfo) lVar.t;
                    String str6 = (String) lVar.s;
                    n nVar2 = (n) lVar.r;
                    y6a.M(obj6);
                    nVar = nVar2;
                    obj4 = obj6;
                    i5 = i9;
                    mediationInfo3 = mediationInfo4;
                    str3 = str6;
                    bVar5 = bVar6;
                    i3 = i10;
                    z2 = z5;
                    fsfVar2 = fsfVar4;
                    g = fsfVar3;
                    i2 = i8;
                    g.a = obj4;
                    obj5 = fsfVar2.a;
                    if (obj5 != null) {
                    }
                } else {
                    if (i == 2) {
                        i4 = lVar.y;
                        z4 = lVar.x;
                        gVar = (g) lVar.u;
                        aVar = (a) lVar.t;
                        j2Var2 = (j2) lVar.s;
                        bVar4 = (com.moloco.sdk.acm.recorder.b) lVar.r;
                        y6a.M(obj6);
                        lu3Var = lu3Var2;
                        obj3 = null;
                        a aVar2 = aVar;
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Updating cache to new init response", null, false, 12, null);
                        lVar.r = bVar4;
                        lVar.s = j2Var2;
                        lVar.t = obj3;
                        lVar.u = obj3;
                        lVar.x = z4;
                        lVar.y = i4;
                        lVar.D = 3;
                        j2 j2Var3 = j2Var2;
                        com.moloco.sdk.acm.recorder.b bVar7 = bVar4;
                        R = xw3.R(gVar.b, new t53(bVar7, aVar2, j2Var3, gVar, null, 14), lVar);
                        if (R != lu3Var) {
                        }
                        if (R != lu3Var2) {
                        }
                        return lu3Var2;
                    }
                    if (i == 3) {
                        i4 = lVar.y;
                        z3 = lVar.x;
                        j2Var = (j2) lVar.s;
                        bVar3 = (com.moloco.sdk.acm.recorder.b) lVar.r;
                        y6a.M(obj6);
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(str5);
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar.a("result", "success");
                        dVar.a(str4, String.valueOf(i4));
                        dVar.a("async", String.valueOf(z3));
                        ((com.moloco.sdk.acm.recorder.c) bVar3).a(dVar);
                        return new k0(j2Var);
                    }
                    if (i == 4) {
                        fsfVar = (fsf) lVar.r;
                        y6a.M(obj6);
                        th = null;
                        obj2 = fsfVar.a;
                        if (obj2 == null) {
                        }
                    } else {
                        if (i != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i11 = lVar.z;
                        int i12 = lVar.y;
                        obj = null;
                        z2 = lVar.x;
                        fsf fsfVar5 = lVar.v;
                        com.moloco.sdk.acm.recorder.b bVar8 = (com.moloco.sdk.acm.recorder.b) lVar.u;
                        MediationInfo mediationInfo5 = (MediationInfo) lVar.t;
                        String str7 = (String) lVar.s;
                        n nVar3 = (n) lVar.r;
                        y6a.M(obj6);
                        String str8 = "attempt";
                        String str9 = "sdk_fetch_init_attempt";
                        fsf fsfVar6 = fsfVar5;
                        lVar2 = lVar;
                        mediationInfo2 = mediationInfo5;
                        i3 = i12;
                        bVar2 = bVar8;
                        i2 = i11 + 1;
                        str2 = str7;
                        nVar = nVar3;
                        str5 = str9;
                        g = fsfVar6;
                        str4 = str8;
                        if (i2 < i3) {
                            e eVar = nVar.a;
                            lVar2.r = nVar;
                            lVar2.s = str2;
                            lVar2.t = mediationInfo2;
                            lVar2.u = bVar2;
                            lVar2.v = g;
                            lVar2.w = g;
                            lVar2.x = z2;
                            lVar2.y = i3;
                            lVar2.z = i2;
                            lVar2.A = i2;
                            lVar2.D = 1;
                            Object a = eVar.a(str2, mediationInfo2, bVar2, lVar2);
                            if (a != lu3Var2) {
                                str3 = str2;
                                i5 = i2;
                                obj4 = a;
                                bVar5 = bVar2;
                                mediationInfo3 = mediationInfo2;
                                lVar = lVar2;
                                fsfVar2 = g;
                                g.a = obj4;
                                obj5 = fsfVar2.a;
                                if (obj5 != null) {
                                    Intrinsics.i("result");
                                    throw null;
                                }
                                l0 l0Var = (l0) obj5;
                                if (l0Var instanceof k0) {
                                    j2 j2Var4 = (j2) ((k0) l0Var).a;
                                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                                    MolocoLogger.info$default(molocoLogger, "InitService", lnb.n("Init, successful in attempt(#", i2, ')'), null, false, 12, null);
                                    a aVar3 = new a(str3);
                                    g gVar2 = nVar.b;
                                    MolocoLogger.info$default(molocoLogger, "InitService", "Clearing cache for old init response", null, false, 12, null);
                                    lVar.r = bVar5;
                                    lVar.s = j2Var4;
                                    lVar.t = aVar3;
                                    lVar.u = gVar2;
                                    lVar.v = null;
                                    lVar.w = null;
                                    lVar.x = z2;
                                    lVar.y = i2;
                                    lVar.D = 2;
                                    aVar = aVar3;
                                    obj3 = null;
                                    Object R2 = xw3.R(gVar2.b, new f(bVar5, aVar3, gVar2, null, 0), lVar);
                                    lu3 lu3Var3 = lu3.a;
                                    if (R2 != lu3Var3) {
                                        R2 = Unit.a;
                                    }
                                    if (R2 != lu3Var2) {
                                        z4 = z2;
                                        gVar = gVar2;
                                        i4 = i2;
                                        j2Var2 = j2Var4;
                                        lu3Var = lu3Var3;
                                        bVar4 = bVar5;
                                        a aVar22 = aVar;
                                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Updating cache to new init response", null, false, 12, null);
                                        lVar.r = bVar4;
                                        lVar.s = j2Var2;
                                        lVar.t = obj3;
                                        lVar.u = obj3;
                                        lVar.x = z4;
                                        lVar.y = i4;
                                        lVar.D = 3;
                                        j2 j2Var32 = j2Var2;
                                        com.moloco.sdk.acm.recorder.b bVar72 = bVar4;
                                        R = xw3.R(gVar.b, new t53(bVar72, aVar22, j2Var32, gVar, null, 14), lVar);
                                        if (R != lu3Var) {
                                            R = Unit.a;
                                        }
                                        if (R != lu3Var2) {
                                            z3 = z4;
                                            bVar3 = bVar72;
                                            j2Var = j2Var32;
                                            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                                            com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d(str5);
                                            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                                            dVar2.a("result", "success");
                                            dVar2.a(str4, String.valueOf(i4));
                                            dVar2.a("async", String.valueOf(z3));
                                            ((com.moloco.sdk.acm.recorder.c) bVar3).a(dVar2);
                                            return new k0(j2Var);
                                        }
                                    }
                                } else {
                                    if (!(l0Var instanceof j0)) {
                                        zzl.b();
                                        return obj;
                                    }
                                    Object obj7 = ((j0) l0Var).a;
                                    j jVar = (j) obj7;
                                    com.moloco.sdk.acm.recorder.b bVar9 = bVar5;
                                    if (jVar instanceof h) {
                                        valueOf = ((h) jVar).a;
                                    } else {
                                        if (!(jVar instanceof i)) {
                                            zzl.b();
                                            return obj;
                                        }
                                        valueOf = String.valueOf(((i) jVar).a);
                                    }
                                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                                    com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d(str5);
                                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                                    str9 = str5;
                                    dVar3.a("result", "failure");
                                    dVar3.a(str4, String.valueOf(i2));
                                    str8 = str4;
                                    dVar3.a("reason", String.valueOf(valueOf));
                                    dVar3.a("async", String.valueOf(z2));
                                    com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar9;
                                    cVar.a(dVar3);
                                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                                    MolocoLogger.info$default(molocoLogger2, "InitService", "Init attempt(#" + i2 + ") failed with error: " + valueOf, null, false, 12, null);
                                    if (!(obj7 instanceof i) || (i6 = ((i) obj7).a) == zk9.n.a || i6 == zk9.m.a || i6 < 400 || i6 >= 500) {
                                        lVar.r = nVar;
                                        lVar.s = str3;
                                        lVar.t = mediationInfo3;
                                        lVar.u = cVar;
                                        lVar.v = fsfVar2;
                                        lVar.w = null;
                                        lVar.x = z2;
                                        lVar.y = i3;
                                        int i13 = i5;
                                        lVar.z = i13;
                                        lVar.D = 5;
                                        if (n4o.y(1000L, lVar) != lu3Var2) {
                                            fsfVar6 = fsfVar2;
                                            str7 = str3;
                                            lVar2 = lVar;
                                            nVar3 = nVar;
                                            mediationInfo2 = mediationInfo3;
                                            i11 = i13;
                                            bVar2 = cVar;
                                            i2 = i11 + 1;
                                            str2 = str7;
                                            nVar = nVar3;
                                            str5 = str9;
                                            g = fsfVar6;
                                            str4 = str8;
                                            if (i2 < i3) {
                                                MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
                                                StringBuilder sb = new StringBuilder("Moloco SDK Init failed after all retries: ");
                                                Object obj8 = g.a;
                                                if (obj8 == null) {
                                                    Intrinsics.i("result");
                                                    throw null;
                                                }
                                                sb.append((l0) obj8);
                                                MolocoLogger.info$default(molocoLogger3, "InitService", sb.toString(), null, false, 12, null);
                                                Object obj9 = g.a;
                                                if (obj9 != null) {
                                                    return (l0) obj9;
                                                }
                                                Intrinsics.i("result");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        MolocoLogger.error$default(molocoLogger2, "InitService", lnb.k(i6, "Init response is non-retryable server failure: ", ", clearing cache"), null, false, 12, null);
                                        g gVar3 = nVar.b;
                                        a aVar4 = new a(str3);
                                        lVar.r = fsfVar2;
                                        lVar.s = null;
                                        lVar.t = null;
                                        lVar.u = null;
                                        lVar.v = null;
                                        lVar.w = null;
                                        lVar.D = 4;
                                        CoroutineContext coroutineContext = gVar3.b;
                                        f fVar = new f(cVar, aVar4, gVar3, null, 0);
                                        th = null;
                                        Object R3 = xw3.R(coroutineContext, fVar, lVar);
                                        if (R3 != lu3.a) {
                                            R3 = Unit.a;
                                        }
                                        if (R3 != lu3Var2) {
                                            fsfVar = fsfVar2;
                                            obj2 = fsfVar.a;
                                            if (obj2 == null) {
                                                return (l0) obj2;
                                            }
                                            Intrinsics.i("result");
                                            throw th;
                                        }
                                    }
                                }
                            }
                            return lu3Var2;
                        }
                    }
                }
            }
        }
        nVar = this;
        lVar = new l(nVar, sq3Var);
        Object obj62 = lVar.B;
        lu3 lu3Var22 = lu3.a;
        i = lVar.D;
        String str42 = "attempt";
        String str52 = "sdk_fetch_init_attempt";
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.c cVar, sq3 sq3Var) {
        k kVar;
        int i;
        com.moloco.sdk.acm.recorder.c cVar2;
        String str2;
        MediationInfo mediationInfo2;
        n nVar;
        j2 j2Var;
        n nVar2;
        l0 l0Var;
        if (sq3Var instanceof k) {
            kVar = (k) sq3Var;
            int i2 = kVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.x = i2 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj = kVar2.v;
                lu3 lu3Var = lu3.a;
                i = kVar2.x;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    j2 j2Var2 = this.d;
                    if (j2Var2 != null) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Returning current session init response", null, false, 12, null);
                        return new c(new k0(j2Var2), "in_memory");
                    }
                    a aVar = new a(str);
                    kVar2.r = this;
                    kVar2.s = str;
                    kVar2.t = mediationInfo;
                    kVar2.u = cVar;
                    kVar2.x = 1;
                    g gVar = this.b;
                    Object R = xw3.R(gVar.b, new f(cVar, aVar, gVar, rq3Var, 1), kVar2);
                    if (R != lu3Var) {
                        cVar2 = cVar;
                        str2 = str;
                        mediationInfo2 = mediationInfo;
                        obj = R;
                        nVar = this;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar2 = kVar2.r;
                    y6a.M(obj);
                    l0Var = (l0) obj;
                    if (!(l0Var instanceof k0)) {
                        nVar2.d = (j2) ((k0) l0Var).a;
                    } else {
                        if (!(l0Var instanceof j0)) {
                            zzl.b();
                            return null;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Fetching init response failed", null, false, 12, null);
                    }
                    return new c(l0Var, "network");
                }
                com.moloco.sdk.acm.recorder.c cVar3 = kVar2.u;
                MediationInfo mediationInfo3 = kVar2.t;
                String str3 = kVar2.s;
                n nVar3 = kVar2.r;
                y6a.M(obj);
                cVar2 = cVar3;
                mediationInfo2 = mediationInfo3;
                str2 = str3;
                nVar = nVar3;
                j2Var = (j2) obj;
                if (j2Var == null) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Returning cached init response", null, false, 12, null);
                    nVar.d = j2Var;
                    xw3.L(nVar.c, null, null, new kuj((Object) nVar, str2, (Object) mediationInfo2, (Object) cVar2, (rq3) null, 19), 3);
                    return new c(new k0(j2Var), "cache");
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "No cached response, fetching from server", null, false, 12, null);
                kVar2.r = nVar;
                kVar2.s = null;
                kVar2.t = null;
                kVar2.u = null;
                kVar2.x = 2;
                obj = nVar.b(str2, mediationInfo2, cVar2, false, kVar2);
                if (obj != lu3Var) {
                    nVar2 = nVar;
                    l0Var = (l0) obj;
                    if (!(l0Var instanceof k0)) {
                    }
                    return new c(l0Var, "network");
                }
                return lu3Var;
            }
        }
        kVar = new k(this, sq3Var);
        k kVar22 = kVar;
        Object obj2 = kVar22.v;
        lu3 lu3Var2 = lu3.a;
        i = kVar22.x;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        j2Var = (j2) obj2;
        if (j2Var == null) {
        }
    }
}
