package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/PDPCartItemInfo;", "", "", "quantity", "", "selectedDeliverySchema", "sortAfterSku", "", "forStars", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "cartMode", "<init>", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getQuantity", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "getSortAfterSku", "Ljava/lang/Boolean;", "getForStars", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "getCartMode", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PDPCartItemInfo {
    private final DoubleCartVO.CartMode cartMode;
    private final Boolean forStars;
    private final int quantity;
    private final Long selectedDeliverySchema;
    private final Long sortAfterSku;

    public PDPCartItemInfo(int i11, Long l11, Long l12, Boolean bool, DoubleCartVO.CartMode cartMode) {
        this.quantity = i11;
        this.selectedDeliverySchema = l11;
        this.sortAfterSku = l12;
        this.forStars = bool;
        this.cartMode = cartMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PDPCartItemInfo)) {
            return false;
        }
        PDPCartItemInfo pDPCartItemInfo = (PDPCartItemInfo) other;
        return this.quantity == pDPCartItemInfo.quantity && Intrinsics.d(this.selectedDeliverySchema, pDPCartItemInfo.selectedDeliverySchema) && Intrinsics.d(this.sortAfterSku, pDPCartItemInfo.sortAfterSku) && Intrinsics.d(this.forStars, pDPCartItemInfo.forStars) && this.cartMode == pDPCartItemInfo.cartMode;
    }

    public final Boolean getForStars() {
        return this.forStars;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.quantity) * 31;
        Long l11 = this.selectedDeliverySchema;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.sortAfterSku;
        int hashCode3 = (hashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Boolean bool = this.forStars;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        DoubleCartVO.CartMode cartMode = this.cartMode;
        return hashCode4 + (cartMode != null ? cartMode.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PDPCartItemInfo(quantity=" + this.quantity + ", selectedDeliverySchema=" + this.selectedDeliverySchema + ", sortAfterSku=" + this.sortAfterSku + ", forStars=" + this.forStars + ", cartMode=" + this.cartMode + ")";
    }

    public /* synthetic */ PDPCartItemInfo(int i11, Long l11, Long l12, Boolean bool, DoubleCartVO.CartMode cartMode, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : l11, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : cartMode);
    }
}
