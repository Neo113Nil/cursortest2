package ru.ozon.app.android.storage.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/storage/di/StorageComponent;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Factory", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StorageComponent extends StorageComponentApi {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storage/di/StorageComponent$Factory;", "", "create", "Lru/ozon/app/android/storage/di/StorageComponent;", "dependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "storageComponentDependencies", "Lru/ozon/app/android/storage/di/StorageComponentDependencies;", "limb2ComponentApi", "Lru/ozon/app/android/limb/Limb2ComponentApi;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        StorageComponent create(@NotNull ContextComponentDependencies dependencies, @NotNull StorageComponentDependencies storageComponentDependencies, @NotNull Limb2ComponentApi limb2ComponentApi);
    }
}
