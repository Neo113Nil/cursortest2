package ru.ozon.app.android.analytics.startup;

import Sg.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.tracker.model.EventEntity;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/analytics/startup/AppLaunchAnalyticsImpl;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "Lru/ozon/app/android/analytics/startup/FontScaleProvider;", "fontScaleProvider", "Lru/ozon/app/android/analytics/startup/OpenGlVersionProvider;", "openGlVersionProvider", "Lru/ozon/app/android/analytics/startup/SystemLocaleProvider;", "systemLocaleProvider", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;Lru/ozon/app/android/analytics/startup/FontScaleProvider;Lru/ozon/app/android/analytics/startup/OpenGlVersionProvider;Lru/ozon/app/android/analytics/startup/SystemLocaleProvider;)V", "Landroid/net/Uri;", "deeplink", "referrer", "", "trackCampaign", "(Landroid/net/Uri;Landroid/net/Uri;)V", "", "deeplinkPath", "associateReferrer", "(Ljava/lang/String;Ljava/lang/String;)V", "path", "referrerForUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/analytics/startup/FontScaleProvider;", "Lru/ozon/app/android/analytics/startup/OpenGlVersionProvider;", "Lru/ozon/app/android/analytics/startup/SystemLocaleProvider;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalyticsImpl$Referrer;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalyticsImpl$Referrer;", "Referrer", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLaunchAnalyticsImpl extends BaseAnalyticsModule implements AppLaunchAnalytics {

    @NotNull
    private final FontScaleProvider fontScaleProvider;

    @NotNull
    private final OpenGlVersionProvider openGlVersionProvider;
    private Referrer referrer;

    @NotNull
    private final SystemLocaleProvider systemLocaleProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/analytics/startup/AppLaunchAnalyticsImpl$Referrer;", "", "deeplinkPath", "", "referrer", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeeplinkPath", "()Ljava/lang/String;", "getReferrer", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Referrer {

        @NotNull
        private final String deeplinkPath;

        @NotNull
        private final String referrer;

        public Referrer(@NotNull String deeplinkPath, @NotNull String referrer) {
            Intrinsics.checkNotNullParameter(deeplinkPath, "deeplinkPath");
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            this.deeplinkPath = deeplinkPath;
            this.referrer = referrer;
        }

        @NotNull
        public final String getDeeplinkPath() {
            return this.deeplinkPath;
        }

        @NotNull
        public final String getReferrer() {
            return this.referrer;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLaunchAnalyticsImpl(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage, @NotNull FontScaleProvider fontScaleProvider, @NotNull OpenGlVersionProvider openGlVersionProvider, @NotNull SystemLocaleProvider systemLocaleProvider) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(fontScaleProvider, "fontScaleProvider");
        Intrinsics.checkNotNullParameter(openGlVersionProvider, "openGlVersionProvider");
        Intrinsics.checkNotNullParameter(systemLocaleProvider, "systemLocaleProvider");
        this.fontScaleProvider = fontScaleProvider;
        this.openGlVersionProvider = openGlVersionProvider;
        this.systemLocaleProvider = systemLocaleProvider;
    }

    @Override // ru.ozon.app.android.analytics.startup.AppLaunchAnalytics
    public void associateReferrer(@NotNull String deeplinkPath, @NotNull String referrer) {
        Intrinsics.checkNotNullParameter(deeplinkPath, "deeplinkPath");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        this.referrer = new Referrer(deeplinkPath, referrer);
    }

    @Override // ru.ozon.app.android.analytics.startup.AppLaunchAnalytics
    public String referrerForUrl(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Referrer referrer = this.referrer;
        if (!Intrinsics.d(referrer != null ? referrer.getDeeplinkPath() : null, path)) {
            return null;
        }
        Referrer referrer2 = this.referrer;
        String referrer3 = referrer2 != null ? referrer2.getReferrer() : null;
        this.referrer = null;
        return referrer3;
    }

    @Override // ru.ozon.app.android.analytics.startup.AppLaunchAnalytics
    public void trackCampaign(@NotNull Uri deeplink, Uri referrer) {
        String uri;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent = new AnalyticsDataLayer.OzonTrackerEvent(null, new EventEntity.Obj("page", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null), new EventEntity.Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.systemLocaleProvider.getLocale().getLanguage(), null, null, -1, -1, 14335, null), null, U.j(new Pair("dimension1", Float.valueOf(this.fontScaleProvider.getFontScale())), new Pair("dimension2", this.openGlVersionProvider.getOpenGlVersion())), 9, null);
        String uri2 = deeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        BaseAnalyticsModule.sendEventAsync$default(this, Event.CAMPAIGN, new AppLaunchAnalyticsImpl$trackCampaign$1(new Rg.a(null, uri2, null, null, null, null, null, null, (referrer == null || (uri = referrer.toString()) == null) ? null : new Rg.a(null, uri, null, null, null, null, null, null, null, null, null, 4093), null, null, 3581), ozonTrackerEvent), null, null, 12, null);
    }
}
