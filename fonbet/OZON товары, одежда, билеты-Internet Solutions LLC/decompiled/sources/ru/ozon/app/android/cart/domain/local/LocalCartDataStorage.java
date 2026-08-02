package ru.ozon.app.android.cart.domain.local;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import Tc.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartChangeAction;
import ru.ozon.app.android.cart.common.domain.CartChangeResult;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartInfoUpdate;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.VersionCartState;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001a\u001a\u00020\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\b¢\u0006\u0004\b(\u0010)J?\u0010.\u001a\u00020\u000e2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b0\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0018058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020<0?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020E0H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010>R\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020M0?8\u0006¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bP\u0010CR\u0011\u0010S\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;", "", "Lru/ozon/app/android/cart/domain/VersionCartState;", "versionCartState", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "<init>", "(Lru/ozon/app/android/cart/domain/VersionCartState;Lru/ozon/app/android/cart/common/domain/CartType;)V", "", "actionVersionId", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "source", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "changeReason", "", "calculateCartState", "(JLru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;)V", "Lkotlin/Pair;", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "buildState", "()Lkotlin/Pair;", "items", "", "Lru/ozon/app/android/cart/common/domain/CartChangeAction;", "removedActions", "handleSuccessResult", "(Ljava/util/Map;Ljava/util/List;)V", "Lru/ozon/app/android/cart/common/domain/CartChangeResult;", "result", "handleFailedResult", "(Lru/ozon/app/android/cart/common/domain/CartChangeResult;)V", "action", "putAction", "(Lru/ozon/app/android/cart/common/domain/CartChangeAction;)V", "removes", "removeActions", "(Ljava/util/List;)V", "productId", "", "hasProductInLocal", "(J)Z", "cartItems", "versionId", "cartSource", "cartChangeSource", "setCartItems", "(Ljava/util/Map;JLru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;)V", "putResult", "Lru/ozon/app/android/cart/domain/VersionCartState;", "Lru/ozon/app/android/cart/common/domain/CartType;", "localItems", "Ljava/util/Map;", "", "actions", "Ljava/util/List;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "LAe/x0;", "", "_countCart", "LAe/x0;", "LAe/M0;", "countCart", "LAe/M0;", "getCountCart", "()LAe/M0;", "LAe/w0;", "Lru/ozon/app/android/cart/common/models/CartInfoUpdate;", "_cartUpdateSharedFlow", "LAe/w0;", "LAe/B0;", "cartInfoUpdateSharedFlow", "LAe/B0;", "getCartInfoUpdateSharedFlow", "()LAe/B0;", "Lru/ozon/app/android/cart/common/domain/CartState;", "_cartStateFlow", "cartStateFlow", "getCartStateFlow", "getCartState", "()Lru/ozon/app/android/cart/common/domain/CartState;", "cartState", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalCartDataStorage {

    @NotNull
    private final x0<CartState> _cartStateFlow;

    @NotNull
    private final w0<CartInfoUpdate> _cartUpdateSharedFlow;

    @NotNull
    private final x0<Integer> _countCart;

    @NotNull
    private final List<CartChangeAction> actions;

    @NotNull
    private final B0<CartInfoUpdate> cartInfoUpdateSharedFlow;

    @NotNull
    private final M0<CartState> cartStateFlow;

    @NotNull
    private final CartType cartType;

    @NotNull
    private final M0<Integer> countCart;

    @NotNull
    private Map<Long, CartItemInfo> localItems;

    @NotNull
    private final ReentrantReadWriteLock lock;

    @NotNull
    private final VersionCartState versionCartState;

    public LocalCartDataStorage(@NotNull VersionCartState versionCartState, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(versionCartState, "versionCartState");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.versionCartState = versionCartState;
        this.cartType = cartType;
        this.localItems = U.c();
        this.actions = new ArrayList();
        this.lock = new ReentrantReadWriteLock();
        x0<Integer> a11 = O0.a(-1);
        this._countCart = a11;
        this.countCart = C2399j.b(a11);
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this._cartUpdateSharedFlow = b11;
        this.cartInfoUpdateSharedFlow = C2399j.a(b11);
        x0<CartState> a12 = O0.a(new CartState(null, 0L, null, null, null, null, null, 127, null));
        this._cartStateFlow = a12;
        this.cartStateFlow = C2399j.b(a12);
    }

    private final Pair<Map<Long, CartItemInfo>, Map<Long, CartItemInfo>> buildState() {
        LinkedHashMap u11 = U.u(this.localItems);
        this._countCart.setValue(Integer.valueOf(u11.size()));
        d builder = new d();
        Iterator<T> it = this.actions.iterator();
        while (it.hasNext()) {
            builder.putAll(((CartChangeAction) it.next()).getItems());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new Pair<>(u11, builder.u());
    }

    private final void calculateCartState(long actionVersionId, CartSource source, CartChangeSource changeReason) {
        Pair<Map<Long, CartItemInfo>, Map<Long, CartItemInfo>> buildState = buildState();
        Map<Long, CartItemInfo> a11 = buildState.a();
        Map<Long, CartItemInfo> b11 = buildState.b();
        this._cartStateFlow.tryEmit(new CartState(U.m(a11, b11), actionVersionId, source, changeReason, b11, a11, this.cartType));
    }

    static /* synthetic */ void calculateCartState$default(LocalCartDataStorage localCartDataStorage, long j11, CartSource cartSource, CartChangeSource cartChangeSource, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cartSource = CartSource.LOCAL;
        }
        if ((i11 & 4) != 0) {
            cartChangeSource = null;
        }
        localCartDataStorage.calculateCartState(j11, cartSource, cartChangeSource);
    }

    private final void handleFailedResult(CartChangeResult result) {
        this.actions.removeAll(result.getActions());
        setCartItems(result.getItems(), this.versionCartState.next(this.cartType), CartSource.REMOTE, CartChangeSource.ADD_TO_CART);
    }

    private final void handleSuccessResult(Map<Long, CartItemInfo> items, List<CartChangeAction> removedActions) {
        Iterator<T> it = removedActions.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        long versionId = ((CartChangeAction) it.next()).getVersionId();
        while (true) {
            long j11 = versionId;
            while (it.hasNext()) {
                versionId = ((CartChangeAction) it.next()).getVersionId();
                if (j11 < versionId) {
                    break;
                }
            }
            this.actions.removeAll(removedActions);
            setCartItems(items, j11, CartSource.REMOTE, CartChangeSource.ADD_TO_CART);
            return;
        }
    }

    @NotNull
    public final B0<CartInfoUpdate> getCartInfoUpdateSharedFlow() {
        return this.cartInfoUpdateSharedFlow;
    }

    @NotNull
    public final CartState getCartState() {
        CartState value = this.cartStateFlow.getValue();
        if (value != null) {
            return value;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @NotNull
    public final M0<CartState> getCartStateFlow() {
        return this.cartStateFlow;
    }

    @NotNull
    public final M0<Integer> getCountCart() {
        return this.countCart;
    }

    public final boolean hasProductInLocal(long productId) {
        boolean z11;
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.lock();
        try {
            CartItemInfo cartItemInfo = this.localItems.get(Long.valueOf(productId));
            if (cartItemInfo != null) {
                if (cartItemInfo.getQuantity() > 0) {
                    z11 = true;
                    return z11;
                }
            }
            z11 = false;
            return z11;
        } finally {
            readLock.unlock();
        }
    }

    public final void putAction(@NotNull CartChangeAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.actions.add(action);
            calculateCartState$default(this, action.getVersionId(), null, null, 6, null);
            Unit unit = Unit.f71690a;
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void putResult(@NotNull CartChangeResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (result.getIsSuccess()) {
                handleSuccessResult(result.getItems(), result.getActions());
            } else {
                handleFailedResult(result);
            }
            Unit unit = Unit.f71690a;
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void removeActions(@NotNull List<CartChangeAction> removes) {
        Intrinsics.checkNotNullParameter(removes, "removes");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.actions.removeAll(removes);
            calculateCartState$default(this, this.versionCartState.next(this.cartType), null, null, 6, null);
            Unit unit = Unit.f71690a;
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void setCartItems(@NotNull Map<Long, CartItemInfo> cartItems, long versionId, @NotNull CartSource cartSource, CartChangeSource cartChangeSource) {
        Intrinsics.checkNotNullParameter(cartItems, "cartItems");
        Intrinsics.checkNotNullParameter(cartSource, "cartSource");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            boolean d11 = Intrinsics.d(cartItems, this.localItems);
            this._cartUpdateSharedFlow.tryEmit(new CartInfoUpdate(cartItems.size(), !d11, cartChangeSource));
            if (!d11) {
                this.localItems = cartItems;
                calculateCartState(versionId, cartSource, cartChangeSource);
            }
            Unit unit = Unit.f71690a;
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }
}
