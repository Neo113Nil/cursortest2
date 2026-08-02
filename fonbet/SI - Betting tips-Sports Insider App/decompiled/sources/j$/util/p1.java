package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;
import kotlin.jvm.internal.LongCompanionObject;
import okio.Segment;

/* loaded from: classes2.dex */
public class p1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f17767a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f17768b = null;

    /* renamed from: c, reason: collision with root package name */
    public final int f17769c;

    /* renamed from: d, reason: collision with root package name */
    public long f17770d;

    /* renamed from: e, reason: collision with root package name */
    public int f17771e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    public p1(java.util.Collection collection, int i5) {
        this.f17767a = collection;
        this.f17769c = (i5 & 4096) == 0 ? i5 | 16448 : i5;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j;
        Iterator it = this.f17768b;
        if (it == null) {
            it = this.f17767a.iterator();
            this.f17768b = it;
            j = this.f17767a.size();
            this.f17770d = j;
        } else {
            j = this.f17770d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i5 = this.f17771e + Segment.SHARE_MINIMUM;
        if (i5 > j) {
            i5 = (int) j;
        }
        if (i5 > 33554432) {
            i5 = 33554432;
        }
        Object[] objArr = new Object[i5];
        int i10 = 0;
        do {
            objArr[i10] = it.next();
            i10++;
            if (i10 >= i5) {
                break;
            }
        } while (it.hasNext());
        this.f17771e = i10;
        long j6 = this.f17770d;
        if (j6 != LongCompanionObject.MAX_VALUE) {
            this.f17770d = j6 - i10;
        }
        return new i1(objArr, 0, i10, this.f17769c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f17768b;
        if (it == null) {
            it = this.f17767a.iterator();
            this.f17768b = it;
            this.f17770d = this.f17767a.size();
        }
        Iterator$EL.forEachRemaining(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f17768b == null) {
            this.f17768b = this.f17767a.iterator();
            this.f17770d = this.f17767a.size();
        }
        if (!this.f17768b.hasNext()) {
            return false;
        }
        consumer.accept(this.f17768b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f17768b == null) {
            this.f17768b = this.f17767a.iterator();
            long size = this.f17767a.size();
            this.f17770d = size;
            return size;
        }
        return this.f17770d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17769c;
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
