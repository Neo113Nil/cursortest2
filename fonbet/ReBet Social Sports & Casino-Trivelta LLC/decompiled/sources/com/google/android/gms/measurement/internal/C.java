package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class C implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f33310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbe f33311b;

    public C(zzbe zzbeVar) {
        Objects.requireNonNull(zzbeVar);
        this.f33311b = zzbeVar;
        this.f33310a = zzbeVar.m().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f33310a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33310a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
