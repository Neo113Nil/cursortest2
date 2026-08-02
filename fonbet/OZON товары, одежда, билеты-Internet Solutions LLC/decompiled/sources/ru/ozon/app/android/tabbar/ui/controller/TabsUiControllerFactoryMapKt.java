package ru.ozon.app.android.tabbar.ui.controller;

import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b*\"\u0010\f\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\r"}, d2 = {"", "Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel$Key;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "Lru/ozon/app/android/tabbar/ui/controller/TabsUiControllerFactoryMap;", "Landroidx/fragment/app/m;", "fragment", "", "miniApp", "", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "controllersByMiniApp", "(Ljava/util/Map;Landroidx/fragment/app/m;Ljava/lang/String;)Ljava/util/Map;", "TabsUiControllerFactoryMap", "tabbar_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabsUiControllerFactoryMapKt {
    @NotNull
    public static final Map<Integer, TabUiController> controllersByMiniApp(@NotNull Map<TabControllerRegistryModel.Key, TabUiControllerFactory> map, @NotNull ComponentCallbacksC5392m fragment, @NotNull String miniApp) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        HashMap hashMap = new HashMap();
        for (Map.Entry<TabControllerRegistryModel.Key, TabUiControllerFactory> entry : map.entrySet()) {
            TabControllerRegistryModel.Key key = entry.getKey();
            if (Intrinsics.d(key.getAppName(), miniApp)) {
                hashMap.put(Integer.valueOf(key.getTabId()), entry.getValue().create(fragment));
            }
        }
        return hashMap;
    }
}
