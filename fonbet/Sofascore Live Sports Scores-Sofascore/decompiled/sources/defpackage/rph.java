package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rph implements uah {
    @Override // defpackage.uah
    public final pea a(long j, ema emaVar, kx4 kx4Var) {
        emaVar.getClass();
        kx4Var.getClass();
        b20 a = e20.a();
        float H0 = kx4Var.H0(1.0f);
        float H02 = kx4Var.H0(8.0f);
        a.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, H02);
        a.f(H0, H02);
        a.f(H0, H0);
        int i = (int) (j >> 32);
        a.f(Float.intBitsToFloat(i), H0);
        a.f(Float.intBitsToFloat(i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i2 = (int) (j & 4294967295L);
        a.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        a.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - H02);
        a.f(Float.intBitsToFloat(i) - H0, Float.intBitsToFloat(i2) - H02);
        a.f(Float.intBitsToFloat(i) - H0, Float.intBitsToFloat(i2) - H0);
        a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2) - H0);
        a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2));
        return new cxd(a);
    }
}
