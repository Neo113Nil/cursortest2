package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kyd {
    public final long a;
    public final t3e b;

    public kyd() {
        long d = hkg.d(4284900966L);
        t3e B = l98.B(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        this.a = d;
        this.b = B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kyd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        kyd kydVar = (kyd) obj;
        long j = kydVar.a;
        int i = r13.j;
        return e8k.a(this.a, j) && this.b.equals(kydVar.b);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        vxd.q(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
