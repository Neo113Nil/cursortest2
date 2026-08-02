package ru.ozon.app.android.analytics.plugins.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.analytics.plugins.OzonTrackerPlugin;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerPlugin;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;

/* loaded from: classes6.dex */
public final class AnalyticsPluginModule_ProvidePluginsFactory implements e<Set<AnalyticsPlugin>> {
    public static Set<AnalyticsPlugin> providePlugins(AnalyticsPluginModule analyticsPluginModule, AppsFlyerPlugin appsFlyerPlugin, OzonTrackerPlugin ozonTrackerPlugin) {
        Set<AnalyticsPlugin> providePlugins = analyticsPluginModule.providePlugins(appsFlyerPlugin, ozonTrackerPlugin);
        j.d(providePlugins);
        return providePlugins;
    }
}
