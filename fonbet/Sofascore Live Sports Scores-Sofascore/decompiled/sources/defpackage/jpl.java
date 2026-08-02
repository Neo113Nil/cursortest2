package defpackage;

import android.view.View;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jpl implements puk {
    @Override // defpackage.puk
    public final void j(View view, float f) {
        float f2;
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (f < -1.0f || f > 1.0f) {
                return;
            }
            float abs = 1.0f - Math.abs(f);
            if (0.85f >= abs) {
                abs = 0.85f;
            }
            float f3 = 1.0f - abs;
            float f4 = (height * f3) / 2.0f;
            float f5 = (width * f3) / 2.0f;
            if (lz.A(view)) {
                f2 = ((f4 / 2.0f) * (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1 : 1)) + (-f5);
            } else {
                float f6 = f4 / 2.0f;
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    r4 = -1;
                }
                f2 = f5 - (f6 * r4);
            }
            view.setTranslationX(f2);
            view.setScaleX(abs);
            view.setScaleY(abs);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
