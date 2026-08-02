package ru.ozon.app.android.analytics.plugins.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerPlugin;

/* loaded from: classes6.dex */
public final class AnalyticsPluginModule_ProvideAppsFlyerPluginFactory implements e<AppsFlyerPlugin> {
    public static AppsFlyerPlugin provideAppsFlyerPlugin(AnalyticsPluginModule analyticsPluginModule, Context context, AppsFlyerLib appsFlyerLib) {
        AppsFlyerPlugin provideAppsFlyerPlugin = analyticsPluginModule.provideAppsFlyerPlugin(context, appsFlyerLib);
        j.d(provideAppsFlyerPlugin);
        return provideAppsFlyerPlugin;
    }
}
