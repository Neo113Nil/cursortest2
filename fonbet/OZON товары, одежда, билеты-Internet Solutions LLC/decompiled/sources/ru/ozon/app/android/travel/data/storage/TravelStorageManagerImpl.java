package ru.ozon.app.android.travel.data.storage;

import java.util.EnumMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKey;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorageImpl;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/data/storage/TravelStorageManagerImpl;", "Lru/ozon/app/android/travel/data/storage/TravelStorageManager;", "<init>", "()V", "storages", "Ljava/util/EnumMap;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKey;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "getOrCreatePageStorage", "pageKey", "clearPageStorage", "", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelStorageManagerImpl implements TravelStorageManager {

    @NotNull
    private final EnumMap<TravelPageKey, TravelPageKeyValueStorage> storages = new EnumMap<>(TravelPageKey.class);

    @Override // ru.ozon.app.android.travel.data.storage.TravelStorageManager
    public void clearPageStorage(@NotNull TravelPageKey pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        TravelPageKeyValueStorage remove = this.storages.remove(pageKey);
        if (remove != null) {
            remove.clear();
        }
    }

    @Override // ru.ozon.app.android.travel.data.storage.TravelStorageManager
    @NotNull
    public TravelPageKeyValueStorage getOrCreatePageStorage(@NotNull TravelPageKey pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        EnumMap<TravelPageKey, TravelPageKeyValueStorage> enumMap = this.storages;
        TravelPageKeyValueStorage travelPageKeyValueStorage = enumMap.get(pageKey);
        if (travelPageKeyValueStorage == null) {
            travelPageKeyValueStorage = new TravelPageKeyValueStorageImpl();
            enumMap.put((EnumMap<TravelPageKey, TravelPageKeyValueStorage>) pageKey, (TravelPageKey) travelPageKeyValueStorage);
        }
        return travelPageKeyValueStorage;
    }
}
