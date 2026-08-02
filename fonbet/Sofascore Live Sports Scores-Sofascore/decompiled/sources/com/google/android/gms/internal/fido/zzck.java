package com.google.android.gms.internal.fido;

import defpackage.bvn;
import defpackage.ilg;
import defpackage.kqn;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzck extends zzcf implements NavigableSet, Iterable {
    public final transient Comparator d;
    public transient zzck e;

    public zzck(Comparator comparator) {
        this.d = comparator;
    }

    public static c x(Comparator comparator) {
        if (bvn.a.equals(comparator)) {
            return c.g;
        }
        kqn kqnVar = zzcc.b;
        return new c(a.e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object ceiling(Object obj) {
        obj.getClass();
        kqn listIterator = w(obj, true).f.listIterator(0);
        if (listIterator.hasNext()) {
            return listIterator.next();
        }
        return null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        zzck zzckVar = this.e;
        if (zzckVar != null) {
            return zzckVar;
        }
        c t = t();
        this.e = t;
        t.e = this;
        return t;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        obj.getClass();
        kqn descendingIterator = u(obj, true).descendingIterator();
        if (descendingIterator.hasNext()) {
            return descendingIterator.next();
        }
        return null;
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return u(obj, false);
    }

    public Object higher(Object obj) {
        obj.getClass();
        kqn listIterator = w(obj, false).f.listIterator(0);
        if (listIterator.hasNext()) {
            return listIterator.next();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        obj.getClass();
        kqn descendingIterator = u(obj, false).descendingIterator();
        if (descendingIterator.hasNext()) {
            return descendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            return v(obj, true, obj2, false);
        }
        ilg.c();
        return null;
    }

    public abstract c t();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return w(obj, true);
    }

    public abstract c u(Object obj, boolean z);

    public abstract zzck v(Object obj, boolean z, Object obj2, boolean z2);

    public abstract c w(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract kqn descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return u(obj, z);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return w(obj, z);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            return v(obj, z, obj2, z2);
        }
        ilg.c();
        return null;
    }
}
