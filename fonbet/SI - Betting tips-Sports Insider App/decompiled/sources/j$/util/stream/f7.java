package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class f7 extends i7 implements DoubleConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final double[] f17902c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public f7(int i5) {
        this.f17902c = new double[i5];
    }

    @Override // j$.util.stream.i7
    public final void a(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i5 = 0; i5 < j; i5++) {
            doubleConsumer.accept(this.f17902c[i5]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i5 = this.f17933b;
        this.f17933b = i5 + 1;
        this.f17902c[i5] = d10;
    }
}
