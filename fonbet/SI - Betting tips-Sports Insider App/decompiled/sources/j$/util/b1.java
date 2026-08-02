package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class b1 implements Spliterator.OfPrimitive {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f17619a;

    public /* synthetic */ b1(c1 c1Var) {
        this.f17619a = c1Var;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(c1 c1Var) {
        if (c1Var == null) {
            return null;
        }
        return c1Var instanceof a1 ? ((a1) c1Var).f17615a : c1Var instanceof t0 ? s0.a((t0) c1Var) : c1Var instanceof w0 ? v0.a((w0) c1Var) : c1Var instanceof z0 ? y0.a((z0) c1Var) : new b1(c1Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f17619a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c1 c1Var = this.f17619a;
        if (obj instanceof b1) {
            obj = ((b1) obj).f17619a;
        }
        return c1Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f17619a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f17619a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f17619a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f17619a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f17619a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return this.f17619a.hasCharacteristics(i5);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17619a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f17619a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f17619a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f17619a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f17619a.trySplit());
    }
}
