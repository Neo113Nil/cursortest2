package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5899e {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f59358a;

        /* renamed from: b, reason: collision with root package name */
        public long f59359b;

        /* renamed from: c, reason: collision with root package name */
        public Object f59360c;

        /* renamed from: d, reason: collision with root package name */
        public final C5910p f59361d;

        /* renamed from: e, reason: collision with root package name */
        public int f59362e;

        a(C5910p c5910p) {
            c5910p.getClass();
            this.f59361d = c5910p;
        }
    }

    static int a(byte[] bArr, int i11, a aVar) throws A {
        int g10 = g(bArr, i11, aVar);
        int i12 = aVar.f59358a;
        if (i12 < 0) {
            throw A.g();
        }
        if (i12 > bArr.length - g10) {
            throw A.l();
        }
        if (i12 == 0) {
            aVar.f59360c = AbstractC5903i.f59377b;
            return g10;
        }
        aVar.f59360c = AbstractC5903i.e(g10, i12, bArr);
        return g10 + i12;
    }

    static int b(int i11, byte[] bArr) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    static long c(int i11, byte[] bArr) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    static int d(f0<?> f0Var, int i11, byte[] bArr, int i12, int i13, C5919z.d<?> dVar, a aVar) throws IOException {
        Object newInstance = f0Var.newInstance();
        f0<?> f0Var2 = f0Var;
        byte[] bArr2 = bArr;
        int i14 = i13;
        a aVar2 = aVar;
        int k11 = k(newInstance, f0Var2, bArr2, i12, i14, aVar2);
        f0Var2.makeImmutable(newInstance);
        aVar2.f59360c = newInstance;
        dVar.add(newInstance);
        while (k11 < i14) {
            a aVar3 = aVar2;
            int i15 = i14;
            int g10 = g(bArr2, k11, aVar3);
            if (i11 != aVar3.f59358a) {
                break;
            }
            byte[] bArr3 = bArr2;
            f0<?> f0Var3 = f0Var2;
            Object newInstance2 = f0Var3.newInstance();
            k11 = k(newInstance2, f0Var3, bArr3, g10, i15, aVar3);
            f0Var2 = f0Var3;
            bArr2 = bArr3;
            i14 = i15;
            aVar2 = aVar3;
            f0Var2.makeImmutable(newInstance2);
            aVar2.f59360c = newInstance2;
            dVar.add(newInstance2);
        }
        return k11;
    }

    static int e(int i11, byte[] bArr, int i12, int i13, n0 n0Var, a aVar) throws A {
        if ((i11 >>> 3) == 0) {
            throw A.b();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int i15 = i(bArr, i12, aVar);
            n0Var.j(i11, Long.valueOf(aVar.f59359b));
            return i15;
        }
        if (i14 == 1) {
            n0Var.j(i11, Long.valueOf(c(i12, bArr)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int g10 = g(bArr, i12, aVar);
            int i16 = aVar.f59358a;
            if (i16 < 0) {
                throw A.g();
            }
            if (i16 > bArr.length - g10) {
                throw A.l();
            }
            if (i16 == 0) {
                n0Var.j(i11, AbstractC5903i.f59377b);
            } else {
                n0Var.j(i11, AbstractC5903i.e(g10, i16, bArr));
            }
            return g10 + i16;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw A.b();
            }
            n0Var.j(i11, Integer.valueOf(b(i12, bArr)));
            return i12 + 4;
        }
        n0 h11 = n0.h();
        int i17 = (i11 & (-8)) | 4;
        int i18 = aVar.f59362e + 1;
        aVar.f59362e = i18;
        if (i18 >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i19 = 0;
        while (true) {
            if (i12 >= i13) {
                break;
            }
            int g11 = g(bArr, i12, aVar);
            i19 = aVar.f59358a;
            if (i19 == i17) {
                i12 = g11;
                break;
            }
            i12 = e(i19, bArr, g11, i13, h11, aVar);
        }
        aVar.f59362e--;
        if (i12 > i13 || i19 != i17) {
            throw A.h();
        }
        n0Var.j(i11, h11);
        return i12;
    }

    static int f(int i11, byte[] bArr, int i12, a aVar) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            aVar.f59358a = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            aVar.f59358a = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            aVar.f59358a = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            aVar.f59358a = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                aVar.f59358a = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int g(byte[] bArr, int i11, a aVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return f(b11, bArr, i12, aVar);
        }
        aVar.f59358a = b11;
        return i12;
    }

    static int h(int i11, byte[] bArr, int i12, int i13, C5919z.d<?> dVar, a aVar) {
        C5918y c5918y = (C5918y) dVar;
        int g10 = g(bArr, i12, aVar);
        c5918y.addInt(aVar.f59358a);
        while (g10 < i13) {
            int g11 = g(bArr, g10, aVar);
            if (i11 != aVar.f59358a) {
                break;
            }
            g10 = g(bArr, g11, aVar);
            c5918y.addInt(aVar.f59358a);
        }
        return g10;
    }

    static int i(byte[] bArr, int i11, a aVar) {
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            aVar.f59359b = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b11 = bArr[i12];
        long j12 = (j11 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i14 = 7;
        while (b11 < 0) {
            int i15 = i13 + 1;
            i14 += 7;
            j12 |= (r10 & Byte.MAX_VALUE) << i14;
            b11 = bArr[i13];
            i13 = i15;
        }
        aVar.f59359b = j12;
        return i13;
    }

    static <T> int j(Object obj, f0<T> f0Var, byte[] bArr, int i11, int i12, int i13, a aVar) throws IOException {
        V v11 = (V) f0Var;
        int i14 = aVar.f59362e + 1;
        aVar.f59362e = i14;
        if (i14 >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int C11 = v11.C(obj, bArr, i11, i12, i13, aVar);
        aVar.f59362e--;
        aVar.f59360c = obj;
        return C11;
    }

    static <T> int k(Object obj, f0<T> f0Var, byte[] bArr, int i11, int i12, a aVar) throws IOException {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = f(i14, bArr, i13, aVar);
            i14 = aVar.f59358a;
        }
        int i15 = i13;
        if (i14 < 0 || i14 > i12 - i15) {
            throw A.l();
        }
        int i16 = aVar.f59362e + 1;
        aVar.f59362e = i16;
        if (i16 >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = i15 + i14;
        f0Var.a(obj, bArr, i15, i17, aVar);
        aVar.f59362e--;
        aVar.f59360c = obj;
        return i17;
    }

    static int l(int i11, byte[] bArr, int i12, int i13, a aVar) throws A {
        if ((i11 >>> 3) == 0) {
            throw A.b();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return i(bArr, i12, aVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return g(bArr, i12, aVar) + aVar.f59358a;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw A.b();
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = g(bArr, i12, aVar);
            i16 = aVar.f59358a;
            if (i16 == i15) {
                break;
            }
            i12 = l(i16, bArr, i12, i13, aVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw A.h();
        }
        return i12;
    }
}
