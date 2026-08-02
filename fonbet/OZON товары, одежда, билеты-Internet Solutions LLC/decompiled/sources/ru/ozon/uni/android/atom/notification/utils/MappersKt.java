package ru.ozon.uni.android.atom.notification.utils;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\n*\u00020\tH\u0000\u001a\f\u0010\u0012\u001a\u00020\r*\u00020\fH\u0000\u001a\f\u0010\u0013\u001a\u00020\u0010*\u00020\u000fH\u0000\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u0016H\u0000\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0000\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0000\u001a\f\u0010 \u001a\u00020\u0019*\u00020\u0018H\u0000\u001a\f\u0010!\u001a\u00020\u001c*\u00020\u001bH\u0000\u001a\f\u0010\"\u001a\u00020\u001f*\u00020\u001eH\u0000\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"defaultCloseIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "defaultDisclosureIconButton", "defaultLeftContentIcon", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon;", "toConfigLeftContent", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$LeftContent;", "toConfigIconSize", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Size;", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "toConfigIconShape", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$Shape;", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "toConfigIconFitType", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon$FitType;", "Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;", "toIconSize", "toIconShape", "toIconFitType", "toConfigRightContent", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$RightContent;", "toConfigButtonSize", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button$ButtonSize;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "toConfigIconButtonSize", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon$IconButtonSize;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "toConfigButtonStyle", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$ButtonStyle;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "toButtonSize", "toIconButtonSize", "toButtonStyle", "toConfigAlignment", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Alignment;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MappersKt {

    @NotNull
    private static final IconButtonV3DTO defaultCloseIconButton;

    @NotNull
    private static final IconButtonV3DTO defaultDisclosureIconButton;

    @NotNull
    private static final NotificationBarViewConfig.LeftContent.Icon defaultLeftContentIcon;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$11;
        public static final /* synthetic */ int[] $EnumSwitchMapping$12;
        public static final /* synthetic */ int[] $EnumSwitchMapping$13;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[IconDTO.IconSize.values().length];
            try {
                iArr[IconDTO.IconSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconDTO.IconSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconDTO.IconSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconDTO.IconSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IconDTO.IconSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IconDTO.IconSize.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IconDTO.IconSize.SIZE_800.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IconDTO.IconSize.SIZE_900.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconDTO.IconShape.values().length];
            try {
                iArr2[IconDTO.IconShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[IconDTO.IconShape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[IconDTO.IconShape.SHAPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[IconDTO.IconShape.SHAPE_SQUIRCLE_FORCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[IconDTO.FitType.values().length];
            try {
                iArr3[IconDTO.FitType.FILL_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[IconDTO.FitType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[NotificationBarViewConfig.LeftContent.Icon.Size.values().length];
            try {
                iArr4[NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_800.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_900.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[NotificationBarViewConfig.LeftContent.Icon.Shape.values().length];
            try {
                iArr5[NotificationBarViewConfig.LeftContent.Icon.Shape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[NotificationBarViewConfig.LeftContent.Icon.Shape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[NotificationBarViewConfig.LeftContent.Icon.Shape.SHAPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[NotificationBarViewConfig.LeftContent.Icon.Shape.SHAPE_SQUIRCLE_FORCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[NotificationBarViewConfig.LeftContent.Icon.FitType.values().length];
            try {
                iArr6[NotificationBarViewConfig.LeftContent.Icon.FitType.FILL_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[NotificationBarViewConfig.LeftContent.Icon.FitType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[NotificationDTO.RightContent.ButtonType.values().length];
            try {
                iArr7[NotificationDTO.RightContent.ButtonType.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[NotificationDTO.RightContent.ButtonType.DISCLOSURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[NotificationDTO.RightContent.ButtonType.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[NotificationDTO.RightContent.ButtonType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[ButtonV3DTO.Sizes.values().length];
            try {
                iArr8[ButtonV3DTO.Sizes.SIZE_400.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr8[ButtonV3DTO.Sizes.SIZE_500.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr8[ButtonV3DTO.Sizes.SIZE_600.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[ButtonV3DTO.Sizes.SIZE_700.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[IconButtonV3DTO.Sizes.values().length];
            try {
                iArr9[IconButtonV3DTO.Sizes.SIZE_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr9[IconButtonV3DTO.Sizes.SIZE_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr9[IconButtonV3DTO.Sizes.SIZE_450.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr9[IconButtonV3DTO.Sizes.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr9[IconButtonV3DTO.Sizes.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr9[IconButtonV3DTO.Sizes.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[ButtonV3DTO.StyleTypes.values().length];
            try {
                iArr10[ButtonV3DTO.StyleTypes.NEUTRAL_SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr10[ButtonV3DTO.StyleTypes.ACTION_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr10[ButtonV3DTO.StyleTypes.ACTION_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr10[ButtonV3DTO.StyleTypes.ACCENT_PRIMARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr10[ButtonV3DTO.StyleTypes.ACCENT_SECONDARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr10[ButtonV3DTO.StyleTypes.NEGATIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr10[ButtonV3DTO.StyleTypes.CUSTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[NotificationBarViewConfig.RightContent.Button.ButtonSize.values().length];
            try {
                iArr11[NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_400.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr11[NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_500.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr11[NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_600.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr11[NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_700.ordinal()] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            $EnumSwitchMapping$10 = iArr11;
            int[] iArr12 = new int[NotificationBarViewConfig.RightContent.Icon.IconButtonSize.values().length];
            try {
                iArr12[NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr12[NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr12[NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_450.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr12[NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr12[NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr12[NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused59) {
            }
            $EnumSwitchMapping$11 = iArr12;
            int[] iArr13 = new int[NotificationBarViewConfig.RightContent.ButtonStyle.values().length];
            try {
                iArr13[NotificationBarViewConfig.RightContent.ButtonStyle.ACTION_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr13[NotificationBarViewConfig.RightContent.ButtonStyle.ACTION_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr13[NotificationBarViewConfig.RightContent.ButtonStyle.ACCENT_PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr13[NotificationBarViewConfig.RightContent.ButtonStyle.ACCENT_SECONDARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr13[NotificationBarViewConfig.RightContent.ButtonStyle.NEGATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr13[NotificationBarViewConfig.RightContent.ButtonStyle.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused65) {
            }
            $EnumSwitchMapping$12 = iArr13;
            int[] iArr14 = new int[NotificationDTO.Alignment.values().length];
            try {
                iArr14[NotificationDTO.Alignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr14[NotificationDTO.Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused67) {
            }
            $EnumSwitchMapping$13 = iArr14;
        }
    }

    static {
        IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_400;
        ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.CUSTOM;
        UniColors uniColors = UniColors.GRAPHIC_TERTIARY_INVERTED;
        String token = uniColors.getToken();
        UniColors uniColors2 = UniColors.CLEAR_LIGHT_KEY_0;
        String token2 = uniColors2.getToken();
        Boolean bool = Boolean.FALSE;
        defaultCloseIconButton = new IconButtonV3DTO(sizes, styleTypes, null, "ic_s_cross_filled", null, token, token2, null, bool, null, null, null, null, null, 16020, null);
        defaultDisclosureIconButton = new IconButtonV3DTO(sizes, styleTypes, null, "ic_m_chevron_right_filled", null, uniColors.getToken(), uniColors2.getToken(), null, bool, null, null, null, null, null, 16020, null);
        defaultLeftContentIcon = new NotificationBarViewConfig.LeftContent.Icon(NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_500, NotificationBarViewConfig.LeftContent.Icon.Shape.SHAPE_SQUIRCLE_FORCE, "ic_m_exclamation_filled", uniColors.getToken(), UniColors.BG_SECONDARY_INVERTED.getToken(), null, NotificationBarViewConfig.LeftContent.Icon.FitType.FILL_CENTER, NotificationBarViewConfig.Alignment.TOP, 32, null);
    }

    @NotNull
    public static final ButtonV3DTO.Sizes toButtonSize(@NotNull NotificationBarViewConfig.RightContent.Button.ButtonSize buttonSize) {
        Intrinsics.checkNotNullParameter(buttonSize, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$10[buttonSize.ordinal()];
        if (i11 == 1) {
            return ButtonV3DTO.Sizes.SIZE_400;
        }
        if (i11 == 2) {
            return ButtonV3DTO.Sizes.SIZE_500;
        }
        if (i11 == 3) {
            return ButtonV3DTO.Sizes.SIZE_600;
        }
        if (i11 == 4) {
            return ButtonV3DTO.Sizes.SIZE_700;
        }
        throw new o();
    }

    @NotNull
    public static final ButtonV3DTO.StyleTypes toButtonStyle(@NotNull NotificationBarViewConfig.RightContent.ButtonStyle buttonStyle) {
        Intrinsics.checkNotNullParameter(buttonStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$12[buttonStyle.ordinal()]) {
            case 1:
                return ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
            case 2:
                return ButtonV3DTO.StyleTypes.ACTION_SECONDARY;
            case 3:
                return ButtonV3DTO.StyleTypes.ACCENT_PRIMARY;
            case 4:
                return ButtonV3DTO.StyleTypes.ACCENT_SECONDARY;
            case 5:
                return ButtonV3DTO.StyleTypes.NEGATIVE;
            case 6:
                return ButtonV3DTO.StyleTypes.CUSTOM;
            default:
                throw new o();
        }
    }

    @NotNull
    public static final NotificationBarViewConfig.Alignment toConfigAlignment(@NotNull NotificationDTO.Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$13[alignment.ordinal()];
        if (i11 == 1) {
            return NotificationBarViewConfig.Alignment.TOP;
        }
        if (i11 == 2) {
            return NotificationBarViewConfig.Alignment.CENTER;
        }
        throw new o();
    }

    @NotNull
    public static final NotificationBarViewConfig.RightContent.Button.ButtonSize toConfigButtonSize(@NotNull ButtonV3DTO.Sizes sizes) {
        Intrinsics.checkNotNullParameter(sizes, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$7[sizes.ordinal()];
        if (i11 == 1) {
            return NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_400;
        }
        if (i11 == 2) {
            return NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_500;
        }
        if (i11 == 3) {
            return NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_600;
        }
        if (i11 == 4) {
            return NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_700;
        }
        throw new o();
    }

    @NotNull
    public static final NotificationBarViewConfig.RightContent.ButtonStyle toConfigButtonStyle(@NotNull ButtonV3DTO.StyleTypes styleTypes) {
        Intrinsics.checkNotNullParameter(styleTypes, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$9[styleTypes.ordinal()]) {
            case 1:
            case 2:
                return NotificationBarViewConfig.RightContent.ButtonStyle.ACTION_PRIMARY;
            case 3:
                return NotificationBarViewConfig.RightContent.ButtonStyle.ACTION_SECONDARY;
            case 4:
                return NotificationBarViewConfig.RightContent.ButtonStyle.ACCENT_PRIMARY;
            case 5:
                return NotificationBarViewConfig.RightContent.ButtonStyle.ACCENT_SECONDARY;
            case 6:
                return NotificationBarViewConfig.RightContent.ButtonStyle.NEGATIVE;
            case 7:
                return NotificationBarViewConfig.RightContent.ButtonStyle.CUSTOM;
            default:
                throw new o();
        }
    }

    @NotNull
    public static final NotificationBarViewConfig.RightContent.Icon.IconButtonSize toConfigIconButtonSize(@NotNull IconButtonV3DTO.Sizes sizes) {
        Intrinsics.checkNotNullParameter(sizes, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$8[sizes.ordinal()]) {
            case 1:
                return NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_300;
            case 2:
                return NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_400;
            case 3:
                return NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_450;
            case 4:
                return NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_500;
            case 5:
                return NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_600;
            case 6:
                return NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_700;
            default:
                throw new o();
        }
    }

    @NotNull
    public static final NotificationBarViewConfig.LeftContent.Icon.FitType toConfigIconFitType(@NotNull IconDTO.FitType fitType) {
        Intrinsics.checkNotNullParameter(fitType, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$2[fitType.ordinal()];
        if (i11 == 1) {
            return NotificationBarViewConfig.LeftContent.Icon.FitType.FILL_CENTER;
        }
        if (i11 == 2) {
            return NotificationBarViewConfig.LeftContent.Icon.FitType.FIT_CENTER;
        }
        throw new o();
    }

    @NotNull
    public static final NotificationBarViewConfig.LeftContent.Icon.Shape toConfigIconShape(@NotNull IconDTO.IconShape iconShape) {
        Intrinsics.checkNotNullParameter(iconShape, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$1[iconShape.ordinal()];
        if (i11 == 1) {
            return NotificationBarViewConfig.LeftContent.Icon.Shape.CIRCLE;
        }
        if (i11 == 2) {
            return NotificationBarViewConfig.LeftContent.Icon.Shape.SHAPE_SQUIRCLE_FORCE;
        }
        if (i11 == 3) {
            return NotificationBarViewConfig.LeftContent.Icon.Shape.SHAPE_NONE;
        }
        if (i11 == 4) {
            return NotificationBarViewConfig.LeftContent.Icon.Shape.SHAPE_SQUIRCLE_FORCE;
        }
        throw new o();
    }

    @NotNull
    public static final NotificationBarViewConfig.LeftContent.Icon.Size toConfigIconSize(@NotNull IconDTO.IconSize iconSize) {
        Intrinsics.checkNotNullParameter(iconSize, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[iconSize.ordinal()]) {
            case 1:
                return NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_200;
            case 2:
                return NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_300;
            case 3:
                return NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_400;
            case 4:
                return NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_500;
            case 5:
                return NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_600;
            case 6:
                return NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_700;
            case 7:
                return NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_800;
            case 8:
                return NotificationBarViewConfig.LeftContent.Icon.Size.SIZE_900;
            default:
                throw new o();
        }
    }

    @NotNull
    public static final NotificationBarViewConfig.LeftContent toConfigLeftContent(@NotNull NotificationDTO.LeftContent leftContent) {
        NotificationBarViewConfig.LeftContent.Icon.Size size;
        NotificationBarViewConfig.LeftContent.Icon.Shape shape;
        String iconTintColor;
        NotificationBarViewConfig.LeftContent.Icon.FitType backgroundImageFitType;
        NotificationBarViewConfig.Alignment alignment;
        Intrinsics.checkNotNullParameter(leftContent, "<this>");
        if (!(leftContent.getAtom() instanceof IconDTO)) {
            return defaultLeftContentIcon;
        }
        NotificationBarViewConfig.LeftContent.Icon icon = defaultLeftContentIcon;
        IconDTO.IconSize size2 = ((IconDTO) leftContent.getAtom()).getSize();
        if (size2 == null || (size = toConfigIconSize(size2)) == null) {
            size = icon.getSize();
        }
        NotificationBarViewConfig.LeftContent.Icon.Size size3 = size;
        IconDTO.IconShape shape2 = ((IconDTO) leftContent.getAtom()).getShape();
        if (shape2 == null || (shape = toConfigIconShape(shape2)) == null) {
            shape = icon.getShape();
        }
        NotificationBarViewConfig.LeftContent.Icon.Shape shape3 = shape;
        CommonAtomIconDTO icon2 = ((IconDTO) leftContent.getAtom()).getIcon();
        String icon3 = icon2 != null ? icon2.getIcon() : null;
        CommonAtomIconDTO icon4 = ((IconDTO) leftContent.getAtom()).getIcon();
        if (icon4 == null || (iconTintColor = icon4.getTintColor()) == null) {
            iconTintColor = icon.getIconTintColor();
        }
        String str = iconTintColor;
        String backgroundColor = ((IconDTO) leftContent.getAtom()).getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = icon.getBackgroundColor();
        }
        String str2 = backgroundColor;
        String backgroundImage = ((IconDTO) leftContent.getAtom()).getBackgroundImage();
        IconDTO.FitType backgroundImageFitType2 = ((IconDTO) leftContent.getAtom()).getBackgroundImageFitType();
        if (backgroundImageFitType2 == null || (backgroundImageFitType = toConfigIconFitType(backgroundImageFitType2)) == null) {
            backgroundImageFitType = icon.getBackgroundImageFitType();
        }
        NotificationBarViewConfig.LeftContent.Icon.FitType fitType = backgroundImageFitType;
        NotificationDTO.Alignment alignment2 = leftContent.getAlignment();
        if (alignment2 == null || (alignment = toConfigAlignment(alignment2)) == null) {
            alignment = icon.getAlignment();
        }
        return icon.copy(size3, shape3, icon3, str, str2, backgroundImage, fitType, alignment);
    }

    public static final NotificationBarViewConfig.RightContent toConfigRightContent(@NotNull NotificationDTO.RightContent rightContent) {
        NotificationBarViewConfig.RightContent.Icon.IconButtonSize iconButtonSize;
        NotificationBarViewConfig.RightContent.ButtonStyle buttonStyle;
        NotificationBarViewConfig.Alignment alignment;
        NotificationBarViewConfig.RightContent.Icon.IconButtonSize iconButtonSize2;
        NotificationBarViewConfig.RightContent.ButtonStyle buttonStyle2;
        NotificationBarViewConfig.Alignment alignment2;
        NotificationBarViewConfig.RightContent.Button.ButtonSize buttonSize;
        NotificationBarViewConfig.RightContent.ButtonStyle buttonStyle3;
        NotificationBarViewConfig.Alignment alignment3;
        Intrinsics.checkNotNullParameter(rightContent, "<this>");
        NotificationDTO.RightContent.ButtonType buttonType = rightContent.getButtonType();
        int i11 = buttonType == null ? -1 : WhenMappings.$EnumSwitchMapping$6[buttonType.ordinal()];
        if (i11 == -1 || i11 == 1) {
            IconButtonV3DTO iconButton = rightContent.getIconButton();
            if (iconButton == null) {
                iconButton = defaultCloseIconButton;
            }
            IconButtonV3DTO.Sizes size = iconButton.getSize();
            if (size == null || (iconButtonSize = toConfigIconButtonSize(size)) == null) {
                iconButtonSize = NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_400;
            }
            ButtonV3DTO.StyleTypes styleType = iconButton.getStyleType();
            if (styleType == null || (buttonStyle = toConfigButtonStyle(styleType)) == null) {
                buttonStyle = NotificationBarViewConfig.RightContent.ButtonStyle.CUSTOM;
            }
            Boolean isHoverDisabled = iconButton.isHoverDisabled();
            boolean booleanValue = isHoverDisabled != null ? isHoverDisabled.booleanValue() : false;
            String iconColor = iconButton.getIconColor();
            if (iconColor == null) {
                iconColor = UniColors.GRAPHIC_TERTIARY_INVERTED.getToken();
            }
            String backgroundColor = iconButton.getBackgroundColor();
            if (backgroundColor == null) {
                backgroundColor = UniColors.CLEAR_LIGHT_KEY_0.getToken();
            }
            String str = backgroundColor;
            NotificationDTO.Alignment alignment4 = rightContent.getAlignment();
            if (alignment4 == null || (alignment = toConfigAlignment(alignment4)) == null) {
                alignment = NotificationBarViewConfig.Alignment.CENTER;
            }
            return new NotificationBarViewConfig.RightContent.Icon.Close(iconButtonSize, buttonStyle, booleanValue, iconColor, str, alignment);
        }
        if (i11 == 2) {
            IconButtonV3DTO iconButton2 = rightContent.getIconButton();
            if (iconButton2 == null) {
                iconButton2 = defaultDisclosureIconButton;
            }
            IconButtonV3DTO.Sizes size2 = iconButton2.getSize();
            if (size2 == null || (iconButtonSize2 = toConfigIconButtonSize(size2)) == null) {
                iconButtonSize2 = NotificationBarViewConfig.RightContent.Icon.IconButtonSize.SIZE_400;
            }
            ButtonV3DTO.StyleTypes styleType2 = iconButton2.getStyleType();
            if (styleType2 == null || (buttonStyle2 = toConfigButtonStyle(styleType2)) == null) {
                buttonStyle2 = NotificationBarViewConfig.RightContent.ButtonStyle.CUSTOM;
            }
            Boolean isHoverDisabled2 = iconButton2.isHoverDisabled();
            boolean booleanValue2 = isHoverDisabled2 != null ? isHoverDisabled2.booleanValue() : false;
            String iconColor2 = iconButton2.getIconColor();
            if (iconColor2 == null) {
                iconColor2 = UniColors.GRAPHIC_TERTIARY_INVERTED.getToken();
            }
            String backgroundColor2 = iconButton2.getBackgroundColor();
            if (backgroundColor2 == null) {
                backgroundColor2 = UniColors.CLEAR_LIGHT_KEY_0.getToken();
            }
            String str2 = backgroundColor2;
            NotificationDTO.Alignment alignment5 = rightContent.getAlignment();
            if (alignment5 == null || (alignment2 = toConfigAlignment(alignment5)) == null) {
                alignment2 = NotificationBarViewConfig.Alignment.CENTER;
            }
            return new NotificationBarViewConfig.RightContent.Icon.Disclosure(iconButtonSize2, buttonStyle2, booleanValue2, iconColor2, str2, alignment2);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return NotificationBarViewConfig.RightContent.None.INSTANCE;
            }
            throw new o();
        }
        ButtonV3DTO button = rightContent.getButton();
        if (button == null) {
            return null;
        }
        String title = button.getTitle();
        String subtitle = button.getSubtitle();
        ButtonV3DTO.Sizes size3 = button.getSize();
        if (size3 == null || (buttonSize = toConfigButtonSize(size3)) == null) {
            buttonSize = NotificationBarViewConfig.RightContent.Button.ButtonSize.SIZE_400;
        }
        ButtonV3DTO.StyleTypes styleType3 = button.getStyleType();
        if (styleType3 == null || (buttonStyle3 = toConfigButtonStyle(styleType3)) == null) {
            buttonStyle3 = NotificationBarViewConfig.RightContent.ButtonStyle.CUSTOM;
        }
        boolean z11 = true;
        NotificationBarViewConfig.RightContent.Button.ButtonSize buttonSize2 = buttonSize;
        String icon = button.getIcon();
        boolean z12 = false;
        NotificationBarViewConfig.RightContent.ButtonStyle buttonStyle4 = buttonStyle3;
        String dataText = button.getDataText();
        Boolean isDisabled = button.isDisabled();
        if (isDisabled != null && isDisabled.booleanValue()) {
            z11 = false;
        }
        Boolean isHoverDisabled3 = button.isHoverDisabled();
        if (isHoverDisabled3 != null) {
            z12 = isHoverDisabled3.booleanValue();
        }
        boolean z13 = z12;
        boolean z14 = z11;
        String titleColor = button.getTitleColor();
        if (titleColor == null) {
            titleColor = UniColors.TEXT_PRIMARY_INVERTED.getToken();
        }
        String subtitleColor = button.getSubtitleColor();
        if (subtitleColor == null) {
            subtitleColor = UniColors.TEXT_SECONDARY_INVERTED.getToken();
        }
        String iconColor3 = button.getIconColor();
        if (iconColor3 == null) {
            iconColor3 = UniColors.GRAPHIC_TERTIARY.getToken();
        }
        String dataTextColor = button.getDataTextColor();
        String dataBackgroundColor = button.getDataBackgroundColor();
        String backgroundColor3 = button.getBackgroundColor();
        if (backgroundColor3 == null) {
            backgroundColor3 = UniColors.BG_ACTION_SECONDARY_INVERTED.getToken();
        }
        String str3 = backgroundColor3;
        NotificationDTO.Alignment alignment6 = rightContent.getAlignment();
        if (alignment6 == null || (alignment3 = toConfigAlignment(alignment6)) == null) {
            alignment3 = NotificationBarViewConfig.Alignment.CENTER;
        }
        return new NotificationBarViewConfig.RightContent.Button(title, subtitle, buttonSize2, buttonStyle4, icon, dataText, z13, z14, titleColor, subtitleColor, iconColor3, dataTextColor, dataBackgroundColor, str3, alignment3);
    }

    @NotNull
    public static final IconButtonV3DTO.Sizes toIconButtonSize(@NotNull NotificationBarViewConfig.RightContent.Icon.IconButtonSize iconButtonSize) {
        Intrinsics.checkNotNullParameter(iconButtonSize, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$11[iconButtonSize.ordinal()]) {
            case 1:
                return IconButtonV3DTO.Sizes.SIZE_300;
            case 2:
                return IconButtonV3DTO.Sizes.SIZE_400;
            case 3:
                return IconButtonV3DTO.Sizes.SIZE_450;
            case 4:
                return IconButtonV3DTO.Sizes.SIZE_500;
            case 5:
                return IconButtonV3DTO.Sizes.SIZE_600;
            case 6:
                return IconButtonV3DTO.Sizes.SIZE_700;
            default:
                throw new o();
        }
    }

    @NotNull
    public static final IconDTO.FitType toIconFitType(@NotNull NotificationBarViewConfig.LeftContent.Icon.FitType fitType) {
        Intrinsics.checkNotNullParameter(fitType, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$5[fitType.ordinal()];
        if (i11 == 1) {
            return IconDTO.FitType.FILL_CENTER;
        }
        if (i11 == 2) {
            return IconDTO.FitType.FIT_CENTER;
        }
        throw new o();
    }

    @NotNull
    public static final IconDTO.IconShape toIconShape(@NotNull NotificationBarViewConfig.LeftContent.Icon.Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$4[shape.ordinal()];
        if (i11 == 1) {
            return IconDTO.IconShape.CIRCLE;
        }
        if (i11 == 2) {
            return IconDTO.IconShape.SQUIRCLE;
        }
        if (i11 == 3) {
            return IconDTO.IconShape.SHAPE_NONE;
        }
        if (i11 == 4) {
            return IconDTO.IconShape.SHAPE_SQUIRCLE_FORCE;
        }
        throw new o();
    }

    @NotNull
    public static final IconDTO.IconSize toIconSize(@NotNull NotificationBarViewConfig.LeftContent.Icon.Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$3[size.ordinal()]) {
            case 1:
                return IconDTO.IconSize.SIZE_200;
            case 2:
                return IconDTO.IconSize.SIZE_300;
            case 3:
                return IconDTO.IconSize.SIZE_400;
            case 4:
                return IconDTO.IconSize.SIZE_500;
            case 5:
                return IconDTO.IconSize.SIZE_600;
            case 6:
                return IconDTO.IconSize.SIZE_700;
            case 7:
                return IconDTO.IconSize.SIZE_800;
            case 8:
                return IconDTO.IconSize.SIZE_900;
            default:
                throw new o();
        }
    }
}
