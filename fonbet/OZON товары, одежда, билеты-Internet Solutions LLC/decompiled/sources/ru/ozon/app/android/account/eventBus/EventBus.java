package ru.ozon.app.android.account.eventBus;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/eventBus/EventBus;", "", "<init>", "()V", "", "emit", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/w0;", "_flow", "LAe/w0;", "LAe/B0;", "flow", "LAe/B0;", "getFlow", "()LAe/B0;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EventBus {

    @NotNull
    private final w0<Unit> _flow;

    @NotNull
    private final B0<Unit> flow;

    public EventBus() {
        C0 b11 = E0.b(0, 0, null, 7);
        this._flow = b11;
        this.flow = C2399j.a(b11);
    }

    public final Object emit(@NotNull d<? super Unit> dVar) {
        w0<Unit> w0Var = this._flow;
        Unit unit = Unit.f71690a;
        Object emit = w0Var.emit(unit, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : unit;
    }

    @NotNull
    public final B0<Unit> getFlow() {
        return this.flow;
    }
}
