package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class yl0 {
    public static final byte[] a;

    static {
        int i = lik.a;
        a = "OpusHead".getBytes(xp2.c);
    }

    public static vl0 a(int i, nkk nkkVar) {
        nkkVar.E(i + 12);
        nkkVar.F(1);
        b(nkkVar);
        nkkVar.F(2);
        int s = nkkVar.s();
        if ((s & 128) != 0) {
            nkkVar.F(2);
        }
        if ((s & 64) != 0) {
            nkkVar.F(nkkVar.s());
        }
        if ((s & 32) != 0) {
            nkkVar.F(2);
        }
        nkkVar.F(1);
        b(nkkVar);
        String c = rjc.c(nkkVar.s());
        if (MimeTypes.AUDIO_MPEG.equals(c) || MimeTypes.AUDIO_DTS.equals(c) || MimeTypes.AUDIO_DTS_HD.equals(c)) {
            return new vl0(c, null, -1L, -1L);
        }
        nkkVar.F(4);
        long t = nkkVar.t();
        long t2 = nkkVar.t();
        nkkVar.F(1);
        int b = b(nkkVar);
        long j = t2;
        byte[] bArr = new byte[b];
        nkkVar.e(bArr, 0, b);
        if (j <= 0) {
            j = -1;
        }
        return new vl0(c, bArr, j, t > 0 ? t : -1L);
    }

    public static int b(nkk nkkVar) {
        int s = nkkVar.s();
        int i = s & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((s & 128) == 128) {
            s = nkkVar.s();
            i = (i << 7) | (s & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i;
    }

    public static Pair c(nkk nkkVar, int i, int i2) {
        Integer num;
        ksj ksjVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = nkkVar.b;
        while (i5 - i < i2) {
            nkkVar.E(i5);
            int f = nkkVar.f();
            u6h.F("childAtomSize must be positive", f > 0);
            if (nkkVar.f() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < f) {
                    nkkVar.E(i6);
                    int f2 = nkkVar.f();
                    int f3 = nkkVar.f();
                    if (f3 == 1718775137) {
                        num3 = Integer.valueOf(nkkVar.f());
                    } else if (f3 == 1935894637) {
                        nkkVar.F(4);
                        str = nkkVar.q(4, xp2.c);
                    } else if (f3 == 1935894633) {
                        i8 = i6;
                        i7 = f2;
                    }
                    i6 += f2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
                    u6h.F("frma atom is mandatory", num3 != null);
                    u6h.F("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            ksjVar = null;
                            break;
                        }
                        nkkVar.E(i9);
                        int f4 = nkkVar.f();
                        if (nkkVar.f() == 1952804451) {
                            int x = ffb.x(nkkVar.f());
                            nkkVar.F(1);
                            if (x == 0) {
                                nkkVar.F(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int s = nkkVar.s();
                                i3 = s & 15;
                                i4 = (s & 240) >> 4;
                            }
                            if (nkkVar.s() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int s2 = nkkVar.s();
                            byte[] bArr2 = new byte[16];
                            nkkVar.e(bArr2, 0, 16);
                            if (z && s2 == 0) {
                                int s3 = nkkVar.s();
                                byte[] bArr3 = new byte[s3];
                                nkkVar.e(bArr3, 0, s3);
                                bArr = bArr3;
                            }
                            num = num2;
                            ksjVar = new ksj(z, str, s2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += f4;
                        }
                    }
                    u6h.F("tenc atom is mandatory", ksjVar != null);
                    int i10 = lik.a;
                    create = Pair.create(num, ksjVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0267 A[ADDED_TO_REGION, LOOP:12: B:203:0x0267->B:206:0x0272, LOOP_START, PHI: r16
      0x0267: PHI (r16v3 int) = (r16v2 int), (r16v4 int) binds: [B:202:0x0265, B:206:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wsj d(isj isjVar, rl0 rl0Var, gv8 gv8Var) {
        wl0 xl0Var;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int a2;
        long j;
        nkk nkkVar;
        long[] jArr;
        int i5;
        int[] iArr;
        sm8 sm8Var;
        int i6;
        int i7;
        int i8;
        long j2;
        long j3;
        int[] iArr2;
        long[] jArr2;
        int[] iArr3;
        long j4;
        int i9;
        long[] jArr3;
        long[] jArr4;
        long j5;
        int i10;
        long j6;
        int i11;
        int i12;
        int i13;
        int i14;
        sm8 sm8Var2 = isjVar.f;
        sl0 B = rl0Var.B(1937011578);
        if (B != null) {
            xl0Var = new und(B, sm8Var2);
        } else {
            sl0 B2 = rl0Var.B(1937013298);
            if (B2 == null) {
                throw r9e.a("Track has no sample table size information", null);
            }
            xl0Var = new xl0(B2);
        }
        int sampleCount = xl0Var.getSampleCount();
        if (sampleCount == 0) {
            return new wsj(isjVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        sl0 B3 = rl0Var.B(1937007471);
        if (B3 == null) {
            B3 = rl0Var.B(1668232756);
            B3.getClass();
            z = true;
        } else {
            z = false;
        }
        nkk nkkVar2 = B3.g;
        sl0 B4 = rl0Var.B(1937011555);
        B4.getClass();
        nkk nkkVar3 = B4.g;
        sl0 B5 = rl0Var.B(1937011827);
        B5.getClass();
        nkk nkkVar4 = B5.g;
        sl0 B6 = rl0Var.B(1937011571);
        nkk nkkVar5 = B6 != null ? B6.g : null;
        sl0 B7 = rl0Var.B(1668576371);
        nkk nkkVar6 = B7 != null ? B7.g : null;
        ul0 ul0Var = new ul0(nkkVar3, nkkVar2, z);
        nkkVar4.E(12);
        int v = nkkVar4.v() - 1;
        int v2 = nkkVar4.v();
        int v3 = nkkVar4.v();
        if (nkkVar6 != null) {
            nkkVar6.E(12);
            i = nkkVar6.v();
        } else {
            i = 0;
        }
        if (nkkVar5 != null) {
            nkkVar5.E(12);
            i2 = nkkVar5.v();
            if (i2 > 0) {
                i4 = nkkVar5.v() - 1;
                i3 = 0;
                a2 = xl0Var.a();
                int i15 = isjVar.b;
                wl0 wl0Var = xl0Var;
                j = isjVar.c;
                nkkVar = nkkVar6;
                long[] jArr5 = isjVar.i;
                jArr = isjVar.h;
                i5 = i2;
                String str = sm8Var2.l;
                int i16 = v;
                int i17 = v2;
                long j7 = 0;
                if (a2 == -1 && ((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && i16 == 0 && i == 0 && i5 == 0)) {
                    int i18 = ul0Var.b;
                    long[] jArr6 = new long[i18];
                    int[] iArr4 = new int[i18];
                    while (ul0Var.a()) {
                        int i19 = ul0Var.c;
                        long[] jArr7 = jArr6;
                        int[] iArr5 = iArr4;
                        jArr7[i19] = ul0Var.e;
                        iArr5[i19] = ul0Var.d;
                        jArr6 = jArr7;
                        iArr4 = iArr5;
                    }
                    long[] jArr8 = jArr6;
                    int[] iArr6 = iArr4;
                    long j8 = v3;
                    int i20 = 8192 / a2;
                    int i21 = i3;
                    int i22 = i21;
                    while (i21 < i18) {
                        i22 += lik.f(iArr6[i21], i20);
                        i21++;
                        a2 = a2;
                    }
                    int i23 = a2;
                    long[] jArr9 = new long[i22];
                    iArr2 = new int[i22];
                    long[] jArr10 = new long[i22];
                    iArr3 = new int[i22];
                    int i24 = i3;
                    int i25 = i24;
                    int i26 = i25;
                    int i27 = i26;
                    while (i24 < i18) {
                        int i28 = iArr6[i24];
                        long j9 = jArr8[i24];
                        int i29 = i24;
                        int i30 = i28;
                        while (i30 > 0) {
                            int min = Math.min(i20, i30);
                            jArr9[i27] = j9;
                            int i31 = i30;
                            int i32 = i23 * min;
                            iArr2[i27] = i32;
                            i26 = Math.max(i26, i32);
                            jArr10[i27] = i25 * j8;
                            iArr3[i27] = 1;
                            j9 += iArr2[i27];
                            i25 += min;
                            i30 = i31 - min;
                            i27++;
                            i18 = i18;
                        }
                        i24 = i29 + 1;
                    }
                    sm8Var = sm8Var2;
                    j3 = j;
                    i6 = i26;
                    jArr4 = jArr9;
                    jArr3 = jArr10;
                    j4 = i25 * j8;
                } else {
                    long[] jArr11 = new long[sampleCount];
                    iArr = new int[sampleCount];
                    long[] jArr12 = new long[sampleCount];
                    int[] iArr7 = new int[sampleCount];
                    sm8Var = sm8Var2;
                    nkk nkkVar7 = nkkVar5;
                    int i33 = i4;
                    int i34 = i3;
                    i6 = i34;
                    i7 = i6;
                    i8 = i7;
                    int i35 = i8;
                    long j10 = 0;
                    j2 = 0;
                    while (true) {
                        if (i7 < sampleCount) {
                            j3 = j;
                            iArr2 = iArr;
                            jArr2 = jArr12;
                            iArr3 = iArr7;
                            break;
                        }
                        j5 = j2;
                        boolean z2 = true;
                        while (i8 == 0) {
                            z2 = ul0Var.a();
                            if (!z2) {
                                break;
                            }
                            j5 = ul0Var.e;
                            i8 = ul0Var.d;
                            sampleCount = sampleCount;
                            j = j;
                        }
                        i10 = sampleCount;
                        j3 = j;
                        if (!z2) {
                            m6k.f0();
                            long[] copyOf = Arrays.copyOf(jArr11, i7);
                            int[] copyOf2 = Arrays.copyOf(iArr, i7);
                            jArr2 = Arrays.copyOf(jArr12, i7);
                            iArr2 = copyOf2;
                            iArr3 = Arrays.copyOf(iArr7, i7);
                            jArr11 = copyOf;
                            sampleCount = i7;
                            break;
                        }
                        if (nkkVar != null) {
                            while (i35 == 0 && i > 0) {
                                i35 = nkkVar.v();
                                i34 = nkkVar.f();
                                i--;
                            }
                            i35--;
                        }
                        jArr11[i7] = j5;
                        int readNextSampleSize = wl0Var.readNextSampleSize();
                        iArr[i7] = readNextSampleSize;
                        if (readNextSampleSize > i6) {
                            i6 = readNextSampleSize;
                        }
                        jArr12[i7] = j10 + i34;
                        iArr7[i7] = nkkVar7 == null ? 1 : i3;
                        if (i7 == i33) {
                            iArr7[i7] = 1;
                            i5--;
                            if (i5 > 0) {
                                nkkVar7.getClass();
                                i33 = nkkVar7.v() - 1;
                            }
                        }
                        j10 += v3;
                        i17--;
                        if (i17 == 0 && i16 > 0) {
                            i16--;
                            i17 = nkkVar4.v();
                            v3 = nkkVar4.f();
                        }
                        j2 = j5 + iArr[i7];
                        i8--;
                        i7++;
                        sampleCount = i10;
                        j = j3;
                    }
                    j4 = j10 + i34;
                    if (nkkVar != null) {
                        while (i > 0) {
                            if (nkkVar.v() != 0) {
                                i9 = i3;
                                break;
                            }
                            nkkVar.f();
                            i--;
                        }
                    }
                    i9 = 1;
                    if (i5 == 0 || i17 != 0 || i8 != 0 || i16 != 0 || i35 != 0 || i9 == 0) {
                        m6k.f0();
                    }
                    jArr3 = jArr2;
                    jArr4 = jArr11;
                }
                int[] iArr8 = iArr2;
                int[] iArr9 = iArr3;
                long D = lik.D(j4, 1000000L, isjVar.c);
                if (jArr != null) {
                    lik.E(jArr3, j3);
                    return new wsj(isjVar, jArr4, iArr8, i6, jArr3, iArr9, D);
                }
                int i36 = sampleCount;
                int i37 = i6;
                int[] iArr10 = iArr8;
                int[] iArr11 = iArr9;
                long j11 = j3;
                if (jArr.length == 1 && i15 == 1 && jArr3.length >= 2) {
                    jArr5.getClass();
                    long j12 = jArr5[i3];
                    long[] jArr13 = jArr4;
                    long D2 = lik.D(jArr[i3], isjVar.c, isjVar.d) + j12;
                    int length = jArr3.length - 1;
                    int i38 = i3;
                    int h = lik.h(4, i38, length);
                    int h2 = lik.h(jArr3.length - 4, i38, length);
                    long j13 = jArr3[i38];
                    if (j13 > j12 || j12 >= jArr3[h] || jArr3[h2] >= D2 || D2 > j4) {
                        jArr4 = jArr13;
                        iArr10 = iArr10;
                        j6 = j4;
                    } else {
                        long j14 = j4 - D2;
                        sm8 sm8Var3 = sm8Var;
                        long D3 = lik.D(j12 - j13, sm8Var3.z, isjVar.c);
                        j6 = j4;
                        long D4 = lik.D(j14, sm8Var3.z, isjVar.c);
                        if (!(D3 == 0 && D4 == 0) && D3 <= 2147483647L && D4 <= 2147483647L) {
                            gv8Var.a = (int) D3;
                            gv8Var.b = (int) D4;
                            lik.E(jArr3, j11);
                            return new wsj(isjVar, jArr13, iArr10, i37, jArr3, iArr11, lik.D(jArr[0], 1000000L, isjVar.d));
                        }
                        jArr4 = jArr13;
                        iArr10 = iArr10;
                    }
                    i37 = i37;
                } else {
                    j6 = j4;
                }
                int i39 = 1;
                if (jArr.length == 1) {
                    if (jArr[0] == 0) {
                        jArr5.getClass();
                        long j15 = jArr5[0];
                        for (int i40 = 0; i40 < jArr3.length; i40++) {
                            jArr3[i40] = lik.D(jArr3[i40] - j15, 1000000L, isjVar.c);
                        }
                        return new wsj(isjVar, jArr4, iArr10, i37, jArr3, iArr11, lik.D(j6 - j15, 1000000L, isjVar.c));
                    }
                    i39 = 1;
                }
                boolean z3 = i15 == i39;
                int[] iArr12 = new int[jArr.length];
                int[] iArr13 = new int[jArr.length];
                jArr5.getClass();
                int i41 = 0;
                boolean z4 = false;
                int i42 = 0;
                int i43 = 0;
                while (i41 < jArr.length) {
                    int[] iArr14 = iArr12;
                    int[] iArr15 = iArr13;
                    long j16 = jArr5[i41];
                    if (j16 != -1) {
                        i12 = i41;
                        boolean z5 = z4;
                        long D5 = lik.D(jArr[i41], isjVar.c, isjVar.d);
                        i11 = i37;
                        iArr14[i12] = lik.e(jArr3, j16, true);
                        iArr15[i12] = lik.b(jArr3, j16 + D5, z3);
                        while (true) {
                            i13 = iArr14[i12];
                            i14 = iArr15[i12];
                            if (i13 >= i14 || (iArr11[i13] & 1) != 0) {
                                break;
                            }
                            iArr14[i12] = i13 + 1;
                        }
                        int i44 = (i14 - i13) + i42;
                        z4 = z5 | (i43 != i13);
                        i43 = i14;
                        i42 = i44;
                    } else {
                        i11 = i37;
                        i12 = i41;
                    }
                    i41 = i12 + 1;
                    iArr12 = iArr14;
                    iArr13 = iArr15;
                    i37 = i11;
                }
                int i45 = i37;
                int[] iArr16 = iArr12;
                int[] iArr17 = iArr13;
                boolean z6 = z4 | (i42 != i36);
                long[] jArr14 = z6 ? new long[i42] : jArr4;
                int[] iArr18 = z6 ? new int[i42] : iArr10;
                if (z6) {
                    i45 = 0;
                }
                int[] iArr19 = z6 ? new int[i42] : iArr11;
                long[] jArr15 = new long[i42];
                int i46 = 0;
                int i47 = 0;
                long j17 = 0;
                while (i46 < jArr.length) {
                    long j18 = jArr5[i46];
                    long[] jArr16 = jArr;
                    int i48 = iArr16[i46];
                    boolean z7 = z6;
                    int i49 = iArr17[i46];
                    long[] jArr17 = jArr3;
                    if (z7) {
                        int i50 = i49 - i48;
                        System.arraycopy(jArr4, i48, jArr14, i47, i50);
                        System.arraycopy(iArr10, i48, iArr18, i47, i50);
                        System.arraycopy(iArr11, i48, iArr19, i47, i50);
                    }
                    int i51 = i45;
                    while (i48 < i49) {
                        long[] jArr18 = jArr4;
                        int[] iArr20 = iArr10;
                        int[] iArr21 = iArr11;
                        long[] jArr19 = jArr14;
                        long j19 = j7;
                        jArr15[i47] = lik.D(j17, 1000000L, isjVar.d) + lik.D(Math.max(j19, jArr17[i48] - j18), 1000000L, isjVar.c);
                        if (z7 && iArr18[i47] > i51) {
                            i51 = iArr20[i48];
                        }
                        i47++;
                        i48++;
                        j7 = j19;
                        jArr4 = jArr18;
                        iArr10 = iArr20;
                        jArr14 = jArr19;
                        iArr11 = iArr21;
                    }
                    j17 += jArr16[i46];
                    i46++;
                    z6 = z7;
                    i45 = i51;
                    jArr = jArr16;
                    jArr3 = jArr17;
                    jArr4 = jArr4;
                    iArr10 = iArr10;
                    jArr14 = jArr14;
                    iArr11 = iArr11;
                }
                return new wsj(isjVar, jArr14, iArr18, i45, jArr15, iArr19, lik.D(j17, 1000000L, isjVar.d));
            }
            i3 = 0;
            nkkVar5 = null;
        } else {
            i2 = 0;
            i3 = 0;
        }
        i4 = -1;
        a2 = xl0Var.a();
        int i152 = isjVar.b;
        wl0 wl0Var2 = xl0Var;
        j = isjVar.c;
        nkkVar = nkkVar6;
        long[] jArr52 = isjVar.i;
        jArr = isjVar.h;
        i5 = i2;
        String str2 = sm8Var2.l;
        int i162 = v;
        int i172 = v2;
        long j72 = 0;
        if (a2 == -1) {
        }
        long[] jArr112 = new long[sampleCount];
        iArr = new int[sampleCount];
        long[] jArr122 = new long[sampleCount];
        int[] iArr72 = new int[sampleCount];
        sm8Var = sm8Var2;
        nkk nkkVar72 = nkkVar5;
        int i332 = i4;
        int i342 = i3;
        i6 = i342;
        i7 = i6;
        i8 = i7;
        int i352 = i8;
        long j102 = 0;
        j2 = 0;
        while (true) {
            if (i7 < sampleCount) {
            }
            j2 = j5 + iArr[i7];
            i8--;
            i7++;
            sampleCount = i10;
            j = j3;
        }
        j4 = j102 + i342;
        if (nkkVar != null) {
        }
        i9 = 1;
        if (i5 == 0) {
        }
        m6k.f0();
        jArr3 = jArr2;
        jArr4 = jArr112;
        int[] iArr82 = iArr2;
        int[] iArr92 = iArr3;
        long D6 = lik.D(j4, 1000000L, isjVar.c);
        if (jArr != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        if (r11 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0cac, code lost:
    
        if (r43 == null) goto L635;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0dc6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0208  */
    /* JADX WARN: Type inference failed for: r0v44, types: [vl0] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r1v21, types: [vl0] */
    /* JADX WARN: Type inference failed for: r43v11, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(rl0 rl0Var, gv8 gv8Var, long j, DrmInitData drmInitData, boolean z, boolean z2, xs8 xs8Var) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int f;
        int i3;
        sm8 sm8Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        long[] jArr;
        long[] jArr2;
        xs8 xs8Var2;
        Object isjVar;
        Pair create;
        ArrayList arrayList3;
        rl0 rl0Var2;
        Pair pair;
        int i5;
        int i6;
        ksj[] ksjVarArr;
        int i7;
        int i8;
        int i9;
        DrmInitData drmInitData2;
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        List list;
        int i17;
        int i18;
        DrmInitData drmInitData3;
        byte[] bArr;
        float f2;
        int i19;
        int i20;
        byte[] bArr2;
        List list2;
        int i21;
        String str2;
        String str3;
        int i22;
        int[] iArr;
        int x;
        int[] iArr2;
        int f3;
        int i23;
        int i24;
        int i25;
        DrmInitData drmInitData4;
        String str4;
        int i26;
        Object obj;
        int i27;
        int i28;
        int i29;
        List list3;
        ?? r43;
        int i30;
        int i31;
        String str5;
        int i32;
        Object obj2;
        sm8 sm8Var2;
        int i33;
        DrmInitData a2;
        vvf vvfVar;
        long j5;
        isj isjVar2;
        ArrayList arrayList4;
        rl0 rl0Var3 = rl0Var;
        DrmInitData drmInitData5 = drmInitData;
        ArrayList arrayList5 = rl0Var3.i;
        ArrayList arrayList6 = new ArrayList();
        int i34 = 0;
        while (i34 < arrayList5.size()) {
            rl0 rl0Var4 = (rl0) arrayList5.get(i34);
            if (rl0Var4.b != 1953653099) {
                arrayList = arrayList5;
                arrayList4 = arrayList6;
                i4 = i34;
            } else {
                sl0 B = rl0Var3.B(1836476516);
                B.getClass();
                rl0 A = rl0Var4.A(1835297121);
                A.getClass();
                sl0 B2 = A.B(1751411826);
                B2.getClass();
                nkk nkkVar = B2.g;
                nkkVar.E(16);
                int f4 = nkkVar.f();
                int i35 = f4 == 1936684398 ? 1 : f4 == 1986618469 ? 2 : (f4 == 1952807028 || f4 == 1935832172 || f4 == 1937072756 || f4 == 1668047728) ? 3 : f4 == 1835365473 ? 5 : -1;
                int i36 = 3;
                ?? r18 = 0;
                long[] jArr3 = null;
                if (i35 == -1) {
                    xs8Var2 = xs8Var;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i4 = i34;
                } else {
                    sl0 B3 = rl0Var4.B(1953196132);
                    B3.getClass();
                    nkk nkkVar2 = B3.g;
                    nkkVar2.E(8);
                    int x2 = ffb.x(nkkVar2.f());
                    nkkVar2.F(x2 == 0 ? 8 : 16);
                    int f5 = nkkVar2.f();
                    nkkVar2.F(4);
                    int i37 = nkkVar2.b;
                    int i38 = x2 == 0 ? 4 : 8;
                    int i39 = 0;
                    while (true) {
                        j2 = C.TIME_UNSET;
                        if (i39 >= i38) {
                            nkkVar2.F(i38);
                            break;
                        }
                        if (nkkVar2.a[i37 + i39] != -1) {
                            j3 = x2 == 0 ? nkkVar2.t() : nkkVar2.w();
                        } else {
                            i39++;
                        }
                    }
                    j3 = -9223372036854775807L;
                    nkkVar2.F(16);
                    int f6 = nkkVar2.f();
                    int f7 = nkkVar2.f();
                    nkkVar2.F(4);
                    int f8 = nkkVar2.f();
                    int f9 = nkkVar2.f();
                    if (f6 == 0 && f7 == 65536) {
                        i = -65536;
                        if (f8 == -65536 && f9 == 0) {
                            i2 = 90;
                            j4 = j == C.TIME_UNSET ? j3 : j;
                            nkk nkkVar3 = B.g;
                            nkkVar3.E(8);
                            nkkVar3.F(ffb.x(nkkVar3.f()) == 0 ? 8 : 16);
                            long t = nkkVar3.t();
                            if (j4 != C.TIME_UNSET) {
                                j2 = lik.D(j4, 1000000L, t);
                            }
                            rl0 A2 = A.A(1835626086);
                            A2.getClass();
                            rl0 A3 = A2.A(1937007212);
                            A3.getClass();
                            sl0 B4 = A.B(1835296868);
                            B4.getClass();
                            nkk nkkVar4 = B4.g;
                            nkkVar4.E(8);
                            int x3 = ffb.x(nkkVar4.f());
                            nkkVar4.F(x3 == 0 ? 8 : 16);
                            long t2 = nkkVar4.t();
                            nkkVar4.F(x3 == 0 ? 4 : 8);
                            int x4 = nkkVar4.x();
                            Pair create2 = Pair.create(Long.valueOf(t2), "" + ((char) (((x4 >> 10) & 31) + 96)) + ((char) (((x4 >> 5) & 31) + 96)) + ((char) ((x4 & 31) + 96)));
                            sl0 B5 = A3.B(1937011556);
                            B5.getClass();
                            nkk nkkVar5 = B5.g;
                            String str6 = (String) create2.second;
                            nkkVar5.E(12);
                            f = nkkVar5.f();
                            ksj[] ksjVarArr2 = new ksj[f];
                            long j6 = j2;
                            i3 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            sm8Var = null;
                            while (i3 < f) {
                                int i42 = nkkVar5.b;
                                int f10 = nkkVar5.f();
                                ArrayList arrayList7 = arrayList5;
                                int i43 = f5;
                                String str7 = "childAtomSize must be positive";
                                u6h.F("childAtomSize must be positive", f10 > 0);
                                int f11 = nkkVar5.f();
                                int i44 = i34;
                                if (f11 == 1635148593 || f11 == 1635148595 || f11 == 1701733238 || f11 == 1831958048 || f11 == 1836070006 || f11 == 1752589105 || f11 == 1751479857 || f11 == 1932670515 || f11 == 1211250227 || f11 == 1987063864 || f11 == 1987063865 || f11 == 1635135537 || f11 == 1685479798 || f11 == 1685479729 || f11 == 1685481573 || f11 == 1685481521) {
                                    int i45 = i2;
                                    arrayList3 = arrayList6;
                                    rl0Var2 = rl0Var4;
                                    pair = create2;
                                    i5 = i35;
                                    i6 = f;
                                    ksjVarArr = ksjVarArr2;
                                    i7 = i3;
                                    nkkVar5.E(i42 + 16);
                                    nkkVar5.F(16);
                                    int x5 = nkkVar5.x();
                                    int x6 = nkkVar5.x();
                                    nkkVar5.F(50);
                                    int i46 = nkkVar5.b;
                                    if (f11 == 1701733238) {
                                        i8 = i42;
                                        i9 = f10;
                                        Pair c = c(nkkVar5, i8, i9);
                                        if (c != null) {
                                            f11 = ((Integer) c.first).intValue();
                                            drmInitData2 = drmInitData == null ? null : drmInitData.a(((ksj) c.second).b);
                                            ksjVarArr[i7] = (ksj) c.second;
                                        } else {
                                            drmInitData2 = drmInitData;
                                        }
                                        nkkVar5.E(i46);
                                    } else {
                                        i8 = i42;
                                        i9 = f10;
                                        drmInitData2 = drmInitData;
                                    }
                                    i10 = i8;
                                    str = str6;
                                    float f12 = 1.0f;
                                    int i47 = i41;
                                    int i48 = -1;
                                    int i49 = -1;
                                    byte[] bArr3 = null;
                                    ByteBuffer byteBuffer = null;
                                    vl0 vl0Var = null;
                                    int i50 = -1;
                                    int i51 = -1;
                                    int i52 = i46;
                                    boolean z3 = false;
                                    List list4 = null;
                                    String str8 = f11 == 1831958048 ? MimeTypes.VIDEO_MPEG : f11 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
                                    String str9 = null;
                                    while (true) {
                                        if (i52 - i10 >= i9) {
                                            i11 = i49;
                                            break;
                                        }
                                        nkkVar5.E(i52);
                                        int i53 = nkkVar5.b;
                                        int i54 = i52;
                                        int f13 = nkkVar5.f();
                                        i11 = i49;
                                        if (f13 == 0 && nkkVar5.b - i10 == i9) {
                                            break;
                                        }
                                        u6h.F(str7, f13 > 0);
                                        int f14 = nkkVar5.f();
                                        String str10 = str7;
                                        if (f14 == 1635148611) {
                                            u6h.F(null, str8 == null);
                                            nkkVar5.E(i53 + 8);
                                            vv0 a3 = vv0.a(nkkVar5);
                                            list2 = a3.a;
                                            i21 = a3.b;
                                            if (!z3) {
                                                f12 = a3.e;
                                            }
                                            str2 = a3.f;
                                            str3 = "video/avc";
                                        } else if (f14 == 1752589123) {
                                            u6h.F(null, str8 == null);
                                            nkkVar5.E(i53 + 8);
                                            u99 a4 = u99.a(nkkVar5);
                                            list2 = a4.a;
                                            i21 = a4.b;
                                            if (!z3) {
                                                f12 = a4.c;
                                            }
                                            str2 = a4.d;
                                            str3 = "video/hevc";
                                        } else {
                                            if (f14 == 1685480259 || f14 == 1685485123) {
                                                i16 = f11;
                                                list = list4;
                                                i17 = i9;
                                                i18 = i48;
                                                drmInitData3 = drmInitData2;
                                                bArr = bArr3;
                                                f2 = f12;
                                                i19 = i36;
                                                ue8 a5 = ue8.a(nkkVar5);
                                                if (a5 != null) {
                                                    str9 = a5.b;
                                                    str8 = "video/dolby-vision";
                                                }
                                            } else {
                                                if (f14 == 1987076931) {
                                                    u6h.F(null, str8 == null);
                                                    i16 = f11;
                                                    i17 = i9;
                                                    str8 = f11 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                                } else {
                                                    if (f14 == 1635135811) {
                                                        u6h.F(null, str8 == null);
                                                        i16 = f11;
                                                        str8 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                    } else if (f14 == 1668050025) {
                                                        ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        order.position(21);
                                                        order.putShort(nkkVar5.p());
                                                        order.putShort(nkkVar5.p());
                                                        i16 = f11;
                                                        byteBuffer = order;
                                                    } else {
                                                        if (f14 == 1835295606) {
                                                            ByteBuffer order2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                            short p = nkkVar5.p();
                                                            short p2 = nkkVar5.p();
                                                            i16 = f11;
                                                            short p3 = nkkVar5.p();
                                                            i17 = i9;
                                                            short p4 = nkkVar5.p();
                                                            drmInitData3 = drmInitData2;
                                                            short p5 = nkkVar5.p();
                                                            list = list4;
                                                            short p6 = nkkVar5.p();
                                                            i18 = i48;
                                                            short p7 = nkkVar5.p();
                                                            bArr = bArr3;
                                                            short p8 = nkkVar5.p();
                                                            long t3 = nkkVar5.t();
                                                            long t4 = nkkVar5.t();
                                                            f2 = f12;
                                                            order2.position(1);
                                                            order2.putShort(p5);
                                                            order2.putShort(p6);
                                                            order2.putShort(p);
                                                            order2.putShort(p2);
                                                            order2.putShort(p3);
                                                            order2.putShort(p4);
                                                            order2.putShort(p7);
                                                            order2.putShort(p8);
                                                            order2.putShort((short) (t3 / Ua.s));
                                                            order2.putShort((short) (t4 / Ua.s));
                                                            byteBuffer = order2;
                                                            i19 = i36;
                                                        } else {
                                                            i16 = f11;
                                                            list = list4;
                                                            i17 = i9;
                                                            i18 = i48;
                                                            drmInitData3 = drmInitData2;
                                                            bArr = bArr3;
                                                            f2 = f12;
                                                            if (f14 == 1681012275) {
                                                                u6h.F(null, str8 == null);
                                                                i19 = i36;
                                                                str8 = MimeTypes.VIDEO_H263;
                                                            } else {
                                                                if (f14 == 1702061171) {
                                                                    u6h.F(null, str8 == null);
                                                                    vl0 a6 = a(i53, nkkVar5);
                                                                    String str11 = a6.a;
                                                                    byte[] bArr4 = a6.b;
                                                                    if (bArr4 != null) {
                                                                        list = hv9.z(bArr4);
                                                                    }
                                                                    vl0Var = a6;
                                                                    str8 = str11;
                                                                    i19 = i36;
                                                                } else if (f14 == 1885434736) {
                                                                    nkkVar5.E(i53 + 8);
                                                                    f12 = nkkVar5.v() / nkkVar5.v();
                                                                    i19 = i36;
                                                                    list4 = list;
                                                                    i48 = i18;
                                                                    bArr3 = bArr;
                                                                    z3 = true;
                                                                    i52 = i54 + f13;
                                                                    i36 = i19;
                                                                    i49 = i11;
                                                                    str7 = str10;
                                                                    f11 = i16;
                                                                    i9 = i17;
                                                                    drmInitData2 = drmInitData3;
                                                                } else if (f14 == 1937126244) {
                                                                    int i55 = i53 + 8;
                                                                    while (true) {
                                                                        if (i55 - i53 >= f13) {
                                                                            bArr2 = null;
                                                                            break;
                                                                        }
                                                                        nkkVar5.E(i55);
                                                                        int f15 = nkkVar5.f();
                                                                        if (nkkVar5.f() == 1886547818) {
                                                                            bArr2 = Arrays.copyOfRange(nkkVar5.a, i55, f15 + i55);
                                                                            break;
                                                                        }
                                                                        i55 += f15;
                                                                    }
                                                                    bArr3 = bArr2;
                                                                    i19 = i36;
                                                                    list4 = list;
                                                                    i48 = i18;
                                                                    f12 = f2;
                                                                    i52 = i54 + f13;
                                                                    i36 = i19;
                                                                    i49 = i11;
                                                                    str7 = str10;
                                                                    f11 = i16;
                                                                    i9 = i17;
                                                                    drmInitData2 = drmInitData3;
                                                                } else if (f14 == 1936995172) {
                                                                    int s = nkkVar5.s();
                                                                    i19 = i36;
                                                                    nkkVar5.F(i19);
                                                                    if (s == 0) {
                                                                        int s2 = nkkVar5.s();
                                                                        if (s2 == 0) {
                                                                            i18 = 0;
                                                                        } else if (s2 == 1) {
                                                                            i18 = 1;
                                                                        } else if (s2 == 2) {
                                                                            i18 = 2;
                                                                        } else if (s2 == i19) {
                                                                            i18 = i19;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i19 = i36;
                                                                    if (f14 == 1668246642) {
                                                                        int f16 = nkkVar5.f();
                                                                        if (f16 == 1852009592 || f16 == 1852009571) {
                                                                            int x7 = nkkVar5.x();
                                                                            int x8 = nkkVar5.x();
                                                                            nkkVar5.F(2);
                                                                            boolean z4 = f13 == 19 && (nkkVar5.s() & 128) != 0;
                                                                            int a7 = v13.a(x7);
                                                                            int i56 = z4 ? 1 : 2;
                                                                            if (x8 != 1) {
                                                                                if (x8 != 16) {
                                                                                    i20 = 7;
                                                                                    if (x8 != 18) {
                                                                                        if (x8 != 6 && x8 != 7) {
                                                                                            i20 = -1;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i20 = 6;
                                                                                }
                                                                                i11 = a7;
                                                                                i51 = i56;
                                                                                i50 = i20;
                                                                            }
                                                                            i20 = i19;
                                                                            i11 = a7;
                                                                            i51 = i56;
                                                                            i50 = i20;
                                                                        } else {
                                                                            "Unsupported color type: ".concat(ffb.g(f16));
                                                                            m6k.f0();
                                                                        }
                                                                    }
                                                                }
                                                                list4 = list;
                                                                i48 = i18;
                                                                bArr3 = bArr;
                                                                f12 = f2;
                                                                i52 = i54 + f13;
                                                                i36 = i19;
                                                                i49 = i11;
                                                                str7 = str10;
                                                                f11 = i16;
                                                                i9 = i17;
                                                                drmInitData2 = drmInitData3;
                                                            }
                                                        }
                                                        list4 = list;
                                                        i48 = i18;
                                                        bArr3 = bArr;
                                                        f12 = f2;
                                                        i52 = i54 + f13;
                                                        i36 = i19;
                                                        i49 = i11;
                                                        str7 = str10;
                                                        f11 = i16;
                                                        i9 = i17;
                                                        drmInitData2 = drmInitData3;
                                                    }
                                                    i17 = i9;
                                                }
                                                drmInitData3 = drmInitData2;
                                                i19 = i36;
                                                i52 = i54 + f13;
                                                i36 = i19;
                                                i49 = i11;
                                                str7 = str10;
                                                f11 = i16;
                                                i9 = i17;
                                                drmInitData2 = drmInitData3;
                                            }
                                            list4 = list;
                                            i48 = i18;
                                            bArr3 = bArr;
                                            f12 = f2;
                                            i52 = i54 + f13;
                                            i36 = i19;
                                            i49 = i11;
                                            str7 = str10;
                                            f11 = i16;
                                            i9 = i17;
                                            drmInitData2 = drmInitData3;
                                        }
                                        i16 = f11;
                                        str9 = str2;
                                        list4 = list2;
                                        i17 = i9;
                                        i47 = i21;
                                        drmInitData3 = drmInitData2;
                                        str8 = str3;
                                        i19 = i36;
                                        i52 = i54 + f13;
                                        i36 = i19;
                                        i49 = i11;
                                        str7 = str10;
                                        f11 = i16;
                                        i9 = i17;
                                        drmInitData2 = drmInitData3;
                                    }
                                    List list5 = list4;
                                    i12 = i9;
                                    int i57 = i48;
                                    DrmInitData drmInitData6 = drmInitData2;
                                    byte[] bArr5 = bArr3;
                                    float f17 = f12;
                                    i13 = i36;
                                    if (str8 == null) {
                                        i2 = i45;
                                    } else {
                                        pm8 pm8Var = new pm8();
                                        pm8Var.a = Integer.toString(i43);
                                        pm8Var.k = str8;
                                        pm8Var.h = str9;
                                        pm8Var.p = x5;
                                        pm8Var.q = x6;
                                        pm8Var.t = f17;
                                        i2 = i45;
                                        pm8Var.s = i2;
                                        pm8Var.u = bArr5;
                                        pm8Var.v = i57;
                                        pm8Var.m = list5;
                                        pm8Var.n = drmInitData6;
                                        int i58 = i11;
                                        if (i58 == -1) {
                                            i15 = i51;
                                            i14 = i50;
                                            if (i15 == -1) {
                                                if (i14 == -1) {
                                                }
                                            }
                                        } else {
                                            i14 = i50;
                                            i15 = i51;
                                        }
                                        pm8Var.w = new v13(i58, i15, i14, byteBuffer != null ? byteBuffer.array() : null);
                                        if (vl0Var != null) {
                                            vl0 vl0Var2 = vl0Var;
                                            pm8Var.f = jaa.M(vl0Var2.c);
                                            pm8Var.g = jaa.M(vl0Var2.d);
                                        }
                                        sm8Var = new sm8(pm8Var);
                                    }
                                    i41 = i47;
                                } else {
                                    i5 = i35;
                                    if (f11 == 1836069985 || f11 == 1701733217 || f11 == 1633889587 || f11 == 1700998451 || f11 == 1633889588 || f11 == 1835823201 || f11 == 1685353315 || f11 == 1685353317 || f11 == 1685353320 || f11 == 1685353324 || f11 == 1685353336 || f11 == 1935764850 || f11 == 1935767394 || f11 == 1819304813 || f11 == 1936684916 || f11 == 1953984371 || f11 == 778924082 || f11 == 778924083 || f11 == 1835557169 || f11 == 1835560241 || f11 == 1634492771 || f11 == 1634492791 || f11 == 1970037111 || f11 == 1332770163 || f11 == 1716281667) {
                                        i6 = f;
                                        ksjVarArr = ksjVarArr2;
                                        int[] iArr3 = un0.e;
                                        int[] iArr4 = un0.c;
                                        nkkVar5.E(i42 + 16);
                                        if (z2) {
                                            i22 = nkkVar5.x();
                                            nkkVar5.F(6);
                                        } else {
                                            nkkVar5.F(8);
                                            i22 = 0;
                                        }
                                        if (i22 == 0 || i22 == 1) {
                                            iArr = iArr4;
                                            x = nkkVar5.x();
                                            nkkVar5.F(6);
                                            byte[] bArr6 = nkkVar5.a;
                                            iArr2 = iArr3;
                                            int i59 = nkkVar5.b;
                                            int i60 = i59 + 1;
                                            nkkVar5.b = i60;
                                            int i61 = (bArr6[i59] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                            nkkVar5.b = i59 + 2;
                                            int i62 = i61 | (bArr6[i60] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                            nkkVar5.b = i59 + 4;
                                            nkkVar5.E(i59);
                                            f3 = nkkVar5.f();
                                            if (i22 == 1) {
                                                nkkVar5.F(16);
                                            }
                                            i23 = i62;
                                        } else if (i22 == 2) {
                                            nkkVar5.F(16);
                                            iArr = iArr4;
                                            i23 = (int) Math.round(Double.longBitsToDouble(nkkVar5.m()));
                                            x = nkkVar5.v();
                                            nkkVar5.F(20);
                                            iArr2 = iArr3;
                                            f3 = 0;
                                        } else {
                                            i25 = i2;
                                            arrayList3 = arrayList6;
                                            rl0Var2 = rl0Var4;
                                            pair = create2;
                                            i7 = i3;
                                            i10 = i42;
                                            i24 = f10;
                                            str = str6;
                                            i13 = i36;
                                            i2 = i25;
                                            i12 = i24;
                                        }
                                        int i63 = nkkVar5.b;
                                        int i64 = i23;
                                        if (f11 == 1701733217) {
                                            Pair c2 = c(nkkVar5, i42, f10);
                                            if (c2 != null) {
                                                int intValue = ((Integer) c2.first).intValue();
                                                if (drmInitData5 == null) {
                                                    i33 = intValue;
                                                    a2 = r18;
                                                } else {
                                                    i33 = intValue;
                                                    a2 = drmInitData5.a(((ksj) c2.second).b);
                                                }
                                                ksjVarArr[i3] = (ksj) c2.second;
                                                drmInitData4 = a2;
                                                f11 = i33;
                                            } else {
                                                drmInitData4 = drmInitData5;
                                            }
                                            nkkVar5.E(i63);
                                        } else {
                                            drmInitData4 = drmInitData5;
                                        }
                                        int i65 = x;
                                        String str12 = MimeTypes.AUDIO_AC3;
                                        i7 = i3;
                                        if (f11 == 1633889587) {
                                            str4 = MimeTypes.AUDIO_AC3;
                                        } else if (f11 == 1700998451) {
                                            str4 = MimeTypes.AUDIO_E_AC3;
                                        } else if (f11 == 1633889588) {
                                            str4 = "audio/ac4";
                                        } else if (f11 == 1685353315) {
                                            str4 = MimeTypes.AUDIO_DTS;
                                        } else if (f11 == 1685353320 || f11 == 1685353324) {
                                            str4 = MimeTypes.AUDIO_DTS_HD;
                                        } else if (f11 == 1685353317) {
                                            str4 = MimeTypes.AUDIO_DTS_EXPRESS;
                                        } else if (f11 == 1685353336) {
                                            str4 = "audio/vnd.dts.uhd;profile=p2";
                                        } else if (f11 == 1935764850) {
                                            str4 = MimeTypes.AUDIO_AMR_NB;
                                        } else if (f11 == 1935767394) {
                                            str4 = MimeTypes.AUDIO_AMR_WB;
                                        } else {
                                            if (f11 == 1819304813 || f11 == 1936684916) {
                                                str4 = MimeTypes.AUDIO_RAW;
                                                i26 = 2;
                                            } else if (f11 == 1953984371) {
                                                i26 = 268435456;
                                                str4 = MimeTypes.AUDIO_RAW;
                                            } else {
                                                str4 = (f11 == 778924082 || f11 == 778924083) ? MimeTypes.AUDIO_MPEG : f11 == 1835557169 ? "audio/mha1" : f11 == 1835560241 ? "audio/mhm1" : f11 == 1634492771 ? MimeTypes.AUDIO_ALAC : f11 == 1634492791 ? MimeTypes.AUDIO_ALAW : f11 == 1970037111 ? MimeTypes.AUDIO_MLAW : f11 == 1332770163 ? MimeTypes.AUDIO_OPUS : f11 == 1716281667 ? MimeTypes.AUDIO_FLAC : f11 == 1835823201 ? MimeTypes.AUDIO_TRUEHD : r18;
                                            }
                                            i25 = i2;
                                            arrayList3 = arrayList6;
                                            rl0Var2 = rl0Var4;
                                            pair = create2;
                                            i10 = i42;
                                            List list6 = r18;
                                            Object obj3 = list6;
                                            obj = obj3;
                                            i27 = i65;
                                            i28 = i64;
                                            i29 = i63;
                                            Exception exc = r18;
                                            while (i29 - i10 < f10) {
                                                nkkVar5.E(i29);
                                                int f18 = nkkVar5.f();
                                                int i66 = f10;
                                                u6h.F("childAtomSize must be positive", f18 > 0);
                                                int f19 = nkkVar5.f();
                                                List list7 = list6;
                                                if (f19 == 1835557187) {
                                                    int i67 = f18 - 13;
                                                    byte[] bArr7 = new byte[i67];
                                                    i31 = i26;
                                                    nkkVar5.E(i29 + 13);
                                                    nkkVar5.e(bArr7, 0, i67);
                                                    list6 = hv9.z(bArr7);
                                                    str5 = str12;
                                                } else {
                                                    i31 = i26;
                                                    int i68 = 1702061171;
                                                    if (f19 != 1702061171) {
                                                        if (z2 && f19 == 2002876005) {
                                                            i68 = 1702061171;
                                                        } else {
                                                            if (f19 == 1684103987) {
                                                                nkkVar5.E(i29 + 8);
                                                                String num = Integer.toString(i43);
                                                                int i69 = iArr[(nkkVar5.s() & PsExtractor.AUDIO_STREAM) >> 6];
                                                                int s3 = nkkVar5.s();
                                                                int i70 = iArr2[(s3 & 56) >> 3];
                                                                if ((s3 & 4) != 0) {
                                                                    i70++;
                                                                }
                                                                obj2 = obj3;
                                                                pm8 pm8Var2 = new pm8();
                                                                pm8Var2.a = num;
                                                                pm8Var2.k = str12;
                                                                pm8Var2.x = i70;
                                                                pm8Var2.y = i69;
                                                                pm8Var2.n = drmInitData4;
                                                                pm8Var2.c = str6;
                                                                sm8Var = new sm8(pm8Var2);
                                                                str5 = str12;
                                                            } else {
                                                                obj2 = obj3;
                                                                if (f19 == 1684366131) {
                                                                    nkkVar5.E(i29 + 8);
                                                                    String num2 = Integer.toString(i43);
                                                                    nkkVar5.F(2);
                                                                    int i71 = iArr[(nkkVar5.s() & PsExtractor.AUDIO_STREAM) >> 6];
                                                                    int s4 = nkkVar5.s();
                                                                    int i72 = iArr2[(s4 & 14) >> 1];
                                                                    if ((s4 & 1) != 0) {
                                                                        i72++;
                                                                    }
                                                                    if (((nkkVar5.s() & 30) >> 1) > 0 && (nkkVar5.s() & 2) != 0) {
                                                                        i72 += 2;
                                                                    }
                                                                    String str13 = (nkkVar5.c() <= 0 || (nkkVar5.s() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC;
                                                                    str5 = str12;
                                                                    pm8 pm8Var3 = new pm8();
                                                                    pm8Var3.a = num2;
                                                                    pm8Var3.k = str13;
                                                                    pm8Var3.x = i72;
                                                                    pm8Var3.y = i71;
                                                                    pm8Var3.n = drmInitData4;
                                                                    pm8Var3.c = str6;
                                                                    sm8Var2 = new sm8(pm8Var3);
                                                                } else {
                                                                    str5 = str12;
                                                                    if (f19 == 1684103988) {
                                                                        nkkVar5.E(i29 + 8);
                                                                        String num3 = Integer.toString(i43);
                                                                        nkkVar5.F(1);
                                                                        int i73 = ((nkkVar5.s() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                        pm8 pm8Var4 = new pm8();
                                                                        pm8Var4.a = num3;
                                                                        pm8Var4.k = "audio/ac4";
                                                                        pm8Var4.x = 2;
                                                                        pm8Var4.y = i73;
                                                                        pm8Var4.n = drmInitData4;
                                                                        pm8Var4.c = str6;
                                                                        sm8Var2 = new sm8(pm8Var4);
                                                                    } else if (f19 == 1684892784) {
                                                                        if (f3 <= 0) {
                                                                            throw r9e.a("Invalid sample rate for Dolby TrueHD MLP stream: " + f3, exc);
                                                                        }
                                                                        i28 = f3;
                                                                        list6 = list7;
                                                                        obj3 = obj2;
                                                                        i27 = 2;
                                                                        i29 += f18;
                                                                        i26 = i31;
                                                                        f10 = i66;
                                                                        str12 = str5;
                                                                        exc = null;
                                                                    } else if (f19 == 1684305011) {
                                                                        pm8 pm8Var5 = new pm8();
                                                                        pm8Var5.a = Integer.toString(i43);
                                                                        pm8Var5.k = str4;
                                                                        pm8Var5.x = i27;
                                                                        pm8Var5.y = i28;
                                                                        pm8Var5.n = drmInitData4;
                                                                        pm8Var5.c = str6;
                                                                        sm8Var = new sm8(pm8Var5);
                                                                    } else {
                                                                        if (f19 == 1682927731) {
                                                                            int i74 = f18 - 8;
                                                                            byte[] bArr8 = a;
                                                                            byte[] copyOf = Arrays.copyOf(bArr8, bArr8.length + i74);
                                                                            nkkVar5.E(i29 + 8);
                                                                            nkkVar5.e(copyOf, bArr8.length, i74);
                                                                            list6 = hda.r(copyOf);
                                                                        } else if (f19 == 1684425825) {
                                                                            byte[] bArr9 = new byte[f18 - 8];
                                                                            bArr9[0] = 102;
                                                                            bArr9[1] = 76;
                                                                            bArr9[2] = 97;
                                                                            bArr9[i36] = 67;
                                                                            nkkVar5.E(i29 + 12);
                                                                            nkkVar5.e(bArr9, 4, f18 - 12);
                                                                            list6 = hv9.z(bArr9);
                                                                        } else {
                                                                            if (f19 == 1634492771) {
                                                                                int i75 = f18 - 12;
                                                                                byte[] bArr10 = new byte[i75];
                                                                                nkkVar5.E(i29 + 12);
                                                                                nkkVar5.e(bArr10, 0, i75);
                                                                                nkk nkkVar6 = new nkk(bArr10);
                                                                                nkkVar6.E(9);
                                                                                int s5 = nkkVar6.s();
                                                                                nkkVar6.E(20);
                                                                                Pair create3 = Pair.create(Integer.valueOf(nkkVar6.v()), Integer.valueOf(s5));
                                                                                int intValue2 = ((Integer) create3.first).intValue();
                                                                                i27 = ((Integer) create3.second).intValue();
                                                                                list6 = hv9.z(bArr10);
                                                                                i28 = intValue2;
                                                                                obj3 = obj2;
                                                                                i29 += f18;
                                                                                i26 = i31;
                                                                                f10 = i66;
                                                                                str12 = str5;
                                                                                exc = null;
                                                                            }
                                                                            list6 = list7;
                                                                            obj3 = obj2;
                                                                            i29 += f18;
                                                                            i26 = i31;
                                                                            f10 = i66;
                                                                            str12 = str5;
                                                                            exc = null;
                                                                        }
                                                                        obj3 = obj2;
                                                                    }
                                                                }
                                                                sm8Var = sm8Var2;
                                                            }
                                                            list6 = list7;
                                                            obj3 = obj2;
                                                            i29 += f18;
                                                            i26 = i31;
                                                            f10 = i66;
                                                            str12 = str5;
                                                            exc = null;
                                                        }
                                                    }
                                                    Object obj4 = obj3;
                                                    str5 = str12;
                                                    if (f19 != i68) {
                                                        i32 = nkkVar5.b;
                                                        u6h.F(null, i32 >= i29);
                                                        while (true) {
                                                            if (i32 - i29 >= f18) {
                                                                i32 = -1;
                                                                break;
                                                            }
                                                            nkkVar5.E(i32);
                                                            int f20 = nkkVar5.f();
                                                            u6h.F("childAtomSize must be positive", f20 > 0);
                                                            if (nkkVar5.f() == 1702061171) {
                                                                break;
                                                            }
                                                            i32 += f20;
                                                        }
                                                    } else {
                                                        i32 = i29;
                                                    }
                                                    if (i32 != -1) {
                                                        ?? a8 = a(i32, nkkVar5);
                                                        str4 = a8.a;
                                                        byte[] bArr11 = a8.b;
                                                        if (bArr11 != null) {
                                                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                                                d0 O = kik.O(new nm2(bArr11, bArr11.length, 2, (byte) 0), false);
                                                                int i76 = O.a;
                                                                i27 = O.b;
                                                                obj4 = O.c;
                                                                i28 = i76;
                                                            }
                                                            obj = a8;
                                                            list6 = hv9.z(bArr11);
                                                            obj3 = obj4;
                                                            i29 += f18;
                                                            i26 = i31;
                                                            f10 = i66;
                                                            str12 = str5;
                                                            exc = null;
                                                        } else {
                                                            obj = a8;
                                                        }
                                                    }
                                                    list6 = list7;
                                                    obj3 = obj4;
                                                    i29 += f18;
                                                    i26 = i31;
                                                    f10 = i66;
                                                    str12 = str5;
                                                    exc = null;
                                                }
                                                i29 += f18;
                                                i26 = i31;
                                                f10 = i66;
                                                str12 = str5;
                                                exc = null;
                                            }
                                            list3 = list6;
                                            r43 = obj3;
                                            i30 = i26;
                                            i24 = f10;
                                            if (sm8Var == null && str4 != null) {
                                                pm8 pm8Var6 = new pm8();
                                                pm8Var6.a = Integer.toString(i43);
                                                pm8Var6.k = str4;
                                                pm8Var6.h = r43;
                                                pm8Var6.x = i27;
                                                pm8Var6.y = i28;
                                                pm8Var6.z = i30;
                                                pm8Var6.m = list3;
                                                pm8Var6.n = drmInitData4;
                                                pm8Var6.c = str6;
                                                if (obj != null) {
                                                    ?? r1 = obj;
                                                    pm8Var6.f = jaa.M(r1.c);
                                                    pm8Var6.g = jaa.M(r1.d);
                                                }
                                                sm8Var = new sm8(pm8Var6);
                                            }
                                            str = str6;
                                            i13 = i36;
                                            i2 = i25;
                                            i12 = i24;
                                        }
                                        i26 = -1;
                                        i25 = i2;
                                        arrayList3 = arrayList6;
                                        rl0Var2 = rl0Var4;
                                        pair = create2;
                                        i10 = i42;
                                        List list62 = r18;
                                        Object obj32 = list62;
                                        obj = obj32;
                                        i27 = i65;
                                        i28 = i64;
                                        i29 = i63;
                                        Exception exc2 = r18;
                                        while (i29 - i10 < f10) {
                                        }
                                        list3 = list62;
                                        r43 = obj32;
                                        i30 = i26;
                                        i24 = f10;
                                        if (sm8Var == null) {
                                            pm8 pm8Var62 = new pm8();
                                            pm8Var62.a = Integer.toString(i43);
                                            pm8Var62.k = str4;
                                            pm8Var62.h = r43;
                                            pm8Var62.x = i27;
                                            pm8Var62.y = i28;
                                            pm8Var62.z = i30;
                                            pm8Var62.m = list3;
                                            pm8Var62.n = drmInitData4;
                                            pm8Var62.c = str6;
                                            if (obj != null) {
                                            }
                                            sm8Var = new sm8(pm8Var62);
                                        }
                                        str = str6;
                                        i13 = i36;
                                        i2 = i25;
                                        i12 = i24;
                                    } else {
                                        if (f11 == 1414810956 || f11 == 1954034535 || f11 == 2004251764 || f11 == 1937010800 || f11 == 1664495672) {
                                            nkkVar5.E(i42 + 16);
                                            String str14 = MimeTypes.APPLICATION_TTML;
                                            if (f11 != 1414810956) {
                                                if (f11 == 1954034535) {
                                                    int i77 = f10 - 16;
                                                    byte[] bArr12 = new byte[i77];
                                                    nkkVar5.e(bArr12, 0, i77);
                                                    vvfVar = hv9.z(bArr12);
                                                    str14 = MimeTypes.APPLICATION_TX3G;
                                                    i6 = f;
                                                    j5 = Long.MAX_VALUE;
                                                    pm8 pm8Var7 = new pm8();
                                                    ksjVarArr = ksjVarArr2;
                                                    pm8Var7.a = Integer.toString(i43);
                                                    pm8Var7.k = str14;
                                                    pm8Var7.c = str6;
                                                    pm8Var7.o = j5;
                                                    pm8Var7.m = vvfVar;
                                                    sm8Var = new sm8(pm8Var7);
                                                    arrayList3 = arrayList6;
                                                    rl0Var2 = rl0Var4;
                                                    pair = create2;
                                                    str = str6;
                                                } else if (f11 == 2004251764) {
                                                    str14 = MimeTypes.APPLICATION_MP4VTT;
                                                } else {
                                                    if (f11 == 1937010800) {
                                                        i6 = f;
                                                        vvfVar = r18;
                                                        j5 = 0;
                                                    } else {
                                                        if (f11 != 1664495672) {
                                                            zzl.s();
                                                            return r18;
                                                        }
                                                        str14 = MimeTypes.APPLICATION_MP4CEA608;
                                                        i6 = f;
                                                        vvfVar = r18;
                                                        j5 = Long.MAX_VALUE;
                                                        i40 = 1;
                                                    }
                                                    pm8 pm8Var72 = new pm8();
                                                    ksjVarArr = ksjVarArr2;
                                                    pm8Var72.a = Integer.toString(i43);
                                                    pm8Var72.k = str14;
                                                    pm8Var72.c = str6;
                                                    pm8Var72.o = j5;
                                                    pm8Var72.m = vvfVar;
                                                    sm8Var = new sm8(pm8Var72);
                                                    arrayList3 = arrayList6;
                                                    rl0Var2 = rl0Var4;
                                                    pair = create2;
                                                    str = str6;
                                                }
                                            }
                                            i6 = f;
                                            vvfVar = r18;
                                            j5 = Long.MAX_VALUE;
                                            pm8 pm8Var722 = new pm8();
                                            ksjVarArr = ksjVarArr2;
                                            pm8Var722.a = Integer.toString(i43);
                                            pm8Var722.k = str14;
                                            pm8Var722.c = str6;
                                            pm8Var722.o = j5;
                                            pm8Var722.m = vvfVar;
                                            sm8Var = new sm8(pm8Var722);
                                            arrayList3 = arrayList6;
                                            rl0Var2 = rl0Var4;
                                            pair = create2;
                                            str = str6;
                                        } else {
                                            if (f11 == 1835365492) {
                                                nkkVar5.E(i42 + 16);
                                                if (f11 == 1835365492) {
                                                    nkkVar5.n();
                                                    String n = nkkVar5.n();
                                                    if (n != null) {
                                                        pm8 pm8Var8 = new pm8();
                                                        pm8Var8.a = Integer.toString(i43);
                                                        pm8Var8.k = n;
                                                        sm8Var = new sm8(pm8Var8);
                                                    }
                                                }
                                            } else if (f11 == 1667329389) {
                                                pm8 pm8Var9 = new pm8();
                                                pm8Var9.a = Integer.toString(i43);
                                                pm8Var9.k = MimeTypes.APPLICATION_CAMERA_MOTION;
                                                arrayList3 = arrayList6;
                                                sm8Var = new sm8(pm8Var9);
                                                rl0Var2 = rl0Var4;
                                                pair = create2;
                                                str = str6;
                                                i6 = f;
                                                ksjVarArr = ksjVarArr2;
                                            }
                                            arrayList3 = arrayList6;
                                            rl0Var2 = rl0Var4;
                                            pair = create2;
                                            str = str6;
                                            i6 = f;
                                            ksjVarArr = ksjVarArr2;
                                        }
                                        i7 = i3;
                                        i10 = i42;
                                        i12 = f10;
                                        i13 = i36;
                                    }
                                }
                                nkkVar5.E(i10 + i12);
                                i3 = i7 + 1;
                                drmInitData5 = drmInitData;
                                i36 = i13;
                                arrayList5 = arrayList7;
                                f5 = i43;
                                i34 = i44;
                                f = i6;
                                str6 = str;
                                arrayList6 = arrayList3;
                                create2 = pair;
                                rl0Var4 = rl0Var2;
                                i35 = i5;
                                ksjVarArr2 = ksjVarArr;
                                r18 = 0;
                            }
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            int i78 = f5;
                            i4 = i34;
                            rl0 rl0Var5 = rl0Var4;
                            Pair pair2 = create2;
                            int i79 = i35;
                            ksj[] ksjVarArr3 = ksjVarArr2;
                            if (z) {
                                rl0Var4 = rl0Var5;
                            } else {
                                rl0Var4 = rl0Var5;
                                rl0 A4 = rl0Var4.A(1701082227);
                                if (A4 != null) {
                                    sl0 B6 = A4.B(1701606260);
                                    if (B6 == null) {
                                        create = null;
                                        jArr3 = null;
                                    } else {
                                        nkk nkkVar7 = B6.g;
                                        nkkVar7.E(8);
                                        int x9 = ffb.x(nkkVar7.f());
                                        int v = nkkVar7.v();
                                        long[] jArr4 = new long[v];
                                        long[] jArr5 = new long[v];
                                        for (int i80 = 0; i80 < v; i80++) {
                                            jArr4[i80] = x9 == 1 ? nkkVar7.w() : nkkVar7.t();
                                            jArr5[i80] = x9 == 1 ? nkkVar7.m() : nkkVar7.f();
                                            if (nkkVar7.p() != 1) {
                                                a70.p("Unsupported media rate.");
                                                return null;
                                            }
                                            nkkVar7.F(2);
                                        }
                                        jArr3 = null;
                                        create = Pair.create(jArr4, jArr5);
                                    }
                                    if (create != null) {
                                        jArr = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        if (sm8Var == null) {
                                            xs8Var2 = xs8Var;
                                        } else {
                                            xs8Var2 = xs8Var;
                                            isjVar = new isj(i78, i79, ((Long) pair2.first).longValue(), t, j6, sm8Var, i40, ksjVarArr3, i41, jArr, jArr2);
                                            isjVar2 = (isj) xs8Var2.apply(isjVar);
                                            if (isjVar2 != null) {
                                                arrayList4 = arrayList2;
                                            } else {
                                                rl0 A5 = rl0Var4.A(1835297121);
                                                A5.getClass();
                                                rl0 A6 = A5.A(1835626086);
                                                A6.getClass();
                                                rl0 A7 = A6.A(1937007212);
                                                A7.getClass();
                                                wsj d = d(isjVar2, A7, gv8Var);
                                                arrayList4 = arrayList2;
                                                arrayList4.add(d);
                                            }
                                        }
                                    }
                                    jArr = jArr3;
                                    jArr2 = jArr;
                                    if (sm8Var == null) {
                                    }
                                }
                            }
                            jArr3 = null;
                            jArr = jArr3;
                            jArr2 = jArr;
                            if (sm8Var == null) {
                            }
                        }
                    } else {
                        i = -65536;
                    }
                    if (f6 == 0 && f7 == i) {
                        if (f8 == 65536 && f9 == 0) {
                            i2 = 270;
                            if (j == C.TIME_UNSET) {
                            }
                            nkk nkkVar32 = B.g;
                            nkkVar32.E(8);
                            nkkVar32.F(ffb.x(nkkVar32.f()) == 0 ? 8 : 16);
                            long t5 = nkkVar32.t();
                            if (j4 != C.TIME_UNSET) {
                            }
                            rl0 A22 = A.A(1835626086);
                            A22.getClass();
                            rl0 A32 = A22.A(1937007212);
                            A32.getClass();
                            sl0 B42 = A.B(1835296868);
                            B42.getClass();
                            nkk nkkVar42 = B42.g;
                            nkkVar42.E(8);
                            int x32 = ffb.x(nkkVar42.f());
                            nkkVar42.F(x32 == 0 ? 8 : 16);
                            long t22 = nkkVar42.t();
                            nkkVar42.F(x32 == 0 ? 4 : 8);
                            int x42 = nkkVar42.x();
                            Pair create22 = Pair.create(Long.valueOf(t22), "" + ((char) (((x42 >> 10) & 31) + 96)) + ((char) (((x42 >> 5) & 31) + 96)) + ((char) ((x42 & 31) + 96)));
                            sl0 B52 = A32.B(1937011556);
                            B52.getClass();
                            nkk nkkVar52 = B52.g;
                            String str62 = (String) create22.second;
                            nkkVar52.E(12);
                            f = nkkVar52.f();
                            ksj[] ksjVarArr22 = new ksj[f];
                            long j62 = j2;
                            i3 = 0;
                            int i402 = 0;
                            int i412 = 0;
                            sm8Var = null;
                            while (i3 < f) {
                            }
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            int i782 = f5;
                            i4 = i34;
                            rl0 rl0Var52 = rl0Var4;
                            Pair pair22 = create22;
                            int i792 = i35;
                            ksj[] ksjVarArr32 = ksjVarArr22;
                            if (z) {
                            }
                            jArr3 = null;
                            jArr = jArr3;
                            jArr2 = jArr;
                            if (sm8Var == null) {
                            }
                        } else {
                            i = -65536;
                        }
                    }
                    i2 = (f6 == i && f7 == 0 && f8 == 0 && f9 == i) ? 180 : 0;
                    if (j == C.TIME_UNSET) {
                    }
                    nkk nkkVar322 = B.g;
                    nkkVar322.E(8);
                    nkkVar322.F(ffb.x(nkkVar322.f()) == 0 ? 8 : 16);
                    long t52 = nkkVar322.t();
                    if (j4 != C.TIME_UNSET) {
                    }
                    rl0 A222 = A.A(1835626086);
                    A222.getClass();
                    rl0 A322 = A222.A(1937007212);
                    A322.getClass();
                    sl0 B422 = A.B(1835296868);
                    B422.getClass();
                    nkk nkkVar422 = B422.g;
                    nkkVar422.E(8);
                    int x322 = ffb.x(nkkVar422.f());
                    nkkVar422.F(x322 == 0 ? 8 : 16);
                    long t222 = nkkVar422.t();
                    nkkVar422.F(x322 == 0 ? 4 : 8);
                    int x422 = nkkVar422.x();
                    Pair create222 = Pair.create(Long.valueOf(t222), "" + ((char) (((x422 >> 10) & 31) + 96)) + ((char) (((x422 >> 5) & 31) + 96)) + ((char) ((x422 & 31) + 96)));
                    sl0 B522 = A322.B(1937011556);
                    B522.getClass();
                    nkk nkkVar522 = B522.g;
                    String str622 = (String) create222.second;
                    nkkVar522.E(12);
                    f = nkkVar522.f();
                    ksj[] ksjVarArr222 = new ksj[f];
                    long j622 = j2;
                    i3 = 0;
                    int i4022 = 0;
                    int i4122 = 0;
                    sm8Var = null;
                    while (i3 < f) {
                    }
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    int i7822 = f5;
                    i4 = i34;
                    rl0 rl0Var522 = rl0Var4;
                    Pair pair222 = create222;
                    int i7922 = i35;
                    ksj[] ksjVarArr322 = ksjVarArr222;
                    if (z) {
                    }
                    jArr3 = null;
                    jArr = jArr3;
                    jArr2 = jArr;
                    if (sm8Var == null) {
                    }
                }
                isjVar = jArr3;
                isjVar2 = (isj) xs8Var2.apply(isjVar);
                if (isjVar2 != null) {
                }
            }
            i34 = i4 + 1;
            rl0Var3 = rl0Var;
            drmInitData5 = drmInitData;
            arrayList6 = arrayList4;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }
}
