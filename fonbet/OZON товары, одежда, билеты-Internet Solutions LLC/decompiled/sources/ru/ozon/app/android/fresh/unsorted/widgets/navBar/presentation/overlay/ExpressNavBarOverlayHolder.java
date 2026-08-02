package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay;

import I00.a;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetExpressNavBarBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarColorsHelper;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarNestedWidgetsManager;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarPlaceholderParser;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarVO;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.VisiblePlaceholders;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001WBM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010 \u001a\u00020\u0016*\u00060\bj\u0002`\u001a2\n\u0010\u001b\u001a\u00060\bj\u0002`\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010\u0018J\u0017\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u0018J'\u0010/\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R\u001c\u0010;\u001a\n :*\u0004\u0018\u000109098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u0004\u0018\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR0\u0010H\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020F0Ej\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020F`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR`\u0010N\u001aN\u0012\u0004\u0012\u00020\u001e\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060Kj\u0002`L0Jj\f\u0012\b\u0012\u00060Kj\u0002`L`M0Ej&\u0012\u0004\u0012\u00020\u001e\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060Kj\u0002`L0Jj\f\u0012\b\u0012\u00060Kj\u0002`L`M`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010IR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/overlay/ExpressNavBarOverlayHolder;", "Ld20/b;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;", "Ll10/i;", "screenUiContainer", "LWZ/l;", "tokenizedAnalytics", "LI00/a;", "Lru/ozon/composer/ui/widget/l;", "composerItemMapper", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarPlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColorsHelper;", "navBarColorsHelper", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarNestedWidgetsManager;", "nestedWidgetManager", "Landroid/view/ViewGroup;", "composerRootView", "<init>", "(Ll10/i;LWZ/l;LI00/a;Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarPlaceholderParser;Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColorsHelper;Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarNestedWidgetsManager;Landroid/view/ViewGroup;)V", "", "detachNestedViewHolders", "()V", "observeBusEvents", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "newComposerViewObject", "", "placeHoldersKey", "", "currentIndex", "updatePlaceHolders", "(Lru/ozon/composer/ui/widget/l;Lru/ozon/composer/ui/widget/l;Ljava/lang/String;I)V", "showOrGoneContainers", "addToToolbar", "removeToolbar", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;)V", "addView", "removeView", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "LWZ/l;", "LI00/a;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarPlaceholderParser;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColorsHelper;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarNestedWidgetsManager;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "dataItem", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;", "Landroidx/appcompat/widget/Toolbar;", "composerToolbar", "Landroidx/appcompat/widget/Toolbar;", "Lru/ozon/composer/ui/widget/a;", "widgetFactory", "Lru/ozon/composer/ui/widget/a;", "Ljava/util/HashMap;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/VisiblePlaceholders;", "Lkotlin/collections/HashMap;", "currentPlaceholders", "Ljava/util/HashMap;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "currentViewHolders", "", "toolbarPaddings", "[I", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressNavBarOverlayHolder extends AbstractC6065b<ExpressNavBarVO> {

    @NotNull
    private final WidgetExpressNavBarBinding binding;

    @NotNull
    private final a<l> composerItemMapper;

    @NotNull
    private final ViewGroup composerRootView;
    private final Toolbar composerToolbar;
    private final Context context;

    @NotNull
    private final HashMap<String, VisiblePlaceholders> currentPlaceholders;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;
    private ExpressNavBarVO dataItem;

    @NotNull
    private final View metricView;

    @NotNull
    private final ExpressNavBarColorsHelper navBarColorsHelper;

    @NotNull
    private final ExpressNavBarNestedWidgetsManager nestedWidgetManager;

    @NotNull
    private final ExpressNavBarPlaceholderParser placeholderParser;

    @NotNull
    private final i screenUiContainer;

    @NotNull
    private final WZ.l tokenizedAnalytics;
    private int[] toolbarPaddings;

    @NotNull
    private final ru.ozon.composer.ui.widget.a widgetFactory;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/overlay/ExpressNavBarOverlayHolder$Companion;", "", "<init>", "()V", "COMPOSER_TOOLBAR_TOP_PADDING", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ExpressNavBarOverlayHolder(@NotNull i screenUiContainer, @NotNull WZ.l tokenizedAnalytics, @NotNull a<l> composerItemMapper, @NotNull WidgetExpressNavBarBinding binding, @NotNull ExpressNavBarPlaceholderParser placeholderParser, @NotNull ExpressNavBarColorsHelper navBarColorsHelper, @NotNull ExpressNavBarNestedWidgetsManager nestedWidgetManager, @NotNull ViewGroup composerRootView) {
        Intrinsics.checkNotNullParameter(screenUiContainer, "screenUiContainer");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerItemMapper, "composerItemMapper");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(placeholderParser, "placeholderParser");
        Intrinsics.checkNotNullParameter(navBarColorsHelper, "navBarColorsHelper");
        Intrinsics.checkNotNullParameter(nestedWidgetManager, "nestedWidgetManager");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        this.screenUiContainer = screenUiContainer;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.composerItemMapper = composerItemMapper;
        this.binding = binding;
        this.placeholderParser = placeholderParser;
        this.navBarColorsHelper = navBarColorsHelper;
        this.nestedWidgetManager = nestedWidgetManager;
        this.composerRootView = composerRootView;
        this.context = binding.getConstraintLayout().getContext();
        this.composerToolbar = ComposerViewExtensionKt.composerToolbar(composerRootView);
        this.widgetFactory = screenUiContainer.d0();
        this.currentPlaceholders = new HashMap<>();
        this.currentViewHolders = new HashMap<>();
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.metricView = constraintLayout;
    }

    private final void addToToolbar() {
        CollapsingToolbarLayout composerCollapsingToolbar = ComposerViewExtensionKt.composerCollapsingToolbar(this.composerRootView);
        if (composerCollapsingToolbar != null) {
            ViewExtKt.show(composerCollapsingToolbar);
        }
        Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(this.composerRootView);
        if (composerToolbar != null) {
            this.toolbarPaddings = new int[]{composerToolbar.getPaddingLeft(), composerToolbar.getPaddingTop(), composerToolbar.getPaddingRight(), composerToolbar.getPaddingBottom()};
            composerToolbar.setPadding(0, ResourceExtKt.toPx(8), 0, 0);
            composerToolbar.removeAllViews();
            composerToolbar.addView(this.binding.getConstraintLayout());
            ViewExtKt.show(composerToolbar);
        }
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(this.composerRootView);
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.requestLayout();
        }
    }

    private final void detachNestedViewHolders() {
        this.nestedWidgetManager.detachNestedViewHolders$widgets_unsorted_prodGoogleAllVendorsRelease(this.currentViewHolders);
    }

    private final void observeBusEvents() {
        this.screenUiContainer.M().getEvents().observe(this.screenUiContainer.K().f(), new ExpressNavBarOverlayHolder$sam$androidx_lifecycle_Observer$0(new ExpressNavBarOverlayHolder$observeBusEvents$1(this)));
    }

    private final void removeToolbar() {
        Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(this.composerRootView);
        if (composerToolbar != null) {
            int[] iArr = this.toolbarPaddings;
            if (iArr != null) {
                composerToolbar.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            this.toolbarPaddings = null;
            composerToolbar.removeAllViews();
            ViewExtKt.gone(composerToolbar);
        }
        CollapsingToolbarLayout composerCollapsingToolbar = ComposerViewExtensionKt.composerCollapsingToolbar(this.composerRootView);
        if (composerCollapsingToolbar != null) {
            ViewExtKt.gone(composerCollapsingToolbar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void showOrGoneContainers() {
        Map<String, List<l>> g10;
        l viewItem = getViewItem();
        if (viewItem == null || (g10 = viewItem.g()) == null) {
            return;
        }
        if (!g10.containsKey("left")) {
            ExpressNavBarVO expressNavBarVO = this.dataItem;
            if (expressNavBarVO != null ? Intrinsics.d(expressNavBarVO.getHideSystemBackButton(), Boolean.TRUE) : false) {
                LinearLayout leftContainer = this.binding.leftContainer;
                Intrinsics.checkNotNullExpressionValue(leftContainer, "leftContainer");
                ViewExtKt.gone(leftContainer);
                if (g10.containsKey("right")) {
                    LinearLayout rightContainer = this.binding.rightContainer;
                    Intrinsics.checkNotNullExpressionValue(rightContainer, "rightContainer");
                    ViewExtKt.gone(rightContainer);
                    return;
                } else {
                    LinearLayout rightContainer2 = this.binding.rightContainer;
                    Intrinsics.checkNotNullExpressionValue(rightContainer2, "rightContainer");
                    ViewExtKt.show(rightContainer2);
                    return;
                }
            }
        }
        LinearLayout leftContainer2 = this.binding.leftContainer;
        Intrinsics.checkNotNullExpressionValue(leftContainer2, "leftContainer");
        ViewExtKt.show(leftContainer2);
        if (g10.containsKey("right")) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePlaceHolders(l lVar, l lVar2, String str, int i11) {
        VisiblePlaceholders visiblePlaceholders = this.currentPlaceholders.get(str);
        if (visiblePlaceholders != null) {
            HashMap<String, VisiblePlaceholders> hashMap = this.currentPlaceholders;
            ArrayList W02 = C7714v.W0(visiblePlaceholders.getPlaceholders());
            W02.set(i11, lVar2);
            Unit unit = Unit.f71690a;
            hashMap.put(str, VisiblePlaceholders.copy$default(visiblePlaceholders, null, W02, false, 5, null));
        }
        k<c> kVar = this.currentViewHolders.get(Integer.valueOf(lVar.j()));
        if (kVar != null) {
            kVar.bindItem(lVar.d(), lVar.c(), this.widgetFactory.g(lVar, lVar2));
        }
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        super.addView();
        addToToolbar();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        observeBusEvents();
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        super.removeView();
        removeToolbar();
        detachNestedViewHolders();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ExpressNavBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Toolbar toolbar = this.composerToolbar;
        if (toolbar != null) {
            Object tag = toolbar.getTag();
            if (!Intrinsics.d(tag instanceof Boolean ? (Boolean) tag : null, Boolean.TRUE)) {
                toolbar = null;
            }
            if (toolbar != null) {
                ExpressNavBarPlaceholderParser expressNavBarPlaceholderParser = this.placeholderParser;
                ExpressNavBarVO expressNavBarVO = this.dataItem;
                l viewItem = getViewItem();
                Intrinsics.g(viewItem, "null cannot be cast to non-null type ru.ozon.composer.ui.widget.WidgetViewItem");
                Pair<HashMap<String, VisiblePlaceholders>, HashMap<Integer, k<c>>> parsePlaceholders$widgets_unsorted_prodGoogleAllVendorsRelease = expressNavBarPlaceholderParser.parsePlaceholders$widgets_unsorted_prodGoogleAllVendorsRelease(expressNavBarVO, viewItem, this.currentViewHolders);
                this.currentViewHolders.clear();
                this.currentViewHolders.putAll(parsePlaceholders$widgets_unsorted_prodGoogleAllVendorsRelease.f());
                this.currentPlaceholders.clear();
                this.currentPlaceholders.putAll(parsePlaceholders$widgets_unsorted_prodGoogleAllVendorsRelease.e());
                this.dataItem = item;
                this.nestedWidgetManager.removeNestedWidgets$widgets_unsorted_prodGoogleAllVendorsRelease();
                this.nestedWidgetManager.addNestedWidgets$widgets_unsorted_prodGoogleAllVendorsRelease(this.currentPlaceholders, this.currentViewHolders);
                ExpressNavBarColorsHelper expressNavBarColorsHelper = this.navBarColorsHelper;
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                expressNavBarColorsHelper.applyColors$widgets_unsorted_prodGoogleAllVendorsRelease(context, item);
                showOrGoneContainers();
            }
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ExpressNavBarVO item, @NotNull W10.c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
