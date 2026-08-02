package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.I;
import Ge.n;
import Sc.o;
import WZ.l;
import WZ.t;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.QuantCountStrategy;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarType;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import xe.M;
import ze.EnumC11113a;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 i2\u00020\u0001:\u0001iB#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!JO\u0010,\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010\"2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b7\u00105J\u0017\u00109\u001a\u0002082\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b9\u0010:J1\u0010?\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020\u001f2\b\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010BJ\u0017\u0010E\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bE\u0010\u000fJG\u0010M\u001a\u00020\r2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0F2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0K2\u0006\u00103\u001a\u000202¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\r¢\u0006\u0004\bO\u0010BR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010PR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010VR\u001e\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010WR\u001e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\\R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010`R\u0018\u0010a\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0016\u0010h\u001a\u0004\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006j"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/ProductActionBarDelegate;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$ActionListener;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "state", "", "bind", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;)V", "hydrateState", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "handleClickAction", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "isIncrement", "handleQuantityChange", "(Z)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;", "quantityPicker", "Lkotlin/Pair;", "", "getOptimisticUpdateFromQuantityChangeEvent", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;Z)Lkotlin/Pair;", "", "widgetId", "", "actionId", "sku", "desiredQuantity", "deliverySchema", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "startCartUpdate", "(JLjava/lang/String;JILjava/lang/Long;Ljava/util/Map;)V", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "onCartUpdate", "(Lru/ozon/app/android/cart/common/domain/CartState;)V", "Landroidx/lifecycle/v;", "lifecycle", "initCartObserver", "(Landroidx/lifecycle/v;)V", "initAdultStateObserver", "initActionsObserver", "Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "getOrCreateStrategy", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;)Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "strategy", "newValue", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "cartItemInfo", "isIncrementDisabled", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;ILru/ozon/app/android/cart/common/models/CartItemInfo;)Z", "onActionIconClick", "()V", "onPlusClick", "onMinusClick", "setState", "Lkotlin/Function0;", "Lxe/M;", "coroutineScopeProvider", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2;", "viewProvider", "Lkotlin/Function1;", "actionHandler", "onAttach", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/v;)V", "onDetach", "LWZ/l;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lze/h;", "actionsChannel", "Lze/h;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "currentState", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "Lxe/B0;", "cartListenerJob", "Lxe/B0;", "adultListenerJob", "cartUpdateJob", "actionsListenerJob", "Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "pendingAdditionalAction", "Lru/ozon/uni/atoms/af/AtomAction;", "getView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2;", "view", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductActionBarDelegate implements ProductActionBarViewV2.ActionListener {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final ProductActionBarType[] typesToAnimate = {ProductActionBarType.BUTTON_A2C, ProductActionBarType.QUANTITY_PICKER};

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final h<AtomAction> actionsChannel;
    private B0 actionsListenerJob;

    @NotNull
    private final AdultHandler adultHandler;
    private B0 adultListenerJob;
    private B0 cartListenerJob;

    @NotNull
    private final CartService cartService;
    private B0 cartUpdateJob;

    @NotNull
    private Function0<? extends M> coroutineScopeProvider;
    private ProductActionBarVOV2 currentState;
    private AtomAction pendingAdditionalAction;
    private QuantCountStrategy strategy;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private Function0<ProductActionBarViewV2> viewProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/ProductActionBarDelegate$Companion;", "", "<init>", "()V", "", "ANALYTICS_KEY_CLICK", "Ljava/lang/String;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductActionBarType.values().length];
            try {
                iArr[ProductActionBarType.BUTTON_ADULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductActionBarType.OUT_OF_STOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductActionBarType.QUANTITY_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductActionBarType.BUTTON_A2C.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProductActionBarDelegate(@NotNull l tokenizedAnalytics, @NotNull AdultHandler adultHandler, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adultHandler = adultHandler;
        this.cartService = cartService;
        this.actionsChannel = k.a(1, 4, EnumC11113a.DROP_OLDEST);
        this.actionHandler = ProductActionBarDelegate$actionHandler$1.INSTANCE;
        this.viewProvider = ProductActionBarDelegate$viewProvider$1.INSTANCE;
        this.coroutineScopeProvider = ProductActionBarDelegate$coroutineScopeProvider$1.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r1 != r0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bind(ProductActionBarVOV2 state) {
        ProductActionBarViewV2.State createViewData;
        ProductActionBarVOV2.ActionIconVO cartActionIcon;
        ProductActionBarViewV2.CommonStyles createViewData2 = ProductActionBarMapperV2Kt.createViewData(state.getCustomStyle());
        ProductActionBarType type = state.getType();
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            ProductActionBarVOV2.ActionIconVO adultActionIcon = state.getAdultActionIcon();
            if (adultActionIcon == null) {
                return;
            } else {
                createViewData = ProductActionBarMapperV2Kt.createViewData(adultActionIcon, createViewData2);
            }
        } else if (i11 == 2) {
            ProductActionBarVOV2.ActionIconVO outOfStockActionIcon = state.getOutOfStockActionIcon();
            if (outOfStockActionIcon == null) {
                return;
            } else {
                createViewData = ProductActionBarMapperV2Kt.createViewData(outOfStockActionIcon, createViewData2);
            }
        } else if (i11 == 3) {
            ProductActionBarVOV2.QuantityPickerVO quantityPicker = state.getQuantityPicker();
            if (quantityPicker == null) {
                return;
            } else {
                createViewData = ProductActionBarMapperV2Kt.createViewData(quantityPicker, createViewData2);
            }
        } else {
            if (i11 != 4) {
                throw new o();
            }
            ProductActionBarVOV2.QuantityPickerVO quantityPicker2 = state.getQuantityPicker();
            if (quantityPicker2 == null || (cartActionIcon = quantityPicker2.getCartActionIcon()) == null) {
                return;
            } else {
                createViewData = ProductActionBarMapperV2Kt.createViewData(cartActionIcon, createViewData2);
            }
        }
        ProductActionBarVOV2 productActionBarVOV2 = this.currentState;
        ProductActionBarType type2 = productActionBarVOV2 != null ? productActionBarVOV2.getType() : null;
        if (this.currentState != null) {
            ProductActionBarType[] productActionBarTypeArr = typesToAnimate;
            if (C7705l.m(productActionBarTypeArr, type)) {
                if (C7705l.m(productActionBarTypeArr, type2)) {
                }
            }
        }
        z11 = false;
        ProductActionBarViewV2 view = getView();
        if (view != null) {
            view.bind(createViewData, z11, this);
        }
    }

    private final M getCoroutineScope() {
        return this.coroutineScopeProvider.invoke();
    }

    private final Pair<ProductActionBarVOV2, Integer> getOptimisticUpdateFromQuantityChangeEvent(ProductActionBarVOV2 state, ProductActionBarVOV2.QuantityPickerVO quantityPicker, boolean isIncrement) {
        QuantCountStrategy orCreateStrategy = getOrCreateStrategy(quantityPicker);
        int quantIncrease = isIncrement ? orCreateStrategy.quantIncrease(quantityPicker.getValue()) : orCreateStrategy.isDecreaseEnabled(quantityPicker.getValue()) ? orCreateStrategy.quantDecrease(quantityPicker.getValue()) : 0;
        return new Pair<>(state.copyWithNewQuantity(quantityPicker, quantIncrease, isIncrementDisabled(quantityPicker, getOrCreateStrategy(quantityPicker), quantIncrease, this.cartService.getCartState().getItems().get(Long.valueOf(quantityPicker.getSku())))), Integer.valueOf(quantIncrease));
    }

    private final QuantCountStrategy getOrCreateStrategy(ProductActionBarVOV2.QuantityPickerVO quantityPicker) {
        QuantCountStrategy quantCountStrategy = this.strategy;
        if (quantCountStrategy != null) {
            return quantCountStrategy;
        }
        QuantCountStrategy quantCountStrategy2 = new QuantCountStrategy(quantityPicker.getMultiplicity(), quantityPicker.getMinValue(), quantityPicker.getMaxValue(), quantityPicker.getQuantSize());
        this.strategy = quantCountStrategy2;
        return quantCountStrategy2;
    }

    private final ProductActionBarViewV2 getView() {
        return this.viewProvider.invoke();
    }

    private final void handleClickAction(AtomAction action, t tokenizedEvent) {
        if (action == null) {
            return;
        }
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        this.actionHandler.invoke(action);
    }

    private final void handleQuantityChange(boolean isIncrement) {
        ProductActionBarVOV2.QuantityPickerVO quantityPicker;
        ProductActionBarVOV2 productActionBarVOV2 = this.currentState;
        if (productActionBarVOV2 == null || (quantityPicker = productActionBarVOV2.getQuantityPicker()) == null) {
            return;
        }
        String str = isIncrement ? "plusButtonClick" : "minusButtonClick";
        Pair<ProductActionBarVOV2, Integer> optimisticUpdateFromQuantityChangeEvent = getOptimisticUpdateFromQuantityChangeEvent(productActionBarVOV2, quantityPicker, isIncrement);
        ProductActionBarVOV2 a11 = optimisticUpdateFromQuantityChangeEvent.a();
        int intValue = optimisticUpdateFromQuantityChangeEvent.b().intValue();
        bind(a11);
        this.currentState = a11;
        if (isIncrement && quantityPicker.getValue() == 0 && intValue > 0) {
            this.pendingAdditionalAction = quantityPicker.getAdditionalAction();
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = quantityPicker.getTrackingInfo();
        Map<String, TokenizedTrackingInfo> map = null;
        if (trackingInfo != null) {
            TokenizedTrackingInfo tokenizedTrackingInfo = (isIncrement && quantityPicker.getValue() == 0) ? trackingInfo.get(ActionType.TO_CART.INSTANCE.getType()) : isIncrement ? trackingInfo.get(ActionType.INCREMENT.INSTANCE.getType()) : intValue == 0 ? trackingInfo.get(ActionType.REMOVE.INSTANCE.getType()) : trackingInfo.get(ActionType.DECREMENT.INSTANCE.getType());
            if (tokenizedTrackingInfo != null) {
                map = U.i(new Pair("click", tokenizedTrackingInfo));
            }
        }
        startCartUpdate(a11.getWidgetId(), str, quantityPicker.getSku(), intValue, quantityPicker.getSelectedDeliverySchema(), map);
    }

    private final ProductActionBarVOV2 hydrateState(ProductActionBarVOV2 state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    throw new o();
                }
                ProductActionBarVOV2.QuantityPickerVO quantityPicker = state.getQuantityPicker();
                if (quantityPicker != null) {
                    CartItemInfo cartItemInfo = this.cartService.getCartState().getItems().get(Long.valueOf(quantityPicker.getSku()));
                    int quantity = cartItemInfo != null ? cartItemInfo.getQuantity() : 0;
                    return (quantityPicker.getValue() == quantity && quantityPicker.getIsIncrementDisabled() == isIncrementDisabled(quantityPicker, getOrCreateStrategy(quantityPicker), quantity, cartItemInfo)) ? state : state.copyWithNewQuantity(quantityPicker, quantity, isIncrementDisabled(quantityPicker, getOrCreateStrategy(quantityPicker), quantity, cartItemInfo));
                }
            }
        } else if (this.adultHandler.isUserAnAdult()) {
            return ProductActionBarVOV2.copy$default(state, 0L, null, null, null, null, 27, null);
        }
        return state;
    }

    private final void initActionsObserver(AbstractC5434v lifecycle) {
        B0 b02 = this.actionsListenerJob;
        if (b02 != null) {
            b02.j(null);
        }
        M coroutineScope = getCoroutineScope();
        if (coroutineScope == null) {
            return;
        }
        this.actionsListenerJob = C2399j.C(new C2408n0(C5427n.a(C2399j.H(this.actionsChannel), lifecycle, AbstractC5434v.b.STARTED), new ProductActionBarDelegate$initActionsObserver$1(this, null)), coroutineScope);
    }

    private final void initAdultStateObserver(AbstractC5434v lifecycle) {
        B0 b02 = this.adultListenerJob;
        if (b02 != null) {
            b02.j(null);
        }
        M coroutineScope = getCoroutineScope();
        if (coroutineScope == null) {
            return;
        }
        this.adultListenerJob = C2399j.C(new C2408n0(C5427n.a(n.a(this.adultHandler.observeUserAdultState()), lifecycle, AbstractC5434v.b.STARTED), new ProductActionBarDelegate$initAdultStateObserver$1(this, null)), coroutineScope);
    }

    private final void initCartObserver(AbstractC5434v lifecycle) {
        B0 b02 = this.cartListenerJob;
        if (b02 != null) {
            b02.j(null);
        }
        M coroutineScope = getCoroutineScope();
        if (coroutineScope == null) {
            return;
        }
        this.cartService.attach(this.tokenizedAnalytics);
        this.cartListenerJob = C2399j.C(new C2408n0(C5427n.a(new I(n.a(CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null))), lifecycle, AbstractC5434v.b.STARTED), new ProductActionBarDelegate$initCartObserver$1(this)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object initCartObserver$onCartUpdate(ProductActionBarDelegate productActionBarDelegate, CartState cartState, d dVar) {
        productActionBarDelegate.onCartUpdate(cartState);
        return Unit.f71690a;
    }

    private final boolean isIncrementDisabled(ProductActionBarVOV2.QuantityPickerVO state, QuantCountStrategy strategy, int newValue, CartItemInfo cartItemInfo) {
        if (strategy.isIncreaseEnabled(newValue)) {
            return newValue == 0 && cartItemInfo != null && cartItemInfo.getQuantity() > 0 && !Intrinsics.d(cartItemInfo.getSelectedDeliverySchema(), state.getSelectedDeliverySchema()) && state.getQuantSize() >= 0 && state.getSelectedDeliverySchema() != null;
        }
        return true;
    }

    private final void onCartUpdate(CartState cartState) {
        ProductActionBarVOV2.QuantityPickerVO quantityPicker;
        ProductActionBarVOV2 productActionBarVOV2 = this.currentState;
        if (productActionBarVOV2 == null || (quantityPicker = productActionBarVOV2.getQuantityPicker()) == null) {
            return;
        }
        CartItemInfo cartItemInfo = cartState.getItems().get(Long.valueOf(productActionBarVOV2.getQuantityPicker().getSku()));
        int quantity = cartItemInfo != null ? cartItemInfo.getQuantity() : 0;
        if (quantityPicker.getValue() != quantity) {
            ProductActionBarVOV2 copyWithNewQuantity = productActionBarVOV2.copyWithNewQuantity(quantityPicker, quantity, isIncrementDisabled(quantityPicker, getOrCreateStrategy(quantityPicker), quantity, cartItemInfo));
            bind(copyWithNewQuantity);
            this.currentState = copyWithNewQuantity;
        } else if (this.pendingAdditionalAction != null && cartState.getSource() == CartSource.REMOTE && Intrinsics.d(this.pendingAdditionalAction, quantityPicker.getAdditionalAction())) {
            this.pendingAdditionalAction = null;
            M coroutineScope = getCoroutineScope();
            if (coroutineScope != null) {
                C10727i.c(coroutineScope, null, null, new ProductActionBarDelegate$onCartUpdate$1(quantityPicker, this, null), 3);
            }
        }
    }

    private final void startCartUpdate(long widgetId, String actionId, long sku, int desiredQuantity, Long deliverySchema, Map<String, TokenizedTrackingInfo> trackingInfo) {
        B0 b02 = this.cartUpdateJob;
        if (b02 != null) {
            b02.j(null);
        }
        M coroutineScope = getCoroutineScope();
        this.cartUpdateJob = coroutineScope != null ? C10727i.c(coroutineScope, null, null, new ProductActionBarDelegate$startCartUpdate$1(this, sku, desiredQuantity, deliverySchema, trackingInfo, widgetId, actionId, null), 3) : null;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2.ActionListener
    public void onActionIconClick() {
        ProductActionBarVOV2 productActionBarVOV2 = this.currentState;
        if (productActionBarVOV2 == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[productActionBarVOV2.getType().ordinal()];
        if (i11 == 1) {
            ProductActionBarVOV2.ActionIconVO adultActionIcon = productActionBarVOV2.getAdultActionIcon();
            AtomAction action = adultActionIcon != null ? adultActionIcon.getAction() : null;
            ProductActionBarVOV2.ActionIconVO adultActionIcon2 = productActionBarVOV2.getAdultActionIcon();
            handleClickAction(action, adultActionIcon2 != null ? adultActionIcon2.getTokenizedEvent() : null);
            return;
        }
        if (i11 != 2) {
            handleQuantityChange(true);
            return;
        }
        ProductActionBarVOV2.ActionIconVO outOfStockActionIcon = productActionBarVOV2.getOutOfStockActionIcon();
        AtomAction action2 = outOfStockActionIcon != null ? outOfStockActionIcon.getAction() : null;
        ProductActionBarVOV2.ActionIconVO outOfStockActionIcon2 = productActionBarVOV2.getOutOfStockActionIcon();
        handleClickAction(action2, outOfStockActionIcon2 != null ? outOfStockActionIcon2.getTokenizedEvent() : null);
    }

    public final void onAttach(@NotNull Function0<? extends M> coroutineScopeProvider, @NotNull Function0<ProductActionBarViewV2> viewProvider, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.coroutineScopeProvider = coroutineScopeProvider;
        this.actionHandler = actionHandler;
        this.viewProvider = viewProvider;
        initAdultStateObserver(lifecycle);
        initCartObserver(lifecycle);
        initActionsObserver(lifecycle);
    }

    public final void onDetach() {
        ProductActionBarViewV2 view = getView();
        if (view != null) {
            view.clear();
        }
        this.strategy = null;
        this.currentState = null;
        B0 b02 = this.cartUpdateJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.cartListenerJob;
        if (b03 != null) {
            b03.j(null);
        }
        B0 b04 = this.adultListenerJob;
        if (b04 != null) {
            b04.j(null);
        }
        B0 b05 = this.actionsListenerJob;
        if (b05 != null) {
            b05.j(null);
        }
        this.cartUpdateJob = null;
        this.cartListenerJob = null;
        this.adultListenerJob = null;
        this.actionsListenerJob = null;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2.ActionListener
    public void onMinusClick() {
        handleQuantityChange(false);
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2.ActionListener
    public void onPlusClick() {
        handleQuantityChange(true);
    }

    public final void setState(ProductActionBarVOV2 state) {
        if (state == null) {
            ProductActionBarViewV2 view = getView();
            if (view != null) {
                ViewExtKt.gone(view);
            }
        } else {
            ProductActionBarViewV2 view2 = getView();
            if (view2 != null) {
                ViewExtKt.show(view2);
            }
            state = hydrateState(state);
            if (!Intrinsics.d(state, this.currentState)) {
                bind(state);
            }
        }
        this.currentState = state;
    }
}
