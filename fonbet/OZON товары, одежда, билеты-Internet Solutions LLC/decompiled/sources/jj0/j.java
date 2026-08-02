package jj0;

import gj0.InterfaceC6744a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j implements ij0.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nl.a f70160a;

    public j(@NotNull Nl.a configurationRepositoryProvider) {
        Intrinsics.checkNotNullParameter(configurationRepositoryProvider, "configurationRepositoryProvider");
        this.f70160a = configurationRepositoryProvider;
    }

    @Override // ij0.f
    public final Object a(@NotNull fj0.d<?> dVar, @NotNull kotlin.coroutines.d<? super Unit> dVar2) {
        Object f7;
        InterfaceC6744a a11 = this.f70160a.a();
        Object a12 = dVar.a();
        if (!(a12 instanceof Integer)) {
            return ((a12 instanceof Boolean) && (f7 = a11.f(dVar.getKey(), ((Boolean) a12).booleanValue(), (kotlin.coroutines.jvm.internal.c) dVar2)) == Wc.a.COROUTINE_SUSPENDED) ? f7 : Unit.f71690a;
        }
        Object c11 = a11.c(((Number) a12).intValue(), dVar.getKey(), (kotlin.coroutines.jvm.internal.c) dVar2);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }
}
