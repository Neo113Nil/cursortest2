package com.google.protobuf.kotlin;

import java.util.Iterator;
import xsna.gcy;

/* compiled from: UnmodifiableCollections.kt */
/* loaded from: classes13.dex */
public final class UnmodifiableIterator<E> implements Iterator<E>, gcy {
    private final /* synthetic */ Iterator<E> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableIterator(Iterator<? extends E> it) {
        this.$$delegate_0 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
