package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ks4 implements oug {
    public final /* synthetic */ ls4 a;

    public ks4(ls4 ls4Var) {
        this.a = ls4Var;
    }

    @Override // defpackage.oug
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        ls4 ls4Var = this.a;
        float floatValue = ((Number) ls4Var.a.invoke(Float.valueOf(f))).floatValue();
        ((eoh) ls4Var.e).setValue(Boolean.valueOf(floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ((eoh) ls4Var.f).setValue(Boolean.valueOf(floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        return floatValue;
    }
}
