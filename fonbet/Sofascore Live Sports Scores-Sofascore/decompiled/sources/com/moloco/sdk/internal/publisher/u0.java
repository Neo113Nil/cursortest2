package com.moloco.sdk.internal.publisher;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.a70;
import defpackage.dmi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.lm5;
import defpackage.lu3;
import defpackage.pdk;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.wv8;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u0 {
    public final com.moloco.sdk.internal.ortb.d a;
    public final com.facebook.b b;

    public u0(com.moloco.sdk.internal.ortb.d dVar, com.facebook.b bVar) {
        dVar.getClass();
        this.a = dVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        t0 t0Var;
        int i;
        String str2;
        if (sq3Var instanceof t0) {
            t0Var = (t0) sq3Var;
            int i2 = t0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t0Var.u = i2 - Integer.MIN_VALUE;
                Object obj = t0Var.s;
                lu3 lu3Var = lu3.a;
                i = t0Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    t0Var.r = str;
                    t0Var.u = 1;
                    obj = xw3.R(z45.a, new pdk(this.b, str, rq3Var, 17), t0Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = t0Var.r;
                    y6a.M(obj);
                }
                str2 = (String) obj;
                if (str2 != null) {
                    return str;
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BidLoader", "Found no pre-preprocessor for the current mediation. Returning the original bid response.", null, false, 12, null);
                return str2;
            }
        }
        t0Var = new t0(this, sq3Var);
        Object obj2 = t0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = t0Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, sq3 sq3Var) {
        r0 r0Var;
        int i;
        String str3;
        if (sq3Var instanceof r0) {
            r0Var = (r0) sq3Var;
            int i2 = r0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.v = i2 - Integer.MIN_VALUE;
                Object obj = r0Var.t;
                lu3 lu3Var = lu3.a;
                i = r0Var.v;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BidLoader", dmi.q("parse() called with bidResponseJson: ", str2), false, 4, null);
                    r0Var.r = this;
                    r0Var.s = str;
                    r0Var.v = 1;
                    obj = a(str2, r0Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = r0Var.s;
                    this = r0Var.r;
                    y6a.M(obj);
                }
                str3 = (String) obj;
                if (str3 != null) {
                    return new com.moloco.sdk.internal.j0(com.moloco.sdk.internal.e0.a(str, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.z.a));
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidLoader", "Processed the bidResponse, proceeding with parsing it.", null, false, 12, null);
                r0Var.r = null;
                r0Var.s = null;
                r0Var.v = 2;
                Object c = this.c(str3, str, r0Var);
                return c == lu3Var ? lu3Var : c;
            }
        }
        r0Var = new r0(this, sq3Var);
        Object obj2 = r0Var.t;
        lu3 lu3Var2 = lu3.a;
        i = r0Var.v;
        if (i != 0) {
        }
        str3 = (String) obj2;
        if (str3 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (r2 != null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, sq3 sq3Var) {
        s0 s0Var;
        int i;
        String str3;
        Object R;
        com.moloco.sdk.internal.l0 l0Var;
        com.moloco.sdk.internal.z zVar;
        String str4;
        Map map;
        u0 u0Var = this;
        if (sq3Var instanceof s0) {
            s0Var = (s0) sq3Var;
            int i2 = s0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0Var.v = i2 - Integer.MIN_VALUE;
                Object obj = s0Var.t;
                lu3 lu3Var = lu3.a;
                i = s0Var.v;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    s0Var.r = u0Var;
                    str3 = str2;
                    s0Var.s = str3;
                    s0Var.v = 1;
                    com.moloco.sdk.internal.ortb.d dVar = u0Var.a;
                    dVar.getClass();
                    hs4 hs4Var = z45.a;
                    R = xw3.R(hq4.c, new pdk(dVar, str, rq3Var, 16), s0Var);
                    if (R == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = s0Var.s;
                    u0 u0Var2 = s0Var.r;
                    y6a.M(obj);
                    str3 = str5;
                    u0Var = u0Var2;
                    R = obj;
                }
                l0Var = (com.moloco.sdk.internal.l0) R;
                if (l0Var instanceof com.moloco.sdk.internal.j0) {
                    if (l0Var instanceof com.moloco.sdk.internal.k0) {
                        return new com.moloco.sdk.internal.k0(((com.moloco.sdk.internal.ortb.model.j) ((com.moloco.sdk.internal.ortb.model.c0) ((com.moloco.sdk.internal.k0) l0Var).a).a.get(0)).a.get(0));
                    }
                    zzl.b();
                    return null;
                }
                Object obj2 = ((com.moloco.sdk.internal.j0) l0Var).a;
                com.moloco.sdk.internal.ortb.c cVar = (com.moloco.sdk.internal.ortb.c) obj2;
                u0Var.getClass();
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
                        str4 = CollectionsKt.f0(list2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, " missingFields=", null, null, 60);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "BidLoader", "parseBidResponse failed to parse BID json string. subType=" + zVar + str4, exc, false, 8, null);
                        MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                        if (list != null) {
                            List list3 = !list.isEmpty() ? list : null;
                            if (list3 != null) {
                                map = wv8.o("missing_fields", CollectionsKt.f0(list3, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                            }
                        }
                        map = lm5.a;
                        map.getClass();
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.internal.e0.b(str3, errorType, zVar, map));
                    }
                }
                str4 = "";
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "BidLoader", "parseBidResponse failed to parse BID json string. subType=" + zVar + str4, exc, false, 8, null);
                MolocoAdError.ErrorType errorType2 = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                if (list != null) {
                }
                map = lm5.a;
                map.getClass();
                return new com.moloco.sdk.internal.j0(com.moloco.sdk.internal.e0.b(str3, errorType2, zVar, map));
            }
        }
        s0Var = new s0(u0Var, sq3Var);
        Object obj3 = s0Var.t;
        lu3 lu3Var2 = lu3.a;
        i = s0Var.v;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        l0Var = (com.moloco.sdk.internal.l0) R;
        if (l0Var instanceof com.moloco.sdk.internal.j0) {
        }
    }
}
