package ru.ozon.uni.atoms.data.controls.button;

import kotlin.Metadata;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0003"}, d2 = {"toIconButtonStyle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IconButtonV3DTOKt {

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

    public static final /* synthetic */ IconButtonV3DTO.ButtonStyle access$toIconButtonStyle(ButtonV3DTO.StyleTypes styleTypes) {
        return toIconButtonStyle(styleTypes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconButtonV3DTO.ButtonStyle toIconButtonStyle(ButtonV3DTO.StyleTypes styleTypes) {
        switch (styleTypes == null ? -1 : WhenMappings.$EnumSwitchMapping$0[styleTypes.ordinal()]) {
            case 1:
                return IconButtonV3DTO.ButtonStyle.ACTION_PRIMARY;
            case 2:
                return IconButtonV3DTO.ButtonStyle.ACTION_SECONDARY;
            case 3:
                return IconButtonV3DTO.ButtonStyle.ACCENT_PRIMARY;
            case 4:
                return IconButtonV3DTO.ButtonStyle.ACCENT_SECONDARY;
            case 5:
                return IconButtonV3DTO.ButtonStyle.NEGATIVE;
            case 6:
                return IconButtonV3DTO.ButtonStyle.NEUTRAL_SECONDARY;
            case 7:
                return IconButtonV3DTO.ButtonStyle.CUSTOM;
            default:
                return null;
        }
    }
}
