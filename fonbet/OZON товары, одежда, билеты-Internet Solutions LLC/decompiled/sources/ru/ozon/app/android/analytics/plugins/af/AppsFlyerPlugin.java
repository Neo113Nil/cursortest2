package ru.ozon.app.android.analytics.plugins.af;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.EventsContainer;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;
import ru.ozon.app.android.analytics.plugins.base.PluginType;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerPlugin;", "Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "context", "Landroid/content/Context;", "appsFlyerLib", "Lcom/appsflyer/AppsFlyerLib;", "<init>", "(Landroid/content/Context;Lcom/appsflyer/AppsFlyerLib;)V", "pluginType", "Lru/ozon/app/android/analytics/plugins/base/PluginType;", "getPluginType", "()Lru/ozon/app/android/analytics/plugins/base/PluginType;", "id", "", "getId", "()Ljava/lang/String;", "send", "", "event", "Lru/ozon/app/android/analytics/Event;", "eventsContainer", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "dataLayer", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "Companion", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerPlugin implements AnalyticsPlugin {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppsFlyerLib appsFlyerLib;

    @NotNull
    private final Context context;

    @NotNull
    private final PluginType pluginType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerPlugin$Companion;", "", "<init>", "()V", "APPSFLYER_APP_ID", "", "APPSFLYER_CURRENCY", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AppsFlyerPlugin(@NotNull Context context, @NotNull AppsFlyerLib appsFlyerLib) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
        this.context = context;
        this.appsFlyerLib = appsFlyerLib;
        this.pluginType = PluginType.APPSFLYER;
        appsFlyerLib.setAppId("ru.ozon.app.android");
        appsFlyerLib.setCurrencyCode("RUB");
    }

    @Override // ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin
    @NotNull
    public String getId() {
        String appsFlyerUID = this.appsFlyerLib.getAppsFlyerUID(this.context);
        return appsFlyerUID == null ? "" : appsFlyerUID;
    }

    @Override // ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin
    @NotNull
    public PluginType getPluginType() {
        return this.pluginType;
    }

    @Override // ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin
    public void send(@NotNull Event event, @NotNull EventsContainer eventsContainer, @NotNull AnalyticsDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(eventsContainer, "eventsContainer");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
    }
}
