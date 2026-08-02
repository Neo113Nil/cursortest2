package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f5080a;

    public i(Iterator it) {
        this.f5080a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5080a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new q((String) this.f5080a.next());
    }
}
