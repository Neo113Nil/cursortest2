package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"setToggle", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;", "isSelected", "", "map_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DistrictsVOKt {
    @NotNull
    public static final DistrictsVO setToggle(@NotNull DistrictsVO districtsVO, boolean z11) {
        Intrinsics.checkNotNullParameter(districtsVO, "<this>");
        DistrictsVO.PolygonControlPanel panel = districtsVO.getPanel();
        CellDTO panel2 = districtsVO.getPanel().getPanel();
        CellDTO.RightBlock rightBlock = districtsVO.getPanel().getPanel().getRightBlock();
        CellDTO.RightBlock rightBlock2 = null;
        if (rightBlock != null) {
            CellDTO.RightBlock rightBlock3 = districtsVO.getPanel().getPanel().getRightBlock();
            AtomDTO control = rightBlock3 != null ? rightBlock3.getControl() : null;
            ToggleDTO toggleDTO = control instanceof ToggleDTO ? (ToggleDTO) control : null;
            rightBlock2 = CellDTO.RightBlock.copy$default(rightBlock, null, null, null, null, null, null, null, null, null, null, toggleDTO != null ? ToggleDTO.copy$default(toggleDTO, Boolean.valueOf(z11), null, null, null, null, null, 62, null) : null, null, 3071, null);
        }
        return DistrictsVO.copy$default(districtsVO, null, DistrictsVO.PolygonControlPanel.copy$default(panel, CellDTO.copy$default(panel2, null, null, null, rightBlock2, null, 23, null), null, null, 6, null), 0.0f, 0.0f, null, null, 61, null);
    }
}
