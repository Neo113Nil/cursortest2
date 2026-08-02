package Eh;

/* loaded from: classes3.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3101c;

    public a(boolean z10) {
        this.f3101c = z10;
    }

    @Override // Eh.e
    public boolean c() {
        return this.f3101c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof e) && this.f3101c == ((e) obj).c();
    }

    public int hashCode() {
        return (this.f3101c ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return "TracerConfig{enabled=" + this.f3101c + "}";
    }
}
