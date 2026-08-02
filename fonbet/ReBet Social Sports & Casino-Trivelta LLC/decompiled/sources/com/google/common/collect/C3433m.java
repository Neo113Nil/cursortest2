package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.common.collect.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3433m extends AbstractMap implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f36833g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f36834a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f36835b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f36836c;

    /* renamed from: d, reason: collision with root package name */
    public transient Set f36837d;

    /* renamed from: e, reason: collision with root package name */
    public transient Set f36838e;
    transient int[] entries;

    /* renamed from: f, reason: collision with root package name */
    public transient Collection f36839f;
    transient Object[] keys;
    transient Object[] values;

    /* renamed from: com.google.common.collect.m$a */
    public class a extends e {
        public a() {
            super(C3433m.this, null);
        }

        @Override // com.google.common.collect.C3433m.e
        public Object b(int i10) {
            return C3433m.this.H(i10);
        }
    }

    /* renamed from: com.google.common.collect.m$b */
    public class b extends e {
        public b() {
            super(C3433m.this, null);
        }

        @Override // com.google.common.collect.C3433m.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i10) {
            return C3433m.this.new g(i10);
        }
    }

    /* renamed from: com.google.common.collect.m$c */
    public class c extends e {
        public c() {
            super(C3433m.this, null);
        }

        @Override // com.google.common.collect.C3433m.e
        public Object b(int i10) {
            return C3433m.this.X(i10);
        }
    }

    /* renamed from: com.google.common.collect.m$d */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3433m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map x10 = C3433m.this.x();
            if (x10 != null) {
                return x10.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int E10 = C3433m.this.E(entry.getKey());
                if (E10 != -1 && Ra.j.a(C3433m.this.X(E10), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C3433m.this.z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int C10;
            int f10;
            Map x10 = C3433m.this.x();
            if (x10 != null) {
                return x10.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C3433m.this.K() || (f10 = AbstractC3434n.f(entry.getKey(), entry.getValue(), (C10 = C3433m.this.C()), C3433m.this.O(), C3433m.this.M(), C3433m.this.N(), C3433m.this.P())) == -1) {
                return false;
            }
            C3433m.this.J(f10, C10);
            C3433m.e(C3433m.this);
            C3433m.this.D();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3433m.this.size();
        }
    }

    /* renamed from: com.google.common.collect.m$f */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3433m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C3433m.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C3433m.this.I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map x10 = C3433m.this.x();
            return x10 != null ? x10.keySet().remove(obj) : C3433m.this.L(obj) != C3433m.f36833g;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3433m.this.size();
        }
    }

    /* renamed from: com.google.common.collect.m$g */
    public final class g extends AbstractC3425e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f36849a;

        /* renamed from: b, reason: collision with root package name */
        public int f36850b;

        public g(int i10) {
            this.f36849a = C3433m.this.H(i10);
            this.f36850b = i10;
        }

        public final void a() {
            int i10 = this.f36850b;
            if (i10 == -1 || i10 >= C3433m.this.size() || !Ra.j.a(this.f36849a, C3433m.this.H(this.f36850b))) {
                this.f36850b = C3433m.this.E(this.f36849a);
            }
        }

        @Override // com.google.common.collect.AbstractC3425e, java.util.Map.Entry
        public Object getKey() {
            return this.f36849a;
        }

        @Override // com.google.common.collect.AbstractC3425e, java.util.Map.Entry
        public Object getValue() {
            Map x10 = C3433m.this.x();
            if (x10 != null) {
                return U.a(x10.get(this.f36849a));
            }
            a();
            int i10 = this.f36850b;
            return i10 == -1 ? U.b() : C3433m.this.X(i10);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map x10 = C3433m.this.x();
            if (x10 != null) {
                return U.a(x10.put(this.f36849a, obj));
            }
            a();
            int i10 = this.f36850b;
            if (i10 == -1) {
                C3433m.this.put(this.f36849a, obj);
                return U.b();
            }
            Object X10 = C3433m.this.X(i10);
            C3433m.this.W(this.f36850b, obj);
            return X10;
        }
    }

    /* renamed from: com.google.common.collect.m$h */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C3433m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C3433m.this.Y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C3433m.this.size();
        }
    }

    public C3433m() {
        F(3);
    }

    public static /* synthetic */ int e(C3433m c3433m) {
        int i10 = c3433m.f36836c;
        c3433m.f36836c = i10 - 1;
        return i10;
    }

    public static C3433m r() {
        return new C3433m();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        F(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static C3433m w(int i10) {
        return new C3433m(i10);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator z10 = z();
        while (z10.hasNext()) {
            Map.Entry entry = (Map.Entry) z10.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public int A() {
        return isEmpty() ? -1 : 0;
    }

    public int B(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f36836c) {
            return i11;
        }
        return -1;
    }

    public final int C() {
        return (1 << (this.f36835b & 31)) - 1;
    }

    public void D() {
        this.f36835b += 32;
    }

    public final int E(Object obj) {
        if (K()) {
            return -1;
        }
        int c10 = AbstractC3441v.c(obj);
        int C10 = C();
        int h10 = AbstractC3434n.h(O(), c10 & C10);
        if (h10 == 0) {
            return -1;
        }
        int b10 = AbstractC3434n.b(c10, C10);
        do {
            int i10 = h10 - 1;
            int y10 = y(i10);
            if (AbstractC3434n.b(y10, C10) == b10 && Ra.j.a(obj, H(i10))) {
                return i10;
            }
            h10 = AbstractC3434n.c(y10, C10);
        } while (h10 != 0);
        return -1;
    }

    public void F(int i10) {
        Ra.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f36835b = com.google.common.primitives.f.g(i10, 1, 1073741823);
    }

    public void G(int i10, Object obj, Object obj2, int i11, int i12) {
        T(i10, AbstractC3434n.d(i11, 0, i12));
        V(i10, obj);
        W(i10, obj2);
    }

    public final Object H(int i10) {
        return N()[i10];
    }

    public Iterator I() {
        Map x10 = x();
        return x10 != null ? x10.keySet().iterator() : new a();
    }

    public void J(int i10, int i11) {
        Object O10 = O();
        int[] M10 = M();
        Object[] N10 = N();
        Object[] P10 = P();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            N10[i10] = null;
            P10[i10] = null;
            M10[i10] = 0;
            return;
        }
        Object obj = N10[i12];
        N10[i10] = obj;
        P10[i10] = P10[i12];
        N10[i12] = null;
        P10[i12] = null;
        M10[i10] = M10[i12];
        M10[i12] = 0;
        int c10 = AbstractC3441v.c(obj) & i11;
        int h10 = AbstractC3434n.h(O10, c10);
        if (h10 == size) {
            AbstractC3434n.i(O10, c10, i10 + 1);
            return;
        }
        while (true) {
            int i13 = h10 - 1;
            int i14 = M10[i13];
            int c11 = AbstractC3434n.c(i14, i11);
            if (c11 == size) {
                M10[i13] = AbstractC3434n.d(i14, i10 + 1, i11);
                return;
            }
            h10 = c11;
        }
    }

    public boolean K() {
        return this.f36834a == null;
    }

    public final Object L(Object obj) {
        if (K()) {
            return f36833g;
        }
        int C10 = C();
        int f10 = AbstractC3434n.f(obj, null, C10, O(), M(), N(), null);
        if (f10 == -1) {
            return f36833g;
        }
        Object X10 = X(f10);
        J(f10, C10);
        this.f36836c--;
        D();
        return X10;
    }

    public final int[] M() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] N() {
        Object[] objArr = this.keys;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object O() {
        Object obj = this.f36834a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] P() {
        Object[] objArr = this.values;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void Q(int i10) {
        this.entries = Arrays.copyOf(M(), i10);
        this.keys = Arrays.copyOf(N(), i10);
        this.values = Arrays.copyOf(P(), i10);
    }

    public final void R(int i10) {
        int min;
        int length = M().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Q(min);
    }

    public final int S(int i10, int i11, int i12, int i13) {
        Object a10 = AbstractC3434n.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC3434n.i(a10, i12 & i14, i13 + 1);
        }
        Object O10 = O();
        int[] M10 = M();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = AbstractC3434n.h(O10, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = M10[i16];
                int b10 = AbstractC3434n.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = AbstractC3434n.h(a10, i18);
                AbstractC3434n.i(a10, i18, h10);
                M10[i16] = AbstractC3434n.d(b10, h11, i14);
                h10 = AbstractC3434n.c(i17, i10);
            }
        }
        this.f36834a = a10;
        U(i14);
        return i14;
    }

    public final void T(int i10, int i11) {
        M()[i10] = i11;
    }

    public final void U(int i10) {
        this.f36835b = AbstractC3434n.d(this.f36835b, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public final void V(int i10, Object obj) {
        N()[i10] = obj;
    }

    public final void W(int i10, Object obj) {
        P()[i10] = obj;
    }

    public final Object X(int i10) {
        return P()[i10];
    }

    public Iterator Y() {
        Map x10 = x();
        return x10 != null ? x10.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (K()) {
            return;
        }
        D();
        Map x10 = x();
        if (x10 != null) {
            this.f36835b = com.google.common.primitives.f.g(size(), 3, 1073741823);
            x10.clear();
            this.f36834a = null;
            this.f36836c = 0;
            return;
        }
        Arrays.fill(N(), 0, this.f36836c, (Object) null);
        Arrays.fill(P(), 0, this.f36836c, (Object) null);
        AbstractC3434n.g(O());
        Arrays.fill(M(), 0, this.f36836c, 0);
        this.f36836c = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map x10 = x();
        return x10 != null ? x10.containsKey(obj) : E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map x10 = x();
        if (x10 != null) {
            return x10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f36836c; i10++) {
            if (Ra.j.a(obj, X(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f36838e;
        if (set != null) {
            return set;
        }
        Set s10 = s();
        this.f36838e = s10;
        return s10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map x10 = x();
        if (x10 != null) {
            return x10.get(obj);
        }
        int E10 = E(obj);
        if (E10 == -1) {
            return null;
        }
        n(E10);
        return X(E10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f36837d;
        if (set != null) {
            return set;
        }
        Set u10 = u();
        this.f36837d = u10;
        return u10;
    }

    public void n(int i10) {
    }

    public int o(int i10, int i11) {
        return i10 - 1;
    }

    public int p() {
        Ra.n.q(K(), "Arrays already allocated");
        int i10 = this.f36835b;
        int j10 = AbstractC3434n.j(i10);
        this.f36834a = AbstractC3434n.a(j10);
        U(j10 - 1);
        this.entries = new int[i10];
        this.keys = new Object[i10];
        this.values = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (K()) {
            p();
        }
        Map x10 = x();
        if (x10 != null) {
            return x10.put(obj, obj2);
        }
        int[] M10 = M();
        Object[] N10 = N();
        Object[] P10 = P();
        int i10 = this.f36836c;
        int i11 = i10 + 1;
        int c10 = AbstractC3441v.c(obj);
        int C10 = C();
        int i12 = c10 & C10;
        int h10 = AbstractC3434n.h(O(), i12);
        if (h10 != 0) {
            int b10 = AbstractC3434n.b(c10, C10);
            int i13 = 0;
            while (true) {
                int i14 = h10 - 1;
                int i15 = M10[i14];
                if (AbstractC3434n.b(i15, C10) == b10 && Ra.j.a(obj, N10[i14])) {
                    Object obj3 = P10[i14];
                    P10[i14] = obj2;
                    n(i14);
                    return obj3;
                }
                int c11 = AbstractC3434n.c(i15, C10);
                i13++;
                if (c11 != 0) {
                    obj = obj;
                    obj2 = obj2;
                    h10 = c11;
                } else {
                    if (i13 >= 9) {
                        return q().put(obj, obj2);
                    }
                    if (i11 > C10) {
                        C10 = S(C10, AbstractC3434n.e(C10), c10, i10);
                    } else {
                        M10[i14] = AbstractC3434n.d(i15, i11, C10);
                    }
                }
            }
        } else if (i11 > C10) {
            C10 = S(C10, AbstractC3434n.e(C10), c10, i10);
        } else {
            AbstractC3434n.i(O(), i12, i11);
        }
        int i16 = C10;
        R(i11);
        G(i10, obj, obj2, c10, i16);
        this.f36836c = i11;
        D();
        return null;
    }

    public Map q() {
        Map t10 = t(C() + 1);
        int A10 = A();
        while (A10 >= 0) {
            t10.put(H(A10), X(A10));
            A10 = B(A10);
        }
        this.f36834a = t10;
        this.entries = null;
        this.keys = null;
        this.values = null;
        D();
        return t10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map x10 = x();
        if (x10 != null) {
            return x10.remove(obj);
        }
        Object L10 = L(obj);
        if (L10 == f36833g) {
            return null;
        }
        return L10;
    }

    public Set s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map x10 = x();
        return x10 != null ? x10.size() : this.f36836c;
    }

    public Map t(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    public Set u() {
        return new f();
    }

    public Collection v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f36839f;
        if (collection != null) {
            return collection;
        }
        Collection v10 = v();
        this.f36839f = v10;
        return v10;
    }

    public Map x() {
        Object obj = this.f36834a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int y(int i10) {
        return M()[i10];
    }

    public Iterator z() {
        Map x10 = x();
        return x10 != null ? x10.entrySet().iterator() : new b();
    }

    public C3433m(int i10) {
        F(i10);
    }

    /* renamed from: com.google.common.collect.m$e */
    public abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f36844a;

        /* renamed from: b, reason: collision with root package name */
        public int f36845b;

        /* renamed from: c, reason: collision with root package name */
        public int f36846c;

        public e() {
            this.f36844a = C3433m.this.f36835b;
            this.f36845b = C3433m.this.A();
            this.f36846c = -1;
        }

        public final void a() {
            if (C3433m.this.f36835b != this.f36844a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object b(int i10);

        public void c() {
            this.f36844a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36845b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f36845b;
            this.f36846c = i10;
            Object b10 = b(i10);
            this.f36845b = C3433m.this.B(this.f36845b);
            return b10;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            AbstractC3431k.c(this.f36846c >= 0);
            c();
            C3433m c3433m = C3433m.this;
            c3433m.remove(c3433m.H(this.f36846c));
            this.f36845b = C3433m.this.o(this.f36845b, this.f36846c);
            this.f36846c = -1;
        }

        public /* synthetic */ e(C3433m c3433m, a aVar) {
            this();
        }
    }
}
