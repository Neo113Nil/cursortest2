package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3473e {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f37282a;

        /* renamed from: b, reason: collision with root package name */
        public long f37283b;

        /* renamed from: c, reason: collision with root package name */
        public Object f37284c;

        /* renamed from: d, reason: collision with root package name */
        public final C3484p f37285d;

        public a(C3484p c3484p) {
            c3484p.getClass();
            this.f37285d = c3484p;
        }
    }

    public static int A(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        F f10 = (F) dVar;
        int K10 = K(bArr, i11, aVar);
        f10.addLong(AbstractC3477i.c(aVar.f37283b));
        while (K10 < i12) {
            int H10 = H(bArr, K10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            K10 = K(bArr, H10, aVar);
            f10.addLong(AbstractC3477i.c(aVar.f37283b));
        }
        return K10;
    }

    public static int B(byte[] bArr, int i10, a aVar) {
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a;
        if (i11 < 0) {
            throw A.g();
        }
        if (i11 == 0) {
            aVar.f37284c = "";
            return H10;
        }
        aVar.f37284c = new String(bArr, H10, i11, AbstractC3493z.f37488b);
        return H10 + i11;
    }

    public static int C(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        int H10 = H(bArr, i11, aVar);
        int i13 = aVar.f37282a;
        if (i13 < 0) {
            throw A.g();
        }
        if (i13 == 0) {
            dVar.add("");
        } else {
            dVar.add(new String(bArr, H10, i13, AbstractC3493z.f37488b));
            H10 += i13;
        }
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i14 = aVar.f37282a;
            if (i14 < 0) {
                throw A.g();
            }
            if (i14 == 0) {
                dVar.add("");
            } else {
                dVar.add(new String(bArr, H10, i14, AbstractC3493z.f37488b));
                H10 += i14;
            }
        }
        return H10;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        int H10 = H(bArr, i11, aVar);
        int i13 = aVar.f37282a;
        if (i13 < 0) {
            throw A.g();
        }
        if (i13 == 0) {
            dVar.add("");
        } else {
            int i14 = H10 + i13;
            if (!p0.n(bArr, H10, i14)) {
                throw A.d();
            }
            dVar.add(new String(bArr, H10, i13, AbstractC3493z.f37488b));
            H10 = i14;
        }
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i15 = aVar.f37282a;
            if (i15 < 0) {
                throw A.g();
            }
            if (i15 == 0) {
                dVar.add("");
            } else {
                int i16 = H10 + i15;
                if (!p0.n(bArr, H10, i16)) {
                    throw A.d();
                }
                dVar.add(new String(bArr, H10, i15, AbstractC3493z.f37488b));
                H10 = i16;
            }
        }
        return H10;
    }

    public static int E(byte[] bArr, int i10, a aVar) {
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a;
        if (i11 < 0) {
            throw A.g();
        }
        if (i11 == 0) {
            aVar.f37284c = "";
            return H10;
        }
        aVar.f37284c = p0.e(bArr, H10, i11);
        return H10 + i11;
    }

    public static int F(int i10, byte[] bArr, int i11, int i12, l0 l0Var, a aVar) {
        if (q0.a(i10) == 0) {
            throw A.c();
        }
        int b10 = q0.b(i10);
        if (b10 == 0) {
            int K10 = K(bArr, i11, aVar);
            l0Var.n(i10, Long.valueOf(aVar.f37283b));
            return K10;
        }
        if (b10 == 1) {
            l0Var.n(i10, Long.valueOf(i(bArr, i11)));
            return i11 + 8;
        }
        if (b10 == 2) {
            int H10 = H(bArr, i11, aVar);
            int i13 = aVar.f37282a;
            if (i13 < 0) {
                throw A.g();
            }
            if (i13 > bArr.length - H10) {
                throw A.m();
            }
            if (i13 == 0) {
                l0Var.n(i10, AbstractC3476h.f37290b);
            } else {
                l0Var.n(i10, AbstractC3476h.g(bArr, H10, i13));
            }
            return H10 + i13;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw A.c();
            }
            l0Var.n(i10, Integer.valueOf(g(bArr, i11)));
            return i11 + 4;
        }
        l0 k10 = l0.k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int H11 = H(bArr, i11, aVar);
            i15 = aVar.f37282a;
            if (i15 == i14) {
                i11 = H11;
                break;
            }
            i11 = F(i15, bArr, H11, i12, k10, aVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw A.h();
        }
        l0Var.n(i10, k10);
        return i11;
    }

    public static int G(int i10, byte[] bArr, int i11, a aVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f37282a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f37282a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f37282a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            aVar.f37282a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                aVar.f37282a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int H(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return G(b10, bArr, i11, aVar);
        }
        aVar.f37282a = b10;
        return i11;
    }

    public static int I(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        AbstractC3492y abstractC3492y = (AbstractC3492y) dVar;
        int H10 = H(bArr, i11, aVar);
        abstractC3492y.addInt(aVar.f37282a);
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            abstractC3492y.addInt(aVar.f37282a);
        }
        return H10;
    }

    public static int J(long j10, byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & ByteCompanionObject.MAX_VALUE) << i12;
            i11 = i13;
            b10 = b11;
        }
        aVar.f37283b = j11;
        return i11;
    }

    public static int K(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return J(j10, bArr, i11, aVar);
        }
        aVar.f37283b = j10;
        return i11;
    }

    public static int L(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        F f10 = (F) dVar;
        int K10 = K(bArr, i11, aVar);
        f10.addLong(aVar.f37283b);
        while (K10 < i12) {
            int H10 = H(bArr, K10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            K10 = K(bArr, H10, aVar);
            f10.addLong(aVar.f37283b);
        }
        return K10;
    }

    public static int M(Object obj, e0 e0Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        int Y10 = ((S) e0Var).Y(obj, bArr, i10, i11, i12, aVar);
        aVar.f37284c = obj;
        return Y10;
    }

    public static int N(Object obj, e0 e0Var, byte[] bArr, int i10, int i11, a aVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = G(i13, bArr, i12, aVar);
            i13 = aVar.f37282a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw A.m();
        }
        int i15 = i14 + i13;
        e0Var.a(obj, bArr, i14, i15, aVar);
        aVar.f37284c = obj;
        return i15;
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        AbstractC3474f abstractC3474f = (AbstractC3474f) dVar;
        int K10 = K(bArr, i11, aVar);
        abstractC3474f.addBoolean(aVar.f37283b != 0);
        while (K10 < i12) {
            int H10 = H(bArr, K10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            K10 = K(bArr, H10, aVar);
            abstractC3474f.addBoolean(aVar.f37283b != 0);
        }
        return K10;
    }

    public static int b(byte[] bArr, int i10, a aVar) {
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a;
        if (i11 < 0) {
            throw A.g();
        }
        if (i11 > bArr.length - H10) {
            throw A.m();
        }
        if (i11 == 0) {
            aVar.f37284c = AbstractC3476h.f37290b;
            return H10;
        }
        aVar.f37284c = AbstractC3476h.g(bArr, H10, i11);
        return H10 + i11;
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        int H10 = H(bArr, i11, aVar);
        int i13 = aVar.f37282a;
        if (i13 < 0) {
            throw A.g();
        }
        if (i13 > bArr.length - H10) {
            throw A.m();
        }
        if (i13 == 0) {
            dVar.add(AbstractC3476h.f37290b);
        } else {
            dVar.add(AbstractC3476h.g(bArr, H10, i13));
            H10 += i13;
        }
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            int i14 = aVar.f37282a;
            if (i14 < 0) {
                throw A.g();
            }
            if (i14 > bArr.length - H10) {
                throw A.m();
            }
            if (i14 == 0) {
                dVar.add(AbstractC3476h.f37290b);
            } else {
                dVar.add(AbstractC3476h.g(bArr, H10, i14));
                H10 += i14;
            }
        }
        return H10;
    }

    public static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(i(bArr, i10));
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        AbstractC3481m abstractC3481m = (AbstractC3481m) dVar;
        abstractC3481m.addDouble(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int H10 = H(bArr, i13, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            abstractC3481m.addDouble(d(bArr, H10));
            i13 = H10 + 8;
        }
        return i13;
    }

    public static int f(int i10, byte[] bArr, int i11, int i12, Object obj, O o10, k0 k0Var, a aVar) {
        aVar.f37285d.a(o10, i10 >>> 3);
        return F(i10, bArr, i11, i12, S.o(obj), aVar);
    }

    public static int g(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        AbstractC3492y abstractC3492y = (AbstractC3492y) dVar;
        abstractC3492y.addInt(g(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int H10 = H(bArr, i13, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            abstractC3492y.addInt(g(bArr, H10));
            i13 = H10 + 4;
        }
        return i13;
    }

    public static long i(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        F f10 = (F) dVar;
        f10.addLong(i(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int H10 = H(bArr, i13, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            f10.addLong(i(bArr, H10));
            i13 = H10 + 8;
        }
        return i13;
    }

    public static float k(byte[] bArr, int i10) {
        return Float.intBitsToFloat(g(bArr, i10));
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        AbstractC3489v abstractC3489v = (AbstractC3489v) dVar;
        abstractC3489v.addFloat(k(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int H10 = H(bArr, i13, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            abstractC3489v.addFloat(k(bArr, H10));
            i13 = H10 + 4;
        }
        return i13;
    }

    public static int m(e0 e0Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        Object newInstance = e0Var.newInstance();
        int M10 = M(newInstance, e0Var, bArr, i10, i11, i12, aVar);
        e0Var.makeImmutable(newInstance);
        aVar.f37284c = newInstance;
        return M10;
    }

    public static int n(e0 e0Var, int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        int i13 = (i10 & (-8)) | 4;
        int m10 = m(e0Var, bArr, i11, i12, i13, aVar);
        dVar.add(aVar.f37284c);
        while (m10 < i12) {
            int H10 = H(bArr, m10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            m10 = m(e0Var, bArr, H10, i12, i13, aVar);
            dVar.add(aVar.f37284c);
        }
        return m10;
    }

    public static int o(e0 e0Var, byte[] bArr, int i10, int i11, a aVar) {
        Object newInstance = e0Var.newInstance();
        int N10 = N(newInstance, e0Var, bArr, i10, i11, aVar);
        e0Var.makeImmutable(newInstance);
        aVar.f37284c = newInstance;
        return N10;
    }

    public static int p(e0 e0Var, int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        int o10 = o(e0Var, bArr, i11, i12, aVar);
        dVar.add(aVar.f37284c);
        while (o10 < i12) {
            int H10 = H(bArr, o10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            o10 = o(e0Var, bArr, H10, i12, aVar);
            dVar.add(aVar.f37284c);
        }
        return o10;
    }

    public static int q(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        AbstractC3474f abstractC3474f = (AbstractC3474f) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            H10 = K(bArr, H10, aVar);
            abstractC3474f.addBoolean(aVar.f37283b != 0);
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int r(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        AbstractC3481m abstractC3481m = (AbstractC3481m) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            abstractC3481m.addDouble(d(bArr, H10));
            H10 += 8;
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int s(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        AbstractC3492y abstractC3492y = (AbstractC3492y) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            abstractC3492y.addInt(g(bArr, H10));
            H10 += 4;
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int t(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        F f10 = (F) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            f10.addLong(i(bArr, H10));
            H10 += 8;
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int u(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        AbstractC3489v abstractC3489v = (AbstractC3489v) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            abstractC3489v.addFloat(k(bArr, H10));
            H10 += 4;
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int v(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        AbstractC3492y abstractC3492y = (AbstractC3492y) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            H10 = H(bArr, H10, aVar);
            abstractC3492y.addInt(AbstractC3477i.b(aVar.f37282a));
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int w(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        F f10 = (F) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            H10 = K(bArr, H10, aVar);
            f10.addLong(AbstractC3477i.c(aVar.f37283b));
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int x(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        AbstractC3492y abstractC3492y = (AbstractC3492y) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            H10 = H(bArr, H10, aVar);
            abstractC3492y.addInt(aVar.f37282a);
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int y(byte[] bArr, int i10, AbstractC3493z.d dVar, a aVar) {
        F f10 = (F) dVar;
        int H10 = H(bArr, i10, aVar);
        int i11 = aVar.f37282a + H10;
        while (H10 < i11) {
            H10 = K(bArr, H10, aVar);
            f10.addLong(aVar.f37283b);
        }
        if (H10 == i11) {
            return H10;
        }
        throw A.m();
    }

    public static int z(int i10, byte[] bArr, int i11, int i12, AbstractC3493z.d dVar, a aVar) {
        AbstractC3492y abstractC3492y = (AbstractC3492y) dVar;
        int H10 = H(bArr, i11, aVar);
        abstractC3492y.addInt(AbstractC3477i.b(aVar.f37282a));
        while (H10 < i12) {
            int H11 = H(bArr, H10, aVar);
            if (i10 != aVar.f37282a) {
                break;
            }
            H10 = H(bArr, H11, aVar);
            abstractC3492y.addInt(AbstractC3477i.b(aVar.f37282a));
        }
        return H10;
    }
}
