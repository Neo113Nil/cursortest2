package E;

import java.util.Iterator;
import kotlin.collections.AbstractSet;

/* loaded from: classes.dex */
public final class f extends AbstractSet implements D.b {

    /* renamed from: a, reason: collision with root package name */
    public final b f2912a;

    public f(b bVar) {
        this.f2912a = bVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f2912a.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return this.f2912a.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new g(this.f2912a.d());
    }
}
