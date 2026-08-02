package ru.ozon.app.android.orderdetails.orderTotal.presentation.summary;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/PriceBlockVO;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/AbstractPriceBlockVO;", "Lru/ozon/uni/atoms/data/price/Price;", "price", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "atomPrice", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getAtomPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceBlockVO implements AbstractPriceBlockVO {
    public static final int $stable = PriceDTO.$stable | Price.$stable;
    private final PriceDTO atomPrice;
    private final ButtonV3DTO button;
    private final Price price;

    @NotNull
    private final String title;

    public PriceBlockVO(Price price, @NotNull String title, ButtonV3DTO buttonV3DTO, PriceDTO priceDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.price = price;
        this.title = title;
        this.button = buttonV3DTO;
        this.atomPrice = priceDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceBlockVO)) {
            return false;
        }
        PriceBlockVO priceBlockVO = (PriceBlockVO) other;
        return Intrinsics.d(this.price, priceBlockVO.price) && Intrinsics.d(this.title, priceBlockVO.title) && Intrinsics.d(this.button, priceBlockVO.button) && Intrinsics.d(this.atomPrice, priceBlockVO.atomPrice);
    }

    public final PriceDTO getAtomPrice() {
        return this.atomPrice;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
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
        int a11 = g.a((price == null ? 0 : price.hashCode()) * 31, 31, this.title);
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        PriceDTO priceDTO = this.atomPrice;
        return hashCode + (priceDTO != null ? priceDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceBlockVO(price=" + this.price + ", title=" + this.title + ", button=" + this.button + ", atomPrice=" + this.atomPrice + ")";
    }
}
