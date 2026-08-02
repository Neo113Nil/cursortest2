package j$.util;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class i1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f17743a;

    /* renamed from: b, reason: collision with root package name */
    public int f17744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17745c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17746d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    public i1(Object[] objArr, int i5, int i10, int i11) {
        this.f17743a = objArr;
        this.f17744b = i5;
        this.f17745c = i10;
        this.f17746d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i5 = this.f17744b;
        int i10 = (this.f17745c + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f17744b = i10;
        return new i1(this.f17743a, i5, i10, this.f17746d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i5;
        consumer.getClass();
        Object[] objArr = this.f17743a;
        int length = objArr.length;
        int i10 = this.f17745c;
        if (length < i10 || (i5 = this.f17744b) < 0) {
            return;
        }
        this.f17744b = i10;
        if (i5 < i10) {
            do {
                consumer.accept(objArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i5 = this.f17744b;
        if (i5 < 0 || i5 >= this.f17745c) {
            return false;
        }
        this.f17744b = i5 + 1;
        consumer.accept(this.f17743a[i5]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17745c - this.f17744b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17746d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
