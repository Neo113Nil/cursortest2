package ru.ozon.app.android.account.orders.onorderchangenew;

import Ae.InterfaceC2395h;
import Wc.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManagerImpl;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeDataSource;", "orderChangeDataSource", "<init>", "(Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeDataSource;)V", "LAe/h;", "", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "getEventEmitter", "()LAe/h;", "event", "", "putEvents", "(Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "putEvent", "(Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeDataSource;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderChangeManagerImpl implements OrderChangeManager {

    @NotNull
    private final OrderChangeDataSource orderChangeDataSource;

    public OrderChangeManagerImpl(@NotNull OrderChangeDataSource orderChangeDataSource) {
        Intrinsics.checkNotNullParameter(orderChangeDataSource, "orderChangeDataSource");
        this.orderChangeDataSource = orderChangeDataSource;
    }

    @Override // ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager
    @NotNull
    public InterfaceC2395h<Set<OrderChangeEvent>> getEventEmitter() {
        return this.orderChangeDataSource.getEventEmitter();
    }

    @Override // ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager
    public Object putEvent(@NotNull OrderChangeEvent orderChangeEvent, @NotNull d<? super Unit> dVar) {
        Object putEvents = this.orderChangeDataSource.putEvents(e0.h(orderChangeEvent), dVar);
        return putEvents == a.COROUTINE_SUSPENDED ? putEvents : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager
    public Object putEvents(@NotNull Set<? extends OrderChangeEvent> set, @NotNull d<? super Unit> dVar) {
        Object putEvents = this.orderChangeDataSource.putEvents(set, dVar);
        return putEvents == a.COROUTINE_SUSPENDED ? putEvents : Unit.f71690a;
    }
}
