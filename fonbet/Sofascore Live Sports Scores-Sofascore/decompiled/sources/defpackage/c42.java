package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c42 implements a42 {
    @Override // defpackage.a42
    public final float a(float f, float f2, float f3) {
        float abs = Math.abs((f2 + f) - f);
        boolean z = abs <= f3;
        float f4 = (0.3f * f3) - (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * abs);
        float f5 = f3 - f4;
        if (z && f5 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }
}
