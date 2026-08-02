package ru.ozon.app.android.common.filterWidgets.filtervalues.data.cellstore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.common.domain.roundcellsutils.RoundedCellsVO;
import ru.ozon.app.android.common.domain.roundcellsutils.RounderCellsUtilsKt;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.CellsModel;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBox;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBoxWithIcon;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.DescriptionCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.HeaderCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.RoundedCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.TitleCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u0001H\u0000\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\"\u0010\u0018\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\"\u0010\u001c\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u001d"}, d2 = {"toggleItem", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/CellsModel;", "id", "", "toggleSingleItem", "selectAllItems", "unSelectAllItems", "onSearchTextChange", "searchText", "expandHeader", "filterCellsBySearchText", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "filterTitleCells", "recalculateCornerTitleCell", "filterHeaderCells", "hideCellsBellowNotExpandedHeader", "recalculateHeaderSeparators", "recalculateCellsSeparators", "recalculateRoundedCellsBorders", "copy", "Lru/ozon/uni/atoms/data/AtomDTO;", "hideSeparator", "", "isTitleWithoutItems", "index", "", "cells", "isHeaderWithoutItems", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellToggleUtilsKt {
    private static final AtomDTO copy(AtomDTO atomDTO, boolean z11) {
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) {
            return CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) atomDTO, null, null, false, false, false, null, false, null, null, null, null, null, null, null, z11, false, null, null, null, 507903, null);
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
            return CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) atomDTO, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, z11, false, null, null, null, 1015807, null);
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) {
            return CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) atomDTO, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z11, false, null, null, null, 4063231, null);
        }
        return null;
    }

    @NotNull
    public static final CellsModel expandHeader(@NotNull CellsModel cellsModel, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(cellsModel, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        List<FilterValuesCell> cells = cellsModel.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        for (Object obj : cells) {
            if (obj instanceof HeaderCell) {
                HeaderCell headerCell = (HeaderCell) obj;
                if (Intrinsics.d(headerCell.getId(), id2)) {
                    obj = headerCell.toggleExpandedState();
                }
            }
            arrayList.add(obj);
        }
        return CellsModel.copy$default(cellsModel, null, arrayList, 1, null);
    }

    @NotNull
    public static final List<FilterValuesCell> filterCellsBySearchText(@NotNull CellsModel cellsModel) {
        Intrinsics.checkNotNullParameter(cellsModel, "<this>");
        if (h.K(cellsModel.getSearchText())) {
            return cellsModel.getCells();
        }
        List<FilterValuesCell> cells = cellsModel.getCells();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cells) {
            Object obj2 = (FilterValuesCell) obj;
            boolean z11 = obj2 instanceof DescriptionCell;
            if (obj2 instanceof ToggleItem) {
                ToggleItem toggleItem = (ToggleItem) obj2;
                if (!h.t(toggleItem.getText(), cellsModel.getSearchText(), true) && !h.t(toggleItem.getSubtext(), cellsModel.getSearchText(), true)) {
                }
            }
            if (!z11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<FilterValuesCell> filterHeaderCells(@NotNull List<? extends FilterValuesCell> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (!isHeaderWithoutItems((FilterValuesCell) obj, i11, list)) {
                arrayList.add(obj);
            }
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final List<FilterValuesCell> filterTitleCells(@NotNull List<? extends FilterValuesCell> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (!isTitleWithoutItems((FilterValuesCell) obj, i11, list)) {
                arrayList.add(obj);
            }
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final List<FilterValuesCell> hideCellsBellowNotExpandedHeader(@NotNull List<? extends FilterValuesCell> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (Object obj : list) {
            FilterValuesCell filterValuesCell = (FilterValuesCell) obj;
            boolean z12 = true;
            if (filterValuesCell instanceof HeaderCell) {
                z11 = !((HeaderCell) filterValuesCell).getIsExpanded();
            } else if (z11) {
                z12 = false;
            }
            if (z12) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static final boolean isHeaderWithoutItems(FilterValuesCell filterValuesCell, int i11, List<? extends FilterValuesCell> list) {
        FilterValuesCell filterValuesCell2 = (FilterValuesCell) C7714v.Q(i11 + 1, list);
        if (filterValuesCell instanceof HeaderCell) {
            return (filterValuesCell2 instanceof HeaderCell) || filterValuesCell2 == null;
        }
        return false;
    }

    private static final boolean isTitleWithoutItems(FilterValuesCell filterValuesCell, int i11, List<? extends FilterValuesCell> list) {
        return (filterValuesCell instanceof TitleCell) && !(((FilterValuesCell) C7714v.Q(i11 + 1, list)) instanceof ToggleItem);
    }

    @NotNull
    public static final CellsModel onSearchTextChange(@NotNull CellsModel cellsModel, @NotNull String searchText) {
        Intrinsics.checkNotNullParameter(cellsModel, "<this>");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        List<FilterValuesCell> cells = cellsModel.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        for (Object obj : cells) {
            if (obj instanceof HeaderCell) {
                obj = ((HeaderCell) obj).setExpandedState(true);
            }
            arrayList.add(obj);
        }
        return cellsModel.copy(searchText, arrayList);
    }

    @NotNull
    public static final List<FilterValuesCell> recalculateCellsSeparators(@NotNull List<? extends FilterValuesCell> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends FilterValuesCell> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FilterValuesCell filterValuesCell = (FilterValuesCell) obj;
            boolean z11 = i11 == C7714v.P(list) || filterValuesCell.getIsSelect();
            if (filterValuesCell instanceof CheckBoxWithIcon) {
                filterValuesCell = ((CheckBoxWithIcon) filterValuesCell).hideSeparator(z11);
            } else if (filterValuesCell instanceof CheckBox) {
                filterValuesCell = ((CheckBox) filterValuesCell).hideSeparator(z11);
            }
            arrayList.add(filterValuesCell);
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<FilterValuesCell> recalculateCornerTitleCell(@NotNull List<? extends FilterValuesCell> list) {
        float topCornersRadius;
        TitleCell copy$default;
        Intrinsics.checkNotNullParameter(list, "<this>");
        float pxF = UiExtKt.toPxF(24.0f);
        List<? extends FilterValuesCell> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            Object obj2 = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FilterValuesCell filterValuesCell = (FilterValuesCell) obj;
            TitleCell titleCell = filterValuesCell instanceof TitleCell ? (TitleCell) filterValuesCell : null;
            if (titleCell != null) {
                TitleCell titleCell2 = (TitleCell) filterValuesCell;
                if (titleCell2.getIsSelect()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((FilterValuesCell) next) instanceof TitleCell) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (Intrinsics.d(obj2, filterValuesCell)) {
                        topCornersRadius = pxF;
                        copy$default = TitleCell.copy$default(titleCell, null, false, null, topCornersRadius, false, false, 55, null);
                        if (copy$default == null) {
                            filterValuesCell = copy$default;
                        }
                    }
                }
                topCornersRadius = titleCell2.getTopCornersRadius();
                copy$default = TitleCell.copy$default(titleCell, null, false, null, topCornersRadius, false, false, 55, null);
                if (copy$default == null) {
                }
            }
            arrayList.add(filterValuesCell);
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<FilterValuesCell> recalculateHeaderSeparators(@NotNull List<? extends FilterValuesCell> list) {
        boolean z11;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends FilterValuesCell> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FilterValuesCell filterValuesCell = (FilterValuesCell) obj;
            List<FilterValuesCell> filterHeaderCells = filterHeaderCells(list);
            if (!(filterHeaderCells instanceof Collection) || !filterHeaderCells.isEmpty()) {
                for (FilterValuesCell filterValuesCell2 : filterHeaderCells) {
                    if (!(filterValuesCell2 instanceof HeaderCell) || ((HeaderCell) filterValuesCell2).getIsExpanded()) {
                        break;
                    }
                }
            }
            if (i11 != C7714v.P(list) && !filterValuesCell.getIsSelect()) {
                z11 = true;
                if (!(filterValuesCell instanceof HeaderCell)) {
                    filterValuesCell = ((HeaderCell) filterValuesCell).showSeparator(z11);
                }
                arrayList.add(filterValuesCell);
                i11 = i12;
            }
            z11 = false;
            if (!(filterValuesCell instanceof HeaderCell)) {
            }
            arrayList.add(filterValuesCell);
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final List<FilterValuesCell> recalculateRoundedCellsBorders(@NotNull List<? extends FilterValuesCell> list) {
        boolean z11;
        List<? extends FilterValuesCell> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "<this>");
        List<List<CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex>> recalculateRoundedCellsBorders$getRoundedCellsSequences = recalculateRoundedCellsBorders$getRoundedCellsSequences(list2);
        ArrayList W02 = C7714v.W0(list2);
        float pxF = UiExtKt.toPxF(24.0f);
        int px = ResourceExtKt.toPx(16);
        int px2 = ResourceExtKt.toPx(8);
        int i11 = 0;
        for (Object obj : recalculateRoundedCellsBorders$getRoundedCellsSequences) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            List list3 = (List) obj;
            int i13 = 0;
            for (Object obj2 : list3) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex = (CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex) obj2;
                FilterValuesCell roundedCell = cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex.getRoundedCell();
                Intrinsics.g(roundedCell, "null cannot be cast to non-null type ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.RoundedCell");
                RoundedCell roundedCell2 = (RoundedCell) roundedCell;
                AtomDTO copy = copy(roundedCell2.getRoundedCellsVo().getCell(), roundedCell2.equals(((CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex) C7714v.X(list3)).getRoundedCell()) || roundedCell2.getIsSelect());
                if (copy == null) {
                    copy = roundedCell2.getRoundedCellsVo().getCell();
                }
                AtomDTO atomDTO = copy;
                List<? extends FilterValuesCell> list4 = list2;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator<T> it = list4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((FilterValuesCell) it.next()) instanceof HeaderCell) {
                            if (i11 == C7714v.P(recalculateRoundedCellsBorders$getRoundedCellsSequences)) {
                                z11 = true;
                            }
                        }
                    }
                }
                z11 = false;
                boolean z12 = (roundedCell2.getRoundedCellsVo().getCell() instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) && roundedCell2.getIsSelect();
                RoundedCellsVO roundedCellsVo = roundedCell2.getRoundedCellsVo();
                Integer valueOf = Integer.valueOf(i13 == 0 ? px : px2);
                if (!z12) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : roundedCell2.getContainerLayoutModel().getPaddingTop();
                Integer valueOf2 = Integer.valueOf(i13 == C7714v.P(list3) ? px : px2);
                if (!z12) {
                    valueOf2 = null;
                }
                CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex copy$default = CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex.copy$default(cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex, RoundedCell.copy$default(roundedCell2, null, false, RoundedCellsVO.copy$default(roundedCellsVo, 0L, atomDTO, RounderCellsUtilsKt.determineLayoutModel(list3, i13, Integer.valueOf(intValue), Integer.valueOf(valueOf2 != null ? valueOf2.intValue() : roundedCell2.getContainerLayoutModel().getPaddingBottom()), Integer.valueOf(roundedCell2.getContainerLayoutModel().getMarginTop()), Integer.valueOf(roundedCell2.getContainerLayoutModel().getMarginBottom()), Integer.valueOf(roundedCell2.getContainerLayoutModel().getMarginLeft()), Integer.valueOf(roundedCell2.getContainerLayoutModel().getMarginRight()), Float.valueOf(roundedCell2.getContainerLayoutModel().getTopCornerRadius()), Float.valueOf((roundedCell2.getIsSelect() && z11) ? pxF : roundedCell2.getContainerLayoutModel().getBottomCornerRadius())), null, null, 25, null), null, 11, null), 0, 2, null);
                W02.set(copy$default.getIndex(), copy$default.getRoundedCell());
                list2 = list;
                i13 = i14;
            }
            list2 = list;
            i11 = i12;
        }
        return W02;
    }

    private static final List<List<CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex>> recalculateRoundedCellsBorders$getRoundedCellsSequences(List<? extends FilterValuesCell> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FilterValuesCell filterValuesCell = (FilterValuesCell) obj;
            if (filterValuesCell instanceof RoundedCell) {
                arrayList2.add(new CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex(filterValuesCell, i11));
            } else if (!arrayList2.isEmpty()) {
                arrayList.add(C7714v.W0(arrayList2));
                arrayList2.clear();
            }
            i11 = i12;
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(C7714v.W0(arrayList2));
        }
        return arrayList;
    }

    @NotNull
    public static final CellsModel selectAllItems(@NotNull CellsModel cellsModel) {
        Intrinsics.checkNotNullParameter(cellsModel, "<this>");
        List<FilterValuesCell> cells = cellsModel.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        for (Object obj : cells) {
            if (obj instanceof ToggleItem) {
                obj = ((ToggleItem) obj).selectItem();
            } else if (obj instanceof HeaderCell) {
                obj = ((HeaderCell) obj).setExpandedState(true);
            }
            arrayList.add(obj);
        }
        return CellsModel.copy$default(cellsModel, null, arrayList, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell] */
    @NotNull
    public static final CellsModel toggleItem(@NotNull CellsModel cellsModel, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(cellsModel, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        List<FilterValuesCell> cells = cellsModel.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        Iterator it = cells.iterator();
        while (it.hasNext()) {
            ?? r22 = (FilterValuesCell) it.next();
            if ((r22 instanceof ToggleItem) && Intrinsics.d(r22.getId(), id2)) {
                r22 = ((ToggleItem) r22).toggleItem();
            }
            arrayList.add(r22);
        }
        return CellsModel.copy$default(cellsModel, null, arrayList, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell] */
    @NotNull
    public static final CellsModel toggleSingleItem(@NotNull CellsModel cellsModel, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(cellsModel, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        List<FilterValuesCell> cells = cellsModel.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        Iterator it = cells.iterator();
        while (it.hasNext()) {
            ?? r22 = (FilterValuesCell) it.next();
            boolean z11 = r22 instanceof ToggleItem;
            if (z11 && Intrinsics.d(r22.getId(), id2)) {
                r22 = ((ToggleItem) r22).toggleItem();
            } else if (z11 && !Intrinsics.d(r22.getId(), id2)) {
                r22 = ((ToggleItem) r22).unSelectItem();
            }
            arrayList.add(r22);
        }
        return CellsModel.copy$default(cellsModel, null, arrayList, 1, null);
    }

    @NotNull
    public static final CellsModel unSelectAllItems(@NotNull CellsModel cellsModel) {
        Intrinsics.checkNotNullParameter(cellsModel, "<this>");
        List<FilterValuesCell> cells = cellsModel.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        for (Object obj : cells) {
            if (obj instanceof ToggleItem) {
                obj = ((ToggleItem) obj).unSelectItem();
            } else if (obj instanceof HeaderCell) {
                obj = ((HeaderCell) obj).setExpandedState(true);
            }
            arrayList.add(obj);
        }
        return CellsModel.copy$default(cellsModel, null, arrayList, 1, null);
    }
}
