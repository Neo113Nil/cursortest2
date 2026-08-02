package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.LandingNavBarWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.AppBarController;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.StatusBarController;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.ToolbarController;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.ToolbarLayoutController;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.view.BackgroundView;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.view.ContentPlaceholderViewGroup;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.view.FixedPlaceholderViewGroup;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR*\u0010\u001d\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\r0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI;", "Ll10/i;", "container", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "<init>", "(Ll10/i;Lcom/google/android/material/appbar/AppBarLayout;Landroidx/appcompat/widget/Toolbar;Lcom/google/android/material/appbar/CollapsingToolbarLayout;)V", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI;)V", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "", "fixedPlaceholderHeight", "I", "contentPlaceholderHeight", "Lkotlin/Function2;", "onPlaceholdersSizeChanged", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/StatusBarController;", "statusBarController", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/StatusBarController;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/AppBarController;", "appBarController", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/AppBarController;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/ToolbarLayoutController;", "toolbarLayoutController", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/ToolbarLayoutController;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/ToolbarController;", "toolbarController", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/ToolbarController;", "Lcom/google/android/material/appbar/AppBarLayout$f;", "offsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/BackgroundView;", "backgroundView", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/BackgroundView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/FixedPlaceholderViewGroup;", "fixedPlaceholderView", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/FixedPlaceholderViewGroup;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/ContentPlaceholderViewGroup;", "contentPlaceholderView", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/ContentPlaceholderViewGroup;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LandingNavBarWidgetViewHolder extends AbstractC6065b<LandingNavBarVI> {

    @NotNull
    private final AppBarController appBarController;

    @NotNull
    private final BackgroundView backgroundView;
    private int contentPlaceholderHeight;

    @NotNull
    private final ContentPlaceholderViewGroup contentPlaceholderView;
    private final Context context;
    private int fixedPlaceholderHeight;

    @NotNull
    private final FixedPlaceholderViewGroup fixedPlaceholderView;

    @NotNull
    private final View metricView;

    @NotNull
    private final AppBarLayout.f offsetChangedListener;

    @NotNull
    private final Function2<Integer, Integer, Unit> onPlaceholdersSizeChanged;

    @NotNull
    private final StatusBarController statusBarController;

    @NotNull
    private final ToolbarController toolbarController;

    @NotNull
    private final ToolbarLayoutController toolbarLayoutController;
    public static final int $stable = 8;

    public LandingNavBarWidgetViewHolder(@NotNull i container, @NotNull AppBarLayout appBar, @NotNull Toolbar toolbar, @NotNull CollapsingToolbarLayout collapsingToolbarLayout) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Context context = container.L();
        this.context = context;
        LandingNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1 landingNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1 = new LandingNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1(this);
        this.onPlaceholdersSizeChanged = landingNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1;
        this.statusBarController = new StatusBarController(container);
        this.appBarController = new AppBarController(appBar, new LandingNavBarWidgetViewHolder$appBarController$1(this));
        this.toolbarLayoutController = new ToolbarLayoutController(collapsingToolbarLayout);
        this.toolbarController = new ToolbarController(toolbar);
        this.offsetChangedListener = new AppBarLayout.f() { // from class: NO.a
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                LandingNavBarWidgetViewHolder.offsetChangedListener$lambda$0(LandingNavBarWidgetViewHolder.this, appBarLayout, i11);
            }
        };
        Intrinsics.checkNotNullExpressionValue(context, "context");
        BackgroundView backgroundView = new BackgroundView(context);
        CollapsingToolbarLayout.a aVar = new CollapsingToolbarLayout.a(-1);
        aVar.a(2);
        aVar.b(0.0f);
        backgroundView.setLayoutParams(aVar);
        this.backgroundView = backgroundView;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        FixedPlaceholderViewGroup fixedPlaceholderViewGroup = new FixedPlaceholderViewGroup(context);
        fixedPlaceholderViewGroup.setLayoutParams(new Toolbar.g(-1, -2));
        Context context2 = fixedPlaceholderViewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        fixedPlaceholderViewGroup.setMinimumHeight(ResourceExtKt.toPx(56, context2));
        fixedPlaceholderViewGroup.setupNestedWidgetManager(container);
        fixedPlaceholderViewGroup.setOnSizeChangeListener(landingNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1);
        this.fixedPlaceholderView = fixedPlaceholderViewGroup;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ContentPlaceholderViewGroup contentPlaceholderViewGroup = new ContentPlaceholderViewGroup(context);
        CollapsingToolbarLayout.a aVar2 = new CollapsingToolbarLayout.a(-2);
        aVar2.a(2);
        aVar2.b(0.0f);
        ((FrameLayout.LayoutParams) aVar2).gravity = 80;
        contentPlaceholderViewGroup.setLayoutParams(aVar2);
        contentPlaceholderViewGroup.setupNestedWidgetManager(container);
        contentPlaceholderViewGroup.setOnSizeChangeListener(landingNavBarWidgetViewHolder$onPlaceholdersSizeChanged$1);
        this.contentPlaceholderView = contentPlaceholderViewGroup;
        this.metricView = toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offsetChangedListener$lambda$0(LandingNavBarWidgetViewHolder landingNavBarWidgetViewHolder, AppBarLayout appBarLayout, int i11) {
        float height = landingNavBarWidgetViewHolder.contentPlaceholderView.getHeight();
        float d11 = h.d((i11 + height) / height, 0.0f, 1.0f);
        landingNavBarWidgetViewHolder.contentPlaceholderView.updateAlpha(d11);
        landingNavBarWidgetViewHolder.backgroundView.updateImageAlpha(d11);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.statusBarController.configStatusBar();
        this.appBarController.configAppBar(this.offsetChangedListener);
        this.toolbarLayoutController.configToolbarLayout(this.backgroundView, this.contentPlaceholderView);
        this.toolbarController.configToolbar(this.fixedPlaceholderView);
        this.fixedPlaceholderView.onWidgetCreated();
        this.contentPlaceholderView.onWidgetCreated();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.fixedPlaceholderView.onWidgetDestroyed();
        this.contentPlaceholderView.onWidgetDestroyed();
        this.statusBarController.restoreStatusBar();
        this.appBarController.restoreAppBar(this.offsetChangedListener);
        this.toolbarLayoutController.restoreToolbarLayout(this.backgroundView, this.contentPlaceholderView);
        this.toolbarController.restoreToolbar();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull LandingNavBarVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.backgroundView.bind(item.getBackground());
        this.fixedPlaceholderView.bind(item.getTopHeaderSettings(), getViewItem());
        this.contentPlaceholderView.bind(item.getBottomIslandSettings(), getViewItem());
        if (item.getBottomIslandSettings() != null || item.getBottomRadius() == null) {
            return;
        }
        this.toolbarLayoutController.bindBottomRadius(item.getBottomRadius().floatValue());
    }
}
