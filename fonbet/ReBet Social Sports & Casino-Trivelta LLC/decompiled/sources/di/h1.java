package di;

import java.util.Arrays;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h1 extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45369a;

    @NotNull
    private byte[] buffer;

    public /* synthetic */ h1(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // di.N0
    public /* bridge */ /* synthetic */ Object a() {
        return UByteArray.m216boximpl(f());
    }

    @Override // di.N0
    public void b(int i10) {
        if (UByteArray.m224getSizeimpl(this.buffer) < i10) {
            byte[] bArr = this.buffer;
            byte[] copyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i10, UByteArray.m224getSizeimpl(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = UByteArray.m218constructorimpl(copyOf);
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45369a;
    }

    public final void e(byte b10) {
        N0.c(this, 0, 1, null);
        byte[] bArr = this.buffer;
        int d10 = d();
        this.f45369a = d10 + 1;
        UByteArray.m228setVurrAj0(bArr, d10, b10);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UByteArray.m218constructorimpl(copyOf);
    }

    public h1(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45369a = UByteArray.m224getSizeimpl(bufferWithData);
        b(10);
    }
}
