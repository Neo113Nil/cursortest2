package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import xsna.egi;
import xsna.fxc0;
import xsna.s4q0;

/* compiled from: RegularImmutableMap.java */
/* loaded from: classes13.dex */
public final class h<K, V> extends ImmutableMap<K, V> {
    public static final h h = new h(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    public final transient Object e;
    public final transient Object[] f;
    public final transient int g;

    /* compiled from: RegularImmutableMap.java */
    public static class a<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableMap<K, V> e;
        public final transient Object[] f;
        public final transient int g;
        public final transient int h;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: com.google.common.collect.h$a$a, reason: collision with other inner class name */
        public class C0132a extends ImmutableList<Map.Entry<K, V>> {
            public C0132a() {
            }

            @Override // java.util.List
            public final Object get(int i) {
                fxc0.s(i, a.this.h);
                a aVar = a.this;
                int i2 = i * 2;
                Object obj = aVar.f[aVar.g + i2];
                Objects.requireNonNull(obj);
                a aVar2 = a.this;
                Object obj2 = aVar2.f[i2 + (aVar2.g ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.h;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public a(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.e = immutableMap;
            this.f = objArr;
            this.g = i;
            this.h = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.e.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int e(int i, Object[] objArr) {
            return d().e(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: k */
        public final s4q0<Map.Entry<K, V>> iterator() {
            return d().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList<Map.Entry<K, V>> o() {
            return new C0132a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.h;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    public static final class b<K> extends ImmutableSet<K> {
        public final transient ImmutableMap<K, ?> e;
        public final transient c f;

        public b(ImmutableMap immutableMap, c cVar) {
            this.e = immutableMap;
            this.f = cVar;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.e.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList<K> d() {
            return this.f;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int e(int i, Object[] objArr) {
            return this.f.e(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: k */
        public final s4q0<K> iterator() {
            return this.f.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.e.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    public static final class c extends ImmutableList<Object> {
        public final transient Object[] d;
        public final transient int e;
        public final transient int f;

        public c(Object[] objArr, int i, int i2) {
            this.d = objArr;
            this.e = i;
            this.f = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            fxc0.s(i, this.f);
            Object obj = this.d[(i * 2) + this.e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public h(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.f = objArr;
        this.g = i;
    }

    public static <K, V> h<K, V> m(int i, Object[] objArr, ImmutableMap.a<K, V> aVar) {
        if (i == 0) {
            return h;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new h<>(null, objArr, 1);
        }
        fxc0.v(i, objArr.length >> 1);
        Object n = n(objArr, i, ImmutableSet.l(i), 0);
        if (n instanceof Object[]) {
            Object[] objArr2 = (Object[]) n;
            ImmutableMap.a.C0129a c0129a = (ImmutableMap.a.C0129a) objArr2[2];
            if (aVar == null) {
                throw c0129a.a();
            }
            aVar.c = c0129a;
            Object obj = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            n = obj;
            i = intValue;
        }
        return new h<>(n, objArr, i);
    }

    public static Object n(Object[] objArr, int i, int i2, int i3) {
        ImmutableMap.a.C0129a c0129a = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj = objArr[i7];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj2);
                int q = egi.q(obj.hashCode());
                while (true) {
                    int i9 = q & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i6++;
                    } else {
                        if (obj.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj3 = objArr[i11];
                            Objects.requireNonNull(obj3);
                            c0129a = new ImmutableMap.a.C0129a(obj, obj2, obj3);
                            objArr[i11] = obj2;
                            break;
                        }
                        q = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0129a};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj4 = objArr[i13];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj5);
                int q2 = egi.q(obj4.hashCode());
                while (true) {
                    int i15 = q2 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj4;
                            objArr[i14 ^ 1] = obj5;
                        }
                        i12++;
                    } else {
                        if (obj4.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            Object obj6 = objArr[i17];
                            Objects.requireNonNull(obj6);
                            c0129a = new ImmutableMap.a.C0129a(obj4, obj5, obj6);
                            objArr[i17] = obj5;
                            break;
                        }
                        q2 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), c0129a};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj7 = objArr[i19];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj8);
            int q3 = egi.q(obj7.hashCode());
            while (true) {
                int i21 = q3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj7;
                        objArr[i20 ^ 1] = obj8;
                    }
                    i18++;
                } else {
                    if (obj7.equals(objArr[i22])) {
                        int i23 = i22 ^ 1;
                        Object obj9 = objArr[i23];
                        Objects.requireNonNull(obj9);
                        c0129a = new ImmutableMap.a.C0129a(obj7, obj8, obj9);
                        objArr[i23] = obj8;
                        break;
                    }
                    q3 = i21 + 1;
                }
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), c0129a};
    }

    public static Object o(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int q = egi.q(obj2.hashCode());
            while (true) {
                int i3 = q & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                q = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int q2 = egi.q(obj2.hashCode());
            while (true) {
                int i5 = q2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                q2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int q3 = egi.q(obj2.hashCode());
            while (true) {
                int i7 = q3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                q3 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> d() {
        return new a(this, this.f, 0, this.g);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> g() {
        return new b(this, new c(this.f, 0, this.g));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(Object obj) {
        V v = (V) o(this.e, this.f, this.g, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection<V> h() {
        return new c(this.f, 1, this.g);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean j() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }
}
