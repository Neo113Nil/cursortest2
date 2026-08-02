package ru.ozon.app.android.travel.data.storage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class TravelStorageManagerHolderImpl$travelStorageManager$2 extends C7735q implements Function0<TravelStorageManager> {
    public static final TravelStorageManagerHolderImpl$travelStorageManager$2 INSTANCE = new TravelStorageManagerHolderImpl$travelStorageManager$2();

    TravelStorageManagerHolderImpl$travelStorageManager$2() {
        super(0, TravelStorageManagerImplKt.class, "getTravelStorageManagerNewInstance", "getTravelStorageManagerNewInstance()Lru/ozon/app/android/travel/data/storage/TravelStorageManager;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TravelStorageManager invoke() {
        return TravelStorageManagerImplKt.getTravelStorageManagerNewInstance();
    }
}
