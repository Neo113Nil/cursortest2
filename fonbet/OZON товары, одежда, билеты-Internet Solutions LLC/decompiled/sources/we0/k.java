package we0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final int f104439a;

    /* renamed from: b, reason: collision with root package name */
    private final int f104440b;

    public k(int i11, int i12) {
        this.f104439a = i11;
        this.f104440b = i12;
    }

    public final int a() {
        return this.f104440b;
    }

    public final int b() {
        return this.f104439a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f104439a == kVar.f104439a && this.f104440b == kVar.f104440b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104440b) + (Integer.hashCode(this.f104439a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClusteringOptions(minZoom=");
        sb2.append(this.f104439a);
        sb2.append(", minItems=");
        return K00.b.e(this.f104440b, ")", sb2);
    }
}
