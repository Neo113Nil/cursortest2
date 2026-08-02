package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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
/* loaded from: classes2.dex */
public final class c0c implements kl6 {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;
    public long A;
    public long B;
    public ojb C;
    public ojb D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final vo4 a;
    public boolean a0;
    public final nkk b;
    public ol6 b0;
    public final SparseArray c;
    public final boolean d;
    public final nkk e;
    public final nkk f;
    public final nkk g;
    public final nkk h;
    public final nkk i;
    public final nkk j;
    public final nkk k;
    public final nkk l;
    public final nkk m;
    public final nkk n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public a0c u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i = lik.a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(xp2.c);
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        ljg.s(0, 90, "htc_video_rotA-000", "htc_video_rotA-090", hashMap);
        ljg.s(180, 270, "htc_video_rotA-180", "htc_video_rotA-270", hashMap);
        h0 = Collections.unmodifiableMap(hashMap);
    }

    public c0c() {
        vo4 vo4Var = new vo4(0);
        this.q = -1L;
        this.r = C.TIME_UNSET;
        this.s = C.TIME_UNSET;
        this.t = C.TIME_UNSET;
        this.z = -1L;
        this.A = -1L;
        this.B = C.TIME_UNSET;
        this.a = vo4Var;
        vo4Var.g = new de0(this, 29);
        this.d = true;
        this.b = new nkk(0, false);
        this.c = new SparseArray();
        this.g = new nkk(4);
        this.h = new nkk(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new nkk(4);
        this.e = new nkk(hkg.r);
        this.f = new nkk(4);
        this.j = new nkk(4, false);
        this.k = new nkk(4, false);
        this.l = new nkk(8);
        this.m = new nkk(4, false);
        this.n = new nkk(4, false);
        this.L = new int[1];
    }

    public static byte[] g(long j, long j2, String str) {
        qx9.r(j != C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = lik.a;
        return format.getBytes(xp2.c);
    }

    public final void a(int i) {
        if (this.C == null || this.D == null) {
            throw r9e.a("Element " + i + " must be in a Cues", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x085a, code lost:
    
        if (r0.m() == r5.getLeastSignificantBits()) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0b44, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0ed1, code lost:
    
        if (r5 == false) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0ed3, code lost:
    
        r0 = ((defpackage.ap4) r4).d;
        r2 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0edc, code lost:
    
        if (r2.y == false) goto L825;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0eeb, code lost:
    
        r38 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0ef1, code lost:
    
        if (r2.v == false) goto L882;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0ef3, code lost:
    
        r0 = r2.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0ef9, code lost:
    
        if (r0 == (-1)) goto L883;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0efb, code lost:
    
        r41.a = r0;
        r2.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0eff, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0f06, code lost:
    
        r0 = r2;
        r4 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0f06, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0ede, code lost:
    
        r2.A = r0;
        r41.a = r2.z;
        r2.y = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0eea, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0f00, code lost:
    
        r38 = true;
        r2 = r39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08a4  */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r3v43, types: [a0c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v11, types: [ap4] */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        ml6 ml6Var2;
        boolean z;
        int i;
        boolean z2;
        String str;
        ?? r6;
        int i2;
        int a;
        boolean z3;
        char c;
        int i3;
        c0c c0cVar;
        List list;
        int o;
        int i4;
        ArrayList arrayList;
        int i5;
        Exception exc;
        String str2;
        Pair pair;
        List list2;
        int i6;
        List z4;
        int i7;
        String str3;
        int i8;
        int i9;
        List list3;
        List list4;
        byte[] bArr;
        pm8 pm8Var;
        boolean g;
        int i10;
        int i11;
        v13 v13Var;
        int i12;
        byte[] bArr2;
        int i13;
        String str4;
        ue8 a2;
        List list5;
        a0h aw0Var;
        int i14;
        long[] jArr;
        c0c c0cVar2 = this;
        c0cVar2.F = false;
        boolean z5 = true;
        boolean z6 = true;
        while (z6 && !c0cVar2.F) {
            vo4 vo4Var = c0cVar2.a;
            nkk nkkVar = (nkk) vo4Var.f;
            ArrayDeque arrayDeque = vo4Var.b;
            qx9.u((de0) vo4Var.g);
            while (true) {
                to4 to4Var = (to4) arrayDeque.peek();
                if (to4Var == null || ((ap4) ml6Var).d < to4Var.b) {
                    ?? r0 = 0;
                    int i15 = vo4Var.c;
                    ml6Var2 = ml6Var;
                    if (i15 == 0) {
                        int i16 = 4;
                        long y = nkkVar.y(ml6Var2, true, false, 4);
                        if (y == -2) {
                            byte[] bArr3 = vo4Var.a;
                            ((ap4) ml6Var2).f = 0;
                            while (true) {
                                r6 = (ap4) ml6Var2;
                                r6.peekFully(bArr3, r0, i16, r0);
                                byte b = bArr3[r0];
                                int i17 = 0;
                                while (true) {
                                    long[] jArr2 = nkk.d;
                                    if (i17 >= 8) {
                                        i2 = -1;
                                    } else if ((jArr2[i17] & b) != 0) {
                                        i2 = i17 + 1;
                                    } else {
                                        i17++;
                                    }
                                }
                                if (i2 != -1 && i2 <= 4) {
                                    a = (int) nkk.a(bArr3, i2, false);
                                    Object obj = ((de0) vo4Var.g).b;
                                    if (a == 357149030 || a == 524531317 || a == 475249515 || a == 374648427) {
                                    }
                                }
                                r6.skipFully(1);
                                r0 = 0;
                                i16 = 4;
                            }
                            r6.skipFully(i2);
                            y = a;
                        }
                        z = true;
                        if (y == -1) {
                            z6 = false;
                            z2 = false;
                        } else {
                            vo4Var.d = (int) y;
                            vo4Var.c = 1;
                            i15 = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (i15 == z) {
                        vo4Var.e = nkkVar.y(ml6Var2, false, z, 8);
                        vo4Var.c = 2;
                    }
                    de0 de0Var = (de0) vo4Var.g;
                    int i18 = vo4Var.d;
                    Object obj2 = de0Var.b;
                    switch (i18) {
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
                        case 241:
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
                        ((ap4) ml6Var2).skipFully((int) vo4Var.e);
                        vo4Var.c = 0;
                        z5 = true;
                    } else if (i == 1) {
                        long j = ((ap4) ml6Var2).d;
                        arrayDeque.push(new to4(i18, vo4Var.e + j));
                        de0 de0Var2 = (de0) vo4Var.g;
                        int i19 = vo4Var.d;
                        long j2 = vo4Var.e;
                        c0c c0cVar3 = (c0c) de0Var2.b;
                        qx9.u(c0cVar3.b0);
                        if (i19 != 160) {
                            if (i19 == 174) {
                                a0c a0cVar = new a0c();
                                a0cVar.m = -1;
                                a0cVar.n = -1;
                                a0cVar.o = -1;
                                a0cVar.p = -1;
                                a0cVar.q = 0;
                                a0cVar.r = -1;
                                a0cVar.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                a0cVar.t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                a0cVar.u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                a0cVar.v = null;
                                a0cVar.w = -1;
                                a0cVar.x = false;
                                a0cVar.y = -1;
                                a0cVar.z = -1;
                                a0cVar.A = -1;
                                a0cVar.B = 1000;
                                a0cVar.C = 200;
                                a0cVar.D = -1.0f;
                                a0cVar.E = -1.0f;
                                a0cVar.F = -1.0f;
                                a0cVar.G = -1.0f;
                                a0cVar.H = -1.0f;
                                a0cVar.I = -1.0f;
                                a0cVar.J = -1.0f;
                                a0cVar.K = -1.0f;
                                a0cVar.L = -1.0f;
                                a0cVar.M = -1.0f;
                                a0cVar.O = 1;
                                a0cVar.P = -1;
                                a0cVar.Q = 8000;
                                a0cVar.R = 0L;
                                a0cVar.S = 0L;
                                a0cVar.V = true;
                                a0cVar.W = "eng";
                                c0cVar3.u = a0cVar;
                            } else if (i19 == 187) {
                                z2 = false;
                                c0cVar3.E = false;
                            } else if (i19 == 19899) {
                                c0cVar3.w = -1;
                                c0cVar3.x = -1L;
                            } else if (i19 == 20533) {
                                c0cVar3.e(i19);
                                c0cVar3.u.h = true;
                            } else if (i19 == 21968) {
                                c0cVar3.e(i19);
                                c0cVar3.u.x = true;
                            } else if (i19 == 408125543) {
                                long j3 = c0cVar3.q;
                                if (j3 != -1 && j3 != j) {
                                    throw r9e.a("Multiple Segment elements not supported", null);
                                }
                                c0cVar3.q = j;
                                c0cVar3.p = j2;
                            } else if (i19 == 475249515) {
                                c0cVar3.C = new ojb((byte) 0, 0);
                                c0cVar3.D = new ojb((byte) 0, 0);
                            } else if (i19 == 524531317 && !c0cVar3.v) {
                                if (!c0cVar3.d || c0cVar3.z == -1) {
                                    c0cVar3.b0.d(new aw0(c0cVar3.t));
                                    c0cVar3.v = true;
                                } else {
                                    c0cVar3.y = true;
                                }
                            }
                            z2 = false;
                        } else {
                            z2 = false;
                            c0cVar3.Q = false;
                            c0cVar3.R = 0L;
                        }
                        vo4Var.c = z2 ? 1 : 0;
                    } else if (i == 2) {
                        long j4 = vo4Var.e;
                        if (j4 > 8) {
                            throw r9e.a("Invalid integer size: " + vo4Var.e, null);
                        }
                        de0Var.y(i18, vo4Var.a(ml6Var2, (int) j4));
                        z2 = false;
                        vo4Var.c = 0;
                    } else if (i == 3) {
                        long j5 = vo4Var.e;
                        if (j5 > 2147483647L) {
                            throw r9e.a("String element size: " + vo4Var.e, null);
                        }
                        int i20 = (int) j5;
                        if (i20 == 0) {
                            str = "";
                        } else {
                            byte[] bArr4 = new byte[i20];
                            ((ap4) ml6Var2).readFully(bArr4, 0, i20, false);
                            while (i20 > 0 && bArr4[i20 - 1] == 0) {
                                i20--;
                            }
                            str = new String(bArr4, 0, i20);
                        }
                        c0c c0cVar4 = (c0c) de0Var.b;
                        if (i18 == 134) {
                            c0cVar4.e(i18);
                            c0cVar4.u.b = str;
                        } else if (i18 != 17026) {
                            if (i18 == 21358) {
                                c0cVar4.e(i18);
                                c0cVar4.u.a = str;
                            } else if (i18 == 2274716) {
                                c0cVar4.e(i18);
                                c0cVar4.u.W = str;
                            }
                        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                            throw r9e.a("DocType " + str + " not supported", null);
                        }
                        z2 = false;
                        vo4Var.c = 0;
                    } else if (i == 4) {
                        de0Var.m(i18, (int) vo4Var.e, ml6Var2);
                        z2 = false;
                        vo4Var.c = 0;
                    } else {
                        if (i != 5) {
                            throw r9e.a("Invalid element type " + i, null);
                        }
                        long j6 = vo4Var.e;
                        if (j6 != 4 && j6 != 8) {
                            throw r9e.a("Invalid float size: " + vo4Var.e, null);
                        }
                        int i21 = (int) j6;
                        double intBitsToFloat = i21 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(vo4Var.a(ml6Var2, i21));
                        c0c c0cVar5 = (c0c) de0Var.b;
                        if (i18 == 181) {
                            c0cVar5.e(i18);
                            c0cVar5.u.Q = (int) intBitsToFloat;
                        } else if (i18 != 17545) {
                            switch (i18) {
                                case 21969:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.D = (float) intBitsToFloat;
                                    break;
                                case 21970:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.E = (float) intBitsToFloat;
                                    break;
                                case 21971:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.F = (float) intBitsToFloat;
                                    break;
                                case 21972:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.G = (float) intBitsToFloat;
                                    break;
                                case 21973:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.H = (float) intBitsToFloat;
                                    break;
                                case 21974:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.I = (float) intBitsToFloat;
                                    break;
                                case 21975:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.J = (float) intBitsToFloat;
                                    break;
                                case 21976:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.K = (float) intBitsToFloat;
                                    break;
                                case 21977:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.L = (float) intBitsToFloat;
                                    break;
                                case 21978:
                                    c0cVar5.e(i18);
                                    c0cVar5.u.M = (float) intBitsToFloat;
                                    break;
                                default:
                                    switch (i18) {
                                        case 30323:
                                            c0cVar5.e(i18);
                                            c0cVar5.u.s = (float) intBitsToFloat;
                                            break;
                                        case 30324:
                                            c0cVar5.e(i18);
                                            c0cVar5.u.t = (float) intBitsToFloat;
                                            break;
                                        case 30325:
                                            c0cVar5.e(i18);
                                            c0cVar5.u.u = (float) intBitsToFloat;
                                            break;
                                    }
                            }
                        } else {
                            c0cVar5.s = (long) intBitsToFloat;
                        }
                        z2 = false;
                        vo4Var.c = 0;
                    }
                } else {
                    de0 de0Var3 = (de0) vo4Var.g;
                    int i22 = ((to4) arrayDeque.pop()).a;
                    c0c c0cVar6 = (c0c) de0Var3.b;
                    SparseArray sparseArray = c0cVar6.c;
                    qx9.u(c0cVar6.b0);
                    if (i22 != 160) {
                        if (i22 == 174) {
                            ?? r3 = c0cVar6.u;
                            qx9.u(r3);
                            String str5 = r3.b;
                            if (str5 == null) {
                                throw r9e.a("CodecId is missing in TrackEntry element", null);
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
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    ol6 ol6Var = c0cVar6.b0;
                                    int i23 = r3.c;
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
                                        case 855502857:
                                            if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                                c = 26;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1045209816:
                                            if (str5.equals("S_TEXT/WEBVTT")) {
                                                c = 27;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1422270023:
                                            if (str5.equals("S_TEXT/UTF8")) {
                                                c = 28;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1809237540:
                                            if (str5.equals("V_MPEG2")) {
                                                c = 29;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950749482:
                                            if (str5.equals("A_EAC3")) {
                                                c = 30;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950789798:
                                            if (str5.equals("A_FLAC")) {
                                                c = 31;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1951062397:
                                            if (str5.equals("A_OPUS")) {
                                                c = ' ';
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
                                            c0cVar = c0cVar6;
                                            byte[] bArr5 = r3.k;
                                            List singletonList = bArr5 == null ? null : Collections.singletonList(bArr5);
                                            str6 = MimeTypes.VIDEO_MP4V;
                                            list = singletonList;
                                            o = -1;
                                            i4 = -1;
                                            list5 = list;
                                            str2 = null;
                                            list4 = list5;
                                            bArr = r3.N;
                                            if (bArr != null && (a2 = ue8.a(new nkk(bArr))) != null) {
                                                str2 = a2.b;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i24 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map = h0;
                                            if (!g) {
                                                pm8Var.x = r3.O;
                                                pm8Var.y = r3.Q;
                                                pm8Var.z = o;
                                                i10 = 1;
                                            } else if (rjc.i(str6)) {
                                                if (r3.q == 0) {
                                                    int i25 = r3.o;
                                                    i11 = -1;
                                                    if (i25 == -1) {
                                                        i25 = r3.m;
                                                    }
                                                    r3.o = i25;
                                                    int i26 = r3.p;
                                                    if (i26 == -1) {
                                                        i26 = r3.n;
                                                    }
                                                    r3.p = i26;
                                                } else {
                                                    i11 = -1;
                                                }
                                                float f = (r3.o == i11 || (i13 = r3.p) == i11) ? -1.0f : (r3.n * r0) / (r3.m * i13);
                                                if (r3.x) {
                                                    if (r3.D == -1.0f || r3.E == -1.0f || r3.F == -1.0f || r3.G == -1.0f || r3.H == -1.0f || r3.I == -1.0f || r3.J == -1.0f || r3.K == -1.0f || r3.L == -1.0f || r3.M == -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((r3.D * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r3.E * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r3.F * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r3.G * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r3.H * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r3.I * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r3.J * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((r3.K * 50000.0f) + 0.5f));
                                                        order.putShort((short) (r3.L + 0.5f));
                                                        order.putShort((short) (r3.M + 0.5f));
                                                        order.putShort((short) r3.B);
                                                        order.putShort((short) r3.C);
                                                    }
                                                    v13Var = new v13(r3.y, r3.A, r3.z, bArr2);
                                                } else {
                                                    v13Var = null;
                                                }
                                                String str7 = r3.a;
                                                int intValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(r3.a)).intValue();
                                                if (r3.r == 0 && Float.compare(r3.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(r3.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                    if (Float.compare(r3.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        i12 = 0;
                                                    } else if (Float.compare(r3.t, 90.0f) == 0) {
                                                        i12 = 90;
                                                    } else if (Float.compare(r3.t, -180.0f) == 0 || Float.compare(r3.t, 180.0f) == 0) {
                                                        i12 = 180;
                                                    } else if (Float.compare(r3.t, -90.0f) == 0) {
                                                        i12 = 270;
                                                    }
                                                    pm8Var.p = r3.m;
                                                    pm8Var.q = r3.n;
                                                    pm8Var.t = f;
                                                    pm8Var.s = i12;
                                                    pm8Var.u = r3.v;
                                                    pm8Var.v = r3.w;
                                                    pm8Var.w = v13Var;
                                                    i10 = 2;
                                                }
                                                i12 = intValue;
                                                pm8Var.p = r3.m;
                                                pm8Var.q = r3.n;
                                                pm8Var.t = f;
                                                pm8Var.s = i12;
                                                pm8Var.u = r3.v;
                                                pm8Var.v = r3.w;
                                                pm8Var.w = v13Var;
                                                i10 = 2;
                                            } else {
                                                if (!MimeTypes.APPLICATION_SUBRIP.equals(str6) && !MimeTypes.TEXT_SSA.equals(str6) && !MimeTypes.TEXT_VTT.equals(str6) && !MimeTypes.APPLICATION_VOBSUB.equals(str6) && !MimeTypes.APPLICATION_PGS.equals(str6) && !MimeTypes.APPLICATION_DVBSUBS.equals(str6)) {
                                                    throw r9e.a("Unexpected MIME type.", null);
                                                }
                                                i10 = 3;
                                            }
                                            str4 = r3.a;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                pm8Var.b = r3.a;
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var = new sm8(pm8Var);
                                            usj track = ol6Var.track(r3.c, i10);
                                            r3.X = track;
                                            track.a(sm8Var);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 2:
                                            i3 = i23;
                                            c0cVar = c0cVar6;
                                            nkk nkkVar2 = new nkk(r3.a(str5));
                                            try {
                                                int l = nkkVar2.l();
                                                if (l != 1) {
                                                    if (l == 65534) {
                                                        nkkVar2.E(24);
                                                        long m = nkkVar2.m();
                                                        UUID uuid = g0;
                                                        if (m == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    m6k.f0();
                                                    str6 = MimeTypes.AUDIO_UNKNOWN;
                                                    o = -1;
                                                    i4 = -1;
                                                    str2 = null;
                                                    list4 = null;
                                                    bArr = r3.N;
                                                    if (bArr != null) {
                                                        str2 = a2.b;
                                                        str6 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i242 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                    pm8Var = new pm8();
                                                    g = rjc.g(str6);
                                                    Map map2 = h0;
                                                    if (!g) {
                                                    }
                                                    str4 = r3.a;
                                                    if (str4 != null) {
                                                        pm8Var.b = r3.a;
                                                        break;
                                                    }
                                                    pm8Var.a = Integer.toString(i3);
                                                    pm8Var.k = str6;
                                                    pm8Var.l = i4;
                                                    pm8Var.c = r3.W;
                                                    pm8Var.d = i242;
                                                    pm8Var.m = list4;
                                                    pm8Var.h = str2;
                                                    pm8Var.n = r3.l;
                                                    sm8 sm8Var2 = new sm8(pm8Var);
                                                    usj track2 = ol6Var.track(r3.c, i10);
                                                    r3.X = track2;
                                                    track2.a(sm8Var2);
                                                    sparseArray.put(r3.c, r3);
                                                    c0cVar6 = c0cVar;
                                                }
                                                o = lik.o(r3.P);
                                                if (o == 0) {
                                                    m6k.f0();
                                                    str6 = MimeTypes.AUDIO_UNKNOWN;
                                                    o = -1;
                                                    i4 = -1;
                                                    str2 = null;
                                                    list4 = null;
                                                    bArr = r3.N;
                                                    if (bArr != null) {
                                                    }
                                                    int i2422 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                    pm8Var = new pm8();
                                                    g = rjc.g(str6);
                                                    Map map22 = h0;
                                                    if (!g) {
                                                    }
                                                    str4 = r3.a;
                                                    if (str4 != null) {
                                                    }
                                                    pm8Var.a = Integer.toString(i3);
                                                    pm8Var.k = str6;
                                                    pm8Var.l = i4;
                                                    pm8Var.c = r3.W;
                                                    pm8Var.d = i2422;
                                                    pm8Var.m = list4;
                                                    pm8Var.h = str2;
                                                    pm8Var.n = r3.l;
                                                    sm8 sm8Var22 = new sm8(pm8Var);
                                                    usj track22 = ol6Var.track(r3.c, i10);
                                                    r3.X = track22;
                                                    track22.a(sm8Var22);
                                                    sparseArray.put(r3.c, r3);
                                                    c0cVar6 = c0cVar;
                                                }
                                                str6 = MimeTypes.AUDIO_RAW;
                                                i4 = -1;
                                                str2 = null;
                                                list4 = null;
                                                bArr = r3.N;
                                                if (bArr != null) {
                                                }
                                                int i24222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                pm8Var = new pm8();
                                                g = rjc.g(str6);
                                                Map map222 = h0;
                                                if (!g) {
                                                }
                                                str4 = r3.a;
                                                if (str4 != null) {
                                                }
                                                pm8Var.a = Integer.toString(i3);
                                                pm8Var.k = str6;
                                                pm8Var.l = i4;
                                                pm8Var.c = r3.W;
                                                pm8Var.d = i24222;
                                                pm8Var.m = list4;
                                                pm8Var.h = str2;
                                                pm8Var.n = r3.l;
                                                sm8 sm8Var222 = new sm8(pm8Var);
                                                usj track222 = ol6Var.track(r3.c, i10);
                                                r3.X = track222;
                                                track222.a(sm8Var222);
                                                sparseArray.put(r3.c, r3);
                                                c0cVar6 = c0cVar;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw r9e.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            i3 = i23;
                                            c0cVar = c0cVar6;
                                            r3.T = new s1k(0);
                                            str6 = MimeTypes.AUDIO_TRUEHD;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222 = new sm8(pm8Var);
                                            usj track2222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222;
                                            track2222.a(sm8Var2222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 4:
                                            byte[] a3 = r3.a(str5);
                                            try {
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                r3 = 0;
                                            }
                                            try {
                                                if (a3[0] != 2) {
                                                    throw r9e.a("Error parsing vorbis codec private", null);
                                                }
                                                int i27 = 0;
                                                int i28 = 1;
                                                while (true) {
                                                    int i29 = i28;
                                                    int i30 = a3[i28] & 255;
                                                    if (i30 == 255) {
                                                        i27 += 255;
                                                        i28 = i29 + 1;
                                                    } else {
                                                        int i31 = i29 + 1;
                                                        int i32 = i27 + i30;
                                                        i3 = i23;
                                                        int i33 = 0;
                                                        while (true) {
                                                            int i34 = a3[i31] & 255;
                                                            if (i34 == 255) {
                                                                i33 += 255;
                                                                i31++;
                                                            } else {
                                                                int i35 = i31 + 1;
                                                                int i36 = i33 + i34;
                                                                if (a3[i35] != 1) {
                                                                    throw r9e.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr6 = new byte[i32];
                                                                System.arraycopy(a3, i35, bArr6, 0, i32);
                                                                int i37 = i35 + i32;
                                                                if (a3[i37] != 3) {
                                                                    throw r9e.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i38 = i37 + i36;
                                                                if (a3[i38] != 5) {
                                                                    throw r9e.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr7 = new byte[a3.length - i38];
                                                                c0cVar = c0cVar6;
                                                                System.arraycopy(a3, i38, bArr7, 0, a3.length - i38);
                                                                ArrayList arrayList2 = new ArrayList(2);
                                                                arrayList2.add(bArr6);
                                                                arrayList2.add(bArr7);
                                                                str6 = MimeTypes.AUDIO_VORBIS;
                                                                i4 = 8192;
                                                                arrayList = arrayList2;
                                                                o = -1;
                                                                list5 = arrayList;
                                                                str2 = null;
                                                                list4 = list5;
                                                                bArr = r3.N;
                                                                if (bArr != null) {
                                                                }
                                                                int i2422222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                                pm8Var = new pm8();
                                                                g = rjc.g(str6);
                                                                Map map22222 = h0;
                                                                if (!g) {
                                                                }
                                                                str4 = r3.a;
                                                                if (str4 != null) {
                                                                }
                                                                pm8Var.a = Integer.toString(i3);
                                                                pm8Var.k = str6;
                                                                pm8Var.l = i4;
                                                                pm8Var.c = r3.W;
                                                                pm8Var.d = i2422222;
                                                                pm8Var.m = list4;
                                                                pm8Var.h = str2;
                                                                pm8Var.n = r3.l;
                                                                sm8 sm8Var22222 = new sm8(pm8Var);
                                                                usj track22222 = ol6Var.track(r3.c, i10);
                                                                r3.X = track22222;
                                                                track22222.a(sm8Var22222);
                                                                sparseArray.put(r3.c, r3);
                                                                c0cVar6 = c0cVar;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                throw r9e.a("Error parsing vorbis codec private", r3);
                                            }
                                            break;
                                        case 5:
                                            i5 = i23;
                                            str6 = MimeTypes.AUDIO_MPEG_L2;
                                            c0cVar = c0cVar6;
                                            i3 = i5;
                                            o = -1;
                                            i4 = 4096;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i24222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var222222 = new sm8(pm8Var);
                                            usj track222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track222222;
                                            track222222.a(sm8Var222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 6:
                                            i5 = i23;
                                            str6 = MimeTypes.AUDIO_MPEG;
                                            c0cVar = c0cVar6;
                                            i3 = i5;
                                            o = -1;
                                            i4 = 4096;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222222 = new sm8(pm8Var);
                                            usj track2222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222222;
                                            track2222222.a(sm8Var2222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 7:
                                            nkk nkkVar3 = new nkk(r3.a(str5));
                                            try {
                                                nkkVar3.F(16);
                                                long j7 = nkkVar3.j();
                                                if (j7 == 1482049860) {
                                                    exc = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw r9e.a("Error parsing FourCC private data", exc);
                                                    }
                                                } else {
                                                    if (j7 == 859189832) {
                                                        pair = new Pair(MimeTypes.VIDEO_H263, null);
                                                    } else {
                                                        if (j7 == 826496599) {
                                                            byte[] bArr8 = nkkVar3.a;
                                                            for (int i39 = nkkVar3.b + 20; i39 < bArr8.length - 4; i39++) {
                                                                if (bArr8[i39] == 0 && bArr8[i39 + 1] == 0 && bArr8[i39 + 2] == 1) {
                                                                    if (bArr8[i39 + 3] == 15) {
                                                                        pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr8, i39, bArr8.length)));
                                                                    }
                                                                }
                                                            }
                                                            exc = null;
                                                            throw r9e.a("Failed to find FourCC VC1 initialization data", null);
                                                        }
                                                        str2 = null;
                                                        m6k.f0();
                                                        pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                                                    }
                                                    str2 = null;
                                                }
                                                str6 = (String) pair.first;
                                                c0cVar = c0cVar6;
                                                i3 = i23;
                                                list2 = (List) pair.second;
                                                o = -1;
                                                i4 = -1;
                                                list4 = list2;
                                                bArr = r3.N;
                                                if (bArr != null) {
                                                }
                                                int i2422222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                pm8Var = new pm8();
                                                g = rjc.g(str6);
                                                Map map22222222 = h0;
                                                if (!g) {
                                                }
                                                str4 = r3.a;
                                                if (str4 != null) {
                                                }
                                                pm8Var.a = Integer.toString(i3);
                                                pm8Var.k = str6;
                                                pm8Var.l = i4;
                                                pm8Var.c = r3.W;
                                                pm8Var.d = i2422222222;
                                                pm8Var.m = list4;
                                                pm8Var.h = str2;
                                                pm8Var.n = r3.l;
                                                sm8 sm8Var22222222 = new sm8(pm8Var);
                                                usj track22222222 = ol6Var.track(r3.c, i10);
                                                r3.X = track22222222;
                                                track22222222.a(sm8Var22222222);
                                                sparseArray.put(r3.c, r3);
                                                c0cVar6 = c0cVar;
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                exc = null;
                                            }
                                            break;
                                        case '\b':
                                            i6 = i23;
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(r3.a(str5), 0, bArr9, 0, 4);
                                            z4 = hv9.z(bArr9);
                                            c0cVar = c0cVar6;
                                            str6 = MimeTypes.APPLICATION_DVBSUBS;
                                            i3 = i6;
                                            list = z4;
                                            o = -1;
                                            i4 = -1;
                                            list5 = list;
                                            str2 = null;
                                            list4 = list5;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i24222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var222222222 = new sm8(pm8Var);
                                            usj track222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track222222222;
                                            track222222222.a(sm8Var222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case '\n':
                                            i7 = i23;
                                            vv0 a4 = vv0.a(new nkk(r3.a(str5)));
                                            ArrayList arrayList3 = a4.a;
                                            r3.Y = a4.b;
                                            str3 = a4.f;
                                            str6 = "video/avc";
                                            list3 = arrayList3;
                                            str2 = str3;
                                            list2 = list3;
                                            c0cVar = c0cVar6;
                                            i3 = i7;
                                            o = -1;
                                            i4 = -1;
                                            list4 = list2;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222222222 = new sm8(pm8Var);
                                            usj track2222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222222222;
                                            track2222222222.a(sm8Var2222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 11:
                                            i6 = i23;
                                            z4 = hv9.z(r3.a(str5));
                                            c0cVar = c0cVar6;
                                            str6 = MimeTypes.APPLICATION_VOBSUB;
                                            i3 = i6;
                                            list = z4;
                                            o = -1;
                                            i4 = -1;
                                            list5 = list;
                                            str2 = null;
                                            list4 = list5;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i2422222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map22222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i2422222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var22222222222 = new sm8(pm8Var);
                                            usj track22222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track22222222222;
                                            track22222222222.a(sm8Var22222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case '\f':
                                            i8 = i23;
                                            str6 = MimeTypes.AUDIO_DTS_HD;
                                            c0cVar = c0cVar6;
                                            i3 = i8;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i24222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var222222222222 = new sm8(pm8Var);
                                            usj track222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track222222222222;
                                            track222222222222.a(sm8Var222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case '\r':
                                            List singletonList2 = Collections.singletonList(r3.a(str5));
                                            byte[] bArr10 = r3.k;
                                            d0 O = kik.O(new nm2(bArr10, bArr10.length, 2, (byte) 0), false);
                                            r3.Q = O.a;
                                            r3.O = O.b;
                                            String str8 = O.c;
                                            str6 = MimeTypes.AUDIO_AAC;
                                            str2 = str8;
                                            c0cVar = c0cVar6;
                                            i3 = i23;
                                            list2 = singletonList2;
                                            o = -1;
                                            i4 = -1;
                                            list4 = list2;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222222222222 = new sm8(pm8Var);
                                            usj track2222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222222222222;
                                            track2222222222222.a(sm8Var2222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 14:
                                            i8 = i23;
                                            str6 = MimeTypes.AUDIO_AC3;
                                            c0cVar = c0cVar6;
                                            i3 = i8;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i2422222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map22222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i2422222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var22222222222222 = new sm8(pm8Var);
                                            usj track22222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track22222222222222;
                                            track22222222222222.a(sm8Var22222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 15:
                                        case 21:
                                            i8 = i23;
                                            str6 = MimeTypes.AUDIO_DTS;
                                            c0cVar = c0cVar6;
                                            i3 = i8;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i24222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var222222222222222 = new sm8(pm8Var);
                                            usj track222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track222222222222222;
                                            track222222222222222.a(sm8Var222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 16:
                                            i8 = i23;
                                            str6 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                            c0cVar = c0cVar6;
                                            i3 = i8;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222222222222222 = new sm8(pm8Var);
                                            usj track2222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222222222222222;
                                            track2222222222222222.a(sm8Var2222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 17:
                                            i8 = i23;
                                            str6 = MimeTypes.VIDEO_VP8;
                                            c0cVar = c0cVar6;
                                            i3 = i8;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i2422222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map22222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i2422222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var22222222222222222 = new sm8(pm8Var);
                                            usj track22222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track22222222222222222;
                                            track22222222222222222.a(sm8Var22222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 18:
                                            i8 = i23;
                                            str6 = MimeTypes.VIDEO_VP9;
                                            c0cVar = c0cVar6;
                                            i3 = i8;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i24222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var222222222222222222 = new sm8(pm8Var);
                                            usj track222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track222222222222222222;
                                            track222222222222222222.a(sm8Var222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 19:
                                            i3 = i23;
                                            c0cVar = c0cVar6;
                                            str6 = MimeTypes.APPLICATION_PGS;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222222222222222222 = new sm8(pm8Var);
                                            usj track2222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222222222222222222;
                                            track2222222222222222222.a(sm8Var2222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 20:
                                            i3 = i23;
                                            c0cVar = c0cVar6;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i2422222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map22222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i2422222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var22222222222222222222 = new sm8(pm8Var);
                                            usj track22222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track22222222222222222222;
                                            track22222222222222222222.a(sm8Var22222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 22:
                                            i9 = i23;
                                            if (r3.P == 32) {
                                                c0cVar = c0cVar6;
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_RAW;
                                                o = 4;
                                                i4 = -1;
                                                str2 = null;
                                                list4 = null;
                                                bArr = r3.N;
                                                if (bArr != null) {
                                                }
                                                int i24222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                pm8Var = new pm8();
                                                g = rjc.g(str6);
                                                Map map222222222222222222222 = h0;
                                                if (!g) {
                                                }
                                                str4 = r3.a;
                                                if (str4 != null) {
                                                }
                                                pm8Var.a = Integer.toString(i3);
                                                pm8Var.k = str6;
                                                pm8Var.l = i4;
                                                pm8Var.c = r3.W;
                                                pm8Var.d = i24222222222222222222222;
                                                pm8Var.m = list4;
                                                pm8Var.h = str2;
                                                pm8Var.n = r3.l;
                                                sm8 sm8Var222222222222222222222 = new sm8(pm8Var);
                                                usj track222222222222222222222 = ol6Var.track(r3.c, i10);
                                                r3.X = track222222222222222222222;
                                                track222222222222222222222.a(sm8Var222222222222222222222);
                                                sparseArray.put(r3.c, r3);
                                                c0cVar6 = c0cVar;
                                            } else {
                                                m6k.f0();
                                                c0cVar = c0cVar6;
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_UNKNOWN;
                                                o = -1;
                                                i4 = -1;
                                                str2 = null;
                                                list4 = null;
                                                bArr = r3.N;
                                                if (bArr != null) {
                                                }
                                                int i242222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                pm8Var = new pm8();
                                                g = rjc.g(str6);
                                                Map map2222222222222222222222 = h0;
                                                if (!g) {
                                                }
                                                str4 = r3.a;
                                                if (str4 != null) {
                                                }
                                                pm8Var.a = Integer.toString(i3);
                                                pm8Var.k = str6;
                                                pm8Var.l = i4;
                                                pm8Var.c = r3.W;
                                                pm8Var.d = i242222222222222222222222;
                                                pm8Var.m = list4;
                                                pm8Var.h = str2;
                                                pm8Var.n = r3.l;
                                                sm8 sm8Var2222222222222222222222 = new sm8(pm8Var);
                                                usj track2222222222222222222222 = ol6Var.track(r3.c, i10);
                                                r3.X = track2222222222222222222222;
                                                track2222222222222222222222.a(sm8Var2222222222222222222222);
                                                sparseArray.put(r3.c, r3);
                                                c0cVar6 = c0cVar;
                                            }
                                            break;
                                        case 23:
                                            i9 = i23;
                                            int i40 = r3.P;
                                            if (i40 == 8) {
                                                c0cVar = c0cVar6;
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_RAW;
                                                o = 3;
                                                i4 = -1;
                                                str2 = null;
                                                list4 = null;
                                                bArr = r3.N;
                                                if (bArr != null) {
                                                }
                                                int i2422222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                pm8Var = new pm8();
                                                g = rjc.g(str6);
                                                Map map22222222222222222222222 = h0;
                                                if (!g) {
                                                }
                                                str4 = r3.a;
                                                if (str4 != null) {
                                                }
                                                pm8Var.a = Integer.toString(i3);
                                                pm8Var.k = str6;
                                                pm8Var.l = i4;
                                                pm8Var.c = r3.W;
                                                pm8Var.d = i2422222222222222222222222;
                                                pm8Var.m = list4;
                                                pm8Var.h = str2;
                                                pm8Var.n = r3.l;
                                                sm8 sm8Var22222222222222222222222 = new sm8(pm8Var);
                                                usj track22222222222222222222222 = ol6Var.track(r3.c, i10);
                                                r3.X = track22222222222222222222222;
                                                track22222222222222222222222.a(sm8Var22222222222222222222222);
                                                sparseArray.put(r3.c, r3);
                                                c0cVar6 = c0cVar;
                                            } else if (i40 == 16) {
                                                o = 268435456;
                                                c0cVar = c0cVar6;
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_RAW;
                                                i4 = -1;
                                                str2 = null;
                                                list4 = null;
                                                bArr = r3.N;
                                                if (bArr != null) {
                                                }
                                                int i24222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                pm8Var = new pm8();
                                                g = rjc.g(str6);
                                                Map map222222222222222222222222 = h0;
                                                if (!g) {
                                                }
                                                str4 = r3.a;
                                                if (str4 != null) {
                                                }
                                                pm8Var.a = Integer.toString(i3);
                                                pm8Var.k = str6;
                                                pm8Var.l = i4;
                                                pm8Var.c = r3.W;
                                                pm8Var.d = i24222222222222222222222222;
                                                pm8Var.m = list4;
                                                pm8Var.h = str2;
                                                pm8Var.n = r3.l;
                                                sm8 sm8Var222222222222222222222222 = new sm8(pm8Var);
                                                usj track222222222222222222222222 = ol6Var.track(r3.c, i10);
                                                r3.X = track222222222222222222222222;
                                                track222222222222222222222222.a(sm8Var222222222222222222222222);
                                                sparseArray.put(r3.c, r3);
                                                c0cVar6 = c0cVar;
                                            } else {
                                                m6k.f0();
                                                c0cVar = c0cVar6;
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_UNKNOWN;
                                                o = -1;
                                                i4 = -1;
                                                str2 = null;
                                                list4 = null;
                                                bArr = r3.N;
                                                if (bArr != null) {
                                                }
                                                int i242222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                pm8Var = new pm8();
                                                g = rjc.g(str6);
                                                Map map2222222222222222222222222 = h0;
                                                if (!g) {
                                                }
                                                str4 = r3.a;
                                                if (str4 != null) {
                                                }
                                                pm8Var.a = Integer.toString(i3);
                                                pm8Var.k = str6;
                                                pm8Var.l = i4;
                                                pm8Var.c = r3.W;
                                                pm8Var.d = i242222222222222222222222222;
                                                pm8Var.m = list4;
                                                pm8Var.h = str2;
                                                pm8Var.n = r3.l;
                                                sm8 sm8Var2222222222222222222222222 = new sm8(pm8Var);
                                                usj track2222222222222222222222222 = ol6Var.track(r3.c, i10);
                                                r3.X = track2222222222222222222222222;
                                                track2222222222222222222222222.a(sm8Var2222222222222222222222222);
                                                sparseArray.put(r3.c, r3);
                                                c0cVar6 = c0cVar;
                                            }
                                            break;
                                        case 24:
                                            i9 = i23;
                                            o = lik.o(r3.P);
                                            if (o == 0) {
                                                m6k.f0();
                                                c0cVar = c0cVar6;
                                                i3 = i9;
                                                str6 = MimeTypes.AUDIO_UNKNOWN;
                                                o = -1;
                                                i4 = -1;
                                                str2 = null;
                                                list4 = null;
                                                bArr = r3.N;
                                                if (bArr != null) {
                                                }
                                                int i2422222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                                pm8Var = new pm8();
                                                g = rjc.g(str6);
                                                Map map22222222222222222222222222 = h0;
                                                if (!g) {
                                                }
                                                str4 = r3.a;
                                                if (str4 != null) {
                                                }
                                                pm8Var.a = Integer.toString(i3);
                                                pm8Var.k = str6;
                                                pm8Var.l = i4;
                                                pm8Var.c = r3.W;
                                                pm8Var.d = i2422222222222222222222222222;
                                                pm8Var.m = list4;
                                                pm8Var.h = str2;
                                                pm8Var.n = r3.l;
                                                sm8 sm8Var22222222222222222222222222 = new sm8(pm8Var);
                                                usj track22222222222222222222222222 = ol6Var.track(r3.c, i10);
                                                r3.X = track22222222222222222222222222;
                                                track22222222222222222222222222.a(sm8Var22222222222222222222222222);
                                                sparseArray.put(r3.c, r3);
                                                c0cVar6 = c0cVar;
                                            }
                                            c0cVar = c0cVar6;
                                            i3 = i9;
                                            str6 = MimeTypes.AUDIO_RAW;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i24222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var222222222222222222222222222 = new sm8(pm8Var);
                                            usj track222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track222222222222222222222222222;
                                            track222222222222222222222222222.a(sm8Var222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 25:
                                            i6 = i23;
                                            z4 = hv9.A(d0, r3.a(str5));
                                            c0cVar = c0cVar6;
                                            str6 = MimeTypes.TEXT_SSA;
                                            i3 = i6;
                                            list = z4;
                                            o = -1;
                                            i4 = -1;
                                            list5 = list;
                                            str2 = null;
                                            list4 = list5;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222222222222222222222222222 = new sm8(pm8Var);
                                            usj track2222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222222222222222222222222222;
                                            track2222222222222222222222222222.a(sm8Var2222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 26:
                                            i7 = i23;
                                            u99 a5 = u99.a(new nkk(r3.a(str5)));
                                            List list6 = a5.a;
                                            r3.Y = a5.b;
                                            str3 = a5.d;
                                            str6 = "video/hevc";
                                            list3 = list6;
                                            str2 = str3;
                                            list2 = list3;
                                            c0cVar = c0cVar6;
                                            i3 = i7;
                                            o = -1;
                                            i4 = -1;
                                            list4 = list2;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i2422222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map22222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i2422222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var22222222222222222222222222222 = new sm8(pm8Var);
                                            usj track22222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track22222222222222222222222222222;
                                            track22222222222222222222222222222.a(sm8Var22222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 27:
                                            i3 = i23;
                                            c0cVar = c0cVar6;
                                            str6 = MimeTypes.TEXT_VTT;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i24222222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map222222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24222222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var222222222222222222222222222222 = new sm8(pm8Var);
                                            usj track222222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track222222222222222222222222222222;
                                            track222222222222222222222222222222.a(sm8Var222222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 28:
                                            i3 = i23;
                                            str6 = MimeTypes.APPLICATION_SUBRIP;
                                            c0cVar = c0cVar6;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222222222222222222222222222222 = new sm8(pm8Var);
                                            usj track2222222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222222222222222222222222222222;
                                            track2222222222222222222222222222222.a(sm8Var2222222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 29:
                                            i8 = i23;
                                            str6 = MimeTypes.VIDEO_MPEG2;
                                            c0cVar = c0cVar6;
                                            i3 = i8;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i2422222222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map22222222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i2422222222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var22222222222222222222222222222222 = new sm8(pm8Var);
                                            usj track22222222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track22222222222222222222222222222222;
                                            track22222222222222222222222222222222.a(sm8Var22222222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 30:
                                            i8 = i23;
                                            str6 = MimeTypes.AUDIO_E_AC3;
                                            c0cVar = c0cVar6;
                                            i3 = i8;
                                            o = -1;
                                            i4 = -1;
                                            str2 = null;
                                            list4 = null;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i24222222222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map222222222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i24222222222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var222222222222222222222222222222222 = new sm8(pm8Var);
                                            usj track222222222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track222222222222222222222222222222222;
                                            track222222222222222222222222222222222.a(sm8Var222222222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case 31:
                                            i6 = i23;
                                            List singletonList3 = Collections.singletonList(r3.a(str5));
                                            str6 = MimeTypes.AUDIO_FLAC;
                                            z4 = singletonList3;
                                            c0cVar = c0cVar6;
                                            i3 = i6;
                                            list = z4;
                                            o = -1;
                                            i4 = -1;
                                            list5 = list;
                                            str2 = null;
                                            list4 = list5;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i242222222222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map2222222222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i242222222222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var2222222222222222222222222222222222 = new sm8(pm8Var);
                                            usj track2222222222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track2222222222222222222222222222222222;
                                            track2222222222222222222222222222222222.a(sm8Var2222222222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        case ' ':
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(r3.a(r3.b));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(allocate.order(byteOrder).putLong(r3.R).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r3.S).array());
                                            str6 = MimeTypes.AUDIO_OPUS;
                                            i4 = 5760;
                                            c0cVar = c0cVar6;
                                            i3 = i23;
                                            arrayList = arrayList4;
                                            o = -1;
                                            list5 = arrayList;
                                            str2 = null;
                                            list4 = list5;
                                            bArr = r3.N;
                                            if (bArr != null) {
                                            }
                                            int i2422222222222222222222222222222222222 = (r3.V ? 1 : 0) | (!r3.U ? 2 : 0);
                                            pm8Var = new pm8();
                                            g = rjc.g(str6);
                                            Map map22222222222222222222222222222222222 = h0;
                                            if (!g) {
                                            }
                                            str4 = r3.a;
                                            if (str4 != null) {
                                            }
                                            pm8Var.a = Integer.toString(i3);
                                            pm8Var.k = str6;
                                            pm8Var.l = i4;
                                            pm8Var.c = r3.W;
                                            pm8Var.d = i2422222222222222222222222222222222222;
                                            pm8Var.m = list4;
                                            pm8Var.h = str2;
                                            pm8Var.n = r3.l;
                                            sm8 sm8Var22222222222222222222222222222222222 = new sm8(pm8Var);
                                            usj track22222222222222222222222222222222222 = ol6Var.track(r3.c, i10);
                                            r3.X = track22222222222222222222222222222222222;
                                            track22222222222222222222222222222222222.a(sm8Var22222222222222222222222222222222222);
                                            sparseArray.put(r3.c, r3);
                                            c0cVar6 = c0cVar;
                                            break;
                                        default:
                                            throw r9e.a("Unrecognized codec identifier.", null);
                                    }
                                default:
                                    c0cVar6.u = null;
                                    break;
                            }
                        } else {
                            if (i22 == 19899) {
                                int i41 = c0cVar6.w;
                                if (i41 != -1) {
                                    long j8 = c0cVar6.x;
                                    if (j8 != -1) {
                                        if (i41 == 475249515) {
                                            c0cVar6.z = j8;
                                        }
                                    }
                                }
                                throw r9e.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i22 == 25152) {
                                c0cVar6.e(i22);
                                a0c a0cVar2 = c0cVar6.u;
                                if (a0cVar2.h) {
                                    ssj ssjVar = a0cVar2.j;
                                    if (ssjVar == null) {
                                        throw r9e.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    a0cVar2.l = new DrmInitData(null, z5, new DrmInitData.SchemeData(nc2.a, null, "video/webm", ssjVar.b));
                                }
                            } else if (i22 == 28032) {
                                c0cVar6.e(i22);
                                a0c a0cVar3 = c0cVar6.u;
                                if (a0cVar3.h && a0cVar3.i != null) {
                                    throw r9e.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i22 == 357149030) {
                                if (c0cVar6.r == C.TIME_UNSET) {
                                    c0cVar6.r = 1000000L;
                                }
                                long j9 = c0cVar6.s;
                                if (j9 != C.TIME_UNSET) {
                                    c0cVar6.t = c0cVar6.j(j9);
                                }
                            } else if (i22 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw r9e.a("No valid tracks were found", null);
                                }
                                c0cVar6.b0.endTracks();
                            } else if (i22 == 475249515) {
                                if (!c0cVar6.v) {
                                    ol6 ol6Var2 = c0cVar6.b0;
                                    ojb ojbVar = c0cVar6.C;
                                    ojb ojbVar2 = c0cVar6.D;
                                    if (c0cVar6.q == -1 || c0cVar6.t == C.TIME_UNSET || ojbVar == null || (i14 = ojbVar.b) == 0 || ojbVar2 == null || ojbVar2.b != i14) {
                                        aw0Var = new aw0(c0cVar6.t);
                                    } else {
                                        int[] iArr = new int[i14];
                                        long[] jArr3 = new long[i14];
                                        long[] jArr4 = new long[i14];
                                        long[] jArr5 = new long[i14];
                                        int i42 = 0;
                                        while (i42 < i14) {
                                            jArr5[i42] = ojbVar.d(i42);
                                            jArr3[i42] = ojbVar2.d(i42) + c0cVar6.q;
                                            i42++;
                                            jArr4 = jArr4;
                                        }
                                        long[] jArr6 = jArr4;
                                        int i43 = 0;
                                        while (true) {
                                            int i44 = i14 - 1;
                                            if (i43 < i44) {
                                                int i45 = i43 + 1;
                                                iArr[i43] = (int) (jArr3[i45] - jArr3[i43]);
                                                jArr6[i43] = jArr5[i45] - jArr5[i43];
                                                i43 = i45;
                                            } else {
                                                iArr[i44] = (int) ((c0cVar6.q + c0cVar6.p) - jArr3[i44]);
                                                long j10 = c0cVar6.t - jArr5[i44];
                                                jArr6[i44] = j10;
                                                if (j10 <= 0) {
                                                    m6k.f0();
                                                    iArr = Arrays.copyOf(iArr, i44);
                                                    jArr3 = Arrays.copyOf(jArr3, i44);
                                                    jArr = Arrays.copyOf(jArr6, i44);
                                                    jArr5 = Arrays.copyOf(jArr5, i44);
                                                } else {
                                                    jArr = jArr6;
                                                }
                                                aw0Var = new nu2(iArr, jArr3, jArr, jArr5);
                                            }
                                        }
                                    }
                                    ol6Var2.d(aw0Var);
                                    c0cVar6.v = z5;
                                }
                                c0cVar6.C = null;
                                c0cVar6.D = null;
                            }
                        }
                    } else if (c0cVar6.G == 2) {
                        a0c a0cVar4 = (a0c) sparseArray.get(c0cVar6.M);
                        a0cVar4.X.getClass();
                        if (c0cVar6.R > 0 && "A_OPUS".equals(a0cVar4.b)) {
                            nkk nkkVar4 = c0cVar6.n;
                            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c0cVar6.R).array();
                            nkkVar4.getClass();
                            nkkVar4.C(array, array.length);
                        }
                        int i46 = 0;
                        for (int i47 = 0; i47 < c0cVar6.K; i47++) {
                            i46 += c0cVar6.L[i47];
                        }
                        int i48 = 0;
                        while (i48 < c0cVar6.K) {
                            long j11 = c0cVar6.H + ((a0cVar4.e * i48) / 1000);
                            int i49 = c0cVar6.O;
                            if (i48 == 0 && !c0cVar6.Q) {
                                i49 |= 1;
                            }
                            int i50 = c0cVar6.L[i48];
                            int i51 = i46 - i50;
                            c0cVar6.f(a0cVar4, j11, i49, i50, i51);
                            i48++;
                            i46 = i51;
                        }
                        z3 = false;
                        c0cVar6.G = 0;
                        ml6Var2 = ml6Var;
                        z2 = z3;
                    }
                    z3 = false;
                    ml6Var2 = ml6Var;
                    z2 = z3;
                }
            }
        }
        c0c c0cVar7 = c0cVar2;
        if (z6) {
            return 0;
        }
        int i52 = 0;
        while (true) {
            SparseArray sparseArray2 = c0cVar7.c;
            if (i52 >= sparseArray2.size()) {
                return -1;
            }
            a0c a0cVar5 = (a0c) sparseArray2.valueAt(i52);
            a0cVar5.X.getClass();
            s1k s1kVar = a0cVar5.T;
            if (s1kVar != null) {
                s1kVar.a(a0cVar5.X, a0cVar5.j);
            }
            i52++;
        }
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.b0 = ol6Var;
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        yz1 yz1Var = new yz1(12);
        nkk nkkVar = (nkk) yz1Var.c;
        ap4 ap4Var = (ap4) ml6Var;
        long j = ap4Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        ap4Var.peekFully(nkkVar.a, 0, 4, false);
        long t = nkkVar.t();
        yz1Var.b = 4;
        while (true) {
            if (t != 440786851) {
                int i2 = yz1Var.b + 1;
                yz1Var.b = i2;
                if (i2 == i) {
                    break;
                }
                ap4Var.peekFully(nkkVar.a, 0, 1, false);
                t = ((t << 8) & (-256)) | (nkkVar.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            } else {
                long d = yz1Var.d(ap4Var);
                long j3 = yz1Var.b;
                if (d != Long.MIN_VALUE && (j == -1 || j3 + d < j)) {
                    while (true) {
                        long j4 = yz1Var.b;
                        long j5 = j3 + d;
                        if (j4 < j5) {
                            if (yz1Var.d(ap4Var) != Long.MIN_VALUE) {
                                long d2 = yz1Var.d(ap4Var);
                                if (d2 < 0 || d2 > 2147483647L) {
                                    break;
                                }
                                if (d2 != 0) {
                                    int i3 = (int) d2;
                                    ap4Var.b(i3, false);
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

    public final void e(int i) {
        if (this.u != null) {
            return;
        }
        throw r9e.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(a0c a0cVar, long j, int i, int i2, int i3) {
        byte[] g;
        int i4;
        int i5;
        s1k s1kVar = a0cVar.T;
        if (s1kVar != null) {
            s1kVar.c(a0cVar.X, j, i, i2, i3, a0cVar.j);
        } else {
            if ("S_TEXT/UTF8".equals(a0cVar.b) || "S_TEXT/ASS".equals(a0cVar.b) || "S_TEXT/WEBVTT".equals(a0cVar.b)) {
                if (this.K > 1) {
                    m6k.f0();
                } else {
                    long j2 = this.I;
                    if (j2 == C.TIME_UNSET) {
                        m6k.f0();
                    } else {
                        String str = a0cVar.b;
                        nkk nkkVar = this.k;
                        byte[] bArr = nkkVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                g = g(j2, Ua.s, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                g = g(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                g = g(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                ilg.c();
                                return;
                        }
                        System.arraycopy(g, 0, bArr, i4, g.length);
                        int i6 = nkkVar.b;
                        while (true) {
                            if (i6 < nkkVar.c) {
                                if (nkkVar.a[i6] == 0) {
                                    nkkVar.D(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        a0cVar.X.d(nkkVar.c, nkkVar);
                        i5 = i2 + nkkVar.c;
                        if ((i & 268435456) != 0) {
                            int i7 = this.K;
                            nkk nkkVar2 = this.n;
                            if (i7 > 1) {
                                nkkVar2.B(0);
                            } else {
                                int i8 = nkkVar2.c;
                                a0cVar.X.d(i8, nkkVar2);
                                i5 += i8;
                            }
                        }
                        a0cVar.X.c(j, i, i5, i3, a0cVar.j);
                    }
                }
            }
            i5 = i2;
            if ((i & 268435456) != 0) {
            }
            a0cVar.X.c(j, i, i5, i3, a0cVar.j);
        }
        this.F = true;
    }

    public final void h(ml6 ml6Var, int i) {
        nkk nkkVar = this.g;
        if (nkkVar.c >= i) {
            return;
        }
        byte[] bArr = nkkVar.a;
        if (bArr.length < i) {
            nkkVar.d(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = nkkVar.a;
        int i2 = nkkVar.c;
        ml6Var.readFully(bArr2, i2, i - i2);
        nkkVar.D(i);
    }

    public final void i() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.B(0);
    }

    public final long j(long j) {
        long j2 = this.r;
        if (j2 != C.TIME_UNSET) {
            return lik.D(j, j2, 1000L);
        }
        throw r9e.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int k(ml6 ml6Var, a0c a0cVar, int i, boolean z) {
        char c;
        int b;
        int b2;
        int i2;
        if ("S_TEXT/UTF8".equals(a0cVar.b)) {
            l(ml6Var, c0, i);
            int i3 = this.T;
            i();
            return i3;
        }
        if ("S_TEXT/ASS".equals(a0cVar.b)) {
            l(ml6Var, e0, i);
            int i4 = this.T;
            i();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(a0cVar.b)) {
            l(ml6Var, f0, i);
            int i5 = this.T;
            i();
            return i5;
        }
        usj usjVar = a0cVar.X;
        boolean z2 = this.V;
        nkk nkkVar = this.j;
        char c2 = 2;
        if (z2) {
            c = 2;
        } else {
            boolean z3 = a0cVar.h;
            nkk nkkVar2 = this.g;
            if (z3) {
                this.O &= -1073741825;
                if (!this.W) {
                    ml6Var.readFully(nkkVar2.a, 0, 1);
                    this.S++;
                    byte b3 = nkkVar2.a[0];
                    if ((b3 & 128) == 128) {
                        throw r9e.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = b3;
                    this.W = true;
                }
                byte b4 = this.Z;
                if ((b4 & 1) == 1) {
                    boolean z4 = (b4 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        nkk nkkVar3 = this.l;
                        ml6Var.readFully(nkkVar3.a, 0, 8);
                        this.S += 8;
                        this.a0 = true;
                        nkkVar2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        nkkVar2.E(0);
                        usjVar.d(1, nkkVar2);
                        this.T++;
                        nkkVar3.E(0);
                        usjVar.d(8, nkkVar3);
                        this.T += 8;
                    }
                    if (z4) {
                        if (!this.X) {
                            ml6Var.readFully(nkkVar2.a, 0, 1);
                            this.S++;
                            nkkVar2.E(0);
                            this.Y = nkkVar2.s();
                            this.X = true;
                        }
                        int i6 = this.Y * 4;
                        nkkVar2.B(i6);
                        ml6Var.readFully(nkkVar2.a, 0, i6);
                        this.S += i6;
                        short s = (short) ((this.Y / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.o = ByteBuffer.allocate(i7);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i8 >= i2) {
                                break;
                            }
                            int v = nkkVar2.v();
                            int i10 = i8 % 2;
                            char c3 = c2;
                            ByteBuffer byteBuffer2 = this.o;
                            if (i10 == 0) {
                                byteBuffer2.putShort((short) (v - i9));
                            } else {
                                byteBuffer2.putInt(v - i9);
                            }
                            i8++;
                            i9 = v;
                            c2 = c3;
                        }
                        c = c2;
                        int i11 = (i - this.S) - i9;
                        int i12 = i2 % 2;
                        ByteBuffer byteBuffer3 = this.o;
                        if (i12 == 1) {
                            byteBuffer3.putInt(i11);
                        } else {
                            byteBuffer3.putShort((short) i11);
                            this.o.putInt(0);
                        }
                        byte[] array = this.o.array();
                        nkk nkkVar4 = this.m;
                        nkkVar4.C(array, i7);
                        usjVar.d(i7, nkkVar4);
                        this.T += i7;
                    }
                }
                c = 2;
            } else {
                c = 2;
                byte[] bArr = a0cVar.i;
                if (bArr != null) {
                    nkkVar.C(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(a0cVar.b) ? z : a0cVar.f > 0) {
                this.O |= 268435456;
                this.n.B(0);
                int i13 = (nkkVar.c + i) - this.S;
                nkkVar2.B(4);
                byte[] bArr2 = nkkVar2.a;
                bArr2[0] = (byte) ((i13 >> 24) & 255);
                bArr2[1] = (byte) ((i13 >> 16) & 255);
                bArr2[c] = (byte) ((i13 >> 8) & 255);
                bArr2[3] = (byte) (i13 & 255);
                usjVar.d(4, nkkVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i14 = i + nkkVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(a0cVar.b) && !"V_MPEGH/ISO/HEVC".equals(a0cVar.b)) {
            if (a0cVar.T != null) {
                qx9.t(nkkVar.c == 0);
                a0cVar.T.e(ml6Var);
            }
            while (true) {
                int i15 = this.S;
                if (i15 >= i14) {
                    break;
                }
                int i16 = i14 - i15;
                int c4 = nkkVar.c();
                if (c4 > 0) {
                    b2 = Math.min(i16, c4);
                    usjVar.d(b2, nkkVar);
                } else {
                    b2 = usjVar.b(ml6Var, i16, false);
                }
                this.S += b2;
                this.T += b2;
            }
        } else {
            nkk nkkVar5 = this.f;
            byte[] bArr3 = nkkVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[c] = 0;
            int i17 = a0cVar.Y;
            int i18 = 4 - i17;
            while (this.S < i14) {
                int i19 = this.U;
                if (i19 == 0) {
                    int min = Math.min(i17, nkkVar.c());
                    ml6Var.readFully(bArr3, i18 + min, i17 - min);
                    if (min > 0) {
                        nkkVar.e(bArr3, i18, min);
                    }
                    this.S += i17;
                    nkkVar5.E(0);
                    this.U = nkkVar5.v();
                    nkk nkkVar6 = this.e;
                    nkkVar6.E(0);
                    usjVar.d(4, nkkVar6);
                    this.T += 4;
                } else {
                    int c5 = nkkVar.c();
                    if (c5 > 0) {
                        b = Math.min(i19, c5);
                        usjVar.d(b, nkkVar);
                    } else {
                        b = usjVar.b(ml6Var, i19, false);
                    }
                    this.S += b;
                    this.T += b;
                    this.U -= b;
                }
            }
        }
        if ("A_VORBIS".equals(a0cVar.b)) {
            nkk nkkVar7 = this.h;
            nkkVar7.E(0);
            usjVar.d(4, nkkVar7);
            this.T += 4;
        }
        int i20 = this.T;
        i();
        return i20;
    }

    public final void l(ml6 ml6Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        nkk nkkVar = this.k;
        byte[] bArr2 = nkkVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            nkkVar.getClass();
            nkkVar.C(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ml6Var.readFully(nkkVar.a, bArr.length, i);
        nkkVar.E(0);
        nkkVar.D(length);
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        this.B = C.TIME_UNSET;
        this.G = 0;
        vo4 vo4Var = this.a;
        vo4Var.c = 0;
        vo4Var.b.clear();
        nkk nkkVar = (nkk) vo4Var.f;
        nkkVar.b = 0;
        nkkVar.c = 0;
        nkk nkkVar2 = this.b;
        nkkVar2.b = 0;
        nkkVar2.c = 0;
        i();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            s1k s1kVar = ((a0c) sparseArray.valueAt(i)).T;
            if (s1kVar != null) {
                s1kVar.b = false;
                s1kVar.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
