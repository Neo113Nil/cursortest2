package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m6 extends a6 {

    /* renamed from: c, reason: collision with root package name */
    public int[] f17991c;

    /* renamed from: d, reason: collision with root package name */
    public int f17992d;

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f17991c = new int[(int) j];
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void end() {
        int i5 = 0;
        Arrays.sort(this.f17991c, 0, this.f17992d);
        long j = this.f17992d;
        n5 n5Var = this.f17920a;
        n5Var.c(j);
        if (!this.f17795b) {
            while (i5 < this.f17992d) {
                n5Var.accept(this.f17991c[i5]);
                i5++;
            }
        } else {
            while (i5 < this.f17992d && !n5Var.e()) {
                n5Var.accept(this.f17991c[i5]);
                i5++;
            }
        }
        n5Var.end();
        this.f17991c = null;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i5) {
        int[] iArr = this.f17991c;
        int i10 = this.f17992d;
        this.f17992d = i10 + 1;
        iArr[i10] = i5;
    }
}
