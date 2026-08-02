package com.logrocket.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f6784a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6784a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f6784a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
