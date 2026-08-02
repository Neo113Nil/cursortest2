package ru.ozon.app.android.analytics.plugins.base;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.EventsContainer;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "", "id", "", "getId", "()Ljava/lang/String;", "pluginType", "Lru/ozon/app/android/analytics/plugins/base/PluginType;", "getPluginType", "()Lru/ozon/app/android/analytics/plugins/base/PluginType;", "send", "", "event", "Lru/ozon/app/android/analytics/Event;", "eventsContainer", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "dataLayer", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsPlugin {
    String getId();

    @NotNull
    PluginType getPluginType();

    void send(@NotNull Event event, @NotNull EventsContainer eventsContainer, @NotNull AnalyticsDataLayer dataLayer);
}
