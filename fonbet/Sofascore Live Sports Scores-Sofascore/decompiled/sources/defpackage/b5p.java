package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b5p extends c4p {
    public final transient i5p d;
    public final transient h5p e;

    public b5p(i5p i5pVar, h5p h5pVar) {
        this.d = i5pVar;
        this.e = h5pVar;
    }

    @Override // defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.j3p
    /* renamed from: d */
    public final q5p iterator() {
        return this.e.listIterator(0);
    }

    @Override // defpackage.c4p, defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // defpackage.c4p, defpackage.j3p
    public final q3p p() {
        return this.e;
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return true;
    }

    @Override // defpackage.j3p
    public final int r(Object[] objArr) {
        return this.e.r(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
