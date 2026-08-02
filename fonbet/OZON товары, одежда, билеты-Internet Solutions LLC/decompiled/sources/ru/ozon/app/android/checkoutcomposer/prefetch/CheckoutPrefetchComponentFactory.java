package ru.ozon.app.android.checkoutcomposer.prefetch;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchApi;
import ru.ozon.app.android.checkoutcomposer.prefetch.CheckoutPrefetchComponent;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutPrefetchComponentFactory;", "Lii/a;", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchApi;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutPrefetchComponentFactory implements InterfaceC7081a<CheckoutPrefetchApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public CheckoutPrefetchApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        CheckoutPrefetchComponent.Factory factory = DaggerCheckoutPrefetchComponent.factory();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) componentStorage.b(ComposerComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) componentStorage.b(StorageComponentApi.class);
        if (CacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CacheComponentApi is not DiComponent");
        }
        CacheComponentApi cacheComponentApi = (CacheComponentApi) componentStorage.b(CacheComponentApi.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) componentStorage.b(AndroidPlatformComponentApi.class);
        if (CacheHandlerRegistrationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CacheHandlerRegistrationComponentApi is not DiComponent");
        }
        CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi = (CacheHandlerRegistrationComponentApi) componentStorage.b(CacheHandlerRegistrationComponentApi.class);
        if (CoroutineDispatchersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CoroutineDispatchersComponentApi is not DiComponent");
        }
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) componentStorage.b(CoroutineDispatchersComponentApi.class);
        if (CheckoutPaymentComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CheckoutPaymentComponentApi is not DiComponent");
        }
        CheckoutPaymentComponentApi checkoutPaymentComponentApi = (CheckoutPaymentComponentApi) componentStorage.b(CheckoutPaymentComponentApi.class);
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        return factory.create(composerComponentApi, networkComponentApi, storageComponentApi, cacheComponentApi, contextComponentDependencies, cacheHandlerRegistrationComponentApi, androidPlatformComponentApi, coroutineDispatchersComponentApi, checkoutPaymentComponentApi, (LocationComponentApi) componentStorage.b(LocationComponentApi.class));
    }
}
