package com.google.android.gms.internal.fido;

import defpackage.a70;
import defpackage.bvn;
import defpackage.fc6;
import defpackage.kqn;
import defpackage.ljg;
import defpackage.usn;
import defpackage.wba;
import defpackage.wpn;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcj extends zzcd implements NavigableMap {
    public static final bvn f;
    public static final zzcj g;
    public final transient c c;
    public final transient zzcc d;
    public final transient zzcj e;

    static {
        bvn bvnVar = bvn.a;
        f = bvnVar;
        c x = zzck.x(bvnVar);
        kqn kqnVar = zzcc.b;
        g = new zzcj(x, a.e, null);
    }

    public zzcj(c cVar, zzcc zzccVar, zzcj zzcjVar) {
        this.c = cVar;
        this.d = zzccVar;
        this.e = zzcjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzcj j(TreeMap treeMap) {
        Comparator comparator = treeMap.comparator();
        int i = 1;
        final bvn bvnVar = f;
        boolean equals = comparator == null ? true : bvnVar.equals(comparator);
        Set entrySet = treeMap.entrySet();
        if (!(entrySet instanceof Collection)) {
            Iterator it = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(zzcd.b);
        int length = entryArr.length;
        if (length == 0) {
            return k(bvnVar);
        }
        int i2 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i3 = 0; i3 < 1; i3++) {
                if (objArr[i3] == null) {
                    yhk.s(ljg.j(i3, "at index "));
                    return null;
                }
            }
            c cVar = new c(zzcc.r(1, objArr), bvnVar);
            Object[] objArr2 = {value};
            while (i2 < 1) {
                if (objArr2[i2] == null) {
                    yhk.s(ljg.j(i2, "at index "));
                    return null;
                }
                i2++;
            }
            return new zzcj(cVar, zzcc.r(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (equals) {
            while (i2 < length) {
                Map.Entry entry2 = entryArr[i2];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                wba.X(key2, value2);
                objArr3[i2] = key2;
                objArr4[i2] = value2;
                i2++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new Comparator() { // from class: com.google.android.gms.internal.fido.zzcg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    Objects.requireNonNull(entry3);
                    Objects.requireNonNull(entry4);
                    return bvnVar.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            wba.X(objArr3[0], value3);
            while (i < length) {
                Map.Entry entry4 = entryArr[i - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                wba.X(key4, value4);
                objArr3[i] = key4;
                objArr4[i] = value4;
                if (bvnVar.compare(key3, key4) == 0) {
                    a70.p(fc6.n("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                    return null;
                }
                i++;
                key3 = key4;
            }
        }
        return new zzcj(new c(zzcc.r(length, objArr3), bvnVar), zzcc.r(length, objArr4), null);
    }

    public static zzcj k(Comparator comparator) {
        if (bvn.a.equals(comparator)) {
            return g;
        }
        c x = zzck.x(comparator);
        kqn kqnVar = zzcc.b;
        return new zzcj(x, a.e, null);
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
        return this.c.d;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* renamed from: d */
    public final zzby values() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        c cVar = this.c;
        zzck zzckVar = cVar.e;
        if (zzckVar != null) {
            return zzckVar;
        }
        c t = cVar.t();
        cVar.e = t;
        t.e = cVar;
        return t;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        zzcj zzcjVar = this.e;
        if (zzcjVar == null) {
            boolean isEmpty = isEmpty();
            c cVar = this.c;
            if (isEmpty) {
                Comparator comparator = cVar.d;
                return k((comparator instanceof zzcs ? (zzcs) comparator : new wpn(comparator)).d());
            }
            zzck zzckVar = cVar.e;
            if (zzckVar == null) {
                zzckVar = cVar.t();
                cVar.e = zzckVar;
                zzckVar.e = cVar;
            }
            zzcjVar = new zzcj((c) zzckVar, this.d.p(), this);
        }
        return zzcjVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().r().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
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

    @Override // com.google.android.gms.internal.fido.zzcd
    public final zzcf g() {
        return isEmpty() ? b.j : new usn(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        int binarySearch;
        c cVar = this.c;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(cVar.f, obj, cVar.d);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.d.get(binarySearch);
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

    @Override // com.google.android.gms.internal.fido.zzcd
    /* renamed from: i */
    public final /* synthetic */ zzcf keySet() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final zzcj headMap(Object obj, boolean z) {
        obj.getClass();
        return o(0, this.c.z(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().r().get(this.d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
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
    public final zzcj subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        a70.p(zzbo.a("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    @Override // java.util.NavigableMap
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final zzcj tailMap(Object obj, boolean z) {
        obj.getClass();
        return o(this.c.A(obj, z), this.d.size());
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    public final zzcj o(int i, int i2) {
        zzcc zzccVar = this.d;
        if (i == 0) {
            if (i2 == zzccVar.size()) {
                return this;
            }
            i = 0;
        }
        c cVar = this.c;
        return i == i2 ? k(cVar.d) : new zzcj(cVar.B(i, i2), zzccVar.subList(i, i2), null);
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
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.d;
    }
}
