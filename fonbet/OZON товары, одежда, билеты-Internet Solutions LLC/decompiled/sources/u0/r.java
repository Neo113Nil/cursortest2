package u0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f99680a;

    /* renamed from: b, reason: collision with root package name */
    private final int f99681b;

    /* renamed from: c, reason: collision with root package name */
    private final int f99682c;

    /* renamed from: d, reason: collision with root package name */
    private final int f99683d;

    public r(int i11, int i12, int i13, int i14) {
        this.f99680a = i11;
        this.f99681b = i12;
        this.f99682c = i13;
        this.f99683d = i14;
    }

    public final int a() {
        return this.f99683d;
    }

    public final int b() {
        return this.f99680a;
    }

    public final int c() {
        return this.f99682c;
    }

    public final int d() {
        return this.f99681b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f99680a == rVar.f99680a && this.f99681b == rVar.f99681b && this.f99682c == rVar.f99682c && this.f99683d == rVar.f99683d;
    }

    public final int hashCode() {
        return (((((this.f99680a * 31) + this.f99681b) * 31) + this.f99682c) * 31) + this.f99683d;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f99680a);
        sb2.append(", top=");
        sb2.append(this.f99681b);
        sb2.append(", right=");
        sb2.append(this.f99682c);
        sb2.append(", bottom=");
        return Ek.a.d(sb2, this.f99683d, ')');
    }
}
