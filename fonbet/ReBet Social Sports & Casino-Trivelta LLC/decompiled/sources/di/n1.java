package di;

import java.util.Arrays;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class n1 extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45398a;

    @NotNull
    private long[] buffer;

    public /* synthetic */ n1(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // di.N0
    public /* bridge */ /* synthetic */ Object a() {
        return ULongArray.m374boximpl(f());
    }

    @Override // di.N0
    public void b(int i10) {
        if (ULongArray.m382getSizeimpl(this.buffer) < i10) {
            long[] jArr = this.buffer;
            long[] copyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i10, ULongArray.m382getSizeimpl(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = ULongArray.m376constructorimpl(copyOf);
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45398a;
    }

    public final void e(long j10) {
        N0.c(this, 0, 1, null);
        long[] jArr = this.buffer;
        int d10 = d();
        this.f45398a = d10 + 1;
        ULongArray.m386setk8EXiF4(jArr, d10, j10);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return ULongArray.m376constructorimpl(copyOf);
    }

    public n1(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45398a = ULongArray.m382getSizeimpl(bufferWithData);
        b(10);
    }
}
