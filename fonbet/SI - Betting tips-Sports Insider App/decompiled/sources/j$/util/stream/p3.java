package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class p3 extends t3 implements k5 {

    /* renamed from: h, reason: collision with root package name */
    public final double[] f18029h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void n(Double d10) {
        x3.D(this, d10);
    }

    public p3(Spliterator spliterator, x3 x3Var, double[] dArr) {
        super(spliterator, x3Var, dArr.length);
        this.f18029h = dArr;
    }

    public p3(p3 p3Var, Spliterator spliterator, long j, long j6) {
        super(p3Var, spliterator, j, j6, p3Var.f18029h.length);
        this.f18029h = p3Var.f18029h;
    }

    @Override // j$.util.stream.t3
    public final t3 a(Spliterator spliterator, long j, long j6) {
        return new p3(this, spliterator, j, j6);
    }

    @Override // j$.util.stream.t3, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i5 = this.f18089f;
        if (i5 >= this.f18090g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18089f));
        }
        double[] dArr = this.f18029h;
        this.f18089f = i5 + 1;
        dArr[i5] = d10;
    }
}
