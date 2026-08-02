package ru.ozon.uni.android.ds.compose.component.tooltip;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonStyle;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;", "style", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonStyle;", "closeButtonStyle", "(Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonStyle;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsTooltipStyleKt {
    @NotNull
    public static final DsIconButtonStyle closeButtonStyle(@NotNull DsTooltipStyle style, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(style, "style");
        long closeButtonBgColor = style.getCloseButtonBgColor();
        long closeButtonIconColor = style.getCloseButtonIconColor();
        IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_300;
        return new DsIconButtonStyle(closeButtonBgColor, closeButtonIconColor, sizes.getSize(), sizes.getCornerRadius(), null);
    }
}
