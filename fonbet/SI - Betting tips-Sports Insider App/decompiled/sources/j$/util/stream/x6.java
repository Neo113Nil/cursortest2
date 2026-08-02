package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class x6 extends d implements Iterable, j$.lang.a {

    /* renamed from: e, reason: collision with root package name */
    public Object f18150e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f18151f;

    public abstract Object newArray(int i5);

    public abstract void p(Object obj, int i5, int i10, Object obj2);

    public abstract int q(Object obj);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public abstract Object[] t();

    public x6(int i5) {
        super(i5);
        this.f18150e = newArray(1 << this.f17850a);
    }

    public x6() {
        this.f18150e = newArray(16);
    }

    public final void s(long j) {
        long q;
        int i5 = this.f17852c;
        if (i5 == 0) {
            q = q(this.f18150e);
        } else {
            q = q(this.f18151f[i5]) + this.f17853d[i5];
        }
        if (j > q) {
            if (this.f18151f == null) {
                Object[] t3 = t();
                this.f18151f = t3;
                this.f17853d = new long[8];
                t3[0] = this.f18150e;
            }
            int i10 = this.f17852c + 1;
            while (j > q) {
                Object[] objArr = this.f18151f;
                if (i10 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f18151f = Arrays.copyOf(objArr, length);
                    this.f17853d = Arrays.copyOf(this.f17853d, length);
                }
                int i11 = this.f17850a;
                if (i10 != 0 && i10 != 1) {
                    i11 = Math.min((i11 + i10) - 1, 30);
                }
                int i12 = 1 << i11;
                this.f18151f[i10] = newArray(i12);
                long[] jArr = this.f17853d;
                jArr[i10] = jArr[i10 - 1] + q(this.f18151f[r6]);
                q += i12;
                i10++;
            }
        }
    }

    public final int r(long j) {
        if (this.f17852c == 0) {
            if (j < this.f17851b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i5 = 0; i5 <= this.f17852c; i5++) {
            if (j < this.f17853d[i5] + q(this.f18151f[i5])) {
                return i5;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public void f(int i5, Object obj) {
        long j = i5;
        long count = count() + j;
        if (count > q(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f17852c == 0) {
            System.arraycopy(this.f18150e, 0, obj, i5, this.f17851b);
            return;
        }
        for (int i10 = 0; i10 < this.f17852c; i10++) {
            Object obj2 = this.f18151f[i10];
            System.arraycopy(obj2, 0, obj, i5, q(obj2));
            i5 += q(this.f18151f[i10]);
        }
        int i11 = this.f17851b;
        if (i11 > 0) {
            System.arraycopy(this.f18150e, 0, obj, i5, i11);
        }
    }

    public Object b() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object newArray = newArray((int) count);
        f(0, newArray);
        return newArray;
    }

    public final void u() {
        long q;
        if (this.f17851b == q(this.f18150e)) {
            if (this.f18151f == null) {
                Object[] t3 = t();
                this.f18151f = t3;
                this.f17853d = new long[8];
                t3[0] = this.f18150e;
            }
            int i5 = this.f17852c;
            int i10 = i5 + 1;
            Object[] objArr = this.f18151f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                if (i5 == 0) {
                    q = q(this.f18150e);
                } else {
                    q = q(objArr[i5]) + this.f17853d[i5];
                }
                s(q + 1);
            }
            this.f17851b = 0;
            int i11 = this.f17852c + 1;
            this.f17852c = i11;
            this.f18150e = this.f18151f[i11];
        }
    }

    @Override // j$.util.stream.d
    public final void clear() {
        Object[] objArr = this.f18151f;
        if (objArr != null) {
            this.f18150e = objArr[0];
            this.f18151f = null;
            this.f17853d = null;
        }
        this.f17851b = 0;
        this.f17852c = 0;
    }

    public void g(Object obj) {
        for (int i5 = 0; i5 < this.f17852c; i5++) {
            Object obj2 = this.f18151f[i5];
            p(obj2, 0, q(obj2), obj);
        }
        p(this.f18150e, 0, this.f17851b, obj);
    }
}
