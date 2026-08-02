package jc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f18426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18427b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18428c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18429d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18430e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18431f;

    public /* synthetic */ c(int i5, int i10, int i11, int i12) {
        this(i5, i10, (i12 & 4) != 0 ? 0 : i11, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18426a == cVar.f18426a && this.f18427b == cVar.f18427b && this.f18428c == cVar.f18428c && this.f18429d == cVar.f18429d && this.f18430e == cVar.f18430e && this.f18431f == cVar.f18431f;
    }

    public final int hashCode() {
        return (((((((((this.f18426a * 31) + this.f18427b) * 31) + this.f18428c) * 31) + (this.f18429d ? 1231 : 1237)) * 31) + (this.f18430e ? 1231 : 1237)) * 31) + this.f18431f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FaqModel(title=");
        sb2.append(this.f18426a);
        sb2.append(", name=");
        sb2.append(this.f18427b);
        sb2.append(", description=");
        sb2.append(this.f18428c);
        sb2.append(", isOpen=");
        sb2.append(this.f18429d);
        sb2.append(", italicExist=");
        sb2.append(this.f18430e);
        sb2.append(", italicDescription=");
        return d9.e.i(sb2, this.f18431f, ')');
    }

    public c(int i5, int i10, int i11, int i12, boolean z5) {
        this.f18426a = i5;
        this.f18427b = i10;
        this.f18428c = i11;
        this.f18429d = false;
        this.f18430e = z5;
        this.f18431f = i12;
    }
}
