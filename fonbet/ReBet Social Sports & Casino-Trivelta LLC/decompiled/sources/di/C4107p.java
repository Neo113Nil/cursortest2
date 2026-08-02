package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: di.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4107p extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45402a;

    @NotNull
    private char[] buffer;

    public C4107p(char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45402a = bufferWithData.length;
        b(10);
    }

    @Override // di.N0
    public void b(int i10) {
        char[] cArr = this.buffer;
        if (cArr.length < i10) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i10, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = copyOf;
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45402a;
    }

    public final void e(char c10) {
        N0.c(this, 0, 1, null);
        char[] cArr = this.buffer;
        int d10 = d();
        this.f45402a = d10 + 1;
        cArr[d10] = c10;
    }

    @Override // di.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
