package ru.ozon.uni.android.ds.compose.component.tagbutton;

import S0.InterfaceC3967k;
import Sc.o;
import U7.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.tagbutton.DsTagButtonColors;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniIconToken;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\b*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000f\u001a\u00020\u000b*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "", "loading", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonState;", "stateVo", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Z)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonState;", "Lru/ozon/uni/core/models/UniIconToken;", "iconToken", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;", "styleVo", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/core/models/UniIconToken;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;", "customStyleDto", "multicolor", "custom", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;ZLS0/k;I)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO$Size;", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;", "getSizeVo", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO$Size;)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;", "sizeVo", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTagButtonMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TagButtonDTO.Size.values().length];
            try {
                iArr[TagButtonDTO.Size.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagButtonDTO.Size.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TagButtonDTO.StyleType.values().length];
            try {
                iArr2[TagButtonDTO.StyleType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TagButtonDTO.StyleType.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final DsTagButtonColors custom(DsTagButtonColors dsTagButtonColors, TagButtonDTO.CustomTagButtonStyle customTagButtonStyle, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        long j11;
        long j12;
        long j13;
        long j14;
        C7807Z c7807z = TokenParserKt.tokenToColor(customTagButtonStyle != null ? customTagButtonStyle.getBackgroundColor() : null, interfaceC3967k, 0);
        if (c7807z != null) {
            j11 = c7807z.w();
        } else {
            int i12 = C7807Z.f72260n;
            j11 = C7807Z.f72259m;
        }
        long j15 = j11;
        C7807Z c7807z2 = TokenParserKt.tokenToColor(customTagButtonStyle != null ? customTagButtonStyle.getTextColor() : null, interfaceC3967k, 0);
        if (c7807z2 != null) {
            j12 = c7807z2.w();
        } else {
            int i13 = C7807Z.f72260n;
            j12 = C7807Z.f72259m;
        }
        long j16 = j12;
        C7807Z c7807z3 = TokenParserKt.tokenToColor(customTagButtonStyle != null ? customTagButtonStyle.getIconColor() : null, interfaceC3967k, 0);
        if (c7807z3 != null) {
            j13 = c7807z3.w();
        } else {
            int i14 = C7807Z.f72260n;
            j13 = C7807Z.f72259m;
        }
        long j17 = j13;
        C7807Z c7807z4 = TokenParserKt.tokenToColor(customTagButtonStyle != null ? customTagButtonStyle.getCloseIconColor() : null, interfaceC3967k, 0);
        if (c7807z4 != null) {
            j14 = c7807z4.w();
        } else {
            int i15 = C7807Z.f72260n;
            j14 = C7807Z.f72259m;
        }
        return DsTagButtonKt.multicolor(DsTagButtonKt.m1813customhDc7uY(dsTagButtonColors, j15, j16, j17, j14), z11);
    }

    @NotNull
    public static final DsTagButtonSize getSizeVo(@NotNull TagButtonDTO.Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i11 == 1) {
            return DsTagButtonSize.Size500;
        }
        if (i11 == 2) {
            return DsTagButtonSize.Size600;
        }
        throw new o();
    }

    @NotNull
    public static final DsTagButtonState stateVo(@NotNull TagButtonDTO tagButtonDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(tagButtonDTO, "<this>");
        Boolean isDisabled = tagButtonDTO.isDisabled();
        Boolean bool = Boolean.TRUE;
        return Intrinsics.d(isDisabled, bool) ? DsTagButtonState.Disabled : (Intrinsics.d(tagButtonDTO.isSelected(), bool) && z11) ? DsTagButtonState.LoadingSelected : Intrinsics.d(tagButtonDTO.isSelected(), bool) ? DsTagButtonState.Selected : z11 ? DsTagButtonState.Loading : DsTagButtonState.Default;
    }

    @NotNull
    public static final DsTagButtonStyle styleVo(@NotNull TagButtonDTO tagButtonDTO, UniIconToken uniIconToken, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(tagButtonDTO, "<this>");
        boolean z11 = uniIconToken != null && uniIconToken.getIsMulticolor();
        TagButtonDTO.StyleType styleType = tagButtonDTO.getStyleType();
        if (styleType == null) {
            styleType = TagButtonDTO.INSTANCE.getDefaultStyleType();
        }
        int i12 = WhenMappings.$EnumSwitchMapping$1[styleType.ordinal()];
        if (i12 == 1) {
            interfaceC3967k.o(407689296);
            DsTagButtonStyle style = DsTagButtonDefaults.INSTANCE.style(null, null, z11, interfaceC3967k, UniIconToken.$stable << 9, 3);
            interfaceC3967k.k();
            return style;
        }
        if (i12 != 2) {
            throw l.c(interfaceC3967k, 407686415);
        }
        interfaceC3967k.o(407691369);
        DsTagButtonColors.Companion companion = DsTagButtonColors.INSTANCE;
        DsTagButtonStyle dsTagButtonStyle = new DsTagButtonStyle(custom(companion.m1807default(interfaceC3967k, 6), tagButtonDTO.getCustomDefaultStyle(), z11, interfaceC3967k, 0), custom(companion.selected(interfaceC3967k, 6), tagButtonDTO.getCustomSelectedStyle(), z11, interfaceC3967k, 0));
        interfaceC3967k.k();
        return dsTagButtonStyle;
    }
}
