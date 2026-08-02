package ru.ozon.app.android.tabbar.feature.di;

import Jb.j;
import Jb.l;
import Jb.m;
import Pc.a;
import android.app.Application;
import java.util.Map;
import java.util.Set;
import ru.ozon.app.android.bank.ui.BankTabUiControllerFactory;
import ru.ozon.app.android.cart.ui.tab.CartTabUiControllerFactory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.tabbar.feature.di.TabUiControllerComponent;
import ru.ozon.app.android.tabbar.feature.di.tabs.BoutiqueTabUiControllerRegistryModule;
import ru.ozon.app.android.tabbar.feature.di.tabs.BoutiqueTabUiControllerRegistryModule_ProvideApparelBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.tabbar.feature.di.tabs.BoutiqueTabUiControllerRegistryModule_ProvideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.tabbar.feature.di.tabs.ProfileTabUiControllerRegistryModule;
import ru.ozon.app.android.tabbar.feature.di.tabs.ProfileTabUiControllerRegistryModule_ProvideMainProfileTabRegistryModelFactory;
import ru.ozon.app.android.tabbar.feature.di.tabs.ProfileTabUiControllerRegistryModule_ProvideProfileControllerFactoryFactory;
import ru.ozon.app.android.tabbar.feature.tab.factory.BoutiqueTabUiControllerFactory;
import ru.ozon.app.android.tabbar.feature.tab.factory.BoutiqueTabUiControllerFactory_Factory;
import ru.ozon.app.android.tabbar.feature.tab.factory.ProfileTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;

/* loaded from: classes7.dex */
public final class DaggerTabUiControllerComponent {

