package ru.ozon.uni.android.ds.compose.component.price;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toStyle", "Lru/ozon/uni/android/ds/compose/component/price/DsPriceStyle;", "Lru/ozon/uni/atoms/data/price/PriceDTO$PriceStyle$StyleType;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsPriceStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceDTO.PriceStyle.StyleType.values().length];
            try {
                iArr[PriceDTO.PriceStyle.StyleType.ACTUAL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceDTO.PriceStyle.StyleType.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceDTO.PriceStyle.StyleType.SECOND_LVL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceDTO.PriceStyle.StyleType.CARD_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PriceDTO.PriceStyle.StyleType.CREDIT_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PriceDTO.PriceStyle.StyleType.SALE_PRICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PriceDTO.PriceStyle.StyleType.ON_COLOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PriceDTO.PriceStyle.StyleType.UNAVAILABLE_ON_COLOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PriceDTO.PriceStyle.StyleType.SECOND_LVL_ON_COLOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final DsPriceStyle toStyle(@NotNull PriceDTO.PriceStyle.StyleType styleType) {
        Intrinsics.checkNotNullParameter(styleType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[styleType.ordinal()]) {
            case 1:
                return DsPriceStyle.ACTUAL_PRICE;
            case 2:
                return DsPriceStyle.UNAVAILABLE;
            case 3:
                return DsPriceStyle.SECOND_LVL;
            case 4:
                return DsPriceStyle.CARD_PRICE;
            case 5:
                return DsPriceStyle.CREDIT_PRICE;
            case 6:
                return DsPriceStyle.SALE_PRICE;
            case 7:
                return DsPriceStyle.ON_COLOR;
            case 8:
                return DsPriceStyle.UNAVAILABLE_ON_COLOR;
            case 9:
                return DsPriceStyle.SECOND_LVL_ON_COLOR;
            default:
                throw new o();
        }
    }
}
