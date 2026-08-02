package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class b9 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f17815a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17816b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17817c;

    /* renamed from: d, reason: collision with root package name */
    public int f17818d;

    public abstract Spliterator b(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.com.android.tools.r8.a.p(this, i5);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    public b9(Spliterator spliterator) {
        this.f17817c = true;
        this.f17815a = spliterator;
        this.f17816b = new AtomicBoolean();
    }

    public b9(Spliterator spliterator, b9 b9Var) {
        this.f17817c = true;
        this.f17815a = spliterator;
        b9Var.getClass();
        this.f17816b = b9Var.f17816b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17815a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17815a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f17815a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator trySplit = this.f17815a.trySplit();
        if (trySplit != null) {
            return b(trySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.f17818d == 0 && this.f17816b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        return (j$.util.c1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.t0 trySplit() {
        return (j$.util.t0) trySplit();
    }
}
