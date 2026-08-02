package ru.ozon.app.android.account.orders.cancel.presentation;

import W10.c;
import Wc.a;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.account.orders.cancel.CancelOrderFlowActions;
import ru.ozon.app.android.account.orders.cancel.CancelReasonState;
import ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore;
import ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepository;
import ru.ozon.app.android.account.orders.cancel.data.CancelOrderResponse;
import ru.ozon.app.android.account.orders.cancel.data.CancelReasonMapper;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;
import ru.ozon.app.android.account.orders.data.model.errors.CancelOrderError;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeEvent;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.R$drawable;
import xe.C10727i;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Be\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010%J%\u0010,\u001a\u00020\u001d2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0018\u00010(H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u000201H\u0002¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u000201H\u0002¢\u0006\u0004\b5\u00103J\u0017\u00106\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u000201H\u0002¢\u0006\u0004\b6\u00103J\u0019\u00108\u001a\u00020\u001d2\b\u0010\u0006\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b8\u00109J\u001a\u0010:\u001a\u00020\u001d2\b\u0010\u0006\u001a\u0004\u0018\u000107H\u0082@¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u0010\u0006\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020\u001d2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0018\u00010(H\u0002¢\u0006\u0004\bC\u0010-J%\u0010D\u001a\u00020\u001d2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0018\u00010(H\u0002¢\u0006\u0004\bD\u0010-J\u0013\u0010G\u001a\u00020F*\u00020EH\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010LR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010OR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010PR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010QR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010RR \u0010T\u001a\b\u0012\u0004\u0012\u00020)0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010Y\u001a\b\u0012\u0004\u0012\u00020X0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010WR \u0010\\\u001a\b\u0012\u0004\u0012\u00020[0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010U\u001a\u0004\b]\u0010WR\"\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010U\u001a\u0004\b`\u0010WR&\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0a0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010U\u001a\u0004\bd\u0010WR&\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0e0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010U\u001a\u0004\bg\u0010WR \u0010j\u001a\b\u0012\u0004\u0012\u00020i0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR$\u0010n\u001a\u0004\u0018\u00010i8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006w"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVM;", "Lru/ozon/app/android/account/orders/cancel/data/CancelReasonMapper;", "cancelReasonMapper", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "data", "LW10/c;", "trackingData", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "orderChangeManager", "Lru/ozon/app/android/account/orders/cancel/data/CancelOrderRepository;", "cancelOrderRepository", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "actionAnalyticDelegate", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "cacheHandler", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "<init>", "(Lru/ozon/app/android/account/orders/cancel/data/CancelReasonMapper;Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;LW10/c;Lru/ozon/app/android/account/orders/OrderChangePreferences;Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;Lru/ozon/app/android/account/orders/cancel/data/CancelOrderRepository;Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "status", "handleCheckbox", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)V", "handleCancelAnywayDialogAction", "()V", "trackDoNotCancelDialogClick", "trackShowPriceUpDialog", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "processViewEvents", "(Ljava/util/Map;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "handleReasonClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "handleCancelOrderAction", "handleGetCancelPostingsAction", "handleAcceptEPointsAction", "Lru/ozon/app/android/account/orders/cancel/data/CancelOrderResponse;", "handleSuccessComposerAction", "(Lru/ozon/app/android/account/orders/cancel/data/CancelOrderResponse;)V", "handleCompletion", "(Lru/ozon/app/android/account/orders/cancel/data/CancelOrderResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeEvent;", "getFinalOrderChangeEvents", "(Lru/ozon/app/android/account/orders/cancel/data/CancelOrderResponse;)Ljava/util/Set;", "Lru/ozon/uni/atoms/af/AtomAction$Move;", "handleMove", "(Lru/ozon/uni/atoms/af/AtomAction$Move;)V", "processClickEvent", "sendAnalytics", "", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "toScreenStateWithOrderError", "(Ljava/lang/Throwable;)Lru/ozon/app/android/uikit/screenstate/ScreenState;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "LW10/c;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "Lru/ozon/app/android/account/orders/cancel/data/CancelOrderRepository;", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Landroidx/lifecycle/V;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/lifecycle/V;", "getTitle", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Button;", "button", "getButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "caption", "getCaption", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "checkbox", "getCheckbox", "", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "items", "getItems", "Lru/ozon/app/android/account/orders/cancel/CancelReasonState;", "cancelState", "getCancelState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "showEPointsDialogEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getShowEPointsDialogEvent", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "showPriceUpDialogData", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "getShowPriceUpDialogData", "()Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "setShowPriceUpDialogData", "(Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;)V", "Lru/ozon/app/android/account/orders/cancel/CancelReasonStateStore;", "stateStore", "Lru/ozon/app/android/account/orders/cancel/CancelReasonStateStore;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonViewModelImpl extends w0 implements CancelReasonVM {

    @NotNull
    private final ActionAnalyticDelegate actionAnalyticDelegate;

    @NotNull
    private final V<CancelReasonVO.Button> button;

    @NotNull
    private final CartPrefetchController cacheHandler;

    @NotNull
    private final CancelOrderRepository cancelOrderRepository;

    @NotNull
    private final V<CancelReasonState<String>> cancelState;

    @NotNull
    private final V<TextDTO> caption;

    @NotNull
    private final CartEventsController cartEventsController;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final V<CheckboxTitleSubtitleCellDTO> checkbox;

    @NotNull
    private final CancelReasonsWithPayloads data;

    @NotNull
    private final V<List<CancelReasonVO>> items;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final OrderChangeManager orderChangeManager;

    @NotNull
    private final OrderChangePreferences orderChangePreferences;

    @NotNull
    private final SingleLiveEvent<ConfirmingCancellationPopover> showEPointsDialogEvent;
    private ConfirmingCancellationPopover showPriceUpDialogData;

    @NotNull
    private final CancelReasonStateStore stateStore;

    @NotNull
    private final V<String> title;

    @NotNull
    private final c trackingData;

    public CancelReasonViewModelImpl(@NotNull CancelReasonMapper cancelReasonMapper, @NotNull CancelReasonsWithPayloads data, @NotNull c trackingData, @NotNull OrderChangePreferences orderChangePreferences, @NotNull OrderChangeManager orderChangeManager, @NotNull CancelOrderRepository cancelOrderRepository, @NotNull ActionAnalyticDelegate actionAnalyticDelegate, @NotNull CartPrefetchController cacheHandler, @NotNull CartService cartService, @NotNull CartEventsController cartEventsController, @NotNull ComposerNavigator navigator) {
        CheckBoxDTO checkbox;
        Intrinsics.checkNotNullParameter(cancelReasonMapper, "cancelReasonMapper");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(orderChangePreferences, "orderChangePreferences");
        Intrinsics.checkNotNullParameter(orderChangeManager, "orderChangeManager");
        Intrinsics.checkNotNullParameter(cancelOrderRepository, "cancelOrderRepository");
        Intrinsics.checkNotNullParameter(actionAnalyticDelegate, "actionAnalyticDelegate");
        Intrinsics.checkNotNullParameter(cacheHandler, "cacheHandler");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.data = data;
        this.trackingData = trackingData;
        this.orderChangePreferences = orderChangePreferences;
        this.orderChangeManager = orderChangeManager;
        this.cancelOrderRepository = cancelOrderRepository;
        this.actionAnalyticDelegate = actionAnalyticDelegate;
        this.cacheHandler = cacheHandler;
        this.cartService = cartService;
        this.cartEventsController = cartEventsController;
        this.navigator = navigator;
        this.title = new V<>(data.getCancelReasons().getTitle());
        this.button = new V<>(new CancelReasonVO.Button(data.getCancelReasons().getButton(), false));
        this.caption = new V<>(data.getCancelReasons().getCaption());
        this.checkbox = new V<>(data.getCancelReasons().getCheckbox());
        this.items = new V<>();
        this.cancelState = new V<>();
        this.showEPointsDialogEvent = new SingleLiveEvent<>();
        CancelReasonStateStore cancelReasonStateStore = new CancelReasonStateStore(cancelReasonMapper.map(data.getCancelReasons()), x0.a(this));
        C10727i.c(x0.a(this), null, null, new CancelReasonViewModelImpl$stateStore$1$1$1(cancelReasonStateStore, this, null), 3);
        CheckboxTitleSubtitleCellDTO checkbox2 = data.getCancelReasons().getCheckbox();
        if (checkbox2 != null && (checkbox = checkbox2.getCheckbox()) != null) {
            cancelReasonStateStore.setCheckbox(new CancelReasonVO.Checkbox(checkbox.getState(), checkbox.getStatus()));
        }
        ConfirmingCancellationPopover confirmPopover = data.getCancelReasons().getConfirmPopover();
        if (confirmPopover != null) {
            setShowPriceUpDialogData(confirmPopover);
        }
        this.stateStore = cancelReasonStateStore;
    }

    private final Set<OrderChangeEvent> getFinalOrderChangeEvents(CancelOrderResponse data) {
        if ((data != null ? data.getMessage() : null) == null) {
            return e0.h(OrderChangeEvent.RefreshScreen.INSTANCE);
        }
        OrderChangeEvent[] elements = {new OrderChangeEvent.ShowMessage(data.getMessage(), Integer.valueOf(R$drawable.ic_m_confirmed)), OrderChangeEvent.RefreshScreen.INSTANCE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    private final void handleAcceptEPointsAction(AtomAction.ComposerAction action) {
        C10727i.c(x0.a(this), null, null, new CancelReasonViewModelImpl$handleAcceptEPointsAction$1(this, action, null), 3);
    }

    private final void handleCancelOrderAction(AtomAction.ComposerAction action) {
        C10727i.c(x0.a(this), null, null, new CancelReasonViewModelImpl$handleCancelOrderAction$1(this, action, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleCompletion(CancelOrderResponse cancelOrderResponse, d<? super Unit> dVar) {
        getCancelState().postValue(new CancelReasonState.Success(cancelOrderResponse != null ? cancelOrderResponse.getMessage() : null));
        this.orderChangePreferences.markAsUpdated();
        Object putEvents = this.orderChangeManager.putEvents(getFinalOrderChangeEvents(cancelOrderResponse), dVar);
        return putEvents == a.COROUTINE_SUSPENDED ? putEvents : Unit.f71690a;
    }

    private final void handleComposerAction(AtomAction.ComposerAction action) {
        processClickEvent(action.getTrackingInfo());
        String id2 = action.getId();
        if (Intrinsics.d(id2, CancelOrderFlowActions.CANCEL_ORDER.getActionId())) {
            handleCancelOrderAction(action);
        } else if (Intrinsics.d(id2, CancelOrderFlowActions.GET_CANCEL_POSTINGS.getActionId())) {
            handleGetCancelPostingsAction(action);
        } else if (Intrinsics.d(id2, CancelOrderFlowActions.ACCEPT_E_POINTS.getActionId())) {
            handleAcceptEPointsAction(action);
        }
    }

    private final void handleGetCancelPostingsAction(AtomAction.ComposerAction action) {
        C10727i.c(x0.a(this), null, null, new CancelReasonViewModelImpl$handleGetCancelPostingsAction$1(this, action, null), 3);
    }

    private final void handleMove(AtomAction.Move action) {
        String link = action.getLink();
        if (link != null) {
            ComposerNavigator composerNavigator = this.navigator;
            Map<String, String> params = action.getParams();
            if (params == null) {
                params = U.c();
            }
            composerNavigator.openDeeplink(link, params);
        }
    }

    private final void handleReasonClick(AtomAction.Click action) {
        String str;
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("reasonId")) == null) {
            return;
        }
        this.stateStore.setSelectedReasonId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccessComposerAction(CancelOrderResponse data) {
        C10727i.c(x0.a(this), null, null, new CancelReasonViewModelImpl$handleSuccessComposerAction$1(this, data, null), 3);
    }

    private final void processClickEvent(Map<String, TokenizedTrackingInfo> trackingInfo) {
        if (trackingInfo != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, TokenizedTrackingInfo> entry : trackingInfo.entrySet()) {
                if (Intrinsics.d(entry.getKey(), ActionType.CLICK.INSTANCE.getType())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            sendAnalytics(linkedHashMap);
        }
    }

    private final void sendAnalytics(Map<String, TokenizedTrackingInfo> trackingInfo) {
        this.actionAnalyticDelegate.sendAnalytics(trackingInfo, this.data.getTrackingPayloads(), this.trackingData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScreenState toScreenStateWithOrderError(Throwable th2) {
        return th2 instanceof CancelOrderError ? new ScreenState.Custom(null, th2.getMessage(), null, null, null, null, null, null, 252, null) : ScreenStateExtKt.toScreenState$default(th2, null, false, 3, null);
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    public ConfirmingCancellationPopover getShowPriceUpDialogData() {
        return this.showPriceUpDialogData;
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    public void handleAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Click) {
            handleReasonClick((AtomAction.Click) action);
            return;
        }
        if (action instanceof AtomAction.ComposerAction) {
            handleComposerAction((AtomAction.ComposerAction) action);
        } else if (action instanceof AtomAction.TextChange) {
            this.stateStore.setComment(((AtomAction.TextChange) action).getText());
        } else if (action instanceof AtomAction.Move) {
            handleMove((AtomAction.Move) action);
        }
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    public void handleCancelAnywayDialogAction() {
        AtomAction atomAction;
        ButtonV3Atom.LargeButton button;
        AtomActionDTO action;
        ButtonV3DTO confirm;
        AtomActionDTO nextAction;
        ButtonV3DTO confirm2;
        ConfirmingCancellationPopover value = getShowEPointsDialogEvent().getValue();
        AtomAction atomAction2 = null;
        r1 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        atomAction2 = null;
        atomAction2 = null;
        if (value == null || (nextAction = value.getNextAction()) == null) {
            atomAction = null;
        } else {
            ConfirmingCancellationPopover value2 = getShowEPointsDialogEvent().getValue();
            atomAction = AtomActionMapperKt.toAtomAction(nextAction, (value2 == null || (confirm2 = value2.getConfirm()) == null) ? null : confirm2.getTrackingInfo());
        }
        CancelReasonVO.Button value3 = getButton().getValue();
        if (value3 != null && (button = value3.getButton()) != null && (action = button.getAction()) != null) {
            ConfirmingCancellationPopover showPriceUpDialogData = getShowPriceUpDialogData();
            if (showPriceUpDialogData != null && (confirm = showPriceUpDialogData.getConfirm()) != null) {
                map = confirm.getTrackingInfo();
            }
            atomAction2 = AtomActionMapperKt.toAtomAction(action, map);
        }
        if (atomAction != null) {
            handleAction(atomAction);
        } else if (atomAction2 != null) {
            handleAction(atomAction2);
        }
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    public void handleCheckbox(CheckBoxDTO.CheckboxStatus status) {
        CancelReasonStateStore cancelReasonStateStore = this.stateStore;
        cancelReasonStateStore.setCheckbox(CancelReasonVO.Checkbox.copy$default(cancelReasonStateStore.getCheckbox(), null, status, 1, null));
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    public void processViewEvents(Map<String, TokenizedTrackingInfo> trackingInfo) {
        if (trackingInfo != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, TokenizedTrackingInfo> entry : trackingInfo.entrySet()) {
                if (Intrinsics.d(entry.getKey(), ActionType.VIEW.INSTANCE.getType())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            sendAnalytics(linkedHashMap);
        }
    }

    public void setShowPriceUpDialogData(ConfirmingCancellationPopover confirmingCancellationPopover) {
        this.showPriceUpDialogData = confirmingCancellationPopover;
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    public void trackDoNotCancelDialogClick() {
        ButtonV3DTO cancel;
        ButtonV3DTO cancel2;
        ConfirmingCancellationPopover value = getShowEPointsDialogEvent().getValue();
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> trackingInfo = (value == null || (cancel2 = value.getCancel()) == null) ? null : cancel2.getTrackingInfo();
        ConfirmingCancellationPopover showPriceUpDialogData = getShowPriceUpDialogData();
        if (showPriceUpDialogData != null && (cancel = showPriceUpDialogData.getCancel()) != null) {
            map = cancel.getTrackingInfo();
        }
        if (trackingInfo == null) {
            trackingInfo = map;
        }
        processClickEvent(trackingInfo);
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    public void trackShowPriceUpDialog() {
        ButtonV3Atom.LargeButton button;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CancelReasonVO.Button value = getButton().getValue();
        if (value == null || (button = value.getButton()) == null || (trackingInfo = button.getTrackingInfo()) == null) {
            return;
        }
        processClickEvent(trackingInfo);
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    @NotNull
    public V<CancelReasonVO.Button> getButton() {
        return this.button;
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    @NotNull
    public V<CancelReasonState<String>> getCancelState() {
        return this.cancelState;
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    @NotNull
    public V<TextDTO> getCaption() {
        return this.caption;
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    @NotNull
    public V<CheckboxTitleSubtitleCellDTO> getCheckbox() {
        return this.checkbox;
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    @NotNull
    public V<List<CancelReasonVO>> getItems() {
        return this.items;
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    @NotNull
    public SingleLiveEvent<ConfirmingCancellationPopover> getShowEPointsDialogEvent() {
        return this.showEPointsDialogEvent;
    }

    @Override // ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVM
    @NotNull
    public V<String> getTitle() {
        return this.title;
    }
}
