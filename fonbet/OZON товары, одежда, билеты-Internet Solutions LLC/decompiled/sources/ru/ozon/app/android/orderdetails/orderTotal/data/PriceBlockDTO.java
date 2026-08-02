package ru.ozon.app.android.orderdetails.orderTotal.data;

import G.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/PriceBlockDTO;", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "atomPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getTitle", "()Ljava/lang/String;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAtomPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceBlockDTO {
    public static final int $stable = PriceDTO.$stable | Price.$stable;
    private final PriceDTO atomPrice;
    private final ButtonV3DTO button;
    private final Price price;

    @NotNull
    private final String title;

    public PriceBlockDTO(Price price, @NotNull String title, ButtonV3DTO buttonV3DTO, PriceDTO priceDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.price = price;
        this.title = title;
        this.button = buttonV3DTO;
        this.atomPrice = priceDTO;
    }

    public static /* synthetic */ PriceBlockDTO copy$default(PriceBlockDTO priceBlockDTO, Price price, String str, ButtonV3DTO buttonV3DTO, PriceDTO priceDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            price = priceBlockDTO.price;
        }
        if ((i11 & 2) != 0) {
            str = priceBlockDTO.title;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = priceBlockDTO.button;
        }
        if ((i11 & 8) != 0) {
            priceDTO = priceBlockDTO.atomPrice;
        }
        return priceBlockDTO.copy(price, str, buttonV3DTO, priceDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final PriceDTO getAtomPrice() {
        return this.atomPrice;
    }

    @NotNull
    public final PriceBlockDTO copy(Price price, @NotNull String title, ButtonV3DTO button, PriceDTO atomPrice) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new PriceBlockDTO(price, title, button, atomPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceBlockDTO)) {
            return false;
        }
        PriceBlockDTO priceBlockDTO = (PriceBlockDTO) other;
        return Intrinsics.d(this.price, priceBlockDTO.price) && Intrinsics.d(this.title, priceBlockDTO.title) && Intrinsics.d(this.button, priceBlockDTO.button) && Intrinsics.d(this.atomPrice, priceBlockDTO.atomPrice);
    }

    public final PriceDTO getAtomPrice() {
        return this.atomPrice;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    public final String getTitle() {
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
        return "PriceBlockDTO(price=" + this.price + ", title=" + this.title + ", button=" + this.button + ", atomPrice=" + this.atomPrice + ")";
    }
}
