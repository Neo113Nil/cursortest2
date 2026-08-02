package defpackage;

import com.google.android.gms.internal.ads.zzhfo;
import com.google.android.gms.internal.ads.zzhlx;
import com.google.android.gms.internal.ads.zzhmi;
import com.google.android.gms.internal.ads.zzhmp;
import com.google.android.gms.internal.ads.zzhpd;
import com.google.android.gms.internal.ads.zziat;
import com.google.android.gms.internal.ads.zzibh;
import com.inmobi.media.core.config.models.AdConfig;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class poo implements zzhfo {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public poo(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!zzhlx.a(1)) {
            yhk.q(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
            throw null;
        }
        if (bArr.length != 32) {
            a70.p("Given public key's length is not 32.");
            throw null;
        }
        this.a = (byte[]) bArr.clone();
        this.b = bArr2;
        this.c = bArr3;
        if (wmo.a != null) {
            return;
        }
        a70.r("Could not initialize Ed25519.");
        throw null;
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            zzl.x("The length of the signature is not 64.");
            return;
        }
        if (bArr.length == 64) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, 64);
            int i = 31;
            int i2 = 31;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                int i3 = copyOfRange[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i4 = zzhmi.c[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i3 == i4) {
                    i2--;
                    i = i;
                } else if (i3 < i4) {
                    MessageDigest messageDigest = (MessageDigest) zzibh.e.a.zza("SHA-512");
                    messageDigest.update(bArr, 0, 32);
                    byte[] bArr3 = this.a;
                    messageDigest.update(bArr3);
                    messageDigest.update(bArr2);
                    byte[] digest = messageDigest.digest();
                    long j = zzhmi.j(0, digest) & 2097151;
                    long k = zzhmi.k(2, digest) >> 5;
                    long j2 = zzhmi.j(5, digest) >> 2;
                    long k2 = zzhmi.k(7, digest) >> 7;
                    long k3 = zzhmi.k(10, digest) >> 4;
                    long j3 = zzhmi.j(13, digest) >> 1;
                    long k4 = zzhmi.k(15, digest) >> 6;
                    long j4 = zzhmi.j(18, digest) >> 3;
                    long j5 = zzhmi.j(21, digest) & 2097151;
                    long k5 = zzhmi.k(23, digest) >> 5;
                    long j6 = zzhmi.j(26, digest) >> 2;
                    long k6 = zzhmi.k(28, digest) >> 7;
                    long k7 = zzhmi.k(i, digest) >> 4;
                    int i5 = i;
                    long j7 = zzhmi.j(34, digest) >> 1;
                    long k8 = zzhmi.k(36, digest) >> 6;
                    long j8 = zzhmi.j(39, digest) >> 3;
                    long j9 = zzhmi.j(42, digest) & 2097151;
                    long k9 = zzhmi.k(44, digest) >> 5;
                    long j10 = (zzhmi.j(47, digest) >> 2) & 2097151;
                    long k10 = (zzhmi.k(49, digest) >> 7) & 2097151;
                    long k11 = (zzhmi.k(52, digest) >> 4) & 2097151;
                    long j11 = (zzhmi.j(55, digest) >> 1) & 2097151;
                    long k12 = (zzhmi.k(57, digest) >> 6) & 2097151;
                    long k13 = zzhmi.k(60, digest) >> 3;
                    long j12 = (k11 * 666643) + j5;
                    long j13 = (k10 * 666643) + j4;
                    long j14 = (j10 * 666643) + (k4 & 2097151);
                    long j15 = (j14 + 1048576) >> 21;
                    long j16 = j15 << 21;
                    long j17 = (j10 * 654183) + (k10 * 470296) + j12;
                    long j18 = (j17 + 1048576) >> 21;
                    long j19 = (j10 * 136657) + (((k11 * 654183) + ((j11 * 470296) + ((k12 * 666643) + (j6 & 2097151)))) - (k10 * 997805));
                    long j20 = (j19 + 1048576) >> 21;
                    long j21 = j20 << 21;
                    long j22 = ((k11 * 136657) + (((k12 * 654183) + ((k13 * 470296) + (k7 & 2097151))) - (j11 * 997805))) - (k10 * 683901);
                    long j23 = (j22 + 1048576) >> 21;
                    long j24 = ((k12 * 136657) + ((k8 & 2097151) - (k13 * 997805))) - (j11 * 683901);
                    long j25 = (j24 + 1048576) >> 21;
                    long j26 = j9 - (k13 * 683901);
                    long j27 = (j26 + 1048576) >> 21;
                    long d = ceo.d(j10, 470296L, j13, j15);
                    long j28 = (d + 1048576) >> 21;
                    long j29 = j28 << 21;
                    long j30 = (((k10 * 654183) + ((k11 * 470296) + ((j11 * 666643) + (k5 & 2097151)))) - (j10 * 997805)) + j18;
                    long j31 = (j30 + 1048576) >> 21;
                    long j32 = j31 << 21;
                    long j33 = (((k10 * 136657) + (((j11 * 654183) + ((k12 * 470296) + ((k13 * 666643) + (k6 & 2097151)))) - (k11 * 997805))) - (j10 * 683901)) + j20;
                    long j34 = (j33 + 1048576) >> 21;
                    long j35 = j34 << 21;
                    long j36 = (((j11 * 136657) + (((k13 * 654183) + (j7 & 2097151)) - (k12 * 997805))) - (k11 * 683901)) + j23;
                    long j37 = (j36 + 1048576) >> 21;
                    long j38 = (((k13 * 136657) + j8) - (k12 * 683901)) + j25;
                    long j39 = (j38 + 1048576) >> 21;
                    long j40 = (j22 - (j23 << 21)) + j34;
                    long j41 = (j40 * 666643) + j;
                    long j42 = (j41 + 1048576) >> 21;
                    long j43 = j42 << 21;
                    long j44 = (j24 - (j25 << 21)) + j37;
                    long j45 = j36 - (j37 << 21);
                    long j46 = (j40 * 654183) + (j45 * 470296) + (j44 * 666643) + (j2 & 2097151);
                    long j47 = (j46 + 1048576) >> 21;
                    long j48 = j47 << 21;
                    long j49 = (j26 - (j27 << 21)) + j39;
                    long j50 = j38 - (j39 << 21);
                    long j51 = (j40 * 136657) + (((j44 * 654183) + ((j50 * 470296) + ((j49 * 666643) + (k3 & 2097151)))) - (j45 * 997805));
                    long j52 = (j51 + 1048576) >> 21;
                    long j53 = j52 << 21;
                    long j54 = (k9 & 2097151) + j27;
                    long j55 = ((j44 * 136657) + (((j49 * 654183) + ((j54 * 470296) + (j14 - j16))) - (j50 * 997805))) - (j45 * 683901);
                    long j56 = (j55 + 1048576) >> 21;
                    long j57 = j56 << 21;
                    long j58 = ((j49 * 136657) + (((j17 - (j18 << 21)) + j28) - (j54 * 997805))) - (j50 * 683901);
                    long j59 = (j58 + 1048576) >> 21;
                    long j60 = ((j19 - j21) + j31) - (j54 * 683901);
                    long j61 = (j60 + 1048576) >> 21;
                    long j62 = j61 << 21;
                    long d2 = ceo.d(j40, 470296L, (j45 * 666643) + (k & 2097151), j42);
                    long j63 = (d2 + 1048576) >> 21;
                    long j64 = (((j45 * 654183) + ((j44 * 470296) + ((j50 * 666643) + (k2 & 2097151)))) - (j40 * 997805)) + j47;
                    long j65 = (j64 + 1048576) >> 21;
                    long j66 = (((j45 * 136657) + (((j50 * 654183) + ((j49 * 470296) + ((j54 * 666643) + (j3 & 2097151)))) - (j44 * 997805))) - (j40 * 683901)) + j52;
                    long j67 = (j66 + 1048576) >> 21;
                    long j68 = (((j50 * 136657) + (((j54 * 654183) + (d - j29)) - (j49 * 997805))) - (j44 * 683901)) + j56;
                    long j69 = (j68 + 1048576) >> 21;
                    long j70 = (((j54 * 136657) + (j30 - j32)) - (j49 * 683901)) + j59;
                    long j71 = (j70 + 1048576) >> 21;
                    long j72 = (j33 - j35) + j61;
                    long j73 = (j72 + 1048576) >> 21;
                    long j74 = (j73 * 666643) + (j41 - j43);
                    long j75 = j74 >> 21;
                    long d3 = ceo.d(j73, 470296L, d2 - (j63 << 21), j75);
                    long j76 = d3 >> 21;
                    long d4 = ceo.d(j73, 654183L, (j46 - j48) + j63, j76);
                    long j77 = d4 >> 21;
                    long j78 = ((j64 - (j65 << 21)) - (j73 * 997805)) + j77;
                    long j79 = j78 >> 21;
                    long d5 = ceo.d(j73, 136657L, (j51 - j53) + j65, j79);
                    long j80 = d5 >> 21;
                    long j81 = j80 << 21;
                    long j82 = ((j66 - (j67 << 21)) - (j73 * 683901)) + j80;
                    long j83 = j82 >> 21;
                    long j84 = j83 << 21;
                    long j85 = (j55 - j57) + j67 + j83;
                    long j86 = j85 >> 21;
                    long j87 = j86 << 21;
                    long j88 = (j68 - (j69 << 21)) + j86;
                    long j89 = j88 >> 21;
                    long j90 = j89 << 21;
                    long j91 = (j58 - (j59 << 21)) + j69 + j89;
                    long j92 = j91 >> 21;
                    long j93 = j92 << 21;
                    long j94 = (j70 - (j71 << 21)) + j92;
                    long j95 = j94 >> 21;
                    long j96 = j95 << 21;
                    long j97 = (j60 - j62) + j71 + j95;
                    long j98 = j97 >> 21;
                    long j99 = (j72 - (j73 << 21)) + j98;
                    long j100 = j99 >> 21;
                    long j101 = (666643 * j100) + (j74 - (j75 << 21));
                    long j102 = j101 >> 21;
                    long d6 = ceo.d(j100, 470296L, d3 - (j76 << 21), j102);
                    long j103 = d6 >> 21;
                    long d7 = ceo.d(j100, 654183L, d4 - (j77 << 21), j103);
                    long j104 = d7 >> 21;
                    long j105 = j104 << 21;
                    long j106 = ((j78 - (j79 << 21)) - (997805 * j100)) + j104;
                    long j107 = j106 >> 21;
                    long d8 = ceo.d(j100, 136657L, d5 - j81, j107);
                    long j108 = d8 >> 21;
                    long j109 = j108 << 21;
                    long j110 = ((j82 - j84) - (j100 * 683901)) + j108;
                    long j111 = j110 >> 21;
                    long j112 = j111 << 21;
                    long j113 = (j85 - j87) + j111;
                    long j114 = j113 >> 21;
                    long j115 = j114 << 21;
                    long j116 = (j88 - j90) + j114;
                    long j117 = j116 >> 21;
                    long j118 = j117 << 21;
                    long j119 = (j91 - j93) + j117;
                    long j120 = j119 >> 21;
                    long j121 = j120 << 21;
                    long j122 = (j94 - j96) + j120;
                    long j123 = j122 >> 21;
                    long j124 = j123 << 21;
                    long j125 = (j97 - (j98 << 21)) + j123;
                    long j126 = j125 >> 21;
                    digest[0] = (byte) (j101 - (j102 << 21));
                    long j127 = j116 - j118;
                    long j128 = j113 - j115;
                    long j129 = j110 - j112;
                    long j130 = d8 - j109;
                    long j131 = j106 - (j107 << 21);
                    long j132 = d7 - j105;
                    long j133 = d6 - (j103 << 21);
                    digest[1] = (byte) (r1 >> 8);
                    digest[2] = (byte) ((r1 >> 16) | (j133 << 5));
                    digest[3] = (byte) (j133 >> 3);
                    digest[4] = (byte) (j133 >> 11);
                    digest[5] = (byte) ((j133 >> 19) | (j132 << 2));
                    digest[6] = (byte) (j132 >> 6);
                    digest[7] = (byte) ((j132 >> 14) | (j131 << 7));
                    digest[8] = (byte) (j131 >> 1);
                    digest[9] = (byte) (j131 >> 9);
                    digest[10] = (byte) ((j131 >> 17) | (j130 << 4));
                    digest[11] = (byte) (j130 >> 4);
                    digest[12] = (byte) (j130 >> 12);
                    digest[13] = (byte) ((j130 >> 20) | (j129 + j129));
                    digest[14] = (byte) (j129 >> 7);
                    digest[15] = (byte) ((j129 >> 15) | (j128 << 6));
                    digest[16] = (byte) (j128 >> 2);
                    digest[17] = (byte) (j128 >> 10);
                    digest[18] = (byte) ((j128 >> 18) | (j127 << 3));
                    long j134 = j125 - (j126 << 21);
                    long j135 = (j99 - (j100 << 21)) + j126;
                    long j136 = j122 - j124;
                    digest[19] = (byte) (j127 >> 5);
                    digest[20] = (byte) (j127 >> 13);
                    digest[21] = (byte) (j119 - j121);
                    digest[22] = (byte) (r3 >> 8);
                    digest[23] = (byte) ((r3 >> 16) | (j136 << 5));
                    digest[24] = (byte) (j136 >> 3);
                    digest[25] = (byte) (j136 >> 11);
                    digest[26] = (byte) ((j136 >> 19) | (j134 << 2));
                    digest[27] = (byte) (j134 >> 6);
                    digest[28] = (byte) ((j134 >> 14) | (j135 << 7));
                    digest[29] = (byte) (j135 >> 1);
                    digest[30] = (byte) (j135 >> 9);
                    digest[i5] = (byte) (j135 >> 17);
                    long[] jArr = new long[10];
                    long[] g = zzhmp.g(bArr3);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    zzhmp.f(jArr4, g);
                    zzhmp.e(jArr5, jArr4, wmo.a);
                    zzhmp.b(jArr4, jArr4, jArr2);
                    zzhmp.a(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    zzhmp.f(jArr8, jArr5);
                    zzhmp.e(jArr8, jArr8, jArr5);
                    zzhmp.f(jArr, jArr8);
                    zzhmp.e(jArr, jArr, jArr5);
                    zzhmp.e(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    zzhmp.f(jArr9, jArr);
                    zzhmp.f(jArr10, jArr9);
                    zzhmp.f(jArr10, jArr10);
                    zzhmp.e(jArr10, jArr, jArr10);
                    zzhmp.e(jArr9, jArr9, jArr10);
                    zzhmp.f(jArr9, jArr9);
                    zzhmp.e(jArr9, jArr10, jArr9);
                    zzhmp.f(jArr10, jArr9);
                    for (int i6 = 1; i6 < 5; i6++) {
                        zzhmp.f(jArr10, jArr10);
                    }
                    zzhmp.e(jArr9, jArr10, jArr9);
                    zzhmp.f(jArr10, jArr9);
                    for (int i7 = 1; i7 < 10; i7++) {
                        zzhmp.f(jArr10, jArr10);
                    }
                    zzhmp.e(jArr10, jArr10, jArr9);
                    zzhmp.f(jArr11, jArr10);
                    for (int i8 = 1; i8 < 20; i8++) {
                        zzhmp.f(jArr11, jArr11);
                    }
                    zzhmp.e(jArr10, jArr11, jArr10);
                    zzhmp.f(jArr10, jArr10);
                    for (int i9 = 1; i9 < 10; i9++) {
                        zzhmp.f(jArr10, jArr10);
                    }
                    zzhmp.e(jArr9, jArr10, jArr9);
                    zzhmp.f(jArr10, jArr9);
                    for (int i10 = 1; i10 < 50; i10++) {
                        zzhmp.f(jArr10, jArr10);
                    }
                    zzhmp.e(jArr10, jArr10, jArr9);
                    zzhmp.f(jArr11, jArr10);
                    for (int i11 = 1; i11 < 100; i11++) {
                        zzhmp.f(jArr11, jArr11);
                    }
                    zzhmp.e(jArr10, jArr11, jArr10);
                    zzhmp.f(jArr10, jArr10);
                    for (int i12 = 1; i12 < 50; i12++) {
                        zzhmp.f(jArr10, jArr10);
                    }
                    zzhmp.e(jArr9, jArr10, jArr9);
                    zzhmp.f(jArr9, jArr9);
                    zzhmp.f(jArr9, jArr9);
                    zzhmp.e(jArr, jArr9, jArr);
                    zzhmp.e(jArr, jArr, jArr8);
                    zzhmp.e(jArr, jArr, jArr4);
                    zzhmp.f(jArr6, jArr);
                    zzhmp.e(jArr6, jArr6, jArr5);
                    zzhmp.b(jArr7, jArr6, jArr4);
                    if (zzhmi.c(jArr7)) {
                        zzhmp.a(jArr7, jArr6, jArr4);
                        if (zzhmi.c(jArr7)) {
                            zzl.x("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                            return;
                        }
                        zzhmp.e(jArr, jArr, wmo.c);
                    }
                    if (!zzhmi.c(jArr) && ((bArr3[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7) != 0) {
                        zzl.x("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                        return;
                    }
                    int i13 = 255;
                    if ((zzhmp.h(jArr)[0] & 1) == ((bArr3[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7)) {
                        for (int i14 = 0; i14 < 10; i14++) {
                            jArr[i14] = -jArr[i14];
                        }
                    }
                    zzhmp.e(jArr3, jArr, g);
                    x6k x6kVar = new x6k(28, jArr, g, jArr2);
                    umo[] umoVarArr = new umo[8];
                    umoVarArr[0] = new umo(new vmo(x6kVar, jArr3));
                    vmo vmoVar = new vmo(new x6k(28), new long[10]);
                    zzhmi.f(x6kVar, vmoVar);
                    vmo vmoVar2 = new vmo(vmoVar);
                    for (int i15 = 1; i15 < 8; i15++) {
                        zzhmi.d(vmoVar, vmoVar2, umoVarArr[i15 - 1]);
                        umoVarArr[i15] = new umo(new vmo(vmoVar));
                    }
                    byte[] i16 = zzhmi.i(digest);
                    byte[] i17 = zzhmi.i(copyOfRange);
                    vmo vmoVar3 = new vmo(0);
                    vmo vmoVar4 = new vmo(1);
                    while (i13 >= 0 && i16[i13] == 0 && i17[i13] == 0) {
                        i13--;
                    }
                    while (i13 >= 0) {
                        zzhmi.f(new x6k(vmoVar3), vmoVar3);
                        byte b = i16[i13];
                        if (b > 0) {
                            vmo.a(vmoVar4, vmoVar3);
                            zzhmi.d(vmoVar3, vmoVar4, umoVarArr[i16[i13] / 2]);
                        } else if (b < 0) {
                            vmo.a(vmoVar4, vmoVar3);
                            zzhmi.e(vmoVar3, vmoVar4, umoVarArr[(-i16[i13]) / 2]);
                        }
                        byte b2 = i17[i13];
                        if (b2 > 0) {
                            vmo.a(vmoVar4, vmoVar3);
                            zzhmi.d(vmoVar3, vmoVar4, wmo.e[i17[i13] / 2]);
                        } else if (b2 < 0) {
                            vmo.a(vmoVar4, vmoVar3);
                            zzhmi.e(vmoVar3, vmoVar4, wmo.e[(-i17[i13]) / 2]);
                        }
                        i13--;
                    }
                    byte[] E = new x6k(vmoVar3).E();
                    for (int i18 = 0; i18 < 32; i18++) {
                        if (E[i18] == bArr[i18]) {
                        }
                    }
                    return;
                }
            }
        }
        zzl.x("Signature check failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        byte[] bArr4 = this.c;
        if (length == 0 && bArr4.length == 0) {
            a(bArr, bArr2);
        } else {
            if (!zzhpd.c(bArr3, bArr)) {
                zzl.x("Invalid signature (output prefix mismatch)");
                return;
            }
            if (bArr4.length != 0) {
                bArr2 = zziat.a(bArr2, bArr4);
            }
            a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
