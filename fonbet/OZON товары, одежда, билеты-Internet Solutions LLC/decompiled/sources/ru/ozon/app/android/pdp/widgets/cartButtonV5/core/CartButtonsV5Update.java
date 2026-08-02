package ru.ozon.app.android.pdp.widgets.cartButtonV5.core;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/core/CartButtonsV5Update;", "LA00/a$J$a;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "button", "secondButton", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "getButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "getSecondButton", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartButtonsV5Update implements a.J.InterfaceC0007a {

    @NotNull
    private final CartButtonV5VO.CartButton button;
    private final CartButtonV5VO.CartButton secondButton;

    public CartButtonsV5Update(@NotNull CartButtonV5VO.CartButton button, CartButtonV5VO.CartButton cartButton) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.secondButton = cartButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonsV5Update)) {
            return false;
        }
        CartButtonsV5Update cartButtonsV5Update = (CartButtonsV5Update) other;
        return Intrinsics.d(this.button, cartButtonsV5Update.button) && Intrinsics.d(this.secondButton, cartButtonsV5Update.secondButton);
    }

    @NotNull
    public final CartButtonV5VO.CartButton getButton() {
        return this.button;
    }

    public final CartButtonV5VO.CartButton getSecondButton() {
        return this.secondButton;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        CartButtonV5VO.CartButton cartButton = this.secondButton;
        return hashCode + (cartButton == null ? 0 : cartButton.hashCode());
    }

    @NotNull
    public String toString() {
        return "CartButtonsV5Update(button=" + this.button + ", secondButton=" + this.secondButton + ")";
    }
}
