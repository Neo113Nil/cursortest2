package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e6 extends a6 {

    /* renamed from: c, reason: collision with root package name */
    public t6 f17874c;

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void c(long j) {
        t6 t6Var;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            t6Var = new t6();
        } else {
            t6Var = new t6((int) j);
        }
        this.f17874c = t6Var;
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void end() {
        int[] iArr = (int[]) this.f17874c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        n5 n5Var = this.f17920a;
        n5Var.c(length);
        int i5 = 0;
        if (!this.f17795b) {
            int length2 = iArr.length;
            while (i5 < length2) {
                n5Var.accept(iArr[i5]);
                i5++;
            }
        } else {
            int length3 = iArr.length;
            while (i5 < length3) {
                int i10 = iArr[i5];
                if (n5Var.e()) {
                    break;
                }
                n5Var.accept(i10);
                i5++;
            }
        }
        n5Var.end();
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i5) {
        this.f17874c.accept(i5);
    }
}
