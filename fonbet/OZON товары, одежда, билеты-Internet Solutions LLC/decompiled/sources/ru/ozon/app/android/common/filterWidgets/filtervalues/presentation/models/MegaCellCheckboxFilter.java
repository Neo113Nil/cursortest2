package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import Bi.b;
import Kk.C3532b;
import Ve.C4636t5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018Jh\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b\u0006\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\r\u0010\u0018R\u001a\u00100\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/MegaCellCheckboxFilter;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ToggleItem;", "", "id", "", "isSelect", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "deselectedTrackingInfo", "selectedTrackingInfo", "isSelected", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;Ljava/util/Map;Z)V", "toggleItem", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "selectItem", "unSelectItem", "getText", "()Ljava/lang/String;", "getSubtext", "getIsSelected", "()Z", "copy", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;Ljava/util/Map;Z)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/MegaCellCheckboxFilter;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/Map;", "getDeselectedTrackingInfo", "()Ljava/util/Map;", "getSelectedTrackingInfo", "viewType$1", "I", "getViewType", "viewType", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MegaCellCheckboxFilter extends FilterValuesCell implements ToggleItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int viewType = R$layout.filter_values_mega_cell;

    @NotNull
    private final CellDTO cell;
    private final Map<String, TokenizedTrackingInfo> deselectedTrackingInfo;

    @NotNull
    private final String id;
    private final boolean isSelect;
    private final boolean isSelected;
    private final Map<String, TokenizedTrackingInfo> selectedTrackingInfo;

    /* renamed from: viewType$1, reason: from kotlin metadata */
    private final int viewType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/MegaCellCheckboxFilter$Companion;", "", "<init>", "()V", "viewType", "", "getViewType", "()I", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getViewType() {
            return MegaCellCheckboxFilter.viewType;
        }

        private Companion() {
        }
    }

    public MegaCellCheckboxFilter(@NotNull String id2, boolean z11, @NotNull CellDTO cell, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, boolean z12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = id2;
        this.isSelect = z11;
        this.cell = cell;
        this.deselectedTrackingInfo = map;
        this.selectedTrackingInfo = map2;
        this.isSelected = z12;
        this.viewType = viewType;
    }

    public static /* synthetic */ MegaCellCheckboxFilter copy$default(MegaCellCheckboxFilter megaCellCheckboxFilter, String str, boolean z11, CellDTO cellDTO, Map map, Map map2, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = megaCellCheckboxFilter.id;
        }
        if ((i11 & 2) != 0) {
            z11 = megaCellCheckboxFilter.isSelect;
        }
        if ((i11 & 4) != 0) {
            cellDTO = megaCellCheckboxFilter.cell;
        }
        if ((i11 & 8) != 0) {
            map = megaCellCheckboxFilter.deselectedTrackingInfo;
        }
        if ((i11 & 16) != 0) {
            map2 = megaCellCheckboxFilter.selectedTrackingInfo;
        }
        if ((i11 & 32) != 0) {
            z12 = megaCellCheckboxFilter.isSelected;
        }
        Map map3 = map2;
        boolean z13 = z12;
        return megaCellCheckboxFilter.copy(str, z11, cellDTO, map, map3, z13);
    }

    @NotNull
    public final MegaCellCheckboxFilter copy(@NotNull String id2, boolean isSelect, @NotNull CellDTO cell, Map<String, TokenizedTrackingInfo> deselectedTrackingInfo, Map<String, TokenizedTrackingInfo> selectedTrackingInfo, boolean isSelected) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new MegaCellCheckboxFilter(id2, isSelect, cell, deselectedTrackingInfo, selectedTrackingInfo, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MegaCellCheckboxFilter)) {
            return false;
        }
        MegaCellCheckboxFilter megaCellCheckboxFilter = (MegaCellCheckboxFilter) other;
        return Intrinsics.d(this.id, megaCellCheckboxFilter.id) && this.isSelect == megaCellCheckboxFilter.isSelect && Intrinsics.d(this.cell, megaCellCheckboxFilter.cell) && Intrinsics.d(this.deselectedTrackingInfo, megaCellCheckboxFilter.deselectedTrackingInfo) && Intrinsics.d(this.selectedTrackingInfo, megaCellCheckboxFilter.selectedTrackingInfo) && this.isSelected == megaCellCheckboxFilter.isSelected;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final Map<String, TokenizedTrackingInfo> getDeselectedTrackingInfo() {
        return this.deselectedTrackingInfo;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    public boolean getIsSelected() {
        return this.isSelected;
    }

    public final Map<String, TokenizedTrackingInfo> getSelectedTrackingInfo() {
        return this.selectedTrackingInfo;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public String getSubtext() {
        OzonSpannableString text;
        CellDTO.CellText subtitle = this.cell.getCenterBlock().getSubtitle();
        String obj = (subtitle == null || (text = subtitle.getText()) == null) ? null : text.toString();
        return obj == null ? "" : obj;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public String getText() {
        String obj = this.cell.getCenterBlock().getTitle().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        return obj;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int c11 = b.c(this.cell, C3532b.a(this.id.hashCode() * 31, 31, this.isSelect), 31);
        Map<String, TokenizedTrackingInfo> map = this.deselectedTrackingInfo;
        int hashCode = (c11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.selectedTrackingInfo;
        return Boolean.hashCode(this.isSelected) + ((hashCode + (map2 != null ? map2.hashCode() : 0)) * 31);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    /* renamed from: isSelect, reason: from getter */
    public boolean getIsSelect() {
        return this.isSelect;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell selectItem() {
        return copy$default(this, null, false, null, null, null, true, 31, null);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        boolean z11 = this.isSelect;
        CellDTO cellDTO = this.cell;
        Map<String, TokenizedTrackingInfo> map = this.deselectedTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.selectedTrackingInfo;
        boolean z12 = this.isSelected;
        StringBuilder b11 = C4636t5.b("MegaCellCheckboxFilter(id=", str, ", isSelect=", ", cell=", z11);
        b11.append(cellDTO);
        b11.append(", deselectedTrackingInfo=");
        b11.append(map);
        b11.append(", selectedTrackingInfo=");
        b11.append(map2);
        b11.append(", isSelected=");
        b11.append(z12);
        b11.append(")");
        return b11.toString();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell toggleItem() {
        return copy$default(this, null, false, null, null, null, !this.isSelected, 31, null);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.ToggleItem
    @NotNull
    public FilterValuesCell unSelectItem() {
        return copy$default(this, null, false, null, null, null, false, 31, null);
    }
}
