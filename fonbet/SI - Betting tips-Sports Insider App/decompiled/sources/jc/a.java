package jc;

import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18417b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18418c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18420e;

    public a(int i5, int i10, int i11, int i12, int i13) {
        this.f18416a = i5;
        this.f18417b = i10;
        this.f18418c = i11;
        this.f18419d = i12;
        this.f18420e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18416a == aVar.f18416a && this.f18417b == aVar.f18417b && this.f18418c == aVar.f18418c && this.f18419d == aVar.f18419d && this.f18420e == aVar.f18420e;
    }

    public final int hashCode() {
        return ((((((((this.f18416a * 31) + this.f18417b) * 31) + this.f18418c) * 31) + this.f18419d) * 31) + this.f18420e) * 961;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FaqIconParam(resIcon=");
        sb2.append(this.f18416a);
        sb2.append(", layout_width=");
        sb2.append(this.f18417b);
        sb2.append(", layout_height=");
        sb2.append(this.f18418c);
        sb2.append(", marginStart=");
        sb2.append(this.f18419d);
        sb2.append(", marginEnd=");
        return k.n(sb2, this.f18420e, ", marginTop=0, marginBottom=0)");
    }
}
