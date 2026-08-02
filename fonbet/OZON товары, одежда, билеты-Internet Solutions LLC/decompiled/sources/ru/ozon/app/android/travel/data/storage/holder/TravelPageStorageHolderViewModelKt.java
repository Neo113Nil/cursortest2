package ru.ozon.app.android.travel.data.storage.holder;

import a00.h;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "pageStorage", "Lru/ozon/app/android/travel/data/storage/holder/TravelPageStorageHolderViewModel;", "createTravelPageStorageHolderVM", "(La00/h;Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;)Lru/ozon/app/android/travel/data/storage/holder/TravelPageStorageHolderViewModel;", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "getTravelPageStorageHolderVM", "(Lru/ozon/app/android/composer/ConfiguratorReferences;Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;)Lru/ozon/app/android/travel/data/storage/holder/TravelPageStorageHolderViewModel;", "storage_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPageStorageHolderViewModelKt {
    @NotNull
    public static final TravelPageStorageHolderViewModel createTravelPageStorageHolderVM(@NotNull h hVar, @NotNull final TravelPageKeyValueStorage pageStorage) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        return (TravelPageStorageHolderViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.travel.data.storage.holder.TravelPageStorageHolderViewModelKt$createTravelPageStorageHolderVM$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new TravelPageStorageHolderViewModel(TravelPageKeyValueStorage.this);
            }
        }).a(TravelPageStorageHolderViewModel.class);
    }

    @NotNull
    public static final TravelPageStorageHolderViewModel getTravelPageStorageHolderVM(@NotNull ConfiguratorReferences configuratorReferences, @NotNull TravelPageKeyValueStorage pageStorage) {
        Intrinsics.checkNotNullParameter(configuratorReferences, "<this>");
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        return createTravelPageStorageHolderVM(configuratorReferences.getViewModelOwnerProvider(), pageStorage);
    }
}
