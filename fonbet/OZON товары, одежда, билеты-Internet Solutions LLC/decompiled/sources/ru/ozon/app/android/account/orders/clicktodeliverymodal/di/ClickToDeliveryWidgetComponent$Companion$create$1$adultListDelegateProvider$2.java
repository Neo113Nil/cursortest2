package ru.ozon.app.android.account.orders.clicktodeliverymodal.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ClickToDeliveryWidgetComponent$Companion$create$1$adultListDelegateProvider$2 extends AbstractC7737t implements Function0<AdultListDelegateProvider> {
    final /* synthetic */ ClickToDeliveryWidgetComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickToDeliveryWidgetComponent$Companion$create$1$adultListDelegateProvider$2(ClickToDeliveryWidgetComponent$Companion$create$1 clickToDeliveryWidgetComponent$Companion$create$1) {
        super(0);
        this.this$0 = clickToDeliveryWidgetComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdultListDelegateProvider invoke() {
        AccountComponentApi accountComponentApi;
        NetworkComponentApi networkComponentApi;
        accountComponentApi = this.this$0.accountComponentApi;
        AdultHandler adultHandler = accountComponentApi.getAdultHandler();
        networkComponentApi = this.this$0.networkComponentApi;
        return new AdultListDelegateProvider(adultHandler, networkComponentApi.getFeatureChecker());
    }
}
