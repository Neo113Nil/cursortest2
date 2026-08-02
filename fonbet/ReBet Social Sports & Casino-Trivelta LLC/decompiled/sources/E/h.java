package E;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;

/* loaded from: classes.dex */
public final class h extends AbstractCollection implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final b f2913a;

    public h(b bVar) {
        this.f2913a = bVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f2913a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return this.f2913a.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new i(this.f2913a.d());
    }
}
