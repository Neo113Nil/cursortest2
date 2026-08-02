package ru.ozon.app.android.cart.domain.di.factory;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.domain.di.CartDomainComponent;
import ru.ozon.app.android.cart.domain.di.DaggerCartDomainComponent;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/domain/di/factory/CartDomainComponentFactory;", "Lii/a;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartDomainComponentFactory implements InterfaceC7081a<CartServiceApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public CartServiceApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        CartDomainComponent.Factory factory = DaggerCartDomainComponent.factory();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) componentStorage.b(NavigationComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) componentStorage.b(AnalyticsComponentApi.class);
        if (CartComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartComponentApi is not DiComponent");
        }
        CartComponentApi cartComponentApi = (CartComponentApi) componentStorage.b(CartComponentApi.class);
        if (CacheHandlerRegistrationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CacheHandlerRegistrationComponentApi is not DiComponent");
        }
        CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi = (CacheHandlerRegistrationComponentApi) componentStorage.b(CacheHandlerRegistrationComponentApi.class);
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) componentStorage.b(ComposerComponentApi.class);
        if (CacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CacheComponentApi is not DiComponent");
        }
        CacheComponentApi cacheComponentApi = (CacheComponentApi) componentStorage.b(CacheComponentApi.class);
        if (CoroutineDispatchersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CoroutineDispatchersComponentApi is not DiComponent");
        }
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) componentStorage.b(CoroutineDispatchersComponentApi.class);
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) componentStorage.b(AnalyticsScreenStorageComponentApi.class);
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) componentStorage.b(ActionComponentApi.class);
        if (StorefrontCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorefrontCommonComponentApi is not DiComponent");
        }
        return factory.create(navigationComponentApi, networkComponentApi, analyticsComponentApi, cartComponentApi, cacheHandlerRegistrationComponentApi, composerComponentApi, cacheComponentApi, coroutineDispatchersComponentApi, analyticsScreenStorageComponentApi, actionComponentApi, (StorefrontCommonComponentApi) componentStorage.b(StorefrontCommonComponentApi.class));
    }
}
