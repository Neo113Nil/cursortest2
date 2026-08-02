package hb;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f10484a;

    /* renamed from: b, reason: collision with root package name */
    public int f10485b;

    /* renamed from: c, reason: collision with root package name */
    public int f10486c;

    /* renamed from: d, reason: collision with root package name */
    public int f10487d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f10484a == iVar.f10484a && this.f10485b == iVar.f10485b && this.f10486c == iVar.f10486c && this.f10487d == iVar.f10487d;
    }

    public final int hashCode() {
        return (((((this.f10484a * 31) + this.f10485b) * 31) + this.f10486c) * 31) + this.f10487d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushMetricsData(autoGenerateId=");
        sb2.append(this.f10484a);
        sb2.append(", id=");
        sb2.append(this.f10485b);
        sb2.append(", type=");
        sb2.append(this.f10486c);
        sb2.append(", createdAt=");
        return d9.e.i(sb2, this.f10487d, ')');
    }
}
