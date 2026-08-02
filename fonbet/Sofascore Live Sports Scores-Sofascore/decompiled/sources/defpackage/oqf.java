package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oqf {
    public static final oqf e = new oqf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public oqf(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static oqf b(oqf oqfVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = oqfVar.a;
        }
        float f4 = oqfVar.b;
        if ((i & 4) != 0) {
            f2 = oqfVar.c;
        }
        if ((i & 8) != 0) {
            f3 = oqfVar.d;
        }
        return new oqf(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat >= this.a) & (intBitsToFloat < this.c) & (intBitsToFloat2 >= this.b) & (intBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        return (Float.floatToRawIntBits(wt3.e(f, f2, 2.0f, f2)) << 32) | (Float.floatToRawIntBits(this.d) & 4294967295L);
    }

    public final long d() {
        float f = this.c;
        float f2 = this.a;
        float e2 = wt3.e(f, f2, 2.0f, f2);
        float f3 = this.b;
        float e3 = wt3.e(this.d, f3, 2.0f, f3);
        return (Float.floatToRawIntBits(e2) << 32) | (Float.floatToRawIntBits(e3) & 4294967295L);
    }

    public final long e() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqf)) {
            return false;
        }
        oqf oqfVar = (oqf) obj;
        return Float.compare(this.a, oqfVar.a) == 0 && Float.compare(this.b, oqfVar.b) == 0 && Float.compare(this.c, oqfVar.c) == 0 && Float.compare(this.d, oqfVar.d) == 0;
    }

    public final long f() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final oqf g(oqf oqfVar) {
        return new oqf(Math.max(this.a, oqfVar.a), Math.max(this.b, oqfVar.b), Math.min(this.c, oqfVar.c), Math.min(this.d, oqfVar.d));
    }

    public final boolean h() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final boolean i(oqf oqfVar) {
        return (this.a < oqfVar.c) & (oqfVar.a < this.c) & (this.b < oqfVar.d) & (oqfVar.b < this.d);
    }

    public final oqf j(float f, float f2) {
        return new oqf(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final oqf k(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new oqf(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + t62.O(this.a) + ", " + t62.O(this.b) + ", " + t62.O(this.c) + ", " + t62.O(this.d) + ')';
    }
}
