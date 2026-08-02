package ru.ozon.app.android.cart.ui.customActionHandler.navigateToRootCart;

import EZ.e;
import EZ.g;
import EZ.i;
import kotlin.Metadata;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.utils.link.CartLinkGenerator;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/ui/customActionHandler/navigateToRootCart/NavigateToRootCartNavigationHandler;", "LEZ/i;", "Lru/ozon/app/android/cart/ui/customActionHandler/navigateToRootCart/NavigateToRootCartDestination;", "<init>", "()V", "LEZ/g;", "navigator", "LEZ/e;", "response", "", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigateToRootCartNavigationHandler extends i<NavigateToRootCartDestination> {
    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<NavigateToRootCartDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        I i11 = new I();
        navigator.safeTransaction(new NavigateToRootCartNavigationHandler$navigate$1(navigator, i11));
        String uri = CartLinkGenerator.INSTANCE.cart(true).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (!i11.f71783a) {
            i.openDeeplink$default(this, "ozon://navigation/clearToRootTab", 0, null, 6, null);
            i.openDeeplink$default(this, uri, 0, null, 6, null);
        } else if (response.b().getIsOpenDefaultCartNeeded()) {
            i.openDeeplink$default(this, uri, 0, null, 6, null);
        }
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<NavigateToRootCartDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigate(navigator, response);
    }
}
