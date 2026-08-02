package ru.ozon.app.android.ads.di.messaging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/ads/di/messaging/AdvertisingMessagingDependencyComponent;", "Lru/ozon/app/android/ads/di/messaging/AdvertisingMessagingApi;", "Factory", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdvertisingMessagingDependencyComponent extends AdvertisingMessagingApi {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/di/messaging/AdvertisingMessagingDependencyComponent$Factory;", "", "create", "Lru/ozon/app/android/ads/di/messaging/AdvertisingMessagingDependencyComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        AdvertisingMessagingDependencyComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull StorageComponentApi storageComponentApi);
    }
}
