package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation;

import BN.a;
import T00.m;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.l;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.adapter.UnpaidOrderListAdapter;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.adapter.UnpaidOrderListDecoration;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.utils.AsyncWidgetPerformanceTrackerKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B+\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010#\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!H\u0014¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010@\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "", "processFailedUpdate", "()V", "observeViewModel", "", "timerValue", "LWZ/e;", "getCustomParamsModifier", "(Ljava/lang/String;)LWZ/e;", "removeWidget", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO;Ll20/d;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/adapter/UnpaidOrderListAdapter;", "ordersAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/adapter/UnpaidOrderListAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListWidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListWidgetViewModel;", "viewModel", "getWidgetName", "()Ljava/lang/String;", "widgetName", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnpaidOrderListWidgetViewHolder extends k<UnpaidOrderListVO> implements AsyncWidgetCallbacks<UnpaidOrderListVO.UnpaidOrderListStateWrapper> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final UnpaidOrderListAdapter ordersAdapter;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnpaidOrderListWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        RecyclerView recyclerView = (RecyclerView) containerView;
        this.recyclerView = recyclerView;
        UnpaidOrderListAdapter unpaidOrderListAdapter = new UnpaidOrderListAdapter(this, new UnpaidOrderListWidgetViewHolder$ordersAdapter$1(this), new UnpaidOrderListWidgetViewHolder$ordersAdapter$2(this));
        this.ordersAdapter = unpaidOrderListAdapter;
        recyclerView.setAdapter(unpaidOrderListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new UnpaidOrderListDecoration(context));
        new x().attachToRecyclerView(recyclerView);
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e getCustomParamsModifier(String timerValue) {
        return new a(timerValue, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g getCustomParamsModifier$lambda$4(String str, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap a11 = h.a(params.b());
        a11.put("status", str);
        return g.a(params, a11, null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnpaidOrderListWidgetViewModel getViewModel() {
        return (UnpaidOrderListWidgetViewModel) getWidgetViewModel();
    }

    private final String getWidgetName() {
        b i11;
        d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    private final void observeViewModel() {
        P<Boolean> orderTimerFinishedLiveData;
        P<List<UnpaidOrderListVO.OrderVO>> ordersLiveData;
        UnpaidOrderListWidgetViewModel viewModel = getViewModel();
        if (viewModel != null && (ordersLiveData = viewModel.ordersLiveData()) != null) {
            ordersLiveData.observe(this, new UnpaidOrderListWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new UnpaidOrderListWidgetViewHolder$observeViewModel$1(this.ordersAdapter)));
        }
        UnpaidOrderListWidgetViewModel viewModel2 = getViewModel();
        if (viewModel2 == null || (orderTimerFinishedLiveData = viewModel2.orderTimerFinishedLiveData()) == null) {
            return;
        }
        orderTimerFinishedLiveData.observe(this, new UnpaidOrderListWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new UnpaidOrderListWidgetViewHolder$observeViewModel$2(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFailedUpdate() {
        UnpaidOrderListWidgetViewModel viewModel = getViewModel();
        List<UnpaidOrderListVO.OrderVO> actualOrders = viewModel != null ? viewModel.getActualOrders() : null;
        if (actualOrders == null || !actualOrders.isEmpty()) {
            return;
        }
        removeWidget();
    }

    private final void removeWidget() {
        UnpaidOrderListVO boundData = getBoundData();
        if (boundData != null) {
            this.refs.getController().m(boundData.getId());
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<UnpaidOrderListVO.UnpaidOrderListStateWrapper> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        AsyncWidgetPerformanceTrackerKt.trackAsyncWidgetEndTime(this.performanceTrackerDelegate, getWidgetName(), fetchedModel.getMetrics());
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        UnpaidOrderListVO boundData = getBoundData();
        if (boundData != null) {
            this.refs.getController().update(UnpaidOrderListVO.copy$default(boundData, 0L, fetchedModel.getFetchedState(), null, 5, null));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Lm0.a.f17149a.e(throwable);
        processFailedUpdate();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        UnpaidOrderListWidgetViewModel viewModel = getViewModel();
        if (viewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(viewModel, lifecycle, this, null, 4, null);
        }
        observeViewModel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull UnpaidOrderListVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        UnpaidOrderListVO.UnpaidOrderListStateWrapper stateWrapper = item.getStateWrapper();
        this.ordersAdapter.submitList(stateWrapper.getOrderList());
        UnpaidOrderListWidgetViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.startTimers(stateWrapper.getOrderList(), stateWrapper.getMaxTimerValue(), stateWrapper.getMappingTime());
        }
    }
}
