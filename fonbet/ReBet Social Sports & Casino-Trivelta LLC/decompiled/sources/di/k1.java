package di;

import java.util.Arrays;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k1 extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45382a;

    @NotNull
    private int[] buffer;

    public /* synthetic */ k1(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // di.N0
    public /* bridge */ /* synthetic */ Object a() {
        return UIntArray.m295boximpl(f());
    }

    @Override // di.N0
    public void b(int i10) {
        if (UIntArray.m303getSizeimpl(this.buffer) < i10) {
            int[] iArr = this.buffer;
            int[] copyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i10, UIntArray.m303getSizeimpl(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = UIntArray.m297constructorimpl(copyOf);
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45382a;
    }

    public final void e(int i10) {
        N0.c(this, 0, 1, null);
        int[] iArr = this.buffer;
        int d10 = d();
        this.f45382a = d10 + 1;
        UIntArray.m307setVXSXFK8(iArr, d10, i10);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UIntArray.m297constructorimpl(copyOf);
    }

    public k1(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45382a = UIntArray.m303getSizeimpl(bufferWithData);
        b(10);
    }
}
