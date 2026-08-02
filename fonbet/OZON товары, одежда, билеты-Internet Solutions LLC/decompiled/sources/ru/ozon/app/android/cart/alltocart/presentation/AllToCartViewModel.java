package ru.ozon.app.android.cart.alltocart.presentation;

import Bc.m;
import Bc.r;
import DM.i;
import Fy.C3065c;
import Gy.b;
import WZ.l;
import WZ.t;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.C;
import io.reactivex.p;
import io.reactivex.u;
import io.reactivex.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.o;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.alltocart.exceptions.StateHasNotBeenInitializedException;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartVO;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartType;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.tracker.sendEvent.ActionType;
import vc.j;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\f2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/cart/alltocart/presentation/AllToCartViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO$CartData;", "sku", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "skuInCart", "", "addAnalytics", "(Ljava/util/List;Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO$CartData;Lru/ozon/app/android/cart/common/models/CartItemInfo;)V", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "type", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "createTokenizedEvent", "(Ljava/util/Map;Ljava/lang/String;)LWZ/t;", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO;", "vo", "updateVo", "(Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO;)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "attachTokenizedAnalytics", "(LWZ/l;)V", "addAllSkuAction", "()V", "Lru/ozon/app/android/cart/common/domain/CartService;", "voState", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO;", "Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "Lru/ozon/app/android/cart/common/domain/CartState;", "Landroidx/lifecycle/V;", "", "allToCartButtonState", "Landroidx/lifecycle/V;", "getAllToCartButtonState", "()Landroidx/lifecycle/V;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AllToCartViewModel extends w0 {

    @NotNull
    private final V<Boolean> allToCartButtonState;

    @NotNull
    private final CartService cartService;

    @NotNull
    private CartState cartState;
    private AllToCartVO voState;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lru/ozon/app/android/cart/common/domain/CartState;", "", "kotlin.jvm.PlatformType", "cartState", "invoke", "(Lru/ozon/app/android/cart/common/domain/CartState;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CartState, Pair<? extends CartState, ? extends Boolean>> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<CartState, Boolean> invoke(CartState cartState) {
            int i11;
            Intrinsics.checkNotNullParameter(cartState, "cartState");
            AllToCartVO allToCartVO = AllToCartViewModel.this.voState;
            if (allToCartVO == null) {
                throw new StateHasNotBeenInitializedException("VoState has not been initialized");
            }
            Map<Long, CartItemInfo> items = cartState.getItems();
            if (items.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 0;
                for (Map.Entry<Long, CartItemInfo> entry : items.entrySet()) {
                    if (allToCartVO.getIdsRelatedButton().contains(entry.getKey()) && entry.getValue().getQuantity() > 0) {
                        i11++;
                    }
                }
            }
            return new Pair<>(cartState, Boolean.valueOf(i11 == allToCartVO.getIdsRelatedButton().size()));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00052\u0019\u0010\u0004\u001a\u0015\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/reactivex/p;", "", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "errObservable", "Lio/reactivex/u;", "invoke", "(Lio/reactivex/p;)Lio/reactivex/u;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<p<Throwable>, u<?>> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "throwable", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/u;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Throwable, u<? extends Long>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final u<? extends Long> invoke(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return throwable instanceof StateHasNotBeenInitializedException ? p.timer(300L, TimeUnit.MILLISECONDS) : p.error(throwable);
            }
        }

        AnonymousClass2() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u invoke$lambda$0(Function1 function1, Object p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (u) function1.invoke(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<?> invoke(p<Throwable> errObservable) {
            Intrinsics.checkNotNullParameter(errObservable, "errObservable");
            final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            return errObservable.flatMap(new o() { // from class: ru.ozon.app.android.cart.alltocart.presentation.a
                @Override // qc.o
                public final Object apply(Object obj) {
                    u invoke$lambda$0;
                    invoke$lambda$0 = AllToCartViewModel.AnonymousClass2.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "cartStateWithButtonState", "Lkotlin/Pair;", "Lru/ozon/app/android/cart/common/domain/CartState;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Pair<? extends CartState, ? extends Boolean>, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends CartState, ? extends Boolean> pair) {
            invoke2((Pair<CartState, Boolean>) pair);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<CartState, Boolean> pair) {
            AllToCartViewModel.this.cartState = pair.e();
            AllToCartViewModel.this.getAllToCartButtonState().setValue(pair.f());
        }
    }

    public AllToCartViewModel(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        this.cartState = new CartState(null, 0L, null, null, null, null, null, 127, null);
        this.allToCartButtonState = new V<>();
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null).map(new C3065c(new AnonymousClass1(), 5)).retryWhen(new Gy.a(AnonymousClass2.INSTANCE, 2)).distinctUntilChanged().subscribeOn(Mc.a.b()).observeOn(C8125a.a()).subscribe(new b(new AnonymousClass3(), 4));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Pair) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u _init_$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (u) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddProductsWithTokenizedAnalytics addAllSkuAction$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AddProductsWithTokenizedAnalytics) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C addAllSkuAction$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAnalytics(List<ProductTokenizedCartAnalyticsEvent> list, AllToCartVO.CartData cartData, CartItemInfo cartItemInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo = cartData.getTrackingInfo();
        if (trackingInfo != null) {
            Pair pair = cartItemInfo != null ? new Pair(ActionType.INCREMENT.INSTANCE.getType(), Integer.valueOf(cartData.getIncrementQuantity())) : new Pair(ActionType.TO_CART.INSTANCE.getType(), Integer.valueOf(cartData.getAddQuantity()));
            list.add(new ProductTokenizedCartAnalyticsEvent(cartData.getId(), new TokenizedCartAnalyticsEvent(new TokenizedCartType.ChangeCartType(((Number) pair.f()).intValue()), createTokenizedEvent(trackingInfo, (String) pair.e()))));
        }
    }

    private final t createTokenizedEvent(Map<String, TokenizedTrackingInfo> trackingInfo, String type) {
        TokenizedTrackingInfo tokenizedTrackingInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(trackingInfo.size()));
        Iterator<T> it = trackingInfo.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (Intrinsics.d(entry.getKey(), "click")) {
                TokenizedTrackingInfo.a aVar = new TokenizedTrackingInfo.a((TokenizedTrackingInfo) entry.getValue());
                aVar.b(type);
                tokenizedTrackingInfo = aVar.a();
            } else {
                tokenizedTrackingInfo = (TokenizedTrackingInfo) entry.getValue();
            }
            linkedHashMap.put(key, tokenizedTrackingInfo);
        }
        AllToCartVO allToCartVO = this.voState;
        return TrackingInfoMapperKt.toTokenizedEvent$default(linkedHashMap, allToCartVO != null ? Long.valueOf(allToCartVO.getId()) : null, null, 2, null);
    }

    public final void addAllSkuAction() {
        C8486a a11 = C5415f.a(this);
        AllToCartVO allToCartVO = this.voState;
        j jVar = new j(new m(new r(y.f(allToCartVO != null ? allToCartVO.getSkus() : null), new i(new AllToCartViewModel$addAllSkuAction$1(this), 6)), new GH.b(new AllToCartViewModel$addAllSkuAction$2(this), 5)));
        Intrinsics.checkNotNullExpressionValue(jVar, "ignoreElement(...)");
        RxExtKt.plusAssign(a11, RxExtKt.subscribeBy$default(jVar, null, new AllToCartViewModel$addAllSkuAction$3(Lm0.a.f17149a), 1, null));
    }

    public final void attachTokenizedAnalytics(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }

    @NotNull
    public final V<Boolean> getAllToCartButtonState() {
        return this.allToCartButtonState;
    }

    public final void updateVo(@NotNull AllToCartVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.voState = vo;
        this.allToCartButtonState.setValue(Boolean.valueOf(vo.getButton().isActive()));
    }
}
