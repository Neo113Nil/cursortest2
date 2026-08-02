package yd;

import Cd.InterfaceC2757s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zd.C11097E;
import zd.u;

/* loaded from: classes.dex */
public final class d implements InterfaceC2757s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ClassLoader f106565a;

    public d(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f106565a = classLoader;
    }

    public final u a(@NotNull InterfaceC2757s.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Sd.b a11 = request.a();
        Sd.c f7 = a11.f();
        String b11 = a11.g().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        String Y11 = kotlin.text.h.Y(b11, '.', '$');
        if (!f7.d()) {
            Y11 = f7.b() + '.' + Y11;
        }
        Class<?> a12 = e.a(this.f106565a, Y11);
        if (a12 != null) {
            return new u(a12);
        }
        return null;
    }

    public final C11097E b(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return new C11097E(fqName);
    }
}
