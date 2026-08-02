package ru.ozon.uni.atoms.data.controls.button;

import kotlin.Metadata;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.data.controls.button.IconCellCardDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"styleResource", "", "Lru/ozon/uni/atoms/data/controls/button/IconCellCardDTO$Style;", "getStyleResource", "(Lru/ozon/uni/atoms/data/controls/button/IconCellCardDTO$Style;)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconCellCardDTOKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconCellCardDTO.Style.values().length];
            try {
                iArr[IconCellCardDTO.Style.NEUTRAL_SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStyleResource(IconCellCardDTO.Style style) {
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? R$style.IconCellCard_NeutralSecondary : R$style.IconCellCard_NeutralSecondary;
    }
}
