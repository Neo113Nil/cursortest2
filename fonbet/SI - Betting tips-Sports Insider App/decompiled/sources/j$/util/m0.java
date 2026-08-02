package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements o0, y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f17757a;

    public /* synthetic */ m0(PrimitiveIterator.OfLong ofLong) {
        this.f17757a = ofLong;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f17757a;
        if (obj instanceof m0) {
            obj = ((m0) obj).f17757a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.p0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f17757a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.o0, java.util.Iterator, j$.util.y
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f17757a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.o0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f17757a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f17757a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f17757a.hashCode();
    }

    @Override // j$.util.o0, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f17757a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f17757a.next();
    }

    @Override // j$.util.o0
    public final /* synthetic */ long nextLong() {
        return this.f17757a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f17757a.remove();
    }
}
