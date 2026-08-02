package ru.ozon.app.android.widgets.commonTextWidget.cellList.core;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.widgets.commonTextWidget.cellList.data.CellListV2DTO;
import ru.ozon.app.android.widgets.commonTextWidget.cellList.presentation.CellV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.common.HTMLTagSupport;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JY\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010$J'\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J*\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010(\u001a\u00020\u00022\n\u0010*\u001a\u00060\u0003j\u0002`)H\u0096\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/cellList/core/CellListV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/data/CellListV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getAtomLeftPadding", "(Lru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getAtomRightPadding", "atomPadding", "widgetPadding", "defineCellLeftRightPadding", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "", "index", "size", "", "topCornerRadius", "bottomCornerRadius", "topMargin", "bottomMargin", "", "islandColor", "", "ignoreCellsSeparators", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO$LayoutModel;", "determineLayoutModel", "(IIFFLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO$LayoutModel;", "", "enableHtmlTagsSupport", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "listSeparator", "determineSeparator", "(ZLru/ozon/uni/atoms/data/AtomDTO;Z)Z", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/widgets/commonTextWidget/cellList/data/CellListV2DTO;Ll20/d;)Ljava/util/List;", "dp4", "I", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CellListV2Mapper implements Function2<CellListV2DTO, d, List<? extends CellV2VO>> {
    private final int dp4 = ResourceExtKt.toPx(4);

    private final CommonCellSettings.LayoutPadding defineCellLeftRightPadding(CommonCellSettings.LayoutPadding atomPadding, CommonCellSettings.LayoutPadding widgetPadding) {
        CommonCellSettings.LayoutPadding layoutPadding;
        return (atomPadding == null || atomPadding == (layoutPadding = CommonCellSettings.LayoutPadding.NONE)) ? widgetPadding == null ? CommonCellSettings.LayoutPadding.PADDING_400 : widgetPadding : layoutPadding;
    }

    private final CellV2VO.LayoutModel determineLayoutModel(int index, int size, float topCornerRadius, float bottomCornerRadius, CommonCellSettings.LayoutPadding topMargin, CommonCellSettings.LayoutPadding bottomMargin, String islandColor, boolean ignoreCellsSeparators, AtomDTO atom) {
        if (islandColor != null && size == 1) {
            return new CellV2VO.LayoutModel(0, 0, topMargin, bottomMargin, topCornerRadius, bottomCornerRadius, false, 3, null);
        }
        if (islandColor != null && index == 0) {
            return new CellV2VO.LayoutModel(this.dp4, 0, topMargin, null, topCornerRadius, 0.0f, determineSeparator(ignoreCellsSeparators, atom, true), 42, null);
        }
        if (islandColor != null && index == size - 1) {
            return new CellV2VO.LayoutModel(0, this.dp4, null, bottomMargin, 0.0f, bottomCornerRadius, determineSeparator(ignoreCellsSeparators, atom, false), 21, null);
        }
        if (islandColor == null && size == 1) {
            return new CellV2VO.LayoutModel(0, 0, topMargin, bottomMargin, 0.0f, 0.0f, determineSeparator(ignoreCellsSeparators, atom, false), 51, null);
        }
        if (islandColor == null && index == 0) {
            return new CellV2VO.LayoutModel(0, 0, topMargin, null, 0.0f, 0.0f, determineSeparator(ignoreCellsSeparators, atom, true), 59, null);
        }
        if (islandColor == null && index == size - 1) {
            return new CellV2VO.LayoutModel(0, 0, null, bottomMargin, 0.0f, 0.0f, determineSeparator(ignoreCellsSeparators, atom, false), 55, null);
        }
        return new CellV2VO.LayoutModel(0, 0, null, null, 0.0f, 0.0f, determineSeparator(ignoreCellsSeparators, atom, true), 63, null);
    }

    private final boolean determineSeparator(boolean ignoreCellsSeparators, AtomDTO atom, boolean listSeparator) {
        CommonCellSettings common;
        Boolean hasSeparator;
        Boolean disableSeparator;
        if (ignoreCellsSeparators) {
            return listSeparator;
        }
        if (atom instanceof CellDTO) {
            CellDTO.Settings settings = ((CellDTO) atom).getSettings();
            return (settings == null || (disableSeparator = settings.getDisableSeparator()) == null || disableSeparator.booleanValue()) ? false : true;
        }
        if (!(atom instanceof ru.ozon.uni.atoms.data.cell.CellDTO) || (common = ((ru.ozon.uni.atoms.data.cell.CellDTO) atom).getCommon()) == null || (hasSeparator = common.getHasSeparator()) == null) {
            return false;
        }
        return hasSeparator.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void enableHtmlTagsSupport(AtomDTO atom) {
        if (atom instanceof HTMLTagSupport) {
            ((HTMLTagSupport) atom).setTagSupported(true);
        }
    }

    private final CommonCellSettings.LayoutPadding getAtomLeftPadding(AtomDTO atom) {
        CellDTO.Settings settings;
        if (atom instanceof ru.ozon.uni.atoms.data.cell.CellDTO) {
            CommonCellSettings common = ((ru.ozon.uni.atoms.data.cell.CellDTO) atom).getCommon();
            if (common != null) {
                return common.getLayoutPaddingLeft();
            }
            return null;
        }
        if (!(atom instanceof CellDTO) || (settings = ((CellDTO) atom).getSettings()) == null) {
            return null;
        }
        return settings.getLeftPadding();
    }

    private final CommonCellSettings.LayoutPadding getAtomRightPadding(AtomDTO atom) {
        CellDTO.Settings settings;
        if (atom instanceof ru.ozon.uni.atoms.data.cell.CellDTO) {
            CommonCellSettings common = ((ru.ozon.uni.atoms.data.cell.CellDTO) atom).getCommon();
            if (common != null) {
                return common.getLayoutPaddingRight();
            }
            return null;
        }
        if (!(atom instanceof CellDTO) || (settings = ((CellDTO) atom).getSettings()) == null) {
            return null;
        }
        return settings.getRightPadding();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CellV2VO> invoke(@NotNull CellListV2DTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CellListV2Mapper cellListV2Mapper = this;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<AtomDTO> cells = state.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        int i11 = 0;
        for (Object obj : cells) {
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AtomDTO atomDTO = (AtomDTO) obj;
            long hashCode = (widgetInfo.d() + i11).hashCode();
            if (state.getEnableHtmlTags()) {
                cellListV2Mapper.enableHtmlTagsSupport(atomDTO);
            }
            CornerRadius islandCornerRadius = state.getIslandCornerRadius();
            if (islandCornerRadius == null) {
                islandCornerRadius = CornerRadius.RADIUS_500;
            }
            CornerRadius topIslandCornerRadius = state.getTopIslandCornerRadius();
            if (topIslandCornerRadius == null) {
                topIslandCornerRadius = CornerRadius.NO_RADIUS;
            }
            CornerRadius cornerRadius = CornerRadius.NO_RADIUS;
            if (topIslandCornerRadius == cornerRadius) {
                topIslandCornerRadius = null;
            }
            if (topIslandCornerRadius == null) {
                topIslandCornerRadius = islandCornerRadius;
            }
            CornerRadius bottomIslandCornerRadius = state.getBottomIslandCornerRadius();
            if (bottomIslandCornerRadius == null) {
                bottomIslandCornerRadius = cornerRadius;
            }
            if (bottomIslandCornerRadius == cornerRadius) {
                bottomIslandCornerRadius = null;
            }
            if (bottomIslandCornerRadius != null) {
                islandCornerRadius = bottomIslandCornerRadius;
            }
            String islandColor = state.getIslandColor();
            String backgroundColor = state.getBackgroundColor();
            CommonCellSettings.LayoutPadding leftMargin = state.getLeftMargin();
            if (leftMargin == null) {
                leftMargin = CommonCellSettings.LayoutPadding.PADDING_500;
            }
            CommonCellSettings.LayoutPadding layoutPadding = leftMargin;
            CommonCellSettings.LayoutPadding rightMargin = state.getRightMargin();
            if (rightMargin == null) {
                rightMargin = CommonCellSettings.LayoutPadding.PADDING_500;
            }
            CommonCellSettings.LayoutPadding layoutPadding2 = rightMargin;
            CommonCellSettings.LayoutPadding defineCellLeftRightPadding = cellListV2Mapper.defineCellLeftRightPadding(cellListV2Mapper.getAtomLeftPadding(atomDTO), state.getLeftPadding());
            CommonCellSettings.LayoutPadding defineCellLeftRightPadding2 = cellListV2Mapper.defineCellLeftRightPadding(cellListV2Mapper.getAtomRightPadding(atomDTO), state.getRightPadding());
            if (i11 == 0 && (trackingInfo = state.getTrackingInfo()) != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            t tVar2 = tVar;
            int size = state.getCells().size();
            float pxF = ResourceExtKt.toPxF(topIslandCornerRadius.getPx());
            float pxF2 = ResourceExtKt.toPxF(islandCornerRadius.getPx());
            CommonCellSettings.LayoutPadding topMargin = state.getTopMargin();
            if (topMargin == null) {
                topMargin = CommonCellSettings.LayoutPadding.NONE;
            }
            CommonCellSettings.LayoutPadding bottomMargin = state.getBottomMargin();
            if (bottomMargin == null) {
                bottomMargin = CommonCellSettings.LayoutPadding.NONE;
            }
            arrayList.add(new CellV2VO(hashCode, islandColor, backgroundColor, layoutPadding, layoutPadding2, defineCellLeftRightPadding, defineCellLeftRightPadding2, tVar2, atomDTO, cellListV2Mapper.determineLayoutModel(i11, size, pxF, pxF2, topMargin, bottomMargin, state.getIslandColor(), !(state.getEnableCellsSeparators() != null ? r4.booleanValue() : false), atomDTO)));
            cellListV2Mapper = this;
            i11 = i12;
        }
        return arrayList;
    }
}
