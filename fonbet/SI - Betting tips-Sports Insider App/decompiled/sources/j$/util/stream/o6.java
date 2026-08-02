package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o6 extends c6 {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f18022d;

    /* renamed from: e, reason: collision with root package name */
    public int f18023e;

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18022d = new Object[(int) j];
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void end() {
        int i5 = 0;
        Arrays.sort(this.f18022d, 0, this.f18023e, this.f17825b);
        long j = this.f18023e;
        n5 n5Var = this.f17941a;
        n5Var.c(j);
        if (!this.f17826c) {
            while (i5 < this.f18023e) {
                n5Var.accept((n5) this.f18022d[i5]);
                i5++;
            }
        } else {
            while (i5 < this.f18023e && !n5Var.e()) {
                n5Var.accept((n5) this.f18022d[i5]);
                i5++;
            }
        }
        n5Var.end();
        this.f18022d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f18022d;
        int i5 = this.f18023e;
        this.f18023e = i5 + 1;
        objArr[i5] = obj;
    }
}
