package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f22549a;

    public d(e eVar) {
        this.f22549a = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f22549a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22549a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f22549a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f22549a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f22549a;
        int a7 = eVar.a(obj);
        if (a7 < 0) {
            return false;
        }
        eVar.h(a7);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f22549a;
        int i5 = eVar.f22575c;
        int i10 = 0;
        boolean z5 = false;
        while (i10 < i5) {
            if (collection.contains(eVar.j(i10))) {
                eVar.h(i10);
                i10--;
                i5--;
                z5 = true;
            }
            i10++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f22549a;
        int i5 = eVar.f22575c;
        int i10 = 0;
        boolean z5 = false;
        while (i10 < i5) {
            if (!collection.contains(eVar.j(i10))) {
                eVar.h(i10);
                i10--;
                i5--;
                z5 = true;
            }
            i10++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f22549a.f22575c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f22549a;
        int i5 = eVar.f22575c;
        Object[] objArr = new Object[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[i10] = eVar.j(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f22549a;
        int i5 = eVar.f22575c;
        if (objArr.length < i5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        }
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[i10] = eVar.j(i10);
        }
        if (objArr.length > i5) {
            objArr[i5] = null;
        }
        return objArr;
    }
}
