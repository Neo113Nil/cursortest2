package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bv9 extends hv9 {
    public final transient hv9 c;

    public bv9(hv9 hv9Var) {
        this.c = hv9Var;
    }

    @Override // defpackage.hv9
    public final hv9 C() {
        return this.c;
    }

    @Override // defpackage.hv9, java.util.List
    /* renamed from: E */
    public final hv9 subList(int i, int i2) {
        hv9 hv9Var = this.c;
        z1a.A(i, i2, hv9Var.size());
        return hv9Var.subList(hv9Var.size() - i2, hv9Var.size() - i).C();
    }

    @Override // defpackage.hv9, defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        hv9 hv9Var = this.c;
        z1a.v(i, hv9Var.size());
        return hv9Var.get((hv9Var.size() - 1) - i);
    }

    @Override // defpackage.hv9, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.hv9, defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.hv9, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.hv9, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return this.c.p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.hv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.hv9, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
