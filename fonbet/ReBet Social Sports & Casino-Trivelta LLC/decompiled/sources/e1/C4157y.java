package e1;

import java.util.Arrays;

/* renamed from: e1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4157y {

    /* renamed from: a, reason: collision with root package name */
    public int f45589a;
    private long[] values;

    public C4157y() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f45589a;
        long[] jArr = this.values;
        if (i10 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.values;
        int i11 = this.f45589a;
        this.f45589a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f45589a + jArr.length;
        long[] jArr2 = this.values;
        if (length > jArr2.length) {
            this.values = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.values, this.f45589a, jArr.length);
        this.f45589a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f45589a) {
            return this.values[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f45589a);
    }

    public int d() {
        return this.f45589a;
    }

    public C4157y(int i10) {
        this.values = new long[i10];
    }
}
