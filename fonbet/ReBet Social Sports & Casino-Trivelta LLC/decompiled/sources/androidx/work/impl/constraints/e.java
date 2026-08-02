package androidx.work.impl.constraints;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23877a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23878b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23879c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23880d;

    public e(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f23877a = z10;
        this.f23878b = z11;
        this.f23879c = z12;
        this.f23880d = z13;
    }

    public final boolean a() {
        return this.f23877a;
    }

    public final boolean b() {
        return this.f23879c;
    }

    public final boolean c() {
        return this.f23880d;
    }

    public final boolean d() {
        return this.f23878b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f23877a == eVar.f23877a && this.f23878b == eVar.f23878b && this.f23879c == eVar.f23879c && this.f23880d == eVar.f23880d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f23877a) * 31) + Boolean.hashCode(this.f23878b)) * 31) + Boolean.hashCode(this.f23879c)) * 31) + Boolean.hashCode(this.f23880d);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f23877a + ", isValidated=" + this.f23878b + ", isMetered=" + this.f23879c + ", isNotRoaming=" + this.f23880d + ')';
    }
}
