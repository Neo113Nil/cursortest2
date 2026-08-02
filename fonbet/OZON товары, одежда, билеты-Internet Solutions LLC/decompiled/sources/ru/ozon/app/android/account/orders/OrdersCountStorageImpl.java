package ru.ozon.app.android.account.orders;

import Lc.b;
import android.content.Context;
import android.content.SharedPreferences;
import io.reactivex.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wc.C10474C;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00070\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/OrdersCountStorageImpl;", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lio/reactivex/h;", "", "count", "()Lio/reactivex/h;", "activeOrders", "allUnread", "", "setOrdersAndNotificationsCount", "(II)V", "clearOrdersAndNotificationsCount", "()V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sharedPreferences", "Landroid/content/SharedPreferences;", "LLc/b;", "countProcessor", "LLc/b;", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrdersCountStorageImpl implements OrdersCountStorage {

    @NotNull
    private final b<Integer> countProcessor;
    private final SharedPreferences sharedPreferences;

    public OrdersCountStorageImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("ORDER_COUNTS_SHARED", 0);
        this.sharedPreferences = sharedPreferences;
        b<Integer> n11 = b.n(Integer.valueOf(sharedPreferences.getInt("ALL_UNREAD_COUNT", 0) + sharedPreferences.getInt("ACTIVE_ORDERS_COUNT", 0)));
        Intrinsics.checkNotNullExpressionValue(n11, "createDefault(...)");
        this.countProcessor = n11;
    }

    @Override // ru.ozon.app.android.account.orders.OrdersCountStorage
    public void clearOrdersAndNotificationsCount() {
        this.sharedPreferences.edit().clear().apply();
        this.countProcessor.onNext(0);
    }

    @Override // ru.ozon.app.android.account.orders.OrdersCountStorage
    @NotNull
    public h<Integer> count() {
        b<Integer> bVar = this.countProcessor;
        bVar.getClass();
        C10474C c10474c = new C10474C(bVar);
        Intrinsics.checkNotNullExpressionValue(c10474c, "onBackpressureLatest(...)");
        return c10474c;
    }

    @Override // ru.ozon.app.android.account.orders.OrdersCountStorage
    public void setOrdersAndNotificationsCount(int activeOrders, int allUnread) {
        this.sharedPreferences.edit().putInt("ACTIVE_ORDERS_COUNT", activeOrders).putInt("ALL_UNREAD_COUNT", allUnread).apply();
        this.countProcessor.onNext(Integer.valueOf(activeOrders + allUnread));
    }
}
