package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import T00.m;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel;", "viewModel", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "", "observeLiveData", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderVO;)V", "onWidgetCreated", "Ll10/i;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "", "dp16", "I", "Landroidx/recyclerview/widget/LinearLayoutManager;", "composerLlm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "getWidgetName", "()Ljava/lang/String;", "widgetName", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSkeletonLoaderWidgetViewHolder extends AbstractC6065b<AviaSkeletonLoaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final LinearLayoutManager composerLlm;

    @NotNull
    private final i container;
    private final int dp16;
    private final View metricView;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final AviaSkeletonLoaderWidgetViewModel viewModel;

    public AviaSkeletonLoaderWidgetViewHolder(@NotNull i container, @NotNull AviaSkeletonLoaderWidgetViewModel viewModel, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        this.container = container;
        this.viewModel = viewModel;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        Context context = container.Y().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.dp16 = UiExtKt.toPx(16, context);
        RecyclerView.o layoutManager = ComposerViewExtensionKt.composerRecyclerView(container.Y()).getLayoutManager();
        this.composerLlm = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getWidgetName() {
        b i11;
        d b11;
        m c11;
        l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    private final void observeLiveData() {
        C2399j.C(new C(new C2408n0(this.viewModel.getActionFlow(), new AviaSkeletonLoaderWidgetViewHolder$observeLiveData$1(this, null)), new AviaSkeletonLoaderWidgetViewHolder$observeLiveData$2(null)), K.a(this));
        C2399j.C(new C(new C2408n0(this.viewModel.getMetricsFlow(), new AviaSkeletonLoaderWidgetViewHolder$observeLiveData$3(this, null)), new AviaSkeletonLoaderWidgetViewHolder$observeLiveData$4(null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        observeLiveData();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AviaSkeletonLoaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.performAction(item.getAction(), getTrackingData());
    }
}
