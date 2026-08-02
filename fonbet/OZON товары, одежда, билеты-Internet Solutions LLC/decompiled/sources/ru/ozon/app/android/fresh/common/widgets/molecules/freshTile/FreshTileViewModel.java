package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.I;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Ge.n;
import Sc.s;
import WZ.l;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.QuantCountStrategy;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.B0;
import xe.C10727i;
import xe.E0;
import xe.M;
import ze.EnumC11113a;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 e2\u00020\u0001:\u0001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u001a\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J5\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\nJ\u001b\u0010,\u001a\u00020\b2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b,\u0010\u000fJ\u0017\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\nJ1\u00109\u001a\u00020'2\u0006\u00102\u001a\u00020$2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J;\u0010>\u001a\u00020\u0017*\u00020\u00172\u0006\u0010;\u001a\u00020$2\u0006\u00106\u001a\u0002052\u0006\u0010<\u001a\u00020'2\u0006\u00109\u001a\u00020'2\u0006\u0010=\u001a\u00020'H\u0002¢\u0006\u0004\b>\u0010?J5\u0010C\u001a\u00020\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170A0@2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u0017H\u0002¢\u0006\u0004\bC\u0010DJQ\u0010H\u001a\u00020\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170A0@2*\u0010G\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170E\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170F0\u0016H\u0002¢\u0006\u0004\bH\u0010IJK\u0010R\u001a\u00020\u0019\"\u0004\b\u0000\u0010J*\b\u0012\u0004\u0012\u00028\u00000K2\u0006\u0010M\u001a\u00020L2\"\u0010Q\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0O\u0012\u0006\u0012\u0004\u0018\u00010P0NH\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR0\u0010\\\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002030Zj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u000203`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R&\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "", "onCleared", "()V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "init", "(LWZ/l;)V", "", "id", "Landroidx/lifecycle/v;", "lifecycle", "Landroidx/lifecycle/B;", "lifecycleScope", "Lkotlin/Function1;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "onUpdate", "Lxe/B0;", "observeActionBarState", "(Ljava/lang/Long;Landroidx/lifecycle/v;Landroidx/lifecycle/B;Lkotlin/jvm/functions/Function1;)Lxe/B0;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "observeAdditionalActions", "(Landroidx/lifecycle/v;Landroidx/lifecycle/B;Lkotlin/jvm/functions/Function1;)Lxe/B0;", "actionBar", "bindState", "(JLru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;)V", "itemId", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;", "quantityControl", "widgetId", "", "isIncrease", "changeProductQuantity", "(JLru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;JZ)V", "clear", "initCartObserver", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "onCartUpdate", "(Lru/ozon/app/android/cart/common/domain/CartState;)V", "initAdultStateObserver", "state", "Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "strategy", "", "newValue", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "cartItemInfo", "isIncrementDisabled", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;ILru/ozon/app/android/cart/common/models/CartItemInfo;)Z", "currentQuantityControl", "shouldAnimate", "isAdultConfirmed", "copyWithNewState", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;IZZZ)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "LAe/x0;", "", "newActionBarState", "updateById", "(LAe/x0;JLru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;)V", "", "Lkotlin/Pair;", "mapper", "updateEach", "(LAe/x0;Lkotlin/jvm/functions/Function1;)V", "T", "LAe/h;", "Lxe/M;", "scope", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "collector", "collectLatestIn", "(LAe/h;Lxe/M;Lkotlin/jvm/functions/Function2;)Lxe/B0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "cartListenerJob", "Lxe/B0;", "adultListenerJob", "cartUpdateJob", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "strategyList", "Ljava/util/HashMap;", "actionBarStateListFlow", "LAe/x0;", "additionalAction", "Lru/ozon/uni/atoms/af/AtomAction;", "Lze/h;", "additionalActionFlow", "Lze/h;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTileViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final x0<Map<Long, ProductActionBarVO>> actionBarStateListFlow;
    private AtomAction additionalAction;

    @NotNull
    private final h<AtomAction> additionalActionFlow;

    @NotNull
    private final AdultHandler adultHandler;
    private B0 adultListenerJob;
    private B0 cartListenerJob;

    @NotNull
    private final CartService cartService;
    private B0 cartUpdateJob;

    @NotNull
    private final HashMap<Long, QuantCountStrategy> strategyList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileViewModel$Companion;", "", "<init>", "()V", "CART_UPDATE_DELAY", "", "ANALYTICS_KEY_CLICK", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FreshTileViewModel(@NotNull CartService cartService, @NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.cartService = cartService;
        this.adultHandler = adultHandler;
        this.strategyList = new HashMap<>();
        this.actionBarStateListFlow = O0.a(U.c());
        this.additionalActionFlow = k.a(0, 5, EnumC11113a.DROP_OLDEST);
    }

    private final <T> B0 collectLatestIn(InterfaceC2395h<? extends T> interfaceC2395h, M m11, Function2<? super T, ? super d<? super Unit>, ? extends Object> function2) {
        return C10727i.c(m11, null, null, new FreshTileViewModel$collectLatestIn$1(interfaceC2395h, function2, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductActionBarVO copyWithNewState(ProductActionBarVO productActionBarVO, ProductActionBarVO.State.QuantityControl quantityControl, int i11, boolean z11, boolean z12, boolean z13) {
        ProductActionBarVO.State.QuantityControl copy;
        ProductActionBarVO.State.ActionIcon adultActionIcon = z13 ? null : productActionBarVO.getAdultActionIcon();
        copy = quantityControl.copy((r35 & 1) != 0 ? quantityControl.sku : 0L, (r35 & 2) != 0 ? quantityControl.selectedDeliverySchema : null, (r35 & 4) != 0 ? quantityControl.value : i11, (r35 & 8) != 0 ? quantityControl.valueText : TextDTO.copy$default(quantityControl.getValueText(), new OzonSpannableString(String.valueOf(i11)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), (r35 & 16) != 0 ? quantityControl.cartActionIcon : null, (r35 & 32) != 0 ? quantityControl.additionalAction : null, (r35 & 64) != 0 ? quantityControl.minValue : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? quantityControl.maxValue : 0, (r35 & 256) != 0 ? quantityControl.multiplicity : 0, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? quantityControl.quantSize : 0, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? quantityControl.decrementIconToken : null, (r35 & 2048) != 0 ? quantityControl.incrementIconToken : null, (r35 & 4096) != 0 ? quantityControl.trackingInfo : null, (r35 & 8192) != 0 ? quantityControl.isIncrementDisabled : z12, (r35 & 16384) != 0 ? quantityControl.shouldAnimate : z11);
        return ProductActionBarVO.copy$default(productActionBarVO, 0L, 0, null, copy, adultActionIcon, null, 39, null);
    }

    private final void initAdultStateObserver() {
        B0 b02 = this.adultListenerJob;
        if (b02 == null || !b02.isActive()) {
            B0 b03 = this.adultListenerJob;
            if (b03 != null) {
                b03.j(null);
            }
            this.adultListenerJob = C2399j.C(new C2408n0(n.a(this.adultHandler.observeUserAdultState()), new FreshTileViewModel$initAdultStateObserver$1(this, null)), androidx.lifecycle.x0.a(this));
        }
    }

    private final void initCartObserver(l tokenizedAnalytics) {
        B0 b02 = this.cartListenerJob;
        if (b02 == null || !b02.isActive()) {
            this.cartService.attach(tokenizedAnalytics);
            B0 b03 = this.cartListenerJob;
            if (b03 != null) {
                b03.j(null);
            }
            this.cartListenerJob = collectLatestIn(new I(n.a(CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null))), androidx.lifecycle.x0.a(this), new FreshTileViewModel$initCartObserver$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object initCartObserver$onCartUpdate(FreshTileViewModel freshTileViewModel, CartState cartState, d dVar) {
        freshTileViewModel.onCartUpdate(cartState);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isIncrementDisabled(ProductActionBarVO.State.QuantityControl state, QuantCountStrategy strategy, int newValue, CartItemInfo cartItemInfo) {
        if (strategy.isIncreaseEnabled(newValue)) {
            return newValue == 0 && cartItemInfo != null && cartItemInfo.getQuantity() > 0 && !Intrinsics.d(cartItemInfo.getSelectedDeliverySchema(), state.getSelectedDeliverySchema()) && state.getQuantSize() >= 0 && state.getSelectedDeliverySchema() != null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeActionBarState$suspendConversion0(Function1 function1, ProductActionBarVO productActionBarVO, d dVar) {
        function1.invoke(productActionBarVO);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeAdditionalActions$suspendConversion0$1(Function1 function1, AtomAction atomAction, d dVar) {
        function1.invoke(atomAction);
        return Unit.f71690a;
    }

    private final void onCartUpdate(CartState cartState) {
        updateEach(this.actionBarStateListFlow, new FreshTileViewModel$onCartUpdate$1(cartState, this));
    }

    private final void updateById(x0<Map<Long, ProductActionBarVO>> x0Var, long j11, ProductActionBarVO productActionBarVO) {
        Map<Long, ProductActionBarVO> value;
        Tc.d builder;
        do {
            value = x0Var.getValue();
            builder = new Tc.d();
            builder.putAll(value);
            builder.put(Long.valueOf(j11), productActionBarVO);
            Intrinsics.checkNotNullParameter(builder, "builder");
        } while (!x0Var.b(value, builder.u()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEach(x0<Map<Long, ProductActionBarVO>> x0Var, Function1<? super Map.Entry<Long, ProductActionBarVO>, Pair<Long, ProductActionBarVO>> function1) {
        Map<Long, ProductActionBarVO> value;
        ArrayList arrayList;
        do {
            value = x0Var.getValue();
            Map<Long, ProductActionBarVO> map = value;
            arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<Long, ProductActionBarVO>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(function1.invoke(it.next()));
            }
        } while (!x0Var.b(value, U.s(arrayList)));
    }

    public final void bindState(long id2, @NotNull ProductActionBarVO actionBar) {
        Map<Long, ProductActionBarVO> value;
        LinkedHashMap u11;
        Intrinsics.checkNotNullParameter(actionBar, "actionBar");
        ProductActionBarVO.State state = actionBar.getState();
        ProductActionBarVO.State.QuantityControl quantityControl = state instanceof ProductActionBarVO.State.QuantityControl ? (ProductActionBarVO.State.QuantityControl) state : null;
        if (quantityControl == null) {
            updateById(this.actionBarStateListFlow, id2, actionBar);
            return;
        }
        CartItemInfo cartItemInfo = this.cartService.getCartState().getItems().get(Long.valueOf(quantityControl.getSku()));
        int quantity = cartItemInfo != null ? cartItemInfo.getQuantity() : 0;
        QuantCountStrategy quantCountStrategy = this.strategyList.get(Long.valueOf(id2));
        if (quantCountStrategy == null) {
            quantCountStrategy = new QuantCountStrategy(quantityControl.getMultiplicity(), quantityControl.getMinValue(), quantityControl.getMaxValue(), quantityControl.getQuantSize());
            this.strategyList.put(Long.valueOf(id2), quantCountStrategy);
        }
        ProductActionBarVO copyWithNewState = copyWithNewState(actionBar, quantityControl, quantity, false, isIncrementDisabled(quantityControl, quantCountStrategy, quantity, this.cartService.getCartState().getItems().get(Long.valueOf(quantityControl.getSku()))), this.adultHandler.isUserAnAdult());
        x0<Map<Long, ProductActionBarVO>> x0Var = this.actionBarStateListFlow;
        do {
            value = x0Var.getValue();
            u11 = U.u(value);
            u11.put(Long.valueOf(id2), copyWithNewState);
        } while (!x0Var.b(value, u11));
    }

    public final void changeProductQuantity(long itemId, @NotNull ProductActionBarVO actionBar, @NotNull ProductActionBarVO.State.QuantityControl quantityControl, long widgetId, boolean isIncrease) {
        Map map;
        Intrinsics.checkNotNullParameter(actionBar, "actionBar");
        Intrinsics.checkNotNullParameter(quantityControl, "quantityControl");
        B0 b02 = this.cartUpdateJob;
        if (b02 != null) {
            b02.j(null);
        }
        String valueOf = String.valueOf(quantityControl.getSku());
        QuantCountStrategy quantCountStrategy = this.strategyList.get(Long.valueOf(itemId));
        if (quantCountStrategy == null) {
            return;
        }
        int quantIncrease = isIncrease ? quantCountStrategy.quantIncrease(quantityControl.getValue()) : quantCountStrategy.isDecreaseEnabled(quantityControl.getValue()) ? quantCountStrategy.quantDecrease(quantityControl.getValue()) : 0;
        updateById(this.actionBarStateListFlow, itemId, copyWithNewState(actionBar, quantityControl, quantIncrease, true, isIncrementDisabled(quantityControl, quantCountStrategy, quantIncrease, this.cartService.getCartState().getItems().get(Long.valueOf(quantityControl.getSku()))), this.adultHandler.isUserAnAdult()));
        Map<String, TokenizedTrackingInfo> trackingInfo = quantityControl.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedTrackingInfo tokenizedTrackingInfo = (isIncrease && quantityControl.getValue() == 0) ? trackingInfo.get(ActionType.TO_CART.INSTANCE.getType()) : isIncrease ? trackingInfo.get(ActionType.INCREMENT.INSTANCE.getType()) : quantIncrease == 0 ? trackingInfo.get(ActionType.REMOVE.INSTANCE.getType()) : trackingInfo.get(ActionType.DECREMENT.INSTANCE.getType());
            map = tokenizedTrackingInfo != null ? U.i(new Pair("click", tokenizedTrackingInfo)) : null;
        } else {
            map = null;
        }
        this.cartUpdateJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new FreshTileViewModel$changeProductQuantity$1(this, isIncrease, quantityControl, valueOf, quantIncrease, map, widgetId, null), 3);
        if (isIncrease && quantityControl.getValue() == 0 && quantIncrease > 0) {
            this.additionalAction = quantityControl.getAdditionalAction();
        }
    }

    public final void clear() {
        this.additionalAction = null;
        B0 b02 = this.cartListenerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.cartListenerJob = null;
        B0 b03 = this.adultListenerJob;
        if (b03 != null) {
            b03.j(null);
        }
        this.adultListenerJob = null;
        B0 b04 = this.cartUpdateJob;
        if (b04 != null) {
            b04.j(null);
        }
        this.cartUpdateJob = null;
        this.strategyList.clear();
        this.additionalActionFlow.l(null);
        this.actionBarStateListFlow.setValue(U.c());
        E0.d(androidx.lifecycle.x0.a(this).getCoroutineContext());
    }

    public final void init(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        initCartObserver(tokenizedAnalytics);
        initAdultStateObserver();
    }

    @NotNull
    public final B0 observeActionBarState(final Long id2, @NotNull AbstractC5434v lifecycle, @NotNull B lifecycleScope, @NotNull Function1<? super ProductActionBarVO, Unit> onUpdate) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        final InterfaceC2395h a11 = C5427n.a(this.actionBarStateListFlow, lifecycle, AbstractC5434v.b.STARTED);
        return C2399j.C(new C2408n0(C2399j.o(new C2406m0(new InterfaceC2395h<ProductActionBarVO>() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel$observeActionBarState$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel$observeActionBarState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ Long $id$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel$observeActionBarState$$inlined$map$1$2", f = "FreshTileViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel$observeActionBarState$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, Long l11) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$id$inlined = l11;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Object obj3 = ((Map) obj).get(this.$id$inlined);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(obj3, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super ProductActionBarVO> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, id2), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        })), new FreshTileViewModel$observeActionBarState$2(onUpdate)), lifecycleScope);
    }

    @NotNull
    public final B0 observeAdditionalActions(@NotNull AbstractC5434v lifecycle, @NotNull B lifecycleScope, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        return C2399j.C(new C2408n0(new C2406m0(C5427n.a(C2399j.H(this.additionalActionFlow), lifecycle, AbstractC5434v.b.STARTED)), new FreshTileViewModel$observeAdditionalActions$1(onAction)), lifecycleScope);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        clear();
    }
}
