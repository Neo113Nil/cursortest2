package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model;

import G.g;
import Kk.C3532b;
import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0007\u0010\u0016¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2State;", "", "", "priceError", "quantityError", "", "pressedDiscount", "isSendButtonEnabled", "<init>", "(ZZLjava/lang/String;Z)V", "copy", "(ZZLjava/lang/String;Z)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2State;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getPriceError", "()Z", "getQuantityError", "Ljava/lang/String;", "getPressedDiscount", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WannaDiscountV2State {
    private final boolean isSendButtonEnabled;

    @NotNull
    private final String pressedDiscount;
    private final boolean priceError;
    private final boolean quantityError;

    public WannaDiscountV2State() {
        this(false, false, null, false, 15, null);
    }

    public static /* synthetic */ WannaDiscountV2State copy$default(WannaDiscountV2State wannaDiscountV2State, boolean z11, boolean z12, String str, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = wannaDiscountV2State.priceError;
        }
        if ((i11 & 2) != 0) {
            z12 = wannaDiscountV2State.quantityError;
        }
        if ((i11 & 4) != 0) {
            str = wannaDiscountV2State.pressedDiscount;
        }
        if ((i11 & 8) != 0) {
            z13 = wannaDiscountV2State.isSendButtonEnabled;
        }
        return wannaDiscountV2State.copy(z11, z12, str, z13);
    }

    @NotNull
    public final WannaDiscountV2State copy(boolean priceError, boolean quantityError, @NotNull String pressedDiscount, boolean isSendButtonEnabled) {
        Intrinsics.checkNotNullParameter(pressedDiscount, "pressedDiscount");
        return new WannaDiscountV2State(priceError, quantityError, pressedDiscount, isSendButtonEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WannaDiscountV2State)) {
            return false;
        }
        WannaDiscountV2State wannaDiscountV2State = (WannaDiscountV2State) other;
        return this.priceError == wannaDiscountV2State.priceError && this.quantityError == wannaDiscountV2State.quantityError && Intrinsics.d(this.pressedDiscount, wannaDiscountV2State.pressedDiscount) && this.isSendButtonEnabled == wannaDiscountV2State.isSendButtonEnabled;
    }

    @NotNull
    public final String getPressedDiscount() {
        return this.pressedDiscount;
    }

    public final boolean getPriceError() {
        return this.priceError;
    }

    public final boolean getQuantityError() {
        return this.quantityError;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSendButtonEnabled) + g.a(C3532b.a(Boolean.hashCode(this.priceError) * 31, 31, this.quantityError), 31, this.pressedDiscount);
    }

    /* renamed from: isSendButtonEnabled, reason: from getter */
    public final boolean getIsSendButtonEnabled() {
        return this.isSendButtonEnabled;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.priceError;
        boolean z12 = this.quantityError;
        String str = this.pressedDiscount;
        boolean z13 = this.isSendButtonEnabled;
        StringBuilder d11 = a.d("WannaDiscountV2State(priceError=", ", quantityError=", ", pressedDiscount=", z11, z12);
        d11.append(str);
        d11.append(", isSendButtonEnabled=");
        d11.append(z13);
        d11.append(")");
        return d11.toString();
    }

    public WannaDiscountV2State(boolean z11, boolean z12, @NotNull String pressedDiscount, boolean z13) {
        Intrinsics.checkNotNullParameter(pressedDiscount, "pressedDiscount");
        this.priceError = z11;
        this.quantityError = z12;
        this.pressedDiscount = pressedDiscount;
        this.isSendButtonEnabled = z13;
    }

    public /* synthetic */ WannaDiscountV2State(boolean z11, boolean z12, String str, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? true : z13);
    }
}
