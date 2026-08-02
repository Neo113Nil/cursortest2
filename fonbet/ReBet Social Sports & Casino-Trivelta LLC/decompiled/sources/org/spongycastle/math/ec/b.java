package org.spongycastle.math.ec;

import java.math.BigInteger;
import oj.InterfaceC5919a;
import oj.InterfaceC5920b;
import org.spongycastle.math.ec.d;

/* loaded from: classes5.dex */
public abstract class b {
    public static g a(g gVar, BigInteger bigInteger, g gVar2, BigInteger bigInteger2) {
        boolean z10 = bigInteger.signum() < 0;
        boolean z11 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int max = Math.max(2, Math.min(16, t.h(abs.bitLength())));
        int max2 = Math.max(2, Math.min(16, t.h(abs2.bitLength())));
        s k10 = t.k(gVar, max, true);
        s k11 = t.k(gVar2, max2, true);
        return c(z10 ? k10.b() : k10.a(), z10 ? k10.a() : k10.b(), t.d(max, abs), z11 ? k11.b() : k11.a(), z11 ? k11.a() : k11.b(), t.d(max2, abs2));
    }

    public static g b(g gVar, BigInteger bigInteger, h hVar, BigInteger bigInteger2) {
        boolean z10 = bigInteger.signum() < 0;
        boolean z11 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int max = Math.max(2, Math.min(16, t.h(Math.max(abs.bitLength(), abs2.bitLength()))));
        g j10 = t.j(gVar, max, true, hVar);
        s f10 = t.f(gVar);
        s f11 = t.f(j10);
        return c(z10 ? f10.b() : f10.a(), z10 ? f10.a() : f10.b(), t.d(max, abs), z11 ? f11.b() : f11.a(), z11 ? f11.a() : f11.b(), t.d(max, abs2));
    }

    public static g c(g[] gVarArr, g[] gVarArr2, byte[] bArr, g[] gVarArr3, g[] gVarArr4, byte[] bArr2) {
        g gVar;
        int max = Math.max(bArr.length, bArr2.length);
        g u10 = gVarArr[0].h().u();
        int i10 = max - 1;
        int i11 = 0;
        g gVar2 = u10;
        while (i10 >= 0) {
            byte b10 = i10 < bArr.length ? bArr[i10] : (byte) 0;
            byte b11 = i10 < bArr2.length ? bArr2[i10] : (byte) 0;
            if ((b10 | b11) == 0) {
                i11++;
            } else {
                if (b10 != 0) {
                    gVar = u10.a((b10 < 0 ? gVarArr2 : gVarArr)[Math.abs((int) b10) >>> 1]);
                } else {
                    gVar = u10;
                }
                if (b11 != 0) {
                    gVar = gVar.a((b11 < 0 ? gVarArr4 : gVarArr3)[Math.abs((int) b11) >>> 1]);
                }
                if (i11 > 0) {
                    gVar2 = gVar2.C(i11);
                    i11 = 0;
                }
                gVar2 = gVar2.E(gVar);
            }
            i10--;
        }
        return i11 > 0 ? gVar2.C(i11) : gVar2;
    }

