package ru.ozon.app.android.account.orders.onorderchangenew;

import Ae.InterfaceC2395h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "", "LAe/h;", "", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "getEventEmitter", "()LAe/h;", "event", "", "putEvents", "(Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "putEvent", "(Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OrderChangeManager {
    @NotNull
    InterfaceC2395h<Set<OrderChangeEvent>> getEventEmitter();

    Object putEvent(@NotNull OrderChangeEvent orderChangeEvent, @NotNull d<? super Unit> dVar);

    Object putEvents(@NotNull Set<? extends OrderChangeEvent> set, @NotNull d<? super Unit> dVar);
}
