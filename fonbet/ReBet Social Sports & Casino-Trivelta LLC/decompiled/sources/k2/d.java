package k2;

import android.text.Layout;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import e1.AbstractC4134a;
import e1.AbstractC4145l;
import e1.AbstractC4156x;
import e1.InterfaceC4148o;
import e1.Z;
import e1.a0;
import e2.AbstractC4167i;
import e2.InterfaceC4169k;
import e2.m;
import e2.s;
import i3.C4527h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class d implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f54152b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f54153c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f54154d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f54155e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f54156f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f54157g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f54158h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    public static final a f54159i = new a(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f54160a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f54161a;

        /* renamed from: b, reason: collision with root package name */
        public final int f54162b;

        /* renamed from: c, reason: collision with root package name */
        public final int f54163c;

        public a(float f10, int i10, int i11) {
            this.f54161a = f10;
            this.f54162b = i10;
            this.f54163c = i11;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f54164a;

        /* renamed from: b, reason: collision with root package name */
        public final int f54165b;

        public b(int i10, int i11) {
            this.f54164a = i10;
            this.f54165b = i11;
        }
    }

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f54160a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals(EventKeys.REGION) || str.equals("metadata") || str.equals("image") || str.equals(EventKeys.DATA) || str.equals("information");
    }

    public static Layout.Alignment f(String str) {
        String e10 = Ra.c.e(str);
        e10.getClass();
        switch (e10) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int g(XmlPullParser xmlPullParser, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f54158h.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC4156x.i("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int parseInt = Integer.parseInt((String) AbstractC4134a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) AbstractC4134a.e(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                z10 = false;
            }
            AbstractC4134a.b(z10, "Invalid cell resolution " + parseInt + " " + parseInt2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            AbstractC4156x.i("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    public static void h(String str, g gVar) {
        Matcher matcher;
        String str2;
        String[] A12 = Z.A1(str, "\\s+");
        if (A12.length == 1) {
            matcher = f54154d.matcher(str);
        } else {
            if (A12.length != 2) {
                throw new m("Invalid number of entries for fontSize: " + A12.length + ".");
            }
            matcher = f54154d.matcher(A12[1]);
            AbstractC4156x.i("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new m("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) AbstractC4134a.e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) AbstractC4134a.e(matcher.group(1))));
    }

    public static a i(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            AbstractC4134a.b(Z.A1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f54159i;
        int i10 = aVar.f54162b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = aVar.f54163c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new a(parseInt * f10, i10, i11);
    }

    public static Map j(XmlPullParser xmlPullParser, Map map, int i10, b bVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "style")) {
                String a10 = a0.a(xmlPullParser, "style");
                g o10 = o(xmlPullParser, new g());
                if (a10 != null) {
                    for (String str : p(a10)) {
                        o10.a((g) map.get(str));
                    }
                }
                String h10 = o10.h();
                if (h10 != null) {
                    map.put(h10, o10);
                }
            } else if (a0.f(xmlPullParser, EventKeys.REGION)) {
                e m10 = m(xmlPullParser, i10, bVar, map);
                if (m10 != null) {
                    map2.put(m10.f54166a, m10);
                }
            } else if (a0.f(xmlPullParser, "metadata")) {
                k(xmlPullParser, map3);
            }
        } while (!a0.d(xmlPullParser, "head"));
        return map;
    }

    public static void k(XmlPullParser xmlPullParser, Map map) {
        String a10;
        do {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "image") && (a10 = a0.a(xmlPullParser, StackTraceHelper.ID_KEY)) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!a0.d(xmlPullParser, "metadata"));
    }

    public static C5148c l(XmlPullParser xmlPullParser, C5148c c5148c, Map map, a aVar) {
        String attributeValue;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String str = null;
        g o10 = o(xmlPullParser2, null);
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        String[] strArr = null;
        String str2 = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            int i11 = attributeCount;
            attributeValue = xmlPullParser2.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case "dur":
                    j12 = q(attributeValue, aVar);
                    break;
                case "end":
                    j11 = q(attributeValue, aVar);
                    break;
                case "begin":
                    j10 = q(attributeValue, aVar);
                    break;
                case "style":
                    String[] p10 = p(attributeValue);
                    if (p10.length > 0) {
                        strArr = p10;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (c5148c != null) {
            long j13 = c5148c.f54143d;
            if (j13 != -9223372036854775807L) {
                if (j10 != -9223372036854775807L) {
                    j10 += j13;
                }
                if (j11 != -9223372036854775807L) {
                    j11 += j13;
                }
            }
        }
        long j14 = j10;
        if (j11 == -9223372036854775807L) {
            if (j12 != -9223372036854775807L) {
                j11 = j14 + j12;
            } else if (c5148c != null) {
                long j15 = c5148c.f54144e;
                if (j15 != -9223372036854775807L) {
                    j11 = j15;
                }
            }
        }
        return C5148c.c(xmlPullParser.getName(), j14, j11, o10, strArr, str2, str, c5148c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0232, code lost:
    
        if (r0.equals("tb") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e m(XmlPullParser xmlPullParser, int i10, b bVar, Map map) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        int i12;
        float f15;
        String a10;
        int i13;
        float f16;
        float parseFloat;
        String a11;
        g gVar;
        String a12;
        g gVar2;
        String a13 = a0.a(xmlPullParser, StackTraceHelper.ID_KEY);
        if (a13 == null) {
            return null;
        }
        String a14 = a0.a(xmlPullParser, "origin");
        if (a14 == null && (a12 = a0.a(xmlPullParser, "style")) != null && (gVar2 = (g) map.get(a12)) != null) {
            a14 = gVar2.j();
        }
        int i14 = 2;
        if (a14 != null) {
            Matcher matcher = f54156f.matcher(a14);
            Matcher matcher2 = f54157g.matcher(a14);
            if (matcher.matches()) {
                try {
                    f11 = Float.parseFloat((String) AbstractC4134a.e(matcher.group(1))) / 100.0f;
                    f10 = Float.parseFloat((String) AbstractC4134a.e(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    AbstractC4156x.i("TtmlParser", "Ignoring region with malformed origin: " + a14);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    AbstractC4156x.i("TtmlParser", "Ignoring region with unsupported origin: " + a14);
                    return null;
                }
                if (bVar == null) {
                    AbstractC4156x.i("TtmlParser", "Ignoring region with missing tts:extent: " + a14);
                    return null;
                }
                try {
                    int parseInt = Integer.parseInt((String) AbstractC4134a.e(matcher2.group(1)));
                    float f17 = parseInt / bVar.f54164a;
                    float parseInt2 = Integer.parseInt((String) AbstractC4134a.e(matcher2.group(2))) / bVar.f54165b;
                    f11 = f17;
                    f10 = parseInt2;
                } catch (NumberFormatException unused2) {
                    AbstractC4156x.i("TtmlParser", "Ignoring region with malformed origin: " + a14);
                    return null;
                }
            }
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        String a15 = a0.a(xmlPullParser, "extent");
        if (a15 == null && (a11 = a0.a(xmlPullParser, "style")) != null && (gVar = (g) map.get(a11)) != null) {
            a15 = gVar.c();
        }
        if (a15 != null) {
            Matcher matcher3 = f54156f.matcher(a15);
            Matcher matcher4 = f54157g.matcher(a15);
            f12 = 1.0f;
            if (matcher3.matches()) {
                try {
                    f13 = Float.parseFloat((String) AbstractC4134a.e(matcher3.group(1))) / 100.0f;
                    parseFloat = Float.parseFloat((String) AbstractC4134a.e(matcher3.group(2))) / 100.0f;
                } catch (NumberFormatException unused3) {
                    AbstractC4156x.i("TtmlParser", "Ignoring region with malformed extent: " + a14);
                    return null;
                }
            } else {
                if (!matcher4.matches()) {
                    AbstractC4156x.i("TtmlParser", "Ignoring region with unsupported extent: " + a14);
                    return null;
                }
                if (bVar == null) {
                    AbstractC4156x.i("TtmlParser", "Ignoring region with missing tts:extent: " + a14);
                    return null;
                }
                try {
                    int parseInt3 = Integer.parseInt((String) AbstractC4134a.e(matcher4.group(1)));
                    float f18 = parseInt3 / bVar.f54164a;
                    parseFloat = Integer.parseInt((String) AbstractC4134a.e(matcher4.group(2))) / bVar.f54165b;
                    f13 = f18;
                } catch (NumberFormatException unused4) {
                    AbstractC4156x.i("TtmlParser", "Ignoring region with malformed extent: " + a14);
                    return null;
                }
            }
            f14 = parseFloat;
        } else {
            f12 = 1.0f;
            f13 = 1.0f;
            f14 = 1.0f;
        }
        String a16 = a0.a(xmlPullParser, "displayAlign");
        int i15 = 0;
        if (a16 != null) {
            String e10 = Ra.c.e(a16);
            e10.getClass();
            if (e10.equals("center")) {
                f16 = f10 + (f14 / 2.0f);
                i11 = i10;
                i12 = 2;
                i14 = 1;
            } else if (e10.equals("after")) {
                f16 = f10 + f14;
                i11 = i10;
                i12 = 2;
            }
            f15 = f16;
            float f19 = f12 / i11;
            a10 = a0.a(xmlPullParser, "writingMode");
            if (a10 != null) {
                String e11 = Ra.c.e(a10);
                e11.getClass();
                switch (e11.hashCode()) {
                    case 3694:
                        break;
                    case 3553396:
                        if (e11.equals("tblr")) {
                            i15 = 1;
                            break;
                        }
                        i15 = -1;
                        break;
                    case 3553576:
                        if (e11.equals("tbrl")) {
                            i15 = i12;
                            break;
                        }
                        i15 = -1;
                        break;
                    default:
                        i15 = -1;
                        break;
                }
                switch (i15) {
                    case 0:
                    case 1:
                        i13 = i12;
                        break;
                    case 2:
                        i13 = 1;
                        break;
                }
                return new e(a13, f11, f15, 0, i14, f13, f14, 1, f19, i13);
            }
            i13 = Integer.MIN_VALUE;
            return new e(a13, f11, f15, 0, i14, f13, f14, 1, f19, i13);
        }
        i11 = i10;
        i12 = 2;
        f15 = f10;
        i14 = 0;
        float f192 = f12 / i11;
        a10 = a0.a(xmlPullParser, "writingMode");
        if (a10 != null) {
        }
        i13 = Integer.MIN_VALUE;
        return new e(a13, f11, f15, 0, i14, f13, f14, 1, f192, i13);
    }

    public static float n(String str) {
        Matcher matcher = f54155e.matcher(str);
        if (!matcher.matches()) {
            AbstractC4156x.i("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC4134a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            AbstractC4156x.j("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fd, code lost:
    
        if (r3.equals("text") == false) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g o(XmlPullParser xmlPullParser, g gVar) {
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            char c11 = 5;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(ViewProps.FONT_STYLE)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals(ViewProps.FONT_FAMILY)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals(ViewProps.TEXT_ALIGN)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals(ViewProps.FONT_WEIGHT)) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals(StackTraceHelper.ID_KEY)) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals(ViewProps.COLOR)) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals(ViewProps.FONT_SIZE)) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(ViewProps.BACKGROUND_COLOR)) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c10 = 16;
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
                    gVar = d(gVar).E("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    gVar = d(gVar).y(attributeValue);
                    break;
                case 2:
                    gVar = d(gVar).A(attributeValue);
                    break;
                case 3:
                    gVar = d(gVar).L(f(attributeValue));
                    break;
                case 4:
                    gVar = d(gVar).H(attributeValue);
                    break;
                case 5:
                    String e10 = Ra.c.e(attributeValue);
                    e10.getClass();
                    switch (e10) {
                        case "nounderline":
                            gVar = d(gVar).O(false);
                            break;
                        case "underline":
                            gVar = d(gVar).O(true);
                            break;
                        case "nolinethrough":
                            gVar = d(gVar).F(false);
                            break;
                        case "linethrough":
                            gVar = d(gVar).F(true);
                            break;
                    }
                case 6:
                    gVar = d(gVar).x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar = d(gVar).D(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String e11 = Ra.c.e(attributeValue);
                    e11.getClass();
                    switch (e11.hashCode()) {
                        case -618561360:
                            if (e11.equals("baseContainer")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -410956671:
                            if (e11.equals("container")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -250518009:
                            if (e11.equals("delimiter")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -136074796:
                            if (e11.equals("textContainer")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3016401:
                            if (e11.equals(Constants.SENSITIVITY_BASE)) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3556653:
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                        case 4:
                            gVar = d(gVar).J(2);
                            break;
                        case 1:
                            gVar = d(gVar).J(1);
                            break;
                        case 2:
                            gVar = d(gVar).J(4);
                            break;
                        case 3:
                        case 5:
                            gVar = d(gVar).J(3);
                            break;
                    }
                case '\t':
                    gVar = d(gVar);
                    try {
                        gVar.z(AbstractC4145l.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        AbstractC4156x.i("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\n':
                    gVar = d(gVar).K(n(attributeValue));
                    break;
                case 11:
                    String e12 = Ra.c.e(attributeValue);
                    e12.getClass();
                    if (e12.equals("all")) {
                        gVar = d(gVar).M(true);
                        break;
                    } else if (e12.equals(ViewProps.NONE)) {
                        gVar = d(gVar).M(false);
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        gVar = d(gVar);
                        h(attributeValue, gVar);
                        break;
                    } catch (m unused2) {
                        AbstractC4156x.i("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case '\r':
                    gVar = d(gVar).N(C5147b.a(attributeValue));
                    break;
                case 14:
                    String e13 = Ra.c.e(attributeValue);
                    e13.getClass();
                    if (e13.equals("before")) {
                        gVar = d(gVar).I(1);
                        break;
                    } else if (e13.equals("after")) {
                        gVar = d(gVar).I(2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    gVar = d(gVar);
                    try {
                        gVar.w(AbstractC4145l.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC4156x.i("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 16:
                    gVar = d(gVar).G(f(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    public static String[] p(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : Z.A1(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long q(String str, a aVar) {
        double d10;
        double d11;
        Matcher matcher = f54152b.matcher(str);
        char c10 = 4;
        if (matcher.matches()) {
            double parseLong = (Long.parseLong((String) AbstractC4134a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) AbstractC4134a.e(matcher.group(2))) * 60) + Long.parseLong((String) AbstractC4134a.e(matcher.group(3)));
            String group = matcher.group(4);
            return (long) ((parseLong + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / aVar.f54161a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / aVar.f54162b) / aVar.f54161a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f54153c.matcher(str);
        if (!matcher2.matches()) {
            throw new m("Malformed time expression: " + str);
        }
        double parseDouble = Double.parseDouble((String) AbstractC4134a.e(matcher2.group(1)));
        String str2 = (String) AbstractC4134a.e(matcher2.group(2));
        str2.getClass();
        switch (str2.hashCode()) {
            case 102:
                if (str2.equals("f")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 104:
                if (str2.equals(C4527h.f48087o)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 109:
                if (str2.equals(X9.m.f13664a)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 116:
                if (str2.equals("t")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3494:
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                d10 = aVar.f54161a;
                parseDouble /= d10;
                break;
            case 1:
                d11 = 3600.0d;
                break;
            case 2:
                d11 = 60.0d;
                break;
            case 3:
                d10 = aVar.f54163c;
                parseDouble /= d10;
                break;
            case 4:
                d10 = 1000.0d;
                parseDouble /= d10;
                break;
        }
        parseDouble *= d11;
        return (long) (parseDouble * 1000000.0d);
    }

    public static b r(XmlPullParser xmlPullParser) {
        String a10 = a0.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f54157g.matcher(a10);
        if (!matcher.matches()) {
            AbstractC4156x.i("TtmlParser", "Ignoring non-pixel tts extent: " + a10);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) AbstractC4134a.e(matcher.group(1))), Integer.parseInt((String) AbstractC4134a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            AbstractC4156x.i("TtmlParser", "Ignoring malformed tts extent: " + a10);
            return null;
        }
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        AbstractC4167i.c(b(bArr, i10, i11), bVar, interfaceC4148o);
    }

    @Override // e2.s
    public InterfaceC4169k b(byte[] bArr, int i10, int i11) {
        char c10;
        try {
            XmlPullParser newPullParser = this.f54160a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            h hVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int i13 = 15;
            a aVar = f54159i;
            b bVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C5148c c5148c = (C5148c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = i(newPullParser);
                            c10 = 15;
                            i13 = g(newPullParser, 15);
                            bVar = r(newPullParser);
                        } else {
                            c10 = 15;
                        }
                        a aVar2 = aVar;
                        b bVar2 = bVar;
                        int i14 = i13;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                j(newPullParser, hashMap, i14, bVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    C5148c l10 = l(newPullParser, c5148c, hashMap2, aVar2);
                                    arrayDeque.push(l10);
                                    if (c5148c != null) {
                                        c5148c.a(l10);
                                    }
                                } catch (m e10) {
                                    AbstractC4156x.j("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            i13 = i14;
                            bVar = bVar2;
                            aVar = aVar2;
                        } else {
                            AbstractC4156x.g("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i12++;
                        i13 = i14;
                        bVar = bVar2;
                        aVar = aVar2;
                    } else {
                        c10 = 15;
                        if (eventType == 4) {
                            ((C5148c) AbstractC4134a.e(c5148c)).a(C5148c.d(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                hVar = new h((C5148c) AbstractC4134a.e((C5148c) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                newPullParser.next();
            }
            return (InterfaceC4169k) AbstractC4134a.e(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // e2.s
    public int c() {
        return 1;
    }
}
