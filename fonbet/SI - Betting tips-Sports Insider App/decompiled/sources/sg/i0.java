package sg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class i0 implements qg.g {

    /* renamed from: a, reason: collision with root package name */
    public final qg.g f23641a;

    public i0(qg.g gVar) {
        this.f23641a = gVar;
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
        throw new IllegalArgumentException(r4.k.l(name, " is not a valid list index"));
    }

    @Override // qg.g
    public final a.a e() {
        return qg.k.f22179f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f23641a, i0Var.f23641a) && Intrinsics.areEqual(a(), i0Var.a());
    }

    @Override // qg.g
    public final int f() {
        return 1;
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
        StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Illegal index ", ", ");
        r5.append(a());
        r5.append(" expects only non-negative indices");
        throw new IllegalArgumentException(r5.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f23641a.hashCode() * 31);
    }

    @Override // qg.g
    public final qg.g i(int i5) {
        if (i5 >= 0) {
            return this.f23641a;
        }
        StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Illegal index ", ", ");
        r5.append(a());
        r5.append(" expects only non-negative indices");
        throw new IllegalArgumentException(r5.toString().toString());
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
        StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Illegal index ", ", ");
        r5.append(a());
        r5.append(" expects only non-negative indices");
        throw new IllegalArgumentException(r5.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f23641a + ')';
    }
}
