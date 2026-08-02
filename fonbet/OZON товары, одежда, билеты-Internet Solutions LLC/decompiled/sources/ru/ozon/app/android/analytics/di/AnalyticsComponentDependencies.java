package ru.ozon.app.android.analytics.di;

import Qj0.I;
import com.appsflyer.AppsFlyerLib;
import hi.InterfaceC6958a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;
import ru.ozon.app.android.analytics.tracker.OzonTrackerSettings;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/analytics/di/AnalyticsComponentDependencies;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentConfig;", "getAnalyticsComponentConfig", "()Lru/ozon/app/android/analytics/di/AnalyticsComponentConfig;", "Lru/ozon/app/android/analytics/tracker/OzonTrackerSettings;", "getOzonTrackerSettings", "()Lru/ozon/app/android/analytics/tracker/OzonTrackerSettings;", "Lcom/appsflyer/AppsFlyerLib;", "getAppsFlyerLib", "()Lcom/appsflyer/AppsFlyerLib;", "Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "getAppStoreInfoProvider", "()Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "", "LQj0/I;", "getPerformanceTrackerInterceptors", "()Ljava/util/List;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsComponentDependencies extends InterfaceC6958a {
    @NotNull
    AnalyticsComponentConfig getAnalyticsComponentConfig();

    @NotNull
    AppStoreInfoProvider getAppStoreInfoProvider();

    @NotNull
    AppsFlyerLib getAppsFlyerLib();

    @NotNull
    OzonTrackerSettings getOzonTrackerSettings();

    @NotNull
    List<I> getPerformanceTrackerInterceptors();
}
