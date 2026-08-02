package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lz2 implements mz2 {
    public final float a;

    public lz2(float f) {
        this.a = f;
    }

    public final Comparable a() {
        return Float.valueOf(this.a);
    }

    public final boolean b() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lz2) {
            return (b() && ((lz2) obj).b()) || this.a == ((lz2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return Float.hashCode(this.a) + (Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 31);
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
