package com.google.common.collect;

import Bl0.k0;
import com.google.common.collect.AbstractC5881z;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class V<K, V> extends AbstractC5881z<K, V> {

    /* renamed from: g, reason: collision with root package name */
    static final AbstractC5881z<Object, Object> f59033g = new V(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    private final transient Object f59034d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f59035e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f59036f;

    static class a<K, V> extends A<Map.Entry<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        private final transient AbstractC5881z<K, V> f59037d;

        /* renamed from: e, reason: collision with root package name */
        private final transient Object[] f59038e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f59039f;

        /* renamed from: com.google.common.collect.V$a$a, reason: collision with other inner class name */
        final class C0898a extends AbstractC5880y<Map.Entry<K, V>> {
            C0898a() {
            }

            @Override // java.util.List
            public final Object get(int i11) {
                a aVar = a.this;
                k0.f(i11, aVar.f59039f);
                int i12 = i11 * 2;
                Object obj = aVar.f59038e[i12];
                Objects.requireNonNull(obj);
                Object obj2 = aVar.f59038e[i12 + 1];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.AbstractC5878w
            public final boolean h() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f59039f;
            }

            @Override // com.google.common.collect.AbstractC5880y, com.google.common.collect.AbstractC5878w
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        a(AbstractC5881z abstractC5881z, Object[] objArr, int i11) {
            this.f59037d = abstractC5881z;
            this.f59038e = objArr;
            this.f59039f = i11;
        }

        @Override // com.google.common.collect.A
        final AbstractC5880y<Map.Entry<K, V>> A() {
            return new C0898a();
        }

        @Override // com.google.common.collect.AbstractC5878w
        final int b(int i11, Object[] objArr) {
            return a().b(i11, objArr);
        }

        @Override // com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f59037d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.AbstractC5878w
        final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public final f0<Map.Entry<K, V>> iterator() {
            return a().listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f59039f;
        }

        @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class b<K> extends A<K> {

        /* renamed from: d, reason: collision with root package name */
        private final transient AbstractC5881z<K, ?> f59041d;

        /* renamed from: e, reason: collision with root package name */
        private final transient AbstractC5880y<K> f59042e;

        b(AbstractC5881z<K, ?> abstractC5881z, AbstractC5880y<K> abstractC5880y) {
            this.f59041d = abstractC5881z;
            this.f59042e = abstractC5880y;
        }

        @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w
        public final AbstractC5880y<K> a() {
            return this.f59042e;
        }

        @Override // com.google.common.collect.AbstractC5878w
        final int b(int i11, Object[] objArr) {
            return this.f59042e.b(i11, objArr);
        }

        @Override // com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f59041d.get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractC5878w
        final boolean h() {
            return true;
        }

        @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public final f0<K> iterator() {
            return this.f59042e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f59041d.size();
        }

        @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class c extends AbstractC5880y<Object> {

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f59043d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f59044e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f59045f;

        c(Object[] objArr, int i11, int i12) {
            this.f59043d = objArr;
            this.f59044e = i11;
            this.f59045f = i12;
        }

        @Override // java.util.List
        public final Object get(int i11) {
            k0.f(i11, this.f59045f);
            Object obj = this.f59043d[(i11 * 2) + this.f59044e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.AbstractC5878w
        final boolean h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f59045f;
        }

        @Override // com.google.common.collect.AbstractC5880y, com.google.common.collect.AbstractC5878w
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private V(Object obj, Object[] objArr, int i11) {
        this.f59034d = obj;
        this.f59035e = objArr;
        this.f59036f = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019b  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <K, V> V<K, V> y(int i11, Object[] objArr, AbstractC5881z.a<K, V> aVar) {
        int i12;
        boolean z11;
        char c11;
        Object obj;
        char c12;
        short[] sArr;
        int i13;
        boolean z12;
        ?? r17;
        boolean z13;
        boolean z14;
        int i14 = i11;
        Object[] objArr2 = objArr;
        if (i14 == 0) {
            return (V) f59033g;
        }
        int i15 = 1;
        Object obj2 = null;
        boolean z15 = false;
        if (i14 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new V<>(null, objArr2, 1);
        }
        k0.h(i14, objArr2.length >> 1);
        int n11 = A.n(i14);
        char c13 = 2;
        if (i14 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i12 = 1;
            z14 = false;
        } else {
            int i16 = n11 - 1;
            if (n11 <= 128) {
                byte[] bArr = new byte[n11];
                Arrays.fill(bArr, (byte) -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i14) {
                    int i19 = i17 * 2;
                    int i21 = i18 * 2;
                    Object obj3 = objArr2[i19];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i19 ^ i15];
                    Objects.requireNonNull(obj4);
                    int a11 = C5877v.a(obj3.hashCode());
                    while (true) {
                        int i22 = a11 & i16;
                        i13 = i15;
                        z12 = z15;
                        int i23 = bArr[i22] & 255;
                        if (i23 == 255) {
                            bArr[i22] = (byte) i21;
                            if (i18 < i17) {
                                objArr2[i21] = obj3;
                                objArr2[i21 ^ 1] = obj4;
                            }
                            i18++;
                        } else {
                            if (obj3.equals(objArr2[i23])) {
                                int i24 = i23 ^ 1;
                                Object obj5 = objArr2[i24];
                                Objects.requireNonNull(obj5);
                                obj2 = new AbstractC5881z.a.C0901a(obj3, obj4, obj5);
                                objArr2[i24] = obj4;
                                break;
                            }
                            a11 = i22 + 1;
                            i15 = i13;
                            z15 = z12;
                        }
                    }
                    i17++;
                    i15 = i13;
                    z15 = z12;
                }
                i12 = i15;
                z11 = z15;
                if (i18 == i14) {
                    obj2 = bArr;
                    z14 = z11;
                } else {
                    sArr = new Object[3];
                    sArr[z11 ? 1 : 0] = bArr;
                    sArr[i12] = Integer.valueOf(i18);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z14 = z11;
                }
            } else {
                i12 = 1;
                z11 = false;
                if (n11 > 32768) {
                    int[] iArr = new int[n11];
                    Arrays.fill(iArr, -1);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i14) {
                        int i27 = i25 * 2;
                        int i28 = i26 * 2;
                        Object obj6 = objArr2[i27];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i27 ^ 1];
                        Objects.requireNonNull(obj7);
                        int a12 = C5877v.a(obj6.hashCode());
                        while (true) {
                            int i29 = a12 & i16;
                            int i31 = iArr[i29];
                            if (i31 == -1) {
                                iArr[i29] = i28;
                                if (i26 < i25) {
                                    objArr2[i28] = obj6;
                                    objArr2[i28 ^ 1] = obj7;
                                }
                                i26++;
                                c12 = c13;
                            } else {
                                c12 = c13;
                                if (obj6.equals(objArr2[i31])) {
                                    int i32 = i31 ^ 1;
                                    Object obj8 = objArr2[i32];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new AbstractC5881z.a.C0901a(obj6, obj7, obj8);
                                    objArr2[i32] = obj7;
                                    break;
                                }
                                a12 = i29 + 1;
                                c13 = c12;
                            }
                        }
                        i25++;
                        c13 = c12;
                    }
                    c11 = c13;
                    if (i26 == i14) {
                        obj = iArr;
                        r17 = z11;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i26);
                        objArr3[c11] = obj2;
                        obj = objArr3;
                        r17 = z11;
                    }
                    z13 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z13) {
                        Object[] objArr4 = (Object[]) obj;
                        AbstractC5881z.a.C0901a c0901a = (AbstractC5881z.a.C0901a) objArr4[c11];
                        if (aVar == null) {
                            throw c0901a.a();
                        }
                        aVar.f59153c = c0901a;
                        Object obj10 = objArr4[r17];
                        int intValue = ((Integer) objArr4[i12]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                        obj9 = obj10;
                        i14 = intValue;
                    }
                    return new V<>(obj9, objArr2, i14);
                }
                sArr = new short[n11];
                Arrays.fill(sArr, (short) -1);
                int i33 = 0;
                for (int i34 = 0; i34 < i14; i34++) {
                    int i35 = i34 * 2;
                    int i36 = i33 * 2;
                    Object obj11 = objArr2[i35];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i35 ^ 1];
                    Objects.requireNonNull(obj12);
                    int a13 = C5877v.a(obj11.hashCode());
                    while (true) {
                        int i37 = a13 & i16;
                        int i38 = sArr[i37] & 65535;
                        if (i38 == 65535) {
                            sArr[i37] = (short) i36;
                            if (i33 < i34) {
                                objArr2[i36] = obj11;
                                objArr2[i36 ^ 1] = obj12;
                            }
                            i33++;
                        } else {
                            if (obj11.equals(objArr2[i38])) {
                                int i39 = i38 ^ 1;
                                Object obj13 = objArr2[i39];
                                Objects.requireNonNull(obj13);
                                obj2 = new AbstractC5881z.a.C0901a(obj11, obj12, obj13);
                                objArr2[i39] = obj12;
                                break;
                            }
                            a13 = i37 + 1;
                        }
                    }
                }
                if (i33 != i14) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i33), obj2};
                    z14 = z11;
                }
                obj2 = sArr;
                z14 = z11;
            }
        }
        c11 = 2;
        obj = obj2;
        r17 = z14;
        z13 = obj instanceof Object[];
        Object obj92 = obj;
        if (z13) {
        }
        return new V<>(obj92, objArr2, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.common.collect.AbstractC5881z, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v11;
        if (obj != null) {
            Object[] objArr = this.f59035e;
            if (this.f59036f == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                if (obj2.equals(obj)) {
                    v11 = (V) objArr[1];
                    Objects.requireNonNull(v11);
                }
            } else {
                Object obj3 = this.f59034d;
                if (obj3 != null) {
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        int length = bArr.length - 1;
                        int a11 = C5877v.a(obj.hashCode());
                        while (true) {
                            int i11 = a11 & length;
                            int i12 = bArr[i11] & 255;
                            if (i12 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                v11 = (V) objArr[i12 ^ 1];
                                break;
                            }
                            a11 = i11 + 1;
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        int length2 = sArr.length - 1;
                        int a12 = C5877v.a(obj.hashCode());
                        while (true) {
                            int i13 = a12 & length2;
                            int i14 = sArr[i13] & 65535;
                            if (i14 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                v11 = (V) objArr[i14 ^ 1];
                                break;
                            }
                            a12 = i13 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj3;
                        int length3 = iArr.length - 1;
                        int a13 = C5877v.a(obj.hashCode());
                        while (true) {
                            int i15 = a13 & length3;
                            int i16 = iArr[i15];
                            if (i16 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i16])) {
                                v11 = (V) objArr[i16 ^ 1];
                                break;
                            }
                            a13 = i15 + 1;
                        }
                    }
                }
            }
            if (v11 != null) {
                return null;
            }
            return v11;
        }
        v11 = null;
        if (v11 != null) {
        }
    }

    @Override // com.google.common.collect.AbstractC5881z
    final A<Map.Entry<K, V>> i() {
        return new a(this, this.f59035e, this.f59036f);
    }

    @Override // com.google.common.collect.AbstractC5881z
    final A<K> j() {
        return new b(this, new c(this.f59035e, 0, this.f59036f));
    }

    @Override // com.google.common.collect.AbstractC5881z
    final AbstractC5878w<V> l() {
        return new c(this.f59035e, 1, this.f59036f);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f59036f;
    }

    @Override // com.google.common.collect.AbstractC5881z
    Object writeReplace() {
        return super.writeReplace();
    }
}
