package ru.ozon.uni.atoms.data.controls.chip;

import kotlin.Metadata;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"styleResource", "", "Lru/ozon/uni/atoms/data/controls/chip/Style;", "getStyleResource", "(Lru/ozon/uni/atoms/data/controls/chip/Style;)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChipColorSettingsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.ASPECT_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Style.NEUTRAL_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStyleResource(Style style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i11 != 1 && i11 == 2) {
            return R$style.Chip_NeutralSecondary;
        }
        return R$style.Chip_AspectPrimary;
    }
}
