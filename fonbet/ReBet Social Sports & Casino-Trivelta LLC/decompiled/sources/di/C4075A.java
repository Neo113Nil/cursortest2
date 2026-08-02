package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: di.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4075A extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45279a;

    @NotNull
    private double[] buffer;

    public C4075A(double[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45279a = bufferWithData.length;
        b(10);
    }

    @Override // di.N0
    public void b(int i10) {
        double[] dArr = this.buffer;
        if (dArr.length < i10) {
            double[] copyOf = Arrays.copyOf(dArr, RangesKt.coerceAtLeast(i10, dArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = copyOf;
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45279a;
    }

    public final void e(double d10) {
        N0.c(this, 0, 1, null);
        double[] dArr = this.buffer;
        int d11 = d();
        this.f45279a = d11 + 1;
        dArr[d11] = d10;
    }

    @Override // di.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
