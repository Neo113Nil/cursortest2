package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
public final class m<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<E> f59996a;

    public m(ArrayList<E> arrayList) {
        Objects.requireNonNull(arrayList);
        this.f59996a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        if (e11 == null) {
            throw new NullPointerException("Element must be non-null");
        }
        this.f59996a.add(i11, e11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f59996a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f59996a.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return this.f59996a.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        return this.f59996a.get(i11);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f59996a.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return this.f59996a.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f59996a.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i11) {
        return this.f59996a.remove(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        return this.f59996a.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        return this.f59996a.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        if (e11 != null) {
            return this.f59996a.set(i11, e11);
        }
        throw new NullPointerException("Element must be non-null");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59996a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f59996a.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        return this.f59996a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f59996a.toArray(tArr);
    }
}
