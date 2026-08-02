package ru.ozon.app.android.debugmenu.ozondebugmenu.di.factory;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rs.a;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.composer.di.ComposerPerformanceComponentApi;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.DaggerOzonDebugMenuComponent;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponent;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.di.NetworkUserDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.push.di.PushComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u001e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u0004j\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u0006`\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/di/factory/OzonDebugMenuComponentFactoryModule;", "", "<init>", "()V", "Lii/a;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "provideNetworkComponentFactory$debugmenu_prodGoogleAllVendorsRelease", "()Lii/a;", "provideNetworkComponentFactory", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonDebugMenuComponentFactoryModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final OzonDebugMenuComponentApi provideNetworkComponentFactory$lambda$0(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        OzonDebugMenuComponent.Factory factory = DaggerOzonDebugMenuComponent.factory();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) componentStorage.b(AndroidPlatformComponentApi.class);
        if (ComposerPerformanceComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerPerformanceComponentApi is not DiComponent");
        }
        ComposerPerformanceComponentApi composerPerformanceComponentApi = (ComposerPerformanceComponentApi) componentStorage.b(ComposerPerformanceComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) componentStorage.b(StorageComponentApi.class);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) componentStorage.b(NavigationComponentApi.class);
        if (PushComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PushComponentApi is not DiComponent");
        }
        PushComponentApi pushComponentApi = (PushComponentApi) componentStorage.b(PushComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        NetworkOzonIdComponentApi networkOzonIdComponentApi = (NetworkOzonIdComponentApi) componentStorage.b(NetworkOzonIdComponentApi.class);
        if (NetworkUserDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkUserDependencies is not DiComponent");
        }
        NetworkUserDependencies networkUserDependencies = (NetworkUserDependencies) componentStorage.b(NetworkUserDependencies.class);
        if (VideoComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component VideoComponentApi is not DiComponent");
        }
        VideoComponentApi videoComponentApi = (VideoComponentApi) componentStorage.b(VideoComponentApi.class);
        if (CheckoutPaymentComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CheckoutPaymentComponentApi is not DiComponent");
        }
        CheckoutPaymentComponentApi checkoutPaymentComponentApi = (CheckoutPaymentComponentApi) componentStorage.b(CheckoutPaymentComponentApi.class);
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        LocationComponentApi locationComponentApi = (LocationComponentApi) componentStorage.b(LocationComponentApi.class);
        if (InAppUpdateComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppUpdateComponentApi is not DiComponent");
        }
        InAppUpdateComponentApi inAppUpdateComponentApi = (InAppUpdateComponentApi) componentStorage.b(InAppUpdateComponentApi.class);
        if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
        }
        AppLocaleComponentApi appLocaleComponentApi = (AppLocaleComponentApi) componentStorage.b(AppLocaleComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        return factory.create(contextComponentDependencies, androidPlatformComponentApi, composerPerformanceComponentApi, storageComponentApi, navigationComponentApi, pushComponentApi, networkComponentApi, networkOzonIdComponentApi, networkUserDependencies, videoComponentApi, inAppUpdateComponentApi, checkoutPaymentComponentApi, locationComponentApi, appLocaleComponentApi, (AnalyticsComponentApi) componentStorage.b(AnalyticsComponentApi.class));
    }

    @NotNull
    public final InterfaceC7081a<? extends InterfaceC6958a> provideNetworkComponentFactory$debugmenu_prodGoogleAllVendorsRelease() {
        return new a();
    }
}
