package dd;

/* renamed from: dd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4054a {

    /* renamed from: a, reason: collision with root package name */
    public final int f45169a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45170b;

    public C4054a(int i10, boolean z10) {
        this.f45169a = i10;
        this.f45170b = z10;
    }

    public final int a() {
        return this.f45169a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4054a)) {
            return false;
        }
        C4054a c4054a = (C4054a) obj;
        return this.f45169a == c4054a.f45169a && this.f45170b == c4054a.f45170b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f45169a) * 31) + Boolean.hashCode(this.f45170b);
    }

    public String toString() {
        return "CacheKey(fontSize=" + this.f45169a + ", isTitleEmpty=" + this.f45170b + ")";
    }
}
