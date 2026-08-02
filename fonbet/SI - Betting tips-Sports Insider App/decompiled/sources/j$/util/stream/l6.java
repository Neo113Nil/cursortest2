package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l6 extends z5 {

    /* renamed from: c, reason: collision with root package name */
    public double[] f17974c;

    /* renamed from: d, reason: collision with root package name */
    public int f17975d;

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f17974c = new double[(int) j];
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void end() {
        int i5 = 0;
        Arrays.sort(this.f17974c, 0, this.f17975d);
        long j = this.f17975d;
        n5 n5Var = this.f17912a;
        n5Var.c(j);
        if (!this.f18179b) {
            while (i5 < this.f17975d) {
                n5Var.accept(this.f17974c[i5]);
                i5++;
            }
        } else {
            while (i5 < this.f17975d && !n5Var.e()) {
                n5Var.accept(this.f17974c[i5]);
                i5++;
            }
        }
        n5Var.end();
        this.f17974c = null;
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        double[] dArr = this.f17974c;
        int i5 = this.f17975d;
        this.f17975d = i5 + 1;
        dArr[i5] = d10;
    }
}
