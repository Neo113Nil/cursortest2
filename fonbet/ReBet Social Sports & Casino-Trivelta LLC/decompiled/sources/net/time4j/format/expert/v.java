package net.time4j.format.expert;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public class v extends t {

    /* renamed from: h, reason: collision with root package name */
    public static final Set f58051h;

    /* renamed from: a, reason: collision with root package name */
    public Map f58052a;

    /* renamed from: b, reason: collision with root package name */
    public int f58053b;

    /* renamed from: c, reason: collision with root package name */
    public int f58054c;

    /* renamed from: d, reason: collision with root package name */
    public int f58055d;

    /* renamed from: e, reason: collision with root package name */
    public int f58056e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58057f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f58058g = -1;
    private int[] ints;
    private Object[] keys;
    private Object[] values;

    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f58059a;

        /* renamed from: b, reason: collision with root package name */
        public int f58060b;

        public b() {
            this.f58059a = v.this.f58053b;
            this.f58060b = v.this.f58056e;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p next() {
            Object obj;
            if (this.f58060b > 0) {
                Object[] objArr = v.this.keys;
                do {
                    int i10 = this.f58059a - 1;
                    this.f58059a = i10;
                    if (i10 >= 0) {
                        obj = objArr[i10];
                    }
                } while (obj == null);
                this.f58060b--;
                return (oi.p) oi.p.class.cast(obj);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f58060b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public class c extends AbstractSet {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.f58056e;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(net.time4j.F.f57536n);
        hashSet.add(net.time4j.F.f57540r);
        hashSet.add(net.time4j.F.f57541s);
        hashSet.add(net.time4j.G.f57590t);
        hashSet.add(net.time4j.G.f57592v);
        hashSet.add(net.time4j.G.f57594x);
        hashSet.add(net.time4j.G.f57562B);
        f58051h = Collections.unmodifiableSet(hashSet);
    }

    public v(int i10, boolean z10) {
        if (z10) {
            this.f58053b = Integer.MIN_VALUE;
            this.f58054c = Integer.MIN_VALUE;
            this.f58055d = Integer.MIN_VALUE;
            this.f58056e = Integer.MIN_VALUE;
            this.keys = null;
            this.values = null;
            this.ints = new int[3];
            for (int i11 = 0; i11 < 3; i11++) {
                this.ints[i11] = Integer.MIN_VALUE;
            }
        } else {
            int J10 = J(i10);
            this.f58053b = J10;
            this.f58054c = J10 - 1;
            this.f58055d = O(J10);
            int i12 = this.f58053b;
            this.keys = new Object[i12];
            this.values = null;
            this.ints = new int[i12];
            this.f58056e = 0;
        }
        this.f58052a = null;
    }

    public static int J(int i10) {
        return Math.max(2, Q((int) Math.ceil(i10 / 0.75f)));
    }

    public static oi.p K(int i10) {
        switch (i10) {
            case 0:
                return net.time4j.F.f57536n;
            case 1:
                return net.time4j.F.f57540r;
            case 2:
                return net.time4j.F.f57541s;
            case 3:
                return net.time4j.G.f57590t;
            case 4:
                return net.time4j.G.f57592v;
            case 5:
                return net.time4j.G.f57594x;
            case 6:
                return net.time4j.G.f57562B;
            default:
                throw new IllegalStateException("No element index: " + i10);
        }
    }

    public static boolean N(oi.p pVar) {
        return f58051h.contains(pVar);
    }

    public static int O(int i10) {
        return Math.min((int) Math.ceil(i10 * 0.75f), i10 - 1);
    }

    public static int P(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    public static int Q(int i10) {
        if (i10 == 0) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = i11 | (i11 >> 1);
        int i13 = i12 | (i12 >> 2);
        int i14 = i13 | (i13 >> 4);
        int i15 = i14 | (i14 >> 8);
        return (i15 | (i15 >> 16)) + 1;
    }

    @Override // net.time4j.format.expert.t
    public Object A() {
        return null;
    }

    @Override // net.time4j.format.expert.t
    public void B(oi.p pVar, int i10) {
        Object obj;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Object[] objArr = this.keys;
        if (objArr != null) {
            int P10 = P(pVar.hashCode()) & this.f58054c;
            Object obj2 = objArr[P10];
            if (obj2 != null) {
                if (obj2.equals(pVar)) {
                    if (!this.f58057f && this.ints[P10] != i10) {
                        throw new C5707a(pVar);
                    }
                    this.ints[P10] = i10;
                    return;
                }
                do {
                    P10 = (P10 + 1) & this.f58054c;
                    obj = objArr[P10];
                    if (obj != null) {
                    }
                } while (!obj.equals(pVar));
                if (!this.f58057f && this.ints[P10] != i10) {
                    throw new C5707a(pVar);
                }
                this.ints[P10] = i10;
                return;
            }
            objArr[P10] = pVar;
            this.ints[P10] = i10;
            int i18 = this.f58056e;
            int i19 = i18 + 1;
            this.f58056e = i19;
            if (i18 >= this.f58055d) {
                S(J(i19));
                return;
            }
            return;
        }
        if (pVar == net.time4j.F.f57536n) {
            if (!this.f58057f && (i17 = this.ints[0]) != Integer.MIN_VALUE && i17 != i10) {
                throw new C5707a(pVar);
            }
            this.ints[0] = i10;
            return;
        }
        if (pVar == net.time4j.F.f57540r) {
            if (!this.f58057f && (i16 = this.ints[1]) != Integer.MIN_VALUE && i16 != i10) {
                throw new C5707a(pVar);
            }
            this.ints[1] = i10;
            return;
        }
        if (pVar == net.time4j.F.f57541s) {
            if (!this.f58057f && (i15 = this.ints[2]) != Integer.MIN_VALUE && i15 != i10) {
                throw new C5707a(pVar);
            }
            this.ints[2] = i10;
            return;
        }
        if (pVar == net.time4j.G.f57590t) {
            if (!this.f58057f && (i14 = this.f58053b) != Integer.MIN_VALUE && i14 != i10) {
                throw new C5707a(pVar);
            }
            this.f58053b = i10;
            return;
        }
        if (pVar == net.time4j.G.f57592v) {
            if (!this.f58057f && (i13 = this.f58054c) != Integer.MIN_VALUE && i13 != i10) {
                throw new C5707a(pVar);
            }
            this.f58054c = i10;
            return;
        }
        if (pVar == net.time4j.G.f57594x) {
            if (!this.f58057f && (i12 = this.f58055d) != Integer.MIN_VALUE && i12 != i10) {
                throw new C5707a(pVar);
            }
            this.f58055d = i10;
            return;
        }
        if (pVar == net.time4j.G.f57562B) {
            if (!this.f58057f && (i11 = this.f58056e) != Integer.MIN_VALUE && i11 != i10) {
                throw new C5707a(pVar);
            }
            this.f58056e = i10;
            return;
        }
        Map map = this.f58052a;
        if (map == null) {
            map = new HashMap();
            this.f58052a = map;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (!this.f58057f && map.containsKey(pVar) && !valueOf.equals(map.get(pVar))) {
            throw new C5707a(pVar);
        }
        map.put(pVar, valueOf);
    }

    @Override // net.time4j.format.expert.t
    public void C(oi.p pVar, Object obj) {
        Object obj2;
        if (obj == null) {
            T(pVar);
            return;
        }
        if (pVar.getType() == Integer.class) {
            B(pVar, ((Integer) Integer.class.cast(obj)).intValue());
            return;
        }
        Object[] objArr = this.keys;
        if (objArr == null) {
            Map map = this.f58052a;
            if (map == null) {
                map = new HashMap();
                this.f58052a = map;
            }
            if (!this.f58057f && map.containsKey(pVar) && !obj.equals(map.get(pVar))) {
                throw new C5707a(pVar);
            }
            map.put(pVar, obj);
            return;
        }
        if (this.values == null) {
            this.values = new Object[this.f58053b];
        }
        int P10 = P(pVar.hashCode()) & this.f58054c;
        Object obj3 = objArr[P10];
        if (obj3 != null) {
            if (obj3.equals(pVar)) {
                if (!this.f58057f && !obj.equals(this.values[P10])) {
                    throw new C5707a(pVar);
                }
                this.values[P10] = obj;
                return;
            }
            do {
                P10 = (P10 + 1) & this.f58054c;
                obj2 = objArr[P10];
                if (obj2 != null) {
                }
            } while (!obj2.equals(pVar));
            if (!this.f58057f && !obj.equals(this.values[P10])) {
                throw new C5707a(pVar);
            }
            this.values[P10] = obj;
            return;
        }
        objArr[P10] = pVar;
        this.values[P10] = obj;
        int i10 = this.f58056e;
        int i11 = i10 + 1;
        this.f58056e = i11;
        if (i10 >= this.f58055d) {
            S(J(i11));
        }
    }

    @Override // net.time4j.format.expert.t
    public void D(Object obj) {
    }

    public final int L(oi.p pVar) {
        Object obj;
        Object[] objArr = this.keys;
        if (objArr != null) {
            int P10 = P(pVar.hashCode()) & this.f58054c;
            Object obj2 = objArr[P10];
            if (obj2 == null) {
                return Integer.MIN_VALUE;
            }
            if (pVar.equals(obj2)) {
                return this.ints[P10];
            }
            do {
                P10 = (P10 + 1) & this.f58054c;
                obj = objArr[P10];
                if (obj == null) {
                    return Integer.MIN_VALUE;
                }
            } while (!pVar.equals(obj));
            return this.ints[P10];
        }
        if (pVar == net.time4j.F.f57536n) {
            return this.ints[0];
        }
        if (pVar == net.time4j.F.f57540r) {
            return this.ints[1];
        }
        if (pVar == net.time4j.F.f57541s) {
            return this.ints[2];
        }
        if (pVar == net.time4j.G.f57590t) {
            return this.f58053b;
        }
        if (pVar == net.time4j.G.f57592v) {
            return this.f58054c;
        }
        if (pVar == net.time4j.G.f57594x) {
            return this.f58055d;
        }
        if (pVar == net.time4j.G.f57562B) {
            return this.f58056e;
        }
        Map map = this.f58052a;
        if (map == null || !map.containsKey(pVar)) {
            return Integer.MIN_VALUE;
        }
        return ((Integer) Integer.class.cast(map.get(pVar))).intValue();
    }

    public int M() {
        return this.f58058g;
    }

    public void R(v vVar) {
        int i10 = 0;
        if (this.keys != null) {
            Object[] objArr = vVar.keys;
            while (i10 < objArr.length) {
                Object obj = objArr[i10];
                if (obj != null) {
                    oi.p pVar = (oi.p) oi.p.class.cast(obj);
                    if (pVar.getType() == Integer.class) {
                        B(pVar, vVar.ints[i10]);
                    } else {
                        C(pVar, vVar.values[i10]);
                    }
                }
                i10++;
            }
            return;
        }
        int i11 = vVar.f58053b;
        if (i11 != Integer.MIN_VALUE) {
            int i12 = this.f58053b;
            if (i12 != Integer.MIN_VALUE && !this.f58057f && i12 != i11) {
                throw new C5707a(net.time4j.G.f57590t);
            }
            this.f58053b = i11;
        }
        int i13 = vVar.f58054c;
        if (i13 != Integer.MIN_VALUE) {
            int i14 = this.f58054c;
            if (i14 != Integer.MIN_VALUE && !this.f58057f && i14 != i13) {
                throw new C5707a(net.time4j.G.f57592v);
            }
            this.f58054c = i13;
        }
        int i15 = vVar.f58055d;
        if (i15 != Integer.MIN_VALUE) {
            int i16 = this.f58055d;
            if (i16 != Integer.MIN_VALUE && !this.f58057f && i16 != i15) {
                throw new C5707a(net.time4j.G.f57594x);
            }
            this.f58055d = i15;
        }
        int i17 = vVar.f58056e;
        if (i17 != Integer.MIN_VALUE) {
            int i18 = this.f58056e;
            if (i18 != Integer.MIN_VALUE && !this.f58057f && i18 != i17) {
                throw new C5707a(net.time4j.G.f57562B);
            }
            this.f58056e = i17;
        }
        while (i10 < 3) {
            int i19 = vVar.ints[i10];
            if (i19 != Integer.MIN_VALUE) {
                int[] iArr = this.ints;
                int i20 = iArr[i10];
                if (i20 != Integer.MIN_VALUE && !this.f58057f && i20 != i19) {
                    throw new C5707a(K(i10));
                }
                iArr[i10] = i19;
            }
            i10++;
        }
        Map map = vVar.f58052a;
        if (map != null) {
            for (oi.p pVar2 : map.keySet()) {
                C(pVar2, map.get(pVar2));
            }
        }
    }

    public final void S(int i10) {
        Object obj;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int[] iArr = this.ints;
        int i11 = i10 - 1;
        Object[] objArr3 = new Object[i10];
        Object[] objArr4 = objArr2 == null ? null : new Object[i10];
        int[] iArr2 = new int[i10];
        int i12 = this.f58053b;
        int i13 = this.f58056e;
        for (int i14 = 0; i14 < i13; i14++) {
            do {
                i12--;
                obj = objArr[i12];
            } while (obj == null);
            int P10 = P(obj.hashCode()) & i11;
            if (objArr3[P10] != null) {
                do {
                    P10 = (P10 + 1) & i11;
                } while (objArr3[P10] != null);
            }
            objArr3[P10] = objArr[i12];
            if (objArr2 != null) {
                objArr4[P10] = objArr2[i12];
            }
            iArr2[P10] = iArr[i12];
        }
        this.f58053b = i10;
        this.f58054c = i11;
        this.f58055d = O(i10);
        this.keys = objArr3;
        this.values = objArr4;
        this.ints = iArr2;
    }

    public final void T(Object obj) {
        Object obj2;
        Object[] objArr = this.keys;
        if (objArr != null) {
            int P10 = P(obj.hashCode()) & this.f58054c;
            Object obj3 = objArr[P10];
            if (obj3 == null) {
                return;
            }
            if (obj.equals(obj3)) {
                U(P10);
                return;
            }
            do {
                P10 = (P10 + 1) & this.f58054c;
                obj2 = objArr[P10];
                if (obj2 == null) {
                    return;
                }
            } while (!obj.equals(obj2));
            U(P10);
            return;
        }
        if (obj == net.time4j.F.f57536n) {
            this.ints[0] = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.F.f57540r) {
            this.ints[1] = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.F.f57541s) {
            this.ints[2] = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.G.f57590t) {
            this.f58053b = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.G.f57592v) {
            this.f58054c = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.G.f57594x) {
            this.f58055d = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.G.f57562B) {
            this.f58056e = Integer.MIN_VALUE;
            return;
        }
        Map map = this.f58052a;
        if (map != null) {
            map.remove(obj);
        }
    }

    public final void U(int i10) {
        Object obj;
        this.f58056e--;
        Object[] objArr = this.keys;
        while (true) {
            int i11 = (i10 + 1) & this.f58054c;
            while (true) {
                obj = objArr[i11];
                if (obj == null) {
                    objArr[i10] = null;
                    return;
                }
                int P10 = P(obj.hashCode());
                int i12 = this.f58054c;
                int i13 = P10 & i12;
                if (i10 > i11) {
                    if (i10 >= i13 && i13 > i11) {
                        break;
                    }
                    i11 = (i11 + 1) & i12;
                } else if (i10 >= i13 || i13 > i11) {
                    break;
                } else {
                    i11 = (i11 + 1) & i12;
                }
            }
            objArr[i10] = obj;
            Object[] objArr2 = this.values;
            if (objArr2 != null) {
                objArr2[i10] = objArr2[i11];
            }
            int[] iArr = this.ints;
            iArr[i10] = iArr[i11];
            i10 = i11;
        }
    }

    public void V() {
        Object[] objArr = this.keys;
        if (objArr == null) {
            this.f58053b = Integer.MIN_VALUE;
            this.f58054c = Integer.MIN_VALUE;
            this.f58055d = Integer.MIN_VALUE;
            this.f58056e = Integer.MIN_VALUE;
            for (int i10 = 0; i10 < 3; i10++) {
                this.ints[i10] = Integer.MIN_VALUE;
            }
            this.f58052a = null;
        } else {
            this.keys = new Object[objArr.length];
        }
        this.f58056e = 0;
    }

    public void W() {
        this.f58057f = true;
    }

    public void X(int i10) {
        this.f58058g = i10;
    }

    @Override // oi.q, oi.o
    public int e(oi.p pVar) {
        return L(pVar);
    }

    @Override // oi.q, oi.o
    public boolean f(oi.p pVar) {
        Object obj;
        if (pVar == null) {
            return false;
        }
        Object[] objArr = this.keys;
        if (objArr != null) {
            int P10 = P(pVar.hashCode()) & this.f58054c;
            Object obj2 = objArr[P10];
            if (obj2 == null) {
                return false;
            }
            if (pVar.equals(obj2)) {
                return true;
            }
            do {
                P10 = (P10 + 1) & this.f58054c;
                obj = objArr[P10];
                if (obj == null) {
                    return false;
                }
            } while (!pVar.equals(obj));
            return true;
        }
        if (pVar == net.time4j.F.f57536n) {
            return this.ints[0] != Integer.MIN_VALUE;
        }
        if (pVar == net.time4j.F.f57540r) {
            return this.ints[1] != Integer.MIN_VALUE;
        }
        if (pVar == net.time4j.F.f57541s) {
            return this.ints[2] != Integer.MIN_VALUE;
        }
        if (pVar == net.time4j.G.f57590t) {
            return this.f58053b != Integer.MIN_VALUE;
        }
        if (pVar == net.time4j.G.f57592v) {
            return this.f58054c != Integer.MIN_VALUE;
        }
        if (pVar == net.time4j.G.f57594x) {
            return this.f58055d != Integer.MIN_VALUE;
        }
        if (pVar == net.time4j.G.f57562B) {
            return this.f58056e != Integer.MIN_VALUE;
        }
        Map map = this.f58052a;
        return map != null && map.containsKey(pVar);
    }

    @Override // oi.q, oi.o
    public Object j(oi.p pVar) {
        int P10;
        Object obj;
        Object obj2;
        Class type = pVar.getType();
        if (type == Integer.class) {
            int L10 = L(pVar);
            if (L10 != Integer.MIN_VALUE) {
                return type.cast(Integer.valueOf(L10));
            }
            throw new oi.r("No value found for: " + pVar.name());
        }
        Object[] objArr = this.keys;
        if (objArr == null) {
            Map map = this.f58052a;
            if (map != null && map.containsKey(pVar)) {
                return pVar.getType().cast(map.get(pVar));
            }
            throw new oi.r("No value found for: " + pVar.name());
        }
        if (this.values == null || (obj = objArr[(P10 = P(pVar.hashCode()) & this.f58054c)]) == null) {
            throw new oi.r("No value found for: " + pVar.name());
        }
        if (pVar.equals(obj)) {
            return type.cast(this.values[P10]);
        }
        do {
            P10 = (P10 + 1) & this.f58054c;
            obj2 = objArr[P10];
            if (obj2 == null) {
                throw new oi.r("No value found for: " + pVar.name());
            }
        } while (!pVar.equals(obj2));
        return type.cast(this.values[P10]);
    }

    @Override // oi.q
    public Set u() {
        if (this.keys != null) {
            return new c();
        }
        HashSet hashSet = new HashSet();
        if (this.ints[0] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.F.f57536n);
        }
        if (this.ints[1] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.F.f57540r);
        }
        if (this.ints[2] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.F.f57541s);
        }
        if (this.f58053b != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.G.f57590t);
        }
        if (this.f58054c != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.G.f57592v);
        }
        if (this.f58055d != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.G.f57594x);
        }
        if (this.f58056e != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.G.f57562B);
        }
        Map map = this.f58052a;
        if (map != null) {
            hashSet.addAll(map.keySet());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
