package z3;

import J3.k;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.B;
import j3.C7266h;
import j3.C7270l;
import j3.C7272n;
import j3.t;
import j3.u;
import j3.v;
import java.io.BufferedReader;
import java.io.IOException;
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
import m3.C8057J;
import m3.N;
import m3.s;
import p3.C8848h;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import x3.d;
import z3.e;
import z3.g;

/* loaded from: classes8.dex */
public final class i implements k.a<h> {

    /* renamed from: a, reason: collision with root package name */
    private final g f107198a;

    /* renamed from: b, reason: collision with root package name */
    private final e f107199b;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f107154c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f107156d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f107158e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f107160f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f107162g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f107164h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f107166i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f107168j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f107170k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f107172l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f107174m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f107176n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f107178o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f107180p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f107182q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f107184r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f107186s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f107188t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f107190u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f107192v = b("CAN-SKIP-DATERANGES");

    /* renamed from: w, reason: collision with root package name */
    private static final Pattern f107194w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: x, reason: collision with root package name */
    private static final Pattern f107195x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: y, reason: collision with root package name */
    private static final Pattern f107196y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    private static final Pattern f107197z = b("CAN-BLOCK-RELOAD");

    /* renamed from: A, reason: collision with root package name */
    private static final Pattern f107126A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    private static final Pattern f107127B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: C, reason: collision with root package name */
    private static final Pattern f107128C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: D, reason: collision with root package name */
    private static final Pattern f107129D = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: E, reason: collision with root package name */
    private static final Pattern f107130E = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: F, reason: collision with root package name */
    private static final Pattern f107131F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: G, reason: collision with root package name */
    private static final Pattern f107132G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: H, reason: collision with root package name */
    private static final Pattern f107133H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: I, reason: collision with root package name */
    private static final Pattern f107134I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: J, reason: collision with root package name */
    private static final Pattern f107135J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: K, reason: collision with root package name */
    private static final Pattern f107136K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: L, reason: collision with root package name */
    private static final Pattern f107137L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* renamed from: M, reason: collision with root package name */
    private static final Pattern f107138M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* renamed from: N, reason: collision with root package name */
    private static final Pattern f107139N = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* renamed from: O, reason: collision with root package name */
    private static final Pattern f107140O = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: P, reason: collision with root package name */
    private static final Pattern f107141P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: Q, reason: collision with root package name */
    private static final Pattern f107142Q = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: R, reason: collision with root package name */
    private static final Pattern f107143R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* renamed from: S, reason: collision with root package name */
    private static final Pattern f107144S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* renamed from: T, reason: collision with root package name */
    private static final Pattern f107145T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* renamed from: U, reason: collision with root package name */
    private static final Pattern f107146U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* renamed from: V, reason: collision with root package name */
    private static final Pattern f107147V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: W, reason: collision with root package name */
    private static final Pattern f107148W = b("AUTOSELECT");

    /* renamed from: X, reason: collision with root package name */
    private static final Pattern f107149X = b("DEFAULT");

    /* renamed from: Y, reason: collision with root package name */
    private static final Pattern f107150Y = b("FORCED");

    /* renamed from: Z, reason: collision with root package name */
    private static final Pattern f107151Z = b("INDEPENDENT");

    /* renamed from: a0, reason: collision with root package name */
    private static final Pattern f107152a0 = b("GAP");

    /* renamed from: b0, reason: collision with root package name */
    private static final Pattern f107153b0 = b("PRECISE");

    /* renamed from: c0, reason: collision with root package name */
    private static final Pattern f107155c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* renamed from: d0, reason: collision with root package name */
    private static final Pattern f107157d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* renamed from: e0, reason: collision with root package name */
    private static final Pattern f107159e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* renamed from: f0, reason: collision with root package name */
    private static final Pattern f107161f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    private static final Pattern f107163g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    private static final Pattern f107165h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* renamed from: i0, reason: collision with root package name */
    private static final Pattern f107167i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: j0, reason: collision with root package name */
    private static final Pattern f107169j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* renamed from: k0, reason: collision with root package name */
    private static final Pattern f107171k0 = b("END-ON-NEXT");

    /* renamed from: l0, reason: collision with root package name */
    private static final Pattern f107173l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* renamed from: m0, reason: collision with root package name */
    private static final Pattern f107175m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* renamed from: n0, reason: collision with root package name */
    private static final Pattern f107177n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: o0, reason: collision with root package name */
    private static final Pattern f107179o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* renamed from: p0, reason: collision with root package name */
    private static final Pattern f107181p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* renamed from: q0, reason: collision with root package name */
    private static final Pattern f107183q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* renamed from: r0, reason: collision with root package name */
    private static final Pattern f107185r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* renamed from: s0, reason: collision with root package name */
    private static final Pattern f107187s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* renamed from: t0, reason: collision with root package name */
    private static final Pattern f107189t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* renamed from: u0, reason: collision with root package name */
    private static final Pattern f107191u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: v0, reason: collision with root package name */
    private static final Pattern f107193v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class a extends IOException {
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final BufferedReader f107200a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayDeque f107201b;

        /* renamed from: c, reason: collision with root package name */
        private String f107202c;

        public b(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.f107201b = arrayDeque;
            this.f107200a = bufferedReader;
        }

        public final boolean a() throws IOException {
            String trim;
            if (this.f107202c == null) {
                ArrayDeque arrayDeque = this.f107201b;
                if (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    str.getClass();
                    this.f107202c = str;
                    return true;
                }
                do {
                    String readLine = this.f107200a.readLine();
                    this.f107202c = readLine;
                    if (readLine == null) {
                        return false;
                    }
                    trim = readLine.trim();
                    this.f107202c = trim;
                } while (trim.isEmpty());
            }
            return true;
        }

        public final String b() throws IOException {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f107202c;
            this.f107202c = null;
            return str;
        }
    }

    public i() {
        this(g.f107103n, null);
    }

    private static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    private static C7270l c(String str, C7270l.b[] bVarArr) {
        C7270l.b[] bVarArr2 = new C7270l.b[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            C7270l.b bVar = bVarArr[i11];
            bVarArr2[i11] = new C7270l.b(bVar.f69089b, bVar.f69090c, bVar.f69091d, null);
        }
        return new C7270l(str, bVarArr2);
    }

