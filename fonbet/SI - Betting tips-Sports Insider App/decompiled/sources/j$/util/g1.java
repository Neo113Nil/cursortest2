package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class g1 implements o0, LongConsumer, y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17728a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f17729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f17730c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.p0
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (s1.f17782a) {
            s1.a(g1.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.o0, java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (s1.f17782a) {
            s1.a(g1.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new l0(consumer, 0));
    }

    public g1(z0 z0Var) {
        this.f17730c = z0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f17728a = true;
        this.f17729b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f17728a) {
            this.f17730c.tryAdvance((LongConsumer) this);
        }
        return this.f17728a;
    }

    @Override // j$.util.o0
    public final long nextLong() {
        if (!this.f17728a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17728a = false;
        return this.f17729b;
    }
}
