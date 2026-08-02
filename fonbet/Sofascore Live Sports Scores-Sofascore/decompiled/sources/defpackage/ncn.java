package defpackage;

import java.util.AbstractMap;
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
public final class ncn extends AbstractMap {
    public static final /* synthetic */ int g = 0;
    public final int a;
    public List b = Collections.EMPTY_LIST;
    public Map c;
    public boolean d;
    public volatile yg0 e;
    public Map f;

    public ncn(int i) {
        this.a = i;
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int c = c(comparable);
        if (c >= 0) {
            return ((qcn) this.b.get(c)).setValue(obj);
        }
        f();
        boolean isEmpty = this.b.isEmpty();
        int i = this.a;
        if (isEmpty && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(i);
        }
        int i2 = -(c + 1);
        if (i2 >= i) {
            return e().put(comparable, obj);
        }
        if (this.b.size() == i) {
            qcn qcnVar = (qcn) this.b.remove(i - 1);
            e().put(qcnVar.a, qcnVar.b);
        }
        this.b.add(i2, new qcn(this, comparable, obj));
        return null;
    }

    public final int c(Comparable comparable) {
        int size = this.b.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int compareTo = comparable.compareTo(((qcn) this.b.get(i)).a);
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int compareTo2 = comparable.compareTo(((qcn) this.b.get(i3)).a);
            if (compareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
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
        return c(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object obj = ((qcn) this.b.remove(i)).b;
        if (!this.c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new qcn(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap e() {
        f();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new yg0(this, 3);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncn)) {
            return super.equals(obj);
        }
        ncn ncnVar = (ncn) obj;
        int size = size();
        if (size == ncnVar.size()) {
            int size2 = this.b.size();
            if (size2 != ncnVar.b.size()) {
                return entrySet().equals(ncnVar.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (((Map.Entry) this.b.get(i)).equals((Map.Entry) ncnVar.b.get(i))) {
                }
            }
            if (size2 != size) {
                return this.c.equals(ncnVar.c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.d) {
            a70.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int c = c(comparable);
        return c >= 0 ? ((qcn) this.b.get(c)).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((qcn) this.b.get(i2)).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int c = c(comparable);
        if (c >= 0) {
            return d(c);
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
