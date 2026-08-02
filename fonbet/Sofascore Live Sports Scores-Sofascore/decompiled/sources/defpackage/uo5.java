package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class uo5 {
    public static final q4k a = new q4k(s84.m, s84.n);
    public static final g0i b = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
    public static final g0i c;
    public static final g0i d;

    static {
        s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
        Map map = hwk.a;
        c = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new r6a(4294967297L), 1);
        d = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new c7a(4294967297L), 1);
    }

    public static zo5 a() {
        Map map = hwk.a;
        int i = 1;
        g0i e0 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new c7a(4294967297L), 1);
        kv1 kv1Var = uxf.q;
        return b(kv1Var.equals(uxf.o) ? uxf.f : kv1Var.equals(kv1Var) ? uxf.h : uxf.g, e0, new tyd(i, 14));
    }

    public static final zo5 b(io ioVar, j38 j38Var, Function1 function1) {
        return new zo5(new bxj((zm6) null, (alh) null, new in2(ioVar, j38Var, function1), (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
    }

    public static zo5 c(i4k i4kVar, Function1 function1, int i) {
        mv1 mv1Var = uxf.d;
        j38 j38Var = i4kVar;
        if ((i & 1) != 0) {
            Map map = hwk.a;
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new c7a(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            mv1Var = uxf.k;
        }
        if ((i & 8) != 0) {
            function1 = s84.p;
        }
        return b(mv1Var, j38Var, function1);
    }

    public static zo5 d(j38 j38Var, lv1 lv1Var, int i) {
        lv1 lv1Var2 = uxf.n;
        int i2 = 1;
        if ((i & 1) != 0) {
            Map map = hwk.a;
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new c7a(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            lv1Var = lv1Var2;
        }
        return b(Intrinsics.c(lv1Var, uxf.l) ? uxf.d : Intrinsics.c(lv1Var, lv1Var2) ? uxf.j : uxf.g, j38Var, new tyd(i2, 15));
    }

    public static zo5 e(j38 j38Var, int i) {
        if ((i & 1) != 0) {
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
        }
        return new zo5(new bxj(new zm6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j38Var), (alh) null, (in2) null, (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
    }

    public static of6 f(j38 j38Var, int i) {
        if ((i & 1) != 0) {
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
        }
        return new of6(new bxj(new zm6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j38Var), (alh) null, (in2) null, (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
    }

    public static zo5 g(i4k i4kVar, float f, int i) {
        j38 j38Var = i4kVar;
        if ((i & 1) != 0) {
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
        }
        return new zo5(new bxj((zm6) null, (alh) null, (in2) null, new krg(f, xvj.b, j38Var), (LinkedHashMap) null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
    }

    public static of6 h(i4k i4kVar, float f, int i) {
        j38 j38Var = i4kVar;
        if ((i & 1) != 0) {
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
        }
        return new of6(new bxj((zm6) null, (alh) null, (in2) null, new krg(f, xvj.b, j38Var), (LinkedHashMap) null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
    }

    public static of6 i() {
        Map map = hwk.a;
        int i = 1;
        g0i e0 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new c7a(4294967297L), 1);
        kv1 kv1Var = uxf.q;
        return j(kv1Var.equals(uxf.o) ? uxf.f : kv1Var.equals(kv1Var) ? uxf.h : uxf.g, e0, new tyd(i, 16));
    }

    public static final of6 j(io ioVar, j38 j38Var, Function1 function1) {
        return new of6(new bxj((zm6) null, (alh) null, new in2(ioVar, j38Var, function1), (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
    }

    public static of6 k(i4k i4kVar, Function1 function1, int i) {
        mv1 mv1Var = uxf.d;
        j38 j38Var = i4kVar;
        if ((i & 1) != 0) {
            Map map = hwk.a;
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new c7a(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            mv1Var = uxf.k;
        }
        if ((i & 8) != 0) {
            function1 = s84.q;
        }
        return j(mv1Var, j38Var, function1);
    }

    public static of6 l(j38 j38Var, lv1 lv1Var, int i) {
        lv1 lv1Var2 = uxf.n;
        int i2 = 1;
        if ((i & 1) != 0) {
            Map map = hwk.a;
            j38Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new c7a(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            lv1Var = lv1Var2;
        }
        return j(Intrinsics.c(lv1Var, uxf.l) ? uxf.d : Intrinsics.c(lv1Var, lv1Var2) ? uxf.j : uxf.g, j38Var, new tyd(i2, 17));
    }

    public static final zo5 m(j38 j38Var, Function1 function1) {
        return new zo5(new bxj((zm6) null, new alh(j38Var, new se2(1, function1)), (in2) null, (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
    }

    public static final zo5 n(j38 j38Var, Function1 function1) {
        return new zo5(new bxj((zm6) null, new alh(j38Var, new se2(2, function1)), (in2) null, (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
    }

    public static final of6 o(j38 j38Var, Function1 function1) {
        return new of6(new bxj((zm6) null, new alh(j38Var, new se2(3, function1)), (in2) null, (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
    }

    public static final of6 p(j38 j38Var, Function1 function1) {
        return new of6(new bxj((zm6) null, new alh(j38Var, new se2(4, function1)), (in2) null, (krg) null, (LinkedHashMap) null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
    }
}
