package ru.ozon.app.android.tabbar.feature.tab.factory;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.feature.tab.boutique.BoutiqueTabUiController;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/factory/BoutiqueTabUiControllerFactory;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "create", "(Landroidx/fragment/app/m;)Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BoutiqueTabUiControllerFactory implements TabUiControllerFactory {
    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory
    @NotNull
    public TabUiController create(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new BoutiqueTabUiController(fragment);
    }
}
