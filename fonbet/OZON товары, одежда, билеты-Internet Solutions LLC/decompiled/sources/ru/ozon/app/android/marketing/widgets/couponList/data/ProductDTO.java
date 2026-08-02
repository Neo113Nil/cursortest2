package ru.ozon.app.android.marketing.widgets.couponList.data;

import B0.A0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/data/ProductDTO;", "", "image", "", "<init>", "(Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductDTO {
    public static final int $stable = 0;

    @NotNull
    private final String image;

    public ProductDTO(@NotNull String image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
    }

    public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = productDTO.image;
        }
        return productDTO.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final ProductDTO copy(@NotNull String image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new ProductDTO(image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductDTO) && Intrinsics.d(this.image, ((ProductDTO) other).image);
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.image.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("ProductDTO(image=", this.image, ")");
    }
}
