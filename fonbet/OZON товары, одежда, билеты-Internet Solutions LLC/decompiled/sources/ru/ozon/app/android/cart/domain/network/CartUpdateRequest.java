package ru.ozon.app.android.cart.domain.network;

import E0.C2942q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/domain/network/CartUpdateRequest;", "", "", "miniApp", "", "versionCart", "versionFamilyCart", "<init>", "(Ljava/lang/String;JJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMiniApp", "J", "getVersionCart", "()J", "getVersionFamilyCart", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class CartUpdateRequest {
    private final String miniApp;
    private final long versionCart;
    private final long versionFamilyCart;

    public CartUpdateRequest(String str, long j11, long j12) {
        this.miniApp = str;
        this.versionCart = j11;
        this.versionFamilyCart = j12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartUpdateRequest)) {
            return false;
        }
        CartUpdateRequest cartUpdateRequest = (CartUpdateRequest) other;
        return Intrinsics.d(this.miniApp, cartUpdateRequest.miniApp) && this.versionCart == cartUpdateRequest.versionCart && this.versionFamilyCart == cartUpdateRequest.versionFamilyCart;
    }

    public final String getMiniApp() {
        return this.miniApp;
    }

    public final long getVersionCart() {
        return this.versionCart;
    }

    public final long getVersionFamilyCart() {
        return this.versionFamilyCart;
    }

    public int hashCode() {
        String str = this.miniApp;
        return Long.hashCode(this.versionFamilyCart) + Pk0.c.a((str == null ? 0 : str.hashCode()) * 31, 31, this.versionCart);
    }

    @NotNull
    public String toString() {
        String str = this.miniApp;
        long j11 = this.versionCart;
        long j12 = this.versionFamilyCart;
        StringBuilder d11 = C2942q.d(j11, "CartUpdateRequest(miniApp=", str, ", versionCart=");
        d11.append(", versionFamilyCart=");
        d11.append(j12);
        d11.append(")");
        return d11.toString();
    }
}
