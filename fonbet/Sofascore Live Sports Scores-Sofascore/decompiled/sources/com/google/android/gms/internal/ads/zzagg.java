package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzagg {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, com.ironsource.mediationsdk.metadata.a.o, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static boolean a(String str) {
        return Objects.equals(str, MimeTypes.AUDIO_DTS) || Objects.equals(str, MimeTypes.AUDIO_DTS_HD);
    }

    public static int b(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(byte[] bArr) {
        int i2;
        int i3;
        byte b2;
        int i4;
        int i5;
        int i6;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i5 = (bArr[7] & 3) << 12;
                i6 = (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = (bArr[5] & 3) << 12;
                i3 = (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b2 = bArr[7];
            } else {
                i5 = (bArr[6] & 3) << 12;
                i6 = (bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b3 = bArr[8];
            }
            i4 = (((b3 & 60) >> 2) | i5 | i6) + 1;
            z = true;
            return !z ? (i4 * 16) / 14 : i4;
        }
        i2 = (bArr[4] & 3) << 12;
        i3 = (bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
        b2 = bArr[6];
        i4 = (((b2 & 240) >> 4) | i2 | i3) + 1;
        if (!z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0253, code lost:
    
        if ((r0.h(12) & androidx.core.app.NotificationCompat.FLAG_LOCAL_ONLY) != 0) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzagf d(byte[] bArr) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        String str;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zzet h2 = h(bArr);
        h2.f(40);
        int h3 = h2.h(2);
        boolean g2 = h2.g();
        int i16 = true != g2 ? 16 : 20;
        h2.f(true != g2 ? 8 : 12);
        int h4 = h2.h(i16) + 1;
        boolean g3 = h2.g();
        if (g3) {
            i4 = h2.h(2);
            int h5 = h2.h(3) + 1;
            if (h2.g()) {
                h2.f(36);
            }
            int h6 = h2.h(3) + 1;
            int h7 = h2.h(3) + 1;
            if (h6 != 1 || h7 != 1) {
                throw zzat.b("Multiple audio presentations or assets not supported");
            }
            int i17 = h3 + 1;
            int h8 = h2.h(i17);
            for (int i18 = 0; i18 < i17; i18++) {
                if (((h8 >> i18) & 1) == 1) {
                    h2.f(8);
                }
            }
            i2 = 0;
            z = h2.g();
            if (z) {
                h2.f(2);
                int h9 = (h2.h(2) + 1) << 2;
                int h10 = h2.h(2) + 1;
                iArr = new int[h10];
                for (int i19 = 0; i19 < h10; i19++) {
                    iArr[i19] = f(h2.h(h9));
                }
            } else {
                iArr = null;
            }
            i3 = h5 * 512;
        } else {
            i2 = 0;
            z = false;
            i3 = 0;
            i4 = -1;
            iArr = null;
        }
        h2.f(i16);
        h2.f(12);
        if (g3) {
            if (h2.g()) {
                h2.f(4);
            }
            if (h2.g()) {
                h2.f(24);
            }
            if (h2.g()) {
                h2.l(h2.h(10) + 1);
            }
            int i20 = 5;
            h2.f(5);
            i5 = d[h2.h(4)];
            int h11 = h2.h(8) + 1;
            if (h2.g()) {
                int g4 = h11 > 2 ? h2.g() : i2;
                int g5 = h11 > 6 ? h2.g() : i2;
                if (h2.g()) {
                    i8 = 1;
                    i15 = (h2.h(2) + 1) << 2;
                    h2.f(i15);
                } else {
                    i8 = 1;
                    i15 = i2;
                }
                i10 = 6;
                int h12 = h2.h(3);
                int[] iArr2 = new int[h12];
                for (int i21 = i2; i21 < h12; i21++) {
                    iArr2[i21] = h2.h(i15);
                }
                int i22 = i2;
                while (i22 < h12) {
                    int f2 = f(iArr2[i22]);
                    int i23 = i20;
                    int h13 = h2.h(i20) + 1;
                    int i24 = i2;
                    while (i24 < f2) {
                        h2.f(Integer.bitCount(h2.h(h13)) * 5);
                        i24++;
                        iArr2 = iArr2;
                    }
                    i22++;
                    i20 = i23;
                }
                i9 = i20;
                i12 = g4;
                i11 = g5;
            } else {
                i8 = 1;
                i9 = 5;
                i10 = 6;
                h2.f(3);
                int i25 = i2;
                i11 = i25 == true ? 1 : 0;
                i12 = i25;
            }
            boolean g6 = h2.g();
            if (g6) {
                h2.f(8);
            }
            if (h2.g()) {
                h2.f(i9);
            }
            if (g6 && i12 != 0) {
                h2.f(8);
            }
            if (z && h2.g()) {
                iArr.getClass();
                h2.f(7);
                if (h2.h(2) < 3) {
                    h2.f(3);
                } else {
                    h2.f(8);
                }
                boolean g7 = h2.g();
                int length = iArr.length;
                int i26 = i2;
                while (i26 < length) {
                    int i27 = iArr[i26];
                    if (g7) {
                        h2.f(i27 * 6);
                        i14 = i10;
                    } else {
                        i14 = i10;
                        h2.f(i14);
                    }
                    i26++;
                    i10 = i14;
                }
                int i28 = i10;
                int[] iArr3 = new int[3];
                iArr3[i2] = h11;
                if (i11 != 0) {
                    iArr3[i8] = i28;
                    i13 = 2;
                } else {
                    i13 = i8;
                }
                if (i12 != 0) {
                    iArr3[i13] = 2;
                    i13++;
                }
                int length2 = iArr.length;
                for (int i29 = i2; i29 < length2; i29++) {
                    int i30 = iArr[i29];
                    for (int i31 = i2; i31 < i13; i31++) {
                        int i32 = iArr3[i31];
                        int i33 = i2;
                        while (i33 < i32) {
                            h2.f(Integer.bitCount(h2.h(i30)) * 6);
                            i33++;
                            iArr3 = iArr3;
                        }
                    }
                }
            }
            int h14 = h2.h(2);
            String str2 = MimeTypes.AUDIO_DTS_HD;
            if (h14 != 0) {
                if (h14 != i8) {
                    if (h14 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(h14).length() + 42);
                        sb.append("Unsupported coding mode in DTS HD header: ");
                        sb.append(h14);
                        throw zzat.a(null, sb.toString());
                    }
                    str2 = MimeTypes.AUDIO_DTS_EXPRESS;
                }
                i6 = h11;
                str = str2;
            }
        } else {
            i5 = -2147483647;
            str = null;
            i6 = -1;
        }
        int i34 = i5;
        if (g3) {
            if (i4 == 0) {
                i7 = 32000;
            } else if (i4 == 1) {
                i7 = 44100;
            } else {
                if (i4 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 51);
                    sb2.append("Unsupported reference clock code in DTS HD header: ");
                    sb2.append(i4);
                    throw zzat.a(null, sb2.toString());
                }
                i7 = 48000;
            }
            j = zzfm.w(i3, 1000000L, i7, RoundingMode.DOWN);
        } else {
            j = C.TIME_UNSET;
        }
        return new zzagf(str, i6, i34, h4, j);
    }

    public static zzv e(zzagi zzagiVar, int i2, zzv zzvVar) {
        zzeu zzeuVar = new zzeu(i2);
        if (zzagiVar.f(zzeuVar.a, 0, i2, true)) {
            zzagiVar.zzl();
            int H = zzeuVar.H();
            if (b(H) == 1) {
                if (zzeuVar.B() >= 10) {
                    byte[] bArr = new byte[10];
                    zzeuVar.F(0, 10, bArr);
                    int c2 = c(bArr);
                    if (zzeuVar.c >= c2 + 4) {
                        zzeuVar.D(c2);
                        H = zzeuVar.H();
                    }
                }
            }
            if (b(H) == 2 && zzeuVar.B() >= 7) {
                int i3 = zzeuVar.b;
                byte[] bArr2 = new byte[7];
                zzeuVar.F(0, 7, bArr2);
                zzeuVar.D(i3);
                zzet h2 = h(bArr2);
                h2.f(42);
                int h3 = h2.h(true != h2.g() ? 8 : 12) + 1;
                if (h3 > 0 && zzeuVar.B() >= h3) {
                    byte[] bArr3 = new byte[h3];
                    zzeuVar.F(0, h3, bArr3);
                    String str = d(bArr3).a;
                    String str2 = zzvVar.o;
                    if (str == null) {
                        str = MimeTypes.AUDIO_DTS_HD;
                    }
                    if (!Objects.equals(str2, str)) {
                        zzt zztVar = new zzt(zzvVar);
                        zztVar.d(str);
                        return new zzv(zztVar);
                    }
                }
            }
        }
        return zzvVar;
    }

    public static int f(int i2) {
        int i3 = i2 & 1;
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & 128) != 0) {
            i3++;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & 1024) != 0) {
            i3 += 2;
        }
        if ((i2 & com.ironsource.mediationsdk.metadata.a.o) != 0) {
            i3 += 2;
        }
        if ((i2 & 4096) != 0) {
            i3++;
        }
        if ((i2 & 8192) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        return (i2 & 32768) != 0 ? i3 + 2 : i3;
    }

    public static int g(zzet zzetVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zzetVar.g(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return zzetVar.h(iArr[i2]) + i4;
    }

    public static zzet h(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zzet(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        int length = copyOf.length;
        zzet zzetVar = new zzet(copyOf, length);
        if (copyOf[0] == 31) {
            zzet zzetVar2 = new zzet(copyOf, length);
            while (zzetVar2.b() >= 16) {
                zzetVar2.f(2);
                int h2 = zzetVar2.h(14);
                int min = Math.min(8 - zzetVar.c, 14);
                int i4 = zzetVar.c;
                int i5 = (8 - i4) - min;
                byte[] bArr3 = zzetVar.a;
                int i6 = zzetVar.b;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - min;
                int i8 = h2 & 16383;
                bArr3[i6] = (byte) (b5 | ((i8 >>> i7) << i5));
                int i9 = i6 + 1;
                while (true) {
                    bArr2 = zzetVar.a;
                    if (i7 > 8) {
                        i7 -= 8;
                        bArr2[i9] = (byte) (i8 >>> i7);
                        i9++;
                    }
                }
                byte b6 = (byte) (bArr2[i9] & ((1 << r7) - 1));
                bArr2[i9] = b6;
                bArr2[i9] = (byte) (((i8 & ((1 << i7) - 1)) << (8 - i7)) | b6);
                zzetVar.f(14);
                zzetVar.m();
            }
        }
        int length2 = copyOf.length;
        zzetVar.a = copyOf;
        zzetVar.b = 0;
        zzetVar.c = 0;
        zzetVar.d = length2;
        return zzetVar;
    }
}
