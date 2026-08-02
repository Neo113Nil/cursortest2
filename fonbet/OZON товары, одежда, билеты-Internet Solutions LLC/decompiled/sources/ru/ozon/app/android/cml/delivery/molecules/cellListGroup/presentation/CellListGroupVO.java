package ru.ozon.app.android.cml.delivery.molecules.cellListGroup.presentation;

import Cm.e;
import Ef0.c;
import G.g;
import K1.G;
import Tl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/presentation/CellListGroupVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "cellItems", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topMargin", "bottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getSubtitle", "()Ljava/util/List;", "getCellItems", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomMargin", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellListGroupVO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CommonCellSettings.LayoutPadding bottomMargin;

    @NotNull
    private final List<CellItem> cellItems;

    @NotNull
    private final CornerRadius cornerRadius;

    @NotNull
    private final List<TextDTO> subtitle;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final CommonCellSettings.LayoutPadding topMargin;

    public CellListGroupVO(@NotNull TextDTO title, @NotNull List<TextDTO> subtitle, @NotNull List<CellItem> cellItems, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull CommonCellSettings.LayoutPadding topMargin, @NotNull CommonCellSettings.LayoutPadding bottomMargin) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cellItems, "cellItems");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(topMargin, "topMargin");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        this.title = title;
        this.subtitle = subtitle;
        this.cellItems = cellItems;
        this.backgroundColor = backgroundColor;
        this.cornerRadius = cornerRadius;
        this.topMargin = topMargin;
        this.bottomMargin = bottomMargin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellListGroupVO)) {
            return false;
        }
        CellListGroupVO cellListGroupVO = (CellListGroupVO) other;
        return Intrinsics.d(this.title, cellListGroupVO.title) && Intrinsics.d(this.subtitle, cellListGroupVO.subtitle) && Intrinsics.d(this.cellItems, cellListGroupVO.cellItems) && Intrinsics.d(this.backgroundColor, cellListGroupVO.backgroundColor) && this.cornerRadius == cellListGroupVO.cornerRadius && this.topMargin == cellListGroupVO.topMargin && this.bottomMargin == cellListGroupVO.bottomMargin;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final List<CellItem> getCellItems() {
        return this.cellItems;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final List<TextDTO> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        return this.bottomMargin.hashCode() + c.a(this.topMargin, b.b(this.cornerRadius, g.a(g.b(g.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.cellItems), 31, this.backgroundColor), 31), 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<TextDTO> list = this.subtitle;
        List<CellItem> list2 = this.cellItems;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
        StringBuilder e11 = G.e("CellListGroupVO(title=", textDTO, ", subtitle=", list, ", cellItems=");
        e.i(", backgroundColor=", str, ", cornerRadius=", e11, list2);
        e11.append(cornerRadius);
        e11.append(", topMargin=");
        e11.append(layoutPadding);
        e11.append(", bottomMargin=");
        e11.append(layoutPadding2);
        e11.append(")");
        return e11.toString();
    }
}
