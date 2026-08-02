package q4;

import B0.A0;
import J0.C3354v2;
import android.text.Layout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.i;
import k4.k;
import k4.o;
import m3.C8066h;
import m3.InterfaceC8068j;
import m3.N;
import m3.O;
import m3.s;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

/* loaded from: classes8.dex */
public final class d implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f81572b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f81573c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f81574d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    static final Pattern f81575e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f81576f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f81577g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f81578h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    private static final a f81579i = new a(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f81580a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final float f81581a;

        /* renamed from: b, reason: collision with root package name */
        final int f81582b;

        /* renamed from: c, reason: collision with root package name */
        final int f81583c;

        a(float f7, int i11, int i12) {
            this.f81581a = f7;
            this.f81582b = i11;
            this.f81583c = i12;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f81584a;

        /* renamed from: b, reason: collision with root package name */
        final int f81585b;

        b(int i11, int i12) {
            this.f81584a = i11;
            this.f81585b = i12;
        }
    }

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f81580a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    private static g c(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean d(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static int e(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f81578h.matcher(attributeValue);
        if (!matcher.matches()) {
            s.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z11 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z11 = false;
            }
            G10.a.b("Invalid cell resolution " + parseInt + " " + parseInt2, z11);
            return parseInt2;
        } catch (NumberFormatException unused) {
            s.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    private static void f(String str, g gVar) throws k {
        Matcher matcher;
        String group;
        int i11 = N.f74289a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f81574d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new k(K00.b.e(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            s.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new k(A0.b("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                gVar.B(3);
                break;
            case "em":
                gVar.B(2);
                break;
            case "px":
                gVar.B(1);
                break;
            default:
                throw new k(A0.b("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        gVar.A(Float.parseFloat(group2));
    }

    private static a g(XmlPullParser xmlPullParser) {
        float f7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = N.f74289a;
            G10.a.b("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f7 = 1.0f;
        }
        a aVar = f81579i;
        int i12 = aVar.f81582b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new a(parseInt * f7, i12, attributeValue4 != null ? Integer.parseInt(attributeValue4) : aVar.f81583c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x026e A[LOOP:0: B:2:0x000a->B:22:0x026e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x026d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(XmlPullParser xmlPullParser, HashMap hashMap, int i11, b bVar, HashMap hashMap2, HashMap hashMap3) throws IOException, XmlPullParserException {
        String a11;
        float f7;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i12;
        String a12;
        int i13;
        e eVar;
        char c11;
        float parseFloat;
        float parseFloat2;
        String a13;
        g gVar;
        String a14;
        g gVar2;
        String[] split;
        int i14 = -1;
        int i15 = 0;
        while (true) {
            xmlPullParser.next();
            if (O.c(xmlPullParser, "style")) {
                String a15 = O.a(xmlPullParser, "style");
                g j11 = j(xmlPullParser, new g());
                if (a15 != null) {
                    String trim = a15.trim();
                    if (trim.isEmpty()) {
                        split = new String[i15];
                    } else {
                        int i16 = N.f74289a;
                        split = trim.split("\\s+", i14);
                    }
                    int length = split.length;
                    for (int i17 = i15; i17 < length; i17++) {
                        j11.a((g) hashMap.get(split[i17]));
                    }
                }
                String h11 = j11.h();
                if (h11 != null) {
                    hashMap.put(h11, j11);
                }
            } else {
                if (O.c(xmlPullParser, "region")) {
                    String a16 = O.a(xmlPullParser, "id");
                    if (a16 != null) {
                        String a17 = O.a(xmlPullParser, "origin");
                        if (a17 == null && (a14 = O.a(xmlPullParser, "style")) != null && (gVar2 = (g) hashMap.get(a14)) != null) {
                            a17 = gVar2.j();
                        }
                        Pattern pattern = f81577g;
                        Pattern pattern2 = f81576f;
                        if (a17 != null) {
                            Matcher matcher = pattern2.matcher(a17);
                            Matcher matcher2 = pattern.matcher(a17);
                            if (matcher.matches()) {
                                try {
                                    String group = matcher.group(1);
                                    group.getClass();
                                    f12 = Float.parseFloat(group) / 100.0f;
                                    String group2 = matcher.group(2);
                                    group2.getClass();
                                    f11 = Float.parseFloat(group2) / 100.0f;
                                    f7 = 100.0f;
                                } catch (NumberFormatException unused) {
                                    s.f("TtmlParser", "Ignoring region with malformed origin: ".concat(a17));
                                }
                            } else if (!matcher2.matches()) {
                                s.f("TtmlParser", "Ignoring region with unsupported origin: ".concat(a17));
                            } else if (bVar == null) {
                                s.f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(a17));
                            } else {
                                try {
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    int parseInt = Integer.parseInt(group3);
                                    String group4 = matcher2.group(2);
                                    group4.getClass();
                                    f7 = 100.0f;
                                    float f16 = parseInt / bVar.f81584a;
                                    float parseInt2 = Integer.parseInt(group4) / bVar.f81585b;
                                    f12 = f16;
                                    f11 = parseInt2;
                                } catch (NumberFormatException unused2) {
                                    s.f("TtmlParser", "Ignoring region with malformed origin: ".concat(a17));
                                }
                            }
                        } else {
                            f7 = 100.0f;
                            f11 = 0.0f;
                            f12 = 0.0f;
                        }
                        String a18 = O.a(xmlPullParser, "extent");
                        if (a18 == null && (a13 = O.a(xmlPullParser, "style")) != null && (gVar = (g) hashMap.get(a13)) != null) {
                            a18 = gVar.c();
                        }
                        if (a18 != null) {
                            Matcher matcher3 = pattern2.matcher(a18);
                            Matcher matcher4 = pattern.matcher(a18);
                            if (matcher3.matches()) {
                                try {
                                    String group5 = matcher3.group(1);
                                    group5.getClass();
                                    parseFloat = Float.parseFloat(group5) / f7;
                                    String group6 = matcher3.group(2);
                                    group6.getClass();
                                    parseFloat2 = Float.parseFloat(group6) / f7;
                                } catch (NumberFormatException unused3) {
                                    C3354v2.f("Ignoring region with malformed extent: ", a17, "TtmlParser");
                                }
                            } else if (!matcher4.matches()) {
                                C3354v2.f("Ignoring region with unsupported extent: ", a17, "TtmlParser");
                            } else if (bVar == null) {
                                C3354v2.f("Ignoring region with missing tts:extent: ", a17, "TtmlParser");
                            } else {
                                String group7 = matcher4.group(1);
                                group7.getClass();
                                int parseInt3 = Integer.parseInt(group7);
                                String group8 = matcher4.group(2);
                                group8.getClass();
                                float f17 = parseInt3 / bVar.f81584a;
                                parseFloat2 = Integer.parseInt(group8) / bVar.f81585b;
                                parseFloat = f17;
                            }
                            f13 = parseFloat;
                            f14 = parseFloat2;
                        } else {
                            f13 = 1.0f;
                            f14 = 1.0f;
                        }
                        String a19 = O.a(xmlPullParser, "displayAlign");
                        if (a19 != null) {
                            String b11 = O7.b.b(a19);
                            b11.getClass();
                            if (b11.equals(RichContentDTO.ALIGN_CENTER)) {
                                f15 = f11 + (f14 / 2.0f);
                                i12 = 1;
                            } else if (b11.equals("after")) {
                                i12 = 2;
                                f15 = f11 + f14;
                            }
                            float f18 = 1.0f / i11;
                            a12 = O.a(xmlPullParser, "writingMode");
                            if (a12 != null) {
                                String b12 = O7.b.b(a12);
                                b12.getClass();
                                switch (b12.hashCode()) {
                                    case 3694:
                                        if (b12.equals("tb")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 3553396:
                                        if (b12.equals("tblr")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 3553576:
                                        if (b12.equals("tbrl")) {
                                            c11 = 2;
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
                                    case 1:
                                        i13 = 2;
                                        break;
                                    case 2:
                                        i13 = 1;
                                        break;
                                }
                                eVar = new e(a16, f12, f15, 0, i12, f13, f14, 1, f18, i13);
                                if (eVar != null) {
                                    hashMap2.put(eVar.f81586a, eVar);
                                }
                            }
                            i13 = Integer.MIN_VALUE;
                            eVar = new e(a16, f12, f15, 0, i12, f13, f14, 1, f18, i13);
                            if (eVar != null) {
                            }
                        }
                        f15 = f11;
                        i12 = 0;
                        float f182 = 1.0f / i11;
                        a12 = O.a(xmlPullParser, "writingMode");
                        if (a12 != null) {
                        }
                        i13 = Integer.MIN_VALUE;
                        eVar = new e(a16, f12, f15, 0, i12, f13, f14, 1, f182, i13);
                        if (eVar != null) {
                        }
                    }
                    eVar = null;
                    if (eVar != null) {
                    }
                } else if (O.c(xmlPullParser, "metadata")) {
                    do {
                        xmlPullParser.next();
                        if (O.c(xmlPullParser, "image") && (a11 = O.a(xmlPullParser, "id")) != null) {
                            hashMap3.put(a11, xmlPullParser.nextText());
                        }
                    } while (!O.b(xmlPullParser, "metadata"));
                    if (O.b(xmlPullParser, "head")) {
                        return;
                    }
                    i14 = -1;
                    i15 = 0;
                }
                if (O.b(xmlPullParser, "head")) {
                }
            }
            if (O.b(xmlPullParser, "head")) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0106, code lost:
    
        if (r3 != r20) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static c i(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, a aVar) throws k {
        long j11;
        char c11;
        char c12;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String str = null;
        g j12 = j(xmlPullParser, null);
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        long j15 = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        String str2 = "";
        int i11 = 0;
        String[] strArr = null;
        while (i11 < attributeCount) {
            long j17 = j13;
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c11 = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        break;
                    }
                case 1:
                    j16 = k(attributeValue, aVar);
                    break;
                case 2:
                    j15 = k(attributeValue, aVar);
                    break;
                case 3:
                    j14 = k(attributeValue, aVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                        c12 = 65535;
                    } else {
                        int i12 = N.f74289a;
                        c12 = 65535;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length <= 0) {
                        break;
                    } else {
                        strArr = split;
                        break;
                    }
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
            }
            i11++;
            j13 = j17;
        }
        long j18 = j13;
        if (cVar != null) {
            long j19 = cVar.f81562d;
            if (j19 != j18) {
                if (j14 != j18) {
                    j14 += j19;
                }
                if (j15 != j18) {
                    j15 += j19;
                }
            }
        }
        long j21 = j14;
        if (j15 == j18) {
            if (j16 != j18) {
                j15 = j21 + j16;
            } else if (cVar != null) {
                j11 = cVar.f81563e;
            }
        }
        j11 = j15;
        return c.b(xmlPullParser.getName(), j21, j11, j12, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    private static g j(XmlPullParser xmlPullParser, g gVar) {
        ?? r92;
        boolean z11;
        ?? r72;
        char c11;
        char c12;
        ?? r73;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z12 = false;
        g gVar2 = gVar;
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            String attributeName = xmlPullParser.getAttributeName(i11);
            attributeName.getClass();
            Layout.Alignment alignment = null;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r92 = z12;
                        break;
                    }
                    r92 = -1;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        r92 = 1;
                        break;
                    }
                    r92 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r92 = 2;
                        break;
                    }
                    r92 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r92 = 3;
                        break;
                    }
                    r92 = -1;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        r92 = 4;
                        break;
                    }
                    r92 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r92 = 5;
                        break;
                    }
                    r92 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r92 = 6;
                        break;
                    }
                    r92 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r92 = 7;
                        break;
                    }
                    r92 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r92 = 8;
                        break;
                    }
                    r92 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        r92 = 9;
                        break;
                    }
                    r92 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r92 = 10;
                        break;
                    }
                    r92 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r92 = 11;
                        break;
                    }
                    r92 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r92 = 12;
                        break;
                    }
                    r92 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r92 = 13;
                        break;
                    }
                    r92 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r92 = 14;
                        break;
                    }
                    r92 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r92 = 15;
                        break;
                    }
                    r92 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r92 = 16;
                        break;
                    }
                    r92 = -1;
                    break;
                default:
                    r92 = -1;
                    break;
            }
            switch (r92) {
                case 0:
                    z11 = z12;
                    gVar2 = c(gVar2);
                    gVar2.D("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    z11 = z12;
                    gVar2 = c(gVar2);
                    gVar2.x(attributeValue);
                    break;
                case 2:
                    z11 = z12;
                    gVar2 = c(gVar2);
                    gVar2.z(attributeValue);
                    break;
                case 3:
                    z11 = z12;
                    gVar2 = c(gVar2);
                    String b11 = O7.b.b(attributeValue);
                    b11.getClass();
                    switch (b11.hashCode()) {
                        case -1364013995:
                            if (b11.equals(RichContentDTO.ALIGN_CENTER)) {
                                r72 = z11;
                                break;
                            }
                            r72 = -1;
                            break;
                        case 100571:
                            if (b11.equals("end")) {
                                r72 = 1;
                                break;
                            }
                            r72 = -1;
                            break;
                        case 3317767:
                            if (b11.equals("left")) {
                                r72 = 2;
                                break;
                            }
                            r72 = -1;
                            break;
                        case 108511772:
                            if (b11.equals("right")) {
                                r72 = 3;
                                break;
                            }
                            r72 = -1;
                            break;
                        case 109757538:
                            if (b11.equals("start")) {
                                r72 = 4;
                                break;
                            }
                            r72 = -1;
                            break;
                        default:
                            r72 = -1;
                            break;
                    }
                    switch (r72) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    gVar2.K(alignment);
                    break;
                case 4:
                    z11 = z12;
                    gVar2 = c(gVar2);
                    gVar2.G(attributeValue);
                    break;
                case 5:
                    String b12 = O7.b.b(attributeValue);
                    b12.getClass();
                    switch (b12.hashCode()) {
                        case -1461280213:
                            if (b12.equals("nounderline")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1026963764:
                            if (b12.equals("underline")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 913457136:
                            if (b12.equals("nolinethrough")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1679736913:
                            if (b12.equals("linethrough")) {
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
                            z11 = false;
                            gVar2 = c(gVar2);
                            gVar2.N(false);
                            continue;
                        case 1:
                            z11 = false;
                            gVar2 = c(gVar2);
                            gVar2.N(true);
                            continue;
                        case 2:
                            gVar2 = c(gVar2);
                            z11 = false;
                            gVar2.E(false);
                            continue;
                        case 3:
                            gVar2 = c(gVar2);
                            gVar2.E(true);
                            break;
                    }
                    z11 = false;
                    break;
                case 6:
                    gVar2 = c(gVar2);
                    gVar2.w("bold".equalsIgnoreCase(attributeValue));
                    z11 = false;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar2 = c(gVar2);
                        gVar2.C(attributeValue);
                    }
                    z11 = false;
                    break;
                case 8:
                    String b13 = O7.b.b(attributeValue);
                    b13.getClass();
                    switch (b13.hashCode()) {
                        case -618561360:
                            if (b13.equals("baseContainer")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -410956671:
                            if (b13.equals("container")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -250518009:
                            if (b13.equals("delimiter")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -136074796:
                            if (b13.equals("textContainer")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3016401:
                            if (b13.equals("base")) {
                                c12 = 4;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3556653:
                            if (b13.equals("text")) {
                                c12 = 5;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                        case 4:
                            gVar2 = c(gVar2);
                            gVar2.I(2);
                            break;
                        case 1:
                            gVar2 = c(gVar2);
                            gVar2.I(1);
                            break;
                        case 2:
                            gVar2 = c(gVar2);
                            gVar2.I(4);
                            break;
                        case 3:
                        case 5:
                            gVar2 = c(gVar2);
                            gVar2.I(3);
                            break;
                    }
                    z11 = false;
                    break;
                case 9:
                    gVar2 = c(gVar2);
                    try {
                        gVar2.y(C8066h.c(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        C3354v2.f("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    z11 = false;
                    break;
                case 10:
                    g c13 = c(gVar2);
                    Matcher matcher = f81575e.matcher(attributeValue);
                    float f7 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f7 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e11) {
                            s.g("TtmlParser", "Failed to parse shear: " + attributeValue, e11);
                        }
                    } else {
                        C3354v2.f("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    c13.J(f7);
                    gVar2 = c13;
                    z11 = false;
                    break;
                case 11:
                    String b14 = O7.b.b(attributeValue);
                    b14.getClass();
                    if (b14.equals("all")) {
                        gVar2 = c(gVar2);
                        gVar2.L(true);
                    } else if (b14.equals(DevicePublicKeyStringDef.NONE)) {
                        gVar2 = c(gVar2);
                        gVar2.L(z12);
                    }
                    z11 = z12;
                    break;
                case 12:
                    try {
                        gVar2 = c(gVar2);
                        f(attributeValue, gVar2);
                    } catch (k unused2) {
                        C3354v2.f("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    z11 = z12;
                    break;
                case 13:
                    gVar2 = c(gVar2);
                    gVar2.M(q4.b.a(attributeValue));
                    z11 = z12;
                    break;
                case 14:
                    String b15 = O7.b.b(attributeValue);
                    b15.getClass();
                    if (b15.equals("before")) {
                        gVar2 = c(gVar2);
                        gVar2.H(1);
                    } else if (b15.equals("after")) {
                        gVar2 = c(gVar2);
                        gVar2.H(2);
                    }
                    z11 = z12;
                    break;
                case 15:
                    gVar2 = c(gVar2);
                    try {
                        gVar2.v(C8066h.c(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        C3354v2.f("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    z11 = z12;
                    break;
                case 16:
                    gVar2 = c(gVar2);
                    String b16 = O7.b.b(attributeValue);
                    b16.getClass();
                    switch (b16.hashCode()) {
                        case -1364013995:
                            if (b16.equals(RichContentDTO.ALIGN_CENTER)) {
                                r73 = z12;
                                break;
                            }
                            r73 = -1;
                            break;
                        case 100571:
                            if (b16.equals("end")) {
                                r73 = 1;
                                break;
                            }
                            r73 = -1;
                            break;
                        case 3317767:
                            if (b16.equals("left")) {
                                r73 = 2;
                                break;
                            }
                            r73 = -1;
                            break;
                        case 108511772:
                            if (b16.equals("right")) {
                                r73 = 3;
                                break;
                            }
                            r73 = -1;
                            break;
                        case 109757538:
                            if (b16.equals("start")) {
                                r73 = 4;
                                break;
                            }
                            r73 = -1;
                            break;
                        default:
                            r73 = -1;
                            break;
                    }
                    switch (r73) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    gVar2.F(alignment);
                    z11 = z12;
                    break;
                default:
                    z11 = false;
                    break;
            }
            i11++;
            z12 = z11;
        }
        return gVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long k(String str, a aVar) throws k {
        double d11;
        double d12;
        char c11 = 4;
        Matcher matcher = f81572b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / aVar.f81581a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / aVar.f81582b) / aVar.f81581a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f81573c.matcher(str);
        if (!matcher2.matches()) {
            throw new k(Nk.a.b("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 116:
                if (group4.equals("t")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 3494:
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                d11 = aVar.f81581a;
                parseDouble /= d11;
                break;
            case 1:
                d12 = 3600.0d;
                break;
            case 2:
                d12 = 60.0d;
                break;
            case 3:
                d11 = aVar.f81583c;
                parseDouble /= d11;
                break;
            case 4:
                d11 = 1000.0d;
                parseDouble /= d11;
                break;
        }
        parseDouble *= d12;
        return (long) (parseDouble * 1000000.0d);
    }

    private static b l(XmlPullParser xmlPullParser) {
        String a11 = O.a(xmlPullParser, "extent");
        if (a11 == null) {
            return null;
        }
        Matcher matcher = f81577g.matcher(a11);
        if (!matcher.matches()) {
            s.f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(a11));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new b(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            s.f("TtmlParser", "Ignoring malformed tts extent: ".concat(a11));
            return null;
        }
    }

    @Override // k4.o
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<k4.c> interfaceC8068j) {
        k4.f.b(b(i11, i12, bArr), bVar, interfaceC8068j);
    }

    @Override // k4.o
    public final i b(int i11, int i12, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f81580a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET));
            b bVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i11, i12), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVar = f81579i;
            int i13 = 0;
            int i14 = 15;
            h hVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i13 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = g(newPullParser);
                            i14 = e(newPullParser);
                            bVar = l(newPullParser);
                        }
                        a aVar2 = aVar;
                        b bVar2 = bVar;
                        int i15 = i14;
                        if (d(name)) {
                            if ("head".equals(name)) {
                                h(newPullParser, hashMap, i15, bVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    c i16 = i(newPullParser, cVar, hashMap2, aVar2);
                                    arrayDeque.push(i16);
                                    if (cVar != null) {
                                        cVar.a(i16);
                                    }
                                } catch (k e11) {
                                    s.g("TtmlParser", "Suppressing parser error", e11);
                                }
                            }
                            i14 = i15;
                            bVar = bVar2;
                            aVar = aVar2;
                        } else {
                            s.e("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i13++;
                        i14 = i15;
                        bVar = bVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        cVar.a(c.c(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            hVar = new h(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                newPullParser.next();
            }
            hVar.getClass();
            return hVar;
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new IllegalStateException("Unable to decode source", e13);
        }
    }
}
