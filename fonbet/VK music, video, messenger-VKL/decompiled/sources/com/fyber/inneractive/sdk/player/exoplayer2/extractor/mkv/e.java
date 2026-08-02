package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import xsna.qlb0;
import xsna.zr;

/* loaded from: classes12.dex */
public final class e implements i {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g B;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public j Y;
    public final b a;
    public final g b;
    public final SparseArray c;
    public final boolean d;
    public final n e;
    public final n f;
    public final n g;
    public final n h;
    public final n i;
    public final n j;
    public final n k;
    public final n l;
    public final n m;
    public ByteBuffer n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public d t;
    public boolean u;
    public int v;
    public long w;
    public boolean x;
    public long y;
    public long z;

    public e() {
        b bVar = new b();
        this.p = -1L;
        this.q = C.TIME_UNSET;
        this.r = C.TIME_UNSET;
        this.s = C.TIME_UNSET;
        this.y = -1L;
        this.z = -1L;
        this.A = C.TIME_UNSET;
        this.a = bVar;
        bVar.d = new c(this);
        this.d = true;
        this.b = new g();
        this.c = new SparseArray();
        this.g = new n(4);
        this.h = new n(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new n(4);
        this.e = new n(l.a);
        this.f = new n(4);
        this.j = new n();
        this.k = new n();
        this.l = new n(8);
        this.m = new n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009c, code lost:
    
        return false;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        f fVar = new f();
        long j = bVar.b;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        bVar.a(fVar.a.a, 0, 4, false);
        long k = fVar.a.k();
        fVar.b = 4;
        while (true) {
            if (k != 440786851) {
                int i2 = fVar.b + 1;
                fVar.b = i2;
                if (i2 == i) {
                    break;
                }
                bVar.a(fVar.a.a, 0, 1, false);
                k = ((k << 8) & (-256)) | (fVar.a.a[0] & 255);
            } else {
                long a = fVar.a(bVar);
                long j3 = fVar.b;
                if (a != Long.MIN_VALUE && (j == -1 || j3 + a < j)) {
                    while (true) {
                        long j4 = fVar.b;
                        long j5 = j3 + a;
                        if (j4 < j5) {
                            if (fVar.a(bVar) != Long.MIN_VALUE) {
                                long a2 = fVar.a(bVar);
                                if (a2 < 0 || a2 > 2147483647L) {
                                    break;
                                }
                                if (a2 != 0) {
                                    bVar.a((int) a2, false);
                                    fVar.b = (int) (fVar.b + a2);
                                }
                            } else {
                                break;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.Y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.A = C.TIME_UNSET;
        this.E = 0;
        b bVar = this.a;
        bVar.e = 0;
        bVar.b.clear();
        g gVar = bVar.c;
        gVar.b = 0;
        gVar.c = 0;
        g gVar2 = this.b;
        gVar2.b = 0;
        gVar2.c = 0;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar = this.j;
        nVar.b = 0;
        nVar.c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x02e3, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0677, code lost:
    
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x081c, code lost:
    
        if (r7 != 7) goto L416;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:345:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x058d  */
    /* JADX WARN: Type inference failed for: r3v104, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v110 */
    /* JADX WARN: Type inference failed for: r3v163 */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) {
        boolean z;
        long j;
        int i;
        boolean z2;
        String str;
        boolean z3;
        int i2;
        int i3;
        int i4;
        char c;
        int i5;
        long j2;
        int i6;
        int i7;
        double longBitsToDouble;
        long j3;
        int i8;
        int a;
        boolean z4;
        q pVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar;
        int i9;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar2;
        boolean z5 = false;
        this.W = false;
        boolean z6 = true;
        while (z6 && !this.W) {
            b bVar2 = this.a;
            boolean z7 = z5;
            if (bVar2.d == null) {
                throw new IllegalStateException();
            }
            while (true) {
                if (!bVar2.b.isEmpty() && bVar.c >= ((a) bVar2.b.peek()).b) {
                    c cVar = bVar2.d;
                    int i10 = ((a) bVar2.b.pop()).a;
                    e eVar = cVar.a;
                    if (i10 != 160) {
                        if (i10 == 174) {
                            String str2 = eVar.t.a;
                            if ("V_VP8".equals(str2) || "V_VP9".equals(str2) || "V_MPEG2".equals(str2) || "V_MPEG4/ISO/SP".equals(str2) || "V_MPEG4/ISO/ASP".equals(str2) || "V_MPEG4/ISO/AP".equals(str2) || "V_MPEG4/ISO/AVC".equals(str2) || "V_MPEGH/ISO/HEVC".equals(str2) || "V_MS/VFW/FOURCC".equals(str2) || "V_THEORA".equals(str2) || "A_OPUS".equals(str2) || "A_VORBIS".equals(str2) || "A_AAC".equals(str2) || "A_MPEG/L2".equals(str2) || "A_MPEG/L3".equals(str2) || "A_AC3".equals(str2) || "A_EAC3".equals(str2) || "A_TRUEHD".equals(str2) || "A_DTS".equals(str2) || "A_DTS/EXPRESS".equals(str2) || "A_DTS/LOSSLESS".equals(str2) || "A_FLAC".equals(str2) || "A_MS/ACM".equals(str2) || "A_PCM/INT/LIT".equals(str2) || "S_TEXT/UTF8".equals(str2) || "S_VOBSUB".equals(str2) || "S_HDMV/PGS".equals(str2) || "S_DVBSUB".equals(str2)) {
                                d dVar = eVar.t;
                                dVar.a(eVar.Y, dVar.b);
                                SparseArray sparseArray = eVar.c;
                                d dVar2 = eVar.t;
                                sparseArray.put(dVar2.b, dVar2);
                            }
                            eVar.t = null;
                        } else {
                            if (i10 == 19899) {
                                int i11 = eVar.v;
                                if (i11 != -1) {
                                    long j4 = eVar.w;
                                    if (j4 != -1) {
                                        if (i11 == 475249515) {
                                            eVar.y = j4;
                                        }
                                    }
                                }
                                throw new r("Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i10 == 25152) {
                                d dVar3 = eVar.t;
                                if (dVar3.e) {
                                    byte[] bArr = dVar3.g;
                                    if (bArr != null) {
                                        dVar3.i = new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(true, new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(com.fyber.inneractive.sdk.player.exoplayer2.b.b, "video/webm", bArr));
                                    } else {
                                        throw new r("Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                }
                            } else if (i10 == 28032) {
                                d dVar4 = eVar.t;
                                if (dVar4.e && dVar4.f != null) {
                                    throw new r("Combining encryption and compression is not supported");
                                }
                            } else if (i10 == 357149030) {
                                if (eVar.q == C.TIME_UNSET) {
                                    eVar.q = 1000000L;
                                }
                                long j5 = eVar.r;
                                if (j5 != C.TIME_UNSET) {
                                    eVar.s = eVar.a(j5);
                                }
                            } else if (i10 != 374648427) {
                                if (i10 != 475249515) {
                                    eVar.getClass();
                                    z4 = z7;
                                } else {
                                    z4 = z7;
                                    if (!eVar.u) {
                                        j jVar = eVar.Y;
                                        if (eVar.p != -1 && eVar.s != C.TIME_UNSET && (gVar = eVar.B) != null && (i9 = gVar.a) != 0 && (gVar2 = eVar.C) != null && gVar2.a == i9) {
                                            int[] iArr = new int[i9];
                                            long[] jArr = new long[i9];
                                            long[] jArr2 = new long[i9];
                                            long[] jArr3 = new long[i9];
                                            for (int i12 = z7 ? 1 : 0; i12 < i9; i12++) {
                                                com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar3 = eVar.B;
                                                if (i12 >= 0) {
                                                    if (i12 < gVar3.a) {
                                                        jArr3[i12] = gVar3.b[i12];
                                                        long j6 = eVar.p;
                                                        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar4 = eVar.C;
                                                        if (i12 < 0) {
                                                            gVar4.getClass();
                                                        } else if (i12 < gVar4.a) {
                                                            jArr[i12] = gVar4.b[i12] + j6;
                                                        }
                                                        StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i12, ", size is ");
                                                        a2.append(gVar4.a);
                                                        throw new IndexOutOfBoundsException(a2.toString());
                                                    }
                                                } else {
                                                    gVar3.getClass();
                                                }
                                                StringBuilder a3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i12, ", size is ");
                                                a3.append(gVar3.a);
                                                throw new IndexOutOfBoundsException(a3.toString());
                                            }
                                            int i13 = 0;
                                            while (true) {
                                                int i14 = i9 - 1;
                                                if (i13 < i14) {
                                                    int i15 = i13 + 1;
                                                    iArr[i13] = (int) (jArr[i15] - jArr[i13]);
                                                    jArr2[i13] = jArr3[i15] - jArr3[i13];
                                                    i13 = i15;
                                                } else {
                                                    iArr[i14] = (int) ((eVar.p + eVar.o) - jArr[i14]);
                                                    jArr2[i14] = eVar.s - jArr3[i14];
                                                    eVar.B = null;
                                                    eVar.C = null;
                                                    pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr, jArr, jArr2, jArr3);
                                                }
                                            }
                                        } else {
                                            eVar.B = null;
                                            eVar.C = null;
                                            pVar = new p(eVar.s);
                                        }
                                        jVar.a(pVar);
                                        eVar.u = true;
                                    }
                                }
                                z2 = z4;
                            } else if (eVar.c.size() != 0) {
                                eVar.Y.b();
                            } else {
                                throw new r("No valid tracks were found");
                            }
                        }
                        z4 = false;
                        z2 = z4;
                    } else {
                        if (eVar.E == 2) {
                            if (!eVar.X) {
                                eVar.M |= 1;
                            }
                            eVar.a((d) eVar.c.get(eVar.K), eVar.F);
                            z4 = false;
                            eVar.E = 0;
                            z2 = z4;
                        }
                        z4 = false;
                        z2 = z4;
                    }
                } else {
                    int i16 = 8;
                    if (bVar2.e == 0) {
                        long a4 = bVar2.c.a(bVar, true, z7, 4);
                        if (a4 == -2) {
                            bVar.e = z7 ? 1 : 0;
                            ?? r3 = z7;
                            while (true) {
                                bVar.a(bVar2.a, r3, 4, r3);
                                byte b = bVar2.a[r3];
                                i8 = 0;
                                while (true) {
                                    long[] jArr4 = g.d;
                                    if (i8 < 8) {
                                        j = 0;
                                        long j7 = jArr4[i8] & b;
                                        i8++;
                                        if (j7 != 0) {
                                        }
                                    } else {
                                        j = 0;
                                        i8 = -1;
                                    }
                                }
                                if (i8 != -1 && i8 <= 4) {
                                    a = (int) g.a(bVar2.a, i8, false);
                                    bVar2.d.a.getClass();
                                    if (a == 357149030 || a == 524531317 || a == 475249515 || a == 374648427) {
                                    }
                                }
                                bVar.a(1);
                                r3 = 0;
                            }
                            bVar.a(i8);
                            j3 = a;
                        } else {
                            j = 0;
                            j3 = a4;
                        }
                        z = true;
                        if (j3 == -1) {
                            z6 = false;
                            z2 = false;
                        } else {
                            bVar2.f = (int) j3;
                            bVar2.e = 1;
                        }
                    } else {
                        z = true;
                        j = 0;
                    }
                    if (bVar2.e == z) {
                        bVar2.g = bVar2.c.a(bVar, false, z, 8);
                        bVar2.e = 2;
                    }
                    c cVar2 = bVar2.d;
                    int i17 = bVar2.f;
                    cVar2.a.getClass();
                    switch (i17) {
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case PRIVACY_URL_ERROR_VALUE:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case AD_RESPONSE_EMPTY_VALUE:
                        case 231:
                        case 241:
                        case 251:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        bVar.a((int) bVar2.g);
                        bVar2.e = 0;
                        z7 = false;
                    } else if (i != 1) {
                        char c2 = 6;
                        byte b2 = 255;
                        if (i == 2) {
                            long j8 = bVar2.g;
                            if (j8 <= 8) {
                                c cVar3 = bVar2.d;
                                int i18 = bVar2.f;
                                int i19 = (int) j8;
                                bVar.b(bVar2.a, 0, i19, false);
                                long j9 = j;
                                for (int i20 = 0; i20 < i19; i20++) {
                                    j9 = (j9 << 8) | (bVar2.a[i20] & 255);
                                }
                                e eVar2 = cVar3.a;
                                eVar2.getClass();
                                if (i18 != 20529) {
                                    if (i18 != 20530) {
                                        switch (i18) {
                                            case MRAID_JS_WRITE_FAILED_VALUE:
                                                eVar2.t.c = (int) j9;
                                                break;
                                            case PRIVACY_URL_ERROR_VALUE:
                                                eVar2.t.L = j9 == 1;
                                                break;
                                            case 155:
                                                eVar2.G = eVar2.a(j9);
                                                break;
                                            case 159:
                                                eVar2.t.G = (int) j9;
                                                break;
                                            case 176:
                                                eVar2.t.j = (int) j9;
                                                break;
                                            case 179:
                                                eVar2.B.a(eVar2.a(j9));
                                                break;
                                            case 186:
                                                eVar2.t.k = (int) j9;
                                                break;
                                            case AD_RESPONSE_EMPTY_VALUE:
                                                eVar2.t.b = (int) j9;
                                                break;
                                            case 231:
                                                eVar2.A = eVar2.a(j9);
                                                break;
                                            case 241:
                                                if (!eVar2.D) {
                                                    eVar2.C.a(j9);
                                                    eVar2.D = true;
                                                    break;
                                                }
                                                break;
                                            case 251:
                                                eVar2.X = true;
                                                break;
                                            case 16980:
                                                if (j9 != 3) {
                                                    throw new r(qlb0.a(j9, "ContentCompAlgo ", " not supported"));
                                                }
                                                break;
                                            case 17029:
                                                if (j9 < 1 || j9 > 2) {
                                                    throw new r(qlb0.a(j9, "DocTypeReadVersion ", " not supported"));
                                                }
                                                break;
                                            case 17143:
                                                if (j9 != 1) {
                                                    throw new r(qlb0.a(j9, "EBMLReadVersion ", " not supported"));
                                                }
                                                break;
                                            case 18401:
                                                if (j9 != 5) {
                                                    throw new r(qlb0.a(j9, "ContentEncAlgo ", " not supported"));
                                                }
                                                break;
                                            case 18408:
                                                if (j9 != 1) {
                                                    throw new r(qlb0.a(j9, "AESSettingsCipherMode ", " not supported"));
                                                }
                                                break;
                                            case 21420:
                                                eVar2.w = j9 + eVar2.p;
                                                break;
                                            case 21432:
                                                int i21 = (int) j9;
                                                if (i21 != 0) {
                                                    if (i21 != 1) {
                                                        if (i21 != 3) {
                                                            if (i21 == 15) {
                                                                eVar2.t.p = 3;
                                                                break;
                                                            }
                                                        } else {
                                                            eVar2.t.p = 1;
                                                            break;
                                                        }
                                                    } else {
                                                        eVar2.t.p = 2;
                                                        break;
                                                    }
                                                } else {
                                                    z2 = false;
                                                    eVar2.t.p = 0;
                                                    bVar2.e = z2 ? 1 : 0;
                                                    break;
                                                }
                                                break;
                                            case 21680:
                                                eVar2.t.l = (int) j9;
                                                break;
                                            case 21682:
                                                eVar2.t.n = (int) j9;
                                                break;
                                            case 21690:
                                                eVar2.t.m = (int) j9;
                                                break;
                                            case 21930:
                                                eVar2.t.M = j9 == 1;
                                                break;
                                            case 22186:
                                                eVar2.t.J = j9;
                                                break;
                                            case 22203:
                                                eVar2.t.K = j9;
                                                break;
                                            case 25188:
                                                eVar2.t.H = (int) j9;
                                                break;
                                            case 2352003:
                                                eVar2.t.d = (int) j9;
                                                break;
                                            case 2807729:
                                                eVar2.q = j9;
                                                break;
                                            default:
                                                switch (i18) {
                                                    case 21945:
                                                        int i22 = (int) j9;
                                                        if (i22 != 1) {
                                                            if (i22 == 2) {
                                                                eVar2.t.t = 1;
                                                                break;
                                                            }
                                                        } else {
                                                            eVar2.t.t = 2;
                                                            break;
                                                        }
                                                        break;
                                                    case 21946:
                                                        int i23 = (int) j9;
                                                        if (i23 != 1) {
                                                            if (i23 == 16) {
                                                                eVar2.t.s = 6;
                                                                break;
                                                            } else if (i23 == 18) {
                                                                eVar2.t.s = 7;
                                                                break;
                                                            } else if (i23 != 6) {
                                                            }
                                                        }
                                                        eVar2.t.s = 3;
                                                        break;
                                                    case 21947:
                                                        d dVar5 = eVar2.t;
                                                        dVar5.q = true;
                                                        int i24 = (int) j9;
                                                        if (i24 != 1) {
                                                            if (i24 != 9) {
                                                                if (i24 == 4 || i24 == 5 || i24 == 6 || i24 == 7) {
                                                                    dVar5.r = 2;
                                                                    break;
                                                                }
                                                            } else {
                                                                dVar5.r = 6;
                                                                break;
                                                            }
                                                        } else {
                                                            dVar5.r = 1;
                                                            break;
                                                        }
                                                    case 21948:
                                                        eVar2.t.u = (int) j9;
                                                        break;
                                                    case 21949:
                                                        eVar2.t.v = (int) j9;
                                                        break;
                                                }
                                                break;
                                        }
                                    } else if (j9 != 1) {
                                        throw new r(qlb0.a(j9, "ContentEncodingScope ", " not supported"));
                                    }
                                } else if (j9 != j) {
                                    throw new r(qlb0.a(j9, "ContentEncodingOrder ", " not supported"));
                                }
                                z2 = false;
                                bVar2.e = z2 ? 1 : 0;
                            } else {
                                throw new r("Invalid integer size: " + bVar2.g);
                            }
                        } else if (i == 3) {
                            long j10 = bVar2.g;
                            if (j10 <= 2147483647L) {
                                c cVar4 = bVar2.d;
                                int i25 = bVar2.f;
                                int i26 = (int) j10;
                                if (i26 == 0) {
                                    str = "";
                                } else {
                                    byte[] bArr2 = new byte[i26];
                                    bVar.b(bArr2, 0, i26, false);
                                    str = new String(bArr2);
                                }
                                e eVar3 = cVar4.a;
                                eVar3.getClass();
                                if (i25 == 134) {
                                    eVar3.t.a = str;
                                } else if (i25 != 17026) {
                                    if (i25 == 2274716) {
                                        eVar3.t.N = str;
                                    }
                                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw new r(zr.a("DocType ", str, " not supported"));
                                }
                                z2 = false;
                                bVar2.e = 0;
                            } else {
                                throw new r("String element size: " + bVar2.g);
                            }
                        } else if (i == 4) {
                            c cVar5 = bVar2.d;
                            int i27 = bVar2.f;
                            int i28 = (int) bVar2.g;
                            e eVar4 = cVar5.a;
                            if (i27 == 161 || i27 == 163) {
                                z3 = false;
                                if (eVar4.E == 0) {
                                    eVar4.K = (int) eVar4.b.a(bVar, false, true, 8);
                                    eVar4.L = eVar4.b.c;
                                    eVar4.G = C.TIME_UNSET;
                                    eVar4.E = 1;
                                    n nVar = eVar4.g;
                                    nVar.b = 0;
                                    nVar.c = 0;
                                }
                                d dVar6 = (d) eVar4.c.get(eVar4.K);
                                if (dVar6 == null) {
                                    bVar.a(i28 - eVar4.L);
                                    eVar4.E = 0;
                                } else {
                                    if (eVar4.E == 1) {
                                        eVar4.a(bVar, 3);
                                        int i29 = (eVar4.g.a[2] & 6) >> 1;
                                        if (i29 == 0) {
                                            eVar4.I = 1;
                                            int[] iArr2 = eVar4.J;
                                            if (iArr2 == null) {
                                                iArr2 = new int[1];
                                            } else if (iArr2.length < 1) {
                                                iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                                            }
                                            eVar4.J = iArr2;
                                            iArr2[0] = (i28 - eVar4.L) - 3;
                                        } else if (i27 == 163) {
                                            eVar4.a(bVar, 4);
                                            int i30 = (eVar4.g.a[3] & 255) + 1;
                                            eVar4.I = i30;
                                            int[] iArr3 = eVar4.J;
                                            if (iArr3 == null) {
                                                iArr3 = new int[i30];
                                            } else if (iArr3.length < i30) {
                                                i3 = 2;
                                                iArr3 = new int[Math.max(iArr3.length * 2, i30)];
                                                eVar4.J = iArr3;
                                                if (i29 != i3) {
                                                    int i31 = (i28 - eVar4.L) - 4;
                                                    int i32 = eVar4.I;
                                                    Arrays.fill(iArr3, 0, i32, i31 / i32);
                                                } else {
                                                    int i33 = 0;
                                                    int i34 = 1;
                                                    if (i29 == 1) {
                                                        int i35 = 0;
                                                        int i36 = 0;
                                                        int i37 = 4;
                                                        while (true) {
                                                            int i38 = eVar4.I - i34;
                                                            if (i35 < i38) {
                                                                eVar4.J[i35] = i33;
                                                                while (true) {
                                                                    i6 = i37 + 1;
                                                                    eVar4.a(bVar, i6);
                                                                    int i39 = eVar4.g.a[i37] & 255;
                                                                    int[] iArr4 = eVar4.J;
                                                                    i7 = iArr4[i35] + i39;
                                                                    iArr4[i35] = i7;
                                                                    if (i39 != 255) {
                                                                        break;
                                                                    }
                                                                    i37 = i6;
                                                                }
                                                                i36 += i7;
                                                                i35++;
                                                                i37 = i6;
                                                                i33 = 0;
                                                                i34 = 1;
                                                            } else {
                                                                eVar4.J[i38] = ((i28 - eVar4.L) - i37) - i36;
                                                            }
                                                        }
                                                    } else {
                                                        if (i29 != 3) {
                                                            throw new r(m.a("Unexpected lacing value: ", i29));
                                                        }
                                                        int i40 = 0;
                                                        int i41 = 0;
                                                        int i42 = 4;
                                                        while (true) {
                                                            int i43 = eVar4.I - 1;
                                                            if (i40 < i43) {
                                                                eVar4.J[i40] = 0;
                                                                int i44 = i42 + 1;
                                                                eVar4.a(bVar, i44);
                                                                if (eVar4.g.a[i42] == 0) {
                                                                    throw new r("No valid varint length mask found");
                                                                }
                                                                int i45 = 0;
                                                                while (true) {
                                                                    if (i45 < i16) {
                                                                        c = c2;
                                                                        int i46 = 1 << (7 - i45);
                                                                        if ((eVar4.g.a[i42] & i46) != 0) {
                                                                            int i47 = i44 + i45;
                                                                            eVar4.a(bVar, i47);
                                                                            i5 = i16;
                                                                            int i48 = i45;
                                                                            j2 = (~i46) & eVar4.g.a[i42] & 255;
                                                                            while (i44 < i47) {
                                                                                j2 = (j2 << i5) | (eVar4.g.a[i44] & 255);
                                                                                i44++;
                                                                            }
                                                                            if (i40 > 0) {
                                                                                j2 -= (1 << ((i48 * 7) + 6)) - 1;
                                                                            }
                                                                            i42 = i47;
                                                                        } else {
                                                                            i45++;
                                                                            c2 = c;
                                                                        }
                                                                    } else {
                                                                        c = c2;
                                                                        i5 = i16;
                                                                        i42 = i44;
                                                                        j2 = j;
                                                                    }
                                                                }
                                                                if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                                    int i49 = (int) j2;
                                                                    int[] iArr5 = eVar4.J;
                                                                    if (i40 != 0) {
                                                                        i49 += iArr5[i40 - 1];
                                                                    }
                                                                    iArr5[i40] = i49;
                                                                    i41 += i49;
                                                                    i40++;
                                                                    c2 = c;
                                                                    i16 = i5;
                                                                }
                                                            } else {
                                                                i4 = i16;
                                                                eVar4.J[i43] = ((i28 - eVar4.L) - i42) - i41;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i3 = 2;
                                            eVar4.J = iArr3;
                                            if (i29 != i3) {
                                            }
                                        } else {
                                            throw new r("Lacing only supported in SimpleBlocks.");
                                        }
                                        i4 = 8;
                                        byte[] bArr3 = eVar4.g.a;
                                        eVar4.F = eVar4.a((bArr3[1] & 255) | (bArr3[0] << 8)) + eVar4.A;
                                        byte b3 = eVar4.g.a[2];
                                        eVar4.M = ((dVar6.c == 2 || (i27 == 163 && (b3 & 128) == 128)) ? 1 : 0) | ((b3 & 8) == i4 ? Integer.MIN_VALUE : 0);
                                        eVar4.E = 2;
                                        eVar4.H = 0;
                                        i2 = 163;
                                    } else {
                                        i2 = 163;
                                    }
                                    if (i27 == i2) {
                                        while (true) {
                                            int i50 = eVar4.H;
                                            if (i50 < eVar4.I) {
                                                eVar4.a(bVar, dVar6, eVar4.J[i50]);
                                                eVar4.a(dVar6, eVar4.F + ((eVar4.H * dVar6.d) / 1000));
                                                eVar4.H++;
                                            } else {
                                                z2 = false;
                                                eVar4.E = 0;
                                            }
                                        }
                                    } else {
                                        z2 = false;
                                        eVar4.a(bVar, dVar6, eVar4.J[0]);
                                    }
                                    bVar2.e = z2 ? 1 : 0;
                                }
                            } else if (i27 == 16981) {
                                z3 = false;
                                byte[] bArr4 = new byte[i28];
                                eVar4.t.f = bArr4;
                                bVar.b(bArr4, 0, i28, false);
                            } else if (i27 == 18402) {
                                z3 = false;
                                byte[] bArr5 = new byte[i28];
                                eVar4.t.g = bArr5;
                                bVar.b(bArr5, 0, i28, false);
                            } else if (i27 == 21419) {
                                z3 = false;
                                Arrays.fill(eVar4.i.a, (byte) 0);
                                bVar.b(eVar4.i.a, 4 - i28, i28, false);
                                eVar4.i.e(0);
                                eVar4.v = (int) eVar4.i.k();
                            } else if (i27 == 25506) {
                                z3 = false;
                                byte[] bArr6 = new byte[i28];
                                eVar4.t.h = bArr6;
                                bVar.b(bArr6, 0, i28, false);
                            } else if (i27 == 30322) {
                                byte[] bArr7 = new byte[i28];
                                eVar4.t.o = bArr7;
                                z3 = false;
                                bVar.b(bArr7, 0, i28, false);
                            } else {
                                eVar4.getClass();
                                throw new r(m.a("Unexpected id: ", i27));
                            }
                            z2 = z3;
                            bVar2.e = z2 ? 1 : 0;
                        } else if (i == 5) {
                            long j11 = bVar2.g;
                            if (j11 != 4 && j11 != 8) {
                                throw new r("Invalid float size: " + bVar2.g);
                            }
                            c cVar6 = bVar2.d;
                            int i51 = bVar2.f;
                            int i52 = (int) j11;
                            bVar.b(bVar2.a, 0, i52, false);
                            long j12 = j;
                            int i53 = 0;
                            while (i53 < i52) {
                                j12 = (j12 << 8) | (bVar2.a[i53] & b2);
                                i53++;
                                b2 = 255;
                            }
                            if (i52 == 4) {
                                longBitsToDouble = Float.intBitsToFloat((int) j12);
                            } else {
                                longBitsToDouble = Double.longBitsToDouble(j12);
                            }
                            e eVar5 = cVar6.a;
                            if (i51 == 181) {
                                eVar5.t.I = (int) longBitsToDouble;
                            } else if (i51 != 17545) {
                                switch (i51) {
                                    case 21969:
                                        eVar5.t.w = (float) longBitsToDouble;
                                        break;
                                    case 21970:
                                        eVar5.t.x = (float) longBitsToDouble;
                                        break;
                                    case 21971:
                                        eVar5.t.y = (float) longBitsToDouble;
                                        break;
                                    case 21972:
                                        eVar5.t.z = (float) longBitsToDouble;
                                        break;
                                    case 21973:
                                        eVar5.t.A = (float) longBitsToDouble;
                                        break;
                                    case 21974:
                                        eVar5.t.B = (float) longBitsToDouble;
                                        break;
                                    case 21975:
                                        eVar5.t.C = (float) longBitsToDouble;
                                        break;
                                    case 21976:
                                        eVar5.t.D = (float) longBitsToDouble;
                                        break;
                                    case 21977:
                                        eVar5.t.E = (float) longBitsToDouble;
                                        break;
                                    case 21978:
                                        eVar5.t.F = (float) longBitsToDouble;
                                        break;
                                    default:
                                        eVar5.getClass();
                                        break;
                                }
                            } else {
                                eVar5.r = (long) longBitsToDouble;
                            }
                            z2 = false;
                            bVar2.e = 0;
                        } else {
                            throw new r(m.a("Invalid element type ", i));
                        }
                    } else {
                        long j13 = bVar.c;
                        bVar2.b.add(new a(bVar2.f, bVar2.g + j13));
                        c cVar7 = bVar2.d;
                        int i54 = bVar2.f;
                        long j14 = bVar2.g;
                        e eVar6 = cVar7.a;
                        eVar6.getClass();
                        if (i54 == 160) {
                            z2 = false;
                            eVar6.X = false;
                        } else if (i54 == 174) {
                            z2 = false;
                            eVar6.t = new d();
                        } else if (i54 != 187) {
                            if (i54 == 19899) {
                                eVar6.v = -1;
                                eVar6.w = -1L;
                            } else if (i54 == 20533) {
                                eVar6.t.e = true;
                            } else if (i54 == 21968) {
                                eVar6.t.q = true;
                            } else if (i54 == 408125543) {
                                long j15 = eVar6.p;
                                if (j15 != -1 && j15 != j13) {
                                    throw new r("Multiple Segment elements not supported");
                                }
                                eVar6.p = j13;
                                eVar6.o = j14;
                            } else if (i54 != 475249515) {
                                if (i54 == 524531317 && !eVar6.u) {
                                    if (eVar6.d && eVar6.y != -1) {
                                        eVar6.x = true;
                                    } else {
                                        eVar6.Y.a(new p(eVar6.s));
                                        eVar6.u = true;
                                    }
                                }
                            } else {
                                eVar6.B = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                                eVar6.C = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                            }
                            z2 = false;
                        } else {
                            z2 = false;
                            eVar6.D = false;
                        }
                        bVar2.e = z2 ? 1 : 0;
                    }
                }
            }
            if (z6) {
                long j16 = bVar.c;
                if (this.x) {
                    this.z = j16;
                    oVar.a = this.y;
                    this.x = z2;
                    return 1;
                }
                if (this.u) {
                    long j17 = this.z;
                    if (j17 != -1) {
                        oVar.a = j17;
                        this.z = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            z5 = false;
        }
        int i55 = z5 ? 1 : 0;
        if (z6) {
            return i55;
        }
        return -1;
    }

    public final void a(d dVar, long j) {
        byte[] b;
        if ("S_TEXT/UTF8".equals(dVar.a)) {
            byte[] bArr = this.k.a;
            long j2 = this.G;
            if (j2 == C.TIME_UNSET) {
                b = a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (i * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i2);
                b = z.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * r5)) / 1000))));
            }
            System.arraycopy(b, 0, bArr, 19, 12);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
            n nVar = this.k;
            rVar.a(nVar.c, nVar);
            this.V += this.k.c;
        }
        dVar.O.a(j, this.M, this.V, 0, dVar.g);
        this.W = true;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar2 = this.j;
        nVar2.b = 0;
        nVar2.c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i) {
        n nVar = this.g;
        if (nVar.c >= i) {
            return;
        }
        if (nVar.a() < i) {
            n nVar2 = this.g;
            byte[] bArr = nVar2.a;
            byte[] copyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i));
            int i2 = this.g.c;
            nVar2.a = copyOf;
            nVar2.c = i2;
            nVar2.b = 0;
        }
        n nVar3 = this.g;
        byte[] bArr2 = nVar3.a;
        int i3 = nVar3.c;
        bVar.b(bArr2, i3, i - i3, false);
        this.g.d(i);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, d dVar, int i) {
        int a;
        int a2;
        int i2;
        if ("S_TEXT/UTF8".equals(dVar.a)) {
            byte[] bArr = Z;
            int i3 = i + 32;
            if (this.k.a() < i3) {
                this.k.a = Arrays.copyOf(bArr, i3 + i);
            }
            bVar.b(this.k.a, 32, i, false);
            this.k.e(0);
            this.k.d(i3);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
        if (!this.O) {
            if (dVar.e) {
                this.M &= -1073741825;
                if (!this.P) {
                    bVar.b(this.g.a, 0, 1, false);
                    this.N++;
                    byte b = this.g.a[0];
                    if ((b & 128) != 128) {
                        this.S = b;
                        this.P = true;
                    } else {
                        throw new r("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.S;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        bVar.b(this.l.a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        n nVar = this.g;
                        nVar.a[0] = (byte) ((z ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.g);
                        this.V++;
                        this.l.e(0);
                        rVar.a(8, this.l);
                        this.V += 8;
                    }
                    if (z) {
                        if (!this.R) {
                            bVar.b(this.g.a, 0, 1, false);
                            this.N++;
                            this.g.e(0);
                            this.T = this.g.j();
                            this.R = true;
                        }
                        int i4 = this.T * 4;
                        this.g.c(i4);
                        bVar.b(this.g.a, 0, i4, false);
                        this.N += i4;
                        short s = (short) ((this.T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.n = ByteBuffer.allocate(i5);
                        }
                        this.n.position(0);
                        this.n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.T;
                            if (i6 >= i2) {
                                break;
                            }
                            int m = this.g.m();
                            if (i6 % 2 == 0) {
                                this.n.putShort((short) (m - i7));
                            } else {
                                this.n.putInt(m - i7);
                            }
                            i6++;
                            i7 = m;
                        }
                        int i8 = (i - this.N) - i7;
                        if (i2 % 2 == 1) {
                            this.n.putInt(i8);
                        } else {
                            this.n.putShort((short) i8);
                            this.n.putInt(0);
                        }
                        n nVar2 = this.m;
                        nVar2.a = this.n.array();
                        nVar2.c = i5;
                        nVar2.b = 0;
                        rVar.a(i5, this.m);
                        this.V += i5;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f;
                if (bArr2 != null) {
                    n nVar3 = this.j;
                    int length = bArr2.length;
                    nVar3.a = bArr2;
                    nVar3.c = length;
                    nVar3.b = 0;
                }
            }
            this.O = true;
        }
        int i9 = i + this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.a) && !"V_MPEGH/ISO/HEVC".equals(dVar.a)) {
            while (true) {
                int i10 = this.N;
                if (i10 >= i9) {
                    break;
                }
                int i11 = i9 - i10;
                n nVar4 = this.j;
                int i12 = nVar4.c - nVar4.b;
                if (i12 > 0) {
                    a2 = Math.min(i11, i12);
                    rVar.a(a2, this.j);
                } else {
                    a2 = rVar.a(bVar, i11, false);
                }
                this.N += a2;
                this.V += a2;
            }
        } else {
            byte[] bArr3 = this.f.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = dVar.P;
            int i14 = 4 - i13;
            while (this.N < i9) {
                int i15 = this.U;
                if (i15 == 0) {
                    n nVar5 = this.j;
                    int min = Math.min(i13, nVar5.c - nVar5.b);
                    bVar.b(bArr3, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.j.a(bArr3, i14, min);
                    }
                    this.N += i13;
                    this.f.e(0);
                    this.U = this.f.m();
                    this.e.e(0);
                    rVar.a(4, this.e);
                    this.V += 4;
                } else {
                    n nVar6 = this.j;
                    int i16 = nVar6.c - nVar6.b;
                    if (i16 > 0) {
                        a = Math.min(i15, i16);
                        rVar.a(a, this.j);
                    } else {
                        a = rVar.a(bVar, i15, false);
                    }
                    this.N += a;
                    this.V += a;
                    this.U = i15 - a;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.a)) {
            this.h.e(0);
            rVar.a(4, this.h);
            this.V += 4;
        }
    }

    public final long a(long j) {
        long j2 = this.q;
        if (j2 != C.TIME_UNSET) {
            return z.a(j, j2, 1000L);
        }
        throw new r("Can't scale timecode prior to timecodeScale being set.");
    }
}
