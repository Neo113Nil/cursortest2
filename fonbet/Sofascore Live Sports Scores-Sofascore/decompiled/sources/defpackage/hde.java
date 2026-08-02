package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hde implements vt3 {
    public final float a;

    public hde(float f) {
        this.a = f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 100.0f) {
            u3a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.vt3
    public final float a(long j, kx4 kx4Var) {
        return (this.a / 100.0f) * njh.e(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hde) && Float.compare(this.a, ((hde) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
