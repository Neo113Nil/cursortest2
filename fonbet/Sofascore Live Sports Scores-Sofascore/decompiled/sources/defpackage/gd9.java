package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gd9 implements w9e {
    public final dd9 a;
    public final zc9 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern p = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern q = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern r = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern s = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern t = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern u = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern w = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern x = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern y = a("CAN-SKIP-DATERANGES");
    public static final Pattern z = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern A = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern B = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern C = a("CAN-BLOCK-RELOAD");
    public static final Pattern D = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern E = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern G = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern I = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern K = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern L = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern M = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern N = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern O = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern P = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern Q = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern R = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern S = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern T = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern U = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern W = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern X = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern Y = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern Z = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern a0 = a("AUTOSELECT");
    public static final Pattern b0 = a("DEFAULT");
    public static final Pattern c0 = a("FORCED");
    public static final Pattern d0 = a("INDEPENDENT");
    public static final Pattern e0 = a("GAP");
    public static final Pattern f0 = a("PRECISE");
    public static final Pattern g0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern j0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern k0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern l0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern o0 = a("END-ON-NEXT");
    public static final Pattern p0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern s0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern t0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern x0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern y0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern z0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern A0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern B0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern C0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public gd9(dd9 dd9Var, zc9 zc9Var) {
        this.a = dd9Var;
        this.b = zc9Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i2];
            schemeDataArr2[i2] = new DrmInitData.SchemeData(schemeData.b, schemeData.c, schemeData.d, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData d(String str, String str2, HashMap hashMap, we2 we2Var) {
        String k2 = k(str, P, "1", hashMap, we2Var);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = Q;
        if (equals) {
            String l2 = l(str, pattern, hashMap, we2Var);
            return new DrmInitData.SchemeData(yc2.d, null, MimeTypes.VIDEO_MP4, Base64.decode(l2.substring(l2.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = yc2.d;
            String str3 = nik.a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(k2)) {
            return null;
        }
        String l3 = l(str, pattern, hashMap, we2Var);
        byte[] decode = Base64.decode(l3.substring(l3.indexOf(44)), 0);
        UUID uuid2 = yc2.e;
        return new DrmInitData.SchemeData(uuid2, null, MimeTypes.VIDEO_MP4, d2a.q(uuid2, null, decode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0a43, code lost:
    
        if (r5.equals(r13) != false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a27, code lost:
    
        if (r13.equals("POINT") != false) goto L362;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0c31  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0c8e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0d34  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0e12  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0e26  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0e3c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0e71  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0e8e  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0db5  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x10f1  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x10f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zc9 f(dd9 dd9Var, zc9 zc9Var, x6k x6kVar, Uri uri, we2 we2Var) {
        Uri uri2;
        HashMap hashMap;
        Iterator it;
        ArrayList arrayList;
        tc9 tc9Var;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        String str;
        int i2;
        String str2;
        int i3;
        long j2;
        int i4;
        uc9 uc9Var;
        String str3;
        long j3;
        String str4;
        HashMap hashMap2;
        ArrayList arrayList3;
        String str5;
        ArrayList arrayList4;
        TreeMap treeMap;
        LinkedHashMap linkedHashMap2;
        String str6;
        int i5;
        DrmInitData drmInitData;
        DrmInitData drmInitData2;
        String str7;
        int i6;
        String str8;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j4;
        String str9;
        int i7;
        DrmInitData drmInitData3;
        String k2;
        String str10;
        long j5;
        long j6;
        String k3;
        ArrayList arrayList7;
        Matcher a;
        String str11;
        ArrayList arrayList8;
        boolean z2;
        ArrayList arrayList9;
        ArrayList arrayList10;
        LinkedHashMap linkedHashMap3;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        char c2;
        ArrayList arrayList14;
        Matcher matcher;
        boolean z3;
        ArrayList arrayList15;
        rc9 rc9Var;
        int i8;
        char c3;
        String str12;
        long j7;
        DrmInitData drmInitData4;
        DrmInitData drmInitData5;
        dd9 dd9Var2 = dd9Var;
        zc9 zc9Var2 = zc9Var;
        we2 we2Var2 = we2Var;
        String uri3 = uri.toString();
        boolean z4 = dd9Var2.c;
        wc9 wc9Var = zc9Var2 != null ? zc9Var2.x : null;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        yc9 yc9Var = new yc9(false, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap2 = new TreeMap();
        String str13 = "";
        int i9 = 0;
        String str14 = "";
        wc9 wc9Var2 = wc9Var;
        long j8 = -1;
        boolean z5 = z4;
        long j9 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z9 = false;
        int i14 = 1;
        DrmInitData drmInitData6 = null;
        DrmInitData drmInitData7 = null;
        String str15 = null;
        String str16 = null;
        uc9 uc9Var2 = null;
        String str17 = null;
        while (true) {
            int i15 = i10;
            String str18 = "POINT";
            yc9 yc9Var2 = yc9Var;
            if (!x6kVar.i()) {
                ArrayList arrayList20 = arrayList16;
                ArrayList arrayList21 = arrayList17;
                ArrayList arrayList22 = arrayList18;
                ArrayList arrayList23 = arrayList19;
                LinkedHashMap linkedHashMap5 = linkedHashMap4;
                uc9 uc9Var3 = uc9Var2;
                HashMap hashMap5 = new HashMap();
                int i16 = i9;
                while (i16 < arrayList22.size()) {
                    ArrayList arrayList24 = arrayList22;
                    vc9 vc9Var = (vc9) arrayList24.get(i16);
                    long j20 = vc9Var.b;
                    if (j20 == -1) {
                        j20 = (j12 + arrayList20.size()) - (arrayList21.isEmpty() ? 1L : 0L);
                    }
                    int i17 = vc9Var.c;
                    if (i17 == -1 && j9 != C.TIME_UNSET) {
                        i17 = (arrayList21.isEmpty() ? ((wc9) jca.H(arrayList20)).m : arrayList21).size() - 1;
                    }
                    Uri uri4 = vc9Var.a;
                    hashMap5.put(uri4, new vc9(uri4, j20, i17));
                    i16++;
                    arrayList22 = arrayList24;
                }
                if (uc9Var3 != null) {
                    arrayList21.add(uc9Var3);
                }
                ArrayList arrayList25 = new ArrayList();
                Iterator it2 = linkedHashMap5.values().iterator();
                while (it2.hasNext()) {
                    sc9 sc9Var = (sc9) it2.next();
                    Uri uri5 = sc9Var.d;
                    if ((uri5 == null && (uri2 = sc9Var.c) != null) || (uri5 != null && (uri2 = sc9Var.c) == null)) {
                        Uri uri6 = uri2;
                        long j21 = sc9Var.e;
                        if (j21 != C.TIME_UNSET) {
                            String str19 = sc9Var.a;
                            long j22 = sc9Var.f;
                            long j23 = sc9Var.g;
                            it = it2;
                            arrayList = arrayList20;
                            long j24 = sc9Var.h;
                            hashMap = hashMap5;
                            ArrayList arrayList26 = sc9Var.i;
                            boolean z10 = sc9Var.j;
                            long j25 = sc9Var.k;
                            long j26 = sc9Var.l;
                            ArrayList arrayList27 = sc9Var.m;
                            ArrayList arrayList28 = sc9Var.n;
                            ArrayList arrayList29 = new ArrayList(sc9Var.b.values());
                            Boolean bool = sc9Var.o;
                            boolean z11 = bool == null || bool.booleanValue();
                            String str20 = sc9Var.p;
                            String str21 = str20 != null ? str20 : "POINT";
                            String str22 = sc9Var.q;
                            tc9Var = new tc9(str19, uri6, uri5, j21, j22, j23, j24, arrayList26, z10, j25, j26, arrayList27, arrayList28, arrayList29, z11, str21, str22 != null ? str22 : "HIGHLIGHT", sc9Var.r, sc9Var.s, sc9Var.t);
                            if (tc9Var == null) {
                                arrayList25.add(tc9Var);
                            }
                            it2 = it;
                            hashMap5 = hashMap;
                            arrayList20 = arrayList;
                        }
                    }
                    hashMap = hashMap5;
                    it = it2;
                    arrayList = arrayList20;
                    tc9Var = null;
                    if (tc9Var == null) {
                    }
                    it2 = it;
                    hashMap5 = hashMap;
                    arrayList20 = arrayList;
                }
                HashMap hashMap6 = hashMap5;
                ArrayList arrayList30 = arrayList20;
                if (j14 == 0 && zc9Var != null && zc9Var.p) {
                    j14 = zc9Var.h;
                }
                return new zc9(i13, uri.toString(), arrayList23, j10, z7, j14, z6, i11, j12, i14, j11, j9, z5, z8, j14 != 0, drmInitData6, arrayList30, arrayList21, yc9Var2, hashMap6, arrayList25, wc9Var2);
            }
            String o2 = x6kVar.o();
            HashMap hashMap7 = hashMap4;
            if (o2.startsWith("#EXT")) {
                arrayList19.add(o2);
            }
            if (o2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String l2 = l(o2, w, hashMap3, we2Var2);
                if ("VOD".equals(l2)) {
                    i13 = 1;
                } else if ("EVENT".equals(l2)) {
                    i13 = 2;
                }
                i10 = i15;
                yc9Var = yc9Var2;
            } else if (o2.equals("#EXT-X-I-FRAMES-ONLY")) {
                i10 = i15;
                yc9Var = yc9Var2;
                hashMap4 = hashMap7;
                z9 = true;
            } else {
                if (o2.startsWith("#EXT-X-START")) {
                    arrayList2 = arrayList19;
                    linkedHashMap = linkedHashMap4;
                    long parseDouble = (long) (Double.parseDouble(l(o2, I, Collections.EMPTY_MAP, we2Var2)) * 1000000.0d);
                    z7 = h(o2, f0, we2Var2);
                    j10 = parseDouble;
                } else {
                    arrayList2 = arrayList19;
                    linkedHashMap = linkedHashMap4;
                    if (o2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double i18 = i(o2, x, -9.223372036854776E18d, we2Var2);
                        long j27 = i18 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i18 * 1000000.0d);
                        boolean h2 = h(o2, y, we2Var2);
                        double i19 = i(o2, A, -9.223372036854776E18d, we2Var2);
                        long j28 = i19 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i19 * 1000000.0d);
                        double i20 = i(o2, B, -9.223372036854776E18d, we2Var2);
                        arrayList19 = arrayList2;
                        i10 = i15;
                        hashMap4 = hashMap7;
                        linkedHashMap4 = linkedHashMap;
                        yc9Var = new yc9(h2, j27, j28, i20 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i20 * 1000000.0d), h(o2, C, we2Var2));
                    } else if (o2.startsWith("#EXT-X-PART-INF")) {
                        j9 = (long) (Double.parseDouble(l(o2, u, Collections.EMPTY_MAP, we2Var2)) * 1000000.0d);
                    } else {
                        boolean startsWith = o2.startsWith("#EXT-X-MAP");
                        Pattern pattern = K;
                        Pattern pattern2 = Q;
                        if (startsWith) {
                            String l3 = l(o2, pattern2, hashMap3, we2Var2);
                            String k4 = k(o2, pattern, null, hashMap3, we2Var2);
                            if (k4 != null) {
                                String str23 = nik.a;
                                String[] split = k4.split("@", -1);
                                j8 = Long.parseLong(split[i9]);
                                if (split.length > 1) {
                                    j16 = Long.parseLong(split[1]);
                                }
                            }
                            long j29 = j8;
                            long j30 = j29 == -1 ? 0L : j16;
                            if (str15 != null && str16 == null) {
                                throw s9e.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            wc9 wc9Var3 = new wc9(l3, j30, j29, str15, str16);
                            String str24 = str16;
                            if (j29 != -1) {
                                j30 += j29;
                            }
                            j16 = j30;
                            wc9Var2 = wc9Var3;
                            i10 = i15;
                            j8 = -1;
                            yc9Var = yc9Var2;
                            hashMap4 = hashMap7;
                            linkedHashMap4 = linkedHashMap;
                            arrayList19 = arrayList2;
                            str16 = str24;
                        } else {
                            String str25 = str16;
                            ArrayList arrayList31 = arrayList17;
                            ArrayList arrayList32 = arrayList18;
                            if (o2.startsWith("#EXT-X-TARGETDURATION")) {
                                j11 = Integer.parseInt(l(o2, r, Collections.EMPTY_MAP, we2Var2)) * 1000000;
                            } else if (o2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j15 = Long.parseLong(l(o2, D, Collections.EMPTY_MAP, we2Var2));
                                i10 = i15;
                                j12 = j15;
                                yc9Var = yc9Var2;
                                hashMap4 = hashMap7;
                                linkedHashMap4 = linkedHashMap;
                                arrayList19 = arrayList2;
                                str16 = str25;
                                arrayList18 = arrayList32;
                                arrayList17 = arrayList31;
                            } else if (o2.startsWith("#EXT-X-VERSION")) {
                                i14 = Integer.parseInt(l(o2, v, Collections.EMPTY_MAP, we2Var2));
                            } else {
                                if (o2.startsWith("#EXT-X-DEFINE")) {
                                    String k5 = k(o2, V, null, hashMap3, we2Var2);
                                    String k6 = k(o2, W, null, hashMap3, we2Var2);
                                    if (k5 != null) {
                                        n(k5, hashMap3);
                                        hashMap3.put(k5, l(o2, g0, hashMap3, we2Var2));
                                    } else if (k6 != null) {
                                        n(k6, hashMap3);
                                        String queryParameter = uri.getQueryParameter(k6);
                                        if (queryParameter == null) {
                                            throw s9e.b("QUERYPARAM \"" + k6 + "\" not found in playlist URI", null);
                                        }
                                        hashMap3.put(k6, queryParameter);
                                    } else {
                                        String l4 = l(o2, h0, hashMap3, we2Var2);
                                        n(l4, hashMap3);
                                        String str26 = (String) dd9Var2.l.get(l4);
                                        if (str26 != null) {
                                            hashMap3.put(l4, str26);
                                        }
                                    }
                                    str = str15;
                                    i2 = i15;
                                    str2 = str13;
                                    i3 = i9;
                                    j2 = j8;
                                    i4 = i12;
                                    uc9Var = uc9Var2;
                                    str3 = str17;
                                    j3 = j18;
                                    str4 = str14;
                                    hashMap2 = hashMap7;
                                    arrayList3 = arrayList31;
                                    str5 = uri3;
                                    arrayList4 = arrayList16;
                                    treeMap = treeMap2;
                                    linkedHashMap2 = linkedHashMap;
                                } else if (o2.startsWith("#EXTINF")) {
                                    j18 = new BigDecimal(l(o2, E, Collections.EMPTY_MAP, we2Var2)).multiply(new BigDecimal(1000000L)).longValue();
                                    str14 = k(o2, F, str13, hashMap3, we2Var2);
                                } else if (o2.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(l(o2, z, Collections.EMPTY_MAP, we2Var2));
                                    z1a.E((zc9Var2 == null || !arrayList16.isEmpty()) ? i9 : 1);
                                    String str27 = nik.a;
                                    long j31 = zc9Var2.k;
                                    hv9 hv9Var = zc9Var2.r;
                                    int i21 = (int) (j12 - j31);
                                    int i22 = parseInt + i21;
                                    if (i21 >= 0 && i22 <= hv9Var.size()) {
                                        long j32 = j17;
                                        str16 = str25;
                                        while (i21 < i22) {
                                            wc9 wc9Var4 = (wc9) hv9Var.get(i21);
                                            if (j12 != zc9Var2.k) {
                                                int i23 = (zc9Var2.j - i11) + wc9Var4.d;
                                                hv9 hv9Var2 = wc9Var4.m;
                                                ArrayList arrayList33 = new ArrayList();
                                                int i24 = i9;
                                                long j33 = j32;
                                                while (i24 < hv9Var2.size()) {
                                                    uc9 uc9Var4 = (uc9) hv9Var2.get(i24);
                                                    arrayList33.add(new uc9(uc9Var4.a, uc9Var4.b, uc9Var4.c, i23, j33, uc9Var4.f, uc9Var4.g, uc9Var4.h, uc9Var4.i, uc9Var4.j, uc9Var4.k, uc9Var4.l, uc9Var4.m));
                                                    j33 += uc9Var4.c;
                                                    i24++;
                                                    str13 = str13;
                                                }
                                                str6 = str13;
                                                wc9Var4 = new wc9(wc9Var4.a, wc9Var4.b, wc9Var4.l, wc9Var4.c, i23, j32, wc9Var4.f, wc9Var4.g, wc9Var4.h, wc9Var4.i, wc9Var4.j, wc9Var4.k, arrayList33);
                                            } else {
                                                str6 = str13;
                                            }
                                            arrayList16.add(wc9Var4);
                                            long j34 = wc9Var4.c;
                                            String str28 = wc9Var4.h;
                                            j32 += j34;
                                            long j35 = wc9Var4.j;
                                            if (j35 != -1) {
                                                j16 = wc9Var4.i + j35;
                                            }
                                            int i25 = wc9Var4.d;
                                            wc9 wc9Var5 = wc9Var4.b;
                                            DrmInitData drmInitData8 = wc9Var4.f;
                                            String str29 = wc9Var4.g;
                                            if (str28 == null || !str28.equals(Long.toHexString(j15))) {
                                                str16 = str28;
                                            }
                                            j15++;
                                            i21++;
                                            i15 = i25;
                                            wc9Var2 = wc9Var5;
                                            str15 = str29;
                                            drmInitData7 = drmInitData8;
                                            j13 = j32;
                                            str13 = str6;
                                        }
                                        dd9Var2 = dd9Var;
                                        i10 = i15;
                                        yc9Var = yc9Var2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap4 = linkedHashMap;
                                        arrayList19 = arrayList2;
                                        arrayList18 = arrayList32;
                                        arrayList17 = arrayList31;
                                        j17 = j32;
                                    }
                                } else {
                                    str2 = str13;
                                    if (o2.startsWith("#EXT-X-KEY")) {
                                        String l5 = l(o2, N, hashMap3, we2Var2);
                                        String k7 = k(o2, O, "identity", hashMap3, we2Var2);
                                        if ("NONE".equals(l5)) {
                                            treeMap2.clear();
                                            drmInitData7 = null;
                                            str15 = null;
                                            str16 = null;
                                        } else {
                                            String k8 = k(o2, R, null, hashMap3, we2Var2);
                                            if (!"identity".equals(k7)) {
                                                String str30 = str17;
                                                if (str30 == null) {
                                                    str17 = ("SAMPLE-AES-CENC".equals(l5) || "SAMPLE-AES-CTR".equals(l5)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
                                                } else {
                                                    str17 = str30;
                                                }
                                                DrmInitData.SchemeData d2 = d(o2, k7, hashMap3, we2Var2);
                                                if (d2 != null) {
                                                    treeMap2.put(k7, d2);
                                                    str16 = k8;
                                                    drmInitData7 = null;
                                                    str15 = null;
                                                }
                                            } else if ("AES-128".equals(l5)) {
                                                str15 = l(o2, pattern2, hashMap3, we2Var2);
                                                str16 = k8;
                                            }
                                            str16 = k8;
                                            str15 = null;
                                        }
                                        dd9Var2 = dd9Var;
                                        i10 = i15;
                                        yc9Var = yc9Var2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap4 = linkedHashMap;
                                        arrayList19 = arrayList2;
                                    } else {
                                        String str31 = str17;
                                        if (o2.startsWith("#EXT-X-BYTERANGE")) {
                                            String l6 = l(o2, J, hashMap3, we2Var2);
                                            String str32 = nik.a;
                                            String[] split2 = l6.split("@", -1);
                                            j8 = Long.parseLong(split2[i9]);
                                            if (split2.length > 1) {
                                                j16 = Long.parseLong(split2[1]);
                                            }
                                        } else if (o2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i11 = Integer.parseInt(o2.substring(o2.indexOf(58) + 1));
                                            dd9Var2 = dd9Var;
                                            str17 = str31;
                                            i10 = i15;
                                            yc9Var = yc9Var2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap4 = linkedHashMap;
                                            arrayList19 = arrayList2;
                                            str16 = str25;
                                            arrayList18 = arrayList32;
                                            arrayList17 = arrayList31;
                                            str13 = str2;
                                            z6 = true;
                                        } else if (o2.equals("#EXT-X-DISCONTINUITY")) {
                                            i10 = i15 + 1;
                                            dd9Var2 = dd9Var;
                                            str17 = str31;
                                            yc9Var = yc9Var2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap4 = linkedHashMap;
                                            arrayList19 = arrayList2;
                                            str16 = str25;
                                        } else {
                                            if (o2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j14 == 0) {
                                                    j14 = nik.T(nik.W(o2.substring(o2.indexOf(58) + 1))) - j17;
                                                }
                                            } else if (o2.equals("#EXT-X-GAP")) {
                                                dd9Var2 = dd9Var;
                                                str17 = str31;
                                                i10 = i15;
                                                yc9Var = yc9Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap4 = linkedHashMap;
                                                arrayList19 = arrayList2;
                                                str16 = str25;
                                                arrayList18 = arrayList32;
                                                arrayList17 = arrayList31;
                                                str13 = str2;
                                                i12 = 1;
                                            } else if (o2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                dd9Var2 = dd9Var;
                                                str17 = str31;
                                                i10 = i15;
                                                yc9Var = yc9Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap4 = linkedHashMap;
                                                arrayList19 = arrayList2;
                                                str16 = str25;
                                                arrayList18 = arrayList32;
                                                arrayList17 = arrayList31;
                                                str13 = str2;
                                                z5 = true;
                                            } else if (o2.equals("#EXT-X-ENDLIST")) {
                                                dd9Var2 = dd9Var;
                                                str17 = str31;
                                                i10 = i15;
                                                yc9Var = yc9Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap4 = linkedHashMap;
                                                arrayList19 = arrayList2;
                                                str16 = str25;
                                                arrayList18 = arrayList32;
                                                arrayList17 = arrayList31;
                                                str13 = str2;
                                                z8 = true;
                                            } else if (o2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long j36 = j(o2, G, we2Var2);
                                                int i26 = we2.b;
                                                Matcher a2 = we2Var2.a(o2, H);
                                                if (a2.find()) {
                                                    String group = a2.group(1);
                                                    group.getClass();
                                                    i5 = Integer.parseInt(group);
                                                } else {
                                                    i5 = -1;
                                                }
                                                arrayList32.add(new vc9(Uri.parse(tba.K(uri3, l(o2, pattern2, hashMap3, we2Var2))), j36, i5));
                                            } else if (o2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                uc9 uc9Var5 = uc9Var2;
                                                if (uc9Var5 == null && "PART".equals(l(o2, T, hashMap3, we2Var2))) {
                                                    DrmInitData drmInitData9 = drmInitData7;
                                                    String l7 = l(o2, pattern2, hashMap3, we2Var2);
                                                    long j37 = j(o2, L, we2Var2);
                                                    long j38 = j(o2, M, we2Var2);
                                                    String hexString = str15 == null ? null : str25 != null ? str25 : Long.toHexString(j15);
                                                    if (drmInitData9 != null || treeMap2.isEmpty()) {
                                                        drmInitData = drmInitData9;
                                                    } else {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[i9]);
                                                        DrmInitData drmInitData10 = new DrmInitData(str31, true, schemeDataArr);
                                                        if (drmInitData6 == null) {
                                                            drmInitData2 = b(str31, schemeDataArr);
                                                            drmInitData = drmInitData10;
                                                            if (j37 == -1 && j38 == -1) {
                                                                str7 = str15;
                                                                i6 = i15;
                                                                uc9Var2 = uc9Var5;
                                                            } else {
                                                                if (j37 == -1) {
                                                                    j37 = 0;
                                                                }
                                                                long j39 = j13;
                                                                uc9 uc9Var6 = new uc9(l7, wc9Var2, 0L, i15, j39, drmInitData, str15, hexString, j37, j38, false, false, true);
                                                                j13 = j39;
                                                                str7 = str15;
                                                                i6 = i15;
                                                                uc9Var2 = uc9Var6;
                                                            }
                                                            arrayList18 = arrayList32;
                                                            str17 = str31;
                                                            drmInitData6 = drmInitData2;
                                                            drmInitData7 = drmInitData;
                                                            i10 = i6;
                                                            str15 = str7;
                                                            yc9Var = yc9Var2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap4 = linkedHashMap;
                                                            arrayList19 = arrayList2;
                                                            str16 = str25;
                                                            arrayList17 = arrayList31;
                                                            str13 = str2;
                                                            i9 = 0;
                                                            dd9Var2 = dd9Var;
                                                        } else {
                                                            drmInitData = drmInitData10;
                                                        }
                                                    }
                                                    drmInitData2 = drmInitData6;
                                                    if (j37 == -1) {
                                                    }
                                                    if (j37 == -1) {
                                                    }
                                                    long j392 = j13;
                                                    uc9 uc9Var62 = new uc9(l7, wc9Var2, 0L, i15, j392, drmInitData, str15, hexString, j37, j38, false, false, true);
                                                    j13 = j392;
                                                    str7 = str15;
                                                    i6 = i15;
                                                    uc9Var2 = uc9Var62;
                                                    arrayList18 = arrayList32;
                                                    str17 = str31;
                                                    drmInitData6 = drmInitData2;
                                                    drmInitData7 = drmInitData;
                                                    i10 = i6;
                                                    str15 = str7;
                                                    yc9Var = yc9Var2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap4 = linkedHashMap;
                                                    arrayList19 = arrayList2;
                                                    str16 = str25;
                                                    arrayList17 = arrayList31;
                                                    str13 = str2;
                                                    i9 = 0;
                                                    dd9Var2 = dd9Var;
                                                } else {
                                                    str = str15;
                                                    i2 = i15;
                                                    arrayList32 = arrayList32;
                                                    str5 = uri3;
                                                    uc9Var = uc9Var5;
                                                    str3 = str31;
                                                    arrayList4 = arrayList16;
                                                    treeMap = treeMap2;
                                                    i3 = i9;
                                                    j2 = j8;
                                                    i4 = i12;
                                                    j3 = j18;
                                                    str4 = str14;
                                                    hashMap2 = hashMap7;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList3 = arrayList31;
                                                }
                                            } else {
                                                str = str15;
                                                i2 = i15;
                                                DrmInitData drmInitData11 = drmInitData7;
                                                uc9 uc9Var7 = uc9Var2;
                                                if (o2.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str == null ? null : str25 != null ? str25 : Long.toHexString(j15);
                                                    String l8 = l(o2, pattern2, hashMap3, we2Var2);
                                                    long parseDouble2 = (long) (Double.parseDouble(l(o2, s, Collections.EMPTY_MAP, we2Var2)) * 1000000.0d);
                                                    boolean h3 = h(o2, d0, we2Var2) | (z5 && arrayList31.isEmpty());
                                                    boolean h4 = h(o2, e0, we2Var2);
                                                    String k9 = k(o2, pattern, null, hashMap3, we2Var2);
                                                    if (k9 != null) {
                                                        String str33 = nik.a;
                                                        String[] split3 = k9.split("@", -1);
                                                        j7 = Long.parseLong(split3[0]);
                                                        str12 = uri3;
                                                        if (split3.length > 1) {
                                                            j19 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        str12 = uri3;
                                                        j7 = -1;
                                                    }
                                                    if (j7 == -1) {
                                                        j19 = 0;
                                                    }
                                                    if (drmInitData11 != null || treeMap2.isEmpty()) {
                                                        drmInitData4 = drmInitData11;
                                                    } else {
                                                        DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData12 = new DrmInitData(str31, true, schemeDataArr2);
                                                        if (drmInitData6 == null) {
                                                            drmInitData5 = b(str31, schemeDataArr2);
                                                            drmInitData4 = drmInitData12;
                                                            long j40 = j13;
                                                            arrayList31.add(new uc9(l8, wc9Var2, parseDouble2, i2, j40, drmInitData4, str, hexString2, j19, j7, h4, h3, false));
                                                            j13 = j40 + parseDouble2;
                                                            if (j7 != -1) {
                                                                j19 += j7;
                                                            }
                                                            arrayList18 = arrayList32;
                                                            str17 = str31;
                                                            drmInitData6 = drmInitData5;
                                                            arrayList17 = arrayList31;
                                                            drmInitData7 = drmInitData4;
                                                            i10 = i2;
                                                            str15 = str;
                                                            uri3 = str12;
                                                            yc9Var = yc9Var2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap4 = linkedHashMap;
                                                            arrayList19 = arrayList2;
                                                            str16 = str25;
                                                            str13 = str2;
                                                            i9 = 0;
                                                            dd9Var2 = dd9Var;
                                                            uc9Var2 = uc9Var7;
                                                        } else {
                                                            drmInitData4 = drmInitData12;
                                                        }
                                                    }
                                                    drmInitData5 = drmInitData6;
                                                    long j402 = j13;
                                                    arrayList31.add(new uc9(l8, wc9Var2, parseDouble2, i2, j402, drmInitData4, str, hexString2, j19, j7, h4, h3, false));
                                                    j13 = j402 + parseDouble2;
                                                    if (j7 != -1) {
                                                    }
                                                    arrayList18 = arrayList32;
                                                    str17 = str31;
                                                    drmInitData6 = drmInitData5;
                                                    arrayList17 = arrayList31;
                                                    drmInitData7 = drmInitData4;
                                                    i10 = i2;
                                                    str15 = str;
                                                    uri3 = str12;
                                                    yc9Var = yc9Var2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap4 = linkedHashMap;
                                                    arrayList19 = arrayList2;
                                                    str16 = str25;
                                                    str13 = str2;
                                                    i9 = 0;
                                                    dd9Var2 = dd9Var;
                                                    uc9Var2 = uc9Var7;
                                                } else {
                                                    str5 = uri3;
                                                    if (o2.startsWith("#EXT-X-DATERANGE")) {
                                                        if (k(o2, j0, str2, hashMap3, we2Var2).equals("com.apple.hls.interstitial")) {
                                                            String l9 = l(o2, i0, hashMap3, we2Var2);
                                                            String k10 = k(o2, p0, null, hashMap3, we2Var2);
                                                            Uri parse = k10 != null ? Uri.parse(k10) : null;
                                                            arrayList5 = arrayList31;
                                                            String k11 = k(o2, q0, null, hashMap3, we2Var2);
                                                            Uri parse2 = k11 != null ? Uri.parse(k11) : null;
                                                            drmInitData7 = drmInitData11;
                                                            String k12 = k(o2, k0, null, hashMap3, we2Var2);
                                                            long T2 = k12 != null ? nik.T(nik.W(k12)) : -9223372036854775807L;
                                                            String k13 = k(o2, m0, null, hashMap3, we2Var2);
                                                            long T3 = k13 != null ? nik.T(nik.W(k13)) : -9223372036854775807L;
                                                            ArrayList arrayList34 = new ArrayList();
                                                            str2 = str2;
                                                            String k14 = k(o2, l0, null, hashMap3, we2Var2);
                                                            if (k14 != null) {
                                                                String str34 = nik.a;
                                                                treeMap = treeMap2;
                                                                String[] split4 = k14.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
                                                                int length = split4.length;
                                                                int i27 = 0;
                                                                while (i27 < length) {
                                                                    int i28 = i27;
                                                                    String trim = split4[i27].trim();
                                                                    trim.getClass();
                                                                    switch (trim.hashCode()) {
                                                                        case 79491:
                                                                            i8 = length;
                                                                            if (trim.equals("PRE")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 2430593:
                                                                            i8 = length;
                                                                            if (trim.equals("ONCE")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 2461856:
                                                                            i8 = length;
                                                                            if (trim.equals(C4094gc.b)) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            i8 = length;
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                            arrayList34.add(trim);
                                                                            break;
                                                                    }
                                                                    i27 = i28 + 1;
                                                                    length = i8;
                                                                }
                                                            } else {
                                                                treeMap = treeMap2;
                                                            }
                                                            arrayList32 = arrayList32;
                                                            double i29 = i(o2, t, -1.0d, we2Var2);
                                                            long j41 = i29 >= 0.0d ? (long) (i29 * 1000000.0d) : -9223372036854775807L;
                                                            uc9 uc9Var8 = uc9Var7;
                                                            double i30 = i(o2, n0, -1.0d, we2Var2);
                                                            long j42 = i30 >= 0.0d ? (long) (i30 * 1000000.0d) : -9223372036854775807L;
                                                            boolean h5 = h(o2, o0, we2Var2);
                                                            double i31 = i(o2, r0, Double.MIN_VALUE, we2Var2);
                                                            long j43 = i31 != Double.MIN_VALUE ? (long) (i31 * 1000000.0d) : -9223372036854775807L;
                                                            double i32 = i(o2, s0, -1.0d, we2Var2);
                                                            long j44 = i32 >= 0.0d ? (long) (i32 * 1000000.0d) : -9223372036854775807L;
                                                            ArrayList arrayList35 = new ArrayList();
                                                            String k15 = k(o2, t0, null, hashMap3, we2Var2);
                                                            if (k15 != null) {
                                                                String str35 = nik.a;
                                                                String[] split5 = k15.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
                                                                int length2 = split5.length;
                                                                str8 = str31;
                                                                int i33 = 0;
                                                                while (i33 < length2) {
                                                                    int i34 = i33;
                                                                    String trim2 = split5[i33].trim();
                                                                    trim2.getClass();
                                                                    String[] strArr = split5;
                                                                    if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                        arrayList35.add(trim2);
                                                                    }
                                                                    i33 = i34 + 1;
                                                                    split5 = strArr;
                                                                }
                                                            } else {
                                                                str8 = str31;
                                                            }
                                                            ArrayList arrayList36 = new ArrayList();
                                                            String k16 = k(o2, u0, null, hashMap3, we2Var2);
                                                            if (k16 != null) {
                                                                String str36 = nik.a;
                                                                String[] split6 = k16.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
                                                                int length3 = split6.length;
                                                                int i35 = 0;
                                                                while (i35 < length3) {
                                                                    String[] strArr2 = split6;
                                                                    String trim3 = split6[i35].trim();
                                                                    trim3.getClass();
                                                                    int i36 = length3;
                                                                    if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                        arrayList36.add(trim3);
                                                                    }
                                                                    i35++;
                                                                    length3 = i36;
                                                                    split6 = strArr2;
                                                                }
                                                            }
                                                            Boolean valueOf = k(o2, v0, null, hashMap3, we2Var2) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                                            String k17 = k(o2, w0, null, hashMap3, we2Var2);
                                                            if (k17 != null) {
                                                                if (k17.equals("RANGE")) {
                                                                    str18 = "RANGE";
                                                                }
                                                                k2 = k(o2, x0, null, hashMap3, we2Var2);
                                                                if (k2 != null) {
                                                                    str10 = "PRIMARY";
                                                                    if (!k2.equals("PRIMARY")) {
                                                                        str10 = "HIGHLIGHT";
                                                                    }
                                                                    double i37 = i(o2, y0, -1.0d, we2Var2);
                                                                    j5 = i37 >= 0.0d ? (long) (i37 * 1000000.0d) : -9223372036854775807L;
                                                                    String str37 = str18;
                                                                    double i38 = i(o2, z0, -1.0d, we2Var2);
                                                                    j6 = i38 >= 0.0d ? (long) (i38 * 1000000.0d) : -9223372036854775807L;
                                                                    k3 = k(o2, A0, null, hashMap3, we2Var2);
                                                                    arrayList7 = new ArrayList();
                                                                    String substring = o2.substring(17);
                                                                    int i39 = we2.b;
                                                                    a = we2Var2.a(substring, C0);
                                                                    while (a.find()) {
                                                                        String str38 = str37;
                                                                        String group2 = a.group();
                                                                        group2.getClass();
                                                                        uc9 uc9Var9 = uc9Var8;
                                                                        switch (group2.hashCode()) {
                                                                            case -2136701954:
                                                                                if (group2.equals("X-SNAP=")) {
                                                                                    c2 = 0;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case -1843050726:
                                                                                if (group2.equals("X-CONTENT-MAY-VARY=")) {
                                                                                    c2 = 1;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case -148960310:
                                                                                if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                                    c2 = 2;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case -36345757:
                                                                                if (group2.equals("X-TIMELINE-STYLE=")) {
                                                                                    c2 = 3;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 397239341:
                                                                                if (group2.equals("X-ASSET-LIST=")) {
                                                                                    c2 = 4;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 850193465:
                                                                                if (group2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                                    c2 = 5;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 1065650400:
                                                                                if (group2.equals("X-SKIP-CONTROL-DURATION=")) {
                                                                                    c2 = 6;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 1274498945:
                                                                                if (group2.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                                                    c2 = 7;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 1472528844:
                                                                                if (group2.equals("X-RESTRICT=")) {
                                                                                    c2 = '\b';
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 1748487807:
                                                                                if (group2.equals("X-RESUME-OFFSET=")) {
                                                                                    c2 = '\t';
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 1814205923:
                                                                                if (group2.equals("X-ASSET-URI=")) {
                                                                                    c2 = '\n';
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 2080546752:
                                                                                if (group2.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                                                    c2 = 11;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            default:
                                                                                c2 = 65535;
                                                                                break;
                                                                        }
                                                                        switch (c2) {
                                                                            case 0:
                                                                            case 1:
                                                                            case 2:
                                                                            case 3:
                                                                            case 4:
                                                                            case 5:
                                                                            case 6:
                                                                            case 7:
                                                                            case '\b':
                                                                            case '\t':
                                                                            case '\n':
                                                                            case 11:
                                                                                arrayList14 = arrayList34;
                                                                                matcher = a;
                                                                                z3 = h5;
                                                                                arrayList15 = arrayList16;
                                                                                break;
                                                                            default:
                                                                                matcher = a;
                                                                                String h6 = wv8.h(1, 0, group2);
                                                                                String concat = h6.concat(U3.j.b);
                                                                                int length4 = concat.length() + substring.indexOf(concat);
                                                                                z3 = h5;
                                                                                String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                if (substring2.startsWith("\"")) {
                                                                                    rc9Var = new rc9(h6, l(substring, Pattern.compile(h6.concat("=\"((?:.|\f)+?)\"")), hashMap3, we2Var2), 0);
                                                                                    arrayList15 = arrayList16;
                                                                                    arrayList14 = arrayList34;
                                                                                } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                                    arrayList15 = arrayList16;
                                                                                    arrayList14 = arrayList34;
                                                                                    rc9Var = new rc9(h6, l(substring, Pattern.compile(h6.concat("=(0[xX][A-F0-9]+)")), hashMap3, we2Var2), 1);
                                                                                } else {
                                                                                    arrayList15 = arrayList16;
                                                                                    arrayList14 = arrayList34;
                                                                                    rc9Var = new rc9(h6, Double.parseDouble(l(substring, Pattern.compile(h6.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP, we2Var2)));
                                                                                }
                                                                                arrayList7.add(rc9Var);
                                                                                break;
                                                                        }
                                                                        arrayList16 = arrayList15;
                                                                        str37 = str38;
                                                                        a = matcher;
                                                                        h5 = z3;
                                                                        arrayList34 = arrayList14;
                                                                        uc9Var8 = uc9Var9;
                                                                    }
                                                                    str11 = str37;
                                                                    arrayList8 = arrayList34;
                                                                    uc9Var = uc9Var8;
                                                                    z2 = h5;
                                                                    LinkedHashMap linkedHashMap6 = linkedHashMap;
                                                                    ArrayList arrayList37 = arrayList16;
                                                                    sc9 sc9Var2 = linkedHashMap6.containsKey(l9) ? (sc9) linkedHashMap6.get(l9) : new sc9(l9);
                                                                    if (parse == null) {
                                                                        sc9Var2.getClass();
                                                                    } else {
                                                                        Uri uri7 = sc9Var2.c;
                                                                        if (uri7 != null) {
                                                                            z1a.u(uri7.equals(parse), "Can't change assetUri from %s to %s", sc9Var2.c, parse);
                                                                        }
                                                                        sc9Var2.c = parse;
                                                                    }
                                                                    if (parse2 != null) {
                                                                        Uri uri8 = sc9Var2.d;
                                                                        if (uri8 != null) {
                                                                            z1a.u(uri8.equals(parse2), "Can't change assetListUri from %s to %s", sc9Var2.d, parse2);
                                                                        }
                                                                        sc9Var2.d = parse2;
                                                                    }
                                                                    if (T2 != C.TIME_UNSET) {
                                                                        long j45 = sc9Var2.e;
                                                                        if (j45 != C.TIME_UNSET) {
                                                                            z1a.t(j45 == T2, "Can't change startDateUnixUs from %s to %s", j45, T2);
                                                                        }
                                                                        sc9Var2.e = T2;
                                                                    }
                                                                    if (T3 != C.TIME_UNSET) {
                                                                        long j46 = sc9Var2.f;
                                                                        if (j46 != C.TIME_UNSET) {
                                                                            z1a.t(j46 == T3, "Can't change endDateUnixUs from %s to %s", j46, T3);
                                                                        }
                                                                        sc9Var2.f = T3;
                                                                    }
                                                                    if (j41 != C.TIME_UNSET) {
                                                                        long j47 = sc9Var2.g;
                                                                        if (j47 != C.TIME_UNSET) {
                                                                            z1a.t(j47 == j41, "Can't change durationUs from %s to %s", j47, j41);
                                                                        }
                                                                        sc9Var2.g = j41;
                                                                    }
                                                                    if (j42 != C.TIME_UNSET) {
                                                                        long j48 = sc9Var2.h;
                                                                        if (j48 != C.TIME_UNSET) {
                                                                            z1a.t(j48 == j42, "Can't change plannedDurationUs from %s to %s", j48, j42);
                                                                        }
                                                                        sc9Var2.h = j42;
                                                                    }
                                                                    if (!arrayList8.isEmpty()) {
                                                                        if (sc9Var2.i.isEmpty()) {
                                                                            arrayList13 = arrayList8;
                                                                        } else {
                                                                            arrayList13 = arrayList8;
                                                                            z1a.r("Can't change cue from " + String.join(", ", sc9Var2.i) + " to " + String.join(", ", arrayList13), sc9Var2.i.equals(arrayList13));
                                                                        }
                                                                        sc9Var2.i = arrayList13;
                                                                    }
                                                                    if (z2) {
                                                                        sc9Var2.j = true;
                                                                    }
                                                                    if (j43 != C.TIME_UNSET) {
                                                                        long j49 = sc9Var2.k;
                                                                        if (j49 != C.TIME_UNSET) {
                                                                            z1a.t(j49 == j43, "Can't change resumeOffsetUs from %s to %s", j49, j43);
                                                                        }
                                                                        sc9Var2.k = j43;
                                                                    }
                                                                    if (j44 != C.TIME_UNSET) {
                                                                        long j50 = sc9Var2.l;
                                                                        if (j50 != C.TIME_UNSET) {
                                                                            z1a.t(j50 == j44, "Can't change playoutLimitUs from %s to %s", j50, j44);
                                                                        }
                                                                        sc9Var2.l = j44;
                                                                    }
                                                                    if (!arrayList35.isEmpty()) {
                                                                        if (sc9Var2.m.isEmpty()) {
                                                                            arrayList12 = arrayList35;
                                                                        } else {
                                                                            arrayList12 = arrayList35;
                                                                            z1a.r("Can't change snapTypes from " + String.join(", ", sc9Var2.m) + " to " + String.join(", ", arrayList12), sc9Var2.m.equals(arrayList12));
                                                                        }
                                                                        sc9Var2.m = arrayList12;
                                                                    }
                                                                    if (!arrayList36.isEmpty()) {
                                                                        if (sc9Var2.n.isEmpty()) {
                                                                            arrayList11 = arrayList36;
                                                                        } else {
                                                                            arrayList11 = arrayList36;
                                                                            z1a.r("Can't change restrictions from " + String.join(", ", sc9Var2.n) + " to " + String.join(", ", arrayList11), sc9Var2.n.equals(arrayList11));
                                                                        }
                                                                        sc9Var2.n = arrayList11;
                                                                    }
                                                                    HashMap hashMap8 = sc9Var2.b;
                                                                    if (!arrayList7.isEmpty()) {
                                                                        int i40 = 0;
                                                                        while (i40 < arrayList7.size()) {
                                                                            rc9 rc9Var2 = (rc9) arrayList7.get(i40);
                                                                            String str39 = rc9Var2.a;
                                                                            rc9 rc9Var3 = (rc9) hashMap8.get(str39);
                                                                            if (rc9Var3 != null) {
                                                                                boolean equals = rc9Var3.equals(rc9Var2);
                                                                                arrayList9 = arrayList7;
                                                                                arrayList10 = arrayList37;
                                                                                linkedHashMap3 = linkedHashMap6;
                                                                                Object[] objArr = {str39, rc9Var3.d, Double.valueOf(rc9Var3.c), rc9Var2.d, Double.valueOf(rc9Var2.c)};
                                                                                if (!equals) {
                                                                                    a70.p(ufa.C("Can't change %s from %s %s to %s %s", objArr));
                                                                                    return null;
                                                                                }
                                                                            } else {
                                                                                arrayList9 = arrayList7;
                                                                                arrayList10 = arrayList37;
                                                                                linkedHashMap3 = linkedHashMap6;
                                                                            }
                                                                            hashMap8.put(str39, rc9Var2);
                                                                            i40++;
                                                                            linkedHashMap6 = linkedHashMap3;
                                                                            arrayList7 = arrayList9;
                                                                            arrayList37 = arrayList10;
                                                                        }
                                                                    }
                                                                    arrayList6 = arrayList37;
                                                                    linkedHashMap2 = linkedHashMap6;
                                                                    if (valueOf != null) {
                                                                        Boolean bool2 = sc9Var2.o;
                                                                        if (bool2 != null) {
                                                                            z1a.u(bool2.equals(valueOf), "Can't change contentMayVary from %s to %s", sc9Var2.o, valueOf);
                                                                        }
                                                                        sc9Var2.o = valueOf;
                                                                    }
                                                                    if (str11 != null) {
                                                                        String str40 = sc9Var2.p;
                                                                        if (str40 != null) {
                                                                            z1a.u(str40.equals(str11), "Can't change timelineOccupies from %s to %s", sc9Var2.p, str11);
                                                                        }
                                                                        sc9Var2.p = str11;
                                                                    }
                                                                    if (str10 != null) {
                                                                        String str41 = sc9Var2.q;
                                                                        if (str41 != null) {
                                                                            z1a.u(str41.equals(str10), "Can't change timelineStyle from %s to %s", sc9Var2.q, str10);
                                                                        }
                                                                        sc9Var2.q = str10;
                                                                    }
                                                                    if (j5 != C.TIME_UNSET) {
                                                                        long j51 = sc9Var2.r;
                                                                        if (j51 != C.TIME_UNSET) {
                                                                            z1a.t(j51 == j5, "Can't change skipControlOffsetUs from %s to %s", j51, j5);
                                                                        }
                                                                        sc9Var2.r = j5;
                                                                    }
                                                                    if (j6 != C.TIME_UNSET) {
                                                                        long j52 = sc9Var2.s;
                                                                        if (j52 != C.TIME_UNSET) {
                                                                            z1a.t(j52 == j6, "Can't change skipControlDurationUs from %s to %s", j52, j6);
                                                                        }
                                                                        sc9Var2.s = j6;
                                                                    }
                                                                    if (k3 != null) {
                                                                        String str42 = sc9Var2.t;
                                                                        if (str42 != null) {
                                                                            z1a.u(str42.equals(k3), "Can't change skipControlLabelId from %s to %s", sc9Var2.t, k3);
                                                                        }
                                                                        sc9Var2.t = k3;
                                                                    }
                                                                    linkedHashMap2.put(l9, sc9Var2);
                                                                    we2Var2 = we2Var;
                                                                    str3 = str8;
                                                                    j2 = j8;
                                                                    i4 = i12;
                                                                    j3 = j18;
                                                                    str4 = str14;
                                                                    hashMap2 = hashMap7;
                                                                    arrayList4 = arrayList6;
                                                                    arrayList3 = arrayList5;
                                                                    i3 = 0;
                                                                }
                                                                str10 = null;
                                                                double i372 = i(o2, y0, -1.0d, we2Var2);
                                                                if (i372 >= 0.0d) {
                                                                }
                                                                String str372 = str18;
                                                                double i382 = i(o2, z0, -1.0d, we2Var2);
                                                                if (i382 >= 0.0d) {
                                                                }
                                                                k3 = k(o2, A0, null, hashMap3, we2Var2);
                                                                arrayList7 = new ArrayList();
                                                                String substring3 = o2.substring(17);
                                                                int i392 = we2.b;
                                                                a = we2Var2.a(substring3, C0);
                                                                while (a.find()) {
                                                                }
                                                                str11 = str372;
                                                                arrayList8 = arrayList34;
                                                                uc9Var = uc9Var8;
                                                                z2 = h5;
                                                                LinkedHashMap linkedHashMap62 = linkedHashMap;
                                                                ArrayList arrayList372 = arrayList16;
                                                                if (linkedHashMap62.containsKey(l9)) {
                                                                }
                                                                if (parse == null) {
                                                                }
                                                                if (parse2 != null) {
                                                                }
                                                                if (T2 != C.TIME_UNSET) {
                                                                }
                                                                if (T3 != C.TIME_UNSET) {
                                                                }
                                                                if (j41 != C.TIME_UNSET) {
                                                                }
                                                                if (j42 != C.TIME_UNSET) {
                                                                }
                                                                if (!arrayList8.isEmpty()) {
                                                                }
                                                                if (z2) {
                                                                }
                                                                if (j43 != C.TIME_UNSET) {
                                                                }
                                                                if (j44 != C.TIME_UNSET) {
                                                                }
                                                                if (!arrayList35.isEmpty()) {
                                                                }
                                                                if (!arrayList36.isEmpty()) {
                                                                }
                                                                HashMap hashMap82 = sc9Var2.b;
                                                                if (!arrayList7.isEmpty()) {
                                                                }
                                                                arrayList6 = arrayList372;
                                                                linkedHashMap2 = linkedHashMap62;
                                                                if (valueOf != null) {
                                                                }
                                                                if (str11 != null) {
                                                                }
                                                                if (str10 != null) {
                                                                }
                                                                if (j5 != C.TIME_UNSET) {
                                                                }
                                                                if (j6 != C.TIME_UNSET) {
                                                                }
                                                                if (k3 != null) {
                                                                }
                                                                linkedHashMap2.put(l9, sc9Var2);
                                                                we2Var2 = we2Var;
                                                                str3 = str8;
                                                                j2 = j8;
                                                                i4 = i12;
                                                                j3 = j18;
                                                                str4 = str14;
                                                                hashMap2 = hashMap7;
                                                                arrayList4 = arrayList6;
                                                                arrayList3 = arrayList5;
                                                                i3 = 0;
                                                            }
                                                            str18 = null;
                                                            k2 = k(o2, x0, null, hashMap3, we2Var2);
                                                            if (k2 != null) {
                                                            }
                                                            str10 = null;
                                                            double i3722 = i(o2, y0, -1.0d, we2Var2);
                                                            if (i3722 >= 0.0d) {
                                                            }
                                                            String str3722 = str18;
                                                            double i3822 = i(o2, z0, -1.0d, we2Var2);
                                                            if (i3822 >= 0.0d) {
                                                            }
                                                            k3 = k(o2, A0, null, hashMap3, we2Var2);
                                                            arrayList7 = new ArrayList();
                                                            String substring32 = o2.substring(17);
                                                            int i3922 = we2.b;
                                                            a = we2Var2.a(substring32, C0);
                                                            while (a.find()) {
                                                            }
                                                            str11 = str3722;
                                                            arrayList8 = arrayList34;
                                                            uc9Var = uc9Var8;
                                                            z2 = h5;
                                                            LinkedHashMap linkedHashMap622 = linkedHashMap;
                                                            ArrayList arrayList3722 = arrayList16;
                                                            if (linkedHashMap622.containsKey(l9)) {
                                                            }
                                                            if (parse == null) {
                                                            }
                                                            if (parse2 != null) {
                                                            }
                                                            if (T2 != C.TIME_UNSET) {
                                                            }
                                                            if (T3 != C.TIME_UNSET) {
                                                            }
                                                            if (j41 != C.TIME_UNSET) {
                                                            }
                                                            if (j42 != C.TIME_UNSET) {
                                                            }
                                                            if (!arrayList8.isEmpty()) {
                                                            }
                                                            if (z2) {
                                                            }
                                                            if (j43 != C.TIME_UNSET) {
                                                            }
                                                            if (j44 != C.TIME_UNSET) {
                                                            }
                                                            if (!arrayList35.isEmpty()) {
                                                            }
                                                            if (!arrayList36.isEmpty()) {
                                                            }
                                                            HashMap hashMap822 = sc9Var2.b;
                                                            if (!arrayList7.isEmpty()) {
                                                            }
                                                            arrayList6 = arrayList3722;
                                                            linkedHashMap2 = linkedHashMap622;
                                                            if (valueOf != null) {
                                                            }
                                                            if (str11 != null) {
                                                            }
                                                            if (str10 != null) {
                                                            }
                                                            if (j5 != C.TIME_UNSET) {
                                                            }
                                                            if (j6 != C.TIME_UNSET) {
                                                            }
                                                            if (k3 != null) {
                                                            }
                                                            linkedHashMap2.put(l9, sc9Var2);
                                                            we2Var2 = we2Var;
                                                            str3 = str8;
                                                            j2 = j8;
                                                            i4 = i12;
                                                            j3 = j18;
                                                            str4 = str14;
                                                            hashMap2 = hashMap7;
                                                            arrayList4 = arrayList6;
                                                            arrayList3 = arrayList5;
                                                            i3 = 0;
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                    }
                                                    arrayList32 = arrayList32;
                                                    uc9Var = uc9Var7;
                                                    str8 = str31;
                                                    arrayList5 = arrayList31;
                                                    drmInitData7 = drmInitData11;
                                                    treeMap = treeMap2;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList6 = arrayList16;
                                                    if (o2.startsWith("#")) {
                                                        we2Var2 = we2Var;
                                                        str3 = str8;
                                                        j2 = j8;
                                                        i4 = i12;
                                                        j3 = j18;
                                                        str4 = str14;
                                                        hashMap2 = hashMap7;
                                                        arrayList4 = arrayList6;
                                                        arrayList3 = arrayList5;
                                                        i3 = 0;
                                                    } else {
                                                        String hexString3 = str == null ? null : str25 != null ? str25 : Long.toHexString(j15);
                                                        long j53 = j15 + 1;
                                                        we2Var2 = we2Var;
                                                        String m2 = m(o2, hashMap3, we2Var2);
                                                        wc9 wc9Var6 = (wc9) hashMap7.get(m2);
                                                        if (j8 == -1) {
                                                            j4 = 0;
                                                        } else {
                                                            if (z9 && wc9Var2 == null && wc9Var6 == null) {
                                                                wc9Var6 = new wc9(m2, 0L, j16, null, null);
                                                                hashMap7.put(m2, wc9Var6);
                                                            }
                                                            j4 = j16;
                                                        }
                                                        if (drmInitData7 != null || treeMap.isEmpty()) {
                                                            str9 = str8;
                                                            i7 = 0;
                                                            drmInitData3 = drmInitData7;
                                                        } else {
                                                            i7 = 0;
                                                            DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            str9 = str8;
                                                            DrmInitData drmInitData13 = new DrmInitData(str9, true, schemeDataArr3);
                                                            if (drmInitData6 == null) {
                                                                drmInitData6 = b(str9, schemeDataArr3);
                                                            }
                                                            drmInitData3 = drmInitData13;
                                                        }
                                                        String str43 = hexString3;
                                                        long j54 = j8;
                                                        long j55 = j17;
                                                        long j56 = j18;
                                                        arrayList6.add(new wc9(m2, wc9Var2 != null ? wc9Var2 : wc9Var6, str14, j56, i2, j55, drmInitData3, str, str43, j4, j54, i12, arrayList5));
                                                        long j57 = j55 + j56;
                                                        ArrayList arrayList38 = new ArrayList();
                                                        if (j8 != -1) {
                                                            j4 += j54;
                                                        }
                                                        j16 = j4;
                                                        j15 = j53;
                                                        j17 = j57;
                                                        i9 = i7;
                                                        i12 = i9;
                                                        linkedHashMap4 = linkedHashMap2;
                                                        i10 = i2;
                                                        drmInitData7 = drmInitData3;
                                                        str15 = str;
                                                        treeMap2 = treeMap;
                                                        j8 = -1;
                                                        j18 = 0;
                                                        yc9Var = yc9Var2;
                                                        arrayList19 = arrayList2;
                                                        str16 = str25;
                                                        arrayList18 = arrayList32;
                                                        str14 = str2;
                                                        dd9Var2 = dd9Var;
                                                        zc9Var2 = zc9Var;
                                                        arrayList16 = arrayList6;
                                                        hashMap4 = hashMap7;
                                                        j13 = j17;
                                                        str17 = str9;
                                                        uri3 = str5;
                                                        uc9Var2 = uc9Var;
                                                        arrayList17 = arrayList38;
                                                        str13 = str14;
                                                    }
                                                }
                                            }
                                            str = str15;
                                            i2 = i15;
                                            str3 = str31;
                                            treeMap = treeMap2;
                                            i3 = i9;
                                            j2 = j8;
                                            i4 = i12;
                                            uc9Var = uc9Var2;
                                            j3 = j18;
                                            str4 = str14;
                                            hashMap2 = hashMap7;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList3 = arrayList31;
                                            str5 = uri3;
                                            arrayList4 = arrayList16;
                                        }
                                        dd9Var2 = dd9Var;
                                        str17 = str31;
                                        i10 = i15;
                                        yc9Var = yc9Var2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap4 = linkedHashMap;
                                        arrayList19 = arrayList2;
                                        str16 = str25;
                                    }
                                    arrayList18 = arrayList32;
                                    arrayList17 = arrayList31;
                                    str13 = str2;
                                }
                                dd9Var2 = dd9Var;
                                zc9Var2 = zc9Var;
                                arrayList16 = arrayList4;
                                i9 = i3;
                                linkedHashMap4 = linkedHashMap2;
                                str14 = str4;
                                j18 = j3;
                                i10 = i2;
                                str15 = str;
                                i12 = i4;
                                uri3 = str5;
                                treeMap2 = treeMap;
                                yc9Var = yc9Var2;
                                arrayList19 = arrayList2;
                                str16 = str25;
                                arrayList18 = arrayList32;
                                uc9Var2 = uc9Var;
                                str13 = str2;
                                str17 = str3;
                                j8 = j2;
                                arrayList17 = arrayList3;
                                hashMap4 = hashMap2;
                            }
                            i10 = i15;
                            yc9Var = yc9Var2;
                            hashMap4 = hashMap7;
                            linkedHashMap4 = linkedHashMap;
                            arrayList19 = arrayList2;
                            str16 = str25;
                            arrayList18 = arrayList32;
                            arrayList17 = arrayList31;
                        }
                    }
                }
                i10 = i15;
                yc9Var = yc9Var2;
                linkedHashMap4 = linkedHashMap;
                arrayList19 = arrayList2;
            }
            hashMap4 = hashMap7;
        }
        throw new fd9();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032c  */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dd9 g(x6k x6kVar, Uri uri, we2 we2Var) {
        int i2;
        char c2;
        ArrayList arrayList;
        cd9 cd9Var;
        String str;
        ArrayList arrayList2;
        int parseInt;
        String str2;
        cd9 cd9Var2;
        String str3;
        cd9 cd9Var3;
        HashMap hashMap;
        HashSet hashSet;
        int i3;
        ArrayList arrayList3;
        int i4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashMap hashMap2;
        int i5;
        String str4;
        String str5;
        String x2;
        w13 w13Var;
        String k2;
        int i6;
        int i7;
        Uri L2;
        ArrayList arrayList7;
        int i8;
        String[] f02;
        w13 w13Var2;
        String sb;
        String uri2 = uri.toString();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean i9 = x6kVar.i();
            Pattern pattern = Q;
            ArrayList arrayList16 = arrayList12;
            boolean z4 = z2;
            Pattern pattern2 = V;
            boolean z5 = z3;
            if (!i9) {
                ArrayList arrayList17 = arrayList13;
                ArrayList arrayList18 = arrayList15;
                ArrayList arrayList19 = arrayList9;
                ArrayList arrayList20 = arrayList10;
                ArrayList arrayList21 = arrayList11;
                ArrayList arrayList22 = arrayList14;
                ArrayList arrayList23 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    cd9 cd9Var4 = (cd9) arrayList8.get(i10);
                    Uri uri3 = cd9Var4.a;
                    b bVar = cd9Var4.b;
                    if (hashSet2.add(uri3)) {
                        z1a.E(bVar.l == null);
                        ArrayList arrayList24 = (ArrayList) hashMap3.get(cd9Var4.a);
                        arrayList24.getClass();
                        hashMap = hashMap3;
                        hashSet = hashSet2;
                        ric ricVar = new ric(new rd9(null, null, arrayList24));
                        qm8 a = bVar.a();
                        a.k = ricVar;
                        arrayList23.add(new cd9(cd9Var4.a, new b(a), cd9Var4.c, cd9Var4.d, cd9Var4.e, cd9Var4.f, cd9Var4.g, cd9Var4.h));
                    } else {
                        hashMap = hashMap3;
                        hashSet = hashSet2;
                    }
                    i10++;
                    hashSet2 = hashSet;
                    hashMap3 = hashMap;
                }
                int i11 = 0;
                ArrayList arrayList25 = null;
                b bVar2 = null;
                while (i11 < arrayList17.size()) {
                    ArrayList arrayList26 = arrayList17;
                    String str6 = (String) arrayList26.get(i11);
                    String l2 = l(str6, X, hashMap4, we2Var);
                    String l3 = l(str6, pattern2, hashMap4, we2Var);
                    ArrayList arrayList27 = arrayList25;
                    ArrayList arrayList28 = arrayList23;
                    String k3 = k(str6, q, null, hashMap4, we2Var);
                    qm8 qm8Var = new qm8();
                    b bVar3 = bVar2;
                    qm8Var.a = lnb.o(l2, ":", l3);
                    qm8Var.b = l3;
                    qm8Var.m = sjc.p(MimeTypes.APPLICATION_M3U8);
                    boolean h2 = h(str6, b0, we2Var);
                    ?? r28 = h2;
                    if (h(str6, c0, we2Var)) {
                        r28 = (h2 ? 1 : 0) | 2;
                    }
                    qm8Var.e = h(str6, a0, we2Var) ? r28 | 4 : r28;
                    int i12 = i11;
                    String k4 = k(str6, Y, null, hashMap4, we2Var);
                    if (TextUtils.isEmpty(k4)) {
                        arrayList17 = arrayList26;
                        i2 = 0;
                    } else {
                        String str7 = nik.a;
                        String[] split = k4.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
                        i2 = nik.m(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList17 = arrayList26;
                        if (nik.m(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i2 |= 4096;
                        }
                        if (nik.m(split, "public.accessibility.describes-music-and-sound")) {
                            i2 |= 1024;
                        }
                        if (nik.m(split, "public.easy-to-read")) {
                            i2 |= 8192;
                        }
                    }
                    qm8Var.f = i2;
                    qm8Var.d = k(str6, U, null, hashMap4, we2Var);
                    String k5 = k(str6, pattern, null, hashMap4, we2Var);
                    Uri L3 = k5 == null ? null : tba.L(uri2, k5);
                    String str8 = uri2;
                    Pattern pattern3 = pattern;
                    ric ricVar2 = new ric(new rd9(l2, l3, Collections.EMPTY_LIST));
                    String l4 = l(str6, S, hashMap4, we2Var);
                    switch (l4.hashCode()) {
                        case -959297733:
                            if (l4.equals("SUBTITLES")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -333210994:
                            if (l4.equals("CLOSED-CAPTIONS")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62628790:
                            if (l4.equals("AUDIO")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (l4.equals("VIDEO")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            arrayList = arrayList19;
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList8.size()) {
                                    cd9Var = (cd9) arrayList8.get(i13);
                                    if (!l2.equals(cd9Var.e)) {
                                        i13++;
                                    }
                                } else {
                                    cd9Var = null;
                                }
                            }
                            if (cd9Var != null) {
                                String x3 = nik.x(cd9Var.b.k, 3);
                                qm8Var.j = x3;
                                str = sjc.e(x3);
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = MimeTypes.TEXT_VTT;
                            }
                            qm8Var.n = sjc.p(str);
                            qm8Var.k = ricVar2;
                            if (L3 != null) {
                                arrayList2 = arrayList21;
                                arrayList2.add(new bd9(L3, new b(qm8Var), l3, k3));
                            } else {
                                arrayList2 = arrayList21;
                                tgj.d0("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList25 = arrayList27;
                            bVar2 = bVar3;
                            break;
                        case 1:
                            ArrayList arrayList29 = arrayList20;
                            arrayList = arrayList19;
                            String l5 = l(str6, Z, hashMap4, we2Var);
                            if (l5.startsWith("CC")) {
                                parseInt = Integer.parseInt(l5.substring(2));
                                str2 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                parseInt = Integer.parseInt(l5.substring(7));
                                str2 = MimeTypes.APPLICATION_CEA708;
                            }
                            ArrayList arrayList30 = arrayList27 == null ? new ArrayList() : arrayList27;
                            qm8Var.n = sjc.p(str2);
                            qm8Var.K = parseInt;
                            arrayList30.add(new b(qm8Var));
                            arrayList20 = arrayList29;
                            arrayList25 = arrayList30;
                            arrayList2 = arrayList21;
                            bVar2 = bVar3;
                            break;
                        case 2:
                            arrayList = arrayList19;
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList8.size()) {
                                    cd9Var2 = (cd9) arrayList8.get(i14);
                                    int i15 = i14;
                                    if (!l2.equals(cd9Var2.d)) {
                                        i14 = i15 + 1;
                                    }
                                } else {
                                    cd9Var2 = null;
                                }
                            }
                            if (cd9Var2 != null) {
                                String x4 = nik.x(cd9Var2.b.k, 1);
                                qm8Var.j = x4;
                                str3 = sjc.e(x4);
                            } else {
                                str3 = null;
                            }
                            cd9 cd9Var5 = cd9Var2;
                            String k6 = k(str6, i, null, hashMap4, we2Var);
                            if (k6 != null) {
                                String str9 = nik.a;
                                qm8Var.F = Integer.parseInt(k6.split("/", 2)[0]);
                                if (MimeTypes.AUDIO_E_AC3.equals(str3) && k6.endsWith("/JOC")) {
                                    qm8Var.j = "ec+3";
                                    str3 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            qm8Var.n = sjc.p(str3);
                            if (L3 != null) {
                                qm8Var.k = ricVar2;
                                arrayList20.add(new bd9(L3, new b(qm8Var), l3, k3));
                            } else {
                                ArrayList arrayList31 = arrayList20;
                                if (cd9Var5 != null) {
                                    bVar2 = new b(qm8Var);
                                    arrayList20 = arrayList31;
                                    arrayList2 = arrayList21;
                                    arrayList25 = arrayList27;
                                    break;
                                } else {
                                    arrayList20 = arrayList31;
                                }
                            }
                            arrayList2 = arrayList21;
                            arrayList25 = arrayList27;
                            bVar2 = bVar3;
                            break;
                        case 3:
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList8.size()) {
                                    cd9Var3 = (cd9) arrayList8.get(i16);
                                    if (!l2.equals(cd9Var3.c)) {
                                        i16++;
                                    }
                                } else {
                                    cd9Var3 = null;
                                }
                            }
                            if (cd9Var3 != null) {
                                b bVar4 = cd9Var3.b;
                                String x5 = nik.x(bVar4.k, 2);
                                qm8Var.j = x5;
                                qm8Var.n = sjc.p(sjc.e(x5));
                                qm8Var.u = bVar4.v;
                                qm8Var.v = bVar4.w;
                                qm8Var.y = bVar4.z;
                            }
                            if (L3 != null) {
                                qm8Var.k = ricVar2;
                                arrayList = arrayList19;
                                arrayList.add(new bd9(L3, new b(qm8Var), l3, k3));
                                arrayList2 = arrayList21;
                                arrayList25 = arrayList27;
                                bVar2 = bVar3;
                                break;
                            }
                        default:
                            arrayList2 = arrayList21;
                            arrayList = arrayList19;
                            arrayList25 = arrayList27;
                            bVar2 = bVar3;
                            break;
                    }
                    i11 = i12 + 1;
                    arrayList19 = arrayList;
                    arrayList21 = arrayList2;
                    arrayList23 = arrayList28;
                    uri2 = str8;
                    pattern = pattern3;
                }
                return new dd9(uri.toString(), arrayList18, arrayList23, arrayList19, arrayList20, arrayList21, arrayList16, bVar2, z4 ? Collections.EMPTY_LIST : arrayList25, z5, hashMap4, arrayList22);
            }
            String o2 = x6kVar.o();
            ArrayList arrayList32 = arrayList11;
            if (o2.startsWith("#EXT")) {
                arrayList15.add(o2);
            }
            boolean startsWith = o2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList33 = arrayList15;
            if (o2.startsWith("#EXT-X-DEFINE")) {
                String k7 = k(o2, pattern2, null, hashMap4, we2Var);
                if (k7 != null) {
                    n(k7, hashMap4);
                    hashMap4.put(k7, l(o2, g0, hashMap4, we2Var));
                } else {
                    String l6 = l(o2, W, hashMap4, we2Var);
                    n(l6, hashMap4);
                    String queryParameter = uri.getQueryParameter(l6);
                    if (queryParameter == null) {
                        throw s9e.b("QUERYPARAM \"" + l6 + "\" not found in playlist URI", null);
                    }
                    hashMap4.put(l6, queryParameter);
                }
            } else if (o2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList6 = arrayList13;
                arrayList5 = arrayList9;
                arrayList4 = arrayList10;
                arrayList3 = arrayList14;
                z2 = z4;
                z3 = true;
                arrayList12 = arrayList16;
                arrayList11 = arrayList32;
                arrayList15 = arrayList33;
                arrayList14 = arrayList3;
                arrayList10 = arrayList4;
                arrayList9 = arrayList5;
                arrayList13 = arrayList6;
            } else if (o2.startsWith("#EXT-X-MEDIA")) {
                arrayList13.add(o2);
            } else if (o2.startsWith("#EXT-X-SESSION-KEY")) {
                DrmInitData.SchemeData d2 = d(o2, k(o2, O, "identity", hashMap4, we2Var), hashMap4, we2Var);
                if (d2 != null) {
                    String l7 = l(o2, N, hashMap4, we2Var);
                    arrayList14.add(new DrmInitData(("SAMPLE-AES-CENC".equals(l7) || "SAMPLE-AES-CTR".equals(l7)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs, true, d2));
                }
            } else if (o2.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z4 | o2.contains("CLOSED-CAPTIONS=NONE");
                if (startsWith) {
                    z4 = contains;
                    i3 = 16384;
                } else {
                    z4 = contains;
                    i3 = 0;
                }
                int parseInt2 = Integer.parseInt(l(o2, h, Collections.EMPTY_MAP, we2Var));
                int i17 = we2.b;
                Matcher a2 = we2Var.a(o2, c);
                if (a2.find()) {
                    arrayList3 = arrayList14;
                    String group = a2.group(1);
                    group.getClass();
                    i4 = Integer.parseInt(group);
                } else {
                    arrayList3 = arrayList14;
                    i4 = -1;
                }
                arrayList4 = arrayList10;
                String k8 = k(o2, j, null, hashMap4, we2Var);
                arrayList5 = arrayList9;
                String k9 = k(o2, k, null, hashMap4, we2Var);
                arrayList6 = arrayList13;
                String k10 = k(o2, l, null, hashMap4, we2Var);
                if (k10 != null) {
                    String str10 = nik.a;
                    String[] split2 = k10.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, 2)[0].split("/", -1);
                    str4 = split2[0];
                    if (split2.length > 1) {
                        str5 = split2[1];
                        hashMap2 = hashMap3;
                        i5 = 2;
                        x2 = nik.x(k9, i5);
                        if (sjc.l(x2, str4) && (str4 == null || !(k8 == null || str5 == null || ((k8.equals("PQ") && !str5.equals("db1p")) || ((k8.equals("SDR") && !str5.equals("db2g")) || (k8.equals("HLG") && !str5.startsWith("db4"))))))) {
                            w13 y2 = nik.y(k9, str4, str5);
                            if (str4 == null) {
                                str4 = x2;
                            }
                            f02 = nik.f0(k9);
                            if (f02.length != 0) {
                                w13Var2 = y2;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                int length = f02.length;
                                int i18 = 0;
                                while (i18 < length) {
                                    String[] strArr = f02;
                                    String str11 = strArr[i18];
                                    w13 w13Var3 = y2;
                                    int i19 = length;
                                    if (2 != sjc.i(sjc.e(str11))) {
                                        if (sb2.length() > 0) {
                                            sb2.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                        }
                                        sb2.append(str11);
                                    }
                                    i18++;
                                    f02 = strArr;
                                    length = i19;
                                    y2 = w13Var3;
                                }
                                w13Var2 = y2;
                                if (sb2.length() > 0) {
                                    sb = sb2.toString();
                                    k9 = sb != null ? wv8.i(str4, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, sb) : str4;
                                    w13Var = w13Var2;
                                }
                            }
                            sb = null;
                            if (sb != null) {
                            }
                            w13Var = w13Var2;
                        } else {
                            w13Var = null;
                        }
                        k2 = k(o2, m, null, hashMap4, we2Var);
                        if (k2 != null) {
                            String[] split3 = k2.split("x", -1);
                            int parseInt3 = Integer.parseInt(split3[0]);
                            int parseInt4 = Integer.parseInt(split3[1]);
                            if (parseInt3 <= 0 || parseInt4 <= 0) {
                                parseInt4 = -1;
                                i8 = -1;
                            } else {
                                i8 = parseInt3;
                            }
                            i7 = parseInt4;
                            i6 = i8;
                        } else {
                            i6 = -1;
                            i7 = -1;
                        }
                        String k11 = k(o2, n, null, hashMap4, we2Var);
                        float parseFloat = k11 != null ? Float.parseFloat(k11) : -1.0f;
                        String k12 = k(o2, o, null, hashMap4, we2Var);
                        String k13 = k(o2, d, null, hashMap4, we2Var);
                        String k14 = k(o2, e, null, hashMap4, we2Var);
                        String k15 = k(o2, f, null, hashMap4, we2Var);
                        String k16 = k(o2, g, null, hashMap4, we2Var);
                        String k17 = k(o2, p, null, hashMap4, we2Var);
                        if (startsWith) {
                            L2 = tba.L(uri2, l(o2, pattern, hashMap4, we2Var));
                        } else {
                            if (!x6kVar.i()) {
                                throw s9e.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            L2 = tba.L(uri2, m(x6kVar.o(), hashMap4, we2Var));
                        }
                        Uri uri4 = L2;
                        qm8 qm8Var2 = new qm8();
                        qm8Var2.a = Integer.toString(arrayList8.size());
                        qm8Var2.m = sjc.p(MimeTypes.APPLICATION_M3U8);
                        qm8Var2.j = k9;
                        qm8Var2.h = i4;
                        qm8Var2.i = parseInt2;
                        qm8Var2.u = i6;
                        qm8Var2.v = i7;
                        qm8Var2.y = parseFloat;
                        qm8Var2.f = i3;
                        qm8Var2.D = w13Var;
                        arrayList8.add(new cd9(uri4, new b(qm8Var2), k13, k14, k15, k16, k12, k17));
                        hashMap3 = hashMap2;
                        arrayList7 = (ArrayList) hashMap3.get(uri4);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            hashMap3.put(uri4, arrayList7);
                        }
                        arrayList7.add(new qd9(k13, k14, k15, i4, parseInt2, k16));
                        z2 = z4;
                        z3 = z5;
                        arrayList12 = arrayList16;
                        arrayList11 = arrayList32;
                        arrayList15 = arrayList33;
                        arrayList14 = arrayList3;
                        arrayList10 = arrayList4;
                        arrayList9 = arrayList5;
                        arrayList13 = arrayList6;
                    } else {
                        hashMap2 = hashMap3;
                        i5 = 2;
                    }
                } else {
                    hashMap2 = hashMap3;
                    i5 = 2;
                    str4 = null;
                }
                str5 = null;
                x2 = nik.x(k9, i5);
                if (sjc.l(x2, str4)) {
                    w13 y22 = nik.y(k9, str4, str5);
                    if (str4 == null) {
                    }
                    f02 = nik.f0(k9);
                    if (f02.length != 0) {
                    }
                    sb = null;
                    if (sb != null) {
                    }
                    w13Var = w13Var2;
                    k2 = k(o2, m, null, hashMap4, we2Var);
                    if (k2 != null) {
                    }
                    String k112 = k(o2, n, null, hashMap4, we2Var);
                    if (k112 != null) {
                    }
                    String k122 = k(o2, o, null, hashMap4, we2Var);
                    String k132 = k(o2, d, null, hashMap4, we2Var);
                    String k142 = k(o2, e, null, hashMap4, we2Var);
                    String k152 = k(o2, f, null, hashMap4, we2Var);
                    String k162 = k(o2, g, null, hashMap4, we2Var);
                    String k172 = k(o2, p, null, hashMap4, we2Var);
                    if (startsWith) {
                    }
                    Uri uri42 = L2;
                    qm8 qm8Var22 = new qm8();
                    qm8Var22.a = Integer.toString(arrayList8.size());
                    qm8Var22.m = sjc.p(MimeTypes.APPLICATION_M3U8);
                    qm8Var22.j = k9;
                    qm8Var22.h = i4;
                    qm8Var22.i = parseInt2;
                    qm8Var22.u = i6;
                    qm8Var22.v = i7;
                    qm8Var22.y = parseFloat;
                    qm8Var22.f = i3;
                    qm8Var22.D = w13Var;
                    arrayList8.add(new cd9(uri42, new b(qm8Var22), k132, k142, k152, k162, k122, k172));
                    hashMap3 = hashMap2;
                    arrayList7 = (ArrayList) hashMap3.get(uri42);
                    if (arrayList7 == null) {
                    }
                    arrayList7.add(new qd9(k132, k142, k152, i4, parseInt2, k162));
                    z2 = z4;
                    z3 = z5;
                    arrayList12 = arrayList16;
                    arrayList11 = arrayList32;
                    arrayList15 = arrayList33;
                    arrayList14 = arrayList3;
                    arrayList10 = arrayList4;
                    arrayList9 = arrayList5;
                    arrayList13 = arrayList6;
                }
                w13Var = null;
                k2 = k(o2, m, null, hashMap4, we2Var);
                if (k2 != null) {
                }
                String k1122 = k(o2, n, null, hashMap4, we2Var);
                if (k1122 != null) {
                }
                String k1222 = k(o2, o, null, hashMap4, we2Var);
                String k1322 = k(o2, d, null, hashMap4, we2Var);
                String k1422 = k(o2, e, null, hashMap4, we2Var);
                String k1522 = k(o2, f, null, hashMap4, we2Var);
                String k1622 = k(o2, g, null, hashMap4, we2Var);
                String k1722 = k(o2, p, null, hashMap4, we2Var);
                if (startsWith) {
                }
                Uri uri422 = L2;
                qm8 qm8Var222 = new qm8();
                qm8Var222.a = Integer.toString(arrayList8.size());
                qm8Var222.m = sjc.p(MimeTypes.APPLICATION_M3U8);
                qm8Var222.j = k9;
                qm8Var222.h = i4;
                qm8Var222.i = parseInt2;
                qm8Var222.u = i6;
                qm8Var222.v = i7;
                qm8Var222.y = parseFloat;
                qm8Var222.f = i3;
                qm8Var222.D = w13Var;
                arrayList8.add(new cd9(uri422, new b(qm8Var222), k1322, k1422, k1522, k1622, k1222, k1722));
                hashMap3 = hashMap2;
                arrayList7 = (ArrayList) hashMap3.get(uri422);
                if (arrayList7 == null) {
                }
                arrayList7.add(new qd9(k1322, k1422, k1522, i4, parseInt2, k1622));
                z2 = z4;
                z3 = z5;
                arrayList12 = arrayList16;
                arrayList11 = arrayList32;
                arrayList15 = arrayList33;
                arrayList14 = arrayList3;
                arrayList10 = arrayList4;
                arrayList9 = arrayList5;
                arrayList13 = arrayList6;
            }
            arrayList6 = arrayList13;
            arrayList5 = arrayList9;
            arrayList4 = arrayList10;
            arrayList3 = arrayList14;
            z2 = z4;
            z3 = z5;
            arrayList12 = arrayList16;
            arrayList11 = arrayList32;
            arrayList15 = arrayList33;
            arrayList14 = arrayList3;
            arrayList10 = arrayList4;
            arrayList9 = arrayList5;
            arrayList13 = arrayList6;
        }
    }

    public static boolean h(String str, Pattern pattern, we2 we2Var) {
        int i2 = we2.b;
        Matcher a = we2Var.a(str, pattern);
        if (a.find()) {
            return "YES".equals(a.group(1));
        }
        return false;
    }

    public static double i(String str, Pattern pattern, double d2, we2 we2Var) {
        int i2 = we2.b;
        Matcher a = we2Var.a(str, pattern);
        if (!a.find()) {
            return d2;
        }
        String group = a.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long j(String str, Pattern pattern, we2 we2Var) {
        int i2 = we2.b;
        Matcher a = we2Var.a(str, pattern);
        if (!a.find()) {
            return -1L;
        }
        String group = a.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String k(String str, Pattern pattern, String str2, Map map, we2 we2Var) {
        int i2 = we2.b;
        Matcher a = we2Var.a(str, pattern);
        if (a.find()) {
            str2 = a.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m(str2, map, we2Var);
    }

    public static String l(String str, Pattern pattern, Map map, we2 we2Var) {
        String k2 = k(str, pattern, null, map, we2Var);
        if (k2 != null) {
            return k2;
        }
        throw s9e.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String m(String str, Map map, we2 we2Var) {
        int i2 = we2.b;
        Matcher a = we2Var.a(str, B0);
        StringBuffer stringBuffer = new StringBuffer();
        while (a.find()) {
            String group = a.group(1);
            if (map.containsKey(group)) {
                a.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        a.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void n(String str, HashMap hashMap) {
        if (hashMap.containsKey(str)) {
            throw s9e.b("duplicate variable name \"" + str + "\"", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[Catch: all -> 0x009d, LOOP:0: B:13:0x0074->B:38:0x0074, LOOP_START, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x002b, B:10:0x0034, B:13:0x0074, B:15:0x007a, B:18:0x0085, B:53:0x008d, B:20:0x009f, B:22:0x00a7, B:24:0x00af, B:26:0x00b7, B:28:0x00bf, B:30:0x00c7, B:32:0x00cf, B:34:0x00d7, B:36:0x00e0, B:41:0x00e4, B:62:0x0102, B:63:0x0108, B:67:0x003b, B:69:0x0041, B:74:0x004a, B:76:0x0053, B:81:0x005c, B:83:0x0062, B:85:0x0068, B:87:0x006d), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x002b, B:10:0x0034, B:13:0x0074, B:15:0x007a, B:18:0x0085, B:53:0x008d, B:20:0x009f, B:22:0x00a7, B:24:0x00af, B:26:0x00b7, B:28:0x00bf, B:30:0x00c7, B:32:0x00cf, B:34:0x00d7, B:36:0x00e0, B:41:0x00e4, B:62:0x0102, B:63:0x0108, B:67:0x003b, B:69:0x0041, B:74:0x004a, B:76:0x0053, B:81:0x005c, B:83:0x0062, B:85:0x0068, B:87:0x006d), top: B:2:0x001a }] */
    @Override // defpackage.w9e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ed9 e(Uri uri, ue4 ue4Var) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ue4Var));
        ArrayDeque arrayDeque = new ArrayDeque();
        we2 we2Var = new we2(true, 16, 0.75f, 2);
        try {
            int read = bufferedReader.read();
            boolean z2 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z2) {
                    throw s9e.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        nik.h(bufferedReader);
                        throw s9e.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            arrayDeque.add(trim);
                        } else {
                            arrayDeque.add(trim);
                            return g(new x6k(arrayDeque, bufferedReader), uri, we2Var);
                        }
                    }
                }
                arrayDeque.add(trim);
                return f(this.a, this.b, new x6k(arrayDeque, bufferedReader), uri, we2Var);
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !nik.R(read)) {
                        read = bufferedReader.read();
                    }
                    z2 = nik.R(read);
                } else {
                    if (read != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i2++;
                }
            }
            if (z2) {
            }
        } finally {
            nik.h(bufferedReader);
        }
    }

    public gd9() {
        this(dd9.n, null);
    }
}
