package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f4p extends z3p implements NavigableMap {
    public static final f4p g;
    public final transient l5p d;
    public final transient q3p e;
    public final transient f4p f;

    static {
        l5p w = g4p.w(s4p.a);
        m3p m3pVar = q3p.b;
        g = new f4p(w, v4p.e, null);
    }

    public f4p(l5p l5pVar, q3p q3pVar, f4p f4pVar) {
        this.d = l5pVar;
        this.e = q3pVar;
        this.f = f4pVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.d.d;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.d.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        f4p f4pVar = this.f;
        if (f4pVar != null) {
            return f4pVar;
        }
        boolean isEmpty = isEmpty();
        l5p l5pVar = this.d;
        if (!isEmpty) {
            return new f4p((l5p) l5pVar.descendingSet(), this.e.s(), this);
        }
        Comparator comparator = l5pVar.d;
        t4p d = (comparator instanceof t4p ? (t4p) comparator : new y2p(comparator)).d();
        if (s4p.a.equals(d)) {
            return g;
        }
        l5p w = g4p.w(d);
        m3p m3pVar = q3p.b;
        return new f4p(w, v4p.e, null);
    }

    @Override // defpackage.z3p, java.util.Map, java.util.SortedMap
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().p().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.d.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    @Override // defpackage.z3p
    public final c4p g() {
        return isEmpty() ? j5p.j : new e4p(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // defpackage.z3p, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        int binarySearch;
        l5p l5pVar = this.d;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(l5pVar.f, obj, l5pVar.d);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.e.get(binarySearch);
    }

    @Override // defpackage.z3p
    /* renamed from: h */
    public final /* synthetic */ c4p keySet() {
        return this.d;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    @Override // defpackage.z3p
    public final c4p i() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.z3p
    /* renamed from: j */
    public final j3p values() {
        return this.e;
    }

    @Override // defpackage.z3p
    public final j3p k() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.z3p, java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.d;
    }

    @Override // defpackage.z3p
    public final boolean l() {
        return this.d.f.q() || this.e.q();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().p().get(this.e.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.d.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final f4p headMap(Object obj, boolean z) {
        obj.getClass();
        return p(0, this.d.z(obj, z));
    }

    @Override // java.util.NavigableMap
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final f4p subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.d.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        a70.p(wca.O("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final f4p tailMap(Object obj, boolean z) {
        obj.getClass();
        return p(this.d.A(obj, z), this.e.size());
    }

    public final f4p p(int i, int i2) {
        q3p q3pVar = this.e;
        if (i == 0) {
            if (i2 == q3pVar.size()) {
                return this;
            }
            i = 0;
        }
        l5p l5pVar = this.d;
        if (i != i2) {
            return new f4p(l5pVar.B(i, i2), q3pVar.subList(i, i2), null);
        }
        Comparator comparator = l5pVar.d;
        if (s4p.a.equals(comparator)) {
            return g;
        }
        l5p w = g4p.w(comparator);
        m3p m3pVar = q3p.b;
        return new f4p(w, v4p.e, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.z3p, java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.e;
    }
}
