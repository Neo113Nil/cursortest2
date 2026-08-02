package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f6 extends b6 {

    /* renamed from: c, reason: collision with root package name */
    public v6 f17901c;

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void c(long j) {
        v6 v6Var;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            v6Var = new v6();
        } else {
            v6Var = new v6((int) j);
        }
        this.f17901c = v6Var;
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void end() {
        long[] jArr = (long[]) this.f17901c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        n5 n5Var = this.f17931a;
        n5Var.c(length);
        int i5 = 0;
        if (!this.f17813b) {
            int length2 = jArr.length;
            while (i5 < length2) {
                n5Var.accept(jArr[i5]);
                i5++;
            }
        } else {
            int length3 = jArr.length;
            while (i5 < length3) {
                long j = jArr[i5];
                if (n5Var.e()) {
                    break;
                }
                n5Var.accept(j);
                i5++;
            }
        }
        n5Var.end();
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        this.f17901c.accept(j);
    }
}
