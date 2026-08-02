package sg;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a1 implements qg.g, k {

    /* renamed from: a, reason: collision with root package name */
    public final qg.g f23606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23607b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f23608c;

    public a1(qg.g original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f23606a = original;
        this.f23607b = original.a() + '?';
        this.f23608c = s0.b(original);
    }

    @Override // qg.g
    public final String a() {
        return this.f23607b;
    }

    @Override // sg.k
    public final Set b() {
        return this.f23608c;
    }

    @Override // qg.g
    public final boolean c() {
        return true;
    }

    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f23606a.d(name);
    }

    @Override // qg.g
    public final a.a e() {
        return this.f23606a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            return Intrinsics.areEqual(this.f23606a, ((a1) obj).f23606a);
        }
        return false;
    }

    @Override // qg.g
    public final int f() {
        return this.f23606a.f();
    }

    @Override // qg.g
    public final String g(int i5) {
        return this.f23606a.g(i5);
    }

    @Override // qg.g
    public final List getAnnotations() {
        return this.f23606a.getAnnotations();
    }

    @Override // qg.g
    public final List h(int i5) {
        return this.f23606a.h(i5);
    }

    public final int hashCode() {
        return this.f23606a.hashCode() * 31;
    }

    @Override // qg.g
    public final qg.g i(int i5) {
        return this.f23606a.i(i5);
    }

    @Override // qg.g
    public final boolean isInline() {
        return this.f23606a.isInline();
    }

    @Override // qg.g
    public final boolean j(int i5) {
        return this.f23606a.j(i5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23606a);
        sb2.append('?');
        return sb2.toString();
    }
}
