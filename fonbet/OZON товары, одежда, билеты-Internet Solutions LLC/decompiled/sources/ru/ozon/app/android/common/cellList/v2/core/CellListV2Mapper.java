package ru.ozon.app.android.common.cellList.v2.core;

import T00.a;
import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.common.cellList.v2.presentation.CellV2VO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.common.HTMLTagSupport;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 72*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u00017B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JY\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001d*\u00060\u0003j\u0002`(H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u001d*\u00020+H\u0002¢\u0006\u0004\b,\u0010-J'\u0010/\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u001dH\u0002¢\u0006\u0004\b/\u00100J*\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u00101\u001a\u00020\u00022\n\u00102\u001a\u00060\u0003j\u0002`(H\u0096\u0002¢\u0006\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/core/CellListV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getAtomLeftPadding", "(Lru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getAtomRightPadding", "atomPadding", "widgetPadding", "defineCellLeftRightPadding", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "", "index", "size", "", "topCornerRadius", "bottomCornerRadius", "topMargin", "bottomMargin", "", "islandColor", "", "ignoreCellsSeparators", "Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO$LayoutModel;", "determineLayoutModel", "(IIFFLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO$LayoutModel;", "", "enableHtmlTagsSupport", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "shouldDisable", "disableRadioAutoToggle", "(Lru/ozon/uni/atoms/data/AtomDTO;Z)Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "shouldDisableRadioAutoToggle", "(Ll20/d;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "hasRadioControl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Z", "listSeparator", "determineSeparator", "(ZLru/ozon/uni/atoms/data/AtomDTO;Z)Z", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;Ll20/d;)Ljava/util/List;", "dp4", "I", "Companion", "cell-list_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellListV2Mapper implements Function2<CellListV2DTO, d, List<? extends CellV2VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int dp4 = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/core/CellListV2Mapper$Companion;", "", "<init>", "()V", "LANGUAGE_SELECTOR_PAGE", "", "CURRENCY_SELECTOR_PAGE", "cell-list_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final CommonCellSettings.LayoutPadding defineCellLeftRightPadding(CommonCellSettings.LayoutPadding atomPadding, CommonCellSettings.LayoutPadding widgetPadding) {
        return (atomPadding == null || atomPadding == CommonCellSettings.LayoutPadding.NONE) ? widgetPadding == null ? CommonCellSettings.LayoutPadding.PADDING_400 : widgetPadding : atomPadding;
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

    private final AtomDTO disableRadioAutoToggle(AtomDTO atomDTO, boolean z11) {
        CellDTO.Settings copy$default;
        if (z11 && (atomDTO instanceof CellDTO)) {
            CellDTO cellDTO = (CellDTO) atomDTO;
            if (hasRadioControl(cellDTO)) {
                CellDTO.Settings settings = cellDTO.getSettings();
                return CellDTO.copy$default(cellDTO, null, (settings == null || (copy$default = CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null)) == null) ? new CellDTO.Settings(null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : copy$default, null, null, null, 29, null);
            }
        }
        return atomDTO;
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

    private final boolean hasRadioControl(CellDTO cellDTO) {
        CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
        if ((leftBlock != null ? leftBlock.getControl() : null) instanceof RadioDTO) {
            return true;
        }
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        return (rightBlock != null ? rightBlock.getControl() : null) instanceof RadioDTO;
    }

    private final boolean shouldDisableRadioAutoToggle(d dVar) {
        String c11;
        a b11 = dVar.b();
        return (b11 == null || (c11 = b11.c()) == null || (!h.t(c11, "modal/languageSelector", false) && !h.t(c11, "modal/currencySelector", false))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<CellV2VO> invoke(@NotNull CellListV2DTO state, @NotNull d widgetInfo) {
        int hashCode;
        long j11;
        CornerRadius islandCornerRadius;
        CornerRadius topIslandCornerRadius;
        CornerRadius cornerRadius;
        CornerRadius bottomIslandCornerRadius;
        CommonCellSettings.LayoutPadding leftMargin;
        CommonCellSettings.LayoutPadding rightMargin;
        CommonCellSettings.LayoutPadding topMargin;
        CommonCellSettings.LayoutPadding bottomMargin;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        AtomActionDTO action2;
        CellListV2Mapper cellListV2Mapper = this;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        boolean shouldDisableRadioAutoToggle = cellListV2Mapper.shouldDisableRadioAutoToggle(widgetInfo);
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
            if (atomDTO instanceof CellDTO) {
                CellDTO cellDTO = (CellDTO) atomDTO;
                CommonControlSettings common = cellDTO.getCommon();
                if (Intrinsics.d((common == null || (action2 = common.getAction()) == null) ? null : action2.getId(), "setBugReportMode")) {
                    CommonControlSettings common2 = cellDTO.getCommon();
                    String id2 = (common2 == null || (action = common2.getAction()) == null) ? null : action.getId();
                    hashCode = id2 != null ? id2.hashCode() : 0;
                    j11 = hashCode;
                    AtomDTO disableRadioAutoToggle = cellListV2Mapper.disableRadioAutoToggle(atomDTO, shouldDisableRadioAutoToggle);
                    if (state.getEnableHtmlTags()) {
                        cellListV2Mapper.enableHtmlTagsSupport(disableRadioAutoToggle);
                    }
                    islandCornerRadius = state.getIslandCornerRadius();
                    if (islandCornerRadius == null) {
                        islandCornerRadius = CornerRadius.RADIUS_500;
                    }
                    topIslandCornerRadius = state.getTopIslandCornerRadius();
                    if (topIslandCornerRadius == null) {
                        topIslandCornerRadius = CornerRadius.NO_RADIUS;
                    }
                    cornerRadius = CornerRadius.NO_RADIUS;
                    if (topIslandCornerRadius == cornerRadius) {
                        topIslandCornerRadius = null;
                    }
                    if (topIslandCornerRadius == null) {
                        topIslandCornerRadius = islandCornerRadius;
                    }
                    bottomIslandCornerRadius = state.getBottomIslandCornerRadius();
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
                    leftMargin = state.getLeftMargin();
                    if (leftMargin == null) {
                        leftMargin = CommonCellSettings.LayoutPadding.PADDING_500;
                    }
                    CommonCellSettings.LayoutPadding layoutPadding = leftMargin;
                    rightMargin = state.getRightMargin();
                    if (rightMargin == null) {
                        rightMargin = CommonCellSettings.LayoutPadding.PADDING_500;
                    }
                    CommonCellSettings.LayoutPadding layoutPadding2 = rightMargin;
                    CommonCellSettings.LayoutPadding defineCellLeftRightPadding = cellListV2Mapper.defineCellLeftRightPadding(cellListV2Mapper.getAtomLeftPadding(disableRadioAutoToggle), state.getLeftPadding());
                    CommonCellSettings.LayoutPadding defineCellLeftRightPadding2 = cellListV2Mapper.defineCellLeftRightPadding(cellListV2Mapper.getAtomRightPadding(disableRadioAutoToggle), state.getRightPadding());
                    if (i11 == 0 && (trackingInfo = state.getTrackingInfo()) != null) {
                        tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
                    }
                    t tVar2 = tVar;
                    int size = state.getCells().size();
                    float pxF = ResourceExtKt.toPxF(topIslandCornerRadius.getPx());
                    float pxF2 = ResourceExtKt.toPxF(islandCornerRadius.getPx());
                    topMargin = state.getTopMargin();
                    if (topMargin == null) {
                        topMargin = CommonCellSettings.LayoutPadding.NONE;
                    }
                    bottomMargin = state.getBottomMargin();
                    if (bottomMargin == null) {
                        bottomMargin = CommonCellSettings.LayoutPadding.NONE;
                    }
                    arrayList.add(new CellV2VO(j11, islandColor, backgroundColor, layoutPadding, layoutPadding2, defineCellLeftRightPadding, defineCellLeftRightPadding2, tVar2, disableRadioAutoToggle, cellListV2Mapper.determineLayoutModel(i11, size, pxF, pxF2, topMargin, bottomMargin, state.getIslandColor(), !(state.getEnableCellsSeparators() == null ? r8.booleanValue() : false), disableRadioAutoToggle), state.getEventActions()));
                    cellListV2Mapper = this;
                    i11 = i12;
                }
            }
            hashCode = (widgetInfo.d() + i11).hashCode();
            j11 = hashCode;
            AtomDTO disableRadioAutoToggle2 = cellListV2Mapper.disableRadioAutoToggle(atomDTO, shouldDisableRadioAutoToggle);
            if (state.getEnableHtmlTags()) {
            }
            islandCornerRadius = state.getIslandCornerRadius();
            if (islandCornerRadius == null) {
            }
            topIslandCornerRadius = state.getTopIslandCornerRadius();
            if (topIslandCornerRadius == null) {
            }
            cornerRadius = CornerRadius.NO_RADIUS;
            if (topIslandCornerRadius == cornerRadius) {
            }
            if (topIslandCornerRadius == null) {
            }
            bottomIslandCornerRadius = state.getBottomIslandCornerRadius();
            if (bottomIslandCornerRadius == null) {
            }
            if (bottomIslandCornerRadius == cornerRadius) {
            }
            if (bottomIslandCornerRadius != null) {
            }
            String islandColor2 = state.getIslandColor();
            String backgroundColor2 = state.getBackgroundColor();
            leftMargin = state.getLeftMargin();
            if (leftMargin == null) {
            }
            CommonCellSettings.LayoutPadding layoutPadding3 = leftMargin;
            rightMargin = state.getRightMargin();
            if (rightMargin == null) {
            }
            CommonCellSettings.LayoutPadding layoutPadding22 = rightMargin;
            CommonCellSettings.LayoutPadding defineCellLeftRightPadding3 = cellListV2Mapper.defineCellLeftRightPadding(cellListV2Mapper.getAtomLeftPadding(disableRadioAutoToggle2), state.getLeftPadding());
            CommonCellSettings.LayoutPadding defineCellLeftRightPadding22 = cellListV2Mapper.defineCellLeftRightPadding(cellListV2Mapper.getAtomRightPadding(disableRadioAutoToggle2), state.getRightPadding());
            if (i11 == 0) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
            }
            t tVar22 = tVar;
            int size2 = state.getCells().size();
            float pxF3 = ResourceExtKt.toPxF(topIslandCornerRadius.getPx());
            float pxF22 = ResourceExtKt.toPxF(islandCornerRadius.getPx());
            topMargin = state.getTopMargin();
            if (topMargin == null) {
            }
            bottomMargin = state.getBottomMargin();
            if (bottomMargin == null) {
            }
            arrayList.add(new CellV2VO(j11, islandColor2, backgroundColor2, layoutPadding3, layoutPadding22, defineCellLeftRightPadding3, defineCellLeftRightPadding22, tVar22, disableRadioAutoToggle2, cellListV2Mapper.determineLayoutModel(i11, size2, pxF3, pxF22, topMargin, bottomMargin, state.getIslandColor(), !(state.getEnableCellsSeparators() == null ? r8.booleanValue() : false), disableRadioAutoToggle2), state.getEventActions()));
            cellListV2Mapper = this;
            i11 = i12;
        }
        return arrayList;
    }
}
