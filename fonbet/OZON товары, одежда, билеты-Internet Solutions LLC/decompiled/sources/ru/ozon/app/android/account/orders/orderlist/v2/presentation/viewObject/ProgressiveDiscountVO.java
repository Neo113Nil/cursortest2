package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountItemVO;
import ru.ozon.uni.atoms.data.price.Price;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProgressiveDiscountVO;", "", "Lru/ozon/uni/atoms/data/price/Price;", "price", "", "Lru/ozon/app/android/uikit/view/discount/ProgressiveDiscountItemVO;", "progressiveDiscountItems", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Ljava/util/List;", "getProgressiveDiscountItems", "()Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProgressiveDiscountVO {

    @NotNull
    private final Price price;
    private final List<ProgressiveDiscountItemVO> progressiveDiscountItems;

    public ProgressiveDiscountVO(@NotNull Price price, List<ProgressiveDiscountItemVO> list) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.price = price;
        this.progressiveDiscountItems = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressiveDiscountVO)) {
            return false;
        }
        ProgressiveDiscountVO progressiveDiscountVO = (ProgressiveDiscountVO) other;
        return Intrinsics.d(this.price, progressiveDiscountVO.price) && Intrinsics.d(this.progressiveDiscountItems, progressiveDiscountVO.progressiveDiscountItems);
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    public final List<ProgressiveDiscountItemVO> getProgressiveDiscountItems() {
        return this.progressiveDiscountItems;
    }

    public int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        List<ProgressiveDiscountItemVO> list = this.progressiveDiscountItems;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProgressiveDiscountVO(price=" + this.price + ", progressiveDiscountItems=" + this.progressiveDiscountItems + ")";
    }
}
