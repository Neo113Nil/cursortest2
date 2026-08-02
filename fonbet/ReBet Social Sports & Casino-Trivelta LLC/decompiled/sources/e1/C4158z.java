package e1;

import java.util.NoSuchElementException;

/* renamed from: e1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4158z {

    /* renamed from: a, reason: collision with root package name */
    public int f45590a;

    /* renamed from: b, reason: collision with root package name */
    public int f45591b;

    /* renamed from: c, reason: collision with root package name */
    public int f45592c;

    /* renamed from: d, reason: collision with root package name */
    public int f45593d;
    private long[] data;

    public C4158z() {
        this(16);
    }

    public void a(long j10) {
        if (this.f45592c == this.data.length) {
            c();
        }
        int i10 = (this.f45591b + 1) & this.f45593d;
        this.f45591b = i10;
        this.data[i10] = j10;
        this.f45592c++;
    }

    public void b() {
        this.f45590a = 0;
        this.f45591b = -1;
        this.f45592c = 0;
    }

    public final void c() {
        long[] jArr = this.data;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f45590a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.data, 0, jArr2, i11, i10);
        this.f45590a = 0;
        this.f45591b = this.f45592c - 1;
        this.data = jArr2;
        this.f45593d = jArr2.length - 1;
    }

    public long d() {
        if (this.f45592c != 0) {
            return this.data[this.f45590a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f45592c == 0;
    }

    public long f() {
        int i10 = this.f45592c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.data;
        int i11 = this.f45590a;
        long j10 = jArr[i11];
        this.f45590a = this.f45593d & (i11 + 1);
        this.f45592c = i10 - 1;
        return j10;
    }

    public C4158z(int i10) {
        AbstractC4134a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f45590a = 0;
        this.f45591b = -1;
        this.f45592c = 0;
        long[] jArr = new long[i10];
        this.data = jArr;
        this.f45593d = jArr.length - 1;
    }
}
