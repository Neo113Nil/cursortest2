package s1;

import D1.o;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.AbstractC2356j;
import b1.C2334C;
import b1.C2338G;
import b2.p;
import com.facebook.react.animated.InterpolationAnimatedNode;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.U;
import e1.Z;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lb.C5444x;
import r1.t;
import s1.f;
import s1.i;

/* loaded from: classes.dex */
public final class k implements o.a {

    /* renamed from: a, reason: collision with root package name */
    public final i f64641a;

    /* renamed from: b, reason: collision with root package name */
    public final f f64642b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f64597c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f64599d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f64601e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f64603f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f64605g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f64607h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f64609i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f64611j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f64613k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f64615l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f64617m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f64619n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f64621o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f64623p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f64625q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f64627r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f64629s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f64631t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f64633u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f64635v = c("CAN-SKIP-DATERANGES");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f64637w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f64638x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f64639y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f64640z = c("CAN-BLOCK-RELOAD");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f64569A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f64570B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f64571C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f64572D = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f64573E = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f64574F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f64575G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f64576H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f64577I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f64578J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f64579K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: L, reason: collision with root package name */
    public static final Pattern f64580L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f64581M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f64582N = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f64583O = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f64584P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f64585Q = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f64586R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f64587S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f64588T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f64589U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f64590V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f64591W = c("AUTOSELECT");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f64592X = c("DEFAULT");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f64593Y = c("FORCED");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f64594Z = c("INDEPENDENT");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f64595a0 = c("GAP");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f64596b0 = c("PRECISE");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f64598c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f64600d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f64602e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f64604f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f64606g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f64608h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f64610i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f64612j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f64614k0 = c("END-ON-NEXT");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f64616l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f64618m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f64620n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f64622o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f64624p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f64626q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f64628r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f64630s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f64632t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f64634u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: v0, reason: collision with root package name */
    public static final Pattern f64636v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class a extends IOException {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final BufferedReader f64643a;

        /* renamed from: b, reason: collision with root package name */
        public final Queue f64644b;

        /* renamed from: c, reason: collision with root package name */
        public String f64645c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f64644b = queue;
            this.f64643a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.f64645c != null) {
                return true;
            }
            if (!this.f64644b.isEmpty()) {
                this.f64645c = (String) AbstractC4134a.e((String) this.f64644b.poll());
                return true;
            }
            do {
                String readLine = this.f64643a.readLine();
                this.f64645c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f64645c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f64645c;
            this.f64645c = null;
            return str;
        }
    }

    public k() {
        this(i.f64545n, null);
    }

    public static f.h A(String str) {
        double t10 = t(str, f64633u, -9.223372036854776E18d);
        long j10 = t10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (t10 * 1000000.0d);
        boolean s10 = s(str, f64635v, false);
        double t11 = t(str, f64638x, -9.223372036854776E18d);
        long j11 = t11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (t11 * 1000000.0d);
        double t12 = t(str, f64639y, -9.223372036854776E18d);
        return new f.h(j10, s10, j11, t12 != -9.223372036854776E18d ? (long) (t12 * 1000000.0d) : -9223372036854775807L, s(str, f64640z, false));
    }

    public static String B(String str, Pattern pattern, Map map) {
        String x10 = x(str, pattern, map);
        if (x10 != null) {
            return x10;
        }
        throw C2338G.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static long C(String str, Pattern pattern) {
        return new BigDecimal(B(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    public static String D(String str, Map map) {
        Matcher matcher = f64634u0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int E(BufferedReader bufferedReader, boolean z10, int i10) {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !Z.Q0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    public static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int E10 = E(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (E10 != "#EXTM3U".charAt(i10)) {
                return false;
            }
            E10 = bufferedReader.read();
        }
        return Z.Q0(E(bufferedReader, false, E10));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static DrmInitData d(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            schemeDataArr2[i10] = schemeDataArr[i10].b(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    public static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    public static i.b f(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f64563d)) {
                return bVar;
            }
        }
        return null;
    }

    public static i.b g(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f64564e)) {
                return bVar;
            }
        }
        return null;
    }

    public static i.b h(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f64562c)) {
                return bVar;
            }
        }
        return null;
    }

    public static boolean i(String str, String str2, String str3, String str4) {
        if (!AbstractC2335D.p(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    public static f.b k(String str, String str2, Map map) {
        String str3 = str2 + "=";
        int indexOf = str.indexOf(str3) + str3.length();
        String substring = str.substring(indexOf, (str.length() == indexOf + 1 ? 1 : 2) + indexOf);
        if (substring.startsWith("\"")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map), 0);
        }
        if (substring.equals("0x") || substring.equals("0X")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new f.b(str2, l(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    public static double l(String str, Pattern pattern) {
        return Double.parseDouble(B(str, pattern, Collections.EMPTY_MAP));
    }

    public static DrmInitData.SchemeData m(String str, String str2, Map map) {
        String w10 = w(str, f64581M, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String B10 = B(str, f64582N, map);
            return new DrmInitData.SchemeData(AbstractC2356j.f24594d, "video/mp4", Base64.decode(B10.substring(B10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(AbstractC2356j.f24594d, "hls", Z.B0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(w10)) {
            return null;
        }
        String B11 = B(str, f64582N, map);
        byte[] decode = Base64.decode(B11.substring(B11.indexOf(44)), 0);
        UUID uuid = AbstractC2356j.f24595e;
        return new DrmInitData.SchemeData(uuid, "video/mp4", p.a(uuid, decode));
    }

    public static String n(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int o(String str, Pattern pattern) {
        return Integer.parseInt(B(str, pattern, Collections.EMPTY_MAP));
    }

    public static long p(String str, Pattern pattern) {
        return Long.parseLong(B(str, pattern, Collections.EMPTY_MAP));
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static s1.f q(s1.i r91, s1.f r92, s1.k.b r93, java.lang.String r94) {
        /*
            Method dump skipped, instructions count: 2954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.k.q(s1.i, s1.f, s1.k$b, java.lang.String):s1.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i r(b bVar, String str) {
        char c10;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        int parseInt;
        String str3;
        i.b bVar2;
        String str4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i10;
        String str5;
        String str6;
        String V10;
        String x10;
        int i11;
        int i12;
        Uri g10;
        ArrayList arrayList9;
        int i13;
        String str7 = str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList18 = arrayList14;
            if (!bVar.a()) {
                ArrayList arrayList19 = arrayList15;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList13;
                ArrayList arrayList23 = arrayList17;
                ArrayList arrayList24 = arrayList16;
                boolean z12 = z11;
                ArrayList arrayList25 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i14 = 0; i14 < arrayList10.size(); i14++) {
                    i.b bVar3 = (i.b) arrayList10.get(i14);
                    if (hashSet.add(bVar3.f64560a)) {
                        AbstractC4134a.g(bVar3.f64561b.f20540l == null);
                        arrayList25.add(bVar3.a(bVar3.f64561b.b().r0(new C2334C(new t(null, null, (List) AbstractC4134a.e((ArrayList) hashMap.get(bVar3.f64560a))))).P()));
                    }
                }
                ArrayList arrayList26 = null;
                androidx.media3.common.a aVar = null;
                int i15 = 0;
                while (i15 < arrayList19.size()) {
                    ArrayList arrayList27 = arrayList19;
                    String str8 = (String) arrayList27.get(i15);
                    String B10 = B(str8, f64588T, hashMap2);
                    String B11 = B(str8, f64587S, hashMap2);
                    a.b bVar4 = new a.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(B10);
                    ArrayList arrayList28 = arrayList26;
                    sb2.append(":");
                    sb2.append(B11);
                    a.b n02 = bVar4.j0(sb2.toString()).l0(B11).W("application/x-mpegURL").A0(z(str8)).w0(y(str8, hashMap2)).n0(x(str8, f64586R, hashMap2));
                    String x11 = x(str8, f64582N, hashMap2);
                    Uri g11 = x11 == null ? null : U.g(str7, x11);
                    ArrayList arrayList29 = arrayList25;
                    C2334C c2334c = new C2334C(new t(B10, B11, Collections.EMPTY_LIST));
                    String B12 = B(str8, f64584P, hashMap2);
                    B12.getClass();
                    switch (B12.hashCode()) {
                        case -959297733:
                            if (B12.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333210994:
                            if (B12.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62628790:
                            if (B12.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 81665115:
                            if (B12.equals("VIDEO")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            arrayList = arrayList21;
                            i.b g12 = g(arrayList10, B10);
                            if (g12 != null) {
                                String V11 = Z.V(g12.f64561b.f20539k, 3);
                                n02.U(V11);
                                str2 = AbstractC2335D.g(V11);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            n02.y0(str2).r0(c2334c);
                            if (g11 != null) {
                                arrayList2 = arrayList22;
                                arrayList2.add(new i.a(g11, n02.P(), B10, B11));
                            } else {
                                arrayList2 = arrayList22;
                                AbstractC4156x.i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList26 = arrayList28;
                            break;
                        case 1:
                            arrayList = arrayList21;
                            String B13 = B(str8, f64590V, hashMap2);
                            if (B13.startsWith("CC")) {
                                parseInt = Integer.parseInt(B13.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(B13.substring(7));
                                str3 = "application/cea-708";
                            }
                            ArrayList arrayList30 = arrayList28 == null ? new ArrayList() : arrayList28;
                            n02.y0(str3).Q(parseInt);
                            arrayList30.add(n02.P());
                            arrayList26 = arrayList30;
                            arrayList2 = arrayList22;
                            break;
                        case 2:
                            ArrayList arrayList31 = arrayList20;
                            i.b f10 = f(arrayList10, B10);
                            if (f10 != null) {
                                arrayList20 = arrayList31;
                                bVar2 = f10;
                                String V12 = Z.V(f10.f64561b.f20539k, 1);
                                n02.U(V12);
                                str4 = AbstractC2335D.g(V12);
                            } else {
                                bVar2 = f10;
                                arrayList20 = arrayList31;
                                str4 = null;
                            }
                            String x12 = x(str8, f64609i, hashMap2);
                            if (x12 != null) {
                                n02.T(Integer.parseInt(Z.B1(x12, "/")[0]));
                                if ("audio/eac3".equals(str4) && x12.endsWith("/JOC")) {
                                    n02.U("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            n02.y0(str4);
                            if (g11 != null) {
                                n02.r0(c2334c);
                                arrayList = arrayList21;
                                arrayList.add(new i.a(g11, n02.P(), B10, B11));
                            } else {
                                arrayList = arrayList21;
                                if (bVar2 != null) {
                                    aVar = n02.P();
                                }
                            }
                            arrayList2 = arrayList22;
                            arrayList26 = arrayList28;
                            break;
                        case 3:
                            i.b h10 = h(arrayList10, B10);
                            if (h10 != null) {
                                androidx.media3.common.a aVar2 = h10.f64561b;
                                String V13 = Z.V(aVar2.f20539k, 2);
                                n02.U(V13).y0(AbstractC2335D.g(V13)).F0(aVar2.f20550v).h0(aVar2.f20551w).f0(aVar2.f20554z);
                            }
                            if (g11 != null) {
                                n02.r0(c2334c);
                                arrayList20.add(new i.a(g11, n02.P(), B10, B11));
                            }
                        default:
                            arrayList2 = arrayList22;
                            arrayList = arrayList21;
                            arrayList26 = arrayList28;
                            break;
                    }
                    i15++;
                    str7 = str;
                    arrayList21 = arrayList;
                    arrayList19 = arrayList27;
                    arrayList22 = arrayList2;
                    arrayList25 = arrayList29;
                }
                return new i(str, arrayList23, arrayList25, arrayList20, arrayList21, arrayList22, arrayList18, aVar, z10 ? Collections.EMPTY_LIST : arrayList26, z12, hashMap2, arrayList24);
            }
            String b10 = bVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList17.add(b10);
            }
            boolean startsWith = b10.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (b10.startsWith("#EXT-X-DEFINE")) {
                hashMap2.put(B(b10, f64587S, hashMap2), B(b10, f64598c0, hashMap2));
            } else {
                if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList7 = arrayList15;
                    arrayList8 = arrayList11;
                    arrayList6 = arrayList12;
                    arrayList5 = arrayList13;
                    arrayList3 = arrayList17;
                    arrayList4 = arrayList16;
                    z11 = true;
                } else if (b10.startsWith("#EXT-X-MEDIA")) {
                    arrayList15.add(b10);
                } else if (b10.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData m10 = m(b10, w(b10, f64580L, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, hashMap2), hashMap2);
                    if (m10 != null) {
                        arrayList16.add(new DrmInitData(n(B(b10, f64579K, hashMap2)), m10));
                    }
                } else if (b10.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z10 | b10.contains("CLOSED-CAPTIONS=NONE");
                    int i16 = startsWith ? 16384 : 0;
                    arrayList3 = arrayList17;
                    int o10 = o(b10, f64607h);
                    arrayList4 = arrayList16;
                    int u10 = u(b10, f64597c, -1);
                    String x13 = x(b10, f64611j, hashMap2);
                    boolean z13 = z11;
                    String x14 = x(b10, f64613k, hashMap2);
                    arrayList5 = arrayList13;
                    String x15 = x(b10, f64615l, hashMap2);
                    arrayList6 = arrayList12;
                    if (x15 != null) {
                        String[] A12 = Z.A1(Z.B1(x15, ",")[0], "/");
                        String str9 = A12[0];
                        if (A12.length > 1) {
                            str6 = A12[1];
                            arrayList7 = arrayList15;
                            arrayList8 = arrayList11;
                            str5 = str9;
                            i10 = 2;
                            V10 = Z.V(x14, i10);
                            if (i(x13, V10, str5, str6)) {
                                if (str5 == null) {
                                    str5 = V10;
                                }
                                String W10 = Z.W(x14, i10);
                                x14 = W10 != null ? str5 + "," + W10 : str5;
                            }
                            x10 = x(b10, f64617m, hashMap2);
                            if (x10 == null) {
                                String[] A13 = Z.A1(x10, C5444x.f55808b);
                                int parseInt2 = Integer.parseInt(A13[0]);
                                int parseInt3 = Integer.parseInt(A13[1]);
                                if (parseInt2 <= 0 || parseInt3 <= 0) {
                                    parseInt3 = -1;
                                    i13 = -1;
                                } else {
                                    i13 = parseInt2;
                                }
                                i12 = parseInt3;
                                i11 = i13;
                            } else {
                                i11 = -1;
                                i12 = -1;
                            }
                            String x16 = x(b10, f64619n, hashMap2);
                            float parseFloat = x16 == null ? Float.parseFloat(x16) : -1.0f;
                            String x17 = x(b10, f64599d, hashMap2);
                            String x18 = x(b10, f64601e, hashMap2);
                            String x19 = x(b10, f64603f, hashMap2);
                            String x20 = x(b10, f64605g, hashMap2);
                            if (!startsWith) {
                                g10 = U.g(str7, B(b10, f64582N, hashMap2));
                            } else {
                                if (!bVar.a()) {
                                    throw C2338G.c("#EXT-X-STREAM-INF must be followed by another line", null);
                                }
                                g10 = U.g(str7, D(bVar.b(), hashMap2));
                            }
                            Uri uri = g10;
                            arrayList10.add(new i.b(uri, new a.b().i0(arrayList10.size()).W("application/x-mpegURL").U(x14).S(u10).t0(o10).F0(i11).h0(i12).f0(parseFloat).w0(i16).P(), x17, x18, x19, x20));
                            arrayList9 = (ArrayList) hashMap.get(uri);
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                                hashMap.put(uri, arrayList9);
                            }
                            arrayList9.add(new t.a(u10, o10, x17, x18, x19, x20));
                            z10 = contains;
                            z11 = z13;
                        } else {
                            arrayList7 = arrayList15;
                            arrayList8 = arrayList11;
                            str5 = str9;
                            i10 = 2;
                        }
                    } else {
                        arrayList7 = arrayList15;
                        arrayList8 = arrayList11;
                        i10 = 2;
                        str5 = null;
                    }
                    str6 = null;
                    V10 = Z.V(x14, i10);
                    if (i(x13, V10, str5, str6)) {
                    }
                    x10 = x(b10, f64617m, hashMap2);
                    if (x10 == null) {
                    }
                    String x162 = x(b10, f64619n, hashMap2);
                    if (x162 == null) {
                    }
                    String x172 = x(b10, f64599d, hashMap2);
                    String x182 = x(b10, f64601e, hashMap2);
                    String x192 = x(b10, f64603f, hashMap2);
                    String x202 = x(b10, f64605g, hashMap2);
                    if (!startsWith) {
                    }
                    Uri uri2 = g10;
                    arrayList10.add(new i.b(uri2, new a.b().i0(arrayList10.size()).W("application/x-mpegURL").U(x14).S(u10).t0(o10).F0(i11).h0(i12).f0(parseFloat).w0(i16).P(), x172, x182, x192, x202));
                    arrayList9 = (ArrayList) hashMap.get(uri2);
                    if (arrayList9 == null) {
                    }
                    arrayList9.add(new t.a(u10, o10, x172, x182, x192, x202));
                    z10 = contains;
                    z11 = z13;
                }
                arrayList14 = arrayList18;
                arrayList17 = arrayList3;
                arrayList16 = arrayList4;
                arrayList13 = arrayList5;
                arrayList12 = arrayList6;
                arrayList11 = arrayList8;
                arrayList15 = arrayList7;
            }
            arrayList7 = arrayList15;
            arrayList8 = arrayList11;
            arrayList6 = arrayList12;
            arrayList5 = arrayList13;
            arrayList3 = arrayList17;
            arrayList4 = arrayList16;
            arrayList14 = arrayList18;
            arrayList17 = arrayList3;
            arrayList16 = arrayList4;
            arrayList13 = arrayList5;
            arrayList12 = arrayList6;
            arrayList11 = arrayList8;
            arrayList15 = arrayList7;
        }
    }

    public static boolean s(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    public static double t(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) AbstractC4134a.e(matcher.group(1))) : d10;
    }

    public static int u(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) AbstractC4134a.e(matcher.group(1))) : i10;
    }

    public static long v(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) AbstractC4134a.e(matcher.group(1))) : j10;
    }

    public static String w(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) AbstractC4134a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : D(str2, map);
    }

    public static String x(String str, Pattern pattern, Map map) {
        return w(str, pattern, null, map);
    }

    public static int y(String str, Map map) {
        String x10 = x(str, f64589U, map);
        if (TextUtils.isEmpty(x10)) {
            return 0;
        }
        String[] A12 = Z.A1(x10, ",");
        int i10 = Z.r(A12, "public.accessibility.describes-video") ? 512 : 0;
        if (Z.r(A12, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (Z.r(A12, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return Z.r(A12, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int z(String str) {
        boolean s10 = s(str, f64592X, false);
        ?? r02 = s10;
        if (s(str, f64593Y, false)) {
            r02 = (s10 ? 1 : 0) | 2;
        }
        return s(str, f64591W, false) ? r02 | 4 : r02;
    }

    @Override // D1.o.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw C2338G.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    Z.m(bufferedReader);
                    throw C2338G.c("Failed to parse the playlist, could not identify any tags.", null);
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
                        return r(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return q(this.f64641a, this.f64642b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            Z.m(bufferedReader);
        }
    }

    public k(i iVar, f fVar) {
        this.f64641a = iVar;
        this.f64642b = fVar;
    }
}
