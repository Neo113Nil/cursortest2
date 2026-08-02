package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import A00.a;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import B90.O;
import De.s;
import Fy.ViewOnLayoutChangeListenerC3067e;
import LS.c;
import Sc.InterfaceC4008j;
import Vg.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C5316f0;
import androidx.core.view.C5353y0;
import androidx.core.view.G;
import androidx.core.view.Q0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.view.TransparentNavBarV2View;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Bc\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b'\u0010\u001eJ*\u0010,\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010\u001eJ\u000f\u00100\u001a\u00020\u001cH\u0002¢\u0006\u0004\b0\u0010\u001eJ\u000f\u00101\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u0010\u001eJ\u000f\u00102\u001a\u00020\u001cH\u0002¢\u0006\u0004\b2\u0010\u001eJ\u000f\u00103\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010;R\u001c\u0010>\u001a\n =*\u0004\u0018\u00010<0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u0004\u0018\u00010C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u0004\u0018\u00010I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u0004\u0018\u00010@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u0004\u0018\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010MR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u001c0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u0004\u0018\u00010j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001b\u0010r\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006v"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2WidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Ll10/i;", "container", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "favProductMoleculeDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "scrollAnchorViewModel", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarViewModel;", "transparentNavBarViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "<init>", "(Ll10/i;Lcom/google/android/material/appbar/AppBarLayout;Landroidx/appcompat/widget/Toolbar;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;LVg/d;Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarViewModel;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;)V", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;)V", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "view", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "configAppBar", "configStatusBar", "configToolbar", "restoreAppBar", "restoreStatusBar", "restoreToolbar", "Ll10/i;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroidx/appcompat/widget/Toolbar;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "LVg/d;", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarViewModel;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "", "dp8", "I", "Landroidx/fragment/app/m;", "fragment", "Landroidx/fragment/app/m;", "Landroidx/fragment/app/r;", "activity", "Landroidx/fragment/app/r;", "Landroid/view/Window;", "window", "Landroid/view/Window;", "originBgColor", "Ljava/lang/Integer;", "", "isBgColorDark", "Ljava/lang/Boolean;", "Landroid/widget/LinearLayout;", "composerTopContainer", "Landroid/widget/LinearLayout;", "Landroid/view/ViewGroup;", "composerStickyContainer", "Landroid/view/ViewGroup;", "topInset", "", "toolbarPaddings", "[I", "", "Landroid/view/View;", "toolbarChildren", "Ljava/util/List;", "Landroid/view/View$OnLayoutChangeListener;", "stickyContainersOnLayoutListener", "Landroid/view/View$OnLayoutChangeListener;", "topContainersOnLayoutListener", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/view/TransparentNavBarV2View;", "navbarView$delegate", "LSc/j;", "getNavbarView", "()Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/view/TransparentNavBarV2View;", "navbarView", "getMetricView", "()Landroid/view/View;", "metricView", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransparentNavBarV2WidgetViewHolder extends AbstractC6065b<TransparentNavBarV2VO> implements FavoriteProductV4Delegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final r activity;

    @NotNull
    private final AppBarLayout appBar;
    private final ViewGroup composerStickyContainer;

    @NotNull
    private final LinearLayout composerTopContainer;

    @NotNull
    private final i container;
    private final Context context;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final int dp8;

    @NotNull
    private final FavoriteProductV4Delegate favProductMoleculeDelegate;

    @NotNull
    private final FavoriteManager favoriteManager;
    private final HotelFavoriteUnauthorizedClickDelegate favoriteUnauthorizedClickDelegate;

    @NotNull
    private final HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator;
    private final ComponentCallbacksC5392m fragment;
    private final Boolean isBgColorDark;

    /* renamed from: navbarView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navbarView;
    private final Integer originBgColor;

    @NotNull
    private final ScrollAnchorViewModel scrollAnchorViewModel;

    @NotNull
    private final View.OnLayoutChangeListener stickyContainersOnLayoutListener;

    @NotNull
    private final Toolbar toolbar;

    @NotNull
    private List<View> toolbarChildren;
    private int[] toolbarPaddings;

    @NotNull
    private final View.OnLayoutChangeListener topContainersOnLayoutListener;
    private Integer topInset;

    @NotNull
    private final TransparentNavBarViewModel transparentNavBarViewModel;
    private final Window window;

    public TransparentNavBarV2WidgetViewHolder(@NotNull i container, @NotNull AppBarLayout appBar, @NotNull Toolbar toolbar, @NotNull FavoriteProductV4Delegate favProductMoleculeDelegate, @NotNull d customActionHandlersStoreFactory, @NotNull ScrollAnchorViewModel scrollAnchorViewModel, @NotNull FavoriteManager favoriteManager, @NotNull TransparentNavBarViewModel transparentNavBarViewModel, @NotNull FeatureChecker featureChecker, @NotNull AuthStateStorage authStateStorage, @NotNull HotelFavoriteUnauthorizedAnalytics favoriteUnauthorizedAnalytics) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(scrollAnchorViewModel, "scrollAnchorViewModel");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(transparentNavBarViewModel, "transparentNavBarViewModel");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(favoriteUnauthorizedAnalytics, "favoriteUnauthorizedAnalytics");
        this.container = container;
        this.appBar = appBar;
        this.toolbar = toolbar;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.scrollAnchorViewModel = scrollAnchorViewModel;
        this.favoriteManager = favoriteManager;
        this.transparentNavBarViewModel = transparentNavBarViewModel;
        Context context = container.L();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.fragment = container.Q().c();
        r a11 = container.Q().a();
        this.activity = a11;
        HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate = null;
        Window window = a11 != null ? a11.getWindow() : null;
        this.window = window;
        this.originBgColor = window != null ? Integer.valueOf(window.getStatusBarColor()) : null;
        this.isBgColorDark = window != null ? Boolean.valueOf(!new Q0(window.getDecorView(), window).c()) : null;
        this.composerTopContainer = ComposerViewExtensionKt.composerTopContainer(container.Y());
        this.composerStickyContainer = ComposerViewExtensionKt.composerStickyContainer(container.Y());
        this.toolbarChildren = new ArrayList();
        this.stickyContainersOnLayoutListener = new ViewOnLayoutChangeListenerC3067e(this, 1);
        this.topContainersOnLayoutListener = new c(this, 0);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).customActionHandlers(new TransparentNavBarV2WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.favoritesForAuthorizedFeatureActivator = new HotelFavoritesForAuthorizedFeatureActivator(featureChecker, authStateStorage.isAuthenticated(), authStateStorage.getAuthState());
        ComponentCallbacksC5392m c11 = container.Q().c();
        if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null && (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) != null) {
            hotelFavoriteUnauthorizedClickDelegate = new HotelFavoriteUnauthorizedClickDelegate(asNotificationLayoutManager$default, buildHandler, container.Q().g(), favoriteUnauthorizedAnalytics);
        }
        this.favoriteUnauthorizedClickDelegate = hotelFavoriteUnauthorizedClickDelegate;
        this.navbarView = LazyUtilsKt.unsafeLazy(new TransparentNavBarV2WidgetViewHolder$navbarView$2(this));
        container.J().r().c(new a.C2367h(false, false));
        container.J().r().c(a.A.f163a);
    }

    private final void configAppBar() {
        AppBarLayout appBarLayout = this.appBar;
        appBarLayout.setFocusable(true);
        appBarLayout.setClickable(true);
        Y.J(appBarLayout, new O(this));
        appBarLayout.requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 configAppBar$lambda$8$lambda$7(TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder, View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        D a11 = K.a(transparentNavBarV2WidgetViewHolder);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, s.f6650a, null, new TransparentNavBarV2WidgetViewHolder$configAppBar$1$1$1(transparentNavBarV2WidgetViewHolder, insets, null), 2);
        return Y.u(view, insets);
    }

    private final void configStatusBar() {
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(c11, newState, 0);
        ComponentCallbacksC5392m c12 = this.container.Q().c();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        StatusBarController.setStatusBarContentColor$default(statusBarController, c12, newState, ThemeExtKt.isDarkThemeActive(context), false, 8, null);
        this.container.Z().setFitsSystemWindows(false);
    }

    private final void configToolbar() {
        Toolbar toolbar = this.toolbar;
        this.toolbarChildren.clear();
        C7714v.q(this.toolbarChildren, C5316f0.b(toolbar));
        toolbar.removeAllViews();
        this.toolbarPaddings = new int[]{toolbar.getPaddingLeft(), toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom()};
        toolbar.setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        toolbar.setLayoutParams(layoutParams);
        toolbar.setBackgroundColor(0);
        toolbar.addView(getNavbarView());
        ViewExtKt.show(toolbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransparentNavBarV2View getNavbarView() {
        return (TransparentNavBarV2View) this.navbarView.getValue();
    }

    private final void restoreAppBar() {
        AppBarLayout appBarLayout = this.appBar;
        appBarLayout.setFocusable(false);
        appBarLayout.setClickable(false);
        Y.J(appBarLayout, null);
        this.topInset = null;
    }

    private final void restoreStatusBar() {
        Integer num = this.originBgColor;
        if (num == null || this.isBgColorDark == null) {
            return;
        }
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.fragment;
        StatusBarController.UpdateReason.Recovery recovery = StatusBarController.UpdateReason.Recovery.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(componentCallbacksC5392m, recovery, num.intValue());
        StatusBarController.setStatusBarContentColor$default(statusBarController, this.fragment, recovery, this.isBgColorDark.booleanValue(), false, 8, null);
    }

    private final void restoreToolbar() {
        Toolbar toolbar = this.toolbar;
        int[] iArr = this.toolbarPaddings;
        if (iArr != null) {
            toolbar.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        this.toolbarPaddings = null;
        toolbar.removeAllViews();
        Iterator<T> it = this.toolbarChildren.iterator();
        while (it.hasNext()) {
            toolbar.addView((View) it.next());
        }
        this.toolbarChildren.clear();
        ViewExtKt.gone(toolbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stickyContainersOnLayoutListener$lambda$1(TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view.getMeasuredHeight() == 0 || !Intrinsics.d(transparentNavBarV2WidgetViewHolder.transparentNavBarViewModel.getPreviousIsPlaceholderVisible(), Boolean.TRUE)) {
            transparentNavBarV2WidgetViewHolder.getNavbarView().enableRoundedCorners();
        } else {
            transparentNavBarV2WidgetViewHolder.getNavbarView().disableRoundedCorners();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void topContainersOnLayoutListener$lambda$2(TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view.getMeasuredHeight() != 0) {
            transparentNavBarV2WidgetViewHolder.getNavbarView().disableRoundedCorners();
        } else {
            transparentNavBarV2WidgetViewHolder.getNavbarView().enableRoundedCorners();
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeV4ButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.favProductMoleculeDelegate.attachFavButtonView(view);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void bindFavoriteProductButton(@NotNull ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favProductMoleculeDelegate.bindFavoriteProductButton(view, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void detachFavButtonView() {
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return getNavbarView();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        Boolean previousIsPlaceholderVisible = this.transparentNavBarViewModel.getPreviousIsPlaceholderVisible();
        if (previousIsPlaceholderVisible != null) {
            final boolean booleanValue = previousIsPlaceholderVisible.booleanValue();
            final TransparentNavBarV2View navbarView = getNavbarView();
            G.a(navbarView, new Runnable() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2WidgetViewHolder$onWidgetCreated$lambda$5$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    TransparentNavBarV2View navbarView2;
                    i iVar;
                    navbarView2 = this.getNavbarView();
                    navbarView2.updateNavbar(booleanValue);
                    iVar = this.container;
                    iVar.M().d(new PlaceholderVisibilityUpdateKey(booleanValue));
                }
            });
        }
        C2399j.C(new C(new C2408n0(C5427n.a(this.scrollAnchorViewModel.scrollUpdate(), getLifecycle(), AbstractC5434v.b.STARTED), new TransparentNavBarV2WidgetViewHolder$onWidgetCreated$2(this, null)), new TransparentNavBarV2WidgetViewHolder$onWidgetCreated$3(null)), K.a(this));
        C2399j.C(new C(new C2408n0(this.favoriteManager.onFavoriteChangeFlow(), new TransparentNavBarV2WidgetViewHolder$onWidgetCreated$4(this, null)), new TransparentNavBarV2WidgetViewHolder$onWidgetCreated$5(null)), K.a(this));
        configStatusBar();
        configAppBar();
        configToolbar();
        TransparentNavBarV2VO boundData = getBoundData();
        if (boundData != null && boundData.getIsDynamicAlpha()) {
            TransparentNavBarV2VO boundData2 = getBoundData();
            if ((boundData2 != null ? boundData2.getScrollAnchorId() : null) != null) {
                ViewGroup viewGroup = this.composerStickyContainer;
                if (viewGroup != null) {
                    viewGroup.addOnLayoutChangeListener(this.stickyContainersOnLayoutListener);
                }
                getNavbarView().onWidgetCreated(this);
            }
        }
        this.composerTopContainer.addOnLayoutChangeListener(this.topContainersOnLayoutListener);
        getNavbarView().onWidgetCreated(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        restoreStatusBar();
        restoreAppBar();
        restoreToolbar();
        this.composerTopContainer.removeOnLayoutChangeListener(this.topContainersOnLayoutListener);
        ViewGroup viewGroup = this.composerStickyContainer;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.stickyContainersOnLayoutListener);
        }
        getNavbarView().onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TransparentNavBarV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Boolean previousIsPlaceholderVisible = this.transparentNavBarViewModel.getPreviousIsPlaceholderVisible();
        if (previousIsPlaceholderVisible != null) {
            boolean booleanValue = previousIsPlaceholderVisible.booleanValue();
            if (item.getScrollAnchorId() != null && item.getIsDynamicAlpha()) {
                this.container.M().d(new PlaceholderVisibilityUpdateKey(booleanValue));
            }
        }
        TransparentNavBarV2View navbarView = getNavbarView();
        l viewItem = getViewItem();
        Boolean previousIsPlaceholderVisible2 = this.transparentNavBarViewModel.getPreviousIsPlaceholderVisible();
        navbarView.bind(item, viewItem, this.actionHandler, previousIsPlaceholderVisible2 != null ? previousIsPlaceholderVisible2.booleanValue() : false, new TransparentNavBarV2WidgetViewHolder$bind$2(this));
    }
}
