package ru.ozon.app.android.orderdetails.productsToPay.presentation.cell.viewItem;

import Bi.b;
import D3.h;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/cell/viewItem/ProductsToPayCellVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "state", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getState", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductsToPayCellVO implements c {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;
    private final long id;
    private final String state;

    public ProductsToPayCellVO(long j11, @NotNull CellDTO cell, String str) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.cell = cell;
        this.state = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsToPayCellVO)) {
            return false;
        }
        ProductsToPayCellVO productsToPayCellVO = (ProductsToPayCellVO) other;
        return this.id == productsToPayCellVO.id && Intrinsics.d(this.cell, productsToPayCellVO.cell) && Intrinsics.d(this.state, productsToPayCellVO.state);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.cell, Long.hashCode(this.id) * 31, 31);
        String str = this.state;
        return c11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return C6594f.a(", state=", this.state, ")", h.e("ProductsToPayCellVO(id=", this.id, ", cell=", this.cell));
    }
}
