package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z78 extends oja {
    @Override // defpackage.o41
    public final Object f(nja njaVar, float f) {
        return Float.valueOf(m(njaVar, f));
    }

    public final float l() {
        return m(this.c.i(), c());
    }

    public final float m(nja njaVar, float f) {
        float f2;
        Object obj = njaVar.b;
        Object obj2 = njaVar.b;
        if (obj == null || njaVar.c == null) {
            a70.r("Missing values for keyframe.");
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        wj9 wj9Var = this.e;
        if (wj9Var != null) {
            f2 = f;
            Float f3 = (Float) wj9Var.C(njaVar.g, njaVar.h.floatValue(), (Float) obj2, (Float) njaVar.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float f4 = njaVar.i;
        if (f4 == -3987645.8f) {
            f4 = ((Float) obj2).floatValue();
            njaVar.i = f4;
        }
        float f5 = njaVar.j;
        if (f5 == -3987645.8f) {
            f5 = ((Float) njaVar.c).floatValue();
            njaVar.j = f5;
        }
        return pkc.f(f4, f5, f2);
    }
}
