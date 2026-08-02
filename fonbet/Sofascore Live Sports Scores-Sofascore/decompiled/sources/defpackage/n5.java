package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class n5 extends AbstractCollection implements List {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable g;

    public n5(hjo hjoVar, Object obj, List list, n5 n5Var) {
        this.g = hjoVar;
        this.f = hjoVar;
        this.b = obj;
        this.c = list;
        this.e = n5Var;
        this.d = n5Var == null ? null : n5Var.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                d();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (add) {
                    ((azc) serializable).f++;
                    if (isEmpty) {
                        c();
                    }
                }
                return add;
            default:
                m();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (add2) {
                    ((hjo) serializable).e++;
                    if (isEmpty2) {
                        n();
                        return true;
                    }
                }
                return add2;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.a;
        Serializable serializable = this.g;
        boolean z = false;
        switch (i2) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = ((List) this.c).addAll(i, collection);
                    if (z) {
                        ((azc) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            c();
                        }
                    }
                }
                return z;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = ((List) this.c).addAll(i, collection);
                if (!addAll) {
                    return addAll;
                }
                ((hjo) serializable).e += this.c.size() - size2;
                if (size2 != 0) {
                    return addAll;
                }
                n();
                return true;
        }
    }

    public void c() {
        n5 n5Var = (n5) this.e;
        if (n5Var != null) {
            n5Var.c();
        } else {
            ((azc) this.f).e.put(this.b, this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((azc) serializable).f -= size;
                    e();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((hjo) serializable).e -= size2;
                    zzb();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                m();
                break;
        }
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                m();
                break;
        }
        return this.c.containsAll(collection);
    }

    public void d() {
        Collection collection;
        n5 n5Var = (n5) this.e;
        if (n5Var != null) {
            n5Var.d();
            if (n5Var.c == this.d) {
                return;
            }
            a70.o();
            return;
        }
        if (!this.c.isEmpty() || (collection = (Collection) ((azc) this.f).e.get(this.b)) == null) {
            return;
        }
        this.c = collection;
    }

    public void e() {
        n5 n5Var = (n5) this.e;
        if (n5Var != null) {
            n5Var.e();
        } else if (this.c.isEmpty()) {
            ((azc) this.f).e.remove(this.b);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                d();
                return this.c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                m();
                return this.c.equals(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                m();
                break;
        }
        return ((List) this.c).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                d();
                return this.c.hashCode();
            default:
                m();
                return this.c.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                m();
                break;
        }
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                d();
                return new e5(this);
            default:
                m();
                return new e5(this, (byte) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                m();
                break;
        }
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                d();
                return new m5(this);
            default:
                m();
                return new yho(this);
        }
    }

    public void m() {
        n5 n5Var = (n5) this.e;
        if (n5Var != null) {
            n5Var.m();
            if (n5Var.c == this.d) {
                return;
            }
            a70.o();
            return;
        }
        if (this.c.isEmpty()) {
            hjo hjoVar = (hjo) this.f;
            Collection collection = (Collection) hjoVar.d.get(this.b);
            if (collection != null) {
                this.c = collection;
            }
        }
    }

    public void n() {
        n5 n5Var = (n5) this.e;
        if (n5Var != null) {
            n5Var.n();
            return;
        }
        hjo hjoVar = (hjo) this.f;
        hjoVar.d.put(this.b, this.c);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        Serializable serializable = this.g;
        switch (i2) {
            case 0:
                d();
                Object remove = ((List) this.c).remove(i);
                azc azcVar = (azc) serializable;
                azcVar.f--;
                e();
                return remove;
            default:
                m();
                Object remove2 = ((List) this.c).remove(i);
                hjo hjoVar = (hjo) serializable;
                hjoVar.e--;
                zzb();
                return remove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (i) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((azc) serializable).f += this.c.size() - size;
                        e();
                        break;
                    }
                }
                break;
            default:
                if (!collection.isEmpty()) {
                    int size2 = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((hjo) serializable).e += this.c.size() - size2;
                        zzb();
                        break;
                    }
                }
                break;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.c.retainAll(collection);
                if (retainAll) {
                    ((azc) serializable).f += this.c.size() - size;
                    e();
                }
                return retainAll;
            default:
                collection.getClass();
                int size2 = size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    ((hjo) serializable).e += this.c.size() - size2;
                    zzb();
                }
                return retainAll2;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                m();
                break;
        }
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                m();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.a;
        Serializable serializable = this.g;
        Object obj = this.b;
        AbstractCollection abstractCollection = this.e;
        switch (i3) {
            case 0:
                d();
                azc azcVar = (azc) serializable;
                List subList = ((List) this.c).subList(i, i2);
                n5 n5Var = (n5) abstractCollection;
                if (n5Var != null) {
                    this = n5Var;
                }
                return subList instanceof RandomAccess ? new j5(azcVar, obj, subList, this) : new n5(azcVar, obj, subList, this);
            default:
                m();
                List subList2 = ((List) this.c).subList(i, i2);
                n5 n5Var2 = (n5) abstractCollection;
                if (n5Var2 != null) {
                    this = n5Var2;
                }
                hjo hjoVar = (hjo) serializable;
                return subList2 instanceof RandomAccess ? new sho(hjoVar, obj, subList2, this) : new n5(hjoVar, obj, subList2, this);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                m();
                break;
        }
        return this.c.toString();
    }

    public void zzb() {
        n5 n5Var = (n5) this.e;
        if (n5Var != null) {
            n5Var.zzb();
        } else if (this.c.isEmpty()) {
            hjo hjoVar = (hjo) this.f;
            hjoVar.d.remove(this.b);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                d();
                return new m5(this, i);
            default:
                m();
                return new yho(this, i);
        }
    }

    public n5(azc azcVar, Object obj, List list, n5 n5Var) {
        this.g = azcVar;
        this.f = azcVar;
        this.b = obj;
        this.c = list;
        this.e = n5Var;
        this.d = n5Var == null ? null : n5Var.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                d();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    azc azcVar = (azc) serializable;
                    azcVar.f--;
                    e();
                }
                return remove;
            default:
                m();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    hjo hjoVar = (hjo) serializable;
                    hjoVar.e--;
                    zzb();
                }
                return remove2;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        Serializable serializable = this.g;
        switch (i2) {
            case 0:
                d();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((azc) serializable).f++;
                if (isEmpty) {
                    c();
                    break;
                }
                break;
            default:
                m();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((hjo) serializable).e++;
                if (isEmpty2) {
                    n();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (i) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.addAll(collection);
                    if (z) {
                        ((azc) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            c();
                        }
                    }
                }
                return z;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = this.c.addAll(collection);
                if (!addAll) {
                    return addAll;
                }
                ((hjo) serializable).e += this.c.size() - size2;
                if (size2 != 0) {
                    return addAll;
                }
                n();
                return true;
        }
    }
}
