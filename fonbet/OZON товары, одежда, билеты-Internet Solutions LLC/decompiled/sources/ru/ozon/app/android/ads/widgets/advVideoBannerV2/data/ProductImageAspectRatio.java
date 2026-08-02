package ru.ozon.app.android.ads.widgets.advVideoBannerV2.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductImageAspectRatio;", "", "imageWidth", "", "<init>", "(Ljava/lang/String;II)V", "getImageWidth", "()I", "RATIO_1_1", "RATIO_3_4", "RATIO_4_3", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductImageAspectRatio {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProductImageAspectRatio[] $VALUES;
    public static final ProductImageAspectRatio RATIO_1_1 = new ProductImageAspectRatio("RATIO_1_1", 0, 32);
    public static final ProductImageAspectRatio RATIO_3_4 = new ProductImageAspectRatio("RATIO_3_4", 1, 24);
    public static final ProductImageAspectRatio RATIO_4_3 = new ProductImageAspectRatio("RATIO_4_3", 2, 40);
    private final int imageWidth;

    private static final /* synthetic */ ProductImageAspectRatio[] $values() {
        return new ProductImageAspectRatio[]{RATIO_1_1, RATIO_3_4, RATIO_4_3};
    }

    static {
        ProductImageAspectRatio[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ProductImageAspectRatio(String str, int i11, int i12) {
        this.imageWidth = i12;
    }

    public static ProductImageAspectRatio valueOf(String str) {
        return (ProductImageAspectRatio) Enum.valueOf(ProductImageAspectRatio.class, str);
    }

    public static ProductImageAspectRatio[] values() {
        return (ProductImageAspectRatio[]) $VALUES.clone();
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }
}
