package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.cell;

import Bi.b;
import D3.h;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b)\u0010&¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/cell/SuggestionsCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "backgroundColor", "islandColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topMargin", "bottomMargin", "leftMargin", "rightMargin", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getBackgroundColor", "getIslandColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomMargin", "getLeftMargin", "getRightMargin", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionsCellVO implements c {
    public static final int $stable = CellDTO.$stable;
    private final String backgroundColor;
    private final CommonCellSettings.LayoutPadding bottomMargin;

    @NotNull
    private final CellDTO cell;
    private final long id;
    private final String islandColor;
    private final CommonCellSettings.LayoutPadding leftMargin;
    private final CommonCellSettings.LayoutPadding rightMargin;
    private final CommonCellSettings.LayoutPadding topMargin;

    public SuggestionsCellVO(long j11, @NotNull CellDTO cell, String str, String str2, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
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
        if (!(other instanceof SuggestionsCellVO)) {
            return false;
        }
        SuggestionsCellVO suggestionsCellVO = (SuggestionsCellVO) other;
        return this.id == suggestionsCellVO.id && Intrinsics.d(this.cell, suggestionsCellVO.cell) && Intrinsics.d(this.backgroundColor, suggestionsCellVO.backgroundColor) && Intrinsics.d(this.islandColor, suggestionsCellVO.islandColor) && this.topMargin == suggestionsCellVO.topMargin && this.bottomMargin == suggestionsCellVO.bottomMargin && this.leftMargin == suggestionsCellVO.leftMargin && this.rightMargin == suggestionsCellVO.rightMargin;
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

    @Override // l20.c
    public long getId() {
        return this.id;
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CommonCellSettings.LayoutPadding getTopMargin() {
        return this.topMargin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.cell, Long.hashCode(this.id) * 31, 31);
        String str = this.backgroundColor;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.islandColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
        int hashCode3 = (hashCode2 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
        int hashCode4 = (hashCode3 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.leftMargin;
        int hashCode5 = (hashCode4 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.rightMargin;
        return hashCode5 + (layoutPadding4 != null ? layoutPadding4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        String str = this.backgroundColor;
        String str2 = this.islandColor;
        CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.leftMargin;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.rightMargin;
        StringBuilder e11 = h.e("SuggestionsCellVO(id=", j11, ", cell=", cellDTO);
        a.h(e11, ", backgroundColor=", str, ", islandColor=", str2);
        e11.append(", topMargin=");
        e11.append(layoutPadding);
        e11.append(", bottomMargin=");
        e11.append(layoutPadding2);
        e11.append(", leftMargin=");
        e11.append(layoutPadding3);
        e11.append(", rightMargin=");
        e11.append(layoutPadding4);
        e11.append(")");
        return e11.toString();
    }
}
