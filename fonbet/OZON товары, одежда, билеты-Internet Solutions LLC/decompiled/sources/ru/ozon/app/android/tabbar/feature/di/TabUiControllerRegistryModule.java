package ru.ozon.app.android.tabbar.feature.di;

import android.app.Application;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.ui.BankTabUiControllerFactory;
import ru.ozon.app.android.cart.ui.tab.CartTabUiControllerFactory;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.feature.tab.factory.ProfileTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/tabbar/feature/di/TabUiControllerRegistryModule;", "", "<init>", "()V", "", "Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel;", "controllers", "", "Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel$Key;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "Lru/ozon/app/android/tabbar/ui/controller/TabsUiControllerFactoryMap;", "provideTabUiControllerFactories", "(Ljava/util/Set;)Ljava/util/Map;", "Lru/ozon/app/android/cart/ui/tab/CartTabUiControllerFactory;", "factory", "provideMainCartControllerRegistryModel", "(Lru/ozon/app/android/cart/ui/tab/CartTabUiControllerFactory;)Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel;", "provideExpressCartControllerRegistryModel", "provideApparelCartControllerRegistryModel", "provideFakeMainCartControllerRegistryModel", "Lru/ozon/app/android/tabbar/feature/tab/factory/ProfileTabUiControllerFactory;", "provideFakeOzonProfileTabRegistryModel", "(Lru/ozon/app/android/tabbar/feature/tab/factory/ProfileTabUiControllerFactory;)Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel;", "provideSellerCartControllerRegistryModel", "provideExpressSellerCartControllerRegistryModel", "Lru/ozon/app/android/bank/ui/BankTabUiControllerFactory;", "provideBankTabBadgeControllerRegistryModel", "(Lru/ozon/app/android/bank/ui/BankTabUiControllerFactory;)Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel;", "Landroid/app/Application;", "application", "provideCartTabUiControllerFactory", "(Landroid/app/Application;)Lru/ozon/app/android/cart/ui/tab/CartTabUiControllerFactory;", "provideBankTabUiControllerFactory", "(Landroid/app/Application;)Lru/ozon/app/android/bank/ui/BankTabUiControllerFactory;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule {
    @NotNull
    public final TabControllerRegistryModel provideApparelCartControllerRegistryModel(@NotNull CartTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("apparel", R$id.menu_cart), factory);
    }

    @NotNull
    public final TabControllerRegistryModel provideBankTabBadgeControllerRegistryModel(@NotNull BankTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("main", R$id.menu_bank), factory);
    }

    @NotNull
    public final BankTabUiControllerFactory provideBankTabUiControllerFactory(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new BankTabUiControllerFactory(application);
    }

    @NotNull
    public final CartTabUiControllerFactory provideCartTabUiControllerFactory(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new CartTabUiControllerFactory(application);
    }

    @NotNull
    public final TabControllerRegistryModel provideExpressCartControllerRegistryModel(@NotNull CartTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("supermarket", R$id.menu_cart), factory);
    }

    @NotNull
    public final TabControllerRegistryModel provideExpressSellerCartControllerRegistryModel(@NotNull CartTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("express_seller", R$id.menu_cart), factory);
    }

    @NotNull
    public final TabControllerRegistryModel provideFakeMainCartControllerRegistryModel(@NotNull CartTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("fakeMain", R$id.menu_cart), factory);
    }

    @NotNull
    public final TabControllerRegistryModel provideFakeOzonProfileTabRegistryModel(@NotNull ProfileTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("fakeMain", R$id.menu_profile), factory);
    }

    @NotNull
    public final TabControllerRegistryModel provideMainCartControllerRegistryModel(@NotNull CartTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("main", R$id.menu_cart), factory);
    }

    @NotNull
    public final TabControllerRegistryModel provideSellerCartControllerRegistryModel(@NotNull CartTabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new TabControllerRegistryModel(new TabControllerRegistryModel.Key("seller", R$id.menu_cart), factory);
    }

    @NotNull
    public final Map<TabControllerRegistryModel.Key, TabUiControllerFactory> provideTabUiControllerFactories(@NotNull Set<TabControllerRegistryModel> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        HashMap hashMap = new HashMap();
        for (TabControllerRegistryModel tabControllerRegistryModel : controllers) {
            Pair pair = new Pair(tabControllerRegistryModel.getKey(), tabControllerRegistryModel.getFactory());
            hashMap.put(pair.e(), pair.f());
        }
        return hashMap;
    }
}
