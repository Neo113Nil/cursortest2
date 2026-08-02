package ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeMapper;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation.CellListGroupVO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupMapper;", "", "cmlCellListMoleculeMapper", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeMapper;", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeMapper;)V", "map", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;", "dto", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupDTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellListGroupMapper {

    @NotNull
    private final CmlCellListMoleculeMapper cmlCellListMoleculeMapper;

    public CellListGroupMapper(@NotNull CmlCellListMoleculeMapper cmlCellListMoleculeMapper) {
        Intrinsics.checkNotNullParameter(cmlCellListMoleculeMapper, "cmlCellListMoleculeMapper");
        this.cmlCellListMoleculeMapper = cmlCellListMoleculeMapper;
    }

    @NotNull
    public final CellListGroupVO map(@NotNull CellListGroupDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        TextDTO title = dto.getTitle();
        List<TextDTO> subtitle = dto.getSubtitle();
        if (subtitle == null) {
            subtitle = K.f71697a;
        }
        List<TextDTO> list = subtitle;
        List<CellItem> map = this.cmlCellListMoleculeMapper.map(dto.getCellListBlock());
        String backgroundColor = dto.getBackgroundColor();
        CornerRadius cornerRadius = dto.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_500;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        CommonCellSettings.LayoutPadding topMargin = dto.getTopMargin();
        if (topMargin == null) {
            topMargin = CommonCellSettings.LayoutPadding.NONE;
        }
        CommonCellSettings.LayoutPadding layoutPadding = topMargin;
        CommonCellSettings.LayoutPadding bottomMargin = dto.getBottomMargin();
        if (bottomMargin == null) {
            bottomMargin = CommonCellSettings.LayoutPadding.NONE;
        }
        return new CellListGroupVO(title, list, map, backgroundColor, cornerRadius2, layoutPadding, bottomMargin);
    }
}
