package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi;

import Ae.M0;
import Lm0.a;
import Qj0.A0;
import T00.m;
import Tc.b;
import Vg.d;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.storage.analytics.LayoutTimeMetrics;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardUpdate;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.HotelsSearchResultsV5LoadingWidgetViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.HotelsSearchResultsV5SkeletonUpdate;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncConfig;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncMultipleRequestsWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import xe.C10727i;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B;\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00040\u0016H\u0002¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010\u00162\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010,J\u000f\u00101\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u0010,J%\u00104\u001a\u00020\u001a2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0004022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\u001a2\u0006\u00107\u001a\u0002062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u001c\u0010@\u001a\u0004\u0018\u00010?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u001a0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010I\u001a\u0012\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u001a0Dj\u0002`H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncMultipleRequestsWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;", "cardViewModel", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5LoadingWidgetViewModel;", "loadingWidgetViewModel", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "widgetLayoutTimeMetricsStorage", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5LoadingWidgetViewModel;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;LVg/d;)V", "", "asyncData", "", "asyncParams", "", "updateIteration", "", "handleFetchOrSkeletonState", "(Ljava/lang/String;Ljava/util/Map;I)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$RefreshState;", "state", "handleRefreshState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$RefreshState;)V", "states", "", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;", "buildAsyncConfigs", "(Ljava/util/Map;)Ljava/util/List;", "traceId", "Lru/ozon/tracker/performance/MetricType;", "", "getAdditionalMetrics", "(Ljava/lang/String;)Ljava/util/Map;", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO;)V", "onRefresh", "onWidgetDestroyed", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;Ljava/lang/String;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5LoadingWidgetViewModel;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "", "isRefreshStateHandled", "Z", "getTraceWidgetName", "()Ljava/lang/String;", "traceWidgetName", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5LoadingNoUiWidgetViewHolder extends AbstractC6065b<HotelsSearchResultsV5LoadingNoUiVO> implements AsyncMultipleRequestsWidgetCallbacks<HotelsSearchResultsV5LoadingNoUiVO.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HotelsSearchResultsV5CardViewModel cardViewModel;

    @NotNull
    private final i container;
    private boolean isRefreshStateHandled;

    @NotNull
    private final HotelsSearchResultsV5LoadingWidgetViewModel loadingWidgetViewModel;
    private final View metricView;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final WidgetLayoutTimeMetricsStorage widgetLayoutTimeMetricsStorage;

    public HotelsSearchResultsV5LoadingNoUiWidgetViewHolder(@NotNull i container, @NotNull HotelsSearchResultsV5CardViewModel cardViewModel, @NotNull HotelsSearchResultsV5LoadingWidgetViewModel loadingWidgetViewModel, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull WidgetLayoutTimeMetricsStorage widgetLayoutTimeMetricsStorage, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(cardViewModel, "cardViewModel");
        Intrinsics.checkNotNullParameter(loadingWidgetViewModel, "loadingWidgetViewModel");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(widgetLayoutTimeMetricsStorage, "widgetLayoutTimeMetricsStorage");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.container = container;
        this.cardViewModel = cardViewModel;
        this.loadingWidgetViewModel = loadingWidgetViewModel;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.widgetLayoutTimeMetricsStorage = widgetLayoutTimeMetricsStorage;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.processedActionHandler = new HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$processedActionHandler$1(this);
    }

    private final List<AsyncConfig> buildAsyncConfigs(Map<String, ? extends HotelsSearchResultsV5LoadingNoUiVO.State> states) {
        b builder = C7714v.B();
        for (Map.Entry<String, ? extends HotelsSearchResultsV5LoadingNoUiVO.State> entry : states.entrySet()) {
            String key = entry.getKey();
            HotelsSearchResultsV5LoadingNoUiVO.State value = entry.getValue();
            if (key != null && !(value instanceof HotelsSearchResultsV5LoadingNoUiVO.State.NoActionState) && !(value instanceof HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState)) {
                builder.add(new AsyncConfig(key, value.getAsyncParams()));
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final Map<MetricType, Long> getAdditionalMetrics(String traceId) {
        LayoutTimeMetrics andRemoveLayoutTimeMetrics = this.widgetLayoutTimeMetricsStorage.getAndRemoveLayoutTimeMetrics(traceId);
        if (andRemoveLayoutTimeMetrics == null) {
            return null;
        }
        long layoutTimeStart = andRemoveLayoutTimeMetrics.getLayoutTimeStart();
        long layoutTimeEnd = andRemoveLayoutTimeMetrics.getLayoutTimeEnd();
        if (layoutTimeEnd != 0) {
            return U.j(new Pair(MetricType.LAYOUT_TIME_START, Long.valueOf(layoutTimeStart)), new Pair(MetricType.LAYOUT_TIME_END, Long.valueOf(layoutTimeEnd)));
        }
        return null;
    }

    private final String getTraceWidgetName() {
        l20.b i11;
        l20.d b11;
        m c11;
        l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    private final void handleFetchOrSkeletonState(String asyncData, Map<String, String> asyncParams, int updateIteration) {
        String i11;
        Map<MetricType, Long> map = null;
        if (updateIteration == 1 && (i11 = this.cardViewModel.getTraceIds().i()) != null) {
            map = getAdditionalMetrics(i11);
        }
        if (asyncData != null) {
            this.loadingWidgetViewModel.fetchWidgetWithParams(asyncData, asyncParams, map);
        }
    }

    private final void handleRefreshState(HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState state) {
        M0<Boolean> freezeLayoutStateFlow = this.cardViewModel.getFreezeLayoutStateFlow();
        if (freezeLayoutStateFlow.getValue().booleanValue()) {
            C10727i.c(K.a(this), null, null, new HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2(freezeLayoutStateFlow, state, this, null), 3);
            return;
        }
        AtomAction refreshAction = state.getRefreshAction();
        if (refreshAction != null) {
            this.processedActionHandler.invoke(refreshAction);
        }
        this.loadingWidgetViewModel.cancelJobs();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncMultipleRequestsWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<HotelsSearchResultsV5LoadingNoUiVO.State> fetchedModel, @NotNull String asyncData) {
        Pair pair;
        List<HotelsSearchResultsV5CardVO> updateHotels;
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        Qj0.U trace = fetchedModel.getMetrics().getTrace();
        if (trace != null) {
            Qj0.U.p(trace, MetricType.TOTAL_TIME_END, 0L, false, 6);
            String traceWidgetName = getTraceWidgetName();
            if (traceWidgetName != null) {
                trace.n(new A0(traceWidgetName), true);
            }
            this.performanceTrackerDelegate.beginTrace(trace);
            this.performanceTrackerDelegate.endTrace(fetchedModel.getMetrics().getUuid(), U.c());
        }
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.container.X().e(trackingPayloads);
        }
        HotelsSearchResultsV5LoadingNoUiVO.State fetchedState = fetchedModel.getFetchedState();
        boolean z11 = fetchedState instanceof HotelsSearchResultsV5LoadingNoUiVO.State.FetchState;
        if (z11 || (fetchedState instanceof HotelsSearchResultsV5LoadingNoUiVO.State.NoActionState)) {
            if (z11) {
                HotelsSearchResultsV5LoadingNoUiVO.State.FetchState fetchState = (HotelsSearchResultsV5LoadingNoUiVO.State.FetchState) fetchedState;
                pair = new Pair(fetchState.getHotels(), fetchState.getOnboarding());
            } else if (fetchedState instanceof HotelsSearchResultsV5LoadingNoUiVO.State.NoActionState) {
                HotelsSearchResultsV5LoadingNoUiVO.State.NoActionState noActionState = (HotelsSearchResultsV5LoadingNoUiVO.State.NoActionState) fetchedState;
                pair = new Pair(noActionState.getHotels(), noActionState.getOnboarding());
            } else {
                pair = new Pair(null, null);
            }
            List<HotelsSearchResultsV5CardVO> list = (List) pair.a();
            this.cardViewModel.setUpOnboarding((OnBoardingDTO) pair.b());
            if (list != null && (updateHotels = this.loadingWidgetViewModel.updateHotels(list)) != null) {
                this.container.M().update(new HotelsSearchResultsV5CardUpdate(updateHotels));
            }
        }
        this.container.M().update(new HotelsSearchResultsV5LoadingNoUiUpdate(asyncData, fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncMultipleRequestsWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable, String asyncData) {
        AtomAction refreshAction;
        NotificationAtom.NotificationWithIcon errorNotification;
        Map<String, HotelsSearchResultsV5LoadingNoUiVO.State> states;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        if (asyncData == null) {
            return;
        }
        HotelsSearchResultsV5LoadingNoUiVO boundData = getBoundData();
        HotelsSearchResultsV5LoadingNoUiVO.State state = (boundData == null || (states = boundData.getStates()) == null) ? null : states.get(asyncData);
        if (!(state instanceof HotelsSearchResultsV5LoadingNoUiVO.State.FetchState)) {
            if (state instanceof HotelsSearchResultsV5LoadingNoUiVO.State.SkeletonState) {
                this.container.M().update(new HotelsSearchResultsV5SkeletonUpdate(true));
                return;
            } else {
                if (!(state instanceof HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState) || (refreshAction = ((HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState) state).getRefreshAction()) == null) {
                    return;
                }
                this.processedActionHandler.invoke(refreshAction);
                return;
            }
        }
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (errorNotification = ((HotelsSearchResultsV5LoadingNoUiVO.State.FetchState) state).getErrorNotification()) == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(errorNotification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, errorNotification, this, this.actionHandler).show();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncMultipleRequestsWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncMultipleRequestsWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        this.loadingWidgetViewModel.cancelJobs();
        this.isRefreshStateHandled = false;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.loadingWidgetViewModel.observeEvents(this, this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.loadingWidgetViewModel.onCleared();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsSearchResultsV5LoadingNoUiVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        for (HotelsSearchResultsV5LoadingNoUiVO.State state : item.getStates().values()) {
            if (state instanceof HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState) {
                if (this.isRefreshStateHandled) {
                    return;
                }
                handleRefreshState((HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState) state);
                this.isRefreshStateHandled = true;
                return;
            }
        }
        if (item.getStates().size() > 1) {
            for (AsyncConfig asyncConfig : this.loadingWidgetViewModel.getUnfetchedData(buildAsyncConfigs(item.getStates()))) {
                handleFetchOrSkeletonState(asyncConfig.getAsyncData(), asyncConfig.getAsyncParams(), item.getUpdateIteration());
            }
            return;
        }
        if (item.getStates().size() != 1 || this.loadingWidgetViewModel.jobIsActive((String) C7714v.J(item.getStates().keySet()))) {
            return;
        }
        String str = (String) C7714v.J(item.getStates().keySet());
        HotelsSearchResultsV5LoadingNoUiVO.State state2 = (HotelsSearchResultsV5LoadingNoUiVO.State) C7714v.J(item.getStates().values());
        if (state2 instanceof HotelsSearchResultsV5LoadingNoUiVO.State.FetchState) {
            HotelsSearchResultsV5LoadingNoUiVO.State.FetchState fetchState = (HotelsSearchResultsV5LoadingNoUiVO.State.FetchState) state2;
            this.loadingWidgetViewModel.updateHotels(fetchState.getHotels());
            handleFetchOrSkeletonState(str, fetchState.getAsyncParams(), item.getUpdateIteration());
        } else if (state2 instanceof HotelsSearchResultsV5LoadingNoUiVO.State.NoActionState) {
            this.loadingWidgetViewModel.updateHotels(((HotelsSearchResultsV5LoadingNoUiVO.State.NoActionState) state2).getHotels());
        } else if (state2 instanceof HotelsSearchResultsV5LoadingNoUiVO.State.SkeletonState) {
            handleFetchOrSkeletonState(str, ((HotelsSearchResultsV5LoadingNoUiVO.State.SkeletonState) state2).getAsyncParams(), item.getUpdateIteration());
        }
    }
}
