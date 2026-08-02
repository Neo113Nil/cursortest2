package ru.ozon.uni.android.ds.compose.component.price;

import Sc.o;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/android/ds/compose/component/price/DsPriceStyle;", "", "Lru/ozon/uni/core/models/UniColorToken;", "prefixColor", "priceColor", "ppuColor", "captionColor", "originalPriceColor", "discountColor", "<init>", "(Ljava/lang/String;ILru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;)V", "Lru/ozon/uni/atoms/data/price/PriceDTO$Component$TextStyle;", "textStyle", "getColor", "(Lru/ozon/uni/atoms/data/price/PriceDTO$Component$TextStyle;)Lru/ozon/uni/core/models/UniColorToken;", "Lru/ozon/uni/core/models/UniColorToken;", "getPrefixColor", "()Lru/ozon/uni/core/models/UniColorToken;", "getPriceColor", "getPpuColor", "getCaptionColor", "getOriginalPriceColor", "getDiscountColor", "ACTUAL_PRICE", "UNAVAILABLE", "SECOND_LVL", "CARD_PRICE", "CREDIT_PRICE", "SALE_PRICE", "ON_COLOR", "UNAVAILABLE_ON_COLOR", "SECOND_LVL_ON_COLOR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsPriceStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsPriceStyle[] $VALUES;
    public static final DsPriceStyle ACTUAL_PRICE;
    public static final DsPriceStyle CARD_PRICE;
    public static final DsPriceStyle CREDIT_PRICE;
    public static final DsPriceStyle ON_COLOR;
    public static final DsPriceStyle SALE_PRICE;
    public static final DsPriceStyle SECOND_LVL;
    public static final DsPriceStyle SECOND_LVL_ON_COLOR;
    public static final DsPriceStyle UNAVAILABLE;
    public static final DsPriceStyle UNAVAILABLE_ON_COLOR;

    @NotNull
    private final UniColorToken captionColor;

    @NotNull
    private final UniColorToken discountColor;

    @NotNull
    private final UniColorToken originalPriceColor;

    @NotNull
    private final UniColorToken ppuColor;

    @NotNull
    private final UniColorToken prefixColor;

    @NotNull
    private final UniColorToken priceColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceDTO.Component.TextStyle.values().length];
            try {
                iArr[PriceDTO.Component.TextStyle.PREFIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceDTO.Component.TextStyle.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceDTO.Component.TextStyle.PPU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceDTO.Component.TextStyle.CAPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PriceDTO.Component.TextStyle.ORIGINAL_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ DsPriceStyle[] $values() {
        return new DsPriceStyle[]{ACTUAL_PRICE, UNAVAILABLE, SECOND_LVL, CARD_PRICE, CREDIT_PRICE, SALE_PRICE, ON_COLOR, UNAVAILABLE_ON_COLOR, SECOND_LVL_ON_COLOR};
    }

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        ACTUAL_PRICE = new DsPriceStyle("ACTUAL_PRICE", 0, uniTheme.getColorTokens().getTextPrimary(), uniTheme.getColorTokens().getTextPrimary(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextPrimary(), uniTheme.getColorTokens().getTextOriginalpriceAvailable(), uniTheme.getColorTokens().getTextAccent());
        UNAVAILABLE = new DsPriceStyle("UNAVAILABLE", 1, uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextOriginalprice(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextOriginalprice(), uniTheme.getColorTokens().getTextDiscountUnavialable());
        SECOND_LVL = new DsPriceStyle("SECOND_LVL", 2, uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextOriginalpriceAvailable(), uniTheme.getColorTokens().getTextAccent());
        CARD_PRICE = new DsPriceStyle("CARD_PRICE", 3, uniTheme.getColorTokens().getTextPositive(), uniTheme.getColorTokens().getTextPositive(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextPositive(), uniTheme.getColorTokens().getTextOriginalpriceAvailable(), uniTheme.getColorTokens().getTextAccent());
        CREDIT_PRICE = new DsPriceStyle("CREDIT_PRICE", 4, uniTheme.getColorTokens().getTextWarning(), uniTheme.getColorTokens().getTextWarning(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextWarning(), uniTheme.getColorTokens().getTextOriginalpriceAvailable(), uniTheme.getColorTokens().getTextAccent());
        SALE_PRICE = new DsPriceStyle("SALE_PRICE", 5, uniTheme.getColorTokens().getTextLightKey(), uniTheme.getColorTokens().getTextLightKey(), uniTheme.getColorTokens().getTextTertiary(), uniTheme.getColorTokens().getTextLightKey(), uniTheme.getColorTokens().getTextOriginalpriceAvailable(), uniTheme.getColorTokens().getTextAccent());
        ON_COLOR = new DsPriceStyle("ON_COLOR", 6, uniTheme.getColorTokens().getTextPrimaryInverted(), uniTheme.getColorTokens().getTextPrimaryInverted(), uniTheme.getColorTokens().getTextSecondaryInverted(), uniTheme.getColorTokens().getTextPrimaryInverted(), uniTheme.getColorTokens().getTextSecondaryInverted(), uniTheme.getColorTokens().getTextPrimaryInverted());
        UNAVAILABLE_ON_COLOR = new DsPriceStyle("UNAVAILABLE_ON_COLOR", 7, uniTheme.getColorTokens().getTextTertiaryInverted(), uniTheme.getColorTokens().getTextTertiaryInverted(), uniTheme.getColorTokens().getTextTertiaryInverted(), uniTheme.getColorTokens().getTextTertiaryInverted(), uniTheme.getColorTokens().getTextTertiaryInverted(), uniTheme.getColorTokens().getTextTertiaryInverted());
        SECOND_LVL_ON_COLOR = new DsPriceStyle("SECOND_LVL_ON_COLOR", 8, uniTheme.getColorTokens().getTextTertiaryInverted(), uniTheme.getColorTokens().getTextTertiaryInverted(), uniTheme.getColorTokens().getTextSecondaryInverted(), uniTheme.getColorTokens().getTextTertiaryInverted(), uniTheme.getColorTokens().getTextSecondaryInverted(), uniTheme.getColorTokens().getTextPrimaryInverted());
        DsPriceStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsPriceStyle(String str, int i11, UniColorToken uniColorToken, UniColorToken uniColorToken2, UniColorToken uniColorToken3, UniColorToken uniColorToken4, UniColorToken uniColorToken5, UniColorToken uniColorToken6) {
        this.prefixColor = uniColorToken;
        this.priceColor = uniColorToken2;
        this.ppuColor = uniColorToken3;
        this.captionColor = uniColorToken4;
        this.originalPriceColor = uniColorToken5;
        this.discountColor = uniColorToken6;
    }

    public static DsPriceStyle valueOf(String str) {
        return (DsPriceStyle) Enum.valueOf(DsPriceStyle.class, str);
    }

    public static DsPriceStyle[] values() {
        return (DsPriceStyle[]) $VALUES.clone();
    }

    @NotNull
    public final UniColorToken getColor(@NotNull PriceDTO.Component.TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        int i11 = WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()];
        if (i11 == 1) {
            return this.prefixColor;
        }
        if (i11 == 2) {
            return this.priceColor;
        }
        if (i11 == 3) {
            return this.ppuColor;
        }
        if (i11 == 4) {
            return this.captionColor;
        }
        if (i11 == 5) {
            return this.originalPriceColor;
        }
        throw new o();
    }

    @NotNull
    public final UniColorToken getDiscountColor() {
        return this.discountColor;
    }
}
