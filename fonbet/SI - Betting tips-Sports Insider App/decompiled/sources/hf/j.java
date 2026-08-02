package hf;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: a, reason: collision with root package name */
    public final i f10624a;

    public j(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f10624a = backing;
    }

    @Override // kotlin.collections.i
    public final int a() {
        return this.f10624a.f10620i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // hf.a
    public final boolean c(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f10624a.g(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10624a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f10624a.f(elements);
    }

    @Override // hf.a
    public final boolean d(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        i iVar = this.f10624a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        iVar.d();
        int i5 = iVar.i(entry.getKey());
        if (i5 < 0) {
            return false;
        }
        Object[] objArr = iVar.f10613b;
        Intrinsics.checkNotNull(objArr);
        if (!Intrinsics.areEqual(objArr[i5], entry.getValue())) {
            return false;
        }
        iVar.m(i5);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f10624a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i map = this.f10624a;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new g(map, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f10624a.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f10624a.d();
        return super.retainAll(elements);
    }
}
