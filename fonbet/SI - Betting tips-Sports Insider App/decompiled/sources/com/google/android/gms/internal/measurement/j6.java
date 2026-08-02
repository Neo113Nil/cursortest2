package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j6 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5098a;

    /* renamed from: b, reason: collision with root package name */
    public int f5099b;

    /* renamed from: c, reason: collision with root package name */
    public Map f5100c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5101d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.c1 f5102e;

    /* renamed from: f, reason: collision with root package name */
    public Map f5103f;

    public j6() {
        Map map = Collections.EMPTY_MAP;
        this.f5100c = map;
        this.f5103f = map;
    }

    public final k6 a(int i5) {
        if (i5 < this.f5099b) {
            return (k6) this.f5098a[i5];
        }
        throw new ArrayIndexOutOfBoundsException(i5);
    }

    public final Set c() {
        return this.f5100c.isEmpty() ? Collections.EMPTY_SET : this.f5100c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f5099b != 0) {
            this.f5098a = null;
            this.f5099b = 0;
        }
        if (this.f5100c.isEmpty()) {
            return;
        }
        this.f5100c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f5100c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int f6 = f(comparable);
        if (f6 >= 0) {
            return ((k6) this.f5098a[f6]).setValue(obj);
        }
        g();
        if (this.f5098a == null) {
            this.f5098a = new Object[16];
        }
        int i5 = -(f6 + 1);
        if (i5 >= 16) {
            return h().put(comparable, obj);
        }
        if (this.f5099b == 16) {
            k6 k6Var = (k6) this.f5098a[15];
            this.f5099b = 15;
            h().put(k6Var.f5110a, k6Var.f5111b);
        }
        Object[] objArr = this.f5098a;
        int length = objArr.length;
        System.arraycopy(objArr, i5, objArr, i5 + 1, 15 - i5);
        this.f5098a[i5] = new k6(this, comparable, obj);
        this.f5099b++;
        return null;
    }

    public final Object e(int i5) {
        g();
        Object[] objArr = this.f5098a;
        Object obj = ((k6) objArr[i5]).f5111b;
        System.arraycopy(objArr, i5 + 1, objArr, i5, (this.f5099b - i5) - 1);
        this.f5099b--;
        if (!this.f5100c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.f5098a;
            int i10 = this.f5099b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new k6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f5099b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5102e == null) {
            this.f5102e = new androidx.datastore.preferences.protobuf.c1(this, 1);
        }
        return this.f5102e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return super.equals(obj);
        }
        j6 j6Var = (j6) obj;
        int size = size();
        if (size == j6Var.size()) {
            int i5 = this.f5099b;
            if (i5 != j6Var.f5099b) {
                return entrySet().equals(j6Var.entrySet());
            }
            for (int i10 = 0; i10 < i5; i10++) {
                if (a(i10).equals(j6Var.a(i10))) {
                }
            }
            if (i5 != size) {
                return this.f5100c.equals(j6Var.f5100c);
            }
            return true;
        }
        return false;
    }

    public final int f(Comparable comparable) {
        int i5 = this.f5099b;
        int i10 = i5 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((k6) this.f5098a[i10]).f5110a);
            if (compareTo > 0) {
                return -(i5 + 1);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((k6) this.f5098a[i12]).f5110a);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    public final void g() {
        if (this.f5101d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f6 = f(comparable);
        return f6 >= 0 ? ((k6) this.f5098a[f6]).f5111b : this.f5100c.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.f5100c.isEmpty() && !(this.f5100c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5100c = treeMap;
            this.f5103f = treeMap.descendingMap();
        }
        return (SortedMap) this.f5100c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i5 = this.f5099b;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            i10 += this.f5098a[i11].hashCode();
        }
        return this.f5100c.size() > 0 ? this.f5100c.hashCode() + i10 : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f6 = f(comparable);
        if (f6 >= 0) {
            return e(f6);
        }
        if (this.f5100c.isEmpty()) {
            return null;
        }
        return this.f5100c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5100c.size() + this.f5099b;
    }
}
