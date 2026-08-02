package yd;

import Ld.C3577d;
import Ld.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zd.C11104f;

/* loaded from: classes.dex */
public final class f implements y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f106566a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Md.a f106567b;

    public static final class a {
        public static f a(@NotNull Class klass) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            Md.b bVar = new Md.b();
            C10885c.b(klass, bVar);
            Md.a k11 = bVar.k();
            if (k11 == null) {
                return null;
            }
            return new f(klass, k11);
        }
    }

    private f() {
        throw null;
    }

    public f(Class cls, Md.a aVar) {
        this.f106566a = cls;
        this.f106567b = aVar;
    }

    @Override // Ld.y
    @NotNull
    public final Md.a a() {
        return this.f106567b;
    }

    @Override // Ld.y
    @NotNull
    public final Sd.b b() {
        return C11104f.a(this.f106566a);
    }

    @Override // Ld.y
    public final void c(@NotNull C3577d visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        C10885c.e(this.f106566a, visitor);
    }

    @Override // Ld.y
    public final void d(@NotNull y.c visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        C10885c.b(this.f106566a, visitor);
    }

    @NotNull
    public final Class<?> e() {
        return this.f106566a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Intrinsics.d(this.f106566a, ((f) obj).f106566a);
        }
        return false;
    }

    @Override // Ld.y
    @NotNull
    public final String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f106566a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(kotlin.text.h.Y(name, '.', '/'));
        sb2.append(".class");
        return sb2.toString();
    }

    public final int hashCode() {
        return this.f106566a.hashCode();
    }

    @NotNull
    public final String toString() {
        return f.class.getName() + ": " + this.f106566a;
    }
}
