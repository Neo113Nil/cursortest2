package k7;

import j$.util.Map;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends n implements NavigableMap, Map {

    /* renamed from: f, reason: collision with root package name */
    public static final r f18909f;

    /* renamed from: c, reason: collision with root package name */
    public final transient y f18910c;

    /* renamed from: d, reason: collision with root package name */
    public final transient m f18911d;

    /* renamed from: e, reason: collision with root package name */
    public final transient r f18912e;

    static {
        y m6 = s.m(u.f18923b);
        i iVar = m.f18895b;
        f18909f = new r(m6, w.f18928e, null);
    }

    public r(y yVar, m mVar, r rVar) {
        this.f18910c = yVar;
        this.f18911d = mVar;
        this.f18912e = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r c(TreeMap treeMap) {
        u uVar = u.f18923b;
        Comparator comparator = treeMap.comparator();
        int i5 = 1;
        boolean equals = comparator == null ? true : uVar.equals(comparator);
        Set entrySet = treeMap.entrySet();
        if (entrySet == null) {
            Iterator it = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(n.f18897b);
        int length = entryArr.length;
        if (length == 0) {
            return d(uVar);
        }
        int i10 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i11 = 0; i11 < 1; i11++) {
                if (objArr[i11] == null) {
                    throw new NullPointerException(androidx.appcompat.widget.c1.i(i11, "at index "));
                }
            }
            y yVar = new y(m.h(1, objArr), uVar);
            Object[] objArr2 = {value};
            while (i10 < 1) {
                if (objArr2[i10] == null) {
                    throw new NullPointerException(androidx.appcompat.widget.c1.i(i10, "at index "));
                }
                i10++;
            }
            return new r(yVar, m.h(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (equals) {
            while (i10 < length) {
                Map.Entry entry2 = entryArr[i10];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                a.g(key2, value2);
                objArr3[i10] = key2;
                objArr4[i10] = value2;
                i10++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new androidx.coordinatorlayout.widget.i(10));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            a.g(objArr3[0], value3);
            while (i5 < length) {
                Map.Entry entry4 = entryArr[i5 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i5];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                a.g(key4, value4);
                objArr3[i5] = key4;
                objArr4[i5] = value4;
                if (uVar.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.o("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i5++;
                key3 = key4;
            }
        }
        return new r(new y(m.h(length, objArr3), uVar), m.h(length, objArr4), null);
    }

    public static r d(Comparator comparator) {
        if (u.f18923b.equals(comparator)) {
            return f18909f;
        }
        y m6 = s.m(comparator);
        i iVar = m.f18895b;
        return new r(m6, w.f18928e, null);
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
        return this.f18910c.f18916d;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f18910c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        r rVar = this.f18912e;
        if (rVar != null) {
            return rVar;
        }
        boolean isEmpty = isEmpty();
        y yVar = this.f18910c;
        if (!isEmpty) {
            return new r((y) yVar.descendingSet(), this.f18911d.f(), this);
        }
        Comparator comparator = yVar.f18916d;
        return d((comparator instanceof v ? (v) comparator : new g(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final r headMap(Object obj, boolean z5) {
        obj.getClass();
        return h(0, this.f18910c.o(obj, z5));
    }

    @Override // java.util.NavigableMap
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final r subMap(Object obj, boolean z5, Object obj2, boolean z7) {
        obj.getClass();
        obj2.getClass();
        if (this.f18910c.f18916d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z7).tailMap(obj, z5);
        }
        throw new IllegalArgumentException(a.d("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().h().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f18910c.first();
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

    @Override // java.util.NavigableMap
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final r tailMap(Object obj, boolean z5) {
        obj.getClass();
        return h(this.f18910c.p(obj, z5), this.f18911d.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // k7.n, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        int binarySearch;
        y yVar = this.f18910c;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(yVar.f18939f, obj, yVar.f18916d);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.f18911d.get(binarySearch);
    }

    public final r h(int i5, int i10) {
        m mVar = this.f18911d;
        if (i5 == 0) {
            if (i10 == mVar.size()) {
                return this;
            }
            i5 = 0;
        }
        y yVar = this.f18910c;
        return i5 == i10 ? d(yVar.f18916d) : new r(yVar.q(i5, i10), mVar.subList(i5, i10), null);
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

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f18910c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().h().get(this.f18911d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f18910c.last();
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
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f18910c;
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
        return this.f18911d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f18911d;
    }
}
