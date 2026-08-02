package ru.ozon.app.android.returns.ui.molecules.balance.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowDTO;", "", "leftItem", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getLeftItem", "()Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BalanceRowDTO {

    @NotNull
    private final BalanceRowItemDTO leftItem;

    @NotNull
    private final PriceDTO price;

    public BalanceRowDTO(@NotNull BalanceRowItemDTO leftItem, @NotNull PriceDTO price) {
        Intrinsics.checkNotNullParameter(leftItem, "leftItem");
        Intrinsics.checkNotNullParameter(price, "price");
        this.leftItem = leftItem;
        this.price = price;
    }

    public static /* synthetic */ BalanceRowDTO copy$default(BalanceRowDTO balanceRowDTO, BalanceRowItemDTO balanceRowItemDTO, PriceDTO priceDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            balanceRowItemDTO = balanceRowDTO.leftItem;
        }
        if ((i11 & 2) != 0) {
            priceDTO = balanceRowDTO.price;
        }
        return balanceRowDTO.copy(balanceRowItemDTO, priceDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BalanceRowItemDTO getLeftItem() {
        return this.leftItem;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final BalanceRowDTO copy(@NotNull BalanceRowItemDTO leftItem, @NotNull PriceDTO price) {
        Intrinsics.checkNotNullParameter(leftItem, "leftItem");
        Intrinsics.checkNotNullParameter(price, "price");
        return new BalanceRowDTO(leftItem, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceRowDTO)) {
            return false;
        }
        BalanceRowDTO balanceRowDTO = (BalanceRowDTO) other;
        return Intrinsics.d(this.leftItem, balanceRowDTO.leftItem) && Intrinsics.d(this.price, balanceRowDTO.price);
    }

    @NotNull
    public final BalanceRowItemDTO getLeftItem() {
        return this.leftItem;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public int hashCode() {
        return this.price.hashCode() + (this.leftItem.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BalanceRowDTO(leftItem=" + this.leftItem + ", price=" + this.price + ")";
    }
}
