package we0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final int f104488a;

    /* renamed from: b, reason: collision with root package name */
    private final int f104489b;

    public x(int i11, int i12) {
        this.f104488a = i11;
        this.f104489b = i12;
    }

    public final int a() {
        return this.f104488a;
    }

    public final int b() {
        return this.f104489b;
    }

    public final int c() {
        return this.f104489b;
    }

    public final int d() {
        return this.f104488a;
    }

    @NotNull
    public final x e() {
        return new x(this.f104488a * 2, this.f104489b * 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f104488a == xVar.f104488a && this.f104489b == xVar.f104489b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104489b) + (Integer.hashCode(this.f104488a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapState(width=");
        sb2.append(this.f104488a);
        sb2.append(", height=");
        return K00.b.e(this.f104489b, ")", sb2);
    }
}
