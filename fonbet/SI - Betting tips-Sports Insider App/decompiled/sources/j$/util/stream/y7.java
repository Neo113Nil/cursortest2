package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class y7 extends b8 implements j$.util.t0, DoubleConsumer {

    /* renamed from: f, reason: collision with root package name */
    public double f18172f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.stream.e8
    public final Spliterator b(Spliterator spliterator) {
        return new y7((j$.util.t0) spliterator, this);
    }

    @Override // j$.util.stream.b8
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f18172f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f18172f = d10;
    }

    @Override // j$.util.stream.b8
    public final i7 i(int i5) {
        return new f7(i5);
    }
}
