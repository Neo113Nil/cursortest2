package com.google.common.collect;

import com.google.common.collect.B;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* loaded from: classes3.dex */
public final class a0 extends B {

    /* renamed from: f, reason: collision with root package name */
    public static final B f36750f = new a0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] alternatingKeysAndValues;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f36751d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f36752e;

    public static class a extends E {
        private final transient Object[] alternatingKeysAndValues;

        /* renamed from: b, reason: collision with root package name */
        public final transient B f36753b;

        /* renamed from: c, reason: collision with root package name */
        public final transient int f36754c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f36755d;

        /* renamed from: com.google.common.collect.a0$a$a, reason: collision with other inner class name */
        public class C0510a extends AbstractC3445z {
            public C0510a() {
            }

            @Override // java.util.List
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                Ra.n.i(i10, a.this.f36755d);
                int i11 = i10 * 2;
                Object obj = a.this.alternatingKeysAndValues[a.this.f36754c + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.alternatingKeysAndValues[i11 + (a.this.f36754c ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.AbstractC3443x
            public boolean g() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f36755d;
            }

            @Override // com.google.common.collect.AbstractC3445z, com.google.common.collect.AbstractC3443x
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public a(B b10, Object[] objArr, int i10, int i11) {
            this.f36753b = b10;
            this.alternatingKeysAndValues = objArr;
            this.f36754c = i10;
            this.f36755d = i11;
        }

        @Override // com.google.common.collect.AbstractC3443x
        public int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f36753b.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.AbstractC3443x
        public boolean g() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: h */
        public m0 iterator() {
            return a().iterator();
        }

        @Override // com.google.common.collect.E
        public AbstractC3445z o() {
            return new C0510a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f36755d;
        }

        @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class b extends E {

        /* renamed from: b, reason: collision with root package name */
        public final transient B f36757b;

        /* renamed from: c, reason: collision with root package name */
        public final transient AbstractC3445z f36758c;

        public b(B b10, AbstractC3445z abstractC3445z) {
            this.f36757b = b10;
            this.f36758c = abstractC3445z;
        }

        @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
        public AbstractC3445z a() {
            return this.f36758c;
        }

        @Override // com.google.common.collect.AbstractC3443x
        public int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f36757b.get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractC3443x
        public boolean g() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: h */
        public m0 iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f36757b.size();
        }

        @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class c extends AbstractC3445z {
        private final transient Object[] alternatingKeysAndValues;

        /* renamed from: b, reason: collision with root package name */
        public final transient int f36759b;

        /* renamed from: c, reason: collision with root package name */
        public final transient int f36760c;

        public c(Object[] objArr, int i10, int i11) {
            this.alternatingKeysAndValues = objArr;
            this.f36759b = i10;
            this.f36760c = i11;
        }

        @Override // com.google.common.collect.AbstractC3443x
        public boolean g() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            Ra.n.i(i10, this.f36760c);
            Object obj = this.alternatingKeysAndValues[(i10 * 2) + this.f36759b];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f36760c;
        }

        @Override // com.google.common.collect.AbstractC3445z, com.google.common.collect.AbstractC3443x
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public a0(Object obj, Object[] objArr, int i10) {
        this.f36751d = obj;
        this.alternatingKeysAndValues = objArr;
        this.f36752e = i10;
    }

    public static a0 r(int i10, Object[] objArr) {
        return s(i10, objArr, null);
    }

    public static a0 s(int i10, Object[] objArr, B.a aVar) {
        if (i10 == 0) {
            return (a0) f36750f;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC3431k.a(obj, obj2);
            return new a0(null, objArr, 1);
        }
        Ra.n.m(i10, objArr.length >> 1);
        Object t10 = t(objArr, i10, E.k(i10), 0);
        if (t10 instanceof Object[]) {
            Object[] objArr2 = (Object[]) t10;
            B.a.C0506a c0506a = (B.a.C0506a) objArr2[2];
            if (aVar == null) {
                throw c0506a.a();
            }
            aVar.f36670d = c0506a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            t10 = obj3;
            i10 = intValue;
        }
        return new a0(t10, objArr, i10);
    }

    public static Object t(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        B.a.C0506a c0506a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC3431k.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC3431k.a(obj3, obj4);
                int b10 = AbstractC3441v.b(obj3.hashCode());
                while (true) {
                    int i20 = b10 & i15;
                    int i21 = bArr[i20] & UByte.MAX_VALUE;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                    } else {
                        if (obj3.equals(objArr[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj5 = objArr[i22];
                            Objects.requireNonNull(obj5);
                            c0506a = new B.a.C0506a(obj3, obj4, obj5);
                            objArr[i22] = obj4;
                            break;
                        }
                        b10 = i20 + 1;
                    }
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0506a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC3431k.a(obj6, obj7);
                int b11 = AbstractC3441v.b(obj6.hashCode());
                while (true) {
                    int i27 = b11 & i15;
                    int i28 = sArr[i27] & UShort.MAX_VALUE;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                    } else {
                        if (obj6.equals(objArr[i28])) {
                            int i29 = i28 ^ 1;
                            Object obj8 = objArr[i29];
                            Objects.requireNonNull(obj8);
                            c0506a = new B.a.C0506a(obj6, obj7, obj8);
                            objArr[i29] = obj7;
                            break;
                        }
                        b11 = i27 + 1;
                    }
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0506a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            AbstractC3431k.a(obj9, obj10);
            int b12 = AbstractC3441v.b(obj9.hashCode());
            while (true) {
                int i34 = b12 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (obj9.equals(objArr[i35])) {
                        int i36 = i35 ^ 1;
                        Object obj11 = objArr[i36];
                        Objects.requireNonNull(obj11);
                        c0506a = new B.a.C0506a(obj9, obj10, obj11);
                        objArr[i36] = obj10;
                        break;
                    }
                    b12 = i34 + 1;
                    i14 = i13;
                }
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0506a;
        return objArr2;
    }

    public static Object u(Object[] objArr, int i10, int i11, int i12) {
        Object t10 = t(objArr, i10, i11, i12);
        if (t10 instanceof Object[]) {
            throw ((B.a.C0506a) ((Object[]) t10)[2]).a();
        }
        return t10;
    }

    public static Object v(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int b10 = AbstractC3441v.b(obj2.hashCode());
            while (true) {
                int i12 = b10 & length;
                int i13 = bArr[i12] & UByte.MAX_VALUE;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                b10 = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int b11 = AbstractC3441v.b(obj2.hashCode());
            while (true) {
                int i14 = b11 & length2;
                int i15 = sArr[i14] & UShort.MAX_VALUE;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                b11 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int b12 = AbstractC3441v.b(obj2.hashCode());
            while (true) {
                int i16 = b12 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                b12 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.B
    public E f() {
        return new a(this, this.alternatingKeysAndValues, 0, this.f36752e);
    }

    @Override // com.google.common.collect.B
    public E g() {
        return new b(this, new c(this.alternatingKeysAndValues, 0, this.f36752e));
    }

    @Override // com.google.common.collect.B, java.util.Map
    public Object get(Object obj) {
        Object v10 = v(this.f36751d, this.alternatingKeysAndValues, this.f36752e, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.B
    public AbstractC3443x h() {
        return new c(this.alternatingKeysAndValues, 1, this.f36752e);
    }

    @Override // com.google.common.collect.B
    public boolean k() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f36752e;
    }

    @Override // com.google.common.collect.B
    public Object writeReplace() {
        return super.writeReplace();
    }
}
