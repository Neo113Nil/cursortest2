package ru.ozon.app.android.cart.common.domain;

import D40.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartChangeAction;", "", "", "versionId", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "", "miniApp", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "<init>", "(JLjava/util/Map;Ljava/lang/String;Lru/ozon/app/android/cart/common/domain/CartType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVersionId", "()J", "Ljava/util/Map;", "getItems", "()Ljava/util/Map;", "Ljava/lang/String;", "getMiniApp", "Lru/ozon/app/android/cart/common/domain/CartType;", "getCartType", "()Lru/ozon/app/android/cart/common/domain/CartType;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartChangeAction {

    @NotNull
    private final CartType cartType;

    @NotNull
    private final Map<Long, CartItemInfo> items;
    private final String miniApp;
    private final long versionId;

    public CartChangeAction(long j11, @NotNull Map<Long, CartItemInfo> items, String str, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.versionId = j11;
        this.items = items;
        this.miniApp = str;
        this.cartType = cartType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartChangeAction)) {
            return false;
        }
        CartChangeAction cartChangeAction = (CartChangeAction) other;
        return this.versionId == cartChangeAction.versionId && Intrinsics.d(this.items, cartChangeAction.items) && Intrinsics.d(this.miniApp, cartChangeAction.miniApp) && this.cartType == cartChangeAction.cartType;
    }

    @NotNull
    public final CartType getCartType() {
        return this.cartType;
    }

    @NotNull
    public final Map<Long, CartItemInfo> getItems() {
        return this.items;
    }

    public final String getMiniApp() {
        return this.miniApp;
    }

    public final long getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        int a11 = c.a(this.items, Long.hashCode(this.versionId) * 31, 31);
        String str = this.miniApp;
        return this.cartType.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "CartChangeAction(versionId=" + this.versionId + ", items=" + this.items + ", miniApp=" + this.miniApp + ", cartType=" + this.cartType + ")";
    }
}
