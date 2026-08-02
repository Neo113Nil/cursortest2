package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fd2 extends dd2 {
    public float e;

    public fd2(float f) {
        super(null);
        this.e = f;
    }

    @Override // defpackage.dd2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fd2) {
            float m = m();
            float m2 = ((fd2) obj).m();
            if ((Float.isNaN(m) && Float.isNaN(m2)) || m == m2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dd2
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f = this.e;
        return hashCode + (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0);
    }

    @Override // defpackage.dd2
    public final float m() {
        char[] cArr;
        if (Float.isNaN(this.e) && (cArr = this.a) != null && cArr.length >= 1) {
            this.e = Float.parseFloat(e());
        }
        return this.e;
    }

    @Override // defpackage.dd2
    public final int n() {
        char[] cArr;
        if (Float.isNaN(this.e) && (cArr = this.a) != null && cArr.length >= 1) {
            this.e = Integer.parseInt(e());
        }
        return (int) this.e;
    }
}
