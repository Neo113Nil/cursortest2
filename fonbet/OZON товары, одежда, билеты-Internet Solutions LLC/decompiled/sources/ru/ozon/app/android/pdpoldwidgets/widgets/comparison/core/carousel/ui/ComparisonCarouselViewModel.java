package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import Mc.a;
import androidx.lifecycle.w0;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior;
import ru.ozon.app.android.utils.StringExtKt;
import vc.k;
import vc.l;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0016\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "subscriptionService", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/account/subscription/SubscriptionService;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;)V", "LWZ/l;", "tokenizedAnalytics", "", "attach", "(LWZ/l;)V", "", "widgetId", "", "productId", "", "quantity", "Lio/reactivex/b;", "addToCart", "(Ljava/lang/Long;Ljava/lang/String;I)Lio/reactivex/b;", "removeFromCart", "(Ljava/lang/Long;Ljava/lang/String;)Lio/reactivex/b;", "id", "addToFavorite", "(J)Lio/reactivex/b;", "subscribeToStock", "(Ljava/lang/String;)Lio/reactivex/b;", "unsubscribeFromStock", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;", "carouselBehaviorMode", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;", "getCarouselBehaviorMode", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;", "setCarouselBehaviorMode", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;)V", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComparisonCarouselViewModel extends w0 {

    @NotNull
    private ComparisonCarouselBehavior.Mode carouselBehaviorMode;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;

    @NotNull
    private final SubscriptionService subscriptionService;

    public ComparisonCarouselViewModel(@NotNull CartService cartService, @NotNull SubscriptionService subscriptionService, @NotNull FavoriteInteractor favoriteInteractor) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(subscriptionService, "subscriptionService");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        this.cartService = cartService;
        this.subscriptionService = subscriptionService;
        this.favoriteInteractor = favoriteInteractor;
        this.carouselBehaviorMode = ComparisonCarouselBehavior.Mode.Expanded.INSTANCE;
    }

    public static /* synthetic */ AbstractC7094b addToCart$default(ComparisonCarouselViewModel comparisonCarouselViewModel, Long l11, String str, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        return comparisonCarouselViewModel.addToCart(l11, str, i11);
    }

    @NotNull
    public final AbstractC7094b addToCart(Long widgetId, @NotNull String productId, int quantity) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (StringExtKt.isDigital(productId)) {
            return new l(CartService.DefaultImpls.addProductToCart$default(this.cartService, productId, quantity, null, null, widgetId, "addToCart", null, null, null, null, 960, null).k(a.b()), C8125a.a());
        }
        k kVar = k.f102782a;
        Intrinsics.f(kVar);
        return kVar;
    }

    @NotNull
    public final AbstractC7094b addToFavorite(long id2) {
        return this.favoriteInteractor.addToFavorite(id2);
    }

    public final void attach(@NotNull WZ.l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }

    @NotNull
    public final ComparisonCarouselBehavior.Mode getCarouselBehaviorMode() {
        return this.carouselBehaviorMode;
    }

    @NotNull
    public final AbstractC7094b removeFromCart(Long widgetId, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        l lVar = new l(CartService.DefaultImpls.removeProductFromCart$default(this.cartService, productId, 0, null, null, widgetId, null, null, 96, null).k(a.b()), C8125a.a());
        Intrinsics.checkNotNullExpressionValue(lVar, "observeOn(...)");
        return lVar;
    }

    public final void setCarouselBehaviorMode(@NotNull ComparisonCarouselBehavior.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "<set-?>");
        this.carouselBehaviorMode = mode;
    }

    @NotNull
    public final AbstractC7094b subscribeToStock(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        if (StringExtKt.isDigital(id2)) {
            return new l(this.subscriptionService.subscribeToItemAvailabilityChange(Long.parseLong(id2)).k(a.b()), C8125a.a());
        }
        k kVar = k.f102782a;
        Intrinsics.f(kVar);
        return kVar;
    }

    @NotNull
    public final AbstractC7094b unsubscribeFromStock(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        if (StringExtKt.isDigital(id2)) {
            return new l(this.subscriptionService.unsubscribeFromItemAvailabilityChange(Long.parseLong(id2)).k(a.b()), C8125a.a());
        }
        k kVar = k.f102782a;
        Intrinsics.f(kVar);
        return kVar;
    }
}
