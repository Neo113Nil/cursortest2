package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fio extends AbstractMap implements Serializable {
    public static final Object j = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e = Math.min(Math.max(3, 1), 1073741823);
    public transient int f;
    public transient dio g;
    public transient dio h;
    public transient s6 i;

    public fio(int i) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (i()) {
            return;
        }
        this.e += 32;
        Map j2 = j();
        if (j2 != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            j2.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(g(), 0, this.f, (Object) null);
        Arrays.fill(h(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(d(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map j2 = j();
        return j2 != null ? j2.containsKey(obj) : n(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map j2 = j();
        if (j2 != null) {
            return j2.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (Objects.equals(obj, h()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int[] d() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        dio dioVar = this.h;
        if (dioVar != null) {
            return dioVar;
        }
        dio dioVar2 = new dio(this, 0);
        this.h = dioVar2;
        return dioVar2;
    }

    public final Object[] g() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map j2 = j();
        if (j2 != null) {
            return j2.get(obj);
        }
        int n = n(obj);
        if (n == -1) {
            return null;
        }
        return h()[n];
    }

    public final Object[] h() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final boolean i() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Map j() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void k(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] d = d();
        Object[] g = g();
        Object[] h = h();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            g[i] = null;
            h[i] = null;
            d[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = g[i3];
        g[i] = obj2;
        h[i] = h[i3];
        g[i3] = null;
        h[i3] = null;
        d[i] = d[i3];
        d[i3] = 0;
        int J = d2a.J(obj2) & i2;
        int K = w1a.K(J, obj);
        if (K == size) {
            w1a.N(J, i4, obj);
            return;
        }
        while (true) {
            int i5 = K - 1;
            int i6 = d[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                d[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            K = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        dio dioVar = this.g;
        if (dioVar != null) {
            return dioVar;
        }
        dio dioVar2 = new dio(this, 1);
        this.g = dioVar2;
        return dioVar2;
    }

    public final int l() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int m(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object J = w1a.J(i2);
        if (i4 != 0) {
            w1a.N(i3 & i5, i4 + 1, J);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] d = d();
        for (int i6 = 0; i6 <= i; i6++) {
            int K = w1a.K(i6, obj);
            while (K != 0) {
                int i7 = K - 1;
                int i8 = d[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int K2 = w1a.K(i10, J);
                w1a.N(i10, K, J);
                d[i7] = ((~i5) & i9) | (K2 & i5);
                K = i8 & i;
            }
        }
        this.a = J;
        this.e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.e & (-32));
        return i5;
    }

    public final int n(Object obj) {
        if (i()) {
            return -1;
        }
        int J = d2a.J(obj);
        int l = l();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int K = w1a.K(J & l, obj2);
        if (K != 0) {
            int i = ~l;
            int i2 = J & i;
            do {
                int i3 = K - 1;
                int i4 = d()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, g()[i3])) {
                    return i3;
                }
                K = i4 & l;
            } while (K != 0);
        }
        return -1;
    }

    public final Object o(Object obj) {
        if (!i()) {
            int l = l();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int P = w1a.P(obj, null, l, obj2, d(), g(), null);
            if (P != -1) {
                Object obj3 = h()[P];
                k(P, l);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (i()) {
            zzguk.g("Arrays already allocated", i());
            int i3 = this.e;
            int max = Math.max(i3 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = w1a.J(max2);
            this.e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.e & (-32));
            this.b = new int[i3];
            this.c = new Object[i3];
            this.d = new Object[i3];
        }
        Map j2 = j();
        if (j2 != null) {
            return j2.put(obj, obj2);
        }
        int[] d = d();
        Object[] g = g();
        Object[] h = h();
        int i4 = this.f;
        int i5 = i4 + 1;
        int J = d2a.J(obj);
        int l = l();
        int i6 = J & l;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int K = w1a.K(i6, obj3);
        if (K == 0) {
            if (i5 > l) {
                l = m(l, (l + 1) * (l < 32 ? 4 : 2), J, i4);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                w1a.N(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~l;
            int i8 = J & i7;
            int i9 = 0;
            while (true) {
                int i10 = K - 1;
                int i11 = d[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && Objects.equals(obj, g[i10])) {
                    Object obj5 = h[i10];
                    h[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & l;
                int i15 = i9 + 1;
                if (i14 != 0) {
                    i9 = i15;
                    K = i14;
                    i2 = i13;
                } else {
                    if (i15 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(l() + 1, 1.0f);
                        int i16 = isEmpty() ? -1 : 0;
                        while (i16 >= 0) {
                            linkedHashMap.put(g()[i16], h()[i16]);
                            int i17 = i16 + 1;
                            i16 = i17 < this.f ? i17 : -1;
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i5 > l) {
                        l = m(l, (l + 1) * (l < i13 ? 4 : 2), J, i4);
                    } else {
                        d[i10] = (i5 & l) | i12;
                    }
                }
            }
        }
        int length = d().length;
        if (i5 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                this.b = Arrays.copyOf(d(), min);
                this.c = Arrays.copyOf(g(), min);
                this.d = Arrays.copyOf(h(), min);
            }
        }
        d()[i4] = (~l) & J;
        g()[i4] = obj;
        h()[i4] = obj2;
        this.f = i5;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map j2 = j();
        if (j2 != null) {
            return j2.remove(obj);
        }
        Object o = o(obj);
        if (o == j) {
            return null;
        }
        return o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map j2 = j();
        return j2 != null ? j2.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        s6 s6Var = this.i;
        if (s6Var != null) {
            return s6Var;
        }
        s6 s6Var2 = new s6((Object) this, 5);
        this.i = s6Var2;
        return s6Var2;
    }

    public fio() {
    }
}
