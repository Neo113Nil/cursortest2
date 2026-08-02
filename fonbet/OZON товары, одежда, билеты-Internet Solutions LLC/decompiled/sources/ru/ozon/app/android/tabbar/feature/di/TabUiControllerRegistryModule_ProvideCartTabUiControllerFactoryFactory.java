package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import android.app.Application;
import ru.ozon.app.android.cart.ui.tab.CartTabUiControllerFactory;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideCartTabUiControllerFactoryFactory implements e<CartTabUiControllerFactory> {
    private final a<Application> applicationProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideCartTabUiControllerFactoryFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<Application> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.applicationProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideCartTabUiControllerFactoryFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<Application> aVar) {
        return new TabUiControllerRegistryModule_ProvideCartTabUiControllerFactoryFactory(tabUiControllerRegistryModule, aVar);
    }

    public static CartTabUiControllerFactory provideCartTabUiControllerFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, Application application) {
        CartTabUiControllerFactory provideCartTabUiControllerFactory = tabUiControllerRegistryModule.provideCartTabUiControllerFactory(application);
        j.d(provideCartTabUiControllerFactory);
        return provideCartTabUiControllerFactory;
    }

    @Override // Pc.a
    public CartTabUiControllerFactory get() {
        return provideCartTabUiControllerFactory(this.module, this.applicationProvider.get());
    }
}
