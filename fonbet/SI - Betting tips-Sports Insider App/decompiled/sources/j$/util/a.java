package j$.util;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f17609a;

    /* renamed from: b, reason: collision with root package name */
    public int f17610b;

    /* renamed from: c, reason: collision with root package name */
    public int f17611c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    public a(java.util.List list) {
        this.f17609a = list;
        this.f17610b = 0;
        this.f17611c = -1;
    }

    public a(a aVar, int i5, int i10) {
        this.f17609a = aVar.f17609a;
        this.f17610b = i5;
        this.f17611c = i10;
    }

    public final int a() {
        java.util.List list = this.f17609a;
        int i5 = this.f17611c;
        if (i5 >= 0) {
            return i5;
        }
        int size = list.size();
        this.f17611c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a7 = a();
        int i5 = this.f17610b;
        int i10 = (a7 + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f17610b = i10;
        return new a(this, i5, i10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int a7 = a();
        int i5 = this.f17610b;
        if (i5 >= a7) {
            return false;
        }
        this.f17610b = i5 + 1;
        try {
            consumer.accept(this.f17609a.get(i5));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.f17609a;
        int a7 = a();
        this.f17610b = a7;
        for (int i5 = this.f17610b; i5 < a7; i5++) {
            try {
                consumer.accept(list.get(i5));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f17610b;
    }
}
