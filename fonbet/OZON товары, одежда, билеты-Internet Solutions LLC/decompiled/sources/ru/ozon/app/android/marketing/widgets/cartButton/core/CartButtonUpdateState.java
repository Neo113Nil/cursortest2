package ru.ozon.app.android.marketing.widgets.cartButton.core;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.cartButton.data.CartButtonDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/marketing/widgets/cartButton/core/CartButtonUpdateState;", "LA00/a$J$a;", "Lru/ozon/app/android/marketing/widgets/cartButton/data/CartButtonDTO;", "button", "<init>", "(Lru/ozon/app/android/marketing/widgets/cartButton/data/CartButtonDTO;)V", "Lru/ozon/app/android/marketing/widgets/cartButton/data/CartButtonDTO;", "getButton", "()Lru/ozon/app/android/marketing/widgets/cartButton/data/CartButtonDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartButtonUpdateState implements a.J.InterfaceC0007a {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;

    @NotNull
    private final CartButtonDTO button;

    public CartButtonUpdateState(@NotNull CartButtonDTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
    }

    @NotNull
    public final CartButtonDTO getButton() {
        return this.button;
    }
}
