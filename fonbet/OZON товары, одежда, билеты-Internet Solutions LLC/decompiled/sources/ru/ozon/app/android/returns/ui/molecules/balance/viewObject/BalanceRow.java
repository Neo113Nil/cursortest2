package ru.ozon.app.android.returns.ui.molecules.balance.viewObject;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;", "leftItem", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(JLru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "copy", "(JLru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;Lru/ozon/uni/atoms/data/price/PriceDTO;)Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;", "getLeftItem", "()Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BalanceRow implements c {
    private final long id;

    @NotNull
    private final BalanceRowItem leftItem;
    private final PriceDTO price;

    public BalanceRow(long j11, @NotNull BalanceRowItem leftItem, PriceDTO priceDTO) {
        Intrinsics.checkNotNullParameter(leftItem, "leftItem");
        this.id = j11;
        this.leftItem = leftItem;
        this.price = priceDTO;
    }

    public static /* synthetic */ BalanceRow copy$default(BalanceRow balanceRow, long j11, BalanceRowItem balanceRowItem, PriceDTO priceDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = balanceRow.id;
        }
        if ((i11 & 2) != 0) {
            balanceRowItem = balanceRow.leftItem;
        }
        if ((i11 & 4) != 0) {
            priceDTO = balanceRow.price;
        }
        return balanceRow.copy(j11, balanceRowItem, priceDTO);
    }

    @NotNull
    public final BalanceRow copy(long id2, @NotNull BalanceRowItem leftItem, PriceDTO price) {
        Intrinsics.checkNotNullParameter(leftItem, "leftItem");
        return new BalanceRow(id2, leftItem, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceRow)) {
            return false;
        }
        BalanceRow balanceRow = (BalanceRow) other;
        return this.id == balanceRow.id && Intrinsics.d(this.leftItem, balanceRow.leftItem) && Intrinsics.d(this.price, balanceRow.price);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final BalanceRowItem getLeftItem() {
        return this.leftItem;
    }

    public final PriceDTO getPrice() {
        return this.price;
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
        int hashCode = (this.leftItem.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        PriceDTO priceDTO = this.price;
        return hashCode + (priceDTO == null ? 0 : priceDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "BalanceRow(id=" + this.id + ", leftItem=" + this.leftItem + ", price=" + this.price + ")";
    }

    public /* synthetic */ BalanceRow(long j11, BalanceRowItem balanceRowItem, PriceDTO priceDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, balanceRowItem, (i11 & 4) != 0 ? null : priceDTO);
    }
}
