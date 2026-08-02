package ru.ozon.app.android.cart.domain.network;

import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartChangeAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/domain/network/CartChangeRequest;", "", "Lru/ozon/app/android/cart/common/domain/CartChangeAction;", "action", "", "shouldNotifyResult", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartChangeAction;Z)V", "", "awaitEnd", "()V", "markEnded", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/common/domain/CartChangeAction;", "getAction", "()Lru/ozon/app/android/cart/common/domain/CartChangeAction;", "Z", "getShouldNotifyResult", "()Z", "Ljava/util/concurrent/CountDownLatch;", "latch", "Ljava/util/concurrent/CountDownLatch;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartChangeRequest {

    @NotNull
    private final CartChangeAction action;

    @NotNull
    private final CountDownLatch latch;
    private final boolean shouldNotifyResult;

    public CartChangeRequest(@NotNull CartChangeAction action, boolean z11) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        this.shouldNotifyResult = z11;
        this.latch = new CountDownLatch(1);
    }

    public final void awaitEnd() {
        this.latch.await();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartChangeRequest)) {
            return false;
        }
        CartChangeRequest cartChangeRequest = (CartChangeRequest) other;
        return Intrinsics.d(this.action, cartChangeRequest.action) && this.shouldNotifyResult == cartChangeRequest.shouldNotifyResult;
    }

    @NotNull
    public final CartChangeAction getAction() {
        return this.action;
    }

    public final boolean getShouldNotifyResult() {
        return this.shouldNotifyResult;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldNotifyResult) + (this.action.hashCode() * 31);
    }

    public final void markEnded() {
        this.latch.countDown();
    }

    @NotNull
    public String toString() {
        return "CartChangeRequest(action=" + this.action + ", shouldNotifyResult=" + this.shouldNotifyResult + ")";
    }

    public /* synthetic */ CartChangeRequest(CartChangeAction cartChangeAction, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cartChangeAction, (i11 & 2) != 0 ? true : z11);
    }
}
