package le;

import B3.D;
import Bd.InterfaceC2627a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.InterfaceC9845k;

/* loaded from: classes10.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull h kind, @NotNull String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
    }

    @Override // le.g, ce.l
    @NotNull
    public final Set<Sd.f> a() {
        throw new IllegalStateException();
    }

    @Override // le.g, ce.l
    public final /* bridge */ /* synthetic */ Collection b(Sd.f fVar, Bd.c cVar) {
        b(fVar, cVar);
        throw null;
    }

    @Override // le.g, ce.l
    @NotNull
    public final Set<Sd.f> c() {
        throw new IllegalStateException();
    }

    @Override // le.g, ce.o
    @NotNull
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // le.g, ce.o
    @NotNull
    public final Collection<InterfaceC9845k> e(@NotNull ce.d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // le.g, ce.l
    @NotNull
    public final Set<Sd.f> f() {
        throw new IllegalStateException();
    }

    @Override // le.g, ce.l
    public final /* bridge */ /* synthetic */ Collection g(Sd.f fVar, InterfaceC2627a interfaceC2627a) {
        g(fVar, (Bd.c) interfaceC2627a);
        throw null;
    }

    @Override // le.g
    @NotNull
    /* renamed from: h */
    public final Set g(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // le.g
    @NotNull
    /* renamed from: i */
    public final Set b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // le.g
    @NotNull
    public final String toString() {
        return D.c(new StringBuilder("ThrowingScope{"), j(), '}');
    }
}
