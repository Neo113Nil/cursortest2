package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.CuePointData;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m4p extends AbstractList implements RandomAccess, Serializable {
    public final List a;

    public m4p(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        CuePointData cuePointData = (CuePointData) this.a.get(i);
        cuePointData.start();
        cuePointData.end();
        cuePointData.played();
        return new x3f(8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new l4p(this, this.a.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        CuePointData cuePointData = (CuePointData) this.a.remove(i);
        cuePointData.start();
        cuePointData.end();
        cuePointData.played();
        return new x3f(8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
