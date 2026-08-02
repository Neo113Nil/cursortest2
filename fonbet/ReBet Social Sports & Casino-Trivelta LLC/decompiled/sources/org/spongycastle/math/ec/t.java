package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.WNafUtil;

/* loaded from: classes5.dex */
public abstract class t {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final g[] EMPTY_POINTS = new g[0];

    public static int[] a(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i10 = bitLength >> 1;
        int[] iArr = new int[i10];
        BigInteger xor = add.xor(bigInteger);
        int i11 = bitLength - 1;
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        while (i13 < i11) {
            if (xor.testBit(i13)) {
                iArr[i12] = i14 | ((bigInteger.testBit(i13) ? -1 : 1) << 16);
                i13++;
                i14 = 1;
                i12++;
            } else {
                i14++;
            }
            i13++;
        }
        int i15 = i12 + 1;
        iArr[i12] = 65536 | i14;
        return i10 > i15 ? n(iArr, i15) : iArr;
    }

    public static int[] b(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return a(bigInteger);
        }
        if (i10 < 2 || i10 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int bitLength = (bigInteger.bitLength() / i10) + 1;
        int[] iArr = new int[bitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int intValue = bigInteger.intValue() & i12;
                if (z10) {
                    intValue++;
                }
                z10 = (intValue & i13) != 0;
                if (z10) {
                    intValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                iArr[i15] = i14 | (intValue << 16);
                i14 = i10;
                i15++;
            }
        }
        return bitLength > i15 ? n(iArr, i15) : iArr;
    }

    public static byte[] c(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i10 = bitLength - 1;
        byte[] bArr = new byte[i10];
        BigInteger xor = add.xor(bigInteger);
        int i11 = 1;
        while (i11 < i10) {
            if (xor.testBit(i11)) {
                bArr[i11 - 1] = (byte) (bigInteger.testBit(i11) ? -1 : 1);
                i11++;
            }
            i11++;
        }
        bArr[bitLength - 2] = 1;
        return bArr;
    }

    public static byte[] d(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return c(bigInteger);
        }
        if (i10 < 2 || i10 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int bitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[bitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int intValue = bigInteger.intValue() & i12;
                if (z10) {
                    intValue++;
                }
                z10 = (intValue & i13) != 0;
                if (z10) {
                    intValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                int i16 = i15 + i14;
                bArr[i16] = (byte) intValue;
                i15 = i16 + 1;
                i14 = i10;
            }
        }
        return bitLength > i15 ? m(bArr, i15) : bArr;
    }

    public static int e(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static s f(g gVar) {
        return g(gVar.h().x(gVar, WNafUtil.PRECOMP_NAME));
    }

    public static s g(n nVar) {
        return (nVar == null || !(nVar instanceof s)) ? new s() : (s) nVar;
    }

    public static int h(int i10) {
        return i(i10, DEFAULT_WINDOW_SIZE_CUTOFFS);
    }

    public static int i(int i10, int[] iArr) {
        int i11 = 0;
        while (i11 < iArr.length && i10 >= iArr[i11]) {
            i11++;
        }
        return i11 + 2;
    }

    public static g j(g gVar, int i10, boolean z10, h hVar) {
        d h10 = gVar.h();
        s k10 = k(gVar, i10, z10);
        g a10 = hVar.a(gVar);
        s g10 = g(h10.x(a10, WNafUtil.PRECOMP_NAME));
        g c10 = k10.c();
        if (c10 != null) {
            g10.f(hVar.a(c10));
        }
        g[] a11 = k10.a();
        int length = a11.length;
        g[] gVarArr = new g[length];
        for (int i11 = 0; i11 < a11.length; i11++) {
            gVarArr[i11] = hVar.a(a11[i11]);
        }
        g10.d(gVarArr);
        if (z10) {
            g[] gVarArr2 = new g[length];
            for (int i12 = 0; i12 < length; i12++) {
                gVarArr2[i12] = gVarArr[i12].u();
            }
            g10.e(gVarArr2);
        }
        h10.B(a10, WNafUtil.PRECOMP_NAME, g10);
        return a10;
    }

    public static s k(g gVar, int i10, boolean z10) {
        int length;
        int i11;
        int q10;
        d h10 = gVar.h();
        s g10 = g(h10.x(gVar, WNafUtil.PRECOMP_NAME));
        int i12 = 0;
        int max = 1 << Math.max(0, i10 - 2);
        g[] a10 = g10.a();
        if (a10 == null) {
            a10 = EMPTY_POINTS;
            length = 0;
        } else {
            length = a10.length;
        }
        if (length < max) {
            a10 = l(a10, max);
            if (max == 1) {
                a10[0] = gVar.v();
            } else {
                if (length == 0) {
                    a10[0] = gVar;
                    i11 = 1;
                } else {
                    i11 = length;
                }
                e eVar = null;
                if (max == 2) {
                    a10[1] = gVar.B();
                } else {
                    g c10 = g10.c();
                    g gVar2 = a10[i11 - 1];
                    if (c10 == null) {
                        c10 = a10[0].D();
                        g10.f(c10);
                        if (!c10.r() && b.k(h10) && h10.t() >= 64 && ((q10 = h10.q()) == 2 || q10 == 3 || q10 == 4)) {
                            eVar = c10.q(0);
                            c10 = h10.f(c10.o().t(), c10.p().t());
                            e o10 = eVar.o();
                            gVar2 = gVar2.z(o10).A(o10.j(eVar));
                            if (length == 0) {
                                a10[0] = gVar2;
                            }
                        }
                    }
                    while (i11 < max) {
                        gVar2 = gVar2.a(c10);
                        a10[i11] = gVar2;
                        i11++;
                    }
                }
                h10.A(a10, length, max - length, eVar);
            }
        }
        g10.d(a10);
        if (z10) {
            g[] b10 = g10.b();
            if (b10 == null) {
                b10 = new g[max];
            } else {
                i12 = b10.length;
                if (i12 < max) {
                    b10 = l(b10, max);
                }
            }
            while (i12 < max) {
                b10[i12] = a10[i12].u();
                i12++;
            }
            g10.e(b10);
        }
        h10.B(gVar, WNafUtil.PRECOMP_NAME, g10);
        return g10;
    }

    public static g[] l(g[] gVarArr, int i10) {
        g[] gVarArr2 = new g[i10];
        System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
        return gVarArr2;
    }

    public static byte[] m(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public static int[] n(int[] iArr, int i10) {
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }
}
