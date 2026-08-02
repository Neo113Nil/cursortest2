package i3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10908a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10909b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10910c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10911d;

    public f(boolean z5, boolean z7, boolean z10, boolean z11) {
        this.f10908a = z5;
        this.f10909b = z7;
        this.f10910c = z10;
        this.f10911d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f10908a == fVar.f10908a && this.f10909b == fVar.f10909b && this.f10910c == fVar.f10910c && this.f10911d == fVar.f10911d;
    }

    public final int hashCode() {
        return ((((((this.f10908a ? 1231 : 1237) * 31) + (this.f10909b ? 1231 : 1237)) * 31) + (this.f10910c ? 1231 : 1237)) * 31) + (this.f10911d ? 1231 : 1237);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f10908a + ", isValidated=" + this.f10909b + ", isMetered=" + this.f10910c + ", isNotRoaming=" + this.f10911d + ')';
    }
}
