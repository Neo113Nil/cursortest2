package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e9i {
    public final float a;

    public e9i(float f) {
        this.a = f;
    }

    public final float a(int i, int i2) {
        float f = i;
        float f2 = this.a;
        if (f2 < f) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f2 >= i + i2) {
            return 1.0f;
        }
        return vsh.a.c((f2 - f) / i2);
    }
}
