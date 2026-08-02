package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class m2 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f17985a;

    @Override // j$.util.stream.i2
    public final /* synthetic */ i2 i(long j, long j6, IntFunction intFunction) {
        return x3.V(this, j, j6, intFunction);
    }

    @Override // j$.util.stream.i2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.i2
    public final i2 a(int i5) {
        throw new IndexOutOfBoundsException();
    }

    public m2(Collection collection) {
        this.f17985a = collection;
    }

    @Override // j$.util.stream.i2
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f17985a).spliterator();
    }

    @Override // j$.util.stream.i2
    public final void k(Object[] objArr, int i5) {
        Iterator it = this.f17985a.iterator();
        while (it.hasNext()) {
            objArr[i5] = it.next();
            i5++;
        }
    }

    @Override // j$.util.stream.i2
    public final Object[] m(IntFunction intFunction) {
        java.util.Collection collection = this.f17985a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.i2
    public final long count() {
        return this.f17985a.size();
    }

    @Override // j$.util.stream.i2
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f17985a, consumer);
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f17985a.size()), this.f17985a);
    }
}
