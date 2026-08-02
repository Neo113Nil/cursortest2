package ru.ozon.app.android.tabbar.ui;

import Pc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.AppType;

/* renamed from: ru.ozon.app.android.tabbar.ui.BottomNavigationController_Factory, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9535BottomNavigationController_Factory {
    private final a<AppType> appTypeProvider;
    private final a<Map<TabControllerRegistryModel.Key, TabUiControllerFactory>> factoriesProvider;
    private final a<TabBarAnalytics> tabBarAnalyticsProvider;
    private final a<TabbarDeeplinksResolver> tabbarDeeplinksResolverProvider;

    public C9535BottomNavigationController_Factory(a<Map<TabControllerRegistryModel.Key, TabUiControllerFactory>> aVar, a<TabBarAnalytics> aVar2, a<TabbarDeeplinksResolver> aVar3, a<AppType> aVar4) {
        this.factoriesProvider = aVar;
        this.tabBarAnalyticsProvider = aVar2;
        this.tabbarDeeplinksResolverProvider = aVar3;
        this.appTypeProvider = aVar4;
    }

    public static C9535BottomNavigationController_Factory create(a<Map<TabControllerRegistryModel.Key, TabUiControllerFactory>> aVar, a<TabBarAnalytics> aVar2, a<TabbarDeeplinksResolver> aVar3, a<AppType> aVar4) {
        return new C9535BottomNavigationController_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static BottomNavigationController newInstance(ComponentCallbacksC5392m componentCallbacksC5392m, Map<TabControllerRegistryModel.Key, TabUiControllerFactory> map, TabBarAnalytics tabBarAnalytics, TabbarDeeplinksResolver tabbarDeeplinksResolver, AppType appType) {
        return new BottomNavigationController(componentCallbacksC5392m, map, tabBarAnalytics, tabbarDeeplinksResolver, appType);
    }

    public BottomNavigationController get(ComponentCallbacksC5392m componentCallbacksC5392m) {
        return newInstance(componentCallbacksC5392m, this.factoriesProvider.get(), this.tabBarAnalyticsProvider.get(), this.tabbarDeeplinksResolverProvider.get(), this.appTypeProvider.get());
    }
}
