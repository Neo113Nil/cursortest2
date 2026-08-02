package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public j f6320a;

    /* renamed from: b, reason: collision with root package name */
    public j f6321b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f6322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f6323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6324e;

    public h(k kVar, int i5) {
        this.f6324e = i5;
        this.f6323d = kVar;
        this.f6320a = kVar.f6342f.f6330d;
        this.f6322c = kVar.f6341e;
    }

    public final Object a() {
        return b();
    }

    public final j b() {
        j jVar = this.f6320a;
        k kVar = this.f6323d;
        if (jVar == kVar.f6342f) {
            throw new NoSuchElementException();
        }
        if (kVar.f6341e != this.f6322c) {
            throw new ConcurrentModificationException();
        }
        this.f6320a = jVar.f6330d;
        this.f6321b = jVar;
        return jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6320a != this.f6323d.f6342f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f6324e) {
            case 1:
                return b().f6332f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        j jVar = this.f6321b;
        if (jVar == null) {
            throw new IllegalStateException();
        }
        k kVar = this.f6323d;
        kVar.d(jVar, true);
        this.f6321b = null;
        this.f6322c = kVar.f6341e;
    }
}
