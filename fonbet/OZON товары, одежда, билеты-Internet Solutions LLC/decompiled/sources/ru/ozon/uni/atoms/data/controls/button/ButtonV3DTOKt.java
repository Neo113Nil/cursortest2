package ru.ozon.uni.atoms.data.controls.button;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"styleTypesResource", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "getStyleTypesResource", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonV3DTOKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3DTO.StyleTypes.values().length];
            try {
                iArr[ButtonV3DTO.StyleTypes.ACTION_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACTION_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACCENT_PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACCENT_SECONDARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.NEGATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.NEUTRAL_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.CUSTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStyleTypesResource(@NotNull ButtonV3DTO.StyleTypes styleTypes) {
        Intrinsics.checkNotNullParameter(styleTypes, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[styleTypes.ordinal()]) {
            case 1:
                return R$style.ButtonV3View_ActionPrimary_Dynamic;
            case 2:
                return R$style.ButtonV3View_ActionSecondary;
            case 3:
                return R$style.ButtonV3View_AccentPrimary;
            case 4:
                return R$style.ButtonV3View_AccentSecondary;
            case 5:
                return R$style.ButtonV3View_Negative;
            case 6:
                return R$style.ButtonV3View_NeutralSecondary;
            case 7:
                return R$style.ButtonV3View_ActionPrimary_Dynamic;
            default:
                throw new o();
        }
    }
}
