package ru.ozon.app.android.travel.data.storage.initializer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.data.storage.TravelStorageManager;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.holder.TravelPageStorageHolderViewModel;
import ru.ozon.app.android.travel.data.storage.holder.TravelPageStorageHolderViewModelKt;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKey;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/data/storage/initializer/TravelPageStorageInitializerConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "storageManagerHolder", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "pageKey", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKey;", "isStorageScopeOwner", "", "<init>", "(Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;Lru/ozon/app/android/travel/data/storage/page/TravelPageKey;Z)V", "onComposerInitialized", "", "onPageStorageInitialized", "pageStorage", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TravelPageStorageInitializerConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final boolean isStorageScopeOwner;

    @NotNull
    private final TravelPageKey pageKey;

    @NotNull
    private final TravelStorageManagerHolder storageManagerHolder;

    public TravelPageStorageInitializerConfigurator(@NotNull TravelStorageManagerHolder storageManagerHolder, @NotNull TravelPageKey pageKey, boolean z11) {
        Intrinsics.checkNotNullParameter(storageManagerHolder, "storageManagerHolder");
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        this.storageManagerHolder = storageManagerHolder;
        this.pageKey = pageKey;
        this.isStorageScopeOwner = z11;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        TravelStorageManager travelStorageManager = this.storageManagerHolder.getTravelStorageManager();
        TravelPageKeyValueStorage orCreatePageStorage = travelStorageManager.getOrCreatePageStorage(this.pageKey);
        TravelPageStorageHolderViewModel travelPageStorageHolderVM = TravelPageStorageHolderViewModelKt.getTravelPageStorageHolderVM(references, orCreatePageStorage);
        if (!this.isStorageScopeOwner) {
            travelStorageManager = null;
        }
        travelPageStorageHolderVM.setUpCleanupParameters(travelStorageManager, this.pageKey);
        onPageStorageInitialized(orCreatePageStorage);
    }

    protected void onPageStorageInitialized(@NotNull TravelPageKeyValueStorage pageStorage) {
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
    }
}
