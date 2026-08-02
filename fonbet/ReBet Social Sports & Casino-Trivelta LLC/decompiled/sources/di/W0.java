package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class W0 extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45334a;

    @NotNull
    private short[] buffer;

    public W0(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45334a = bufferWithData.length;
        b(10);
    }

    @Override // di.N0
    public void b(int i10) {
        short[] sArr = this.buffer;
        if (sArr.length < i10) {
            short[] copyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i10, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = copyOf;
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45334a;
    }

    public final void e(short s10) {
        N0.c(this, 0, 1, null);
        short[] sArr = this.buffer;
        int d10 = d();
        this.f45334a = d10 + 1;
        sArr[d10] = s10;
    }

    @Override // di.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
