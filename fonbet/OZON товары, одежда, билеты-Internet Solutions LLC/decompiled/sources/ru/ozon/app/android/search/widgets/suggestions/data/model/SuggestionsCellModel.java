package ru.ozon.app.android.search.widgets.suggestions.data.model;

import Ep.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsCellModel;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "backgroundColor", "islandColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topMargin", "bottomMargin", "leftMargin", "rightMargin", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getBackgroundColor", "getIslandColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomMargin", "getLeftMargin", "getRightMargin", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionsCellModel {
    public static final int $stable = CellDTO.$stable;
    private final String backgroundColor;
    private final CommonCellSettings.LayoutPadding bottomMargin;

    @NotNull
    private final CellDTO cell;
    private final String islandColor;
    private final CommonCellSettings.LayoutPadding leftMargin;
    private final CommonCellSettings.LayoutPadding rightMargin;
    private final CommonCellSettings.LayoutPadding topMargin;

    public SuggestionsCellModel(@NotNull CellDTO cell, String str, String str2, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.backgroundColor = str;
        this.islandColor = str2;
        this.topMargin = layoutPadding;
        this.bottomMargin = layoutPadding2;
        this.leftMargin = layoutPadding3;
        this.rightMargin = layoutPadding4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionsCellModel)) {
            return false;
        }
        SuggestionsCellModel suggestionsCellModel = (SuggestionsCellModel) other;
        return Intrinsics.d(this.cell, suggestionsCellModel.cell) && Intrinsics.d(this.backgroundColor, suggestionsCellModel.backgroundColor) && Intrinsics.d(this.islandColor, suggestionsCellModel.islandColor) && this.topMargin == suggestionsCellModel.topMargin && this.bottomMargin == suggestionsCellModel.bottomMargin && this.leftMargin == suggestionsCellModel.leftMargin && this.rightMargin == suggestionsCellModel.rightMargin;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonCellSettings.LayoutPadding getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final String getIslandColor() {
        return this.islandColor;
    }

    public final CommonCellSettings.LayoutPadding getLeftMargin() {
        return this.leftMargin;
    }

    public final CommonCellSettings.LayoutPadding getRightMargin() {
        return this.rightMargin;
    }

    public final CommonCellSettings.LayoutPadding getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.islandColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
        int hashCode4 = (hashCode3 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
        int hashCode5 = (hashCode4 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.leftMargin;
        int hashCode6 = (hashCode5 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.rightMargin;
        return hashCode6 + (layoutPadding4 != null ? layoutPadding4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        String str = this.backgroundColor;
        String str2 = this.islandColor;
        CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.leftMargin;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.rightMargin;
        StringBuilder sb2 = new StringBuilder("SuggestionsCellModel(cell=");
        sb2.append(cellDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", islandColor=");
        sb2.append(str2);
        sb2.append(", topMargin=");
        sb2.append(layoutPadding);
        sb2.append(", bottomMargin=");
        a.f(sb2, layoutPadding2, ", leftMargin=", layoutPadding3, ", rightMargin=");
        sb2.append(layoutPadding4);
        sb2.append(")");
        return sb2.toString();
    }
}
