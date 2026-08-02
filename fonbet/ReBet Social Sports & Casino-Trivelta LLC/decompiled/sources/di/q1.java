package di;

import java.util.Arrays;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q1 extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45406a;

    @NotNull
    private short[] buffer;

    public /* synthetic */ q1(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // di.N0
    public /* bridge */ /* synthetic */ Object a() {
        return UShortArray.m479boximpl(f());
    }

    @Override // di.N0
    public void b(int i10) {
        if (UShortArray.m487getSizeimpl(this.buffer) < i10) {
            short[] sArr = this.buffer;
            short[] copyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i10, UShortArray.m487getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = UShortArray.m481constructorimpl(copyOf);
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45406a;
    }

    public final void e(short s10) {
        N0.c(this, 0, 1, null);
        short[] sArr = this.buffer;
        int d10 = d();
        this.f45406a = d10 + 1;
        UShortArray.m491set01HTLdE(sArr, d10, s10);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UShortArray.m481constructorimpl(copyOf);
    }

    public q1(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45406a = UShortArray.m487getSizeimpl(bufferWithData);
        b(10);
    }
}
