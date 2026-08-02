package defpackage;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r0k extends ug5 {
    public final float m;

    public r0k(Context context) {
        context.getClass();
        this.m = ao2.s(8, context);
    }

    @Override // defpackage.ug5
    public final void o(float f, float f2, float f3, sbh sbhVar) {
        float f4 = this.m;
        float f5 = (-2.0f) * f4;
        float f6 = 2.0f * f4;
        sbhVar.c(f2 - f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f7 = 1.5f * f4;
        float f8 = f6 + f5;
        float f9 = 0.75f * f4;
        float f10 = f7 + f5;
        sbhVar.d(f2 - f7, f8, f2 - f9, f10);
        float f11 = 0.3f * f4;
        float f12 = (1.2f * f4) + f5;
        sbhVar.c(f2 - f11, f12);
        sbhVar.d(f2, (f4 * 1.0f) + f5, f11 + f2, f12);
        sbhVar.c(f9 + f2, f10);
        sbhVar.d(f7 + f2, f8, f6 + f2, f8);
    }
}
