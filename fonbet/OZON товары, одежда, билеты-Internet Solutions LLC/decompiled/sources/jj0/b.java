package jj0;

import ij0.InterfaceC7087b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements InterfaceC7087b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nl.a f70129a;

    public b(@NotNull Nl.a configurationRepositoryProvider) {
        Intrinsics.checkNotNullParameter(configurationRepositoryProvider, "configurationRepositoryProvider");
        this.f70129a = configurationRepositoryProvider;
    }

    @Override // ij0.InterfaceC7087b
    public final Object a(@NotNull String str, Object obj, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object f7;
        boolean z11 = obj instanceof Integer;
        Nl.a aVar = this.f70129a;
        if (!z11) {
            return ((obj instanceof Boolean) && (f7 = aVar.a().f(str, ((Boolean) obj).booleanValue(), jVar)) == Wc.a.COROUTINE_SUSPENDED) ? f7 : Unit.f71690a;
        }
        Object c11 = aVar.a().c(((Number) obj).intValue(), str, jVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }
}
