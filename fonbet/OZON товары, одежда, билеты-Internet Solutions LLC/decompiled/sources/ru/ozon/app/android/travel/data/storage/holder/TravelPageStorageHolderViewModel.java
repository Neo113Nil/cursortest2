package ru.ozon.app.android.travel.data.storage.holder;

import Lm0.a;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.TravelStorageManager;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKey;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/data/storage/holder/TravelPageStorageHolderViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/data/storage/holder/TravelPageStorageHolder;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "pageStorage", "<init>", "(Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;)V", "", "logStorageWithoutOwner", "()V", "onCleared", "Lru/ozon/app/android/travel/data/storage/TravelStorageManager;", "storageManager", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKey;", "pageKey", "setUpCleanupParameters", "(Lru/ozon/app/android/travel/data/storage/TravelStorageManager;Lru/ozon/app/android/travel/data/storage/page/TravelPageKey;)V", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "getPageStorage", "()Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Lru/ozon/app/android/travel/data/storage/TravelStorageManager;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKey;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPageStorageHolderViewModel extends w0 implements TravelPageStorageHolder {
    private TravelPageKey pageKey;

    @NotNull
    private final TravelPageKeyValueStorage pageStorage;
    private TravelStorageManager storageManager;

    public TravelPageStorageHolderViewModel(@NotNull TravelPageKeyValueStorage pageStorage) {
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        this.pageStorage = pageStorage;
    }

    private final void logStorageWithoutOwner() {
        a.f17149a.i("TravelPageKeyValueStorage for pageKey=" + this.pageKey + " не очищен — нет владельца. Убедитесь, что он привязан к экрану с isStorageScopeOwner=true.", new Object[0]);
    }

    @Override // ru.ozon.app.android.travel.data.storage.holder.TravelPageStorageHolder
    @NotNull
    public TravelPageKeyValueStorage getPageStorage() {
        return this.pageStorage;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        TravelPageKey travelPageKey = this.pageKey;
        if (travelPageKey != null) {
            TravelStorageManager travelStorageManager = this.storageManager;
            if (travelStorageManager != null) {
                travelStorageManager.clearPageStorage(travelPageKey);
            } else {
                logStorageWithoutOwner();
            }
        }
    }

    public final void setUpCleanupParameters(TravelStorageManager storageManager, @NotNull TravelPageKey pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        this.storageManager = storageManager;
        this.pageKey = pageKey;
    }
}
