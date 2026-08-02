package ru.ozon.app.android.checkoutgeo.address.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/di/AddressComponent;", "Lru/ozon/app/android/checkoutgeo/address/di/AddressComponentApi;", "Factory", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressComponent extends AddressComponentApi {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/di/AddressComponent$Factory;", "", "create", "Lru/ozon/app/android/checkoutgeo/address/di/AddressComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "tabsComponentApi", "Lru/ozon/app/android/tabbar/di/TabsComponentApi;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        AddressComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull TabsComponentApi tabsComponentApi, @NotNull LocationComponentApi locationComponentApi, @NotNull StorageComponentApi storageComponentApi);
    }
}
