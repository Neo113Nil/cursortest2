package ru.ozon.app.android.cml.delivery.molecules.cellList.data;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJY\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMapper;", "", "<init>", "()V", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "atomPadding", "widgetPadding", "defineCellLeftRightPadding", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "", "index", "size", "", "topCornerRadius", "bottomCornerRadius", "topMargin", "bottomMargin", "", "islandColor", "", "ignoreCellsSeparators", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "dsCell", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem$LayoutModel;", "determineLayoutModel", "(IIFFLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;ZLru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem$LayoutModel;", "atom", "listSeparator", "determineSeparator", "(ZLru/ozon/uni/atoms/data/dsCell/CellDTO;Z)Z", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;", "cellListDTO", "", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "map", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;)Ljava/util/List;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlCellListMapper {
    private final CommonCellSettings.LayoutPadding defineCellLeftRightPadding(CommonCellSettings.LayoutPadding atomPadding, CommonCellSettings.LayoutPadding widgetPadding) {
        return (atomPadding == null || atomPadding == CommonCellSettings.LayoutPadding.NONE) ? widgetPadding == null ? CommonCellSettings.LayoutPadding.PADDING_400 : widgetPadding : atomPadding;
    }

    private final CellItem.LayoutModel determineLayoutModel(int index, int size, float topCornerRadius, float bottomCornerRadius, CommonCellSettings.LayoutPadding topMargin, CommonCellSettings.LayoutPadding bottomMargin, String islandColor, boolean ignoreCellsSeparators, CellDTO dsCell) {
        if (islandColor != null && size == 1) {
            return new CellItem.LayoutModel(0, 0, topMargin, bottomMargin, topCornerRadius, bottomCornerRadius, false);
        }
        if (islandColor != null && index == 0) {
            return new CellItem.LayoutModel(Dimens.INSTANCE.getDp4(), 0, topMargin, CommonCellSettings.LayoutPadding.NONE, topCornerRadius, 0.0f, determineSeparator(ignoreCellsSeparators, dsCell, true));
        }
        if (islandColor != null && index == size - 1) {
            return new CellItem.LayoutModel(0, Dimens.INSTANCE.getDp4(), CommonCellSettings.LayoutPadding.NONE, bottomMargin, 0.0f, bottomCornerRadius, determineSeparator(ignoreCellsSeparators, dsCell, false));
        }
        if (islandColor == null && size == 1) {
            return new CellItem.LayoutModel(0, 0, topMargin, bottomMargin, 0.0f, 0.0f, determineSeparator(ignoreCellsSeparators, dsCell, false));
        }
        if (islandColor == null && index == 0) {
            return new CellItem.LayoutModel(0, 0, topMargin, CommonCellSettings.LayoutPadding.NONE, 0.0f, 0.0f, determineSeparator(ignoreCellsSeparators, dsCell, true));
        }
        if (islandColor == null && index == size - 1) {
            return new CellItem.LayoutModel(0, 0, CommonCellSettings.LayoutPadding.NONE, bottomMargin, 0.0f, 0.0f, determineSeparator(ignoreCellsSeparators, dsCell, false));
        }
        boolean determineSeparator = determineSeparator(ignoreCellsSeparators, dsCell, true);
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        return new CellItem.LayoutModel(0, 0, layoutPadding, layoutPadding, 0.0f, 0.0f, determineSeparator);
    }

    private final boolean determineSeparator(boolean ignoreCellsSeparators, CellDTO atom, boolean listSeparator) {
        Boolean disableSeparator;
        if (ignoreCellsSeparators) {
            return listSeparator;
        }
        CellDTO.Settings settings = atom.getSettings();
        return (settings == null || (disableSeparator = settings.getDisableSeparator()) == null || !(disableSeparator.booleanValue() ^ true)) ? false : true;
    }

    @NotNull
    public final List<CellItem> map(@NotNull CmlCellListDTO cellListDTO) {
        CommonCellSettings.LayoutPadding layoutPadding;
        t tVar;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CmlCellListMapper cmlCellListMapper = this;
        Intrinsics.checkNotNullParameter(cellListDTO, "cellListDTO");
        List<CellDTO> cells = cellListDTO.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        int i11 = 0;
        for (Object obj : cells) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CellDTO cellDTO = (CellDTO) obj;
            Boolean enableHtmlTags = cellListDTO.getEnableHtmlTags();
            cellDTO.setTagSupported(enableHtmlTags != null ? enableHtmlTags.booleanValue() : false);
            CornerRadius islandCornerRadius = cellListDTO.getIslandCornerRadius();
            if (islandCornerRadius == null) {
                islandCornerRadius = CornerRadius.RADIUS_500;
            }
            CornerRadius topIslandCornerRadius = cellListDTO.getTopIslandCornerRadius();
            if (topIslandCornerRadius == null || topIslandCornerRadius == CornerRadius.NO_RADIUS) {
                topIslandCornerRadius = null;
            }
            if (topIslandCornerRadius == null) {
                topIslandCornerRadius = islandCornerRadius;
            }
            CornerRadius bottomIslandCornerRadius = cellListDTO.getBottomIslandCornerRadius();
            if (bottomIslandCornerRadius == null || bottomIslandCornerRadius == CornerRadius.NO_RADIUS) {
                bottomIslandCornerRadius = null;
            }
            if (bottomIslandCornerRadius != null) {
                islandCornerRadius = bottomIslandCornerRadius;
            }
            String islandColor = cellListDTO.getIslandColor();
            String backgroundColor = cellListDTO.getBackgroundColor();
            CommonCellSettings.LayoutPadding leftMargin = cellListDTO.getLeftMargin();
            if (leftMargin == null) {
                leftMargin = CommonCellSettings.LayoutPadding.PADDING_500;
            }
            CommonCellSettings.LayoutPadding layoutPadding2 = leftMargin;
            CommonCellSettings.LayoutPadding rightMargin = cellListDTO.getRightMargin();
            if (rightMargin == null) {
                rightMargin = CommonCellSettings.LayoutPadding.PADDING_500;
            }
            CommonCellSettings.LayoutPadding layoutPadding3 = rightMargin;
            CellDTO.Settings settings = cellDTO.getSettings();
            CommonCellSettings.LayoutPadding defineCellLeftRightPadding = cmlCellListMapper.defineCellLeftRightPadding(settings != null ? settings.getLeftPadding() : null, cellListDTO.getLeftPadding());
            CellDTO.Settings settings2 = cellDTO.getSettings();
            CommonCellSettings.LayoutPadding defineCellLeftRightPadding2 = cmlCellListMapper.defineCellLeftRightPadding(settings2 != null ? settings2.getRightPadding() : null, cellListDTO.getRightPadding());
            if (i11 != 0 || (trackingInfo = cellListDTO.getTrackingInfo()) == null) {
                layoutPadding = layoutPadding2;
                tVar = null;
            } else {
                layoutPadding = layoutPadding2;
                tVar = x.b(trackingInfo, null, null);
            }
            CellDTO.Settings settings3 = cellDTO.getSettings();
            CellDTO copy$default = CellDTO.copy$default(cellDTO, null, settings3 != null ? CellDTO.Settings.copy$default(settings3, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : null, null, null, null, 29, null);
            int size = cellListDTO.getCells().size();
            float pxF = ResourceExtKt.toPxF(topIslandCornerRadius.getPx());
            float pxF2 = ResourceExtKt.toPxF(islandCornerRadius.getPx());
            CommonCellSettings.LayoutPadding topMargin = cellListDTO.getTopMargin();
            if (topMargin == null) {
                topMargin = CommonCellSettings.LayoutPadding.NONE;
            }
            CommonCellSettings.LayoutPadding bottomMargin = cellListDTO.getBottomMargin();
            if (bottomMargin == null) {
                bottomMargin = CommonCellSettings.LayoutPadding.NONE;
            }
            arrayList.add(new CellItem(islandColor, backgroundColor, layoutPadding, layoutPadding3, defineCellLeftRightPadding, defineCellLeftRightPadding2, copy$default, cmlCellListMapper.determineLayoutModel(i11, size, pxF, pxF2, topMargin, bottomMargin, cellListDTO.getIslandColor(), !Intrinsics.d(cellListDTO.getEnableCellsSeparators(), Boolean.TRUE), cellDTO), tVar));
            cmlCellListMapper = this;
            i11 = i12;
        }
        return arrayList;
    }
}
