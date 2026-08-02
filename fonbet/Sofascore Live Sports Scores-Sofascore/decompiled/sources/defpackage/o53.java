package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o53 extends AbstractMap implements Serializable {
    public static final Object j = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient m53 g;
    public transient m53 h;
    public transient s6 i;

    public static o53 d() {
        o53 o53Var = new o53();
        o53Var.j(3);
        return o53Var;
    }

    public static o53 e(int i) {
        o53 o53Var = new o53();
        o53Var.j(i);
        return o53Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(ljg.j(readInt, "Invalid size: "));
        }
        j(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map g = g();
        Iterator it = g != null ? g.entrySet().iterator() : new l53(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (l()) {
            return;
        }
        this.e += 32;
        Map g = g();
        if (g != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            g.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(o(), 0, this.f, (Object) null);
        Arrays.fill(p(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(n(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map g = g();
        return g != null ? g.containsKey(obj) : i(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map g = g();
        if (g != null) {
            return g.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (sha.r(obj, p()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m53 m53Var = this.h;
        if (m53Var != null) {
            return m53Var;
        }
        m53 m53Var2 = new m53(this, 0);
        this.h = m53Var2;
        return m53Var2;
    }

    public final Map g() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map g = g();
        if (g != null) {
            return g.get(obj);
        }
        int i = i(obj);
        if (i == -1) {
            return null;
        }
        return p()[i];
    }

    public final int h() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int i(Object obj) {
        if (l()) {
            return -1;
        }
        int B = tol.B(obj);
        int h = h();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int f0 = s02.f0(B & h, obj2);
        if (f0 == 0) {
            return -1;
        }
        int i = ~h;
        int i2 = B & i;
        do {
            int i3 = f0 - 1;
            int i4 = n()[i3];
            if ((i4 & i) == i2 && sha.r(obj, o()[i3])) {
                return i3;
            }
            f0 = i4 & h;
        } while (f0 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final void j(int i) {
        z1a.r("Expected size must be >= 0", i >= 0);
        this.e = Math.min(Math.max(i, 1), 1073741823);
    }

    public final void k(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] n = n();
        Object[] o = o();
        Object[] p = p();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            o[i] = null;
            p[i] = null;
            n[i] = 0;
            return;
        }
        Object obj2 = o[i3];
        o[i] = obj2;
        p[i] = p[i3];
        o[i3] = null;
        p[i3] = null;
        n[i] = n[i3];
        n[i3] = 0;
        int B = tol.B(obj2) & i2;
        int f0 = s02.f0(B, obj);
        if (f0 == size) {
            s02.g0(B, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = f0 - 1;
            int i5 = n[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                n[i4] = s02.T(i5, i + 1, i2);
                return;
            }
            f0 = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m53 m53Var = this.g;
        if (m53Var != null) {
            return m53Var;
        }
        m53 m53Var2 = new m53(this, 1);
        this.g = m53Var2;
        return m53Var2;
    }

    public final boolean l() {
        return this.a == null;
    }

    public final Object m(Object obj) {
        if (!l()) {
            int h = h();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int Z = s02.Z(obj, null, h, obj2, n(), o(), null);
            if (Z != -1) {
                Object obj3 = p()[Z];
                k(Z, h);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return j;
    }

    public final int[] n() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] o() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] p() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00eb -> B:38:0x00d3). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = 32;
        int i4 = 1;
        if (l()) {
            z1a.D("Arrays already allocated", l());
            int i5 = this.e;
            int max = Math.max(4, tol.p(1.0d, i5 + 1));
            this.a = s02.G(max);
            this.e = s02.T(this.e, 32 - Integer.numberOfLeadingZeros(max - 1), 31);
            this.b = new int[i5];
            this.c = new Object[i5];
            this.d = new Object[i5];
        }
        Map g = g();
        if (g != null) {
            return g.put(obj, obj2);
        }
        int[] n = n();
        Object[] o = o();
        Object[] p = p();
        int i6 = this.f;
        int i7 = i6 + 1;
        int B = tol.B(obj);
        int h = h();
        int i8 = B & h;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int f0 = s02.f0(i8, obj3);
        if (f0 == 0) {
            if (i7 > h) {
                h = q(h, (h + 1) * (h < 32 ? 4 : 2), B, i6);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                s02.g0(i8, i7, obj4);
            }
            i = 1;
        } else {
            int i9 = ~h;
            int i10 = B & i9;
            int i11 = 0;
            while (true) {
                int i12 = f0 - i4;
                i = i4;
                int i13 = n[i12];
                int i14 = i3;
                if ((i13 & i9) == i10 && sha.r(obj, o[i12])) {
                    Object obj5 = p[i12];
                    p[i12] = obj2;
                    return obj5;
                }
                int i15 = i13 & h;
                int i16 = i11 + 1;
                if (i15 != 0) {
                    i11 = i16;
                    f0 = i15;
                    i4 = i;
                    i3 = i14;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h() + 1, 1.0f);
                        if (!isEmpty()) {
                            i2 = 0;
                            while (i2 >= 0) {
                                linkedHashMap.put(o()[i2], p()[i2]);
                                i2++;
                                if (i2 < this.f) {
                                }
                            }
                            this.a = linkedHashMap;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i2 = -1;
                        while (i2 >= 0) {
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i7 > h) {
                        h = q(h, (h + 1) * (h < i14 ? 4 : 2), B, i6);
                    } else {
                        n[i12] = s02.T(i13, i7, h);
                    }
                }
            }
        }
        int length = n().length;
        if (i7 > length) {
            int i17 = i;
            int min = Math.min(1073741823, (Math.max(i17, length >>> 1) + length) | i17);
            if (min != length) {
                this.b = Arrays.copyOf(n(), min);
                this.c = Arrays.copyOf(o(), min);
                this.d = Arrays.copyOf(p(), min);
            }
        }
        n()[i6] = s02.T(B, 0, h);
        o()[i6] = obj;
        p()[i6] = obj2;
        this.f = i7;
        this.e += 32;
        return null;
    }

    public final int q(int i, int i2, int i3, int i4) {
        Object G = s02.G(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            s02.g0(i3 & i5, i4 + 1, G);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] n = n();
        for (int i6 = 0; i6 <= i; i6++) {
            int f0 = s02.f0(i6, obj);
            while (f0 != 0) {
                int i7 = f0 - 1;
                int i8 = n[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int f02 = s02.f0(i10, G);
                s02.g0(i10, f0, G);
                n[i7] = s02.T(i9, f02, i5);
                f0 = i8 & i;
            }
        }
        this.a = G;
        this.e = s02.T(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map g = g();
        if (g != null) {
            return g.remove(obj);
        }
        Object m = m(obj);
        if (m == j) {
            return null;
        }
        return m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map g = g();
        return g != null ? g.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        s6 s6Var = this.i;
        if (s6Var != null) {
            return s6Var;
        }
        s6 s6Var2 = new s6((Object) this, 2);
        this.i = s6Var2;
        return s6Var2;
    }
}
