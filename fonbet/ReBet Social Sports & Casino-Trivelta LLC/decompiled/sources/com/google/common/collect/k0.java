package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class k0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f36830a;

    public k0(Iterator it) {
        this.f36830a = (Iterator) Ra.n.k(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36830a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f36830a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f36830a.remove();
    }
}
