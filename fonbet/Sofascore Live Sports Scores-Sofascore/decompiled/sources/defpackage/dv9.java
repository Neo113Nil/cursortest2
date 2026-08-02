package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dv9 extends hv9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ hv9 e;

    public dv9(hv9 hv9Var, int i, int i2) {
        this.e = hv9Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.hv9, java.util.List
    /* renamed from: E */
    public final hv9 subList(int i, int i2) {
        z1a.A(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        z1a.v(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.hv9, defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.hv9, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.wu9
    public final Object[] m() {
        return this.e.m();
    }

    @Override // defpackage.wu9
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // defpackage.wu9
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
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
