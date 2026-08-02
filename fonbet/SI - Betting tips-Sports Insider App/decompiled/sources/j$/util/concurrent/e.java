package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class e extends n implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f17649i;
    public long j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public e(j[] jVarArr, int i5, int i10, int i11, long j, ConcurrentHashMap concurrentHashMap) {
        super(jVarArr, i5, i10, i11);
        this.f17649i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i5 = this.f17669f;
        int i10 = this.f17670g;
        int i11 = (i5 + i10) >>> 1;
        if (i11 <= i5) {
            return null;
        }
        j[] jVarArr = this.f17664a;
        this.f17670g = i11;
        long j = this.j >>> 1;
        this.j = j;
        return new e(jVarArr, this.f17671h, i11, i10, j, this.f17649i);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            j a7 = a();
            if (a7 == null) {
                return;
            } else {
                consumer.n(new i(a7.f17657b, a7.f17658c, this.f17649i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        j a7 = a();
        if (a7 == null) {
            return false;
        }
        consumer.n(new i(a7.f17657b, a7.f17658c, this.f17649i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }
}
