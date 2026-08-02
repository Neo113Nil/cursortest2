package com.moloco.sdk.internal.publisher;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.a70;
import defpackage.hoi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lm5;
import defpackage.lu3;
import defpackage.pdk;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sub;
import defpackage.wv8;
import defpackage.xbb;
import defpackage.xd5;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z extends hoi implements Function2 {
    public c0 r;
    public long s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ a0 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ c0 x;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, String str, c0 c0Var, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = a0Var;
        this.w = str;
        this.x = c0Var;
        this.y = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        z zVar = new z(this.v, this.w, this.x, this.y, rq3Var);
        zVar.u = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x012c, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112  */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.internal.ortb.model.c0 c0Var;
        Object R;
        a0 a0Var;
        long j;
        c0 c0Var2;
        com.moloco.sdk.internal.ortb.model.y a;
        com.moloco.sdk.internal.d0 b;
        com.moloco.sdk.internal.ortb.model.a0 a0Var2;
        com.moloco.sdk.internal.ortb.model.a0 a0Var3;
        com.moloco.sdk.internal.z zVar;
        String str;
        Map map;
        com.moloco.sdk.internal.ortb.model.a0 a0Var4;
        a0 a0Var5 = this.v;
        String str2 = a0Var5.b;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        long j2 = this.y;
        c0 c0Var3 = this.x;
        com.moloco.sdk.internal.ortb.model.h hVar = 0;
        r10 = null;
        com.moloco.sdk.internal.ortb.model.h hVar2 = null;
        hVar = 0;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.u;
            a0Var5.k = false;
            String str3 = a0Var5.l;
            String str4 = this.w;
            if (!Intrinsics.c(str3, str4)) {
                a0Var5.l = str4;
                a0Var5.m = null;
            }
            c0Var = a0Var5.m;
            if (c0Var == null) {
                s9a.t(ku3Var);
                com.moloco.sdk.internal.ortb.d dVar = a0Var5.d;
                this.u = a0Var5;
                this.r = c0Var3;
                this.s = j2;
                this.t = 1;
                dVar.getClass();
                hs4 hs4Var = z45.a;
                R = xw3.R(hq4.c, new pdk(dVar, str4, hVar, 16), this);
                if (R == lu3Var) {
                    return lu3Var;
                }
                a0Var = a0Var5;
                j = j2;
                c0Var2 = c0Var3;
            }
            a = c0Var == null ? a0.a(c0Var) : null;
            if (a != null) {
                com.moloco.sdk.internal.d0 a2 = com.moloco.sdk.internal.e0.a(str2, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.z.d);
                com.moloco.sdk.internal.ortb.model.y a3 = a0.a(a0Var5.m);
                if (a3 != null && (a0Var3 = a3.d) != null) {
                    hVar2 = a0Var3.d;
                }
                c0Var3.a(a2, hVar2);
                return Unit.a;
            }
            Integer num = a.g;
            AdFormatType adFormatType = a0Var5.f;
            adFormatType.getClass();
            str2.getClass();
            if (adFormatType == AdFormatType.INLINE_ADAPTIVE_BANNER || adFormatType == AdFormatType.ANCHORED_ADAPTIVE_BANNER) {
                Integer num2 = a.h;
                if (num == null || num2 == null) {
                    xbb b2 = kotlin.collections.a.b();
                    if (num == null) {
                        b2.add("w");
                    }
                    if (num2 == null) {
                        b2.add(com.mbridge.msdk.foundation.same.report.h.b);
                    }
                    b = com.moloco.sdk.internal.e0.b(str2, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.z.c, sub.d(new Pair("missing_fields", CollectionsKt.f0(kotlin.collections.a.a(b2), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62))));
                    if (b != null) {
                        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h) a0Var5.c.invoke(a)).a(((xd5) a0Var5.a.invoke(new Long(j2))).a, new com.facebook.login.i(a0Var5, c0Var3, a));
                        return Unit.a;
                    }
                    MolocoLogger.INSTANCE.error("AdLoad", "Adaptive banner bid response missing required dimension fields: " + ((String) b.c.get("missing_fields")), null, true);
                    com.moloco.sdk.internal.ortb.model.y a4 = a0.a(a0Var5.m);
                    if (a4 != null && (a0Var2 = a4.d) != null) {
                        hVar = a0Var2.d;
                    }
                    c0Var3.a(b, hVar);
                    return Unit.a;
                }
            }
            b = null;
            if (b != null) {
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = this.s;
            c0 c0Var4 = this.r;
            a0 a0Var6 = (a0) this.u;
            y6a.M(obj);
            c0Var2 = c0Var4;
            j = j3;
            a0Var = a0Var6;
            R = obj;
        }
        com.moloco.sdk.internal.l0 l0Var = (com.moloco.sdk.internal.l0) R;
        if (!(l0Var instanceof com.moloco.sdk.internal.k0)) {
            if (!(l0Var instanceof com.moloco.sdk.internal.j0)) {
                zzl.b();
                return null;
            }
            Object obj2 = ((com.moloco.sdk.internal.j0) l0Var).a;
            com.moloco.sdk.internal.ortb.c cVar = (com.moloco.sdk.internal.ortb.c) obj2;
            a0Var.getClass();
            if (cVar instanceof com.moloco.sdk.internal.ortb.a) {
                zVar = com.moloco.sdk.internal.z.b;
            } else {
                if (!(cVar instanceof com.moloco.sdk.internal.ortb.b)) {
                    zzl.b();
                    return null;
                }
                zVar = com.moloco.sdk.internal.z.c;
            }
            com.moloco.sdk.internal.ortb.a aVar = obj2 instanceof com.moloco.sdk.internal.ortb.a ? (com.moloco.sdk.internal.ortb.a) obj2 : null;
            Exception exc = aVar != null ? aVar.a : null;
            com.moloco.sdk.internal.ortb.b bVar = obj2 instanceof com.moloco.sdk.internal.ortb.b ? (com.moloco.sdk.internal.ortb.b) obj2 : null;
            List list = bVar != null ? bVar.a : null;
            if (list != null) {
                List list2 = !list.isEmpty() ? list : null;
                if (list2 != null) {
                    str = CollectionsKt.f0(list2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, " missingFields=", null, null, 60);
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdLoad", "startLoadJob failed to parse BID json string. subType=" + zVar + str, exc, false, 8, null);
                    if (list != null) {
                        List list3 = !list.isEmpty() ? list : null;
                        if (list3 != null) {
                            map = wv8.o("missing_fields", CollectionsKt.f0(list3, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                        }
                    }
                    map = lm5.a;
                    map.getClass();
                    c0Var2.a(com.moloco.sdk.internal.e0.b(a0Var.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, zVar, map), null);
                    return Unit.a;
                }
            }
            str = "";
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdLoad", "startLoadJob failed to parse BID json string. subType=" + zVar + str, exc, false, 8, null);
            if (list != null) {
            }
            map = lm5.a;
            map.getClass();
            c0Var2.a(com.moloco.sdk.internal.e0.b(a0Var.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, zVar, map), null);
            return Unit.a;
        }
        com.moloco.sdk.internal.ortb.model.c0 c0Var5 = (com.moloco.sdk.internal.ortb.model.c0) ((com.moloco.sdk.internal.k0) l0Var).a;
        a0Var.m = c0Var5;
        MolocoAd createAdInfo$default = MolocoAdKt.createAdInfo$default(a0Var.b, null, null, 6, null);
        com.moloco.sdk.internal.ortb.model.y a5 = a0.a(a0Var.m);
        c0Var2.b(createAdInfo$default, j, (a5 == null || (a0Var4 = a5.d) == null) ? null : a0Var4.d);
        c0Var = c0Var5;
        if (c0Var == null) {
        }
        if (a != null) {
        }
    }
}
