package ru.ozon.app.android.cart.domain.network;

import Bc.o;
import Hn.d;
import Hn.e;
import Hn.f;
import Nc.C3667a;
import Nc.C3668b;
import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import io.reactivex.AbstractC7094b;
import io.reactivex.C;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cart.common.data.Cart;
import ru.ozon.app.android.cart.common.data.CartAddItemResponse;
import ru.ozon.app.android.cart.common.data.CartItemRequest;
import ru.ozon.app.android.cart.common.data.CartItemResponse;
import ru.ozon.app.android.cart.common.domain.CartChangeAction;
import ru.ozon.app.android.cart.common.domain.CartChangeResult;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.data.CartDomainApi;
import ru.ozon.app.android.cart.domain.local.LocalCartDataStorage;
import ru.ozon.app.android.cart.domain.network.CartSyncService;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB/\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J+\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u0010\u0010J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020,2\u0006\u00102\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020,*\u00020\u00172\u0006\u00105\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000e¢\u0006\u0004\b8\u0010\u0010J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001a0;2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b<\u0010=J'\u0010A\u001a\u00020@2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ER\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010FR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010HR\u001c\u0010K\u001a\n J*\u0004\u0018\u00010I0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR(\u0010N\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010T\u001a\n J*\u0004\u0018\u00010S0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010X\u001a\u0010\u0012\f\u0012\n J*\u0004\u0018\u00010W0W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Lru/ozon/app/android/cart/domain/network/CartSyncService;", "", "", "debounce", "Lru/ozon/app/android/cart/domain/data/CartDomainApi;", "cartApi", "Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;", "localCartDataStorage", "localFamilyCartDataStorage", "Lru/ozon/app/android/cart/domain/network/CartSyncTracking;", "cartSyncTracking", "<init>", "(JLru/ozon/app/android/cart/domain/data/CartDomainApi;Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;Lru/ozon/app/android/cart/domain/network/CartSyncTracking;)V", "(Lru/ozon/app/android/cart/domain/data/CartDomainApi;Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;Lru/ozon/app/android/cart/domain/network/CartSyncTracking;)V", "", "loop", "()V", "syncAddToCart", "executeCartUpdateRequests", "", "it", "handleError", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/cart/domain/network/CartChangeRequest;", "cartChangeRequest", "LSc/r;", "Lru/ozon/app/android/cart/common/data/CartAddItemResponse;", "result", "sendResult", "(Lru/ozon/app/android/cart/domain/network/CartChangeRequest;Ljava/lang/Object;)V", "response", "", "removes", "", "miniApp", "handleCart", "(Lru/ozon/app/android/cart/common/data/CartAddItemResponse;Ljava/util/List;Ljava/lang/String;)V", "requests", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "Lru/ozon/app/android/cart/common/data/CartItemRequest;", "requestBody", "(Ljava/util/List;Lru/ozon/app/android/cart/common/domain/CartType;)Ljava/util/List;", "cartItemRequest", "", "shouldSendRequest", "(Lru/ozon/app/android/cart/common/data/CartItemRequest;Lru/ozon/app/android/cart/common/domain/CartType;)Z", "awaitActions", "pollActions", "()Ljava/util/List;", "changeRequest", "findPendingProductId", "(Lru/ozon/app/android/cart/domain/network/CartChangeRequest;)Z", "pendingChangesRequests", "hasWithTheSameId", "(Lru/ozon/app/android/cart/domain/network/CartChangeRequest;Lru/ozon/app/android/cart/domain/network/CartChangeRequest;)Z", "startSync", "Lru/ozon/app/android/cart/common/domain/CartChangeAction;", "action", "Lio/reactivex/y;", "sendActionWithResult", "(Lru/ozon/app/android/cart/common/domain/CartChangeAction;)Lio/reactivex/y;", "versionCartState", "versionFamilyCartState", "Lio/reactivex/b;", "updateCart", "(Ljava/lang/String;JJ)Lio/reactivex/b;", "J", "Lru/ozon/app/android/cart/domain/data/CartDomainApi;", "Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;", "Lru/ozon/app/android/cart/domain/network/CartSyncTracking;", "Ljava/util/concurrent/LinkedBlockingDeque;", "Ljava/util/concurrent/LinkedBlockingDeque;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "cartThreadPool", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ConcurrentHashMap;", "results", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "notEmpty", "Ljava/util/concurrent/locks/Condition;", "LNc/a;", "Lru/ozon/app/android/cart/domain/network/CartUpdateRequest;", "requestsCartUpdateSubject", "LNc/a;", "LNc/b;", "requestCartUpdateCompleteSubject", "LNc/b;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSyncService {

    @NotNull
    private final CartDomainApi cartApi;
    private final CartSyncTracking cartSyncTracking;
    private final ExecutorService cartThreadPool;
    private final long debounce;

    @NotNull
    private final LocalCartDataStorage localCartDataStorage;

    @NotNull
    private final LocalCartDataStorage localFamilyCartDataStorage;

    @NotNull
    private final ReentrantLock lock;
    private final Condition notEmpty;

    @NotNull
    private C3668b requestCartUpdateCompleteSubject;

    @NotNull
    private final LinkedBlockingDeque<CartChangeRequest> requests;

    @NotNull
    private final C3667a<CartUpdateRequest> requestsCartUpdateSubject;

    @NotNull
    private final ConcurrentHashMap<Long, r<CartAddItemResponse>> results;

    public CartSyncService(long j11, @NotNull CartDomainApi cartApi, @NotNull LocalCartDataStorage localCartDataStorage, @NotNull LocalCartDataStorage localFamilyCartDataStorage, CartSyncTracking cartSyncTracking) {
        Intrinsics.checkNotNullParameter(cartApi, "cartApi");
        Intrinsics.checkNotNullParameter(localCartDataStorage, "localCartDataStorage");
        Intrinsics.checkNotNullParameter(localFamilyCartDataStorage, "localFamilyCartDataStorage");
        this.debounce = j11;
        this.cartApi = cartApi;
        this.localCartDataStorage = localCartDataStorage;
        this.localFamilyCartDataStorage = localFamilyCartDataStorage;
        this.cartSyncTracking = cartSyncTracking;
        this.requests = new LinkedBlockingDeque<>();
        this.cartThreadPool = Executors.newSingleThreadExecutor();
        this.results = new ConcurrentHashMap<>();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
        C3667a<CartUpdateRequest> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.requestsCartUpdateSubject = d11;
        C3668b l11 = C3668b.l();
        Intrinsics.checkNotNullExpressionValue(l11, "create(...)");
        this.requestCartUpdateCompleteSubject = l11;
    }

    private final void awaitActions() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (this.requests.isEmpty()) {
            try {
                this.notEmpty.await();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        Unit unit = Unit.f71690a;
        reentrantLock.unlock();
    }

    @SuppressLint({"CheckResult"})
    private final void executeCartUpdateRequests() {
        this.requestsCartUpdateSubject.observeOn(Mc.a.b()).switchMapSingle(new Hn.b(new CartSyncService$executeCartUpdateRequests$1(this))).doAfterTerminate(new InterfaceC9019a() { // from class: Hn.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                CartSyncService.executeCartUpdateRequests$lambda$8(CartSyncService.this);
            }
        }).subscribe(new d(new CartSyncService$executeCartUpdateRequests$3(this), 0), new e(new CartSyncService$executeCartUpdateRequests$4(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C executeCartUpdateRequests$lambda$7(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeCartUpdateRequests$lambda$8(CartSyncService cartSyncService) {
        cartSyncService.requestCartUpdateCompleteSubject = C3668b.l();
    }

    private final boolean findPendingProductId(CartChangeRequest changeRequest) {
        LinkedBlockingDeque<CartChangeRequest> linkedBlockingDeque = this.requests;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedBlockingDeque) {
            if (Intrinsics.d(((CartChangeRequest) obj).getAction().getMiniApp(), changeRequest.getAction().getMiniApp())) {
                arrayList.add(obj);
            }
        }
        ArrayList<CartChangeRequest> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((CartChangeRequest) obj2).getAction().getCartType() == changeRequest.getAction().getCartType()) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        for (CartChangeRequest cartChangeRequest : arrayList2) {
            Intrinsics.f(cartChangeRequest);
            if (hasWithTheSameId(changeRequest, cartChangeRequest)) {
                return true;
            }
        }
        return false;
    }

    private final void handleCart(CartAddItemResponse response, List<CartChangeRequest> removes, String miniApp) {
        Map c11;
        List<CartChangeRequest> list = removes;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (CartTypeKt.isFamilyCart(((CartChangeRequest) obj).getAction().getCartType())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CartChangeRequest) it.next()).getAction());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (CartTypeKt.isMainCart(((CartChangeRequest) obj2).getAction().getCartType())) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((CartChangeRequest) it2.next()).getAction());
        }
        Cart cart = response != null ? response.getCart() : null;
        if (cart == null) {
            if (!arrayList4.isEmpty()) {
                this.localCartDataStorage.removeActions(arrayList4);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.localFamilyCartDataStorage.removeActions(arrayList2);
            return;
        }
        if (!arrayList4.isEmpty()) {
            List<CartItemResponse> cartItems = cart.getCartItems();
            int h11 = U.h(C7714v.z(cartItems, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            for (CartItemResponse cartItemResponse : cartItems) {
                Pair pair = new Pair(Long.valueOf(cartItemResponse.getId()), new CartItemInfo(cartItemResponse.getQty(), cartItemResponse.getSelectedDeliverySchema(), null, null, null, null, 60, null));
                linkedHashMap.put(pair.e(), pair.f());
            }
            this.localCartDataStorage.putResult(new CartChangeResult(linkedHashMap, arrayList4, response.getSuccess(), miniApp));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        List<CartItemResponse> cartItemsFamily = cart.getCartItemsFamily();
        if (cartItemsFamily != null) {
            List<CartItemResponse> list2 = cartItemsFamily;
            int h12 = U.h(C7714v.z(list2, 10));
            c11 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
            for (CartItemResponse cartItemResponse2 : list2) {
                Pair pair2 = new Pair(Long.valueOf(cartItemResponse2.getId()), new CartItemInfo(cartItemResponse2.getQty(), cartItemResponse2.getSelectedDeliverySchema(), null, null, null, null, 60, null));
                c11.put(pair2.e(), pair2.f());
            }
        } else {
            c11 = U.c();
        }
        this.localFamilyCartDataStorage.putResult(new CartChangeResult(c11, arrayList2, response.getSuccess(), miniApp));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable it) {
        Lm0.a.f17149a.e(it);
        this.requestCartUpdateCompleteSubject.onError(it);
    }

    private final boolean hasWithTheSameId(CartChangeRequest cartChangeRequest, CartChangeRequest cartChangeRequest2) {
        Set<Long> keySet = cartChangeRequest.getAction().getItems().keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            if (cartChangeRequest2.getAction().getItems().containsKey(Long.valueOf(((Number) it.next()).longValue()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loop() {
        while (true) {
            syncAddToCart();
        }
    }

    private final List<CartChangeRequest> pollActions() {
        ArrayList arrayList = new ArrayList();
        CartChangeRequest poll = this.requests.poll(this.debounce, TimeUnit.MILLISECONDS);
        while (poll != null) {
            arrayList.add(poll);
            poll = this.requests.poll(this.debounce, TimeUnit.MILLISECONDS);
        }
        return arrayList;
    }

    private final List<CartItemRequest> requestBody(List<CartChangeRequest> requests, CartType cartType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CartChangeRequest> list = requests;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CartChangeRequest) it.next()).getAction());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashMap.putAll(((CartChangeAction) it2.next()).getItems());
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            CartItemInfo cartItemInfo = (CartItemInfo) entry.getValue();
            arrayList2.add(new CartItemRequest(longValue, cartItemInfo.getQuantity(), cartItemInfo.getSelectedDeliverySchema(), cartItemInfo.getSortAfterSku(), cartItemInfo.getForStars(), cartItemInfo.getWholeQuant(), cartItemInfo.getParams()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (shouldSendRequest((CartItemRequest) obj, cartType)) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartAddItemResponse sendActionWithResult$lambda$1(CartChangeAction cartChangeAction, CartSyncService cartSyncService) {
        CartChangeRequest cartChangeRequest = new CartChangeRequest(cartChangeAction, false, 2, null);
        cartSyncService.requests.put(cartChangeRequest);
        ReentrantLock reentrantLock = cartSyncService.lock;
        reentrantLock.lock();
        try {
            cartSyncService.notEmpty.signal();
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
            cartChangeRequest.awaitEnd();
            r<CartAddItemResponse> remove = cartSyncService.results.remove(Long.valueOf(cartChangeAction.getVersionId()));
            if (remove == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object f26106a = remove.getF26106a();
            s.b(f26106a);
            return (CartAddItemResponse) f26106a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private final void sendResult(CartChangeRequest cartChangeRequest, Object result) {
        if (cartChangeRequest.getShouldNotifyResult()) {
            long versionId = cartChangeRequest.getAction().getVersionId();
            r.Companion companion = r.INSTANCE;
            if (result instanceof r.b) {
                Throwable b11 = r.b(result);
                if (b11 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.results.put(Long.valueOf(versionId), r.a(s.a(b11)));
                return;
            }
            ConcurrentHashMap<Long, r<CartAddItemResponse>> concurrentHashMap = this.results;
            Long valueOf = Long.valueOf(versionId);
            s.b(result);
            concurrentHashMap.put(valueOf, r.a(result));
        }
    }

    private final boolean shouldSendRequest(CartItemRequest cartItemRequest, CartType cartType) {
        return cartItemRequest.getQuantity() > 0 || (CartTypeKt.isFamilyCart(cartType) ? this.localFamilyCartDataStorage : this.localCartDataStorage).hasProductInLocal(cartItemRequest.getId());
    }

    private final void syncAddToCart() {
        Object a11;
        Object a12;
        awaitActions();
        List<CartChangeRequest> pollActions = pollActions();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : pollActions) {
            CartChangeRequest cartChangeRequest = (CartChangeRequest) obj;
            Pair pair = new Pair(cartChangeRequest.getAction().getMiniApp(), cartChangeRequest.getAction().getCartType());
            Object obj2 = linkedHashMap.get(pair);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(pair, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Pair pair2 = (Pair) entry.getKey();
            List<CartChangeRequest> list = (List) entry.getValue();
            String str = (String) pair2.a();
            List<CartItemRequest> requestBody = requestBody(list, (CartType) pair2.b());
            try {
                r.Companion companion = r.INSTANCE;
                a11 = (ActionV2Response) this.cartApi.addToCart(requestBody, str).d();
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            boolean z11 = a11 instanceof r.b;
            if (z11) {
                a12 = a11;
            } else {
                try {
                    a12 = (CartAddItemResponse) ((ActionV2Response) a11).getData();
                } catch (Throwable th3) {
                    r.Companion companion3 = r.INSTANCE;
                    a12 = s.a(th3);
                }
            }
            CartAddItemResponse cartAddItemResponse = (CartAddItemResponse) (a12 instanceof r.b ? null : a12);
            ArrayList arrayList = new ArrayList();
            for (CartChangeRequest cartChangeRequest2 : list) {
                if ((cartAddItemResponse == null || !cartAddItemResponse.getSuccess()) && findPendingProductId(cartChangeRequest2)) {
                    this.requests.putFirst(cartChangeRequest2);
                } else {
                    sendResult(cartChangeRequest2, a12);
                    arrayList.add(cartChangeRequest2);
                }
            }
            handleCart(cartAddItemResponse, arrayList, str);
            CartSyncTracking cartSyncTracking = this.cartSyncTracking;
            if (cartSyncTracking != null) {
                if (z11) {
                    a11 = null;
                }
                ActionV2Response actionV2Response = (ActionV2Response) a11;
                cartSyncTracking.sendAddToCartSyncAnalytics(actionV2Response != null ? actionV2Response.getTrackingInfo() : null);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((CartChangeRequest) it.next()).markEnded();
            }
        }
    }

    @NotNull
    public final y<CartAddItemResponse> sendActionWithResult(@NotNull CartChangeAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        (CartTypeKt.isFamilyCart(action.getCartType()) ? this.localFamilyCartDataStorage : this.localCartDataStorage).putAction(action);
        o oVar = new o(new f(0, action, this));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        return oVar;
    }

    public final void startSync() {
        this.cartThreadPool.execute(new Hn.a(this, 0));
        executeCartUpdateRequests();
    }

    @NotNull
    public final AbstractC7094b updateCart(String miniApp, long versionCartState, long versionFamilyCartState) {
        this.requestsCartUpdateSubject.onNext(new CartUpdateRequest(miniApp, versionCartState, versionFamilyCartState));
        return this.requestCartUpdateCompleteSubject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartSyncService(@NotNull CartDomainApi cartApi, @NotNull LocalCartDataStorage localCartDataStorage, @NotNull LocalCartDataStorage localFamilyCartDataStorage, CartSyncTracking cartSyncTracking) {
        this(300L, cartApi, localCartDataStorage, localFamilyCartDataStorage, cartSyncTracking);
        Intrinsics.checkNotNullParameter(cartApi, "cartApi");
        Intrinsics.checkNotNullParameter(localCartDataStorage, "localCartDataStorage");
        Intrinsics.checkNotNullParameter(localFamilyCartDataStorage, "localFamilyCartDataStorage");
    }
}
