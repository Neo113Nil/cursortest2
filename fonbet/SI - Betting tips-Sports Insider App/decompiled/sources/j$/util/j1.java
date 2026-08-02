package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class j1 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f17748a;

    /* renamed from: b, reason: collision with root package name */
    public int f17749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17750c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17751d;

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

    public j1(double[] dArr, int i5, int i10, int i11) {
        this.f17748a = dArr;
        this.f17749b = i5;
        this.f17750c = i10;
        this.f17751d = i11 | 16448;
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final t0 trySplit() {
        int i5 = this.f17749b;
        int i10 = (this.f17750c + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f17749b = i10;
        return new j1(this.f17748a, i5, i10, this.f17751d);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i5;
        doubleConsumer.getClass();
        double[] dArr = this.f17748a;
        int length = dArr.length;
        int i10 = this.f17750c;
        if (length < i10 || (i5 = this.f17749b) < 0) {
            return;
        }
        this.f17749b = i10;
        if (i5 < i10) {
            do {
                doubleConsumer.accept(dArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i5 = this.f17749b;
        if (i5 < 0 || i5 >= this.f17750c) {
            return false;
        }
        this.f17749b = i5 + 1;
        doubleConsumer.accept(this.f17748a[i5]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17750c - this.f17749b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17751d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
