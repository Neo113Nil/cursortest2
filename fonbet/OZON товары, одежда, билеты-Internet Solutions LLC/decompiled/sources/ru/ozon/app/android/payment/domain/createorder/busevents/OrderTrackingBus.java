package ru.ozon.app.android.payment.domain.createorder.busevents;

import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "", "<init>", "()V", "Lru/ozon/app/android/payment/domain/createorder/busevents/RefreshLKScreen;", "event", "", "sendEvent", "(Lru/ozon/app/android/payment/domain/createorder/busevents/RefreshLKScreen;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "subscribeEvents", "()LAe/h;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderTrackingBus {

    @NotNull
    private static final w0<RefreshLKScreen> orderEventEmitter = E0.b(0, 0, null, 7);

    public final Object sendEvent(@NotNull RefreshLKScreen refreshLKScreen, @NotNull d<? super Unit> dVar) {
        Object emit = orderEventEmitter.emit(refreshLKScreen, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @NotNull
    public final InterfaceC2395h<RefreshLKScreen> subscribeEvents() {
        return orderEventEmitter;
    }
}
