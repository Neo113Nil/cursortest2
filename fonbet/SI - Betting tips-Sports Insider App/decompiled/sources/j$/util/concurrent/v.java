package j$.util.concurrent;

import j$.util.w0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class v implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public long f17689a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17691c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17692d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
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
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public v(long j, long j6, int i5, int i10) {
        this.f17689a = j;
        this.f17690b = j6;
        this.f17691c = i5;
        this.f17692d = i10;
    }

    @Override // j$.util.w0, j$.util.c1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v trySplit() {
        long j = this.f17689a;
        long j6 = (this.f17690b + j) >>> 1;
        if (j6 <= j) {
            return null;
        }
        this.f17689a = j6;
        return new v(j, j6, this.f17691c, this.f17692d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17690b - this.f17689a;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f17689a;
        if (j >= this.f17690b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.f17691c, this.f17692d));
        this.f17689a = j + 1;
        return true;
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f17689a;
        long j6 = this.f17690b;
        if (j < j6) {
            this.f17689a = j6;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.b(this.f17691c, this.f17692d));
                j++;
            } while (j < j6);
        }
    }
}
