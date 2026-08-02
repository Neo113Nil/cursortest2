package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.modules.NonComposerPageViewAnalyticsHelper;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\b\u0001\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchAnalytics;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "Lru/ozon/app/android/analytics/modules/NonComposerPageViewAnalyticsHelper;", "helper", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;Lru/ozon/app/android/analytics/modules/NonComposerPageViewAnalyticsHelper;)V", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "pageView", "(Ljava/lang/String;)V", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ButtonAnalyticsData;", "data", "trackButton", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ButtonAnalyticsData;)V", "Lru/ozon/app/android/analytics/modules/NonComposerPageViewAnalyticsHelper;", "Companion", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchAnalytics extends BaseAnalyticsModule {

    @NotNull
    private final NonComposerPageViewAnalyticsHelper helper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductPickerSearchAnalytics(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage, @NotNull NonComposerPageViewAnalyticsHelper helper) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.helper = helper;
    }

    public final void pageView(@NotNull String actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.helper.pageView(new Rg.a("static_page", Nk.a.b("productPickerSelector/", actionType), null, null, null, null, null, null, null, null, null, 4092), false);
    }

    public final void trackButton(@NotNull ButtonAnalyticsData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, null, new ProductPickerSearchAnalytics$trackButton$1(data), 2, null);
    }
}
