package di;

import bi.n;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.t0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4115t0 implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public static final C4115t0 f45418a = new C4115t0();

    /* renamed from: b, reason: collision with root package name */
    public static final bi.m f45419b = n.d.f25233a;

    /* renamed from: c, reason: collision with root package name */
    public static final String f45420c = "kotlin.Nothing";

    public final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return this == obj;
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
    public bi.m getKind() {
        return f45419b;
    }

    @Override // bi.f
    public String h() {
        return f45420c;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
