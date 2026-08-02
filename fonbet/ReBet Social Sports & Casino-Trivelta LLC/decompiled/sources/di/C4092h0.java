package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: di.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4092h0 extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45368a;

    @NotNull
    private long[] buffer;

    public C4092h0(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45368a = bufferWithData.length;
        b(10);
    }

    @Override // di.N0
    public void b(int i10) {
        long[] jArr = this.buffer;
        if (jArr.length < i10) {
            long[] copyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i10, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = copyOf;
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45368a;
    }

    public final void e(long j10) {
        N0.c(this, 0, 1, null);
        long[] jArr = this.buffer;
        int d10 = d();
        this.f45368a = d10 + 1;
        jArr[d10] = j10;
    }

    @Override // di.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
