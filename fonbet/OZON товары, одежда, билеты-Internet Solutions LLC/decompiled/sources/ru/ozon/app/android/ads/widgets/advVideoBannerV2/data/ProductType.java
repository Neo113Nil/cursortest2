package ru.ozon.app.android.ads.widgets.advVideoBannerV2.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "OZON_PRODUCT", "EXTERNAL_PRODUCT", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProductType[] $VALUES;
    public static final ProductType INVALID = new ProductType("INVALID", 0);
    public static final ProductType OZON_PRODUCT = new ProductType("OZON_PRODUCT", 1);
    public static final ProductType EXTERNAL_PRODUCT = new ProductType("EXTERNAL_PRODUCT", 2);

    private static final /* synthetic */ ProductType[] $values() {
        return new ProductType[]{INVALID, OZON_PRODUCT, EXTERNAL_PRODUCT};
    }

    static {
        ProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ProductType(String str, int i11) {
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }
}
