package ru.ozon.app.android.product.skuthinscroll.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "", "<init>", "(Ljava/lang/String;I)V", "WIDTH_INVALID", "WIDTH_220", "WIDTH_248", "WIDTH_FILL", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SkuThinScrollWidth {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SkuThinScrollWidth[] $VALUES;
    public static final SkuThinScrollWidth WIDTH_INVALID = new SkuThinScrollWidth("WIDTH_INVALID", 0);
    public static final SkuThinScrollWidth WIDTH_220 = new SkuThinScrollWidth("WIDTH_220", 1);
    public static final SkuThinScrollWidth WIDTH_248 = new SkuThinScrollWidth("WIDTH_248", 2);
    public static final SkuThinScrollWidth WIDTH_FILL = new SkuThinScrollWidth("WIDTH_FILL", 3);

    private static final /* synthetic */ SkuThinScrollWidth[] $values() {
        return new SkuThinScrollWidth[]{WIDTH_INVALID, WIDTH_220, WIDTH_248, WIDTH_FILL};
    }

    static {
        SkuThinScrollWidth[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SkuThinScrollWidth(String str, int i11) {
    }

    @NotNull
    public static a<SkuThinScrollWidth> getEntries() {
        return $ENTRIES;
    }

    public static SkuThinScrollWidth valueOf(String str) {
        return (SkuThinScrollWidth) Enum.valueOf(SkuThinScrollWidth.class, str);
    }

    public static SkuThinScrollWidth[] values() {
        return (SkuThinScrollWidth[]) $VALUES.clone();
    }
}
