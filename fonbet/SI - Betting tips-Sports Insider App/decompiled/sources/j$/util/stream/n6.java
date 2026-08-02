package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n6 extends b6 {

    /* renamed from: c, reason: collision with root package name */
    public long[] f18006c;

    /* renamed from: d, reason: collision with root package name */
    public int f18007d;

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18006c = new long[(int) j];
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void end() {
        int i5 = 0;
        Arrays.sort(this.f18006c, 0, this.f18007d);
        long j = this.f18007d;
        n5 n5Var = this.f17931a;
        n5Var.c(j);
        if (!this.f17813b) {
            while (i5 < this.f18007d) {
                n5Var.accept(this.f18006c[i5]);
                i5++;
            }
        } else {
            while (i5 < this.f18007d && !n5Var.e()) {
                n5Var.accept(this.f18006c[i5]);
                i5++;
            }
        }
        n5Var.end();
        this.f18006c = null;
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        long[] jArr = this.f18006c;
        int i5 = this.f18007d;
        this.f18007d = i5 + 1;
        jArr[i5] = j;
    }
}
