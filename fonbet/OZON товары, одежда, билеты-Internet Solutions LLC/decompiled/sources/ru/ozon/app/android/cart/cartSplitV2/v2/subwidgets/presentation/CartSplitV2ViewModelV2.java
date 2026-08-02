package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation;

import Nc.C3669c;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import h20.InterfaceC6786a;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.ChangeQuantityCalculator;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00060\u0001j\u0002`\u0002:\u0001:B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0004J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0004J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0004J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0004R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010#\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\"\u0010&\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\"\u0010)\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00050\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\"\u0010-\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00050\u00050,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CartSplitV2ViewModelV2;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "<init>", "()V", "", "quantity", "", "setQuantity", "(I)V", "multiplicity", "minimum", "maximum", "quantSize", "setQuantityData", "(IIII)V", "setCurrentQuantity", "", "input", "setFromInput", "(Ljava/lang/String;)V", "updateQuantityIfNeed", "decreaseQuantity", "increaseQuantity", "refresh", "Landroidx/lifecycle/V;", "", "kotlin.jvm.PlatformType", "_decreaseEnabled", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "decreaseEnabled", "Landroidx/lifecycle/P;", "getDecreaseEnabled", "()Landroidx/lifecycle/P;", "_increaseEnabled", "increaseEnabled", "getIncreaseEnabled", "_quantityInputEnabled", "quantityInputEnabled", "getQuantityInputEnabled", "_currentQuantity", "currentQuantity", "getCurrentQuantity", "LNc/c;", "_refreshEvents", "LNc/c;", "Lio/reactivex/p;", "refreshEvents", "Lio/reactivex/p;", "getRefreshEvents", "()Lio/reactivex/p;", "lastNonZeroQuantity", "I", "lastQuantityUpdateRequest", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ChangeQuantityCalculator;", "changeQuantityCalculator", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ChangeQuantityCalculator;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ViewModelV2 implements InterfaceC6786a {

    @NotNull
    private final V<Integer> _currentQuantity;

    @NotNull
    private final V<Boolean> _decreaseEnabled;

    @NotNull
    private final V<Boolean> _increaseEnabled;

    @NotNull
    private final V<Boolean> _quantityInputEnabled;

    @NotNull
    private final C3669c<Integer> _refreshEvents;

    @NotNull
    private ChangeQuantityCalculator changeQuantityCalculator;

    @NotNull
    private final P<Integer> currentQuantity;

    @NotNull
    private final P<Boolean> decreaseEnabled;

    @NotNull
    private final P<Boolean> increaseEnabled;
    private int lastNonZeroQuantity;
    private int lastQuantityUpdateRequest;

    @NotNull
    private final P<Boolean> quantityInputEnabled;

    @NotNull
    private final p<Integer> refreshEvents;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CartSplitV2ViewModelV2$Companion;", "", "<init>", "()V", "QUANTITY_ZERO", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartSplitV2ViewModelV2() {
        Boolean bool = Boolean.TRUE;
        V<Boolean> v11 = new V<>(bool);
        this._decreaseEnabled = v11;
        this.decreaseEnabled = v11;
        V<Boolean> v12 = new V<>(bool);
        this._increaseEnabled = v12;
        this.increaseEnabled = v12;
        V<Boolean> v13 = new V<>(bool);
        this._quantityInputEnabled = v13;
        this.quantityInputEnabled = v13;
        V<Integer> v14 = new V<>(1);
        this._currentQuantity = v14;
        this.currentQuantity = v14;
        C3669c<Integer> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this._refreshEvents = d11;
        this.refreshEvents = d11;
        this.changeQuantityCalculator = ChangeQuantityCalculator.INSTANCE.getEMPTY_INSTANCE();
    }

    private final void setQuantity(int quantity) {
        this._currentQuantity.setValue(Integer.valueOf(quantity));
        boolean calculateDecreaseEnabled = this.changeQuantityCalculator.calculateDecreaseEnabled(quantity);
        this._decreaseEnabled.setValue(Boolean.valueOf(calculateDecreaseEnabled));
        boolean calculateIncreaseEnabled = this.changeQuantityCalculator.calculateIncreaseEnabled(quantity);
        this._increaseEnabled.setValue(Boolean.valueOf(calculateIncreaseEnabled));
        this._quantityInputEnabled.setValue(Boolean.valueOf(calculateDecreaseEnabled || calculateIncreaseEnabled));
    }

    public final void decreaseQuantity() {
        ChangeQuantityCalculator changeQuantityCalculator = this.changeQuantityCalculator;
        Integer value = this._currentQuantity.getValue();
        setQuantity(changeQuantityCalculator.calculateDecrease(value != null ? value.intValue() : 0));
        refresh();
    }

    @NotNull
    public final P<Integer> getCurrentQuantity() {
        return this.currentQuantity;
    }

    @NotNull
    public final P<Boolean> getDecreaseEnabled() {
        return this.decreaseEnabled;
    }

    @NotNull
    public final P<Boolean> getIncreaseEnabled() {
        return this.increaseEnabled;
    }

    @NotNull
    public final P<Boolean> getQuantityInputEnabled() {
        return this.quantityInputEnabled;
    }

    @NotNull
    public final p<Integer> getRefreshEvents() {
        return this.refreshEvents;
    }

    public final void increaseQuantity() {
        ChangeQuantityCalculator changeQuantityCalculator = this.changeQuantityCalculator;
        Integer value = this._currentQuantity.getValue();
        setQuantity(changeQuantityCalculator.calculateIncrease(value != null ? value.intValue() : 0));
        refresh();
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
    }

    public final void refresh() {
        Integer value = this._currentQuantity.getValue();
        if (value != null) {
            this.lastQuantityUpdateRequest = value.intValue();
            this._refreshEvents.onNext(value);
        }
    }

    public final void setCurrentQuantity(int quantity) {
        if (quantity != 0) {
            this.lastNonZeroQuantity = quantity;
        }
        setQuantity(quantity);
        this.lastQuantityUpdateRequest = quantity;
    }

    public final void setFromInput(String input) {
        Integer w02;
        int intValue = (input == null || (w02 = h.w0(input)) == null) ? 0 : w02.intValue();
        if (intValue != 0) {
            this.lastNonZeroQuantity = intValue;
        }
        this._currentQuantity.setValue(Integer.valueOf(intValue));
    }

    public final void setQuantityData(int multiplicity, int minimum, int maximum, int quantSize) {
        this.changeQuantityCalculator = new ChangeQuantityCalculator(multiplicity, minimum, maximum, quantSize);
    }

    public final void updateQuantityIfNeed() {
        int i11;
        int i12 = this.lastQuantityUpdateRequest;
        Integer value = this._currentQuantity.getValue();
        if (value != null && i12 == value.intValue()) {
            return;
        }
        Integer value2 = this._currentQuantity.getValue();
        if (value2 != null) {
            if (value2.intValue() == 0) {
                value2 = null;
            }
            if (value2 != null) {
                i11 = value2.intValue();
                this._currentQuantity.setValue(Integer.valueOf(this.changeQuantityCalculator.calculateFromInput(i11)));
                refresh();
            }
        }
        i11 = this.lastNonZeroQuantity;
        this._currentQuantity.setValue(Integer.valueOf(this.changeQuantityCalculator.calculateFromInput(i11)));
        refresh();
    }
}
