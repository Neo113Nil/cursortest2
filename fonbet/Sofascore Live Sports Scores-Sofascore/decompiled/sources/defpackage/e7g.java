package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e7g {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        uaa.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L);
    }

    public e7g(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7g)) {
            return false;
        }
        e7g e7gVar = (e7g) obj;
        return Float.compare(this.a, e7gVar.a) == 0 && Float.compare(this.b, e7gVar.b) == 0 && Float.compare(this.c, e7gVar.c) == 0 && Float.compare(this.d, e7gVar.d) == 0 && fz8.O(this.e, e7gVar.e) && fz8.O(this.f, e7gVar.f) && fz8.O(this.g, e7gVar.g) && fz8.O(this.h, e7gVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ljg.c(ljg.c(ljg.c(fc6.a(this.d, fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = t62.O(this.a) + ", " + t62.O(this.b) + ", " + t62.O(this.c) + ", " + t62.O(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean O = fz8.O(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!O || !fz8.O(j2, j3) || !fz8.O(j3, j4)) {
            StringBuilder q = wt3.q("RoundRect(rect=", str, ", topLeft=");
            q.append((Object) fz8.c0(j));
            q.append(", topRight=");
            q.append((Object) fz8.c0(j2));
            q.append(", bottomRight=");
            q.append((Object) fz8.c0(j3));
            q.append(", bottomLeft=");
            q.append((Object) fz8.c0(j4));
            q.append(')');
            return q.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder q2 = wt3.q("RoundRect(rect=", str, ", radius=");
            q2.append(t62.O(Float.intBitsToFloat(i)));
            q2.append(')');
            return q2.toString();
        }
        StringBuilder q3 = wt3.q("RoundRect(rect=", str, ", x=");
        q3.append(t62.O(Float.intBitsToFloat(i)));
        q3.append(", y=");
        q3.append(t62.O(Float.intBitsToFloat(i2)));
        q3.append(')');
        return q3.toString();
    }
}
