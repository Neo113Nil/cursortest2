package sg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g0 implements qg.g {

    /* renamed from: a, reason: collision with root package name */
    public final qg.g f23632a;

    /* renamed from: b, reason: collision with root package name */
    public final qg.g f23633b;

    public g0(qg.g keyDesc, qg.g valueDesc) {
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.f23632a = keyDesc;
        this.f23633b = valueDesc;
    }

    @Override // qg.g
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // qg.g
    public final boolean c() {
        return false;
    }

    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(r4.k.l(name, " is not a valid map index"));
    }

    @Override // qg.g
    public final a.a e() {
        return qg.k.f22180g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual("kotlin.collections.LinkedHashMap", "kotlin.collections.LinkedHashMap") && Intrinsics.areEqual(this.f23632a, g0Var.f23632a) && Intrinsics.areEqual(this.f23633b, g0Var.f23633b);
    }

    @Override // qg.g
    public final int f() {
        return 2;
    }

    @Override // qg.g
    public final String g(int i5) {
        return String.valueOf(i5);
    }

    @Override // qg.g
    public final List getAnnotations() {
        return kotlin.collections.e0.f19204a;
    }

    @Override // qg.g
    public final List h(int i5) {
        if (i5 >= 0) {
            return kotlin.collections.e0.f19204a;
        }
        throw new IllegalArgumentException(d9.e.f(i5, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f23633b.hashCode() + ((this.f23632a.hashCode() + 710441009) * 31);
    }

    @Override // qg.g
    public final qg.g i(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(d9.e.f(i5, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i10 = i5 % 2;
        if (i10 == 0) {
            return this.f23632a;
        }
        if (i10 == 1) {
            return this.f23633b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // qg.g
    public final boolean isInline() {
        return false;
    }

    @Override // qg.g
    public final boolean j(int i5) {
        if (i5 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(d9.e.f(i5, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f23632a + ", " + this.f23633b + ')';
    }
}
