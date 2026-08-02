package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import K00.b;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "", "", "top", "bottom", "left", "right", "betweenProgressLines", "betweenCellAndProgress", "betweenProgressAndRanges", "<init>", "(IIIIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "getBetweenProgressLines", "getBetweenCellAndProgress", "getBetweenProgressAndRanges", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaddingsVO {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final InterfaceC4008j<PaddingsVO> default$delegate = k.b(PaddingsVO$Companion$default$2.INSTANCE);
    private final int betweenCellAndProgress;
    private final int betweenProgressAndRanges;
    private final int betweenProgressLines;
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "default$delegate", "LSc/j;", "getDefault", "()Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "default", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PaddingsVO getDefault() {
            return (PaddingsVO) PaddingsVO.default$delegate.getValue();
        }

        private Companion() {
        }
    }

    public PaddingsVO(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.top = i11;
        this.bottom = i12;
        this.left = i13;
        this.right = i14;
        this.betweenProgressLines = i15;
        this.betweenCellAndProgress = i16;
        this.betweenProgressAndRanges = i17;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingsVO)) {
            return false;
        }
        PaddingsVO paddingsVO = (PaddingsVO) other;
        return this.top == paddingsVO.top && this.bottom == paddingsVO.bottom && this.left == paddingsVO.left && this.right == paddingsVO.right && this.betweenProgressLines == paddingsVO.betweenProgressLines && this.betweenCellAndProgress == paddingsVO.betweenCellAndProgress && this.betweenProgressAndRanges == paddingsVO.betweenProgressAndRanges;
    }

    public final int getBetweenCellAndProgress() {
        return this.betweenCellAndProgress;
    }

    public final int getBetweenProgressAndRanges() {
        return this.betweenProgressAndRanges;
    }

    public final int getBetweenProgressLines() {
        return this.betweenProgressLines;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return Integer.hashCode(this.betweenProgressAndRanges) + C2454a.a(this.betweenCellAndProgress, C2454a.a(this.betweenProgressLines, C2454a.a(this.right, C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.top;
        int i12 = this.bottom;
        int i13 = this.left;
        int i14 = this.right;
        int i15 = this.betweenProgressLines;
        int i16 = this.betweenCellAndProgress;
        int i17 = this.betweenProgressAndRanges;
        StringBuilder a11 = C2438a.a("PaddingsVO(top=", i11, ", bottom=", ", left=", i12);
        a.f(i13, i14, ", right=", ", betweenProgressLines=", a11);
        a.f(i15, i16, ", betweenCellAndProgress=", ", betweenProgressAndRanges=", a11);
        return b.e(i17, ")", a11);
    }
}
