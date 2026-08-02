package ru.ozon.app.android.account.orders.productsPackage.data;

import C.o0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/data/ProductsPackageDTO;", "", "paidItems", "", "Lru/ozon/app/android/account/orders/productsPackage/data/PaidItemDTO;", "gifts", "Lru/ozon/app/android/account/orders/productsPackage/data/GiftDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/account/orders/productsPackage/data/GiftDTO;Ljava/lang/String;)V", "getPaidItems", "()Ljava/util/List;", "getGifts", "()Lru/ozon/app/android/account/orders/productsPackage/data/GiftDTO;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductsPackageDTO {
    public static final int $stable = 8;
    private final GiftDTO gifts;
    private final List<PaidItemDTO> paidItems;

    @NotNull
    private final String title;

    public ProductsPackageDTO(List<PaidItemDTO> list, GiftDTO giftDTO, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.paidItems = list;
        this.gifts = giftDTO;
        this.title = title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductsPackageDTO copy$default(ProductsPackageDTO productsPackageDTO, List list, GiftDTO giftDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productsPackageDTO.paidItems;
        }
        if ((i11 & 2) != 0) {
            giftDTO = productsPackageDTO.gifts;
        }
        if ((i11 & 4) != 0) {
            str = productsPackageDTO.title;
        }
        return productsPackageDTO.copy(list, giftDTO, str);
    }

    public final List<PaidItemDTO> component1() {
        return this.paidItems;
    }

    /* renamed from: component2, reason: from getter */
    public final GiftDTO getGifts() {
        return this.gifts;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final ProductsPackageDTO copy(List<PaidItemDTO> paidItems, GiftDTO gifts, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ProductsPackageDTO(paidItems, gifts, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsPackageDTO)) {
            return false;
        }
        ProductsPackageDTO productsPackageDTO = (ProductsPackageDTO) other;
        return Intrinsics.d(this.paidItems, productsPackageDTO.paidItems) && Intrinsics.d(this.gifts, productsPackageDTO.gifts) && Intrinsics.d(this.title, productsPackageDTO.title);
    }

    public final GiftDTO getGifts() {
        return this.gifts;
    }

    public final List<PaidItemDTO> getPaidItems() {
        return this.paidItems;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<PaidItemDTO> list = this.paidItems;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        GiftDTO giftDTO = this.gifts;
        return this.title.hashCode() + ((hashCode + (giftDTO != null ? giftDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        List<PaidItemDTO> list = this.paidItems;
        GiftDTO giftDTO = this.gifts;
        String str = this.title;
        StringBuilder sb2 = new StringBuilder("ProductsPackageDTO(paidItems=");
        sb2.append(list);
        sb2.append(", gifts=");
        sb2.append(giftDTO);
        sb2.append(", title=");
        return o0.c(sb2, str, ")");
    }
}
