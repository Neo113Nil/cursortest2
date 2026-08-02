package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d6 extends z5 {

    /* renamed from: c, reason: collision with root package name */
    public r6 f17863c;

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void c(long j) {
        r6 r6Var;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r6Var = new r6();
        } else {
            r6Var = new r6((int) j);
        }
        this.f17863c = r6Var;
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void end() {
        double[] dArr = (double[]) this.f17863c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        n5 n5Var = this.f17912a;
        n5Var.c(length);
        int i5 = 0;
        if (!this.f18179b) {
            int length2 = dArr.length;
            while (i5 < length2) {
                n5Var.accept(dArr[i5]);
                i5++;
            }
        } else {
            int length3 = dArr.length;
            while (i5 < length3) {
                double d10 = dArr[i5];
                if (n5Var.e()) {
                    break;
                }
                n5Var.accept(d10);
                i5++;
            }
        }
        n5Var.end();
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f17863c.accept(d10);
    }
}
