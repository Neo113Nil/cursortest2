package ru.ozon.app.android.cart.cartSplitV2.v2.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0003J\f\u0010\u0010\u001a\u00020\u0003*\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/ChangeQuantityCalculator;", "", "multiplicity", "", "minimum", "maximum", "quantSize", "<init>", "(IIII)V", "calculateIncrease", "currentQuantity", "calculateDecrease", "calculateFromInput", "calculateDecreaseEnabled", "", "calculateIncreaseEnabled", "coerceMinMax", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeQuantityCalculator {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ChangeQuantityCalculator EMPTY_INSTANCE = new ChangeQuantityCalculator(1, 0, 0, 0);
    private final int maximum;
    private final int minimum;
    private final int multiplicity;
    private final int quantSize;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/ChangeQuantityCalculator$Companion;", "", "<init>", "()V", "EMPTY_INSTANCE", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ChangeQuantityCalculator;", "getEMPTY_INSTANCE", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/ChangeQuantityCalculator;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ChangeQuantityCalculator getEMPTY_INSTANCE() {
            return ChangeQuantityCalculator.EMPTY_INSTANCE;
        }

        private Companion() {
        }
    }

    public ChangeQuantityCalculator(int i11, int i12, int i13, int i14) {
        this.multiplicity = i11;
        this.minimum = i12;
        this.maximum = i13;
        this.quantSize = i14;
    }

    private final int coerceMinMax(int i11) {
        int i12 = this.minimum;
        if (i11 < i12) {
            i11 = i12;
        }
        int i13 = this.maximum;
        return i11 > i13 ? i13 : i11;
    }

    public final int calculateDecrease(int currentQuantity) {
        int i11 = this.quantSize;
        if (i11 > 0 && currentQuantity <= i11) {
            i11 = this.multiplicity;
        } else if (i11 <= 0 || currentQuantity % i11 != 0) {
            if (i11 <= 0 || currentQuantity <= i11) {
                i11 = this.multiplicity;
                if (currentQuantity % i11 != 0) {
                    i11 = currentQuantity % i11;
                }
            } else {
                i11 = currentQuantity % i11;
            }
        }
        return coerceMinMax(currentQuantity - i11);
    }

    public final boolean calculateDecreaseEnabled(int currentQuantity) {
        return currentQuantity - this.multiplicity >= this.minimum;
    }

    public final int calculateFromInput(int currentQuantity) {
        return (int) (Math.ceil(coerceMinMax(currentQuantity) / this.multiplicity) * this.multiplicity);
    }

    public final int calculateIncrease(int currentQuantity) {
        int ceil;
        int i11 = this.quantSize;
        if (i11 > 0 && currentQuantity < i11) {
            i11 = this.multiplicity;
        } else if (i11 <= 0 || currentQuantity % i11 != 0) {
            if (i11 > 0 && currentQuantity > i11) {
                ceil = (int) (Math.ceil(currentQuantity / i11) * this.quantSize);
                return coerceMinMax(ceil);
            }
            i11 = this.multiplicity;
            if (currentQuantity % i11 != 0) {
                currentQuantity -= currentQuantity % i11;
            }
        }
        ceil = currentQuantity + i11;
        return coerceMinMax(ceil);
    }

    public final boolean calculateIncreaseEnabled(int currentQuantity) {
        int i11 = this.multiplicity;
        return (currentQuantity - (currentQuantity % i11)) + i11 <= this.maximum;
    }
}
