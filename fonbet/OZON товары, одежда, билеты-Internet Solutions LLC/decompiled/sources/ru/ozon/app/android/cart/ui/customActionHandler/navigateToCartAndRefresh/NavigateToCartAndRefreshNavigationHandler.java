package ru.ozon.app.android.cart.ui.customActionHandler.navigateToCartAndRefresh;

import EZ.e;
import EZ.g;
import EZ.i;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.domain.utils.link.CartLinkGenerator;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/ui/customActionHandler/navigateToCartAndRefresh/NavigateToCartAndRefreshNavigationHandler;", "LEZ/i;", "Lru/ozon/app/android/cart/ui/customActionHandler/navigateToCartAndRefresh/NavigateToCartAndRefreshDestination;", "<init>", "()V", "Landroidx/fragment/app/G;", "fm", "", "navigateInternal", "(Landroidx/fragment/app/G;)V", "", "hasCartEntry", "(Landroidx/fragment/app/G;)Z", "", "topFragmentTag", "(Landroidx/fragment/app/G;)Ljava/lang/String;", "isAnchor", "openPersonalCart", "(Z)V", "LEZ/g;", "navigator", "LEZ/e;", "response", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "cartPath", "Ljava/lang/String;", "familyCartPath", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigateToCartAndRefreshNavigationHandler extends i<NavigateToCartAndRefreshDestination> {

    @NotNull
    private final String cartPath;

    @NotNull
    private final String familyCartPath;

    public NavigateToCartAndRefreshNavigationHandler() {
        CartLinkGenerator cartLinkGenerator = CartLinkGenerator.INSTANCE;
        String uri = CartLinkGenerator.cart$default(cartLinkGenerator, false, 1, null).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.cartPath = uri;
        String uri2 = cartLinkGenerator.familyCart().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        this.familyCartPath = uri2;
    }

    private final boolean hasCartEntry(G g10) {
        int l02 = g10.l0();
        for (int i11 = 0; i11 < l02; i11++) {
            if (Intrinsics.d(g10.k0(i11).getName(), this.cartPath)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateInternal(G fm) {
        if (!fm.S0()) {
            openPersonalCart$default(this, false, 1, null);
            return;
        }
        while (hasCartEntry(fm) && fm.U0(0, this.cartPath)) {
            String str = topFragmentTag(fm);
            if (Intrinsics.d(str, this.cartPath)) {
                return;
            }
            if (!Intrinsics.d(str, this.familyCartPath)) {
                break;
            }
        }
        openPersonalCart$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPersonalCart(boolean isAnchor) {
        String uri = CartLinkGenerator.INSTANCE.cart(isAnchor).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        i.openDeeplink$default(this, uri, 0, null, 6, null);
    }

    static /* synthetic */ void openPersonalCart$default(NavigateToCartAndRefreshNavigationHandler navigateToCartAndRefreshNavigationHandler, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        navigateToCartAndRefreshNavigationHandler.openPersonalCart(z11);
    }

    private final String topFragmentTag(G g10) {
        String tag;
        ComponentCallbacksC5392m w02 = g10.w0();
        if (w02 != null && (tag = w02.getTag()) != null) {
            return tag;
        }
        List<ComponentCallbacksC5392m> r02 = g10.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) C7714v.Z(r02);
        if (componentCallbacksC5392m != null) {
            return componentCallbacksC5392m.getTag();
        }
        return null;
    }

    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<NavigateToCartAndRefreshDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigator.safeTransaction(new NavigateToCartAndRefreshNavigationHandler$navigate$1(navigator, this));
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<NavigateToCartAndRefreshDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigate(navigator, response);
    }
}
