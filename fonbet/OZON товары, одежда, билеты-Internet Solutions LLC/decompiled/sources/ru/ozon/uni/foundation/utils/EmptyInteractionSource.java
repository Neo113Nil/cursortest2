package ru.ozon.uni.foundation.utils;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.n;
import t0.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/foundation/utils/EmptyInteractionSource;", "Lt0/q;", "<init>", "()V", "Lt0/n;", "interaction", "", "emit", "(Lt0/n;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "tryEmit", "(Lt0/n;)Z", "LAe/h;", "interactions", "LAe/h;", "getInteractions", "()LAe/h;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmptyInteractionSource implements q {

    @NotNull
    public static final EmptyInteractionSource INSTANCE = new EmptyInteractionSource();

    @NotNull
    private static final InterfaceC2395h<n> interactions = C2399j.t();

    private EmptyInteractionSource() {
    }

    @Override // t0.q
    public Object emit(@NotNull n nVar, @NotNull d<? super Unit> dVar) {
        return Unit.f71690a;
    }

    @Override // t0.o
    @NotNull
    public InterfaceC2395h<n> getInteractions() {
        return interactions;
    }

    @Override // t0.q
    public boolean tryEmit(@NotNull n interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        return true;
    }
}
