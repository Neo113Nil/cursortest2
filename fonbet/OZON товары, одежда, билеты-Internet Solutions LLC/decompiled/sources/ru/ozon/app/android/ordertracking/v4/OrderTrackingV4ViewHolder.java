package ru.ozon.app.android.ordertracking.v4;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import GE.b;
import Ge.n;
import Vg.d;
import WZ.l;
import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.K;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel;
import ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager;
import ru.ozon.app.android.csma.orderTracking.data.UpdateAction;
import ru.ozon.app.android.ordertracking.databinding.WidgetOrderTrackingV4Binding;
import ru.ozon.app.android.ordertracking.v4.presentation.model.LeftSideButton;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderTrackingItemVO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderTrackingV4VO;
import ru.ozon.app.android.ordertracking.v4.presentation.model.OrderVO;
import ru.ozon.app.android.ordertracking.v4.presentation.rv.HolderWithMarqueeView;
import ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4ItemsAdapter;
import ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4ItemsDecoration;
import ru.ozon.app.android.ordertracking.v4.presentation.util.MarqueeItemVisibilityCallback;
import ru.ozon.app.android.ordertracking.v4.presentation.util.MarqueeItemVisibilityTracker;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001QBY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001bJ\u001d\u0010$\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010'\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010\u001bJ\u0017\u0010*\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010\u001bJ\u000f\u0010-\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010\u001bJ\u000f\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010\u001bJ\u000f\u0010/\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u0010\u001bJ\u000f\u00100\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u0010\u001bJ\u000f\u00101\u001a\u00020\u0019H\u0016¢\u0006\u0004\b1\u0010\u001bJ\u001f\u00105\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0018\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010=R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00190>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001c0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/OrderTrackingV4ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;", "Lru/ozon/app/android/ordertracking/databinding/WidgetOrderTrackingV4Binding;", "binding", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "adultListDelegate", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;", "viewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/utils/AppType;", "appType", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/ordertracking/databinding/WidgetOrderTrackingV4Binding;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;LVg/d;Lru/ozon/app/android/utils/AppType;LWZ/l;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "", "initializeMarqueeTracker", "()V", "LA00/a;", "event", "swipeRefreshEventHandler", "(LA00/a;)V", "restartAnimationWithFadeAfterScreenRefresh", "", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingItemVO;", "items", "submitItems", "(Ljava/util/List;)V", "saveScrollState", "resetScrollState", "", "scrollOffset", "manipulateTimer", "(I)V", "observeSwipeRefresh", "restoreState", "onAttach", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingV4VO;Ll20/d;)V", "Lru/ozon/app/android/ordertracking/databinding/WidgetOrderTrackingV4Binding;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "LVg/d;", "Lru/ozon/app/android/utils/AppType;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "updateActionName", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "Lru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4ItemsAdapter;", "recyclerAdapter", "Lru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4ItemsAdapter;", "Ljava/lang/Runnable;", "scrollToStart", "Ljava/lang/Runnable;", "Lru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityTracker;", "marqueeItemVisibilityTracker", "Lru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityTracker;", "Landroidx/lifecycle/W;", "refreshObserver", "Landroidx/lifecycle/W;", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingV4ViewHolder extends k<OrderTrackingV4VO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DEFAULT_BACKGROUND_COLOR = R$color.layer_floor_0;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultListDelegate<OrderVO> adultListDelegate;

    @NotNull
    private final AppType appType;

    @NotNull
    private final WidgetOrderTrackingV4Binding binding;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private MarqueeItemVisibilityTracker marqueeItemVisibilityTracker;

    @NotNull
    private final OrderTrackingV4ItemsAdapter recyclerAdapter;

    @NotNull
    private final W<a> refreshObserver;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final Runnable scrollToStart;
    private UpdateAction updateActionName;

    @NotNull
    private final OrderTrackingV4ViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/OrderTrackingV4ViewHolder$Companion;", "", "<init>", "()V", "", "CSMA_PAY_ACTION_ID", "Ljava/lang/String;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderTrackingV4ViewHolder(@NotNull WidgetOrderTrackingV4Binding binding, @NotNull AdultListDelegate<OrderVO> adultListDelegate, @NotNull ComposerReferences refs, @NotNull OrderTrackingV4ViewModel viewModel, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull AppType appType, @NotNull l tokenizedAnalytics, @NotNull StartupArgsService startupArgsService) {
        super(r2);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        RecyclerView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.adultListDelegate = adultListDelegate;
        this.refs = refs;
        this.viewModel = viewModel;
        this.createAndPayViewModel = createAndPayViewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.appType = appType;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onClick(new OrderTrackingV4ViewHolder$actionHandler$1(this)).customActionHandlers(new OrderTrackingV4ViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        OrderTrackingV4ItemsAdapter orderTrackingV4ItemsAdapter = new OrderTrackingV4ItemsAdapter(buildHandler, refs, viewModel.getBarcodeTimerManager(), startupArgsService, tokenizedAnalytics, this, appType, getContext());
        orderTrackingV4ItemsAdapter.setAfterTimerCallback(new OrderTrackingV4ViewHolder$recyclerAdapter$1$1(this));
        this.recyclerAdapter = orderTrackingV4ItemsAdapter;
        this.scrollToStart = new b(this, 1);
        this.refreshObserver = new OrderTrackingV4ViewHolder$refreshObserver$1(this);
        RecyclerView recyclerView = binding.orderTrackingV4List;
        recyclerView.setAdapter(orderTrackingV4ItemsAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new OrderTrackingV4ItemsDecoration(context));
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.ordertracking.v4.OrderTrackingV4ViewHolder$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    OrderTrackingV4ViewHolder.this.saveScrollState();
                    OrderTrackingV4ViewHolder.this.manipulateTimer(recyclerView2.computeHorizontalScrollOffset());
                }
            }
        });
        recyclerView.setItemAnimator(null);
    }

    private final void initializeMarqueeTracker() {
        if (this.marqueeItemVisibilityTracker != null) {
            return;
        }
        MarqueeItemVisibilityCallback marqueeItemVisibilityCallback = new MarqueeItemVisibilityCallback() { // from class: ru.ozon.app.android.ordertracking.v4.OrderTrackingV4ViewHolder$initializeMarqueeTracker$visibilityCallback$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ru.ozon.app.android.ordertracking.v4.presentation.util.MarqueeItemVisibilityCallback
            public void onMostVisibleHolderChanged(RecyclerView.C newHolder, RecyclerView.C previousHolder) {
                Intrinsics.checkNotNullParameter(newHolder, "newHolder");
                if (previousHolder != 0) {
                    HolderWithMarqueeView holderWithMarqueeView = previousHolder instanceof HolderWithMarqueeView ? (HolderWithMarqueeView) previousHolder : null;
                    if (holderWithMarqueeView != null) {
                        holderWithMarqueeView.stopMarqueeWithFadeAnimation();
                    }
                }
                HolderWithMarqueeView holderWithMarqueeView2 = newHolder instanceof HolderWithMarqueeView ? (HolderWithMarqueeView) newHolder : null;
                if (holderWithMarqueeView2 != null) {
                    holderWithMarqueeView2.startMarqueeAnimationIfNeeded();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ru.ozon.app.android.ordertracking.v4.presentation.util.MarqueeItemVisibilityCallback
            public void onScrollingStateChanged(boolean isScrolling, RecyclerView.C currentHolder) {
                HolderWithMarqueeView holderWithMarqueeView;
                if (isScrolling) {
                    holderWithMarqueeView = currentHolder instanceof HolderWithMarqueeView ? (HolderWithMarqueeView) currentHolder : null;
                    if (holderWithMarqueeView != null) {
                        holderWithMarqueeView.pauseMarqueeAnimation();
                        return;
                    }
                    return;
                }
                holderWithMarqueeView = currentHolder instanceof HolderWithMarqueeView ? (HolderWithMarqueeView) currentHolder : null;
                if (holderWithMarqueeView != null) {
                    holderWithMarqueeView.resumeMarqueeAnimation();
                }
            }
        };
        RecyclerView orderTrackingV4List = this.binding.orderTrackingV4List;
        Intrinsics.checkNotNullExpressionValue(orderTrackingV4List, "orderTrackingV4List");
        this.marqueeItemVisibilityTracker = new MarqueeItemVisibilityTracker(orderTrackingV4List, 1, marqueeItemVisibilityCallback, getLifecycle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void manipulateTimer(int scrollOffset) {
        BarcodeTimerManager barcodeTimerManager = this.viewModel.getBarcodeTimerManager();
        if (barcodeTimerManager != null) {
            if (scrollOffset == 0) {
                barcodeTimerManager.resumeTimer();
            } else {
                barcodeTimerManager.pauseTimer();
            }
        }
    }

    private final void observeSwipeRefresh() {
        this.refs.getController().getEvents().observe(this.refs.getContainer().g(), new OrderTrackingV4ViewHolder$sam$androidx_lifecycle_Observer$0(new OrderTrackingV4ViewHolder$observeSwipeRefresh$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$updateOrderItems(OrderTrackingV4ItemsAdapter orderTrackingV4ItemsAdapter, List list, kotlin.coroutines.d dVar) {
        orderTrackingV4ItemsAdapter.updateOrderItems(list);
        return Unit.f71690a;
    }

    private final void resetScrollState() {
        this.viewModel.setScreenScrollState(null);
    }

    private final void restartAnimationWithFadeAfterScreenRefresh() {
        MarqueeItemVisibilityTracker marqueeItemVisibilityTracker = this.marqueeItemVisibilityTracker;
        RecyclerView.C currentMostVisibleHolder = marqueeItemVisibilityTracker != null ? marqueeItemVisibilityTracker.getCurrentMostVisibleHolder() : null;
        HolderWithMarqueeView holderWithMarqueeView = currentMostVisibleHolder instanceof HolderWithMarqueeView ? (HolderWithMarqueeView) currentMostVisibleHolder : null;
        if (holderWithMarqueeView != null) {
            holderWithMarqueeView.restartMarqueeAnimationAfterRefresh();
        }
    }

    private final void restoreState() {
        Parcelable screenScrollState = this.viewModel.getScreenScrollState();
        if (screenScrollState == null) {
            this.binding.orderTrackingV4List.scrollToPosition(0);
            return;
        }
        RecyclerView.o layoutManager = this.binding.orderTrackingV4List.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(screenScrollState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        OrderTrackingV4ViewModel orderTrackingV4ViewModel = this.viewModel;
        RecyclerView.o layoutManager = this.binding.orderTrackingV4List.getLayoutManager();
        orderTrackingV4ViewModel.setScreenScrollState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToStart$lambda$1(OrderTrackingV4ViewHolder orderTrackingV4ViewHolder) {
        orderTrackingV4ViewHolder.resetScrollState();
        orderTrackingV4ViewHolder.restoreState();
    }

    private final void submitItems(List<? extends OrderTrackingItemVO> items) {
        OrderTrackingV4ItemsAdapter orderTrackingV4ItemsAdapter = this.recyclerAdapter;
        orderTrackingV4ItemsAdapter.submitList(items);
        List<OrderTrackingItemVO> currentList = orderTrackingV4ItemsAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : currentList) {
            if (obj instanceof LeftSideButton) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : items) {
                if (obj2 instanceof LeftSideButton) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.binding.orderTrackingV4List.post(this.scrollToStart);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swipeRefreshEventHandler(a event) {
        if (event instanceof a.u.c) {
            restartAnimationWithFadeAfterScreenRefresh();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        restoreState();
        C2399j.C(new C2408n0(C2399j.o(n.a(this.adultListDelegate.observeItems())), new OrderTrackingV4ViewHolder$onAttach$1(this.recyclerAdapter)), K.a(this));
        this.viewModel.getActionObserver().setValue(OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction.EnableConfigurator.INSTANCE);
        observeSwipeRefresh();
        this.refs.getController().getEvents().observe(this, this.refreshObserver);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.binding.orderTrackingV4List.removeCallbacks(this.scrollToStart);
        saveScrollState();
        super.onDetach();
        this.refs.getController().getEvents().removeObserver(this.refreshObserver);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        initializeMarqueeTracker();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.marqueeItemVisibilityTracker = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderTrackingV4VO item, @NotNull l20.d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.updateActionName = item.getUpdateAction();
        this.viewModel.getActionObserver().setValue(new OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction.SetUpUpdateAction(item.getUpdateAction()));
        RecyclerView recyclerView = this.binding.orderTrackingV4List;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), DEFAULT_BACKGROUND_COLOR));
        recyclerView.setPadding(UiExtKt.toPx(item.getPadding().getLeft()), UiExtKt.toPx(item.getPadding().getTop()), UiExtKt.toPx(item.getPadding().getRight()), UiExtKt.toPx(item.getPadding().getBottom()));
        AdultListDelegate<OrderVO> adultListDelegate = this.adultListDelegate;
        List<OrderTrackingItemVO> items = item.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof OrderVO) {
                arrayList.add(obj);
            }
        }
        adultListDelegate.bindItems(arrayList);
        submitItems(item.getItems());
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState == null || (layoutManager = this.binding.orderTrackingV4List.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(layoutManagerState);
    }
}
