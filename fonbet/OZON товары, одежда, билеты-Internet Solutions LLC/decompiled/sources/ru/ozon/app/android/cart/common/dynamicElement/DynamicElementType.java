package ru.ozon.app.android.cart.common.dynamicElement;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "VERTICAL_SPACER", "ATOM", "TEXT_ATOM", "PRICE_ATOM", "PRICE_WITH_TITLE_ATOM", "PRICE_V2_ATOM", "ANNOTATION_ATOM", "MULTILINE_BADGE_ATOM", "TIMER_ATOM", "BADGES", "CELL_WITH_SUBTITLE_24_ICON", "PRICE_LIST", "PROGRESSIVE_TEXT", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DynamicElementType[] $VALUES;
    private final int id;
    public static final DynamicElementType VERTICAL_SPACER = new DynamicElementType("VERTICAL_SPACER", 0, 1);
    public static final DynamicElementType ATOM = new DynamicElementType("ATOM", 1, 2);
    public static final DynamicElementType TEXT_ATOM = new DynamicElementType("TEXT_ATOM", 2, 3);
    public static final DynamicElementType PRICE_ATOM = new DynamicElementType("PRICE_ATOM", 3, 4);
    public static final DynamicElementType PRICE_WITH_TITLE_ATOM = new DynamicElementType("PRICE_WITH_TITLE_ATOM", 4, 5);
    public static final DynamicElementType PRICE_V2_ATOM = new DynamicElementType("PRICE_V2_ATOM", 5, 6);
    public static final DynamicElementType ANNOTATION_ATOM = new DynamicElementType("ANNOTATION_ATOM", 6, 7);
    public static final DynamicElementType MULTILINE_BADGE_ATOM = new DynamicElementType("MULTILINE_BADGE_ATOM", 7, 8);
    public static final DynamicElementType TIMER_ATOM = new DynamicElementType("TIMER_ATOM", 8, 9);
    public static final DynamicElementType BADGES = new DynamicElementType("BADGES", 9, 10);
    public static final DynamicElementType CELL_WITH_SUBTITLE_24_ICON = new DynamicElementType("CELL_WITH_SUBTITLE_24_ICON", 10, 11);
    public static final DynamicElementType PRICE_LIST = new DynamicElementType("PRICE_LIST", 11, 12);
    public static final DynamicElementType PROGRESSIVE_TEXT = new DynamicElementType("PROGRESSIVE_TEXT", 12, 13);

    private static final /* synthetic */ DynamicElementType[] $values() {
        return new DynamicElementType[]{VERTICAL_SPACER, ATOM, TEXT_ATOM, PRICE_ATOM, PRICE_WITH_TITLE_ATOM, PRICE_V2_ATOM, ANNOTATION_ATOM, MULTILINE_BADGE_ATOM, TIMER_ATOM, BADGES, CELL_WITH_SUBTITLE_24_ICON, PRICE_LIST, PROGRESSIVE_TEXT};
    }

    static {
        DynamicElementType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DynamicElementType(String str, int i11, int i12) {
        this.id = i12;
    }

    @NotNull
    public static a<DynamicElementType> getEntries() {
        return $ENTRIES;
    }

    public static DynamicElementType valueOf(String str) {
        return (DynamicElementType) Enum.valueOf(DynamicElementType.class, str);
    }

    public static DynamicElementType[] values() {
        return (DynamicElementType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
