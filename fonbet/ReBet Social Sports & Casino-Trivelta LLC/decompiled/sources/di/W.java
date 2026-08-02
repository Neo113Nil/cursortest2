package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class W extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45333a;

    @NotNull
    private int[] buffer;

    public W(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45333a = bufferWithData.length;
        b(10);
    }

    @Override // di.N0
    public void b(int i10) {
        int[] iArr = this.buffer;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i10, iArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = copyOf;
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45333a;
    }

    public final void e(int i10) {
        N0.c(this, 0, 1, null);
        int[] iArr = this.buffer;
        int d10 = d();
        this.f45333a = d10 + 1;
        iArr[d10] = i10;
    }

    @Override // di.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
