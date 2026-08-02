package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2404l0;
import Ae.C2408n0;
import IU.e;
import Sc.InterfaceC4008j;
import Vg.d;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C5316f0;
import androidx.core.view.G;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.ranges.h;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view.OrderNavBarBackgroundView;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view.OrderNavBarContentPlaceholderView;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view.OrderNavBarTitlePlaceholderView;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 w2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001wB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u001c\u0010/\u001a\n .*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u0004\u0018\u00010=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u0004\u0018\u00010B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010AR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00106R\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010eR \u0010i\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00120g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u00106R\u0016\u0010o\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u00106R*\u0010q\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u00120p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO;", "Ll10/i;", "container", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;", "viewModel", "<init>", "(Ll10/i;Lcom/google/android/material/appbar/AppBarLayout;Landroidx/appcompat/widget/Toolbar;Lcom/google/android/material/appbar/CollapsingToolbarLayout;LVg/d;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO;)V", "onWidgetDestroyed", "configAppBar", "configStatusBar", "configToolbarLayout", "configToolbar", "updateToolbarLayoutHeight", "detectComposerAutoScroll", "restoreAppBar", "restoreStatusBar", "restoreToolbarLayout", "restoreToolbar", "", "alpha", "colorStatusBarColor", "(F)V", "Ll10/i;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroidx/appcompat/widget/Toolbar;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "LVg/d;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "statusBarHeight", "I", "Landroidx/fragment/app/m;", "fragment", "Landroidx/fragment/app/m;", "Landroidx/fragment/app/r;", "activity", "Landroidx/fragment/app/r;", "Landroid/view/Window;", "window", "Landroid/view/Window;", "originBgColor", "Ljava/lang/Integer;", "", "isBgColorDark", "Ljava/lang/Boolean;", "", "toolbarPaddings", "[I", "", "Landroid/view/View;", "toolbarChildren", "Ljava/util/List;", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "previousOffset", "", "scrollTargetWidget", "Ljava/lang/String;", "Landroidx/recyclerview/widget/g;", "composerRecycler", "Landroidx/recyclerview/widget/g;", "defaultScrollOffset", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarTitlePlaceholderView;", "fixedPlaceholderView$delegate", "LSc/j;", "getFixedPlaceholderView", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarTitlePlaceholderView;", "fixedPlaceholderView", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarContentPlaceholderView;", "contentPlaceholderView$delegate", "getContentPlaceholderView", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarContentPlaceholderView;", "contentPlaceholderView", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarBackgroundView;", "backgroundView$delegate", "getBackgroundView", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarBackgroundView;", "backgroundView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lcom/google/android/material/appbar/AppBarLayout$f;", "offsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "fixedPlaceholderHeight", "contentPlaceholderHeight", "Lkotlin/Function2;", "onPlaceholdersSizeChanged", "Lkotlin/jvm/functions/Function2;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderNavBarWidgetViewHolder extends AbstractC6065b<OrderNavBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final r activity;

    @NotNull
    private final AppBarLayout appBar;

    @NotNull
    private final ArgbEvaluator argbEvaluator;

    /* renamed from: backgroundView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundView;

    @NotNull
    private final CollapsingToolbarLayout collapsingToolbarLayout;

    @NotNull
    private final g composerRecycler;

    @NotNull
    private final i container;
    private int contentPlaceholderHeight;

    /* renamed from: contentPlaceholderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j contentPlaceholderView;
    private final Context context;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final int defaultScrollOffset;
    private int fixedPlaceholderHeight;

    /* renamed from: fixedPlaceholderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fixedPlaceholderView;
    private final ComponentCallbacksC5392m fragment;

    @NotNull
    private final Handler handler;
    private final Boolean isBgColorDark;

    @NotNull
    private final View metricView;

    @NotNull
    private final AppBarLayout.f offsetChangedListener;

    @NotNull
    private final Function2<Integer, Integer, Unit> onPlaceholdersSizeChanged;
    private final Integer originBgColor;
    private Integer previousOffset;
    private String scrollTargetWidget;
    private int statusBarHeight;

    @NotNull
    private final Toolbar toolbar;

    @NotNull
    private List<View> toolbarChildren;
    private int[] toolbarPaddings;

    @NotNull
    private final OrderNavBarViewModel viewModel;
    private final Window window;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarWidgetViewHolder$Companion;", "", "<init>", "()V", "PARALLAX_MULTIPLIER", "", "MIN_ALPHA", "MAX_ALPHA", "COLOR_STATUS_BAR_CONTENT_ALPHA", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OrderNavBarWidgetViewHolder(@NotNull i container, @NotNull AppBarLayout appBar, @NotNull Toolbar toolbar, @NotNull CollapsingToolbarLayout collapsingToolbarLayout, @NotNull d customActionHandlersStoreFactory, @NotNull OrderNavBarViewModel viewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.container = container;
        this.appBar = appBar;
        this.toolbar = toolbar;
        this.collapsingToolbarLayout = collapsingToolbarLayout;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.viewModel = viewModel;
        Context context = container.L();
        this.context = context;
        this.handler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.statusBarHeight = UiExtKt.toPx(25, context);
        this.fragment = container.Q().c();
        r a11 = container.Q().a();
        this.activity = a11;
        Window window = a11 != null ? a11.getWindow() : null;
        this.window = window;
        this.originBgColor = window != null ? Integer.valueOf(window.getStatusBarColor()) : null;
        this.isBgColorDark = window != null ? Boolean.valueOf(!new Q0(window.getDecorView(), window).c()) : null;
        this.toolbarChildren = new ArrayList();
        this.argbEvaluator = new ArgbEvaluator();
        this.composerRecycler = container.e0();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.defaultScrollOffset = UiExtKt.toPx(56, context);
        this.fixedPlaceholderView = LazyUtilsKt.unsafeLazy(new OrderNavBarWidgetViewHolder$fixedPlaceholderView$2(this));
        this.contentPlaceholderView = LazyUtilsKt.unsafeLazy(new OrderNavBarWidgetViewHolder$contentPlaceholderView$2(this));
        this.backgroundView = LazyUtilsKt.unsafeLazy(new OrderNavBarWidgetViewHolder$backgroundView$2(this));
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new OrderNavBarWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.offsetChangedListener = new AppBarLayout.f() { // from class: aR.b
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                OrderNavBarWidgetViewHolder.offsetChangedListener$lambda$1(OrderNavBarWidgetViewHolder.this, appBarLayout, i11);
            }
        };
        this.onPlaceholdersSizeChanged = new OrderNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1(this);
        this.metricView = toolbar;
    }

    private final void colorStatusBarColor(float alpha) {
        boolean booleanValue;
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.fragment;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        if (alpha > 0.3f) {
            booleanValue = true;
        } else {
            Boolean bool = this.isBgColorDark;
            booleanValue = bool != null ? bool.booleanValue() : false;
        }
        StatusBarController.setStatusBarContentColor$default(statusBarController, componentCallbacksC5392m, newState, booleanValue, false, 8, null);
    }

    private final void configAppBar() {
        final AppBarLayout appBarLayout = this.appBar;
        appBarLayout.setFocusable(true);
        appBarLayout.setClickable(true);
        appBarLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: aR.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderNavBarWidgetViewHolder f36504b;

            {
                this.f36504b = this;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets configAppBar$lambda$8$lambda$4;
                configAppBar$lambda$8$lambda$4 = OrderNavBarWidgetViewHolder.configAppBar$lambda$8$lambda$4(appBarLayout, this.f36504b, view, windowInsets);
                return configAppBar$lambda$8$lambda$4;
            }
        });
        appBarLayout.requestApplyInsets();
        G.a(appBarLayout, new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarWidgetViewHolder$configAppBar$lambda$8$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2;
                OrderNavBarViewModel orderNavBarViewModel;
                OrderNavBarViewModel orderNavBarViewModel2;
                AppBarLayout appBarLayout2;
                Toolbar toolbar;
                int i11;
                OrderNavBarViewModel orderNavBarViewModel3;
                AppBarLayout appBarLayout3;
                String str3;
                i iVar;
                int i12;
                AppBarLayout appBarLayout4;
                OrderNavBarViewModel orderNavBarViewModel4;
                OrderNavBarViewModel orderNavBarViewModel5;
                OrderNavBarViewModel orderNavBarViewModel6;
                i iVar2;
                str = this.scrollTargetWidget;
                if (str != null) {
                    orderNavBarViewModel4 = this.viewModel;
                    if (orderNavBarViewModel4.getVerticalOffset() != 0) {
                        orderNavBarViewModel5 = this.viewModel;
                        Integer previousFirstVisiblePos = orderNavBarViewModel5.getPreviousFirstVisiblePos();
                        if (previousFirstVisiblePos != null) {
                            int intValue = previousFirstVisiblePos.intValue();
                            iVar2 = this.container;
                            iVar2.M().l(intValue);
                        }
                        this.scrollTargetWidget = null;
                        orderNavBarViewModel6 = this.viewModel;
                        orderNavBarViewModel6.setPreviousFirstVisiblePos(null);
                        return;
                    }
                }
                str2 = this.scrollTargetWidget;
                if (str2 != null) {
                    orderNavBarViewModel3 = this.viewModel;
                    if (orderNavBarViewModel3.getVerticalOffset() == 0) {
                        appBarLayout3 = this.appBar;
                        appBarLayout3.t(false, false);
                        str3 = this.scrollTargetWidget;
                        if (str3 != null) {
                            iVar = this.container;
                            InterfaceC7851b M11 = iVar.M();
                            i12 = this.defaultScrollOffset;
                            appBarLayout4 = this.appBar;
                            InterfaceC7851b.a.c(M11, str3, Integer.valueOf(Math.max(i12, appBarLayout4.getMeasuredHeight())), 4);
                        }
                        this.scrollTargetWidget = null;
                        return;
                    }
                }
                orderNavBarViewModel = this.viewModel;
                int abs = Math.abs(orderNavBarViewModel.getVerticalOffset());
                orderNavBarViewModel2 = this.viewModel;
                if (abs > orderNavBarViewModel2.getCollapsedAppBarHeight()) {
                    appBarLayout2 = this.appBar;
                    appBarLayout2.t(false, false);
                    OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder = this;
                    Context context = appBarLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    orderNavBarWidgetViewHolder.statusBarHeight = ResourceExtKt.getStatusBarHeight(context);
                    toolbar = this.toolbar;
                    i11 = this.statusBarHeight;
                    toolbar.setPadding(0, i11, 0, 0);
                    this.updateToolbarLayoutHeight();
                }
            }
        });
        appBarLayout.d(this.offsetChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets configAppBar$lambda$8$lambda$4(AppBarLayout appBarLayout, OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder, View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        appBarLayout.getHandler().post(new e(3, orderNavBarWidgetViewHolder, appBarLayout));
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configAppBar$lambda$8$lambda$4$lambda$3(OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder, AppBarLayout appBarLayout) {
        Context context = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int statusBarHeight = ResourceExtKt.getStatusBarHeight(context);
        orderNavBarWidgetViewHolder.statusBarHeight = statusBarHeight;
        orderNavBarWidgetViewHolder.toolbar.setPadding(0, statusBarHeight, 0, 0);
        orderNavBarWidgetViewHolder.updateToolbarLayoutHeight();
    }

    private final void configStatusBar() {
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(c11, newState, 0);
        StatusBarController.setStatusBarContentColor$default(statusBarController, this.container.Q().c(), newState, false, false, 8, null);
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
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
        }
        CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) layoutParams;
        ((FrameLayout.LayoutParams) aVar).height = -2;
        aVar.a(1);
        toolbar.setLayoutParams(aVar);
        toolbar.setBackgroundColor(0);
        toolbar.addView(getFixedPlaceholderView(), 0);
        ViewExtKt.show(toolbar);
    }

    private final void configToolbarLayout() {
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbarLayout;
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
        AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
        if (dVar != null) {
            dVar.b(3);
        }
        collapsingToolbarLayout.addView(getBackgroundView(), 0);
        collapsingToolbarLayout.addView(getContentPlaceholderView(), 1);
        ViewExtKt.show(collapsingToolbarLayout);
    }

    private final void detectComposerAutoScroll() {
        C2399j.C(new C2408n0(C2399j.O(new C2404l0(C5427n.a(this.container.M().getEventsFlow(), getLifecycle(), AbstractC5434v.b.STARTED), N.b(a.C.c.class)), 1), new OrderNavBarWidgetViewHolder$detectComposerAutoScroll$1(this, null)), H.a(getLifecycle()));
    }

    private final OrderNavBarBackgroundView getBackgroundView() {
        return (OrderNavBarBackgroundView) this.backgroundView.getValue();
    }

    private final OrderNavBarContentPlaceholderView getContentPlaceholderView() {
        return (OrderNavBarContentPlaceholderView) this.contentPlaceholderView.getValue();
    }

    private final OrderNavBarTitlePlaceholderView getFixedPlaceholderView() {
        return (OrderNavBarTitlePlaceholderView) this.fixedPlaceholderView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offsetChangedListener$lambda$1(OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder, AppBarLayout appBarLayout, int i11) {
        Integer num = orderNavBarWidgetViewHolder.previousOffset;
        if (num != null && num.intValue() == i11) {
            return;
        }
        int verticalOffset = orderNavBarWidgetViewHolder.previousOffset == null ? orderNavBarWidgetViewHolder.viewModel.getVerticalOffset() : i11;
        orderNavBarWidgetViewHolder.previousOffset = Integer.valueOf(i11);
        float height = orderNavBarWidgetViewHolder.getContentPlaceholderView().getHeight();
        float d11 = h.d((verticalOffset + height) / height, 0.0f, 1.0f);
        orderNavBarWidgetViewHolder.getContentPlaceholderView().setAlpha(d11);
        orderNavBarWidgetViewHolder.getBackgroundView().onChangeAlpha(d11);
        orderNavBarWidgetViewHolder.getFixedPlaceholderView().onChangeAlpha(d11);
        orderNavBarWidgetViewHolder.viewModel.sendAlphaUpdate(d11);
        ArgbEvaluator argbEvaluator = orderNavBarWidgetViewHolder.argbEvaluator;
        Context context = orderNavBarWidgetViewHolder.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Object evaluate = argbEvaluator.evaluate(d11, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.layerFloor1)), 0);
        Integer num2 = evaluate instanceof Integer ? (Integer) evaluate : null;
        if (num2 != null) {
            orderNavBarWidgetViewHolder.toolbar.setBackgroundColor(num2.intValue());
        }
        orderNavBarWidgetViewHolder.colorStatusBarColor(d11);
    }

    private final void restoreAppBar() {
        AppBarLayout appBarLayout = this.appBar;
        appBarLayout.setFocusable(false);
        appBarLayout.setClickable(false);
        appBarLayout.q(this.offsetChangedListener);
        appBarLayout.setOnApplyWindowInsetsListener(null);
        this.handler.removeCallbacksAndMessages(null);
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
        this.container.Z().setFitsSystemWindows(true);
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

    private final void restoreToolbarLayout() {
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbarLayout;
        collapsingToolbarLayout.removeView(getContentPlaceholderView());
        collapsingToolbarLayout.removeView(getBackgroundView());
        ViewExtKt.gone(collapsingToolbarLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateToolbarLayoutHeight() {
        int i11 = this.fixedPlaceholderHeight + this.contentPlaceholderHeight + this.statusBarHeight;
        if (i11 == this.collapsingToolbarLayout.getHeight()) {
            return;
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbarLayout;
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        collapsingToolbarLayout.setLayoutParams(layoutParams);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        detectComposerAutoScroll();
        configAppBar();
        configStatusBar();
        configToolbar();
        configToolbarLayout();
        getFixedPlaceholderView().setOnSizeChangeListener(this.onPlaceholdersSizeChanged);
        getContentPlaceholderView().setOnSizeChangeListener(this.onPlaceholdersSizeChanged);
        getFixedPlaceholderView().onWidgetCreated();
        getContentPlaceholderView().onWidgetCreated();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        restoreAppBar();
        restoreStatusBar();
        restoreToolbar();
        restoreToolbarLayout();
        RecyclerView.o layoutManager = this.composerRecycler.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            this.viewModel.setPreviousFirstVisiblePos(Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()));
        }
        getFixedPlaceholderView().onWidgetDestroyed();
        getContentPlaceholderView().onWidgetDestroyed();
        this.viewModel.setCollapsedAppBarHeight(this.fixedPlaceholderHeight);
        OrderNavBarViewModel orderNavBarViewModel = this.viewModel;
        Integer num = this.previousOffset;
        orderNavBarViewModel.setVerticalOffset(num != null ? num.intValue() : 0);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull OrderNavBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getFixedPlaceholderView().bind(item.getLeftButtons(), item.getRightButtons(), item.getButtonsColors(), getViewItem(), this.actionHandler);
        getContentPlaceholderView().bind(getViewItem());
        getBackgroundView().bind(item.getBackground());
    }
}
