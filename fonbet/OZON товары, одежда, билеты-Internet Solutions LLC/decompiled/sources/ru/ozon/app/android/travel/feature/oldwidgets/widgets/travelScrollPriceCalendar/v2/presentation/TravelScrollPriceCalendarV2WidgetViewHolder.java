package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation;

import Lm0.a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.Y;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2VO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.adapter.TravelScrollPriceCalendarV2AdapterDecoration;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.adapter.content.TravelScrollPriceCalendarV2Adapter;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.adapter.shimmer.TravelScrollPriceCalendarV2ShimmerAdapter;
import ru.ozon.app.android.travel.utils.CenterSmoothScroller;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J#\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0018J)\u0010)\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u0004\u0018\u00010?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "selectedItemPosition", "", "scrollToSelectedItem", "(Ljava/lang/Integer;)V", "newStateWrapper", "updateState", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;)V", "saveScrollState", "()V", "restoreScrollState", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Landroid/graphics/drawable/ShapeDrawable;", "roundedBackground", "Landroid/graphics/drawable/ShapeDrawable;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/adapter/shimmer/TravelScrollPriceCalendarV2ShimmerAdapter;", "adapterShimmer", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/adapter/shimmer/TravelScrollPriceCalendarV2ShimmerAdapter;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/adapter/content/TravelScrollPriceCalendarV2Adapter;", "adapterSelect", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/adapter/content/TravelScrollPriceCalendarV2Adapter;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2WidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2WidgetViewModel;", "viewModel", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarV2WidgetViewHolder extends k<TravelScrollPriceCalendarV2VO> implements AsyncWidgetCallbacks<TravelScrollPriceCalendarV2VO.State> {

    @NotNull
    private TravelScrollPriceCalendarV2Adapter adapterSelect;

    @NotNull
    private TravelScrollPriceCalendarV2ShimmerAdapter adapterShimmer;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final ShapeDrawable roundedBackground;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelScrollPriceCalendarV2WidgetViewHolder(@NotNull RecyclerView containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.roundedBackground = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1), ResourceExtKt.toPxF(16, getContext()));
        this.adapterShimmer = new TravelScrollPriceCalendarV2ShimmerAdapter();
        this.adapterSelect = new TravelScrollPriceCalendarV2Adapter(this, new ActionHandler.Builder(references, this).buildHandler(), new TravelScrollPriceCalendarV2WidgetViewHolder$adapterSelect$1(this));
        containerView.setLayoutManager(new LinearLayoutManager(containerView.getContext(), 0, false));
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.addItemDecoration(new TravelScrollPriceCalendarV2AdapterDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(TravelScrollPriceCalendarV2WidgetViewHolder travelScrollPriceCalendarV2WidgetViewHolder, TravelScrollPriceCalendarV2VO travelScrollPriceCalendarV2VO) {
        travelScrollPriceCalendarV2WidgetViewHolder.scrollToSelectedItem(((TravelScrollPriceCalendarV2VO.State.Content) travelScrollPriceCalendarV2VO.getState()).getSelectedItemPosition());
    }

    private final TravelScrollPriceCalendarV2WidgetViewModel getViewModel() {
        return (TravelScrollPriceCalendarV2WidgetViewModel) getWidgetViewModel();
    }

    private final void restoreScrollState() {
        Parcelable scrollState;
        RecyclerView.o layoutManager;
        TravelScrollPriceCalendarV2WidgetViewModel viewModel = getViewModel();
        if (viewModel == null || (scrollState = viewModel.getScrollState()) == null || (layoutManager = this.containerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(scrollState);
    }

    private final void saveScrollState() {
        TravelScrollPriceCalendarV2WidgetViewModel viewModel = getViewModel();
        if (viewModel != null) {
            RecyclerView.o layoutManager = this.containerView.getLayoutManager();
            viewModel.setScrollState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    private final void scrollToSelectedItem(final Integer selectedItemPosition) {
        if (selectedItemPosition != null) {
            RecyclerView recyclerView = this.containerView;
            int i11 = Y.f42258g;
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2WidgetViewHolder$scrollToSelectedItem$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        RecyclerView.o layoutManager = TravelScrollPriceCalendarV2WidgetViewHolder.this.containerView.getLayoutManager();
                        if (layoutManager == null) {
                            return;
                        }
                        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(TravelScrollPriceCalendarV2WidgetViewHolder.this.getContext());
                        centerSmoothScroller.setTargetPosition(selectedItemPosition.intValue());
                        layoutManager.startSmoothScroll(centerSmoothScroller);
                    }
                });
                return;
            }
            RecyclerView.o layoutManager = this.containerView.getLayoutManager();
            if (layoutManager == null) {
                return;
            }
            CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(getContext());
            centerSmoothScroller.setTargetPosition(selectedItemPosition.intValue());
            layoutManager.startSmoothScroll(centerSmoothScroller);
        }
    }

    private final void updateState(TravelScrollPriceCalendarV2VO.State newStateWrapper) {
        this.references.getController().update(new TravelScrollPriceCalendarV2StateUpdate(newStateWrapper));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<TravelScrollPriceCalendarV2VO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        updateState(fetchedModel.getFetchedState());
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        TravelScrollPriceCalendarV2VO boundData = getBoundData();
        TravelScrollPriceCalendarV2WidgetViewModel viewModel = getViewModel();
        if (viewModel == null || viewModel.fetchIsAvailable()) {
            if ((boundData != null ? boundData.getAsyncData() : null) != null) {
                TravelScrollPriceCalendarV2WidgetViewModel viewModel2 = getViewModel();
                if (viewModel2 != null) {
                    viewModel2.repeatFetchWidget(boundData.getAsyncData());
                    return;
                }
                return;
            }
        }
        if (boundData != null) {
            this.references.getController().m(boundData.getId());
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        TravelScrollPriceCalendarV2WidgetViewModel viewModel = getViewModel();
        if (viewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(viewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        saveScrollState();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelScrollPriceCalendarV2VO item, @NotNull d info) {
        TravelScrollPriceCalendarV2WidgetViewModel viewModel;
        VS.a aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TravelScrollPriceCalendarV2VO.State state = item.getState();
        if (state instanceof TravelScrollPriceCalendarV2VO.State.Content) {
            if (Intrinsics.d(this.containerView.getAdapter(), this.adapterSelect)) {
                aVar = null;
            } else {
                this.containerView.setAdapter(this.adapterSelect);
                restoreScrollState();
                aVar = new VS.a(0, this, item);
            }
            this.adapterSelect.submitList(((TravelScrollPriceCalendarV2VO.State.Content) item.getState()).getDateTabs(), aVar);
            this.containerView.setBackground(((TravelScrollPriceCalendarV2VO.State.Content) item.getState()).getHasBackground() ? this.roundedBackground : null);
            return;
        }
        if (!(state instanceof TravelScrollPriceCalendarV2VO.State.Loading)) {
            throw new o();
        }
        if (!Intrinsics.d(this.containerView.getAdapter(), this.adapterShimmer)) {
            saveScrollState();
            this.containerView.setAdapter(this.adapterShimmer);
        }
        scrollToSelectedItem(2);
        if (item.getAsyncData() == null || (viewModel = getViewModel()) == null) {
            return;
        }
        viewModel.fetchWidget(item.getAsyncData());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelScrollPriceCalendarV2VO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelScrollPriceCalendarV2WidgetViewHolder) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> viewTracking = item.getState().getViewTracking();
        if (viewTracking == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(viewTracking, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
    }
}
