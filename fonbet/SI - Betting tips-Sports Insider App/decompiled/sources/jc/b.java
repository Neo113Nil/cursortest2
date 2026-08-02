package jc;

import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f18421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18422b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18423c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18424d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18425e;

    public b(int i5, int i10, int i11, int i12, int i13) {
        this.f18421a = i5;
        this.f18422b = i10;
        this.f18423c = i11;
        this.f18424d = i12;
        this.f18425e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18421a == bVar.f18421a && this.f18422b == bVar.f18422b && this.f18423c == bVar.f18423c && this.f18424d == bVar.f18424d && this.f18425e == bVar.f18425e;
    }

    public final int hashCode() {
        return ((((((((this.f18421a * 31) + this.f18422b) * 31) + this.f18423c) * 31) + this.f18424d) * 31) + this.f18425e) * 961;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FaqIconParamRg(resIcon=");
        sb2.append(this.f18421a);
        sb2.append(", layout_width=");
        sb2.append(this.f18422b);
        sb2.append(", layout_height=");
        sb2.append(this.f18423c);
        sb2.append(", marginStart=");
        sb2.append(this.f18424d);
        sb2.append(", marginEnd=");
        return k.n(sb2, this.f18425e, ", marginTop=0, marginBottom=0)");
    }
}
