package j$.util.concurrent;

import j$.util.t0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class u implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public long f17685a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17686b;

    /* renamed from: c, reason: collision with root package name */
    public final double f17687c;

    /* renamed from: d, reason: collision with root package name */
    public final double f17688d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public u(long j, long j6, double d10, double d11) {
        this.f17685a = j;
        this.f17686b = j6;
        this.f17687c = d10;
        this.f17688d = d11;
    }

    @Override // j$.util.t0, j$.util.c1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u trySplit() {
        long j = this.f17685a;
        long j6 = (this.f17686b + j) >>> 1;
        if (j6 <= j) {
            return null;
        }
        this.f17685a = j6;
        return new u(j, j6, this.f17687c, this.f17688d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17686b - this.f17685a;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f17685a;
        if (j >= this.f17686b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().a(this.f17687c, this.f17688d));
        this.f17685a = j + 1;
        return true;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f17685a;
        long j6 = this.f17686b;
        if (j < j6) {
            this.f17685a = j6;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(current.a(this.f17687c, this.f17688d));
                j++;
            } while (j < j6);
        }
    }
}