    public static g d(g[] gVarArr, h hVar, BigInteger[] bigIntegerArr) {
        int length = gVarArr.length;
        int i10 = length << 1;
        boolean[] zArr = new boolean[i10];
        s[] sVarArr = new s[i10];
        byte[][] bArr = new byte[i10][];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 << 1;
            int i13 = i12 + 1;
            BigInteger bigInteger = bigIntegerArr[i12];
            zArr[i12] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i13];
            zArr[i13] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int max = Math.max(2, Math.min(16, t.h(Math.max(abs.bitLength(), abs2.bitLength()))));
            g gVar = gVarArr[i11];
            g j10 = t.j(gVar, max, true, hVar);
            sVarArr[i12] = t.f(gVar);
            sVarArr[i13] = t.f(j10);
            bArr[i12] = t.d(max, abs);
            bArr[i13] = t.d(max, abs2);
        }
        return f(zArr, sVarArr, bArr);
    }

    public static g e(g[] gVarArr, BigInteger[] bigIntegerArr) {
        int length = gVarArr.length;
        boolean[] zArr = new boolean[length];
        s[] sVarArr = new s[length];
        byte[][] bArr = new byte[length][];
        for (int i10 = 0; i10 < length; i10++) {
            BigInteger bigInteger = bigIntegerArr[i10];
            zArr[i10] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            int max = Math.max(2, Math.min(16, t.h(abs.bitLength())));
            sVarArr[i10] = t.k(gVarArr[i10], max, true);
            bArr[i10] = t.d(max, abs);
        }
        return f(zArr, sVarArr, bArr);
    }

    public static g f(boolean[] zArr, s[] sVarArr, byte[][] bArr) {
        int length = bArr.length;
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            i10 = Math.max(i10, bArr2.length);
        }
        g u10 = sVarArr[0].a()[0].h().u();
        int i11 = i10 - 1;
        int i12 = 0;
        g gVar = u10;
        while (i11 >= 0) {
            g gVar2 = u10;
            for (int i13 = 0; i13 < length; i13++) {
                byte[] bArr3 = bArr[i13];
                byte b10 = i11 < bArr3.length ? bArr3[i11] : (byte) 0;
                if (b10 != 0) {
                    int abs = Math.abs((int) b10);
                    s sVar = sVarArr[i13];
                    gVar2 = gVar2.a(((b10 < 0) == zArr[i13] ? sVar.a() : sVar.b())[abs >>> 1]);
                }
            }
            if (gVar2 == u10) {
                i12++;
            } else {
                if (i12 > 0) {
                    gVar = gVar.C(i12);
                    i12 = 0;
                }
                gVar = gVar.E(gVar2);
            }
            i11--;
        }
        return i12 > 0 ? gVar.C(i12) : gVar;
    }

    public static g g(g[] gVarArr, BigInteger[] bigIntegerArr, InterfaceC5920b interfaceC5920b) {
        BigInteger w10 = gVarArr[0].h().w();
        int length = gVarArr.length;
        int i10 = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            BigInteger[] decomposeScalar = interfaceC5920b.decomposeScalar(bigIntegerArr[i12].mod(w10));
            int i13 = i11 + 1;
            bigIntegerArr2[i11] = decomposeScalar[0];
            i11 += 2;
            bigIntegerArr2[i13] = decomposeScalar[1];
        }
        h pointMap = interfaceC5920b.getPointMap();
        if (interfaceC5920b.hasEfficientPointMap()) {
            return d(gVarArr, pointMap, bigIntegerArr2);
        }
        g[] gVarArr2 = new g[i10];
        int i14 = 0;
        for (g gVar : gVarArr) {
            g a10 = pointMap.a(gVar);
            int i15 = i14 + 1;
            gVarArr2[i14] = gVar;
            i14 += 2;
            gVarArr2[i15] = a10;
        }
        return e(gVarArr2, bigIntegerArr2);
    }

    public static g h(d dVar, g gVar) {
        if (dVar.l(gVar.h())) {
            return dVar.y(gVar);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean i(d dVar) {
        return j(dVar.s());
    }

    public static boolean j(org.spongycastle.math.field.a aVar) {
        return aVar.getDimension() > 1 && aVar.getCharacteristic().equals(c.f62726c) && (aVar instanceof org.spongycastle.math.field.f);
    }

    public static boolean k(d dVar) {
        return l(dVar.s());
    }

    public static boolean l(org.spongycastle.math.field.a aVar) {
        return aVar.getDimension() == 1;
    }

    public static void m(e[] eVarArr, int i10, int i11, e eVar) {
        e[] eVarArr2 = new e[i11];
        int i12 = 0;
        eVarArr2[0] = eVarArr[i10];
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11) {
                break;
            }
            eVarArr2[i13] = eVarArr2[i12].j(eVarArr[i10 + i13]);
            i12 = i13;
        }
        if (eVar != null) {
            eVarArr2[i12] = eVarArr2[i12].j(eVar);
        }
        e g10 = eVarArr2[i12].g();
        while (i12 > 0) {
            int i14 = i12 - 1;
            int i15 = i12 + i10;
            e eVar2 = eVarArr[i15];
            eVarArr[i15] = eVarArr2[i14].j(g10);
            g10 = g10.j(eVar2);
            i12 = i14;
        }
        eVarArr[i10] = g10;
    }

    public static g n(g gVar, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        g u10 = gVar.h().u();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                u10 = gVar;
            }
            for (int i10 = 1; i10 < bitLength; i10++) {
                gVar = gVar.D();
                if (abs.testBit(i10)) {
                    u10 = u10.a(gVar);
                }
            }
        }
        return bigInteger.signum() < 0 ? u10.u() : u10;
    }

    public static g o(g gVar, BigInteger bigInteger, g gVar2, BigInteger bigInteger2) {
        d h10 = gVar.h();
        g h11 = h(h10, gVar2);
        if ((h10 instanceof d.a) && ((d.a) h10).H()) {
            return p(gVar.t(bigInteger).a(h11.t(bigInteger2)));
        }
        InterfaceC5919a r10 = h10.r();
        return r10 instanceof InterfaceC5920b ? p(g(new g[]{gVar, h11}, new BigInteger[]{bigInteger, bigInteger2}, (InterfaceC5920b) r10)) : p(a(gVar, bigInteger, h11, bigInteger2));
    }

    public static g p(g gVar) {
        if (gVar.isValid()) {
            return gVar;
        }
        throw new IllegalArgumentException("Invalid point");
    }
}
