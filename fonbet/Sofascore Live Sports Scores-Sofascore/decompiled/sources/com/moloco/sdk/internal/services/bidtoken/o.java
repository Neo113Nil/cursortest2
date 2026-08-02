package com.moloco.sdk.internal.services.bidtoken;

import com.ironsource.Fb;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.a70;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.ng2;
import defpackage.p2g;
import defpackage.sq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class o {
    public final x a;
    public final ng2 b;
    public final j2d c;

    public o(x xVar, ng2 ng2Var) {
        xVar.getClass();
        this.a = xVar;
        this.b = ng2Var;
        this.c = new j2d();
    }

    public static void b(com.moloco.sdk.acm.h hVar, com.moloco.sdk.acm.recorder.b bVar, String str) {
        if (str == null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("bid_token_fetch");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            dVar.a("result", "success");
            com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar;
            cVar.a(dVar);
            hVar.a("result", "success");
            cVar.b(hVar);
            return;
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("bid_token_fetch");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar2.a("result", "failure");
        dVar2.a("reason", str);
        com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) bVar;
        cVar2.a(dVar2);
        hVar.a("result", "failure");
        hVar.a("reason", str);
        cVar2.b(hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007d, code lost:
    
        if (r7 == r3) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:13:0x003a, B:14:0x00c9, B:17:0x00d0, B:19:0x00d8, B:21:0x0109, B:26:0x00ed, B:30:0x0051, B:32:0x00a2, B:34:0x00ac, B:40:0x0080), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:13:0x003a, B:14:0x00c9, B:17:0x00d0, B:19:0x00d8, B:21:0x0109, B:26:0x00ed, B:30:0x0051, B:32:0x00a2, B:34:0x00ac, B:40:0x0080), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:13:0x003a, B:14:0x00c9, B:17:0x00d0, B:19:0x00d8, B:21:0x0109, B:26:0x00ed, B:30:0x0051, B:32:0x00a2, B:34:0x00ac, B:40:0x0080), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v12, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v9, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.acm.recorder.b bVar, sq3 sq3Var) {
        n nVar;
        lu3 lu3Var;
        ?? r4;
        com.moloco.sdk.acm.recorder.b bVar2;
        j2d j2dVar;
        com.moloco.sdk.acm.h c;
        Object b;
        com.moloco.sdk.acm.recorder.b bVar3;
        j2d j2dVar2;
        String str;
        String str2;
        Object a;
        o oVar;
        com.moloco.sdk.acm.recorder.b bVar4;
        com.moloco.sdk.acm.h hVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        o oVar2 = this;
        try {
            if (sq3Var instanceof n) {
                nVar = (n) sq3Var;
                int i = nVar.y;
                if ((i & Integer.MIN_VALUE) != 0) {
                    nVar.y = i - Integer.MIN_VALUE;
                    Object obj2 = nVar.w;
                    lu3Var = lu3.a;
                    r4 = nVar.y;
                    String str6 = "";
                    if (r4 != 0) {
                        y6a.M(obj2);
                        nVar.r = oVar2;
                        bVar2 = bVar;
                        nVar.s = bVar2;
                        j2d j2dVar3 = oVar2.c;
                        nVar.t = j2dVar3;
                        nVar.y = 1;
                        Object e = j2dVar3.e(nVar);
                        j2dVar = j2dVar3;
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                if (r4 != 3) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str3 = nVar.v;
                                hVar = nVar.u;
                                Object obj3 = nVar.t;
                                bVar4 = nVar.s;
                                oVar = nVar.r;
                                y6a.M(obj2);
                                a = ((w2g) obj2).a;
                                obj = obj3;
                                p2g p2gVar = w2g.b;
                                if (a instanceof u2g) {
                                    a = "";
                                }
                                str4 = (String) a;
                                if (str4.length() != 0) {
                                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                                    oVar.getClass();
                                    MolocoLogger.error$default(molocoLogger, "BidTokenServiceImpl", "CBT has error", null, false, 12, null);
                                    str5 = "client";
                                } else {
                                    str6 = str3 + ':' + str4;
                                    str5 = null;
                                }
                                str2 = str5;
                                oVar2 = oVar;
                                c = hVar;
                                bVar3 = bVar4;
                                r4 = obj;
                                oVar2.getClass();
                                b(c, bVar3, str2);
                                return str6;
                            }
                            com.moloco.sdk.acm.h hVar2 = nVar.u;
                            ?? r42 = nVar.t;
                            bVar3 = nVar.s;
                            o oVar3 = nVar.r;
                            y6a.M(obj2);
                            c = hVar2;
                            oVar2 = oVar3;
                            j2dVar2 = r42;
                            m mVar = (m) obj2;
                            str = mVar.a;
                            if (str.length() > 0) {
                                str2 = Fb.a;
                                r4 = j2dVar2;
                                oVar2.getClass();
                                b(c, bVar3, str2);
                                return str6;
                            }
                            String str7 = mVar.b;
                            g gVar = mVar.c;
                            ng2 ng2Var = oVar2.b;
                            nVar.r = oVar2;
                            nVar.s = bVar3;
                            nVar.t = j2dVar2;
                            nVar.u = c;
                            nVar.v = str;
                            nVar.y = 3;
                            a = ng2Var.a(bVar3, str7, gVar, nVar);
                            if (a != lu3Var) {
                                oVar = oVar2;
                                bVar4 = bVar3;
                                hVar = c;
                                str3 = str;
                                obj = j2dVar2;
                                p2g p2gVar2 = w2g.b;
                                if (a instanceof u2g) {
                                }
                                str4 = (String) a;
                                if (str4.length() != 0) {
                                }
                                str2 = str5;
                                oVar2 = oVar;
                                c = hVar;
                                bVar3 = bVar4;
                                r4 = obj;
                                oVar2.getClass();
                                b(c, bVar3, str2);
                                return str6;
                            }
                            return lu3Var;
                        }
                        ?? r0 = nVar.t;
                        com.moloco.sdk.acm.recorder.b bVar5 = nVar.s;
                        o oVar4 = nVar.r;
                        y6a.M(obj2);
                        bVar2 = bVar5;
                        j2dVar = r0;
                        oVar2 = oVar4;
                    }
                    com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                    com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar2;
                    c = cVar.c("bid_token_fetch_time");
                    x xVar = oVar2.a;
                    nVar.r = oVar2;
                    nVar.s = cVar;
                    nVar.t = j2dVar;
                    nVar.u = c;
                    nVar.y = 2;
                    b = xVar.b(cVar, nVar);
                    if (b != lu3Var) {
                        return lu3Var;
                    }
                    bVar3 = cVar;
                    obj2 = b;
                    j2dVar2 = j2dVar;
                    m mVar2 = (m) obj2;
                    str = mVar2.a;
                    if (str.length() > 0) {
                    }
                }
            }
            if (r4 != 0) {
            }
            com.moloco.sdk.internal.client_metrics_data.c[] cVarArr2 = com.moloco.sdk.internal.client_metrics_data.c.b;
            com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) bVar2;
            c = cVar2.c("bid_token_fetch_time");
            x xVar2 = oVar2.a;
            nVar.r = oVar2;
            nVar.s = cVar2;
            nVar.t = j2dVar;
            nVar.u = c;
            nVar.y = 2;
            b = xVar2.b(cVar2, nVar);
            if (b != lu3Var) {
            }
        } finally {
            r4.f(null);
        }
        nVar = new n(oVar2, sq3Var);
        Object obj22 = nVar.w;
        lu3Var = lu3.a;
        r4 = nVar.y;
        String str62 = "";
    }
}
