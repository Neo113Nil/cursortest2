package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kyh {
    public static final kyh c = new kyh("expandContainers", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final kyh d;
    public final String a;
    public final float b;

    static {
        bea.I(0.5f);
        d = new kyh("hinge", -1.0f);
    }

    public kyh(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kyh)) {
            return false;
        }
        kyh kyhVar = (kyh) obj;
        return this.b == kyhVar.b && this.a.equals(kyhVar.a);
    }

    public final int hashCode() {
        return (Float.hashCode(this.b) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
