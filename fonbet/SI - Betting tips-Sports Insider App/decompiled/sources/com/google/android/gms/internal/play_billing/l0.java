package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f5494a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5495b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5496c;

    public l0(Iterator it) {
        it.getClass();
        this.f5494a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5495b || this.f5494a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f5495b) {
            return this.f5494a.next();
        }
        Object obj = this.f5496c;
        this.f5495b = false;
        this.f5496c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f5495b) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f5494a.remove();
    }
}
