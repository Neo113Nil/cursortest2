package m3;

import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private int f74364a;

    /* renamed from: b, reason: collision with root package name */
    private int f74365b;

    /* renamed from: c, reason: collision with root package name */
    private int f74366c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f74367d;

    /* renamed from: e, reason: collision with root package name */
    private int f74368e;

    public u() {
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        this.f74364a = 0;
        this.f74365b = -1;
        this.f74366c = 0;
        this.f74367d = new long[highestOneBit];
        this.f74368e = highestOneBit - 1;
    }

    public final void a(long j11) {
        int i11 = this.f74366c;
        long[] jArr = this.f74367d;
        if (i11 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i12 = this.f74364a;
            int i13 = length2 - i12;
            System.arraycopy(jArr, i12, jArr2, 0, i13);
            System.arraycopy(this.f74367d, 0, jArr2, i13, i12);
            this.f74364a = 0;
            this.f74365b = this.f74366c - 1;
            this.f74367d = jArr2;
            this.f74368e = length - 1;
        }
        int i14 = (this.f74365b + 1) & this.f74368e;
        this.f74365b = i14;
        this.f74367d[i14] = j11;
        this.f74366c++;
    }

    public final void b() {
        this.f74364a = 0;
        this.f74365b = -1;
        this.f74366c = 0;
    }

    public final long c() {
        if (this.f74366c != 0) {
            return this.f74367d[this.f74364a];
        }
        throw new NoSuchElementException();
    }

    public final boolean d() {
        return this.f74366c == 0;
    }

    public final long e() {
        int i11 = this.f74366c;
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f74367d;
        int i12 = this.f74364a;
        long j11 = jArr[i12];
        this.f74364a = this.f74368e & (i12 + 1);
        this.f74366c = i11 - 1;
        return j11;
    }
}
