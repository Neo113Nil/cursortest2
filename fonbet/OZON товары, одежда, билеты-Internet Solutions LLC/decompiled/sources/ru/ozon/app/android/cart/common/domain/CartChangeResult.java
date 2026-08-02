package ru.ozon.app.android.cart.common.domain;

import G.g;
import Kk.C3532b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\n\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartChangeResult;", "", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "", "Lru/ozon/app/android/cart/common/domain/CartChangeAction;", "actions", "", "isSuccess", "", "miniApp", "<init>", "(Ljava/util/Map;Ljava/util/List;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getItems", "()Ljava/util/Map;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Z", "()Z", "Ljava/lang/String;", "getMiniApp", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartChangeResult {

    @NotNull
    private final List<CartChangeAction> actions;
    private final boolean isSuccess;

    @NotNull
    private final Map<Long, CartItemInfo> items;
    private final String miniApp;

    public CartChangeResult(@NotNull Map<Long, CartItemInfo> items, @NotNull List<CartChangeAction> actions, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.items = items;
        this.actions = actions;
        this.isSuccess = z11;
        this.miniApp = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartChangeResult)) {
            return false;
        }
        CartChangeResult cartChangeResult = (CartChangeResult) other;
        return Intrinsics.d(this.items, cartChangeResult.items) && Intrinsics.d(this.actions, cartChangeResult.actions) && this.isSuccess == cartChangeResult.isSuccess && Intrinsics.d(this.miniApp, cartChangeResult.miniApp);
    }

    @NotNull
    public final List<CartChangeAction> getActions() {
        return this.actions;
    }

    @NotNull
    public final Map<Long, CartItemInfo> getItems() {
        return this.items;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(this.items.hashCode() * 31, 31, this.actions), 31, this.isSuccess);
        String str = this.miniApp;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "CartChangeResult(items=" + this.items + ", actions=" + this.actions + ", isSuccess=" + this.isSuccess + ", miniApp=" + this.miniApp + ")";
    }
}
