package di;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Q0 implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f45320a;

    /* renamed from: b, reason: collision with root package name */
    public final bi.e f45321b;

    public Q0(String serialName, bi.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f45320a = serialName;
        this.f45321b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor " + h() + " does not have elements");
    }

    @Override // bi.f
    public boolean b() {
        return super.b();
    }

    @Override // bi.f
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // bi.f
    public int d() {
        return 0;
    }

    @Override // bi.f
    public String e(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return Intrinsics.areEqual(h(), q02.h()) && Intrinsics.areEqual(getKind(), q02.getKind());
    }

    @Override // bi.f
    public List f(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // bi.f
    public bi.f g(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // bi.f
    public List getAnnotations() {
        return super.getAnnotations();
    }

    @Override // bi.f
    public String h() {
        return this.f45320a;
    }

    public int hashCode() {
        return h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // bi.f
    public boolean i(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // bi.f
    public boolean isInline() {
        return super.isInline();
    }

    @Override // bi.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public bi.e getKind() {
        return this.f45321b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + h() + ')';
    }
}
