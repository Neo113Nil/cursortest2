package defpackage;

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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tlh extends AbstractMap {
    public static final /* synthetic */ int h = 0;
    public final int a;
    public List b = Collections.EMPTY_LIST;
    public Map c;
    public boolean d;
    public volatile yg0 e;
    public Map f;
    public volatile wlh g;

    public tlh(int i) {
        this.a = i;
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((zlh) this.b.get(i2)).a);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((zlh) this.b.get(i4)).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void c() {
        if (this.d) {
            a70.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Map.Entry d(int i) {
        return (Map.Entry) this.b.get(i);
    }

    public final Iterable e() {
        return this.c.isEmpty() ? t62.n : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new yg0(this, 1);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlh)) {
            return super.equals(obj);
        }
        tlh tlhVar = (tlh) obj;
        int size = size();
        if (size == tlhVar.size()) {
            int size2 = this.b.size();
            if (size2 != tlhVar.b.size()) {
                return ((AbstractSet) entrySet()).equals(tlhVar.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (d(i).equals(tlhVar.d(i))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(tlhVar.c);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int a = a(comparable);
        if (a >= 0) {
            return ((zlh) this.b.get(a)).setValue(obj);
        }
        c();
        boolean isEmpty = this.b.isEmpty();
        int i = this.a;
        if (isEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(i);
        }
        int i2 = -(a + 1);
        if (i2 >= i) {
            return f().put(comparable, obj);
        }
        if (this.b.size() == i) {
            zlh zlhVar = (zlh) this.b.remove(i - 1);
            f().put(zlhVar.a, zlhVar.b);
        }
        this.b.add(i2, new zlh(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((zlh) this.b.get(a)).b : this.c.get(comparable);
    }

    public final Object h(int i) {
        c();
        Object obj = ((zlh) this.b.remove(i)).b;
        if (!this.c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zlh(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((zlh) this.b.get(i2)).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
