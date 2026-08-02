package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c8e {
    public final x10 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public c8e(x10 x10Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = x10Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final oqf a(oqf oqfVar) {
        return oqfVar.k((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = pej.b;
            if (pej.c(j, j2)) {
                return j2;
            }
        }
        int i = pej.c;
        int i2 = this.b;
        return t6a.g(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final oqf c(oqf oqfVar) {
        float f = -this.f;
        return oqfVar.k((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return llf.c(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c8e) {
            c8e c8eVar = (c8e) obj;
            if (this.a == c8eVar.a && this.b == c8eVar.b && this.c == c8eVar.c && this.d == c8eVar.d && this.e == c8eVar.e && Float.compare(this.f, c8eVar.f) == 0 && Float.compare(this.g, c8eVar.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + fc6.a(this.f, wv8.a(this.e, wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return wt3.n(sb, this.g, ')');
    }
}
