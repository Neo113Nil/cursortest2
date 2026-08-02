package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class u4 extends y4 implements k5 {
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

    @Override // j$.util.stream.t4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18164b);
    }

    @Override // j$.util.stream.s4
    public final void j(s4 s4Var) {
        this.f18164b += ((y4) s4Var).f18164b;
    }

    @Override // j$.util.stream.y4, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f18164b++;
    }
}
