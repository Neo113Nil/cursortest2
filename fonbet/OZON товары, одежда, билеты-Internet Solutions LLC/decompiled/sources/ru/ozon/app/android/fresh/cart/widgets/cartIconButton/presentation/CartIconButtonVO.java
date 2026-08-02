package ru.ozon.app.android.fresh.cart.widgets.cartIconButton.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.widgets.cartIconButton.data.PaddingOption;
import ru.ozon.app.android.storefront.navBar.v2.NavbarIconVO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartIconButton/presentation/CartIconButtonVO;", "Lru/ozon/app/android/storefront/navBar/v2/NavbarIconVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/cart/widgets/cartIconButton/data/PaddingOption;", "options", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "<init>", "(JLru/ozon/app/android/fresh/cart/widgets/cartIconButton/data/PaddingOption;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/cart/widgets/cartIconButton/data/PaddingOption;", "getOptions", "()Lru/ozon/app/android/fresh/cart/widgets/cartIconButton/data/PaddingOption;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartIconButtonVO implements NavbarIconVO, c {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO iconButton;
    private final long id;
    private final PaddingOption options;

    public CartIconButtonVO(long j11, PaddingOption paddingOption, @NotNull IconButtonV3DTO iconButton) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.id = j11;
        this.options = paddingOption;
        this.iconButton = iconButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartIconButtonVO)) {
            return false;
        }
        CartIconButtonVO cartIconButtonVO = (CartIconButtonVO) other;
        return this.id == cartIconButtonVO.id && Intrinsics.d(this.options, cartIconButtonVO.options) && Intrinsics.d(this.iconButton, cartIconButtonVO.iconButton);
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final PaddingOption getOptions() {
        return this.options;
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
        int hashCode = Long.hashCode(this.id) * 31;
        PaddingOption paddingOption = this.options;
        return this.iconButton.hashCode() + ((hashCode + (paddingOption == null ? 0 : paddingOption.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "CartIconButtonVO(id=" + this.id + ", options=" + this.options + ", iconButton=" + this.iconButton + ")";
    }
}
