package ru.ozon.app.android.cart.ui.customActionHandler.navigateToCartAndRefresh;

import EZ.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R&\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/ui/customActionHandler/navigateToCartAndRefresh/NavigateToCartAndRefreshDestination;", "LpZ/f;", "Lru/ozon/app/android/navigation/newrouter/destinations/Destination;", "<init>", "()V", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigateToCartAndRefreshDestination extends f {

    @NotNull
    private final d<? extends a<?>> navigator = N.b(NavigateToCartAndRefreshNavigationHandler.class);

    @Override // pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }
}
