package t0;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0 f98936a = E0.b(0, 16, EnumC11113a.DROP_OLDEST, 1);

    @Override // t0.q
    public final Object emit(@NotNull n nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object emit = this.f98936a.emit(nVar, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @Override // t0.o
    public final InterfaceC2395h getInteractions() {
        return this.f98936a;
    }

    @Override // t0.q
    public final boolean tryEmit(@NotNull n nVar) {
        return this.f98936a.tryEmit(nVar);
    }
}
