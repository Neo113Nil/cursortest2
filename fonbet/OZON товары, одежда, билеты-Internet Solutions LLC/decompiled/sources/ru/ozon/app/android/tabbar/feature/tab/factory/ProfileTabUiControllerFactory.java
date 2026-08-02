package ru.ozon.app.android.tabbar.feature.tab.factory;

import GZ.g;
import Sc.InterfaceC4008j;
import android.app.Application;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.tabbar.feature.tab.profile.ProfileTabUiController;
import ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/factory/ProfileTabUiControllerFactory;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "create", "(Landroidx/fragment/app/m;)Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "Landroid/app/Application;", "Lru/ozon/app/android/account/orders/OrdersCountStorage;", "ordersCountStorage$delegate", "LSc/j;", "getOrdersCountStorage", "()Lru/ozon/app/android/account/orders/OrdersCountStorage;", "ordersCountStorage", "LGZ/g;", "router$delegate", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService$delegate", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage$delegate", "getAuthStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$Factory;", "profileTabViewModelFactory$delegate", "getProfileTabViewModelFactory", "()Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$Factory;", "profileTabViewModelFactory", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileTabUiControllerFactory implements TabUiControllerFactory {

    @NotNull
    private final Application application;

    /* renamed from: authStateStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j authStateStorage;

    /* renamed from: featureService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureService;

    /* renamed from: ordersCountStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ordersCountStorage;

    /* renamed from: profileTabViewModelFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j profileTabViewModelFactory;

    /* renamed from: router$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j router;

    public ProfileTabUiControllerFactory(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.ordersCountStorage = LazyUtilsKt.unsafeLazy(new ProfileTabUiControllerFactory$ordersCountStorage$2(this));
        this.router = LazyUtilsKt.unsafeLazy(new ProfileTabUiControllerFactory$router$2(this));
        this.featureService = LazyUtilsKt.unsafeLazy(new ProfileTabUiControllerFactory$featureService$2(this));
        this.authStateStorage = LazyUtilsKt.unsafeLazy(new ProfileTabUiControllerFactory$authStateStorage$2(this));
        this.profileTabViewModelFactory = LazyUtilsKt.unsafeLazy(new ProfileTabUiControllerFactory$profileTabViewModelFactory$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthStateStorage getAuthStateStorage() {
        return (AuthStateStorage) this.authStateStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeatureService getFeatureService() {
        return (FeatureService) this.featureService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrdersCountStorage getOrdersCountStorage() {
        return (OrdersCountStorage) this.ordersCountStorage.getValue();
    }

    private final ProfileViewModelImpl.Factory getProfileTabViewModelFactory() {
        return (ProfileViewModelImpl.Factory) this.profileTabViewModelFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g getRouter() {
        return (g) this.router.getValue();
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory
    @NotNull
    public TabUiController create(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new ProfileTabUiController(fragment, getProfileTabViewModelFactory());
    }
}
