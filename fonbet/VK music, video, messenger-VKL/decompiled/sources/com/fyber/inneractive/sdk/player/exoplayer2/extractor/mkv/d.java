package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class d {
    public boolean L;
    public r O;
    public int P;
    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.d i;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = 0;
    public byte[] o = null;
    public int p = -1;
    public boolean q = false;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = 1000;
    public int v = 200;
    public float w = -1.0f;
    public float x = -1.0f;
    public float y = -1.0f;
    public float z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public int G = 1;
    public int H = -1;
    public int I = 8000;
    public long J = 0;
    public long K = 0;
    public boolean M = true;
    public String N = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03f8, code lost:
    
        if (r1.g() == r2.getLeastSignificantBits()) goto L220;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0439  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar, int i) {
        char c;
        String str;
        String str2;
        List singletonList;
        String str3;
        int i2;
        String str4;
        List list;
        int i3;
        int i4;
        String str5;
        List singletonList2;
        List list2;
        String str6;
        o oVar;
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar;
        byte[] bArr;
        int i5;
        String str7 = this.a;
        str7.getClass();
        int i6 = 2;
        switch (str7.hashCode()) {
            case -2095576542:
                if (str7.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str7.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str7.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str7.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str7.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str7.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str7.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str7.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str7.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str7.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str7.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str7.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str7.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str7.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str7.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str7.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str7.equals("V_VP8")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str7.equals("V_VP9")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str7.equals("S_HDMV/PGS")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str7.equals("V_THEORA")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str7.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str7.equals("A_PCM/INT/LIT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str7.equals("V_MPEGH/ISO/HEVC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str7.equals("S_TEXT/UTF8")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str7.equals("V_MPEG2")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str7.equals("A_EAC3")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str7.equals("A_FLAC")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str7.equals("A_OPUS")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str8 = MimeTypes.APPLICATION_VOBSUB;
        String str9 = MimeTypes.VIDEO_UNKNOWN;
        String str10 = MimeTypes.AUDIO_RAW;
        switch (c) {
            case 0:
            case 1:
            case '\t':
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                byte[] bArr2 = this.h;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str3 = MimeTypes.VIDEO_MP4V;
                str8 = str3;
                list2 = singletonList;
                i2 = -1;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i7 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                    oVar = o.a(Integer.toString(i), str4, -1, i4, this.G, this.I, i3, -1, -1, list, this.i, i7, this.N, null);
                    i6 = 1;
                } else if ("video".equals(i.b(str4))) {
                    if (this.n == 0) {
                        int i8 = this.l;
                        if (i8 == -1) {
                            i8 = this.j;
                        }
                        this.l = i8;
                        int i9 = this.m;
                        if (i9 == -1) {
                            i9 = this.k;
                        }
                        this.m = i9;
                    }
                    float f = (this.l == -1 || (i5 = this.m) == -1) ? -1.0f : (this.k * r1) / (this.j * i5);
                    if (this.q) {
                        if (this.w == -1.0f || this.x == -1.0f || this.y == -1.0f || this.z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.put((byte) 0);
                            wrap.putShort((short) ((this.w * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.x * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.y * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.z * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.A * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.B * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
                            wrap.putShort((short) (this.E + 0.5f));
                            wrap.putShort((short) (this.F + 0.5f));
                            wrap.putShort((short) this.u);
                            wrap.putShort((short) this.v);
                        }
                        cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.r, this.t, this.s, bArr);
                    } else {
                        cVar = null;
                    }
                    oVar = o.a(Integer.toString(i), str4, i4, this.j, this.k, list, -1, f, this.o, this.p, cVar, this.i);
                } else {
                    String str11 = str4;
                    if (str.equals(str11)) {
                        oVar = o.a(Integer.toString(i), str11, i7, this.N, -1, this.i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        i6 = 3;
                    } else {
                        if (!str2.equals(str11) && !MimeTypes.APPLICATION_PGS.equals(str11) && !MimeTypes.APPLICATION_DVBSUBS.equals(str11)) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unexpected MIME type.");
                        }
                        i6 = 3;
                        oVar = new o(Integer.toString(i), null, str11, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.i, null);
                    }
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a = jVar.a(this.b, i6);
                this.O = a;
                a.a(oVar);
                return;
            case 2:
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                n nVar = new n(this.h);
                try {
                    int f2 = nVar.f();
                    if (f2 != 1) {
                        if (f2 == 65534) {
                            nVar.e(24);
                            long g = nVar.g();
                            UUID uuid = e.b0;
                            if (g == uuid.getMostSignificantBits()) {
                                break;
                            }
                        }
                        i2 = -1;
                        str9 = MimeTypes.AUDIO_UNKNOWN;
                        list2 = null;
                        str10 = str9;
                        str8 = str10;
                        i3 = i2;
                        list = list2;
                        i4 = -1;
                        str4 = str8;
                        int i72 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                        if (!"audio".equals(i.b(str4))) {
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2 = jVar.a(this.b, i6);
                        this.O = a2;
                        a2.a(oVar);
                        return;
                    }
                    i2 = z.a(this.H);
                    if (i2 != 0) {
                        str9 = MimeTypes.AUDIO_RAW;
                        list2 = null;
                        str10 = str9;
                        str8 = str10;
                        i3 = i2;
                        list = list2;
                        i4 = -1;
                        str4 = str8;
                        int i722 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                        if (!"audio".equals(i.b(str4))) {
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22 = jVar.a(this.b, i6);
                        this.O = a22;
                        a22.a(oVar);
                        return;
                    }
                    i2 = -1;
                    str9 = MimeTypes.AUDIO_UNKNOWN;
                    list2 = null;
                    str10 = str9;
                    str8 = str10;
                    i3 = i2;
                    list = list2;
                    i4 = -1;
                    str4 = str8;
                    int i7222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(i.b(str4))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222 = jVar.a(this.b, i6);
                    this.O = a222;
                    a222.a(oVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing MS/ACM codec private");
                }
            case 3:
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str9 = MimeTypes.AUDIO_TRUEHD;
                i2 = -1;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i72222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222 = jVar.a(this.b, i6);
                this.O = a2222;
                a2222.a(oVar);
                return;
            case 4:
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                byte[] bArr3 = this.h;
                try {
                    if (bArr3[0] != 2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                    }
                    int i10 = 0;
                    int i11 = 1;
                    while (true) {
                        int i12 = bArr3[i11];
                        if (i12 == -1) {
                            i10 += 255;
                            i11++;
                        } else {
                            int i13 = i11 + 1;
                            int i14 = i10 + i12;
                            int i15 = 0;
                            while (true) {
                                int i16 = bArr3[i13];
                                if (i16 != -1) {
                                    int i17 = i13 + 1;
                                    int i18 = i15 + i16;
                                    if (bArr3[i17] != 1) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr4 = new byte[i14];
                                    System.arraycopy(bArr3, i17, bArr4, 0, i14);
                                    int i19 = i17 + i14;
                                    if (bArr3[i19] != 3) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    int i20 = i19 + i18;
                                    if (bArr3[i20] != 5) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr5 = new byte[bArr3.length - i20];
                                    System.arraycopy(bArr3, i20, bArr5, 0, bArr3.length - i20);
                                    ArrayList arrayList = new ArrayList(2);
                                    arrayList.add(bArr4);
                                    arrayList.add(bArr5);
                                    str4 = MimeTypes.AUDIO_VORBIS;
                                    list = arrayList;
                                    i3 = -1;
                                    i4 = 8192;
                                    int i722222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                                    if (!"audio".equals(i.b(str4))) {
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222 = jVar.a(this.b, i6);
                                    this.O = a22222;
                                    a22222.a(oVar);
                                    return;
                                }
                                i15 += 255;
                                i13++;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                }
                break;
            case 5:
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str5 = MimeTypes.AUDIO_MPEG_L2;
                str4 = str5;
                i3 = -1;
                list = null;
                i4 = 4096;
                int i7222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222 = jVar.a(this.b, i6);
                this.O = a222222;
                a222222.a(oVar);
                return;
            case 6:
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str5 = MimeTypes.AUDIO_MPEG;
                str4 = str5;
                i3 = -1;
                list = null;
                i4 = 4096;
                int i72222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222 = jVar.a(this.b, i6);
                this.O = a2222222;
                a2222222.a(oVar);
                return;
            case 7:
                byte[] bArr6 = this.h;
                try {
                    if (16 > bArr6.length) {
                        throw new IllegalArgumentException();
                    }
                    byte b = bArr6[16];
                    str2 = MimeTypes.APPLICATION_VOBSUB;
                    long j = b & 255;
                    byte b2 = bArr6[17];
                    str = MimeTypes.APPLICATION_SUBRIP;
                    if ((((b2 & 255) << 8) | j | ((bArr6[18] & 255) << 16) | ((bArr6[19] & 255) << 24)) == 826496599) {
                        for (int i21 = 40; i21 < bArr6.length - 4; i21++) {
                            if (bArr6[i21] == 0 && bArr6[i21 + 1] == 0 && bArr6[i21 + 2] == 1 && bArr6[i21 + 3] == 15) {
                                singletonList2 = Collections.singletonList(Arrays.copyOfRange(bArr6, i21, bArr6.length));
                            }
                        }
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Failed to find FourCC VC1 initialization data");
                    }
                    singletonList2 = null;
                    if (singletonList2 != null) {
                        str9 = MimeTypes.VIDEO_VC1;
                    }
                    list2 = singletonList2;
                    i2 = -1;
                    str10 = str9;
                    str8 = str10;
                    i3 = i2;
                    list = list2;
                    i4 = -1;
                    str4 = str8;
                    int i722222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(i.b(str4))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222 = jVar.a(this.b, i6);
                    this.O = a22222222;
                    a22222222.a(oVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing FourCC VC1 codec private");
                }
            case '\b':
                byte[] bArr7 = this.h;
                list2 = Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str8 = MimeTypes.APPLICATION_DVBSUBS;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i7222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222 = jVar.a(this.b, i6);
                this.O = a222222222;
                a222222222.a(oVar);
                return;
            case '\n':
                com.fyber.inneractive.sdk.player.exoplayer2.video.a a3 = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(new n(this.h));
                list2 = a3.a;
                this.P = a3.b;
                str6 = "video/avc";
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str8 = str6;
                i2 = -1;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i72222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222 = jVar.a(this.b, i6);
                this.O = a2222222222;
                a2222222222.a(oVar);
                return;
            case 11:
                list2 = Collections.singletonList(this.h);
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i722222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222 = jVar.a(this.b, i6);
                this.O = a22222222222;
                a22222222222.a(oVar);
                return;
            case '\f':
                str9 = MimeTypes.AUDIO_DTS_HD;
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i7222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222 = jVar.a(this.b, i6);
                this.O = a222222222222;
                a222222222222.a(oVar);
                return;
            case '\r':
                singletonList = Collections.singletonList(this.h);
                str3 = "audio/mp4a-latm";
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str8 = str3;
                list2 = singletonList;
                i2 = -1;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i72222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222 = jVar.a(this.b, i6);
                this.O = a2222222222222;
                a2222222222222.a(oVar);
                return;
            case 14:
                str9 = MimeTypes.AUDIO_AC3;
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i722222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222 = jVar.a(this.b, i6);
                this.O = a22222222222222;
                a22222222222222.a(oVar);
                return;
            case 15:
            case 20:
                str9 = MimeTypes.AUDIO_DTS;
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i7222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222 = jVar.a(this.b, i6);
                this.O = a222222222222222;
                a222222222222222.a(oVar);
                return;
            case 16:
                str9 = MimeTypes.VIDEO_VP8;
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i72222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222 = jVar.a(this.b, i6);
                this.O = a2222222222222222;
                a2222222222222222.a(oVar);
                return;
            case 17:
                str9 = MimeTypes.VIDEO_VP9;
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i722222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222222 = jVar.a(this.b, i6);
                this.O = a22222222222222222;
                a22222222222222222.a(oVar);
                return;
            case 18:
                str9 = MimeTypes.APPLICATION_PGS;
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i7222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222222 = jVar.a(this.b, i6);
                this.O = a222222222222222222;
                a222222222222222222.a(oVar);
                return;
            case 19:
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i72222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222222 = jVar.a(this.b, i6);
                this.O = a2222222222222222222;
                a2222222222222222222.a(oVar);
                return;
            case 21:
                i2 = z.a(this.H);
                if (i2 != 0) {
                    str = MimeTypes.APPLICATION_SUBRIP;
                    str2 = MimeTypes.APPLICATION_VOBSUB;
                    list2 = null;
                    str8 = str10;
                    i3 = i2;
                    list = list2;
                    i4 = -1;
                    str4 = str8;
                    int i722222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(i.b(str4))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222222222 = jVar.a(this.b, i6);
                    this.O = a22222222222222222222;
                    a22222222222222222222.a(oVar);
                    return;
                }
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str9 = MimeTypes.AUDIO_UNKNOWN;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i7222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222222222 = jVar.a(this.b, i6);
                this.O = a222222222222222222222;
                a222222222222222222222.a(oVar);
                return;
            case 22:
                com.fyber.inneractive.sdk.player.exoplayer2.video.d a4 = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(new n(this.h));
                list2 = a4.a;
                this.P = a4.b;
                str6 = "video/hevc";
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str8 = str6;
                i2 = -1;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i72222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222222222 = jVar.a(this.b, i6);
                this.O = a2222222222222222222222;
                a2222222222222222222222.a(oVar);
                return;
            case 23:
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str9 = str;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i722222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222222222222 = jVar.a(this.b, i6);
                this.O = a22222222222222222222222;
                a22222222222222222222222.a(oVar);
                return;
            case 24:
                str9 = MimeTypes.VIDEO_MPEG2;
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i7222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222222222222 = jVar.a(this.b, i6);
                this.O = a222222222222222222222222;
                a222222222222222222222222.a(oVar);
                return;
            case 25:
                str9 = MimeTypes.AUDIO_E_AC3;
                i2 = -1;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                list2 = null;
                str10 = str9;
                str8 = str10;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i72222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2222222222222222222222222 = jVar.a(this.b, i6);
                this.O = a2222222222222222222222222;
                a2222222222222222222222222.a(oVar);
                return;
            case 26:
                singletonList = Collections.singletonList(this.h);
                str3 = MimeTypes.AUDIO_FLAC;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                str8 = str3;
                list2 = singletonList;
                i2 = -1;
                i3 = i2;
                list = list2;
                i4 = -1;
                str4 = str8;
                int i722222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a22222222222222222222222222 = jVar.a(this.b, i6);
                this.O = a22222222222222222222222222;
                a22222222222222222222222222.a(oVar);
                return;
            case 27:
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(this.h);
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.J).array());
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.K).array());
                list = arrayList2;
                str4 = MimeTypes.AUDIO_OPUS;
                i3 = -1;
                i4 = 5760;
                str = MimeTypes.APPLICATION_SUBRIP;
                str2 = MimeTypes.APPLICATION_VOBSUB;
                int i7222222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(i.b(str4))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a222222222222222222222222222 = jVar.a(this.b, i6);
                this.O = a222222222222222222222222222;
                a222222222222222222222222222.a(oVar);
                return;
            default:
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unrecognized codec identifier.");
        }
    }
}
