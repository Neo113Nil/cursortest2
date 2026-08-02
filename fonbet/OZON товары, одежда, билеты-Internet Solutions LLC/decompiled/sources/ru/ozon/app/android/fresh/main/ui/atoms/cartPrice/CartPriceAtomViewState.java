package ru.ozon.app.android.fresh.main.ui.atoms.cartPrice;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceAtomViewState;", "", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;", "atom", "", "viewIsEnabled", "<init>", "(Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;", "getAtom", "()Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;", "Z", "getViewIsEnabled", "()Z", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartPriceAtomViewState {
    private final CartPriceFreshAtom atom;
    private final boolean viewIsEnabled;

    public CartPriceAtomViewState(CartPriceFreshAtom cartPriceFreshAtom, boolean z11) {
        this.atom = cartPriceFreshAtom;
        this.viewIsEnabled = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartPriceAtomViewState)) {
            return false;
        }
        CartPriceAtomViewState cartPriceAtomViewState = (CartPriceAtomViewState) other;
        return Intrinsics.d(this.atom, cartPriceAtomViewState.atom) && this.viewIsEnabled == cartPriceAtomViewState.viewIsEnabled;
    }

    public final CartPriceFreshAtom getAtom() {
        return this.atom;
    }

    public int hashCode() {
        CartPriceFreshAtom cartPriceFreshAtom = this.atom;
        return Boolean.hashCode(this.viewIsEnabled) + ((cartPriceFreshAtom == null ? 0 : cartPriceFreshAtom.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "CartPriceAtomViewState(atom=" + this.atom + ", viewIsEnabled=" + this.viewIsEnabled + ")";
    }
}
