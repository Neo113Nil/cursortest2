package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class u3 extends y6 implements i2, a2 {
    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        x3.C();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i5) {
        x3.J();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        x3.K();
        throw null;
    }

    @Override // j$.util.stream.a2
    public final i2 build() {
        return this;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.V(this, j, j6, intFunction);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.i2
    public final i2 a(int i5) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.i2
    public final void k(Object[] objArr, int i5) {
        long j = i5;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f17852c == 0) {
            System.arraycopy(this.f18170e, 0, objArr, i5, this.f17851b);
            return;
        }
        for (int i10 = 0; i10 < this.f17852c; i10++) {
            Object[] objArr2 = this.f18171f[i10];
            System.arraycopy(objArr2, 0, objArr, i5, objArr2.length);
            i5 += this.f18171f[i10].length;
        }
        int i11 = this.f17851b;
        if (i11 > 0) {
            System.arraycopy(this.f18170e, 0, objArr, i5, i11);
        }
    }

    @Override // j$.util.stream.i2
    public final Object[] m(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.n5
    public final void c(long j) {
        clear();
        p(j);
    }
}
