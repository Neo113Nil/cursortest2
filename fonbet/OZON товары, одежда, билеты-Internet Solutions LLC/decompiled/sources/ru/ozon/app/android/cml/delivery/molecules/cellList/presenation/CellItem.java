package ru.ozon.app.android.cml.delivery.molecules.cellList.presenation;

import Am.C2438a;
import B0.C2454a;
import Ef0.c;
import Ep.a;
import N3.C3660k;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001:\u0001.B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "", "", "islandColor", "backgroundColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "leftMargin", "rightMargin", "leftPadding", "rightPadding", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem$LayoutModel;", "layoutModel", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem$LayoutModel;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIslandColor", "getBackgroundColor", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLeftMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightMargin", "getLeftPadding", "getRightPadding", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem$LayoutModel;", "getLayoutModel", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem$LayoutModel;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "LayoutModel", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellItem {
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;
    private final String islandColor;

    @NotNull
    private final LayoutModel layoutModel;

    @NotNull
    private final CommonCellSettings.LayoutPadding leftMargin;

    @NotNull
    private final CommonCellSettings.LayoutPadding leftPadding;

    @NotNull
    private final CommonCellSettings.LayoutPadding rightMargin;

    @NotNull
    private final CommonCellSettings.LayoutPadding rightPadding;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem$LayoutModel;", "", "", "paddingTop", "paddingBottom", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topMargin", "bottomMargin", "", "topCornerRadius", "bottomCornerRadius", "", "hasSeparator", "<init>", "(IILru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;FFZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingTop", "getPaddingBottom", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomMargin", "F", "getTopCornerRadius", "()F", "getBottomCornerRadius", "Z", "getHasSeparator", "()Z", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutModel {
        private final float bottomCornerRadius;

        @NotNull
        private final CommonCellSettings.LayoutPadding bottomMargin;
        private final boolean hasSeparator;
        private final int paddingBottom;
        private final int paddingTop;
        private final float topCornerRadius;

        @NotNull
        private final CommonCellSettings.LayoutPadding topMargin;

        public LayoutModel(int i11, int i12, @NotNull CommonCellSettings.LayoutPadding topMargin, @NotNull CommonCellSettings.LayoutPadding bottomMargin, float f7, float f11, boolean z11) {
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
            this.paddingTop = i11;
            this.paddingBottom = i12;
            this.topMargin = topMargin;
            this.bottomMargin = bottomMargin;
            this.topCornerRadius = f7;
            this.bottomCornerRadius = f11;
            this.hasSeparator = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutModel)) {
                return false;
            }
            LayoutModel layoutModel = (LayoutModel) other;
            return this.paddingTop == layoutModel.paddingTop && this.paddingBottom == layoutModel.paddingBottom && this.topMargin == layoutModel.topMargin && this.bottomMargin == layoutModel.bottomMargin && Float.compare(this.topCornerRadius, layoutModel.topCornerRadius) == 0 && Float.compare(this.bottomCornerRadius, layoutModel.bottomCornerRadius) == 0 && this.hasSeparator == layoutModel.hasSeparator;
        }

        public final float getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getBottomMargin() {
            return this.bottomMargin;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        public final int getPaddingBottom() {
            return this.paddingBottom;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public final float getTopCornerRadius() {
            return this.topCornerRadius;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasSeparator) + b.a(this.bottomCornerRadius, b.a(this.topCornerRadius, c.a(this.bottomMargin, c.a(this.topMargin, C2454a.a(this.paddingBottom, Integer.hashCode(this.paddingTop) * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.paddingTop;
            int i12 = this.paddingBottom;
            CommonCellSettings.LayoutPadding layoutPadding = this.topMargin;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.bottomMargin;
            float f7 = this.topCornerRadius;
            float f11 = this.bottomCornerRadius;
            boolean z11 = this.hasSeparator;
            StringBuilder a11 = C2438a.a("LayoutModel(paddingTop=", i11, ", paddingBottom=", ", topMargin=", i12);
            a.f(a11, layoutPadding, ", bottomMargin=", layoutPadding2, ", topCornerRadius=");
            a11.append(f7);
            a11.append(", bottomCornerRadius=");
            a11.append(f11);
            a11.append(", hasSeparator=");
            return Pk0.a.a(")", a11, z11);
        }
    }

    public CellItem(String str, String str2, @NotNull CommonCellSettings.LayoutPadding leftMargin, @NotNull CommonCellSettings.LayoutPadding rightMargin, @NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, @NotNull CellDTO cell, @NotNull LayoutModel layoutModel, t tVar) {
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(layoutModel, "layoutModel");
        this.islandColor = str;
        this.backgroundColor = str2;
        this.leftMargin = leftMargin;
        this.rightMargin = rightMargin;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
        this.cell = cell;
        this.layoutModel = layoutModel;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellItem)) {
            return false;
        }
        CellItem cellItem = (CellItem) other;
        return Intrinsics.d(this.islandColor, cellItem.islandColor) && Intrinsics.d(this.backgroundColor, cellItem.backgroundColor) && this.leftMargin == cellItem.leftMargin && this.rightMargin == cellItem.rightMargin && this.leftPadding == cellItem.leftPadding && this.rightPadding == cellItem.rightPadding && Intrinsics.d(this.cell, cellItem.cell) && Intrinsics.d(this.layoutModel, cellItem.layoutModel) && Intrinsics.d(this.tokenizedEvent, cellItem.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final String getIslandColor() {
        return this.islandColor;
    }

    @NotNull
    public final LayoutModel getLayoutModel() {
        return this.layoutModel;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    public int hashCode() {
        String str = this.islandColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (this.layoutModel.hashCode() + Bi.b.c(this.cell, c.a(this.rightPadding, c.a(this.leftPadding, c.a(this.rightMargin, c.a(this.leftMargin, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.islandColor;
        String str2 = this.backgroundColor;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftMargin;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightMargin;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.leftPadding;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.rightPadding;
        CellDTO cellDTO = this.cell;
        LayoutModel layoutModel = this.layoutModel;
        t tVar = this.tokenizedEvent;
        StringBuilder d11 = C3660k.d("CellItem(islandColor=", str, ", backgroundColor=", str2, ", leftMargin=");
        a.f(d11, layoutPadding, ", rightMargin=", layoutPadding2, ", leftPadding=");
        a.f(d11, layoutPadding3, ", rightPadding=", layoutPadding4, ", cell=");
        d11.append(cellDTO);
        d11.append(", layoutModel=");
        d11.append(layoutModel);
        d11.append(", tokenizedEvent=");
        return Tl.b.d(d11, tVar, ")");
    }
}
