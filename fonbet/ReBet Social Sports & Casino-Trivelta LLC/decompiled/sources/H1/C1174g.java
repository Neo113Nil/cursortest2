package H1;

import H1.J;
import e1.Z;
import java.util.Arrays;

/* renamed from: H1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1174g implements J {

    /* renamed from: a, reason: collision with root package name */
    public final int f4434a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4435b;
    public final long[] durationsUs;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timesUs;

    public C1174g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.sizes = iArr;
        this.offsets = jArr;
        this.durationsUs = jArr2;
        this.timesUs = jArr3;
        int length = iArr.length;
        this.f4434a = length;
        if (length > 0) {
            this.f4435b = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f4435b = 0L;
        }
    }

    public int a(long j10) {
        return Z.h(this.timesUs, j10, true, true);
    }

    @Override // H1.J
    public J.a e(long j10) {
        int a10 = a(j10);
        K k10 = new K(this.timesUs[a10], this.offsets[a10]);
        if (k10.f4339a >= j10 || a10 == this.f4434a - 1) {
            return new J.a(k10);
        }
        int i10 = a10 + 1;
        return new J.a(k10, new K(this.timesUs[i10], this.offsets[i10]));
    }

    @Override // H1.J
    public boolean i() {
        return true;
    }

    @Override // H1.J
    public long m() {
        return this.f4435b;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f4434a + ", sizes=" + Arrays.toString(this.sizes) + ", offsets=" + Arrays.toString(this.offsets) + ", timeUs=" + Arrays.toString(this.timesUs) + ", durationsUs=" + Arrays.toString(this.durationsUs) + ")";
    }
}
