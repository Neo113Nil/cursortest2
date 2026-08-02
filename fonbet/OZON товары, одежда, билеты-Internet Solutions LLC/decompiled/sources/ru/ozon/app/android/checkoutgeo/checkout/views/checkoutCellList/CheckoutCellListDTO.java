package ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList;

import Tz.C4055a;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001bJ`\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "", "islandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "corners", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO$Corners;", "showShadow", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;Ljava/util/List;Ljava/lang/Boolean;)V", "getCells", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getCorners", "getShowShadow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "equals", "other", "hashCode", "", "toString", "Corners", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CheckoutCellListDTO {
    private final String backgroundColor;

    @NotNull
    private final List<CellDTO> cells;
    private final List<Corners> corners;
    private final CornerRadius islandCornerRadius;
    private final Paddings paddings;
    private final Boolean showShadow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO$Corners;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutCellListDTO(@NotNull List<CellDTO> cells, String str, CornerRadius cornerRadius, Paddings paddings, List<? extends Corners> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.backgroundColor = str;
        this.islandCornerRadius = cornerRadius;
        this.paddings = paddings;
        this.corners = list;
        this.showShadow = bool;
    }

    public static /* synthetic */ CheckoutCellListDTO copy$default(CheckoutCellListDTO checkoutCellListDTO, List list, String str, CornerRadius cornerRadius, Paddings paddings, List list2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = checkoutCellListDTO.cells;
        }
        if ((i11 & 2) != 0) {
            str = checkoutCellListDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = checkoutCellListDTO.islandCornerRadius;
        }
        if ((i11 & 8) != 0) {
            paddings = checkoutCellListDTO.paddings;
        }
        if ((i11 & 16) != 0) {
            list2 = checkoutCellListDTO.corners;
        }
        if ((i11 & 32) != 0) {
            bool = checkoutCellListDTO.showShadow;
        }
        List list3 = list2;
        Boolean bool2 = bool;
        return checkoutCellListDTO.copy(list, str, cornerRadius, paddings, list3, bool2);
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
    public final CheckoutCellListDTO copy(@NotNull List<CellDTO> cells, String backgroundColor, CornerRadius islandCornerRadius, Paddings paddings, List<? extends Corners> corners, Boolean showShadow) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new CheckoutCellListDTO(cells, backgroundColor, islandCornerRadius, paddings, corners, showShadow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutCellListDTO)) {
            return false;
        }
        CheckoutCellListDTO checkoutCellListDTO = (CheckoutCellListDTO) other;
        return Intrinsics.d(this.cells, checkoutCellListDTO.cells) && Intrinsics.d(this.backgroundColor, checkoutCellListDTO.backgroundColor) && this.islandCornerRadius == checkoutCellListDTO.islandCornerRadius && Intrinsics.d(this.paddings, checkoutCellListDTO.paddings) && Intrinsics.d(this.corners, checkoutCellListDTO.corners) && Intrinsics.d(this.showShadow, checkoutCellListDTO.showShadow);
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
        StringBuilder a11 = C4055a.a("CheckoutCellListDTO(cells=", ", backgroundColor=", str, ", islandCornerRadius=", list);
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

    public /* synthetic */ CheckoutCellListDTO(List list, String str, CornerRadius cornerRadius, Paddings paddings, List list2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i11 & 4) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, paddings, list2, (i11 & 32) != 0 ? Boolean.FALSE : bool);
    }
}
