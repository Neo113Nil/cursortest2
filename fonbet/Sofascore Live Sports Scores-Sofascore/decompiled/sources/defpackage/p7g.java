package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p7g extends hz8 {
    @Override // defpackage.hz8
    public final void J(sbh sbhVar, float f, float f2) {
        float f3 = f2 * f;
        sbhVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        nbh nbhVar = new nbh(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f4);
        nbhVar.f = 180.0f;
        nbhVar.g = 90.0f;
        sbhVar.g.add(nbhVar);
        lbh lbhVar = new lbh(nbhVar);
        sbhVar.a(180.0f);
        sbhVar.h.add(lbhVar);
        sbhVar.e = 270.0f;
        float f5 = (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + f4) * 0.5f;
        float f6 = (f4 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 2.0f;
        sbhVar.c = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        sbhVar.d = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
