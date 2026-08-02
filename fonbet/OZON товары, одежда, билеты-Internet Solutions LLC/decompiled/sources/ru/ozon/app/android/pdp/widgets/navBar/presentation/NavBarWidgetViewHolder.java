package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Vg.d;
import WZ.l;
import WZ.t;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import b20.C5521a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import j10.InterfaceC7238a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils;
import ru.ozon.composer.ui.widget.a;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004BG\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u001d\u0010%\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J5\u00107\u001a\u00020\u001b2\u0010\u0010/\u001a\f\u0012\b\u0012\u00060-j\u0002`.0,2\u0006\u00101\u001a\u0002002\n\u00104\u001a\u000602j\u0002`3H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u00020\u001bH\u0002¢\u0006\u0004\b8\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010;R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010>R\u0018\u0010\u0014\u001a\u00060\u0012j\u0002`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u001b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FRF\u0010I\u001a2\u0012\u0004\u0012\u000200\u0012\u000e\u0012\f\u0012\b\u0012\u00060-j\u0002`.0,0Gj\u0018\u0012\u0004\u0012\u000200\u0012\u000e\u0012\f\u0012\b\u0012\u00060-j\u0002`.0,`H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u0004\u0018\u00010K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u0004\u0018\u00010Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u0004\u0018\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010g\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010`\u001a\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010lR\u0014\u0010q\u001a\u00020j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010l¨\u0006r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO;", "Lru/ozon/app/android/pdp/widgets/navBar/NavBarUtils;", "Lru/ozon/app/android/pdp/utils/DPS;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarLayout;", "view", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;", "viewModel", "Ll10/i;", "container", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/composer/ui/widget/f;", "viewPond", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "favoriteProductDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarLayout;Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;Ll10/i;LWZ/l;Lru/ozon/composer/ui/widget/f;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;LVg/d;)V", "item", "LW10/c;", "trackingData", "viewedPond", "", "trackView", "(Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onWidgetCreated", "()V", "bind", "(Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO;)V", "onWidgetDestroyed", "Lkotlin/Function0;", "afterMeasured", "setupGlobalLayoutListener", "(Lkotlin/jvm/functions/Function0;)V", "removeToolbar", "", "isVisible", "updateState", "(Z)V", "Lb20/a;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "holder", "", "hash", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "composerObject", "updateViewHolder-kUQk7rg", "(Lru/ozon/composer/ui/widget/k;JLru/ozon/composer/ui/widget/l;)V", "updateViewHolder", "blockNavBarTouchInterception", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarLayout;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;", "Ll10/i;", "LWZ/l;", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/composer/ui/widget/a;", "widgetsFactory", "Lru/ozon/composer/ui/widget/a;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nestedViewHolders", "Ljava/util/HashMap;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarBackgroundHandler;", "navBarBackgroundHandler", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarBackgroundHandler;", "currentVisibleState", "Ljava/lang/Boolean;", "currentViewHolderId", "J", "Landroid/view/View;", "gradientView", "Landroid/view/View;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "nestedWidgetGlobalListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver;", "viewTreeObserver", "Landroid/view/ViewTreeObserver;", "metricView", "getMetricView", "()Landroid/view/View;", "", "getFigmaRightPadding", "()I", "figmaRightPadding", "getFigmaGradientWidth", "figmaGradientWidth", "getNavBarHeight", "navBarHeight", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class NavBarWidgetViewHolder extends AbstractC6065b<NavBarVO> implements NavBarUtils, DPS {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final AppBarLayout appBar;
    private final CollapsingToolbarLayout collapsingToolbar;
    private final RecyclerView composerRv;

    @NotNull
    private final i container;
    private long currentViewHolderId;
    private Boolean currentVisibleState;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoriteProductDelegate favoriteProductDelegate;

    @NotNull
    private final View gradientView;

    @NotNull
    private final View metricView;
    private NavBarBackgroundHandler navBarBackgroundHandler;

    @NotNull
    private HashMap<Long, C5521a<c>> nestedViewHolders;
    private ViewTreeObserver.OnGlobalLayoutListener nestedWidgetGlobalListener;

    @NotNull
    private final l tokenizedAnalytics;
    private final Toolbar toolbar;

    @NotNull
    private final NavBarLayout view;

    @NotNull
    private final NavBarViewModel viewModel;

    @NotNull
    private final f viewPond;
    private ViewTreeObserver viewTreeObserver;

    @NotNull
    private final a widgetsFactory;

    public NavBarWidgetViewHolder(@NotNull NavBarLayout view, @NotNull NavBarViewModel viewModel, @NotNull i container, @NotNull l tokenizedAnalytics, @NotNull f viewPond, @NotNull FavoriteProductDelegate favoriteProductDelegate, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewPond, "viewPond");
        Intrinsics.checkNotNullParameter(favoriteProductDelegate, "favoriteProductDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.viewModel = viewModel;
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewPond = viewPond;
        this.favoriteProductDelegate = favoriteProductDelegate;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new NavBarWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.widgetsFactory = container.d0();
        this.nestedViewHolders = new HashMap<>();
        this.collapsingToolbar = ComposerViewExtensionKt.composerCollapsingToolbar(container.Z());
        this.toolbar = ComposerViewExtensionKt.composerToolbar(container.Z());
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(container.Z());
        this.appBar = composerAppbar;
        RecyclerView composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(container.Z());
        this.composerRv = composerRecyclerViewOrNull;
        View view2 = new View(container.L());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getFigmaGradientWidth() + getFigmaRightPadding(), 0);
        layoutParams.gravity = 8388613;
        view2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        view2.setBackground(gradientDrawable);
        this.gradientView = view2;
        this.metricView = view;
        if (composerAppbar != null) {
            this.navBarBackgroundHandler = new NavBarBackgroundHandler(composerAppbar, view2, ComposerViewExtensionKt.composerStickyContainer(container.Z()), composerRecyclerViewOrNull, K.a(this), viewModel);
            container.J().r().c(new a.F(getNavBarHeight()));
        }
        view.setOnTouchListener(new LG.a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$4(NavBarWidgetViewHolder navBarWidgetViewHolder, View view, MotionEvent motionEvent) {
        if (navBarWidgetViewHolder.viewModel.m888isBackgroundVisible()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            navBarWidgetViewHolder.blockNavBarTouchInterception();
        }
        RecyclerView recyclerView = navBarWidgetViewHolder.composerRv;
        if (recyclerView == null) {
            return true;
        }
        recyclerView.dispatchTouchEvent(motionEvent);
        return true;
    }

    private final void blockNavBarTouchInterception() {
        AppBarLayout appBarLayout = this.appBar;
        if (appBarLayout != null) {
            appBarLayout.requestDisallowInterceptTouchEvent(true);
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int getFigmaGradientWidth() {
        return getDp12();
    }

    private final int getFigmaRightPadding() {
        return getDp16();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNavBarHeight() {
        return getDp52();
    }

    private final void removeToolbar() {
        a.F f7;
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.removeAllViews();
            ViewExtKt.gone(toolbar);
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        if (collapsingToolbarLayout != null) {
            ViewExtKt.gone(collapsingToolbarLayout);
        }
        this.viewModel.removeNavbarWidget();
        InterfaceC7238a<ru.ozon.composer.ui.widget.l> r11 = this.container.J().r();
        f7 = a.F.f190b;
        r11.c(f7);
    }

    private final void setupGlobalLayoutListener(final Function0<Unit> afterMeasured) {
        this.view.getCenterNestedWidgetContainer().getViewTreeObserver().removeOnGlobalLayoutListener(this.nestedWidgetGlobalListener);
        final FrameLayout centerNestedWidgetContainer = this.view.getCenterNestedWidgetContainer();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarWidgetViewHolder$setupGlobalLayoutListener$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (centerNestedWidgetContainer.getMeasuredWidth() <= 0 || centerNestedWidgetContainer.getMeasuredHeight() <= 0) {
                    return;
                }
                centerNestedWidgetContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                afterMeasured.invoke();
            }
        };
        centerNestedWidgetContainer.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        this.nestedWidgetGlobalListener = onGlobalLayoutListener;
        this.viewTreeObserver = this.view.getCenterNestedWidgetContainer().getViewTreeObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(boolean isVisible) {
        this.currentVisibleState = Boolean.valueOf(isVisible);
        this.view.updateState(isVisible, new NavBarWidgetViewHolder$updateState$1(this));
        NavBarBackgroundHandler navBarBackgroundHandler = this.navBarBackgroundHandler;
        if (navBarBackgroundHandler != null) {
            navBarBackgroundHandler.updateState(isVisible);
        }
    }

    /* renamed from: updateViewHolder-kUQk7rg, reason: not valid java name */
    private final void m889updateViewHolderkUQk7rg(k holder, long hash, ru.ozon.composer.ui.widget.l composerObject) {
        C5521a.c(holder, AbstractC5434v.b.CREATED);
        Intrinsics.checkNotNullParameter(composerObject, "widgetViewItem");
        holder.track(composerObject);
        C5521a.a(holder, composerObject, this.viewPond);
        C5521a.c(holder, AbstractC5434v.b.RESUMED);
        this.currentViewHolderId = hash;
        this.nestedViewHolders.put(Long.valueOf(hash), C5521a.b(holder));
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils
    @NotNull
    public ValueAnimator alphaAnimation(boolean z11, int i11, int i12, long j11, boolean z12, @NotNull Function1<? super Integer, Unit> function1) {
        return NavBarUtils.DefaultImpls.alphaAnimation(this, z11, i11, i12, j11, z12, function1);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarConstants
    public long getAnimationDuration() {
        return NavBarUtils.DefaultImpls.getAnimationDuration(this);
    }

    public int getDp12() {
        return DPS.DefaultImpls.getDp12(this);
    }

    public int getDp16() {
        return DPS.DefaultImpls.getDp16(this);
    }

    public int getDp52() {
        return DPS.DefaultImpls.getDp52(this);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        if (collapsingToolbarLayout != null) {
            ViewExtKt.show(collapsingToolbarLayout);
        }
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.collapsingToolbar;
        if (collapsingToolbarLayout2 != null) {
            ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout2.getLayoutParams();
            int i11 = layoutParams.height;
            int i12 = layoutParams.width;
            int dp_52 = Dimens.INSTANCE.getDP_52();
            layoutParams.height = dp_52;
            if (i11 != dp_52 || i12 != layoutParams.width) {
                collapsingToolbarLayout2.setLayoutParams(layoutParams);
            }
        }
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            ViewGroup.LayoutParams layoutParams2 = toolbar.getLayoutParams();
            int i13 = layoutParams2.height;
            int i14 = layoutParams2.width;
            int dp_522 = Dimens.INSTANCE.getDP_52();
            layoutParams2.height = dp_522;
            if (i13 != dp_522 || i14 != layoutParams2.width) {
                toolbar.setLayoutParams(layoutParams2);
            }
            toolbar.setPadding(toolbar.getPaddingLeft(), 0, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
            toolbar.setBackground(null);
            toolbar.removeAllViews();
            toolbar.addView(this.view);
            ViewExtKt.show(toolbar);
        }
        C2399j.C(new C2408n0(new C2406m0(this.viewModel.isBackgroundVisible()), new NavBarWidgetViewHolder$onWidgetCreated$3(this, null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = this.viewTreeObserver;
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive() && (viewTreeObserver = this.viewTreeObserver) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.nestedWidgetGlobalListener);
        }
        this.viewTreeObserver = null;
        this.nestedWidgetGlobalListener = null;
        NavBarBackgroundHandler navBarBackgroundHandler = this.navBarBackgroundHandler;
        if (navBarBackgroundHandler != null) {
            navBarBackgroundHandler.onDetach();
        }
        this.view.onDetach();
        removeToolbar();
        super.onWidgetDestroyed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e3, code lost:
    
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    @Override // d20.AbstractC6065b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull NavBarVO item) {
        NavBarBackgroundHandler navBarBackgroundHandler;
        List<ru.ozon.composer.ui.widget.l> list;
        ru.ozon.composer.ui.widget.l lVar;
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.updateNavBarOverlapSizeIfNeeded(item.getIsAlwaysSolid(), new NavBarWidgetViewHolder$bind$1(this, item));
        Map<String, List<ru.ozon.composer.ui.widget.l>> nestedWidgets = getNestedWidgets();
        Boolean bool = null;
        if (nestedWidgets != null && (list = nestedWidgets.get("pdpNavBarCenter")) != null && (lVar = (ru.ozon.composer.ui.widget.l) C7714v.M(list)) != null) {
            if (this.nestedViewHolders.get(Long.valueOf(lVar.d().getId())) == null || this.currentViewHolderId != lVar.d().getId()) {
                ru.ozon.composer.ui.widget.i iVar = new ru.ozon.composer.ui.widget.i(this.view.getCenterNestedWidgetContainer(), this.container);
                this.widgetsFactory.c(iVar, lVar);
                k<c> source = this.widgetsFactory.f(iVar, lVar.j());
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    m889updateViewHolderkUQk7rg(source, lVar.d().getId(), lVar);
                    setupGlobalLayoutListener(new NavBarWidgetViewHolder$bind$2$2$1(this, source));
                    this.view.getCenterNestedWidgetContainer().removeAllViews();
                    this.view.getCenterNestedWidgetContainer().addView(source.itemView);
                    this.view.getCenterNestedWidgetContainer().addView(this.gradientView);
                    unit = Unit.f71690a;
                }
                unit = null;
            } else {
                C5521a<c> c5521a = this.nestedViewHolders.get(Long.valueOf(lVar.d().getId()));
                k d11 = c5521a != null ? c5521a.d() : null;
                if (d11 != null) {
                    k d12 = C5521a.b(d11).d();
                    m889updateViewHolderkUQk7rg(d12, lVar.d().getId(), lVar);
                    setupGlobalLayoutListener(new NavBarWidgetViewHolder$bind$2$1$1(this, d12));
                    unit = Unit.f71690a;
                }
                unit = null;
            }
            if (!item.getIsAlwaysSolid()) {
                bool = Boolean.TRUE;
            } else if (item.getOpacityChangeLevel() == 0.0f) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                this.viewModel.setBackgroundVisibilityConstantly(bool.booleanValue());
            }
            boolean booleanValue = bool == null ? bool.booleanValue() : this.viewModel.m888isBackgroundVisible();
            this.view.bind(item, this.actionHandler, new AnalyticData(getTrackingData(), getViewItem()), this.favoriteProductDelegate, booleanValue);
            navBarBackgroundHandler = this.navBarBackgroundHandler;
            if (navBarBackgroundHandler == null) {
                navBarBackgroundHandler.bind(item.getCornerRadius(), item.getBackground(), item.getOpacityChangeLevel(), booleanValue);
                return;
            }
            return;
        }
        this.view.getCenterNestedWidgetContainer().removeAllViews();
        if (!item.getIsAlwaysSolid()) {
        }
        if (bool != null) {
        }
        boolean booleanValue2 = bool == null ? bool.booleanValue() : this.viewModel.m888isBackgroundVisible();
        this.view.bind(item, this.actionHandler, new AnalyticData(getTrackingData(), getViewItem()), this.favoriteProductDelegate, booleanValue2);
        navBarBackgroundHandler = this.navBarBackgroundHandler;
        if (navBarBackgroundHandler == null) {
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull NavBarVO item, @NotNull W10.c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent);
        }
    }
}
