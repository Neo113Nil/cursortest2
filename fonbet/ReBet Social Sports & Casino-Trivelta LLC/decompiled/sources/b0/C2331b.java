package b0;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2331b implements o {

    /* renamed from: b, reason: collision with root package name */
    public final int f24163b;

    public C2331b(int i10) {
        this.f24163b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2331b) && this.f24163b == ((C2331b) obj).f24163b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f24163b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f24163b + ')';
    }
}
