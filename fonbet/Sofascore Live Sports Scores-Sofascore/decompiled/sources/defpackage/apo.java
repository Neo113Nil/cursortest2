package defpackage;

import com.google.android.gms.internal.play_billing.zzgg;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class apo extends AbstractMap {
    public static final /* synthetic */ int g = 0;
    public Object[] a;
    public int b;
    public Map c;
    public boolean d;
    public volatile yg0 e;
    public Map f;

    public apo() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final Set a() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(zzgg zzggVar, Object obj) {
        h();
        int e = e(zzggVar);
        if (e >= 0) {
            return ((fpo) this.a[e]).setValue(obj);
        }
        h();
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[16];
            this.a = objArr;
        }
        int i = -(e + 1);
        if (i >= 16) {
            return g().put(zzggVar, obj);
        }
        if (this.b == 16) {
            fpo fpoVar = (fpo) objArr[15];
            this.b = 15;
            g().put(fpoVar.a, fpoVar.b);
        }
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.a[i] = new fpo(this, zzggVar, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
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
        zzgg zzggVar = (zzgg) obj;
        return e(zzggVar) >= 0 || this.c.containsKey(zzggVar);
    }

    public final fpo d(int i) {
        if (i < this.b) {
            return (fpo) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final int e(zzgg zzggVar) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = zzggVar.compareTo(((fpo) this.a[i2]).a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = zzggVar.compareTo(((fpo) this.a[i4]).a);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new yg0(this, 9);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apo)) {
            return super.equals(obj);
        }
        apo apoVar = (apo) obj;
        int size = size();
        if (size == apoVar.size()) {
            int i = this.b;
            if (i != apoVar.b) {
                return entrySet().equals(apoVar.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (d(i2).equals(apoVar.d(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(apoVar.c);
            }
            return true;
        }
        return false;
    }

    public final Object f(int i) {
        h();
        Object[] objArr = this.a;
        Object obj = ((fpo) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new fpo(this, (zzgg) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzgg zzggVar = (zzgg) obj;
        int e = e(zzggVar);
        return e >= 0 ? ((fpo) this.a[e]).b : this.c.get(zzggVar);
    }

    public final void h() {
        if (this.d) {
            a70.i();
        }
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
        h();
        zzgg zzggVar = (zzgg) obj;
        int e = e(zzggVar);
        if (e >= 0) {
            return f(e);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(zzggVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}
