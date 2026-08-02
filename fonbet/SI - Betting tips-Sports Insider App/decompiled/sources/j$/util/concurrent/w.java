package j$.util.concurrent;

import j$.util.z0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class w implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public long f17693a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17694b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17695c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17696d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
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
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public w(long j, long j6, long j10, long j11) {
        this.f17693a = j;
        this.f17694b = j6;
        this.f17695c = j10;
        this.f17696d = j11;
    }

    @Override // j$.util.z0, j$.util.c1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w trySplit() {
        long j = this.f17693a;
        long j6 = (this.f17694b + j) >>> 1;
        if (j6 <= j) {
            return null;
        }
        this.f17693a = j6;
        return new w(j, j6, this.f17695c, this.f17696d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17694b - this.f17693a;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f17693a;
        if (j >= this.f17694b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().c(this.f17695c, this.f17696d));
        this.f17693a = j + 1;
        return true;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f17693a;
        long j6 = this.f17694b;
        if (j < j6) {
            this.f17693a = j6;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.c(this.f17695c, this.f17696d));
                j++;
            } while (j < j6);
        }
    }
}
