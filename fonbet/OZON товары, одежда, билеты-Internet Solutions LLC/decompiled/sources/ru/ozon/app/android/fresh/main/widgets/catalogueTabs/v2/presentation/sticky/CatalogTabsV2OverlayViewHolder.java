package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsScrollState;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModel;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.CatalogTabsScrollEventListener;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollUtilsKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.item.CatalogTabsMaxItemDecorator;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.item.CatalogTabsMaxItemsAdapter;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2OverlayViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001nB3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J'\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J#\u0010-\u001a\u00020\u0011*\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J3\u00103\u001a\u00020\u0011*\u00020\u00062\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u00020\u0011*\u000205H\u0002¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\u0011H\u0002¢\u0006\u0004\b9\u0010\u0013J\u000f\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b:\u0010\u0013J\u000f\u0010;\u001a\u00020 H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00110E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010c\u001a\u0004\u0018\u00010b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0016\u0010j\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0016\u0010m\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006o"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2OverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/CatalogTabsScrollEventListener;", "Landroid/view/ViewGroup;", "rootView", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "catalogTabsViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;Ll10/i;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;LWZ/l;)V", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "addView", "removeView", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;)V", "", "newPosition", "offset", "Lkotlin/Function0;", "animationStopCallback", "smoothScrollToPositionWithOffset", "(IILkotlin/jvm/functions/Function0;)V", "immediateScrollToPositionWithOffset", "(II)V", "", "color", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;", "stickyCorners", "setupBackground", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;)V", "horizontalMargin", "betweenMargin", "topMargin", "bottomMargin", "setupRecycler", "(Landroidx/recyclerview/widget/RecyclerView;IIII)V", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "onCatalogueTabsItemClicked", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;)V", "softScrollToSelectedWidget", "restoreScrollState", "positionStickyView", "getContentHeight", "()I", "Landroid/view/ViewGroup;", "Landroidx/recyclerview/widget/RecyclerView;", "Ll10/i;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogueTabsViewModel;", "LWZ/l;", "Lcom/google/android/material/appbar/AppBarLayout$f;", "appBarOffsetListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemDecorator;", "decorator$delegate", "LSc/j;", "getDecorator", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemDecorator;", "decorator", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable$delegate", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemsAdapter;", "tagsAdapter", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemsAdapter;", "Lxe/B0;", "stickyVisibilityJob", "Lxe/B0;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2StickyAnimator;", "stickyAnimator$delegate", "getStickyAnimator", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2StickyAnimator;", "stickyAnimator", "", "wasViewAdded", "Z", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "getComposerRv", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2OverlayViewHolder extends AbstractC6065b<CatalogTabsV2VO> implements CatalogTabsScrollEventListener {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DEFAULT_BACKGROUND_COLOR = UniColors.LAYER_FLOOR_1.getResId();

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AppBarLayout.f appBarOffsetListener;

    /* renamed from: backgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawable;

    @NotNull
    private final CatalogueTabsViewModel catalogTabsViewModel;

    @NotNull
    private final i container;

    @NotNull
    private final RecyclerView containerView;

    /* renamed from: decorator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j decorator;
    private final View metricView;

    @NotNull
    private final ViewGroup rootView;

    /* renamed from: stickyAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j stickyAnimator;
    private B0 stickyVisibilityJob;

    @NotNull
    private final CatalogTabsMaxItemsAdapter tagsAdapter;

    @NotNull
    private final l tokenizedAnalytics;
    private boolean wasViewAdded;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2OverlayViewHolder$Companion;", "", "<init>", "()V", "DEFAULT_ITEM_BOTTOM_MARGIN", "", "DEFAULT_BACKGROUND_COLOR", "getDEFAULT_BACKGROUND_COLOR", "()I", "STICKY_OVERLAY_FALLBACK_Y", "", "STICKY_OVERLAY_TRANSLATION_Z_DP", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_BACKGROUND_COLOR() {
            return CatalogTabsV2OverlayViewHolder.DEFAULT_BACKGROUND_COLOR;
        }

        private Companion() {
        }
    }

    public CatalogTabsV2OverlayViewHolder(@NotNull ViewGroup rootView, @NotNull RecyclerView containerView, @NotNull i container, @NotNull CatalogueTabsViewModel catalogTabsViewModel, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(catalogTabsViewModel, "catalogTabsViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.rootView = rootView;
        this.containerView = containerView;
        this.container = container;
        this.catalogTabsViewModel = catalogTabsViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.appBarOffsetListener = new AppBarLayout.f() { // from class: bw.a
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                CatalogTabsV2OverlayViewHolder.appBarOffsetListener$lambda$0(CatalogTabsV2OverlayViewHolder.this, appBarLayout, i11);
            }
        };
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.actionHandler = buildHandler;
        this.decorator = LazyUtilsKt.unsafeLazy(CatalogTabsV2OverlayViewHolder$decorator$2.INSTANCE);
        this.backgroundDrawable = LazyUtilsKt.unsafeLazy(CatalogTabsV2OverlayViewHolder$backgroundDrawable$2.INSTANCE);
        CatalogTabsMaxItemsAdapter catalogTabsMaxItemsAdapter = new CatalogTabsMaxItemsAdapter(new CatalogTabsV2OverlayViewHolder$tagsAdapter$1(tokenizedAnalytics), new CatalogTabsV2OverlayViewHolder$tagsAdapter$2(this), buildHandler);
        containerView.setAdapter(catalogTabsMaxItemsAdapter);
        this.tagsAdapter = catalogTabsMaxItemsAdapter;
        this.stickyAnimator = LazyUtilsKt.unsafeLazy(new CatalogTabsV2OverlayViewHolder$stickyAnimator$2(this));
        this.metricView = containerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appBarOffsetListener$lambda$0(CatalogTabsV2OverlayViewHolder catalogTabsV2OverlayViewHolder, AppBarLayout appBarLayout, int i11) {
        catalogTabsV2OverlayViewHolder.containerView.setY(appBarLayout.getBottom());
    }

    private final AppBarLayout getAppBar() {
        View view = this.container.Q().j().getView();
        if (view != null) {
            return ComposerViewExtensionKt.composerAppbar(view);
        }
        return null;
    }

    private final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.backgroundDrawable.getValue();
    }

    private final RecyclerView getComposerRv() {
        View view = this.container.Q().j().getView();
        if (view != null) {
            return ComposerViewExtensionKt.composerRecyclerView(view);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentHeight() {
        ViewGroup.LayoutParams layoutParams = this.containerView.getLayoutParams();
        RecyclerView recyclerView = this.containerView;
        ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = -2;
        recyclerView.setLayoutParams(layoutParams2);
        RecyclerView recyclerView2 = this.containerView;
        Object parent = recyclerView2.getParent();
        View view = parent instanceof View ? (View) parent : null;
        recyclerView2.measure(View.MeasureSpec.makeMeasureSpec(view != null ? view.getWidth() : 0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.containerView.getMeasuredHeight();
        RecyclerView recyclerView3 = this.containerView;
        ViewGroup.LayoutParams layoutParams3 = recyclerView3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = layoutParams != null ? layoutParams.height : -2;
        recyclerView3.setLayoutParams(layoutParams3);
        return measuredHeight;
    }

    private final CatalogTabsMaxItemDecorator getDecorator() {
        return (CatalogTabsMaxItemDecorator) this.decorator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CatalogTabsV2StickyAnimator getStickyAnimator() {
        return (CatalogTabsV2StickyAnimator) this.stickyAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCatalogueTabsItemClicked(CatalogTabsV2VO.Tab item) {
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.container.X(), trackingInfo, null, 2, null);
        }
        this.catalogTabsViewModel.onUserClickedTab();
        softScrollToSelectedWidget(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void positionStickyView() {
        this.containerView.setY(getAppBar() != null ? r1.getBottom() : 0.0f);
        this.containerView.setTranslationZ(ResourceExtKt.toPxF(8));
    }

    private final void restoreScrollState() {
        CatalogTabsScrollState value = this.catalogTabsViewModel.getScrollState().getValue();
        RecyclerView.o layoutManager = this.containerView.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(value.getFinalTab(), value.getOffsetX());
    }

    private final void setupBackground(RecyclerView recyclerView, String str, CatalogTabsV2VO.StickyRoundedCorners stickyRoundedCorners) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, str, DEFAULT_BACKGROUND_COLOR);
        GradientDrawable backgroundDrawable = getBackgroundDrawable();
        float[] fArr = new float[8];
        int i11 = 0;
        while (i11 < 8) {
            fArr[i11] = ResourceExtKt.toPxF(i11 < 4 ? stickyRoundedCorners.getTop() : stickyRoundedCorners.getBottom());
            i11++;
        }
        backgroundDrawable.setCornerRadii(fArr);
        backgroundDrawable.setColors(new int[]{parseColor, parseColor});
        recyclerView.setBackground(backgroundDrawable);
    }

    private final void setupRecycler(RecyclerView recyclerView, int i11, int i12, int i13, int i14) {
        getDecorator().setBetweenPadding(i12);
        if (recyclerView.getItemDecorationCount() < 1) {
            recyclerView.addItemDecoration(getDecorator());
        }
        recyclerView.setPadding(i11, i13, i11, i14);
        recyclerView.invalidateItemDecorations();
    }

    private final void softScrollToSelectedWidget(CatalogTabsV2VO.Tab tab) {
        if (getBoundData() != null) {
            AppBarLayout appBar = getAppBar();
            this.catalogTabsViewModel.scrollToWidget(tab.getWidgetScrollKey(), this.containerView.getHeight() + (appBar != null ? appBar.getHeight() : 0), this.container);
        }
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        J viewLifecycleOwner;
        this.rootView.addView(this.containerView);
        AppBarLayout appBar = getAppBar();
        if (appBar != null) {
            appBar.d(this.appBarOffsetListener);
        }
        this.catalogTabsViewModel.registerTabsScrollListener(true, new WeakReference<>(this));
        B0 b02 = this.stickyVisibilityJob;
        B0 b03 = null;
        if (b02 != null) {
            b02.j(null);
        }
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        if (c11 != null && (viewLifecycleOwner = c11.getViewLifecycleOwner()) != null) {
            b03 = C10727i.c(K.a(this), null, null, new CatalogTabsV2OverlayViewHolder$addView$1$1(this, viewLifecycleOwner, null), 3);
        }
        this.stickyVisibilityJob = b03;
        if (this.wasViewAdded) {
            return;
        }
        restoreScrollState();
        this.wasViewAdded = true;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.CatalogTabsScrollEventListener
    public void immediateScrollToPositionWithOffset(int newPosition, int offset) {
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        RecyclerView composerRv = getComposerRv();
        if (composerRv != null) {
            this.catalogTabsViewModel.attachRecyclerListener(composerRv);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        B0 b02 = this.stickyVisibilityJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.stickyVisibilityJob = null;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        B0 b02 = this.stickyVisibilityJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.stickyVisibilityJob = null;
        getStickyAnimator().cancel();
        this.rootView.removeView(this.containerView);
        AppBarLayout appBar = getAppBar();
        if (appBar != null) {
            appBar.q(this.appBarOffsetListener);
        }
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.CatalogTabsScrollEventListener
    public void smoothScrollToPositionWithOffset(int newPosition, int offset, @NotNull Function0<Unit> animationStopCallback) {
        Intrinsics.checkNotNullParameter(animationStopCallback, "animationStopCallback");
        ScrollUtilsKt.smoothScrollToTabWithPosition(this.containerView, newPosition, offset, animationStopCallback);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CatalogTabsV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.catalogTabsViewModel.initTabs(item.getTabs());
        setupRecycler(this.containerView, ResourceExtKt.toPx(item.getPaddings().getHorizontal()), ResourceExtKt.toPx(item.getPaddings().getBetween()), ResourceExtKt.toPx(item.getPaddings().getTop()), ResourceExtKt.toPx(item.getPaddings().getBottom()));
        setupBackground(this.containerView, item.getBackgroundColor(), item.getStickyRoundedCorners());
        int px = ResourceExtKt.toPx(item.getPaddings().getHorizontal()) - (ResourceExtKt.toPx(item.getPaddings().getBetween()) / 2);
        this.tagsAdapter.submitList(item.getTabs());
        this.catalogTabsViewModel.updateScrollingState(item.getSelectedTabIndex(), this.containerView.computeHorizontalScrollOffset(), true, true, px);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull CatalogTabsV2VO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}
