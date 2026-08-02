package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.common.domain.roundcellsutils.R$layout;
import ru.ozon.app.android.common.domain.roundcellsutils.RoundedCellsVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b\u0006\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010/\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001eR\u0014\u00102\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u0010\u000e\u001a\u00020\u0005*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u00103R\u001a\u00107\u001a\u0004\u0018\u000104*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\u0004\u0018\u000104*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006;"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/RoundedCell;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ToggleItem;", "", "id", "", "isSelect", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;", "roundedCellsVo", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "containerLayoutModel", "<init>", "(Ljava/lang/String;ZLru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "isSelected", "copy", "(Lru/ozon/uni/atoms/data/AtomDTO;Z)Lru/ozon/uni/atoms/data/AtomDTO;", "toggleItem", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "selectItem", "unSelectItem", "getText", "()Ljava/lang/String;", "getSubtext", "getIsSelected", "()Z", "(Ljava/lang/String;ZLru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/RoundedCell;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;", "getRoundedCellsVo", "()Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO;", "Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "getContainerLayoutModel", "()Lru/ozon/app/android/common/domain/roundcellsutils/RoundedCellsVO$LayoutModel;", "viewType$1", "I", "getViewType", "viewType", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "cell", "(Lru/ozon/uni/atoms/data/AtomDTO;)Z", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "(Lru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "getSubtitle", "subtitle", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RoundedCell extends FilterValuesCell implements ToggleItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int viewType = R$layout.widget_rounded_cells;

    @NotNull
    private final RoundedCellsVO.LayoutModel containerLayoutModel;

    @NotNull
    private final String id;
    private final boolean isSelect;

    @NotNull
    private final RoundedCellsVO roundedCellsVo;

    /* renamed from: viewType$1, reason: from kotlin metadata */
    private final int viewType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/RoundedCell$Companion;", "", "<init>", "()V", "viewType", "", "getViewType", "()I", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getViewType() {
            return RoundedCell.viewType;
        }

        private Companion() {
        }
    }

    public RoundedCell(@NotNull String id2, boolean z11, @NotNull RoundedCellsVO roundedCellsVo, @NotNull RoundedCellsVO.LayoutModel containerLayoutModel) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(roundedCellsVo, "roundedCellsVo");
        Intrinsics.checkNotNullParameter(containerLayoutModel, "containerLayoutModel");
        this.id = id2;
        this.isSelect = z11;
        this.roundedCellsVo = roundedCellsVo;
        this.containerLayoutModel = containerLayoutModel;
        this.viewType = viewType;
    }

    public static /* synthetic */ RoundedCell copy$default(RoundedCell roundedCell, String str, boolean z11, RoundedCellsVO roundedCellsVO, RoundedCellsVO.LayoutModel layoutModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = roundedCell.id;
        }
        if ((i11 & 2) != 0) {
            z11 = roundedCell.isSelect;
        }
        if ((i11 & 4) != 0) {
            roundedCellsVO = roundedCell.roundedCellsVo;
        }
        if ((i11 & 8) != 0) {
            layoutModel = roundedCell.containerLayoutModel;
        }
        return roundedCell.copy(str, z11, roundedCellsVO, layoutModel);
    }

    private final AtomDTO getCell() {
        return this.roundedCellsVo.getCell();
    }

    private final OzonSpannableString getSubtitle(AtomDTO atomDTO) {
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) atomDTO).getSubtitle();
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) atomDTO).getSubtitle();
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) atomDTO).getSubtitle();
        }
        return null;
    }

    private final OzonSpannableString getTitle(AtomDTO atomDTO) {
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) atomDTO).getTitle();
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) atomDTO).getTitle();
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) atomDTO).getTitle();
        }
        return null;
    }

    private final boolean isSelected(AtomDTO atomDTO) {
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) atomDTO).isSelected();
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) atomDTO).isSelected();
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) {
            return ((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) atomDTO).isSelected();
        }
        return false;
    }

    @NotNull
    public final RoundedCell copy(@NotNull String id2, boolean isSelect, @NotNull RoundedCellsVO roundedCellsVo, @NotNull RoundedCellsVO.LayoutModel containerLayoutModel) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(roundedCellsVo, "roundedCellsVo");
        Intrinsics.checkNotNullParameter(containerLayoutModel, "containerLayoutModel");
        return new RoundedCell(id2, isSelect, roundedCellsVo, containerLayoutModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedCell)) {
            return false;
        }
        RoundedCell roundedCell = (RoundedCell) other;
        return Intrinsics.d(this.id, roundedCell.id) && this.isSelect == roundedCell.isSelect && Intrinsics.d(this.roundedCellsVo, roundedCell.roundedCellsVo) && Intrinsics.d(this.containerLayoutModel, roundedCell.containerLayoutModel);
    }

    @NotNull
    public final RoundedCellsVO.LayoutModel getContainerLayoutModel() {
        return this.containerLayoutModel;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    public boolean getIsSelected() {
        return isSelected(getCell());
    }

    @NotNull
    public final RoundedCellsVO getRoundedCellsVo() {
        return this.roundedCellsVo;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public String getSubtext() {
        OzonSpannableString subtitle = getSubtitle(getCell());
        String obj = subtitle != null ? subtitle.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public String getText() {
        return String.valueOf(getTitle(getCell()));
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return this.containerLayoutModel.hashCode() + ((this.roundedCellsVo.hashCode() + C3532b.a(this.id.hashCode() * 31, 31, this.isSelect)) * 31);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    /* renamed from: isSelect, reason: from getter */
    public boolean getIsSelect() {
        return this.isSelect;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell selectItem() {
        if (isSelected(getCell())) {
            return this;
        }
        RoundedCellsVO roundedCellsVO = this.roundedCellsVo;
        AtomDTO copy = copy(getCell(), true);
        if (copy == null) {
            copy = getCell();
        }
        return copy$default(this, null, false, RoundedCellsVO.copy$default(roundedCellsVO, 0L, copy, null, null, null, 29, null), null, 11, null);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        boolean z11 = this.isSelect;
        RoundedCellsVO roundedCellsVO = this.roundedCellsVo;
        RoundedCellsVO.LayoutModel layoutModel = this.containerLayoutModel;
        StringBuilder b11 = C4636t5.b("RoundedCell(id=", str, ", isSelect=", ", roundedCellsVo=", z11);
        b11.append(roundedCellsVO);
        b11.append(", containerLayoutModel=");
        b11.append(layoutModel);
        b11.append(")");
        return b11.toString();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell toggleItem() {
        RoundedCellsVO roundedCellsVO = this.roundedCellsVo;
        AtomDTO copy = copy(getCell(), !isSelected(getCell()));
        if (copy == null) {
            copy = getCell();
        }
        return copy$default(this, null, false, RoundedCellsVO.copy$default(roundedCellsVO, 0L, copy, null, null, null, 29, null), null, 11, null);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell unSelectItem() {
        if (!isSelected(getCell())) {
            return this;
        }
        RoundedCellsVO roundedCellsVO = this.roundedCellsVo;
        AtomDTO copy = copy(getCell(), false);
        if (copy == null) {
            copy = getCell();
        }
        return copy$default(this, null, false, RoundedCellsVO.copy$default(roundedCellsVO, 0L, copy, null, null, null, 29, null), null, 11, null);
    }

    private final AtomDTO copy(AtomDTO atomDTO, boolean z11) {
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) {
            return CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio) atomDTO, null, null, z11, false, false, null, false, null, null, null, null, null, null, null, false, false, null, null, null, 524283, null);
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
            return CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) atomDTO, z11, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 1048574, null);
        }
        if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) {
            return CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter) atomDTO, z11, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 4194302, null);
        }
        return null;
    }
}
