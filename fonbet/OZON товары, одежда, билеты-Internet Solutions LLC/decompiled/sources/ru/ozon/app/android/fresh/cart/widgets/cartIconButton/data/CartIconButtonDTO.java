package ru.ozon.app.android.fresh.cart.widgets.cartIconButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartIconButton/data/CartIconButtonDTO;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "options", "Lru/ozon/app/android/fresh/cart/widgets/cartIconButton/data/PaddingOption;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/cart/widgets/cartIconButton/data/PaddingOption;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getOptions", "()Lru/ozon/app/android/fresh/cart/widgets/cartIconButton/data/PaddingOption;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartIconButtonDTO {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO iconButton;
    private final PaddingOption options;

    public CartIconButtonDTO(@NotNull IconButtonV3DTO iconButton, PaddingOption paddingOption) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.iconButton = iconButton;
        this.options = paddingOption;
    }

    public static /* synthetic */ CartIconButtonDTO copy$default(CartIconButtonDTO cartIconButtonDTO, IconButtonV3DTO iconButtonV3DTO, PaddingOption paddingOption, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = cartIconButtonDTO.iconButton;
        }
        if ((i11 & 2) != 0) {
            paddingOption = cartIconButtonDTO.options;
        }
        return cartIconButtonDTO.copy(iconButtonV3DTO, paddingOption);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    /* renamed from: component2, reason: from getter */
    public final PaddingOption getOptions() {
        return this.options;
    }

    @NotNull
    public final CartIconButtonDTO copy(@NotNull IconButtonV3DTO iconButton, PaddingOption options) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        return new CartIconButtonDTO(iconButton, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartIconButtonDTO)) {
            return false;
        }
        CartIconButtonDTO cartIconButtonDTO = (CartIconButtonDTO) other;
        return Intrinsics.d(this.iconButton, cartIconButtonDTO.iconButton) && Intrinsics.d(this.options, cartIconButtonDTO.options);
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public final PaddingOption getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = this.iconButton.hashCode() * 31;
        PaddingOption paddingOption = this.options;
        return hashCode + (paddingOption == null ? 0 : paddingOption.hashCode());
    }

    @NotNull
    public String toString() {
        return "CartIconButtonDTO(iconButton=" + this.iconButton + ", options=" + this.options + ")";
    }
}
