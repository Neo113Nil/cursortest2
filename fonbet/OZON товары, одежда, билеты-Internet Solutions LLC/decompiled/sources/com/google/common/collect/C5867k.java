package com.google.common.collect;

import Bl0.k0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.collect.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
class C5867k<E> extends AbstractCollection<E> {

    /* renamed from: a, reason: collision with root package name */
    final Set f59104a;

    /* renamed from: b, reason: collision with root package name */
    final O7.i<? super E> f59105b;

    C5867k(Set set, O7.i iVar) {
        this.f59104a = set;
        this.f59105b = iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e11) {
        k0.e(this.f59105b.apply(e11));
        return this.f59104a.add(e11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            k0.e(this.f59105b.apply(it.next()));
        }
        return this.f59104a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        B.c(this.f59104a, this.f59105b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean z11;
        Set set = this.f59104a;
        set.getClass();
        try {
            z11 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z11 = false;
        }
        if (z11) {
            return this.f59105b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Iterator it = this.f59104a.iterator();
        O7.i<? super E> iVar = this.f59105b;
        k0.g(iVar, "predicate");
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (iVar.apply((Object) it.next())) {
                break;
            }
            i11++;
        }
        return true ^ (i11 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f59104a.iterator();
        it.getClass();
        O7.i<? super E> iVar = this.f59105b;
        iVar.getClass();
        return new C(it, iVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f59104a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f59104a.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f59105b.apply(next) && collection.contains(next)) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f59104a.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f59105b.apply(next) && !collection.contains(next)) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f59104a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (this.f59105b.apply(it.next())) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC5858b abstractC5858b = (AbstractC5858b) it;
            if (!abstractC5858b.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(abstractC5858b.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC5858b abstractC5858b = (AbstractC5858b) it;
            if (abstractC5858b.hasNext()) {
                arrayList.add(abstractC5858b.next());
            } else {
                return (T[]) arrayList.toArray(tArr);
            }
        }
    }
}
