package com.google.common.collect;

import com.google.common.collect.l;
import java.util.Iterator;
import java.util.Set;
import xsna.hzi0;
import xsna.owj0;

/* compiled from: Sets.java */
/* loaded from: classes13.dex */
public final class k extends l.d<Object> {
    public final /* synthetic */ Set b;
    public final /* synthetic */ owj0 c;

    public k(Set set, owj0 owj0Var) {
        this.b = set;
        this.c = owj0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.contains(obj) && !this.c.e.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c.containsAll(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new hzi0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.c.e.equals(it.next())) {
                i++;
            }
        }
        return i;
    }
}
