package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.zzl;
import java.io.EOFException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements i {
    public static final int m = z.a("Xing");
    public static final int n = z.a("Info");
    public static final int o = z.a("VBRI");
    public final long a;
    public j e;
    public r f;
    public int g;
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.b h;
    public b i;
    public long k;
    public int l;
    public final n b = new n(10);
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();
    public final m d = new m();
    public long j = C.TIME_UNSET;

    public c(long j) {
        this.a = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r12 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c.n) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b0  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) {
        long j;
        long j2;
        int i;
        int i2;
        int b;
        b bVar2;
        int m2;
        b eVar;
        int j3;
        long j4;
        long min;
        if (this.g == 0) {
            try {
                a(bVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int i3 = 1;
        if (this.i == null) {
            n nVar = new n(this.c.c);
            bVar.a(nVar.a, 0, this.c.c, false);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.c;
            int i4 = nVar2.a & 1;
            int i5 = nVar2.e;
            if (i4 != 0) {
                if (i5 != 1) {
                    i = 36;
                    if (nVar.c >= i + 4) {
                        nVar.e(i);
                        i2 = nVar.b();
                        if (i2 != m) {
                        }
                        if (i2 != m || i2 == n) {
                            j = 1000000;
                            j2 = 0;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar3 = this.c;
                            long j5 = bVar.c;
                            long j6 = bVar.b;
                            int i6 = nVar3.g;
                            int i7 = nVar3.d;
                            long j7 = j5 + nVar3.c;
                            b = nVar.b();
                            if ((b & 1) == 1 || (m2 = nVar.m()) == 0) {
                                bVar2 = null;
                            } else {
                                long a = z.a(m2, i6 * 1000000, i7);
                                if ((b & 6) != 6) {
                                    eVar = new e(j7, a, j6, null, 0L, 0);
                                } else {
                                    long m3 = nVar.m();
                                    nVar.e(nVar.b + 1);
                                    long[] jArr = new long[99];
                                    for (int i8 = 0; i8 < 99; i8++) {
                                        jArr[i8] = nVar.j();
                                    }
                                    eVar = new e(j7, a, j6, jArr, m3, nVar3.c);
                                }
                                bVar2 = eVar;
                            }
                            if (bVar2 != null) {
                                m mVar = this.d;
                                if (mVar.a == -1 || mVar.b == -1) {
                                    bVar.e = 0;
                                    bVar.a(i + 141, false);
                                    bVar.a(this.b.a, 0, 3, false);
                                    this.b.e(0);
                                    m mVar2 = this.d;
                                    int l = this.b.l();
                                    mVar2.getClass();
                                    int i9 = l >> 12;
                                    int i10 = l & 4095;
                                    if (i9 > 0 || i10 > 0) {
                                        mVar2.a = i9;
                                        mVar2.b = i10;
                                    }
                                }
                            }
                            bVar.a(this.c.c);
                            if (bVar2 != null && !bVar2.a() && i2 == n) {
                                bVar2 = b(bVar);
                            }
                        } else if (i2 == o) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar4 = this.c;
                            long j8 = bVar.c;
                            j = 1000000;
                            long j9 = bVar.b;
                            nVar.e(nVar.b + 10);
                            int b2 = nVar.b();
                            if (b2 <= 0) {
                                j2 = 0;
                            } else {
                                j2 = 0;
                                int i11 = nVar4.d;
                                long j10 = j9;
                                long a2 = z.a(b2, (i11 >= 32000 ? 1152 : 576) * 1000000, i11);
                                int o2 = nVar.o();
                                int o3 = nVar.o();
                                int o4 = nVar.o();
                                int i12 = 2;
                                nVar.e(nVar.b + 2);
                                long j11 = j8 + nVar4.c;
                                int i13 = o2 + 1;
                                long[] jArr2 = new long[i13];
                                long[] jArr3 = new long[i13];
                                jArr2[0] = 0;
                                jArr3[0] = j11;
                                int i14 = 1;
                                while (i14 < i13) {
                                    if (o4 == i3) {
                                        j3 = nVar.j();
                                    } else if (o4 == i12) {
                                        j3 = nVar.o();
                                    } else if (o4 == 3) {
                                        j3 = nVar.l();
                                    } else if (o4 == 4) {
                                        j3 = nVar.m();
                                    }
                                    int i15 = i13;
                                    j11 += j3 * o3;
                                    int i16 = o3;
                                    int i17 = o4;
                                    jArr2[i14] = (i14 * a2) / o2;
                                    if (j10 == -1) {
                                        min = j11;
                                        j4 = j10;
                                    } else {
                                        j4 = j10;
                                        min = Math.min(j4, j11);
                                    }
                                    jArr3[i14] = min;
                                    i14++;
                                    j10 = j4;
                                    o3 = i16;
                                    i13 = i15;
                                    o4 = i17;
                                    i12 = 2;
                                    i3 = 1;
                                }
                                bVar2 = new d(jArr2, jArr3, a2);
                                bVar.a(this.c.c);
                            }
                            bVar2 = null;
                            bVar.a(this.c.c);
                        } else {
                            j = 1000000;
                            j2 = 0;
                            bVar.e = 0;
                            bVar2 = null;
                        }
                        this.i = bVar2;
                        if (bVar2 == null) {
                            bVar2 = b(bVar);
                            this.i = bVar2;
                        }
                        this.e.a(bVar2);
                        r rVar = this.f;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar5 = this.c;
                        String str = nVar5.b;
                        int i18 = nVar5.e;
                        int i19 = nVar5.d;
                        m mVar3 = this.d;
                        rVar.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str, -1, 4096, i18, i19, -1, mVar3.a, mVar3.b, null, null, 0, null, this.h));
                    }
                    if (nVar.c >= 40) {
                        nVar.e(36);
                        int b3 = nVar.b();
                        int i20 = o;
                        if (b3 == i20) {
                            i2 = i20;
                            if (i2 != m) {
                            }
                            j = 1000000;
                            j2 = 0;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar32 = this.c;
                            long j52 = bVar.c;
                            long j62 = bVar.b;
                            int i62 = nVar32.g;
                            int i72 = nVar32.d;
                            long j72 = j52 + nVar32.c;
                            b = nVar.b();
                            if ((b & 1) == 1) {
                            }
                            bVar2 = null;
                            if (bVar2 != null) {
                            }
                            bVar.a(this.c.c);
                            if (bVar2 != null) {
                                bVar2 = b(bVar);
                            }
                            this.i = bVar2;
                            if (bVar2 == null) {
                            }
                            this.e.a(bVar2);
                            r rVar2 = this.f;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar52 = this.c;
                            String str2 = nVar52.b;
                            int i182 = nVar52.e;
                            int i192 = nVar52.d;
                            m mVar32 = this.d;
                            rVar2.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str2, -1, 4096, i182, i192, -1, mVar32.a, mVar32.b, null, null, 0, null, this.h));
                        }
                    }
                    i2 = 0;
                    if (i2 != m) {
                    }
                    j = 1000000;
                    j2 = 0;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar322 = this.c;
                    long j522 = bVar.c;
                    long j622 = bVar.b;
                    int i622 = nVar322.g;
                    int i722 = nVar322.d;
                    long j722 = j522 + nVar322.c;
                    b = nVar.b();
                    if ((b & 1) == 1) {
                    }
                    bVar2 = null;
                    if (bVar2 != null) {
                    }
                    bVar.a(this.c.c);
                    if (bVar2 != null) {
                    }
                    this.i = bVar2;
                    if (bVar2 == null) {
                    }
                    this.e.a(bVar2);
                    r rVar22 = this.f;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar522 = this.c;
                    String str22 = nVar522.b;
                    int i1822 = nVar522.e;
                    int i1922 = nVar522.d;
                    m mVar322 = this.d;
                    rVar22.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str22, -1, 4096, i1822, i1922, -1, mVar322.a, mVar322.b, null, null, 0, null, this.h));
                }
                i = 21;
                if (nVar.c >= i + 4) {
                }
                if (nVar.c >= 40) {
                }
                i2 = 0;
                if (i2 != m) {
                }
                j = 1000000;
                j2 = 0;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar3222 = this.c;
                long j5222 = bVar.c;
                long j6222 = bVar.b;
                int i6222 = nVar3222.g;
                int i7222 = nVar3222.d;
                long j7222 = j5222 + nVar3222.c;
                b = nVar.b();
                if ((b & 1) == 1) {
                }
                bVar2 = null;
                if (bVar2 != null) {
                }
                bVar.a(this.c.c);
                if (bVar2 != null) {
                }
                this.i = bVar2;
                if (bVar2 == null) {
                }
                this.e.a(bVar2);
                r rVar222 = this.f;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar5222 = this.c;
                String str222 = nVar5222.b;
                int i18222 = nVar5222.e;
                int i19222 = nVar5222.d;
                m mVar3222 = this.d;
                rVar222.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str222, -1, 4096, i18222, i19222, -1, mVar3222.a, mVar3222.b, null, null, 0, null, this.h));
            } else {
                if (i5 == 1) {
                    i = 13;
                    if (nVar.c >= i + 4) {
                    }
                    if (nVar.c >= 40) {
                    }
                    i2 = 0;
                    if (i2 != m) {
                    }
                    j = 1000000;
                    j2 = 0;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar32222 = this.c;
                    long j52222 = bVar.c;
                    long j62222 = bVar.b;
                    int i62222 = nVar32222.g;
                    int i72222 = nVar32222.d;
                    long j72222 = j52222 + nVar32222.c;
                    b = nVar.b();
                    if ((b & 1) == 1) {
                    }
                    bVar2 = null;
                    if (bVar2 != null) {
                    }
                    bVar.a(this.c.c);
                    if (bVar2 != null) {
                    }
                    this.i = bVar2;
                    if (bVar2 == null) {
                    }
                    this.e.a(bVar2);
                    r rVar2222 = this.f;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar52222 = this.c;
                    String str2222 = nVar52222.b;
                    int i182222 = nVar52222.e;
                    int i192222 = nVar52222.d;
                    m mVar32222 = this.d;
                    rVar2222.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str2222, -1, 4096, i182222, i192222, -1, mVar32222.a, mVar32222.b, null, null, 0, null, this.h));
                }
                i = 21;
                if (nVar.c >= i + 4) {
                }
                if (nVar.c >= 40) {
                }
                i2 = 0;
                if (i2 != m) {
                }
                j = 1000000;
                j2 = 0;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar322222 = this.c;
                long j522222 = bVar.c;
                long j622222 = bVar.b;
                int i622222 = nVar322222.g;
                int i722222 = nVar322222.d;
                long j722222 = j522222 + nVar322222.c;
                b = nVar.b();
                if ((b & 1) == 1) {
                }
                bVar2 = null;
                if (bVar2 != null) {
                }
                bVar.a(this.c.c);
                if (bVar2 != null) {
                }
                this.i = bVar2;
                if (bVar2 == null) {
                }
                this.e.a(bVar2);
                r rVar22222 = this.f;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar522222 = this.c;
                String str22222 = nVar522222.b;
                int i1822222 = nVar522222.e;
                int i1922222 = nVar522222.d;
                m mVar322222 = this.d;
                rVar22222.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str22222, -1, 4096, i1822222, i1922222, -1, mVar322222.a, mVar322222.b, null, null, 0, null, this.h));
            }
        } else {
            j = 1000000;
            j2 = 0;
        }
        int i21 = this.l;
        int i22 = 0;
        if (i21 == 0) {
            bVar.e = 0;
            if (!bVar.a(this.b.a, 0, 4, true)) {
                return -1;
            }
            this.b.e(0);
            int b4 = this.b.b();
            if (((-128000) & b4) != (this.g & (-128000)) || com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(b4) == -1) {
                bVar.a(1);
                this.g = 0;
                return 0;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(b4, this.c);
            if (this.j == C.TIME_UNSET) {
                this.j = this.i.b(bVar.c);
                if (this.a != C.TIME_UNSET) {
                    this.j = (this.a - this.i.b(j2)) + this.j;
                }
            }
            i21 = this.c.c;
            this.l = i21;
            i22 = 0;
        }
        int a3 = this.f.a(bVar, i21, true);
        if (a3 == -1) {
            return -1;
        }
        int i23 = this.l - a3;
        this.l = i23;
        if (i23 > 0) {
            return i22;
        }
        this.f.a(((this.k * j) / r5.d) + this.j, 1, this.c.c, 0, null);
        this.k += this.c.g;
        this.l = 0;
        return 0;
    }

    public final a b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        bVar.a(this.b.a, 0, 4, false);
        this.b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.b.b(), this.c);
        return new a(this.c.f, bVar.c, bVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
    
        if (r20 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e3, code lost:
    
        r19.a(r4 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
    
        r18.g = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ec, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:
    
        r19.e = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = z ? 16384 : 131072;
        bVar.e = 0;
        if (bVar.c == 0) {
            int i4 = 0;
            while (true) {
                bVar.a(this.b.a, 0, 10, false);
                this.b.e(0);
                if (this.b.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.b) {
                    break;
                }
                n nVar = this.b;
                nVar.e(nVar.b + 3);
                int i5 = this.b.i();
                int i6 = i5 + 10;
                if (this.h == null) {
                    byte[] bArr = new byte[i6];
                    System.arraycopy(this.b.a, 0, bArr, 0, 10);
                    bVar.a(bArr, 10, i5, false);
                    com.fyber.inneractive.sdk.player.exoplayer2.metadata.b a2 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n(null).a(i6, bArr);
                    this.h = a2;
                    if (a2 != null) {
                        this.d.a(a2);
                    }
                } else {
                    bVar.a(i5, false);
                }
                i4 += i6;
            }
            bVar.e = 0;
            bVar.a(i4, false);
            i = (int) (bVar.c + bVar.e);
            if (!z) {
                bVar.a(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i7 = i2;
        int i8 = i7;
        while (true) {
            if (!bVar.a(this.b.a, 0, 4, i2 > 0)) {
                break;
            }
            this.b.e(0);
            int b = this.b.b();
            if ((i7 == 0 || ((-128000) & b) == (i7 & (-128000))) && (a = com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(b)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(b, this.c);
                    i7 = b;
                }
                bVar.a(a - 4, false);
            } else {
                int i9 = i8 + 1;
                if (i8 == i3) {
                    if (z) {
                        return false;
                    }
                    zzl.t("Searched too many bytes.");
                    return false;
                }
                if (z) {
                    bVar.e = 0;
                    bVar.a(i + i9, false);
                } else {
                    bVar.a(1);
                }
                i7 = 0;
                i8 = i9;
                i2 = 0;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.e = jVar;
        this.f = jVar.a(0, 1);
        this.e.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.g = 0;
        this.j = C.TIME_UNSET;
        this.k = 0L;
        this.l = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return a(bVar, true);
    }
}
