package wd;

import d9.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f25235a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25236b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25238d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25239e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25240f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25241g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25242h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25243i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f25244k;

    /* renamed from: l, reason: collision with root package name */
    public final int f25245l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f25246m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f25247n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f25248o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f25249p;
    public final String q;

    /* renamed from: r, reason: collision with root package name */
    public final String f25250r;

    public b(String text, int i5, int i10, int i11, int i12, int i13, Boolean bool, Integer num, Integer num2, String str, String str2, int i14) {
        int i15 = (i14 & 2) != 0 ? -1 : 45;
        float f6 = (i14 & 8) != 0 ? 14.0f : 15.0f;
        int i16 = (i14 & 16) != 0 ? 0 : i5;
        int i17 = (i14 & 32) != 0 ? 0 : i10;
        int i18 = (i14 & 64) != 0 ? 0 : i11;
        int i19 = (i14 & 256) != 0 ? 0 : i12;
        int i20 = (i14 & 4096) != 0 ? -16777216 : i13;
        Integer num3 = (i14 & 16384) != 0 ? null : num;
        Integer num4 = (32768 & i14) != 0 ? null : num2;
        boolean z5 = (65536 & i14) == 0;
        String str3 = (131072 & i14) != 0 ? null : str;
        String str4 = (i14 & 262144) == 0 ? str2 : null;
        Intrinsics.checkNotNullParameter(text, "text");
        this.f25235a = text;
        this.f25236b = i15;
        this.f25237c = f6;
        this.f25238d = i16;
        this.f25239e = i17;
        this.f25240f = i18;
        this.f25241g = 0;
        this.f25242h = i19;
        this.f25243i = 0;
        this.j = 0;
        this.f25244k = 0;
        this.f25245l = i20;
        this.f25246m = bool;
        this.f25247n = num3;
        this.f25248o = num4;
        this.f25249p = z5;
        this.q = str3;
        this.f25250r = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f25235a, bVar.f25235a) && this.f25236b == bVar.f25236b && Float.compare(this.f25237c, bVar.f25237c) == 0 && this.f25238d == bVar.f25238d && this.f25239e == bVar.f25239e && this.f25240f == bVar.f25240f && this.f25241g == bVar.f25241g && this.f25242h == bVar.f25242h && this.f25243i == bVar.f25243i && this.j == bVar.j && this.f25244k == bVar.f25244k && this.f25245l == bVar.f25245l && Intrinsics.areEqual(this.f25246m, bVar.f25246m) && Intrinsics.areEqual(this.f25247n, bVar.f25247n) && Intrinsics.areEqual(this.f25248o, bVar.f25248o) && this.f25249p == bVar.f25249p && Intrinsics.areEqual(this.q, bVar.q) && Intrinsics.areEqual(this.f25250r, bVar.f25250r);
    }

    public final int hashCode() {
        int hashCode = (this.f25246m.hashCode() + ((((((((((((((((((((Float.floatToIntBits(this.f25237c) + (((((this.f25235a.hashCode() * 31) + this.f25236b) * 31) - 2) * 31)) * 31) + this.f25238d) * 31) + this.f25239e) * 31) + this.f25240f) * 31) + this.f25241g) * 31) + this.f25242h) * 31) + this.f25243i) * 31) + this.j) * 31) + this.f25244k) * 31) + this.f25245l) * 31)) * 31;
        Integer num = this.f25247n;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f25248o;
        int hashCode3 = (((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + (this.f25249p ? 1231 : 1237)) * 31;
        String str = this.q;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25250r;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Text(text=");
        sb2.append(this.f25235a);
        sb2.append(", w=");
        sb2.append(this.f25236b);
        sb2.append(", h=-2, size=");
        sb2.append(this.f25237c);
        sb2.append(", mStart=");
        sb2.append(this.f25238d);
        sb2.append(", mTop=");
        sb2.append(this.f25239e);
        sb2.append(", mEnd=");
        sb2.append(this.f25240f);
        sb2.append(", mBottom=");
        sb2.append(this.f25241g);
        sb2.append(", pStart=");
        sb2.append(this.f25242h);
        sb2.append(", pTop=");
        sb2.append(this.f25243i);
        sb2.append(", pEnd=");
        sb2.append(this.j);
        sb2.append(", pBottom=");
        sb2.append(this.f25244k);
        sb2.append(", color=");
        sb2.append(this.f25245l);
        sb2.append(", bold=");
        sb2.append(this.f25246m);
        sb2.append(", gravity=");
        sb2.append(this.f25247n);
        sb2.append(", textAlignment=");
        sb2.append(this.f25248o);
        sb2.append(", italic=");
        sb2.append(this.f25249p);
        sb2.append(", border=");
        sb2.append(this.q);
        sb2.append(", link=");
        return e.k(sb2, this.f25250r, ')');
    }
}
