package androidx.datastore.preferences.protobuf;

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
public final class z0 extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1732f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f1733a;

    /* renamed from: b, reason: collision with root package name */
    public Map f1734b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1735c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c1 f1736d;

    /* renamed from: e, reason: collision with root package name */
    public Map f1737e;

    public static z0 g() {
        z0 z0Var = new z0();
        z0Var.f1733a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        z0Var.f1734b = map;
        z0Var.f1737e = map;
        return z0Var;
    }

    public final int a(Comparable comparable) {
        int i5;
        int size = this.f1733a.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((a1) this.f1733a.get(i10)).f1574a);
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
            int compareTo2 = comparable.compareTo(((a1) this.f1733a.get(i12)).f1574a);
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
        if (this.f1735c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f1733a.isEmpty()) {
            this.f1733a.clear();
        }
        if (this.f1734b.isEmpty()) {
            return;
        }
        this.f1734b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1734b.containsKey(comparable);
    }

    public final Map.Entry d(int i5) {
        return (Map.Entry) this.f1733a.get(i5);
    }

    public final Set e() {
        return this.f1734b.isEmpty() ? Collections.EMPTY_SET : this.f1734b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1736d == null) {
            this.f1736d = new c1(this, 0);
        }
        return this.f1736d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        int size = size();
        if (size == z0Var.size()) {
            int size2 = this.f1733a.size();
            if (size2 != z0Var.f1733a.size()) {
                return ((AbstractSet) entrySet()).equals(z0Var.entrySet());
            }
            for (int i5 = 0; i5 < size2; i5++) {
                if (d(i5).equals(z0Var.d(i5))) {
                }
            }
            if (size2 != size) {
                return this.f1734b.equals(z0Var.f1734b);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.f1734b.isEmpty() && !(this.f1734b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1734b = treeMap;
            this.f1737e = treeMap.descendingMap();
        }
        return (SortedMap) this.f1734b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        return a7 >= 0 ? ((a1) this.f1733a.get(a7)).f1575b : this.f1734b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((a1) this.f1733a.get(a7)).setValue(obj);
        }
        c();
        if (this.f1733a.isEmpty() && !(this.f1733a instanceof ArrayList)) {
            this.f1733a = new ArrayList(16);
        }
        int i5 = -(a7 + 1);
        if (i5 >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f1733a.size() == 16) {
            a1 a1Var = (a1) this.f1733a.remove(15);
            f().put(a1Var.f1574a, a1Var.f1575b);
        }
        this.f1733a.add(i5, new a1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1733a.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i5 += ((a1) this.f1733a.get(i10)).hashCode();
        }
        return this.f1734b.size() > 0 ? this.f1734b.hashCode() + i5 : i5;
    }

    public final Object i(int i5) {
        c();
        Object obj = ((a1) this.f1733a.remove(i5)).f1575b;
        if (!this.f1734b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f1733a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new a1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return i(a7);
        }
        if (this.f1734b.isEmpty()) {
            return null;
        }
        return this.f1734b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1734b.size() + this.f1733a.size();
    }
}
