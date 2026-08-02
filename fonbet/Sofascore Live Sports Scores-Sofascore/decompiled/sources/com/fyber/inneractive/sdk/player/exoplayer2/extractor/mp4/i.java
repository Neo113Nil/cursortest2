package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.zzl;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class i {
    public static final int a = z.a("vide");
    public static final int b = z.a("soun");
    public static final int c = z.a("text");
    public static final int d = z.a("sbtl");
    public static final int e = z.a("subt");
    public static final int f = z.a("clcp");
    public static final int g = z.a(C.CENC_TYPE_cenc);
    public static final int h = z.a("meta");

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r13 == 0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x079d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c0  */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v8, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v27 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v29 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r27v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r33v17 */
    /* JADX WARN: Type inference failed for: r33v18 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r40v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s a(a aVar, b bVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, boolean z) {
        long j2;
        s sVar;
        long j3;
        int i;
        int i2;
        long j4;
        int b2;
        int i3;
        a b3;
        s sVar2;
        Pair create;
        b c2;
        int i4;
        long j5;
        int i5;
        int i6;
        int i7;
        int i8;
        List list;
        String str;
        String str2;
        int i9;
        int o;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str3;
        long j6;
        Object obj;
        Object obj2;
        a b4 = aVar.b(c.F);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = b4.c(c.T).P0;
        nVar.e(16);
        int b5 = nVar.b();
        int i16 = b5 == b ? 1 : b5 == a ? 2 : (b5 == c || b5 == d || b5 == e || b5 == f) ? 3 : b5 == h ? 4 : -1;
        s sVar3 = null;
        if (i16 == -1) {
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = aVar.c(c.P).P0;
        int i17 = 8;
        nVar2.e(8);
        int b6 = (nVar2.b() >> 24) & 255;
        nVar2.e(nVar2.b + (b6 == 0 ? 8 : 16));
        int b7 = nVar2.b();
        nVar2.e(nVar2.b + 4);
        int i18 = nVar2.b;
        int i19 = b6 == 0 ? 4 : 8;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            j2 = C.TIME_UNSET;
            if (i21 >= i19) {
                sVar = sVar3;
                nVar2.e(nVar2.b + i19);
                break;
            }
            sVar = sVar3;
            if (nVar2.a[i18 + i21] != -1) {
                j3 = b6 == 0 ? nVar2.k() : nVar2.n();
            } else {
                i21++;
                sVar3 = sVar;
            }
        }
        j3 = -9223372036854775807L;
        nVar2.e(nVar2.b + 16);
        int b8 = nVar2.b();
        int b9 = nVar2.b();
        nVar2.e(nVar2.b + 4);
        int b10 = nVar2.b();
        int b11 = nVar2.b();
        int i22 = 3;
        if (b8 == 0 && b9 == 65536 && b10 == -65536 && b11 == 0) {
            i2 = 90;
        } else if (b8 == 0 && b9 == -65536 && b10 == 65536 && b11 == 0) {
            i2 = 270;
        } else {
            if (b8 != -65536 || b9 != 0 || b10 != 0 || b11 != -65536) {
                i = 0;
                j4 = j != C.TIME_UNSET ? j3 : j;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = bVar.P0;
                nVar3.e(8);
                int b12 = nVar3.b();
                int i23 = c.b;
                nVar3.e(nVar3.b + (((b12 >> 24) & 255) != 0 ? 8 : 16));
                long k = nVar3.k();
                if (j4 != C.TIME_UNSET) {
                    j2 = z.a(j4, 1000000L, k);
                }
                long j7 = k;
                a b13 = b4.b(c.G).b(c.H);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = b4.c(c.S).P0;
                nVar4.e(8);
                int b14 = (nVar4.b() >> 24) & 255;
                nVar4.e(nVar4.b + (b14 != 0 ? 8 : 16));
                long k2 = nVar4.k();
                nVar4.e(nVar4.b + (b14 != 0 ? 4 : 8));
                int o2 = nVar4.o();
                Pair create2 = Pair.create(Long.valueOf(k2), "" + ((char) (((o2 >> 10) & 31) + 96)) + ((char) (((o2 >> 5) & 31) + 96)) + ((char) ((o2 & 31) + 96)));
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = b13.c(c.U).P0;
                String str4 = (String) create2.second;
                nVar5.e(12);
                b2 = nVar5.b();
                f fVar = new f(b2);
                i3 = 0;
                while (i3 < b2) {
                    int i24 = nVar5.b;
                    int b15 = nVar5.b();
                    int i25 = i17;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b15 > 0 ? 1 : i20, "childAtomSize should be positive");
                    int b16 = nVar5.b();
                    if (b16 == c.c || b16 == c.d || b16 == c.a0 || b16 == c.l0 || b16 == c.e || b16 == c.f || b16 == c.g || b16 == c.K0 || b16 == c.L0) {
                        i4 = i20;
                        j5 = j7;
                        i5 = b2;
                        nVar5.e(i24 + 16);
                        nVar5.e(nVar5.b + 16);
                        int o3 = nVar5.o();
                        int o4 = nVar5.o();
                        nVar5.e(nVar5.b + 50);
                        int i26 = nVar5.b;
                        if (b16 == c.a0) {
                            b16 = a(nVar5, i24, b15, fVar, i3);
                            nVar5.e(i26);
                        }
                        int i27 = -1;
                        float f2 = 1.0f;
                        s sVar4 = sVar;
                        ?? r30 = sVar4;
                        ?? r33 = r30;
                        int i28 = i4;
                        ?? r26 = sVar4;
                        while (i26 - i24 < b15) {
                            nVar5.e(i26);
                            int i29 = nVar5.b;
                            int b17 = nVar5.b();
                            if (b17 == 0 && nVar5.b - i24 == b15) {
                                break;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b17 > 0 ? 1 : i4, "childAtomSize should be positive");
                            int b18 = nVar5.b();
                            int i30 = i26;
                            if (b18 == c.I) {
                                if (r26 != 0) {
                                    zzl.s();
                                    return sVar;
                                }
                                nVar5.e(i29 + 8);
                                com.fyber.inneractive.sdk.player.exoplayer2.video.a a2 = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar5);
                                list = a2.a;
                                fVar.c = a2.b;
                                if (i28 == 0) {
                                    f2 = a2.e;
                                }
                                str2 = "video/avc";
                            } else if (b18 != c.J) {
                                if (b18 == c.M0) {
                                    if (r26 != 0) {
                                        zzl.s();
                                        return sVar;
                                    }
                                    str = b16 == c.K0 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                } else if (b18 == c.h) {
                                    if (r26 != 0) {
                                        zzl.s();
                                        return sVar;
                                    }
                                    str = MimeTypes.VIDEO_H263;
                                } else if (b18 != c.K) {
                                    if (b18 == c.j0) {
                                        nVar5.e(i29 + 8);
                                        f2 = nVar5.m() / nVar5.m();
                                        i8 = i22;
                                        i7 = 1;
                                    } else {
                                        if (b18 == c.I0) {
                                            int i31 = i29 + 8;
                                            while (true) {
                                                if (i31 - i29 >= b17) {
                                                    i7 = i28;
                                                    r33 = sVar;
                                                    r26 = r26;
                                                    break;
                                                }
                                                nVar5.e(i31);
                                                int b19 = nVar5.b();
                                                i7 = i28;
                                                if (nVar5.b() == c.J0) {
                                                    r26 = r26;
                                                    r33 = Arrays.copyOfRange(nVar5.a, i31, i31 + b19);
                                                    break;
                                                }
                                                i31 += b19;
                                                i28 = i7;
                                            }
                                        } else {
                                            i7 = i28;
                                            r26 = r26;
                                            r33 = r33;
                                            if (b18 == c.H0) {
                                                int j8 = nVar5.j();
                                                nVar5.e(nVar5.b + 3);
                                                r26 = r26;
                                                r33 = r33;
                                                if (j8 == 0) {
                                                    int j9 = nVar5.j();
                                                    if (j9 == 0) {
                                                        i8 = i22;
                                                        i27 = i4;
                                                    } else if (j9 != 1) {
                                                        i8 = i22;
                                                        if (j9 == 2) {
                                                            i27 = 2;
                                                        } else if (j9 == i8) {
                                                            i27 = i8;
                                                        }
                                                    } else {
                                                        i8 = i22;
                                                        i27 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        i8 = i22;
                                    }
                                    i26 = i30 + b17;
                                    i22 = i8;
                                    i28 = i7;
                                    r26 = r26;
                                    r33 = r33;
                                } else {
                                    if (r26 != 0) {
                                        zzl.s();
                                        return sVar;
                                    }
                                    Pair a3 = a(i29, nVar5);
                                    String str5 = (String) a3.first;
                                    r30 = Collections.singletonList((byte[]) a3.second);
                                    str = str5;
                                }
                                i7 = i28;
                                r26 = str;
                                r33 = r33;
                                i8 = i22;
                                i26 = i30 + b17;
                                i22 = i8;
                                i28 = i7;
                                r26 = r26;
                                r33 = r33;
                            } else {
                                if (r26 != 0) {
                                    zzl.s();
                                    return sVar;
                                }
                                nVar5.e(i29 + 8);
                                com.fyber.inneractive.sdk.player.exoplayer2.video.d a4 = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(nVar5);
                                list = a4.a;
                                fVar.c = a4.b;
                                str2 = "video/hevc";
                            }
                            r30 = list;
                            str = str2;
                            i7 = i28;
                            r26 = str;
                            r33 = r33;
                            i8 = i22;
                            i26 = i30 + b17;
                            i22 = i8;
                            i28 = i7;
                            r26 = r26;
                            r33 = r33;
                        }
                        i6 = i22;
                        if (r26 != 0) {
                            fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b7), r26, -1, o3, o4, r30, i, f2, r33, i27, null, dVar);
                        }
                    } else {
                        if (b16 == c.j || b16 == c.b0 || b16 == c.o || b16 == c.q || b16 == c.s || b16 == c.v || b16 == c.t || b16 == c.u || b16 == c.y0 || b16 == c.z0 || b16 == c.m || b16 == c.n || b16 == c.k || b16 == c.O0) {
                            nVar5.e(i24 + 16);
                            if (z) {
                                i9 = nVar5.o();
                                nVar5.e(nVar5.b + 6);
                            } else {
                                nVar5.e(nVar5.b + 8);
                                i9 = 0;
                            }
                            if (i9 == 0 || i9 == 1) {
                                j5 = j7;
                                o = nVar5.o();
                                nVar5.e(nVar5.b + 6);
                                byte[] bArr = nVar5.a;
                                int i32 = nVar5.b;
                                int i33 = i32 + 1;
                                nVar5.b = i33;
                                int i34 = (bArr[i32] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                nVar5.b = i32 + 2;
                                int i35 = i34 | (bArr[i33] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                nVar5.b = i32 + 4;
                                if (i9 == 1) {
                                    nVar5.e(i32 + 20);
                                }
                                i10 = i35;
                            } else if (i9 == 2) {
                                nVar5.e(nVar5.b + 16);
                                j5 = j7;
                                i10 = (int) Math.round(Double.longBitsToDouble(nVar5.g()));
                                o = nVar5.m();
                                nVar5.e(nVar5.b + 20);
                            } else {
                                j5 = j7;
                                i5 = b2;
                                i6 = i22;
                                i4 = 0;
                            }
                            int i36 = nVar5.b;
                            if (b16 == c.b0) {
                                b16 = a(nVar5, i24, b15, fVar, i3);
                                nVar5.e(i36);
                            }
                            int i37 = i10;
                            Object obj3 = b16 == c.o ? MimeTypes.AUDIO_AC3 : b16 == c.q ? MimeTypes.AUDIO_E_AC3 : b16 == c.s ? MimeTypes.AUDIO_DTS : (b16 == c.t || b16 == c.u) ? MimeTypes.AUDIO_DTS_HD : b16 == c.v ? MimeTypes.AUDIO_DTS_EXPRESS : b16 == c.y0 ? MimeTypes.AUDIO_AMR_NB : b16 == c.z0 ? MimeTypes.AUDIO_AMR_WB : (b16 == c.m || b16 == c.n) ? MimeTypes.AUDIO_RAW : b16 == c.k ? MimeTypes.AUDIO_MPEG : b16 == c.O0 ? MimeTypes.AUDIO_ALAC : sVar;
                            ?? r25 = sVar;
                            int i38 = i36;
                            int i39 = o;
                            while (i38 - i24 < b15) {
                                nVar5.e(i38);
                                int b20 = nVar5.b();
                                int i40 = i39;
                                com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b20 > 0, "childAtomSize should be positive");
                                int b21 = nVar5.b();
                                int i41 = b2;
                                int i42 = c.K;
                                if (b21 != i42) {
                                    ?? r27 = obj3;
                                    if (z && b21 == c.l) {
                                        obj3 = r27;
                                    } else {
                                        if (b21 == c.p) {
                                            nVar5.e(i38 + 8);
                                            String num = Integer.toString(b7);
                                            int i43 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.b[(nVar5.j() & PsExtractor.AUDIO_STREAM) >> 6];
                                            int j10 = nVar5.j();
                                            int i44 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.d[(j10 & 56) >> 3];
                                            if ((j10 & 4) != 0) {
                                                i44++;
                                            }
                                            fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(num, MimeTypes.AUDIO_AC3, -1, -1, i44, i43, null, dVar, str4);
                                        } else if (b21 == c.r) {
                                            nVar5.e(i38 + 8);
                                            String num2 = Integer.toString(b7);
                                            nVar5.e(nVar5.b + 2);
                                            int i45 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.b[(nVar5.j() & PsExtractor.AUDIO_STREAM) >> 6];
                                            int j11 = nVar5.j();
                                            int i46 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.d[(j11 & 14) >> 1];
                                            if ((j11 & 1) != 0) {
                                                i46++;
                                            }
                                            fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(num2, MimeTypes.AUDIO_E_AC3, -1, -1, i46, i45, null, dVar, str4);
                                        } else {
                                            if (b21 == c.w) {
                                                i11 = i37;
                                                i12 = i40;
                                                obj3 = r27;
                                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b7), r27, -1, -1, i12, i11, null, dVar, str4);
                                            } else {
                                                i11 = i37;
                                                i12 = i40;
                                                obj3 = r27;
                                                if (b21 == c.O0) {
                                                    byte[] bArr2 = new byte[b20];
                                                    nVar5.e(i38);
                                                    nVar5.a(bArr2, 0, b20);
                                                    i13 = b20;
                                                    r25 = bArr2;
                                                    i39 = i12;
                                                    i38 += i13;
                                                    i37 = i11;
                                                    b2 = i41;
                                                    r25 = r25;
                                                }
                                            }
                                            i13 = b20;
                                            i39 = i12;
                                            i38 += i13;
                                            i37 = i11;
                                            b2 = i41;
                                            r25 = r25;
                                        }
                                        i11 = i37;
                                        i13 = b20;
                                        i12 = i40;
                                        obj3 = r27;
                                        i39 = i12;
                                        i38 += i13;
                                        i37 = i11;
                                        b2 = i41;
                                        r25 = r25;
                                    }
                                }
                                i11 = i37;
                                i12 = i40;
                                if (b21 == i42) {
                                    i13 = b20;
                                    i15 = i38;
                                } else {
                                    int i47 = nVar5.b;
                                    while (i47 - i38 < b20) {
                                        nVar5.e(i47);
                                        int b22 = nVar5.b();
                                        i13 = b20;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b22 > 0, "childAtomSize should be positive");
                                        int i48 = i47;
                                        if (nVar5.b() == c.K) {
                                            i15 = i48;
                                        } else {
                                            i47 = i48 + b22;
                                            b20 = i13;
                                        }
                                    }
                                    i13 = b20;
                                    i14 = -1;
                                    i15 = -1;
                                    if (i15 != i14) {
                                        Pair a5 = a(i15, nVar5);
                                        String str6 = (String) a5.first;
                                        r25 = (byte[]) a5.second;
                                        if (MimeTypes.AUDIO_AAC.equals(str6)) {
                                            Pair a6 = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(r25);
                                            int intValue = ((Integer) a6.first).intValue();
                                            i39 = ((Integer) a6.second).intValue();
                                            i11 = intValue;
                                            obj3 = str6;
                                            i38 += i13;
                                            i37 = i11;
                                            b2 = i41;
                                            r25 = r25;
                                        } else {
                                            obj3 = str6;
                                        }
                                    }
                                    i39 = i12;
                                    i38 += i13;
                                    i37 = i11;
                                    b2 = i41;
                                    r25 = r25;
                                }
                                i14 = -1;
                                if (i15 != i14) {
                                }
                                i39 = i12;
                                i38 += i13;
                                i37 = i11;
                                b2 = i41;
                                r25 = r25;
                            }
                            int i49 = i37;
                            int i50 = i39;
                            i5 = b2;
                            i4 = 0;
                            if (fVar.b == null && obj3 != null) {
                                String str7 = str4;
                                str4 = str7;
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b7), obj3, -1, -1, i50, i49, MimeTypes.AUDIO_RAW.equals(obj3) ? 2 : -1, -1, -1, r25 == 0 ? sVar : Collections.singletonList(r25), dVar, 0, str7, null);
                            }
                        } else {
                            int i51 = c.k0;
                            if (b16 == i51 || b16 == c.u0 || b16 == c.v0 || b16 == c.w0 || b16 == c.x0) {
                                nVar5.e(i24 + 16);
                                String str8 = MimeTypes.APPLICATION_TTML;
                                if (b16 != i51) {
                                    if (b16 == c.u0) {
                                        int i52 = b15 - 16;
                                        byte[] bArr3 = new byte[i52];
                                        nVar5.a(bArr3, i20, i52);
                                        Object singletonList = Collections.singletonList(bArr3);
                                        str3 = MimeTypes.APPLICATION_TX3G;
                                        obj2 = singletonList;
                                        j6 = Long.MAX_VALUE;
                                        obj = obj2;
                                        String str9 = str4;
                                        str4 = str9;
                                        fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b7), str3, 0, str9, -1, dVar, j6, obj);
                                    } else if (b16 == c.v0) {
                                        str8 = MimeTypes.APPLICATION_MP4VTT;
                                    } else if (b16 == c.w0) {
                                        str3 = MimeTypes.APPLICATION_TTML;
                                        j6 = 0;
                                        obj = sVar;
                                        String str92 = str4;
                                        str4 = str92;
                                        fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b7), str3, 0, str92, -1, dVar, j6, obj);
                                    } else {
                                        if (b16 != c.x0) {
                                            zzl.s();
                                            return sVar;
                                        }
                                        fVar.d = 1;
                                        str8 = MimeTypes.APPLICATION_MP4CEA608;
                                    }
                                }
                                str3 = str8;
                                obj2 = sVar;
                                j6 = Long.MAX_VALUE;
                                obj = obj2;
                                String str922 = str4;
                                str4 = str922;
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b7), str3, 0, str922, -1, dVar, j6, obj);
                            } else if (b16 == c.N0) {
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b7), MimeTypes.APPLICATION_CAMERA_MOTION, dVar);
                            }
                            i4 = i20;
                            j5 = j7;
                            i5 = b2;
                        }
                        i6 = i22;
                    }
                    nVar5.e(i24 + b15);
                    i3++;
                    i22 = i6;
                    i17 = i25;
                    i20 = i4;
                    b2 = i5;
                    j7 = j5;
                }
                int i53 = i20;
                long j12 = j7;
                int i54 = i17;
                b3 = aVar.b(c.Q);
                if (b3 != null || (c2 = b3.c(c.R)) == null) {
                    sVar2 = sVar;
                    create = Pair.create(sVar2, sVar2);
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = c2.P0;
                    nVar6.e(i54);
                    int b23 = (nVar6.b() >> 24) & 255;
                    int m = nVar6.m();
                    long[] jArr = new long[m];
                    long[] jArr2 = new long[m];
                    for (int i55 = i53; i55 < m; i55++) {
                        jArr[i55] = b23 == 1 ? nVar6.n() : nVar6.k();
                        jArr2[i55] = b23 == 1 ? nVar6.g() : nVar6.b();
                        byte[] bArr4 = nVar6.a;
                        int i56 = nVar6.b;
                        int i57 = i56 + 1;
                        nVar6.b = i57;
                        int i58 = (bArr4[i56] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                        nVar6.b = i56 + 2;
                        if (((short) ((bArr4[i57] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i58)) != 1) {
                            a70.p("Unsupported media rate.");
                            return sVar;
                        }
                        nVar6.e(i56 + 4);
                    }
                    create = Pair.create(jArr, jArr2);
                    sVar2 = sVar;
                }
                return fVar.b != null ? sVar2 : new s(b7, i16, ((Long) create2.first).longValue(), j12, j2, fVar.b, fVar.d, fVar.a, fVar.c, (long[]) create.first, (long[]) create.second);
            }
            i2 = 180;
        }
        i = i2;
        if (j != C.TIME_UNSET) {
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar32 = bVar.P0;
        nVar32.e(8);
        int b122 = nVar32.b();
        int i232 = c.b;
        nVar32.e(nVar32.b + (((b122 >> 24) & 255) != 0 ? 8 : 16));
        long k3 = nVar32.k();
        if (j4 != C.TIME_UNSET) {
        }
        long j72 = k3;
        a b132 = b4.b(c.G).b(c.H);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar42 = b4.c(c.S).P0;
        nVar42.e(8);
        int b142 = (nVar42.b() >> 24) & 255;
        nVar42.e(nVar42.b + (b142 != 0 ? 8 : 16));
        long k22 = nVar42.k();
        nVar42.e(nVar42.b + (b142 != 0 ? 4 : 8));
        int o22 = nVar42.o();
        Pair create22 = Pair.create(Long.valueOf(k22), "" + ((char) (((o22 >> 10) & 31) + 96)) + ((char) (((o22 >> 5) & 31) + 96)) + ((char) ((o22 & 31) + 96)));
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar52 = b132.c(c.U).P0;
        String str42 = (String) create22.second;
        nVar52.e(12);
        b2 = nVar52.b();
        f fVar2 = new f(b2);
        i3 = 0;
        while (i3 < b2) {
        }
        int i532 = i20;
        long j122 = j72;
        int i542 = i17;
        b3 = aVar.b(c.Q);
        if (b3 != null) {
        }
        sVar2 = sVar;
        create = Pair.create(sVar2, sVar2);
        if (fVar2.b != null) {
        }
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, int i2, f fVar, int i3) {
        int i4 = nVar.b;
        while (true) {
            if (i4 - i >= i2) {
                return 0;
            }
            nVar.e(i4);
            int b2 = nVar.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b2 > 0, "childAtomSize should be positive");
            if (nVar.b() == c.W) {
                int i5 = i4 + 8;
                Pair pair = null;
                boolean z = false;
                Integer num = null;
                t tVar = null;
                while (i5 - i4 < b2) {
                    nVar.e(i5);
                    int b3 = nVar.b();
                    int b4 = nVar.b();
                    if (b4 == c.c0) {
                        num = Integer.valueOf(nVar.b());
                    } else if (b4 == c.X) {
                        nVar.e(nVar.b + 4);
                        z = nVar.b() == g;
                    } else if (b4 == c.Y) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= b3) {
                                tVar = null;
                                break;
                            }
                            nVar.e(i6);
                            int b5 = nVar.b();
                            if (nVar.b() == c.Z) {
                                nVar.e(nVar.b + 6);
                                nVar.j();
                                int j = nVar.j();
                                byte[] bArr = new byte[16];
                                nVar.a(bArr, 0, 16);
                                tVar = new t(j, bArr);
                                break;
                            }
                            i6 += b5;
                        }
                    }
                    i5 += b3;
                }
                if (z) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(num != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(tVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, tVar);
                }
                if (pair != null) {
                    fVar.a[i3] = (t) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            i4 += b2;
        }
    }

    public static Pair a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        nVar.e(i + 12);
        nVar.e(nVar.b + 1);
        a(nVar);
        nVar.e(nVar.b + 2);
        int j = nVar.j();
        if ((j & 128) != 0) {
            nVar.e(nVar.b + 2);
        }
        if ((j & 64) != 0) {
            nVar.e(nVar.b + nVar.o());
        }
        if ((j & 32) != 0) {
            nVar.e(nVar.b + 2);
        }
        nVar.e(nVar.b + 1);
        a(nVar);
        int j2 = nVar.j();
        if (j2 == 32) {
            str = MimeTypes.VIDEO_MP4V;
        } else if (j2 == 33) {
            str = "video/avc";
        } else if (j2 != 35) {
            if (j2 != 64) {
                str = null;
                if (j2 == 107) {
                    return Pair.create(MimeTypes.AUDIO_MPEG, null);
                }
                if (j2 == 165) {
                    str = MimeTypes.AUDIO_AC3;
                } else if (j2 != 166) {
                    switch (j2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (j2) {
                                case 169:
                                case 172:
                                    return Pair.create(MimeTypes.AUDIO_DTS, null);
                                case 170:
                                case 171:
                                    return Pair.create(MimeTypes.AUDIO_DTS_HD, null);
                            }
                    }
                } else {
                    str = MimeTypes.AUDIO_E_AC3;
                }
            }
            str = MimeTypes.AUDIO_AAC;
        } else {
            str = "video/hevc";
        }
        nVar.e(nVar.b + 12);
        nVar.e(nVar.b + 1);
        int a2 = a(nVar);
        byte[] bArr = new byte[a2];
        nVar.a(bArr, 0, a2);
        return Pair.create(str, bArr);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int j = nVar.j();
        int i = j & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((j & 128) == 128) {
            j = nVar.j();
            i = (i << 7) | (j & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i;
    }
}
