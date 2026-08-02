package com.google.zxing.qrcode.encoder;

import Qb.c;
import com.google.zxing.h;
import com.plaid.internal.EnumC3631g;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.UByte;
import org.bouncycastle.i18n.LocalizedMessage;

/* loaded from: classes3.dex */
public abstract class c {
    private static final int[] ALPHANUMERIC_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[Qb.b.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[Qb.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Qb.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Qb.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Qb.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, Lb.a aVar, String str2) {
        try {
            for (byte b10 : str.getBytes(str2)) {
                aVar.c(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new h(e10);
        }
    }

    public static void b(CharSequence charSequence, Lb.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int p10 = p(charSequence.charAt(i10));
            if (p10 == -1) {
                throw new h();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int p11 = p(charSequence.charAt(i11));
                if (p11 == -1) {
                    throw new h();
                }
                aVar.c((p10 * 45) + p11, 11);
                i10 += 2;
            } else {
                aVar.c(p10, 6);
                i10 = i11;
            }
        }
    }

    public static void c(String str, Qb.b bVar, Lb.a aVar, String str2) {
        int i10 = a.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else {
            if (i10 != 4) {
                throw new h("Invalid mode: ".concat(String.valueOf(bVar)));
            }
            e(str, aVar);
        }
    }

    public static void d(Lb.c cVar, Lb.a aVar) {
        aVar.c(Qb.b.ECI.a(), 4);
        aVar.c(cVar.b(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:4:0x0008->B:11:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, Lb.a aVar) {
        int i10;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = ((bytes[i11] & UByte.MAX_VALUE) << 8) | (bytes[i11 + 1] & UByte.MAX_VALUE);
                int i13 = 33088;
                if (i12 < 33088 || i12 > 40956) {
                    if (i12 < 57408 || i12 > 60351) {
                        i10 = -1;
                        if (i10 != -1) {
                            throw new h("Invalid byte sequence");
                        }
                        aVar.c(((i10 >> 8) * 192) + (i10 & 255), 13);
                    } else {
                        i13 = 49472;
                    }
                }
                i10 = i12 - i13;
                if (i10 != -1) {
                }
            }
        } catch (UnsupportedEncodingException e10) {
            throw new h(e10);
        }
    }

    public static void f(int i10, Qb.c cVar, Qb.b bVar, Lb.a aVar) {
        int b10 = bVar.b(cVar);
        int i11 = 1 << b10;
        if (i10 < i11) {
            aVar.c(i10, b10);
            return;
        }
        throw new h(i10 + " is bigger than " + (i11 - 1));
    }

    public static void g(Qb.b bVar, Lb.a aVar) {
        aVar.c(bVar.a(), 4);
    }

    public static void h(CharSequence charSequence, Lb.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(charAt, 4);
                }
            }
        }
    }

    public static int i(Qb.b bVar, Lb.a aVar, Lb.a aVar2, Qb.c cVar) {
        return aVar.g() + bVar.b(cVar) + aVar2.g();
    }

    public static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    public static int k(Lb.a aVar, Qb.a aVar2, Qb.c cVar, b bVar) {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    public static Qb.b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return Qb.b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else {
                if (p(charAt) == -1) {
                    return Qb.b.BYTE;
                }
                z10 = true;
            }
        }
        return z10 ? Qb.b.ALPHANUMERIC : z11 ? Qb.b.NUMERIC : Qb.b.BYTE;
    }

    public static Qb.c m(int i10, Qb.a aVar) {
        for (int i11 = 1; i11 <= 40; i11++) {
            Qb.c e10 = Qb.c.e(i11);
            if (v(i10, e10, aVar)) {
                return e10;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f n(String str, Qb.a aVar, Map map) {
        Qb.c t10;
        Lb.c a10;
        boolean z10 = map != null && map.containsKey(com.google.zxing.c.CHARACTER_SET);
        String obj = z10 ? map.get(com.google.zxing.c.CHARACTER_SET).toString() : LocalizedMessage.DEFAULT_ENCODING;
        Qb.b l10 = l(str, obj);
        Lb.a aVar2 = new Lb.a();
        Qb.b bVar = Qb.b.BYTE;
        if (l10 == bVar && z10 && (a10 = Lb.c.a(obj)) != null) {
            d(a10, aVar2);
        }
        if (map != null) {
            com.google.zxing.c cVar = com.google.zxing.c.GS1_FORMAT;
            if (map.containsKey(cVar) && Boolean.valueOf(map.get(cVar).toString()).booleanValue()) {
                g(Qb.b.FNC1_FIRST_POSITION, aVar2);
            }
        }
        g(l10, aVar2);
        Lb.a aVar3 = new Lb.a();
        c(str, l10, aVar3, obj);
        if (map != null) {
            com.google.zxing.c cVar2 = com.google.zxing.c.QR_VERSION;
            if (map.containsKey(cVar2)) {
                t10 = Qb.c.e(Integer.parseInt(map.get(cVar2).toString()));
                if (!v(i(l10, aVar2, aVar3, t10), t10, aVar)) {
                    throw new h("Data too big for requested version");
                }
                Lb.a aVar4 = new Lb.a();
                aVar4.b(aVar2);
                f(l10 != bVar ? aVar3.h() : str.length(), t10, l10, aVar4);
                aVar4.b(aVar3);
                c.b c10 = t10.c(aVar);
                int d10 = t10.d() - c10.d();
                u(d10, aVar4);
                Lb.a r10 = r(aVar4, t10.d(), d10, c10.c());
                f fVar = new f();
                fVar.c(aVar);
                fVar.f(l10);
                fVar.g(t10);
                int b10 = t10.b();
                b bVar2 = new b(b10, b10);
                int k10 = k(r10, aVar, t10, bVar2);
                fVar.d(k10);
                e.a(r10, aVar, t10, k10, bVar2);
                fVar.e(bVar2);
                return fVar;
            }
        }
        t10 = t(aVar, l10, aVar2, aVar3);
        Lb.a aVar42 = new Lb.a();
        aVar42.b(aVar2);
        f(l10 != bVar ? aVar3.h() : str.length(), t10, l10, aVar42);
        aVar42.b(aVar3);
        c.b c102 = t10.c(aVar);
        int d102 = t10.d() - c102.d();
        u(d102, aVar42);
        Lb.a r102 = r(aVar42, t10.d(), d102, c102.c());
        f fVar2 = new f();
        fVar2.c(aVar);
        fVar2.f(l10);
        fVar2.g(t10);
        int b102 = t10.b();
        b bVar22 = new b(b102, b102);
        int k102 = k(r102, aVar, t10, bVar22);
        fVar2.d(k102);
        e.a(r102, aVar, t10, k102, bVar22);
        fVar2.e(bVar22);
        return fVar2;
    }

    public static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & UByte.MAX_VALUE;
        }
        new Mb.c(Mb.a.f7598j).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    public static int p(int i10) {
        int[] iArr = ALPHANUMERIC_TABLE;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 >= i12) {
            throw new h("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new h("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new h("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new h("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    public static Lb.a r(Lb.a aVar, int i10, int i11, int i12) {
        if (aVar.h() != i11) {
            throw new h("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < i12) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i17 = i10;
            int i18 = i11;
            int i19 = i12;
            q(i17, i18, i19, i13, iArr, iArr2);
            int i20 = iArr[0];
            byte[] bArr = new byte[i20];
            aVar.j(i14 << 3, bArr, 0, i20);
            byte[] o10 = o(bArr, iArr2[0]);
            arrayList.add(new com.google.zxing.qrcode.encoder.a(bArr, o10));
            i15 = Math.max(i15, i20);
            i16 = Math.max(i16, o10.length);
            i14 += iArr[0];
            i13++;
            i10 = i17;
            i11 = i18;
            i12 = i19;
        }
        int i21 = i10;
        if (i11 != i14) {
            throw new h("Data bytes does not match offset");
        }
        Lb.a aVar2 = new Lb.a();
        for (int i22 = 0; i22 < i15; i22++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] a10 = ((com.google.zxing.qrcode.encoder.a) it.next()).a();
                if (i22 < a10.length) {
                    aVar2.c(a10[i22], 8);
                }
            }
        }
        for (int i23 = 0; i23 < i16; i23++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] b10 = ((com.google.zxing.qrcode.encoder.a) it2.next()).b();
                if (i23 < b10.length) {
                    aVar2.c(b10[i23], 8);
                }
            }
        }
        if (i21 == aVar2.h()) {
            return aVar2;
        }
        throw new h("Interleaving error: " + i21 + " and " + aVar2.h() + " differ.");
    }

    public static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & UByte.MAX_VALUE;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static Qb.c t(Qb.a aVar, Qb.b bVar, Lb.a aVar2, Lb.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, Qb.c.e(1)), aVar)), aVar);
    }

    public static void u(int i10, Lb.a aVar) {
        int i11 = i10 << 3;
        if (aVar.g() > i11) {
            throw new h("data bits cannot fit in the QR Code" + aVar.g() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.g() < i11; i12++) {
            aVar.a(false);
        }
        int g10 = aVar.g() & 7;
        if (g10 > 0) {
            while (g10 < 8) {
                aVar.a(false);
                g10++;
            }
        }
        int h10 = i10 - aVar.h();
        for (int i13 = 0; i13 < h10; i13++) {
            aVar.c((i13 & 1) == 0 ? EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE : 17, 8);
        }
        if (aVar.g() != i11) {
            throw new h("Bits size does not equal capacity");
        }
    }

    public static boolean v(int i10, Qb.c cVar, Qb.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8;
    }
}
