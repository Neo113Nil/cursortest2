package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0080\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b\u0006\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/CheckBoxWithIcon;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ToggleItem;", "", "id", "", "isSelect", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;", "cell", "<init>", "(Ljava/lang/String;ZLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;)V", "toggleItem", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "selectItem", "unSelectItem", "getText", "()Ljava/lang/String;", "getSubtext", "getIsSelected", "()Z", "hideSeparator", "(Z)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "copy", "(Ljava/lang/String;ZLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/CheckBoxWithIcon;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadioCounter;", "viewType$1", "I", "getViewType", "viewType", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckBoxWithIcon extends FilterValuesCell implements ToggleItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int viewType = R$layout.filter_values_item_checkbox_with_icon;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter cell;

    @NotNull
    private final String id;
    private final boolean isSelect;

    /* renamed from: viewType$1, reason: from kotlin metadata */
    private final int viewType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/CheckBoxWithIcon$Companion;", "", "<init>", "()V", "viewType", "", "getViewType", "()I", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getViewType() {
            return CheckBoxWithIcon.viewType;
        }

        private Companion() {
        }
    }

    public CheckBoxWithIcon(@NotNull String id2, boolean z11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter cell) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = id2;
        this.isSelect = z11;
        this.cell = cell;
        this.viewType = viewType;
    }

    public static /* synthetic */ CheckBoxWithIcon copy$default(CheckBoxWithIcon checkBoxWithIcon, String str, boolean z11, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter cellWithSubtitle24IconCheckboxRadioCounter, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = checkBoxWithIcon.id;
        }
        if ((i11 & 2) != 0) {
            z11 = checkBoxWithIcon.isSelect;
        }
        if ((i11 & 4) != 0) {
            cellWithSubtitle24IconCheckboxRadioCounter = checkBoxWithIcon.cell;
        }
        return checkBoxWithIcon.copy(str, z11, cellWithSubtitle24IconCheckboxRadioCounter);
    }

    @NotNull
    public final CheckBoxWithIcon copy(@NotNull String id2, boolean isSelect, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter cell) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new CheckBoxWithIcon(id2, isSelect, cell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckBoxWithIcon)) {
            return false;
        }
        CheckBoxWithIcon checkBoxWithIcon = (CheckBoxWithIcon) other;
        return Intrinsics.d(this.id, checkBoxWithIcon.id) && this.isSelect == checkBoxWithIcon.isSelect && Intrinsics.d(this.cell, checkBoxWithIcon.cell);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter getCell() {
        return this.cell;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    public boolean getIsSelected() {
        return this.cell.isSelected();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public String getSubtext() {
        OzonSpannableString subtitle = this.cell.getSubtitle();
        String obj = subtitle != null ? subtitle.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public String getText() {
        String obj = this.cell.getTitle().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        return obj;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return this.cell.hashCode() + C3532b.a(this.id.hashCode() * 31, 31, this.isSelect);
    }

    @NotNull
    public final FilterValuesCell hideSeparator(boolean hideSeparator) {
        return copy$default(this, null, false, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.copy$default(this.cell, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hideSeparator, false, null, null, null, 4063231, null), 3, null);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    /* renamed from: isSelect, reason: from getter */
    public boolean getIsSelect() {
        return this.isSelect;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell selectItem() {
        return this.cell.isSelected() ? this : copy$default(this, null, false, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.copy$default(this.cell, true, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 4194302, null), 3, null);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        boolean z11 = this.isSelect;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter cellWithSubtitle24IconCheckboxRadioCounter = this.cell;
        StringBuilder b11 = C4636t5.b("CheckBoxWithIcon(id=", str, ", isSelect=", ", cell=", z11);
        b11.append(cellWithSubtitle24IconCheckboxRadioCounter);
        b11.append(")");
        return b11.toString();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell toggleItem() {
        return copy$default(this, null, false, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.copy$default(this.cell, !r1.isSelected(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 4194302, null), 3, null);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell unSelectItem() {
        return !this.cell.isSelected() ? this : copy$default(this, null, false, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.copy$default(this.cell, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 4194302, null), 3, null);
    }
}
