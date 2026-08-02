package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay;

import T00.m;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersAnimator;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersAsyncActionViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view.QuickFiltersView;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionWidgetCallbacks;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001=\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B1\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0012008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u0004\u0018\u00010@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/overlay/QuickFiltersOverlayWidgetViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersAsyncActionViewModel;", "asyncActionWidgetViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersAsyncActionViewModel;LVg/d;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;)V", "onWidgetDestroyed", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "onAsyncWidgetAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersAsyncActionViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersAnimator;", "animator", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersAnimator;", "ru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/overlay/QuickFiltersOverlayWidgetViewHolder$onScrollListener$1", "onScrollListener", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/overlay/QuickFiltersOverlayWidgetViewHolder$onScrollListener$1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersView;", "getQuickFiltersView", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersView;", "quickFiltersView", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersOverlayWidgetViewHolder extends AbstractC6067d<QuickFiltersVO> implements AsyncActionWidgetCallbacks<QuickFiltersVO.QuickFiltersState>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private QuickFiltersAnimator animator;

    @NotNull
    private final QuickFiltersAsyncActionViewModel asyncActionWidgetViewModel;
    private final RecyclerView composerRecyclerView;

    @NotNull
    private final i container;

    @NotNull
    private final QuickFiltersOverlayWidgetViewHolder$onScrollListener$1 onScrollListener;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay.QuickFiltersOverlayWidgetViewHolder$onScrollListener$1] */
    public QuickFiltersOverlayWidgetViewHolder(@NotNull i container, @NotNull QuickFiltersAsyncActionViewModel asyncActionWidgetViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(asyncActionWidgetViewModel, "asyncActionWidgetViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.asyncActionWidgetViewModel = asyncActionWidgetViewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new QuickFiltersOverlayWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.tokenizedAnalytics = container.X();
        this.composerRecyclerView = ComposerViewExtensionKt.composerRecyclerViewOrNull(container.Y());
        this.onScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay.QuickFiltersOverlayWidgetViewHolder$onScrollListener$1
            /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
            
                r1 = r0.this$0.animator;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
            
                r1 = r0.this$0.animator;
             */
            @Override // androidx.recyclerview.widget.RecyclerView.t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                QuickFiltersAnimator quickFiltersAnimator;
                QuickFiltersAnimator quickFiltersAnimator2;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dy < -5 && quickFiltersAnimator2 != null) {
                    quickFiltersAnimator2.show();
                }
                if (dy <= 5 || quickFiltersAnimator == null) {
                    return;
                }
                quickFiltersAnimator.hide();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QuickFiltersView getQuickFiltersView() {
        View view = getView();
        if (view instanceof QuickFiltersView) {
            return (QuickFiltersView) view;
        }
        return null;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionWidgetCallbacks
    public void onAsyncWidgetAction(@NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<QuickFiltersVO.QuickFiltersState> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        this.container.M().update(new QuickFiltersUpdate(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncActionWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        QuickFiltersView quickFiltersView = getQuickFiltersView();
        if (quickFiltersView != null) {
            int i11 = Y.f42258g;
            if (!quickFiltersView.isLaidOut() || quickFiltersView.isLayoutRequested()) {
                quickFiltersView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay.QuickFiltersOverlayWidgetViewHolder$onWidgetCreated$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        QuickFiltersOverlayWidgetViewHolder.this.animator = new QuickFiltersAnimator(view, view.getHeight() - (QuickFiltersOverlayWidgetViewHolder.this.getQuickFiltersView() != null ? r2.getProgressViewHeight() : 0));
                    }
                });
            } else {
                this.animator = new QuickFiltersAnimator(quickFiltersView, quickFiltersView.getHeight() - (getQuickFiltersView() != null ? r1.getProgressViewHeight() : 0));
            }
        }
        this.container.M().getEvents().observe(this, new QuickFiltersOverlayWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new QuickFiltersOverlayWidgetViewHolder$onWidgetCreated$2(this)));
        this.asyncActionWidgetViewModel.setCallbacks(this);
        this.asyncActionWidgetViewModel.setTraceNameProvider(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        RecyclerView recyclerView = this.composerRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.onScrollListener);
        }
        this.asyncActionWidgetViewModel.removeCallbacks();
        this.asyncActionWidgetViewModel.removeTraceNameProvider();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        l20.d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull QuickFiltersVO item) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getState().getAsyncAction() != null) {
            this.asyncActionWidgetViewModel.submit(item.getState().getAsyncAction());
        }
        QuickFiltersView quickFiltersView = getQuickFiltersView();
        if (quickFiltersView != null) {
            quickFiltersView.bind(item.getState(), this.actionHandler);
        }
        RecyclerView recyclerView2 = this.composerRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.onScrollListener);
        }
        if (item.getState().getStickyBehavior() != QuickFiltersDTO.StickyBehavior.STATIC_STICKY || (recyclerView = this.composerRecyclerView) == null) {
            return;
        }
        recyclerView.addOnScrollListener(this.onScrollListener);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull QuickFiltersVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        Map<String, TokenizedTrackingInfo> viewEvent = item.getState().getViewEvent();
        if (viewEvent == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(viewEvent, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
    }
}
