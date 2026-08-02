package ru.ozon.app.android.account.orders.productsPackage.data;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/data/PackageProductDTO;", "", "quantity", "", "image", "pricePerItem", "price", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuantity", "()Ljava/lang/String;", "getImage", "getPricePerItem", "getPrice", "getTitle", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PackageProductDTO {
    public static final int $stable = 0;
    private final String deeplink;

    @NotNull
    private final String image;
    private final String price;
    private final String pricePerItem;
    private final String quantity;

    @NotNull
    private final String title;

    public PackageProductDTO(String str, @NotNull String image, String str2, String str3, @NotNull String title, String str4) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        this.quantity = str;
        this.image = image;
        this.pricePerItem = str2;
        this.price = str3;
        this.title = title;
        this.deeplink = str4;
    }

    public static /* synthetic */ PackageProductDTO copy$default(PackageProductDTO packageProductDTO, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = packageProductDTO.quantity;
        }
        if ((i11 & 2) != 0) {
            str2 = packageProductDTO.image;
        }
        if ((i11 & 4) != 0) {
            str3 = packageProductDTO.pricePerItem;
        }
        if ((i11 & 8) != 0) {
            str4 = packageProductDTO.price;
        }
        if ((i11 & 16) != 0) {
            str5 = packageProductDTO.title;
        }
        if ((i11 & 32) != 0) {
            str6 = packageProductDTO.deeplink;
        }
        String str7 = str5;
        String str8 = str6;
        return packageProductDTO.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPricePerItem() {
        return this.pricePerItem;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final PackageProductDTO copy(String quantity, @NotNull String image, String pricePerItem, String price, @NotNull String title, String deeplink) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PackageProductDTO(quantity, image, pricePerItem, price, title, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageProductDTO)) {
            return false;
        }
        PackageProductDTO packageProductDTO = (PackageProductDTO) other;
        return Intrinsics.d(this.quantity, packageProductDTO.quantity) && Intrinsics.d(this.image, packageProductDTO.image) && Intrinsics.d(this.pricePerItem, packageProductDTO.pricePerItem) && Intrinsics.d(this.price, packageProductDTO.price) && Intrinsics.d(this.title, packageProductDTO.title) && Intrinsics.d(this.deeplink, packageProductDTO.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPricePerItem() {
        return this.pricePerItem;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.quantity;
        int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.image);
        String str2 = this.pricePerItem;
        int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.price;
        int a12 = g.a((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.title);
        String str4 = this.deeplink;
        return a12 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.quantity;
        String str2 = this.image;
        String str3 = this.pricePerItem;
        String str4 = this.price;
        String str5 = this.title;
        String str6 = this.deeplink;
        StringBuilder d11 = C3660k.d("PackageProductDTO(quantity=", str, ", image=", str2, ", pricePerItem=");
        a.h(d11, str3, ", price=", str4, ", title=");
        return C3173b.c(d11, str5, ", deeplink=", str6, ")");
    }
}
