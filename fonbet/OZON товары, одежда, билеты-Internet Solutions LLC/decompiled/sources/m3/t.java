package m3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private int f74362a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f74363b;

    public t() {
        this(32);
    }

    public final void a(long j11) {
        int i11 = this.f74362a;
        long[] jArr = this.f74363b;
        if (i11 == jArr.length) {
            this.f74363b = Arrays.copyOf(jArr, i11 * 2);
        }
        long[] jArr2 = this.f74363b;
        int i12 = this.f74362a;
        this.f74362a = i12 + 1;
        jArr2[i12] = j11;
    }

    public final void b(long[] jArr) {
        int length = this.f74362a + jArr.length;
        long[] jArr2 = this.f74363b;
        if (length > jArr2.length) {
            this.f74363b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f74363b, this.f74362a, jArr.length);
        this.f74362a = length;
    }

    public final long c(int i11) {
        if (i11 >= 0 && i11 < this.f74362a) {
            return this.f74363b[i11];
        }
        StringBuilder f7 = P4.f.f(i11, "Invalid index ", ", size is ");
        f7.append(this.f74362a);
        throw new IndexOutOfBoundsException(f7.toString());
    }

    public final int d() {
        return this.f74362a;
    }

    public t(int i11) {
        this.f74363b = new long[i11];
    }
}
