package ru.ozon.app.android.orderdetails.productsToPay.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/ProductsToPayCellDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "state", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getState", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductsToPayCellDTO {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;
    private final String state;

    public ProductsToPayCellDTO(@NotNull CellDTO cell, String str) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.state = str;
    }

    public static /* synthetic */ ProductsToPayCellDTO copy$default(ProductsToPayCellDTO productsToPayCellDTO, CellDTO cellDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = productsToPayCellDTO.cell;
        }
        if ((i11 & 2) != 0) {
            str = productsToPayCellDTO.state;
        }
        return productsToPayCellDTO.copy(cellDTO, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final ProductsToPayCellDTO copy(@NotNull CellDTO cell, String state) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new ProductsToPayCellDTO(cell, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsToPayCellDTO)) {
            return false;
        }
        ProductsToPayCellDTO productsToPayCellDTO = (ProductsToPayCellDTO) other;
        return Intrinsics.d(this.cell, productsToPayCellDTO.cell) && Intrinsics.d(this.state, productsToPayCellDTO.state);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        String str = this.state;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProductsToPayCellDTO(cell=" + this.cell + ", state=" + this.state + ")";
    }
}
