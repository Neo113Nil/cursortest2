package ru.ozon.app.android.marketing.widgets.ladderActions.core;

import A00.a;
import B0.C2454a;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsUpdateButtonKey;", "LA00/a$J$a;", "", "skuId", "", "quantity", "", "isActive", "<init>", "(Ljava/lang/String;IZ)V", "copy", "(Ljava/lang/String;IZ)Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsUpdateButtonKey;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSkuId", "I", "getQuantity", "Z", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LadderActionsUpdateButtonKey implements a.J.InterfaceC0007a {
    private final boolean isActive;
    private final int quantity;

    @NotNull
    private final String skuId;

    public LadderActionsUpdateButtonKey(@NotNull String skuId, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        this.skuId = skuId;
        this.quantity = i11;
        this.isActive = z11;
    }

    public static /* synthetic */ LadderActionsUpdateButtonKey copy$default(LadderActionsUpdateButtonKey ladderActionsUpdateButtonKey, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = ladderActionsUpdateButtonKey.skuId;
        }
        if ((i12 & 2) != 0) {
            i11 = ladderActionsUpdateButtonKey.quantity;
        }
        if ((i12 & 4) != 0) {
            z11 = ladderActionsUpdateButtonKey.isActive;
        }
        return ladderActionsUpdateButtonKey.copy(str, i11, z11);
    }

    @NotNull
    public final LadderActionsUpdateButtonKey copy(@NotNull String skuId, int quantity, boolean isActive) {
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        return new LadderActionsUpdateButtonKey(skuId, quantity, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderActionsUpdateButtonKey)) {
            return false;
        }
        LadderActionsUpdateButtonKey ladderActionsUpdateButtonKey = (LadderActionsUpdateButtonKey) other;
        return Intrinsics.d(this.skuId, ladderActionsUpdateButtonKey.skuId) && this.quantity == ladderActionsUpdateButtonKey.quantity && this.isActive == ladderActionsUpdateButtonKey.isActive;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isActive) + C2454a.a(this.quantity, this.skuId.hashCode() * 31, 31);
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        String str = this.skuId;
        int i11 = this.quantity;
        return Pk0.a.a(")", C3660k.c(i11, "LadderActionsUpdateButtonKey(skuId=", str, ", quantity=", ", isActive="), this.isActive);
    }
}
