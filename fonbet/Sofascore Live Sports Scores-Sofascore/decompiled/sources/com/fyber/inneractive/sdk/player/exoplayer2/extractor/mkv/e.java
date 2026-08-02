package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

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
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.lnb;
import defpackage.pvd;
import defpackage.vxd;
import defpackage.zzl;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:387:0x0660, code lost:
    
        defpackage.zzl.t("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0667, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0806, code lost:
    
        if (r6 != 7) goto L414;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0594  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.b] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) {
        boolean z;
        long j;
        int i;
        boolean z2;
        ?? r11;
        int i2;
        String str;
        b bVar2;
        int i3;
        int i4;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        long j2;
        int i9;
        int i10;
        boolean z3;
        long j3;
        int i11;
        int a;
        q pVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar;
        int i12;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar2;
        int i13 = 0;
        this.W = false;
        boolean z4 = true;
        while (z4 && !this.W) {
            b bVar3 = this.a;
            if (bVar3.d == null) {
                int i14 = i13;
                zzl.s();
                return i14;
            }
            while (true) {
                if (bVar3.b.isEmpty() || bVar.c < ((a) bVar3.b.peek()).b) {
                    int i15 = bVar3.e;
                    int i16 = 8;
                    int i17 = 4;
                    if (i15 == 0) {
                        ?? r13 = 0;
                        j = 0;
                        long a2 = bVar3.c.a(bVar, true, false, 4);
                        if (a2 == -2) {
                            bVar.e = 0;
                            while (true) {
                                bVar.a(bVar3.a, r13, 4, r13);
                                byte b = bVar3.a[r13];
                                int i18 = 0;
                                while (true) {
                                    long[] jArr = g.d;
                                    if (i18 >= 8) {
                                        i11 = -1;
                                    } else if ((jArr[i18] & b) != 0) {
                                        i11 = i18 + 1;
                                    } else {
                                        i18++;
                                    }
                                }
                                if (i11 != -1 && i11 <= 4) {
                                    a = (int) g.a(bVar3.a, i11, false);
                                    bVar3.d.a.getClass();
                                    if (a == 357149030 || a == 524531317 || a == 475249515 || a == 374648427) {
                                    }
                                }
                                bVar.a(1);
                                r13 = 0;
                            }
                            bVar.a(i11);
                            j3 = a;
                        } else {
                            j3 = a2;
                        }
                        z = true;
                        if (j3 == -1) {
                            z4 = false;
                        } else {
                            bVar3.f = (int) j3;
                            bVar3.e = 1;
                            i15 = 1;
                        }
                    } else {
                        z = true;
                        j = 0;
                    }
                    if (i15 == z) {
                        bVar3.g = bVar3.c.a(bVar, false, z, 8);
                        bVar3.e = 2;
                    }
                    c cVar = bVar3.d;
                    int i19 = bVar3.f;
                    cVar.a.getClass();
                    switch (i19) {
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
                    if (i != 0) {
                        if (i == 1) {
                            long j4 = bVar.c;
                            bVar3.b.add(new a(bVar3.f, bVar3.g + j4));
                            c cVar2 = bVar3.d;
                            int i20 = bVar3.f;
                            long j5 = bVar3.g;
                            e eVar = cVar2.a;
                            eVar.getClass();
                            if (i20 == 160) {
                                z2 = false;
                                eVar.X = false;
                            } else if (i20 == 174) {
                                z2 = false;
                                eVar.t = new d();
                            } else if (i20 != 187) {
                                if (i20 == 19899) {
                                    eVar.v = -1;
                                    eVar.w = -1L;
                                } else if (i20 == 20533) {
                                    eVar.t.e = true;
                                } else if (i20 == 21968) {
                                    eVar.t.q = true;
                                } else if (i20 == 408125543) {
                                    long j6 = eVar.p;
                                    if (j6 != -1 && j6 != j4) {
                                        zzl.t("Multiple Segment elements not supported");
                                        return 0;
                                    }
                                    eVar.p = j4;
                                    eVar.o = j5;
                                } else if (i20 == 475249515) {
                                    eVar.B = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                                    eVar.C = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                                } else if (i20 == 524531317 && !eVar.u) {
                                    if (!eVar.d || eVar.y == -1) {
                                        eVar.Y.a(new p(eVar.s));
                                        eVar.u = true;
                                    } else {
                                        eVar.x = true;
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                                eVar.D = false;
                            }
                            bVar3.e = z2 ? 1 : 0;
                        } else if (i == 2) {
                            long j7 = bVar3.g;
                            if (j7 > 8) {
                                throw new r("Invalid integer size: " + bVar3.g);
                            }
                            c cVar3 = bVar3.d;
                            int i21 = bVar3.f;
                            int i22 = (int) j7;
                            bVar.b(bVar3.a, 0, i22, false);
                            long j8 = j;
                            for (int i23 = 0; i23 < i22; i23++) {
                                j8 = (j8 << 8) | (bVar3.a[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            }
                            e eVar2 = cVar3.a;
                            eVar2.getClass();
                            if (i21 != 20529) {
                                if (i21 != 20530) {
                                    switch (i21) {
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                            eVar2.t.c = (int) j8;
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            eVar2.t.L = j8 == 1;
                                            break;
                                        case 155:
                                            eVar2.G = eVar2.a(j8);
                                            break;
                                        case 159:
                                            eVar2.t.G = (int) j8;
                                            break;
                                        case 176:
                                            eVar2.t.j = (int) j8;
                                            break;
                                        case 179:
                                            eVar2.B.a(eVar2.a(j8));
                                            break;
                                        case 186:
                                            eVar2.t.k = (int) j8;
                                            break;
                                        case AD_RESPONSE_EMPTY_VALUE:
                                            eVar2.t.b = (int) j8;
                                            break;
                                        case 231:
                                            eVar2.A = eVar2.a(j8);
                                            break;
                                        case 241:
                                            if (!eVar2.D) {
                                                eVar2.C.a(j8);
                                                eVar2.D = true;
                                                break;
                                            }
                                            break;
                                        case 251:
                                            eVar2.X = true;
                                            break;
                                        case 16980:
                                            i2 = 0;
                                            if (j8 != 3) {
                                                zzl.t(vxd.m("ContentCompAlgo ", j8, " not supported"));
                                                return 0;
                                            }
                                            r11 = i2;
                                            break;
                                        case 17029:
                                            if (j8 < 1 || j8 > 2) {
                                                zzl.t(vxd.m("DocTypeReadVersion ", j8, " not supported"));
                                                return 0;
                                            }
                                            break;
                                        case 17143:
                                            i2 = 0;
                                            if (j8 != 1) {
                                                zzl.t(vxd.m("EBMLReadVersion ", j8, " not supported"));
                                                return 0;
                                            }
                                            r11 = i2;
                                            break;
                                        case 18401:
                                            i2 = 0;
                                            if (j8 != 5) {
                                                zzl.t(vxd.m("ContentEncAlgo ", j8, " not supported"));
                                                return 0;
                                            }
                                            r11 = i2;
                                            break;
                                        case 18408:
                                            if (j8 != 1) {
                                                zzl.t(vxd.m("AESSettingsCipherMode ", j8, " not supported"));
                                                return 0;
                                            }
                                            break;
                                        case 21420:
                                            eVar2.w = j8 + eVar2.p;
                                            break;
                                        case 21432:
                                            int i24 = (int) j8;
                                            if (i24 != 0) {
                                                if (i24 != 1) {
                                                    if (i24 != 3) {
                                                        if (i24 == 15) {
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
                                                eVar2.t.p = 0;
                                                r11 = 0;
                                                break;
                                            }
                                            break;
                                        case 21680:
                                            eVar2.t.l = (int) j8;
                                            break;
                                        case 21682:
                                            eVar2.t.n = (int) j8;
                                            break;
                                        case 21690:
                                            eVar2.t.m = (int) j8;
                                            break;
                                        case 21930:
                                            eVar2.t.M = j8 == 1;
                                            break;
                                        case 22186:
                                            eVar2.t.J = j8;
                                            break;
                                        case 22203:
                                            eVar2.t.K = j8;
                                            break;
                                        case 25188:
                                            eVar2.t.H = (int) j8;
                                            break;
                                        case 2352003:
                                            eVar2.t.d = (int) j8;
                                            break;
                                        case 2807729:
                                            eVar2.q = j8;
                                            break;
                                        default:
                                            switch (i21) {
                                                case 21945:
                                                    int i25 = (int) j8;
                                                    if (i25 != 1) {
                                                        if (i25 == 2) {
                                                            eVar2.t.t = 1;
                                                            break;
                                                        }
                                                    } else {
                                                        eVar2.t.t = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 21946:
                                                    int i26 = (int) j8;
                                                    if (i26 != 1) {
                                                        if (i26 == 16) {
                                                            eVar2.t.s = 6;
                                                            break;
                                                        } else if (i26 == 18) {
                                                            eVar2.t.s = 7;
                                                            break;
                                                        } else if (i26 != 6) {
                                                        }
                                                    }
                                                    eVar2.t.s = 3;
                                                    break;
                                                case 21947:
                                                    d dVar = eVar2.t;
                                                    dVar.q = true;
                                                    int i27 = (int) j8;
                                                    if (i27 != 1) {
                                                        if (i27 != 9) {
                                                            if (i27 == 4 || i27 == 5 || i27 == 6 || i27 == 7) {
                                                                dVar.r = 2;
                                                                break;
                                                            }
                                                        } else {
                                                            dVar.r = 6;
                                                            break;
                                                        }
                                                    } else {
                                                        dVar.r = 1;
                                                        break;
                                                    }
                                                case 21948:
                                                    eVar2.t.u = (int) j8;
                                                    break;
                                                case 21949:
                                                    eVar2.t.v = (int) j8;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (j8 != 1) {
                                    zzl.t(vxd.m("ContentEncodingScope ", j8, " not supported"));
                                    return 0;
                                }
                                r11 = 0;
                            } else {
                                r11 = 0;
                                if (j8 != j) {
                                    zzl.t(vxd.m("ContentEncodingOrder ", j8, " not supported"));
                                    return 0;
                                }
                            }
                            bVar3.e = r11;
                            z2 = r11;
                        } else if (i == 3) {
                            long j9 = bVar3.g;
                            if (j9 > 2147483647L) {
                                throw new r("String element size: " + bVar3.g);
                            }
                            c cVar4 = bVar3.d;
                            int i28 = bVar3.f;
                            int i29 = (int) j9;
                            if (i29 == 0) {
                                str = "";
                            } else {
                                byte[] bArr = new byte[i29];
                                bVar.b(bArr, 0, i29, false);
                                str = new String(bArr);
                            }
                            e eVar3 = cVar4.a;
                            eVar3.getClass();
                            if (i28 != 134) {
                                if (i28 != 17026) {
                                    if (i28 == 2274716) {
                                        eVar3.t.N = str;
                                    }
                                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    zzl.t(lnb.o("DocType ", str, " not supported"));
                                    return 0;
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                                eVar3.t.a = str;
                            }
                            bVar3.e = z2 ? 1 : 0;
                        } else if (i == 4) {
                            c cVar5 = bVar3.d;
                            int i30 = bVar3.f;
                            int i31 = (int) bVar3.g;
                            e eVar4 = cVar5.a;
                            if (i30 == 161 || i30 == 163) {
                                if (eVar4.E == 0) {
                                    bVar2 = bVar3;
                                    eVar4.K = (int) eVar4.b.a(bVar, false, true, 8);
                                    eVar4.L = eVar4.b.c;
                                    eVar4.G = C.TIME_UNSET;
                                    eVar4.E = 1;
                                    n nVar = eVar4.g;
                                    nVar.b = 0;
                                    nVar.c = 0;
                                } else {
                                    bVar2 = bVar3;
                                }
                                d dVar2 = (d) eVar4.c.get(eVar4.K);
                                if (dVar2 == null) {
                                    bVar.a(i31 - eVar4.L);
                                    eVar4.E = 0;
                                    z2 = false;
                                } else {
                                    if (eVar4.E == 1) {
                                        eVar4.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, 3);
                                        int i32 = (eVar4.g.a[2] & 6) >> 1;
                                        if (i32 == 0) {
                                            eVar4.I = 1;
                                            int[] iArr = eVar4.J;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else if (iArr.length < 1) {
                                                iArr = new int[Math.max(iArr.length * 2, 1)];
                                            }
                                            eVar4.J = iArr;
                                            iArr[0] = (i31 - eVar4.L) - 3;
                                        } else {
                                            if (i30 != 163) {
                                                zzl.t("Lacing only supported in SimpleBlocks.");
                                                return 0;
                                            }
                                            eVar4.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, 4);
                                            int i33 = (eVar4.g.a[3] & 255) + 1;
                                            eVar4.I = i33;
                                            int[] iArr2 = eVar4.J;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i33];
                                            } else if (iArr2.length < i33) {
                                                i4 = 2;
                                                iArr2 = new int[Math.max(iArr2.length * 2, i33)];
                                                eVar4.J = iArr2;
                                                if (i32 != i4) {
                                                    int i34 = (i31 - eVar4.L) - 4;
                                                    int i35 = eVar4.I;
                                                    Arrays.fill(iArr2, 0, i35, i34 / i35);
                                                    i5 = 8;
                                                    c = 0;
                                                } else {
                                                    int i36 = 0;
                                                    int i37 = 1;
                                                    if (i32 == 1) {
                                                        int i38 = 0;
                                                        int i39 = 0;
                                                        while (true) {
                                                            int i40 = eVar4.I - i37;
                                                            int[] iArr3 = eVar4.J;
                                                            if (i38 < i40) {
                                                                iArr3[i38] = i36;
                                                                while (true) {
                                                                    i9 = i17 + 1;
                                                                    eVar4.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, i9);
                                                                    int i41 = eVar4.g.a[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                                    int[] iArr4 = eVar4.J;
                                                                    i10 = iArr4[i38] + i41;
                                                                    iArr4[i38] = i10;
                                                                    if (i41 != 255) {
                                                                        break;
                                                                    }
                                                                    i17 = i9;
                                                                }
                                                                i39 += i10;
                                                                i38++;
                                                                i17 = i9;
                                                                i36 = 0;
                                                                i37 = 1;
                                                            } else {
                                                                iArr3[i40] = ((i31 - eVar4.L) - i17) - i39;
                                                            }
                                                        }
                                                    } else {
                                                        if (i32 != 3) {
                                                            zzl.t(m.a("Unexpected lacing value: ", i32));
                                                            return 0;
                                                        }
                                                        int i42 = 0;
                                                        int i43 = 0;
                                                        while (true) {
                                                            int i44 = eVar4.I - 1;
                                                            int[] iArr5 = eVar4.J;
                                                            if (i42 < i44) {
                                                                iArr5[i42] = 0;
                                                                int i45 = i17 + 1;
                                                                eVar4.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, i45);
                                                                if (eVar4.g.a[i17] == 0) {
                                                                    zzl.t("No valid varint length mask found");
                                                                    return 0;
                                                                }
                                                                int i46 = 0;
                                                                while (true) {
                                                                    if (i46 < i16) {
                                                                        int i47 = 1 << (7 - i46);
                                                                        if ((eVar4.g.a[i17] & i47) != 0) {
                                                                            i8 = i45 + i46;
                                                                            eVar4.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, i8);
                                                                            i7 = i16;
                                                                            j2 = eVar4.g.a[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED & (~i47);
                                                                            while (i45 < i8) {
                                                                                j2 = (j2 << i7) | (eVar4.g.a[i45] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                                                                i42 = i42;
                                                                                i45++;
                                                                            }
                                                                            i6 = i42;
                                                                            if (i6 > 0) {
                                                                                j2 -= (1 << ((i46 * 7) + 6)) - 1;
                                                                            }
                                                                        } else {
                                                                            i46++;
                                                                        }
                                                                    } else {
                                                                        i6 = i42;
                                                                        i7 = i16;
                                                                        i8 = i45;
                                                                        j2 = j;
                                                                    }
                                                                }
                                                                if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                                    int i48 = (int) j2;
                                                                    int[] iArr6 = eVar4.J;
                                                                    if (i6 != 0) {
                                                                        i48 += iArr6[i6 - 1];
                                                                    }
                                                                    iArr6[i6] = i48;
                                                                    i43 += i48;
                                                                    i42 = i6 + 1;
                                                                    i17 = i8;
                                                                    i16 = i7;
                                                                }
                                                            } else {
                                                                i5 = i16;
                                                                c = 0;
                                                                iArr5[i44] = ((i31 - eVar4.L) - i17) - i43;
                                                            }
                                                        }
                                                    }
                                                }
                                                byte[] bArr2 = eVar4.g.a;
                                                eVar4.F = eVar4.a((bArr2[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr2[c] << 8)) + eVar4.A;
                                                byte b2 = eVar4.g.a[2];
                                                eVar4.M = ((dVar2.c != 2 || (i30 == 163 && (b2 & 128) == 128)) ? 1 : 0) | ((b2 & 8) == i5 ? Integer.MIN_VALUE : 0);
                                                eVar4.E = 2;
                                                eVar4.H = 0;
                                                i3 = 163;
                                            }
                                            i4 = 2;
                                            eVar4.J = iArr2;
                                            if (i32 != i4) {
                                            }
                                            byte[] bArr22 = eVar4.g.a;
                                            eVar4.F = eVar4.a((bArr22[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr22[c] << 8)) + eVar4.A;
                                            byte b22 = eVar4.g.a[2];
                                            if ((b22 & 8) == i5) {
                                            }
                                            eVar4.M = ((dVar2.c != 2 || (i30 == 163 && (b22 & 128) == 128)) ? 1 : 0) | ((b22 & 8) == i5 ? Integer.MIN_VALUE : 0);
                                            eVar4.E = 2;
                                            eVar4.H = 0;
                                            i3 = 163;
                                        }
                                        i5 = 8;
                                        c = 0;
                                        byte[] bArr222 = eVar4.g.a;
                                        eVar4.F = eVar4.a((bArr222[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr222[c] << 8)) + eVar4.A;
                                        byte b222 = eVar4.g.a[2];
                                        if ((b222 & 8) == i5) {
                                        }
                                        eVar4.M = ((dVar2.c != 2 || (i30 == 163 && (b222 & 128) == 128)) ? 1 : 0) | ((b222 & 8) == i5 ? Integer.MIN_VALUE : 0);
                                        eVar4.E = 2;
                                        eVar4.H = 0;
                                        i3 = 163;
                                    } else {
                                        i3 = 163;
                                    }
                                    if (i30 == i3) {
                                        while (true) {
                                            int i49 = eVar4.H;
                                            if (i49 < eVar4.I) {
                                                eVar4.a(bVar, dVar2, eVar4.J[i49]);
                                                eVar4.a(dVar2, eVar4.F + ((eVar4.H * dVar2.d) / 1000));
                                                eVar4.H++;
                                            } else {
                                                z2 = false;
                                                eVar4.E = 0;
                                            }
                                        }
                                    } else {
                                        z2 = false;
                                        eVar4.a(bVar, dVar2, eVar4.J[0]);
                                    }
                                }
                                bVar3 = bVar2;
                            } else {
                                if (i30 == 16981) {
                                    z3 = false;
                                    byte[] bArr3 = new byte[i31];
                                    eVar4.t.f = bArr3;
                                    bVar.b(bArr3, 0, i31, false);
                                } else if (i30 == 18402) {
                                    z3 = false;
                                    byte[] bArr4 = new byte[i31];
                                    eVar4.t.g = bArr4;
                                    bVar.b(bArr4, 0, i31, false);
                                } else if (i30 == 21419) {
                                    z3 = false;
                                    Arrays.fill(eVar4.i.a, (byte) 0);
                                    bVar.b(eVar4.i.a, 4 - i31, i31, false);
                                    eVar4.i.e(0);
                                    eVar4.v = (int) eVar4.i.k();
                                } else if (i30 == 25506) {
                                    z3 = false;
                                    byte[] bArr5 = new byte[i31];
                                    eVar4.t.h = bArr5;
                                    bVar.b(bArr5, 0, i31, false);
                                } else {
                                    if (i30 != 30322) {
                                        eVar4.getClass();
                                        zzl.t(m.a("Unexpected id: ", i30));
                                        return 0;
                                    }
                                    byte[] bArr6 = new byte[i31];
                                    eVar4.t.o = bArr6;
                                    z3 = false;
                                    bVar.b(bArr6, 0, i31, false);
                                }
                                z2 = z3;
                            }
                            bVar3.e = z2 ? 1 : 0;
                        } else {
                            if (i != 5) {
                                zzl.t(m.a("Invalid element type ", i));
                                return 0;
                            }
                            long j10 = bVar3.g;
                            if (j10 != 4 && j10 != 8) {
                                throw new r("Invalid float size: " + bVar3.g);
                            }
                            c cVar6 = bVar3.d;
                            int i50 = bVar3.f;
                            int i51 = (int) j10;
                            bVar.b(bVar3.a, 0, i51, false);
                            long j11 = j;
                            for (int i52 = 0; i52 < i51; i52++) {
                                j11 = (j11 << 8) | (bVar3.a[i52] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            }
                            double intBitsToFloat = i51 == 4 ? Float.intBitsToFloat((int) j11) : Double.longBitsToDouble(j11);
                            e eVar5 = cVar6.a;
                            if (i50 == 181) {
                                eVar5.t.I = (int) intBitsToFloat;
                            } else if (i50 != 17545) {
                                switch (i50) {
                                    case 21969:
                                        eVar5.t.w = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        eVar5.t.x = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        eVar5.t.y = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        eVar5.t.z = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        eVar5.t.A = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        eVar5.t.B = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        eVar5.t.C = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        eVar5.t.D = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        eVar5.t.E = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        eVar5.t.F = (float) intBitsToFloat;
                                        break;
                                    default:
                                        eVar5.getClass();
                                        break;
                                }
                            } else {
                                eVar5.r = (long) intBitsToFloat;
                            }
                            z2 = false;
                            bVar3.e = 0;
                        }
                        z4 = true;
                    } else {
                        bVar.a((int) bVar3.g);
                        bVar3.e = 0;
                        i13 = 0;
                    }
                } else {
                    c cVar7 = bVar3.d;
                    int i53 = ((a) bVar3.b.pop()).a;
                    e eVar6 = cVar7.a;
                    if (i53 == 160) {
                        int i54 = i13;
                        if (eVar6.E == 2) {
                            if (!eVar6.X) {
                                eVar6.M |= 1;
                            }
                            eVar6.a((d) eVar6.c.get(eVar6.K), eVar6.F);
                            eVar6.E = i54;
                        }
                    } else if (i53 == 174) {
                        String str2 = eVar6.t.a;
                        if ("V_VP8".equals(str2) || "V_VP9".equals(str2) || "V_MPEG2".equals(str2) || "V_MPEG4/ISO/SP".equals(str2) || "V_MPEG4/ISO/ASP".equals(str2) || "V_MPEG4/ISO/AP".equals(str2) || "V_MPEG4/ISO/AVC".equals(str2) || "V_MPEGH/ISO/HEVC".equals(str2) || "V_MS/VFW/FOURCC".equals(str2) || "V_THEORA".equals(str2) || "A_OPUS".equals(str2) || "A_VORBIS".equals(str2) || "A_AAC".equals(str2) || "A_MPEG/L2".equals(str2) || "A_MPEG/L3".equals(str2) || "A_AC3".equals(str2) || "A_EAC3".equals(str2) || "A_TRUEHD".equals(str2) || "A_DTS".equals(str2) || "A_DTS/EXPRESS".equals(str2) || "A_DTS/LOSSLESS".equals(str2) || "A_FLAC".equals(str2) || "A_MS/ACM".equals(str2) || "A_PCM/INT/LIT".equals(str2) || "S_TEXT/UTF8".equals(str2) || "S_VOBSUB".equals(str2) || "S_HDMV/PGS".equals(str2) || "S_DVBSUB".equals(str2)) {
                            d dVar3 = eVar6.t;
                            dVar3.a(eVar6.Y, dVar3.b);
                            SparseArray sparseArray = eVar6.c;
                            d dVar4 = eVar6.t;
                            sparseArray.put(dVar4.b, dVar4);
                        }
                        eVar6.t = null;
                    } else {
                        if (i53 == 19899) {
                            int i55 = i13;
                            int i56 = eVar6.v;
                            if (i56 != -1) {
                                long j12 = eVar6.w;
                                if (j12 != -1) {
                                    if (i56 == 475249515) {
                                        eVar6.y = j12;
                                    }
                                }
                            }
                            zzl.t("Mandatory element SeekID or SeekPosition not found");
                            return i55;
                        }
                        if (i53 == 25152) {
                            int i57 = i13;
                            d dVar5 = eVar6.t;
                            if (dVar5.e) {
                                byte[] bArr7 = dVar5.g;
                                if (bArr7 == null) {
                                    zzl.t("Encrypted Track found but ContentEncKeyID was not found");
                                    return i57;
                                }
                                dVar5.i = new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(true, new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(com.fyber.inneractive.sdk.player.exoplayer2.b.b, "video/webm", bArr7));
                            }
                        } else if (i53 == 28032) {
                            int i58 = i13;
                            d dVar6 = eVar6.t;
                            if (dVar6.e && dVar6.f != null) {
                                zzl.t("Combining encryption and compression is not supported");
                                return i58;
                            }
                        } else if (i53 == 357149030) {
                            if (eVar6.q == C.TIME_UNSET) {
                                eVar6.q = 1000000L;
                            }
                            long j13 = eVar6.r;
                            if (j13 != C.TIME_UNSET) {
                                eVar6.s = eVar6.a(j13);
                            }
                        } else if (i53 == 374648427) {
                            int i59 = i13;
                            if (eVar6.c.size() == 0) {
                                zzl.t("No valid tracks were found");
                                return i59;
                            }
                            eVar6.Y.b();
                        } else if (i53 != 475249515) {
                            eVar6.getClass();
                        } else if (!eVar6.u) {
                            j jVar = eVar6.Y;
                            if (eVar6.p == -1 || eVar6.s == C.TIME_UNSET || (gVar = eVar6.B) == null || (i12 = gVar.a) == 0 || (gVar2 = eVar6.C) == null || gVar2.a != i12) {
                                eVar6.B = null;
                                eVar6.C = null;
                                pVar = new p(eVar6.s);
                            } else {
                                int[] iArr7 = new int[i12];
                                long[] jArr2 = new long[i12];
                                long[] jArr3 = new long[i12];
                                long[] jArr4 = new long[i12];
                                int i60 = i13;
                                while (i60 < i12) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar3 = eVar6.B;
                                    int i61 = i13;
                                    if (i60 < 0) {
                                        gVar3.getClass();
                                    } else if (i60 < gVar3.a) {
                                        jArr4[i60] = gVar3.b[i60];
                                        int i62 = i12;
                                        long j14 = eVar6.p;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar4 = eVar6.C;
                                        if (i60 < 0) {
                                            gVar4.getClass();
                                        } else if (i60 < gVar4.a) {
                                            jArr2[i60] = gVar4.b[i60] + j14;
                                            i60++;
                                            i12 = i62;
                                            i13 = i61;
                                        }
                                        pvd.m(gVar4.a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i60, ", size is "));
                                        return i61;
                                    }
                                    pvd.m(gVar3.a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i60, ", size is "));
                                    return i61;
                                }
                                int i63 = i12;
                                while (true) {
                                    int i64 = i63 - 1;
                                    if (i13 < i64) {
                                        int i65 = i13 + 1;
                                        iArr7[i13] = (int) (jArr2[i65] - jArr2[i13]);
                                        jArr3[i13] = jArr4[i65] - jArr4[i13];
                                        i13 = i65;
                                    } else {
                                        iArr7[i64] = (int) ((eVar6.p + eVar6.o) - jArr2[i64]);
                                        jArr3[i64] = eVar6.s - jArr4[i64];
                                        eVar6.B = null;
                                        eVar6.C = null;
                                        pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr7, jArr2, jArr3, jArr4);
                                    }
                                }
                            }
                            jVar.a(pVar);
                            eVar6.u = true;
                        }
                    }
                    z4 = true;
                }
            }
            z2 = false;
            if (z4) {
                long j15 = bVar.c;
                if (this.x) {
                    this.z = j15;
                    oVar.a = this.y;
                    this.x = z2;
                    return 1;
                }
                if (this.u) {
                    long j16 = this.z;
                    if (j16 != -1) {
                        oVar.a = j16;
                        this.z = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            i13 = 0;
        }
        int i66 = i13;
        if (z4) {
            return i66;
        }
        return -1;
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
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
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
                k = ((k << 8) & (-256)) | (fVar.a.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
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
                        zzl.t("Extension bit is set in signal byte");
                        return;
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
                            int i8 = i6 % 2;
                            ByteBuffer byteBuffer2 = this.n;
                            if (i8 == 0) {
                                byteBuffer2.putShort((short) (m - i7));
                            } else {
                                byteBuffer2.putInt(m - i7);
                            }
                            i6++;
                            i7 = m;
                        }
                        int i9 = (i - this.N) - i7;
                        int i10 = i2 % 2;
                        ByteBuffer byteBuffer3 = this.n;
                        if (i10 == 1) {
                            byteBuffer3.putInt(i9);
                        } else {
                            byteBuffer3.putShort((short) i9);
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
        int i11 = i + this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.a) && !"V_MPEGH/ISO/HEVC".equals(dVar.a)) {
            while (true) {
                int i12 = this.N;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i11 - i12;
                n nVar4 = this.j;
                int i14 = nVar4.c - nVar4.b;
                if (i14 > 0) {
                    a2 = Math.min(i13, i14);
                    rVar.a(a2, this.j);
                } else {
                    a2 = rVar.a(bVar, i13, false);
                }
                this.N += a2;
                this.V += a2;
            }
        } else {
            byte[] bArr3 = this.f.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = dVar.P;
            int i16 = 4 - i15;
            while (this.N < i11) {
                int i17 = this.U;
                n nVar5 = this.j;
                if (i17 == 0) {
                    int min = Math.min(i15, nVar5.c - nVar5.b);
                    bVar.b(bArr3, i16 + min, i15 - min, false);
                    if (min > 0) {
                        this.j.a(bArr3, i16, min);
                    }
                    this.N += i15;
                    this.f.e(0);
                    this.U = this.f.m();
                    this.e.e(0);
                    rVar.a(4, this.e);
                    this.V += 4;
                } else {
                    int i18 = nVar5.c - nVar5.b;
                    if (i18 > 0) {
                        a = Math.min(i17, i18);
                        rVar.a(a, this.j);
                    } else {
                        a = rVar.a(bVar, i17, false);
                    }
                    this.N += a;
                    this.V += a;
                    this.U = i17 - a;
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
        zzl.t("Can't scale timecode prior to timecodeScale being set.");
        return 0L;
    }
}
