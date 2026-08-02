package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2HeaderDTOV2;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;)V", "getHeader", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2HeaderDTOV2 {
    public static final int $stable = 8;

    @NotNull
    private final HeaderDTO header;

    public CartSplitV2HeaderDTOV2(@NotNull HeaderDTO header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
    }

    public static /* synthetic */ CartSplitV2HeaderDTOV2 copy$default(CartSplitV2HeaderDTOV2 cartSplitV2HeaderDTOV2, HeaderDTO headerDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = cartSplitV2HeaderDTOV2.header;
        }
        return cartSplitV2HeaderDTOV2.copy(headerDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final CartSplitV2HeaderDTOV2 copy(@NotNull HeaderDTO header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new CartSplitV2HeaderDTOV2(header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CartSplitV2HeaderDTOV2) && Intrinsics.d(this.header, ((CartSplitV2HeaderDTOV2) other).header);
    }

    @NotNull
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public int hashCode() {
        return this.header.hashCode();
    }

    @NotNull
    public String toString() {
        return "CartSplitV2HeaderDTOV2(header=" + this.header + ")";
    }
}
