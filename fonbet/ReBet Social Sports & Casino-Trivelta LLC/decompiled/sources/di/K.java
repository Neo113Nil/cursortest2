package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class K extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45312a;

    @NotNull
    private float[] buffer;

    public K(float[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45312a = bufferWithData.length;
        b(10);
    }

    @Override // di.N0
    public void b(int i10) {
        float[] fArr = this.buffer;
        if (fArr.length < i10) {
            float[] copyOf = Arrays.copyOf(fArr, RangesKt.coerceAtLeast(i10, fArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = copyOf;
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45312a;
    }

    public final void e(float f10) {
        N0.c(this, 0, 1, null);
        float[] fArr = this.buffer;
        int d10 = d();
        this.f45312a = d10 + 1;
        fArr[d10] = f10;
    }

    @Override // di.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
