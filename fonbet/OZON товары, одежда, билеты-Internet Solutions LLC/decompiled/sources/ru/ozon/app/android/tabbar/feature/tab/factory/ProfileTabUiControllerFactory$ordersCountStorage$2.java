package ru.ozon.app.android.tabbar.feature.tab.factory;

import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.OrdersCountStorage;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ProfileTabUiControllerFactory$ordersCountStorage$2 extends AbstractC7737t implements Function0<OrdersCountStorage> {
    final /* synthetic */ ProfileTabUiControllerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileTabUiControllerFactory$ordersCountStorage$2(ProfileTabUiControllerFactory profileTabUiControllerFactory) {
        super(0);
        this.this$0 = profileTabUiControllerFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrdersCountStorage invoke() {
        Application application;
        application = this.this$0.application;
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        return ((AccountComponentApi) dependencyStorage.b(AccountComponentApi.class)).getOrderCountsStorage();
    }
}
