package ru.ozon.app.android.tabbar.feature.di.tabs;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.tabbar.feature.tab.factory.BoutiqueTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class BoutiqueTabUiControllerRegistryModule_ProvideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseFactory implements e<TabControllerRegistryModel> {
    private final a<BoutiqueTabUiControllerFactory> factoryProvider;
    private final BoutiqueTabUiControllerRegistryModule module;

    public BoutiqueTabUiControllerRegistryModule_ProvideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseFactory(BoutiqueTabUiControllerRegistryModule boutiqueTabUiControllerRegistryModule, a<BoutiqueTabUiControllerFactory> aVar) {
        this.module = boutiqueTabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static BoutiqueTabUiControllerRegistryModule_ProvideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseFactory create(BoutiqueTabUiControllerRegistryModule boutiqueTabUiControllerRegistryModule, a<BoutiqueTabUiControllerFactory> aVar) {
        return new BoutiqueTabUiControllerRegistryModule_ProvideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseFactory(boutiqueTabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease(BoutiqueTabUiControllerRegistryModule boutiqueTabUiControllerRegistryModule, BoutiqueTabUiControllerFactory boutiqueTabUiControllerFactory) {
        TabControllerRegistryModel provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease = boutiqueTabUiControllerRegistryModule.provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease(boutiqueTabUiControllerFactory);
        j.d(provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease);
        return provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsRelease(this.module, this.factoryProvider.get());
    }
}
