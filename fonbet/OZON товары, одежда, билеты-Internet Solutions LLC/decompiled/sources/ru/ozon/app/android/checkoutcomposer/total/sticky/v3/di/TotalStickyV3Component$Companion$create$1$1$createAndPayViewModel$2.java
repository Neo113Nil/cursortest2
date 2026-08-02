package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalStickyV3Component$Companion$create$1$1$createAndPayViewModel$2 extends AbstractC7737t implements Function0<CreateAndPayViewModel> {
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ TotalStickyV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV3Component$Companion$create$1$1$createAndPayViewModel$2(C7475g c7475g, TotalStickyV3Component$Companion$create$1$1 totalStickyV3Component$Companion$create$1$1) {
        super(0);
        this.$storage = c7475g;
        this.this$0 = totalStickyV3Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CreateAndPayViewModel invoke() {
        GooglePayAvailabilityStorage googlePayAvailabilityStorage;
        AnalyticsComponentApi analyticsComponentApi;
        AnalyticsComponentApi analyticsComponentApi2;
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        CreateAndPayRepository createAndPayRepository = new CreateAndPayRepository(((ActionComponentApi) this.$storage.getComponent(ActionComponentApi.class)).getActionRepository());
        OrderTrackingBus orderTrackingBus = new OrderTrackingBus();
        googlePayAvailabilityStorage = this.this$0.googlePayAvailabilityStorage;
        GooglePayManagerImpl googlePayManagerImpl = new GooglePayManagerImpl(googlePayAvailabilityStorage);
        analyticsComponentApi = this.this$0.analyticsComponentApi;
        AnalyticsDataLayer analyticsDataLayer = analyticsComponentApi.getAnalyticsDataLayer();
        analyticsComponentApi2 = this.this$0.analyticsComponentApi;
        PluginsManager pluginsManager = analyticsComponentApi2.getPluginsManager();
        analyticsScreenStorageComponentApi = this.this$0.analyticsScreenStorageComponentApi;
        return new CreateAndPayViewModel(createAndPayRepository, orderTrackingBus, googlePayManagerImpl, new CreateAndPayAnalytics(analyticsDataLayer, pluginsManager, analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
    }
}
