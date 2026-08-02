package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: di.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4089g extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45363a;

    @NotNull
    private boolean[] buffer;

    public C4089g(boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45363a = bufferWithData.length;
        b(10);
    }

    @Override // di.N0
    public void b(int i10) {
        boolean[] zArr = this.buffer;
        if (zArr.length < i10) {
            boolean[] copyOf = Arrays.copyOf(zArr, RangesKt.coerceAtLeast(i10, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = copyOf;
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45363a;
    }

    public final void e(boolean z10) {
        N0.c(this, 0, 1, null);
        boolean[] zArr = this.buffer;
        int d10 = d();
        this.f45363a = d10 + 1;
        zArr[d10] = z10;
    }

    @Override // di.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
