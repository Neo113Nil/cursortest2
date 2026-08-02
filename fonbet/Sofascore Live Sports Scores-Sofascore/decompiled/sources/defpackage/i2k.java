package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Season;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i2k implements zli {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final ytg i = new ytg(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public i2k() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            vp2.e("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static m2k a(m2k m2kVar) {
        return m2kVar == null ? new m2k() : m2kVar;
    }

    public static boolean b(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals("head") || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            tgj.d0("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            z1a.n(parseInt, parseInt2, "Invalid cell resolution %s %s", z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            tgj.d0("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, m2k m2kVar) {
        Matcher matcher;
        String group;
        String str2 = nik.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new pli(fc6.h(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            tgj.d0("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new pli(lnb.o("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                m2kVar.j = 3;
                break;
            case "em":
                m2kVar.j = 2;
                break;
            case "px":
                m2kVar.j = 1;
                break;
            default:
                throw new pli(lnb.o("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        m2kVar.k = Float.parseFloat(group2);
    }

    public static ytg e(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = nik.a;
            z1a.r("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        ytg ytgVar = i;
        int i2 = ytgVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = ytgVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new ytg(parseInt * f2, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(XmlPullParser xmlPullParser, HashMap hashMap, int i2, uif uifVar, HashMap hashMap2, HashMap hashMap3) {
        String q;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        String q2;
        int i4;
        k2k k2kVar;
        char c2;
        float parseFloat;
        float parseFloat2;
        String q3;
        m2k m2kVar;
        String q4;
        m2k m2kVar2;
        String[] split;
        do {
            xmlPullParser.next();
            if (ufa.A(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String q5 = ufa.q(xmlPullParser, TtmlNode.TAG_STYLE);
                m2k i5 = i(xmlPullParser, new m2k());
                if (q5 != null) {
                    String trim = q5.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = nik.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        i5.a((m2k) hashMap.get(str2));
                    }
                }
                String str3 = i5.l;
                if (str3 != null) {
                    hashMap.put(str3, i5);
                }
            } else if (ufa.A(xmlPullParser, TtmlNode.TAG_REGION)) {
                String q6 = ufa.q(xmlPullParser, "id");
                if (q6 != null) {
                    String q7 = ufa.q(xmlPullParser, "origin");
                    if (q7 == null && (q4 = ufa.q(xmlPullParser, TtmlNode.TAG_STYLE)) != null && (m2kVar2 = (m2k) hashMap.get(q4)) != null) {
                        q7 = m2kVar2.t;
                    }
                    int i6 = 2;
                    Pattern pattern = g;
                    Pattern pattern2 = f;
                    if (q7 != null) {
                        Matcher matcher = pattern2.matcher(q7);
                        Matcher matcher2 = pattern.matcher(q7);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f2 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f3 = Float.parseFloat(group2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                tgj.d0("Ignoring region with malformed origin: ".concat(q7));
                            }
                        } else if (!matcher2.matches()) {
                            tgj.d0("Ignoring region with unsupported origin: ".concat(q7));
                        } else if (uifVar == null) {
                            tgj.d0("Ignoring region with missing tts:extent: ".concat(q7));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                float f7 = parseInt / uifVar.b;
                                f3 = Integer.parseInt(group4) / uifVar.c;
                                f2 = f7;
                            } catch (NumberFormatException unused2) {
                                tgj.d0("Ignoring region with malformed origin: ".concat(q7));
                            }
                        }
                    } else {
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        f3 = 0.0f;
                    }
                    String q8 = ufa.q(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                    if (q8 == null && (q3 = ufa.q(xmlPullParser, TtmlNode.TAG_STYLE)) != null && (m2kVar = (m2k) hashMap.get(q3)) != null) {
                        q8 = m2kVar.u;
                    }
                    if (q8 != null) {
                        Matcher matcher3 = pattern2.matcher(q8);
                        Matcher matcher4 = pattern.matcher(q8);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / 100.0f;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                mz1.z("Ignoring region with malformed extent: ", q7);
                            }
                        } else if (!matcher4.matches()) {
                            mz1.z("Ignoring region with unsupported extent: ", q7);
                        } else if (uifVar == null) {
                            mz1.z("Ignoring region with missing tts:extent: ", q7);
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt2 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f8 = parseInt2 / uifVar.b;
                            parseFloat2 = Integer.parseInt(group8) / uifVar.c;
                            parseFloat = f8;
                        }
                        f4 = parseFloat;
                        f5 = parseFloat2;
                    } else {
                        f4 = 1.0f;
                        f5 = 1.0f;
                    }
                    String q9 = ufa.q(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                    if (q9 != null) {
                        String W = rz8.W(q9);
                        W.getClass();
                        if (W.equals(TtmlNode.CENTER)) {
                            f6 = f3 + (f5 / 2.0f);
                            i3 = 1;
                        } else if (W.equals("after")) {
                            f6 = f3 + f5;
                            i3 = 2;
                        }
                        float f9 = 1.0f / i2;
                        q2 = ufa.q(xmlPullParser, "writingMode");
                        if (q2 != null) {
                            String W2 = rz8.W(q2);
                            W2.getClass();
                            switch (W2.hashCode()) {
                                case 3694:
                                    if (W2.equals("tb")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553396:
                                    if (W2.equals("tblr")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553576:
                                    if (W2.equals("tbrl")) {
                                        c2 = 2;
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
                                    i4 = i6;
                                    break;
                                case 2:
                                    i4 = 1;
                                    break;
                            }
                            k2kVar = new k2k(q6, f2, f6, 0, i3, f4, f5, 1, f9, i4);
                            if (k2kVar != null) {
                                hashMap2.put(k2kVar.a, k2kVar);
                            }
                        }
                        i6 = Integer.MIN_VALUE;
                        i4 = i6;
                        k2kVar = new k2k(q6, f2, f6, 0, i3, f4, f5, 1, f9, i4);
                        if (k2kVar != null) {
                        }
                    }
                    f6 = f3;
                    i3 = 0;
                    float f92 = 1.0f / i2;
                    q2 = ufa.q(xmlPullParser, "writingMode");
                    if (q2 != null) {
                    }
                    i6 = Integer.MIN_VALUE;
                    i4 = i6;
                    k2kVar = new k2k(q6, f2, f6, 0, i3, f4, f5, 1, f92, i4);
                    if (k2kVar != null) {
                    }
                }
                k2kVar = null;
                if (k2kVar != null) {
                }
            } else if (ufa.A(xmlPullParser, TtmlNode.TAG_METADATA)) {
                do {
                    xmlPullParser.next();
                    if (ufa.A(xmlPullParser, "image") && (q = ufa.q(xmlPullParser, "id")) != null) {
                        hashMap3.put(q, xmlPullParser.nextText());
                    }
                } while (!ufa.x(xmlPullParser, TtmlNode.TAG_METADATA));
            }
        } while (!ufa.x(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static h2k g(XmlPullParser xmlPullParser, h2k h2kVar, HashMap hashMap, ytg ytgVar) {
        long j;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        m2k i2 = i(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = C.TIME_UNSET;
        long j3 = C.TIME_UNSET;
        long j4 = C.TIME_UNSET;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(TtmlNode.TAG_REGION)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals(TtmlNode.END)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = k(attributeValue, ytgVar);
                    break;
                case 2:
                    j3 = k(attributeValue, ytgVar);
                    break;
                case 3:
                    j2 = k(attributeValue, ytgVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = nik.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (h2kVar != null) {
            long j5 = h2kVar.d;
            if (j5 != C.TIME_UNSET) {
                if (j2 != C.TIME_UNSET) {
                    j2 += j5;
                }
                if (j3 != C.TIME_UNSET) {
                    j3 += j5;
                }
            }
        }
        if (j3 == C.TIME_UNSET) {
            if (j4 != C.TIME_UNSET) {
                j3 = j2 + j4;
            } else if (h2kVar != null) {
                long j6 = h2kVar.e;
                if (j6 != C.TIME_UNSET) {
                    j = j6;
                    return new h2k(xmlPullParser.getName(), null, j2, j, i2, strArr, str2, str, h2kVar);
                }
            }
        }
        j = j3;
        return new h2k(xmlPullParser.getName(), null, j2, j, i2, strArr, str2, str, h2kVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0289  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m2k i(XmlPullParser xmlPullParser, m2k m2kVar) {
        char c2;
        ?? r9;
        ?? r10;
        char c3;
        int i2;
        s9h u;
        int i3;
        int hashCode;
        int i4;
        h9j h9jVar;
        int i5;
        char c4;
        int attributeCount = xmlPullParser.getAttributeCount();
        m2k m2kVar2 = m2kVar;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            String attributeName = xmlPullParser.getAttributeName(i6);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_EXTENT)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c2) {
                case 0:
                    m2kVar2 = a(m2kVar2);
                    m2kVar2.i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    m2kVar2 = a(m2kVar2);
                    m2kVar2.u = attributeValue;
                    break;
                case 2:
                    m2kVar2 = a(m2kVar2);
                    m2kVar2.a = attributeValue;
                    break;
                case 3:
                    m2kVar2 = a(m2kVar2);
                    String W = rz8.W(attributeValue);
                    W.getClass();
                    switch (W.hashCode()) {
                        case -1364013995:
                            if (W.equals(TtmlNode.CENTER)) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (W.equals(TtmlNode.END)) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (W.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (W.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (W.equals("start")) {
                                r9 = 4;
                                break;
                            }
                            r9 = -1;
                            break;
                        default:
                            r9 = -1;
                            break;
                    }
                    switch (r9) {
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
                    m2kVar2.o = alignment;
                    break;
                case 4:
                    m2kVar2 = a(m2kVar2);
                    m2kVar2.t = attributeValue;
                    break;
                case 5:
                    String W2 = rz8.W(attributeValue);
                    W2.getClass();
                    switch (W2.hashCode()) {
                        case -1461280213:
                            if (W2.equals(TtmlNode.NO_UNDERLINE)) {
                                r10 = false;
                                break;
                            }
                            r10 = -1;
                            break;
                        case -1026963764:
                            if (W2.equals(TtmlNode.UNDERLINE)) {
                                r10 = true;
                                break;
                            }
                            r10 = -1;
                            break;
                        case 913457136:
                            if (W2.equals(TtmlNode.NO_LINETHROUGH)) {
                                r10 = 2;
                                break;
                            }
                            r10 = -1;
                            break;
                        case 1679736913:
                            if (W2.equals(TtmlNode.LINETHROUGH)) {
                                r10 = 3;
                                break;
                            }
                            r10 = -1;
                            break;
                        default:
                            r10 = -1;
                            break;
                    }
                    switch (r10) {
                        case 0:
                            m2kVar2 = a(m2kVar2);
                            m2kVar2.g = 0;
                            break;
                        case 1:
                            m2kVar2 = a(m2kVar2);
                            m2kVar2.g = 1;
                            break;
                        case 2:
                            m2kVar2 = a(m2kVar2);
                            m2kVar2.f = 0;
                            break;
                        case 3:
                            m2kVar2 = a(m2kVar2);
                            m2kVar2.f = 1;
                            break;
                    }
                case 6:
                    m2kVar2 = a(m2kVar2);
                    m2kVar2.h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        m2kVar2 = a(m2kVar2);
                        m2kVar2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String W3 = rz8.W(attributeValue);
                    W3.getClass();
                    switch (W3.hashCode()) {
                        case -618561360:
                            if (W3.equals("baseContainer")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -410956671:
                            if (W3.equals("container")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -250518009:
                            if (W3.equals("delimiter")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -136074796:
                            if (W3.equals("textContainer")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3016401:
                            if (W3.equals("base")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3556653:
                            if (W3.equals("text")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 4:
                            m2kVar2 = a(m2kVar2);
                            m2kVar2.m = 2;
                            break;
                        case 1:
                            m2kVar2 = a(m2kVar2);
                            m2kVar2.m = 1;
                            break;
                        case 2:
                            m2kVar2 = a(m2kVar2);
                            m2kVar2.m = 4;
                            break;
                        case 3:
                        case 5:
                            m2kVar2 = a(m2kVar2);
                            m2kVar2.m = 3;
                            break;
                    }
                case '\t':
                    m2kVar2 = a(m2kVar2);
                    try {
                        m2kVar2.b = b23.a(attributeValue, false);
                        m2kVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        mz1.z("Failed parsing color value: ", attributeValue);
                        break;
                    }
                case '\n':
                    m2k a = a(m2kVar2);
                    Matcher matcher = e.matcher(attributeValue);
                    float f2 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f2 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e2) {
                            tgj.e0("Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        mz1.z("Invalid value for shear: ", attributeValue);
                    }
                    a.s = f2;
                    m2kVar2 = a;
                    break;
                case 11:
                    String W4 = rz8.W(attributeValue);
                    W4.getClass();
                    if (W4.equals(Season.YEAR_ALL_TIME)) {
                        m2kVar2 = a(m2kVar2);
                        m2kVar2.q = 1;
                        break;
                    } else if (W4.equals("none")) {
                        m2kVar2 = a(m2kVar2);
                        m2kVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        m2kVar2 = a(m2kVar2);
                        d(attributeValue, m2kVar2);
                        break;
                    } catch (pli unused2) {
                        mz1.z("Failed parsing fontSize value: ", attributeValue);
                        break;
                    }
                case '\r':
                    m2kVar2 = a(m2kVar2);
                    Pattern pattern = h9j.d;
                    if (attributeValue != null) {
                        String W5 = rz8.W(attributeValue.trim());
                        if (!W5.isEmpty()) {
                            vv9 u2 = vv9.u(TextUtils.split(W5, h9j.d));
                            String str = (String) jca.F(w1a.u(h9j.h, u2), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i2 = 2;
                                        u = w1a.u(h9j.e, u2);
                                        if (u.isEmpty()) {
                                            s9h u3 = w1a.u(h9j.g, u2);
                                            s9h u4 = w1a.u(h9j.f, u2);
                                            if (u3.isEmpty() && u4.isEmpty()) {
                                                h9jVar = new h9j(-1, 0, i2);
                                            } else {
                                                String str2 = (String) jca.F(u3, "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i3 = 2;
                                                    String str3 = (String) jca.F(u4, "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i4 = 2;
                                                            h9jVar = new h9j(i4, i3, i2);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i4 = 3;
                                                        h9jVar = new h9j(i4, i3, i2);
                                                    }
                                                    i4 = 1;
                                                    h9jVar = new h9j(i4, i3, i2);
                                                }
                                                i3 = 1;
                                                String str32 = (String) jca.F(u4, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i4 = 1;
                                                h9jVar = new h9j(i4, i3, i2);
                                            }
                                        } else {
                                            String str4 = (String) new kca(u).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i5 = 0;
                                                h9jVar = new h9j(i5, 0, i2);
                                            }
                                            i5 = -1;
                                            h9jVar = new h9j(i5, 0, i2);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i2 = -2;
                                    u = w1a.u(h9j.e, u2);
                                    if (u.isEmpty()) {
                                    }
                                }
                                m2kVar2.r = h9jVar;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i2 = 1;
                            u = w1a.u(h9j.e, u2);
                            if (u.isEmpty()) {
                            }
                            m2kVar2.r = h9jVar;
                        }
                    }
                    h9jVar = null;
                    m2kVar2.r = h9jVar;
                    break;
                case 14:
                    String W6 = rz8.W(attributeValue);
                    W6.getClass();
                    if (W6.equals("before")) {
                        m2kVar2 = a(m2kVar2);
                        m2kVar2.n = 1;
                        break;
                    } else if (W6.equals("after")) {
                        m2kVar2 = a(m2kVar2);
                        m2kVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    m2kVar2 = a(m2kVar2);
                    try {
                        m2kVar2.d = b23.a(attributeValue, false);
                        m2kVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        mz1.z("Failed parsing background value: ", attributeValue);
                        break;
                    }
                case 16:
                    m2kVar2 = a(m2kVar2);
                    String W7 = rz8.W(attributeValue);
                    W7.getClass();
                    switch (W7.hashCode()) {
                        case -1364013995:
                            if (W7.equals(TtmlNode.CENTER)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 100571:
                            if (W7.equals(TtmlNode.END)) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3317767:
                            if (W7.equals("left")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 108511772:
                            if (W7.equals("right")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 109757538:
                            if (W7.equals("start")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
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
                    m2kVar2.p = alignment;
                    break;
            }
        }
        return m2kVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long k(String str, ytg ytgVar) {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        char c2 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / ytgVar.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ytgVar.b) / ytgVar.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new pli(dmi.q("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 104:
                if (group4.equals(h.b)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 109:
                if (group4.equals(InneractiveMediationDefs.GENDER_MALE)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case GZIP_ENCODE_ERROR_VALUE:
                if (group4.equals("t")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3494:
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                d2 = ytgVar.a;
                parseDouble /= d2;
                break;
            case 1:
                d3 = 3600.0d;
                break;
            case 2:
                d3 = 60.0d;
                break;
            case 3:
                d2 = ytgVar.c;
                parseDouble /= d2;
                break;
            case 4:
                d2 = 1000.0d;
                parseDouble /= d2;
                break;
        }
        parseDouble *= d3;
        return (long) (parseDouble * 1000000.0d);
    }

    public static uif m(XmlPullParser xmlPullParser) {
        String q = ufa.q(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (q == null) {
            return null;
        }
        Matcher matcher = g.matcher(q);
        if (!matcher.matches()) {
            tgj.d0("Ignoring non-pixel tts extent: ".concat(q));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new uif(parseInt, Integer.parseInt(group2), 12);
        } catch (NumberFormatException unused) {
            tgj.d0("Ignoring malformed tts extent: ".concat(q));
            return null;
        }
    }

    @Override // defpackage.zli
    public final void h(byte[] bArr, int i2, int i3, yli yliVar, wn3 wn3Var) {
        tba.O(j(i2, i3, bArr), yliVar, wn3Var);
    }

    @Override // defpackage.zli
    public final lli j(int i2, int i3, byte[] bArr) {
        lli lliVar;
        lli lliVar2 = null;
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new k2k("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            ytg ytgVar = i;
            int i4 = 15;
            int i5 = 0;
            p03 p03Var = null;
            uif uifVar = null;
            while (eventType != 1) {
                h2k h2kVar = (h2k) arrayDeque.peek();
                if (i5 == 0) {
                    String name = newPullParser.getName();
                    lliVar = lliVar2;
                    if (eventType == 2) {
                        try {
                            if (TtmlNode.TAG_TT.equals(name)) {
                                ytgVar = e(newPullParser);
                                i4 = c(newPullParser);
                                uifVar = m(newPullParser);
                            }
                            ytg ytgVar2 = ytgVar;
                            int i6 = i4;
                            uif uifVar2 = uifVar;
                            if (b(name)) {
                                if ("head".equals(name)) {
                                    f(newPullParser, hashMap, i6, uifVar2, hashMap2, hashMap3);
                                } else {
                                    try {
                                        h2k g2 = g(newPullParser, h2kVar, hashMap2, ytgVar2);
                                        arrayDeque.push(g2);
                                        if (h2kVar != null) {
                                            ArrayList arrayList = h2kVar.m;
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                h2kVar.m = arrayList;
                                            }
                                            arrayList.add(g2);
                                        }
                                    } catch (pli e2) {
                                        tgj.e0("Suppressing parser error", e2);
                                    }
                                }
                                uifVar = uifVar2;
                                i4 = i6;
                                ytgVar = ytgVar2;
                            } else {
                                tgj.O("Ignoring unsupported tag: " + newPullParser.getName());
                            }
                            i5++;
                            uifVar = uifVar2;
                            i4 = i6;
                            ytgVar = ytgVar2;
                        } catch (IOException e3) {
                            e = e3;
                            sw9.m("Unexpected error when reading input.", e);
                            return lliVar;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            sw9.m("Unable to decode source", e);
                            return lliVar;
                        }
                    } else if (eventType == 4) {
                        h2kVar.getClass();
                        h2k a = h2k.a(newPullParser.getText());
                        ArrayList arrayList2 = h2kVar.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            h2kVar.m = arrayList2;
                        }
                        arrayList2.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            h2k h2kVar2 = (h2k) arrayDeque.peek();
                            h2kVar2.getClass();
                            p03Var = new p03(h2kVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    lliVar = lliVar2;
                    if (eventType == 2) {
                        i5++;
                    } else if (eventType == 3) {
                        i5--;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                lliVar2 = lliVar;
            }
            lliVar = lliVar2;
            p03Var.getClass();
            return p03Var;
        } catch (IOException e5) {
            e = e5;
            lliVar = lliVar2;
        } catch (XmlPullParserException e6) {
            e = e6;
            lliVar = lliVar2;
        }
    }

    @Override // defpackage.zli
    public final int l() {
        return 1;
    }
}
