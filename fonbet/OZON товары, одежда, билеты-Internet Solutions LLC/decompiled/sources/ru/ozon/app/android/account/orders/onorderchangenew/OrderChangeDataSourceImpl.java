package ru.ozon.app.android.account.orders.onorderchangenew;

import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import Wc.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeDataSourceImpl;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeDataSource;", "<init>", "()V", "", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "events", "", "putEvents", "(Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "getEventEmitter", "()LAe/h;", "LAe/w0;", "orderEventEmitter", "LAe/w0;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderChangeDataSourceImpl implements OrderChangeDataSource {

    @NotNull
    private final w0<Set<OrderChangeEvent>> orderEventEmitter = E0.b(0, 0, null, 7);

    @Override // ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeDataSource
    @NotNull
    public InterfaceC2395h<Set<OrderChangeEvent>> getEventEmitter() {
        return this.orderEventEmitter;
    }

    @Override // ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeDataSource
    public Object putEvents(@NotNull Set<? extends OrderChangeEvent> set, @NotNull d<? super Unit> dVar) {
        Object emit = this.orderEventEmitter.emit(set, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }
}
