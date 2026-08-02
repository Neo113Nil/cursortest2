package ru.ozon.app.android.app.launch.handlers.di.factory;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponent;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi;
import ru.ozon.app.android.app.launch.handlers.di.DaggerAppLaunchHandlersComponent;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/di/factory/AppLaunchHandlersComponentFactory;", "Lii/a;", "Lru/ozon/app/android/app/launch/handlers/di/AppLaunchHandlersComponentApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/app/launch/handlers/di/AppLaunchHandlersComponentApi;", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLaunchHandlersComponentFactory implements InterfaceC7081a<AppLaunchHandlersComponentApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public AppLaunchHandlersComponentApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        AppLaunchHandlersComponent.Factory factory = DaggerAppLaunchHandlersComponent.factory();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) componentStorage.b(ComposerComponentApi.class);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) componentStorage.b(NavigationComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) componentStorage.b(StorageComponentApi.class);
        if (TabsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsComponentApi is not DiComponent");
        }
        TabsComponentApi tabsComponentApi = (TabsComponentApi) componentStorage.b(TabsComponentApi.class);
        if (CdnHostManagerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CdnHostManagerComponentApi is not DiComponent");
        }
        CdnHostManagerComponentApi cdnHostManagerComponentApi = (CdnHostManagerComponentApi) componentStorage.b(CdnHostManagerComponentApi.class);
        if (CartServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartServiceApi is not DiComponent");
        }
        CartServiceApi cartServiceApi = (CartServiceApi) componentStorage.b(CartServiceApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) componentStorage.b(AccountComponentApi.class);
        if (ThirdPartyLibrariesConfigComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ThirdPartyLibrariesConfigComponentApi is not DiComponent");
        }
        ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi = (ThirdPartyLibrariesConfigComponentApi) componentStorage.b(ThirdPartyLibrariesConfigComponentApi.class);
        if (FirebaseAnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FirebaseAnalyticsComponentApi is not DiComponent");
        }
        FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi = (FirebaseAnalyticsComponentApi) componentStorage.b(FirebaseAnalyticsComponentApi.class);
        if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
        }
        AppLocaleComponentApi appLocaleComponentApi = (AppLocaleComponentApi) componentStorage.b(AppLocaleComponentApi.class);
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        Limb2ComponentApi limb2ComponentApi = (Limb2ComponentApi) componentStorage.b(Limb2ComponentApi.class);
        if (ComposerDebugMenuHostApiComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerDebugMenuHostApiComponent is not DiComponent");
        }
        return factory.create(composerComponentApi, navigationComponentApi, storageComponentApi, tabsComponentApi, cdnHostManagerComponentApi, cartServiceApi, networkComponentApi, accountComponentApi, thirdPartyLibrariesConfigComponentApi, firebaseAnalyticsComponentApi, appLocaleComponentApi, limb2ComponentApi, (ComposerDebugMenuHostApiComponent) componentStorage.b(ComposerDebugMenuHostApiComponent.class));
    }
}
