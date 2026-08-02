package ru.ozon.app.android.cml.delivery.widgets.order.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import An.C2439a;
import El.C2971a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.OrderWidgetAsyncUiState;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsVO;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter.OrderParamsGroupsAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00130$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00130$j\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/v2/presentation/OrderParamsGroupsV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsVO;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/presentation/OrderWidgetV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroid/widget/FrameLayout;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(LWZ/l;Lru/ozon/app/android/cml/delivery/widgets/order/v2/presentation/OrderWidgetV2ViewModel;Lru/ozon/app/android/composer/ComposerReferences;Landroid/widget/FrameLayout;LVg/d;)V", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/OrderWidgetAsyncUiState;", "uiState", "", "handleAsyncUpdateState", "(Lru/ozon/app/android/cml/delivery/widgets/order/presentation/OrderWidgetAsyncUiState;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/cml/delivery/widgets/order/v2/presentation/OrderWidgetV2ViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "preProcessActionHandler", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/OrderParamsGroupsAdapter;", "paramsGroupsAdapter", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/OrderParamsGroupsAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "paramsGroupsRv", "Landroidx/recyclerview/widget/RecyclerView;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderParamsGroupsV2ViewHolder extends k<OrderParamsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final OrderParamsGroupsAdapter paramsGroupsAdapter;

    @NotNull
    private final RecyclerView paramsGroupsRv;

    @NotNull
    private final Function1<AtomAction, Unit> preProcessActionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final OrderWidgetV2ViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cml.delivery.widgets.order.v2.presentation.OrderParamsGroupsV2ViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function2<OrderWidgetAsyncUiState, d<? super Unit>, Object> {
        AnonymousClass1(Object obj) {
            super(2, obj, OrderParamsGroupsV2ViewHolder.class, "handleAsyncUpdateState", "handleAsyncUpdateState(Lru/ozon/app/android/cml/delivery/widgets/order/presentation/OrderWidgetAsyncUiState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderWidgetAsyncUiState orderWidgetAsyncUiState, d<? super Unit> dVar) {
            return OrderParamsGroupsV2ViewHolder._init_$handleAsyncUpdateState((OrderParamsGroupsV2ViewHolder) this.receiver, orderWidgetAsyncUiState, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderParamsGroupsV2ViewHolder(@NotNull l tokenizedAnalytics, @NotNull OrderWidgetV2ViewModel viewModel, @NotNull ComposerReferences refs, @NotNull FrameLayout containerView, @NotNull Vg.d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new OrderParamsGroupsV2ViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        OrderParamsGroupsV2ViewHolder$preProcessActionHandler$1 orderParamsGroupsV2ViewHolder$preProcessActionHandler$1 = new OrderParamsGroupsV2ViewHolder$preProcessActionHandler$1(this);
        this.preProcessActionHandler = orderParamsGroupsV2ViewHolder$preProcessActionHandler$1;
        OrderParamsGroupsAdapter orderParamsGroupsAdapter = new OrderParamsGroupsAdapter(orderParamsGroupsV2ViewHolder$preProcessActionHandler$1, refs.getComposerViewPoolProvider().getViewPool());
        this.paramsGroupsAdapter = orderParamsGroupsAdapter;
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(orderParamsGroupsAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
        this.paramsGroupsRv = recyclerView;
        containerView.addView(recyclerView);
        C2399j.C(new C2408n0(C5427n.a(viewModel.uiStateFlow(), getLifecycle(), AbstractC5434v.b.CREATED), new AnonymousClass1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object _init_$handleAsyncUpdateState(OrderParamsGroupsV2ViewHolder orderParamsGroupsV2ViewHolder, OrderWidgetAsyncUiState orderWidgetAsyncUiState, d dVar) {
        orderParamsGroupsV2ViewHolder.handleAsyncUpdateState(orderWidgetAsyncUiState);
        return Unit.f71690a;
    }

    private final void handleAsyncUpdateState(OrderWidgetAsyncUiState uiState) {
        if (uiState != null) {
            if (uiState instanceof OrderWidgetAsyncUiState.Loading) {
                C2439a.b(0L, null, 3, this.refs.getController());
                return;
            }
            if (uiState instanceof OrderWidgetAsyncUiState.Loaded) {
                OrderWidgetAsyncUiState.Loaded loaded = (OrderWidgetAsyncUiState.Loaded) uiState;
                Map<String, String> trackingPayloads = loaded.getTrackingPayloads();
                if (trackingPayloads != null) {
                    this.tokenizedAnalytics.e(trackingPayloads);
                }
                this.refs.getController().update(loaded.getOrderWidgetUpdate());
                return;
            }
            if (!(uiState instanceof OrderWidgetAsyncUiState.Error)) {
                throw new o();
            }
            this.refs.getController().hideLoader();
            ViewGroup b11 = C2971a.b(this.refs);
            if (b11 != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this, 62, null).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderParamsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.setWidgetInfo(info);
        this.paramsGroupsAdapter.setItems(item.getParamsGroups());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderParamsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((OrderParamsGroupsV2ViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
