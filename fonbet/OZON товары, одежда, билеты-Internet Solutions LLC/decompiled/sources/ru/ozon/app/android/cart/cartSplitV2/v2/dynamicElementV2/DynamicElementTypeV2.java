package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementTypeV2;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "VERTICAL_SPACER", "TEXT_V2_ATOM", "PRICE_V2_ATOM", "ANNOTATION_ATOM", "CELL_V2_ATOM", "BADGES", "PRICE_LIST", "PROGRESSIVE_TEXT", "PRICE_FLEX_LIST", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementTypeV2 {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DynamicElementTypeV2[] $VALUES;
    private final int id;
    public static final DynamicElementTypeV2 VERTICAL_SPACER = new DynamicElementTypeV2("VERTICAL_SPACER", 0, 101);
    public static final DynamicElementTypeV2 TEXT_V2_ATOM = new DynamicElementTypeV2("TEXT_V2_ATOM", 1, 102);
    public static final DynamicElementTypeV2 PRICE_V2_ATOM = new DynamicElementTypeV2("PRICE_V2_ATOM", 2, 103);
    public static final DynamicElementTypeV2 ANNOTATION_ATOM = new DynamicElementTypeV2("ANNOTATION_ATOM", 3, 104);
    public static final DynamicElementTypeV2 CELL_V2_ATOM = new DynamicElementTypeV2("CELL_V2_ATOM", 4, 105);
    public static final DynamicElementTypeV2 BADGES = new DynamicElementTypeV2("BADGES", 5, 106);
    public static final DynamicElementTypeV2 PRICE_LIST = new DynamicElementTypeV2("PRICE_LIST", 6, 107);
    public static final DynamicElementTypeV2 PROGRESSIVE_TEXT = new DynamicElementTypeV2("PROGRESSIVE_TEXT", 7, 108);
    public static final DynamicElementTypeV2 PRICE_FLEX_LIST = new DynamicElementTypeV2("PRICE_FLEX_LIST", 8, 110);

    private static final /* synthetic */ DynamicElementTypeV2[] $values() {
        return new DynamicElementTypeV2[]{VERTICAL_SPACER, TEXT_V2_ATOM, PRICE_V2_ATOM, ANNOTATION_ATOM, CELL_V2_ATOM, BADGES, PRICE_LIST, PROGRESSIVE_TEXT, PRICE_FLEX_LIST};
    }

    static {
        DynamicElementTypeV2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DynamicElementTypeV2(String str, int i11, int i12) {
        this.id = i12;
    }

    public static DynamicElementTypeV2 valueOf(String str) {
        return (DynamicElementTypeV2) Enum.valueOf(DynamicElementTypeV2.class, str);
    }

    public static DynamicElementTypeV2[] values() {
        return (DynamicElementTypeV2[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
