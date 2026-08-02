package com.google.android.gms.internal.ads;

import android.text.Layout;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Season;
import defpackage.bm2;
import defpackage.fin;
import defpackage.gin;
import defpackage.min;
import defpackage.nin;
import defpackage.p03;
import defpackage.qjo;
import defpackage.sw9;
import defpackage.uif;
import defpackage.vp2;
import defpackage.x5n;
import defpackage.ytg;
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
public final class zzaoz implements zzanz {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final ytg i = new ytg(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public zzaoz() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            vp2.e("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0338, code lost:
    
        if (r3.equals("text") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x034c, code lost:
    
        r0 = d(r0);
        r0.m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0341, code lost:
    
        if (r3.equals("base") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x037e, code lost:
    
        r0 = d(r0);
        r0.m = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x034a, code lost:
    
        if (r3.equals("textContainer") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x037c, code lost:
    
        if (r3.equals("baseContainer") != false) goto L182;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020b A[Catch: zzanv -> 0x0273, TryCatch #0 {zzanv -> 0x0273, blocks: (B:97:0x019a, B:100:0x01b5, B:101:0x01c7, B:103:0x01cd, B:105:0x01d4, B:114:0x01ec, B:115:0x0205, B:117:0x020b, B:119:0x0213, B:122:0x0214, B:123:0x0231, B:127:0x01f7, B:132:0x0203, B:135:0x0232, B:137:0x0233, B:138:0x0250, B:140:0x01bc, B:142:0x0251, B:143:0x0272), top: B:96:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nin c(XmlPullParser xmlPullParser, nin ninVar) {
        Matcher matcher;
        String group;
        fin finVar;
        int i2;
        qjo a;
        int i3;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        nin ninVar2 = ninVar;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            String attributeName = xmlPullParser.getAttributeName(i4);
            int i5 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        ninVar2 = d(ninVar2);
                        ninVar2.i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                        continue;
                    }
                case -1289044182:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_EXTENT)) {
                        ninVar2 = d(ninVar2);
                        ninVar2.u = attributeValue;
                    } else {
                        continue;
                    }
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        ninVar2 = d(ninVar2);
                        ninVar2.a = attributeValue;
                    } else {
                        continue;
                    }
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        ninVar2 = d(ninVar2);
                        ninVar2.o = e(attributeValue);
                    } else {
                        continue;
                    }
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        ninVar2 = d(ninVar2);
                        ninVar2.t = attributeValue;
                    } else {
                        continue;
                    }
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        String a2 = zzgts.a(attributeValue);
                        switch (a2.hashCode()) {
                            case -1461280213:
                                if (a2.equals(TtmlNode.NO_UNDERLINE)) {
                                    ninVar2 = d(ninVar2);
                                    z = false;
                                    ninVar2.g = 0;
                                    break;
                                }
                                break;
                            case -1026963764:
                                if (a2.equals(TtmlNode.UNDERLINE)) {
                                    ninVar2 = d(ninVar2);
                                    ninVar2.g = 1;
                                    break;
                                }
                                break;
                            case 913457136:
                                if (a2.equals(TtmlNode.NO_LINETHROUGH)) {
                                    ninVar2 = d(ninVar2);
                                    z = false;
                                    ninVar2.f = 0;
                                    break;
                                }
                                break;
                            case 1679736913:
                                if (a2.equals(TtmlNode.LINETHROUGH)) {
                                    ninVar2 = d(ninVar2);
                                    ninVar2.f = 1;
                                    break;
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        ninVar2 = d(ninVar2);
                        ninVar2.h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        ninVar2 = d(ninVar2);
                        ninVar2.l = attributeValue;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String a3 = zzgts.a(attributeValue);
                        switch (a3.hashCode()) {
                            case -618561360:
                                break;
                            case -410956671:
                                if (a3.equals("container")) {
                                    ninVar2 = d(ninVar2);
                                    ninVar2.m = 1;
                                    break;
                                }
                                break;
                            case -250518009:
                                if (a3.equals("delimiter")) {
                                    ninVar2 = d(ninVar2);
                                    ninVar2.m = 4;
                                    break;
                                }
                                break;
                            case -136074796:
                                break;
                            case 3016401:
                                break;
                            case 3556653:
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        ninVar2 = d(ninVar2);
                        try {
                            ninVar2.b = zzds.a(attributeValue, false);
                            ninVar2.c = true;
                            break;
                        } catch (IllegalArgumentException unused) {
                            x5n.r(attributeValue, "Failed parsing color value: ");
                            break;
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        nin d2 = d(ninVar2);
                        Matcher matcher2 = e.matcher(attributeValue);
                        float f2 = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(1);
                                if (group2 == null) {
                                    throw null;
                                    break;
                                } else {
                                    f2 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group2)));
                                }
                            } catch (NumberFormatException e2) {
                                zzeh.d("Failed to parse shear: ".concat(String.valueOf(attributeValue)), e2);
                            }
                        } else {
                            x5n.r(attributeValue, "Invalid value for shear: ");
                        }
                        d2.s = f2;
                        ninVar2 = d2;
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String a4 = zzgts.a(attributeValue);
                        int hashCode = a4.hashCode();
                        if (hashCode == 96673) {
                            if (a4.equals(Season.YEAR_ALL_TIME)) {
                                ninVar2 = d(ninVar2);
                                ninVar2.q = 1;
                                break;
                            }
                        } else if (hashCode == 3387192 && a4.equals("none")) {
                            ninVar2 = d(ninVar2);
                            z = false;
                            ninVar2.q = 0;
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        try {
                            ninVar2 = d(ninVar2);
                            String str = zzfm.a;
                            String[] split = attributeValue.split("\\s+", -1);
                            int length = split.length;
                            Pattern pattern = d;
                            if (length == 1) {
                                matcher = pattern.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                    sb.append("Invalid number of entries for fontSize: ");
                                    sb.append(length);
                                    sb.append(".");
                                    throw new zzanv(sb.toString());
                                }
                                matcher = pattern.matcher(split[1]);
                                zzeh.c("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                                sb2.append("Invalid expression for fontSize: '");
                                sb2.append(attributeValue);
                                sb2.append("'.");
                                throw new zzanv(sb2.toString());
                            }
                            String group3 = matcher.group(3);
                            if (group3 == null) {
                                throw null;
                            }
                            int hashCode2 = group3.hashCode();
                            if (hashCode2 != 37) {
                                if (hashCode2 != 3240) {
                                    if (hashCode2 == 3592 && group3.equals("px")) {
                                        ninVar2.j = 1;
                                        group = matcher.group(1);
                                        if (group == null) {
                                            throw null;
                                        }
                                        ninVar2.k = Float.parseFloat(group);
                                        break;
                                    }
                                    StringBuilder sb3 = new StringBuilder(group3.length() + 30);
                                    sb3.append("Invalid unit for fontSize: '");
                                    sb3.append(group3);
                                    sb3.append("'.");
                                    throw new zzanv(sb3.toString());
                                }
                                if (!group3.equals("em")) {
                                    StringBuilder sb32 = new StringBuilder(group3.length() + 30);
                                    sb32.append("Invalid unit for fontSize: '");
                                    sb32.append(group3);
                                    sb32.append("'.");
                                    throw new zzanv(sb32.toString());
                                }
                                ninVar2.j = 2;
                                group = matcher.group(1);
                                if (group == null) {
                                }
                            } else {
                                if (!group3.equals("%")) {
                                    StringBuilder sb322 = new StringBuilder(group3.length() + 30);
                                    sb322.append("Invalid unit for fontSize: '");
                                    sb322.append(group3);
                                    sb322.append("'.");
                                    throw new zzanv(sb322.toString());
                                }
                                ninVar2.j = 3;
                                group = matcher.group(1);
                                if (group == null) {
                                }
                            }
                        } catch (zzanv unused2) {
                            x5n.r(attributeValue, "Failed parsing fontSize value: ");
                            break;
                        }
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        ninVar2 = d(ninVar2);
                        Pattern pattern2 = fin.d;
                        if (attributeValue != null) {
                            String a5 = zzgts.a(attributeValue.trim());
                            if (!a5.isEmpty()) {
                                zzgxw v = zzgxw.v(TextUtils.split(a5, fin.d));
                                String str2 = (String) zzgya.a(zzgzw.a(fin.h, v), "outside");
                                int hashCode3 = str2.hashCode();
                                if (hashCode3 != -1106037339) {
                                    if (hashCode3 == 92734940 && str2.equals("after")) {
                                        i2 = 2;
                                        a = zzgzw.a(fin.e, v);
                                        if (a.isEmpty()) {
                                            String str3 = (String) a.iterator().next();
                                            if (str3.hashCode() == 3387192 && str3.equals("none")) {
                                                i3 = 0;
                                                i5 = 0;
                                                finVar = new fin(i5, i3, i2);
                                                ninVar2.r = finVar;
                                                break;
                                            }
                                            i3 = 0;
                                            finVar = new fin(i5, i3, i2);
                                            ninVar2.r = finVar;
                                        } else {
                                            qjo a6 = zzgzw.a(fin.g, v);
                                            qjo a7 = zzgzw.a(fin.f, v);
                                            if (!a6.isEmpty() || !a7.isEmpty()) {
                                                String str4 = (String) zzgya.a(a6, "filled");
                                                i3 = (str4.hashCode() == 3417674 && str4.equals("open")) ? 2 : 1;
                                                String str5 = (String) zzgya.a(a7, "circle");
                                                int hashCode4 = str5.hashCode();
                                                if (hashCode4 != -905816648) {
                                                    if (hashCode4 == 99657 && str5.equals("dot")) {
                                                        i5 = 2;
                                                        finVar = new fin(i5, i3, i2);
                                                        ninVar2.r = finVar;
                                                    }
                                                    i5 = 1;
                                                    finVar = new fin(i5, i3, i2);
                                                    ninVar2.r = finVar;
                                                } else {
                                                    if (str5.equals("sesame")) {
                                                        i5 = 3;
                                                        finVar = new fin(i5, i3, i2);
                                                        ninVar2.r = finVar;
                                                    }
                                                    i5 = 1;
                                                    finVar = new fin(i5, i3, i2);
                                                    ninVar2.r = finVar;
                                                }
                                            }
                                            i3 = 0;
                                            finVar = new fin(i5, i3, i2);
                                            ninVar2.r = finVar;
                                        }
                                    }
                                    i2 = 1;
                                    a = zzgzw.a(fin.e, v);
                                    if (a.isEmpty()) {
                                    }
                                } else {
                                    if (str2.equals("outside")) {
                                        i2 = -2;
                                        a = zzgzw.a(fin.e, v);
                                        if (a.isEmpty()) {
                                        }
                                    }
                                    i2 = 1;
                                    a = zzgzw.a(fin.e, v);
                                    if (a.isEmpty()) {
                                    }
                                }
                            }
                        }
                        finVar = null;
                        ninVar2.r = finVar;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String a8 = zzgts.a(attributeValue);
                        int hashCode5 = a8.hashCode();
                        if (hashCode5 != -1392885889) {
                            if (hashCode5 == 92734940 && a8.equals("after")) {
                                ninVar2 = d(ninVar2);
                                ninVar2.n = 2;
                            }
                        } else if (a8.equals("before")) {
                            ninVar2 = d(ninVar2);
                            ninVar2.n = 1;
                        }
                    } else {
                        continue;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        ninVar2 = d(ninVar2);
                        try {
                            ninVar2.d = zzds.a(attributeValue, z);
                            ninVar2.e = true;
                        } catch (IllegalArgumentException unused3) {
                            x5n.r(attributeValue, "Failed parsing background value: ");
                        }
                    } else {
                        continue;
                    }
                case 1587328867:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_DISPLAY_ALIGN)) {
                        ninVar2 = d(ninVar2);
                        ninVar2.v = attributeValue;
                    } else {
                        continue;
                    }
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        ninVar2 = d(ninVar2);
                        ninVar2.p = e(attributeValue);
                    } else {
                        continue;
                    }
                default:
            }
            z = false;
        }
        return ninVar2;
    }

    public static nin d(nin ninVar) {
        return ninVar == null ? new nin() : ninVar;
    }

    public static Layout.Alignment e(String str) {
        String a = zzgts.a(str);
        switch (a.hashCode()) {
            case -1364013995:
                if (a.equals(TtmlNode.CENTER)) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!a.equals(TtmlNode.END)) {
                    return null;
                }
                break;
            case 3317767:
                if (!a.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!a.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!a.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static long f(String str, ytg ytgVar) {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d4 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d5 = d4 + parseLong3;
            return (long) ((d5 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r12) / ytgVar.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / ytgVar.b) / ytgVar.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new zzanv("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                d2 = ytgVar.a;
                parseDouble2 /= d2;
            }
            return (long) (parseDouble2 * 1000000.0d);
        }
        if (hashCode != 104) {
            if (hashCode != 109) {
                if (hashCode != 3494) {
                    if (hashCode == 115) {
                        group6.equals("s");
                    } else if (hashCode == 116 && group6.equals("t")) {
                        d2 = ytgVar.c;
                        parseDouble2 /= d2;
                    }
                } else if (group6.equals("ms")) {
                    d2 = 1000.0d;
                    parseDouble2 /= d2;
                }
            } else if (group6.equals(InneractiveMediationDefs.GENDER_MALE)) {
                d3 = 60.0d;
                parseDouble2 *= d3;
            }
        } else if (group6.equals(com.mbridge.msdk.foundation.same.report.h.b)) {
            d3 = 3600.0d;
            parseDouble2 *= d3;
        }
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void a(int i2, int i3, bm2 bm2Var, byte[] bArr) {
        zzant.a(b(i2, i3, bArr), bm2Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:235|236|237|(3:239|240|53)|293|294|(3:296|(4:298|(1:300)(1:327)|301|(1:303)(1:304))|328)(1:329)|305|(2:307|(1:309)(7:(2:311|(1:313))|314|315|316|317|318|(3:320|(1:322)|323)))|326|315|316|317|318|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0529, code lost:
    
        if (r0.equals("tblr") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0534, code lost:
    
        r41 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0532, code lost:
    
        if (r0.equals("tb") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x073c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:240:0x05ee. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0406 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TRY_LEAVE, TryCatch #2 {IOException -> 0x0091, blocks: (B:3:0x0009, B:5:0x000b, B:8:0x005d, B:10:0x006a, B:13:0x0076, B:333:0x0084, B:335:0x008c, B:336:0x0099, B:338:0x00a1, B:341:0x00b7, B:342:0x00d2, B:344:0x00dc, B:345:0x00e0, B:347:0x00ec, B:348:0x00f0, B:352:0x0185, B:17:0x01f4, B:20:0x0208, B:22:0x020e, B:24:0x0216, B:26:0x021e, B:28:0x0226, B:30:0x022e, B:32:0x0236, B:34:0x023c, B:36:0x0244, B:38:0x024c, B:40:0x0252, B:42:0x0258, B:44:0x025e, B:46:0x0266, B:49:0x026f, B:53:0x07c0, B:54:0x02a0, B:57:0x02a8, B:59:0x02b1, B:61:0x02c2, B:63:0x02cc, B:64:0x02dc, B:66:0x02e2, B:68:0x02f6, B:70:0x02fa, B:72:0x0598, B:81:0x02d3, B:83:0x0309, B:86:0x0317, B:90:0x0546, B:93:0x0336, B:95:0x033e, B:97:0x0346, B:99:0x034e, B:104:0x0360, B:108:0x0373, B:110:0x0379, B:112:0x0386, B:114:0x03ee, B:116:0x03f4, B:118:0x03fa, B:120:0x0402, B:122:0x0406, B:126:0x0415, B:128:0x041b, B:130:0x0428, B:131:0x049c, B:133:0x04a4, B:135:0x04aa, B:137:0x04b2, B:139:0x04b6, B:148:0x04f7, B:150:0x0501, B:160:0x0539, B:172:0x0433, B:175:0x0434, B:176:0x0435, B:178:0x0442, B:181:0x044a, B:184:0x0458, B:186:0x045e, B:188:0x0469, B:190:0x047c, B:192:0x047d, B:193:0x047e, B:194:0x048b, B:197:0x038f, B:199:0x0390, B:200:0x0391, B:201:0x039e, B:204:0x03a8, B:207:0x03b1, B:209:0x03b7, B:211:0x03c2, B:213:0x03d2, B:215:0x03d3, B:216:0x03d4, B:217:0x03dc, B:221:0x0559, B:223:0x0568, B:225:0x0573, B:227:0x0579, B:228:0x0585, B:237:0x05c0, B:239:0x05e2, B:244:0x05fa, B:247:0x0603, B:254:0x073d, B:266:0x062c, B:269:0x0637, B:270:0x0650, B:261:0x06c4, B:273:0x0641, B:280:0x0678, B:283:0x0690, B:286:0x06a6, B:289:0x06bc, B:296:0x06d7, B:300:0x06e3, B:303:0x06ec, B:309:0x06fe, B:311:0x0707, B:315:0x0712, B:318:0x071e, B:320:0x0723, B:322:0x0727, B:323:0x072e, B:356:0x0196, B:358:0x01a0, B:361:0x01a9, B:363:0x01af, B:365:0x01ba, B:368:0x01c4, B:370:0x01d7, B:374:0x01d1, B:377:0x01d6, B:380:0x010c, B:382:0x0118, B:385:0x0124, B:388:0x012a, B:390:0x0137, B:399:0x0156, B:403:0x015a, B:404:0x016d, B:407:0x017d, B:412:0x0177, B:415:0x017c, B:429:0x075f, B:431:0x076b, B:432:0x0772, B:436:0x0778, B:439:0x077c, B:441:0x0786, B:443:0x0790, B:444:0x0799, B:447:0x0796, B:451:0x07b1, B:456:0x07ba, B:462:0x07dd), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b6 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TRY_LEAVE, TryCatch #2 {IOException -> 0x0091, blocks: (B:3:0x0009, B:5:0x000b, B:8:0x005d, B:10:0x006a, B:13:0x0076, B:333:0x0084, B:335:0x008c, B:336:0x0099, B:338:0x00a1, B:341:0x00b7, B:342:0x00d2, B:344:0x00dc, B:345:0x00e0, B:347:0x00ec, B:348:0x00f0, B:352:0x0185, B:17:0x01f4, B:20:0x0208, B:22:0x020e, B:24:0x0216, B:26:0x021e, B:28:0x0226, B:30:0x022e, B:32:0x0236, B:34:0x023c, B:36:0x0244, B:38:0x024c, B:40:0x0252, B:42:0x0258, B:44:0x025e, B:46:0x0266, B:49:0x026f, B:53:0x07c0, B:54:0x02a0, B:57:0x02a8, B:59:0x02b1, B:61:0x02c2, B:63:0x02cc, B:64:0x02dc, B:66:0x02e2, B:68:0x02f6, B:70:0x02fa, B:72:0x0598, B:81:0x02d3, B:83:0x0309, B:86:0x0317, B:90:0x0546, B:93:0x0336, B:95:0x033e, B:97:0x0346, B:99:0x034e, B:104:0x0360, B:108:0x0373, B:110:0x0379, B:112:0x0386, B:114:0x03ee, B:116:0x03f4, B:118:0x03fa, B:120:0x0402, B:122:0x0406, B:126:0x0415, B:128:0x041b, B:130:0x0428, B:131:0x049c, B:133:0x04a4, B:135:0x04aa, B:137:0x04b2, B:139:0x04b6, B:148:0x04f7, B:150:0x0501, B:160:0x0539, B:172:0x0433, B:175:0x0434, B:176:0x0435, B:178:0x0442, B:181:0x044a, B:184:0x0458, B:186:0x045e, B:188:0x0469, B:190:0x047c, B:192:0x047d, B:193:0x047e, B:194:0x048b, B:197:0x038f, B:199:0x0390, B:200:0x0391, B:201:0x039e, B:204:0x03a8, B:207:0x03b1, B:209:0x03b7, B:211:0x03c2, B:213:0x03d2, B:215:0x03d3, B:216:0x03d4, B:217:0x03dc, B:221:0x0559, B:223:0x0568, B:225:0x0573, B:227:0x0579, B:228:0x0585, B:237:0x05c0, B:239:0x05e2, B:244:0x05fa, B:247:0x0603, B:254:0x073d, B:266:0x062c, B:269:0x0637, B:270:0x0650, B:261:0x06c4, B:273:0x0641, B:280:0x0678, B:283:0x0690, B:286:0x06a6, B:289:0x06bc, B:296:0x06d7, B:300:0x06e3, B:303:0x06ec, B:309:0x06fe, B:311:0x0707, B:315:0x0712, B:318:0x071e, B:320:0x0723, B:322:0x0727, B:323:0x072e, B:356:0x0196, B:358:0x01a0, B:361:0x01a9, B:363:0x01af, B:365:0x01ba, B:368:0x01c4, B:370:0x01d7, B:374:0x01d1, B:377:0x01d6, B:380:0x010c, B:382:0x0118, B:385:0x0124, B:388:0x012a, B:390:0x0137, B:399:0x0156, B:403:0x015a, B:404:0x016d, B:407:0x017d, B:412:0x0177, B:415:0x017c, B:429:0x075f, B:431:0x076b, B:432:0x0772, B:436:0x0778, B:439:0x077c, B:441:0x0786, B:443:0x0790, B:444:0x0799, B:447:0x0796, B:451:0x07b1, B:456:0x07ba, B:462:0x07dd), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0501 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TRY_LEAVE, TryCatch #2 {IOException -> 0x0091, blocks: (B:3:0x0009, B:5:0x000b, B:8:0x005d, B:10:0x006a, B:13:0x0076, B:333:0x0084, B:335:0x008c, B:336:0x0099, B:338:0x00a1, B:341:0x00b7, B:342:0x00d2, B:344:0x00dc, B:345:0x00e0, B:347:0x00ec, B:348:0x00f0, B:352:0x0185, B:17:0x01f4, B:20:0x0208, B:22:0x020e, B:24:0x0216, B:26:0x021e, B:28:0x0226, B:30:0x022e, B:32:0x0236, B:34:0x023c, B:36:0x0244, B:38:0x024c, B:40:0x0252, B:42:0x0258, B:44:0x025e, B:46:0x0266, B:49:0x026f, B:53:0x07c0, B:54:0x02a0, B:57:0x02a8, B:59:0x02b1, B:61:0x02c2, B:63:0x02cc, B:64:0x02dc, B:66:0x02e2, B:68:0x02f6, B:70:0x02fa, B:72:0x0598, B:81:0x02d3, B:83:0x0309, B:86:0x0317, B:90:0x0546, B:93:0x0336, B:95:0x033e, B:97:0x0346, B:99:0x034e, B:104:0x0360, B:108:0x0373, B:110:0x0379, B:112:0x0386, B:114:0x03ee, B:116:0x03f4, B:118:0x03fa, B:120:0x0402, B:122:0x0406, B:126:0x0415, B:128:0x041b, B:130:0x0428, B:131:0x049c, B:133:0x04a4, B:135:0x04aa, B:137:0x04b2, B:139:0x04b6, B:148:0x04f7, B:150:0x0501, B:160:0x0539, B:172:0x0433, B:175:0x0434, B:176:0x0435, B:178:0x0442, B:181:0x044a, B:184:0x0458, B:186:0x045e, B:188:0x0469, B:190:0x047c, B:192:0x047d, B:193:0x047e, B:194:0x048b, B:197:0x038f, B:199:0x0390, B:200:0x0391, B:201:0x039e, B:204:0x03a8, B:207:0x03b1, B:209:0x03b7, B:211:0x03c2, B:213:0x03d2, B:215:0x03d3, B:216:0x03d4, B:217:0x03dc, B:221:0x0559, B:223:0x0568, B:225:0x0573, B:227:0x0579, B:228:0x0585, B:237:0x05c0, B:239:0x05e2, B:244:0x05fa, B:247:0x0603, B:254:0x073d, B:266:0x062c, B:269:0x0637, B:270:0x0650, B:261:0x06c4, B:273:0x0641, B:280:0x0678, B:283:0x0690, B:286:0x06a6, B:289:0x06bc, B:296:0x06d7, B:300:0x06e3, B:303:0x06ec, B:309:0x06fe, B:311:0x0707, B:315:0x0712, B:318:0x071e, B:320:0x0723, B:322:0x0727, B:323:0x072e, B:356:0x0196, B:358:0x01a0, B:361:0x01a9, B:363:0x01af, B:365:0x01ba, B:368:0x01c4, B:370:0x01d7, B:374:0x01d1, B:377:0x01d6, B:380:0x010c, B:382:0x0118, B:385:0x0124, B:388:0x012a, B:390:0x0137, B:399:0x0156, B:403:0x015a, B:404:0x016d, B:407:0x017d, B:412:0x0177, B:415:0x017c, B:429:0x075f, B:431:0x076b, B:432:0x0772, B:436:0x0778, B:439:0x077c, B:441:0x0786, B:443:0x0790, B:444:0x0799, B:447:0x0796, B:451:0x07b1, B:456:0x07ba, B:462:0x07dd), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0208 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TRY_ENTER, TryCatch #2 {IOException -> 0x0091, blocks: (B:3:0x0009, B:5:0x000b, B:8:0x005d, B:10:0x006a, B:13:0x0076, B:333:0x0084, B:335:0x008c, B:336:0x0099, B:338:0x00a1, B:341:0x00b7, B:342:0x00d2, B:344:0x00dc, B:345:0x00e0, B:347:0x00ec, B:348:0x00f0, B:352:0x0185, B:17:0x01f4, B:20:0x0208, B:22:0x020e, B:24:0x0216, B:26:0x021e, B:28:0x0226, B:30:0x022e, B:32:0x0236, B:34:0x023c, B:36:0x0244, B:38:0x024c, B:40:0x0252, B:42:0x0258, B:44:0x025e, B:46:0x0266, B:49:0x026f, B:53:0x07c0, B:54:0x02a0, B:57:0x02a8, B:59:0x02b1, B:61:0x02c2, B:63:0x02cc, B:64:0x02dc, B:66:0x02e2, B:68:0x02f6, B:70:0x02fa, B:72:0x0598, B:81:0x02d3, B:83:0x0309, B:86:0x0317, B:90:0x0546, B:93:0x0336, B:95:0x033e, B:97:0x0346, B:99:0x034e, B:104:0x0360, B:108:0x0373, B:110:0x0379, B:112:0x0386, B:114:0x03ee, B:116:0x03f4, B:118:0x03fa, B:120:0x0402, B:122:0x0406, B:126:0x0415, B:128:0x041b, B:130:0x0428, B:131:0x049c, B:133:0x04a4, B:135:0x04aa, B:137:0x04b2, B:139:0x04b6, B:148:0x04f7, B:150:0x0501, B:160:0x0539, B:172:0x0433, B:175:0x0434, B:176:0x0435, B:178:0x0442, B:181:0x044a, B:184:0x0458, B:186:0x045e, B:188:0x0469, B:190:0x047c, B:192:0x047d, B:193:0x047e, B:194:0x048b, B:197:0x038f, B:199:0x0390, B:200:0x0391, B:201:0x039e, B:204:0x03a8, B:207:0x03b1, B:209:0x03b7, B:211:0x03c2, B:213:0x03d2, B:215:0x03d3, B:216:0x03d4, B:217:0x03dc, B:221:0x0559, B:223:0x0568, B:225:0x0573, B:227:0x0579, B:228:0x0585, B:237:0x05c0, B:239:0x05e2, B:244:0x05fa, B:247:0x0603, B:254:0x073d, B:266:0x062c, B:269:0x0637, B:270:0x0650, B:261:0x06c4, B:273:0x0641, B:280:0x0678, B:283:0x0690, B:286:0x06a6, B:289:0x06bc, B:296:0x06d7, B:300:0x06e3, B:303:0x06ec, B:309:0x06fe, B:311:0x0707, B:315:0x0712, B:318:0x071e, B:320:0x0723, B:322:0x0727, B:323:0x072e, B:356:0x0196, B:358:0x01a0, B:361:0x01a9, B:363:0x01af, B:365:0x01ba, B:368:0x01c4, B:370:0x01d7, B:374:0x01d1, B:377:0x01d6, B:380:0x010c, B:382:0x0118, B:385:0x0124, B:388:0x012a, B:390:0x0137, B:399:0x0156, B:403:0x015a, B:404:0x016d, B:407:0x017d, B:412:0x0177, B:415:0x017c, B:429:0x075f, B:431:0x076b, B:432:0x0772, B:436:0x0778, B:439:0x077c, B:441:0x0786, B:443:0x0790, B:444:0x0799, B:447:0x0796, B:451:0x07b1, B:456:0x07ba, B:462:0x07dd), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0723 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0616, zzanv -> 0x073c, TryCatch #2 {IOException -> 0x0091, blocks: (B:3:0x0009, B:5:0x000b, B:8:0x005d, B:10:0x006a, B:13:0x0076, B:333:0x0084, B:335:0x008c, B:336:0x0099, B:338:0x00a1, B:341:0x00b7, B:342:0x00d2, B:344:0x00dc, B:345:0x00e0, B:347:0x00ec, B:348:0x00f0, B:352:0x0185, B:17:0x01f4, B:20:0x0208, B:22:0x020e, B:24:0x0216, B:26:0x021e, B:28:0x0226, B:30:0x022e, B:32:0x0236, B:34:0x023c, B:36:0x0244, B:38:0x024c, B:40:0x0252, B:42:0x0258, B:44:0x025e, B:46:0x0266, B:49:0x026f, B:53:0x07c0, B:54:0x02a0, B:57:0x02a8, B:59:0x02b1, B:61:0x02c2, B:63:0x02cc, B:64:0x02dc, B:66:0x02e2, B:68:0x02f6, B:70:0x02fa, B:72:0x0598, B:81:0x02d3, B:83:0x0309, B:86:0x0317, B:90:0x0546, B:93:0x0336, B:95:0x033e, B:97:0x0346, B:99:0x034e, B:104:0x0360, B:108:0x0373, B:110:0x0379, B:112:0x0386, B:114:0x03ee, B:116:0x03f4, B:118:0x03fa, B:120:0x0402, B:122:0x0406, B:126:0x0415, B:128:0x041b, B:130:0x0428, B:131:0x049c, B:133:0x04a4, B:135:0x04aa, B:137:0x04b2, B:139:0x04b6, B:148:0x04f7, B:150:0x0501, B:160:0x0539, B:172:0x0433, B:175:0x0434, B:176:0x0435, B:178:0x0442, B:181:0x044a, B:184:0x0458, B:186:0x045e, B:188:0x0469, B:190:0x047c, B:192:0x047d, B:193:0x047e, B:194:0x048b, B:197:0x038f, B:199:0x0390, B:200:0x0391, B:201:0x039e, B:204:0x03a8, B:207:0x03b1, B:209:0x03b7, B:211:0x03c2, B:213:0x03d2, B:215:0x03d3, B:216:0x03d4, B:217:0x03dc, B:221:0x0559, B:223:0x0568, B:225:0x0573, B:227:0x0579, B:228:0x0585, B:237:0x05c0, B:239:0x05e2, B:244:0x05fa, B:247:0x0603, B:254:0x073d, B:266:0x062c, B:269:0x0637, B:270:0x0650, B:261:0x06c4, B:273:0x0641, B:280:0x0678, B:283:0x0690, B:286:0x06a6, B:289:0x06bc, B:296:0x06d7, B:300:0x06e3, B:303:0x06ec, B:309:0x06fe, B:311:0x0707, B:315:0x0712, B:318:0x071e, B:320:0x0723, B:322:0x0727, B:323:0x072e, B:356:0x0196, B:358:0x01a0, B:361:0x01a9, B:363:0x01af, B:365:0x01ba, B:368:0x01c4, B:370:0x01d7, B:374:0x01d1, B:377:0x01d6, B:380:0x010c, B:382:0x0118, B:385:0x0124, B:388:0x012a, B:390:0x0137, B:399:0x0156, B:403:0x015a, B:404:0x016d, B:407:0x017d, B:412:0x0177, B:415:0x017c, B:429:0x075f, B:431:0x076b, B:432:0x0772, B:436:0x0778, B:439:0x077c, B:441:0x0786, B:443:0x0790, B:444:0x0799, B:447:0x0796, B:451:0x07b1, B:456:0x07ba, B:462:0x07dd), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0196 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, blocks: (B:3:0x0009, B:5:0x000b, B:8:0x005d, B:10:0x006a, B:13:0x0076, B:333:0x0084, B:335:0x008c, B:336:0x0099, B:338:0x00a1, B:341:0x00b7, B:342:0x00d2, B:344:0x00dc, B:345:0x00e0, B:347:0x00ec, B:348:0x00f0, B:352:0x0185, B:17:0x01f4, B:20:0x0208, B:22:0x020e, B:24:0x0216, B:26:0x021e, B:28:0x0226, B:30:0x022e, B:32:0x0236, B:34:0x023c, B:36:0x0244, B:38:0x024c, B:40:0x0252, B:42:0x0258, B:44:0x025e, B:46:0x0266, B:49:0x026f, B:53:0x07c0, B:54:0x02a0, B:57:0x02a8, B:59:0x02b1, B:61:0x02c2, B:63:0x02cc, B:64:0x02dc, B:66:0x02e2, B:68:0x02f6, B:70:0x02fa, B:72:0x0598, B:81:0x02d3, B:83:0x0309, B:86:0x0317, B:90:0x0546, B:93:0x0336, B:95:0x033e, B:97:0x0346, B:99:0x034e, B:104:0x0360, B:108:0x0373, B:110:0x0379, B:112:0x0386, B:114:0x03ee, B:116:0x03f4, B:118:0x03fa, B:120:0x0402, B:122:0x0406, B:126:0x0415, B:128:0x041b, B:130:0x0428, B:131:0x049c, B:133:0x04a4, B:135:0x04aa, B:137:0x04b2, B:139:0x04b6, B:148:0x04f7, B:150:0x0501, B:160:0x0539, B:172:0x0433, B:175:0x0434, B:176:0x0435, B:178:0x0442, B:181:0x044a, B:184:0x0458, B:186:0x045e, B:188:0x0469, B:190:0x047c, B:192:0x047d, B:193:0x047e, B:194:0x048b, B:197:0x038f, B:199:0x0390, B:200:0x0391, B:201:0x039e, B:204:0x03a8, B:207:0x03b1, B:209:0x03b7, B:211:0x03c2, B:213:0x03d2, B:215:0x03d3, B:216:0x03d4, B:217:0x03dc, B:221:0x0559, B:223:0x0568, B:225:0x0573, B:227:0x0579, B:228:0x0585, B:237:0x05c0, B:239:0x05e2, B:244:0x05fa, B:247:0x0603, B:254:0x073d, B:266:0x062c, B:269:0x0637, B:270:0x0650, B:261:0x06c4, B:273:0x0641, B:280:0x0678, B:283:0x0690, B:286:0x06a6, B:289:0x06bc, B:296:0x06d7, B:300:0x06e3, B:303:0x06ec, B:309:0x06fe, B:311:0x0707, B:315:0x0712, B:318:0x071e, B:320:0x0723, B:322:0x0727, B:323:0x072e, B:356:0x0196, B:358:0x01a0, B:361:0x01a9, B:363:0x01af, B:365:0x01ba, B:368:0x01c4, B:370:0x01d7, B:374:0x01d1, B:377:0x01d6, B:380:0x010c, B:382:0x0118, B:385:0x0124, B:388:0x012a, B:390:0x0137, B:399:0x0156, B:403:0x015a, B:404:0x016d, B:407:0x017d, B:412:0x0177, B:415:0x017c, B:429:0x075f, B:431:0x076b, B:432:0x0772, B:436:0x0778, B:439:0x077c, B:441:0x0786, B:443:0x0790, B:444:0x0799, B:447:0x0796, B:451:0x07b1, B:456:0x07ba, B:462:0x07dd), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a8 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, LOOP:1: B:57:0x02a8->B:74:0x05a4, LOOP_START, PHI: r1 r2 r3 r4 r7 r8 r9 r12 r15 r46
      0x02a8: PHI (r1v12 java.lang.String) = (r1v9 java.lang.String), (r1v41 java.lang.String) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r2v34 int) = (r2v16 int), (r2v73 int) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r3v21 java.lang.String) = (r3v1 java.lang.String), (r3v42 java.lang.String) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r4v12 java.lang.String) = (r4v9 java.lang.String), (r4v19 java.lang.String) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r7v26 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v46 java.util.HashMap) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r8v6 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v9 java.util.HashMap) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r9v30 java.lang.String) = (r9v27 java.lang.String), (r9v44 java.lang.String) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r12v7 java.lang.String) = (r12v3 java.lang.String), (r12v9 java.lang.String) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r15v49 java.lang.String) = (r15v34 java.lang.String), (r15v54 java.lang.String) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r46v2 int) = (r46v1 int), (r46v4 int) binds: [B:56:0x02a6, B:74:0x05a4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {IOException -> 0x0091, blocks: (B:3:0x0009, B:5:0x000b, B:8:0x005d, B:10:0x006a, B:13:0x0076, B:333:0x0084, B:335:0x008c, B:336:0x0099, B:338:0x00a1, B:341:0x00b7, B:342:0x00d2, B:344:0x00dc, B:345:0x00e0, B:347:0x00ec, B:348:0x00f0, B:352:0x0185, B:17:0x01f4, B:20:0x0208, B:22:0x020e, B:24:0x0216, B:26:0x021e, B:28:0x0226, B:30:0x022e, B:32:0x0236, B:34:0x023c, B:36:0x0244, B:38:0x024c, B:40:0x0252, B:42:0x0258, B:44:0x025e, B:46:0x0266, B:49:0x026f, B:53:0x07c0, B:54:0x02a0, B:57:0x02a8, B:59:0x02b1, B:61:0x02c2, B:63:0x02cc, B:64:0x02dc, B:66:0x02e2, B:68:0x02f6, B:70:0x02fa, B:72:0x0598, B:81:0x02d3, B:83:0x0309, B:86:0x0317, B:90:0x0546, B:93:0x0336, B:95:0x033e, B:97:0x0346, B:99:0x034e, B:104:0x0360, B:108:0x0373, B:110:0x0379, B:112:0x0386, B:114:0x03ee, B:116:0x03f4, B:118:0x03fa, B:120:0x0402, B:122:0x0406, B:126:0x0415, B:128:0x041b, B:130:0x0428, B:131:0x049c, B:133:0x04a4, B:135:0x04aa, B:137:0x04b2, B:139:0x04b6, B:148:0x04f7, B:150:0x0501, B:160:0x0539, B:172:0x0433, B:175:0x0434, B:176:0x0435, B:178:0x0442, B:181:0x044a, B:184:0x0458, B:186:0x045e, B:188:0x0469, B:190:0x047c, B:192:0x047d, B:193:0x047e, B:194:0x048b, B:197:0x038f, B:199:0x0390, B:200:0x0391, B:201:0x039e, B:204:0x03a8, B:207:0x03b1, B:209:0x03b7, B:211:0x03c2, B:213:0x03d2, B:215:0x03d3, B:216:0x03d4, B:217:0x03dc, B:221:0x0559, B:223:0x0568, B:225:0x0573, B:227:0x0579, B:228:0x0585, B:237:0x05c0, B:239:0x05e2, B:244:0x05fa, B:247:0x0603, B:254:0x073d, B:266:0x062c, B:269:0x0637, B:270:0x0650, B:261:0x06c4, B:273:0x0641, B:280:0x0678, B:283:0x0690, B:286:0x06a6, B:289:0x06bc, B:296:0x06d7, B:300:0x06e3, B:303:0x06ec, B:309:0x06fe, B:311:0x0707, B:315:0x0712, B:318:0x071e, B:320:0x0723, B:322:0x0727, B:323:0x072e, B:356:0x0196, B:358:0x01a0, B:361:0x01a9, B:363:0x01af, B:365:0x01ba, B:368:0x01c4, B:370:0x01d7, B:374:0x01d1, B:377:0x01d6, B:380:0x010c, B:382:0x0118, B:385:0x0124, B:388:0x012a, B:390:0x0137, B:399:0x0156, B:403:0x015a, B:404:0x016d, B:407:0x017d, B:412:0x0177, B:415:0x017c, B:429:0x075f, B:431:0x076b, B:432:0x0772, B:436:0x0778, B:439:0x077c, B:441:0x0786, B:443:0x0790, B:444:0x0799, B:447:0x0796, B:451:0x07b1, B:456:0x07ba, B:462:0x07dd), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v33 */
    /* JADX WARN: Type inference failed for: r17v35 */
    /* JADX WARN: Type inference failed for: r17v36 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p03 b(int i2, int i3, byte[] bArr) {
        p03 p03Var;
        String str;
        String str2;
        String str3;
        HashMap hashMap;
        ArrayDeque arrayDeque;
        ytg ytgVar;
        p03 p03Var2;
        int i4;
        ytg ytgVar2;
        HashMap hashMap2;
        int i5;
        ArrayDeque arrayDeque2;
        float f2;
        String group;
        boolean z;
        int i6;
        ytg ytgVar3;
        String c2;
        int i7;
        uif uifVar;
        String group2;
        int i8;
        ytg ytgVar4;
        ytg ytgVar5;
        boolean equals;
        ytg ytgVar6;
        boolean equals2;
        int i9;
        ytg ytgVar7;
        int attributeCount;
        nin c3;
        String str4;
        long j;
        int i10;
        long j2;
        long j3;
        String[] strArr;
        String str5;
        gin ginVar;
        gin ginVar2;
        long j4;
        long j5;
        String str6;
        Object obj;
        String[] split;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String c4;
        String str12;
        String str13;
        String str14;
        int i11;
        HashMap hashMap3;
        String str15;
        float f3;
        float f4;
        min minVar;
        String c5;
        float f5;
        float f6;
        String c6;
        float f7;
        int i12;
        String c7;
        int i13;
        String c8;
        nin ninVar;
        String c9;
        nin ninVar2;
        float f8;
        nin ninVar3;
        String str16;
        String[] split2;
        String str17 = "";
        String str18 = "http://www.w3.org/ns/ttml#parameter";
        String str19 = "Ignoring unsupported tag: ";
        try {
            try {
                try {
                    XmlPullParser newPullParser = this.a.newPullParser();
                    HashMap hashMap4 = new HashMap();
                    HashMap hashMap5 = new HashMap();
                    HashMap hashMap6 = new HashMap();
                    hashMap5.put("", new min("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                    newPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
                    ArrayDeque arrayDeque3 = new ArrayDeque();
                    int eventType = newPullParser.getEventType();
                    ytg ytgVar8 = i;
                    p03 p03Var3 = null;
                    uif uifVar2 = null;
                    nin ninVar4 = 0;
                    ytg ytgVar9 = ytgVar8;
                    int i14 = 0;
                    ?? r17 = 15;
                    while (eventType != 1) {
                        int i15 = 0;
                        gin ginVar3 = (gin) arrayDeque3.peek();
                        if (i14 == 0) {
                            String name = newPullParser.getName();
                            str = str17;
                            if (eventType == 2) {
                                boolean equals3 = TtmlNode.TAG_TT.equals(name);
                                p03Var2 = p03Var3;
                                Pattern pattern = g;
                                if (equals3) {
                                    try {
                                        String attributeValue = newPullParser.getAttributeValue(str18, "frameRate");
                                        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                                        String attributeValue2 = newPullParser.getAttributeValue(str18, "frameRateMultiplier");
                                        if (attributeValue2 != null) {
                                            i4 = i14;
                                            String str20 = zzfm.a;
                                            arrayDeque2 = arrayDeque3;
                                            zzguk.b("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
                                            f2 = Integer.parseInt(r14[0]) / Integer.parseInt(r14[1]);
                                        } else {
                                            arrayDeque2 = arrayDeque3;
                                            i4 = i14;
                                            f2 = 1.0f;
                                        }
                                        int i16 = ytgVar8.b;
                                        String attributeValue3 = newPullParser.getAttributeValue(str18, "subFrameRate");
                                        if (attributeValue3 != null) {
                                            i16 = Integer.parseInt(attributeValue3);
                                        }
                                        int i17 = ytgVar8.c;
                                        float f9 = f2;
                                        String attributeValue4 = newPullParser.getAttributeValue(str18, "tickRate");
                                        if (attributeValue4 != null) {
                                            i17 = Integer.parseInt(attributeValue4);
                                        }
                                        ytg ytgVar10 = new ytg(parseInt * f9, i16, i17);
                                        String attributeValue5 = newPullParser.getAttributeValue(str18, "cellResolution");
                                        if (attributeValue5 != null) {
                                            Matcher matcher = h.matcher(attributeValue5);
                                            if (matcher.matches()) {
                                                str2 = str18;
                                                try {
                                                    group = matcher.group(1);
                                                    try {
                                                    } catch (NumberFormatException unused) {
                                                        zzeh.c("Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                        ytgVar5 = r17;
                                                        i6 = 15;
                                                        ytgVar3 = ytgVar5;
                                                        c2 = zzfv.c(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                        if (c2 != null) {
                                                        }
                                                        i7 = i6;
                                                        uifVar = ninVar4;
                                                        i8 = i7;
                                                        ytgVar4 = ytgVar3;
                                                        equals = name.equals(TtmlNode.TAG_TT);
                                                        String str21 = "image";
                                                        String str22 = TtmlNode.TAG_METADATA;
                                                        String str23 = TtmlNode.TAG_REGION;
                                                        String str24 = "head";
                                                        ytgVar6 = ytgVar4;
                                                        if (!equals) {
                                                            String name2 = newPullParser.getName();
                                                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                                            sb.append(str19);
                                                            sb.append(name2);
                                                            zzeh.b(sb.toString());
                                                            r17 = i8;
                                                            str3 = str19;
                                                            hashMap = hashMap5;
                                                            hashMap2 = hashMap6;
                                                            ytgVar9 = ytgVar6;
                                                            p03Var3 = p03Var2;
                                                            arrayDeque = arrayDeque2;
                                                            uifVar2 = uifVar;
                                                            i14 = 1;
                                                            newPullParser.next();
                                                            eventType = newPullParser.getEventType();
                                                            hashMap6 = hashMap2;
                                                            str17 = str;
                                                            str18 = str2;
                                                            ytgVar8 = ytgVar;
                                                            str19 = str3;
                                                            ninVar4 = 0;
                                                            arrayDeque3 = arrayDeque;
                                                            hashMap5 = hashMap;
                                                            r17 = r17;
                                                        }
                                                        equals2 = "head".equals(name);
                                                        String str25 = "\\s+";
                                                        if (equals2) {
                                                        }
                                                        i5 = i9;
                                                        ytgVar9 = ytgVar7;
                                                        uifVar2 = uifVar;
                                                        p03Var3 = p03Var2;
                                                        r17 = i5;
                                                        i14 = i4;
                                                        newPullParser.next();
                                                        eventType = newPullParser.getEventType();
                                                        hashMap6 = hashMap2;
                                                        str17 = str;
                                                        str18 = str2;
                                                        ytgVar8 = ytgVar;
                                                        str19 = str3;
                                                        ninVar4 = 0;
                                                        arrayDeque3 = arrayDeque;
                                                        hashMap5 = hashMap;
                                                        r17 = r17;
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    r17 = ytgVar10;
                                                }
                                                if (group == null) {
                                                    throw ninVar4;
                                                }
                                                int parseInt2 = Integer.parseInt(group);
                                                String group3 = matcher.group(2);
                                                if (group3 == null) {
                                                    throw ninVar4;
                                                }
                                                int parseInt3 = Integer.parseInt(group3);
                                                if (parseInt2 == 0) {
                                                    z = false;
                                                    i6 = parseInt3;
                                                } else if (parseInt3 != 0) {
                                                    i6 = parseInt3;
                                                    z = true;
                                                } else {
                                                    i6 = 0;
                                                    z = false;
                                                }
                                                if (z) {
                                                    ytgVar3 = ytgVar10;
                                                    ytgVar = ytgVar8;
                                                    c2 = zzfv.c(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                    if (c2 != null) {
                                                        Matcher matcher2 = pattern.matcher(c2);
                                                        if (matcher2.matches()) {
                                                            try {
                                                                group2 = matcher2.group(1);
                                                            } catch (NumberFormatException unused3) {
                                                                i7 = i6;
                                                            }
                                                            if (group2 == null) {
                                                                throw ninVar4;
                                                            }
                                                            int parseInt4 = Integer.parseInt(group2);
                                                            String group4 = matcher2.group(2);
                                                            if (group4 == null) {
                                                                throw ninVar4;
                                                            }
                                                            i7 = i6;
                                                            try {
                                                                uifVar = new uif(parseInt4, Integer.parseInt(group4), 15);
                                                            } catch (NumberFormatException unused4) {
                                                                zzeh.c("Ignoring malformed tts extent: ".concat(c2));
                                                                uifVar = ninVar4;
                                                                i8 = i7;
                                                                ytgVar4 = ytgVar3;
                                                                equals = name.equals(TtmlNode.TAG_TT);
                                                                String str212 = "image";
                                                                String str222 = TtmlNode.TAG_METADATA;
                                                                String str232 = TtmlNode.TAG_REGION;
                                                                String str242 = "head";
                                                                ytgVar6 = ytgVar4;
                                                                if (!equals) {
                                                                }
                                                                equals2 = "head".equals(name);
                                                                String str252 = "\\s+";
                                                                if (equals2) {
                                                                }
                                                                i5 = i9;
                                                                ytgVar9 = ytgVar7;
                                                                uifVar2 = uifVar;
                                                                p03Var3 = p03Var2;
                                                                r17 = i5;
                                                                i14 = i4;
                                                                newPullParser.next();
                                                                eventType = newPullParser.getEventType();
                                                                hashMap6 = hashMap2;
                                                                str17 = str;
                                                                str18 = str2;
                                                                ytgVar8 = ytgVar;
                                                                str19 = str3;
                                                                ninVar4 = 0;
                                                                arrayDeque3 = arrayDeque;
                                                                hashMap5 = hashMap;
                                                                r17 = r17;
                                                            }
                                                            i8 = i7;
                                                            ytgVar4 = ytgVar3;
                                                        } else {
                                                            zzeh.c("Ignoring non-pixel tts extent: ".concat(c2));
                                                        }
                                                    }
                                                    i7 = i6;
                                                    uifVar = ninVar4;
                                                    i8 = i7;
                                                    ytgVar4 = ytgVar3;
                                                } else {
                                                    r17 = ytgVar10;
                                                    try {
                                                        throw new IllegalArgumentException(zzgvb.a("Invalid cell resolution %s %s", Integer.valueOf(parseInt2), Integer.valueOf(i6)));
                                                    } catch (NumberFormatException unused5) {
                                                        ytgVar = ytgVar8;
                                                        zzeh.c("Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                        ytgVar5 = r17;
                                                        i6 = 15;
                                                        ytgVar3 = ytgVar5;
                                                        c2 = zzfv.c(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                        if (c2 != null) {
                                                        }
                                                        i7 = i6;
                                                        uifVar = ninVar4;
                                                        i8 = i7;
                                                        ytgVar4 = ytgVar3;
                                                        equals = name.equals(TtmlNode.TAG_TT);
                                                        String str2122 = "image";
                                                        String str2222 = TtmlNode.TAG_METADATA;
                                                        String str2322 = TtmlNode.TAG_REGION;
                                                        String str2422 = "head";
                                                        ytgVar6 = ytgVar4;
                                                        if (!equals) {
                                                        }
                                                        equals2 = "head".equals(name);
                                                        String str2522 = "\\s+";
                                                        if (equals2) {
                                                        }
                                                        i5 = i9;
                                                        ytgVar9 = ytgVar7;
                                                        uifVar2 = uifVar;
                                                        p03Var3 = p03Var2;
                                                        r17 = i5;
                                                        i14 = i4;
                                                        newPullParser.next();
                                                        eventType = newPullParser.getEventType();
                                                        hashMap6 = hashMap2;
                                                        str17 = str;
                                                        str18 = str2;
                                                        ytgVar8 = ytgVar;
                                                        str19 = str3;
                                                        ninVar4 = 0;
                                                        arrayDeque3 = arrayDeque;
                                                        hashMap5 = hashMap;
                                                        r17 = r17;
                                                    }
                                                }
                                            } else {
                                                zzeh.c("Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            }
                                        }
                                        str2 = str18;
                                        ytgVar5 = ytgVar10;
                                        ytgVar = ytgVar8;
                                        i6 = 15;
                                        ytgVar3 = ytgVar5;
                                        c2 = zzfv.c(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                        if (c2 != null) {
                                        }
                                        i7 = i6;
                                        uifVar = ninVar4;
                                        i8 = i7;
                                        ytgVar4 = ytgVar3;
                                    } catch (XmlPullParserException e2) {
                                        e = e2;
                                        p03Var = ninVar4;
                                        sw9.m("Unable to decode source", e);
                                        return p03Var;
                                    }
                                } else {
                                    str2 = str18;
                                    arrayDeque2 = arrayDeque3;
                                    ytgVar = ytgVar8;
                                    i4 = i14;
                                    ytgVar4 = ytgVar9;
                                    uifVar = uifVar2;
                                    i8 = r17 == true ? 1 : 0;
                                }
                                equals = name.equals(TtmlNode.TAG_TT);
                                String str21222 = "image";
                                String str22222 = TtmlNode.TAG_METADATA;
                                String str23222 = TtmlNode.TAG_REGION;
                                String str24222 = "head";
                                ytgVar6 = ytgVar4;
                                if (!equals && !name.equals("head") && !name.equals("body") && !name.equals(TtmlNode.TAG_DIV) && !name.equals(TtmlNode.TAG_P) && !name.equals(TtmlNode.TAG_SPAN) && !name.equals(TtmlNode.TAG_BR) && !name.equals(TtmlNode.TAG_STYLE) && !name.equals(TtmlNode.TAG_STYLING) && !name.equals(TtmlNode.TAG_LAYOUT) && !name.equals(TtmlNode.TAG_REGION) && !name.equals(TtmlNode.TAG_METADATA) && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                                    String name22 = newPullParser.getName();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(name22).length() + 26);
                                    sb2.append(str19);
                                    sb2.append(name22);
                                    zzeh.b(sb2.toString());
                                    r17 = i8;
                                    str3 = str19;
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    ytgVar9 = ytgVar6;
                                    p03Var3 = p03Var2;
                                    arrayDeque = arrayDeque2;
                                    uifVar2 = uifVar;
                                    i14 = 1;
                                    newPullParser.next();
                                    eventType = newPullParser.getEventType();
                                    hashMap6 = hashMap2;
                                    str17 = str;
                                    str18 = str2;
                                    ytgVar8 = ytgVar;
                                    str19 = str3;
                                    ninVar4 = 0;
                                    arrayDeque3 = arrayDeque;
                                    hashMap5 = hashMap;
                                    r17 = r17;
                                }
                                equals2 = "head".equals(name);
                                String str25222 = "\\s+";
                                if (equals2) {
                                    i9 = i8;
                                    str3 = str19;
                                    String str26 = "\\s+";
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    Object obj2 = TtmlNode.TAG_REGION;
                                    try {
                                        attributeCount = newPullParser.getAttributeCount();
                                        c3 = c(newPullParser, ninVar4);
                                        str4 = str;
                                        j = C.TIME_UNSET;
                                        i10 = 0;
                                        j2 = C.TIME_UNSET;
                                        j3 = C.TIME_UNSET;
                                        strArr = null;
                                        str5 = null;
                                    } catch (zzanv e3) {
                                        e = e3;
                                    }
                                    while (i10 < attributeCount) {
                                        String attributeName = newPullParser.getAttributeName(i10);
                                        String attributeValue6 = newPullParser.getAttributeValue(i10);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                ytgVar7 = ytgVar6;
                                                str6 = str26;
                                                obj = obj2;
                                                if (attributeName.equals(obj) && hashMap.containsKey(attributeValue6)) {
                                                    str4 = attributeValue6;
                                                }
                                                try {
                                                    i10++;
                                                    str26 = str6;
                                                    ytgVar6 = ytgVar7;
                                                    obj2 = obj;
                                                } catch (zzanv e4) {
                                                    e = e4;
                                                    arrayDeque = arrayDeque2;
                                                    zzeh.d("Suppressing parser error", e);
                                                    r17 = i9;
                                                    ytgVar9 = ytgVar7;
                                                    uifVar2 = uifVar;
                                                    p03Var3 = p03Var2;
                                                    i14 = 1;
                                                    newPullParser.next();
                                                    eventType = newPullParser.getEventType();
                                                    hashMap6 = hashMap2;
                                                    str17 = str;
                                                    str18 = str2;
                                                    ytgVar8 = ytgVar;
                                                    str19 = str3;
                                                    ninVar4 = 0;
                                                    arrayDeque3 = arrayDeque;
                                                    hashMap5 = hashMap;
                                                    r17 = r17;
                                                }
                                                break;
                                            case 99841:
                                                ytgVar7 = ytgVar6;
                                                str6 = str26;
                                                if (attributeName.equals("dur")) {
                                                    j3 = f(attributeValue6, ytgVar7);
                                                }
                                                obj = obj2;
                                                i10++;
                                                str26 = str6;
                                                ytgVar6 = ytgVar7;
                                                obj2 = obj;
                                            case 100571:
                                                ytgVar7 = ytgVar6;
                                                str6 = str26;
                                                if (attributeName.equals(TtmlNode.END)) {
                                                    j = f(attributeValue6, ytgVar7);
                                                }
                                                obj = obj2;
                                                i10++;
                                                str26 = str6;
                                                ytgVar6 = ytgVar7;
                                                obj2 = obj;
                                            case 93616297:
                                                str6 = str26;
                                                if (attributeName.equals("begin")) {
                                                    ytgVar7 = ytgVar6;
                                                    j2 = f(attributeValue6, ytgVar7);
                                                    obj = obj2;
                                                    i10++;
                                                    str26 = str6;
                                                    ytgVar6 = ytgVar7;
                                                    obj2 = obj;
                                                }
                                                ytgVar7 = ytgVar6;
                                                obj = obj2;
                                                i10++;
                                                str26 = str6;
                                                ytgVar6 = ytgVar7;
                                                obj2 = obj;
                                            case 109780401:
                                                if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                                                    try {
                                                        String trim = attributeValue6.trim();
                                                        if (trim.isEmpty()) {
                                                            split = new String[0];
                                                            str6 = str26;
                                                        } else {
                                                            String str27 = zzfm.a;
                                                            str6 = str26;
                                                            split = trim.split(str6, -1);
                                                        }
                                                        if (split.length > 0) {
                                                            strArr = split;
                                                        }
                                                    } catch (zzanv e5) {
                                                        e = e5;
                                                        ytgVar7 = ytgVar6;
                                                        arrayDeque = arrayDeque2;
                                                        zzeh.d("Suppressing parser error", e);
                                                        r17 = i9;
                                                        ytgVar9 = ytgVar7;
                                                        uifVar2 = uifVar;
                                                        p03Var3 = p03Var2;
                                                        i14 = 1;
                                                        newPullParser.next();
                                                        eventType = newPullParser.getEventType();
                                                        hashMap6 = hashMap2;
                                                        str17 = str;
                                                        str18 = str2;
                                                        ytgVar8 = ytgVar;
                                                        str19 = str3;
                                                        ninVar4 = 0;
                                                        arrayDeque3 = arrayDeque;
                                                        hashMap5 = hashMap;
                                                        r17 = r17;
                                                    }
                                                } else {
                                                    str6 = str26;
                                                }
                                                ytgVar7 = ytgVar6;
                                                obj = obj2;
                                                i10++;
                                                str26 = str6;
                                                ytgVar6 = ytgVar7;
                                                obj2 = obj;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            str5 = attributeValue6.substring(1);
                                                        }
                                                    } catch (zzanv e6) {
                                                        e = e6;
                                                        ytgVar7 = ytgVar6;
                                                        arrayDeque = arrayDeque2;
                                                        zzeh.d("Suppressing parser error", e);
                                                        r17 = i9;
                                                        ytgVar9 = ytgVar7;
                                                        uifVar2 = uifVar;
                                                        p03Var3 = p03Var2;
                                                        i14 = 1;
                                                        newPullParser.next();
                                                        eventType = newPullParser.getEventType();
                                                        hashMap6 = hashMap2;
                                                        str17 = str;
                                                        str18 = str2;
                                                        ytgVar8 = ytgVar;
                                                        str19 = str3;
                                                        ninVar4 = 0;
                                                        arrayDeque3 = arrayDeque;
                                                        hashMap5 = hashMap;
                                                        r17 = r17;
                                                    }
                                                }
                                            default:
                                                ytgVar7 = ytgVar6;
                                                str6 = str26;
                                                obj = obj2;
                                                i10++;
                                                str26 = str6;
                                                ytgVar6 = ytgVar7;
                                                obj2 = obj;
                                        }
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        hashMap6 = hashMap2;
                                        str17 = str;
                                        str18 = str2;
                                        ytgVar8 = ytgVar;
                                        str19 = str3;
                                        ninVar4 = 0;
                                        arrayDeque3 = arrayDeque;
                                        hashMap5 = hashMap;
                                        r17 = r17;
                                    }
                                    ytgVar7 = ytgVar6;
                                    if (ginVar3 != null) {
                                        ginVar = ginVar3;
                                        long j6 = ginVar.d;
                                        if (j6 != C.TIME_UNSET) {
                                            j2 = j2 != C.TIME_UNSET ? j2 + j6 : -9223372036854775807L;
                                            if (j != C.TIME_UNSET) {
                                                j += j6;
                                            } else {
                                                ginVar2 = ginVar;
                                                j = -9223372036854775807L;
                                            }
                                        }
                                        ginVar2 = ginVar;
                                    } else {
                                        ginVar = ginVar3;
                                        ginVar2 = null;
                                    }
                                    if (j == C.TIME_UNSET) {
                                        if (j3 != C.TIME_UNSET) {
                                            j = j2 + j3;
                                        } else {
                                            if (ginVar2 != null) {
                                                j = ginVar2.e;
                                                if (j != C.TIME_UNSET) {
                                                }
                                            }
                                            j5 = j2;
                                            j4 = -9223372036854775807L;
                                            gin b2 = gin.b(newPullParser.getName(), j5, j4, c3, strArr, str4, str5, ginVar2);
                                            arrayDeque = arrayDeque2;
                                            arrayDeque.push(b2);
                                            if (ginVar != null) {
                                                ArrayList arrayList = ginVar.m;
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                    ginVar.m = arrayList;
                                                }
                                                arrayList.add(b2);
                                            }
                                        }
                                    }
                                    j4 = j;
                                    j5 = j2;
                                    gin b22 = gin.b(newPullParser.getName(), j5, j4, c3, strArr, str4, str5, ginVar2);
                                    arrayDeque = arrayDeque2;
                                    arrayDeque.push(b22);
                                    if (ginVar != null) {
                                    }
                                } else {
                                    while (true) {
                                        newPullParser.next();
                                        if (zzfv.b(newPullParser, TtmlNode.TAG_STYLE)) {
                                            String c10 = zzfv.c(newPullParser, TtmlNode.TAG_STYLE);
                                            str3 = str19;
                                            nin c11 = c(newPullParser, new nin());
                                            if (c10 != null) {
                                                String trim2 = c10.trim();
                                                if (trim2.isEmpty()) {
                                                    str16 = str24222;
                                                    split2 = new String[i15];
                                                } else {
                                                    str16 = str24222;
                                                    String str28 = zzfm.a;
                                                    split2 = trim2.split(str25222, -1);
                                                }
                                                int length = split2.length;
                                                str7 = str25222;
                                                int i18 = 0;
                                                while (i18 < length) {
                                                    int i19 = i18;
                                                    c11.a((nin) hashMap4.get(split2[i19]));
                                                    i18 = i19 + 1;
                                                }
                                            } else {
                                                str7 = str25222;
                                                str16 = str24222;
                                            }
                                            String str29 = c11.l;
                                            if (str29 != null) {
                                                hashMap4.put(str29, c11);
                                            }
                                            int i20 = i8;
                                            str10 = str21222;
                                            i9 = i20;
                                            hashMap = hashMap5;
                                            str8 = str22222;
                                            str9 = str23222;
                                            str11 = str16;
                                            hashMap2 = hashMap6;
                                        } else {
                                            str3 = str19;
                                            str7 = str25222;
                                            String str30 = str24222;
                                            if (zzfv.b(newPullParser, str23222)) {
                                                str9 = str23222;
                                                HashMap hashMap7 = hashMap6;
                                                String c12 = zzfv.c(newPullParser, "id");
                                                if (c12 == null) {
                                                    str14 = str21222;
                                                    i9 = i8;
                                                    hashMap3 = hashMap5;
                                                    str15 = str22222;
                                                    minVar = ninVar4;
                                                } else {
                                                    String c13 = zzfv.c(newPullParser, "origin");
                                                    if (c13 == null) {
                                                        str12 = c13;
                                                        String c14 = zzfv.c(newPullParser, TtmlNode.TAG_STYLE);
                                                        if (c14 != null && (ninVar3 = (nin) hashMap4.get(c14)) != null) {
                                                            str13 = ninVar3.t;
                                                            str14 = str21222;
                                                            Pattern pattern2 = f;
                                                            if (str13 == null) {
                                                                str15 = str22222;
                                                                Matcher matcher3 = pattern2.matcher(str13);
                                                                hashMap3 = hashMap5;
                                                                Matcher matcher4 = pattern.matcher(str13);
                                                                if (matcher3.matches()) {
                                                                    i11 = i8;
                                                                    try {
                                                                        String group5 = matcher3.group(1);
                                                                        if (group5 == null) {
                                                                            throw ninVar4;
                                                                        }
                                                                        f8 = Float.parseFloat(group5) / 100.0f;
                                                                        String group6 = matcher3.group(2);
                                                                        if (group6 == null) {
                                                                            throw ninVar4;
                                                                        }
                                                                        f3 = Float.parseFloat(group6) / 100.0f;
                                                                    } catch (NumberFormatException unused6) {
                                                                        zzeh.c("Ignoring region with malformed origin: ".concat(str13));
                                                                    }
                                                                } else {
                                                                    i11 = i8;
                                                                    if (!matcher4.matches()) {
                                                                        zzeh.c("Ignoring region with unsupported origin: ".concat(str13));
                                                                    } else if (uifVar == null) {
                                                                        zzeh.c("Ignoring region with missing tts:extent: ".concat(str13));
                                                                    } else {
                                                                        try {
                                                                            String group7 = matcher4.group(1);
                                                                            if (group7 == null) {
                                                                                throw ninVar4;
                                                                            }
                                                                            int parseInt5 = Integer.parseInt(group7);
                                                                            String group8 = matcher4.group(2);
                                                                            if (group8 == null) {
                                                                                throw ninVar4;
                                                                            }
                                                                            f8 = parseInt5 / uifVar.b;
                                                                            f3 = Integer.parseInt(group8) / uifVar.c;
                                                                        } catch (NumberFormatException unused7) {
                                                                            zzeh.c("Ignoring region with malformed origin: ".concat(str13));
                                                                        }
                                                                    }
                                                                    minVar = ninVar4;
                                                                    i9 = i11;
                                                                }
                                                                f4 = f8;
                                                            } else {
                                                                i11 = i8;
                                                                hashMap3 = hashMap5;
                                                                str15 = str22222;
                                                                f3 = 0.0f;
                                                                f4 = 0.0f;
                                                            }
                                                            c5 = zzfv.c(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                            if (c5 == null && (c9 = zzfv.c(newPullParser, TtmlNode.TAG_STYLE)) != null && (ninVar2 = (nin) hashMap4.get(c9)) != null) {
                                                                c5 = ninVar2.u;
                                                            }
                                                            if (c5 == null) {
                                                                Matcher matcher5 = pattern2.matcher(c5);
                                                                Matcher matcher6 = pattern.matcher(c5);
                                                                if (matcher5.matches()) {
                                                                    try {
                                                                        String group9 = matcher5.group(1);
                                                                        if (group9 == null) {
                                                                            throw ninVar4;
                                                                        }
                                                                        float parseFloat = Float.parseFloat(group9) / 100.0f;
                                                                        String group10 = matcher5.group(2);
                                                                        if (group10 == null) {
                                                                            throw ninVar4;
                                                                        }
                                                                        f6 = Float.parseFloat(group10) / 100.0f;
                                                                        f5 = parseFloat;
                                                                    } catch (NumberFormatException unused8) {
                                                                        zzeh.c("Ignoring region with malformed extent: ".concat(String.valueOf(str13)));
                                                                    }
                                                                } else {
                                                                    if (!matcher6.matches()) {
                                                                        zzeh.c("Ignoring region with unsupported extent: ".concat(String.valueOf(str13)));
                                                                    } else if (uifVar == null) {
                                                                        zzeh.c("Ignoring region with missing tts:extent: ".concat(String.valueOf(str13)));
                                                                    } else {
                                                                        try {
                                                                            String group11 = matcher6.group(1);
                                                                            if (group11 == null) {
                                                                                throw ninVar4;
                                                                            }
                                                                            int parseInt6 = Integer.parseInt(group11);
                                                                            String group12 = matcher6.group(2);
                                                                            if (group12 == null) {
                                                                                throw ninVar4;
                                                                            }
                                                                            f5 = parseInt6 / uifVar.b;
                                                                            f6 = Integer.parseInt(group12) / uifVar.c;
                                                                        } catch (NumberFormatException unused9) {
                                                                            zzeh.c("Ignoring region with malformed extent: ".concat(String.valueOf(str13)));
                                                                        }
                                                                    }
                                                                    minVar = ninVar4;
                                                                    i9 = i11;
                                                                }
                                                            } else {
                                                                f5 = 1.0f;
                                                                f6 = 1.0f;
                                                            }
                                                            c6 = zzfv.c(newPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                            if (c6 == null && (c8 = zzfv.c(newPullParser, TtmlNode.TAG_STYLE)) != null && (ninVar = (nin) hashMap4.get(c8)) != null) {
                                                                c6 = ninVar.v;
                                                            }
                                                            if (c6 != null) {
                                                                String a = zzgts.a(c6);
                                                                int hashCode = a.hashCode();
                                                                if (hashCode != -1364013995) {
                                                                    if (hashCode == 92734940 && a.equals("after")) {
                                                                        f7 = f3 + f6;
                                                                        i9 = i11;
                                                                        i12 = 2;
                                                                        float f10 = 1.0f / i9;
                                                                        c7 = zzfv.c(newPullParser, "writingMode");
                                                                        if (c7 != null) {
                                                                            String a2 = zzgts.a(c7);
                                                                            int hashCode2 = a2.hashCode();
                                                                            if (hashCode2 != 3694) {
                                                                                if (hashCode2 != 3553396) {
                                                                                    if (hashCode2 == 3553576 && a2.equals("tbrl")) {
                                                                                        i13 = 1;
                                                                                    }
                                                                                }
                                                                            }
                                                                            minVar = new min(c12, f4, f7, 0, i12, f5, f6, 1, f10, i13);
                                                                        }
                                                                        i13 = Integer.MIN_VALUE;
                                                                        minVar = new min(c12, f4, f7, 0, i12, f5, f6, 1, f10, i13);
                                                                    }
                                                                } else if (a.equals(TtmlNode.CENTER)) {
                                                                    f7 = f3 + (f6 / 2.0f);
                                                                    i9 = i11;
                                                                    i12 = 1;
                                                                    float f102 = 1.0f / i9;
                                                                    c7 = zzfv.c(newPullParser, "writingMode");
                                                                    if (c7 != null) {
                                                                    }
                                                                    i13 = Integer.MIN_VALUE;
                                                                    minVar = new min(c12, f4, f7, 0, i12, f5, f6, 1, f102, i13);
                                                                }
                                                            }
                                                            f7 = f3;
                                                            i9 = i11;
                                                            i12 = 0;
                                                            float f1022 = 1.0f / i9;
                                                            c7 = zzfv.c(newPullParser, "writingMode");
                                                            if (c7 != null) {
                                                            }
                                                            i13 = Integer.MIN_VALUE;
                                                            minVar = new min(c12, f4, f7, 0, i12, f5, f6, 1, f1022, i13);
                                                        }
                                                    } else {
                                                        str12 = c13;
                                                    }
                                                    str13 = str12;
                                                    str14 = str21222;
                                                    Pattern pattern22 = f;
                                                    if (str13 == null) {
                                                    }
                                                    c5 = zzfv.c(newPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                    if (c5 == null) {
                                                        c5 = ninVar2.u;
                                                    }
                                                    if (c5 == null) {
                                                    }
                                                    c6 = zzfv.c(newPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                    if (c6 == null) {
                                                        c6 = ninVar.v;
                                                    }
                                                    if (c6 != null) {
                                                    }
                                                    f7 = f3;
                                                    i9 = i11;
                                                    i12 = 0;
                                                    float f10222 = 1.0f / i9;
                                                    c7 = zzfv.c(newPullParser, "writingMode");
                                                    if (c7 != null) {
                                                    }
                                                    i13 = Integer.MIN_VALUE;
                                                    minVar = new min(c12, f4, f7, 0, i12, f5, f6, 1, f10222, i13);
                                                }
                                                if (minVar != null) {
                                                    hashMap = hashMap3;
                                                    hashMap.put(minVar.a, minVar);
                                                } else {
                                                    hashMap = hashMap3;
                                                }
                                                str11 = str30;
                                                hashMap2 = hashMap7;
                                                str10 = str14;
                                                str8 = str15;
                                            } else {
                                                String str31 = str21222;
                                                i9 = i8;
                                                hashMap = hashMap5;
                                                HashMap hashMap8 = hashMap6;
                                                str8 = str22222;
                                                str9 = str23222;
                                                if (zzfv.b(newPullParser, str8)) {
                                                    while (true) {
                                                        newPullParser.next();
                                                        str10 = str31;
                                                        if (!zzfv.b(newPullParser, str10) || (c4 = zzfv.c(newPullParser, "id")) == null) {
                                                            hashMap2 = hashMap8;
                                                        } else {
                                                            hashMap2 = hashMap8;
                                                            hashMap2.put(c4, newPullParser.nextText());
                                                        }
                                                        if (!zzfv.a(newPullParser, str8)) {
                                                            str31 = str10;
                                                            hashMap8 = hashMap2;
                                                        }
                                                    }
                                                } else {
                                                    hashMap2 = hashMap8;
                                                    str10 = str31;
                                                }
                                                str11 = str30;
                                            }
                                        }
                                        if (zzfv.a(newPullParser, str11)) {
                                            ytgVar7 = ytgVar6;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            String str32 = str10;
                                            i8 = i9;
                                            str21222 = str32;
                                            str24222 = str11;
                                            hashMap5 = hashMap;
                                            hashMap6 = hashMap2;
                                            str19 = str3;
                                            str25222 = str7;
                                            str23222 = str9;
                                            i15 = 0;
                                            str22222 = str8;
                                        }
                                    }
                                }
                                i5 = i9;
                                ytgVar9 = ytgVar7;
                                uifVar2 = uifVar;
                            } else {
                                str2 = str18;
                                str3 = str19;
                                hashMap = hashMap5;
                                arrayDeque = arrayDeque3;
                                ytgVar = ytgVar8;
                                p03Var2 = p03Var3;
                                i4 = i14;
                                ytgVar2 = ytgVar9;
                                hashMap2 = hashMap6;
                                if (eventType == 4) {
                                    if (ginVar3 == null) {
                                        throw null;
                                    }
                                    gin a3 = gin.a(newPullParser.getText());
                                    ArrayList arrayList2 = ginVar3.m;
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        ginVar3.m = arrayList2;
                                    }
                                    arrayList2.add(a3);
                                } else if (eventType == 3) {
                                    if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                        gin ginVar4 = (gin) arrayDeque.peek();
                                        if (ginVar4 == null) {
                                            throw null;
                                        }
                                        p03Var3 = new p03(ginVar4, hashMap4, hashMap, hashMap2);
                                    } else {
                                        p03Var3 = p03Var2;
                                    }
                                    arrayDeque.pop();
                                    ytgVar9 = ytgVar2;
                                    r17 = r17;
                                    i14 = i4;
                                    newPullParser.next();
                                    eventType = newPullParser.getEventType();
                                    hashMap6 = hashMap2;
                                    str17 = str;
                                    str18 = str2;
                                    ytgVar8 = ytgVar;
                                    str19 = str3;
                                    ninVar4 = 0;
                                    arrayDeque3 = arrayDeque;
                                    hashMap5 = hashMap;
                                    r17 = r17;
                                }
                                ytgVar9 = ytgVar2;
                                i5 = r17;
                            }
                        } else {
                            str = str17;
                            str2 = str18;
                            str3 = str19;
                            hashMap = hashMap5;
                            arrayDeque = arrayDeque3;
                            ytgVar = ytgVar8;
                            p03Var2 = p03Var3;
                            i4 = i14;
                            ytgVar2 = ytgVar9;
                            hashMap2 = hashMap6;
                            if (eventType == 2) {
                                i14 = i4 + 1;
                            } else {
                                if (eventType == 3) {
                                    i14 = i4 - 1;
                                }
                                ytgVar9 = ytgVar2;
                                i5 = r17;
                            }
                            ytgVar9 = ytgVar2;
                            p03Var3 = p03Var2;
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            hashMap6 = hashMap2;
                            str17 = str;
                            str18 = str2;
                            ytgVar8 = ytgVar;
                            str19 = str3;
                            ninVar4 = 0;
                            arrayDeque3 = arrayDeque;
                            hashMap5 = hashMap;
                            r17 = r17;
                        }
                        p03Var3 = p03Var2;
                        r17 = i5;
                        i14 = i4;
                        newPullParser.next();
                        eventType = newPullParser.getEventType();
                        hashMap6 = hashMap2;
                        str17 = str;
                        str18 = str2;
                        ytgVar8 = ytgVar;
                        str19 = str3;
                        ninVar4 = 0;
                        arrayDeque3 = arrayDeque;
                        hashMap5 = hashMap;
                        r17 = r17;
                    }
                    p03 p03Var4 = p03Var3;
                    if (p03Var4 != null) {
                        return p03Var4;
                    }
                    throw null;
                } catch (XmlPullParserException e7) {
                    e = e7;
                    p03Var = null;
                }
            } catch (IOException e8) {
                sw9.m("Unexpected error when reading input.", e8);
                return null;
            }
        } catch (XmlPullParserException e9) {
            e = e9;
            p03Var = null;
        }
    }
}
