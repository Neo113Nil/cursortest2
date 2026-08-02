package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f4940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f4941b;

    public c(d dVar, Iterator it, Iterator it2) {
        this.f4940a = it;
        this.f4941b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4940a.hasNext()) {
            return true;
        }
        return this.f4941b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f4940a;
        if (it.hasNext()) {
            return new q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f4941b;
        if (it2.hasNext()) {
            return new q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
