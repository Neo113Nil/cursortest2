package ru.ozon.app.android.favorites.domain.eventBus;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/domain/eventBus/RemoveFromFavoritesEventBus;", "", "<init>", "()V", "", "sku", "", "emit", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/w0;", "_flow", "LAe/w0;", "LAe/B0;", "flow", "LAe/B0;", "getFlow", "()LAe/B0;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveFromFavoritesEventBus {

    @NotNull
    public static final RemoveFromFavoritesEventBus INSTANCE = new RemoveFromFavoritesEventBus();

    @NotNull
    private static final w0<Long> _flow;

    @NotNull
    private static final B0<Long> flow;

    static {
        C0 b11 = E0.b(0, 0, null, 7);
        _flow = b11;
        flow = C2399j.a(b11);
    }

    private RemoveFromFavoritesEventBus() {
    }

    public final Object emit(long j11, @NotNull d<? super Unit> dVar) {
        Object emit = _flow.emit(new Long(j11), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @NotNull
    public final B0<Long> getFlow() {
        return flow;
    }
}
