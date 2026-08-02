package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.ilg;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
                long j = this.g;
                if (j == 1) {
                    bVar.b(this.c.a, 8, 8, false);
                    this.h += 8;
                    j = this.c.n();
                    this.g = j;
                }
                int i2 = this.f;
                if (i2 == c.C || i2 == c.E || i2 == c.F || i2 == c.G || i2 == c.H || i2 == c.Q) {
                    long j2 = (bVar.c + j) - this.h;
                    this.d.add(new a(this.f, j2));
                    if (this.g == this.h) {
                        c(j2);
                    } else {
                        this.e = 0;
                        this.h = 0;
                    }
                } else if (i2 != c.S && i2 != c.D && i2 != c.T && i2 != c.U && i2 != c.m0 && i2 != c.n0 && i2 != c.o0 && i2 != c.R && i2 != c.p0 && i2 != c.q0 && i2 != c.r0 && i2 != c.s0 && i2 != c.t0 && i2 != c.P && i2 != c.b && i2 != c.A0) {
                    this.i = null;
                    this.e = 1;
                } else {
                    if (this.h != 8) {
                        zzl.s();
                        return 0;
                    }
                    if (j > 2147483647L) {
                        zzl.s();
                        return 0;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j);
                    this.i = nVar;
                    System.arraycopy(this.c.a, 0, nVar.a, 0, 8);
                    this.e = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        zzl.s();
                        return 0;
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
                    if (j6 < 0 || j6 >= 262144) {
                        oVar.a = j5;
                        return 1;
                    }
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
                } else if (j8 < 262144) {
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

    /* JADX WARN: Code restructure failed: missing block: B:437:0x0913, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0917, code lost:
    
        if (r2.e == 2) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0919, code lost:
    
        r2.e = 0;
        r2.h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x091e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:34:0x00ab, B:36:0x00af, B:38:0x00be, B:40:0x00d0, B:42:0x00d5, B:44:0x00dd, B:55:0x00e7, B:57:0x00eb, B:59:0x00f2, B:61:0x00f6, B:62:0x00fd, B:64:0x0101, B:65:0x010a, B:67:0x010e, B:68:0x0115, B:70:0x0119, B:71:0x011f, B:73:0x0123, B:74:0x012a, B:76:0x012e, B:77:0x0135, B:79:0x0139, B:80:0x0140, B:82:0x0144, B:83:0x014b, B:85:0x014f, B:86:0x0156, B:88:0x015a, B:89:0x0161, B:91:0x0165, B:92:0x016c, B:94:0x0170, B:95:0x0177, B:97:0x017b, B:98:0x0182, B:100:0x0186, B:101:0x018e, B:103:0x0192, B:104:0x020b, B:112:0x0198, B:114:0x01a0, B:115:0x01a6, B:117:0x01aa, B:120:0x01b0, B:122:0x01b4, B:125:0x01b9, B:127:0x01bd, B:128:0x01c5, B:130:0x01c9, B:131:0x01d1, B:133:0x01d5, B:134:0x01dd, B:136:0x01e1, B:137:0x01e9, B:139:0x01ed, B:140:0x01f5, B:142:0x01f9, B:143:0x01ff, B:145:0x0203, B:146:0x0213, B:147:0x021b), top: B:33:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j) {
        p pVar;
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
        int i7;
        ArrayList arrayList;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar;
        v vVar;
        v vVar2;
        int i8;
        long j5;
        int i9;
        p pVar2;
        int i10;
        long max;
        ArrayList arrayList2;
        int i11;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o b;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar;
        int i12;
        String str;
        p pVar3 = this;
        while (true) {
            int i13 = 0;
            if (pVar3.d.isEmpty() || ((a) pVar3.d.peek()).P0 != j) {
                break;
            }
            a aVar2 = (a) pVar3.d.pop();
            if (aVar2.a == c.C) {
                ArrayList arrayList3 = new ArrayList();
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m();
                b c = aVar2.c(c.A0);
                int i14 = 1;
                if (c != null) {
                    boolean z2 = pVar3.o;
                    int i15 = i.a;
                    if (!z2) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = c.P0;
                        char c2 = '\b';
                        nVar2.e(8);
                        while (true) {
                            int i16 = nVar2.c;
                            int i17 = nVar2.b;
                            if (i16 - i17 < 8) {
                                break;
                            }
                            int b2 = nVar2.b();
                            if (nVar2.b() == c.B0) {
                                nVar2.e(i17);
                                int i18 = i17 + b2;
                                nVar2.e(nVar2.b + 12);
                                while (true) {
                                    int i19 = nVar2.b;
                                    if (i19 >= i18) {
                                        break;
                                    }
                                    int b3 = nVar2.b();
                                    char c3 = c2;
                                    if (nVar2.b() == c.C0) {
                                        nVar2.e(i19);
                                        int i20 = i19 + b3;
                                        nVar2.e(nVar2.b + 8);
                                        ArrayList arrayList4 = new ArrayList();
                                        while (true) {
                                            int i21 = nVar2.b;
                                            if (i21 >= i20) {
                                                break;
                                            }
                                            int i22 = n.a;
                                            int b4 = nVar2.b() + i21;
                                            int b5 = nVar2.b();
                                            int i23 = (b5 >> 24) & 255;
                                            if (i23 == 169 || i23 == 65533) {
                                                int i24 = 16777215 & b5;
                                                if (i24 == n.c) {
                                                    b = n.a(b5, nVar2);
                                                } else {
                                                    if (i24 != n.a && i24 != n.b) {
                                                        if (i24 != n.h && i24 != n.i) {
                                                            if (i24 == n.d) {
                                                                b = n.b(b5, nVar2, "TDRC");
                                                            } else if (i24 == n.e) {
                                                                b = n.b(b5, nVar2, "TPE1");
                                                            } else if (i24 == n.f) {
                                                                b = n.b(b5, nVar2, "TSSE");
                                                            } else if (i24 == n.g) {
                                                                b = n.b(b5, nVar2, "TALB");
                                                            } else if (i24 == n.j) {
                                                                b = n.b(b5, nVar2, "USLT");
                                                            } else if (i24 == n.k) {
                                                                b = n.b(b5, nVar2, "TCON");
                                                            } else {
                                                                if (i24 == n.n) {
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
                                                            i12 = nVar2.j();
                                                        } else {
                                                            i12 = -1;
                                                        }
                                                        if (i12 > 0) {
                                                            String[] strArr = n.D;
                                                            if (i12 <= strArr.length) {
                                                                str = strArr[i12 - 1];
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
                int i25 = 0;
                while (i25 < aVar2.R0.size()) {
                    a aVar3 = (a) aVar2.R0.get(i25);
                    if (aVar3.a == c.E && (a = i.a(aVar3, aVar2.c(c.D), C.TIME_UNSET, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null, pVar3.o)) != null) {
                        a b6 = aVar3.b(c.F).b(c.G).b(c.H);
                        b c4 = b6.c(c.q0);
                        if (c4 != null) {
                            hVar = new g(c4);
                        } else {
                            b c5 = b6.c(c.r0);
                            if (c5 == null) {
                                zzl.t("Track has no sample table size information");
                                return;
                            }
                            hVar = new h(c5);
                        }
                        int a2 = hVar.a();
                        if (a2 == 0) {
                            aVar = aVar2;
                            i7 = i25;
                            arrayList = arrayList3;
                            mVar = mVar2;
                            j3 = j6;
                            j2 = j7;
                            vVar2 = new v(new long[i13], new int[i13], 0, new long[i13], new int[i13]);
                        } else {
                            int i26 = i14;
                            b c6 = b6.c(c.s0);
                            if (c6 == null) {
                                c6 = b6.c(c.t0);
                                i = i13;
                                z = i26;
                            } else {
                                i = i13;
                                z = i13;
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
                                            i5 = i26;
                                            if (i5 == 0) {
                                                long[] jArr4 = new long[a2];
                                                int[] iArr3 = new int[a2];
                                                long[] jArr5 = new long[a2];
                                                int[] iArr4 = new int[a2];
                                                int i27 = i4;
                                                int i28 = m;
                                                long j8 = 0;
                                                long j9 = 0;
                                                int i29 = i;
                                                int i30 = i29;
                                                int i31 = i30;
                                                int i32 = i31;
                                                int i33 = m2;
                                                int i34 = m3;
                                                int i35 = i32;
                                                while (i35 < a2) {
                                                    while (i31 == 0) {
                                                        if (!dVar.a()) {
                                                            zzl.s();
                                                            return;
                                                        }
                                                        long j10 = j6;
                                                        long j11 = dVar.d;
                                                        i31 = dVar.c;
                                                        j8 = j11;
                                                        nVar7 = nVar7;
                                                        j6 = j10;
                                                    }
                                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = nVar7;
                                                    long j12 = j6;
                                                    if (nVar8 != null) {
                                                        while (i30 == 0 && i2 > 0) {
                                                            i30 = nVar8.m();
                                                            i32 = nVar8.b();
                                                            i2--;
                                                        }
                                                        i30--;
                                                    }
                                                    int i36 = i32;
                                                    jArr4[i35] = j8;
                                                    int b7 = eVar.b();
                                                    iArr3[i35] = b7;
                                                    if (b7 > i29) {
                                                        i29 = b7;
                                                    }
                                                    jArr5[i35] = j9 + i36;
                                                    iArr4[i35] = nVar6 == null ? i26 : i;
                                                    if (i35 == i27) {
                                                        iArr4[i35] = i26;
                                                        i3--;
                                                        if (i3 > 0) {
                                                            i27 = nVar6.m() - 1;
                                                        }
                                                    }
                                                    j9 += i34;
                                                    i33--;
                                                    if (i33 == 0 && i28 > 0) {
                                                        i28--;
                                                        i33 = nVar.m();
                                                        i34 = nVar.m();
                                                    }
                                                    j8 += iArr3[i35];
                                                    i31--;
                                                    i35++;
                                                    i32 = i36;
                                                    nVar7 = nVar8;
                                                    j6 = j12;
                                                }
                                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = nVar7;
                                                j3 = j6;
                                                if (i30 != 0) {
                                                    ilg.c();
                                                    return;
                                                }
                                                while (i2 > 0) {
                                                    if (nVar9.m() != 0) {
                                                        ilg.c();
                                                        return;
                                                    } else {
                                                        nVar9.b();
                                                        i2--;
                                                    }
                                                }
                                                i6 = i29;
                                                jArr = jArr4;
                                                jArr2 = jArr5;
                                                iArr2 = iArr3;
                                                j4 = j9;
                                                iArr = iArr4;
                                            } else {
                                                j3 = j6;
                                                int i37 = dVar.a;
                                                long[] jArr6 = new long[i37];
                                                int[] iArr5 = new int[i37];
                                                while (dVar.a()) {
                                                    int i38 = dVar.b;
                                                    jArr6[i38] = dVar.d;
                                                    iArr5[i38] = dVar.c;
                                                }
                                                int b8 = eVar.b();
                                                long j13 = m3;
                                                int i39 = 8192 / b8;
                                                int i40 = i;
                                                int i41 = i40;
                                                while (i40 < i37) {
                                                    int i42 = iArr5[i40];
                                                    int i43 = z.a;
                                                    i41 = (((i42 + i39) - 1) / i39) + i41;
                                                    i40++;
                                                }
                                                long[] jArr7 = new long[i41];
                                                int[] iArr6 = new int[i41];
                                                long[] jArr8 = new long[i41];
                                                int[] iArr7 = new int[i41];
                                                int i44 = i;
                                                int i45 = i44;
                                                int i46 = i45;
                                                int i47 = i46;
                                                while (i44 < i37) {
                                                    int i48 = iArr5[i44];
                                                    long j14 = jArr6[i44];
                                                    int[] iArr8 = iArr5;
                                                    int i49 = i48;
                                                    int i50 = i37;
                                                    int i51 = i45;
                                                    int i52 = i44;
                                                    int i53 = i47;
                                                    while (i49 > 0) {
                                                        int min = Math.min(i39, i49);
                                                        jArr7[i46] = j14;
                                                        int i54 = i39;
                                                        int i55 = b8 * min;
                                                        iArr6[i46] = i55;
                                                        int max2 = Math.max(i53, i55);
                                                        jArr8[i46] = i51 * j13;
                                                        iArr7[i46] = i26;
                                                        j14 += iArr6[i46];
                                                        i51 += min;
                                                        i49 -= min;
                                                        i46++;
                                                        i39 = i54;
                                                        i53 = max2;
                                                    }
                                                    int i56 = i39;
                                                    int i57 = i52 + 1;
                                                    i45 = i51;
                                                    i47 = i53;
                                                    iArr5 = iArr8;
                                                    i37 = i50;
                                                    i44 = i57;
                                                    i39 = i56;
                                                }
                                                jArr = jArr7;
                                                iArr = iArr7;
                                                iArr2 = iArr6;
                                                jArr2 = jArr8;
                                                i6 = i47;
                                                j4 = 0;
                                            }
                                            jArr3 = a.i;
                                            if (jArr3 == null && (mVar2.a == -1 || mVar2.b == -1)) {
                                                if (jArr3.length == i26 && a.b == i26 && jArr2.length >= 2) {
                                                    long j15 = a.j[i];
                                                    long a3 = z.a(jArr3[i], a.c, a.d) + j15;
                                                    long j16 = jArr2[i];
                                                    if (j16 <= j15 && j15 < jArr2[1]) {
                                                        long j17 = j4;
                                                        if (jArr2[jArr2.length - 1] < a3 && a3 <= j17) {
                                                            long a4 = z.a(j15 - j16, a.f.s, a.c);
                                                            long a5 = z.a(j17 - a3, a.f.s, a.c);
                                                            if ((a4 != 0 || a5 != 0) && a4 <= 2147483647L && a5 <= 2147483647L) {
                                                                mVar2.a = (int) a4;
                                                                mVar2.b = (int) a5;
                                                                z.a(jArr2, a.c);
                                                                vVar = new v(jArr, iArr2, i6, jArr2, iArr);
                                                                aVar = aVar2;
                                                                i7 = i25;
                                                                arrayList = arrayList3;
                                                                mVar = mVar2;
                                                            }
                                                        }
                                                    }
                                                }
                                                long[] jArr9 = a.i;
                                                if (jArr9.length == 1 && jArr9[i] == 0) {
                                                    for (int i58 = i; i58 < jArr2.length; i58++) {
                                                        jArr2[i58] = z.a(jArr2[i58] - a.j[i], 1000000L, a.c);
                                                    }
                                                    vVar = new v(jArr, iArr2, i6, jArr2, iArr);
                                                    aVar = aVar2;
                                                    i7 = i25;
                                                    arrayList = arrayList3;
                                                    mVar = mVar2;
                                                } else {
                                                    long[] jArr10 = jArr2;
                                                    long[] jArr11 = jArr;
                                                    int[] iArr9 = iArr2;
                                                    int[] iArr10 = iArr;
                                                    boolean z3 = a.b == 1 ? 1 : i;
                                                    int i59 = i;
                                                    int i60 = i59;
                                                    int i61 = i60;
                                                    int i62 = i61;
                                                    while (true) {
                                                        long[] jArr12 = a.i;
                                                        aVar = aVar2;
                                                        if (i59 >= jArr12.length) {
                                                            break;
                                                        }
                                                        ArrayList arrayList5 = arrayList3;
                                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar3 = mVar2;
                                                        long j18 = a.j[i59];
                                                        if (j18 != -1) {
                                                            long j19 = jArr12[i59];
                                                            i9 = i25;
                                                            long a6 = z.a(j19, a.c, a.d);
                                                            int a7 = z.a(jArr10, j18, true, true);
                                                            int a8 = z.a(jArr10, j18 + a6, z3, i);
                                                            i60 = (a8 - a7) + i60;
                                                            i62 |= i61 != a7 ? 1 : 0;
                                                            i61 = a8;
                                                        } else {
                                                            i9 = i25;
                                                        }
                                                        i59++;
                                                        i25 = i9;
                                                        aVar2 = aVar;
                                                        arrayList3 = arrayList5;
                                                        mVar2 = mVar3;
                                                        i = 0;
                                                    }
                                                    int i63 = i25;
                                                    arrayList = arrayList3;
                                                    mVar = mVar2;
                                                    int i64 = i62 | (i60 != a2 ? 1 : 0);
                                                    long[] jArr13 = i64 != 0 ? new long[i60] : jArr11;
                                                    int[] iArr11 = i64 != 0 ? new int[i60] : iArr9;
                                                    if (i64 != 0) {
                                                        i6 = 0;
                                                    }
                                                    int[] iArr12 = i64 != 0 ? new int[i60] : iArr10;
                                                    long[] jArr14 = new long[i60];
                                                    long j20 = 0;
                                                    int i65 = i6;
                                                    int i66 = 0;
                                                    int i67 = 0;
                                                    while (true) {
                                                        long[] jArr15 = a.i;
                                                        int i68 = i64;
                                                        if (i66 >= jArr15.length) {
                                                            break;
                                                        }
                                                        long[] jArr16 = jArr14;
                                                        int i69 = i66;
                                                        long j21 = a.j[i69];
                                                        long j22 = jArr15[i69];
                                                        if (j21 != -1) {
                                                            j5 = j22;
                                                            long a9 = z.a(j22, a.c, a.d) + j21;
                                                            i8 = i63;
                                                            int a10 = z.a(jArr10, j21, true, true);
                                                            int a11 = z.a(jArr10, a9, z3, false);
                                                            if (i68 != 0) {
                                                                int i70 = a11 - a10;
                                                                System.arraycopy(jArr11, a10, jArr13, i67, i70);
                                                                System.arraycopy(iArr9, a10, iArr11, i67, i70);
                                                                System.arraycopy(iArr10, a10, iArr12, i67, i70);
                                                            }
                                                            int i71 = i65;
                                                            while (a10 < a11) {
                                                                long[] jArr17 = jArr13;
                                                                int[] iArr13 = iArr9;
                                                                jArr16[i67] = z.a(j20, 1000000L, a.d) + z.a(jArr10[a10] - j21, 1000000L, a.c);
                                                                if (i68 != 0 && iArr11[i67] > i71) {
                                                                    i71 = iArr13[a10];
                                                                }
                                                                i67++;
                                                                a10++;
                                                                jArr13 = jArr17;
                                                                iArr9 = iArr13;
                                                            }
                                                            i65 = i71;
                                                        } else {
                                                            i8 = i63;
                                                            j5 = j22;
                                                        }
                                                        j20 += j5;
                                                        i66 = i69 + 1;
                                                        jArr13 = jArr13;
                                                        i64 = i68;
                                                        jArr14 = jArr16;
                                                        i63 = i8;
                                                        iArr9 = iArr9;
                                                    }
                                                    long[] jArr18 = jArr13;
                                                    long[] jArr19 = jArr14;
                                                    i7 = i63;
                                                    boolean z4 = false;
                                                    for (int i72 = 0; i72 < iArr12.length && !z4; i72++) {
                                                        z4 |= (iArr12[i72] & 1) != 0;
                                                    }
                                                    if (!z4) {
                                                        zzl.t("The edited sample sequence does not contain a sync sample.");
                                                        return;
                                                    }
                                                    vVar2 = new v(jArr18, iArr11, i65, jArr19, iArr12);
                                                }
                                            } else {
                                                aVar = aVar2;
                                                i7 = i25;
                                                long[] jArr20 = jArr2;
                                                arrayList = arrayList3;
                                                mVar = mVar2;
                                                long[] jArr21 = jArr;
                                                int[] iArr14 = iArr;
                                                z.a(jArr20, a.c);
                                                vVar = new v(jArr21, iArr2, i6, jArr20, iArr14);
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
                                    i7 = i25;
                                    long[] jArr202 = jArr2;
                                    arrayList = arrayList3;
                                    mVar = mVar2;
                                    long[] jArr212 = jArr;
                                    int[] iArr142 = iArr;
                                    z.a(jArr202, a.c);
                                    vVar = new v(jArr212, iArr2, i6, jArr202, iArr142);
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
                            i7 = i25;
                            long[] jArr2022 = jArr2;
                            arrayList = arrayList3;
                            mVar = mVar2;
                            long[] jArr2122 = jArr;
                            int[] iArr1422 = iArr;
                            z.a(jArr2022, a.c);
                            vVar = new v(jArr2122, iArr2, i6, jArr2022, iArr1422);
                            vVar2 = vVar;
                        }
                        if (vVar2.a != 0) {
                            pVar2 = this;
                            i10 = i7;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a12 = pVar2.l.a(i10, a.b);
                            o oVar2 = new o(a, vVar2, a12);
                            int i73 = vVar2.d + 30;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = a.f;
                            String str2 = oVar3.a;
                            String str3 = oVar3.e;
                            String str4 = oVar3.f;
                            String str5 = oVar3.c;
                            int i74 = oVar3.b;
                            int i75 = oVar3.j;
                            int i76 = oVar3.k;
                            float f = oVar3.l;
                            int i77 = oVar3.m;
                            float f2 = oVar3.n;
                            byte[] bArr = oVar3.p;
                            int i78 = oVar3.o;
                            com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = oVar3.q;
                            int i79 = oVar3.r;
                            int i80 = oVar3.s;
                            int i81 = oVar3.t;
                            int i82 = oVar3.u;
                            int i83 = oVar3.v;
                            int i84 = oVar3.x;
                            String str6 = oVar3.y;
                            int i85 = oVar3.z;
                            long j23 = oVar3.w;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i74, i73, i75, i76, f, i77, f2, bArr, i78, cVar, i79, i80, i81, i82, i83, i84, str6, i85, j23, oVar3.h, oVar3.i, oVar3.d);
                            if (a.b == 1) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar4 = mVar;
                                int i86 = mVar4.a;
                                if (i86 != -1 && (i11 = mVar4.b) != -1) {
                                    oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i74, i73, i75, i76, f, i77, f2, bArr, i78, cVar, i79, i80, i81, i86, i11, i84, str6, i85, j23, oVar4.h, oVar4.i, oVar4.d);
                                }
                                if (bVar != null) {
                                    mVar = mVar4;
                                    oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar4.a, oVar4.e, oVar4.f, oVar4.c, oVar4.b, oVar4.g, oVar4.j, oVar4.k, oVar4.l, oVar4.m, oVar4.n, oVar4.p, oVar4.o, oVar4.q, oVar4.r, oVar4.s, oVar4.t, oVar4.u, oVar4.v, oVar4.x, oVar4.y, oVar4.z, oVar4.w, oVar4.h, oVar4.i, bVar);
                                } else {
                                    mVar = mVar4;
                                }
                            }
                            a12.a(oVar4);
                            max = Math.max(j3, a.e);
                            arrayList2 = arrayList;
                            arrayList2.add(oVar2);
                            long j24 = vVar2.b[0];
                            j7 = j24 < j2 ? j24 : j2;
                            p pVar4 = pVar2;
                            i25 = i10 + 1;
                            pVar3 = pVar4;
                            j6 = max;
                            arrayList3 = arrayList2;
                            aVar2 = aVar;
                            mVar2 = mVar;
                            i13 = 0;
                            i14 = 1;
                        }
                    } else {
                        aVar = aVar2;
                        i7 = i25;
                        arrayList = arrayList3;
                        mVar = mVar2;
                        j3 = j6;
                        j2 = j7;
                    }
                    pVar2 = this;
                    i10 = i7;
                    j7 = j2;
                    max = j3;
                    arrayList2 = arrayList;
                    p pVar42 = pVar2;
                    i25 = i10 + 1;
                    pVar3 = pVar42;
                    j6 = max;
                    arrayList3 = arrayList2;
                    aVar2 = aVar;
                    mVar2 = mVar;
                    i13 = 0;
                    i14 = 1;
                }
                pVar = pVar3;
                ArrayList arrayList6 = arrayList3;
                pVar.n = j6;
                pVar.m = (o[]) arrayList6.toArray(new o[arrayList6.size()]);
                pVar.l.b();
                pVar.l.a(pVar);
                pVar.d.clear();
                pVar.e = 2;
            } else {
                pVar = pVar3;
                if (!pVar.d.isEmpty()) {
                    ((a) pVar.d.peek()).R0.add(aVar2);
                }
            }
            pVar3 = pVar;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, false);
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

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
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

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.n;
    }
}
