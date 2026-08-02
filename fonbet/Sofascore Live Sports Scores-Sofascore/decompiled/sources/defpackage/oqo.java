package defpackage;

import com.google.android.gms.internal.ads.zzifa;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oqo extends AbstractMap {
    public Object[] a;
    public int b;
    public Map c;
    public boolean d;
    public volatile yg0 e;
    public Map f;

    public oqo() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final pqo a(int i) {
        if (i < this.b) {
            return (pqo) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set c() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        zzifa zzifaVar = (zzifa) obj;
        return f(zzifaVar) >= 0 || this.c.containsKey(zzifaVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(zzifa zzifaVar, Object obj) {
        g();
        int f = f(zzifaVar);
        if (f >= 0) {
            return ((pqo) this.a[f]).setValue(obj);
        }
        g();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[16];
            this.a = objArr;
        }
        int i = -(f + 1);
        if (i >= 16) {
            return h().put(zzifaVar, obj);
        }
        if (this.b == 16) {
            pqo pqoVar = (pqo) objArr[15];
            this.b = 15;
            h().put(pqoVar.a, pqoVar.b);
        }
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.a[i] = new pqo(this, zzifaVar, obj);
        this.b++;
        return null;
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.a;
        Object obj = ((pqo) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new pqo(this, (zzifa) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new yg0(this, 10);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqo)) {
            return super.equals(obj);
        }
        oqo oqoVar = (oqo) obj;
        int size = size();
        if (size == oqoVar.size()) {
            int i = this.b;
            if (i != oqoVar.b) {
                return entrySet().equals(oqoVar.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (a(i2).equals(oqoVar.a(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(oqoVar.c);
            }
            return true;
        }
        return false;
    }

    public final int f(zzifa zzifaVar) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = zzifaVar.compareTo(((pqo) this.a[i2]).a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = zzifaVar.compareTo(((pqo) this.a[i4]).a);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final void g() {
        if (this.d) {
            a70.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzifa zzifaVar = (zzifa) obj;
        int f = f(zzifaVar);
        return f >= 0 ? ((pqo) this.a[f]).b : this.c.get(zzifaVar);
    }

    public final SortedMap h() {
        g();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.a[i3].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + i2 : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        zzifa zzifaVar = (zzifa) obj;
        int f = f(zzifaVar);
        if (f >= 0) {
            return e(f);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(zzifaVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}
