package ru.ozon.app.android.fresh.common.widgets.molecules;

import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u00020\u0003*\u00020\u0003J\n\u0010\n\u001a\u00020\u0003*\u00020\u0003J\n\u0010\u000b\u001a\u00020\f*\u00020\u0003J\n\u0010\r\u001a\u00020\f*\u00020\u0003J\f\u0010\u000e\u001a\u00020\u0003*\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "", "multiplicity", "", "minimum", "maximum", "quantSize", "<init>", "(IIII)V", "quantIncrease", "quantDecrease", "isDecreaseEnabled", "", "isIncreaseEnabled", "coerceMinMax", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QuantCountStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final QuantCountStrategy EMPTY_INSTANCE = new QuantCountStrategy(1, 0, DescriptorProtos$Edition.EDITION_UNSTABLE_VALUE, 0);
    private final int maximum;
    private final int minimum;
    private final int multiplicity;
    private final int quantSize;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy$Companion;", "", "<init>", "()V", "EMPTY_INSTANCE", "Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "getEMPTY_INSTANCE", "()Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "isIncreaseEnabled", "", "", "multiplicity", "maximum", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QuantCountStrategy getEMPTY_INSTANCE() {
            return QuantCountStrategy.EMPTY_INSTANCE;
        }

        public final boolean isIncreaseEnabled(int i11, int i12, int i13) {
            return (i11 - (i11 % i12)) + i12 <= i13;
        }

        private Companion() {
        }
    }

    public QuantCountStrategy(int i11, int i12, int i13, int i14) {
        this.multiplicity = i11;
        this.minimum = i12;
        this.maximum = i13;
        this.quantSize = i14;
    }

    private final int coerceMinMax(int i11) {
        return h.e(i11, this.minimum, this.maximum);
    }

    public final boolean isDecreaseEnabled(int i11) {
        return i11 - this.multiplicity >= this.minimum;
    }

    public final boolean isIncreaseEnabled(int i11) {
        return INSTANCE.isIncreaseEnabled(i11, this.multiplicity, this.maximum);
    }

    public final int quantDecrease(int i11) {
        int i12 = this.quantSize;
        if (i12 > 0 && i11 <= i12) {
            i12 = this.multiplicity;
        } else if (i12 <= 0 || i11 % i12 != 0) {
            if (i12 <= 0 || i11 <= i12) {
                i12 = this.multiplicity;
                if (i11 % i12 != 0) {
                    i12 = i11 % i12;
                }
            } else {
                i12 = i11 % i12;
            }
        }
        return coerceMinMax(i11 - i12);
    }

    public final int quantIncrease(int i11) {
        int ceil;
        int i12 = this.quantSize;
        if (i12 > 0 && i11 < i12) {
            i12 = this.multiplicity;
        } else if (i12 <= 0 || i11 % i12 != 0) {
            if (1 <= i12 && i12 < i11) {
                ceil = (int) (Math.ceil(i11 / i12) * this.quantSize);
                return coerceMinMax(ceil);
            }
            i12 = this.multiplicity;
            if (i11 % i12 != 0) {
                i11 -= i11 % i12;
            }
        }
        ceil = i11 + i12;
        return coerceMinMax(ceil);
    }
}
