package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d0c implements ll6 {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final vo4 a;
    public int a0;
    public final nkk b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final xli f;
    public boolean f0;
    public final j9e g;
    public int g0;
    public final j9e h;
    public byte h0;
    public final j9e i;
    public boolean i0;
    public final j9e j;
    public pl6 j0;
    public final j9e k;
    public final j9e l;
    public final j9e m;
    public final j9e n;
    public final j9e o;
    public final j9e p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public b0c y;
    public boolean z;

    static {
        String str = nik.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        ljg.s(0, 90, "htc_video_rotA-000", "htc_video_rotA-090", hashMap);
        ljg.s(180, 270, "htc_video_rotA-180", "htc_video_rotA-270", hashMap);
        p0 = Collections.unmodifiableMap(hashMap);
    }

    public d0c(xli xliVar, int i) {
        vo4 vo4Var = new vo4(1);
        this.s = -1L;
        this.t = C.TIME_UNSET;
        this.u = C.TIME_UNSET;
        this.v = C.TIME_UNSET;
        this.E = C.TIME_UNSET;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = C.TIME_UNSET;
        this.a = vo4Var;
        vo4Var.g = new by9(this);
        this.f = xliVar;
        this.C = new SparseArray();
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new nkk(1, false);
        this.c = new SparseArray();
        this.i = new j9e(4);
        this.j = new j9e(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new j9e(4);
        this.g = new j9e(kik.l);
        this.h = new j9e(4);
        this.l = new j9e();
        this.m = new j9e();
        this.n = new j9e(8);
        this.o = new j9e();
        this.p = new j9e();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] i(long j, long j2, String str) {
        z1a.s(j != C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = nik.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        yz1 yz1Var = new yz1(13);
        j9e j9eVar = (j9e) yz1Var.c;
        bp4 bp4Var = (bp4) nl6Var;
        long j = bp4Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        bp4Var.peekFully(j9eVar.a, 0, 4, false);
        long C = j9eVar.C();
        yz1Var.b = 4;
        while (true) {
            if (C != 440786851) {
                int i2 = yz1Var.b + 1;
                yz1Var.b = i2;
                if (i2 == i) {
                    break;
                }
                bp4Var.peekFully(j9eVar.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (j9eVar.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            } else {
                long e = yz1Var.e(bp4Var);
                long j3 = yz1Var.b;
                if (e != Long.MIN_VALUE && (j == -1 || j3 + e < j)) {
                    while (true) {
                        long j4 = yz1Var.b;
                        long j5 = j3 + e;
                        if (j4 < j5) {
                            if (yz1Var.e(bp4Var) != Long.MIN_VALUE) {
                                long e2 = yz1Var.e(bp4Var);
                                if (e2 < 0 || e2 > 2147483647L) {
                                    break;
                                }
                                if (e2 != 0) {
                                    int i3 = (int) e2;
                                    bp4Var.c(i3, false);
                                    yz1Var.b += i3;
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
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0a6f, code lost:
    
        if (r0.u() == r4.getLeastSignificantBits()) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0d97, code lost:
    
        r5 = true;
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0cb7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v171 */
    /* JADX WARN: Type inference failed for: r6v172, types: [int] */
    /* JADX WARN: Type inference failed for: r6v174 */
    /* JADX WARN: Type inference failed for: r6v175, types: [int] */
    /* JADX WARN: Type inference failed for: r6v179 */
    /* JADX WARN: Type inference failed for: r6v180, types: [int] */
    /* JADX WARN: Type inference failed for: r6v185 */
    /* JADX WARN: Type inference failed for: r6v186 */
    /* JADX WARN: Type inference failed for: r6v187 */
    /* JADX WARN: Type inference failed for: r8v1, types: [nkk] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.util.SparseArray] */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        boolean z;
        int i;
        boolean z2;
        String str;
        int i2;
        int b;
        nl6 nl6Var2;
        boolean z3;
        nl6 nl6Var3;
        boolean z4;
        char c;
        int i3;
        List list;
        int E;
        int i4;
        List list2;
        int i5;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        List list3;
        int i6;
        String str3;
        int i7;
        List list4;
        int i8;
        List z5;
        int i9;
        List list5;
        List list6;
        qm8 qm8Var;
        boolean k;
        int i10;
        w13 w13Var;
        int i11;
        byte[] bArr;
        int i12;
        String str4;
        f79 b2;
        int i13;
        List list7;
        long j;
        int i14;
        long j2;
        long j3;
        long j4;
        ric a;
        d0c d0cVar = this;
        boolean z6 = false;
        d0cVar.N = false;
        boolean z7 = true;
        boolean z8 = true;
        while (z8 && !d0cVar.N) {
            vo4 vo4Var = d0cVar.a;
            ?? r8 = (nkk) vo4Var.f;
            ArrayDeque arrayDeque = vo4Var.b;
            ((by9) vo4Var.g).getClass();
            ?? r4 = z7;
            while (true) {
                uo4 uo4Var = (uo4) arrayDeque.peek();
                if (uo4Var == null || nl6Var.getPosition() < uo4Var.b) {
                    ?? r42 = z6;
                    int i15 = vo4Var.c;
                    nl6 nl6Var4 = nl6Var;
                    if (i15 == 0) {
                        int i16 = 4;
                        long z9 = r8.z(nl6Var4, true, r42, 4);
                        if (z9 == -2) {
                            byte[] bArr2 = vo4Var.a;
                            nl6Var4.resetPeekPosition();
                            int i17 = r42;
                            while (true) {
                                nl6Var4.peekFully(bArr2, i17, i16);
                                byte b3 = bArr2[i17];
                                int i18 = 0;
                                while (true) {
                                    long[] jArr = nkk.e;
                                    if (i18 >= 8) {
                                        i2 = -1;
                                    } else if ((jArr[i18] & b3) != 0) {
                                        i2 = i18 + 1;
                                    } else {
                                        i18++;
                                    }
                                }
                                if (i2 != -1 && i2 <= 4) {
                                    b = (int) nkk.b(bArr2, i2, false);
                                    Object obj = ((by9) vo4Var.g).a;
                                    if (b == 357149030 || b == 524531317 || b == 475249515 || b == 374648427) {
                                    }
                                }
                                nl6Var4.skipFully(1);
                                i16 = 4;
                                i17 = 0;
                            }
                            nl6Var4.skipFully(i2);
                            z9 = b;
                        }
                        z = true;
                        if (z9 == -1) {
                            z8 = false;
                            z2 = false;
                            nl6Var2 = nl6Var4;
                        } else {
                            vo4Var.d = (int) z9;
                            vo4Var.c = 1;
                            i15 = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (i15 == z) {
                        vo4Var.e = r8.z(nl6Var4, false, z, 8);
                        vo4Var.c = 2;
                    }
                    by9 by9Var = (by9) vo4Var.g;
                    int i19 = vo4Var.d;
                    Object obj2 = by9Var.a;
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
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
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
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
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
                        case 165:
                        case 16877:
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
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        nl6Var4.skipFully((int) vo4Var.e);
                        vo4Var.c = 0;
                        z6 = false;
                        r4 = 1;
                    } else if (i == 1) {
                        long position = nl6Var4.getPosition();
                        arrayDeque.push(new uo4(vo4Var.d, vo4Var.e + position));
                        ((by9) vo4Var.g).C(vo4Var.d, position, vo4Var.e);
                        z2 = false;
                        vo4Var.c = 0;
                        nl6Var3 = nl6Var4;
                    } else if (i == 2) {
                        long j5 = vo4Var.e;
                        if (j5 > 8) {
                            throw s9e.a(null, "Invalid integer size: " + vo4Var.e);
                        }
                        by9Var.k(i19, vo4Var.b(nl6Var4, (int) j5));
                        z2 = false;
                        vo4Var.c = 0;
                        nl6Var3 = nl6Var4;
                    } else if (i == 3) {
                        z2 = false;
                        long j6 = vo4Var.e;
                        if (j6 > 2147483647L) {
                            throw s9e.a(null, "String element size: " + vo4Var.e);
                        }
                        int i20 = (int) j6;
                        if (i20 == 0) {
                            str = "";
                        } else {
                            byte[] bArr3 = new byte[i20];
                            nl6Var4.readFully(bArr3, 0, i20);
                            while (i20 > 0 && bArr3[i20 - 1] == 0) {
                                i20--;
                            }
                            z2 = false;
                            str = new String(bArr3, 0, i20);
                        }
                        by9Var.D(i19, str);
                        vo4Var.c = z2 ? 1 : 0;
                        nl6Var3 = nl6Var4;
                    } else if (i == 4) {
                        by9Var.g(i19, (int) vo4Var.e, nl6Var4);
                        z2 = false;
                        vo4Var.c = 0;
                        nl6Var3 = nl6Var4;
                    } else {
                        if (i != 5) {
                            throw s9e.a(null, "Invalid element type " + i);
                        }
                        long j7 = vo4Var.e;
                        if (j7 != 4 && j7 != 8) {
                            throw s9e.a(null, "Invalid float size: " + vo4Var.e);
                        }
                        int i21 = (int) j7;
                        double intBitsToFloat = i21 == 4 ? Float.intBitsToFloat((int) r4) : Double.longBitsToDouble(vo4Var.b(nl6Var4, i21));
                        d0c d0cVar2 = (d0c) by9Var.a;
                        if (i19 == 181) {
                            d0cVar2.g(i19);
                            d0cVar2.y.S = (int) intBitsToFloat;
                        } else if (i19 != 17545) {
                            switch (i19) {
                                case 21969:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.F = (float) intBitsToFloat;
                                    break;
                                case 21970:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.G = (float) intBitsToFloat;
                                    break;
                                case 21971:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.H = (float) intBitsToFloat;
                                    break;
                                case 21972:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.I = (float) intBitsToFloat;
                                    break;
                                case 21973:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.J = (float) intBitsToFloat;
                                    break;
                                case 21974:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.K = (float) intBitsToFloat;
                                    break;
                                case 21975:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.L = (float) intBitsToFloat;
                                    break;
                                case 21976:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.M = (float) intBitsToFloat;
                                    break;
                                case 21977:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.N = (float) intBitsToFloat;
                                    break;
                                case 21978:
                                    d0cVar2.g(i19);
                                    d0cVar2.y.O = (float) intBitsToFloat;
                                    break;
                                default:
                                    switch (i19) {
                                        case 30323:
                                            d0cVar2.g(i19);
                                            d0cVar2.y.u = (float) intBitsToFloat;
                                            break;
                                        case 30324:
                                            d0cVar2.g(i19);
                                            d0cVar2.y.v = (float) intBitsToFloat;
                                            break;
                                        case 30325:
                                            d0cVar2.g(i19);
                                            d0cVar2.y.w = (float) intBitsToFloat;
                                            break;
                                    }
                            }
                        } else {
                            d0cVar2.u = (long) intBitsToFloat;
                        }
                        z2 = false;
                        vo4Var.c = 0;
                        nl6Var3 = nl6Var4;
                    }
                } else {
                    by9 by9Var2 = (by9) vo4Var.g;
                    int i22 = ((uo4) arrayDeque.pop()).a;
                    d0c d0cVar3 = (d0c) by9Var2.a;
                    ?? r82 = d0cVar3.C;
                    ?? r9 = d0cVar3.c;
                    d0cVar3.j0.getClass();
                    if (i22 != 160) {
                        if (i22 == 174) {
                            b0c b0cVar = d0cVar3.y;
                            b0cVar.getClass();
                            String str5 = b0cVar.c;
                            if (str5 == null) {
                                throw s9e.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str5) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i23 = b0cVar.d;
                                    switch (str5.hashCode()) {
                                        case -2095576542:
                                            if (str5.equals("V_MPEG4/ISO/AP")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2095575984:
                                            if (str5.equals("V_MPEG4/ISO/SP")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1985379776:
                                            if (str5.equals("A_MS/ACM")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1784763192:
                                            if (str5.equals("A_TRUEHD")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1730367663:
                                            if (str5.equals("A_VORBIS")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1482641358:
                                            if (str5.equals("A_MPEG/L2")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1482641357:
                                            if (str5.equals("A_MPEG/L3")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1373388978:
                                            if (str5.equals("V_MS/VFW/FOURCC")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -933872740:
                                            if (str5.equals("S_DVBSUB")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -538363189:
                                            if (str5.equals("V_MPEG4/ISO/ASP")) {
                                                c = '\t';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -538363109:
                                            if (str5.equals("V_MPEG4/ISO/AVC")) {
                                                c = '\n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -425012669:
                                            if (str5.equals("S_VOBSUB")) {
                                                c = 11;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -356037306:
                                            if (str5.equals("A_DTS/LOSSLESS")) {
                                                c = '\f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62923557:
                                            if (str5.equals("A_AAC")) {
                                                c = '\r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62923603:
                                            if (str5.equals("A_AC3")) {
                                                c = 14;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62927045:
                                            if (str5.equals("A_DTS")) {
                                                c = 15;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82318131:
                                            if (str5.equals("V_AV1")) {
                                                c = 16;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82338133:
                                            if (str5.equals("V_VP8")) {
                                                c = 17;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82338134:
                                            if (str5.equals("V_VP9")) {
                                                c = 18;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 99146302:
                                            if (str5.equals("S_HDMV/PGS")) {
                                                c = 19;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 444813526:
                                            if (str5.equals("V_THEORA")) {
                                                c = 20;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 542569478:
                                            if (str5.equals("A_DTS/EXPRESS")) {
                                                c = 21;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 635596514:
                                            if (str5.equals("A_PCM/FLOAT/IEEE")) {
                                                c = 22;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 725948237:
                                            if (str5.equals("A_PCM/INT/BIG")) {
                                                c = 23;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 725957860:
                                            if (str5.equals("A_PCM/INT/LIT")) {
                                                c = 24;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 738597099:
                                            if (str5.equals("S_TEXT/ASS")) {
                                                c = 25;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 738614379:
                                            if (str5.equals("S_TEXT/SSA")) {
                                                c = 26;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 855502857:
                                            if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                                c = 27;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1045209816:
                                            if (str5.equals("S_TEXT/WEBVTT")) {
                                                c = 28;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1422270023:
                                            if (str5.equals("S_TEXT/UTF8")) {
                                                c = 29;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1809237540:
                                            if (str5.equals("V_MPEG2")) {
                                                c = 30;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950749482:
                                            if (str5.equals("A_EAC3")) {
                                                c = 31;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950789798:
                                            if (str5.equals("A_FLAC")) {
                                                c = ' ';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1951062397:
                                            if (str5.equals("A_OPUS")) {
                                                c = '!';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    String str6 = MimeTypes.VIDEO_UNKNOWN;
                                    switch (c) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            i3 = i23;
                                            byte[] bArr4 = b0cVar.l;
                                            List singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str6 = MimeTypes.VIDEO_MP4V;
                                            list = singletonList;
                                            E = -1;
                                            i4 = -1;
                                            list2 = list;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null && (b2 = f79.b(new j9e(b0cVar.P))) != null) {
                                                str2 = b2.b;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i24 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map = p0;
                                            if (k) {
                                                qm8Var.F = b0cVar.Q;
                                                qm8Var.G = b0cVar.S;
                                                qm8Var.H = E;
                                            } else if (sjc.o(str6)) {
                                                if (b0cVar.s == 0) {
                                                    int i25 = b0cVar.q;
                                                    i10 = -1;
                                                    if (i25 == -1) {
                                                        i25 = b0cVar.n;
                                                    }
                                                    b0cVar.q = i25;
                                                    int i26 = b0cVar.r;
                                                    if (i26 == -1) {
                                                        i26 = b0cVar.o;
                                                    }
                                                    b0cVar.r = i26;
                                                } else {
                                                    i10 = -1;
                                                }
                                                float f = (b0cVar.q == i10 || (i12 = b0cVar.r) == i10) ? -1.0f : (b0cVar.o * r0) / (b0cVar.n * i12);
                                                if (b0cVar.z) {
                                                    if (b0cVar.F == -1.0f || b0cVar.G == -1.0f || b0cVar.H == -1.0f || b0cVar.I == -1.0f || b0cVar.J == -1.0f || b0cVar.K == -1.0f || b0cVar.L == -1.0f || b0cVar.M == -1.0f || b0cVar.N == -1.0f || b0cVar.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((b0cVar.F * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((b0cVar.G * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((b0cVar.H * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((b0cVar.I * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((b0cVar.J * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((b0cVar.K * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((b0cVar.L * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((b0cVar.M * 50000.0f) + 0.5f));
                                                        order.putShort((short) (b0cVar.N + 0.5f));
                                                        order.putShort((short) (b0cVar.O + 0.5f));
                                                        order.putShort((short) b0cVar.D);
                                                        order.putShort((short) b0cVar.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i27 = b0cVar.A;
                                                    int i28 = b0cVar.C;
                                                    int i29 = b0cVar.B;
                                                    int i30 = b0cVar.p;
                                                    w13Var = new w13(i27, i28, i29, i30, i30, bArr);
                                                } else {
                                                    w13Var = null;
                                                }
                                                String str7 = b0cVar.b;
                                                int intValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(b0cVar.b)).intValue();
                                                if (b0cVar.t == 0 && Float.compare(b0cVar.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(b0cVar.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                    if (Float.compare(b0cVar.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        i11 = 0;
                                                    } else if (Float.compare(b0cVar.w, 90.0f) == 0) {
                                                        i11 = 90;
                                                    } else if (Float.compare(b0cVar.w, -180.0f) == 0 || Float.compare(b0cVar.w, 180.0f) == 0) {
                                                        i11 = 180;
                                                    } else if (Float.compare(b0cVar.w, -90.0f) == 0) {
                                                        i11 = 270;
                                                    }
                                                    qm8Var.u = b0cVar.n;
                                                    qm8Var.v = b0cVar.o;
                                                    qm8Var.A = f;
                                                    qm8Var.z = i11;
                                                    qm8Var.B = b0cVar.x;
                                                    qm8Var.C = b0cVar.y;
                                                    qm8Var.D = w13Var;
                                                }
                                                i11 = intValue;
                                                qm8Var.u = b0cVar.n;
                                                qm8Var.v = b0cVar.o;
                                                qm8Var.A = f;
                                                qm8Var.z = i11;
                                                qm8Var.B = b0cVar.x;
                                                qm8Var.C = b0cVar.y;
                                                qm8Var.D = w13Var;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str6) && !MimeTypes.TEXT_SSA.equals(str6) && !MimeTypes.TEXT_VTT.equals(str6) && !MimeTypes.APPLICATION_VOBSUB.equals(str6) && !MimeTypes.APPLICATION_PGS.equals(str6) && !MimeTypes.APPLICATION_DVBSUBS.equals(str6)) {
                                                throw s9e.a(null, "Unexpected MIME type.");
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                qm8Var.b = b0cVar.b;
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 2:
                                            i3 = i23;
                                            j9e j9eVar = new j9e(b0cVar.a(b0cVar.c));
                                            try {
                                                int t = j9eVar.t();
                                                if (t != 1) {
                                                    if (t == 65534) {
                                                        j9eVar.N(24);
                                                        long u = j9eVar.u();
                                                        UUID uuid = o0;
                                                        if (u == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    tgj.d0("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str6 = MimeTypes.AUDIO_UNKNOWN;
                                                    E = -1;
                                                    i4 = -1;
                                                    list2 = null;
                                                    str2 = null;
                                                    list6 = list2;
                                                    if (b0cVar.P != null) {
                                                        str2 = b2.b;
                                                        str6 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i242 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                    qm8Var = new qm8();
                                                    k = sjc.k(str6);
                                                    Map map2 = p0;
                                                    if (k) {
                                                    }
                                                    str4 = b0cVar.b;
                                                    if (str4 != null) {
                                                        qm8Var.b = b0cVar.b;
                                                        break;
                                                    }
                                                    qm8Var.a = Integer.toString(i3);
                                                    qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                    qm8Var.n = sjc.p(str6);
                                                    qm8Var.o = i4;
                                                    qm8Var.d = b0cVar.Z;
                                                    qm8Var.e = i242;
                                                    qm8Var.q = list6;
                                                    qm8Var.j = str2;
                                                    qm8Var.r = b0cVar.m;
                                                    b0cVar.b0 = new b(qm8Var);
                                                    b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                    r9.put(b0cVar.d, b0cVar);
                                                }
                                                int i31 = b0cVar.R;
                                                String str8 = nik.a;
                                                E = nik.E(i31, ByteOrder.LITTLE_ENDIAN);
                                                if (E == 0) {
                                                    tgj.d0("Unsupported PCM bit depth: " + b0cVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str6 = MimeTypes.AUDIO_UNKNOWN;
                                                    E = -1;
                                                    i4 = -1;
                                                    list2 = null;
                                                    str2 = null;
                                                    list6 = list2;
                                                    if (b0cVar.P != null) {
                                                    }
                                                    int i2422 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                    qm8Var = new qm8();
                                                    k = sjc.k(str6);
                                                    Map map22 = p0;
                                                    if (k) {
                                                    }
                                                    str4 = b0cVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    qm8Var.a = Integer.toString(i3);
                                                    qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                    qm8Var.n = sjc.p(str6);
                                                    qm8Var.o = i4;
                                                    qm8Var.d = b0cVar.Z;
                                                    qm8Var.e = i2422;
                                                    qm8Var.q = list6;
                                                    qm8Var.j = str2;
                                                    qm8Var.r = b0cVar.m;
                                                    b0cVar.b0 = new b(qm8Var);
                                                    b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                    r9.put(b0cVar.d, b0cVar);
                                                }
                                                str6 = MimeTypes.AUDIO_RAW;
                                                i4 = -1;
                                                list2 = null;
                                                str2 = null;
                                                list6 = list2;
                                                if (b0cVar.P != null) {
                                                }
                                                int i24222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                qm8Var = new qm8();
                                                k = sjc.k(str6);
                                                Map map222 = p0;
                                                if (k) {
                                                }
                                                str4 = b0cVar.b;
                                                if (str4 != null) {
                                                }
                                                qm8Var.a = Integer.toString(i3);
                                                qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                qm8Var.n = sjc.p(str6);
                                                qm8Var.o = i4;
                                                qm8Var.d = b0cVar.Z;
                                                qm8Var.e = i24222;
                                                qm8Var.q = list6;
                                                qm8Var.j = str2;
                                                qm8Var.r = b0cVar.m;
                                                b0cVar.b0 = new b(qm8Var);
                                                b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                r9.put(b0cVar.d, b0cVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw s9e.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            i3 = i23;
                                            b0cVar.V = new s1k(1);
                                            str6 = MimeTypes.AUDIO_TRUEHD;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 4:
                                            ?? r1 = i23;
                                            byte[] a2 = b0cVar.a(str5);
                                            try {
                                                try {
                                                    if (a2[0] != 2) {
                                                        throw s9e.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i32 = 0;
                                                    int i33 = 1;
                                                    int i34 = r1;
                                                    while (true) {
                                                        i3 = i34;
                                                        int i35 = a2[i33] & 255;
                                                        if (i35 == 255) {
                                                            i32 += 255;
                                                            i33++;
                                                            i34 = i3;
                                                        } else {
                                                            int i36 = i32 + i35;
                                                            int i37 = i33 + 1;
                                                            int i38 = 0;
                                                            while (true) {
                                                                int i39 = a2[i37] & 255;
                                                                if (i39 == 255) {
                                                                    i38 += 255;
                                                                    i37++;
                                                                } else {
                                                                    int i40 = i37 + 1;
                                                                    int i41 = i38 + i39;
                                                                    if (a2[i40] != 1) {
                                                                        throw s9e.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i36];
                                                                    System.arraycopy(a2, i40, bArr6, 0, i36);
                                                                    int i42 = i40 + i36;
                                                                    if (a2[i42] != 3) {
                                                                        throw s9e.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i43 = i42 + i41;
                                                                    if (a2[i43] != 5) {
                                                                        throw s9e.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[a2.length - i43];
                                                                    System.arraycopy(a2, i43, bArr7, 0, a2.length - i43);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str6 = MimeTypes.AUDIO_VORBIS;
                                                                    i4 = 8192;
                                                                    list2 = arrayList;
                                                                    E = -1;
                                                                    str2 = null;
                                                                    list6 = list2;
                                                                    if (b0cVar.P != null) {
                                                                    }
                                                                    int i2422222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                                    qm8Var = new qm8();
                                                                    k = sjc.k(str6);
                                                                    Map map22222 = p0;
                                                                    if (k) {
                                                                    }
                                                                    str4 = b0cVar.b;
                                                                    if (str4 != null) {
                                                                    }
                                                                    qm8Var.a = Integer.toString(i3);
                                                                    qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                                    qm8Var.n = sjc.p(str6);
                                                                    qm8Var.o = i4;
                                                                    qm8Var.d = b0cVar.Z;
                                                                    qm8Var.e = i2422222;
                                                                    qm8Var.q = list6;
                                                                    qm8Var.j = str2;
                                                                    qm8Var.r = b0cVar.m;
                                                                    b0cVar.b0 = new b(qm8Var);
                                                                    b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                                    r9.put(b0cVar.d, b0cVar);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw s9e.a(r1, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r1 = 0;
                                            }
                                            break;
                                        case 5:
                                            i5 = i23;
                                            str6 = MimeTypes.AUDIO_MPEG_L2;
                                            i3 = i5;
                                            E = -1;
                                            i4 = 4096;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i24222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 6:
                                            i5 = i23;
                                            str6 = MimeTypes.AUDIO_MPEG;
                                            i3 = i5;
                                            E = -1;
                                            i4 = 4096;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 7:
                                            j9e j9eVar2 = new j9e(b0cVar.a(b0cVar.c));
                                            try {
                                                j9eVar2.O(16);
                                                long r = j9eVar2.r();
                                                if (r == 1482049860) {
                                                    runtimeException = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw s9e.a(runtimeException, "Error parsing FourCC private data");
                                                    }
                                                } else if (r == 859189832) {
                                                    pair = new Pair(MimeTypes.VIDEO_H263, null);
                                                } else {
                                                    if (r == 826496599) {
                                                        byte[] bArr8 = j9eVar2.a;
                                                        for (int i44 = j9eVar2.b + 20; i44 < bArr8.length - 4; i44++) {
                                                            if (bArr8[i44] == 0 && bArr8[i44 + 1] == 0 && bArr8[i44 + 2] == 1) {
                                                                if (bArr8[i44 + 3] == 15) {
                                                                    pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr8, i44, bArr8.length)));
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            throw s9e.a(null, "Failed to find FourCC VC1 initialization data");
                                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                                            runtimeException = null;
                                                            throw s9e.a(runtimeException, "Error parsing FourCC private data");
                                                        }
                                                    }
                                                    tgj.d0("Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str2 = null;
                                                    pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                                                    str6 = (String) pair.first;
                                                    i3 = i23;
                                                    list3 = (List) pair.second;
                                                    E = -1;
                                                    list4 = list3;
                                                    i4 = -1;
                                                    list6 = list4;
                                                    if (b0cVar.P != null) {
                                                    }
                                                    int i2422222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                    qm8Var = new qm8();
                                                    k = sjc.k(str6);
                                                    Map map22222222 = p0;
                                                    if (k) {
                                                    }
                                                    str4 = b0cVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    qm8Var.a = Integer.toString(i3);
                                                    qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                    qm8Var.n = sjc.p(str6);
                                                    qm8Var.o = i4;
                                                    qm8Var.d = b0cVar.Z;
                                                    qm8Var.e = i2422222222;
                                                    qm8Var.q = list6;
                                                    qm8Var.j = str2;
                                                    qm8Var.r = b0cVar.m;
                                                    b0cVar.b0 = new b(qm8Var);
                                                    b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                    r9.put(b0cVar.d, b0cVar);
                                                }
                                                str2 = null;
                                                str6 = (String) pair.first;
                                                i3 = i23;
                                                list3 = (List) pair.second;
                                                E = -1;
                                                list4 = list3;
                                                i4 = -1;
                                                list6 = list4;
                                                if (b0cVar.P != null) {
                                                }
                                                int i24222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                qm8Var = new qm8();
                                                k = sjc.k(str6);
                                                Map map222222222 = p0;
                                                if (k) {
                                                }
                                                str4 = b0cVar.b;
                                                if (str4 != null) {
                                                }
                                                qm8Var.a = Integer.toString(i3);
                                                qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                qm8Var.n = sjc.p(str6);
                                                qm8Var.o = i4;
                                                qm8Var.d = b0cVar.Z;
                                                qm8Var.e = i24222222222;
                                                qm8Var.q = list6;
                                                qm8Var.j = str2;
                                                qm8Var.r = b0cVar.m;
                                                b0cVar.b0 = new b(qm8Var);
                                                b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                r9.put(b0cVar.d, b0cVar);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case '\b':
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(b0cVar.a(str5), 0, bArr9, 0, 4);
                                            list = hv9.z(bArr9);
                                            i3 = i23;
                                            str6 = MimeTypes.APPLICATION_DVBSUBS;
                                            E = -1;
                                            i4 = -1;
                                            list2 = list;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case '\n':
                                            i6 = i23;
                                            wv0 a3 = wv0.a(new j9e(b0cVar.a(b0cVar.c)));
                                            ArrayList arrayList2 = a3.a;
                                            b0cVar.c0 = a3.b;
                                            str3 = a3.l;
                                            str6 = "video/avc";
                                            list5 = arrayList2;
                                            str2 = str3;
                                            i3 = i6;
                                            list3 = list5;
                                            E = -1;
                                            list4 = list3;
                                            i4 = -1;
                                            list6 = list4;
                                            if (b0cVar.P != null) {
                                            }
                                            int i2422222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map22222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i2422222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 11:
                                            list = hv9.z(b0cVar.a(str5));
                                            i3 = i23;
                                            str6 = MimeTypes.APPLICATION_VOBSUB;
                                            E = -1;
                                            i4 = -1;
                                            list2 = list;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i24222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case '\f':
                                            i7 = i23;
                                            str6 = MimeTypes.AUDIO_DTS_HD;
                                            i3 = i7;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case '\r':
                                            List singletonList2 = Collections.singletonList(b0cVar.a(str5));
                                            byte[] bArr10 = b0cVar.l;
                                            d0 K = lz.K(new nm2(bArr10, bArr10.length, 3, (byte) 0), false);
                                            b0cVar.S = K.a;
                                            b0cVar.Q = K.b;
                                            String str9 = K.c;
                                            str6 = MimeTypes.AUDIO_AAC;
                                            str2 = str9;
                                            list4 = singletonList2;
                                            E = -1;
                                            i3 = i23;
                                            i4 = -1;
                                            list6 = list4;
                                            if (b0cVar.P != null) {
                                            }
                                            int i2422222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map22222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i2422222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 14:
                                            i7 = i23;
                                            str6 = MimeTypes.AUDIO_AC3;
                                            i3 = i7;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i24222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 15:
                                        case 21:
                                            i7 = i23;
                                            b0cVar.W = true;
                                            str6 = MimeTypes.AUDIO_DTS;
                                            i3 = i7;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 16:
                                            i8 = i23;
                                            byte[] bArr11 = b0cVar.l;
                                            z5 = bArr11 == null ? null : hv9.z(bArr11);
                                            str6 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                            list = z5;
                                            i3 = i8;
                                            E = -1;
                                            i4 = -1;
                                            list2 = list;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i2422222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map22222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i2422222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 17:
                                            i7 = i23;
                                            str6 = MimeTypes.VIDEO_VP8;
                                            i3 = i7;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i24222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 18:
                                            i8 = i23;
                                            byte[] bArr12 = b0cVar.l;
                                            z5 = bArr12 == null ? null : hv9.z(bArr12);
                                            str6 = MimeTypes.VIDEO_VP9;
                                            list = z5;
                                            i3 = i8;
                                            E = -1;
                                            i4 = -1;
                                            list2 = list;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 19:
                                            i3 = i23;
                                            str6 = MimeTypes.APPLICATION_PGS;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i2422222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map22222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i2422222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 20:
                                            i3 = i23;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i24222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 22:
                                            i9 = i23;
                                            if (b0cVar.R == 32) {
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_RAW;
                                                E = 4;
                                                i4 = -1;
                                                list2 = null;
                                                str2 = null;
                                                list6 = list2;
                                                if (b0cVar.P != null) {
                                                }
                                                int i242222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                qm8Var = new qm8();
                                                k = sjc.k(str6);
                                                Map map2222222222222222222222 = p0;
                                                if (k) {
                                                }
                                                str4 = b0cVar.b;
                                                if (str4 != null) {
                                                }
                                                qm8Var.a = Integer.toString(i3);
                                                qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                qm8Var.n = sjc.p(str6);
                                                qm8Var.o = i4;
                                                qm8Var.d = b0cVar.Z;
                                                qm8Var.e = i242222222222222222222222;
                                                qm8Var.q = list6;
                                                qm8Var.j = str2;
                                                qm8Var.r = b0cVar.m;
                                                b0cVar.b0 = new b(qm8Var);
                                                b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                r9.put(b0cVar.d, b0cVar);
                                            } else {
                                                tgj.d0("Unsupported floating point PCM bit depth: " + b0cVar.R + ". Setting mimeType to audio/x-unknown");
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_UNKNOWN;
                                                E = -1;
                                                i4 = -1;
                                                list2 = null;
                                                str2 = null;
                                                list6 = list2;
                                                if (b0cVar.P != null) {
                                                }
                                                int i2422222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                qm8Var = new qm8();
                                                k = sjc.k(str6);
                                                Map map22222222222222222222222 = p0;
                                                if (k) {
                                                }
                                                str4 = b0cVar.b;
                                                if (str4 != null) {
                                                }
                                                qm8Var.a = Integer.toString(i3);
                                                qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                qm8Var.n = sjc.p(str6);
                                                qm8Var.o = i4;
                                                qm8Var.d = b0cVar.Z;
                                                qm8Var.e = i2422222222222222222222222;
                                                qm8Var.q = list6;
                                                qm8Var.j = str2;
                                                qm8Var.r = b0cVar.m;
                                                b0cVar.b0 = new b(qm8Var);
                                                b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                r9.put(b0cVar.d, b0cVar);
                                            }
                                            break;
                                        case 23:
                                            i9 = i23;
                                            int i45 = b0cVar.R;
                                            if (i45 == 8) {
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_RAW;
                                                E = 3;
                                                i4 = -1;
                                                list2 = null;
                                                str2 = null;
                                                list6 = list2;
                                                if (b0cVar.P != null) {
                                                }
                                                int i24222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                qm8Var = new qm8();
                                                k = sjc.k(str6);
                                                Map map222222222222222222222222 = p0;
                                                if (k) {
                                                }
                                                str4 = b0cVar.b;
                                                if (str4 != null) {
                                                }
                                                qm8Var.a = Integer.toString(i3);
                                                qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                qm8Var.n = sjc.p(str6);
                                                qm8Var.o = i4;
                                                qm8Var.d = b0cVar.Z;
                                                qm8Var.e = i24222222222222222222222222;
                                                qm8Var.q = list6;
                                                qm8Var.j = str2;
                                                qm8Var.r = b0cVar.m;
                                                b0cVar.b0 = new b(qm8Var);
                                                b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                r9.put(b0cVar.d, b0cVar);
                                            } else {
                                                if (i45 == 16) {
                                                    E = 268435456;
                                                } else if (i45 == 24) {
                                                    E = 1342177280;
                                                } else if (i45 == 32) {
                                                    E = 1610612736;
                                                } else {
                                                    tgj.d0("Unsupported big endian PCM bit depth: " + b0cVar.R + ". Setting mimeType to audio/x-unknown");
                                                    i3 = i9;
                                                    str6 = MimeTypes.AUDIO_UNKNOWN;
                                                    E = -1;
                                                    i4 = -1;
                                                    list2 = null;
                                                    str2 = null;
                                                    list6 = list2;
                                                    if (b0cVar.P != null) {
                                                    }
                                                    int i242222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                    qm8Var = new qm8();
                                                    k = sjc.k(str6);
                                                    Map map2222222222222222222222222 = p0;
                                                    if (k) {
                                                    }
                                                    str4 = b0cVar.b;
                                                    if (str4 != null) {
                                                    }
                                                    qm8Var.a = Integer.toString(i3);
                                                    qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                    qm8Var.n = sjc.p(str6);
                                                    qm8Var.o = i4;
                                                    qm8Var.d = b0cVar.Z;
                                                    qm8Var.e = i242222222222222222222222222;
                                                    qm8Var.q = list6;
                                                    qm8Var.j = str2;
                                                    qm8Var.r = b0cVar.m;
                                                    b0cVar.b0 = new b(qm8Var);
                                                    b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                    r9.put(b0cVar.d, b0cVar);
                                                }
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_RAW;
                                                i4 = -1;
                                                list2 = null;
                                                str2 = null;
                                                list6 = list2;
                                                if (b0cVar.P != null) {
                                                }
                                                int i2422222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                qm8Var = new qm8();
                                                k = sjc.k(str6);
                                                Map map22222222222222222222222222 = p0;
                                                if (k) {
                                                }
                                                str4 = b0cVar.b;
                                                if (str4 != null) {
                                                }
                                                qm8Var.a = Integer.toString(i3);
                                                qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                qm8Var.n = sjc.p(str6);
                                                qm8Var.o = i4;
                                                qm8Var.d = b0cVar.Z;
                                                qm8Var.e = i2422222222222222222222222222;
                                                qm8Var.q = list6;
                                                qm8Var.j = str2;
                                                qm8Var.r = b0cVar.m;
                                                b0cVar.b0 = new b(qm8Var);
                                                b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                r9.put(b0cVar.d, b0cVar);
                                            }
                                            break;
                                        case 24:
                                            i9 = i23;
                                            int i46 = b0cVar.R;
                                            String str10 = nik.a;
                                            E = nik.E(i46, ByteOrder.LITTLE_ENDIAN);
                                            if (E == 0) {
                                                tgj.d0("Unsupported little endian PCM bit depth: " + b0cVar.R + ". Setting mimeType to audio/x-unknown");
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_UNKNOWN;
                                                E = -1;
                                                i4 = -1;
                                                list2 = null;
                                                str2 = null;
                                                list6 = list2;
                                                if (b0cVar.P != null) {
                                                }
                                                int i24222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                                qm8Var = new qm8();
                                                k = sjc.k(str6);
                                                Map map222222222222222222222222222 = p0;
                                                if (k) {
                                                }
                                                str4 = b0cVar.b;
                                                if (str4 != null) {
                                                }
                                                qm8Var.a = Integer.toString(i3);
                                                qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                                qm8Var.n = sjc.p(str6);
                                                qm8Var.o = i4;
                                                qm8Var.d = b0cVar.Z;
                                                qm8Var.e = i24222222222222222222222222222;
                                                qm8Var.q = list6;
                                                qm8Var.j = str2;
                                                qm8Var.r = b0cVar.m;
                                                b0cVar.b0 = new b(qm8Var);
                                                b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                                r9.put(b0cVar.d, b0cVar);
                                            }
                                            i3 = i9;
                                            str6 = MimeTypes.AUDIO_RAW;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 25:
                                        case 26:
                                            list = hv9.A(l0, b0cVar.a(str5));
                                            i3 = i23;
                                            str6 = MimeTypes.TEXT_SSA;
                                            E = -1;
                                            i4 = -1;
                                            list2 = list;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i2422222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map22222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i2422222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 27:
                                            i6 = i23;
                                            v99 a4 = v99.a(new j9e(b0cVar.a(b0cVar.c)), false, null);
                                            List list8 = a4.a;
                                            b0cVar.c0 = a4.b;
                                            str3 = a4.n;
                                            str6 = "video/hevc";
                                            list5 = list8;
                                            str2 = str3;
                                            i3 = i6;
                                            list3 = list5;
                                            E = -1;
                                            list4 = list3;
                                            i4 = -1;
                                            list6 = list4;
                                            if (b0cVar.P != null) {
                                            }
                                            int i24222222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map222222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24222222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 28:
                                            i3 = i23;
                                            str6 = MimeTypes.TEXT_VTT;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 29:
                                            i3 = i23;
                                            str6 = MimeTypes.APPLICATION_SUBRIP;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i2422222222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map22222222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i2422222222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 30:
                                            i7 = i23;
                                            str6 = MimeTypes.VIDEO_MPEG2;
                                            i3 = i7;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i24222222222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map222222222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24222222222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case 31:
                                            i7 = i23;
                                            str6 = MimeTypes.AUDIO_E_AC3;
                                            i3 = i7;
                                            E = -1;
                                            i4 = -1;
                                            list2 = null;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i242222222222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map2222222222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i242222222222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case ' ':
                                            i8 = i23;
                                            z5 = Collections.singletonList(b0cVar.a(str5));
                                            str6 = MimeTypes.AUDIO_FLAC;
                                            list = z5;
                                            i3 = i8;
                                            E = -1;
                                            i4 = -1;
                                            list2 = list;
                                            str2 = null;
                                            list6 = list2;
                                            if (b0cVar.P != null) {
                                            }
                                            int i2422222222222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map22222222222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i2422222222222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        case '!':
                                            ArrayList arrayList3 = new ArrayList(3);
                                            arrayList3.add(b0cVar.a(b0cVar.c));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList3.add(allocate.order(byteOrder).putLong(b0cVar.T).array());
                                            arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(b0cVar.U).array());
                                            str6 = MimeTypes.AUDIO_OPUS;
                                            i3 = i23;
                                            str2 = null;
                                            i4 = 5760;
                                            E = -1;
                                            list6 = arrayList3;
                                            if (b0cVar.P != null) {
                                            }
                                            int i24222222222222222222222222222222222222 = (b0cVar.Y ? 1 : 0) | (b0cVar.X ? 2 : 0);
                                            qm8Var = new qm8();
                                            k = sjc.k(str6);
                                            Map map222222222222222222222222222222222222 = p0;
                                            if (k) {
                                            }
                                            str4 = b0cVar.b;
                                            if (str4 != null) {
                                            }
                                            qm8Var.a = Integer.toString(i3);
                                            qm8Var.m = sjc.p(b0cVar.a ? "video/webm" : "video/x-matroska");
                                            qm8Var.n = sjc.p(str6);
                                            qm8Var.o = i4;
                                            qm8Var.d = b0cVar.Z;
                                            qm8Var.e = i24222222222222222222222222222222222222;
                                            qm8Var.q = list6;
                                            qm8Var.j = str2;
                                            qm8Var.r = b0cVar.m;
                                            b0cVar.b0 = new b(qm8Var);
                                            b0cVar.a0 = d0cVar3.j0.mo2track(b0cVar.d, b0cVar.e);
                                            r9.put(b0cVar.d, b0cVar);
                                            break;
                                        default:
                                            throw s9e.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    d0cVar3.y = null;
                                    break;
                            }
                        } else if (i22 != 183) {
                            if (i22 == 19899) {
                                int i47 = d0cVar3.A;
                                if (i47 != -1) {
                                    long j8 = d0cVar3.B;
                                    if (j8 != -1) {
                                        if (i47 == 475249515) {
                                            d0cVar3.K = j8;
                                        }
                                    }
                                }
                                throw s9e.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i22 == 25152) {
                                d0cVar3.g(i22);
                                b0c b0cVar2 = d0cVar3.y;
                                if (b0cVar2.i) {
                                    tsj tsjVar = b0cVar2.k;
                                    if (tsjVar == null) {
                                        throw s9e.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    b0cVar2.m = new DrmInitData(null, true, new DrmInitData.SchemeData(yc2.a, null, "video/webm", tsjVar.b));
                                }
                            } else if (i22 == 28032) {
                                d0cVar3.g(i22);
                                b0c b0cVar3 = d0cVar3.y;
                                if (b0cVar3.i && b0cVar3.j != null) {
                                    throw s9e.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i22 == 357149030) {
                                if (d0cVar3.t == C.TIME_UNSET) {
                                    d0cVar3.t = 1000000L;
                                }
                                long j9 = d0cVar3.u;
                                if (j9 != C.TIME_UNSET) {
                                    d0cVar3.v = d0cVar3.m(j9);
                                }
                            } else if (i22 == 374648427) {
                                boolean z10 = z6;
                                if (r9.size() == 0) {
                                    throw s9e.a(null, "No valid tracks were found");
                                }
                                boolean z11 = (!d0cVar3.d || d0cVar3.K == -1) ? true : z10 ? 1 : 0;
                                int i48 = -1;
                                int i49 = -1;
                                int i50 = -1;
                                int i51 = -1;
                                for (int i52 = z10 ? 1 : 0; i52 < r9.size(); i52++) {
                                    b0c b0cVar4 = (b0c) r9.valueAt(i52);
                                    int i53 = b0cVar4.e;
                                    if (i53 == 2) {
                                        if (b0cVar4.Y) {
                                            i48 = b0cVar4.d;
                                        }
                                        if (i49 == -1) {
                                            i49 = b0cVar4.d;
                                        }
                                    } else if (i53 == 1) {
                                        if (b0cVar4.Y) {
                                            i50 = b0cVar4.d;
                                        }
                                        if (i51 == -1) {
                                            i51 = b0cVar4.d;
                                        }
                                    }
                                    if (z11) {
                                        b0cVar4.a0.getClass();
                                        if (!b0cVar4.W) {
                                            vsj vsjVar = b0cVar4.a0;
                                            b bVar = b0cVar4.b0;
                                            bVar.getClass();
                                            vsjVar.d(bVar);
                                        }
                                    }
                                }
                                if (i48 != -1) {
                                    d0cVar3.I = i48;
                                } else if (i49 != -1) {
                                    d0cVar3.I = i49;
                                } else if (i50 != -1) {
                                    d0cVar3.I = i50;
                                } else if (i51 != -1) {
                                    d0cVar3.I = i51;
                                } else {
                                    d0cVar3.I = r9.size() > 0 ? ((b0c) r9.valueAt(z10 ? 1 : 0)).d : -1;
                                }
                                if (z11) {
                                    d0cVar3.j();
                                }
                            } else if (i22 == 475249515 && !d0cVar3.z) {
                                ?? r6 = z6;
                                while (true) {
                                    if (r6 < r82.size()) {
                                        if (((List) r82.valueAt(r6)).isEmpty()) {
                                            r6++;
                                        } else if (d0cVar3.v != C.TIME_UNSET) {
                                            for (?? r62 = z6; r62 < r82.size(); r62++) {
                                                Collections.sort((List) r82.valueAt(r62));
                                            }
                                            d0cVar3.j0.m(new zzb(r82, d0cVar3.v, d0cVar3.I, d0cVar3.s, d0cVar3.r));
                                        }
                                    }
                                }
                                d0cVar3.j0.m(new bw0(d0cVar3.v));
                                d0cVar3.z = r4;
                                d0cVar3.D = z6;
                                int i54 = r4;
                                for (?? r63 = z6; r63 < r9.size(); r63++) {
                                    b0c b0cVar5 = (b0c) r9.valueAt(r63);
                                    long j10 = d0cVar3.v;
                                    long j11 = d0cVar3.s;
                                    boolean z12 = z6;
                                    int i55 = i54;
                                    long j12 = d0cVar3.r;
                                    if (b0cVar5.e == 2 && (list7 = (List) r82.get(b0cVar5.d)) != null && !list7.isEmpty()) {
                                        if (!list7.isEmpty()) {
                                            int min = Math.min(list7.size(), 20);
                                            double d = 0.0d;
                                            int i56 = z12 ? 1 : 0;
                                            int i57 = -1;
                                            while (i56 < min) {
                                                int i58 = min;
                                                yzb yzbVar = (yzb) list7.get(i56);
                                                long j13 = j10;
                                                long j14 = yzbVar.a;
                                                long j15 = yzbVar.c;
                                                long j16 = yzbVar.b;
                                                if (j14 <= 10000000) {
                                                    if (i56 < list7.size() - 1) {
                                                        yzb yzbVar2 = (yzb) list7.get(i56 + 1);
                                                        long j17 = (yzbVar2.b + yzbVar2.c) - (j16 + j15);
                                                        j3 = yzbVar2.a - j14;
                                                        i14 = i56;
                                                        j4 = j11;
                                                        j2 = j17;
                                                    } else {
                                                        i14 = i56;
                                                        j2 = (j11 + j12) - (j16 + j15);
                                                        j3 = j13 - j14;
                                                        j4 = j11;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            i57 = i14;
                                                            d = d2;
                                                        }
                                                    }
                                                    i56 = i14 + 1;
                                                    min = i58;
                                                    j10 = j13;
                                                    j11 = j4;
                                                } else if (i57 != -1) {
                                                    j = ((yzb) list7.get(i57)).a;
                                                    if (j != C.TIME_UNSET) {
                                                        b bVar2 = b0cVar5.b0;
                                                        bVar2.getClass();
                                                        ric ricVar = bVar2.l;
                                                        qgj qgjVar = new qgj(j);
                                                        if (ricVar == null) {
                                                            lic[] licVarArr = new lic[i55];
                                                            licVarArr[z12 ? 1 : 0] = qgjVar;
                                                            a = new ric(licVarArr);
                                                        } else {
                                                            lic[] licVarArr2 = new lic[i55];
                                                            licVarArr2[z12 ? 1 : 0] = qgjVar;
                                                            a = ricVar.a(licVarArr2);
                                                        }
                                                        qm8 a5 = b0cVar5.b0.a();
                                                        a5.k = a;
                                                        b0cVar5.b0 = new b(a5);
                                                    }
                                                }
                                            }
                                            if (i57 != -1) {
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != C.TIME_UNSET) {
                                        }
                                    }
                                    if (!b0cVar5.W) {
                                        b0cVar5.a0.getClass();
                                        vsj vsjVar2 = b0cVar5.a0;
                                        b bVar3 = b0cVar5.b0;
                                        bVar3.getClass();
                                        vsjVar2.d(bVar3);
                                    }
                                    z6 = z12 ? 1 : 0;
                                    i54 = 1;
                                }
                                d0cVar3.j();
                                z4 = z6;
                                nl6Var3 = nl6Var;
                                z2 = z4;
                            }
                        } else if (!d0cVar3.z) {
                            d0cVar3.f(i22);
                            if (d0cVar3.E != C.TIME_UNSET && (i13 = d0cVar3.F) != -1 && d0cVar3.G != -1) {
                                List list9 = (List) r82.get(i13);
                                if (list9 == null) {
                                    list9 = new ArrayList();
                                    r82.put(d0cVar3.F, list9);
                                }
                                list9.add(new yzb(d0cVar3.E, d0cVar3.s + d0cVar3.G, d0cVar3.H));
                            }
                        }
                        z4 = false;
                        nl6Var3 = nl6Var;
                        z2 = z4;
                    } else {
                        if (d0cVar3.O == 2) {
                            b0c b0cVar6 = (b0c) r9.get(d0cVar3.U);
                            b0cVar6.a0.getClass();
                            if (d0cVar3.Z > 0 && "A_OPUS".equals(b0cVar6.c)) {
                                j9e j9eVar3 = d0cVar3.p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(d0cVar3.Z).array();
                                j9eVar3.getClass();
                                j9eVar3.L(array, array.length);
                            }
                            int i59 = 0;
                            for (int i60 = 0; i60 < d0cVar3.S; i60++) {
                                i59 += d0cVar3.T[i60];
                            }
                            int i61 = 0;
                            while (i61 < d0cVar3.S) {
                                long j18 = d0cVar3.P + ((b0cVar6.f * i61) / 1000);
                                int i62 = d0cVar3.W;
                                if (i61 == 0 && !d0cVar3.Y) {
                                    i62 |= 1;
                                }
                                int i63 = d0cVar3.T[i61];
                                int i64 = i59 - i63;
                                d0cVar3.h(b0cVar6, j18, i62, i63, i64);
                                i61++;
                                i59 = i64;
                            }
                            z4 = false;
                            d0cVar3.O = 0;
                            nl6Var3 = nl6Var;
                            z2 = z4;
                        }
                        z4 = false;
                        nl6Var3 = nl6Var;
                        z2 = z4;
                    }
                }
            }
            if (z8) {
                long position2 = nl6Var2.getPosition();
                d0cVar = this;
                if (d0cVar.J) {
                    d0cVar.L = position2;
                    b78Var.a = d0cVar.K;
                    d0cVar.J = z2;
                    return 1;
                }
                z3 = true;
                if (d0cVar.z) {
                    long j19 = d0cVar.L;
                    if (j19 != -1) {
                        b78Var.a = j19;
                        d0cVar.L = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                z3 = true;
                d0cVar = this;
            }
            z7 = z3;
            z6 = false;
        }
        if (z8) {
            return 0;
        }
        int i65 = 0;
        while (true) {
            SparseArray sparseArray = d0cVar.c;
            if (i65 >= sparseArray.size()) {
                return -1;
            }
            b0c b0cVar7 = (b0c) sparseArray.valueAt(i65);
            b0cVar7.a0.getClass();
            s1k s1kVar = b0cVar7.V;
            if (s1kVar != null) {
                s1kVar.b(b0cVar7.a0, b0cVar7.k);
            }
            i65++;
        }
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        if (this.e) {
            pl6Var = new en0(pl6Var, this.f);
        }
        this.j0 = pl6Var;
    }

    public final void f(int i) {
        if (this.D) {
            return;
        }
        throw s9e.a(null, "Element " + i + " must be in a Cues");
    }

    public final void g(int i) {
        if (this.y != null) {
            return;
        }
        throw s9e.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(b0c b0cVar, long j, int i, int i2, int i3) {
        byte[] i4;
        int i5;
        int i6;
        s1k s1kVar = b0cVar.V;
        if (s1kVar != null) {
            s1kVar.d(b0cVar.a0, j, i, i2, i3, b0cVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(b0cVar.c) || "S_TEXT/ASS".equals(b0cVar.c) || "S_TEXT/SSA".equals(b0cVar.c) || "S_TEXT/WEBVTT".equals(b0cVar.c)) {
                if (this.S > 1) {
                    tgj.d0("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.Q;
                    if (j2 == C.TIME_UNSET) {
                        tgj.d0("Skipping subtitle sample with no duration.");
                    } else {
                        String str = b0cVar.c;
                        j9e j9eVar = this.m;
                        byte[] bArr = j9eVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                i4 = i(j2, Ua.s, "%01d:%02d:%02d:%02d");
                                i5 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                i4 = i(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i5 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                i4 = i(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i5 = 19;
                                break;
                            default:
                                ilg.c();
                                return;
                        }
                        System.arraycopy(i4, 0, bArr, i5, i4.length);
                        int i7 = j9eVar.b;
                        while (true) {
                            if (i7 < j9eVar.c) {
                                if (j9eVar.a[i7] == 0) {
                                    j9eVar.M(i7);
                                } else {
                                    i7++;
                                }
                            }
                        }
                        b0cVar.a0.g(j9eVar.c, j9eVar);
                        i6 = i2 + j9eVar.c;
                        if ((i & 268435456) != 0) {
                            int i8 = this.S;
                            j9e j9eVar2 = this.p;
                            if (i8 > 1) {
                                j9eVar2.K(0);
                            } else {
                                int i9 = j9eVar2.c;
                                b0cVar.a0.b(j9eVar2, i9, 2);
                                i6 += i9;
                            }
                        }
                        b0cVar.a0.a(j, i, i6, i3, b0cVar.k);
                    }
                }
            }
            i6 = i2;
            if ((i & 268435456) != 0) {
            }
            b0cVar.a0.a(j, i, i6, i3, b0cVar.k);
        }
        this.N = true;
    }

    public final void j() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                pl6 pl6Var = this.j0;
                pl6Var.getClass();
                pl6Var.endTracks();
                this.x = false;
                return;
            }
            if (((b0c) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void k(nl6 nl6Var, int i) {
        j9e j9eVar = this.i;
        if (j9eVar.c >= i) {
            return;
        }
        byte[] bArr = j9eVar.a;
        if (bArr.length < i) {
            j9eVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = j9eVar.a;
        int i2 = j9eVar.c;
        nl6Var.readFully(bArr2, i2, i - i2);
        j9eVar.M(i);
    }

    public final void l() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.K(0);
    }

    public final long m(long j) {
        long j2 = this.t;
        if (j2 == C.TIME_UNSET) {
            throw s9e.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = nik.a;
        return nik.b0(j, j2, 1000L, RoundingMode.DOWN);
    }

    public final int n(nl6 nl6Var, b0c b0cVar, int i, boolean z) {
        int c;
        int c2;
        int i2;
        int i3;
        if ("S_TEXT/UTF8".equals(b0cVar.c)) {
            o(nl6Var, k0, i);
            int i4 = this.b0;
            l();
            return i4;
        }
        if ("S_TEXT/ASS".equals(b0cVar.c) || "S_TEXT/SSA".equals(b0cVar.c)) {
            o(nl6Var, m0, i);
            int i5 = this.b0;
            l();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(b0cVar.c)) {
            o(nl6Var, n0, i);
            int i6 = this.b0;
            l();
            return i6;
        }
        int i7 = 2;
        if (b0cVar.W) {
            b0cVar.b0.getClass();
            j9e j9eVar = new j9e(i);
            if (nl6Var.peekFully(j9eVar.a, 0, i, true)) {
                nl6Var.resetPeekPosition();
                if (fz8.T(j9eVar.i()) == 1 && j9eVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    j9eVar.k(bArr, 0, 10);
                    j9eVar.N(0);
                    int R = fz8.R(bArr);
                    if (R > 0 && j9eVar.a() >= R + 4) {
                        j9eVar.O(R);
                        if (fz8.T(j9eVar.m()) == 2) {
                            qm8 a = b0cVar.b0.a();
                            a.n = sjc.p(MimeTypes.AUDIO_DTS_HD);
                            b0cVar.b0 = new b(a);
                        }
                    }
                }
            }
            b0cVar.a0.d(b0cVar.b0);
            b0cVar.W = false;
            j();
        }
        vsj vsjVar = b0cVar.a0;
        boolean z2 = this.d0;
        j9e j9eVar2 = this.l;
        if (!z2) {
            boolean z3 = b0cVar.i;
            j9e j9eVar3 = this.i;
            if (z3) {
                this.W &= -1073741825;
                if (!this.e0) {
                    nl6Var.readFully(j9eVar3.a, 0, 1);
                    this.a0++;
                    byte b = j9eVar3.a[0];
                    if ((b & 128) == 128) {
                        throw s9e.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b;
                    this.e0 = true;
                }
                byte b2 = this.h0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.i0) {
                        j9e j9eVar4 = this.n;
                        nl6Var.readFully(j9eVar4.a, 0, 8);
                        this.a0 += 8;
                        this.i0 = true;
                        j9eVar3.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        j9eVar3.N(0);
                        vsjVar.b(j9eVar3, 1, 1);
                        this.b0++;
                        j9eVar4.N(0);
                        vsjVar.b(j9eVar4, 8, 1);
                        this.b0 += 8;
                    }
                    if (z4) {
                        if (!this.f0) {
                            nl6Var.readFully(j9eVar3.a, 0, 1);
                            this.a0++;
                            j9eVar3.N(0);
                            this.g0 = j9eVar3.A();
                            this.f0 = true;
                        }
                        int i8 = this.g0 * 4;
                        j9eVar3.K(i8);
                        nl6Var.readFully(j9eVar3.a, 0, i8);
                        this.a0 += i8;
                        short s = (short) ((this.g0 / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.q = ByteBuffer.allocate(i9);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.g0;
                            if (i10 >= i3) {
                                break;
                            }
                            int E = j9eVar3.E();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (E - i11));
                            } else {
                                byteBuffer2.putInt(E - i11);
                            }
                            i10++;
                            i11 = E;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.a0) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.q;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.q.putInt(0);
                        }
                        byte[] array = this.q.array();
                        j9e j9eVar5 = this.o;
                        j9eVar5.L(array, i9);
                        vsjVar.b(j9eVar5, i9, 1);
                        this.b0 += i9;
                    }
                }
                i2 = 2;
            } else {
                i2 = 2;
                byte[] bArr2 = b0cVar.j;
                if (bArr2 != null) {
                    j9eVar2.L(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(b0cVar.c) ? z : b0cVar.g > 0) {
                this.W |= 268435456;
                this.p.K(0);
                int i16 = (j9eVar2.c + i) - this.a0;
                j9eVar3.K(4);
                byte[] bArr3 = j9eVar3.a;
                bArr3[0] = (byte) ((i16 >> 24) & 255);
                bArr3[1] = (byte) ((i16 >> 16) & 255);
                bArr3[i2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
                vsjVar.b(j9eVar3, 4, i2);
                this.b0 += 4;
            }
            this.d0 = true;
        }
        int i17 = i + j9eVar2.c;
        if (!"V_MPEG4/ISO/AVC".equals(b0cVar.c) && !"V_MPEGH/ISO/HEVC".equals(b0cVar.c)) {
            if (b0cVar.V != null) {
                z1a.E(j9eVar2.c == 0);
                b0cVar.V.f(nl6Var);
            }
            while (true) {
                int i18 = this.a0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int a2 = j9eVar2.a();
                if (a2 > 0) {
                    c2 = Math.min(i19, a2);
                    vsjVar.g(c2, j9eVar2);
                } else {
                    c2 = vsjVar.c(nl6Var, i19, false);
                }
                this.a0 += c2;
                this.b0 += c2;
            }
        } else {
            j9e j9eVar6 = this.h;
            byte[] bArr4 = j9eVar6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i20 = b0cVar.c0;
            int i21 = 4 - i20;
            while (this.a0 < i17) {
                int i22 = this.c0;
                if (i22 == 0) {
                    int min = Math.min(i20, j9eVar2.a());
                    nl6Var.readFully(bArr4, i21 + min, i20 - min);
                    if (min > 0) {
                        j9eVar2.k(bArr4, i21, min);
                    }
                    this.a0 += i20;
                    j9eVar6.N(0);
                    this.c0 = j9eVar6.E();
                    j9e j9eVar7 = this.g;
                    j9eVar7.N(0);
                    vsjVar.g(4, j9eVar7);
                    this.b0 += 4;
                } else {
                    int a3 = j9eVar2.a();
                    if (a3 > 0) {
                        c = Math.min(i22, a3);
                        vsjVar.g(c, j9eVar2);
                    } else {
                        c = vsjVar.c(nl6Var, i22, false);
                    }
                    this.a0 += c;
                    this.b0 += c;
                    this.c0 -= c;
                }
            }
        }
        if ("A_VORBIS".equals(b0cVar.c)) {
            j9e j9eVar8 = this.j;
            j9eVar8.N(0);
            vsjVar.g(4, j9eVar8);
            this.b0 += 4;
        }
        int i23 = this.b0;
        l();
        return i23;
    }

    public final void o(nl6 nl6Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        j9e j9eVar = this.m;
        byte[] bArr2 = j9eVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            j9eVar.getClass();
            j9eVar.L(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        nl6Var.readFully(j9eVar.a, bArr.length, i);
        j9eVar.N(0);
        j9eVar.M(length);
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.M = C.TIME_UNSET;
        this.O = 0;
        vo4 vo4Var = this.a;
        vo4Var.c = 0;
        vo4Var.b.clear();
        nkk nkkVar = (nkk) vo4Var.f;
        nkkVar.b = 0;
        nkkVar.c = 0;
        nkk nkkVar2 = this.b;
        nkkVar2.b = 0;
        nkkVar2.c = 0;
        l();
        this.D = false;
        this.E = C.TIME_UNSET;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            s1k s1kVar = ((b0c) sparseArray.valueAt(i)).V;
            if (s1kVar != null) {
                s1kVar.b = false;
                s1kVar.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
