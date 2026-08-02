package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j0d implements List, gia {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j0d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                l0d l0dVar = (l0d) obj2;
                if (i < 0 || i > (i2 = l0dVar.b)) {
                    l0dVar.p(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = l0dVar.a;
                if (objArr.length < i4) {
                    l0dVar.m(i4, objArr);
                }
                Object[] objArr2 = l0dVar.a;
                int i5 = l0dVar.b;
                if (i != i5) {
                    mh0.d(i + 1, i, i5, objArr2, objArr2);
                }
                objArr2[i] = obj;
                l0dVar.b++;
                return;
            default:
                ((i1d) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                collection.getClass();
                l0d l0dVar = (l0d) obj;
                if (i < 0 || i > l0dVar.b) {
                    l0dVar.p(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + l0dVar.b;
                Object[] objArr = l0dVar.a;
                if (objArr.length < size) {
                    l0dVar.m(size, objArr);
                }
                Object[] objArr2 = l0dVar.a;
                if (i != l0dVar.b) {
                    mh0.d(collection.size() + i, i, l0dVar.b, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                l0dVar.b = collection.size() + l0dVar.b;
                return true;
            default:
                return ((i1d) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((l0d) obj).d();
                break;
            default:
                ((i1d) obj).n();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((l0d) obj2).g(obj) >= 0;
            default:
                return ((i1d) obj2).o(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                l0d l0dVar = (l0d) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (l0dVar.g(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                i1d i1dVar = (i1d) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!i1dVar.o(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yjd.a(i, this);
                return ((l0d) obj).f(i);
            default:
                j1d.a(i, this);
                return ((i1d) obj).a[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((l0d) obj2).g(obj);
            default:
                return ((i1d) obj2).p(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((l0d) obj).h();
            default:
                return ((i1d) obj).c == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new i0d(this, 0, 0);
            default:
                return new i0d(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                l0d l0dVar = (l0d) obj2;
                Object[] objArr = l0dVar.a;
                int i3 = l0dVar.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                i1d i1dVar = (i1d) obj2;
                Object[] objArr2 = i1dVar.a;
                for (int i4 = i1dVar.c - 1; i4 >= 0; i4--) {
                    if (Intrinsics.c(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                return new i0d(this, 0, 0);
            default:
                return new i0d(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                yjd.a(i, this);
                return ((l0d) obj).k(i);
            default:
                j1d.a(i, this);
                return ((i1d) obj).r(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                l0d l0dVar = (l0d) obj;
                int i2 = l0dVar.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    l0dVar.j(it.next());
                }
                if (i2 == l0dVar.b) {
                    break;
                }
                break;
            default:
                i1d i1dVar = (i1d) obj;
                if (!collection.isEmpty()) {
                    int i3 = i1dVar.c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        i1dVar.q(it2.next());
                    }
                    if (i3 != i1dVar.c) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                l0d l0dVar = (l0d) obj;
                int i2 = l0dVar.b;
                Object[] objArr = l0dVar.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        l0dVar.k(i3);
                    }
                }
                if (i2 != l0dVar.b) {
                    break;
                }
                break;
            default:
                i1d i1dVar = (i1d) obj;
                int i4 = i1dVar.c;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(i1dVar.a[i5])) {
                        i1dVar.r(i5);
                    }
                }
                if (i4 != i1dVar.c) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                yjd.a(i, this);
                return ((l0d) obj2).n(i, obj);
            default:
                j1d.a(i, this);
                Object[] objArr = ((i1d) obj2).a;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((l0d) obj).b;
            default:
                return ((i1d) obj).c;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                yjd.b(i, i2, this);
                return new k0d(this, i, i2, 0);
            default:
                j1d.b(i, i2, this);
                return new k0d(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                break;
        }
        return rfo.N(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return rfo.M(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new i0d(this, i, 0);
            default:
                return new i0d(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((l0d) obj2).j(obj);
            default:
                return ((i1d) obj2).q(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((l0d) obj2).a(obj);
                break;
            default:
                ((i1d) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                l0d l0dVar = (l0d) obj;
                int i2 = l0dVar.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    l0dVar.a(it.next());
                }
                return i2 != l0dVar.b;
            default:
                i1d i1dVar = (i1d) obj;
                return i1dVar.e(i1dVar.c, collection);
        }
    }
}
