package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import T00.m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import jk0.q;
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
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.view.TravelRailwaySearchResultsV4LoaderView;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001$\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/view/TravelRailwaySearchResultsV4LoaderView;", "containerView", "Ll10/i;", "composerScreenUiContainer", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressViewModel;", "viewModel", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/view/TravelRailwaySearchResultsV4LoaderView;Ll10/i;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressViewModel;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "", "observeAction", "()V", "onAttach", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/view/TravelRailwaySearchResultsV4LoaderView;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressViewModel;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observer$1", "observer", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observer$1;", "", "getWidgetName", "()Ljava/lang/String;", "widgetName", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4ProgressWidgetViewHolder extends k<TravelRailwaySearchResultsV4ProgressVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i composerScreenUiContainer;

    @NotNull
    private final TravelRailwaySearchResultsV4LoaderView containerView;

    @NotNull
    private final TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observer$1 observer;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final TravelRailwaySearchResultsV4ProgressViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observer$1] */
    public TravelRailwaySearchResultsV4ProgressWidgetViewHolder(@NotNull TravelRailwaySearchResultsV4LoaderView containerView, @NotNull i composerScreenUiContainer, @NotNull TravelRailwaySearchResultsV4ProgressViewModel viewModel, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerScreenUiContainer, "composerScreenUiContainer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        this.containerView = containerView;
        this.composerScreenUiContainer = composerScreenUiContainer;
        this.viewModel = viewModel;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.actionHandler = new ActionHandler.Builder(composerScreenUiContainer, this).onComposerAction(new TravelRailwaySearchResultsV4ProgressWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.observer = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                TravelRailwaySearchResultsV4LoaderView travelRailwaySearchResultsV4LoaderView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                travelRailwaySearchResultsV4LoaderView = TravelRailwaySearchResultsV4ProgressWidgetViewHolder.this.containerView;
                travelRailwaySearchResultsV4LoaderView.resumeAnimation(K.a(owner));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                TravelRailwaySearchResultsV4LoaderView travelRailwaySearchResultsV4LoaderView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                travelRailwaySearchResultsV4LoaderView = TravelRailwaySearchResultsV4ProgressWidgetViewHolder.this.containerView;
                travelRailwaySearchResultsV4LoaderView.pauseAnimation();
            }
        };
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

    private final void observeAction() {
        C2399j.C(new C(new C2408n0(this.viewModel.getActionFlow(), new TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1(this, null)), new TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$2(null)), K.a(this));
        C2399j.C(new C(new C2408n0(this.viewModel.getMetricsFlow(), new TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$3(this, null)), new TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$4(null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
        getLifecycle().a(this.observer);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        getLifecycle().e(this.observer);
        super.onDetach();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        ViewsExtensionsKt.updateHeightRegardingOverlapContainers$default(this.containerView, info, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelRailwaySearchResultsV4ProgressVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.actionHandler.invoke(item.getLoadAction());
        this.containerView.startAnimation(K.a(this));
    }
}
