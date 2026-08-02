package ru.ozon.uni.atoms.data.controls.button;

import kotlin.Metadata;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"styleResource", "", "Lru/ozon/uni/atoms/data/controls/button/Style;", "getStyleResource", "(Lru/ozon/uni/atoms/data/controls/button/Style;)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonColorSettingsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.ACTION_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Style.ACTION_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Style.ACTION_TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Style.ACCENT_PRIMARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Style.ACCENT_SECONDARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Style.NEUTRAL_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Style.NEUTRAL_TERTIARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Style.NEGATIVE_SECONDARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Style.TRANSPARENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Style.APPLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Style.GOSUSLUGI.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Style.BIG_PROMO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Style.FRESH_PRIMARY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Style.POSITIVE_PRIMARY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStyleResource(Style style) {
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                return R$style.Button_ActionPrimary_Dynamic;
            case 2:
                return R$style.Button_ActionSecondary;
            case 3:
                return R$style.Button_ActionTertiary;
            case 4:
                return R$style.Button_AccentPrimary;
            case 5:
                return R$style.Button_AccentSecondary;
            case 6:
                return R$style.Button_NeutralSecondary;
            case 7:
                return R$style.Button_NeutralTertiary;
            case 8:
                return R$style.Button_NegativeSecondary;
            case 9:
                return R$style.Button_Transparent;
            case 10:
                return R$style.Button_Apple;
            case 11:
                return R$style.Button_Gosuslugi;
            case 12:
                return R$style.Button_BigPromo;
            case 13:
                return R$style.Button_FreshPrimary;
            case 14:
                return R$style.Button_PositivePrimary;
            default:
                return R$style.Button_ActionPrimary_Dynamic;
        }
    }
}
