package com.google.common.collect;

import com.google.common.collect.b0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class a0 extends b0.d<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f59059a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A f59060b;

    a0(A a11, A a12) {
        this.f59059a = a11;
        this.f59060b = a12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f59059a.contains(obj) && this.f59060b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f59059a.containsAll(collection) && this.f59060b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f59060b, this.f59059a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new Z(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator<E> it = this.f59059a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (this.f59060b.contains(it.next())) {
                i11++;
            }
        }
        return i11;
    }
}
