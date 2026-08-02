package jj0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import fj0.AbstractC6574a;
import fj0.C6575b;
import ij0.InterfaceC7088c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e implements InterfaceC7088c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nl.a f70150a;

    public e(@NotNull Nl.a configurationRepositoryProvider) {
        Intrinsics.checkNotNullParameter(configurationRepositoryProvider, "configurationRepositoryProvider");
        this.f70150a = configurationRepositoryProvider;
    }

    @Override // ij0.InterfaceC7088c
    @NotNull
    public final InterfaceC2395h<C6575b> a(@NotNull fj0.d<?> param) {
        Intrinsics.checkNotNullParameter(param, "param");
        boolean z11 = param instanceof fj0.e;
        Nl.a aVar = this.f70150a;
        return z11 ? new d(aVar.a().a(param), this, param) : param instanceof AbstractC6574a ? new c(aVar.a().d(param), this, param) : C2399j.t();
    }
}
