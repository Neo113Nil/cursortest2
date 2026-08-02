package ru.ozon.app.android.cart.domain;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Bc.j;
import Bc.t;
import Bt.C2673b;
import Dp.C2877a;
import Mc.a;
import Sc.o;
import Sc.s;
import WZ.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.data.CartItemTracking;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.models.AddProductsToCartParams;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.AnalyticsActionEvents;
import ru.ozon.app.android.cart.common.models.CartAction;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.domain.CartDomainInteractor;
import ru.ozon.app.android.cart.domain.CartDomainInteractorImpl;
import ru.ozon.app.android.cart.domain.data.actions.CartActionDelegate;
import ru.ozon.app.android.cart.domain.model.RemoveProductWithTokenizedAnalyticsParams;
import ru.ozon.app.android.cart.domain.prefetch.CartManagerPrefetch;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JQ\u0010\u001f\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010,\u001a\u00020\u00142\n\u0010+\u001a\u00060)j\u0002`*H\u0016¢\u0006\u0004\b,\u0010-J'\u00101\u001a\b\u0012\u0004\u0012\u00020\f002\u0006\u0010#\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\f002\u0006\u0010#\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0016\u0010:\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020>0=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006D"}, d2 = {"Lru/ozon/app/android/cart/domain/CartDomainInteractorImpl;", "Lru/ozon/app/android/cart/domain/CartDomainInteractor;", "Lru/ozon/app/android/cart/domain/prefetch/CartManagerPrefetch;", "cartManagerPrefetch", "Lru/ozon/app/android/cart/domain/CartDomainAnalytics;", "cartDomainAnalytics", "Lru/ozon/app/android/cart/domain/data/actions/CartActionDelegate;", "cartActionDelegate", "Lru/ozon/app/android/cart/domain/VersionCartState;", "versionCartState", "<init>", "(Lru/ozon/app/android/cart/domain/prefetch/CartManagerPrefetch;Lru/ozon/app/android/cart/domain/CartDomainAnalytics;Lru/ozon/app/android/cart/domain/data/actions/CartActionDelegate;Lru/ozon/app/android/cart/domain/VersionCartState;)V", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "dto", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "Lru/ozon/app/android/cart/common/models/AnalyticsActionEvents;", "events", "", "sendCartActionAnalytics", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;Ljava/util/Map;Lru/ozon/app/android/cart/common/models/AnalyticsActionEvents;)V", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "analyticsEvent", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartAnalyticsEvent;", "additionalAnalyticsEvent", "version", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "addProductInternalAndTrackTokenized", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;JLru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "data", "Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "params", "sendPreToCartAnalytics", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;)V", "versionId", "updateLastVersion", "(Lru/ozon/app/android/cart/common/domain/CartType;J)J", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "attach", "(LWZ/l;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "showErrorNotification", "Lio/reactivex/y;", "addProductsWithTokenizedAnalytics", "(Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lio/reactivex/y;", "Lru/ozon/app/android/cart/domain/model/RemoveProductWithTokenizedAnalyticsParams;", "removeProductWithTokenizedAnalytics", "(Lru/ozon/app/android/cart/domain/model/RemoveProductWithTokenizedAnalyticsParams;)Lio/reactivex/y;", "Lru/ozon/app/android/cart/domain/prefetch/CartManagerPrefetch;", "Lru/ozon/app/android/cart/domain/CartDomainAnalytics;", "Lru/ozon/app/android/cart/domain/data/actions/CartActionDelegate;", "Lru/ozon/app/android/cart/domain/VersionCartState;", "lastVersion", "J", "lastFamilyCartVersion", "LAe/h;", "Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateFlow", "()LAe/h;", "cartStateFlow", "getFamilyCartStateFlow", "familyCartStateFlow", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartDomainInteractorImpl implements CartDomainInteractor {

    @NotNull
    private final CartActionDelegate cartActionDelegate;

    @NotNull
    private final CartDomainAnalytics cartDomainAnalytics;

    @NotNull
    private final CartManagerPrefetch cartManagerPrefetch;
    private long lastFamilyCartVersion;
    private long lastVersion;

    @NotNull
    private final VersionCartState versionCartState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartType.values().length];
            try {
                iArr[CartType.FAMILY_CART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartType.MAIN_CART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CartDomainInteractorImpl(@NotNull CartManagerPrefetch cartManagerPrefetch, @NotNull CartDomainAnalytics cartDomainAnalytics, @NotNull CartActionDelegate cartActionDelegate, @NotNull VersionCartState versionCartState) {
        Intrinsics.checkNotNullParameter(cartManagerPrefetch, "cartManagerPrefetch");
        Intrinsics.checkNotNullParameter(cartDomainAnalytics, "cartDomainAnalytics");
        Intrinsics.checkNotNullParameter(cartActionDelegate, "cartActionDelegate");
        Intrinsics.checkNotNullParameter(versionCartState, "versionCartState");
        this.cartManagerPrefetch = cartManagerPrefetch;
        this.cartDomainAnalytics = cartDomainAnalytics;
        this.cartActionDelegate = cartActionDelegate;
        this.versionCartState = versionCartState;
        this.lastVersion = Long.MIN_VALUE;
        this.lastFamilyCartVersion = Long.MIN_VALUE;
    }

    private final CartAddItemDTO addProductInternalAndTrackTokenized(Map<Long, CartItemInfo> items, List<ProductTokenizedCartAnalyticsEvent> analyticsEvent, List<TokenizedCartAnalyticsEvent> additionalAnalyticsEvent, long version, CartType cartType) {
        CartAddItemDTO d11 = this.cartManagerPrefetch.addProducts(new AddProductsToCartParams(items, Long.valueOf(version), cartType)).d();
        if (d11.getSuccess()) {
            this.cartDomainAnalytics.trackToCart(d11.getCart(), analyticsEvent, additionalAnalyticsEvent);
        }
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartAddItemDTO addProductsWithTokenizedAnalytics$lambda$2(CartDomainInteractorImpl cartDomainInteractorImpl, AddProductsWithTokenizedAnalytics addProductsWithTokenizedAnalytics, long j11) {
        return cartDomainInteractorImpl.addProductInternalAndTrackTokenized(addProductsWithTokenizedAnalytics.getItems(), addProductsWithTokenizedAnalytics.getAnalyticsEvent(), addProductsWithTokenizedAnalytics.getAdditionalAnalyticsEvent(), j11, addProductsWithTokenizedAnalytics.getCartType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCartActionAnalytics(CartAddItemDTO dto, Map<Long, CartItemInfo> items, AnalyticsActionEvents events) {
        if (dto.getAction() != null) {
            AtomActionDTO action = dto.getAction();
            if (action != null) {
                this.cartActionDelegate.putEvent(new CartAction.Action(action));
            }
        } else if (dto.getSuccess()) {
            this.cartActionDelegate.putEvent(new CartAction.CartSuccess(items));
        }
        String deeplink = dto.getDeeplink();
        if (deeplink != null) {
            if (h.K(deeplink)) {
                deeplink = null;
            }
            if (deeplink != null) {
                this.cartActionDelegate.putEvent(new CartAction.CartOpenSheetDeeplink(items, deeplink, events));
            }
        }
        Restriction restriction = dto.getRestriction();
        if (restriction != null) {
            this.cartActionDelegate.putEvent(new CartAction.CartShowRestriction(restriction));
        }
        NotificationDTO notificationBar = dto.getNotificationBar();
        if (notificationBar != null) {
            this.cartActionDelegate.putEvent(new CartAction.CartShowNotificationBar(notificationBar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPreToCartAnalytics(CartAddItemDTO data, AddProductsWithTokenizedAnalytics params) {
        CartDomainAnalytics cartDomainAnalytics = this.cartDomainAnalytics;
        Map<String, CartItemTracking> itemsTrackingInfo = data.getItemsTrackingInfo();
        Map<Long, CartItemInfo> items = params.getItems();
        ArrayList arrayList = new ArrayList(items.size());
        Iterator<Map.Entry<Long, CartItemInfo>> it = items.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getKey().longValue()));
        }
        cartDomainAnalytics.trackPreToCart(itemsTrackingInfo, C7714v.Y0(arrayList), params.getWidgetId());
    }

    private final long updateLastVersion(CartType cartType, long versionId) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[cartType.ordinal()];
        if (i11 == 1) {
            long max = Math.max(versionId, this.lastFamilyCartVersion);
            this.lastFamilyCartVersion = max;
            return max;
        }
        if (i11 != 2) {
            throw new o();
        }
        long max2 = Math.max(versionId, this.lastVersion);
        this.lastVersion = max2;
        return max2;
    }

    @Override // ru.ozon.app.android.cart.domain.CartDomainInteractor
    @NotNull
    public y<CartAddItemDTO> addProductsWithTokenizedAnalytics(@NotNull final AddProductsWithTokenizedAnalytics params, NotificationDTO showErrorNotification) {
        Intrinsics.checkNotNullParameter(params, "params");
        final long updateLastVersion = updateLastVersion(params.getCartType(), this.versionCartState.next(params.getCartType()));
        t g10 = new Bc.h(new j(new Bc.o(new Callable() { // from class: Fn.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CartAddItemDTO addProductsWithTokenizedAnalytics$lambda$2;
                addProductsWithTokenizedAnalytics$lambda$2 = CartDomainInteractorImpl.addProductsWithTokenizedAnalytics$lambda$2(CartDomainInteractorImpl.this, params, updateLastVersion);
                return addProductsWithTokenizedAnalytics$lambda$2;
            }
        }), new C2877a(new CartDomainInteractorImpl$addProductsWithTokenizedAnalytics$2(params, this), 1)), new C2673b(new CartDomainInteractorImpl$addProductsWithTokenizedAnalytics$3(showErrorNotification, this), 1)).j(a.b()).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        return g10;
    }

    @Override // ru.ozon.app.android.cart.domain.CartDomainInteractor
    public void attach(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartDomainAnalytics.attach(tokenizedAnalytics);
    }

    @Override // ru.ozon.app.android.cart.domain.CartDomainInteractor
    @NotNull
    public InterfaceC2395h<CartState> getCartStateFlow() {
        final InterfaceC2395h<CartState> cartStateFlow = this.cartManagerPrefetch.getCartStateFlow();
        return new InterfaceC2395h<CartState>() { // from class: ru.ozon.app.android.cart.domain.CartDomainInteractorImpl$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.domain.CartDomainInteractorImpl$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ CartDomainInteractorImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.domain.CartDomainInteractorImpl$special$$inlined$filter$1$2", f = "CartDomainInteractorImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.domain.CartDomainInteractorImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, CartDomainInteractorImpl cartDomainInteractorImpl) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = cartDomainInteractorImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    long j11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                long actionVersionId = ((CartState) obj).getActionVersionId();
                                j11 = this.this$0.lastVersion;
                                if (actionVersionId >= j11) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super CartState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    @Override // ru.ozon.app.android.cart.domain.CartDomainInteractor
    @NotNull
    public InterfaceC2395h<CartState> getFamilyCartStateFlow() {
        final InterfaceC2395h<CartState> familyCartStateFlow = this.cartManagerPrefetch.getFamilyCartStateFlow();
        return new InterfaceC2395h<CartState>() { // from class: ru.ozon.app.android.cart.domain.CartDomainInteractorImpl$special$$inlined$filter$2

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.domain.CartDomainInteractorImpl$special$$inlined$filter$2$2, reason: invalid class name */
            /* loaded from: classes11.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ CartDomainInteractorImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.domain.CartDomainInteractorImpl$special$$inlined$filter$2$2", f = "CartDomainInteractorImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.domain.CartDomainInteractorImpl$special$$inlined$filter$2$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, CartDomainInteractorImpl cartDomainInteractorImpl) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = cartDomainInteractorImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    long j11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                long actionVersionId = ((CartState) obj).getActionVersionId();
                                j11 = this.this$0.lastFamilyCartVersion;
                                if (actionVersionId >= j11) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super CartState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    @Override // ru.ozon.app.android.cart.domain.CartDomainInteractor
    @NotNull
    public y<CartAddItemDTO> removeProductWithTokenizedAnalytics(@NotNull RemoveProductWithTokenizedAnalyticsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return CartDomainInteractor.DefaultImpls.addProductsWithTokenizedAnalytics$default(this, new AddProductsWithTokenizedAnalytics(U.i(new Pair(Long.valueOf(params.getProductId()), new CartItemInfo(0, params.getSelectedDeliverySchema(), null, params.getForStars(), null, params.getParams(), 20, null))), params.getAnalyticsEvent(), params.getAdditionalAnalyticsEvent(), params.getWidgetId(), params.getCartType()), null, 2, null);
    }
}
