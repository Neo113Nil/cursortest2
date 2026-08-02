package com.google.common.collect;

import com.google.common.collect.l;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import xsna.gzi0;

/* compiled from: Sets.java */
/* loaded from: classes13.dex */
public final class j extends l.d<Object> {
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;

    public j(Set set, Set set2) {
        this.b = set;
        this.c = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.contains(obj) && this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.b.containsAll(collection) && this.c.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.c, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new gzi0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.c.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
