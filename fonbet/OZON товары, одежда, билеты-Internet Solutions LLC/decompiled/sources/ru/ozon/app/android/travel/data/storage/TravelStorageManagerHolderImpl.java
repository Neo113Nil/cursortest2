package ru.ozon.app.android.travel.data.storage;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolderImpl;", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "<init>", "()V", "Lru/ozon/app/android/travel/data/storage/TravelStorageManager;", "travelStorageManager$delegate", "LSc/j;", "getTravelStorageManager", "()Lru/ozon/app/android/travel/data/storage/TravelStorageManager;", "travelStorageManager", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelStorageManagerHolderImpl implements TravelStorageManagerHolder {

    /* renamed from: travelStorageManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j travelStorageManager = k.b(TravelStorageManagerHolderImpl$travelStorageManager$2.INSTANCE);

    @Override // ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder
    @NotNull
    public TravelStorageManager getTravelStorageManager() {
        return (TravelStorageManager) this.travelStorageManager.getValue();
    }
}
