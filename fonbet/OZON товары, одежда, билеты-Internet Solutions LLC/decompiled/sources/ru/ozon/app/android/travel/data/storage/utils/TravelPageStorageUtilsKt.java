package ru.ozon.app.android.travel.data.storage.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.data.storage.holder.TravelPageStorageHolder;
import ru.ozon.app.android.travel.data.storage.holder.TravelPageStorageHolderViewModelKt;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorageImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/data/storage/holder/TravelPageStorageHolder;", "getTravelPageStorageHolder", "(Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/travel/data/storage/holder/TravelPageStorageHolder;", "Ll10/i;", "(Ll10/i;)Lru/ozon/app/android/travel/data/storage/holder/TravelPageStorageHolder;", "storage_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPageStorageUtilsKt {
    @NotNull
    public static final TravelPageStorageHolder getTravelPageStorageHolder(@NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(composerReferences, "<this>");
        return TravelPageStorageHolderViewModelKt.createTravelPageStorageHolderVM(composerReferences.getViewModelOwnerProvider(), new TravelPageKeyValueStorageImpl());
    }

    @NotNull
    public static final TravelPageStorageHolder getTravelPageStorageHolder(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return TravelPageStorageHolderViewModelKt.createTravelPageStorageHolderVM(iVar.b0(), new TravelPageKeyValueStorageImpl());
    }
}
