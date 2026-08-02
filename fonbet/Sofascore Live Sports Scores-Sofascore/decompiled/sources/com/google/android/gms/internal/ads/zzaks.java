package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzaks {
    public byte[] P;
    public zzahu W;
    public boolean Y;
    public boolean a;
    public String b;
    public zzaht b0;
    public String c;
    public zzv c0;
    public int d;
    public int d0;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public byte[] k;
    public zzahs l;
    public byte[] m;
    public zzq n;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = 0;
    public int u = -1;
    public float v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public byte[] y = null;
    public int z = -1;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = 1000;
    public int E = 200;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public float O = -1.0f;
    public int Q = 1;
    public int R = -1;
    public int S = -1;
    public int T = 8000;
    public long U = 0;
    public long V = 0;
    public boolean X = false;
    public boolean Z = true;
    public String a0 = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02eb, code lost:
    
        if (r1.d() == r2.getLeastSignificantBits()) goto L158;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x05e7  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzaks] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.RuntimeException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        char c;
        List t;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        int i8;
        int i9;
        long a;
        Pair pair;
        String str2;
        String str3;
        ArrayList arrayList;
        int i10;
        String str4;
        String str5;
        List singletonList;
        String str6;
        String str7;
        zzt zztVar;
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        int i16;
        String str8;
        ?? r0 = this;
        String str9 = r0.c;
        ?? r8 = 20;
        switch (str9.hashCode()) {
            case -2095576542:
                if (str9.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str9.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str9.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str9.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str9.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str9.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str9.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str9.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str9.equals("S_DVBSUB")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str9.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str9.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str9.equals("S_VOBSUB")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str9.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str9.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str9.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str9.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str9.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str9.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str9.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str9.equals("S_HDMV/PGS")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str9.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str9.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str9.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str9.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str9.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str9.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 738614379:
                if (str9.equals("S_TEXT/SSA")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str9.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str9.equals("S_TEXT/WEBVTT")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str9.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str9.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str9.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str9.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str9.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str10 = MimeTypes.VIDEO_UNKNOWN;
        String str11 = MimeTypes.AUDIO_UNKNOWN;
        List list = null;
        switch (c) {
            case 0:
                str10 = MimeTypes.VIDEO_VP8;
                str11 = str10;
                i6 = -1;
                str = null;
                i8 = -1;
                i2 = -1;
                list = null;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                    str6 = str;
                    zzfw a2 = zzfw.a(new zzeu(r0.P));
                    if (a2 != null) {
                        str = a2.a;
                        str11 = "video/dolby-vision";
                    }
                    str7 = str11;
                    List list2 = list;
                    int i17 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                    zztVar = new zzt();
                    if (!zzas.a(str7)) {
                        zztVar.G = r0.Q;
                        zztVar.H = r0.S;
                        zztVar.I = r0.T;
                        zztVar.J = i6;
                    } else if (zzas.b(str7)) {
                        if (r0.t == 0) {
                            int i18 = r0.r;
                            i11 = -1;
                            if (i18 == -1) {
                                i18 = r0.o;
                            }
                            r0.r = i18;
                            int i19 = r0.s;
                            if (i19 == -1) {
                                i19 = r0.p;
                            }
                            r0.s = i19;
                        } else {
                            i11 = -1;
                        }
                        float f = (r0.r == i11 || (i16 = r0.s) == i11) ? -1.0f : (r0.p * r1) / (r0.o * i16);
                        if (i7 == i11) {
                            if (i5 != i11) {
                                i7 = i11;
                            } else if (i3 == i11 || r0.C != i11) {
                                i7 = r0.A;
                                i5 = r0.B;
                                i3 = r0.C;
                            } else {
                                i7 = r0.A;
                                i5 = r0.B;
                            }
                        }
                        if (i8 == i11 && (i8 = r0.q) == i11) {
                            i8 = 8;
                        }
                        if (i2 == i11) {
                            int i20 = r0.q;
                            i12 = i20 == i11 ? 8 : i20;
                        } else {
                            i12 = i2;
                        }
                        if (r0.F == -1.0f || r0.G == -1.0f || r0.H == -1.0f || r0.I == -1.0f || r0.J == -1.0f || r0.K == -1.0f || r0.L == -1.0f || r0.M == -1.0f || r0.N == -1.0f) {
                            i13 = 0;
                            bArr = null;
                        } else if (r0.O == -1.0f) {
                            bArr = null;
                            i13 = 0;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            i13 = 0;
                            order.put((byte) 0);
                            order.putShort((short) ((r0.F * 50000.0f) + 0.5f));
                            order.putShort((short) ((r0.G * 50000.0f) + 0.5f));
                            order.putShort((short) ((r0.H * 50000.0f) + 0.5f));
                            order.putShort((short) ((r0.I * 50000.0f) + 0.5f));
                            order.putShort((short) ((r0.J * 50000.0f) + 0.5f));
                            order.putShort((short) ((r0.K * 50000.0f) + 0.5f));
                            order.putShort((short) ((r0.L * 50000.0f) + 0.5f));
                            order.putShort((short) ((r0.M * 50000.0f) + 0.5f));
                            order.putShort((short) (r0.N + 0.5f));
                            order.putShort((short) (r0.O + 0.5f));
                            order.putShort((short) r0.D);
                            order.putShort((short) r0.E);
                        }
                        zzh zzhVar = new zzh();
                        zzhVar.a = i7;
                        zzhVar.b = i3;
                        zzhVar.c = i5;
                        zzhVar.d = bArr;
                        zzhVar.e = i8;
                        zzhVar.f = i12;
                        zzi a3 = zzhVar.a();
                        String str12 = r0.b;
                        if (str12 != null) {
                            Map map = zzakt.r0;
                            if (map.containsKey(str12)) {
                                i14 = ((Integer) map.get(r0.b)).intValue();
                                if (r0.u == 0 && Float.compare(r0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(r0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                    if (Float.compare(r0.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
                                        i15 = i13;
                                    } else if (Float.compare(r0.x, 90.0f) == 0) {
                                        i15 = 90;
                                    } else {
                                        i15 = 180;
                                        if (Float.compare(r0.x, -180.0f) != 0 && Float.compare(r0.x, 180.0f) != 0) {
                                            if (Float.compare(r0.x, -90.0f) == 0) {
                                                i15 = 270;
                                            }
                                        }
                                    }
                                    zztVar.u = r0.o;
                                    zztVar.v = r0.p;
                                    zztVar.B = f;
                                    zztVar.z = i15;
                                    zztVar.C = r0.y;
                                    zztVar.D = r0.z;
                                    zztVar.E = a3;
                                }
                                i15 = i14;
                                zztVar.u = r0.o;
                                zztVar.v = r0.p;
                                zztVar.B = f;
                                zztVar.z = i15;
                                zztVar.C = r0.y;
                                zztVar.D = r0.z;
                                zztVar.E = a3;
                            }
                        }
                        i14 = i11;
                        if (r0.u == 0) {
                            if (Float.compare(r0.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
                            }
                            zztVar.u = r0.o;
                            zztVar.v = r0.p;
                            zztVar.B = f;
                            zztVar.z = i15;
                            zztVar.C = r0.y;
                            zztVar.D = r0.z;
                            zztVar.E = a3;
                        }
                        i15 = i14;
                        zztVar.u = r0.o;
                        zztVar.v = r0.p;
                        zztVar.B = f;
                        zztVar.z = i15;
                        zztVar.C = r0.y;
                        zztVar.D = r0.z;
                        zztVar.E = a3;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str7) && !MimeTypes.TEXT_SSA.equals(str7) && !MimeTypes.TEXT_VTT.equals(str7) && !MimeTypes.APPLICATION_VOBSUB.equals(str7) && !MimeTypes.APPLICATION_PGS.equals(str7) && !MimeTypes.APPLICATION_DVBSUBS.equals(str7)) {
                        throw zzat.a(null, "Unexpected MIME type.");
                    }
                    str8 = r0.b;
                    if (str8 != null && !zzakt.r0.containsKey(str8)) {
                        zztVar.b = r0.b;
                    }
                    zztVar.b(i);
                    zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                    zztVar.d(str7);
                    zztVar.o = i4;
                    zztVar.d = r0.a0;
                    zztVar.e = i17;
                    zztVar.q = list2;
                    zztVar.j = str6;
                    zztVar.r = r0.n;
                    r0.c0 = new zzv(zztVar);
                    return;
                }
                str6 = str;
                str7 = str11;
                List list22 = list;
                int i172 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                    zztVar.b = r0.b;
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i172;
                zztVar.q = list22;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 1:
                byte[] bArr2 = r0.m;
                t = bArr2 == null ? null : zzgxm.t(bArr2);
                str10 = MimeTypes.VIDEO_VP9;
                list = t;
                str11 = str10;
                i6 = -1;
                str = null;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222 = list;
                int i1722 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722;
                zztVar.q = list222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 2:
                byte[] bArr3 = r0.m;
                str10 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                if (bArr3 != null) {
                    t = zzgxm.t(bArr3);
                    zzafl a4 = zzafl.a(r0.m);
                    if (a4 != null) {
                        String str13 = a4.e;
                        i2 = a4.a;
                        int i21 = a4.c;
                        int i22 = a4.d;
                        int i23 = a4.b;
                        i3 = i21;
                        str11 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                        i4 = -1;
                        list = t;
                        i5 = i22;
                        i6 = -1;
                        i7 = i23;
                        str = str13;
                        i8 = i2;
                        if (r0.P != null) {
                        }
                        str6 = str;
                        str7 = str11;
                        List list2222 = list;
                        int i17222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                        zztVar = new zzt();
                        if (!zzas.a(str7)) {
                        }
                        str8 = r0.b;
                        if (str8 != null) {
                        }
                        zztVar.b(i);
                        zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                        zztVar.d(str7);
                        zztVar.o = i4;
                        zztVar.d = r0.a0;
                        zztVar.e = i17222;
                        zztVar.q = list2222;
                        zztVar.j = str6;
                        zztVar.r = r0.n;
                        r0.c0 = new zzv(zztVar);
                        return;
                    }
                    list = t;
                    str11 = str10;
                    i6 = -1;
                    str = null;
                    i8 = -1;
                    i2 = -1;
                    i7 = -1;
                    i3 = -1;
                    i5 = -1;
                    i4 = -1;
                    if (r0.P != null) {
                    }
                    str6 = str;
                    str7 = str11;
                    List list22222 = list;
                    int i172222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                    zztVar = new zzt();
                    if (!zzas.a(str7)) {
                    }
                    str8 = r0.b;
                    if (str8 != null) {
                    }
                    zztVar.b(i);
                    zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                    zztVar.d(str7);
                    zztVar.o = i4;
                    zztVar.d = r0.a0;
                    zztVar.e = i172222;
                    zztVar.q = list22222;
                    zztVar.j = str6;
                    zztVar.r = r0.n;
                    r0.c0 = new zzv(zztVar);
                    return;
                }
                str11 = str10;
                i6 = -1;
                str = null;
                i8 = -1;
                i2 = -1;
                list = null;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222 = list;
                int i1722222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222;
                zztVar.q = list222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 3:
                str10 = MimeTypes.VIDEO_MPEG2;
                str11 = str10;
                i6 = -1;
                str = null;
                i8 = -1;
                i2 = -1;
                list = null;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222 = list;
                int i17222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222;
                zztVar.q = list2222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = r0.m;
                t = bArr4 == null ? null : Collections.singletonList(bArr4);
                str10 = MimeTypes.VIDEO_MP4V;
                list = t;
                str11 = str10;
                i6 = -1;
                str = null;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list22222222 = list;
                int i172222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i172222222;
                zztVar.q = list22222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 7:
                zzafm a5 = zzafm.a(new zzeu(r0.b(r0.c)));
                ArrayList arrayList2 = a5.a;
                r0.d0 = a5.b;
                String str14 = a5.l;
                int i24 = a5.g;
                int i25 = a5.i;
                int i26 = a5.h;
                int i27 = a5.e;
                i9 = a5.f;
                i3 = i26;
                str11 = "video/avc";
                i4 = -1;
                i5 = i25;
                i7 = i24;
                list = arrayList2;
                str = str14;
                i8 = i27;
                i2 = i9;
                i6 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222222 = list;
                int i1722222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222222;
                zztVar.q = list222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case '\b':
                zzahb a6 = zzahb.a(new zzeu(r0.b(r0.c)), false, null);
                List list3 = a6.a;
                r0.d0 = a6.b;
                String str15 = a6.n;
                int i28 = a6.h;
                int i29 = a6.j;
                int i30 = a6.i;
                i8 = a6.f;
                i9 = a6.g;
                i3 = i30;
                str11 = "video/hevc";
                i4 = -1;
                i5 = i29;
                i7 = i28;
                list = list3;
                str = str15;
                i2 = i9;
                i6 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222 = list;
                int i17222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222;
                zztVar.q = list2222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case '\t':
                zzeu zzeuVar = new zzeu(r0.b(r0.c));
                try {
                    zzeuVar.E(16);
                    a = zzeuVar.a();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    r8 = 0;
                }
                try {
                    if (a == 1482049860) {
                        pair = new Pair("video/divx", null);
                    } else if (a == 859189832) {
                        pair = new Pair(MimeTypes.VIDEO_H263, null);
                    } else {
                        if (a != 826496599) {
                            zzeh.c("Unknown FourCC. Setting mimeType to video/x-unknown");
                            str2 = null;
                            pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                            str3 = (String) pair.first;
                            list = (List) pair.second;
                            str = str2;
                            str11 = str3;
                            i6 = -1;
                            i8 = -1;
                            i2 = -1;
                            i7 = -1;
                            i3 = -1;
                            i5 = -1;
                            i4 = -1;
                            if (r0.P != null) {
                            }
                            str6 = str;
                            str7 = str11;
                            List list22222222222 = list;
                            int i172222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                            zztVar = new zzt();
                            if (!zzas.a(str7)) {
                            }
                            str8 = r0.b;
                            if (str8 != null) {
                            }
                            zztVar.b(i);
                            zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                            zztVar.d(str7);
                            zztVar.o = i4;
                            zztVar.d = r0.a0;
                            zztVar.e = i172222222222;
                            zztVar.q = list22222222222;
                            zztVar.j = str6;
                            zztVar.r = r0.n;
                            r0.c0 = new zzv(zztVar);
                            return;
                        }
                        int i31 = zzeuVar.b + 20;
                        byte[] bArr5 = zzeuVar.a;
                        while (true) {
                            int length = bArr5.length;
                            if (i31 >= length - 4) {
                                throw zzat.a(null, "Failed to find FourCC VC1 initialization data");
                            }
                            int i32 = i31 + 1;
                            if (bArr5[i31] == 0 && bArr5[i32] == 0 && bArr5[i31 + 2] == 1) {
                                if (bArr5[i31 + 3] == 15) {
                                    pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr5, i31, length)));
                                }
                            }
                            i31 = i32;
                        }
                    }
                    str2 = null;
                    str3 = (String) pair.first;
                    list = (List) pair.second;
                    str = str2;
                    str11 = str3;
                    i6 = -1;
                    i8 = -1;
                    i2 = -1;
                    i7 = -1;
                    i3 = -1;
                    i5 = -1;
                    i4 = -1;
                    if (r0.P != null) {
                    }
                    str6 = str;
                    str7 = str11;
                    List list222222222222 = list;
                    int i1722222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                    zztVar = new zzt();
                    if (!zzas.a(str7)) {
                    }
                    str8 = r0.b;
                    if (str8 != null) {
                    }
                    zztVar.b(i);
                    zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                    zztVar.d(str7);
                    zztVar.o = i4;
                    zztVar.d = r0.a0;
                    zztVar.e = i1722222222222;
                    zztVar.q = list222222222222;
                    zztVar.j = str6;
                    zztVar.r = r0.n;
                    r0.c0 = new zzv(zztVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw zzat.a(r8, "Error parsing FourCC private data");
                }
            case '\n':
                str11 = str10;
                i6 = -1;
                str = null;
                i8 = -1;
                i2 = -1;
                list = null;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222222 = list;
                int i17222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222222;
                zztVar.q = list2222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 11:
                byte[] b = r0.b(str9);
                try {
                    try {
                        if (b[0] != 2) {
                            throw zzat.a(null, "Error parsing vorbis codec private");
                        }
                        int i33 = 1;
                        int i34 = 0;
                        while (true) {
                            int i35 = b[i33];
                            i33++;
                            int i36 = i35 & 255;
                            if (i36 == 255) {
                                i34 += 255;
                            } else {
                                int i37 = i34 + i36;
                                int i38 = 0;
                                while (true) {
                                    int i39 = b[i33];
                                    i33++;
                                    int i40 = i39 & 255;
                                    if (i40 != 255) {
                                        int i41 = i38 + i40;
                                        if (b[i33] != 1) {
                                            throw zzat.a(null, "Error parsing vorbis codec private");
                                        }
                                        byte[] bArr6 = new byte[i37];
                                        System.arraycopy(b, i33, bArr6, 0, i37);
                                        int i42 = i33 + i37;
                                        if (b[i42] != 3) {
                                            throw zzat.a(null, "Error parsing vorbis codec private");
                                        }
                                        int i43 = i42 + i41;
                                        if (b[i43] != 5) {
                                            throw zzat.a(null, "Error parsing vorbis codec private");
                                        }
                                        int length2 = b.length - i43;
                                        byte[] bArr7 = new byte[length2];
                                        System.arraycopy(b, i43, bArr7, 0, length2);
                                        arrayList = new ArrayList(2);
                                        arrayList.add(bArr6);
                                        arrayList.add(bArr7);
                                        i10 = 8192;
                                        str4 = MimeTypes.AUDIO_VORBIS;
                                        list = arrayList;
                                        i4 = i10;
                                        str11 = str4;
                                        i6 = -1;
                                        str = null;
                                        i8 = -1;
                                        i2 = -1;
                                        i7 = -1;
                                        i3 = -1;
                                        i5 = -1;
                                        if (r0.P != null) {
                                        }
                                        str6 = str;
                                        str7 = str11;
                                        List list22222222222222 = list;
                                        int i172222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                                        zztVar = new zzt();
                                        if (!zzas.a(str7)) {
                                        }
                                        str8 = r0.b;
                                        if (str8 != null) {
                                        }
                                        zztVar.b(i);
                                        zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                                        zztVar.d(str7);
                                        zztVar.o = i4;
                                        zztVar.d = r0.a0;
                                        zztVar.e = i172222222222222;
                                        zztVar.q = list22222222222222;
                                        zztVar.j = str6;
                                        zztVar.r = r0.n;
                                        r0.c0 = new zzv(zztVar);
                                        return;
                                    }
                                    i38 += 255;
                                }
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused3) {
                        throw zzat.a(r0, "Error parsing vorbis codec private");
                    }
                } catch (ArrayIndexOutOfBoundsException unused4) {
                    r0 = 0;
                }
                break;
            case '\f':
                arrayList = new ArrayList(3);
                arrayList.add(r0.b(r0.c));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(allocate.order(byteOrder).putLong(r0.U).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r0.V).array());
                i10 = 5760;
                str4 = MimeTypes.AUDIO_OPUS;
                list = arrayList;
                i4 = i10;
                str11 = str4;
                i6 = -1;
                str = null;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222222222222 = list;
                int i1722222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222222222222;
                zztVar.q = list222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case '\r':
                List singletonList2 = Collections.singletonList(r0.b(str9));
                byte[] bArr8 = r0.m;
                zzafe a7 = zzaff.a(new zzet(bArr8, bArr8.length), false);
                r0.T = a7.a;
                r0.Q = a7.b;
                str = a7.c;
                str3 = MimeTypes.AUDIO_AAC;
                list = singletonList2;
                str11 = str3;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222222222 = list;
                int i17222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222222222;
                zztVar.q = list2222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 14:
                str5 = MimeTypes.AUDIO_MPEG_L2;
                str = null;
                str11 = str5;
                i4 = 4096;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list22222222222222222 = list;
                int i172222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i172222222222222222;
                zztVar.q = list22222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 15:
                str5 = MimeTypes.AUDIO_MPEG;
                str = null;
                str11 = str5;
                i4 = 4096;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222222222222222 = list;
                int i1722222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222222222222222;
                zztVar.q = list222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 16:
                str3 = MimeTypes.AUDIO_AC3;
                str = null;
                str11 = str3;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222222222222 = list;
                int i17222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222222222222;
                zztVar.q = list2222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 17:
                str3 = MimeTypes.AUDIO_E_AC3;
                str = null;
                str11 = str3;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list22222222222222222222 = list;
                int i172222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i172222222222222222222;
                zztVar.q = list22222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 18:
                r0.W = new zzahu();
                str3 = MimeTypes.AUDIO_TRUEHD;
                str = null;
                str11 = str3;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222222222222222222 = list;
                int i1722222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222222222222222222;
                zztVar.q = list222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 19:
                r0.X = true;
                str3 = MimeTypes.AUDIO_DTS;
                str = null;
                str11 = str3;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222222222222222 = list;
                int i17222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222222222222222;
                zztVar.q = list2222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 20:
                str3 = MimeTypes.AUDIO_DTS_EXPRESS;
                str = null;
                str11 = str3;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list22222222222222222222222 = list;
                int i172222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i172222222222222222222222;
                zztVar.q = list22222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 21:
                str3 = MimeTypes.AUDIO_DTS_HD;
                str = null;
                str11 = str3;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222222222222222222222 = list;
                int i1722222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222222222222222222222;
                zztVar.q = list222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 22:
                singletonList = Collections.singletonList(r0.b(str9));
                str = null;
                str11 = MimeTypes.AUDIO_FLAC;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                list = singletonList;
                i6 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222222222222222222 = list;
                int i17222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222222222222222222;
                zztVar.q = list2222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 23:
                zzeu zzeuVar2 = new zzeu(r0.b(r0.c));
                try {
                    int K = zzeuVar2.K();
                    if (K != 1) {
                        if (K == 65534) {
                            zzeuVar2.D(20);
                            int i44 = zzeuVar2.i();
                            if (((i44 >> 18) == 0 && (i44 == 0 || Integer.bitCount(i44) == r0.Q)) != false) {
                                r0.S = i44 == 0 ? -1 : i44 << 2;
                            }
                            long d = zzeuVar2.d();
                            UUID uuid = zzakt.q0;
                            if (d == uuid.getMostSignificantBits()) {
                                break;
                            }
                        }
                        zzeh.c("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        str = null;
                        i6 = -1;
                        i8 = -1;
                        i2 = -1;
                        i7 = -1;
                        i3 = -1;
                        i5 = -1;
                        i4 = -1;
                        if (r0.P != null) {
                        }
                        str6 = str;
                        str7 = str11;
                        List list22222222222222222222222222 = list;
                        int i172222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                        zztVar = new zzt();
                        if (!zzas.a(str7)) {
                        }
                        str8 = r0.b;
                        if (str8 != null) {
                        }
                        zztVar.b(i);
                        zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                        zztVar.d(str7);
                        zztVar.o = i4;
                        zztVar.d = r0.a0;
                        zztVar.e = i172222222222222222222222222;
                        zztVar.q = list22222222222222222222222222;
                        zztVar.j = str6;
                        zztVar.r = r0.n;
                        r0.c0 = new zzv(zztVar);
                        return;
                    }
                    i6 = zzfm.b(r0.R, ByteOrder.LITTLE_ENDIAN);
                    if (i6 == 0) {
                        int i45 = r0.R;
                        StringBuilder sb = new StringBuilder(String.valueOf(i45).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i45);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzeh.c(sb.toString());
                        str = null;
                        i6 = -1;
                        i8 = -1;
                        i2 = -1;
                        i7 = -1;
                        i3 = -1;
                        i5 = -1;
                        i4 = -1;
                        if (r0.P != null) {
                        }
                        str6 = str;
                        str7 = str11;
                        List list222222222222222222222222222 = list;
                        int i1722222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                        zztVar = new zzt();
                        if (!zzas.a(str7)) {
                        }
                        str8 = r0.b;
                        if (str8 != null) {
                        }
                        zztVar.b(i);
                        zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                        zztVar.d(str7);
                        zztVar.o = i4;
                        zztVar.d = r0.a0;
                        zztVar.e = i1722222222222222222222222222;
                        zztVar.q = list222222222222222222222222222;
                        zztVar.j = str6;
                        zztVar.r = r0.n;
                        r0.c0 = new zzv(zztVar);
                        return;
                    }
                    str = null;
                    str11 = MimeTypes.AUDIO_RAW;
                    i8 = -1;
                    i2 = -1;
                    i7 = -1;
                    i3 = -1;
                    i5 = -1;
                    i4 = -1;
                    if (r0.P != null) {
                    }
                    str6 = str;
                    str7 = str11;
                    List list2222222222222222222222222222 = list;
                    int i17222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                    zztVar = new zzt();
                    if (!zzas.a(str7)) {
                    }
                    str8 = r0.b;
                    if (str8 != null) {
                    }
                    zztVar.b(i);
                    zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                    zztVar.d(str7);
                    zztVar.o = i4;
                    zztVar.d = r0.a0;
                    zztVar.e = i17222222222222222222222222222;
                    zztVar.q = list2222222222222222222222222222;
                    zztVar.j = str6;
                    zztVar.r = r0.n;
                    r0.c0 = new zzv(zztVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused5) {
                    throw zzat.a(null, "Error parsing MS/ACM codec private");
                }
            case 24:
                i6 = zzfm.b(r0.R, ByteOrder.LITTLE_ENDIAN);
                if (i6 == 0) {
                    int i46 = r0.R;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i46).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i46);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzeh.c(sb2.toString());
                    str = null;
                    i6 = -1;
                    i8 = -1;
                    i2 = -1;
                    i7 = -1;
                    i3 = -1;
                    i5 = -1;
                    i4 = -1;
                    if (r0.P != null) {
                    }
                    str6 = str;
                    str7 = str11;
                    List list22222222222222222222222222222 = list;
                    int i172222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                    zztVar = new zzt();
                    if (!zzas.a(str7)) {
                    }
                    str8 = r0.b;
                    if (str8 != null) {
                    }
                    zztVar.b(i);
                    zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                    zztVar.d(str7);
                    zztVar.o = i4;
                    zztVar.d = r0.a0;
                    zztVar.e = i172222222222222222222222222222;
                    zztVar.q = list22222222222222222222222222222;
                    zztVar.j = str6;
                    zztVar.r = r0.n;
                    r0.c0 = new zzv(zztVar);
                    return;
                }
                str = null;
                str11 = MimeTypes.AUDIO_RAW;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222222222222222222222222222 = list;
                int i1722222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222222222222222222222222222;
                zztVar.q = list222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 25:
                i6 = zzfm.b(r0.R, ByteOrder.BIG_ENDIAN);
                if (i6 == 0) {
                    int i47 = r0.R;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i47).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i47);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzeh.c(sb3.toString());
                    str = null;
                    i6 = -1;
                    i8 = -1;
                    i2 = -1;
                    i7 = -1;
                    i3 = -1;
                    i5 = -1;
                    i4 = -1;
                    if (r0.P != null) {
                    }
                    str6 = str;
                    str7 = str11;
                    List list2222222222222222222222222222222 = list;
                    int i17222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                    zztVar = new zzt();
                    if (!zzas.a(str7)) {
                    }
                    str8 = r0.b;
                    if (str8 != null) {
                    }
                    zztVar.b(i);
                    zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                    zztVar.d(str7);
                    zztVar.o = i4;
                    zztVar.d = r0.a0;
                    zztVar.e = i17222222222222222222222222222222;
                    zztVar.q = list2222222222222222222222222222222;
                    zztVar.j = str6;
                    zztVar.r = r0.n;
                    r0.c0 = new zzv(zztVar);
                    return;
                }
                str = null;
                str11 = MimeTypes.AUDIO_RAW;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list22222222222222222222222222222222 = list;
                int i172222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i172222222222222222222222222222222;
                zztVar.q = list22222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 26:
                i6 = zzfm.c(r0.R, ByteOrder.LITTLE_ENDIAN);
                if (i6 == 0) {
                    int i48 = r0.R;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i48).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i48);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzeh.c(sb4.toString());
                    str = null;
                    i6 = -1;
                    i8 = -1;
                    i2 = -1;
                    i7 = -1;
                    i3 = -1;
                    i5 = -1;
                    i4 = -1;
                    if (r0.P != null) {
                    }
                    str6 = str;
                    str7 = str11;
                    List list222222222222222222222222222222222 = list;
                    int i1722222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                    zztVar = new zzt();
                    if (!zzas.a(str7)) {
                    }
                    str8 = r0.b;
                    if (str8 != null) {
                    }
                    zztVar.b(i);
                    zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                    zztVar.d(str7);
                    zztVar.o = i4;
                    zztVar.d = r0.a0;
                    zztVar.e = i1722222222222222222222222222222222;
                    zztVar.q = list222222222222222222222222222222222;
                    zztVar.j = str6;
                    zztVar.r = r0.n;
                    r0.c0 = new zzv(zztVar);
                    return;
                }
                str = null;
                str11 = MimeTypes.AUDIO_RAW;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222222222222222222222222222 = list;
                int i17222222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222222222222222222222222222;
                zztVar.q = list2222222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 27:
                str = null;
                str11 = MimeTypes.APPLICATION_SUBRIP;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list22222222222222222222222222222222222 = list;
                int i172222222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i172222222222222222222222222222222222;
                zztVar.q = list22222222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 28:
            case 29:
                byte[] bArr9 = zzakt.m0;
                singletonList = zzgxm.u(zzakt.n0, r0.b(r0.c));
                str11 = MimeTypes.TEXT_SSA;
                str = null;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                list = singletonList;
                i6 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222222222222222222222222222222222 = list;
                int i1722222222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222222222222222222222222222222222;
                zztVar.q = list222222222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 30:
                str = null;
                str11 = MimeTypes.TEXT_VTT;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222222222222222222222222222222 = list;
                int i17222222222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222222222222222222222222222222;
                zztVar.q = list2222222222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case 31:
                singletonList = zzgxm.t(r0.b(str9));
                str11 = MimeTypes.APPLICATION_VOBSUB;
                str = null;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                list = singletonList;
                i6 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list22222222222222222222222222222222222222 = list;
                int i172222222222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i172222222222222222222222222222222222222;
                zztVar.q = list22222222222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case ' ':
                str11 = MimeTypes.APPLICATION_PGS;
                str = null;
                i6 = -1;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list222222222222222222222222222222222222222 = list;
                int i1722222222222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i1722222222222222222222222222222222222222;
                zztVar.q = list222222222222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            case '!':
                byte[] bArr10 = new byte[4];
                System.arraycopy(r0.b(str9), 0, bArr10, 0, 4);
                singletonList = zzgxm.t(bArr10);
                str11 = MimeTypes.APPLICATION_DVBSUBS;
                str = null;
                i8 = -1;
                i2 = -1;
                i7 = -1;
                i3 = -1;
                i5 = -1;
                i4 = -1;
                list = singletonList;
                i6 = -1;
                if (r0.P != null) {
                }
                str6 = str;
                str7 = str11;
                List list2222222222222222222222222222222222222222 = list;
                int i17222222222222222222222222222222222222222 = (r0.Z ? 1 : 0) | (true == r0.Y ? 0 : 2);
                zztVar = new zzt();
                if (!zzas.a(str7)) {
                }
                str8 = r0.b;
                if (str8 != null) {
                }
                zztVar.b(i);
                zztVar.c(true == r0.a ? "video/x-matroska" : "video/webm");
                zztVar.d(str7);
                zztVar.o = i4;
                zztVar.d = r0.a0;
                zztVar.e = i17222222222222222222222222222222222222222;
                zztVar.q = list2222222222222222222222222222222222222222;
                zztVar.j = str6;
                zztVar.r = r0.n;
                r0.c0 = new zzv(zztVar);
                return;
            default:
                throw zzat.a(null, "Unrecognized codec identifier.");
        }
    }

    public final byte[] b(String str) {
        byte[] bArr = this.m;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.a(null, "Missing CodecPrivate for codec ".concat(String.valueOf(str)));
    }
}
