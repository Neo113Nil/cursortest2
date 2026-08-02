package ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data;

import Cm.e;
import G.g;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "", "cellListBlock", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topMargin", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Ljava/util/List;", "getCellListBlock", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellListGroupDTO {

    @NotNull
    private final String backgroundColor;
    private final CommonCellSettings.LayoutPadding bottomMargin;

    @NotNull
    private final List<CmlCellListMoleculeDTO> cellListBlock;
    private final CornerRadius cornerRadius;
    private final List<TextDTO> subtitle;

    @NotNull
    private final TextDTO title;
    private final CommonCellSettings.LayoutPadding topMargin;

    public CellListGroupDTO(@NotNull TextDTO title, List<TextDTO> list, @NotNull List<CmlCellListMoleculeDTO> cellListBlock, @NotNull String backgroundColor, CornerRadius cornerRadius, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cellListBlock, "cellListBlock");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.subtitle = list;
        this.cellListBlock = cellListBlock;
        this.backgroundColor = backgroundColor;
        this.cornerRadius = cornerRadius;
        this.topMargin = layoutPadding;
        this.bottomMargin = layoutPadding2;
    }

    public static /* synthetic */ CellListGroupDTO copy$default(CellListGroupDTO cellListGroupDTO, TextDTO textDTO, List list, List list2, String str, CornerRadius cornerRadius, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = cellListGroupDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = cellListGroupDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list2 = cellListGroupDTO.cellListBlock;
        }
        if ((i11 & 8) != 0) {
            str = cellListGroupDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            cornerRadius = cellListGroupDTO.cornerRadius;
        }
        if ((i11 & 32) != 0) {
            layoutPadding = cellListGroupDTO.topMargin;
        }
        if ((i11 & 64) != 0) {
            layoutPadding2 = cellListGroupDTO.bottomMargin;
        }
        CommonCellSettings.LayoutPadding layoutPadding3 = layoutPadding;
        CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding2;
        CornerRadius cornerRadius2 = cornerRadius;
        List list3 = list2;
        return cellListGroupDTO.copy(textDTO, list, list3, str, cornerRadius2, layoutPadding3, layoutPadding4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<TextDTO> component2() {
        return this.subtitle;
    }

    @NotNull
    public final List<CmlCellListMoleculeDTO> component3() {
        return this.cellListBlock;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTopMargin() {
        return this.topMargin;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final CellListGroupDTO copy(@NotNull TextDTO title, List<TextDTO> subtitle, @NotNull List<CmlCellListMoleculeDTO> cellListBlock, @NotNull String backgroundColor, CornerRadius cornerRadius, CommonCellSettings.LayoutPadding topMargin, CommonCellSettings.LayoutPadding bottomMargin) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cellListBlock, "cellListBlock");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new CellListGroupDTO(title, subtitle, cellListBlock, backgroundColor, cornerRadius, topMargin, bottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellListGroupDTO)) {
            return false;
        }
        CellListGroupDTO cellListGroupDTO = (CellListGroupDTO) other;
        return Intrinsics.d(this.title, cellListGroupDTO.title) && Intrinsics.d(this.subtitle, cellListGroupDTO.subtitle) && Intrinsics.d(this.cellListBlock, cellListGroupDTO.cellListBlock) && Intrinsics.d(this.backgroundColor, cellListGroupDTO.backgroundColor) && this.cornerRadius == cellListGroupDTO.cornerRadius && this.topMargin == cellListGroupDTO.topMargin && this.bottomMargin == cellListGroupDTO.bottomMargin;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonCellSettings.LayoutPadding getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final List<CmlCellListMoleculeDTO> getCellListBlock() {
        return this.cellListBlock;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final List<TextDTO> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final CommonCellSettings.LayoutPadding getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        List<TextDTO> list = this.subtitle;
        int a11 = g.a(g.b((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.cellListBlock), 31, this.backgroundColor);
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode2 = (a11 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
        int hashCode3 = (hashCode2 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
        return hashCode3 + (layoutPadding2 != null ? layoutPadding2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<TextDTO> list = this.subtitle;
        List<CmlCellListMoleculeDTO> list2 = this.cellListBlock;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
        StringBuilder e11 = G.e("CellListGroupDTO(title=", textDTO, ", subtitle=", list, ", cellListBlock=");
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
