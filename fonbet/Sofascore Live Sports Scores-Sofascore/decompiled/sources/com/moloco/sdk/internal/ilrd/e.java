package com.moloco.sdk.internal.ilrd;

import android.util.Base64;
import com.google.protobuf.Internal;
import com.moloco.sdk.d1;
import com.moloco.sdk.e1;
import com.moloco.sdk.f1;
import com.moloco.sdk.g1;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.a70;
import defpackage.ad2;
import defpackage.be5;
import defpackage.fdl;
import defpackage.g6b;
import defpackage.h2d;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.pdk;
import defpackage.qp3;
import defpackage.rob;
import defpackage.rq3;
import defpackage.rq4;
import defpackage.sq3;
import defpackage.u6b;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.wt3;
import defpackage.xd5;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements rq4 {
    public final ad2 a;
    public final String b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final com.moloco.sdk.internal.services.i h;
    public final com.moloco.sdk.internal.services.o i;
    public final String j;
    public final String k;
    public final com.moloco.sdk.internal.services.e l;
    public final n m;
    public final n n;
    public final n o;
    public final j2d p;
    public j q;
    public final ArrayList r;

    public e(ad2 ad2Var, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, long j, int i, long j2, long j3, com.moloco.sdk.internal.services.i iVar, g6b g6bVar, com.moloco.sdk.internal.services.o oVar, String str2, String str3, com.moloco.sdk.internal.services.e eVar) {
        n nVar = new n(ad2Var, iVar, "SessionInactiveScheduler");
        n nVar2 = new n(ad2Var, iVar, "SessionMaxLengthScheduler");
        n nVar3 = new n(ad2Var, iVar, "UploadIntervalScheduler");
        str.getClass();
        kVar.getClass();
        iVar.getClass();
        g6bVar.getClass();
        oVar.getClass();
        str2.getClass();
        str3.getClass();
        eVar.getClass();
        this.a = ad2Var;
        this.b = str;
        this.c = kVar;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = j3;
        this.h = iVar;
        this.i = oVar;
        this.j = str2;
        this.k = str3;
        this.l = eVar;
        this.m = nVar;
        this.n = nVar2;
        this.o = nVar3;
        this.p = new j2d();
        this.r = new ArrayList();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder q = wt3.q("ILRD repository initialized - url=", str, ", uploadInterval=");
        q.append((Object) xd5.l(j2));
        q.append(", maxBatchSize=");
        q.append(i);
        q.append(", sessionExpiry=");
        q.append((Object) xd5.l(j));
        q.append(", maxSessionLength=");
        q.append((Object) xd5.l(j3));
        rq3 rq3Var = null;
        MolocoLogger.info$default(molocoLogger, "IlrdEventsRepository", q.toString(), null, false, 12, null);
        hs4 hs4Var = z45.a;
        xw3.L(ad2Var, rob.a.f, null, new pdk(g6bVar, this, rq3Var, 13), 2);
        xw3.L(ad2Var, null, null, new fdl(this, rq3Var, 5), 3);
    }

    public final e1 a(l lVar) {
        d1 h = e1.h();
        h.d(UUID.randomUUID().toString());
        j jVar = this.q;
        if (jVar != null) {
            h.i(jVar.c());
            wd5 wd5Var = xd5.b;
            this.h.getClass();
            long S = wkn.S(System.currentTimeMillis() - jVar.d, be5.MILLISECONDS);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Event created: sessionId=" + jVar.c() + ", sessionAge=" + ((Object) xd5.l(S)), null, false, 12, null);
        }
        if (lVar instanceof l) {
            h.h(lVar.a);
            return (e1) h.build();
        }
        zzl.b();
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|74|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0280, code lost:
    
        if (r0.a("ilrd_events_store", r2) == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        if (r8.a("ilrd_events_store", r2) == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if (r8.a("ilrd_events_store", r2) == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cf, code lost:
    
        if (r1 == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b7, code lost:
    
        if (r4.a("ilrd_session_store", r2) == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008d, code lost:
    
        if (r1 == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0041, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0283, code lost:
    
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "IlrdEventsRepository", "Failed to restore persisted ILRD events", r0, false, 8, null);
        r0 = r4.l;
        r2.r = null;
        r2.s = null;
        r2.v = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x029f, code lost:
    
        if (r0.a("ilrd_events_store", r2) != r3) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01db A[Catch: Exception -> 0x0041, TRY_ENTER, TryCatch #0 {Exception -> 0x0041, blocks: (B:16:0x003c, B:20:0x01db, B:21:0x01f3, B:23:0x01f9, B:26:0x020e, B:31:0x0212, B:33:0x0218, B:34:0x024c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.moloco.sdk.internal.ilrd.e, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rq3 rq3Var) {
        a aVar;
        ?? r4;
        String str;
        long j;
        int i;
        e eVar;
        j jVar;
        String str2;
        e eVar2 = this;
        if (rq3Var instanceof a) {
            aVar = (a) rq3Var;
            int i2 = aVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.v = i2 - Integer.MIN_VALUE;
                Object obj = aVar.t;
                lu3 lu3Var = lu3.a;
                r4 = aVar.v;
                int i3 = 0;
                String str3 = "ilrd_session_store";
                String str4 = "ilrd_events_store";
                rq3 rq3Var2 = null;
                switch (r4) {
                    case 0:
                        y6a.M(obj);
                        aVar.r = eVar2;
                        aVar.v = 1;
                        com.moloco.sdk.internal.services.e eVar3 = eVar2.l;
                        eVar3.getClass();
                        hs4 hs4Var = z45.a;
                        obj = xw3.R(hq4.c, new com.moloco.sdk.internal.services.d(eVar3, str3, rq3Var2, i3), aVar);
                        break;
                    case 1:
                        eVar2 = aVar.r;
                        y6a.M(obj);
                        str = (String) obj;
                        if (str == null) {
                            return Unit.a;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Existing session found: ".concat(str), null, false, 12, null);
                        com.moloco.sdk.internal.services.e eVar4 = eVar2.l;
                        aVar.r = eVar2;
                        aVar.s = str;
                        aVar.v = 2;
                        break;
                    case 2:
                        String str5 = (String) aVar.s;
                        e eVar5 = aVar.r;
                        y6a.M(obj);
                        str = str5;
                        eVar2 = eVar5;
                        hs4 hs4Var2 = z45.a;
                        pdk pdkVar = new pdk(eVar2, str, rq3Var2, 14);
                        aVar.r = eVar2;
                        aVar.s = null;
                        aVar.v = 3;
                        obj = xw3.R(hs4Var2, pdkVar, aVar);
                        break;
                    case 3:
                        eVar2 = aVar.r;
                        y6a.M(obj);
                        j jVar2 = (j) obj;
                        com.moloco.sdk.internal.services.i iVar = eVar2.h;
                        long j2 = eVar2.g;
                        com.moloco.sdk.internal.services.e eVar6 = eVar2.l;
                        iVar.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        wd5 wd5Var = xd5.b;
                        long j3 = currentTimeMillis - jVar2.d;
                        be5 be5Var = be5.MILLISECONDS;
                        long S = wkn.S(j3, be5Var);
                        long j4 = jVar2.b().a;
                        if (xd5.c(S, j2) > 0) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Discarding restored session - exceeded maximum length.", null, false, 12, null);
                            aVar.r = null;
                            aVar.v = 4;
                            break;
                        } else {
                            if (j4 > 0) {
                                j = S;
                                if (currentTimeMillis - j4 > xd5.e(eVar2.d)) {
                                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Discarding restored session - exceeded inactivity timeout", null, false, 12, null);
                                    aVar.r = null;
                                    aVar.v = 5;
                                    break;
                                }
                            } else {
                                j = S;
                            }
                            long S2 = wkn.S(currentTimeMillis - jVar2.d, be5Var);
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "ILRD session restored successfully - sessionId=" + jVar2.c() + ", age=" + ((Object) xd5.l(S2)) + ", impressions=" + jVar2.b(), null, false, 12, null);
                            eVar2.q = jVar2;
                            eVar2.o.a(eVar2.f, new b(eVar2, rq3Var2, 2));
                            eVar2.n.a(xd5.h(j2, j), new b(eVar2, rq3Var2, 1));
                            aVar.r = eVar2;
                            aVar.s = jVar2;
                            aVar.v = 6;
                            eVar6.getClass();
                            hs4 hs4Var3 = z45.a;
                            i = 0;
                            Object R = xw3.R(hq4.c, new com.moloco.sdk.internal.services.d(eVar6, str4, rq3Var2, i), aVar);
                            if (R != lu3Var) {
                                eVar = eVar2;
                                jVar = jVar2;
                                obj = R;
                                str2 = (String) obj;
                                if (str2 != null) {
                                    Internal.ProtobufList i4 = g1.k(Base64.decode(str2, i)).i();
                                    i4.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : i4) {
                                        if (Intrinsics.c(((e1) obj2).getSessionId(), jVar.c())) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "No pending ILRD events matched restored sessionId=" + jVar.c() + "; clearing persisted events", null, false, 12, null);
                                        com.moloco.sdk.internal.services.e eVar7 = eVar.l;
                                        aVar.r = eVar;
                                        aVar.s = null;
                                        aVar.v = 7;
                                        break;
                                    } else {
                                        eVar.r.addAll(arrayList);
                                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Restored " + arrayList.size() + " pending ILRD events for sessionId=" + jVar.c(), null, false, 12, null);
                                    }
                                }
                                return Unit.a;
                            }
                        }
                        return lu3Var;
                    case 4:
                        y6a.M(obj);
                        return Unit.a;
                    case 5:
                        y6a.M(obj);
                        return Unit.a;
                    case 6:
                        jVar = (j) aVar.s;
                        eVar = aVar.r;
                        y6a.M(obj);
                        i = 0;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                        return Unit.a;
                    case 7:
                        e eVar8 = aVar.r;
                        y6a.M(obj);
                        return Unit.a;
                    case 8:
                        y6a.M(obj);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        aVar = new a(eVar2, (sq3) rq3Var);
        Object obj3 = aVar.t;
        lu3 lu3Var2 = lu3.a;
        r4 = aVar.v;
        int i32 = 0;
        String str32 = "ilrd_session_store";
        String str42 = "ilrd_events_store";
        rq3 rq3Var22 = null;
        switch (r4) {
        }
    }

    public final void c() {
        j jVar = this.q;
        long j = this.g;
        com.moloco.sdk.internal.services.i iVar = this.h;
        if (jVar != null && !jVar.f) {
            wd5 wd5Var = xd5.b;
            iVar.getClass();
            long S = wkn.S(System.currentTimeMillis() - jVar.d, be5.MILLISECONDS);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Session validation - age: " + ((Object) xd5.l(S)) + ", limit: " + ((Object) xd5.l(j)), null, false, 12, null);
            return;
        }
        rq3 rq3Var = null;
        j jVar2 = new j(iVar, null);
        this.q = jVar2;
        this.n.a(j, new b(this, rq3Var, 1));
        b bVar = new b(this, rq3Var, 2);
        n nVar = this.o;
        long j2 = this.f;
        nVar.a(j2, bVar);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "New session started: sessionId=" + jVar2.c() + ", maxBatch=" + this.e + ", uploadInterval=" + ((Object) xd5.l(j2)) + ", sessionExp=" + ((Object) xd5.l(this.d)) + ", maxLength=" + ((Object) xd5.l(j)), null, false, 12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0065, code lost:
    
        if (r15.e(r1) == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:28:0x0069, B:30:0x0071, B:31:0x0089, B:33:0x00a6, B:35:0x00ac, B:36:0x00b1), top: B:27:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:28:0x0069, B:30:0x0071, B:31:0x0089, B:33:0x00a6, B:35:0x00ac, B:36:0x00b1), top: B:27:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r14v8, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(rq3 rq3Var) {
        d dVar;
        int i;
        j2d j2dVar;
        Throwable th;
        h2d h2dVar;
        ArrayList arrayList;
        e eVar;
        byte[] bArr;
        try {
            if (rq3Var instanceof d) {
                dVar = (d) rq3Var;
                int i2 = dVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = dVar.u;
                    lu3 lu3Var = lu3.a;
                    i = dVar.w;
                    int i3 = 2;
                    rq3 rq3Var2 = null;
                    if (i != 0) {
                        y6a.M(obj);
                        this.o.a(this.f, new b(this, rq3Var2, i3));
                        dVar.r = this;
                        j2dVar = this.p;
                        dVar.s = j2dVar;
                        dVar.w = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bArr = dVar.t;
                            h2dVar = dVar.s;
                            eVar = dVar.r;
                            try {
                                y6a.M(obj);
                                h2dVar.f(null);
                                if (bArr != null) {
                                    eVar.c.a(eVar.b, bArr, qp3.b, "gzip");
                                }
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        ?? r14 = dVar.s;
                        e eVar2 = dVar.r;
                        y6a.M(obj);
                        j2dVar = r14;
                        this = eVar2;
                    }
                    arrayList = this.r;
                    if (arrayList.isEmpty()) {
                        f1 j = g1.j();
                        j.i();
                        j.k(this.j);
                        j.j(this.k);
                        com.facebook.appevents.j a = ((com.moloco.sdk.internal.services.p) this.i).a();
                        com.moloco.sdk.internal.services.m mVar = a instanceof com.moloco.sdk.internal.services.m ? (com.moloco.sdk.internal.services.m) a : null;
                        if (mVar != null) {
                            j.h(mVar.a);
                        }
                        j.d(arrayList);
                        g1 g1Var = (g1) j.build();
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Ilrd request created now sending it with " + g1Var.i().size() + " events", null, false, 12, null);
                        byte[] byteArray = g1Var.toByteArray();
                        byteArray.getClass();
                        byte[] n = com.facebook.appevents.j.n(byteArray);
                        arrayList.clear();
                        com.moloco.sdk.internal.services.e eVar3 = this.l;
                        dVar.r = this;
                        dVar.s = j2dVar;
                        dVar.t = n;
                        dVar.w = 2;
                        if (eVar3.a("ilrd_events_store", dVar) != lu3Var) {
                            eVar = this;
                            bArr = n;
                            h2dVar = j2dVar;
                        }
                        return lu3Var;
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Request for sendEvent came, but event list is empty. Returning", null, false, 12, null);
                    eVar = this;
                    h2dVar = j2dVar;
                    bArr = null;
                    h2dVar.f(null);
                    if (bArr != null) {
                    }
                    return Unit.a;
                }
            }
            arrayList = this.r;
            if (arrayList.isEmpty()) {
            }
            h2dVar.f(null);
            if (bArr != null) {
            }
            return Unit.a;
        } catch (Throwable th3) {
            th = th3;
            h2dVar = j2dVar;
            h2dVar.f(null);
            throw th;
        }
        dVar = new d(this, (sq3) rq3Var);
        Object obj2 = dVar.u;
        lu3 lu3Var2 = lu3.a;
        i = dVar.w;
        int i32 = 2;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "onPause called, sending events", null, false, 12, null);
        xw3.L(this.a, null, null, new c(this, null, 0), 3);
    }
}
