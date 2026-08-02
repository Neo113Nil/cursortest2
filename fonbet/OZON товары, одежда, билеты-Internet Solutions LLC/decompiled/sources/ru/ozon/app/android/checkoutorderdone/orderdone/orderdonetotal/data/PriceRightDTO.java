package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/PriceRightDTO;", "", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "atomPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getPrice", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAtomPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PriceRightDTO {
    public static final int $stable = PriceDTO.$stable;
    private final PriceDTO atomPrice;
    private final TextDTO price;

    public PriceRightDTO(TextDTO textDTO, PriceDTO priceDTO) {
        this.price = textDTO;
        this.atomPrice = priceDTO;
    }

    public static /* synthetic */ PriceRightDTO copy$default(PriceRightDTO priceRightDTO, TextDTO textDTO, PriceDTO priceDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = priceRightDTO.price;
        }
        if ((i11 & 2) != 0) {
            priceDTO = priceRightDTO.atomPrice;
        }
        return priceRightDTO.copy(textDTO, priceDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getPrice() {
        return this.price;
    }

    /* renamed from: component2, reason: from getter */
    public final PriceDTO getAtomPrice() {
        return this.atomPrice;
    }

    @NotNull
    public final PriceRightDTO copy(TextDTO price, PriceDTO atomPrice) {
        return new PriceRightDTO(price, atomPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceRightDTO)) {
            return false;
        }
        PriceRightDTO priceRightDTO = (PriceRightDTO) other;
        return Intrinsics.d(this.price, priceRightDTO.price) && Intrinsics.d(this.atomPrice, priceRightDTO.atomPrice);
    }

    public final PriceDTO getAtomPrice() {
        return this.atomPrice;
    }

    public final TextDTO getPrice() {
        return this.price;
    }

    public int hashCode() {
        TextDTO textDTO = this.price;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        PriceDTO priceDTO = this.atomPrice;
        return hashCode + (priceDTO != null ? priceDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceRightDTO(price=" + this.price + ", atomPrice=" + this.atomPrice + ")";
    }
}
