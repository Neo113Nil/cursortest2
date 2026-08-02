package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import GH.a;
import Sc.InterfaceC4008j;
import U7.d;
import W10.c;
import WZ.l;
import android.view.View;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.WidgetFreshOrderTrackingBinding;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter.OrderTrackingItemsAdapter;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter.OrderTrackingItemsDecorator;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter.OrderTrackingRVLayoutManager;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010\u001cJ3\u0010*\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u001b\u0010:\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u001b\u0010=\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00100>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u0004\u0018\u00010K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/lifecycle/J;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingMapper;", "orderTrackingMapper", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingMapper;)V", "", "vmObserver", "()V", "", "", "trackingPayloads", "appendPagePayloads", "(Ljava/util/Map;)V", "trackLifeCycle", "trackRefresh", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;Ll20/d;)V", "onDetachViewModel", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingMapper;", "", "singleItemHorizontalPadding$delegate", "LSc/j;", "getSingleItemHorizontalPadding", "()I", "singleItemHorizontalPadding", "multiplyItemsHorizontalPadding$delegate", "getMultiplyItemsHorizontalPadding", "multiplyItemsHorizontalPadding", "singleItemWidth$delegate", "getSingleItemWidth", "singleItemWidth", "multiplyItemsWidth$delegate", "getMultiplyItemsWidth", "multiplyItemsWidth", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter;", "adapter", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/adapter/OrderTrackingItemsAdapter;", "Lnc/b;", "widgetStateDisposable", "Lnc/b;", "Lru/ozon/app/android/fresh/main/databinding/WidgetFreshOrderTrackingBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/WidgetFreshOrderTrackingBinding;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingViewModel;", "widgetViewModel", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderTrackingViewHolder extends k<OrderTrackingVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final OrderTrackingItemsAdapter adapter;

    @NotNull
    private final WidgetFreshOrderTrackingBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    /* renamed from: multiplyItemsHorizontalPadding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j multiplyItemsHorizontalPadding;

    /* renamed from: multiplyItemsWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j multiplyItemsWidth;

    @NotNull
    private final OrderTrackingMapper orderTrackingMapper;

    /* renamed from: singleItemHorizontalPadding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j singleItemHorizontalPadding;

    /* renamed from: singleItemWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j singleItemWidth;

    @NotNull
    private final l tokenizedAnalytics;
    private InterfaceC8487b widgetStateDisposable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTrackingViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull OrderTrackingMapper orderTrackingMapper) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(orderTrackingMapper, "orderTrackingMapper");
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.orderTrackingMapper = orderTrackingMapper;
        this.singleItemHorizontalPadding = Sc.k.b(OrderTrackingViewHolder$singleItemHorizontalPadding$2.INSTANCE);
        this.multiplyItemsHorizontalPadding = Sc.k.b(OrderTrackingViewHolder$multiplyItemsHorizontalPadding$2.INSTANCE);
        this.singleItemWidth = Sc.k.b(new OrderTrackingViewHolder$singleItemWidth$2(containerView, this));
        this.multiplyItemsWidth = Sc.k.b(new OrderTrackingViewHolder$multiplyItemsWidth$2(containerView, this));
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        OrderTrackingItemsAdapter orderTrackingItemsAdapter = new OrderTrackingItemsAdapter(getContext(), tokenizedAnalytics, buildHandler, this);
        this.adapter = orderTrackingItemsAdapter;
        WidgetFreshOrderTrackingBinding bind = WidgetFreshOrderTrackingBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.ordersTrackingRv.setLayoutManager(new OrderTrackingRVLayoutManager(getContext()));
        bind.ordersTrackingRv.setAdapter(orderTrackingItemsAdapter);
        RecyclerView.l itemAnimator = bind.ordersTrackingRv.getItemAnimator();
        Intrinsics.g(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((C) itemAnimator).setSupportsChangeAnimations(false);
        bind.ordersTrackingRv.addItemDecoration(new OrderTrackingItemsDecorator(getSingleItemWidth(), getMultiplyItemsWidth()));
        trackLifeCycle();
        trackRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendPagePayloads(Map<String, String> trackingPayloads) {
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMultiplyItemsHorizontalPadding() {
        return ((Number) this.multiplyItemsHorizontalPadding.getValue()).intValue();
    }

    private final int getMultiplyItemsWidth() {
        return ((Number) this.multiplyItemsWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSingleItemHorizontalPadding() {
        return ((Number) this.singleItemHorizontalPadding.getValue()).intValue();
    }

    private final int getSingleItemWidth() {
        return ((Number) this.singleItemWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderTrackingViewModel getWidgetViewModel() {
        return (OrderTrackingViewModel) getWidgetViewModel();
    }

    private final void trackLifeCycle() {
        d.c(this.composerReferences).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingViewHolder$trackLifeCycle$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                OrderTrackingViewModel widgetViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                widgetViewModel = OrderTrackingViewHolder.this.getWidgetViewModel();
                if (widgetViewModel != null) {
                    widgetViewModel.onStart();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                OrderTrackingViewModel widgetViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                widgetViewModel = OrderTrackingViewHolder.this.getWidgetViewModel();
                if (widgetViewModel != null) {
                    widgetViewModel.onStop();
                }
            }
        });
    }

    private final void trackRefresh() {
        C5423j events = this.composerReferences.getController().getEvents();
        T t2 = new T();
        t2.a(events, new OrderTrackingViewHolder$inlined$sam$i$androidx_lifecycle_Observer$0(new OrderTrackingViewHolder$trackRefresh$$inlined$filterIsInstance$1(t2)));
        t2.observe(this, new OrderTrackingViewHolder$sam$androidx_lifecycle_Observer$0(new OrderTrackingViewHolder$trackRefresh$1(this)));
    }

    private final void vmObserver() {
        InterfaceC8487b interfaceC8487b = this.widgetStateDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        OrderTrackingViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel == null) {
            return;
        }
        this.widgetStateDisposable = widgetViewModel.getState().observeOn(C8125a.a()).subscribe(new a(new OrderTrackingViewHolder$vmObserver$1(this), 17));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        vmObserver();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onDetachViewModel(lifecycle);
        InterfaceC8487b interfaceC8487b = this.widgetStateDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderTrackingVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(item.getItems());
        OrderTrackingViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.bindWidget(item.getWidgetUpdatePeriod());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderTrackingVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((OrderTrackingViewHolder) item, trackingData, viewedPond);
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, item.getTokenizedEvent(), null, 2, null);
    }
}
