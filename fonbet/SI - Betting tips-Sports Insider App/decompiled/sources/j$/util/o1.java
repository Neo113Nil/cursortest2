package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class o1 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f17761a;

    /* renamed from: b, reason: collision with root package name */
    public int f17762b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17763c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17764d;

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

    public o1(int[] iArr, int i5, int i10, int i11) {
        this.f17761a = iArr;
        this.f17762b = i5;
        this.f17763c = i10;
        this.f17764d = i11 | 16448;
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final w0 trySplit() {
        int i5 = this.f17762b;
        int i10 = (this.f17763c + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f17762b = i10;
        return new o1(this.f17761a, i5, i10, this.f17764d);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i5;
        intConsumer.getClass();
        int[] iArr = this.f17761a;
        int length = iArr.length;
        int i10 = this.f17763c;
        if (length < i10 || (i5 = this.f17762b) < 0) {
            return;
        }
        this.f17762b = i10;
        if (i5 < i10) {
            do {
                intConsumer.accept(iArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i5 = this.f17762b;
        if (i5 < 0 || i5 >= this.f17763c) {
            return false;
        }
        this.f17762b = i5 + 1;
        intConsumer.accept(this.f17761a[i5]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17763c - this.f17762b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17764d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
