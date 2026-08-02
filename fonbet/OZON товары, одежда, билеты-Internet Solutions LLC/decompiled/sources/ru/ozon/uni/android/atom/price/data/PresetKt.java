package ru.ozon.uni.android.atom.price.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Spacings;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003¨\u0006\u000e"}, d2 = {"size200", "Lru/ozon/uni/android/atom/price/data/PricePreset;", "getSize200", "()Lru/ozon/uni/android/atom/price/data/PricePreset;", "size300", "getSize300", "size400", "getSize400", "size500", "getSize500", "size600", "getSize600", "size800", "getSize800", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PresetKt {

    @NotNull
    private static final PricePreset size200;

    @NotNull
    private static final PricePreset size300;

    @NotNull
    private static final PricePreset size400;

    @NotNull
    private static final PricePreset size500;

    @NotNull
    private static final PricePreset size600;

    @NotNull
    private static final PricePreset size800;

    static {
        UniTextStyles uniTextStyles = UniTextStyles.BODY_CONTROL_300_X_SMALL;
        PriceTextAppearance priceTextAppearance = new PriceTextAppearance(uniTextStyles.getResId(), UniTextStyles.BODY_ACCENT_300_X_SMALL.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId());
        Spacings spacings = Spacings.SPACING_4;
        size200 = new PricePreset(priceTextAppearance, 12, spacings.getPx(), Spacings.SPACING_3.getPx(), CornerRadius.RADIUS_200.getPx(), 16, 0, 0, 192, null);
        PriceTextAppearance priceTextAppearance2 = new PriceTextAppearance(uniTextStyles.getResId(), UniTextStyles.BODY_ACCENT_400_SMALL.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId());
        int px = spacings.getPx();
        int px2 = spacings.getPx();
        CornerRadius cornerRadius = CornerRadius.RADIUS_250;
        size300 = new PricePreset(priceTextAppearance2, 14, px, px2, cornerRadius.getPx(), 20, 0, 0, 192, null);
        size400 = new PricePreset(new PriceTextAppearance(uniTextStyles.getResId(), UniTextStyles.HEADLINE_400_SMALL.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId(), uniTextStyles.getResId()), 16, spacings.getPx(), Spacings.SPACING_5.getPx(), cornerRadius.getPx(), 20, 0, 0, 192, null);
        UniTextStyles uniTextStyles2 = UniTextStyles.BODY_CONTROL_400_SMALL;
        PriceTextAppearance priceTextAppearance3 = new PriceTextAppearance(uniTextStyles2.getResId(), UniTextStyles.HEADLINE_500_MEDIUM.getResId(), uniTextStyles2.getResId(), uniTextStyles2.getResId(), uniTextStyles2.getResId(), uniTextStyles2.getResId());
        int px3 = spacings.getPx();
        Spacings spacings2 = Spacings.SPACING_6;
        size500 = new PricePreset(priceTextAppearance3, 20, px3, spacings2.getPx(), cornerRadius.getPx(), 24, 0, 0, 192, null);
        UniTextStyles uniTextStyles3 = UniTextStyles.BODY_CONTROL_500_MEDIUM;
        size600 = new PricePreset(new PriceTextAppearance(uniTextStyles3.getResId(), UniTextStyles.HEADLINE_600_LARGE.getResId(), uniTextStyles3.getResId(), uniTextStyles3.getResId(), uniTextStyles3.getResId(), uniTextStyles3.getResId()), 24, spacings2.getPx(), Spacings.SPACING_8.getPx(), CornerRadius.RADIUS_300.getPx(), 28, 0, 0, 192, null);
        size800 = new PricePreset(new PriceTextAppearance(uniTextStyles3.getResId(), UniTextStyles.HEADLINE_800_X_X_LARGE.getResId(), uniTextStyles3.getResId(), uniTextStyles3.getResId(), uniTextStyles3.getResId(), uniTextStyles3.getResId()), 32, spacings2.getPx(), Spacings.SPACING_10.getPx(), CornerRadius.RADIUS_350.getPx(), 36, 0, 0, 192, null);
    }

    @NotNull
    public static final PricePreset getSize200() {
        return size200;
    }

    @NotNull
    public static final PricePreset getSize300() {
        return size300;
    }

    @NotNull
    public static final PricePreset getSize400() {
        return size400;
    }

    @NotNull
    public static final PricePreset getSize500() {
        return size500;
    }

    @NotNull
    public static final PricePreset getSize600() {
        return size600;
    }

    @NotNull
    public static final PricePreset getSize800() {
        return size800;
    }
}
