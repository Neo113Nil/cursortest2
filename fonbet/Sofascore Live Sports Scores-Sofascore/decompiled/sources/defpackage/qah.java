package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qah {
    public static final qah d = new qah(hkg.d(4278190080L), 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final long a;
    public final long b;
    public final float c;

    public qah(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qah)) {
            return false;
        }
        qah qahVar = (qah) obj;
        long j = qahVar.a;
        int i = r13.j;
        return e8k.a(this.a, j) && dnd.c(this.b, qahVar.b) && this.c == qahVar.c;
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Float.hashCode(this.c) + ljg.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        vxd.q(this.a, ", offset=", sb);
        sb.append((Object) dnd.k(this.b));
        sb.append(", blurRadius=");
        return wt3.n(sb, this.c, ')');
    }
}
