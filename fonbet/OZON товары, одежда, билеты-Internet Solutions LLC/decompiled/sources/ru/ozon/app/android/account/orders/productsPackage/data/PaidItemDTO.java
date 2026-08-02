package ru.ozon.app.android.account.orders.productsPackage.data;

import An.C2439a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/data/PaidItemDTO;", "", "sellerName", "", "items", "", "Lru/ozon/app/android/account/orders/productsPackage/data/PackageProductDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSellerName", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaidItemDTO {
    public static final int $stable = 8;
    private final List<PackageProductDTO> items;

    @NotNull
    private final String sellerName;

    public PaidItemDTO(@NotNull String sellerName, List<PackageProductDTO> list) {
        Intrinsics.checkNotNullParameter(sellerName, "sellerName");
        this.sellerName = sellerName;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaidItemDTO copy$default(PaidItemDTO paidItemDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paidItemDTO.sellerName;
        }
        if ((i11 & 2) != 0) {
            list = paidItemDTO.items;
        }
        return paidItemDTO.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSellerName() {
        return this.sellerName;
    }

    public final List<PackageProductDTO> component2() {
        return this.items;
    }

    @NotNull
    public final PaidItemDTO copy(@NotNull String sellerName, List<PackageProductDTO> items) {
        Intrinsics.checkNotNullParameter(sellerName, "sellerName");
        return new PaidItemDTO(sellerName, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaidItemDTO)) {
            return false;
        }
        PaidItemDTO paidItemDTO = (PaidItemDTO) other;
        return Intrinsics.d(this.sellerName, paidItemDTO.sellerName) && Intrinsics.d(this.items, paidItemDTO.items);
    }

    public final List<PackageProductDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final String getSellerName() {
        return this.sellerName;
    }

    public int hashCode() {
        int hashCode = this.sellerName.hashCode() * 31;
        List<PackageProductDTO> list = this.items;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2439a.a("PaidItemDTO(sellerName=", this.sellerName, ", items=", ")", this.items);
    }
}
