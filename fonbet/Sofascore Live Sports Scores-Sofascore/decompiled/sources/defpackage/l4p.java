package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.CuePointData;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l4p implements ListIterator, Iterator {
    public final Iterator a;
    public final /* synthetic */ int b;

    public l4p(AbstractList abstractList, ListIterator listIterator, int i) {
        this.b = i;
        listIterator.getClass();
        this.a = listIterator;
    }

    public final Object a(Object obj) {
        int i = 8;
        switch (this.b) {
            case 0:
                CuePointData cuePointData = (CuePointData) obj;
                cuePointData.start();
                cuePointData.end();
                cuePointData.played();
                break;
            default:
                CuePointData cuePointData2 = (CuePointData) obj;
                cuePointData2.start();
                cuePointData2.end();
                cuePointData2.played();
                break;
        }
        return new x3f(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.a).hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return a(this.a.next());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.a).previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.a.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
