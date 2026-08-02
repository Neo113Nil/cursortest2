package sb;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23401b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23402c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23403d;

    public a(int i5, int i10, int i11, int i12) {
        this.f23400a = i5;
        this.f23401b = i10;
        this.f23402c = i11;
        this.f23403d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23400a == aVar.f23400a && this.f23401b == aVar.f23401b && this.f23402c == aVar.f23402c && this.f23403d == aVar.f23403d;
    }

    public final int hashCode() {
        return (((((this.f23400a * 31) + this.f23401b) * 31) + this.f23402c) * 31) + this.f23403d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveSubs(timeEndLive=");
        sb2.append(this.f23400a);
        sb2.append(", timeEndPremium=");
        sb2.append(this.f23401b);
        sb2.append(", timeEndExpress=");
        sb2.append(this.f23402c);
        sb2.append(", timeEndDiamond=");
        return d9.e.i(sb2, this.f23403d, ')');
    }
}
