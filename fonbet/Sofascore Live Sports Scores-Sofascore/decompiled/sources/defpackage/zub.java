package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zub extends ug5 {
    public final float m;

    public zub(float f) {
        this.m = f - 0.001f;
    }

    @Override // defpackage.ug5
    public final void o(float f, float f2, float f3, sbh sbhVar) {
        double d = this.m;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(sqrt, 2.0d));
        sbhVar.e(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        sbhVar.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        sbhVar.c(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}
