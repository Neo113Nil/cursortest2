package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.hls.playlist.c;
import androidx.media3.exoplayer.upstream.c;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
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
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.fi20;
import xsna.fo8;
import xsna.fxc0;
import xsna.io20;
import xsna.neq0;
import xsna.o9v;
import xsna.pzl;
import xsna.qoy;
import xsna.sd9;
import xsna.tu8;
import xsna.u9v;
import xsna.xae0;
import xsna.y2r0;

/* loaded from: classes.dex */
public final class HlsPlaylistParser implements c.a<o9v> {
    public final c a;

    @Nullable
    public final b b;
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
    public static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern v = b("CAN-SKIP-DATERANGES");
    public static final Pattern w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern z = b("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = b("AUTOSELECT");
    public static final Pattern X = b("DEFAULT");
    public static final Pattern Y = b("FORCED");
    public static final Pattern Z = b("INDEPENDENT");
    public static final Pattern a0 = b("GAP");
    public static final Pattern b0 = b("PRECISE");
    public static final Pattern c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern k0 = b("END-ON-NEXT");
    public static final Pattern l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern v0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern w0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern x0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern y0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    /* loaded from: classes12.dex */
    public static final class DeltaUpdateException extends IOException {
    }

    /* loaded from: classes12.dex */
    public static class a {
        public final BufferedReader a;
        public final ArrayDeque b;

        @Nullable
        public String c;

        public a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.b = arrayDeque;
            this.a = bufferedReader;
        }

        public final boolean a() throws IOException {
            String trim;
            if (this.c == null) {
                ArrayDeque arrayDeque = this.b;
                if (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    str.getClass();
                    this.c = str;
                    return true;
                }
                do {
                    String readLine = this.a.readLine();
                    this.c = readLine;
                    if (readLine == null) {
                        return false;
                    }
                    trim = readLine.trim();
                    this.c = trim;
                } while (trim.isEmpty());
            }
            return true;
        }

        public final String b() throws IOException {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(c.n, null);
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData c(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            schemeDataArr2[i2] = schemeDataArr[i2].a(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    public static DrmInitData.SchemeData e(String str, HashMap hashMap, String str2) throws ParserException {
        String k2 = k(str, M, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = N;
        if (equals) {
            String l2 = l(str, pattern, hashMap);
            return new DrmInitData.SchemeData(tu8.d, MimeTypes.VIDEO_MP4, Base64.decode(l2.substring(l2.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = tu8.d;
            String str3 = y2r0.a;
            return new DrmInitData.SchemeData(uuid, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(k2)) {
            return null;
        }
        String l3 = l(str, pattern, hashMap);
        byte[] decode = Base64.decode(l3.substring(l3.indexOf(44)), 0);
        UUID uuid2 = tu8.e;
        return new DrmInitData.SchemeData(uuid2, MimeTypes.VIDEO_MP4, xae0.a(uuid2, decode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x0841, code lost:
    
        if (r7.equals("POINT") != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x085f, code lost:
    
        if (r7.equals("HIGHLIGHT") != false) goto L347;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0877  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b f(c cVar, @Nullable b bVar, a aVar, String str) throws IOException {
        ArrayList arrayList;
        b.c cVar2;
        HashMap hashMap;
        ArrayList arrayList2;
        TreeMap treeMap;
        String str2;
        long j2;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        long j3;
        b.e eVar;
        int i2;
        long j4;
        String str3;
        int i3;
        DrmInitData drmInitData;
        long j5;
        long j6;
        DrmInitData drmInitData2;
        HashMap hashMap2;
        ArrayList arrayList4;
        int i4;
        ArrayList arrayList5;
        String str4;
        b.e eVar2;
        int i5;
        DrmInitData drmInitData3;
        int i6;
        long j7;
        DrmInitData drmInitData4;
        long j8;
        String str5;
        String k2;
        String str6;
        Matcher matcher;
        String str7;
        char c2;
        ArrayList arrayList6;
        long j9;
        ArrayList arrayList7;
        b.a aVar2;
        int i7;
        char c3;
        c cVar3 = cVar;
        b bVar2 = bVar;
        boolean z2 = cVar3.c;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b.g gVar = new b.g(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap2 = new TreeMap();
        String str8 = "";
        boolean z3 = z2;
        String str9 = "";
        long j10 = -9223372036854775807L;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = -1;
        b.c cVar4 = null;
        String str10 = null;
        DrmInitData drmInitData5 = null;
        String str11 = null;
        DrmInitData drmInitData6 = null;
        int i8 = 0;
        int i9 = 1;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        b.e eVar3 = null;
        int i11 = 0;
        String str12 = null;
        int i12 = 0;
        boolean z6 = false;
        int i13 = 0;
        long j19 = -9223372036854775807L;
        long j20 = -9223372036854775807L;
        long j21 = 0;
        boolean z7 = false;
        while (aVar.a()) {
            String b = aVar.b();
            if (b.startsWith("#EXT")) {
                arrayList11.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String l2 = l(b, t, hashMap3);
                if ("VOD".equals(l2)) {
                    i8 = 1;
                } else if ("EVENT".equals(l2)) {
                    i8 = 2;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z6 = true;
            } else {
                if (b.startsWith("#EXT-X-START")) {
                    arrayList = arrayList11;
                    long parseDouble = (long) (Double.parseDouble(l(b, F, Collections.EMPTY_MAP)) * 1000000.0d);
                    z7 = h(b, b0);
                    linkedHashMap2 = linkedHashMap2;
                    j10 = parseDouble;
                } else {
                    arrayList = arrayList11;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double i14 = i(b, u, -9.223372036854776E18d);
                        long j22 = i14 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i14 * 1000000.0d);
                        boolean h2 = h(b, v);
                        double i15 = i(b, x, -9.223372036854776E18d);
                        long j23 = i15 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i15 * 1000000.0d);
                        double i16 = i(b, y, -9.223372036854776E18d);
                        linkedHashMap2 = linkedHashMap3;
                        arrayList11 = arrayList;
                        gVar = new b.g(j22, h2, j23, i16 == -9.223372036854776E18d ? -9223372036854775807L : (long) (i16 * 1000000.0d), h(b, z));
                    } else if (b.startsWith("#EXT-X-PART-INF")) {
                        j20 = (long) (Double.parseDouble(l(b, r, Collections.EMPTY_MAP)) * 1000000.0d);
                        linkedHashMap2 = linkedHashMap3;
                    } else {
                        boolean startsWith = b.startsWith("#EXT-X-MAP");
                        Pattern pattern = H;
                        b.g gVar2 = gVar;
                        Pattern pattern2 = N;
                        if (startsWith) {
                            String l3 = l(b, pattern2, hashMap3);
                            String k3 = k(b, pattern, null, hashMap3);
                            if (k3 != null) {
                                String str13 = y2r0.a;
                                String[] split = k3.split("@", -1);
                                j18 = Long.parseLong(split[i12]);
                                if (split.length > 1) {
                                    j11 = Long.parseLong(split[1]);
                                }
                            }
                            long j24 = j18;
                            long j25 = j24 == -1 ? 0L : j11;
                            if (str12 != null && str11 == null) {
                                throw ParserException.b(null, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                            b.e eVar4 = new b.e(j25, j24, l3, str12, str11);
                            String str14 = str11;
                            if (j24 != -1) {
                                j25 += j24;
                            }
                            j11 = j25;
                            linkedHashMap2 = linkedHashMap3;
                            eVar3 = eVar4;
                            j18 = -1;
                            arrayList11 = arrayList;
                            gVar = gVar2;
                            str11 = str14;
                        } else {
                            String str15 = str11;
                            ArrayList arrayList12 = arrayList9;
                            ArrayList arrayList13 = arrayList10;
                            if (b.startsWith("#EXT-X-TARGETDURATION")) {
                                j19 = Integer.parseInt(l(b, o, Collections.EMPTY_MAP)) * 1000000;
                            } else if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j13 = Long.parseLong(l(b, A, Collections.EMPTY_MAP));
                                linkedHashMap2 = linkedHashMap3;
                                arrayList9 = arrayList12;
                                j21 = j13;
                                arrayList11 = arrayList;
                                gVar = gVar2;
                                str11 = str15;
                                arrayList10 = arrayList13;
                            } else if (b.startsWith("#EXT-X-VERSION")) {
                                i9 = Integer.parseInt(l(b, s, Collections.EMPTY_MAP));
                            } else {
                                if (b.startsWith("#EXT-X-DEFINE")) {
                                    String k4 = k(b, d0, null, hashMap3);
                                    if (k4 != null) {
                                        String str16 = cVar3.l.get(k4);
                                        if (str16 != null) {
                                            hashMap3.put(k4, str16);
                                        }
                                    } else {
                                        hashMap3.put(l(b, S, hashMap3), l(b, c0, hashMap3));
                                    }
                                } else if (b.startsWith("#EXTINF")) {
                                    j16 = new BigDecimal(l(b, B, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    str9 = k(b, C, str8, hashMap3);
                                } else if (b.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(l(b, w, Collections.EMPTY_MAP));
                                    fxc0.z((bVar2 == null || !arrayList8.isEmpty()) ? i12 : 1);
                                    String str17 = y2r0.a;
                                    long j26 = bVar2.k;
                                    ImmutableList immutableList = bVar2.r;
                                    int i17 = (int) (j21 - j26);
                                    int i18 = parseInt + i17;
                                    if (i17 < 0 || i18 > immutableList.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    long j27 = j12;
                                    while (i17 < i18) {
                                        b.e eVar5 = (b.e) immutableList.get(i17);
                                        int i19 = i18;
                                        int i20 = i17;
                                        if (j21 != bVar2.k) {
                                            eVar5 = eVar5.a((bVar2.j - i10) + eVar5.e, j27);
                                        }
                                        arrayList8.add(eVar5);
                                        long j28 = eVar5.d;
                                        String str18 = eVar5.i;
                                        j15 = j27 + j28;
                                        long j29 = eVar5.k;
                                        if (j29 != -1) {
                                            j11 = eVar5.j + j29;
                                        }
                                        int i21 = eVar5.e;
                                        b.e eVar6 = eVar5.c;
                                        DrmInitData drmInitData7 = eVar5.g;
                                        String str19 = eVar5.h;
                                        if (str18 == null || !str18.equals(Long.toHexString(j13))) {
                                            str15 = str18;
                                        }
                                        j13++;
                                        i11 = i21;
                                        eVar3 = eVar6;
                                        str12 = str19;
                                        i18 = i19;
                                        drmInitData6 = drmInitData7;
                                        j27 = j15;
                                        i17 = i20 + 1;
                                    }
                                    cVar3 = cVar;
                                    j12 = j27;
                                } else if (b.startsWith("#EXT-X-KEY")) {
                                    String l4 = l(b, K, hashMap3);
                                    String k5 = k(b, L, "identity", hashMap3);
                                    if ("NONE".equals(l4)) {
                                        treeMap2.clear();
                                        str11 = null;
                                    } else {
                                        String k6 = k(b, O, null, hashMap3);
                                        if (!"identity".equals(k5)) {
                                            if (str10 == null) {
                                                str10 = ("SAMPLE-AES-CENC".equals(l4) || "SAMPLE-AES-CTR".equals(l4)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
                                            }
                                            DrmInitData.SchemeData e2 = e(b, hashMap3, k5);
                                            if (e2 != null) {
                                                treeMap2.put(k5, e2);
                                                str11 = k6;
                                            }
                                        } else if ("AES-128".equals(l4)) {
                                            str12 = l(b, pattern2, hashMap3);
                                            str11 = k6;
                                            cVar3 = cVar;
                                            linkedHashMap2 = linkedHashMap3;
                                            arrayList9 = arrayList12;
                                            arrayList11 = arrayList;
                                            gVar = gVar2;
                                            arrayList10 = arrayList13;
                                        }
                                        str11 = k6;
                                        str12 = null;
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        arrayList10 = arrayList13;
                                    }
                                    drmInitData6 = null;
                                    str12 = null;
                                    cVar3 = cVar;
                                    linkedHashMap2 = linkedHashMap3;
                                    arrayList9 = arrayList12;
                                    arrayList11 = arrayList;
                                    gVar = gVar2;
                                    arrayList10 = arrayList13;
                                } else {
                                    if (b.startsWith("#EXT-X-BYTERANGE")) {
                                        String l5 = l(b, G, hashMap3);
                                        String str20 = y2r0.a;
                                        String[] split2 = l5.split("@", -1);
                                        j18 = Long.parseLong(split2[i12]);
                                        if (split2.length > 1) {
                                            j11 = Long.parseLong(split2[1]);
                                        }
                                    } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i10 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        str11 = str15;
                                        arrayList10 = arrayList13;
                                        z5 = true;
                                    } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                        i11++;
                                    } else if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (j14 == 0) {
                                            j14 = y2r0.S(y2r0.V(b.substring(b.indexOf(58) + 1))) - j12;
                                        }
                                    } else if (b.equals("#EXT-X-GAP")) {
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        str11 = str15;
                                        arrayList10 = arrayList13;
                                        i13 = 1;
                                    } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        str11 = str15;
                                        arrayList10 = arrayList13;
                                        z3 = true;
                                    } else if (b.equals("#EXT-X-ENDLIST")) {
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        str11 = str15;
                                        arrayList10 = arrayList13;
                                        z4 = true;
                                    } else if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                        long j30 = j(b, D);
                                        Matcher matcher2 = E.matcher(b);
                                        if (matcher2.find()) {
                                            String group = matcher2.group(1);
                                            group.getClass();
                                            i3 = Integer.parseInt(group);
                                        } else {
                                            i3 = -1;
                                        }
                                        arrayList13.add(new b.d(Uri.parse(neq0.c(str, l(b, pattern2, hashMap3))), j30, i3));
                                    } else {
                                        if (b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                            if (cVar4 == null && "PART".equals(l(b, Q, hashMap3))) {
                                                String l6 = l(b, pattern2, hashMap3);
                                                long j31 = j(b, I);
                                                long j32 = j(b, J);
                                                String hexString = str12 == null ? null : str15 != null ? str15 : Long.toHexString(j13);
                                                if (drmInitData6 != null || treeMap2.isEmpty()) {
                                                    drmInitData = drmInitData6;
                                                } else {
                                                    DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[i12]);
                                                    DrmInitData drmInitData8 = new DrmInitData(str10, schemeDataArr);
                                                    if (drmInitData5 == null) {
                                                        drmInitData5 = c(str10, schemeDataArr);
                                                    }
                                                    drmInitData = drmInitData8;
                                                }
                                                if (j31 == -1 || j32 != -1) {
                                                    cVar4 = new b.c(l6, eVar3, 0L, i11, j15, drmInitData, str12, hexString, j31 != -1 ? j31 : 0L, j32, false, false, true);
                                                }
                                                arrayList10 = arrayList13;
                                                linkedHashMap2 = linkedHashMap3;
                                                arrayList9 = arrayList12;
                                                drmInitData6 = drmInitData;
                                                arrayList11 = arrayList;
                                                gVar = gVar2;
                                                str11 = str15;
                                                i12 = 0;
                                            } else {
                                                arrayList13 = arrayList13;
                                            }
                                        } else if (b.startsWith("#EXT-X-PART")) {
                                            String hexString2 = str12 == null ? null : str15 != null ? str15 : Long.toHexString(j13);
                                            String l7 = l(b, pattern2, hashMap3);
                                            long parseDouble2 = (long) (Double.parseDouble(l(b, p, Collections.EMPTY_MAP)) * 1000000.0d);
                                            boolean h3 = h(b, Z) | (z3 && arrayList12.isEmpty());
                                            boolean h4 = h(b, a0);
                                            String k7 = k(b, pattern, null, hashMap3);
                                            if (k7 != null) {
                                                String str21 = y2r0.a;
                                                String[] split3 = k7.split("@", -1);
                                                long parseLong = Long.parseLong(split3[0]);
                                                j5 = parseDouble2;
                                                if (split3.length > 1) {
                                                    j17 = Long.parseLong(split3[1]);
                                                }
                                                j6 = parseLong;
                                            } else {
                                                j5 = parseDouble2;
                                                j6 = -1;
                                            }
                                            long j33 = j6 == -1 ? 0L : j17;
                                            if (drmInitData6 != null || treeMap2.isEmpty()) {
                                                drmInitData2 = drmInitData6;
                                            } else {
                                                DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[0]);
                                                DrmInitData drmInitData9 = new DrmInitData(str10, schemeDataArr2);
                                                if (drmInitData5 == null) {
                                                    drmInitData5 = c(str10, schemeDataArr2);
                                                }
                                                drmInitData2 = drmInitData9;
                                            }
                                            b.e eVar7 = eVar3;
                                            int i22 = i11;
                                            arrayList12.add(new b.c(l7, eVar3, j5, i11, j15, drmInitData2, str12, hexString2, j33, j6, h4, h3, false));
                                            j15 += j5;
                                            if (j6 != -1) {
                                                j33 += j6;
                                            }
                                            j17 = j33;
                                            eVar3 = eVar7;
                                            i11 = i22;
                                            arrayList9 = arrayList12;
                                            linkedHashMap2 = linkedHashMap3;
                                            drmInitData6 = drmInitData2;
                                            arrayList11 = arrayList;
                                            gVar = gVar2;
                                            str11 = str15;
                                            i12 = 0;
                                            arrayList10 = arrayList13;
                                        } else {
                                            b.e eVar8 = eVar3;
                                            int i23 = i11;
                                            if (b.startsWith("#EXT-X-DATERANGE") && k(b, f0, str8, hashMap3).equals("com.apple.hls.interstitial")) {
                                                String l8 = l(b, e0, hashMap3);
                                                eVar = eVar8;
                                                String k8 = k(b, l0, null, hashMap3);
                                                Uri parse = k8 != null ? Uri.parse(k8) : null;
                                                i4 = i23;
                                                String k9 = k(b, m0, null, hashMap3);
                                                Uri parse2 = k9 != null ? Uri.parse(k9) : null;
                                                arrayList5 = arrayList12;
                                                String k10 = k(b, g0, null, hashMap3);
                                                if (k10 != null) {
                                                    str2 = str8;
                                                    j8 = y2r0.S(y2r0.V(k10));
                                                } else {
                                                    str2 = str8;
                                                    j8 = -9223372036854775807L;
                                                }
                                                String k11 = k(b, i0, null, hashMap3);
                                                long S2 = k11 != null ? y2r0.S(y2r0.V(k11)) : -9223372036854775807L;
                                                ArrayList arrayList14 = new ArrayList();
                                                treeMap = treeMap2;
                                                String k12 = k(b, h0, null, hashMap3);
                                                if (k12 != null) {
                                                    String str22 = y2r0.a;
                                                    String[] split4 = k12.split(StringUtils.COMMA, -1);
                                                    int length = split4.length;
                                                    int i24 = 0;
                                                    while (i24 < length) {
                                                        int i25 = length;
                                                        String trim = split4[i24].trim();
                                                        trim.getClass();
                                                        switch (trim.hashCode()) {
                                                            case 79491:
                                                                i7 = i24;
                                                                if (trim.equals("PRE")) {
                                                                    c3 = 0;
                                                                    break;
                                                                }
                                                                c3 = 65535;
                                                                break;
                                                            case 2430593:
                                                                i7 = i24;
                                                                if (trim.equals("ONCE")) {
                                                                    c3 = 1;
                                                                    break;
                                                                }
                                                                c3 = 65535;
                                                                break;
                                                            case 2461856:
                                                                i7 = i24;
                                                                if (trim.equals("POST")) {
                                                                    c3 = 2;
                                                                    break;
                                                                }
                                                                c3 = 65535;
                                                                break;
                                                            default:
                                                                i7 = i24;
                                                                c3 = 65535;
                                                                break;
                                                        }
                                                        switch (c3) {
                                                            case 0:
                                                            case 1:
                                                            case 2:
                                                                arrayList14.add(trim);
                                                                break;
                                                        }
                                                        i24 = i7 + 1;
                                                        length = i25;
                                                    }
                                                }
                                                str4 = str10;
                                                double i26 = i(b, q, -1.0d);
                                                long j34 = i26 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i26 * 1000000.0d) : -9223372036854775807L;
                                                hashMap2 = hashMap4;
                                                arrayList4 = arrayList8;
                                                double i27 = i(b, j0, -1.0d);
                                                long j35 = i27 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i27 * 1000000.0d) : -9223372036854775807L;
                                                boolean h5 = h(b, k0);
                                                cVar2 = cVar4;
                                                arrayList13 = arrayList13;
                                                double i28 = i(b, n0, Double.MIN_VALUE);
                                                long j36 = i28 != Double.MIN_VALUE ? (long) (i28 * 1000000.0d) : -9223372036854775807L;
                                                double i29 = i(b, o0, -1.0d);
                                                long j37 = i29 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i29 * 1000000.0d) : -9223372036854775807L;
                                                ArrayList arrayList15 = new ArrayList();
                                                long j38 = j37;
                                                String k13 = k(b, p0, null, hashMap3);
                                                if (k13 != null) {
                                                    String str23 = y2r0.a;
                                                    String[] split5 = k13.split(StringUtils.COMMA, -1);
                                                    int length2 = split5.length;
                                                    int i30 = 0;
                                                    while (i30 < length2) {
                                                        int i31 = i30;
                                                        String trim2 = split5[i30].trim();
                                                        trim2.getClass();
                                                        int i32 = length2;
                                                        if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                            arrayList15.add(trim2);
                                                        }
                                                        i30 = i31 + 1;
                                                        length2 = i32;
                                                    }
                                                }
                                                ArrayList arrayList16 = new ArrayList();
                                                String k14 = k(b, q0, null, hashMap3);
                                                if (k14 != null) {
                                                    String str24 = y2r0.a;
                                                    String[] split6 = k14.split(StringUtils.COMMA, -1);
                                                    int length3 = split6.length;
                                                    int i33 = 0;
                                                    while (i33 < length3) {
                                                        String[] strArr = split6;
                                                        String trim3 = split6[i33].trim();
                                                        trim3.getClass();
                                                        int i34 = length3;
                                                        if (trim3.equals("JUMP") || trim3.equals(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP)) {
                                                            arrayList16.add(trim3);
                                                        }
                                                        i33++;
                                                        length3 = i34;
                                                        split6 = strArr;
                                                    }
                                                }
                                                Boolean valueOf = k(b, r0, null, hashMap3) != null ? Boolean.valueOf(!r1.equals("NO")) : null;
                                                String k15 = k(b, s0, null, hashMap3);
                                                if (k15 != null) {
                                                    str5 = "RANGE";
                                                    if (!k15.equals("RANGE")) {
                                                        str5 = "POINT";
                                                    }
                                                    String str25 = str5;
                                                    k2 = k(b, t0, null, hashMap3);
                                                    if (k2 != null) {
                                                        str6 = "PRIMARY";
                                                        if (!k2.equals("PRIMARY")) {
                                                            str6 = "HIGHLIGHT";
                                                        }
                                                        Boolean bool = valueOf;
                                                        String str26 = str6;
                                                        double i35 = i(b, u0, -1.0d);
                                                        long j39 = i35 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i35 * 1000000.0d) : -9223372036854775807L;
                                                        double i36 = i(b, v0, -1.0d);
                                                        long j40 = i36 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i36 * 1000000.0d) : -9223372036854775807L;
                                                        String k16 = k(b, w0, null, hashMap3);
                                                        ArrayList arrayList17 = new ArrayList();
                                                        String substring = b.substring(17);
                                                        matcher = y0.matcher(substring);
                                                        while (matcher.find()) {
                                                            Matcher matcher3 = matcher;
                                                            String group2 = matcher3.group();
                                                            group2.getClass();
                                                            switch (group2.hashCode()) {
                                                                case -2136701954:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-SNAP=")) {
                                                                        c2 = 0;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case -1843050726:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-CONTENT-MAY-VARY=")) {
                                                                        c2 = 1;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case -148960310:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                        c2 = 2;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case -36345757:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-TIMELINE-STYLE=")) {
                                                                        c2 = 3;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case 397239341:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-ASSET-LIST=")) {
                                                                        c2 = 4;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case 850193465:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                        c2 = 5;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case 1065650400:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-SKIP-CONTROL-DURATION=")) {
                                                                        c2 = 6;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case 1274498945:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                                        c2 = 7;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case 1472528844:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-RESTRICT=")) {
                                                                        c2 = '\b';
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case 1748487807:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-RESUME-OFFSET=")) {
                                                                        c2 = '\t';
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case 1814205923:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-ASSET-URI=")) {
                                                                        c2 = '\n';
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                case 2080546752:
                                                                    str7 = k16;
                                                                    if (group2.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                                        c2 = 11;
                                                                        break;
                                                                    }
                                                                    c2 = 65535;
                                                                    break;
                                                                default:
                                                                    str7 = k16;
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
                                                                    arrayList6 = arrayList16;
                                                                    j9 = j35;
                                                                    arrayList7 = arrayList14;
                                                                    break;
                                                                default:
                                                                    arrayList6 = arrayList16;
                                                                    String c4 = qoy.c(1, 0, group2);
                                                                    String a2 = fo8.a(c4, "=");
                                                                    int length4 = a2.length() + substring.indexOf(a2);
                                                                    arrayList7 = arrayList14;
                                                                    String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                    if (substring2.startsWith("\"")) {
                                                                        aVar2 = new b.a(c4, l(substring, Pattern.compile(c4 + "=\"((?:.|\f)+?)\""), hashMap3), 0);
                                                                        j9 = j35;
                                                                    } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                        j9 = j35;
                                                                        aVar2 = new b.a(c4, l(substring, Pattern.compile(c4 + "=(0[xX][A-F0-9]+)"), hashMap3), 1);
                                                                    } else {
                                                                        j9 = j35;
                                                                        aVar2 = new b.a(c4, Double.parseDouble(l(substring, Pattern.compile(c4 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                                    }
                                                                    arrayList17.add(aVar2);
                                                                    break;
                                                            }
                                                            matcher = matcher3;
                                                            k16 = str7;
                                                            arrayList16 = arrayList6;
                                                            arrayList14 = arrayList7;
                                                            j35 = j9;
                                                        }
                                                        ArrayList arrayList18 = arrayList16;
                                                        String str27 = k16;
                                                        long j41 = j35;
                                                        ArrayList arrayList19 = arrayList14;
                                                        linkedHashMap = linkedHashMap3;
                                                        b.C0058b.a aVar3 = linkedHashMap.containsKey(l8) ? (b.C0058b.a) linkedHashMap.get(l8) : new b.C0058b.a(l8);
                                                        aVar3.c(parse);
                                                        aVar3.b(parse2);
                                                        aVar3.r(j8);
                                                        aVar3.h(S2);
                                                        aVar3.g(j34);
                                                        aVar3.j(j41);
                                                        aVar3.f(arrayList19);
                                                        aVar3.i(h5);
                                                        aVar3.m(j36);
                                                        aVar3.k(j38);
                                                        aVar3.q(arrayList15);
                                                        aVar3.l(arrayList18);
                                                        aVar3.d(arrayList17);
                                                        aVar3.e(bool);
                                                        aVar3.s(str25);
                                                        aVar3.t(str26);
                                                        aVar3.p(j39);
                                                        aVar3.n(j40);
                                                        aVar3.o(str27);
                                                        linkedHashMap.put(l8, aVar3);
                                                    }
                                                    str6 = null;
                                                    Boolean bool2 = valueOf;
                                                    String str262 = str6;
                                                    double i352 = i(b, u0, -1.0d);
                                                    long j392 = i352 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i352 * 1000000.0d) : -9223372036854775807L;
                                                    double i362 = i(b, v0, -1.0d);
                                                    long j402 = i362 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i362 * 1000000.0d) : -9223372036854775807L;
                                                    String k162 = k(b, w0, null, hashMap3);
                                                    ArrayList arrayList172 = new ArrayList();
                                                    String substring3 = b.substring(17);
                                                    matcher = y0.matcher(substring3);
                                                    while (matcher.find()) {
                                                    }
                                                    ArrayList arrayList182 = arrayList16;
                                                    String str272 = k162;
                                                    long j412 = j35;
                                                    ArrayList arrayList192 = arrayList14;
                                                    linkedHashMap = linkedHashMap3;
                                                    if (linkedHashMap.containsKey(l8)) {
                                                    }
                                                    aVar3.c(parse);
                                                    aVar3.b(parse2);
                                                    aVar3.r(j8);
                                                    aVar3.h(S2);
                                                    aVar3.g(j34);
                                                    aVar3.j(j412);
                                                    aVar3.f(arrayList192);
                                                    aVar3.i(h5);
                                                    aVar3.m(j36);
                                                    aVar3.k(j38);
                                                    aVar3.q(arrayList15);
                                                    aVar3.l(arrayList182);
                                                    aVar3.d(arrayList172);
                                                    aVar3.e(bool2);
                                                    aVar3.s(str25);
                                                    aVar3.t(str262);
                                                    aVar3.p(j392);
                                                    aVar3.n(j402);
                                                    aVar3.o(str272);
                                                    linkedHashMap.put(l8, aVar3);
                                                }
                                                str5 = null;
                                                String str252 = str5;
                                                k2 = k(b, t0, null, hashMap3);
                                                if (k2 != null) {
                                                }
                                                str6 = null;
                                                Boolean bool22 = valueOf;
                                                String str2622 = str6;
                                                double i3522 = i(b, u0, -1.0d);
                                                long j3922 = i3522 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i3522 * 1000000.0d) : -9223372036854775807L;
                                                double i3622 = i(b, v0, -1.0d);
                                                long j4022 = i3622 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (i3622 * 1000000.0d) : -9223372036854775807L;
                                                String k1622 = k(b, w0, null, hashMap3);
                                                ArrayList arrayList1722 = new ArrayList();
                                                String substring32 = b.substring(17);
                                                matcher = y0.matcher(substring32);
                                                while (matcher.find()) {
                                                }
                                                ArrayList arrayList1822 = arrayList16;
                                                String str2722 = k1622;
                                                long j4122 = j35;
                                                ArrayList arrayList1922 = arrayList14;
                                                linkedHashMap = linkedHashMap3;
                                                if (linkedHashMap.containsKey(l8)) {
                                                }
                                                aVar3.c(parse);
                                                aVar3.b(parse2);
                                                aVar3.r(j8);
                                                aVar3.h(S2);
                                                aVar3.g(j34);
                                                aVar3.j(j4122);
                                                aVar3.f(arrayList1922);
                                                aVar3.i(h5);
                                                aVar3.m(j36);
                                                aVar3.k(j38);
                                                aVar3.q(arrayList15);
                                                aVar3.l(arrayList1822);
                                                aVar3.d(arrayList1722);
                                                aVar3.e(bool22);
                                                aVar3.s(str252);
                                                aVar3.t(str2622);
                                                aVar3.p(j3922);
                                                aVar3.n(j4022);
                                                aVar3.o(str2722);
                                                linkedHashMap.put(l8, aVar3);
                                            } else {
                                                arrayList13 = arrayList13;
                                                cVar2 = cVar4;
                                                hashMap2 = hashMap4;
                                                arrayList4 = arrayList8;
                                                eVar = eVar8;
                                                i4 = i23;
                                                arrayList5 = arrayList12;
                                                treeMap = treeMap2;
                                                str4 = str10;
                                                str2 = str8;
                                                linkedHashMap = linkedHashMap3;
                                                if (!b.startsWith("#")) {
                                                    String hexString3 = str12 == null ? null : str15 != null ? str15 : Long.toHexString(j13);
                                                    long j42 = j13 + 1;
                                                    String m2 = m(b, hashMap3);
                                                    b.e eVar9 = (b.e) hashMap2.get(m2);
                                                    if (j18 == -1) {
                                                        eVar2 = eVar9;
                                                        j11 = 0;
                                                    } else if (z6 && eVar == null && eVar9 == null) {
                                                        b.e eVar10 = new b.e(0L, j11, m2, null, null);
                                                        hashMap2.put(m2, eVar10);
                                                        eVar2 = eVar10;
                                                    } else {
                                                        eVar2 = eVar9;
                                                        j11 = j11;
                                                    }
                                                    if (drmInitData6 != null || treeMap.isEmpty()) {
                                                        str10 = str4;
                                                        i5 = 0;
                                                        drmInitData3 = drmInitData5;
                                                        i6 = i4;
                                                        j7 = j12;
                                                        drmInitData4 = drmInitData6;
                                                    } else {
                                                        i5 = 0;
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        str10 = str4;
                                                        DrmInitData drmInitData10 = new DrmInitData(str10, schemeDataArr3);
                                                        if (drmInitData5 == null) {
                                                            drmInitData3 = c(str10, schemeDataArr3);
                                                            drmInitData4 = drmInitData10;
                                                        } else {
                                                            drmInitData4 = drmInitData10;
                                                            drmInitData3 = drmInitData5;
                                                        }
                                                        i6 = i4;
                                                        j7 = j12;
                                                    }
                                                    long j43 = j11;
                                                    int i37 = i6;
                                                    String str28 = str12;
                                                    long j44 = j16;
                                                    i11 = i37;
                                                    str12 = str28;
                                                    arrayList4.add(new b.e(m2, eVar != null ? eVar : eVar2, str9, j44, i37, j7, drmInitData4, str28, hexString3, j43, j18, i13, arrayList5));
                                                    j15 = j7 + j44;
                                                    ArrayList arrayList20 = new ArrayList();
                                                    j11 = j18 != -1 ? j43 + j18 : j43;
                                                    j13 = j42;
                                                    hashMap4 = hashMap2;
                                                    drmInitData5 = drmInitData3;
                                                    i12 = i5;
                                                    i13 = i12;
                                                    drmInitData6 = drmInitData4;
                                                    j12 = j15;
                                                    eVar3 = eVar;
                                                    str8 = str2;
                                                    str9 = str8;
                                                    treeMap2 = treeMap;
                                                    j16 = 0;
                                                    j18 = -1;
                                                    arrayList11 = arrayList;
                                                    gVar = gVar2;
                                                    str11 = str15;
                                                    arrayList10 = arrayList13;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList8 = arrayList4;
                                                    arrayList9 = arrayList20;
                                                    cVar4 = cVar2;
                                                    cVar3 = cVar;
                                                    bVar2 = bVar;
                                                }
                                            }
                                            j2 = j11;
                                            i11 = i4;
                                            j3 = j12;
                                            arrayList3 = arrayList5;
                                            str10 = str4;
                                            hashMap = hashMap2;
                                            arrayList2 = arrayList4;
                                            j4 = j16;
                                            str3 = str9;
                                            i2 = 0;
                                            arrayList8 = arrayList2;
                                            hashMap4 = hashMap;
                                            i12 = i2;
                                            str9 = str3;
                                            j16 = j4;
                                            j12 = j3;
                                            j11 = j2;
                                            eVar3 = eVar;
                                            str8 = str2;
                                            treeMap2 = treeMap;
                                            arrayList11 = arrayList;
                                            gVar = gVar2;
                                            str11 = str15;
                                            arrayList10 = arrayList13;
                                            bVar2 = bVar;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList9 = arrayList3;
                                            cVar4 = cVar2;
                                        }
                                        cVar3 = cVar;
                                    }
                                    cVar3 = cVar;
                                }
                                cVar2 = cVar4;
                                hashMap = hashMap4;
                                arrayList2 = arrayList8;
                                treeMap = treeMap2;
                                str2 = str8;
                                j2 = j11;
                                linkedHashMap = linkedHashMap3;
                                arrayList3 = arrayList12;
                                j3 = j12;
                                eVar = eVar3;
                                i2 = i12;
                                j4 = j16;
                                str3 = str9;
                                arrayList8 = arrayList2;
                                hashMap4 = hashMap;
                                i12 = i2;
                                str9 = str3;
                                j16 = j4;
                                j12 = j3;
                                j11 = j2;
                                eVar3 = eVar;
                                str8 = str2;
                                treeMap2 = treeMap;
                                arrayList11 = arrayList;
                                gVar = gVar2;
                                str11 = str15;
                                arrayList10 = arrayList13;
                                bVar2 = bVar;
                                linkedHashMap2 = linkedHashMap;
                                arrayList9 = arrayList3;
                                cVar4 = cVar2;
                                cVar3 = cVar;
                            }
                            linkedHashMap2 = linkedHashMap3;
                            arrayList9 = arrayList12;
                            arrayList11 = arrayList;
                            gVar = gVar2;
                            str11 = str15;
                            arrayList10 = arrayList13;
                        }
                    }
                }
                arrayList11 = arrayList;
            }
        }
        b.c cVar5 = cVar4;
        ArrayList arrayList21 = arrayList8;
        ArrayList arrayList22 = arrayList9;
        ArrayList arrayList23 = arrayList10;
        ArrayList arrayList24 = arrayList11;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        b.g gVar3 = gVar;
        int i38 = i12;
        HashMap hashMap5 = new HashMap();
        int i39 = i38;
        while (i39 < arrayList23.size()) {
            ArrayList arrayList25 = arrayList23;
            b.d dVar = (b.d) arrayList25.get(i39);
            long j45 = dVar.b;
            if (j45 == -1) {
                j45 = (j21 + arrayList21.size()) - (arrayList22.isEmpty() ? 1L : 0L);
            }
            int i40 = dVar.c;
            if (i40 == -1 && j20 != C.TIME_UNSET) {
                i40 = (arrayList22.isEmpty() ? ((b.e) sd9.k(arrayList21)).n : arrayList22).size() - 1;
            }
            Uri uri = dVar.a;
            hashMap5.put(uri, new b.d(uri, j45, i40));
            i39++;
            arrayList23 = arrayList25;
        }
        if (cVar5 != null) {
            arrayList22.add(cVar5);
        }
        ArrayList arrayList26 = new ArrayList();
        Iterator it = linkedHashMap4.values().iterator();
        while (it.hasNext()) {
            b.C0058b a3 = ((b.C0058b.a) it.next()).a();
            if (a3 != null) {
                arrayList26.add(a3);
            }
        }
        long j46 = (j14 == 0 && bVar != null && bVar.p) ? bVar.h : j14;
        return new b(i8, str, arrayList24, j10, z7, j46, z5, i10, j21, i9, j19, j20, z3, z4, j46 != 0 ? 1 : i38, drmInitData5, arrayList21, arrayList22, gVar3, hashMap5, arrayList26);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019b, code lost:
    
        if (r7.equals("db1p") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ab, code lost:
    
        if (r7.equals("db2g") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bb, code lost:
    
        if (r7.startsWith("db4") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f0, code lost:
    
        if (r3 > 0) goto L86;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:135:0x042f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0202  */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c g(a aVar, String str) throws IOException {
        int i2;
        ArrayList arrayList;
        char c2;
        c.b bVar;
        String str2;
        ArrayList arrayList2;
        int parseInt;
        String str3;
        c.b bVar2;
        String str4;
        c.b bVar3;
        HashMap hashMap;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i4;
        String str5;
        String str6;
        String w2;
        String k2;
        int i5;
        int i6;
        Uri d2;
        ArrayList arrayList8;
        String str7;
        String str8 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean a2 = aVar.a();
            Pattern pattern = N;
            ArrayList arrayList17 = arrayList13;
            boolean z4 = z2;
            Pattern pattern2 = S;
            boolean z5 = z3;
            if (!a2) {
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList10;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList16;
                ArrayList arrayList23 = arrayList15;
                ArrayList arrayList24 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i7 = 0;
                HashMap hashMap4 = hashMap2;
                while (i7 < arrayList9.size()) {
                    c.b bVar4 = (c.b) arrayList9.get(i7);
                    Uri uri = bVar4.a;
                    androidx.media3.common.a aVar2 = bVar4.b;
                    if (hashSet2.add(uri)) {
                        fxc0.z(aVar2.l == null);
                        ArrayList arrayList25 = (ArrayList) hashMap4.get(bVar4.a);
                        arrayList25.getClass();
                        hashMap = hashMap4;
                        hashSet = hashSet2;
                        fi20 fi20Var = new fi20(new u9v(null, null, arrayList25));
                        a.C0043a a3 = aVar2.a();
                        a3.m(fi20Var);
                        arrayList24.add(bVar4.a(a3.a()));
                    } else {
                        hashMap = hashMap4;
                        hashSet = hashSet2;
                    }
                    i7++;
                    hashSet2 = hashSet;
                    hashMap4 = hashMap;
                }
                int i8 = 0;
                ArrayList arrayList26 = null;
                androidx.media3.common.a aVar3 = null;
                while (i8 < arrayList18.size()) {
                    String str9 = (String) arrayList18.get(i8);
                    String l2 = l(str9, T, hashMap3);
                    String l3 = l(str9, pattern2, hashMap3);
                    int i9 = i8;
                    a.C0043a c0043a = new a.C0043a();
                    ArrayList arrayList27 = arrayList24;
                    c0043a.j(l2 + StringUtils.PROCESS_POSTFIX_DELIMITER + l3);
                    c0043a.k(l3);
                    c0043a.f(MimeTypes.APPLICATION_M3U8);
                    ?? h2 = h(str9, X);
                    int i10 = h2;
                    if (h(str9, Y)) {
                        i10 = (h2 == true ? 1 : 0) | 2;
                    }
                    int i11 = i10;
                    if (h(str9, W)) {
                        i11 = (i10 == true ? 1 : 0) | 4;
                    }
                    c0043a.s(i11);
                    String k3 = k(str9, U, null, hashMap3);
                    if (TextUtils.isEmpty(k3)) {
                        arrayList = arrayList26;
                        i2 = 0;
                    } else {
                        String str10 = y2r0.a;
                        String[] split = k3.split(StringUtils.COMMA, -1);
                        i2 = y2r0.m(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList = arrayList26;
                        if (y2r0.m(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i2 |= 4096;
                        }
                        if (y2r0.m(split, "public.accessibility.describes-music-and-sound")) {
                            i2 |= 1024;
                        }
                        if (y2r0.m(split, "public.easy-to-read")) {
                            i2 |= 8192;
                        }
                    }
                    c0043a.p(i2);
                    c0043a.l(k(str9, R, null, hashMap3));
                    String k4 = k(str9, pattern, null, hashMap3);
                    Uri d3 = k4 == null ? null : neq0.d(str8, k4);
                    fi20 fi20Var2 = new fi20(new u9v(l2, l3, Collections.EMPTY_LIST));
                    String l4 = l(str9, P, hashMap3);
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
                            if (l4.equals(SignalingProtocol.MEDIA_OPTION_AUDIO)) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (l4.equals(SignalingProtocol.MEDIA_OPTION_VIDEO)) {
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
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList9.size()) {
                                    bVar = (c.b) arrayList9.get(i12);
                                    if (!l2.equals(bVar.e)) {
                                        i12++;
                                    }
                                } else {
                                    bVar = null;
                                }
                            }
                            if (bVar != null) {
                                String w3 = y2r0.w(bVar.b.k, 3);
                                c0043a.e(w3);
                                str2 = io20.e(w3);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = MimeTypes.TEXT_VTT;
                            }
                            c0043a.q(str2);
                            c0043a.m(fi20Var2);
                            if (d3 != null) {
                                arrayList2 = arrayList21;
                                arrayList2.add(new c.a(d3, c0043a.a(), l3));
                            } else {
                                arrayList2 = arrayList21;
                                ahn.F("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList26 = arrayList;
                            break;
                        case 1:
                            ArrayList arrayList28 = arrayList20;
                            String l5 = l(str9, V, hashMap3);
                            if (l5.startsWith("CC")) {
                                parseInt = Integer.parseInt(l5.substring(2));
                                str3 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                parseInt = Integer.parseInt(l5.substring(7));
                                str3 = MimeTypes.APPLICATION_CEA708;
                            }
                            ArrayList arrayList29 = arrayList == null ? new ArrayList() : arrayList;
                            c0043a.q(str3);
                            c0043a.b(parseInt);
                            arrayList29.add(c0043a.a());
                            arrayList20 = arrayList28;
                            arrayList26 = arrayList29;
                            arrayList2 = arrayList21;
                            break;
                        case 2:
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList9.size()) {
                                    bVar2 = (c.b) arrayList9.get(i13);
                                    int i14 = i13;
                                    if (!l2.equals(bVar2.d)) {
                                        i13 = i14 + 1;
                                    }
                                } else {
                                    bVar2 = null;
                                }
                            }
                            if (bVar2 != null) {
                                String w4 = y2r0.w(bVar2.b.k, 1);
                                c0043a.e(w4);
                                str4 = io20.e(w4);
                            } else {
                                str4 = null;
                            }
                            c.b bVar5 = bVar2;
                            String k5 = k(str9, i, null, hashMap3);
                            if (k5 != null) {
                                String str11 = y2r0.a;
                                c0043a.d(Integer.parseInt(k5.split(DomExceptionUtils.SEPARATOR, 2)[0]));
                                if (MimeTypes.AUDIO_E_AC3.equals(str4) && k5.endsWith("/JOC")) {
                                    c0043a.e("ec+3");
                                    str4 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            c0043a.q(str4);
                            if (d3 != null) {
                                c0043a.m(fi20Var2);
                                arrayList20.add(new c.a(d3, c0043a.a(), l3));
                            } else {
                                ArrayList arrayList30 = arrayList20;
                                if (bVar5 != null) {
                                    aVar3 = c0043a.a();
                                    arrayList20 = arrayList30;
                                    arrayList2 = arrayList21;
                                    arrayList26 = arrayList;
                                    break;
                                } else {
                                    arrayList20 = arrayList30;
                                }
                            }
                            arrayList2 = arrayList21;
                            arrayList26 = arrayList;
                            break;
                        case 3:
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList9.size()) {
                                    bVar3 = (c.b) arrayList9.get(i15);
                                    if (!l2.equals(bVar3.c)) {
                                        i15++;
                                    }
                                } else {
                                    bVar3 = null;
                                }
                            }
                            if (bVar3 != null) {
                                androidx.media3.common.a aVar4 = bVar3.b;
                                String w5 = y2r0.w(aVar4.k, 2);
                                c0043a.e(w5);
                                c0043a.q(io20.e(w5));
                                c0043a.t(aVar4.u);
                                c0043a.h(aVar4.v);
                                c0043a.g(aVar4.y);
                            }
                            if (d3 != null) {
                                c0043a.m(fi20Var2);
                                arrayList19.add(new c.a(d3, c0043a.a(), l3));
                            }
                            arrayList2 = arrayList21;
                            arrayList26 = arrayList;
                            break;
                        default:
                            arrayList2 = arrayList21;
                            arrayList26 = arrayList;
                            break;
                    }
                    i8 = i9 + 1;
                    arrayList24 = arrayList27;
                    str8 = str;
                    arrayList21 = arrayList2;
                }
                return new c(str, arrayList22, arrayList24, arrayList19, arrayList20, arrayList21, arrayList17, aVar3, z4 ? Collections.EMPTY_LIST : arrayList26, z5, hashMap3, arrayList23);
            }
            String b = aVar.b();
            ArrayList arrayList31 = arrayList12;
            if (b.startsWith("#EXT")) {
                arrayList16.add(b);
            }
            boolean startsWith = b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (b.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(l(b, pattern2, hashMap3), l(b, c0, hashMap3));
            } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList7 = arrayList14;
                arrayList6 = arrayList10;
                arrayList5 = arrayList11;
                arrayList3 = arrayList16;
                arrayList4 = arrayList15;
                z2 = z4;
                z3 = true;
                arrayList13 = arrayList17;
                arrayList12 = arrayList31;
                arrayList16 = arrayList3;
                arrayList15 = arrayList4;
                arrayList11 = arrayList5;
                arrayList10 = arrayList6;
                arrayList14 = arrayList7;
            } else if (b.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(b);
            } else if (b.startsWith("#EXT-X-SESSION-KEY")) {
                DrmInitData.SchemeData e2 = e(b, hashMap3, k(b, L, "identity", hashMap3));
                if (e2 != null) {
                    String l6 = l(b, K, hashMap3);
                    arrayList15.add(new DrmInitData(("SAMPLE-AES-CENC".equals(l6) || "SAMPLE-AES-CTR".equals(l6)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs, e2));
                }
            } else if (b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z4 | b.contains("CLOSED-CAPTIONS=NONE");
                int i16 = startsWith ? 16384 : 0;
                arrayList3 = arrayList16;
                z4 = contains;
                int parseInt2 = Integer.parseInt(l(b, h, Collections.EMPTY_MAP));
                Matcher matcher = c.matcher(b);
                if (matcher.find()) {
                    arrayList4 = arrayList15;
                    String group = matcher.group(1);
                    group.getClass();
                    i3 = Integer.parseInt(group);
                } else {
                    arrayList4 = arrayList15;
                    i3 = -1;
                }
                arrayList5 = arrayList11;
                String k6 = k(b, j, null, hashMap3);
                arrayList6 = arrayList10;
                String k7 = k(b, k, null, hashMap3);
                arrayList7 = arrayList14;
                String k8 = k(b, l, null, hashMap3);
                if (k8 != null) {
                    String str12 = y2r0.a;
                    String[] split2 = k8.split(StringUtils.COMMA, 2)[0].split(DomExceptionUtils.SEPARATOR, -1);
                    str5 = split2[0];
                    if (split2.length > 1) {
                        str6 = split2[1];
                        i4 = 2;
                        w2 = y2r0.w(k7, i4);
                        if (io20.m(w2, str5)) {
                            if (str5 == null) {
                                str7 = w2;
                            } else if (k6 != null && str6 != null) {
                                str7 = w2;
                                if (k6.equals("PQ")) {
                                }
                                if (k6.equals("SDR")) {
                                }
                                if (k6.equals("HLG")) {
                                }
                            }
                            if (str5 == null) {
                                str5 = str7;
                            }
                            String x2 = y2r0.x(k7);
                            k7 = x2 != null ? pzl.b(str5, StringUtils.COMMA, x2) : str5;
                        }
                        k2 = k(b, m, null, hashMap3);
                        if (k2 != null) {
                            String[] split3 = k2.split("x", -1);
                            i6 = Integer.parseInt(split3[0]);
                            i5 = Integer.parseInt(split3[1]);
                            if (i6 > 0) {
                            }
                        }
                        i5 = -1;
                        i6 = -1;
                        String k9 = k(b, n, null, hashMap3);
                        float parseFloat = k9 == null ? Float.parseFloat(k9) : -1.0f;
                        String k10 = k(b, d, null, hashMap3);
                        String k11 = k(b, e, null, hashMap3);
                        String k12 = k(b, f, null, hashMap3);
                        String k13 = k(b, g, null, hashMap3);
                        if (!startsWith) {
                            d2 = neq0.d(str8, l(b, pattern, hashMap3));
                        } else {
                            if (!aVar.a()) {
                                throw ParserException.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                            }
                            d2 = neq0.d(str8, m(aVar.b(), hashMap3));
                        }
                        Uri uri2 = d2;
                        a.C0043a c0043a2 = new a.C0043a();
                        c0043a2.i(arrayList9.size());
                        c0043a2.f(MimeTypes.APPLICATION_M3U8);
                        c0043a2.e(k7);
                        c0043a2.c(i3);
                        c0043a2.o(parseInt2);
                        c0043a2.t(i6);
                        c0043a2.h(i5);
                        c0043a2.g(parseFloat);
                        c0043a2.p(i16);
                        arrayList9.add(new c.b(uri2, c0043a2.a(), k10, k11, k12, k13));
                        arrayList8 = (ArrayList) hashMap2.get(uri2);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap2.put(uri2, arrayList8);
                        }
                        arrayList8.add(new u9v.a(i3, k10, parseInt2, k11, k12, k13));
                        z2 = z4;
                        z3 = z5;
                        arrayList13 = arrayList17;
                        arrayList12 = arrayList31;
                        arrayList16 = arrayList3;
                        arrayList15 = arrayList4;
                        arrayList11 = arrayList5;
                        arrayList10 = arrayList6;
                        arrayList14 = arrayList7;
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 2;
                    str5 = null;
                }
                str6 = null;
                w2 = y2r0.w(k7, i4);
                if (io20.m(w2, str5)) {
                }
                k2 = k(b, m, null, hashMap3);
                if (k2 != null) {
                }
                i5 = -1;
                i6 = -1;
                String k92 = k(b, n, null, hashMap3);
                if (k92 == null) {
                }
                String k102 = k(b, d, null, hashMap3);
                String k112 = k(b, e, null, hashMap3);
                String k122 = k(b, f, null, hashMap3);
                String k132 = k(b, g, null, hashMap3);
                if (!startsWith) {
                }
                Uri uri22 = d2;
                a.C0043a c0043a22 = new a.C0043a();
                c0043a22.i(arrayList9.size());
                c0043a22.f(MimeTypes.APPLICATION_M3U8);
                c0043a22.e(k7);
                c0043a22.c(i3);
                c0043a22.o(parseInt2);
                c0043a22.t(i6);
                c0043a22.h(i5);
                c0043a22.g(parseFloat);
                c0043a22.p(i16);
                arrayList9.add(new c.b(uri22, c0043a22.a(), k102, k112, k122, k132));
                arrayList8 = (ArrayList) hashMap2.get(uri22);
                if (arrayList8 == null) {
                }
                arrayList8.add(new u9v.a(i3, k102, parseInt2, k112, k122, k132));
                z2 = z4;
                z3 = z5;
                arrayList13 = arrayList17;
                arrayList12 = arrayList31;
                arrayList16 = arrayList3;
                arrayList15 = arrayList4;
                arrayList11 = arrayList5;
                arrayList10 = arrayList6;
                arrayList14 = arrayList7;
            }
            arrayList7 = arrayList14;
            arrayList6 = arrayList10;
            arrayList5 = arrayList11;
            arrayList3 = arrayList16;
            arrayList4 = arrayList15;
            z2 = z4;
            z3 = z5;
            arrayList13 = arrayList17;
            arrayList12 = arrayList31;
            arrayList16 = arrayList3;
            arrayList15 = arrayList4;
            arrayList11 = arrayList5;
            arrayList10 = arrayList6;
            arrayList14 = arrayList7;
        }
    }

    public static boolean h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double i(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String k(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m(str2, map);
    }

    public static String l(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String k2 = k(str, pattern, null, map);
        if (k2 != null) {
            return k2;
        }
        throw ParserException.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String m(String str, Map<String, String> map) {
        Matcher matcher = x0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0096, LOOP:0: B:13:0x0069->B:38:0x0069, LOOP_START, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:62:0x00ff, B:63:0x0105, B:67:0x0030, B:69:0x0036, B:74:0x003f, B:76:0x0048, B:81:0x0051, B:83:0x0057, B:85:0x005d, B:87:0x0062), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:62:0x00ff, B:63:0x0105, B:67:0x0030, B:69:0x0036, B:74:0x003f, B:76:0x0048, B:81:0x0051, B:83:0x0057, B:85:0x005d, B:87:0x0062), top: B:2:0x000f }] */
    @Override // androidx.media3.exoplayer.upstream.c.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o9v a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z2 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z2) {
                    throw ParserException.b(null, "Input does not start with the #EXTM3U header.");
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        y2r0.h(bufferedReader);
                        throw ParserException.b(null, "Failed to parse the playlist, could not identify any tags.");
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
                            return g(new a(arrayDeque, bufferedReader), uri.toString());
                        }
                    }
                }
                arrayDeque.add(trim);
                return f(this.a, this.b, new a(arrayDeque, bufferedReader), uri.toString());
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !y2r0.O(read)) {
                        read = bufferedReader.read();
                    }
                    z2 = y2r0.O(read);
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
            y2r0.h(bufferedReader);
        }
    }

    public HlsPlaylistParser(c cVar, @Nullable b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
