package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes12.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {
    public static final int p = z.a("qt  ");
    public int e;
    public int f;
    public long g;
    public int h;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n i;
    public int j;
    public int k;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j l;
    public o[] m;
    public long n;
    public boolean o;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);
    public final Stack d = new Stack();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.a);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.n;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:439:0x0918, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x091c, code lost:
    
        if (r3.e == 2) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x091e, code lost:
    
        r3.e = 0;
        r3.h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0923, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:42:0x00ab, B:44:0x00af, B:46:0x00be, B:48:0x00d0, B:50:0x00d5, B:52:0x00dd, B:63:0x00e7, B:65:0x00eb, B:67:0x00f2, B:69:0x00f6, B:70:0x00fd, B:72:0x0101, B:73:0x010a, B:75:0x010e, B:76:0x0115, B:78:0x0119, B:79:0x011f, B:81:0x0123, B:82:0x012a, B:84:0x012e, B:85:0x0135, B:87:0x0139, B:88:0x0140, B:90:0x0144, B:91:0x014b, B:93:0x014f, B:94:0x0156, B:96:0x015a, B:97:0x0161, B:99:0x0165, B:100:0x016c, B:102:0x0170, B:103:0x0177, B:105:0x017b, B:106:0x0182, B:108:0x0186, B:109:0x018e, B:111:0x0192, B:112:0x020b, B:120:0x0198, B:122:0x01a0, B:123:0x01a6, B:125:0x01aa, B:128:0x01b0, B:130:0x01b4, B:133:0x01b9, B:135:0x01bd, B:136:0x01c5, B:138:0x01c9, B:139:0x01d1, B:141:0x01d5, B:142:0x01dd, B:144:0x01e1, B:145:0x01e9, B:147:0x01ed, B:148:0x01f5, B:150:0x01f9, B:151:0x01ff, B:153:0x0203, B:154:0x0213, B:155:0x021b), top: B:41:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar;
        s a;
        e hVar;
        int i;
        boolean z;
        long j2;
        int i2;
        int i3;
        int i4;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar;
        int i5;
        long j3;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        long[] jArr2;
        int i6;
        long j4;
        long[] jArr3;
        a aVar;
        ArrayList arrayList;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar;
        v vVar;
        v vVar2;
        int i7;
        int[] iArr3;
        long j5;
        p pVar;
        int i8;
        ArrayList arrayList2;
        int i9;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o b;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar;
        int i10;
        String str;
        p pVar2 = this;
        while (true) {
            int i11 = 0;
            if (pVar2.d.isEmpty() || ((a) pVar2.d.peek()).P0 != j) {
                break;
            }
            a aVar2 = (a) pVar2.d.pop();
            if (aVar2.a == c.C) {
                ArrayList arrayList3 = new ArrayList();
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m();
                b c = aVar2.c(c.A0);
                int i12 = 1;
                if (c != null) {
                    boolean z2 = pVar2.o;
                    int i13 = i.a;
                    if (!z2) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = c.P0;
                        char c2 = '\b';
                        nVar2.e(8);
                        while (true) {
                            int i14 = nVar2.c;
                            int i15 = nVar2.b;
                            if (i14 - i15 < 8) {
                                break;
                            }
                            int b2 = nVar2.b();
                            if (nVar2.b() == c.B0) {
                                nVar2.e(i15);
                                int i16 = i15 + b2;
                                nVar2.e(nVar2.b + 12);
                                while (true) {
                                    int i17 = nVar2.b;
                                    if (i17 >= i16) {
                                        break;
                                    }
                                    int b3 = nVar2.b();
                                    char c3 = c2;
                                    if (nVar2.b() == c.C0) {
                                        nVar2.e(i17);
                                        int i18 = i17 + b3;
                                        nVar2.e(nVar2.b + 8);
                                        ArrayList arrayList4 = new ArrayList();
                                        while (true) {
                                            int i19 = nVar2.b;
                                            if (i19 >= i18) {
                                                break;
                                            }
                                            int i20 = n.a;
                                            int b4 = nVar2.b() + i19;
                                            int b5 = nVar2.b();
                                            int i21 = (b5 >> 24) & 255;
                                            if (i21 == 169 || i21 == 65533) {
                                                int i22 = 16777215 & b5;
                                                if (i22 == n.c) {
                                                    b = n.a(b5, nVar2);
                                                } else {
                                                    if (i22 != n.a && i22 != n.b) {
                                                        if (i22 != n.h && i22 != n.i) {
                                                            if (i22 == n.d) {
                                                                b = n.b(b5, nVar2, "TDRC");
                                                            } else if (i22 == n.e) {
                                                                b = n.b(b5, nVar2, "TPE1");
                                                            } else if (i22 == n.f) {
                                                                b = n.b(b5, nVar2, "TSSE");
                                                            } else if (i22 == n.g) {
                                                                b = n.b(b5, nVar2, "TALB");
                                                            } else if (i22 == n.j) {
                                                                b = n.b(b5, nVar2, "USLT");
                                                            } else if (i22 == n.k) {
                                                                b = n.b(b5, nVar2, "TCON");
                                                            } else {
                                                                if (i22 == n.n) {
                                                                    b = n.b(b5, nVar2, "TIT1");
                                                                }
                                                                c.a(b5);
                                                                nVar2.e(b4);
                                                                oVar = null;
                                                                if (oVar == null) {
                                                                    arrayList4.add(oVar);
                                                                }
                                                            }
                                                        }
                                                        b = n.b(b5, nVar2, "TCOM");
                                                    }
                                                    b = n.b(b5, nVar2, "TIT2");
                                                }
                                                oVar = b;
                                                if (oVar == null) {
                                                }
                                            } else {
                                                try {
                                                    if (b5 == n.m) {
                                                        nVar2.e(nVar2.b + 4);
                                                        if (nVar2.b() == c.F0) {
                                                            nVar2.e(nVar2.b + 8);
                                                            i10 = nVar2.j();
                                                        } else {
                                                            i10 = -1;
                                                        }
                                                        if (i10 > 0) {
                                                            String[] strArr = n.D;
                                                            if (i10 <= strArr.length) {
                                                                str = strArr[i10 - 1];
                                                                oVar = str == null ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s("TCON", null, str) : null;
                                                            }
                                                        }
                                                        str = null;
                                                        if (str == null) {
                                                        }
                                                    } else {
                                                        if (b5 == n.o) {
                                                            b = n.a(b5, nVar2, "TPOS");
                                                        } else if (b5 == n.p) {
                                                            b = n.a(b5, nVar2, "TRCK");
                                                        } else if (b5 == n.q) {
                                                            b = n.a(b5, "TBPM", nVar2, true, false);
                                                        } else if (b5 == n.r) {
                                                            b = n.a(b5, "TCMP", nVar2, true, true);
                                                        } else if (b5 == n.l) {
                                                            oVar = n.a(nVar2);
                                                        } else if (b5 == n.s) {
                                                            b = n.b(b5, nVar2, "TPE2");
                                                        } else if (b5 == n.t) {
                                                            b = n.b(b5, nVar2, "TSOT");
                                                        } else if (b5 == n.u) {
                                                            b = n.b(b5, nVar2, "TSO2");
                                                        } else if (b5 == n.v) {
                                                            b = n.b(b5, nVar2, "TSOA");
                                                        } else if (b5 == n.w) {
                                                            b = n.b(b5, nVar2, "TSOP");
                                                        } else if (b5 == n.x) {
                                                            b = n.b(b5, nVar2, "TSOC");
                                                        } else if (b5 == n.y) {
                                                            b = n.a(b5, "ITUNESADVISORY", nVar2, false, false);
                                                        } else if (b5 == n.z) {
                                                            b = n.a(b5, "ITUNESGAPLESS", nVar2, false, true);
                                                        } else if (b5 == n.A) {
                                                            b = n.b(b5, nVar2, "TVSHOWSORT");
                                                        } else if (b5 == n.B) {
                                                            b = n.b(b5, nVar2, "TVSHOW");
                                                        } else {
                                                            if (b5 == n.C) {
                                                                b = n.b(b4, nVar2);
                                                            }
                                                            c.a(b5);
                                                            nVar2.e(b4);
                                                            oVar = null;
                                                            if (oVar == null) {
                                                            }
                                                        }
                                                        oVar = b;
                                                    }
                                                    if (oVar == null) {
                                                    }
                                                } finally {
                                                    nVar2.e(b4);
                                                }
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList4);
                                        }
                                    } else {
                                        nVar2.e(nVar2.b + (b3 - 8));
                                        c2 = c3;
                                    }
                                }
                            } else {
                                nVar2.e(nVar2.b + (b2 - 8));
                            }
                        }
                    }
                    bVar2 = null;
                    if (bVar2 != null) {
                        mVar2.a(bVar2);
                    }
                    bVar = bVar2;
                } else {
                    bVar = null;
                }
                long j6 = C.TIME_UNSET;
                long j7 = Long.MAX_VALUE;
                int i23 = 0;
                while (i23 < aVar2.R0.size()) {
                    a aVar3 = (a) aVar2.R0.get(i23);
                    if (aVar3.a == c.E && (a = i.a(aVar3, aVar2.c(c.D), C.TIME_UNSET, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null, pVar2.o)) != null) {
                        a b6 = aVar3.b(c.F).b(c.G).b(c.H);
                        b c4 = b6.c(c.q0);
                        if (c4 != null) {
                            hVar = new g(c4);
                        } else {
                            b c5 = b6.c(c.r0);
                            if (c5 == null) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Track has no sample table size information");
                            }
                            hVar = new h(c5);
                        }
                        int a2 = hVar.a();
                        if (a2 == 0) {
                            aVar = aVar2;
                            arrayList = arrayList3;
                            mVar = mVar2;
                            j3 = j6;
                            j2 = j7;
                            vVar2 = new v(new long[i11], new int[i11], 0, new long[i11], new int[i11]);
                        } else {
                            int i24 = i12;
                            b c6 = b6.c(c.s0);
                            if (c6 == null) {
                                c6 = b6.c(c.t0);
                                i = i11;
                                z = i24;
                            } else {
                                i = i11;
                                z = i11;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = c6.P0;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = b6.c(c.p0).P0;
                            e eVar = hVar;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = b6.c(c.m0).P0;
                            j2 = j7;
                            b c7 = b6.c(c.n0);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = c7 != null ? c7.P0 : null;
                            b c8 = b6.c(c.o0);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = c8 != null ? c8.P0 : null;
                            d dVar = new d(nVar4, nVar3, z);
                            nVar5.e(12);
                            int m = nVar5.m() - 1;
                            int m2 = nVar5.m();
                            int m3 = nVar5.m();
                            if (nVar7 != null) {
                                nVar7.e(12);
                                i2 = nVar7.m();
                            } else {
                                i2 = i;
                            }
                            if (nVar6 != null) {
                                nVar6.e(12);
                                i3 = nVar6.m();
                                if (i3 > 0) {
                                    i4 = nVar6.m() - 1;
                                    if (eVar.c()) {
                                        nVar = nVar5;
                                    } else {
                                        nVar = nVar5;
                                        if (MimeTypes.AUDIO_RAW.equals(a.f.f) && m == 0 && i2 == 0 && i3 == 0) {
                                            i5 = i24;
                                            if (i5 == 0) {
                                                long[] jArr4 = new long[a2];
                                                int[] iArr4 = new int[a2];
                                                long[] jArr5 = new long[a2];
                                                int[] iArr5 = new int[a2];
                                                int i25 = i4;
                                                int i26 = m;
                                                long j8 = 0;
                                                long j9 = 0;
                                                int i27 = i;
                                                int i28 = i27;
                                                int i29 = i28;
                                                int i30 = i29;
                                                int i31 = m2;
                                                int i32 = m3;
                                                int i33 = i30;
                                                while (i33 < a2) {
                                                    while (i29 == 0) {
                                                        if (!dVar.a()) {
                                                            throw new IllegalStateException();
                                                        }
                                                        long j10 = j6;
                                                        long j11 = dVar.d;
                                                        i29 = dVar.c;
                                                        j8 = j11;
                                                        nVar7 = nVar7;
                                                        j6 = j10;
                                                    }
                                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = nVar7;
                                                    long j12 = j6;
                                                    if (nVar8 != null) {
                                                        while (i28 == 0 && i2 > 0) {
                                                            i28 = nVar8.m();
                                                            i30 = nVar8.b();
                                                            i2--;
                                                        }
                                                        i28--;
                                                    }
                                                    int i34 = i30;
                                                    jArr4[i33] = j8;
                                                    int b7 = eVar.b();
                                                    iArr4[i33] = b7;
                                                    if (b7 > i27) {
                                                        i27 = b7;
                                                    }
                                                    jArr5[i33] = j9 + i34;
                                                    iArr5[i33] = nVar6 == null ? i24 : i;
                                                    if (i33 == i25) {
                                                        iArr5[i33] = i24;
                                                        i3--;
                                                        if (i3 > 0) {
                                                            i25 = nVar6.m() - 1;
                                                        }
                                                    }
                                                    j9 += i32;
                                                    i31--;
                                                    if (i31 == 0 && i26 > 0) {
                                                        i26--;
                                                        i31 = nVar.m();
                                                        i32 = nVar.m();
                                                    }
                                                    j8 += iArr4[i33];
                                                    i29--;
                                                    i33++;
                                                    i30 = i34;
                                                    nVar7 = nVar8;
                                                    j6 = j12;
                                                }
                                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = nVar7;
                                                j3 = j6;
                                                if (i28 != 0) {
                                                    throw new IllegalArgumentException();
                                                }
                                                while (i2 > 0) {
                                                    if (nVar9.m() != 0) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    nVar9.b();
                                                    i2--;
                                                }
                                                i6 = i27;
                                                jArr = jArr4;
                                                jArr2 = jArr5;
                                                iArr2 = iArr4;
                                                j4 = j9;
                                                iArr = iArr5;
                                            } else {
                                                j3 = j6;
                                                int i35 = dVar.a;
                                                long[] jArr6 = new long[i35];
                                                int[] iArr6 = new int[i35];
                                                while (dVar.a()) {
                                                    int i36 = dVar.b;
                                                    jArr6[i36] = dVar.d;
                                                    iArr6[i36] = dVar.c;
                                                }
                                                int b8 = eVar.b();
                                                long j13 = m3;
                                                int i37 = 8192 / b8;
                                                int i38 = i;
                                                int i39 = i38;
                                                while (i38 < i35) {
                                                    int i40 = iArr6[i38];
                                                    int i41 = z.a;
                                                    i39 = (((i40 + i37) - 1) / i37) + i39;
                                                    i38++;
                                                }
                                                long[] jArr7 = new long[i39];
                                                int[] iArr7 = new int[i39];
                                                long[] jArr8 = new long[i39];
                                                int[] iArr8 = new int[i39];
                                                int i42 = i;
                                                int i43 = i42;
                                                int i44 = i43;
                                                int i45 = i44;
                                                while (i42 < i35) {
                                                    int i46 = iArr6[i42];
                                                    long j14 = jArr6[i42];
                                                    int[] iArr9 = iArr6;
                                                    int i47 = i46;
                                                    int i48 = i35;
                                                    int i49 = i43;
                                                    int i50 = i42;
                                                    int i51 = i45;
                                                    while (i47 > 0) {
                                                        int min = Math.min(i37, i47);
                                                        jArr7[i44] = j14;
                                                        int i52 = i37;
                                                        int i53 = b8 * min;
                                                        iArr7[i44] = i53;
                                                        int max = Math.max(i51, i53);
                                                        jArr8[i44] = i49 * j13;
                                                        iArr8[i44] = i24;
                                                        j14 += iArr7[i44];
                                                        i49 += min;
                                                        i47 -= min;
                                                        i44++;
                                                        i37 = i52;
                                                        i51 = max;
                                                    }
                                                    int i54 = i37;
                                                    int i55 = i50 + 1;
                                                    i43 = i49;
                                                    i45 = i51;
                                                    iArr6 = iArr9;
                                                    i35 = i48;
                                                    i42 = i55;
                                                    i37 = i54;
                                                }
                                                jArr = jArr7;
                                                iArr = iArr8;
                                                iArr2 = iArr7;
                                                jArr2 = jArr8;
                                                i6 = i45;
                                                j4 = 0;
                                            }
                                            jArr3 = a.i;
                                            if (jArr3 == null && (mVar2.a == -1 || mVar2.b == -1)) {
                                                if (jArr3.length == i24 && a.b == i24 && jArr2.length >= 2) {
                                                    long j15 = a.j[i];
                                                    long j16 = j4;
                                                    long a3 = z.a(jArr3[i], a.c, a.d) + j15;
                                                    long j17 = jArr2[i];
                                                    if (j17 <= j15 && j15 < jArr2[1] && jArr2[jArr2.length - 1] < a3 && a3 <= j16) {
                                                        long j18 = j16 - a3;
                                                        long a4 = z.a(j15 - j17, a.f.s, a.c);
                                                        long a5 = z.a(j18, a.f.s, a.c);
                                                        if ((a4 != 0 || a5 != 0) && a4 <= 2147483647L && a5 <= 2147483647L) {
                                                            mVar2.a = (int) a4;
                                                            mVar2.b = (int) a5;
                                                            z.a(jArr2, a.c);
                                                            vVar = new v(jArr, iArr2, i6, jArr2, iArr);
                                                            aVar = aVar2;
                                                            arrayList = arrayList3;
                                                            mVar = mVar2;
                                                        }
                                                    }
                                                }
                                                long[] jArr9 = a.i;
                                                if (jArr9.length == 1 && jArr9[i] == 0) {
                                                    for (int i56 = i; i56 < jArr2.length; i56++) {
                                                        jArr2[i56] = z.a(jArr2[i56] - a.j[i], 1000000L, a.c);
                                                    }
                                                    vVar = new v(jArr, iArr2, i6, jArr2, iArr);
                                                    aVar = aVar2;
                                                    arrayList = arrayList3;
                                                    mVar = mVar2;
                                                } else {
                                                    long[] jArr10 = jArr2;
                                                    long[] jArr11 = jArr;
                                                    int[] iArr10 = iArr2;
                                                    int[] iArr11 = iArr;
                                                    boolean z3 = a.b == 1 ? 1 : i;
                                                    int i57 = i;
                                                    int i58 = i57;
                                                    int i59 = i58;
                                                    int i60 = i59;
                                                    while (true) {
                                                        long[] jArr12 = a.i;
                                                        aVar = aVar2;
                                                        if (i57 >= jArr12.length) {
                                                            break;
                                                        }
                                                        ArrayList arrayList5 = arrayList3;
                                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar3 = mVar2;
                                                        long j19 = a.j[i57];
                                                        if (j19 != -1) {
                                                            long a6 = z.a(jArr12[i57], a.c, a.d);
                                                            int a7 = z.a(jArr10, j19, true, true);
                                                            int a8 = z.a(jArr10, j19 + a6, z3, i);
                                                            int i61 = (a8 - a7) + i58;
                                                            i60 |= i59 != a7 ? 1 : 0;
                                                            i58 = i61;
                                                            i59 = a8;
                                                        }
                                                        i57++;
                                                        i = 0;
                                                        aVar2 = aVar;
                                                        arrayList3 = arrayList5;
                                                        mVar2 = mVar3;
                                                    }
                                                    arrayList = arrayList3;
                                                    mVar = mVar2;
                                                    int i62 = i60 | (i58 != a2 ? 1 : 0);
                                                    long[] jArr13 = i62 != 0 ? new long[i58] : jArr11;
                                                    int[] iArr12 = i62 != 0 ? new int[i58] : iArr10;
                                                    if (i62 != 0) {
                                                        i6 = 0;
                                                    }
                                                    int[] iArr13 = i62 != 0 ? new int[i58] : iArr11;
                                                    long[] jArr14 = new long[i58];
                                                    long j20 = 0;
                                                    int i63 = i6;
                                                    int i64 = 0;
                                                    int i65 = 0;
                                                    while (true) {
                                                        long[] jArr15 = a.i;
                                                        if (i64 >= jArr15.length) {
                                                            break;
                                                        }
                                                        long[] jArr16 = jArr14;
                                                        int i66 = i64;
                                                        long j21 = a.j[i66];
                                                        long j22 = jArr15[i66];
                                                        if (j21 != -1) {
                                                            int[] iArr14 = iArr11;
                                                            j5 = j22;
                                                            long a9 = z.a(j22, a.c, a.d) + j21;
                                                            i7 = i62;
                                                            int a10 = z.a(jArr10, j21, true, true);
                                                            int a11 = z.a(jArr10, a9, z3, false);
                                                            if (i7 != 0) {
                                                                int i67 = a11 - a10;
                                                                System.arraycopy(jArr11, a10, jArr13, i65, i67);
                                                                System.arraycopy(iArr10, a10, iArr12, i65, i67);
                                                                iArr3 = iArr14;
                                                                System.arraycopy(iArr3, a10, iArr13, i65, i67);
                                                            } else {
                                                                iArr3 = iArr14;
                                                            }
                                                            int i68 = i63;
                                                            while (a10 < a11) {
                                                                int i69 = a10;
                                                                long[] jArr17 = jArr13;
                                                                jArr16[i65] = z.a(j20, 1000000L, a.d) + z.a(jArr10[i69] - j21, 1000000L, a.c);
                                                                if (i7 != 0 && iArr12[i65] > i68) {
                                                                    i68 = iArr10[i69];
                                                                }
                                                                i65++;
                                                                a10 = i69 + 1;
                                                                jArr13 = jArr17;
                                                            }
                                                            i63 = i68;
                                                        } else {
                                                            i7 = i62;
                                                            iArr3 = iArr11;
                                                            j5 = j22;
                                                        }
                                                        j20 += j5;
                                                        i64 = i66 + 1;
                                                        iArr11 = iArr3;
                                                        jArr14 = jArr16;
                                                        i62 = i7;
                                                        jArr13 = jArr13;
                                                    }
                                                    long[] jArr18 = jArr13;
                                                    long[] jArr19 = jArr14;
                                                    boolean z4 = false;
                                                    for (int i70 = 0; i70 < iArr13.length && !z4; i70++) {
                                                        z4 |= (iArr13[i70] & 1) != 0;
                                                    }
                                                    if (!z4) {
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                                    }
                                                    vVar2 = new v(jArr18, iArr12, i63, jArr19, iArr13);
                                                }
                                            } else {
                                                aVar = aVar2;
                                                long[] jArr20 = jArr2;
                                                arrayList = arrayList3;
                                                mVar = mVar2;
                                                long[] jArr21 = jArr;
                                                int[] iArr15 = iArr2;
                                                int[] iArr16 = iArr;
                                                z.a(jArr20, a.c);
                                                vVar = new v(jArr21, iArr15, i6, jArr20, iArr16);
                                            }
                                            vVar2 = vVar;
                                        }
                                    }
                                    i5 = i;
                                    if (i5 == 0) {
                                    }
                                    jArr3 = a.i;
                                    if (jArr3 == null) {
                                    }
                                    aVar = aVar2;
                                    long[] jArr202 = jArr2;
                                    arrayList = arrayList3;
                                    mVar = mVar2;
                                    long[] jArr212 = jArr;
                                    int[] iArr152 = iArr2;
                                    int[] iArr162 = iArr;
                                    z.a(jArr202, a.c);
                                    vVar = new v(jArr212, iArr152, i6, jArr202, iArr162);
                                    vVar2 = vVar;
                                } else {
                                    nVar6 = null;
                                }
                            } else {
                                i3 = i;
                            }
                            i4 = -1;
                            if (eVar.c()) {
                            }
                            i5 = i;
                            if (i5 == 0) {
                            }
                            jArr3 = a.i;
                            if (jArr3 == null) {
                            }
                            aVar = aVar2;
                            long[] jArr2022 = jArr2;
                            arrayList = arrayList3;
                            mVar = mVar2;
                            long[] jArr2122 = jArr;
                            int[] iArr1522 = iArr2;
                            int[] iArr1622 = iArr;
                            z.a(jArr2022, a.c);
                            vVar = new v(jArr2122, iArr1522, i6, jArr2022, iArr1622);
                            vVar2 = vVar;
                        }
                        if (vVar2.a != 0) {
                            pVar = this;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a12 = pVar.l.a(i23, a.b);
                            o oVar2 = new o(a, vVar2, a12);
                            int i71 = vVar2.d + 30;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = a.f;
                            String str2 = oVar3.a;
                            String str3 = oVar3.e;
                            String str4 = oVar3.f;
                            String str5 = oVar3.c;
                            int i72 = oVar3.b;
                            int i73 = oVar3.j;
                            int i74 = oVar3.k;
                            float f = oVar3.l;
                            int i75 = oVar3.m;
                            i8 = i23;
                            float f2 = oVar3.n;
                            byte[] bArr = oVar3.p;
                            int i76 = oVar3.o;
                            com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = oVar3.q;
                            int i77 = oVar3.r;
                            int i78 = oVar3.s;
                            int i79 = oVar3.t;
                            int i80 = oVar3.u;
                            int i81 = oVar3.v;
                            int i82 = oVar3.x;
                            String str6 = oVar3.y;
                            int i83 = oVar3.z;
                            long j23 = oVar3.w;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i72, i71, i73, i74, f, i75, f2, bArr, i76, cVar, i77, i78, i79, i80, i81, i82, str6, i83, j23, oVar3.h, oVar3.i, oVar3.d);
                            if (a.b == 1) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar4 = mVar;
                                int i84 = mVar4.a;
                                if (i84 != -1 && (i9 = mVar4.b) != -1) {
                                    oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i72, i71, i73, i74, f, i75, f2, bArr, i76, cVar, i77, i78, i79, i84, i9, i82, str6, i83, j23, oVar4.h, oVar4.i, oVar4.d);
                                }
                                if (bVar != null) {
                                    mVar = mVar4;
                                    oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar4.a, oVar4.e, oVar4.f, oVar4.c, oVar4.b, oVar4.g, oVar4.j, oVar4.k, oVar4.l, oVar4.m, oVar4.n, oVar4.p, oVar4.o, oVar4.q, oVar4.r, oVar4.s, oVar4.t, oVar4.u, oVar4.v, oVar4.x, oVar4.y, oVar4.z, oVar4.w, oVar4.h, oVar4.i, bVar);
                                } else {
                                    mVar = mVar4;
                                }
                            }
                            a12.a(oVar4);
                            long max2 = Math.max(j3, a.e);
                            arrayList2 = arrayList;
                            arrayList2.add(oVar2);
                            long j24 = vVar2.b[0];
                            if (j24 < j2) {
                                j7 = j24;
                                j6 = max2;
                            } else {
                                j6 = max2;
                                j7 = j2;
                            }
                            arrayList3 = arrayList2;
                            pVar2 = pVar;
                            mVar2 = mVar;
                            i11 = 0;
                            i12 = 1;
                            i23 = i8 + 1;
                            aVar2 = aVar;
                        }
                    } else {
                        aVar = aVar2;
                        arrayList = arrayList3;
                        mVar = mVar2;
                        j3 = j6;
                        j2 = j7;
                    }
                    pVar = this;
                    i8 = i23;
                    j7 = j2;
                    j6 = j3;
                    arrayList2 = arrayList;
                    arrayList3 = arrayList2;
                    pVar2 = pVar;
                    mVar2 = mVar;
                    i11 = 0;
                    i12 = 1;
                    i23 = i8 + 1;
                    aVar2 = aVar;
                }
                p pVar3 = pVar2;
                ArrayList arrayList6 = arrayList3;
                pVar3.n = j6;
                pVar3.m = (o[]) arrayList6.toArray(new o[arrayList6.size()]);
                pVar3.l.b();
                pVar3.l.a(pVar3);
                pVar3.d.clear();
                pVar3.e = 2;
            } else {
                p pVar4 = pVar2;
                if (!pVar4.d.isEmpty()) {
                    ((a) pVar4.d.peek()).R0.add(aVar2);
                }
                pVar2 = pVar4;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.l = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        int i;
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j == 0) {
            this.e = 0;
            this.h = 0;
            return;
        }
        o[] oVarArr = this.m;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                v vVar = oVar.b;
                int a = z.a(vVar.e, j2, false);
                while (true) {
                    i = -1;
                    if (a < 0) {
                        a = -1;
                        break;
                    } else if ((vVar.f[a] & 1) != 0) {
                        break;
                    } else {
                        a--;
                    }
                }
                if (a == -1) {
                    a = z.a(vVar.e, j2, true, false);
                    while (a < vVar.e.length) {
                        if ((vVar.f[a] & 1) == 0) {
                            a++;
                        }
                    }
                    oVar.d = i;
                }
                i = a;
                oVar.d = i;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        o[] oVarArr;
        boolean z;
        while (true) {
            int i = this.e;
            boolean z2 = false;
            if (i == 0) {
                if (this.h == 0) {
                    if (!bVar.b(this.c.a, 0, 8, true)) {
                        return -1;
                    }
                    this.h = 8;
                    this.c.e(0);
                    this.g = this.c.k();
                    this.f = this.c.b();
                }
                if (this.g == 1) {
                    bVar.b(this.c.a, 8, 8, false);
                    this.h += 8;
                    this.g = this.c.n();
                }
                int i2 = this.f;
                if (i2 != c.C && i2 != c.E && i2 != c.F && i2 != c.G && i2 != c.H && i2 != c.Q) {
                    if (i2 != c.S && i2 != c.D && i2 != c.T && i2 != c.U && i2 != c.m0 && i2 != c.n0 && i2 != c.o0 && i2 != c.R && i2 != c.p0 && i2 != c.q0 && i2 != c.r0 && i2 != c.s0 && i2 != c.t0 && i2 != c.P && i2 != c.b && i2 != c.A0) {
                        this.i = null;
                        this.e = 1;
                    } else if (this.h == 8) {
                        long j = this.g;
                        if (j <= 2147483647L) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j);
                            this.i = nVar;
                            System.arraycopy(this.c.a, 0, nVar.a, 0, 8);
                            this.e = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    long j2 = (bVar.c + this.g) - this.h;
                    this.d.add(new a(this.f, j2));
                    if (this.g == this.h) {
                        c(j2);
                    } else {
                        this.e = 0;
                        this.h = 0;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    long j3 = Long.MAX_VALUE;
                    int i3 = -1;
                    int i4 = 0;
                    while (true) {
                        oVarArr = this.m;
                        if (i4 >= oVarArr.length) {
                            break;
                        }
                        o oVar2 = oVarArr[i4];
                        int i5 = oVar2.d;
                        v vVar = oVar2.b;
                        if (i5 != vVar.a) {
                            long j4 = vVar.b[i5];
                            if (j4 < j3) {
                                i3 = i4;
                                j3 = j4;
                            }
                        }
                        i4++;
                    }
                    if (i3 == -1) {
                        return -1;
                    }
                    o oVar3 = oVarArr[i3];
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = oVar3.c;
                    int i6 = oVar3.d;
                    v vVar2 = oVar3.b;
                    long j5 = vVar2.b[i6];
                    int i7 = vVar2.c[i6];
                    if (oVar3.a.g == 1) {
                        j5 += 8;
                        i7 -= 8;
                    }
                    long j6 = (j5 - bVar.c) + this.j;
                    if (j6 >= 0 && j6 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        bVar.a((int) j6);
                        int i8 = oVar3.a.k;
                        if (i8 == 0) {
                            while (true) {
                                int i9 = this.j;
                                if (i9 >= i7) {
                                    break;
                                }
                                int a = rVar.a(bVar, i7 - i9, false);
                                this.j += a;
                                this.k -= a;
                            }
                        } else {
                            byte[] bArr = this.b.a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i10 = 4 - i8;
                            while (this.j < i7) {
                                int i11 = this.k;
                                if (i11 == 0) {
                                    bVar.b(this.b.a, i10, i8, false);
                                    this.b.e(0);
                                    this.k = this.b.m();
                                    this.a.e(0);
                                    rVar.a(4, this.a);
                                    this.j += 4;
                                    i7 += i10;
                                } else {
                                    int a2 = rVar.a(bVar, i11, false);
                                    this.j += a2;
                                    this.k -= a2;
                                }
                            }
                        }
                        int i12 = i7;
                        v vVar3 = oVar3.b;
                        rVar.a(vVar3.e[i6], vVar3.f[i6], i12, 0, null);
                        oVar3.d++;
                        this.j = 0;
                        this.k = 0;
                        return 0;
                    }
                    oVar.a = j5;
                    return 1;
                }
                long j7 = this.g;
                int i13 = this.h;
                long j8 = j7 - i13;
                long j9 = bVar.c + j8;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.i;
                if (nVar2 != null) {
                    bVar.b(nVar2.a, i13, (int) j8, false);
                    if (this.f == c.b) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.i;
                        nVar3.e(8);
                        if (nVar3.b() != p) {
                            nVar3.e(nVar3.b + 4);
                            while (nVar3.c - nVar3.b > 0) {
                                if (nVar3.b() == p) {
                                }
                            }
                            z = false;
                            this.o = z;
                        }
                        z = true;
                        this.o = z;
                    } else if (!this.d.isEmpty()) {
                        ((a) this.d.peek()).Q0.add(new b(this.f, this.i));
                    }
                } else if (j8 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    bVar.a((int) j8);
                } else {
                    oVar.a = j9;
                    z2 = true;
                }
                c(j9);
                if (z2 && this.e != 2) {
                    return 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j) {
        int i;
        long j2;
        long j3 = Long.MAX_VALUE;
        for (o oVar : this.m) {
            v vVar = oVar.b;
            int a = z.a(vVar.e, j, false);
            while (true) {
                i = -1;
                if (a < 0) {
                    a = -1;
                    break;
                }
                if ((vVar.f[a] & 1) != 0) {
                    break;
                }
                a--;
            }
            if (a == -1) {
                a = z.a(vVar.e, j, true, false);
                while (a < vVar.e.length) {
                    if ((vVar.f[a] & 1) == 0) {
                        a++;
                    }
                }
                j2 = vVar.b[i];
                if (j2 >= j3) {
                    j3 = j2;
                }
            }
            i = a;
            j2 = vVar.b[i];
            if (j2 >= j3) {
            }
        }
        return j3;
    }
}