    private static C7270l.b d(String str, String str2, HashMap hashMap) throws v {
        String j11 = j(str, f107138M, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f107139N;
        if (equals) {
            String k11 = k(str, pattern, hashMap);
            return new C7270l.b(C7266h.f69064d, null, "video/mp4", Base64.decode(k11.substring(k11.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = C7266h.f69064d;
            int i11 = N.f74289a;
            return new C7270l.b(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(j11)) {
            return null;
        }
        String k12 = k(str, pattern, hashMap);
        byte[] decode = Base64.decode(k12.substring(k12.indexOf(44)), 0);
        UUID uuid2 = C7266h.f69065e;
        return new C7270l.b(uuid2, null, "video/mp4", h4.k.a(uuid2, null, decode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0954, code lost:
    
        if (r10.equals("POINT") != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0972, code lost:
    
        if (r10.equals("HIGHLIGHT") != false) goto L355;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0bf2  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0c35  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0c09  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static e e(g gVar, e eVar, b bVar, String str) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        String str2;
        e.c cVar;
        int i11;
        C7270l c7270l;
        String str3;
        long j11;
        String str4;
        int i12;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        ArrayList arrayList3;
        e.g gVar2;
        TreeMap treeMap;
        e.C2323e c2323e;
        int i13;
        ArrayList arrayList4;
        C7270l c7270l2;
        String str5;
        HashMap hashMap2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        e.C2323e c2323e2;
        long j12;
        int i14;
        C7270l c7270l3;
        e.C2323e c2323e3;
        int i15;
        String str6;
        long j13;
        long j14;
        boolean z11;
        long j15;
        String str7;
        String str8;
        long j16;
        String str9;
        String j17;
        String str10;
        Matcher matcher;
        Boolean bool;
        char c11;
        ArrayList arrayList7;
        long j18;
        boolean z12;
        e.a aVar;
        int i16;
        char c12;
        C7270l c7270l4;
        long j19;
        C7270l c7270l5;
        C7270l c7270l6;
        int i17;
        g gVar3 = gVar;
        e eVar2 = eVar;
        boolean z13 = gVar3.f107125c;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        e.g gVar4 = new e.g(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        int i18 = 0;
        String str11 = "";
        boolean z14 = z13;
        String str12 = "";
        int i19 = 0;
        boolean z15 = false;
        int i21 = 0;
        boolean z16 = false;
        int i22 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        long j26 = 0;
        long j27 = 0;
        long j28 = -9223372036854775807L;
        long j29 = -9223372036854775807L;
        long j31 = -1;
        e.c cVar2 = null;
        C7270l c7270l7 = null;
        e.C2323e c2323e4 = null;
        C7270l c7270l8 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        boolean z17 = false;
        boolean z18 = false;
        int i23 = 0;
        long j32 = 0;
        long j33 = -9223372036854775807L;
        int i24 = 1;
        while (bVar.a()) {
            String b11 = bVar.b();
            if (b11.startsWith("#EXT")) {
                arrayList11.add(b11);
            }
            if (b11.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k11 = k(b11, f107188t, hashMap3);
                if ("VOD".equals(k11)) {
                    i23 = 1;
                } else if ("EVENT".equals(k11)) {
                    i23 = 2;
                }
            } else if (b11.equals("#EXT-X-I-FRAMES-ONLY")) {
                z16 = true;
            } else if (b11.startsWith("#EXT-X-START")) {
                long parseDouble = (long) (Double.parseDouble(k(b11, f107131F, Collections.EMPTY_MAP)) * 1000000.0d);
                z17 = g(b11, f107153b0);
                cVar2 = cVar2;
                j28 = parseDouble;
            } else {
                e.c cVar3 = cVar2;
                if (b11.startsWith("#EXT-X-SERVER-CONTROL")) {
                    ArrayList arrayList12 = arrayList11;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    double h11 = h(b11, f107190u, -9.223372036854776E18d);
                    long j34 = h11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h11 * 1000000.0d);
                    boolean g10 = g(b11, f107192v);
                    double h12 = h(b11, f107195x, -9.223372036854776E18d);
                    long j35 = h12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h12 * 1000000.0d);
                    double h13 = h(b11, f107196y, -9.223372036854776E18d);
                    arrayList11 = arrayList12;
                    cVar2 = cVar3;
                    linkedHashMap2 = linkedHashMap3;
                    gVar4 = new e.g(j34, g10, j35, h13 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h13 * 1000000.0d), g(b11, f107197z));
                } else {
                    ArrayList arrayList13 = arrayList11;
                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                    if (b11.startsWith("#EXT-X-PART-INF")) {
                        j33 = (long) (Double.parseDouble(k(b11, f107184r, Collections.EMPTY_MAP)) * 1000000.0d);
                        arrayList11 = arrayList13;
                        cVar2 = cVar3;
                        linkedHashMap2 = linkedHashMap4;
                    } else {
                        boolean startsWith = b11.startsWith("#EXT-X-MAP");
                        Pattern pattern = f107133H;
                        Pattern pattern2 = f107139N;
                        if (startsWith) {
                            String k12 = k(b11, pattern2, hashMap3);
                            String j36 = j(b11, pattern, null, hashMap3);
                            if (j36 != null) {
                                int i25 = N.f74289a;
                                String[] split = j36.split("@", -1);
                                j31 = Long.parseLong(split[i18]);
                                if (split.length > 1) {
                                    j24 = Long.parseLong(split[1]);
                                }
                            }
                            long j37 = j31;
                            if (j37 == -1) {
                                j24 = 0;
                            }
                            if (str13 != null && str14 == null) {
                                throw v.d("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                            String str16 = str13;
                            e.C2323e c2323e5 = new e.C2323e(k12, str16, j24, str14, j37);
                            String str17 = str14;
                            str13 = str16;
                            if (j37 != -1) {
                                j24 += j37;
                            }
                            arrayList11 = arrayList13;
                            cVar2 = cVar3;
                            c2323e4 = c2323e5;
                            j31 = -1;
                            linkedHashMap2 = linkedHashMap4;
                            str14 = str17;
                        } else {
                            String str18 = str14;
                            ArrayList arrayList14 = arrayList9;
                            ArrayList arrayList15 = arrayList10;
                            if (b11.startsWith("#EXT-X-TARGETDURATION")) {
                                j29 = Integer.parseInt(k(b11, f107178o, Collections.EMPTY_MAP)) * 1000000;
                            } else if (b11.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j23 = Long.parseLong(k(b11, f107126A, Collections.EMPTY_MAP));
                                cVar2 = cVar3;
                                j32 = j23;
                                linkedHashMap2 = linkedHashMap4;
                                str14 = str18;
                                arrayList11 = arrayList13;
                                arrayList10 = arrayList15;
                                arrayList9 = arrayList14;
                            } else if (b11.startsWith("#EXT-X-VERSION")) {
                                i24 = Integer.parseInt(k(b11, f107186s, Collections.EMPTY_MAP));
                            } else {
                                if (b11.startsWith("#EXT-X-DEFINE")) {
                                    String j38 = j(b11, f107157d0, null, hashMap3);
                                    if (j38 != null) {
                                        String str19 = gVar3.f107112l.get(j38);
                                        if (str19 != null) {
                                            hashMap3.put(j38, str19);
                                        }
                                    } else {
                                        hashMap3.put(k(b11, f107144S, hashMap3), k(b11, f107155c0, hashMap3));
                                    }
                                    hashMap = hashMap4;
                                    arrayList = arrayList8;
                                    str2 = str11;
                                    cVar = cVar3;
                                    i11 = i18;
                                    c7270l = c7270l8;
                                    str3 = str13;
                                    j11 = j31;
                                    str4 = str15;
                                    i12 = i22;
                                    linkedHashMap = linkedHashMap4;
                                    arrayList2 = arrayList15;
                                    arrayList3 = arrayList14;
                                    gVar2 = gVar4;
                                    treeMap = treeMap2;
                                    c2323e = c2323e4;
                                } else if (b11.startsWith("#EXTINF")) {
                                    j26 = new BigDecimal(k(b11, f107127B, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    str12 = j(b11, f107128C, str11, hashMap3);
                                } else {
                                    if (b11.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(k(b11, f107194w, Collections.EMPTY_MAP));
                                        G10.a.h((eVar2 == null || !arrayList8.isEmpty()) ? i18 : 1);
                                        int i26 = N.f74289a;
                                        int i27 = (int) (j32 - eVar2.f107029k);
                                        int i28 = parseInt + i27;
                                        if (i27 >= 0) {
                                            AbstractC5880y abstractC5880y = eVar2.f107036r;
                                            if (i28 <= abstractC5880y.size()) {
                                                long j39 = j25;
                                                str14 = str18;
                                                while (i27 < i28) {
                                                    e.C2323e c2323e6 = (e.C2323e) abstractC5880y.get(i27);
                                                    if (j32 != eVar2.f107029k) {
                                                        int i29 = (eVar2.f107028j - i21) + c2323e6.f107090d;
                                                        ArrayList arrayList16 = new ArrayList();
                                                        int i31 = i18;
                                                        long j41 = j39;
                                                        while (true) {
                                                            AbstractC5880y abstractC5880y2 = c2323e6.f107086m;
                                                            if (i31 < abstractC5880y2.size()) {
                                                                e.c cVar4 = (e.c) abstractC5880y2.get(i31);
                                                                arrayList16.add(new e.c(cVar4.f107087a, cVar4.f107088b, cVar4.f107089c, i29, j41, cVar4.f107092f, cVar4.f107093g, cVar4.f107094h, cVar4.f107095i, cVar4.f107096j, cVar4.f107097k, cVar4.f107080l, cVar4.f107081m));
                                                                j41 += cVar4.f107089c;
                                                                i31++;
                                                                i28 = i28;
                                                            } else {
                                                                i17 = i28;
                                                                c2323e6 = new e.C2323e(c2323e6.f107087a, c2323e6.f107088b, c2323e6.f107085l, c2323e6.f107089c, i29, j39, c2323e6.f107092f, c2323e6.f107093g, c2323e6.f107094h, c2323e6.f107095i, c2323e6.f107096j, c2323e6.f107097k, arrayList16);
                                                            }
                                                        }
                                                    } else {
                                                        i17 = i28;
                                                    }
                                                    arrayList8.add(c2323e6);
                                                    j39 += c2323e6.f107089c;
                                                    long j42 = c2323e6.f107096j;
                                                    if (j42 != -1) {
                                                        j24 = c2323e6.f107095i + j42;
                                                    }
                                                    String str20 = c2323e6.f107094h;
                                                    if (str20 == null || !str20.equals(Long.toHexString(j23))) {
                                                        str14 = str20;
                                                    }
                                                    j23++;
                                                    i27++;
                                                    i19 = c2323e6.f107090d;
                                                    c2323e4 = c2323e6.f107088b;
                                                    c7270l7 = c2323e6.f107092f;
                                                    str13 = c2323e6.f107093g;
                                                    i28 = i17;
                                                    j21 = j39;
                                                    eVar2 = eVar;
                                                }
                                                gVar3 = gVar;
                                                eVar2 = eVar;
                                                cVar2 = cVar3;
                                                linkedHashMap2 = linkedHashMap4;
                                                arrayList11 = arrayList13;
                                                arrayList10 = arrayList15;
                                                arrayList9 = arrayList14;
                                                j25 = j39;
                                            }
                                        }
                                        throw new a();
                                    }
                                    if (b11.startsWith("#EXT-X-KEY")) {
                                        String k13 = k(b11, f107136K, hashMap3);
                                        String j43 = j(b11, f107137L, "identity", hashMap3);
                                        if ("NONE".equals(k13)) {
                                            treeMap2.clear();
                                            c7270l7 = null;
                                            str13 = null;
                                            str14 = null;
                                        } else {
                                            String j44 = j(b11, f107140O, null, hashMap3);
                                            if (!"identity".equals(j43)) {
                                                String str21 = str15;
                                                if (str21 == null) {
                                                    str15 = ("SAMPLE-AES-CENC".equals(k13) || "SAMPLE-AES-CTR".equals(k13)) ? "cenc" : "cbcs";
                                                } else {
                                                    str15 = str21;
                                                }
                                                C7270l.b d11 = d(b11, j43, hashMap3);
                                                if (d11 != null) {
                                                    treeMap2.put(j43, d11);
                                                    str14 = j44;
                                                    c7270l7 = null;
                                                    str13 = null;
                                                }
                                            } else if ("AES-128".equals(k13)) {
                                                str13 = k(b11, pattern2, hashMap3);
                                                str14 = j44;
                                            }
                                            str14 = j44;
                                            str13 = null;
                                        }
                                        gVar3 = gVar;
                                        eVar2 = eVar;
                                        cVar2 = cVar3;
                                        linkedHashMap2 = linkedHashMap4;
                                        arrayList11 = arrayList13;
                                        arrayList10 = arrayList15;
                                        arrayList9 = arrayList14;
                                    } else {
                                        String str22 = str15;
                                        if (b11.startsWith("#EXT-X-BYTERANGE")) {
                                            String k14 = k(b11, f107132G, hashMap3);
                                            int i32 = N.f74289a;
                                            String[] split2 = k14.split("@", -1);
                                            j31 = Long.parseLong(split2[i18]);
                                            if (split2.length > 1) {
                                                j24 = Long.parseLong(split2[1]);
                                            }
                                        } else if (b11.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i21 = Integer.parseInt(b11.substring(b11.indexOf(58) + 1));
                                            gVar3 = gVar;
                                            eVar2 = eVar;
                                            str15 = str22;
                                            z15 = true;
                                        } else if (b11.equals("#EXT-X-DISCONTINUITY")) {
                                            i19++;
                                        } else {
                                            if (b11.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j22 == 0) {
                                                    j22 = N.Q(N.T(b11.substring(b11.indexOf(58) + 1))) - j25;
                                                } else {
                                                    hashMap = hashMap4;
                                                    arrayList = arrayList8;
                                                    str2 = str11;
                                                    cVar = cVar3;
                                                    i11 = i18;
                                                    c2323e = c2323e4;
                                                    c7270l = c7270l8;
                                                    str3 = str13;
                                                    j11 = j31;
                                                    i12 = i22;
                                                    linkedHashMap = linkedHashMap4;
                                                    arrayList2 = arrayList15;
                                                    arrayList3 = arrayList14;
                                                    str4 = str22;
                                                    gVar2 = gVar4;
                                                }
                                            } else if (b11.equals("#EXT-X-GAP")) {
                                                gVar3 = gVar;
                                                eVar2 = eVar;
                                                str15 = str22;
                                                cVar2 = cVar3;
                                                linkedHashMap2 = linkedHashMap4;
                                                str14 = str18;
                                                arrayList11 = arrayList13;
                                                arrayList10 = arrayList15;
                                                arrayList9 = arrayList14;
                                                i22 = 1;
                                            } else if (b11.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                gVar3 = gVar;
                                                eVar2 = eVar;
                                                str15 = str22;
                                                cVar2 = cVar3;
                                                linkedHashMap2 = linkedHashMap4;
                                                str14 = str18;
                                                arrayList11 = arrayList13;
                                                arrayList10 = arrayList15;
                                                arrayList9 = arrayList14;
                                                z14 = true;
                                            } else if (b11.equals("#EXT-X-ENDLIST")) {
                                                gVar3 = gVar;
                                                eVar2 = eVar;
                                                str15 = str22;
                                                cVar2 = cVar3;
                                                linkedHashMap2 = linkedHashMap4;
                                                str14 = str18;
                                                arrayList11 = arrayList13;
                                                arrayList10 = arrayList15;
                                                arrayList9 = arrayList14;
                                                z18 = true;
                                            } else {
                                                if (b11.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    long i33 = i(b11, f107129D);
                                                    Matcher matcher2 = f107130E.matcher(b11);
                                                    if (matcher2.find()) {
                                                        String group = matcher2.group(1);
                                                        group.getClass();
                                                        i13 = Integer.parseInt(group);
                                                    } else {
                                                        i13 = -1;
                                                    }
                                                    e.d dVar = new e.d(Uri.parse(C8057J.c(str, k(b11, pattern2, hashMap3))), i33, i13);
                                                    arrayList4 = arrayList15;
                                                    arrayList4.add(dVar);
                                                } else {
                                                    arrayList4 = arrayList15;
                                                    if (!b11.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        C7270l c7270l9 = c7270l8;
                                                        e.C2323e c2323e7 = c2323e4;
                                                        if (b11.startsWith("#EXT-X-PART")) {
                                                            String hexString = str13 == null ? null : str18 != null ? str18 : Long.toHexString(j23);
                                                            String k15 = k(b11, pattern2, hashMap3);
                                                            long parseDouble2 = (long) (Double.parseDouble(k(b11, f107180p, Collections.EMPTY_MAP)) * 1000000.0d);
                                                            boolean g11 = g(b11, f107151Z) | (z14 && arrayList14.isEmpty());
                                                            boolean g12 = g(b11, f107152a0);
                                                            String j45 = j(b11, pattern, null, hashMap3);
                                                            if (j45 != null) {
                                                                int i34 = N.f74289a;
                                                                String[] split3 = j45.split("@", -1);
                                                                long parseLong = Long.parseLong(split3[0]);
                                                                c7270l4 = c7270l9;
                                                                if (split3.length > 1) {
                                                                    j27 = Long.parseLong(split3[1]);
                                                                }
                                                                j19 = parseLong;
                                                            } else {
                                                                c7270l4 = c7270l9;
                                                                j19 = -1;
                                                            }
                                                            long j46 = j19 == -1 ? 0L : j27;
                                                            if (c7270l7 != null || treeMap2.isEmpty()) {
                                                                c7270l5 = c7270l4;
                                                                c7270l6 = c7270l7;
                                                            } else {
                                                                C7270l.b[] bVarArr = (C7270l.b[]) treeMap2.values().toArray(new C7270l.b[0]);
                                                                C7270l c7270l10 = new C7270l(str22, bVarArr);
                                                                c7270l5 = c7270l4 == null ? c(str22, bVarArr) : c7270l4;
                                                                c7270l6 = c7270l10;
                                                            }
                                                            long j47 = j21;
                                                            e.c cVar5 = new e.c(k15, c2323e7, parseDouble2, i19, j47, c7270l6, str13, hexString, j46, j19, g12, g11, false);
                                                            arrayList9 = arrayList14;
                                                            arrayList9.add(cVar5);
                                                            j21 = j47 + parseDouble2;
                                                            if (j19 != -1) {
                                                                j46 += j19;
                                                            }
                                                            j27 = j46;
                                                            eVar2 = eVar;
                                                            arrayList10 = arrayList4;
                                                            c7270l8 = c7270l5;
                                                            c2323e4 = c2323e7;
                                                            str15 = str22;
                                                            cVar2 = cVar3;
                                                            c7270l7 = c7270l6;
                                                            linkedHashMap2 = linkedHashMap4;
                                                            str14 = str18;
                                                            arrayList11 = arrayList13;
                                                            i18 = 0;
                                                            gVar3 = gVar;
                                                        } else {
                                                            c7270l = c7270l9;
                                                            if (b11.startsWith("#EXT-X-DATERANGE") && j(b11, f107161f0, str11, hashMap3).equals("com.apple.hls.interstitial")) {
                                                                String k16 = k(b11, f107159e0, hashMap3);
                                                                String j48 = j(b11, f107173l0, null, hashMap3);
                                                                Uri parse = j48 != null ? Uri.parse(j48) : null;
                                                                String j49 = j(b11, f107175m0, null, hashMap3);
                                                                Uri parse2 = j49 != null ? Uri.parse(j49) : null;
                                                                c2323e = c2323e7;
                                                                String j51 = j(b11, f107163g0, null, hashMap3);
                                                                if (j51 != null) {
                                                                    gVar2 = gVar4;
                                                                    treeMap = treeMap2;
                                                                    j16 = N.Q(N.T(j51));
                                                                } else {
                                                                    gVar2 = gVar4;
                                                                    treeMap = treeMap2;
                                                                    j16 = -9223372036854775807L;
                                                                }
                                                                String j52 = j(b11, f107167i0, null, hashMap3);
                                                                long Q11 = j52 != null ? N.Q(N.T(j52)) : -9223372036854775807L;
                                                                ArrayList arrayList17 = new ArrayList();
                                                                arrayList6 = arrayList14;
                                                                String j53 = j(b11, f107165h0, null, hashMap3);
                                                                if (j53 != null) {
                                                                    int i35 = N.f74289a;
                                                                    str2 = str11;
                                                                    String[] split4 = j53.split(",", -1);
                                                                    int length = split4.length;
                                                                    int i36 = 0;
                                                                    while (i36 < length) {
                                                                        int i37 = i36;
                                                                        String trim = split4[i36].trim();
                                                                        trim.getClass();
                                                                        switch (trim.hashCode()) {
                                                                            case 79491:
                                                                                i16 = length;
                                                                                if (trim.equals("PRE")) {
                                                                                    c12 = 0;
                                                                                    break;
                                                                                }
                                                                                c12 = 65535;
                                                                                break;
                                                                            case 2430593:
                                                                                i16 = length;
                                                                                if (trim.equals("ONCE")) {
                                                                                    c12 = 1;
                                                                                    break;
                                                                                }
                                                                                c12 = 65535;
                                                                                break;
                                                                            case 2461856:
                                                                                i16 = length;
                                                                                if (trim.equals("POST")) {
                                                                                    c12 = 2;
                                                                                    break;
                                                                                }
                                                                                c12 = 65535;
                                                                                break;
                                                                            default:
                                                                                i16 = length;
                                                                                c12 = 65535;
                                                                                break;
                                                                        }
                                                                        switch (c12) {
                                                                            case 0:
                                                                            case 1:
                                                                            case 2:
                                                                                arrayList17.add(trim);
                                                                                break;
                                                                        }
                                                                        i36 = i37 + 1;
                                                                        length = i16;
                                                                    }
                                                                } else {
                                                                    str2 = str11;
                                                                }
                                                                cVar = cVar3;
                                                                double h14 = h(b11, f107182q, -1.0d);
                                                                long j54 = h14 >= 0.0d ? (long) (h14 * 1000000.0d) : -9223372036854775807L;
                                                                hashMap2 = hashMap4;
                                                                arrayList5 = arrayList8;
                                                                double h15 = h(b11, f107169j0, -1.0d);
                                                                long j55 = h15 >= 0.0d ? (long) (h15 * 1000000.0d) : -9223372036854775807L;
                                                                boolean g13 = g(b11, f107171k0);
                                                                arrayList2 = arrayList4;
                                                                str5 = str22;
                                                                double h16 = h(b11, f107177n0, Double.MIN_VALUE);
                                                                long j56 = h16 != Double.MIN_VALUE ? (long) (h16 * 1000000.0d) : -9223372036854775807L;
                                                                double h17 = h(b11, f107179o0, -1.0d);
                                                                long j57 = h17 >= 0.0d ? (long) (h17 * 1000000.0d) : -9223372036854775807L;
                                                                ArrayList arrayList18 = new ArrayList();
                                                                long j58 = j57;
                                                                String j59 = j(b11, f107181p0, null, hashMap3);
                                                                if (j59 != null) {
                                                                    int i38 = N.f74289a;
                                                                    String[] split5 = j59.split(",", -1);
                                                                    int length2 = split5.length;
                                                                    int i39 = 0;
                                                                    while (i39 < length2) {
                                                                        int i41 = i39;
                                                                        String trim2 = split5[i39].trim();
                                                                        trim2.getClass();
                                                                        int i42 = length2;
                                                                        if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                            arrayList18.add(trim2);
                                                                        }
                                                                        i39 = i41 + 1;
                                                                        length2 = i42;
                                                                    }
                                                                }
                                                                ArrayList arrayList19 = new ArrayList();
                                                                String j61 = j(b11, f107183q0, null, hashMap3);
                                                                if (j61 != null) {
                                                                    int i43 = N.f74289a;
                                                                    String[] split6 = j61.split(",", -1);
                                                                    int length3 = split6.length;
                                                                    int i44 = 0;
                                                                    while (i44 < length3) {
                                                                        int i45 = length3;
                                                                        String trim3 = split6[i44].trim();
                                                                        trim3.getClass();
                                                                        String[] strArr = split6;
                                                                        if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                            arrayList19.add(trim3);
                                                                        }
                                                                        i44++;
                                                                        split6 = strArr;
                                                                        length3 = i45;
                                                                    }
                                                                }
                                                                Boolean valueOf = j(b11, f107185r0, null, hashMap3) != null ? Boolean.valueOf(!r0.equals("NO")) : null;
                                                                String j62 = j(b11, f107187s0, null, hashMap3);
                                                                if (j62 != null) {
                                                                    str9 = "RANGE";
                                                                    if (!j62.equals("RANGE")) {
                                                                        str9 = "POINT";
                                                                    }
                                                                    String str23 = str9;
                                                                    j17 = j(b11, f107189t0, null, hashMap3);
                                                                    if (j17 != null) {
                                                                        str10 = "PRIMARY";
                                                                        if (!j17.equals("PRIMARY")) {
                                                                            str10 = "HIGHLIGHT";
                                                                        }
                                                                        ArrayList arrayList20 = new ArrayList();
                                                                        String str24 = str10;
                                                                        String substring = b11.substring(17);
                                                                        matcher = f107193v0.matcher(substring);
                                                                        while (matcher.find()) {
                                                                            Matcher matcher3 = matcher;
                                                                            String group2 = matcher3.group();
                                                                            group2.getClass();
                                                                            switch (group2.hashCode()) {
                                                                                case -2136701954:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-SNAP=")) {
                                                                                        c11 = 0;
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                case -1843050726:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-CONTENT-MAY-VARY=")) {
                                                                                        c11 = 1;
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                case -148960310:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                                        c11 = 2;
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                case -36345757:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-TIMELINE-STYLE=")) {
                                                                                        c11 = 3;
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                case 397239341:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-ASSET-LIST=")) {
                                                                                        c11 = 4;
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                case 850193465:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                                        c11 = 5;
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                case 1472528844:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-RESTRICT=")) {
                                                                                        c11 = 6;
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                case 1748487807:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-RESUME-OFFSET=")) {
                                                                                        c11 = 7;
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                case 1814205923:
                                                                                    bool = valueOf;
                                                                                    if (group2.equals("X-ASSET-URI=")) {
                                                                                        c11 = '\b';
                                                                                        break;
                                                                                    }
                                                                                    c11 = 65535;
                                                                                    break;
                                                                                default:
                                                                                    bool = valueOf;
                                                                                    c11 = 65535;
                                                                                    break;
                                                                            }
                                                                            switch (c11) {
                                                                                case 0:
                                                                                case 1:
                                                                                case 2:
                                                                                case 3:
                                                                                case 4:
                                                                                case 5:
                                                                                case 6:
                                                                                case 7:
                                                                                case '\b':
                                                                                    arrayList7 = arrayList19;
                                                                                    j18 = j55;
                                                                                    z12 = g13;
                                                                                    break;
                                                                                default:
                                                                                    arrayList7 = arrayList19;
                                                                                    String substring2 = group2.substring(0, group2.length() - 1);
                                                                                    String e11 = U7.d.e(substring2, "=");
                                                                                    int length4 = e11.length() + substring.indexOf(e11);
                                                                                    z12 = g13;
                                                                                    String substring3 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                    if (substring3.startsWith("\"")) {
                                                                                        aVar = new e.a(substring2, k(substring, Pattern.compile(substring2 + "=\"((?:.|\f)+?)\""), hashMap3), 0);
                                                                                        j18 = j55;
                                                                                    } else if (substring3.equals("0x") || substring3.equals("0X")) {
                                                                                        j18 = j55;
                                                                                        aVar = new e.a(substring2, k(substring, Pattern.compile(substring2 + "=(0[xX][A-F0-9]+)"), hashMap3), 1);
                                                                                    } else {
                                                                                        j18 = j55;
                                                                                        aVar = new e.a(substring2, Double.parseDouble(k(substring, Pattern.compile(substring2 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                                                    }
                                                                                    arrayList20.add(aVar);
                                                                                    break;
                                                                            }
                                                                            matcher = matcher3;
                                                                            valueOf = bool;
                                                                            arrayList19 = arrayList7;
                                                                            g13 = z12;
                                                                            j55 = j18;
                                                                        }
                                                                        Boolean bool2 = valueOf;
                                                                        ArrayList arrayList21 = arrayList19;
                                                                        long j63 = j55;
                                                                        boolean z19 = g13;
                                                                        linkedHashMap = linkedHashMap4;
                                                                        e.b.a aVar2 = linkedHashMap.containsKey(k16) ? (e.b.a) linkedHashMap.get(k16) : new e.b.a(k16);
                                                                        aVar2.c(parse);
                                                                        aVar2.b(parse2);
                                                                        aVar2.o(j16);
                                                                        aVar2.h(Q11);
                                                                        aVar2.g(j54);
                                                                        aVar2.j(j63);
                                                                        aVar2.f(arrayList17);
                                                                        aVar2.i(z19);
                                                                        aVar2.m(j56);
                                                                        aVar2.k(j58);
                                                                        aVar2.n(arrayList18);
                                                                        aVar2.l(arrayList21);
                                                                        aVar2.d(arrayList20);
                                                                        aVar2.e(bool2);
                                                                        aVar2.p(str23);
                                                                        aVar2.q(str24);
                                                                        linkedHashMap.put(k16, aVar2);
                                                                    }
                                                                    str10 = null;
                                                                    ArrayList arrayList202 = new ArrayList();
                                                                    String str242 = str10;
                                                                    String substring4 = b11.substring(17);
                                                                    matcher = f107193v0.matcher(substring4);
                                                                    while (matcher.find()) {
                                                                    }
                                                                    Boolean bool22 = valueOf;
                                                                    ArrayList arrayList212 = arrayList19;
                                                                    long j632 = j55;
                                                                    boolean z192 = g13;
                                                                    linkedHashMap = linkedHashMap4;
                                                                    if (linkedHashMap.containsKey(k16)) {
                                                                    }
                                                                    aVar2.c(parse);
                                                                    aVar2.b(parse2);
                                                                    aVar2.o(j16);
                                                                    aVar2.h(Q11);
                                                                    aVar2.g(j54);
                                                                    aVar2.j(j632);
                                                                    aVar2.f(arrayList17);
                                                                    aVar2.i(z192);
                                                                    aVar2.m(j56);
                                                                    aVar2.k(j58);
                                                                    aVar2.n(arrayList18);
                                                                    aVar2.l(arrayList212);
                                                                    aVar2.d(arrayList202);
                                                                    aVar2.e(bool22);
                                                                    aVar2.p(str23);
                                                                    aVar2.q(str242);
                                                                    linkedHashMap.put(k16, aVar2);
                                                                }
                                                                str9 = null;
                                                                String str232 = str9;
                                                                j17 = j(b11, f107189t0, null, hashMap3);
                                                                if (j17 != null) {
                                                                }
                                                                str10 = null;
                                                                ArrayList arrayList2022 = new ArrayList();
                                                                String str2422 = str10;
                                                                String substring42 = b11.substring(17);
                                                                matcher = f107193v0.matcher(substring42);
                                                                while (matcher.find()) {
                                                                }
                                                                Boolean bool222 = valueOf;
                                                                ArrayList arrayList2122 = arrayList19;
                                                                long j6322 = j55;
                                                                boolean z1922 = g13;
                                                                linkedHashMap = linkedHashMap4;
                                                                if (linkedHashMap.containsKey(k16)) {
                                                                }
                                                                aVar2.c(parse);
                                                                aVar2.b(parse2);
                                                                aVar2.o(j16);
                                                                aVar2.h(Q11);
                                                                aVar2.g(j54);
                                                                aVar2.j(j6322);
                                                                aVar2.f(arrayList17);
                                                                aVar2.i(z1922);
                                                                aVar2.m(j56);
                                                                aVar2.k(j58);
                                                                aVar2.n(arrayList18);
                                                                aVar2.l(arrayList2122);
                                                                aVar2.d(arrayList2022);
                                                                aVar2.e(bool222);
                                                                aVar2.p(str232);
                                                                aVar2.q(str2422);
                                                                linkedHashMap.put(k16, aVar2);
                                                            } else {
                                                                arrayList2 = arrayList4;
                                                                c2323e = c2323e7;
                                                                str5 = str22;
                                                                hashMap2 = hashMap4;
                                                                arrayList5 = arrayList8;
                                                                arrayList6 = arrayList14;
                                                                gVar2 = gVar4;
                                                                treeMap = treeMap2;
                                                                str2 = str11;
                                                                cVar = cVar3;
                                                                linkedHashMap = linkedHashMap4;
                                                                if (!b11.startsWith("#")) {
                                                                    String hexString2 = str13 == null ? null : str18 != null ? str18 : Long.toHexString(j23);
                                                                    long j64 = j23 + 1;
                                                                    String l11 = l(b11, hashMap3);
                                                                    e.C2323e c2323e8 = (e.C2323e) hashMap2.get(l11);
                                                                    if (j31 == -1) {
                                                                        c2323e2 = c2323e8;
                                                                        j12 = 0;
                                                                    } else {
                                                                        if (z16 && c2323e == null && c2323e8 == null) {
                                                                            c2323e8 = new e.C2323e(l11, null, 0L, null, j24);
                                                                            hashMap2.put(l11, c2323e8);
                                                                        }
                                                                        c2323e2 = c2323e8;
                                                                        j12 = j24;
                                                                    }
                                                                    if (c7270l7 != null || treeMap.isEmpty()) {
                                                                        str4 = str5;
                                                                        i14 = 0;
                                                                    } else {
                                                                        i14 = 0;
                                                                        C7270l.b[] bVarArr2 = (C7270l.b[]) treeMap.values().toArray(new C7270l.b[0]);
                                                                        str4 = str5;
                                                                        C7270l c7270l11 = new C7270l(str4, bVarArr2);
                                                                        if (c7270l == null) {
                                                                            c7270l3 = c(str4, bVarArr2);
                                                                            c7270l7 = c7270l11;
                                                                            if (c2323e == null) {
                                                                                c2323e3 = c2323e;
                                                                                str8 = l11;
                                                                                i15 = i19;
                                                                                str6 = str13;
                                                                                j13 = j31;
                                                                                j14 = j25;
                                                                                z11 = i22;
                                                                                j15 = j26;
                                                                                str7 = str12;
                                                                            } else {
                                                                                c2323e3 = c2323e2;
                                                                                i15 = i19;
                                                                                str6 = str13;
                                                                                j13 = j31;
                                                                                j14 = j25;
                                                                                z11 = i22;
                                                                                j15 = j26;
                                                                                str7 = str12;
                                                                                str8 = l11;
                                                                            }
                                                                            C7270l c7270l12 = c7270l7;
                                                                            i19 = i15;
                                                                            arrayList5.add(new e.C2323e(str8, c2323e3, str7, j15, i15, j14, c7270l12, str6, hexString2, j12, j13, z11, arrayList6));
                                                                            j21 = j14 + j15;
                                                                            ArrayList arrayList22 = new ArrayList();
                                                                            if (j31 != -1) {
                                                                                j12 += j13;
                                                                            }
                                                                            j24 = j12;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            arrayList8 = arrayList5;
                                                                            j23 = j64;
                                                                            c7270l8 = c7270l3;
                                                                            i18 = i14;
                                                                            i22 = i18;
                                                                            arrayList9 = arrayList22;
                                                                            j25 = j21;
                                                                            c7270l7 = c7270l12;
                                                                            str13 = str6;
                                                                            j26 = 0;
                                                                            j31 = -1;
                                                                            c2323e4 = c2323e;
                                                                            str14 = str18;
                                                                            arrayList11 = arrayList13;
                                                                            gVar4 = gVar2;
                                                                            treeMap2 = treeMap;
                                                                            str11 = str2;
                                                                            str12 = str11;
                                                                            cVar2 = cVar;
                                                                            arrayList10 = arrayList2;
                                                                            gVar3 = gVar;
                                                                            eVar2 = eVar;
                                                                            hashMap4 = hashMap2;
                                                                            str15 = str4;
                                                                        } else {
                                                                            c7270l7 = c7270l11;
                                                                        }
                                                                    }
                                                                    c7270l3 = c7270l;
                                                                    if (c2323e == null) {
                                                                    }
                                                                    C7270l c7270l122 = c7270l7;
                                                                    i19 = i15;
                                                                    arrayList5.add(new e.C2323e(str8, c2323e3, str7, j15, i15, j14, c7270l122, str6, hexString2, j12, j13, z11, arrayList6));
                                                                    j21 = j14 + j15;
                                                                    ArrayList arrayList222 = new ArrayList();
                                                                    if (j31 != -1) {
                                                                    }
                                                                    j24 = j12;
                                                                    linkedHashMap2 = linkedHashMap;
                                                                    arrayList8 = arrayList5;
                                                                    j23 = j64;
                                                                    c7270l8 = c7270l3;
                                                                    i18 = i14;
                                                                    i22 = i18;
                                                                    arrayList9 = arrayList222;
                                                                    j25 = j21;
                                                                    c7270l7 = c7270l122;
                                                                    str13 = str6;
                                                                    j26 = 0;
                                                                    j31 = -1;
                                                                    c2323e4 = c2323e;
                                                                    str14 = str18;
                                                                    arrayList11 = arrayList13;
                                                                    gVar4 = gVar2;
                                                                    treeMap2 = treeMap;
                                                                    str11 = str2;
                                                                    str12 = str11;
                                                                    cVar2 = cVar;
                                                                    arrayList10 = arrayList2;
                                                                    gVar3 = gVar;
                                                                    eVar2 = eVar;
                                                                    hashMap4 = hashMap2;
                                                                    str15 = str4;
                                                                }
                                                            }
                                                            str3 = str13;
                                                            arrayList3 = arrayList6;
                                                            j11 = j31;
                                                            i12 = i22;
                                                            hashMap = hashMap2;
                                                            arrayList = arrayList5;
                                                            str4 = str5;
                                                            i11 = 0;
                                                        }
                                                    } else if (cVar3 == null && "PART".equals(k(b11, f107142Q, hashMap3))) {
                                                        C7270l c7270l13 = c7270l8;
                                                        e.C2323e c2323e9 = c2323e4;
                                                        String k17 = k(b11, pattern2, hashMap3);
                                                        long i46 = i(b11, f107134I);
                                                        long i47 = i(b11, f107135J);
                                                        String hexString3 = str13 == null ? null : str18 != null ? str18 : Long.toHexString(j23);
                                                        if (c7270l7 != null || treeMap2.isEmpty()) {
                                                            c7270l2 = c7270l7;
                                                        } else {
                                                            C7270l.b[] bVarArr3 = (C7270l.b[]) treeMap2.values().toArray(new C7270l.b[i18]);
                                                            C7270l c7270l14 = new C7270l(str22, bVarArr3);
                                                            if (c7270l13 == null) {
                                                                c7270l13 = c(str22, bVarArr3);
                                                            }
                                                            c7270l2 = c7270l14;
                                                        }
                                                        if (i46 == -1 || i47 != -1) {
                                                            long j65 = j21;
                                                            j21 = j65;
                                                            cVar3 = new e.c(k17, c2323e9, 0L, i19, j65, c7270l2, str13, hexString3, i46 != -1 ? i46 : 0L, i47, false, false, true);
                                                        }
                                                        arrayList10 = arrayList4;
                                                        str15 = str22;
                                                        cVar2 = cVar3;
                                                        c2323e4 = c2323e9;
                                                        c7270l7 = c7270l2;
                                                        linkedHashMap2 = linkedHashMap4;
                                                        str14 = str18;
                                                        arrayList11 = arrayList13;
                                                        arrayList9 = arrayList14;
                                                        i18 = 0;
                                                        gVar3 = gVar;
                                                        c7270l8 = c7270l13;
                                                        eVar2 = eVar;
                                                    }
                                                }
                                                arrayList2 = arrayList4;
                                                hashMap = hashMap4;
                                                arrayList = arrayList8;
                                                gVar2 = gVar4;
                                                str2 = str11;
                                                cVar = cVar3;
                                                i11 = i18;
                                                c2323e = c2323e4;
                                                c7270l = c7270l8;
                                                str3 = str13;
                                                j11 = j31;
                                                i12 = i22;
                                                linkedHashMap = linkedHashMap4;
                                                arrayList3 = arrayList14;
                                                str4 = str22;
                                            }
                                            treeMap = treeMap2;
                                        }
                                        gVar3 = gVar;
                                        eVar2 = eVar;
                                        str15 = str22;
                                    }
                                }
                                linkedHashMap2 = linkedHashMap;
                                arrayList8 = arrayList;
                                hashMap4 = hashMap;
                                i18 = i11;
                                arrayList9 = arrayList3;
                                c7270l8 = c7270l;
                                str13 = str3;
                                j31 = j11;
                                i22 = i12;
                                c2323e4 = c2323e;
                                str14 = str18;
                                arrayList11 = arrayList13;
                                gVar4 = gVar2;
                                treeMap2 = treeMap;
                                str11 = str2;
                                cVar2 = cVar;
                                arrayList10 = arrayList2;
                                gVar3 = gVar;
                                eVar2 = eVar;
                                str15 = str4;
                            }
                            cVar2 = cVar3;
                            linkedHashMap2 = linkedHashMap4;
                            str14 = str18;
                            arrayList11 = arrayList13;
                            arrayList10 = arrayList15;
                            arrayList9 = arrayList14;
                        }
                    }
                }
            }
        }
        e.c cVar6 = cVar2;
        ArrayList arrayList23 = arrayList8;
        ArrayList arrayList24 = arrayList10;
        ArrayList arrayList25 = arrayList11;
        LinkedHashMap linkedHashMap5 = linkedHashMap2;
        e.g gVar5 = gVar4;
        C7270l c7270l15 = c7270l8;
        ArrayList arrayList26 = arrayList9;
        int i48 = i18;
        HashMap hashMap5 = new HashMap();
        int i49 = i48;
        while (i49 < arrayList24.size()) {
            ArrayList arrayList27 = arrayList24;
            e.d dVar2 = (e.d) arrayList27.get(i49);
            long j66 = dVar2.f107083b;
            if (j66 == -1) {
                j66 = (j32 + arrayList23.size()) - (arrayList26.isEmpty() ? 1L : 0L);
            }
            int i51 = dVar2.f107084c;
            if (i51 == -1 && j33 != -9223372036854775807L) {
                i51 = (arrayList26.isEmpty() ? ((e.C2323e) B.b(arrayList23)).f107086m : arrayList26).size() - 1;
            }
            Uri uri = dVar2.f107082a;
            hashMap5.put(uri, new e.d(uri, j66, i51));
            i49++;
            arrayList24 = arrayList27;
        }
        if (cVar6 != null) {
            arrayList26.add(cVar6);
        }
        ArrayList arrayList28 = new ArrayList();
        Iterator it = linkedHashMap5.values().iterator();
        while (it.hasNext()) {
            e.b a11 = ((e.b.a) it.next()).a();
            if (a11 != null) {
                arrayList28.add(a11);
            }
        }
        return new e(i23, str, arrayList25, j28, z17, j22, z15, i21, j32, i24, j29, j33, z14, z18, j22 != 0 ? 1 : i48, c7270l15, arrayList23, arrayList26, gVar5, hashMap5, arrayList28);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0291, code lost:
    
        if (r2 > 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a1, code lost:
    
        if (r5.startsWith("hev1") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        if (r5.startsWith("hvc1") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bf, code lost:
    
        if (r5.startsWith("avc3") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cf, code lost:
    
        if (r5.startsWith("avc1") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01df, code lost:
    
        if (r5.startsWith("av01") != false) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static g f(b bVar, String str) throws IOException {
        int i11;
        String str2;
        char c11;
        g.b bVar2;
        String str3;
        ArrayList arrayList;
        int parseInt;
        String str4;
        g.b bVar3;
        String str5;
        g.b bVar4;
        HashMap hashMap;
        HashSet hashSet;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i12;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashMap hashMap2;
        int i13;
        String str6;
        String str7;
        String w11;
        String str8;
        String sb2;
        String c12;
        String j11;
        int i14;
        int i15;
        Uri d11;
        ArrayList arrayList7;
        String str9 = str;
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
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            boolean a11 = bVar.a();
            Pattern pattern = f107139N;
            Pattern pattern2 = f107144S;
            String str10 = ",";
            boolean z13 = z11;
            if (!a11) {
                ArrayList arrayList16 = arrayList9;
                ArrayList arrayList17 = arrayList10;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = arrayList13;
                ArrayList arrayList20 = arrayList14;
                ArrayList arrayList21 = arrayList15;
                ArrayList arrayList22 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i16 = 0;
                while (i16 < arrayList8.size()) {
                    g.b bVar5 = (g.b) arrayList8.get(i16);
                    if (hashSet2.add(bVar5.f107117a)) {
                        C7272n c7272n = bVar5.f107118b;
                        G10.a.h(c7272n.f69124l == null);
                        ArrayList arrayList23 = (ArrayList) hashMap3.get(bVar5.f107117a);
                        arrayList23.getClass();
                        hashMap = hashMap3;
                        hashSet = hashSet2;
                        t tVar = new t(new x3.d(null, null, arrayList23));
                        C7272n.a a12 = c7272n.a();
                        a12.r0(tVar);
                        arrayList22.add(new g.b(bVar5.f107117a, a12.P(), bVar5.f107119c, bVar5.f107120d, bVar5.f107121e, bVar5.f107122f));
                    } else {
                        hashMap = hashMap3;
                        hashSet = hashSet2;
                    }
                    i16++;
                    hashSet2 = hashSet;
                    hashMap3 = hashMap;
                }
                int i17 = 0;
                ArrayList arrayList24 = null;
                C7272n c7272n2 = null;
                while (i17 < arrayList19.size()) {
                    ArrayList arrayList25 = arrayList19;
                    String str11 = (String) arrayList25.get(i17);
                    String k11 = k(str11, f107145T, hashMap4);
                    String k12 = k(str11, pattern2, hashMap4);
                    Pattern pattern3 = pattern2;
                    C7272n.a aVar = new C7272n.a();
                    ArrayList arrayList26 = arrayList24;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(k11);
                    ArrayList arrayList27 = arrayList22;
                    sb3.append(ProductContainerDTO.RATIO_DELIMITER);
                    sb3.append(k12);
                    aVar.j0(sb3.toString());
                    aVar.l0(k12);
                    aVar.W("application/x-mpegURL");
                    ?? g10 = g(str11, f107149X);
                    int i18 = g10;
                    if (g(str11, f107150Y)) {
                        i18 = (g10 == true ? 1 : 0) | 2;
                    }
                    int i19 = i18;
                    if (g(str11, f107148W)) {
                        i19 = (i18 == true ? 1 : 0) | 4;
                    }
                    aVar.A0(i19);
                    String j12 = j(str11, f107146U, null, hashMap4);
                    if (TextUtils.isEmpty(j12)) {
                        str2 = str10;
                        i11 = 0;
                    } else {
                        int i21 = N.f74289a;
                        String[] split = j12.split(str10, -1);
                        i11 = N.l(split, "public.accessibility.describes-video") ? UserVerificationMethods.USER_VERIFY_NONE : 0;
                        str2 = str10;
                        if (N.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i11 |= 4096;
                        }
                        if (N.l(split, "public.accessibility.describes-music-and-sound")) {
                            i11 |= UserVerificationMethods.USER_VERIFY_ALL;
                        }
                        if (N.l(split, "public.easy-to-read")) {
                            i11 |= 8192;
                        }
                    }
                    aVar.w0(i11);
                    aVar.n0(j(str11, f107143R, null, hashMap4));
                    String j13 = j(str11, pattern, null, hashMap4);
                    Uri d12 = j13 == null ? null : C8057J.d(str9, j13);
                    Pattern pattern4 = pattern;
                    t tVar2 = new t(new x3.d(k11, k12, Collections.EMPTY_LIST));
                    String k13 = k(str11, f107141P, hashMap4);
                    switch (k13.hashCode()) {
                        case -959297733:
                            if (k13.equals("SUBTITLES")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -333210994:
                            if (k13.equals("CLOSED-CAPTIONS")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 62628790:
                            if (k13.equals("AUDIO")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 81665115:
                            if (k13.equals("VIDEO")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            int i22 = 0;
                            while (true) {
                                if (i22 < arrayList8.size()) {
                                    bVar2 = (g.b) arrayList8.get(i22);
                                    if (!k11.equals(bVar2.f107121e)) {
                                        i22++;
                                    }
                                } else {
                                    bVar2 = null;
                                }
                            }
                            if (bVar2 != null) {
                                String w12 = N.w(3, bVar2.f107118b.f69123k);
                                aVar.U(w12);
                                str3 = u.d(w12);
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str3 = "text/vtt";
                            }
                            aVar.y0(str3);
                            aVar.r0(tVar2);
                            if (d12 != null) {
                                g.a aVar2 = new g.a(d12, aVar.P(), k12);
                                arrayList = arrayList18;
                                arrayList.add(aVar2);
                            } else {
                                arrayList = arrayList18;
                                s.f("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList24 = arrayList26;
                            break;
                        case 1:
                            ArrayList arrayList28 = arrayList17;
                            String k14 = k(str11, f107147V, hashMap4);
                            if (k14.startsWith("CC")) {
                                parseInt = Integer.parseInt(k14.substring(2));
                                str4 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(k14.substring(7));
                                str4 = "application/cea-708";
                            }
                            ArrayList arrayList29 = arrayList26 == null ? new ArrayList() : arrayList26;
                            aVar.y0(str4);
                            aVar.Q(parseInt);
                            arrayList29.add(aVar.P());
                            arrayList17 = arrayList28;
                            arrayList24 = arrayList29;
                            arrayList = arrayList18;
                            break;
                        case 2:
                            ArrayList arrayList30 = arrayList16;
                            int i23 = 0;
                            while (true) {
                                if (i23 < arrayList8.size()) {
                                    bVar3 = (g.b) arrayList8.get(i23);
                                    int i24 = i23;
                                    if (!k11.equals(bVar3.f107120d)) {
                                        i23 = i24 + 1;
                                    }
                                } else {
                                    bVar3 = null;
                                }
                            }
                            if (bVar3 != null) {
                                String w13 = N.w(1, bVar3.f107118b.f69123k);
                                aVar.U(w13);
                                str5 = u.d(w13);
                            } else {
                                str5 = null;
                            }
                            arrayList16 = arrayList30;
                            String j14 = j(str11, f107166i, null, hashMap4);
                            if (j14 != null) {
                                int i25 = N.f74289a;
                                aVar.T(Integer.parseInt(j14.split("/", 2)[0]));
                                if ("audio/eac3".equals(str5) && j14.endsWith("/JOC")) {
                                    aVar.U("ec+3");
                                    str5 = "audio/eac3-joc";
                                }
                            }
                            aVar.y0(str5);
                            if (d12 != null) {
                                aVar.r0(tVar2);
                                arrayList17.add(new g.a(d12, aVar.P(), k12));
                            } else {
                                ArrayList arrayList31 = arrayList17;
                                if (bVar3 != null) {
                                    arrayList24 = arrayList26;
                                    c7272n2 = aVar.P();
                                    arrayList17 = arrayList31;
                                    arrayList = arrayList18;
                                    break;
                                } else {
                                    arrayList17 = arrayList31;
                                }
                            }
                            arrayList = arrayList18;
                            arrayList24 = arrayList26;
                            break;
                        case 3:
                            int i26 = 0;
                            while (true) {
                                if (i26 < arrayList8.size()) {
                                    bVar4 = (g.b) arrayList8.get(i26);
                                    if (!k11.equals(bVar4.f107119c)) {
                                        i26++;
                                    }
                                } else {
                                    bVar4 = null;
                                }
                            }
                            if (bVar4 != null) {
                                C7272n c7272n3 = bVar4.f107118b;
                                String w14 = N.w(2, c7272n3.f69123k);
                                aVar.U(w14);
                                aVar.y0(u.d(w14));
                                aVar.F0(c7272n3.f69134v);
                                aVar.h0(c7272n3.f69135w);
                                aVar.f0(c7272n3.f69138z);
                            }
                            if (d12 != null) {
                                aVar.r0(tVar2);
                                arrayList16.add(new g.a(d12, aVar.P(), k12));
                            }
                            arrayList = arrayList18;
                            arrayList24 = arrayList26;
                            break;
                        default:
                            arrayList = arrayList18;
                            arrayList24 = arrayList26;
                            break;
                    }
                    i17++;
                    str9 = str;
                    arrayList18 = arrayList;
                    arrayList19 = arrayList25;
                    pattern2 = pattern3;
                    arrayList22 = arrayList27;
                    str10 = str2;
                    pattern = pattern4;
                }
                return new g(str, arrayList21, arrayList22, arrayList16, arrayList17, arrayList18, arrayList12, c7272n2, z12 ? Collections.EMPTY_LIST : arrayList24, z13, hashMap4, arrayList20);
            }
            String b11 = bVar.b();
            ArrayList arrayList32 = arrayList11;
            if (b11.startsWith("#EXT")) {
                arrayList15.add(b11);
            }
            boolean startsWith = b11.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (b11.startsWith("#EXT-X-DEFINE")) {
                hashMap4.put(k(b11, pattern2, hashMap4), k(b11, f107155c0, hashMap4));
            } else if (b11.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList5 = arrayList9;
                arrayList4 = arrayList10;
                arrayList6 = arrayList13;
                arrayList2 = arrayList14;
                arrayList3 = arrayList15;
                z11 = true;
                arrayList11 = arrayList32;
                arrayList14 = arrayList2;
                arrayList15 = arrayList3;
                arrayList10 = arrayList4;
                arrayList9 = arrayList5;
                arrayList13 = arrayList6;
            } else if (b11.startsWith("#EXT-X-MEDIA")) {
                arrayList13.add(b11);
            } else if (b11.startsWith("#EXT-X-SESSION-KEY")) {
                C7270l.b d13 = d(b11, j(b11, f107137L, "identity", hashMap4), hashMap4);
                if (d13 != null) {
                    String k15 = k(b11, f107136K, hashMap4);
                    arrayList14.add(new C7270l(("SAMPLE-AES-CENC".equals(k15) || "SAMPLE-AES-CTR".equals(k15)) ? "cenc" : "cbcs", d13));
                }
            } else if (b11.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                z12 |= b11.contains("CLOSED-CAPTIONS=NONE");
                int i27 = startsWith ? 16384 : 0;
                arrayList2 = arrayList14;
                int parseInt2 = Integer.parseInt(k(b11, f107164h, Collections.EMPTY_MAP));
                Matcher matcher = f107154c.matcher(b11);
                if (matcher.find()) {
                    arrayList3 = arrayList15;
                    String group = matcher.group(1);
                    group.getClass();
                    i12 = Integer.parseInt(group);
                } else {
                    arrayList3 = arrayList15;
                    i12 = -1;
                }
                arrayList4 = arrayList10;
                String j15 = j(b11, f107168j, null, hashMap4);
                arrayList5 = arrayList9;
                String j16 = j(b11, f107170k, null, hashMap4);
                arrayList6 = arrayList13;
                String j17 = j(b11, f107172l, null, hashMap4);
                if (j17 != null) {
                    int i28 = N.f74289a;
                    String[] split2 = j17.split(",", 2)[0].split("/", -1);
                    str6 = split2[0];
                    if (split2.length > 1) {
                        str7 = split2[1];
                        hashMap2 = hashMap3;
                        i13 = 2;
                        w11 = N.w(i13, j16);
                        int i29 = u.f69337c;
                        if (w11 != null) {
                            str8 = j16;
                        } else {
                            if (w11.startsWith("dvhe")) {
                                str8 = j16;
                            } else {
                                str8 = j16;
                                if (!w11.startsWith("dvh1")) {
                                    if (str6 != null) {
                                        if (str6.startsWith("dvhe")) {
                                        }
                                        if (str6.startsWith("dvh1")) {
                                        }
                                        if (str6.startsWith("dvav")) {
                                        }
                                        if (str6.startsWith("dva1")) {
                                        }
                                        if (str6.startsWith("dav1")) {
                                        }
                                    }
                                }
                            }
                            if (str6 == null || (j15 != null && str7 != null && ((!j15.equals("PQ") || str7.equals("db1p")) && ((!j15.equals("SDR") || str7.equals("db2g")) && (!j15.equals("HLG") || str7.startsWith("db4")))))) {
                                if (str6 == null) {
                                    str6 = w11;
                                }
                                String[] d02 = N.d0(str8);
                                if (d02.length != 0) {
                                    StringBuilder sb4 = new StringBuilder();
                                    int length = d02.length;
                                    int i31 = 0;
                                    while (i31 < length) {
                                        String str12 = d02[i31];
                                        String[] strArr = d02;
                                        int i32 = length;
                                        if (2 != u.h(u.d(str12))) {
                                            if (sb4.length() > 0) {
                                                sb4.append(",");
                                            }
                                            sb4.append(str12);
                                        }
                                        i31++;
                                        length = i32;
                                        d02 = strArr;
                                    }
                                    if (sb4.length() > 0) {
                                        sb2 = sb4.toString();
                                        c12 = sb2 == null ? G.g.c(str6, ",", sb2) : str6;
                                        j11 = j(b11, f107174m, null, hashMap4);
                                        if (j11 != null) {
                                            String[] split3 = j11.split("x", -1);
                                            i15 = Integer.parseInt(split3[0]);
                                            i14 = Integer.parseInt(split3[1]);
                                            if (i15 > 0) {
                                            }
                                        }
                                        i14 = -1;
                                        i15 = -1;
                                        String j18 = j(b11, f107176n, null, hashMap4);
                                        float parseFloat = j18 == null ? Float.parseFloat(j18) : -1.0f;
                                        String j19 = j(b11, f107156d, null, hashMap4);
                                        String j21 = j(b11, f107158e, null, hashMap4);
                                        String j22 = j(b11, f107160f, null, hashMap4);
                                        String j23 = j(b11, f107162g, null, hashMap4);
                                        if (!startsWith) {
                                            d11 = C8057J.d(str9, k(b11, pattern, hashMap4));
                                        } else {
                                            if (!bVar.a()) {
                                                throw v.d("#EXT-X-STREAM-INF must be followed by another line");
                                            }
                                            d11 = C8057J.d(str9, l(bVar.b(), hashMap4));
                                        }
                                        Uri uri = d11;
                                        C7272n.a aVar3 = new C7272n.a();
                                        aVar3.i0(arrayList8.size());
                                        aVar3.W("application/x-mpegURL");
                                        aVar3.U(c12);
                                        aVar3.S(i12);
                                        aVar3.t0(parseInt2);
                                        aVar3.F0(i15);
                                        aVar3.h0(i14);
                                        aVar3.f0(parseFloat);
                                        aVar3.w0(i27);
                                        arrayList8.add(new g.b(uri, aVar3.P(), j19, j21, j22, j23));
                                        hashMap3 = hashMap2;
                                        arrayList7 = (ArrayList) hashMap3.get(uri);
                                        if (arrayList7 == null) {
                                            arrayList7 = new ArrayList();
                                            hashMap3.put(uri, arrayList7);
                                        }
                                        arrayList7.add(new d.a(j19, j21, i12, parseInt2, j22, j23));
                                        z11 = z13;
                                        arrayList11 = arrayList32;
                                        arrayList14 = arrayList2;
                                        arrayList15 = arrayList3;
                                        arrayList10 = arrayList4;
                                        arrayList9 = arrayList5;
                                        arrayList13 = arrayList6;
                                    }
                                }
                                sb2 = null;
                                if (sb2 == null) {
                                }
                                j11 = j(b11, f107174m, null, hashMap4);
                                if (j11 != null) {
                                }
                                i14 = -1;
                                i15 = -1;
                                String j182 = j(b11, f107176n, null, hashMap4);
                                if (j182 == null) {
                                }
                                String j192 = j(b11, f107156d, null, hashMap4);
                                String j212 = j(b11, f107158e, null, hashMap4);
                                String j222 = j(b11, f107160f, null, hashMap4);
                                String j232 = j(b11, f107162g, null, hashMap4);
                                if (!startsWith) {
                                }
                                Uri uri2 = d11;
                                C7272n.a aVar32 = new C7272n.a();
                                aVar32.i0(arrayList8.size());
                                aVar32.W("application/x-mpegURL");
                                aVar32.U(c12);
                                aVar32.S(i12);
                                aVar32.t0(parseInt2);
                                aVar32.F0(i15);
                                aVar32.h0(i14);
                                aVar32.f0(parseFloat);
                                aVar32.w0(i27);
                                arrayList8.add(new g.b(uri2, aVar32.P(), j192, j212, j222, j232));
                                hashMap3 = hashMap2;
                                arrayList7 = (ArrayList) hashMap3.get(uri2);
                                if (arrayList7 == null) {
                                }
                                arrayList7.add(new d.a(j192, j212, i12, parseInt2, j222, j232));
                                z11 = z13;
                                arrayList11 = arrayList32;
                                arrayList14 = arrayList2;
                                arrayList15 = arrayList3;
                                arrayList10 = arrayList4;
                                arrayList9 = arrayList5;
                                arrayList13 = arrayList6;
                            }
                        }
                        c12 = str8;
                        j11 = j(b11, f107174m, null, hashMap4);
                        if (j11 != null) {
                        }
                        i14 = -1;
                        i15 = -1;
                        String j1822 = j(b11, f107176n, null, hashMap4);
                        if (j1822 == null) {
                        }
                        String j1922 = j(b11, f107156d, null, hashMap4);
                        String j2122 = j(b11, f107158e, null, hashMap4);
                        String j2222 = j(b11, f107160f, null, hashMap4);
                        String j2322 = j(b11, f107162g, null, hashMap4);
                        if (!startsWith) {
                        }
                        Uri uri22 = d11;
                        C7272n.a aVar322 = new C7272n.a();
                        aVar322.i0(arrayList8.size());
                        aVar322.W("application/x-mpegURL");
                        aVar322.U(c12);
                        aVar322.S(i12);
                        aVar322.t0(parseInt2);
                        aVar322.F0(i15);
                        aVar322.h0(i14);
                        aVar322.f0(parseFloat);
                        aVar322.w0(i27);
                        arrayList8.add(new g.b(uri22, aVar322.P(), j1922, j2122, j2222, j2322));
                        hashMap3 = hashMap2;
                        arrayList7 = (ArrayList) hashMap3.get(uri22);
                        if (arrayList7 == null) {
                        }
                        arrayList7.add(new d.a(j1922, j2122, i12, parseInt2, j2222, j2322));
                        z11 = z13;
                        arrayList11 = arrayList32;
                        arrayList14 = arrayList2;
                        arrayList15 = arrayList3;
                        arrayList10 = arrayList4;
                        arrayList9 = arrayList5;
                        arrayList13 = arrayList6;
                    } else {
                        hashMap2 = hashMap3;
                        i13 = 2;
                    }
                } else {
                    hashMap2 = hashMap3;
                    i13 = 2;
                    str6 = null;
                }
                str7 = null;
                w11 = N.w(i13, j16);
                int i292 = u.f69337c;
                if (w11 != null) {
                }
                c12 = str8;
                j11 = j(b11, f107174m, null, hashMap4);
                if (j11 != null) {
                }
                i14 = -1;
                i15 = -1;
                String j18222 = j(b11, f107176n, null, hashMap4);
                if (j18222 == null) {
                }
                String j19222 = j(b11, f107156d, null, hashMap4);
                String j21222 = j(b11, f107158e, null, hashMap4);
                String j22222 = j(b11, f107160f, null, hashMap4);
                String j23222 = j(b11, f107162g, null, hashMap4);
                if (!startsWith) {
                }
                Uri uri222 = d11;
                C7272n.a aVar3222 = new C7272n.a();
                aVar3222.i0(arrayList8.size());
                aVar3222.W("application/x-mpegURL");
                aVar3222.U(c12);
                aVar3222.S(i12);
                aVar3222.t0(parseInt2);
                aVar3222.F0(i15);
                aVar3222.h0(i14);
                aVar3222.f0(parseFloat);
                aVar3222.w0(i27);
                arrayList8.add(new g.b(uri222, aVar3222.P(), j19222, j21222, j22222, j23222));
                hashMap3 = hashMap2;
                arrayList7 = (ArrayList) hashMap3.get(uri222);
                if (arrayList7 == null) {
                }
                arrayList7.add(new d.a(j19222, j21222, i12, parseInt2, j22222, j23222));
                z11 = z13;
                arrayList11 = arrayList32;
                arrayList14 = arrayList2;
                arrayList15 = arrayList3;
                arrayList10 = arrayList4;
                arrayList9 = arrayList5;
                arrayList13 = arrayList6;
            }
            arrayList5 = arrayList9;
            arrayList4 = arrayList10;
            arrayList6 = arrayList13;
            arrayList2 = arrayList14;
            arrayList3 = arrayList15;
            z11 = z13;
            arrayList11 = arrayList32;
            arrayList14 = arrayList2;
            arrayList15 = arrayList3;
            arrayList10 = arrayList4;
            arrayList9 = arrayList5;
            arrayList13 = arrayList6;
        }
    }

    private static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    private static double h(String str, Pattern pattern, double d11) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d11;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    private static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    private static String j(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    private static String k(String str, Pattern pattern, Map<String, String> map) throws v {
        String j11 = j(str, pattern, null, map);
        if (j11 != null) {
            return j11;
        }
        throw v.d("Couldn't match " + pattern.pattern() + " in " + str);
    }

    private static String l(String str, Map<String, String> map) {
        Matcher matcher = f107191u0.matcher(str);
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r1 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        r1 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r1.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r1.startsWith("#EXT-X-STREAM-INF") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r1.startsWith("#EXT-X-TARGETDURATION") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (r1.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r1.startsWith("#EXTINF") != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        if (r1.startsWith("#EXT-X-KEY") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r1.startsWith("#EXT-X-BYTERANGE") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r1.equals("#EXT-X-DISCONTINUITY") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        if (r1.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r1.equals("#EXT-X-ENDLIST") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        r8.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        r8.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        return e(r6.f107198a, r6.f107199b, new z3.i.b(r8, r0), r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r8.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
    
        return f(new z3.i.b(r8, r0), r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f4, code lost:
    
        m3.N.g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
    
        throw j3.v.d("Failed to parse the playlist, could not identify any tags.");
     */
    @Override // J3.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, C8848h c8848h) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c8848h));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z11 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                throw v.d("Input does not start with the #EXTM3U header.");
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i11 = 0;
            while (true) {
                if (i11 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !N.O(read)) {
                        read = bufferedReader.read();
                    }
                    z11 = N.O(read);
                } else {
                    if (read != "#EXTM3U".charAt(i11)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i11++;
                }
            }
            throw v.d("Input does not start with the #EXTM3U header.");
        } finally {
            N.g(bufferedReader);
        }
    }

    public i(g gVar, e eVar) {
        this.f107198a = gVar;
        this.f107199b = eVar;
    }
}
