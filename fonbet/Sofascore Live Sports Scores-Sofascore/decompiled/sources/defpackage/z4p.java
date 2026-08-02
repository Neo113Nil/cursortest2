package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z4p extends c4p {
    public final transient i5p d;
    public final transient Object[] e;
    public final transient int f;

    public z4p(i5p i5pVar, Object[] objArr, int i) {
        this.d = i5pVar;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // defpackage.j3p
    /* renamed from: d */
    public final q5p iterator() {
        return p().listIterator(0);
    }

    @Override // defpackage.c4p, defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return p().listIterator(0);
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return true;
    }

    @Override // defpackage.j3p
    public final int r(Object[] objArr) {
        return p().r(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // defpackage.c4p
    public final q3p v() {
        return new x4p(this);
    }
}