    private static final class Factory implements TabUiControllerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.tabbar.feature.di.TabUiControllerComponent.Factory
        public TabUiControllerComponent create(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            return new TabUiControllerComponentImpl(new TabUiControllerRegistryModule(), new ProfileTabUiControllerRegistryModule(), new BoutiqueTabUiControllerRegistryModule(), contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class TabUiControllerComponentImpl implements TabUiControllerComponent {
        private a<BoutiqueTabUiControllerFactory> boutiqueTabUiControllerFactoryProvider;
        private a<Application> getApplicationProvider;
        private a<TabControllerRegistryModel> provideApparelBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseProvider;
        private a<TabControllerRegistryModel> provideApparelCartControllerRegistryModelProvider;
        private a<TabControllerRegistryModel> provideBankTabBadgeControllerRegistryModelProvider;
        private a<BankTabUiControllerFactory> provideBankTabUiControllerFactoryProvider;
        private a<TabControllerRegistryModel> provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseProvider;
        private a<CartTabUiControllerFactory> provideCartTabUiControllerFactoryProvider;
        private a<TabControllerRegistryModel> provideExpressCartControllerRegistryModelProvider;
        private a<TabControllerRegistryModel> provideExpressSellerCartControllerRegistryModelProvider;
        private a<TabControllerRegistryModel> provideFakeMainCartControllerRegistryModelProvider;
        private a<TabControllerRegistryModel> provideFakeOzonProfileTabRegistryModelProvider;
        private a<TabControllerRegistryModel> provideMainCartControllerRegistryModelProvider;
        private a<TabControllerRegistryModel> provideMainProfileTabRegistryModelProvider;
        private a<ProfileTabUiControllerFactory> provideProfileControllerFactoryProvider;
        private a<TabControllerRegistryModel> provideSellerCartControllerRegistryModelProvider;
        private a<Map<TabControllerRegistryModel.Key, TabUiControllerFactory>> provideTabUiControllerFactoriesProvider;
        private a<Set<TabControllerRegistryModel>> setOfTabControllerRegistryModelProvider;
        private final TabUiControllerComponentImpl tabUiControllerComponentImpl;

        private static final class GetApplicationProvider implements a<Application> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetApplicationProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Application get() {
                Application application = this.contextComponentDependencies.getApplication();
                j.c(application);
                return application;
            }
        }

        /* synthetic */ TabUiControllerComponentImpl(TabUiControllerRegistryModule tabUiControllerRegistryModule, ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, BoutiqueTabUiControllerRegistryModule boutiqueTabUiControllerRegistryModule, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(tabUiControllerRegistryModule, profileTabUiControllerRegistryModule, boutiqueTabUiControllerRegistryModule, contextComponentDependencies);
        }

        private void initialize(TabUiControllerRegistryModule tabUiControllerRegistryModule, ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, BoutiqueTabUiControllerRegistryModule boutiqueTabUiControllerRegistryModule, ContextComponentDependencies contextComponentDependencies) {
            GetApplicationProvider getApplicationProvider = new GetApplicationProvider(contextComponentDependencies);
            this.getApplicationProvider = getApplicationProvider;
            a<CartTabUiControllerFactory> a11 = m.a(TabUiControllerRegistryModule_ProvideCartTabUiControllerFactoryFactory.create(tabUiControllerRegistryModule, getApplicationProvider));
            this.provideCartTabUiControllerFactoryProvider = a11;
            this.provideMainCartControllerRegistryModelProvider = m.a(TabUiControllerRegistryModule_ProvideMainCartControllerRegistryModelFactory.create(tabUiControllerRegistryModule, a11));
            this.provideExpressCartControllerRegistryModelProvider = m.a(TabUiControllerRegistryModule_ProvideExpressCartControllerRegistryModelFactory.create(tabUiControllerRegistryModule, this.provideCartTabUiControllerFactoryProvider));
            this.provideApparelCartControllerRegistryModelProvider = m.a(TabUiControllerRegistryModule_ProvideApparelCartControllerRegistryModelFactory.create(tabUiControllerRegistryModule, this.provideCartTabUiControllerFactoryProvider));
            this.provideFakeMainCartControllerRegistryModelProvider = m.a(TabUiControllerRegistryModule_ProvideFakeMainCartControllerRegistryModelFactory.create(tabUiControllerRegistryModule, this.provideCartTabUiControllerFactoryProvider));
            a<ProfileTabUiControllerFactory> a12 = m.a(ProfileTabUiControllerRegistryModule_ProvideProfileControllerFactoryFactory.create(profileTabUiControllerRegistryModule, this.getApplicationProvider));
            this.provideProfileControllerFactoryProvider = a12;
            this.provideFakeOzonProfileTabRegistryModelProvider = m.a(TabUiControllerRegistryModule_ProvideFakeOzonProfileTabRegistryModelFactory.create(tabUiControllerRegistryModule, a12));
            this.provideSellerCartControllerRegistryModelProvider = m.a(TabUiControllerRegistryModule_ProvideSellerCartControllerRegistryModelFactory.create(tabUiControllerRegistryModule, this.provideCartTabUiControllerFactoryProvider));
            this.provideExpressSellerCartControllerRegistryModelProvider = m.a(TabUiControllerRegistryModule_ProvideExpressSellerCartControllerRegistryModelFactory.create(tabUiControllerRegistryModule, this.provideCartTabUiControllerFactoryProvider));
            a<BankTabUiControllerFactory> a13 = m.a(TabUiControllerRegistryModule_ProvideBankTabUiControllerFactoryFactory.create(tabUiControllerRegistryModule, this.getApplicationProvider));
            this.provideBankTabUiControllerFactoryProvider = a13;
            this.provideBankTabBadgeControllerRegistryModelProvider = m.a(TabUiControllerRegistryModule_ProvideBankTabBadgeControllerRegistryModelFactory.create(tabUiControllerRegistryModule, a13));
            this.provideMainProfileTabRegistryModelProvider = m.a(ProfileTabUiControllerRegistryModule_ProvideMainProfileTabRegistryModelFactory.create(profileTabUiControllerRegistryModule, this.provideProfileControllerFactoryProvider));
            a<BoutiqueTabUiControllerFactory> a14 = m.a(BoutiqueTabUiControllerFactory_Factory.create());
            this.boutiqueTabUiControllerFactoryProvider = a14;
            this.provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseProvider = m.a(BoutiqueTabUiControllerRegistryModule_ProvideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseFactory.create(boutiqueTabUiControllerRegistryModule, a14));
            this.provideApparelBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseProvider = m.a(BoutiqueTabUiControllerRegistryModule_ProvideApparelBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseFactory.create(boutiqueTabUiControllerRegistryModule, this.boutiqueTabUiControllerFactoryProvider));
            l.a a15 = l.a(11);
            a15.a(this.provideMainCartControllerRegistryModelProvider);
            a15.a(this.provideExpressCartControllerRegistryModelProvider);
            a15.a(this.provideApparelCartControllerRegistryModelProvider);
            a15.a(this.provideFakeMainCartControllerRegistryModelProvider);
            a15.a(this.provideFakeOzonProfileTabRegistryModelProvider);
            a15.a(this.provideSellerCartControllerRegistryModelProvider);
            a15.a(this.provideExpressSellerCartControllerRegistryModelProvider);
            a15.a(this.provideBankTabBadgeControllerRegistryModelProvider);
            a15.a(this.provideMainProfileTabRegistryModelProvider);
            a15.a(this.provideBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseProvider);
            a15.a(this.provideApparelBoutiqueTabUiControllerFactory$tabbar_prodGoogleAllVendorsReleaseProvider);
            l b11 = a15.b();
            this.setOfTabControllerRegistryModelProvider = b11;
            this.provideTabUiControllerFactoriesProvider = m.a(TabUiControllerRegistryModule_ProvideTabUiControllerFactoriesFactory.create(tabUiControllerRegistryModule, b11));
        }

        @Override // ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi
        public Map<TabControllerRegistryModel.Key, TabUiControllerFactory> getTabControllersFactory() {
            return this.provideTabUiControllerFactoriesProvider.get();
        }

        private TabUiControllerComponentImpl(TabUiControllerRegistryModule tabUiControllerRegistryModule, ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, BoutiqueTabUiControllerRegistryModule boutiqueTabUiControllerRegistryModule, ContextComponentDependencies contextComponentDependencies) {
            this.tabUiControllerComponentImpl = this;
            initialize(tabUiControllerRegistryModule, profileTabUiControllerRegistryModule, boutiqueTabUiControllerRegistryModule, contextComponentDependencies);
        }
    }

    public static TabUiControllerComponent.Factory factory() {
        return new Factory(0);
    }
}
