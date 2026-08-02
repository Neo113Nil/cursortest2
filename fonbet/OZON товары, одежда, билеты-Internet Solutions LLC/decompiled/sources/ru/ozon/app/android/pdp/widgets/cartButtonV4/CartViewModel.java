package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import AA.d;
import B0.C2454a;
import B90.C2618u;
import Bc.f;
import Bc.h;
import Bc.j;
import Bt.C2673b;
import Fn.C3055d;
import Kk.c;
import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sh.b;
import WZ.l;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.y;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartAction;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import sc.C9653a;
import vc.C10299d;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 S2\u00020\u0001:\u0002STB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JU\u0010\u0013\u001a\u00020\u00122\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010#\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J+\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010'J3\u0010*\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010$J#\u00103\u001a\u00020\u00122\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002010\u0006H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R!\u0010B\u001a\b\u0012\u0004\u0012\u00020=0<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020=0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120C8\u0006¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\bG\u0010HR(\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010IR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010JR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "", "", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/PDPCartItemInfo;", "items", "widgetId", "Lkotlin/Pair;", "sku", "LWZ/l;", "tokenizedAnalytics", "", "isUpdateData", "", "bind", "(Ljava/util/Map;Ljava/lang/Long;Lkotlin/Pair;LWZ/l;Z)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "cartVo", "Lru/ozon/uni/atoms/af/AtomAction;", "additionalAction", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "cartMode", "addToCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)V", "incrementCount", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)V", "decrementCount", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "forceUpdate", "handleCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;Z)V", "", "operationId", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "count", "updateCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;ILjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "handleLastCartState", "(Z)V", "clearProductCount", "()V", "updateProductCount", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "products", "proceedExpressSheet", "(Ljava/util/Map;)V", "isShow", "visibleForStarsLoader", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;Z)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ProductCount;", "createUpdateAction", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ProductCount;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;", "action$delegate", "LSc/j;", "getAction", "()Landroidx/lifecycle/P;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "_action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "showRecommendations", "getShowRecommendations", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Ljava/util/Map;", "Ljava/lang/Long;", "Lkotlin/Pair;", "lastAction", "Ljava/lang/String;", "isShowRecommendations", "Z", "isInitialUpdateData", "lastCartMode", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "Companion", "Action", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> _action;

    /* renamed from: action$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j action;

    @NotNull
    private final CartService cartService;
    private boolean isInitialUpdateData;
    private boolean isShowRecommendations;

    @NotNull
    private Map<Long, ? extends Set<PDPCartItemInfo>> items;
    private String lastAction;
    private DoubleCartVO.CartMode lastCartMode;

    @NotNull
    private final SingleLiveEvent<Unit> showRecommendations;

    @NotNull
    private Pair<Long, Long> sku;
    private Long widgetId;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function1<CartState, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, CartViewModel.class, "handleCartState", "handleCartState(Lru/ozon/app/android/cart/common/domain/CartState;Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CartState cartState) {
            invoke2(cartState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CartState p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            CartViewModel.handleCartState$default((CartViewModel) this.receiver, p02, false, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/models/CartAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/models/CartAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<CartAction, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CartAction cartAction) {
            invoke2(cartAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CartAction cartAction) {
            if (cartAction instanceof CartAction.CartSuccess) {
                CartViewModel.this.proceedExpressSheet(((CartAction.CartSuccess) cartAction).getProducts());
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass4(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;", "", "<init>", "()V", "ProductCount", "ExpressSheet", "DoAction", "ShowLoader", "ShowRelatedProductsBottomSheet", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$DoAction;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ExpressSheet;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ProductCount;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ShowLoader;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ShowRelatedProductsBottomSheet;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$DoAction;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DoAction extends Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction atomAction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoAction(@NotNull AtomAction atomAction) {
                super(null);
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DoAction) && Intrinsics.d(this.atomAction, ((DoAction) other).atomAction);
            }

            @NotNull
            public final AtomAction getAtomAction() {
                return this.atomAction;
            }

            public int hashCode() {
                return this.atomAction.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("DoAction(atomAction=", ")", this.atomAction);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ExpressSheet;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;", "", "selectedDeliverySchema", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSelectedDeliverySchema", "()J", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ExpressSheet extends Action {
            private final long selectedDeliverySchema;

            public ExpressSheet(long j11) {
                super(null);
                this.selectedDeliverySchema = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExpressSheet) && this.selectedDeliverySchema == ((ExpressSheet) other).selectedDeliverySchema;
            }

            public final long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            public int hashCode() {
                return Long.hashCode(this.selectedDeliverySchema);
            }

            @NotNull
            public String toString() {
                return b.b(this.selectedDeliverySchema, "ExpressSheet(selectedDeliverySchema=", ")");
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ProductCount;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;", "", "productId", "", "quantity", "selectedDeliverySchema", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "cartMode", "", "isUpdateAction", "<init>", "(JILjava/lang/Long;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getProductId", "()J", "I", "getQuantity", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "getCartMode", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductCount extends Action {
            private final DoubleCartVO.CartMode cartMode;
            private final boolean isUpdateAction;
            private final long productId;
            private final int quantity;
            private final Long selectedDeliverySchema;

            public /* synthetic */ ProductCount(long j11, int i11, Long l11, DoubleCartVO.CartMode cartMode, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, i11, l11, cartMode, (i12 & 16) != 0 ? false : z11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProductCount)) {
                    return false;
                }
                ProductCount productCount = (ProductCount) other;
                return this.productId == productCount.productId && this.quantity == productCount.quantity && Intrinsics.d(this.selectedDeliverySchema, productCount.selectedDeliverySchema) && this.cartMode == productCount.cartMode && this.isUpdateAction == productCount.isUpdateAction;
            }

            public final DoubleCartVO.CartMode getCartMode() {
                return this.cartMode;
            }

            public final long getProductId() {
                return this.productId;
            }

            public final int getQuantity() {
                return this.quantity;
            }

            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.quantity, Long.hashCode(this.productId) * 31, 31);
                Long l11 = this.selectedDeliverySchema;
                int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
                DoubleCartVO.CartMode cartMode = this.cartMode;
                return Boolean.hashCode(this.isUpdateAction) + ((hashCode + (cartMode != null ? cartMode.hashCode() : 0)) * 31);
            }

            /* renamed from: isUpdateAction, reason: from getter */
            public final boolean getIsUpdateAction() {
                return this.isUpdateAction;
            }

            @NotNull
            public String toString() {
                long j11 = this.productId;
                int i11 = this.quantity;
                Long l11 = this.selectedDeliverySchema;
                DoubleCartVO.CartMode cartMode = this.cartMode;
                boolean z11 = this.isUpdateAction;
                StringBuilder b11 = Ql.c.b(j11, "ProductCount(productId=", i11, ", quantity=");
                b11.append(", selectedDeliverySchema=");
                b11.append(l11);
                b11.append(", cartMode=");
                b11.append(cartMode);
                return Bi.b.f(b11, ", isUpdateAction=", z11, ")");
            }

            public ProductCount(long j11, int i11, Long l11, DoubleCartVO.CartMode cartMode, boolean z11) {
                super(null);
                this.productId = j11;
                this.quantity = i11;
                this.selectedDeliverySchema = l11;
                this.cartMode = cartMode;
                this.isUpdateAction = z11;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ShowLoader;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;", "", "isShowing", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowLoader extends Action {
            private final boolean isShowing;

            public ShowLoader(boolean z11) {
                super(null);
                this.isShowing = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowLoader) && this.isShowing == ((ShowLoader) other).isShowing;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isShowing);
            }

            /* renamed from: isShowing, reason: from getter */
            public final boolean getIsShowing() {
                return this.isShowing;
            }

            @NotNull
            public String toString() {
                return C2618u.g("ShowLoader(isShowing=", ")", this.isShowing);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action$ShowRelatedProductsBottomSheet;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel$Action;", "", "isInCart", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowRelatedProductsBottomSheet extends Action {
            private final boolean isInCart;

            public ShowRelatedProductsBottomSheet(boolean z11) {
                super(null);
                this.isInCart = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowRelatedProductsBottomSheet) && this.isInCart == ((ShowRelatedProductsBottomSheet) other).isInCart;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isInCart);
            }

            /* renamed from: isInCart, reason: from getter */
            public final boolean getIsInCart() {
                return this.isInCart;
            }

            @NotNull
            public String toString() {
                return C2618u.g("ShowRelatedProductsBottomSheet(isInCart=", ")", this.isInCart);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public CartViewModel(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        this.action = k.b(new CartViewModel$action$2(this));
        this._action = new SingleLiveEvent<>();
        this.showRecommendations = new SingleLiveEvent<>();
        this.items = U.c();
        this.sku = new Pair<>(0L, 0L);
        this.isInitialUpdateData = true;
        C8486a a11 = C5415f.a(this);
        p observeOn = CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null).distinctUntilChanged().observeOn(C8125a.a());
        C2673b c2673b = new C2673b(new AnonymousClass1(this), 7);
        a.b bVar = a.f17149a;
        InterfaceC8487b subscribe = observeOn.subscribe(c2673b, new AF.a(new AnonymousClass2(bVar), 13));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
        C8486a a12 = C5415f.a(this);
        InterfaceC8487b subscribe2 = cartService.observeCartActions().subscribe(new AF.b(new AnonymousClass3(), 12), new C3055d(new AnonymousClass4(bVar), 14));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "subscribe(...)");
        RxExtKt.plusAssign(a12, subscribe2);
    }

    public static /* synthetic */ void addToCart$default(CartViewModel cartViewModel, CartVO cartVO, AtomAction atomAction, DoubleCartVO.CartMode cartMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            atomAction = null;
        }
        if ((i11 & 4) != 0) {
            cartMode = null;
        }
        cartViewModel.addToCart(cartVO, atomAction, cartMode);
    }

    private final void clearProductCount() {
        Set set = (Set) C7714v.L(this.items.values());
        if (set == null) {
            this._action.setValue(createUpdateAction());
            return;
        }
        SingleLiveEvent<Action> singleLiveEvent = this._action;
        long longValue = this.sku.e().longValue();
        PDPCartItemInfo pDPCartItemInfo = (PDPCartItemInfo) C7714v.L(set);
        singleLiveEvent.setValue(new Action.ProductCount(longValue, 0, pDPCartItemInfo != null ? pDPCartItemInfo.getSelectedDeliverySchema() : null, DoubleCartVO.CartMode.DEFAULT, false, 16, null));
    }

    private final Action.ProductCount createUpdateAction() {
        return new Action.ProductCount(0L, 0, null, this.lastCartMode, true);
    }

    public static /* synthetic */ void decrementCount$default(CartViewModel cartViewModel, CartVO cartVO, DoubleCartVO.CartMode cartMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cartMode = null;
        }
        cartViewModel.decrementCount(cartVO, cartMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCartState(CartState cartState, boolean forceUpdate) {
        if (cartState.getItems().isEmpty() || !(cartState.getItems().containsKey(this.sku.e()) || cartState.getItems().containsKey(this.sku.f()))) {
            clearProductCount();
        } else {
            updateProductCount(cartState, forceUpdate);
        }
    }

    static /* synthetic */ void handleCartState$default(CartViewModel cartViewModel, CartState cartState, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cartViewModel.handleCartState(cartState, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLastCartState(boolean forceUpdate) {
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null).observeOn(C8125a.a()).take(1L).subscribe(new d(new CartViewModel$handleLastCartState$1(this, forceUpdate), 12), new Cw.c(new CartViewModel$handleLastCartState$2(a.f17149a), 14));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    static /* synthetic */ void handleLastCartState$default(CartViewModel cartViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        cartViewModel.handleLastCartState(z11);
    }

    public static /* synthetic */ void incrementCount$default(CartViewModel cartViewModel, CartVO cartVO, DoubleCartVO.CartMode cartMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cartMode = null;
        }
        cartViewModel.incrementCount(cartVO, cartMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedExpressSheet(Map<Long, CartItemInfo> products) {
        if (this.isShowRecommendations) {
            this.showRecommendations.call();
            this.isShowRecommendations = false;
        }
        for (Map.Entry<Long, CartItemInfo> entry : products.entrySet()) {
            long longValue = entry.getKey().longValue();
            Long selectedDeliverySchema = entry.getValue().getSelectedDeliverySchema();
            if (selectedDeliverySchema == null) {
                return;
            }
            long longValue2 = selectedDeliverySchema.longValue();
            int quantity = entry.getValue().getQuantity();
            Set<PDPCartItemInfo> set = this.items.get(Long.valueOf(longValue));
            if (set != null) {
                if (quantity != 1 || !Intrinsics.d(this.lastAction, "addToCart")) {
                    set = null;
                }
                if (set != null) {
                    this._action.setValue(new Action.ExpressSheet(longValue2));
                }
            }
        }
    }

    private final void updateCart(final CartVO cartVo, int count, String operationId, AtomAction additionalAction) {
        this.lastAction = operationId;
        visibleForStarsLoader(cartVo, true);
        Boolean forStars = ExtKt.getForStars(ExtKt.mainButton(cartVo.getToCart()));
        C8486a a11 = C5415f.a(this);
        CartService cartService = this.cartService;
        String valueOf = String.valueOf(cartVo.getSku());
        Map<String, TokenizedTrackingInfo> trackingInfo = ExtKt.mainButton(cartVo.getToCart()).getTrackingInfo();
        Long l11 = this.widgetId;
        Long selectedDeliverySchema = ExtKt.getSelectedDeliverySchema(ExtKt.mainButton(cartVo.getToCart()));
        AtomActionDTO action = ExtKt.mainButton(cartVo.getToCart()).getAction();
        y addProductToCartWithResponseResult$default = CartService.DefaultImpls.addProductToCartWithResponseResult$default(cartService, valueOf, count, selectedDeliverySchema, trackingInfo, l11, operationId, null, forStars, null, action != null ? action.getParams() : null, null, 1344, null);
        BT.b bVar = new BT.b(new CartViewModel$updateCart$1(a.f17149a), 12);
        addProductToCartWithResponseResult$default.getClass();
        InterfaceC8487b h11 = new f(new j(new h(addProductToCartWithResponseResult$default, bVar), new BT.c(new CartViewModel$updateCart$2(this, additionalAction, forStars), 7)), new InterfaceC9019a() { // from class: oD.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                CartViewModel.this.visibleForStarsLoader(cartVo, false);
            }
        }).h(C9653a.g(), C9653a.f98525e);
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    static /* synthetic */ void updateCart$default(CartViewModel cartViewModel, CartVO cartVO, int i11, String str, AtomAction atomAction, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            atomAction = null;
        }
        cartViewModel.updateCart(cartVO, i11, str, atomAction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateProductCount(CartState cartState, boolean forceUpdate) {
        Long l11;
        CartItemInfo cartItemInfo;
        PDPCartItemInfo pDPCartItemInfo;
        Iterator<Map.Entry<Long, CartItemInfo>> it = cartState.getItems().entrySet().iterator();
        Object[] objArr = false;
        while (true) {
            l11 = null;
            Object obj = null;
            l11 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Long, CartItemInfo> next = it.next();
            long longValue = next.getKey().longValue();
            Long selectedDeliverySchema = next.getValue().getSelectedDeliverySchema();
            int quantity = next.getValue().getQuantity();
            Set<PDPCartItemInfo> set = this.items.get(Long.valueOf(longValue));
            if (set != null) {
                Iterator<T> it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.d(((PDPCartItemInfo) next2).getSelectedDeliverySchema(), next.getValue().getSelectedDeliverySchema())) {
                        obj = next2;
                        break;
                    }
                }
                PDPCartItemInfo pDPCartItemInfo2 = (PDPCartItemInfo) obj;
                if (pDPCartItemInfo2 != null) {
                    Object[] objArr2 = !Intrinsics.d(pDPCartItemInfo2.getForStars(), Boolean.TRUE) || forceUpdate;
                    if (pDPCartItemInfo2.getQuantity() == quantity || !objArr2 == true) {
                        this._action.setValue(createUpdateAction());
                    } else {
                        this._action.setValue(new Action.ProductCount(longValue, quantity, selectedDeliverySchema, this.lastCartMode, false, 16, null));
                    }
                    objArr = true;
                }
            }
        }
        if (objArr == true || (cartItemInfo = cartState.getItems().get(this.sku.e())) == null) {
            return;
        }
        SingleLiveEvent<Action> singleLiveEvent = this._action;
        long longValue2 = this.sku.e().longValue();
        int quantity2 = cartItemInfo.getQuantity();
        Set<PDPCartItemInfo> set2 = this.items.get(this.sku.e());
        if (set2 != null && (pDPCartItemInfo = (PDPCartItemInfo) C7714v.Y(set2)) != null) {
            l11 = pDPCartItemInfo.getSelectedDeliverySchema();
        }
        singleLiveEvent.setValue(new Action.ProductCount(longValue2, quantity2, l11, this.lastCartMode, false, 16, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void visibleForStarsLoader(CartVO cartVo, boolean isShow) {
        if (Intrinsics.d(ExtKt.getForStars(ExtKt.mainButton(cartVo.getToCart())), Boolean.TRUE)) {
            this._action.setValue(new Action.ShowLoader(isShow));
        }
    }

    public final void addToCart(@NotNull CartVO cartVo, AtomAction additionalAction, DoubleCartVO.CartMode cartMode) {
        Intrinsics.checkNotNullParameter(cartVo, "cartVo");
        this.isShowRecommendations = true;
        this.lastCartMode = cartMode;
        addToCart(cartVo, "addToCart", additionalAction);
    }

    public final void bind(@NotNull Map<Long, ? extends Set<PDPCartItemInfo>> items, Long widgetId, @NotNull Pair<Long, Long> sku, @NotNull l tokenizedAnalytics, boolean isUpdateData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.widgetId = widgetId;
        this.items = items;
        this.sku = sku;
        this.cartService.attach(tokenizedAnalytics);
        if (!isUpdateData && this.isInitialUpdateData) {
            this.isInitialUpdateData = false;
        } else {
            if (isUpdateData || this.isInitialUpdateData) {
                return;
            }
            handleLastCartState$default(this, false, 1, null);
        }
    }

    public final void decrementCount(@NotNull final CartVO cartVo, DoubleCartVO.CartMode cartMode) {
        Intrinsics.checkNotNullParameter(cartVo, "cartVo");
        int quantity = cartVo.getQuantity();
        Integer minAddToCartQuantity = cartVo.getMinAddToCartQuantity();
        Integer multiplicityValue = cartVo.getMultiplicityValue();
        int intValue = multiplicityValue != null ? multiplicityValue.intValue() : 1;
        if (minAddToCartQuantity == null) {
            minAddToCartQuantity = Integer.valueOf(intValue);
        }
        int i11 = quantity == minAddToCartQuantity.intValue() ? 0 : quantity - intValue;
        if (i11 != 0) {
            this.lastCartMode = cartMode;
            updateCart$default(this, cartVo, i11, "minusButtonClick", null, 8, null);
            return;
        }
        this.lastCartMode = null;
        visibleForStarsLoader(cartVo, true);
        C8486a a11 = C5415f.a(this);
        AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(this.cartService, String.valueOf(cartVo.getSku()), i11, ExtKt.getSelectedDeliverySchema(ExtKt.mainButton(cartVo.getToCart())), ExtKt.mainButton(cartVo.getToCart()).getTrackingInfo(), this.widgetId, ExtKt.getForStars(ExtKt.mainButton(cartVo.getToCart())), null, 64, null);
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: oD.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                CartViewModel.this.visibleForStarsLoader(cartVo, false);
            }
        };
        removeProductFromCart$default.getClass();
        C10299d c10299d = new C10299d(removeProductFromCart$default, interfaceC9019a);
        Intrinsics.checkNotNullExpressionValue(c10299d, "doFinally(...)");
        RxExtKt.plusAssign(a11, RxExtKt.subscribeBy$default(c10299d, null, new CartViewModel$decrementCount$2(a.f17149a), 1, null));
    }

    @NotNull
    public final P<Action> getAction() {
        return (P) this.action.getValue();
    }

    @NotNull
    public final SingleLiveEvent<Unit> getShowRecommendations() {
        return this.showRecommendations;
    }

    public final void incrementCount(@NotNull CartVO cartVo, DoubleCartVO.CartMode cartMode) {
        Intrinsics.checkNotNullParameter(cartVo, "cartVo");
        this.lastCartMode = cartMode;
        addToCart$default(this, cartVo, "plusButtonClick", (AtomAction) null, 4, (Object) null);
    }

    static /* synthetic */ void addToCart$default(CartViewModel cartViewModel, CartVO cartVO, String str, AtomAction atomAction, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            atomAction = null;
        }
        cartViewModel.addToCart(cartVO, str, atomAction);
    }

    private final void addToCart(CartVO cartVo, String operationId, AtomAction additionalAction) {
        this.lastAction = operationId;
        int quantity = cartVo.getQuantity();
        Integer minAddToCartQuantity = cartVo.getMinAddToCartQuantity();
        Integer multiplicityValue = cartVo.getMultiplicityValue();
        int intValue = multiplicityValue != null ? multiplicityValue.intValue() : 1;
        int i11 = quantity + intValue;
        if (minAddToCartQuantity != null) {
            intValue = minAddToCartQuantity.intValue();
        }
        if (i11 < intValue) {
            i11 = intValue;
        }
        if (cartVo.getFreeRest() - i11 >= 0) {
            updateCart(cartVo, i11, operationId, additionalAction);
        }
    }
}
