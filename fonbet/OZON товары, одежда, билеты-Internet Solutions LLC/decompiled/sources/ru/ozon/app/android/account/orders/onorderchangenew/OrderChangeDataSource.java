package ru.ozon.app.android.account.orders.onorderchangenew;

import Ae.InterfaceC2395h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeDataSource;", "", "", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "events", "", "putEvents", "(Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "getEventEmitter", "()LAe/h;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OrderChangeDataSource {
    @NotNull
    InterfaceC2395h<Set<OrderChangeEvent>> getEventEmitter();

    Object putEvents(@NotNull Set<? extends OrderChangeEvent> set, @NotNull d<? super Unit> dVar);
}
