package jj0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import fj0.AbstractC6574a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f implements ij0.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nl.a f70151a;

    public f(@NotNull Nl.a configurationRepositoryProvider) {
        Intrinsics.checkNotNullParameter(configurationRepositoryProvider, "configurationRepositoryProvider");
        this.f70151a = configurationRepositoryProvider;
    }

    @Override // ij0.d
    @NotNull
    public final <T> InterfaceC2395h<T> a(@NotNull fj0.d<T> param) {
        Intrinsics.checkNotNullParameter(param, "param");
        boolean z11 = param instanceof fj0.e;
        Nl.a aVar = this.f70151a;
        return z11 ? aVar.a().b(param) : param instanceof AbstractC6574a ? aVar.a().e(param) : C2399j.t();
    }
}
