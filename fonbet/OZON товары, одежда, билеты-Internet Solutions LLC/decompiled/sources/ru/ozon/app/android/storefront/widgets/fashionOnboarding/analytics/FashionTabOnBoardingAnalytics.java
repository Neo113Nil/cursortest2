package ru.ozon.app.android.storefront.widgets.fashionOnboarding.analytics;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\b\u0001\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/fashionOnboarding/analytics/FashionTabOnBoardingAnalytics;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;)V", "", "trackFashionTabOnBoardingScreenViewed", "()V", "trackOnBoardingCloseIconClicked", "trackOnBoardingBackgroundClicked", "trackFashionTabClicked", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FashionTabOnBoardingAnalytics extends BaseAnalyticsModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FashionTabOnBoardingAnalytics(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
    }

    public final void trackFashionTabClicked() {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, null, FashionTabOnBoardingAnalytics$trackFashionTabClicked$1.INSTANCE, 2, null);
    }

    public final void trackFashionTabOnBoardingScreenViewed() {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, null, FashionTabOnBoardingAnalytics$trackFashionTabOnBoardingScreenViewed$1.INSTANCE, 2, null);
    }

    public final void trackOnBoardingBackgroundClicked() {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, null, FashionTabOnBoardingAnalytics$trackOnBoardingBackgroundClicked$1.INSTANCE, 2, null);
    }

    public final void trackOnBoardingCloseIconClicked() {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, null, FashionTabOnBoardingAnalytics$trackOnBoardingCloseIconClicked$1.INSTANCE, 2, null);
    }
}
