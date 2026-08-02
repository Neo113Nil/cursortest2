package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.utils;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/utils/RecShelfKeys;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "GET_REC_SHELF_SKU_PARAMETER", "GET_REC_SHELF_SHELF_ID_PARAMETER", "GET_REC_SHELF_DELIVERY_SCHEME", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecShelfKeys {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RecShelfKeys[] $VALUES;

    @NotNull
    private final String key;
    public static final RecShelfKeys GET_REC_SHELF_SKU_PARAMETER = new RecShelfKeys("GET_REC_SHELF_SKU_PARAMETER", 0, "sku");
    public static final RecShelfKeys GET_REC_SHELF_SHELF_ID_PARAMETER = new RecShelfKeys("GET_REC_SHELF_SHELF_ID_PARAMETER", 1, "shelfId");
    public static final RecShelfKeys GET_REC_SHELF_DELIVERY_SCHEME = new RecShelfKeys("GET_REC_SHELF_DELIVERY_SCHEME", 2, "deliverySchema");

    private static final /* synthetic */ RecShelfKeys[] $values() {
        return new RecShelfKeys[]{GET_REC_SHELF_SKU_PARAMETER, GET_REC_SHELF_SHELF_ID_PARAMETER, GET_REC_SHELF_DELIVERY_SCHEME};
    }

    static {
        RecShelfKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private RecShelfKeys(String str, int i11, String str2) {
        this.key = str2;
    }

    public static RecShelfKeys valueOf(String str) {
        return (RecShelfKeys) Enum.valueOf(RecShelfKeys.class, str);
    }

    public static RecShelfKeys[] values() {
        return (RecShelfKeys[]) $VALUES.clone();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
