package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import AF.d;
import AF.g;
import B0.C2454a;
import B90.C2618u;
import Bc.f;
import Bc.h;
import Bc.j;
import Fn.C3056e;
import Kk.c;
import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sh.b;
import Tm.C4047b;
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
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartAction;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;
import vc.C10299d;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001:\u0001SB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JU\u0010\u0013\u001a\u00020\u00122\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010#\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J+\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010'J3\u0010*\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010$J#\u00103\u001a\u00020\u00122\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002010\u0006H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R!\u0010B\u001a\b\u0012\u0004\u0012\u00020=0<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020=0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120C8\u0006¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\bG\u0010HR(\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010IR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010JR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "", "", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/PDPCartQuantItemInfo;", "items", "widgetId", "Lkotlin/Pair;", "sku", "LWZ/l;", "tokenizedAnalytics", "", "isUpdateData", "", "bind", "(Ljava/util/Map;Ljava/lang/Long;Lkotlin/Pair;LWZ/l;Z)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "cartQuantVo", "Lru/ozon/uni/atoms/af/AtomAction;", "additionalAction", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "cartMode", "addToCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;)V", "incrementCount", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;)V", "decrementCount", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "forceUpdate", "handleCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;Z)V", "", "operationId", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "count", "updateCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;ILjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "handleLastCartState", "(Z)V", "clearProductCount", "()V", "updateProductCount", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "products", "proceedExpressSheet", "(Ljava/util/Map;)V", "isShow", "visibleForStarsLoader", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Z)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$ProductCount;", "createUpdateAction", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$ProductCount;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;", "action$delegate", "LSc/j;", "getAction", "()Landroidx/lifecycle/P;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "_action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "showRecommendations", "getShowRecommendations", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Ljava/util/Map;", "Ljava/lang/Long;", "Lkotlin/Pair;", "lastAction", "Ljava/lang/String;", "isShowRecommendations", "Z", "isInitialUpdateData", "lastCartMode", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "Action", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartQuantViewModel extends w0 {

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
    private Map<Long, ? extends Set<PDPCartQuantItemInfo>> items;
    private String lastAction;
    private DoubleCartQuantVO.CartMode lastCartMode;

    @NotNull
    private final SingleLiveEvent<Unit> showRecommendations;

    @NotNull
    private Pair<Long, Long> sku;
    private Long widgetId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function1<CartState, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, CartQuantViewModel.class, "handleCartState", "handleCartState(Lru/ozon/app/android/cart/common/domain/CartState;Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CartState cartState) {
            invoke2(cartState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CartState p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            CartQuantViewModel.handleCartState$default((CartQuantViewModel) this.receiver, p02, false, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel$2, reason: invalid class name */
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
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel$3, reason: invalid class name */
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
                CartQuantViewModel.this.proceedExpressSheet(((CartAction.CartSuccess) cartAction).getProducts());
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel$4, reason: invalid class name */
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;", "", "<init>", "()V", "ProductCount", "ExpressSheet", "DoAction", "ShowLoader", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$DoAction;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$ExpressSheet;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$ProductCount;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$ShowLoader;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$DoAction;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$ExpressSheet;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;", "", "selectedDeliverySchema", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSelectedDeliverySchema", "()J", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$ProductCount;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;", "", "productId", "", "quantity", "selectedDeliverySchema", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "cartMode", "", "isUpdateAction", "<init>", "(JILjava/lang/Long;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getProductId", "()J", "I", "getQuantity", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "getCartMode", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductCount extends Action {
            private final DoubleCartQuantVO.CartMode cartMode;
            private final boolean isUpdateAction;
            private final long productId;
            private final int quantity;
            private final Long selectedDeliverySchema;

            public /* synthetic */ ProductCount(long j11, int i11, Long l11, DoubleCartQuantVO.CartMode cartMode, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
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

            public final DoubleCartQuantVO.CartMode getCartMode() {
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
                DoubleCartQuantVO.CartMode cartMode = this.cartMode;
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
                DoubleCartQuantVO.CartMode cartMode = this.cartMode;
                boolean z11 = this.isUpdateAction;
                StringBuilder b11 = Ql.c.b(j11, "ProductCount(productId=", i11, ", quantity=");
                b11.append(", selectedDeliverySchema=");
                b11.append(l11);
                b11.append(", cartMode=");
                b11.append(cartMode);
                return Bi.b.f(b11, ", isUpdateAction=", z11, ")");
            }

            public ProductCount(long j11, int i11, Long l11, DoubleCartQuantVO.CartMode cartMode, boolean z11) {
                super(null);
                this.productId = j11;
                this.quantity = i11;
                this.selectedDeliverySchema = l11;
                this.cartMode = cartMode;
                this.isUpdateAction = z11;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action$ShowLoader;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;", "", "isShowing", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public CartQuantViewModel(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        this.action = k.b(new CartQuantViewModel$action$2(this));
        this._action = new SingleLiveEvent<>();
        this.showRecommendations = new SingleLiveEvent<>();
        this.items = U.c();
        this.sku = new Pair<>(0L, 0L);
        this.isInitialUpdateData = true;
        C8486a a11 = C5415f.a(this);
        p observeOn = CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null).distinctUntilChanged().observeOn(C8125a.a());
        d dVar = new d(new AnonymousClass1(this), 9);
        a.b bVar = a.f17149a;
        InterfaceC8487b subscribe = observeOn.subscribe(dVar, new C3056e(new AnonymousClass2(bVar), 9));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
        C8486a a12 = C5415f.a(this);
        int i11 = 6;
        InterfaceC8487b subscribe2 = cartService.observeCartActions().subscribe(new HC.a(new AnonymousClass3(), i11), new g(new AnonymousClass4(bVar), i11));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "subscribe(...)");
        RxExtKt.plusAssign(a12, subscribe2);
    }

    public static /* synthetic */ void addToCart$default(CartQuantViewModel cartQuantViewModel, CartQuantVO cartQuantVO, AtomAction atomAction, DoubleCartQuantVO.CartMode cartMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            atomAction = null;
        }
        if ((i11 & 4) != 0) {
            cartMode = null;
        }
        cartQuantViewModel.addToCart(cartQuantVO, atomAction, cartMode);
    }

    private final void clearProductCount() {
        Set set = (Set) C7714v.L(this.items.values());
        if (set == null) {
            this._action.setValue(createUpdateAction());
            return;
        }
        SingleLiveEvent<Action> singleLiveEvent = this._action;
        long longValue = this.sku.e().longValue();
        PDPCartQuantItemInfo pDPCartQuantItemInfo = (PDPCartQuantItemInfo) C7714v.L(set);
        singleLiveEvent.setValue(new Action.ProductCount(longValue, 0, pDPCartQuantItemInfo != null ? pDPCartQuantItemInfo.getSelectedDeliverySchema() : null, DoubleCartQuantVO.CartMode.DEFAULT, false, 16, null));
    }

    private final Action.ProductCount createUpdateAction() {
        return new Action.ProductCount(0L, 0, null, this.lastCartMode, true);
    }

    public static /* synthetic */ void decrementCount$default(CartQuantViewModel cartQuantViewModel, CartQuantVO cartQuantVO, DoubleCartQuantVO.CartMode cartMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cartMode = null;
        }
        cartQuantViewModel.decrementCount(cartQuantVO, cartMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCartState(CartState cartState, boolean forceUpdate) {
        if (cartState.getItems().isEmpty() || !(cartState.getItems().containsKey(this.sku.e()) || cartState.getItems().containsKey(this.sku.f()))) {
            clearProductCount();
        } else {
            updateProductCount(cartState, forceUpdate);
        }
    }

    static /* synthetic */ void handleCartState$default(CartQuantViewModel cartQuantViewModel, CartState cartState, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cartQuantViewModel.handleCartState(cartState, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLastCartState(boolean forceUpdate) {
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null).observeOn(C8125a.a()).take(1L).subscribe(new C4047b(new CartQuantViewModel$handleLastCartState$1(this, forceUpdate), 3), new DF.a(new CartQuantViewModel$handleLastCartState$2(a.f17149a), 7));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    static /* synthetic */ void handleLastCartState$default(CartQuantViewModel cartQuantViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        cartQuantViewModel.handleLastCartState(z11);
    }

    public static /* synthetic */ void incrementCount$default(CartQuantViewModel cartQuantViewModel, CartQuantVO cartQuantVO, DoubleCartQuantVO.CartMode cartMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cartMode = null;
        }
        cartQuantViewModel.incrementCount(cartQuantVO, cartMode);
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
            Set<PDPCartQuantItemInfo> set = this.items.get(Long.valueOf(longValue));
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

    private final void updateCart(final CartQuantVO cartQuantVo, int count, String operationId, AtomAction additionalAction) {
        this.lastAction = operationId;
        visibleForStarsLoader(cartQuantVo, true);
        Boolean forStars = QuantExtKt.getForStars(QuantExtKt.mainButton(cartQuantVo.getToCart()));
        C8486a a11 = C5415f.a(this);
        y addProductToCartWithResponseResult$default = CartService.DefaultImpls.addProductToCartWithResponseResult$default(this.cartService, String.valueOf(cartQuantVo.getSku()), count, QuantExtKt.getSelectedQuantDeliverySchema(QuantExtKt.mainButton(cartQuantVo.getToCart())), QuantExtKt.mainButton(cartQuantVo.getToCart()).getTrackingInfo(), this.widgetId, operationId, null, forStars, null, null, null, 1856, null);
        AF.a aVar = new AF.a(new CartQuantViewModel$updateCart$1(a.f17149a), 9);
        addProductToCartWithResponseResult$default.getClass();
        InterfaceC8487b h11 = new f(new j(new h(addProductToCartWithResponseResult$default, aVar), new AF.b(new CartQuantViewModel$updateCart$2(additionalAction, forStars, this), 8)), new InterfaceC9019a() { // from class: hD.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                CartQuantViewModel.this.visibleForStarsLoader(cartQuantVo, false);
            }
        }).h(C9653a.g(), C9653a.f98525e);
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    static /* synthetic */ void updateCart$default(CartQuantViewModel cartQuantViewModel, CartQuantVO cartQuantVO, int i11, String str, AtomAction atomAction, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            atomAction = null;
        }
        cartQuantViewModel.updateCart(cartQuantVO, i11, str, atomAction);
    }

    private final void updateProductCount(CartState cartState, boolean forceUpdate) {
        Object obj;
        for (Map.Entry<Long, CartItemInfo> entry : cartState.getItems().entrySet()) {
            long longValue = entry.getKey().longValue();
            Long selectedDeliverySchema = entry.getValue().getSelectedDeliverySchema();
            int quantity = entry.getValue().getQuantity();
            Set<PDPCartQuantItemInfo> set = this.items.get(Long.valueOf(longValue));
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.d(((PDPCartQuantItemInfo) obj).getSelectedDeliverySchema(), entry.getValue().getSelectedDeliverySchema())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                PDPCartQuantItemInfo pDPCartQuantItemInfo = (PDPCartQuantItemInfo) obj;
                if (pDPCartQuantItemInfo != null) {
                    boolean z11 = !Intrinsics.d(pDPCartQuantItemInfo.getForStars(), Boolean.TRUE) || forceUpdate;
                    if (quantity == 0 || pDPCartQuantItemInfo.getQuantity() == quantity || !z11) {
                        this._action.setValue(createUpdateAction());
                    } else {
                        this._action.setValue(new Action.ProductCount(longValue, quantity, selectedDeliverySchema, this.lastCartMode, false, 16, null));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void visibleForStarsLoader(CartQuantVO cartQuantVo, boolean isShow) {
        if (Intrinsics.d(QuantExtKt.getForStars(QuantExtKt.mainButton(cartQuantVo.getToCart())), Boolean.TRUE)) {
            this._action.setValue(new Action.ShowLoader(isShow));
        }
    }

    public final void addToCart(@NotNull CartQuantVO cartQuantVo, AtomAction additionalAction, DoubleCartQuantVO.CartMode cartMode) {
        Intrinsics.checkNotNullParameter(cartQuantVo, "cartQuantVo");
        this.isShowRecommendations = true;
        this.lastCartMode = cartMode;
        addToCart(cartQuantVo, "addToCart", additionalAction);
    }

    public final void bind(@NotNull Map<Long, ? extends Set<PDPCartQuantItemInfo>> items, Long widgetId, @NotNull Pair<Long, Long> sku, @NotNull l tokenizedAnalytics, boolean isUpdateData) {
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

    public final void decrementCount(@NotNull final CartQuantVO cartQuantVo, DoubleCartQuantVO.CartMode cartMode) {
        int i11;
        Integer quantMultiplicityValue;
        Intrinsics.checkNotNullParameter(cartQuantVo, "cartQuantVo");
        int quantity = cartQuantVo.getQuantity();
        if (cartQuantVo.getQuantMultiplicityValue() == null || (((quantMultiplicityValue = cartQuantVo.getQuantMultiplicityValue()) != null && quantMultiplicityValue.intValue() == 0) || quantity == 0)) {
            Integer minAddToCartQuantity = cartQuantVo.getMinAddToCartQuantity();
            Integer multiplicityValue = cartQuantVo.getMultiplicityValue();
            int intValue = multiplicityValue != null ? multiplicityValue.intValue() : 1;
            if (minAddToCartQuantity == null) {
                minAddToCartQuantity = Integer.valueOf(intValue);
            }
            i11 = quantity == minAddToCartQuantity.intValue() ? 0 : quantity - intValue;
        } else {
            Integer quantMultiplicityValue2 = cartQuantVo.getQuantMultiplicityValue();
            i11 = quantMultiplicityValue2.intValue() * (quantity / quantMultiplicityValue2.intValue());
            if (quantity <= quantMultiplicityValue2.intValue()) {
                i11 = quantity - 1;
            } else if (i11 == quantity) {
                i11 -= quantMultiplicityValue2.intValue();
            }
        }
        int i12 = i11;
        if (i12 != 0) {
            this.lastCartMode = cartMode;
            updateCart$default(this, cartQuantVo, i12, "minusButtonClick", null, 8, null);
            return;
        }
        this.lastCartMode = null;
        visibleForStarsLoader(cartQuantVo, true);
        C8486a a11 = C5415f.a(this);
        AbstractC7094b removeProductFromCart$default = CartService.DefaultImpls.removeProductFromCart$default(this.cartService, String.valueOf(cartQuantVo.getSku()), i12, QuantExtKt.getSelectedQuantDeliverySchema(QuantExtKt.mainButton(cartQuantVo.getToCart())), QuantExtKt.mainButton(cartQuantVo.getToCart()).getTrackingInfo(), this.widgetId, QuantExtKt.getForStars(QuantExtKt.mainButton(cartQuantVo.getToCart())), null, 64, null);
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: hD.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                CartQuantViewModel.this.visibleForStarsLoader(cartQuantVo, false);
            }
        };
        removeProductFromCart$default.getClass();
        C10299d c10299d = new C10299d(removeProductFromCart$default, interfaceC9019a);
        Intrinsics.checkNotNullExpressionValue(c10299d, "doFinally(...)");
        RxExtKt.plusAssign(a11, RxExtKt.subscribeBy$default(c10299d, null, new CartQuantViewModel$decrementCount$2(a.f17149a), 1, null));
    }

    @NotNull
    public final P<Action> getAction() {
        return (P) this.action.getValue();
    }

    @NotNull
    public final SingleLiveEvent<Unit> getShowRecommendations() {
        return this.showRecommendations;
    }

    public final void incrementCount(@NotNull CartQuantVO cartQuantVo, DoubleCartQuantVO.CartMode cartMode) {
        Intrinsics.checkNotNullParameter(cartQuantVo, "cartQuantVo");
        this.lastCartMode = cartMode;
        addToCart$default(this, cartQuantVo, "plusButtonClick", (AtomAction) null, 4, (Object) null);
    }

    static /* synthetic */ void addToCart$default(CartQuantViewModel cartQuantViewModel, CartQuantVO cartQuantVO, String str, AtomAction atomAction, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            atomAction = null;
        }
        cartQuantViewModel.addToCart(cartQuantVO, str, atomAction);
    }

    private final void addToCart(CartQuantVO cartQuantVo, String operationId, AtomAction additionalAction) {
        Integer quantMultiplicityValue;
        this.lastAction = operationId;
        int quantity = cartQuantVo.getQuantity();
        if (cartQuantVo.getQuantMultiplicityValue() != null && ((quantMultiplicityValue = cartQuantVo.getQuantMultiplicityValue()) == null || quantMultiplicityValue.intValue() != 0)) {
            Integer quantMultiplicityValue2 = cartQuantVo.getQuantMultiplicityValue();
            if (quantity == 0) {
                if (this.lastCartMode == DoubleCartQuantVO.CartMode.FIRST) {
                    r2 = quantMultiplicityValue2.intValue();
                }
            } else if (quantMultiplicityValue2.intValue() > quantity) {
                r2 = 1 + quantity;
            } else {
                r2 = (quantMultiplicityValue2.intValue() * (quantity / quantMultiplicityValue2.intValue())) + quantMultiplicityValue2.intValue();
                if (cartQuantVo.getFreeRest() <= r2) {
                    r2 = cartQuantVo.getFreeRest();
                }
            }
            updateCart(cartQuantVo, r2, operationId, additionalAction);
            return;
        }
        Integer minAddToCartQuantity = cartQuantVo.getMinAddToCartQuantity();
        Integer multiplicityValue = cartQuantVo.getMultiplicityValue();
        r2 = multiplicityValue != null ? multiplicityValue.intValue() : 1;
        int i11 = quantity + r2;
        if (minAddToCartQuantity != null) {
            r2 = minAddToCartQuantity.intValue();
        }
        if (i11 < r2) {
            i11 = r2;
        }
        if (cartQuantVo.getFreeRest() - i11 >= 0) {
            updateCart(cartQuantVo, i11, operationId, additionalAction);
        }
    }
}
