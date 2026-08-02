package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Season;
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
public final class f2k extends qhh {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final ytg u = new ytg(30.0f, 1, 1);
    public static final zid v = new zid(15, 12);
    public final XmlPullParserFactory m;

    public f2k() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            vp2.e("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static l2k e(l2k l2kVar) {
        return l2kVar == null ? new l2k() : l2kVar;
    }

    public static boolean f(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals("head") || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static zid g(XmlPullParser xmlPullParser, zid zidVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return zidVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            m6k.f0();
            return zidVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new zid(parseInt2, 12);
            }
            throw new oli("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            m6k.f0();
            return zidVar;
        }
    }

    public static void h(String str, l2k l2kVar) {
        Matcher matcher;
        String group;
        int i = lik.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new oli(fc6.h(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            m6k.f0();
        }
        if (!matcher.matches()) {
            throw new oli(lnb.o("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                l2kVar.j = 3;
                break;
            case "em":
                l2kVar.j = 2;
                break;
            case "px":
                l2kVar.j = 1;
                break;
            default:
                throw new oli(lnb.o("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        l2kVar.k = Float.parseFloat(group2);
    }

    public static ytg i(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = lik.a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new oli("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        ytg ytgVar = u;
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
        return new ytg(parseInt * f, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(XmlPullParser xmlPullParser, HashMap hashMap, zid zidVar, uif uifVar, HashMap hashMap2, HashMap hashMap3) {
        String n2;
        float parseFloat;
        float f;
        float parseFloat2;
        float parseFloat3;
        zid zidVar2;
        int i;
        String n3;
        int i2;
        j2k j2kVar;
        String[] split;
        do {
            xmlPullParser.next();
            if (sea.t(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String n4 = sea.n(xmlPullParser, TtmlNode.TAG_STYLE);
                l2k l = l(xmlPullParser, new l2k());
                if (n4 != null) {
                    String trim = n4.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i3 = lik.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str : split) {
                        l.a((l2k) hashMap.get(str));
                    }
                }
                String str2 = l.l;
                if (str2 != null) {
                    hashMap.put(str2, l);
                }
            } else if (sea.t(xmlPullParser, TtmlNode.TAG_REGION)) {
                String n5 = sea.n(xmlPullParser, "id");
                if (n5 != null) {
                    String n6 = sea.n(xmlPullParser, "origin");
                    if (n6 != null) {
                        Pattern pattern = r;
                        Matcher matcher = pattern.matcher(n6);
                        Pattern pattern2 = s;
                        Matcher matcher2 = pattern2.matcher(n6);
                        int i4 = 2;
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                float parseFloat4 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                parseFloat = Float.parseFloat(group2) / 100.0f;
                                f = parseFloat4;
                            } catch (NumberFormatException unused) {
                                "Ignoring region with malformed origin: ".concat(n6);
                                m6k.f0();
                            }
                        } else if (!matcher2.matches()) {
                            "Ignoring region with unsupported origin: ".concat(n6);
                            m6k.f0();
                        } else if (uifVar == null) {
                            "Ignoring region with missing tts:extent: ".concat(n6);
                            m6k.f0();
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f = parseInt / uifVar.b;
                                parseFloat = Integer.parseInt(group4) / uifVar.c;
                            } catch (NumberFormatException unused2) {
                                "Ignoring region with malformed origin: ".concat(n6);
                                m6k.f0();
                            }
                        }
                        String n7 = sea.n(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                        if (n7 != null) {
                            Matcher matcher3 = pattern.matcher(n7);
                            Matcher matcher4 = pattern2.matcher(n7);
                            if (matcher3.matches()) {
                                try {
                                    String group5 = matcher3.group(1);
                                    group5.getClass();
                                    parseFloat2 = Float.parseFloat(group5) / 100.0f;
                                    String group6 = matcher3.group(2);
                                    group6.getClass();
                                    parseFloat3 = Float.parseFloat(group6) / 100.0f;
                                } catch (NumberFormatException unused3) {
                                    "Ignoring region with malformed extent: ".concat(n6);
                                    m6k.f0();
                                }
                            } else if (!matcher4.matches()) {
                                "Ignoring region with unsupported extent: ".concat(n6);
                                m6k.f0();
                            } else if (uifVar == null) {
                                "Ignoring region with missing tts:extent: ".concat(n6);
                                m6k.f0();
                            } else {
                                try {
                                    String group7 = matcher4.group(1);
                                    group7.getClass();
                                    int parseInt2 = Integer.parseInt(group7);
                                    String group8 = matcher4.group(2);
                                    group8.getClass();
                                    float f2 = parseInt2 / uifVar.b;
                                    parseFloat3 = Integer.parseInt(group8) / uifVar.c;
                                    parseFloat2 = f2;
                                } catch (NumberFormatException unused4) {
                                    "Ignoring region with malformed extent: ".concat(n6);
                                    m6k.f0();
                                }
                            }
                            String n8 = sea.n(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                            if (n8 != null) {
                                String W = rz8.W(n8);
                                W.getClass();
                                if (W.equals(TtmlNode.CENTER)) {
                                    parseFloat += parseFloat3 / 2.0f;
                                    zidVar2 = zidVar;
                                    i = 1;
                                } else if (W.equals("after")) {
                                    parseFloat += parseFloat3;
                                    zidVar2 = zidVar;
                                    i = 2;
                                }
                                float f3 = 1.0f / zidVar2.b;
                                n3 = sea.n(xmlPullParser, "writingMode");
                                if (n3 != null) {
                                    String W2 = rz8.W(n3);
                                    W2.getClass();
                                    switch (W2) {
                                        case "tb":
                                        case "tblr":
                                            i2 = i4;
                                            break;
                                        case "tbrl":
                                            i2 = 1;
                                            break;
                                    }
                                    j2kVar = new j2k(n5, f, parseFloat, 0, i, parseFloat2, parseFloat3, 1, f3, i2);
                                    if (j2kVar != null) {
                                        hashMap2.put(j2kVar.a, j2kVar);
                                    }
                                }
                                i4 = Integer.MIN_VALUE;
                                i2 = i4;
                                j2kVar = new j2k(n5, f, parseFloat, 0, i, parseFloat2, parseFloat3, 1, f3, i2);
                                if (j2kVar != null) {
                                }
                            }
                            zidVar2 = zidVar;
                            i = 0;
                            float f32 = 1.0f / zidVar2.b;
                            n3 = sea.n(xmlPullParser, "writingMode");
                            if (n3 != null) {
                            }
                            i4 = Integer.MIN_VALUE;
                            i2 = i4;
                            j2kVar = new j2k(n5, f, parseFloat, 0, i, parseFloat2, parseFloat3, 1, f32, i2);
                            if (j2kVar != null) {
                            }
                        } else {
                            m6k.f0();
                        }
                    } else {
                        m6k.f0();
                    }
                }
                j2kVar = null;
                if (j2kVar != null) {
                }
            } else if (sea.t(xmlPullParser, TtmlNode.TAG_METADATA)) {
                do {
                    xmlPullParser.next();
                    if (sea.t(xmlPullParser, "image") && (n2 = sea.n(xmlPullParser, "id")) != null) {
                        hashMap3.put(n2, xmlPullParser.nextText());
                    }
                } while (!sea.q(xmlPullParser, TtmlNode.TAG_METADATA));
            }
        } while (!sea.q(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static g2k k(XmlPullParser xmlPullParser, g2k g2kVar, HashMap hashMap, ytg ytgVar) {
        long j;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        l2k l = l(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = C.TIME_UNSET;
        long j3 = C.TIME_UNSET;
        long j4 = C.TIME_UNSET;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(TtmlNode.TAG_REGION)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals(TtmlNode.END)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = m(attributeValue, ytgVar);
                    break;
                case 2:
                    j3 = m(attributeValue, ytgVar);
                    break;
                case 3:
                    j2 = m(attributeValue, ytgVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i2 = lik.a;
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
        if (g2kVar != null) {
            long j5 = g2kVar.d;
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
            } else if (g2kVar != null) {
                long j6 = g2kVar.e;
                if (j6 != C.TIME_UNSET) {
                    j = j6;
                    return new g2k(xmlPullParser.getName(), null, j2, j, l, strArr, str2, str, g2kVar);
                }
            }
        }
        j = j3;
        return new g2k(xmlPullParser.getName(), null, j2, j, l, strArr, str2, str, g2kVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026a  */
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
    public static l2k l(XmlPullParser xmlPullParser, l2k l2kVar) {
        char c;
        ?? r9;
        ?? r10;
        char c2;
        int i;
        s9h u2;
        int i2;
        int hashCode;
        int i3;
        g9j g9jVar;
        int i4;
        char c3;
        int attributeCount = xmlPullParser.getAttributeCount();
        l2k l2kVar2 = l2kVar;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            String attributeName = xmlPullParser.getAttributeName(i5);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c) {
                case 0:
                    l2kVar2 = e(l2kVar2);
                    l2kVar2.i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    l2kVar2 = e(l2kVar2);
                    l2kVar2.a = attributeValue;
                    break;
                case 2:
                    l2kVar2 = e(l2kVar2);
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
                    l2kVar2.o = alignment;
                    break;
                case 3:
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
                            l2kVar2 = e(l2kVar2);
                            l2kVar2.g = 0;
                            break;
                        case 1:
                            l2kVar2 = e(l2kVar2);
                            l2kVar2.g = 1;
                            break;
                        case 2:
                            l2kVar2 = e(l2kVar2);
                            l2kVar2.f = 0;
                            break;
                        case 3:
                            l2kVar2 = e(l2kVar2);
                            l2kVar2.f = 1;
                            break;
                    }
                case 4:
                    l2kVar2 = e(l2kVar2);
                    l2kVar2.h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        l2kVar2 = e(l2kVar2);
                        l2kVar2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String W3 = rz8.W(attributeValue);
                    W3.getClass();
                    switch (W3.hashCode()) {
                        case -618561360:
                            if (W3.equals("baseContainer")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -410956671:
                            if (W3.equals("container")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -250518009:
                            if (W3.equals("delimiter")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -136074796:
                            if (W3.equals("textContainer")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3016401:
                            if (W3.equals("base")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3556653:
                            if (W3.equals("text")) {
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
                        case 4:
                            l2kVar2 = e(l2kVar2);
                            l2kVar2.m = 2;
                            break;
                        case 1:
                            l2kVar2 = e(l2kVar2);
                            l2kVar2.m = 1;
                            break;
                        case 2:
                            l2kVar2 = e(l2kVar2);
                            l2kVar2.m = 4;
                            break;
                        case 3:
                        case 5:
                            l2kVar2 = e(l2kVar2);
                            l2kVar2.m = 3;
                            break;
                    }
                case 7:
                    l2kVar2 = e(l2kVar2);
                    try {
                        l2kVar2.b = a23.a(attributeValue, false);
                        l2kVar2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        m6k.f0();
                        break;
                    }
                case '\b':
                    l2k e = e(l2kVar2);
                    Matcher matcher = q.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e2) {
                            m6k.g0("Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        m6k.f0();
                    }
                    e.s = f;
                    l2kVar2 = e;
                    break;
                case '\t':
                    String W4 = rz8.W(attributeValue);
                    W4.getClass();
                    if (W4.equals(Season.YEAR_ALL_TIME)) {
                        l2kVar2 = e(l2kVar2);
                        l2kVar2.q = 1;
                        break;
                    } else if (W4.equals("none")) {
                        l2kVar2 = e(l2kVar2);
                        l2kVar2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        l2kVar2 = e(l2kVar2);
                        h(attributeValue, l2kVar2);
                        break;
                    } catch (oli unused2) {
                        m6k.f0();
                        break;
                    }
                case 11:
                    l2kVar2 = e(l2kVar2);
                    Pattern pattern = g9j.d;
                    if (attributeValue != null) {
                        String W5 = rz8.W(attributeValue.trim());
                        if (!W5.isEmpty()) {
                            vv9 u3 = vv9.u(TextUtils.split(W5, g9j.d));
                            String str = (String) jca.F(w1a.u(g9j.h, u3), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i = 2;
                                        u2 = w1a.u(g9j.e, u3);
                                        if (u2.isEmpty()) {
                                            s9h u4 = w1a.u(g9j.g, u3);
                                            s9h u5 = w1a.u(g9j.f, u3);
                                            if (u4.isEmpty() && u5.isEmpty()) {
                                                g9jVar = new g9j(-1, 0, i);
                                            } else {
                                                String str2 = (String) jca.F(u4, "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals("open")) {
                                                    i2 = 2;
                                                    String str3 = (String) jca.F(u5, "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i3 = 2;
                                                            g9jVar = new g9j(i3, i2, i);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i3 = 3;
                                                        g9jVar = new g9j(i3, i2, i);
                                                    }
                                                    i3 = 1;
                                                    g9jVar = new g9j(i3, i2, i);
                                                }
                                                i2 = 1;
                                                String str32 = (String) jca.F(u5, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i3 = 1;
                                                g9jVar = new g9j(i3, i2, i);
                                            }
                                        } else {
                                            String str4 = (String) new kca(u2).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i4 = 0;
                                                g9jVar = new g9j(i4, 0, i);
                                            }
                                            i4 = -1;
                                            g9jVar = new g9j(i4, 0, i);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i = -2;
                                    u2 = w1a.u(g9j.e, u3);
                                    if (u2.isEmpty()) {
                                    }
                                }
                                l2kVar2.r = g9jVar;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i = 1;
                            u2 = w1a.u(g9j.e, u3);
                            if (u2.isEmpty()) {
                            }
                            l2kVar2.r = g9jVar;
                        }
                    }
                    g9jVar = null;
                    l2kVar2.r = g9jVar;
                    break;
                case '\f':
                    String W6 = rz8.W(attributeValue);
                    W6.getClass();
                    if (W6.equals("before")) {
                        l2kVar2 = e(l2kVar2);
                        l2kVar2.n = 1;
                        break;
                    } else if (W6.equals("after")) {
                        l2kVar2 = e(l2kVar2);
                        l2kVar2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    l2kVar2 = e(l2kVar2);
                    try {
                        l2kVar2.d = a23.a(attributeValue, false);
                        l2kVar2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        m6k.f0();
                        break;
                    }
                case 14:
                    l2kVar2 = e(l2kVar2);
                    String W7 = rz8.W(attributeValue);
                    W7.getClass();
                    switch (W7.hashCode()) {
                        case -1364013995:
                            if (W7.equals(TtmlNode.CENTER)) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 100571:
                            if (W7.equals(TtmlNode.END)) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3317767:
                            if (W7.equals("left")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108511772:
                            if (W7.equals("right")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109757538:
                            if (W7.equals("start")) {
                                c3 = 4;
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
                    l2kVar2.p = alignment;
                    break;
            }
        }
        return l2kVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m(String str, ytg ytgVar) {
        double d;
        double d2;
        Matcher matcher = n.matcher(str);
        char c = 4;
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
        Matcher matcher2 = o.matcher(str);
        if (!matcher2.matches()) {
            throw new oli(dmi.q("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 104:
                if (group4.equals(h.b)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 109:
                if (group4.equals(InneractiveMediationDefs.GENDER_MALE)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case GZIP_ENCODE_ERROR_VALUE:
                if (group4.equals("t")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3494:
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                d = ytgVar.a;
                parseDouble /= d;
                break;
            case 1:
                d2 = 3600.0d;
                break;
            case 2:
                d2 = 60.0d;
                break;
            case 3:
                d = ytgVar.c;
                parseDouble /= d;
                break;
            case 4:
                d = 1000.0d;
                parseDouble /= d;
                break;
        }
        parseDouble *= d2;
        return (long) (parseDouble * 1000000.0d);
    }

    public static uif n(XmlPullParser xmlPullParser) {
        String n2 = sea.n(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (n2 == null) {
            return null;
        }
        Matcher matcher = s.matcher(n2);
        if (!matcher.matches()) {
            "Ignoring non-pixel tts extent: ".concat(n2);
            m6k.f0();
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new uif(parseInt, Integer.parseInt(group2), 11);
        } catch (NumberFormatException unused) {
            "Ignoring malformed tts extent: ".concat(n2);
            m6k.f0();
            return null;
        }
    }

    @Override // defpackage.qhh
    public final kli b(byte[] bArr, int i, boolean z) {
        kli kliVar;
        kli kliVar2 = null;
        try {
            try {
                XmlPullParser newPullParser = this.m.newPullParser();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                hashMap2.put("", new j2k("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                ArrayDeque arrayDeque = new ArrayDeque();
                int eventType = newPullParser.getEventType();
                ytg ytgVar = u;
                zid zidVar = v;
                p03 p03Var = null;
                uif uifVar = null;
                int i2 = 0;
                zid zidVar2 = zidVar;
                while (eventType != 1) {
                    g2k g2kVar = (g2k) arrayDeque.peek();
                    if (i2 == 0) {
                        kliVar = kliVar2;
                        try {
                            String name = newPullParser.getName();
                            if (eventType == 2) {
                                if (TtmlNode.TAG_TT.equals(name)) {
                                    ytgVar = i(newPullParser);
                                    zidVar2 = g(newPullParser, zidVar);
                                    uifVar = n(newPullParser);
                                }
                                uif uifVar2 = uifVar;
                                ytg ytgVar2 = ytgVar;
                                if (f(name)) {
                                    if ("head".equals(name)) {
                                        j(newPullParser, hashMap, zidVar2, uifVar2, hashMap2, hashMap3);
                                    } else {
                                        try {
                                            g2k k = k(newPullParser, g2kVar, hashMap2, ytgVar2);
                                            arrayDeque.push(k);
                                            if (g2kVar != null) {
                                                ArrayList arrayList = g2kVar.m;
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                    g2kVar.m = arrayList;
                                                }
                                                arrayList.add(k);
                                            }
                                        } catch (oli e) {
                                            m6k.g0("Suppressing parser error", e);
                                        }
                                    }
                                    uifVar = uifVar2;
                                    ytgVar = ytgVar2;
                                } else {
                                    newPullParser.getName();
                                    m6k.Q();
                                }
                                i2++;
                                uifVar = uifVar2;
                                ytgVar = ytgVar2;
                            } else if (eventType == 4) {
                                g2kVar.getClass();
                                g2k a = g2k.a(newPullParser.getText());
                                ArrayList arrayList2 = g2kVar.m;
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    g2kVar.m = arrayList2;
                                }
                                arrayList2.add(a);
                            } else if (eventType == 3) {
                                if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                    g2k g2kVar2 = (g2k) arrayDeque.peek();
                                    g2kVar2.getClass();
                                    p03Var = new p03(g2kVar2, hashMap, hashMap2, hashMap3);
                                }
                                arrayDeque.pop();
                            }
                        } catch (IOException e2) {
                            e = e2;
                            sw9.m("Unexpected error when reading input.", e);
                            return kliVar;
                        }
                    } else {
                        kliVar = kliVar2;
                        if (eventType == 2) {
                            i2++;
                        } else if (eventType == 3) {
                            i2--;
                        }
                    }
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    kliVar2 = kliVar;
                }
                kliVar = kliVar2;
                if (p03Var != null) {
                    return p03Var;
                }
                throw new oli("No TTML subtitles found");
            } catch (XmlPullParserException e3) {
                throw new oli("Unable to decode source", e3);
            }
        } catch (IOException e4) {
            e = e4;
            kliVar = kliVar2;
        }
    }
}
