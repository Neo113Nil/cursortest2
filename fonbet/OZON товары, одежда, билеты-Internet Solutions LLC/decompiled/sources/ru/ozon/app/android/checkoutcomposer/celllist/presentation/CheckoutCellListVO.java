package ru.ozon.app.android.checkoutcomposer.celllist.presentation;

import Bi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/celllist/presentation/CheckoutCellListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "checkoutCellList", "", "isSticky", "<init>", "(JLru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "getCheckoutCellList", "()Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "Z", "()Z", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckoutCellListVO implements c {

    @NotNull
    private final CheckoutCellListDTO checkoutCellList;
    private final long id;
    private final boolean isSticky;

    public CheckoutCellListVO(long j11, @NotNull CheckoutCellListDTO checkoutCellList, boolean z11) {
        Intrinsics.checkNotNullParameter(checkoutCellList, "checkoutCellList");
        this.id = j11;
        this.checkoutCellList = checkoutCellList;
        this.isSticky = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutCellListVO)) {
            return false;
        }
        CheckoutCellListVO checkoutCellListVO = (CheckoutCellListVO) other;
        return this.id == checkoutCellListVO.id && Intrinsics.d(this.checkoutCellList, checkoutCellListVO.checkoutCellList) && this.isSticky == checkoutCellListVO.isSticky;
    }

    @NotNull
    public final CheckoutCellListDTO getCheckoutCellList() {
        return this.checkoutCellList;
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
        return Boolean.hashCode(this.isSticky) + ((this.checkoutCellList.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CheckoutCellListDTO checkoutCellListDTO = this.checkoutCellList;
        boolean z11 = this.isSticky;
        StringBuilder sb2 = new StringBuilder("CheckoutCellListVO(id=");
        sb2.append(j11);
        sb2.append(", checkoutCellList=");
        sb2.append(checkoutCellListDTO);
        return b.f(sb2, ", isSticky=", z11, ")");
    }
}
