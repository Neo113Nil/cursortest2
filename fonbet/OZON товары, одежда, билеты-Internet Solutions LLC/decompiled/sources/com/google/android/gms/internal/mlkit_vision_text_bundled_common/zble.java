package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;

/* loaded from: classes9.dex */
abstract class zble implements Iterator {
    final Iterator zbb;

    zble(Iterator it) {
        it.getClass();
        this.zbb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zbb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zba(this.zbb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zbb.remove();
    }

    abstract Object zba(Object obj);
}
