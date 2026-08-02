package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonPreCreateVHState;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartPreCreateViewHolderState;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHState;", "", "hasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "mode", "<init>", "(ZLru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasShadow", "()Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "getMode", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DoubleCartPreCreateViewHolderState implements CartButtonPreCreateVHState {
    private final boolean hasShadow;

    @NotNull
    private final DoubleCartVO.CartMode mode;

    public DoubleCartPreCreateViewHolderState(boolean z11, @NotNull DoubleCartVO.CartMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.hasShadow = z11;
        this.mode = mode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoubleCartPreCreateViewHolderState)) {
            return false;
        }
        DoubleCartPreCreateViewHolderState doubleCartPreCreateViewHolderState = (DoubleCartPreCreateViewHolderState) other;
        return this.hasShadow == doubleCartPreCreateViewHolderState.hasShadow && this.mode == doubleCartPreCreateViewHolderState.mode;
    }

    public final boolean getHasShadow() {
        return this.hasShadow;
    }

    @NotNull
    public final DoubleCartVO.CartMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.mode.hashCode() + (Boolean.hashCode(this.hasShadow) * 31);
    }

    @NotNull
    public String toString() {
        return "DoubleCartPreCreateViewHolderState(hasShadow=" + this.hasShadow + ", mode=" + this.mode + ")";
    }
}
