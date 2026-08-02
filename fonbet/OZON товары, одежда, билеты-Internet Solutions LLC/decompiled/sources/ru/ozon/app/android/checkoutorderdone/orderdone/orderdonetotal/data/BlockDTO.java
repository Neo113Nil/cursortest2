package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/BlockDTO;", "", "left", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/PriceLeftDTO;", "right", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/PriceRightDTO;", "<init>", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/PriceLeftDTO;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/PriceRightDTO;)V", "getLeft", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/PriceLeftDTO;", "getRight", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/PriceRightDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BlockDTO {
    public static final int $stable = (PriceDTO.$stable | IconDTO.$stable) | ButtonDTO.$stable;

    @NotNull
    private final PriceLeftDTO left;

    @NotNull
    private final PriceRightDTO right;

    public BlockDTO(@NotNull PriceLeftDTO left, @NotNull PriceRightDTO right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        this.left = left;
        this.right = right;
    }

    public static /* synthetic */ BlockDTO copy$default(BlockDTO blockDTO, PriceLeftDTO priceLeftDTO, PriceRightDTO priceRightDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceLeftDTO = blockDTO.left;
        }
        if ((i11 & 2) != 0) {
            priceRightDTO = blockDTO.right;
        }
        return blockDTO.copy(priceLeftDTO, priceRightDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PriceLeftDTO getLeft() {
        return this.left;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PriceRightDTO getRight() {
        return this.right;
    }

    @NotNull
    public final BlockDTO copy(@NotNull PriceLeftDTO left, @NotNull PriceRightDTO right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        return new BlockDTO(left, right);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockDTO)) {
            return false;
        }
        BlockDTO blockDTO = (BlockDTO) other;
        return Intrinsics.d(this.left, blockDTO.left) && Intrinsics.d(this.right, blockDTO.right);
    }

    @NotNull
    public final PriceLeftDTO getLeft() {
        return this.left;
    }

    @NotNull
    public final PriceRightDTO getRight() {
        return this.right;
    }

    public int hashCode() {
        return this.right.hashCode() + (this.left.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BlockDTO(left=" + this.left + ", right=" + this.right + ")";
    }
}
