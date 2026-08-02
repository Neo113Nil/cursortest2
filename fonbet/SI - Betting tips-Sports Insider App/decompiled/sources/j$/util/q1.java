package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class q1 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f17774a;

    /* renamed from: b, reason: collision with root package name */
    public int f17775b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17776c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17777d;

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

    public q1(long[] jArr, int i5, int i10, int i11) {
        this.f17774a = jArr;
        this.f17775b = i5;
        this.f17776c = i10;
        this.f17777d = i11 | 16448;
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final z0 trySplit() {
        int i5 = this.f17775b;
        int i10 = (this.f17776c + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f17775b = i10;
        return new q1(this.f17774a, i5, i10, this.f17777d);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i5;
        longConsumer.getClass();
        long[] jArr = this.f17774a;
        int length = jArr.length;
        int i10 = this.f17776c;
        if (length < i10 || (i5 = this.f17775b) < 0) {
            return;
        }
        this.f17775b = i10;
        if (i5 < i10) {
            do {
                longConsumer.accept(jArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i5 = this.f17775b;
        if (i5 < 0 || i5 >= this.f17776c) {
            return false;
        }
        this.f17775b = i5 + 1;
        longConsumer.accept(this.f17774a[i5]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17776c - this.f17775b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17777d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
