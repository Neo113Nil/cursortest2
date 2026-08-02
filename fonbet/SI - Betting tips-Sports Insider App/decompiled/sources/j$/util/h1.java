package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class h1 implements g0, DoubleConsumer, y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17734a = false;

    /* renamed from: b, reason: collision with root package name */
    public double f17735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f17736c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.p0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (s1.f17782a) {
            s1.a(h1.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.g0, java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (s1.f17782a) {
            s1.a(h1.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new d0(consumer, 0));
    }

    public h1(t0 t0Var) {
        this.f17736c = t0Var;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f17734a = true;
        this.f17735b = d10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f17734a) {
            this.f17736c.tryAdvance((DoubleConsumer) this);
        }
        return this.f17734a;
    }

    @Override // j$.util.g0
    public final double nextDouble() {
        if (!this.f17734a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17734a = false;
        return this.f17735b;
    }
}
