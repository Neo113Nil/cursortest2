package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class u0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f18188a;

    public /* synthetic */ u0(Spliterator.OfInt ofInt) {
        this.f18188a = ofInt;
    }

    public static /* synthetic */ w0 a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof v0 ? ((v0) ofInt).f18189a : new u0(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18188a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f18188a;
        if (obj instanceof u0) {
            obj = ((u0) obj).f18188a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18188a.estimateSize();
    }

    @Override // j$.util.c1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18188a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18188a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.w0
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18188a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18188a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18188a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return this.f18188a.hasCharacteristics(i5);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18188a.hashCode();
    }

    @Override // j$.util.c1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18188a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18188a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.w0
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f18188a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return d1.a(this.f18188a.trySplit());
    }

    @Override // j$.util.c1, j$.util.Spliterator
    public final /* synthetic */ c1 trySplit() {
        return a1.a(this.f18188a.trySplit());
    }

    @Override // j$.util.w0, j$.util.c1, j$.util.Spliterator
    public final /* synthetic */ w0 trySplit() {
        return a(this.f18188a.trySplit());
    }
}
