package ru.ozon.app.android.analytics.di;

import ei0.InterfaceC6369b;
import fi0.e;
import fi0.w;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceHardwareInfoProvider;
import ru.ozon.app.android.analytics.AnalyticsCache;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.analytics.startup.FontScaleProvider;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H&¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "getAnalyticsDataLayer", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "Lru/ozon/app/android/analytics/AnalyticsCache;", "getAnalyticsCache", "()Lru/ozon/app/android/analytics/AnalyticsCache;", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "getPluginsManager", "()Lru/ozon/app/android/analytics/plugins/PluginsManager;", "Lei0/b;", "getOzonTracker", "()Lei0/b;", "Lfi0/w;", "getTrackerDynamicSettings", "()Lfi0/w;", "Lfi0/e;", "getCustomPropertyTracker", "()Lfi0/e;", "Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "getAppStoreInfoProvider", "()Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "Lru/ozon/android/hardwareinfo/DeviceHardwareInfoProvider;", "getDeviceHardwareInfoProvider", "()Lru/ozon/android/hardwareinfo/DeviceHardwareInfoProvider;", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "getAnalyticsEventExecutor", "()Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "getAppLaunchAnalytics", "()Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;", "getAppsFlyerConversionStorage", "()Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "getPerformanceTrackerDelegate", "()Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/analytics/startup/FontScaleProvider;", "getFontScaleProvider", "()Lru/ozon/app/android/analytics/startup/FontScaleProvider;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsComponentApi extends InterfaceC6958a {
    @NotNull
    AnalyticsCache getAnalyticsCache();

    @NotNull
    AnalyticsDataLayer getAnalyticsDataLayer();

    @NotNull
    AnalyticsEventExecutor getAnalyticsEventExecutor();

    @NotNull
    AppLaunchAnalytics getAppLaunchAnalytics();

    @NotNull
    AppStoreInfoProvider getAppStoreInfoProvider();

    @NotNull
    AppsFlyerConversionStorage getAppsFlyerConversionStorage();

    @NotNull
    e getCustomPropertyTracker();

    @NotNull
    DeviceHardwareInfoProvider getDeviceHardwareInfoProvider();

    @NotNull
    FontScaleProvider getFontScaleProvider();

    @NotNull
    InterfaceC6369b getOzonTracker();

    @NotNull
    PerformanceTrackerDelegate getPerformanceTrackerDelegate();

    @NotNull
    PluginsManager getPluginsManager();

    @NotNull
    w getTrackerDynamicSettings();
}
