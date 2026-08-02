package ru.ozon.app.android.analytics.di.module;

import Jb.e;
import Jb.j;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes6.dex */
public final class AnalyticsDependencyModule_Companion_ProvideAppsFlyerFactory implements e<AppsFlyerLib> {
    public static AppsFlyerLib provideAppsFlyer() {
        AppsFlyerLib provideAppsFlyer = AnalyticsDependencyModule.INSTANCE.provideAppsFlyer();
        j.d(provideAppsFlyer);
        return provideAppsFlyer;
    }
}
