package ru.ozon.app.android.tabbar.di;

import hi.InterfaceC6958a;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/tabbar/di/TabsUiControllerComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "", "Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel$Key;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "Lru/ozon/app/android/tabbar/ui/controller/TabsUiControllerFactoryMap;", "getTabControllersFactory", "()Ljava/util/Map;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TabsUiControllerComponentApi extends InterfaceC6958a {
    @NotNull
    Map<TabControllerRegistryModel.Key, TabUiControllerFactory> getTabControllersFactory();
}
