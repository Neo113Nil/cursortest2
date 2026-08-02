package com.logrocket.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 extends AbstractMap {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6729g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f6730a;

    /* renamed from: b, reason: collision with root package name */
    public List f6731b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public Map f6732c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6733d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.c1 f6734e;

    /* renamed from: f, reason: collision with root package name */
    public Map f6735f;

    public i1(int i5) {
        this.f6730a = i5;
        Map map = Collections.EMPTY_MAP;
        this.f6732c = map;
        this.f6735f = map;
    }

    public final int a(Comparable comparable) {
        int i5;
        int size = this.f6731b.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((m1) this.f6731b.get(i10)).f6750a);
            if (compareTo > 0) {
                i5 = size + 1;
                return -i5;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((m1) this.f6731b.get(i12)).f6750a);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        i5 = i11 + 1;
        return -i5;
    }

    public final void c() {
        if (this.f6733d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f6731b.isEmpty()) {
            this.f6731b.clear();
        }
        if (this.f6732c.isEmpty()) {
            return;
        }
        this.f6732c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f6732c.containsKey(comparable);
    }

    public final Map.Entry d(int i5) {
        return (Map.Entry) this.f6731b.get(i5);
    }

    public final Iterable e() {
        return this.f6732c.isEmpty() ? l1.f6748b : this.f6732c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6734e == null) {
            this.f6734e = new androidx.datastore.preferences.protobuf.c1(this, 2);
        }
        return this.f6734e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return super.equals(obj);
        }
        i1 i1Var = (i1) obj;
        int size = size();
        if (size == i1Var.size()) {
            int size2 = this.f6731b.size();
            if (size2 != i1Var.f6731b.size()) {
                return ((AbstractSet) entrySet()).equals(i1Var.entrySet());
            }
            for (int i5 = 0; i5 < size2; i5++) {
                if (d(i5).equals(i1Var.d(i5))) {
                }
            }
            if (size2 != size) {
                return this.f6732c.equals(i1Var.f6732c);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.f6732c.isEmpty() && !(this.f6732c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6732c = treeMap;
            this.f6735f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6732c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((m1) this.f6731b.get(a7)).setValue(obj);
        }
        c();
        boolean isEmpty = this.f6731b.isEmpty();
        int i5 = this.f6730a;
        if (isEmpty && !(this.f6731b instanceof ArrayList)) {
            this.f6731b = new ArrayList(i5);
        }
        int i10 = -(a7 + 1);
        if (i10 >= i5) {
            return f().put(comparable, obj);
        }
        if (this.f6731b.size() == i5) {
            m1 m1Var = (m1) this.f6731b.remove(i5 - 1);
            f().put(m1Var.f6750a, m1Var.f6751b);
        }
        this.f6731b.add(i10, new m1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        return a7 >= 0 ? ((m1) this.f6731b.get(a7)).f6751b : this.f6732c.get(comparable);
    }

    public final Object h(int i5) {
        c();
        Object obj = ((m1) this.f6731b.remove(i5)).f6751b;
        if (!this.f6732c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f6731b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new m1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f6731b.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += ((m1) this.f6731b.get(i10)).hashCode();
        }
        return this.f6732c.size() > 0 ? this.f6732c.hashCode() + i5 : i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return h(a7);
        }
        if (this.f6732c.isEmpty()) {
            return null;
        }
        return this.f6732c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6732c.size() + this.f6731b.size();
    }
}
