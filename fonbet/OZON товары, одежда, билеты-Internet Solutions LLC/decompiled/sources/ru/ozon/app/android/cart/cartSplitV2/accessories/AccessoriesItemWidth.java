package ru.ozon.app.android.cart.cartSplitV2.accessories;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemWidth;", "", "<init>", "(Ljava/lang/String;I)V", "WIDTH_INVALID", "WIDTH_220", "WIDTH_248", "WIDTH_FILL", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccessoriesItemWidth {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AccessoriesItemWidth[] $VALUES;
    public static final AccessoriesItemWidth WIDTH_INVALID = new AccessoriesItemWidth("WIDTH_INVALID", 0);
    public static final AccessoriesItemWidth WIDTH_220 = new AccessoriesItemWidth("WIDTH_220", 1);
    public static final AccessoriesItemWidth WIDTH_248 = new AccessoriesItemWidth("WIDTH_248", 2);
    public static final AccessoriesItemWidth WIDTH_FILL = new AccessoriesItemWidth("WIDTH_FILL", 3);

    private static final /* synthetic */ AccessoriesItemWidth[] $values() {
        return new AccessoriesItemWidth[]{WIDTH_INVALID, WIDTH_220, WIDTH_248, WIDTH_FILL};
    }

    static {
        AccessoriesItemWidth[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AccessoriesItemWidth(String str, int i11) {
    }

    public static AccessoriesItemWidth valueOf(String str) {
        return (AccessoriesItemWidth) Enum.valueOf(AccessoriesItemWidth.class, str);
    }

    public static AccessoriesItemWidth[] values() {
        return (AccessoriesItemWidth[]) $VALUES.clone();
    }
}
