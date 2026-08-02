package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class l7 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f17976d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f17977a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f17978b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17979c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    public l7(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f17977a = spliterator;
        this.f17978b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f17979c = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f17977a.tryAdvance(this)) {
            Object obj = this.f17979c;
            if (obj == null) {
                obj = f17976d;
            }
            if (this.f17978b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.n(this.f17979c);
                this.f17979c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f17977a.forEachRemaining(new j$.util.concurrent.r(7, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f17977a.trySplit();
        if (trySplit != null) {
            return new l7(trySplit, this.f17978b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17977a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f17977a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f17977a.getComparator();
    }
}
