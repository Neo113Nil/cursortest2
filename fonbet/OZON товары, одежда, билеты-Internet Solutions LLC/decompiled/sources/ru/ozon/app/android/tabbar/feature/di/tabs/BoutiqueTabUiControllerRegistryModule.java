package ru.ozon.app.android.tabbar.feature.di.tabs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.feature.tab.factory.BoutiqueTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/tabbar/feature/di/tabs/BoutiqueTabUiControllerRegistryModule;", "", "<init>", "()V", "provideBoutiqueTabUiControllerFactory", "Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel;", "factory", "Lru/ozon/app/android/tabbar/feature/tab/factory/BoutiqueTabUiControllerFactory;", "provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease", "provideApparelBoutiqueTabUiControllerFactory", "provideApparelBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BoutiqueTabUiControllerRegistryModule {
    @NotNull
    public final TabControllerRegistryModel provideApparelBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease(@NotNull BoutiqueTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel("apparel", R$id.menu_boutique_tab, factory);
    }

    @NotNull
    public final TabControllerRegistryModel provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease(@NotNull BoutiqueTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel("main", R$id.menu_boutique_tab, factory);
    }
}
