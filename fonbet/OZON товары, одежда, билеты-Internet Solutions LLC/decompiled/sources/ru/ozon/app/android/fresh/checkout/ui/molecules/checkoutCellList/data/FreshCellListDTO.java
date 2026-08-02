package ru.ozon.app.android.fresh.checkout.ui.molecules.checkoutCellList.data;

import Tz.C4055a;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001bJ`\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO;", "", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "", "islandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "paddings", "Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Paddings;", "corners", "Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Corners;", "showShadow", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Paddings;Ljava/util/List;Ljava/lang/Boolean;)V", "getCells", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getPaddings", "()Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Paddings;", "getCorners", "getShowShadow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Paddings;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO;", "equals", "other", "hashCode", "", "toString", "Paddings", "Corners", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshCellListDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<CellDTO> cells;
    private final List<Corners> corners;
    private final CornerRadius islandCornerRadius;
    private final Paddings paddings;
    private final Boolean showShadow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Corners;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Corners {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Corners[] $VALUES;
        public static final Corners TOP_LEFT = new Corners("TOP_LEFT", 0);
        public static final Corners TOP_RIGHT = new Corners("TOP_RIGHT", 1);
        public static final Corners BOTTOM_LEFT = new Corners("BOTTOM_LEFT", 2);
        public static final Corners BOTTOM_RIGHT = new Corners("BOTTOM_RIGHT", 3);

        private static final /* synthetic */ Corners[] $values() {
            return new Corners[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT};
        }

        static {
            Corners[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Corners(String str, int i11) {
        }

        public static Corners valueOf(String str) {
            return (Corners) Enum.valueOf(Corners.class, str);
        }

        public static Corners[] values() {
            return (Corners[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/checkout/ui/molecules/checkoutCellList/data/FreshCellListDTO$Paddings;", "", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getLeftPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paddings {
        public static final int $stable = 0;
        private final CommonCellSettings.LayoutPadding bottomPadding;
        private final CommonCellSettings.LayoutPadding leftPadding;
        private final CommonCellSettings.LayoutPadding rightPadding;
        private final CommonCellSettings.LayoutPadding topPadding;

        public Paddings(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4) {
            this.leftPadding = layoutPadding;
            this.rightPadding = layoutPadding2;
            this.topPadding = layoutPadding3;
            this.bottomPadding = layoutPadding4;
        }

        public static /* synthetic */ Paddings copy$default(Paddings paddings, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = paddings.leftPadding;
            }
            if ((i11 & 2) != 0) {
                layoutPadding2 = paddings.rightPadding;
            }
            if ((i11 & 4) != 0) {
                layoutPadding3 = paddings.topPadding;
            }
            if ((i11 & 8) != 0) {
                layoutPadding4 = paddings.bottomPadding;
            }
            return paddings.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings copy(CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding bottomPadding) {
            return new Paddings(leftPadding, rightPadding, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return this.leftPadding == paddings.leftPadding && this.rightPadding == paddings.rightPadding && this.topPadding == paddings.topPadding && this.bottomPadding == paddings.bottomPadding;
        }

        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
            int hashCode = (layoutPadding == null ? 0 : layoutPadding.hashCode()) * 31;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
            int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
            int hashCode3 = (hashCode2 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
            return hashCode3 + (layoutPadding4 != null ? layoutPadding4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Paddings(leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FreshCellListDTO(@NotNull List<CellDTO> cells, String str, CornerRadius cornerRadius, Paddings paddings, List<? extends Corners> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.backgroundColor = str;
        this.islandCornerRadius = cornerRadius;
        this.paddings = paddings;
        this.corners = list;
        this.showShadow = bool;
    }

    public static /* synthetic */ FreshCellListDTO copy$default(FreshCellListDTO freshCellListDTO, List list, String str, CornerRadius cornerRadius, Paddings paddings, List list2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = freshCellListDTO.cells;
        }
        if ((i11 & 2) != 0) {
            str = freshCellListDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = freshCellListDTO.islandCornerRadius;
        }
        if ((i11 & 8) != 0) {
            paddings = freshCellListDTO.paddings;
        }
        if ((i11 & 16) != 0) {
            list2 = freshCellListDTO.corners;
        }
        if ((i11 & 32) != 0) {
            bool = freshCellListDTO.showShadow;
        }
        List list3 = list2;
        Boolean bool2 = bool;
        return freshCellListDTO.copy(list, str, cornerRadius, paddings, list3, bool2);
    }

    @NotNull
    public final List<CellDTO> component1() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
    }

    /* renamed from: component4, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final List<Corners> component5() {
        return this.corners;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getShowShadow() {
        return this.showShadow;
    }

    @NotNull
    public final FreshCellListDTO copy(@NotNull List<CellDTO> cells, String backgroundColor, CornerRadius islandCornerRadius, Paddings paddings, List<? extends Corners> corners, Boolean showShadow) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new FreshCellListDTO(cells, backgroundColor, islandCornerRadius, paddings, corners, showShadow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshCellListDTO)) {
            return false;
        }
        FreshCellListDTO freshCellListDTO = (FreshCellListDTO) other;
        return Intrinsics.d(this.cells, freshCellListDTO.cells) && Intrinsics.d(this.backgroundColor, freshCellListDTO.backgroundColor) && this.islandCornerRadius == freshCellListDTO.islandCornerRadius && Intrinsics.d(this.paddings, freshCellListDTO.paddings) && Intrinsics.d(this.corners, freshCellListDTO.corners) && Intrinsics.d(this.showShadow, freshCellListDTO.showShadow);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public final List<Corners> getCorners() {
        return this.corners;
    }

    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final Boolean getShowShadow() {
        return this.showShadow;
    }

    public int hashCode() {
        int hashCode = this.cells.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.islandCornerRadius;
        int hashCode3 = (hashCode2 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Paddings paddings = this.paddings;
        int hashCode4 = (hashCode3 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        List<Corners> list = this.corners;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.showShadow;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<CellDTO> list = this.cells;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.islandCornerRadius;
        Paddings paddings = this.paddings;
        List<Corners> list2 = this.corners;
        Boolean bool = this.showShadow;
        StringBuilder a11 = C4055a.a("FreshCellListDTO(cells=", ", backgroundColor=", str, ", islandCornerRadius=", list);
        a11.append(cornerRadius);
        a11.append(", paddings=");
        a11.append(paddings);
        a11.append(", corners=");
        a11.append(list2);
        a11.append(", showShadow=");
        a11.append(bool);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ FreshCellListDTO(List list, String str, CornerRadius cornerRadius, Paddings paddings, List list2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i11 & 4) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, paddings, list2, (i11 & 32) != 0 ? Boolean.FALSE : bool);
    }
}
