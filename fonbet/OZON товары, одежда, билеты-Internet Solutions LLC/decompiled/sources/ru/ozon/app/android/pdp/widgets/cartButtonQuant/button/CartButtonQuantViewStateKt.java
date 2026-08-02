package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"hasIcon", "", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;", "getHasIcon", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantViewState;)Z", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantViewStateKt {
    public static final boolean getHasIcon(@NotNull CartButtonQuantViewState cartButtonQuantViewState) {
        Intrinsics.checkNotNullParameter(cartButtonQuantViewState, "<this>");
        return cartButtonQuantViewState.getIcon() != null;
    }
}
