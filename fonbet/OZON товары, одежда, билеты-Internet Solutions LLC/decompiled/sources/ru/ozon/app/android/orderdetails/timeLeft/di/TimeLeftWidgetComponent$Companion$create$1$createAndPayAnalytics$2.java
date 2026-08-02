package ru.ozon.app.android.orderdetails.timeLeft.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TimeLeftWidgetComponent$Companion$create$1$createAndPayAnalytics$2 extends AbstractC7737t implements Function0<CreateAndPayAnalytics> {
    final /* synthetic */ TimeLeftWidgetComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeLeftWidgetComponent$Companion$create$1$createAndPayAnalytics$2(TimeLeftWidgetComponent$Companion$create$1 timeLeftWidgetComponent$Companion$create$1) {
        super(0);
        this.this$0 = timeLeftWidgetComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CreateAndPayAnalytics invoke() {
        AnalyticsComponentApi analyticsComponentApi;
        AnalyticsComponentApi analyticsComponentApi2;
        AnalyticsScreenComponentApi analyticsScreenComponentApi;
        analyticsComponentApi = this.this$0.analyticsComponentApi;
        AnalyticsDataLayer analyticsDataLayer = analyticsComponentApi.getAnalyticsDataLayer();
        analyticsComponentApi2 = this.this$0.analyticsComponentApi;
        PluginsManager pluginsManager = analyticsComponentApi2.getPluginsManager();
        analyticsScreenComponentApi = this.this$0.analyticsScreenComponentApi;
        return new CreateAndPayAnalytics(analyticsDataLayer, pluginsManager, analyticsScreenComponentApi.getAnalyticsScreenStorage());
    }
}
