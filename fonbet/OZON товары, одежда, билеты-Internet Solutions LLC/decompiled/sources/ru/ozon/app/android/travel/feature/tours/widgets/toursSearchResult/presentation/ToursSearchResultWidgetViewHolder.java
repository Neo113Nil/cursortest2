package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import Ey.RunnableC2974a;
import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.ToursSearchResultAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultView;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000¿\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001L\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u0017J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010)\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00022\n\u0010(\u001a\u00060&j\u0002`'H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010\u0017J3\u00103\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00022\n\u0010/\u001a\u00060-j\u0002`.2\u000e\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00152\u0006\u0010(\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010>R\u0016\u0010@\u001a\u0004\u0018\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00150B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001d\u0010T\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Landroidx/lifecycle/W;", "", "refreshObserver", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;LVg/d;Landroidx/lifecycle/W;LWZ/l;)V", "", "subscribe", "()V", "", "emptyState", "processEmptyState", "(Ljava/lang/Object;)V", "", "timeLimit", "startTimer", "(J)V", "saveLayoutManagerState", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$ToursState;", "state", "submitSearchResultsAndRestoreLayoutManagerState", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$ToursState;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;Ll20/d;)V", "onAttach", "onDetach", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;", "Landroidx/lifecycle/W;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultView;", "rootView", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/adapter/ToursSearchResultAdapter;", "searchResultAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/adapter/ToursSearchResultAdapter;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "timerHelper", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "ru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultWidgetViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultWidgetViewHolder$scrollListener$1;", "Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate$delegate", "LSc/j;", "getNotificationBarDelegate", "()Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultWidgetViewHolder extends k<ToursSearchResultVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final View containerView;

    /* renamed from: notificationBarDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notificationBarDelegate;

    @NotNull
    private final W refreshObserver;

    @NotNull
    private final ComposerReferences refs;
    private final ToursSearchResultView rootView;

    @NotNull
    private final ToursSearchResultWidgetViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final ToursSearchResultAdapter searchResultAdapter;
    private TimerHelper timerHelper;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ToursSearchResultViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v4, types: [ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultWidgetViewHolder$scrollListener$1] */
    public ToursSearchResultWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull ToursSearchResultViewModel viewModel, @NotNull d customActionHandlersStoreFactory, @NotNull W refreshObserver, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refreshObserver, "refreshObserver");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        this.refreshObserver = refreshObserver;
        this.tokenizedAnalytics = tokenizedAnalytics;
        ToursSearchResultView toursSearchResultView = containerView instanceof ToursSearchResultView ? (ToursSearchResultView) containerView : null;
        this.rootView = toursSearchResultView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ToursSearchResultWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        ToursSearchResultAdapter toursSearchResultAdapter = new ToursSearchResultAdapter(buildHandler, tokenizedAnalytics, refs.getComposerViewPoolProvider().getViewPool(), this);
        this.searchResultAdapter = toursSearchResultAdapter;
        this.timerHelper = new TimerHelper(getLifecycle());
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultWidgetViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                ToursSearchResultViewModel toursSearchResultViewModel;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dy > 0) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null) {
                        return;
                    }
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    toursSearchResultViewModel = ToursSearchResultWidgetViewHolder.this.viewModel;
                    toursSearchResultViewModel.loadNextPage(findLastVisibleItemPosition);
                }
            }
        };
        this.notificationBarDelegate = LazyUtilsKt.unsafeLazy(new ToursSearchResultWidgetViewHolder$notificationBarDelegate$2(this));
        containerView.setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        if (toursSearchResultView != null) {
            toursSearchResultView.setupHotelsRV(toursSearchResultAdapter, refs.getComposerViewPoolProvider().getViewPool());
        }
    }

    private final NotificationBarDelegate getNotificationBarDelegate() {
        return (NotificationBarDelegate) this.notificationBarDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processEmptyState(Object emptyState) {
        RecyclerView hotelsRV;
        EmptyStateView emptyStateESV;
        RecyclerView hotelsRV2;
        EmptyStateView emptyStateESV2;
        EmptyStateView emptyStateESV3;
        if (emptyState instanceof EmptyStateVO) {
            ToursSearchResultView toursSearchResultView = this.rootView;
            if (toursSearchResultView != null && (emptyStateESV3 = toursSearchResultView.getEmptyStateESV()) != null) {
                emptyStateESV3.bind((EmptyStateVO) emptyState, this.actionHandler);
            }
            ToursSearchResultView toursSearchResultView2 = this.rootView;
            if (toursSearchResultView2 != null && (emptyStateESV2 = toursSearchResultView2.getEmptyStateESV()) != null) {
                ViewExtKt.show(emptyStateESV2);
            }
            ToursSearchResultView toursSearchResultView3 = this.rootView;
            if (toursSearchResultView3 == null || (hotelsRV2 = toursSearchResultView3.getHotelsRV()) == null) {
                return;
            }
            ViewExtKt.gone(hotelsRV2);
            return;
        }
        if (emptyState instanceof NotificationDTO) {
            NotificationBarDelegate notificationBarDelegate = getNotificationBarDelegate();
            if (notificationBarDelegate != null) {
                notificationBarDelegate.show((NotificationDTO) emptyState);
                return;
            }
            return;
        }
        if (emptyState == null) {
            ToursSearchResultView toursSearchResultView4 = this.rootView;
            if (toursSearchResultView4 != null && (emptyStateESV = toursSearchResultView4.getEmptyStateESV()) != null) {
                ViewExtKt.gone(emptyStateESV);
            }
            ToursSearchResultView toursSearchResultView5 = this.rootView;
            if (toursSearchResultView5 == null || (hotelsRV = toursSearchResultView5.getHotelsRV()) == null) {
                return;
            }
            ViewExtKt.show(hotelsRV);
        }
    }

    private final void saveLayoutManagerState() {
        RecyclerView hotelsRV;
        RecyclerView.o layoutManager;
        Parcelable onSaveInstanceState;
        ToursSearchResultView toursSearchResultView = this.rootView;
        if (toursSearchResultView == null || (hotelsRV = toursSearchResultView.getHotelsRV()) == null || (layoutManager = hotelsRV.getLayoutManager()) == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null) {
            return;
        }
        this.viewModel.saveLayoutManagerState(onSaveInstanceState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer(long timeLimit) {
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        TimerHelper timerHelper2 = this.timerHelper;
        if (timerHelper2 != null) {
            TimerHelper.startTimer$default(timerHelper2, Long.valueOf(timeLimit), new ToursSearchResultWidgetViewHolder$startTimer$1(this.viewModel), (Function1) null, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitSearchResultsAndRestoreLayoutManagerState(ToursSearchResultViewModel.ToursState state) {
        RecyclerView hotelsRV;
        RecyclerView.o layoutManager;
        Parcelable layoutManagerState = state.getLayoutManagerState();
        if (layoutManagerState == null) {
            ToursSearchResultView toursSearchResultView = this.rootView;
            layoutManagerState = (toursSearchResultView == null || (hotelsRV = toursSearchResultView.getHotelsRV()) == null || (layoutManager = hotelsRV.getLayoutManager()) == null) ? null : layoutManager.onSaveInstanceState();
        }
        this.searchResultAdapter.submitList(state.getItems(), new RunnableC2974a(state, this, layoutManagerState, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSearchResultsAndRestoreLayoutManagerState$lambda$4(ToursSearchResultViewModel.ToursState toursState, ToursSearchResultWidgetViewHolder toursSearchResultWidgetViewHolder, Parcelable parcelable) {
        RecyclerView hotelsRV;
        RecyclerView.o layoutManager;
        RecyclerView hotelsRV2;
        if (toursState.getIsUrlChanged()) {
            ToursSearchResultView toursSearchResultView = toursSearchResultWidgetViewHolder.rootView;
            if (toursSearchResultView == null || (hotelsRV2 = toursSearchResultView.getHotelsRV()) == null) {
                return;
            }
            hotelsRV2.scrollToPosition(0);
            return;
        }
        ToursSearchResultView toursSearchResultView2 = toursSearchResultWidgetViewHolder.rootView;
        if (toursSearchResultView2 == null || (hotelsRV = toursSearchResultView2.getHotelsRV()) == null || (layoutManager = hotelsRV.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(parcelable);
    }

    private final void subscribe() {
        ToursSearchResultViewModel toursSearchResultViewModel = this.viewModel;
        toursSearchResultViewModel.showEmptyStateLiveData().observe(this, new ToursSearchResultWidgetViewHolder$subscribe$1$1(this));
        toursSearchResultViewModel.timerLiveData().observe(this, new ToursSearchResultWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ToursSearchResultWidgetViewHolder$subscribe$1$2(this)));
        toursSearchResultViewModel.handleTimeoutActionLiveData().observe(this, new ToursSearchResultWidgetViewHolder$sam$androidx_lifecycle_Observer$0(this.actionHandler));
        toursSearchResultViewModel.resultLiveData().observe(this, new ToursSearchResultWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ToursSearchResultWidgetViewHolder$subscribe$1$3(this)));
        toursSearchResultViewModel.sendRefreshLiveData().observe(this.refs.getContainer().g(), this.refreshObserver);
        toursSearchResultViewModel.showFlashBar().observe(this, new ToursSearchResultWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ToursSearchResultWidgetViewHolder$subscribe$1$4(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        RecyclerView hotelsRV;
        super.onAttach();
        ToursSearchResultView toursSearchResultView = this.rootView;
        if (toursSearchResultView != null && (hotelsRV = toursSearchResultView.getHotelsRV()) != null) {
            hotelsRV.addOnScrollListener(this.scrollListener);
        }
        subscribe();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        RecyclerView hotelsRV;
        saveLayoutManagerState();
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timerHelper = null;
        ToursSearchResultView toursSearchResultView = this.rootView;
        if (toursSearchResultView != null && (hotelsRV = toursSearchResultView.getHotelsRV()) != null) {
            hotelsRV.removeOnScrollListener(this.scrollListener);
        }
        super.onDetach();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        int height = info.a().e().height();
        int i11 = height - (info.b().top - info.a().e().top);
        if (height > 0) {
            View view = this.containerView;
            if (view.getHeight() != i11) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = i11;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursSearchResultVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.initialize(item, info.c().e());
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ToursSearchResultVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ToursSearchResultWidgetViewHolder) item, trackingData, viewedPond);
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}
