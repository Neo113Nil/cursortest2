package ru.ozon.app.android.orderdetails.orderTotal.presentation.summary;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.price.Price;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/FooterPriceBlockVO;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/AbstractPriceBlockVO;", "Lru/ozon/uni/atoms/data/price/Price;", "price", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Ljava/lang/String;", "getTitle", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FooterPriceBlockVO implements AbstractPriceBlockVO {
    public static final int $stable = Price.$stable;
    private final Price price;

    @NotNull
    private final String title;

    public FooterPriceBlockVO(Price price, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.price = price;
        this.title = title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterPriceBlockVO)) {
            return false;
        }
        FooterPriceBlockVO footerPriceBlockVO = (FooterPriceBlockVO) other;
        return Intrinsics.d(this.price, footerPriceBlockVO.price) && Intrinsics.d(this.title, footerPriceBlockVO.title);
    }

    public Price getPrice() {
        return this.price;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Price price = this.price;
        return this.title.hashCode() + ((price == null ? 0 : price.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "FooterPriceBlockVO(price=" + this.price + ", title=" + this.title + ")";
    }
}
