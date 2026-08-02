package jj0;

import ij0.InterfaceC7086a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7434a implements InterfaceC7086a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nl.a f70128a;

    public C7434a(@NotNull Nl.a configurationRepositoryProvider) {
        Intrinsics.checkNotNullParameter(configurationRepositoryProvider, "configurationRepositoryProvider");
        this.f70128a = configurationRepositoryProvider;
    }

    @Override // ij0.InterfaceC7086a
    public final Object a(@NotNull fj0.g<?> gVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        String key = gVar.getKey();
        boolean z11 = gVar instanceof fj0.h;
        Nl.a aVar = this.f70128a;
        if (z11) {
            Object c11 = aVar.a().c(((fj0.h) gVar).a().intValue(), key, (kotlin.coroutines.jvm.internal.c) dVar);
            return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
        }
        if (!(gVar instanceof fj0.f)) {
            return Unit.f71690a;
        }
        Object f7 = aVar.a().f(key, ((fj0.f) gVar).a().booleanValue(), (kotlin.coroutines.jvm.internal.c) dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
