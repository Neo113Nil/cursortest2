package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class mtb extends o5 {
    public final ltb a;

    public mtb(ltb ltbVar) {
        this.a = ltbVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.i(collection);
    }

    @Override // defpackage.x6
    public final int d() {
        return this.a.i;
    }

    @Override // defpackage.o5
    public final boolean e(Map.Entry entry) {
        Object key = entry.getKey();
        ltb ltbVar = this.a;
        int k = ltbVar.k(key);
        if (k < 0) {
            return false;
        }
        Object[] objArr = ltbVar.b;
        objArr.getClass();
        return Intrinsics.c(objArr[k], entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new itb(this.a, 0);
    }

    @Override // defpackage.o5
    public final boolean m(Map.Entry entry) {
        ltb ltbVar = this.a;
        ltbVar.g();
        int k = ltbVar.k(entry.getKey());
        if (k < 0) {
            return false;
        }
        Object[] objArr = ltbVar.b;
        objArr.getClass();
        if (!Intrinsics.c(objArr[k], entry.getValue())) {
            return false;
        }
        ltbVar.o(k);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.g();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.g();
        return super.retainAll(collection);
    }
}
