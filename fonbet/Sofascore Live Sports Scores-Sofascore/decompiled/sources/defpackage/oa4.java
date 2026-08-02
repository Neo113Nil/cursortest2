package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oa4 extends hz8 {
    @Override // defpackage.hz8
    public final void J(sbh sbhVar, float f, float f2) {
        float f3 = f2 * f;
        sbhVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 180.0f, 90.0f);
        double d = f3;
        sbhVar.c((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
