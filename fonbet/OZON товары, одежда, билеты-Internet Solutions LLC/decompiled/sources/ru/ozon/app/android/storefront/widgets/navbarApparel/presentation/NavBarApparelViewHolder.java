package ru.ozon.app.android.storefront.widgets.navbarApparel.presentation;

import Vg.d;
import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.cache.handler.search.SearchCacheGroup;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.storefront.widgets.navbarApparel.core.SaveStateEvent;
import ru.ozon.app.android.storefront.widgets.navbarApparel.view.NavBarApparelBehavior;
import ru.ozon.app.android.storefront.widgets.navbarApparel.view.NavBarApparelView;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001IB3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0015J*\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR*\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0018\u00010C8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Ll10/i;", "container", "favProductMoleculeDelegate", "", "isRootScreen", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;ZLru/ozon/app/android/common/SearchUrlPrefetchService;LVg/d;)V", "item", "", "bind", "(Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Ll10/i;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Z", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "LVg/d;", "Landroidx/recyclerview/widget/RecyclerView$t;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "", "currentScrollY", "I", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;", "navBarView", "Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelAnimationManager;", "animationManager", "Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelAnimationManager;", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getRootCoordinator", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "rootCoordinator", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "Lkotlin/Function1;", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "onFavoriteClick", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBarApparelViewHolder extends AbstractC6065b<NavBarApparelVO> implements FavoriteProductDelegate {

    @NotNull
    private final NavBarApparelAnimationManager animationManager;
    private final AppBarLayout appBarLayout;

    @NotNull
    private final i container;
    private int currentScrollY;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoriteProductDelegate favProductMoleculeDelegate;
    private final boolean isRootScreen;

    @NotNull
    private final NavBarApparelView navBarView;
    private RecyclerView.t onScrollListener;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelViewHolder$Companion;", "", "<init>", "()V", "NAVBAR_LOCATOR", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NavBarApparelViewHolder(@NotNull i container, @NotNull FavoriteProductDelegate favProductMoleculeDelegate, boolean z11, @NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.container = container;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        this.isRootScreen = z11;
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(container.Y());
        this.appBarLayout = composerAppbar;
        NavBarApparelView navBarApparelView = (NavBarApparelView) q.f64554a.i(N.b(NavBarApparelView.class), container.L());
        if (navBarApparelView == null) {
            Context L11 = container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            navBarApparelView = new NavBarApparelView(L11, null, 0, 6, null);
        }
        navBarApparelView.setContentDescription("Navbar Apparel");
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
        fVar.i(new NavBarApparelBehavior(composerAppbar));
        navBarApparelView.setLayoutParams(fVar);
        this.navBarView = navBarApparelView;
        this.animationManager = new NavBarApparelAnimationManager(container.Q(), navBarApparelView);
    }

    private final RecyclerView getComposerRecyclerView() {
        return ComposerViewExtensionKt.composerRecyclerView(this.container.Y());
    }

    private final CoordinatorLayout getRootCoordinator() {
        return ComposerViewExtensionKt.composerCoordinatorLayout(this.container.Y());
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favProductMoleculeDelegate.attachFavButtonView(button);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favProductMoleculeDelegate.bindFavoriteProductButton(button, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.navBarView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        CoordinatorLayout rootCoordinator = getRootCoordinator();
        if (rootCoordinator != null) {
            rootCoordinator.addView(this.navBarView);
        }
        RecyclerView.t tVar = this.onScrollListener;
        if (tVar != null) {
            getComposerRecyclerView().removeOnScrollListener(tVar);
        }
        RecyclerView.t tVar2 = new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.navbarApparel.presentation.NavBarApparelViewHolder$onWidgetCreated$2
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                int i11;
                NavBarApparelAnimationManager navBarApparelAnimationManager;
                int i12;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                NavBarApparelViewHolder navBarApparelViewHolder = NavBarApparelViewHolder.this;
                i11 = navBarApparelViewHolder.currentScrollY;
                navBarApparelViewHolder.currentScrollY = i11 + dy;
                navBarApparelAnimationManager = NavBarApparelViewHolder.this.animationManager;
                i12 = NavBarApparelViewHolder.this.currentScrollY;
                navBarApparelAnimationManager.onScroll(i12);
            }
        };
        this.onScrollListener = tVar2;
        getComposerRecyclerView().addOnScrollListener(tVar2);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.container.M().update(new SaveStateEvent(this.currentScrollY));
        this.animationManager.cancelAnimation();
        RecyclerView.t tVar = this.onScrollListener;
        if (tVar != null) {
            getComposerRecyclerView().removeOnScrollListener(tVar);
        }
        CoordinatorLayout rootCoordinator = getRootCoordinator();
        if (rootCoordinator != null) {
            rootCoordinator.removeView(this.navBarView);
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.favProductMoleculeDelegate.setOnFavoriteClick(function1);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull NavBarApparelVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getPrefetchDeeplink() != null) {
            this.searchUrlPrefetchService.prefetch(item.getPrefetchDeeplink(), SearchCacheGroup.INSTANCE, false);
        }
        if (this.currentScrollY == 0) {
            this.currentScrollY = item.getCurrentScrollY();
        }
        this.animationManager.onBind(this.currentScrollY);
        this.navBarView.bind(item, this.isRootScreen, this.container, this, this.customActionHandlersStoreFactory, new NavBarApparelViewHolder$bind$2(this));
    }
}
