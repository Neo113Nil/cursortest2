package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class n0 extends r0 implements k5 {

    /* renamed from: b, reason: collision with root package name */
    public final DoubleConsumer f18002b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void n(Double d10) {
        x3.D(this, d10);
    }

    @Override // j$.util.stream.i8
    public final Object f(b bVar, Spliterator spliterator) {
        bVar.D0(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.i8
    public final /* bridge */ /* synthetic */ Object i(x3 x3Var, Spliterator spliterator) {
        a(x3Var, spliterator);
        return null;
    }

    public n0(DoubleConsumer doubleConsumer, boolean z5) {
        super(z5);
        this.f18002b = doubleConsumer;
    }

    @Override // j$.util.stream.r0, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f18002b.accept(d10);
    }
}
