package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v6f implements x6f {
    public final int a;
    public final long b;
    public final long c;

    public v6f(int i, long j, int i2) {
        j = (i2 & 2) != 0 ? r13.i : j;
        long j2 = r13.i;
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6f)) {
            return false;
        }
        v6f v6fVar = (v6f) obj;
        if (this.a != v6fVar.a) {
            return false;
        }
        long j = v6fVar.b;
        int i = r13.j;
        return e8k.a(this.b, j) && e8k.a(this.c, v6fVar.c) && p75.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + ljg.c(ljg.c(hashCode, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String i = r13.i(this.b);
        return fc6.o(dmi.t(this.a, "Image(iconResourceId=", ", iconColor=", i, ", fillColor="), r13.i(this.c), ", iconInnerPadding=", p75.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ")");
    }
}
