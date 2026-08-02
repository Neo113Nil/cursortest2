package ce;

import Bd.InterfaceC2627a;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.c0;

/* renamed from: ce.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5814a implements l {
    @Override // ce.l
    @NotNull
    public final Set<Sd.f> a() {
        return i().a();
    }

    @Override // ce.l
    @NotNull
    public Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().b(name, location);
    }

    @Override // ce.l
    @NotNull
    public final Set<Sd.f> c() {
        return i().c();
    }

    @Override // ce.o
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().d(name, location);
    }

    @Override // ce.o
    @NotNull
    public Collection<InterfaceC9845k> e(@NotNull d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return i().e(kindFilter, nameFilter);
    }

    @Override // ce.l
    public final Set<Sd.f> f() {
        return i().f();
    }

    @Override // ce.l
    @NotNull
    public Collection<c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().g(name, location);
    }

    @NotNull
    public final l h() {
        if (!(i() instanceof AbstractC5814a)) {
            return i();
        }
        l i11 = i();
        Intrinsics.g(i11, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC5814a) i11).h();
    }

    @NotNull
    protected abstract l i();
}
