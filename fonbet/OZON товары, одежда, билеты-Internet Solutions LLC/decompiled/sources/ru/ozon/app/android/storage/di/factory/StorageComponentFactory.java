package ru.ozon.app.android.storage.di.factory;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.storage.di.DaggerStorageComponent;
import ru.ozon.app.android.storage.di.StorageComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentDependencies;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storage/di/factory/StorageComponentFactory;", "Lii/a;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/storage/di/StorageComponentApi;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StorageComponentFactory implements InterfaceC7081a<StorageComponentApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public StorageComponentApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        StorageComponent.Factory factory = DaggerStorageComponent.factory();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (StorageComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentDependencies is not DiComponent");
        }
        StorageComponentDependencies storageComponentDependencies = (StorageComponentDependencies) componentStorage.b(StorageComponentDependencies.class);
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        return factory.create(contextComponentDependencies, storageComponentDependencies, (Limb2ComponentApi) componentStorage.b(Limb2ComponentApi.class));
    }
}
