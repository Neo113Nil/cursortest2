package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.tmo;
import defpackage.vmo;
import defpackage.wmo;
import defpackage.x6k;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhmi {
    public static final tmo a = new tmo(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final vmo b = new vmo(new x6k(28, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] a(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        vmo vmoVar = new vmo(0);
        vmo vmoVar2 = new vmo(1);
        for (i = 1; i < 64; i += 2) {
            tmo tmoVar = new tmo();
            h(tmoVar, i / 2, bArr2[i]);
            vmo.a(vmoVar2, vmoVar);
            d(vmoVar, vmoVar2, tmoVar);
        }
        x6k x6kVar = new x6k(28);
        x6k.C(x6kVar, vmoVar);
        f(x6kVar, vmoVar);
        x6k.C(x6kVar, vmoVar);
        f(x6kVar, vmoVar);
        x6k.C(x6kVar, vmoVar);
        f(x6kVar, vmoVar);
        x6k.C(x6kVar, vmoVar);
        f(x6kVar, vmoVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            tmo tmoVar2 = new tmo();
            h(tmoVar2, i7 / 2, bArr2[i7]);
            vmo.a(vmoVar2, vmoVar);
            d(vmoVar, vmoVar2, tmoVar2);
        }
        x6k x6kVar2 = new x6k(vmoVar);
        long[] jArr = new long[10];
        zzhmp.f(jArr, (long[]) x6kVar2.b);
        long[] jArr2 = new long[10];
        zzhmp.f(jArr2, (long[]) x6kVar2.c);
        long[] jArr3 = new long[10];
        zzhmp.f(jArr3, (long[]) x6kVar2.d);
        long[] jArr4 = new long[10];
        zzhmp.f(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhmp.b(jArr5, jArr2, jArr);
        zzhmp.e(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhmp.e(jArr6, jArr, jArr2);
        zzhmp.e(jArr6, jArr6, wmo.a);
        zzhmp.a(jArr6, jArr6, jArr4);
        zzhmp.c(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhmp.h(jArr5), zzhmp.h(jArr6))) {
            return x6kVar2.E();
        }
        a70.r("arithmetic error in scalar multiplication");
        return null;
    }

    public static byte[] b(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) zzibh.e.a.zza("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static /* synthetic */ boolean c(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhmp.d(jArr2);
        byte[] h = zzhmp.h(jArr2);
        for (int i = 0; i < 32; i++) {
            if (h[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void d(vmo vmoVar, vmo vmoVar2, tmo tmoVar) {
        x6k x6kVar = vmoVar2.a;
        x6k x6kVar2 = vmoVar.a;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) x6kVar2.b;
        long[] jArr3 = (long[]) x6kVar.c;
        long[] jArr4 = (long[]) x6kVar.b;
        zzhmp.a(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) x6kVar2.c;
        zzhmp.b(jArr5, jArr3, jArr4);
        zzhmp.e(jArr5, jArr5, tmoVar.b);
        long[] jArr6 = tmoVar.a;
        long[] jArr7 = (long[]) x6kVar2.d;
        zzhmp.e(jArr7, jArr2, jArr6);
        long[] jArr8 = vmoVar.b;
        zzhmp.e(jArr8, vmoVar2.b, tmoVar.c);
        tmoVar.a(jArr2, (long[]) x6kVar.d);
        zzhmp.a(jArr, jArr2, jArr2);
        zzhmp.b(jArr2, jArr7, jArr5);
        zzhmp.a(jArr5, jArr7, jArr5);
        zzhmp.a(jArr7, jArr, jArr8);
        zzhmp.b(jArr8, jArr, jArr8);
    }

    public static void e(vmo vmoVar, vmo vmoVar2, tmo tmoVar) {
        x6k x6kVar = vmoVar2.a;
        x6k x6kVar2 = vmoVar.a;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) x6kVar2.b;
        long[] jArr3 = (long[]) x6kVar.c;
        long[] jArr4 = (long[]) x6kVar.b;
        zzhmp.a(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) x6kVar2.c;
        zzhmp.b(jArr5, jArr3, jArr4);
        zzhmp.e(jArr5, jArr5, tmoVar.a);
        long[] jArr6 = tmoVar.b;
        long[] jArr7 = (long[]) x6kVar2.d;
        zzhmp.e(jArr7, jArr2, jArr6);
        long[] jArr8 = vmoVar.b;
        zzhmp.e(jArr8, vmoVar2.b, tmoVar.c);
        tmoVar.a(jArr2, (long[]) x6kVar.d);
        zzhmp.a(jArr, jArr2, jArr2);
        zzhmp.b(jArr2, jArr7, jArr5);
        zzhmp.a(jArr5, jArr7, jArr5);
        zzhmp.b(jArr7, jArr, jArr8);
        zzhmp.a(jArr8, jArr, jArr8);
    }

    public static void f(x6k x6kVar, vmo vmoVar) {
        x6k x6kVar2 = vmoVar.a;
        long[] jArr = (long[]) x6kVar2.b;
        long[] jArr2 = (long[]) x6kVar.b;
        long[] jArr3 = new long[10];
        zzhmp.f(jArr, jArr2);
        long[] jArr4 = (long[]) x6kVar2.d;
        long[] jArr5 = (long[]) x6kVar.c;
        zzhmp.f(jArr4, jArr5);
        long[] jArr6 = vmoVar.b;
        zzhmp.f(jArr6, (long[]) x6kVar.d);
        zzhmp.a(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) x6kVar2.c;
        zzhmp.a(jArr7, jArr2, jArr5);
        zzhmp.f(jArr3, jArr7);
        zzhmp.a(jArr7, jArr4, jArr);
        zzhmp.b(jArr4, jArr4, jArr);
        zzhmp.b(jArr, jArr3, jArr7);
        zzhmp.b(jArr6, jArr6, jArr4);
    }

    public static int g(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    public static void h(tmo tmoVar, int i, byte b2) {
        tmo[][] tmoVarArr = wmo.d;
        tmo tmoVar2 = tmoVarArr[i][0];
        int i2 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        tmoVar.b(tmoVar2, g(i4, 1));
        tmoVar.b(tmoVarArr[i][1], g(i4, 2));
        tmoVar.b(tmoVarArr[i][2], g(i4, 3));
        tmoVar.b(tmoVarArr[i][3], g(i4, 4));
        tmoVar.b(tmoVarArr[i][4], g(i4, 5));
        tmoVar.b(tmoVarArr[i][5], g(i4, 6));
        tmoVar.b(tmoVarArr[i][6], g(i4, 7));
        tmoVar.b(tmoVarArr[i][7], g(i4, 8));
        long[] jArr = tmoVar.c;
        long[] jArr2 = tmoVar.a;
        long[] jArr3 = tmoVar.b;
        long[] copyOf = Arrays.copyOf(jArr3, 10);
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = Arrays.copyOf(jArr, 10);
        for (int i5 = 0; i5 < copyOf3.length; i5++) {
            copyOf3[i5] = -copyOf3[i5];
        }
        zzhmc.a(jArr2, copyOf, i2);
        zzhmc.a(jArr3, copyOf2, i2);
        zzhmc.a(jArr, copyOf3, i2);
    }

    public static byte[] i(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b3 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long j(int i, byte[] bArr) {
        return ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static long k(int i, byte[] bArr) {
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | j(i, bArr);
    }
}
