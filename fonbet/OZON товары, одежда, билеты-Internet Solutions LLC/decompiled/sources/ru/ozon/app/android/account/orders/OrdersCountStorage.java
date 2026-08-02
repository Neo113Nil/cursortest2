package ru.ozon.app.android.account.orders;

import io.reactivex.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/OrdersCountStorage;", "", "Lio/reactivex/h;", "", "count", "()Lio/reactivex/h;", "activeOrders", "allUnread", "", "setOrdersAndNotificationsCount", "(II)V", "clearOrdersAndNotificationsCount", "()V", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OrdersCountStorage {
    void clearOrdersAndNotificationsCount();

    @NotNull
    h<Integer> count();

    void setOrdersAndNotificationsCount(int activeOrders, int allUnread);
}
