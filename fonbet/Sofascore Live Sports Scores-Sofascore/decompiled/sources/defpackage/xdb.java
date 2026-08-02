package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xdb implements ListIterator {
    public boolean a;
    public final /* synthetic */ ListIterator b;
    public final /* synthetic */ ydb c;

    public xdb(ydb ydbVar, ListIterator listIterator) {
        this.b = listIterator;
        this.c = ydbVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
        this.a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.b;
        if (listIterator.hasPrevious()) {
            this.a = true;
            return listIterator.previous();
        }
        yhk.d();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.c(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.b;
        if (listIterator.hasNext()) {
            this.a = true;
            return listIterator.next();
        }
        yhk.d();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        z1a.D("no calls to next() since the last call to remove()", this.a);
        this.b.remove();
        this.a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        z1a.E(this.a);
        this.b.set(obj);
    }
}
