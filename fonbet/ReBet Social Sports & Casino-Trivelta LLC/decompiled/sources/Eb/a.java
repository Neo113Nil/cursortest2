package Eb;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3027a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3028b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f3027a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f3028b = str2;
    }

    @Override // Eb.f
    public String b() {
        return this.f3027a;
    }

    @Override // Eb.f
    public String c() {
        return this.f3028b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f3027a.equals(fVar.b()) && this.f3028b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3027a.hashCode() ^ 1000003) * 1000003) ^ this.f3028b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f3027a + ", version=" + this.f3028b + "}";
    }
}
