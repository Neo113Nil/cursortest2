package di;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: di.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4095j extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f45374a;

    @NotNull
    private byte[] buffer;

    public C4095j(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.f45374a = bufferWithData.length;
        b(10);
    }

    @Override // di.N0
    public void b(int i10) {
        byte[] bArr = this.buffer;
        if (bArr.length < i10) {
            byte[] copyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i10, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = copyOf;
        }
    }

    @Override // di.N0
    public int d() {
        return this.f45374a;
    }

    public final void e(byte b10) {
        N0.c(this, 0, 1, null);
        byte[] bArr = this.buffer;
        int d10 = d();
        this.f45374a = d10 + 1;
        bArr[d10] = b10;
    }

    @Override // di.N0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.buffer, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
