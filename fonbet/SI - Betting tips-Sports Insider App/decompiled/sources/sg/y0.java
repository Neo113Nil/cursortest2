package sg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y0 implements qg.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f23719a;

    /* renamed from: b, reason: collision with root package name */
    public final qg.f f23720b;

    public y0(String serialName, qg.f kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f23719a = serialName;
        this.f23720b = kind;
    }

    @Override // qg.g
    public final String a() {
        return this.f23719a;
    }

    public final void b() {
        throw new IllegalStateException(d9.e.l(new StringBuilder("Primitive descriptor "), this.f23719a, " does not have elements"));
    }

    @Override // qg.g
    public final boolean c() {
        return false;
    }

    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        b();
        throw null;
    }

    @Override // qg.g
    public final a.a e() {
        return this.f23720b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.areEqual(this.f23719a, y0Var.f23719a) && Intrinsics.areEqual(this.f23720b, y0Var.f23720b);
    }

    @Override // qg.g
    public final int f() {
        return 0;
    }

    @Override // qg.g
    public final String g(int i5) {
        b();
        throw null;
    }

    @Override // qg.g
    public final List getAnnotations() {
        return kotlin.collections.e0.f19204a;
    }

    @Override // qg.g
    public final List h(int i5) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.f23720b.hashCode() * 31) + this.f23719a.hashCode();
    }

    @Override // qg.g
    public final qg.g i(int i5) {
        b();
        throw null;
    }

    @Override // qg.g
    public final boolean isInline() {
        return false;
    }

    @Override // qg.g
    public final boolean j(int i5) {
        b();
        throw null;
    }

    public final String toString() {
        return d9.e.k(new StringBuilder("PrimitiveDescriptor("), this.f23719a, ')');
    }
}
