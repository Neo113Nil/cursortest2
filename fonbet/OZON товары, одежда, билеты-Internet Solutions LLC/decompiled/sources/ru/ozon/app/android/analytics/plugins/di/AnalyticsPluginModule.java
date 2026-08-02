package ru.ozon.app.android.analytics.plugins.di;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.plugins.OzonTrackerPlugin;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerPlugin;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/analytics/plugins/di/AnalyticsPluginModule;", "", "<init>", "()V", "providePlugins", "", "Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "appsFlyerPlugin", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerPlugin;", "ozonTrackerPlugin", "Lru/ozon/app/android/analytics/plugins/OzonTrackerPlugin;", "provideAppsFlyerPlugin", "context", "Landroid/content/Context;", "appsFlyerLib", "Lcom/appsflyer/AppsFlyerLib;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsPluginModule {
    @NotNull
    public final AppsFlyerPlugin provideAppsFlyerPlugin(@NotNull Context context, @NotNull AppsFlyerLib appsFlyerLib) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
        return new AppsFlyerPlugin(context, appsFlyerLib);
    }

    @NotNull
    public final Set<AnalyticsPlugin> providePlugins(@NotNull AppsFlyerPlugin appsFlyerPlugin, @NotNull OzonTrackerPlugin ozonTrackerPlugin) {
        Intrinsics.checkNotNullParameter(appsFlyerPlugin, "appsFlyerPlugin");
        Intrinsics.checkNotNullParameter(ozonTrackerPlugin, "ozonTrackerPlugin");
        return e0.a(appsFlyerPlugin, ozonTrackerPlugin);
    }
}
