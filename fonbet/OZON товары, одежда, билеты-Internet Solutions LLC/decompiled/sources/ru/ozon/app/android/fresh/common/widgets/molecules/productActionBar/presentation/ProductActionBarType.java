package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarType;", "", "<init>", "(Ljava/lang/String;I)V", "OUT_OF_STOCK", "BUTTON_ADULT", "BUTTON_A2C", "QUANTITY_PICKER", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductActionBarType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProductActionBarType[] $VALUES;
    public static final ProductActionBarType OUT_OF_STOCK = new ProductActionBarType("OUT_OF_STOCK", 0);
    public static final ProductActionBarType BUTTON_ADULT = new ProductActionBarType("BUTTON_ADULT", 1);
    public static final ProductActionBarType BUTTON_A2C = new ProductActionBarType("BUTTON_A2C", 2);
    public static final ProductActionBarType QUANTITY_PICKER = new ProductActionBarType("QUANTITY_PICKER", 3);

    private static final /* synthetic */ ProductActionBarType[] $values() {
        return new ProductActionBarType[]{OUT_OF_STOCK, BUTTON_ADULT, BUTTON_A2C, QUANTITY_PICKER};
    }

    static {
        ProductActionBarType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ProductActionBarType(String str, int i11) {
    }

    public static ProductActionBarType valueOf(String str) {
        return (ProductActionBarType) Enum.valueOf(ProductActionBarType.class, str);
    }

    public static ProductActionBarType[] values() {
        return (ProductActionBarType[]) $VALUES.clone();
    }
}
