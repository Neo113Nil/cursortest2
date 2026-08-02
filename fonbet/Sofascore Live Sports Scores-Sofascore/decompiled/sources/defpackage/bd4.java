package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.L6;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bd4 extends DefaultHandler implements w9e {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public bd4() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            vp2.e("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = nik.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new g1h(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r13.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
    
        if (r13 < 33) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(XmlPullParser xmlPullParser, String str) {
        char c2;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 5;
        char c3 = 4;
        int i2 = 0;
        int i3 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -2060825028:
                if (attributeValue.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 7;
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
            case 5:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, U3.i.X);
                parseInt = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (parseInt > 0) {
                    break;
                }
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, U3.i.X);
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int parseInt2 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & parseInt2) == 0) {
                        parseInt = 0;
                        while (true) {
                            int[] iArr = e;
                            if (i2 >= iArr.length) {
                                break;
                            } else {
                                parseInt += ((parseInt2 >> i2) & 1) * iArr[i2];
                                i2++;
                            }
                        }
                    } else {
                        String[] f0 = nik.f0(str);
                        if (f0.length != 0) {
                            List e2 = a02.c('.').e(rz8.W(f0[0].trim()));
                            if (e2.size() == 4 && ((String) e2.get(0)).equals("ac-4")) {
                                String str2 = (String) e2.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i3 = 21;
                                        break;
                                    }
                                } else {
                                    i3 = 18;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, U3.i.X);
                if (attributeValue4 != null) {
                    i3 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case 3:
            case 7:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, U3.i.X);
                if (attributeValue5 != null) {
                    String W = rz8.W(attributeValue5);
                    W.getClass();
                    switch (W.hashCode()) {
                        case 1596796:
                            if (W.equals("4000")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2937391:
                            if (W.equals("a000")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094034:
                            if (W.equals("f800")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094035:
                            if (W.equals("f801")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 3:
                            i = 6;
                            break;
                        case 4:
                            i = 8;
                            break;
                    }
                    i3 = i;
                    break;
                }
                i = -1;
                i3 = i;
            case 4:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, U3.i.X);
                int parseInt3 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (parseInt3 >= 0) {
                    int[] iArr2 = f;
                    if (parseInt3 < iArr2.length) {
                        i3 = iArr2[parseInt3];
                        break;
                    }
                }
                break;
            case 6:
                String attributeValue7 = xmlPullParser.getAttributeValue(null, U3.i.X);
                if (attributeValue7 != null) {
                    parseInt = Integer.bitCount(Integer.parseInt(attributeValue7, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!ufa.x(xmlPullParser, "AudioChannelConfiguration"));
        return i3;
    }

    public static long f(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList g(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!ufa.x(xmlPullParser, "BaseURL"));
        if (str != null && tba.E(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return w3a.K(new o71(str, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            o71 o71Var = (o71) arrayList.get(i);
            String K = tba.K(o71Var.a, str);
            String str2 = attributeValue3 == null ? K : attributeValue3;
            if (z) {
                parseInt = o71Var.c;
                parseInt2 = o71Var.d;
                str2 = o71Var.b;
            }
            arrayList2.add(new o71(K, str2, parseInt, parseInt2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair h(XmlPullParser xmlPullParser) {
        String str;
        ?? r6;
        String str2;
        String str3;
        ?? r7;
        char c2;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String W = rz8.W(attributeValue);
            W.getClass();
            switch (W.hashCode()) {
                case -1980789791:
                    if (W.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 489446379:
                    if (W.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 755418770:
                    if (W.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812765994:
                    if (W.equals("urn:mpeg:dash:mp4protection:2011")) {
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
                    r6 = yc2.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 1:
                    r6 = yc2.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 2:
                    r6 = yc2.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, U3.i.X);
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i2 = 0; i2 < split.length; i2++) {
                            uuidArr[i2] = UUID.fromString(split[i2]);
                        }
                        r6 = yc2.b;
                        str3 = null;
                        r7 = d2a.q(r6, uuidArr, null);
                        break;
                    } else {
                        tgj.d0("Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r6 = null;
                        str2 = r6;
                        str3 = str2;
                        r7 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!ufa.A(xmlPullParser, "clearkey:Laurl") || ufa.A(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r7 = r7;
                } else if (ufa.A(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r7 = r7;
                } else {
                    if (r7 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            axn z = d2a.z(decode);
                            UUID uuid = z == null ? null : (UUID) z.b;
                            if (uuid == null) {
                                tgj.d0("Skipping malformed cenc:pssh data");
                                r6 = uuid;
                                r7 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r7 = decode;
                                r6 = uuid2;
                            }
                        }
                    }
                    if (r7 == 0) {
                        ?? r9 = yc2.e;
                        if (r9.equals(r6) && ufa.A(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r7 = d2a.q(r9, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r7 = r7;
                }
            } while (!ufa.x(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r6 != null ? new DrmInitData.SchemeData(r6, str3, MimeTypes.VIDEO_MP4, r7) : null);
        }
        str = null;
        r6 = null;
        str2 = r6;
        str3 = str2;
        r7 = str2;
        do {
            xmlPullParser.next();
            if (ufa.A(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r7 = r7;
        } while (!ufa.x(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r6 != null ? new DrmInitData.SchemeData(r6, str3, MimeTypes.VIDEO_MP4, r7) : null);
    }

    public static int i(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static cy4 j(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, U3.i.X);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!ufa.x(xmlPullParser, str));
        return new cy4(attributeValue, attributeValue2, str2);
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = nik.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float l(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x10b6 A[LOOP:5: B:182:0x0411->B:192:0x10b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0f36 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0d5d A[LOOP:11: B:354:0x072b->B:364:0x0d5d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x09b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0ab6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x14b9 A[LOOP:1: B:35:0x00cd->B:43:0x14b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x1485 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a52  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zc4 m(XmlPullParser xmlPullParser, Uri uri) {
        int i;
        boolean z;
        int i2;
        ArrayList arrayList;
        boolean z2;
        long j;
        long j2;
        int i3;
        ArrayList arrayList2;
        long j3;
        ArrayList arrayList3;
        long j4;
        String str;
        ArrayList arrayList4;
        String str2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str3;
        String str4;
        String str5;
        long j5;
        long j6;
        ArrayList arrayList7;
        String str6;
        long j7;
        ByteArrayOutputStream byteArrayOutputStream;
        String str7;
        String str8;
        long j8;
        String str9;
        String str10;
        long j9;
        ByteArrayOutputStream byteArrayOutputStream2;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        String str11;
        String str12;
        long j10;
        long j11;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        ArrayList arrayList13;
        String str19;
        ArrayList arrayList14;
        long j12;
        long j13;
        String str20;
        long j14;
        long j15;
        String str21;
        int i4;
        String str22;
        ArrayList arrayList15;
        ArrayList arrayList16;
        long j16;
        ArrayList arrayList17;
        String str23;
        long j17;
        int i5;
        String str24;
        long j18;
        String str25;
        ArrayList arrayList18;
        String str26;
        String str27;
        int parseInt;
        String str28;
        float f2;
        int parseInt2;
        int i6;
        ArrayList arrayList19;
        String str29;
        String str30;
        float f3;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str31;
        ArrayList arrayList22;
        int i7;
        String str32;
        String str33;
        String str34;
        int i8;
        ArrayList arrayList23;
        int i9;
        String str35;
        String str36;
        String str37;
        ArrayList arrayList24;
        long j19;
        long j20;
        String str38;
        String str39;
        String str40;
        String str41;
        ArrayList arrayList25;
        long j21;
        ArrayList arrayList26;
        String str42;
        String str43;
        int i10;
        String str44;
        String str45;
        ArrayList arrayList27;
        String str46;
        String str47;
        w13 w13Var;
        int i11;
        String str48;
        Pair pair;
        int parseInt3;
        String str49;
        int i12;
        int i13;
        String str50;
        ArrayList arrayList28;
        ArrayList arrayList29;
        Object mzfVar;
        String str51;
        String str52;
        int i14 = 0;
        String[] strArr = new String[0];
        String str53 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        }
        int length = strArr.length;
        int i15 = 0;
        while (true) {
            i = 1;
            if (i15 >= length) {
                z = false;
                break;
            }
            if (strArr[i15].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i15++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j22 = C.TIME_UNSET;
        long W = attributeValue2 == null ? -9223372036854775807L : nik.W(attributeValue2);
        long k = k(xmlPullParser, "mediaPresentationDuration", C.TIME_UNSET);
        long k2 = k(xmlPullParser, "minBufferTime", C.TIME_UNSET);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long k3 = equals ? k(xmlPullParser, "minimumUpdatePeriod", C.TIME_UNSET) : -9223372036854775807L;
        long k4 = equals ? k(xmlPullParser, "timeShiftBufferDepth", C.TIME_UNSET) : -9223372036854775807L;
        long k5 = equals ? k(xmlPullParser, "suggestedPresentationDelay", C.TIME_UNSET) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long W2 = attributeValue3 == null ? -9223372036854775807L : nik.W(attributeValue3);
        long j23 = equals ? 0L : -9223372036854775807L;
        ArrayList K = w3a.K(new o71(uri.toString(), uri.toString(), z ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList30 = new ArrayList();
        ArrayList arrayList31 = new ArrayList();
        long j24 = equals ? -9223372036854775807L : 0L;
        int i16 = 0;
        int i17 = 0;
        acf acfVar = null;
        tm0 tm0Var = null;
        Uri uri2 = null;
        s5c s5cVar = null;
        while (true) {
            xmlPullParser.next();
            String str54 = "BaseURL";
            if (ufa.A(xmlPullParser, "BaseURL")) {
                if (i16 == 0) {
                    j23 = f(xmlPullParser, j23);
                    i16 = i;
                }
                arrayList31.addAll(g(xmlPullParser, K, z));
                arrayList = K;
                j = j22;
                arrayList2 = arrayList31;
                z2 = z;
                i3 = i14;
                i2 = i;
                arrayList3 = arrayList30;
            } else {
                i2 = i;
                boolean A = ufa.A(xmlPullParser, "ProgramInformation");
                long j25 = j22;
                String str55 = L6.q;
                if (A) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str53, "moreInformationURL");
                    String str56 = attributeValue4 == null ? str53 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str53, L6.q);
                    String str57 = attributeValue5 == null ? str53 : attributeValue5;
                    String str58 = str53;
                    String str59 = str58;
                    String str60 = str59;
                    while (true) {
                        xmlPullParser.next();
                        if (ufa.A(xmlPullParser, "Title")) {
                            str58 = xmlPullParser.nextText();
                        } else if (ufa.A(xmlPullParser, "Source")) {
                            str59 = xmlPullParser.nextText();
                        } else if (ufa.A(xmlPullParser, "Copyright")) {
                            str60 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str61 = str58;
                        String str62 = str59;
                        String str63 = str60;
                        if (ufa.x(xmlPullParser, "ProgramInformation")) {
                            acf acfVar2 = new acf(str61, str62, str63, str56, str57);
                            arrayList = K;
                            arrayList2 = arrayList31;
                            z2 = z;
                            arrayList3 = arrayList30;
                            j = j25;
                            acfVar = acfVar2;
                        } else {
                            str58 = str61;
                            str59 = str62;
                            str60 = str63;
                        }
                    }
                } else {
                    String str64 = "schemeIdUri";
                    if (ufa.A(xmlPullParser, "UTCTiming")) {
                        arrayList = K;
                        arrayList2 = arrayList31;
                        tm0Var = new tm0(xmlPullParser.getAttributeValue(str53, "schemeIdUri"), xmlPullParser.getAttributeValue(str53, U3.i.X), 4, (byte) 0);
                        z2 = z;
                        i3 = 0;
                        arrayList3 = arrayList30;
                        j = j25;
                    } else if (ufa.A(xmlPullParser, "Location")) {
                        uri2 = tba.L(uri.toString(), xmlPullParser.nextText());
                        arrayList = K;
                        arrayList2 = arrayList31;
                        z2 = z;
                        arrayList3 = arrayList30;
                        j = j25;
                    } else {
                        if (ufa.A(xmlPullParser, "ServiceDescription")) {
                            long j26 = j25;
                            long j27 = j26;
                            long j28 = j27;
                            float f4 = -3.4028235E38f;
                            float f5 = -3.4028235E38f;
                            while (true) {
                                xmlPullParser.next();
                                if (ufa.A(xmlPullParser, "Latency")) {
                                    arrayList = K;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j26 = attributeValue6 == null ? j25 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j27 = attributeValue7 == null ? j25 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, InneractiveMediationNameConsts.MAX);
                                    j28 = attributeValue8 == null ? j25 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = K;
                                    if (ufa.A(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f4 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, InneractiveMediationNameConsts.MAX);
                                        f5 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j29 = j26;
                                long j30 = j23;
                                long j31 = j27;
                                long j32 = k4;
                                long j33 = j28;
                                if (ufa.x(xmlPullParser, "ServiceDescription")) {
                                    s5c s5cVar2 = new s5c();
                                    s5cVar2.a = j29;
                                    s5cVar2.b = j31;
                                    s5cVar2.c = j33;
                                    s5cVar2.d = f4;
                                    s5cVar2.e = f5;
                                    s5cVar = s5cVar2;
                                    z2 = z;
                                    j = j25;
                                    j23 = j30;
                                    j2 = j32;
                                    i3 = 0;
                                    arrayList2 = arrayList31;
                                    arrayList3 = arrayList30;
                                } else {
                                    j28 = j33;
                                    k4 = j32;
                                    K = arrayList;
                                    j27 = j31;
                                    j23 = j30;
                                    j26 = j29;
                                }
                            }
                        } else {
                            arrayList = K;
                            long j34 = j23;
                            long j35 = k4;
                            if (ufa.A(xmlPullParser, "Period") && i17 == 0) {
                                ArrayList arrayList32 = !arrayList31.isEmpty() ? arrayList31 : arrayList;
                                String str65 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long k6 = k(xmlPullParser, "start", j24);
                                long j36 = W != j25 ? W + k6 : j25;
                                String str66 = IronSourceConstants.EVENTS_DURATION;
                                long j37 = j36;
                                long k7 = k(xmlPullParser, IronSourceConstants.EVENTS_DURATION, j25);
                                ArrayList arrayList33 = new ArrayList();
                                ArrayList arrayList34 = new ArrayList();
                                ArrayList arrayList35 = new ArrayList();
                                long j38 = j25;
                                String str67 = "Period";
                                String str68 = U3.i.X;
                                long j39 = j34;
                                int i18 = 0;
                                i1h i1hVar = null;
                                while (true) {
                                    xmlPullParser.next();
                                    if (ufa.A(xmlPullParser, str54)) {
                                        if (i18 == 0) {
                                            j39 = f(xmlPullParser, j39);
                                            i18 = i2;
                                        }
                                        arrayList35.addAll(g(xmlPullParser, arrayList32, z));
                                        arrayList4 = arrayList32;
                                        str4 = str55;
                                        str5 = str65;
                                        str2 = str54;
                                        str3 = str66;
                                        arrayList5 = arrayList35;
                                        z2 = z;
                                        str = str64;
                                        j6 = k7;
                                        j2 = j35;
                                        j5 = j37;
                                        arrayList7 = arrayList33;
                                        arrayList6 = arrayList34;
                                        str6 = str67;
                                        i3 = 0;
                                        j = C.TIME_UNSET;
                                        arrayList2 = arrayList31;
                                        j3 = j24;
                                        j4 = j34;
                                    } else {
                                        long j40 = j39;
                                        str = str64;
                                        if (ufa.A(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList35.isEmpty()) {
                                                arrayList8 = arrayList32;
                                                arrayList4 = arrayList8;
                                            } else {
                                                arrayList4 = arrayList32;
                                                arrayList8 = arrayList35;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str65);
                                            long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int i19 = i(xmlPullParser);
                                            String str69 = "SegmentTemplate";
                                            String str70 = "mimeType";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            String str71 = "AdaptationSet";
                                            ArrayList arrayList36 = arrayList31;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            long j41 = j24;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            String str72 = str66;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt4 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            arrayList5 = arrayList35;
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt5 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            float l = l(xmlPullParser, -1.0f);
                                            String str73 = "SegmentList";
                                            String str74 = "SegmentBase";
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt6 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, str55);
                                            String str75 = "audioSamplingRate";
                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList37 = new ArrayList();
                                            String str76 = attributeValue21;
                                            ArrayList arrayList38 = new ArrayList();
                                            ArrayList arrayList39 = arrayList37;
                                            ArrayList arrayList40 = new ArrayList();
                                            ArrayList arrayList41 = new ArrayList();
                                            float f6 = l;
                                            ArrayList arrayList42 = new ArrayList();
                                            String str77 = "height";
                                            ArrayList arrayList43 = new ArrayList();
                                            String str78 = "width";
                                            ArrayList arrayList44 = new ArrayList();
                                            String str79 = "scte214:supplementalProfiles";
                                            ArrayList arrayList45 = new ArrayList();
                                            ArrayList arrayList46 = new ArrayList();
                                            String str80 = "codecs";
                                            String str81 = "scte214:supplementalCodecs";
                                            ArrayList arrayList47 = arrayList44;
                                            ArrayList arrayList48 = arrayList42;
                                            i1h i1hVar2 = i1hVar;
                                            long j42 = j38;
                                            long j43 = j40;
                                            int i20 = i19;
                                            String str82 = attributeValue20;
                                            int i21 = 0;
                                            String str83 = null;
                                            int i22 = -1;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (ufa.A(xmlPullParser, str54)) {
                                                    if (i21 == 0) {
                                                        j43 = f(xmlPullParser, j43);
                                                        i21 = i2;
                                                    }
                                                    arrayList46.addAll(g(xmlPullParser, arrayList8, z));
                                                    str5 = str65;
                                                    str2 = str54;
                                                    z2 = z;
                                                    arrayList12 = arrayList41;
                                                    str12 = str70;
                                                    j10 = k7;
                                                    j11 = j37;
                                                    arrayList7 = arrayList33;
                                                    arrayList6 = arrayList34;
                                                    j3 = j41;
                                                    str14 = str72;
                                                    str20 = str73;
                                                    str22 = str74;
                                                    str15 = str78;
                                                    str16 = str79;
                                                    arrayList15 = arrayList45;
                                                    str17 = str81;
                                                    str18 = str80;
                                                    arrayList14 = arrayList48;
                                                    j43 = j43;
                                                    i3 = 0;
                                                    arrayList13 = arrayList43;
                                                    arrayList9 = arrayList8;
                                                    str19 = attributeValue14;
                                                    arrayList10 = arrayList46;
                                                    arrayList11 = arrayList38;
                                                    str21 = str69;
                                                    str24 = str71;
                                                    arrayList16 = arrayList40;
                                                } else {
                                                    arrayList9 = arrayList8;
                                                    if (ufa.A(xmlPullParser, "ContentProtection")) {
                                                        Pair h = h(xmlPullParser);
                                                        arrayList10 = arrayList46;
                                                        Object obj = h.first;
                                                        if (obj != null) {
                                                            str83 = (String) obj;
                                                        }
                                                        Object obj2 = h.second;
                                                        if (obj2 != null) {
                                                            arrayList38.add((DrmInitData.SchemeData) obj2);
                                                        }
                                                    } else {
                                                        arrayList10 = arrayList46;
                                                        if (ufa.A(xmlPullParser, "ContentComponent")) {
                                                            String attributeValue22 = xmlPullParser.getAttributeValue(null, str55);
                                                            if (str82 == null) {
                                                                str82 = attributeValue22;
                                                            } else if (attributeValue22 != null) {
                                                                z1a.E(str82.equals(attributeValue22));
                                                            }
                                                            int i23 = i(xmlPullParser);
                                                            if (i20 == -1) {
                                                                i20 = i23;
                                                            } else if (i23 != -1) {
                                                                z1a.E(i20 == i23 ? i2 : 0);
                                                            }
                                                        } else {
                                                            if (ufa.A(xmlPullParser, "Role")) {
                                                                ArrayList arrayList49 = arrayList48;
                                                                arrayList49.add(j(xmlPullParser, "Role"));
                                                                str5 = str65;
                                                                str11 = str82;
                                                                i4 = i20;
                                                                str2 = str54;
                                                                z2 = z;
                                                                arrayList12 = arrayList41;
                                                                arrayList11 = arrayList38;
                                                                str12 = str70;
                                                                j10 = k7;
                                                                j11 = j37;
                                                                arrayList7 = arrayList33;
                                                                arrayList6 = arrayList34;
                                                                str21 = str69;
                                                                str13 = str71;
                                                                j3 = j41;
                                                                str14 = str72;
                                                                str20 = str73;
                                                                str22 = str74;
                                                                arrayList16 = arrayList40;
                                                                str15 = str78;
                                                                str16 = str79;
                                                                arrayList15 = arrayList45;
                                                                str17 = str81;
                                                                str18 = str80;
                                                                j15 = j42;
                                                                i3 = 0;
                                                                arrayList13 = arrayList43;
                                                                str19 = attributeValue14;
                                                                arrayList14 = arrayList49;
                                                                j14 = j43;
                                                                str23 = str55;
                                                                arrayList17 = arrayList39;
                                                            } else {
                                                                ArrayList arrayList50 = arrayList48;
                                                                arrayList11 = arrayList38;
                                                                String str84 = "AudioChannelConfiguration";
                                                                if (ufa.A(xmlPullParser, "AudioChannelConfiguration")) {
                                                                    str5 = str65;
                                                                    i22 = d(xmlPullParser, attributeValue14);
                                                                    str2 = str54;
                                                                    z2 = z;
                                                                    arrayList12 = arrayList41;
                                                                    str12 = str70;
                                                                    j10 = k7;
                                                                    j11 = j37;
                                                                    arrayList7 = arrayList33;
                                                                    arrayList6 = arrayList34;
                                                                    str21 = str69;
                                                                    j3 = j41;
                                                                    str14 = str72;
                                                                    str20 = str73;
                                                                    str22 = str74;
                                                                    arrayList16 = arrayList40;
                                                                    str15 = str78;
                                                                    str16 = str79;
                                                                    arrayList15 = arrayList45;
                                                                    str17 = str81;
                                                                    str18 = str80;
                                                                    i3 = 0;
                                                                    arrayList13 = arrayList43;
                                                                    str19 = attributeValue14;
                                                                    arrayList14 = arrayList50;
                                                                    str24 = str71;
                                                                } else {
                                                                    String str85 = str55;
                                                                    if (ufa.A(xmlPullParser, "Accessibility")) {
                                                                        arrayList41.add(j(xmlPullParser, "Accessibility"));
                                                                    } else if (ufa.A(xmlPullParser, "EssentialProperty")) {
                                                                        arrayList43.add(j(xmlPullParser, "EssentialProperty"));
                                                                    } else {
                                                                        arrayList12 = arrayList41;
                                                                        if (ufa.A(xmlPullParser, "SupplementalProperty")) {
                                                                            arrayList47.add(j(xmlPullParser, "SupplementalProperty"));
                                                                            str5 = str65;
                                                                            str11 = str82;
                                                                            i4 = i20;
                                                                            str2 = str54;
                                                                            z2 = z;
                                                                            str12 = str70;
                                                                            j10 = k7;
                                                                            j11 = j37;
                                                                            arrayList7 = arrayList33;
                                                                            arrayList6 = arrayList34;
                                                                            str21 = str69;
                                                                            str13 = str71;
                                                                            j3 = j41;
                                                                            str14 = str72;
                                                                            str20 = str73;
                                                                            str22 = str74;
                                                                            arrayList17 = arrayList39;
                                                                            arrayList16 = arrayList40;
                                                                            str15 = str78;
                                                                            str16 = str79;
                                                                            arrayList15 = arrayList45;
                                                                            str17 = str81;
                                                                            str18 = str80;
                                                                            j15 = j42;
                                                                            i3 = 0;
                                                                            arrayList13 = arrayList43;
                                                                            str19 = attributeValue14;
                                                                            arrayList14 = arrayList50;
                                                                            j14 = j43;
                                                                            str23 = str85;
                                                                        } else {
                                                                            ArrayList arrayList51 = arrayList47;
                                                                            String str86 = "EssentialProperty";
                                                                            String str87 = "SupplementalProperty";
                                                                            String str88 = "Representation";
                                                                            if (ufa.A(xmlPullParser, "Representation")) {
                                                                                if (arrayList10.isEmpty()) {
                                                                                    str25 = "InbandEventStream";
                                                                                    arrayList18 = arrayList9;
                                                                                } else {
                                                                                    str25 = "InbandEventStream";
                                                                                    arrayList18 = arrayList10;
                                                                                }
                                                                                String str89 = str82;
                                                                                String str90 = "ContentProtection";
                                                                                String attributeValue23 = xmlPullParser.getAttributeValue(null, str65);
                                                                                String str91 = str65;
                                                                                String attributeValue24 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                                int parseInt7 = attributeValue24 == null ? -1 : Integer.parseInt(attributeValue24);
                                                                                String attributeValue25 = xmlPullParser.getAttributeValue(null, str70);
                                                                                String str92 = str80;
                                                                                int i24 = parseInt7;
                                                                                String str93 = attributeValue25 == null ? attributeValue13 : attributeValue25;
                                                                                String attributeValue26 = xmlPullParser.getAttributeValue(null, str92);
                                                                                String str94 = str81;
                                                                                str18 = str92;
                                                                                str12 = str70;
                                                                                String str95 = attributeValue26 == null ? attributeValue14 : attributeValue26;
                                                                                String attributeValue27 = xmlPullParser.getAttributeValue(null, str94);
                                                                                String str96 = str79;
                                                                                str17 = str94;
                                                                                String str97 = attributeValue27 == null ? attributeValue15 : attributeValue27;
                                                                                String attributeValue28 = xmlPullParser.getAttributeValue(null, str96);
                                                                                String str98 = str78;
                                                                                str16 = str96;
                                                                                String str99 = attributeValue28 == null ? attributeValue16 : attributeValue28;
                                                                                String attributeValue29 = xmlPullParser.getAttributeValue(null, str98);
                                                                                if (attributeValue29 == null) {
                                                                                    String str100 = str77;
                                                                                    str26 = str98;
                                                                                    str27 = str100;
                                                                                    parseInt = parseInt4;
                                                                                } else {
                                                                                    String str101 = str77;
                                                                                    str26 = str98;
                                                                                    str27 = str101;
                                                                                    parseInt = Integer.parseInt(attributeValue29);
                                                                                }
                                                                                String attributeValue30 = xmlPullParser.getAttributeValue(null, str27);
                                                                                if (attributeValue30 == null) {
                                                                                    float f7 = f6;
                                                                                    str28 = str27;
                                                                                    f2 = f7;
                                                                                    parseInt2 = parseInt5;
                                                                                } else {
                                                                                    float f8 = f6;
                                                                                    str28 = str27;
                                                                                    f2 = f8;
                                                                                    parseInt2 = Integer.parseInt(attributeValue30);
                                                                                }
                                                                                String str102 = attributeValue23;
                                                                                float l2 = l(xmlPullParser, f2);
                                                                                float f9 = f2;
                                                                                String str103 = str75;
                                                                                String attributeValue31 = xmlPullParser.getAttributeValue(null, str103);
                                                                                int parseInt8 = attributeValue31 == null ? parseInt6 : Integer.parseInt(attributeValue31);
                                                                                str75 = str103;
                                                                                ArrayList arrayList52 = new ArrayList();
                                                                                ArrayList arrayList53 = new ArrayList();
                                                                                ArrayList arrayList54 = new ArrayList(arrayList43);
                                                                                ArrayList arrayList55 = arrayList43;
                                                                                ArrayList arrayList56 = new ArrayList(arrayList51);
                                                                                ArrayList arrayList57 = new ArrayList();
                                                                                ArrayList arrayList58 = arrayList51;
                                                                                ArrayList arrayList59 = arrayList54;
                                                                                String str104 = attributeValue14;
                                                                                int i25 = i20;
                                                                                long j44 = j43;
                                                                                i1h i1hVar3 = i1hVar2;
                                                                                long j45 = j42;
                                                                                int i26 = i22;
                                                                                int i27 = 0;
                                                                                String str105 = null;
                                                                                while (true) {
                                                                                    xmlPullParser.next();
                                                                                    if (ufa.A(xmlPullParser, str54)) {
                                                                                        if (i27 == 0) {
                                                                                            j44 = f(xmlPullParser, j44);
                                                                                            i27 = i2;
                                                                                        }
                                                                                        i6 = parseInt8;
                                                                                        arrayList57.addAll(g(xmlPullParser, arrayList18, z));
                                                                                    } else {
                                                                                        i6 = parseInt8;
                                                                                        if (ufa.A(xmlPullParser, str84)) {
                                                                                            i26 = d(xmlPullParser, str95);
                                                                                        } else {
                                                                                            String str106 = str74;
                                                                                            if (ufa.A(xmlPullParser, str106)) {
                                                                                                arrayList19 = arrayList57;
                                                                                                i1hVar3 = q(xmlPullParser, (h1h) i1hVar3);
                                                                                                str30 = str106;
                                                                                                f3 = l2;
                                                                                                str2 = str54;
                                                                                                z2 = z;
                                                                                                arrayList21 = arrayList18;
                                                                                                arrayList7 = arrayList33;
                                                                                                arrayList6 = arrayList34;
                                                                                                str38 = str69;
                                                                                                str31 = str71;
                                                                                                str14 = str72;
                                                                                                str29 = str73;
                                                                                                str15 = str26;
                                                                                                arrayList22 = arrayList45;
                                                                                                i7 = i24;
                                                                                                str32 = str85;
                                                                                                str41 = str87;
                                                                                                str39 = str25;
                                                                                                str42 = str88;
                                                                                                str33 = str89;
                                                                                                str5 = str91;
                                                                                                str34 = str102;
                                                                                                i8 = i25;
                                                                                                arrayList23 = arrayList52;
                                                                                                i9 = i6;
                                                                                                j21 = j45;
                                                                                                arrayList20 = arrayList50;
                                                                                                str35 = str84;
                                                                                                str36 = str95;
                                                                                                str77 = str28;
                                                                                                str40 = str86;
                                                                                                str37 = str90;
                                                                                                f6 = f9;
                                                                                                str43 = str105;
                                                                                                arrayList24 = arrayList53;
                                                                                                arrayList26 = arrayList56;
                                                                                                arrayList47 = arrayList58;
                                                                                                i10 = i26;
                                                                                                j11 = j37;
                                                                                                str19 = str104;
                                                                                                long j46 = j35;
                                                                                                arrayList2 = arrayList36;
                                                                                                j19 = j44;
                                                                                                j20 = k7;
                                                                                                j4 = j34;
                                                                                                j3 = j41;
                                                                                                arrayList13 = arrayList55;
                                                                                                j12 = j43;
                                                                                                j13 = j46;
                                                                                                arrayList25 = arrayList59;
                                                                                                if (ufa.x(xmlPullParser, str42)) {
                                                                                                    if (sjc.k(str93)) {
                                                                                                        str44 = sjc.b(str36);
                                                                                                    } else if (sjc.o(str93)) {
                                                                                                        str44 = sjc.j(str36);
                                                                                                    } else {
                                                                                                        if (sjc.n(str93) || sjc.m(str93)) {
                                                                                                            str44 = str93;
                                                                                                            str45 = str44;
                                                                                                        } else {
                                                                                                            str45 = str93;
                                                                                                            if (MimeTypes.APPLICATION_MP4.equals(str45)) {
                                                                                                                str44 = sjc.e(str36);
                                                                                                                if (MimeTypes.TEXT_VTT.equals(str44)) {
                                                                                                                    str44 = MimeTypes.APPLICATION_MP4VTT;
                                                                                                                }
                                                                                                            } else {
                                                                                                                str44 = null;
                                                                                                            }
                                                                                                        }
                                                                                                        String str107 = MimeTypes.AUDIO_E_AC3;
                                                                                                        if (MimeTypes.AUDIO_E_AC3.equals(str44)) {
                                                                                                            arrayList27 = arrayList26;
                                                                                                        } else {
                                                                                                            int i28 = 0;
                                                                                                            while (i28 < arrayList26.size()) {
                                                                                                                cy4 cy4Var = (cy4) arrayList26.get(i28);
                                                                                                                arrayList27 = arrayList26;
                                                                                                                String str108 = cy4Var.a;
                                                                                                                String str109 = cy4Var.b;
                                                                                                                String str110 = str107;
                                                                                                                if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str108) && "JOC".equals(str109)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str108) && "ec+3".equals(str109))) {
                                                                                                                    str44 = MimeTypes.AUDIO_E_AC3_JOC;
                                                                                                                    if (MimeTypes.AUDIO_E_AC3_JOC.equals(str44)) {
                                                                                                                        str46 = "ec+3";
                                                                                                                        str47 = str97;
                                                                                                                        if (sjc.l(str46, str47)) {
                                                                                                                            w13 y = nik.y(str46, str47, str99);
                                                                                                                            String str111 = str47 != null ? str47 : str46;
                                                                                                                            w13Var = y;
                                                                                                                            str44 = "video/dolby-vision";
                                                                                                                            str46 = str111;
                                                                                                                        } else {
                                                                                                                            w13Var = null;
                                                                                                                        }
                                                                                                                        i11 = 0;
                                                                                                                        int i29 = 0;
                                                                                                                        while (true) {
                                                                                                                            str48 = str45;
                                                                                                                            if (i11 < arrayList20.size()) {
                                                                                                                                ArrayList arrayList60 = arrayList20;
                                                                                                                                int i30 = i11;
                                                                                                                                cy4 cy4Var2 = (cy4) arrayList60.get(i11);
                                                                                                                                long j47 = j20;
                                                                                                                                if (rz8.C("urn:mpeg:dash:role:2011", cy4Var2.a)) {
                                                                                                                                    String str112 = cy4Var2.b;
                                                                                                                                    i29 = ((str112 != null && (str112.equals("forced_subtitle") || str112.equals("forced-subtitle"))) ? 2 : 0) | i29;
                                                                                                                                }
                                                                                                                                i11 = i30 + 1;
                                                                                                                                arrayList20 = arrayList60;
                                                                                                                                str45 = str48;
                                                                                                                                j20 = j47;
                                                                                                                            } else {
                                                                                                                                j10 = j20;
                                                                                                                                ArrayList arrayList61 = arrayList20;
                                                                                                                                int i31 = 0;
                                                                                                                                int i32 = 0;
                                                                                                                                while (i31 < arrayList61.size()) {
                                                                                                                                    cy4 cy4Var3 = (cy4) arrayList61.get(i31);
                                                                                                                                    int i33 = i31;
                                                                                                                                    if (rz8.C("urn:mpeg:dash:role:2011", cy4Var3.a)) {
                                                                                                                                        i32 = o(cy4Var3.b) | i32;
                                                                                                                                    }
                                                                                                                                    i31 = i33 + 1;
                                                                                                                                }
                                                                                                                                int i34 = i32;
                                                                                                                                int i35 = 0;
                                                                                                                                int i36 = 0;
                                                                                                                                while (i35 < arrayList12.size()) {
                                                                                                                                    ArrayList arrayList62 = arrayList12;
                                                                                                                                    int i37 = i35;
                                                                                                                                    cy4 cy4Var4 = (cy4) arrayList62.get(i35);
                                                                                                                                    int i38 = i36;
                                                                                                                                    String str113 = cy4Var4.a;
                                                                                                                                    ArrayList arrayList63 = arrayList61;
                                                                                                                                    String str114 = cy4Var4.b;
                                                                                                                                    if (rz8.C("urn:mpeg:dash:role:2011", str113)) {
                                                                                                                                        i13 = o(str114);
                                                                                                                                    } else if (rz8.C("urn:tva:metadata:cs:AudioPurposeCS:2007", cy4Var4.a)) {
                                                                                                                                        if (str114 != null) {
                                                                                                                                            switch (str114.hashCode()) {
                                                                                                                                                case 49:
                                                                                                                                                    if (str114.equals("1")) {
                                                                                                                                                        i12 = 0;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    i12 = -1;
                                                                                                                                                    break;
                                                                                                                                                case 50:
                                                                                                                                                    if (str114.equals("2")) {
                                                                                                                                                        i12 = i2;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    i12 = -1;
                                                                                                                                                    break;
                                                                                                                                                case 51:
                                                                                                                                                    if (str114.equals("3")) {
                                                                                                                                                        i12 = 2;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    i12 = -1;
                                                                                                                                                    break;
                                                                                                                                                case 52:
                                                                                                                                                    if (str114.equals("4")) {
                                                                                                                                                        i12 = 3;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    i12 = -1;
                                                                                                                                                    break;
                                                                                                                                                case 53:
                                                                                                                                                default:
                                                                                                                                                    i12 = -1;
                                                                                                                                                    break;
                                                                                                                                                case 54:
                                                                                                                                                    if (str114.equals("6")) {
                                                                                                                                                        i12 = 4;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    i12 = -1;
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            switch (i12) {
                                                                                                                                                case 0:
                                                                                                                                                    i13 = 512;
                                                                                                                                                    break;
                                                                                                                                                case 1:
                                                                                                                                                    i13 = a.o;
                                                                                                                                                    break;
                                                                                                                                                case 2:
                                                                                                                                                    i13 = 4;
                                                                                                                                                    break;
                                                                                                                                                case 3:
                                                                                                                                                    i13 = 8;
                                                                                                                                                    break;
                                                                                                                                                case 4:
                                                                                                                                                    i13 = i2;
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        i13 = 0;
                                                                                                                                    } else {
                                                                                                                                        i36 = i38;
                                                                                                                                        i35 = i37 + 1;
                                                                                                                                        arrayList12 = arrayList62;
                                                                                                                                        arrayList61 = arrayList63;
                                                                                                                                    }
                                                                                                                                    i36 = i38 | i13;
                                                                                                                                    i35 = i37 + 1;
                                                                                                                                    arrayList12 = arrayList62;
                                                                                                                                    arrayList61 = arrayList63;
                                                                                                                                }
                                                                                                                                arrayList14 = arrayList61;
                                                                                                                                ArrayList arrayList64 = arrayList12;
                                                                                                                                int p = i34 | i36 | p(arrayList25) | p(arrayList27);
                                                                                                                                int i39 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (i39 < arrayList25.size()) {
                                                                                                                                        cy4 cy4Var5 = (cy4) arrayList25.get(i39);
                                                                                                                                        int i40 = i39;
                                                                                                                                        if ((rz8.C("http://dashif.org/thumbnail_tile", cy4Var5.a) || rz8.C("http://dashif.org/guidelines/thumbnail_tile", cy4Var5.a)) && (str49 = cy4Var5.b) != null) {
                                                                                                                                            String str115 = nik.a;
                                                                                                                                            String[] split = str49.split("x", -1);
                                                                                                                                            if (split.length == 2) {
                                                                                                                                                i3 = 0;
                                                                                                                                                try {
                                                                                                                                                    pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[i2])));
                                                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        i39 = i40 + 1;
                                                                                                                                    } else {
                                                                                                                                        i3 = 0;
                                                                                                                                        pair = null;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                qm8 qm8Var = new qm8();
                                                                                                                                qm8Var.a = str34;
                                                                                                                                qm8Var.m = sjc.p(str48);
                                                                                                                                qm8Var.n = sjc.p(str44);
                                                                                                                                qm8Var.j = str46;
                                                                                                                                qm8Var.i = i7;
                                                                                                                                qm8Var.e = i29;
                                                                                                                                qm8Var.f = p;
                                                                                                                                qm8Var.D = w13Var;
                                                                                                                                String str116 = str33;
                                                                                                                                qm8Var.d = str116;
                                                                                                                                qm8Var.M = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                                qm8Var.N = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                                if (sjc.o(str44)) {
                                                                                                                                    qm8Var.u = parseInt;
                                                                                                                                    qm8Var.v = parseInt2;
                                                                                                                                    qm8Var.y = f3;
                                                                                                                                } else {
                                                                                                                                    int i41 = parseInt;
                                                                                                                                    int i42 = parseInt2;
                                                                                                                                    if (sjc.k(str44)) {
                                                                                                                                        qm8Var.F = i10;
                                                                                                                                        qm8Var.G = i9;
                                                                                                                                    } else if (sjc.n(str44)) {
                                                                                                                                        if (MimeTypes.APPLICATION_CEA608.equals(str44)) {
                                                                                                                                            int i43 = i3;
                                                                                                                                            while (i43 < arrayList64.size()) {
                                                                                                                                                cy4 cy4Var6 = (cy4) arrayList64.get(i43);
                                                                                                                                                String str117 = cy4Var6.a;
                                                                                                                                                String str118 = cy4Var6.b;
                                                                                                                                                if ("urn:scte:dash:cc:cea-608:2015".equals(str117) && str118 != null) {
                                                                                                                                                    Matcher matcher = c.matcher(str118);
                                                                                                                                                    if (matcher.matches()) {
                                                                                                                                                        parseInt3 = Integer.parseInt(matcher.group(i2));
                                                                                                                                                        qm8Var.K = parseInt3;
                                                                                                                                                    } else {
                                                                                                                                                        tgj.d0("Unable to parse CEA-608 channel number from: ".concat(str118));
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i43++;
                                                                                                                                                i2 = 1;
                                                                                                                                            }
                                                                                                                                            parseInt3 = -1;
                                                                                                                                            qm8Var.K = parseInt3;
                                                                                                                                        } else {
                                                                                                                                            if (MimeTypes.APPLICATION_CEA708.equals(str44)) {
                                                                                                                                                for (int i44 = i3; i44 < arrayList64.size(); i44++) {
                                                                                                                                                    cy4 cy4Var7 = (cy4) arrayList64.get(i44);
                                                                                                                                                    String str119 = cy4Var7.a;
                                                                                                                                                    String str120 = cy4Var7.b;
                                                                                                                                                    if ("urn:scte:dash:cc:cea-708:2015".equals(str119) && str120 != null) {
                                                                                                                                                        Matcher matcher2 = d.matcher(str120);
                                                                                                                                                        if (matcher2.matches()) {
                                                                                                                                                            parseInt3 = Integer.parseInt(matcher2.group(1));
                                                                                                                                                            qm8Var.K = parseInt3;
                                                                                                                                                        } else {
                                                                                                                                                            tgj.d0("Unable to parse CEA-708 service block number from: ".concat(str120));
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            parseInt3 = -1;
                                                                                                                                            qm8Var.K = parseInt3;
                                                                                                                                        }
                                                                                                                                        j16 = j18;
                                                                                                                                        if (ufa.x(xmlPullParser, str24)) {
                                                                                                                                            ArrayList arrayList65 = new ArrayList(arrayList15.size());
                                                                                                                                            int i45 = i3;
                                                                                                                                            while (i45 < arrayList15.size()) {
                                                                                                                                                ArrayList arrayList66 = arrayList15;
                                                                                                                                                ad4 ad4Var = (ad4) arrayList66.get(i45);
                                                                                                                                                qm8 a = ad4Var.a.a();
                                                                                                                                                if (str76 == null || !arrayList17.isEmpty()) {
                                                                                                                                                    str50 = str76;
                                                                                                                                                    a.c = hv9.v(arrayList17);
                                                                                                                                                } else {
                                                                                                                                                    str50 = str76;
                                                                                                                                                    a.b = str50;
                                                                                                                                                }
                                                                                                                                                String str121 = ad4Var.d;
                                                                                                                                                if (str121 == null) {
                                                                                                                                                    str121 = str83;
                                                                                                                                                }
                                                                                                                                                ArrayList arrayList67 = ad4Var.e;
                                                                                                                                                ArrayList arrayList68 = arrayList11;
                                                                                                                                                arrayList67.addAll(arrayList68);
                                                                                                                                                if (arrayList67.isEmpty()) {
                                                                                                                                                    arrayList28 = arrayList17;
                                                                                                                                                    arrayList29 = arrayList66;
                                                                                                                                                    str76 = str50;
                                                                                                                                                } else {
                                                                                                                                                    int i46 = i3;
                                                                                                                                                    while (true) {
                                                                                                                                                        if (i46 < arrayList67.size()) {
                                                                                                                                                            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList67.get(i46);
                                                                                                                                                            arrayList28 = arrayList17;
                                                                                                                                                            if (!yc2.c.equals(schemeData.b) || (str51 = schemeData.c) == null) {
                                                                                                                                                                i46++;
                                                                                                                                                                arrayList17 = arrayList28;
                                                                                                                                                            } else {
                                                                                                                                                                arrayList67.remove(i46);
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            arrayList28 = arrayList17;
                                                                                                                                                            str51 = null;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (str51 != null) {
                                                                                                                                                        int i47 = i3;
                                                                                                                                                        while (i47 < arrayList67.size()) {
                                                                                                                                                            DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList67.get(i47);
                                                                                                                                                            ArrayList arrayList69 = arrayList66;
                                                                                                                                                            if (yc2.b.equals(schemeData2.b) && schemeData2.c == null) {
                                                                                                                                                                str52 = str50;
                                                                                                                                                                arrayList67.set(i47, new DrmInitData.SchemeData(yc2.c, str51, schemeData2.d, schemeData2.e));
                                                                                                                                                            } else {
                                                                                                                                                                str52 = str50;
                                                                                                                                                            }
                                                                                                                                                            i47++;
                                                                                                                                                            str50 = str52;
                                                                                                                                                            arrayList66 = arrayList69;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    arrayList29 = arrayList66;
                                                                                                                                                    str76 = str50;
                                                                                                                                                    for (int size = arrayList67.size() - 1; size >= 0; size--) {
                                                                                                                                                        DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) arrayList67.get(size);
                                                                                                                                                        if (schemeData3.e == null) {
                                                                                                                                                            int i48 = i3;
                                                                                                                                                            while (true) {
                                                                                                                                                                if (i48 < arrayList67.size()) {
                                                                                                                                                                    DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) arrayList67.get(i48);
                                                                                                                                                                    if (schemeData4.e != null && schemeData3.e == null && schemeData4.a(schemeData3.b)) {
                                                                                                                                                                        arrayList67.remove(size);
                                                                                                                                                                    } else {
                                                                                                                                                                        i48++;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    a.r = new DrmInitData(str121, arrayList67);
                                                                                                                                                }
                                                                                                                                                ArrayList arrayList70 = ad4Var.f;
                                                                                                                                                arrayList70.addAll(arrayList16);
                                                                                                                                                b bVar = new b(a);
                                                                                                                                                hv9 hv9Var = ad4Var.b;
                                                                                                                                                i1h i1hVar4 = ad4Var.c;
                                                                                                                                                ArrayList arrayList71 = ad4Var.g;
                                                                                                                                                ArrayList arrayList72 = ad4Var.h;
                                                                                                                                                if (i1hVar4 instanceof h1h) {
                                                                                                                                                    mzfVar = new nzf(bVar, hv9Var, (h1h) i1hVar4, arrayList70, arrayList71, arrayList72);
                                                                                                                                                } else {
                                                                                                                                                    if (!(i1hVar4 instanceof d1h)) {
                                                                                                                                                        a70.p("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                                                                                                        return null;
                                                                                                                                                    }
                                                                                                                                                    mzfVar = new mzf(bVar, hv9Var, (d1h) i1hVar4, arrayList70, arrayList71, arrayList72);
                                                                                                                                                }
                                                                                                                                                arrayList65.add(mzfVar);
                                                                                                                                                i45++;
                                                                                                                                                arrayList11 = arrayList68;
                                                                                                                                                arrayList17 = arrayList28;
                                                                                                                                                arrayList15 = arrayList29;
                                                                                                                                            }
                                                                                                                                            i2 = 1;
                                                                                                                                            arrayList7.add(new ch(parseLong, i5, arrayList65, arrayList12, arrayList13, arrayList47));
                                                                                                                                            str4 = str23;
                                                                                                                                            j2 = j16;
                                                                                                                                            j5 = j11;
                                                                                                                                            j6 = j10;
                                                                                                                                            str3 = str14;
                                                                                                                                        } else {
                                                                                                                                            i2 = 1;
                                                                                                                                            arrayList39 = arrayList17;
                                                                                                                                            arrayList40 = arrayList16;
                                                                                                                                            str55 = str23;
                                                                                                                                            str74 = str22;
                                                                                                                                            str69 = str21;
                                                                                                                                            arrayList36 = arrayList2;
                                                                                                                                            attributeValue14 = str19;
                                                                                                                                            z = z2;
                                                                                                                                            i20 = i5;
                                                                                                                                            str80 = str18;
                                                                                                                                            arrayList38 = arrayList11;
                                                                                                                                            arrayList8 = arrayList9;
                                                                                                                                            arrayList46 = arrayList10;
                                                                                                                                            arrayList41 = arrayList12;
                                                                                                                                            str54 = str2;
                                                                                                                                            arrayList33 = arrayList7;
                                                                                                                                            arrayList34 = arrayList6;
                                                                                                                                            arrayList45 = arrayList15;
                                                                                                                                            str72 = str14;
                                                                                                                                            str65 = str5;
                                                                                                                                            str71 = str24;
                                                                                                                                            arrayList43 = arrayList13;
                                                                                                                                            arrayList48 = arrayList14;
                                                                                                                                            str81 = str17;
                                                                                                                                            str73 = str20;
                                                                                                                                            j41 = j3;
                                                                                                                                            str79 = str16;
                                                                                                                                            k7 = j10;
                                                                                                                                            str70 = str12;
                                                                                                                                            str78 = str15;
                                                                                                                                            j35 = j16;
                                                                                                                                            j34 = j4;
                                                                                                                                            j37 = j11;
                                                                                                                                        }
                                                                                                                                    } else if (sjc.m(str44)) {
                                                                                                                                        qm8Var.u = i41;
                                                                                                                                        qm8Var.v = i42;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                b bVar2 = new b(qm8Var);
                                                                                                                                ad4 ad4Var2 = new ad4(bVar2, !arrayList19.isEmpty() ? arrayList19 : arrayList21, i1hVar3 != null ? i1hVar3 : new h1h(null, 1L, 0L, 0L, 0L), str43, arrayList23, arrayList24, arrayList25, arrayList27);
                                                                                                                                int i49 = sjc.i(bVar2.o);
                                                                                                                                int i50 = i8;
                                                                                                                                if (i50 != -1) {
                                                                                                                                    if (i49 != -1) {
                                                                                                                                        z1a.E(i50 == i49 ? 1 : i3);
                                                                                                                                    }
                                                                                                                                    i49 = i50;
                                                                                                                                }
                                                                                                                                ArrayList arrayList73 = arrayList22;
                                                                                                                                arrayList73.add(ad4Var2);
                                                                                                                                str82 = str116;
                                                                                                                                arrayList12 = arrayList64;
                                                                                                                                i5 = i49;
                                                                                                                                arrayList15 = arrayList73;
                                                                                                                                arrayList17 = arrayList39;
                                                                                                                                arrayList16 = arrayList40;
                                                                                                                                str23 = str32;
                                                                                                                                str24 = str31;
                                                                                                                                str20 = str29;
                                                                                                                                str22 = str30;
                                                                                                                                str21 = str38;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i28++;
                                                                                                                    str107 = str110;
                                                                                                                    arrayList26 = arrayList27;
                                                                                                                }
                                                                                                            }
                                                                                                            arrayList27 = arrayList26;
                                                                                                            str44 = str107;
                                                                                                            if (MimeTypes.AUDIO_E_AC3_JOC.equals(str44)) {
                                                                                                            }
                                                                                                        }
                                                                                                        str46 = str36;
                                                                                                        str47 = str97;
                                                                                                        if (sjc.l(str46, str47)) {
                                                                                                        }
                                                                                                        i11 = 0;
                                                                                                        int i292 = 0;
                                                                                                        while (true) {
                                                                                                            str48 = str45;
                                                                                                            if (i11 < arrayList20.size()) {
                                                                                                            }
                                                                                                            i11 = i30 + 1;
                                                                                                            arrayList20 = arrayList60;
                                                                                                            str45 = str48;
                                                                                                            j20 = j47;
                                                                                                        }
                                                                                                    }
                                                                                                    str45 = str93;
                                                                                                    String str1072 = MimeTypes.AUDIO_E_AC3;
                                                                                                    if (MimeTypes.AUDIO_E_AC3.equals(str44)) {
                                                                                                    }
                                                                                                    str46 = str36;
                                                                                                    str47 = str97;
                                                                                                    if (sjc.l(str46, str47)) {
                                                                                                    }
                                                                                                    i11 = 0;
                                                                                                    int i2922 = 0;
                                                                                                    while (true) {
                                                                                                        str48 = str45;
                                                                                                        if (i11 < arrayList20.size()) {
                                                                                                        }
                                                                                                        i11 = i30 + 1;
                                                                                                        arrayList20 = arrayList60;
                                                                                                        str45 = str48;
                                                                                                        j20 = j47;
                                                                                                    }
                                                                                                } else {
                                                                                                    arrayList56 = arrayList26;
                                                                                                    long j48 = j20;
                                                                                                    i26 = i10;
                                                                                                    str88 = str42;
                                                                                                    arrayList59 = arrayList25;
                                                                                                    arrayList52 = arrayList23;
                                                                                                    arrayList53 = arrayList24;
                                                                                                    str104 = str19;
                                                                                                    str84 = str35;
                                                                                                    j44 = j19;
                                                                                                    arrayList55 = arrayList13;
                                                                                                    f9 = f6;
                                                                                                    str28 = str77;
                                                                                                    arrayList58 = arrayList47;
                                                                                                    j45 = j21;
                                                                                                    str105 = str43;
                                                                                                    arrayList18 = arrayList21;
                                                                                                    i25 = i8;
                                                                                                    arrayList33 = arrayList7;
                                                                                                    arrayList45 = arrayList22;
                                                                                                    str102 = str34;
                                                                                                    i24 = i7;
                                                                                                    l2 = f3;
                                                                                                    parseInt8 = i9;
                                                                                                    str85 = str32;
                                                                                                    str71 = str31;
                                                                                                    str72 = str14;
                                                                                                    i2 = 1;
                                                                                                    str25 = str39;
                                                                                                    str86 = str40;
                                                                                                    str87 = str41;
                                                                                                    j41 = j3;
                                                                                                    arrayList36 = arrayList2;
                                                                                                    str26 = str15;
                                                                                                    arrayList50 = arrayList20;
                                                                                                    arrayList57 = arrayList19;
                                                                                                    k7 = j48;
                                                                                                    str54 = str2;
                                                                                                    str73 = str29;
                                                                                                    str74 = str30;
                                                                                                    str91 = str5;
                                                                                                    str93 = str93;
                                                                                                    str69 = str38;
                                                                                                    long j49 = j11;
                                                                                                    str90 = str37;
                                                                                                    str95 = str36;
                                                                                                    arrayList34 = arrayList6;
                                                                                                    str89 = str33;
                                                                                                    z = z2;
                                                                                                    j43 = j12;
                                                                                                    j34 = j4;
                                                                                                    j37 = j49;
                                                                                                    j35 = j13;
                                                                                                }
                                                                                            } else {
                                                                                                arrayList19 = arrayList57;
                                                                                                String str122 = str73;
                                                                                                if (ufa.A(xmlPullParser, str122)) {
                                                                                                    arrayList20 = arrayList50;
                                                                                                    str2 = str54;
                                                                                                    long f10 = f(xmlPullParser, j45);
                                                                                                    str29 = str122;
                                                                                                    str30 = str106;
                                                                                                    f3 = l2;
                                                                                                    arrayList21 = arrayList18;
                                                                                                    long j50 = k7;
                                                                                                    long j51 = j37;
                                                                                                    arrayList7 = arrayList33;
                                                                                                    arrayList6 = arrayList34;
                                                                                                    str31 = str71;
                                                                                                    j3 = j41;
                                                                                                    str14 = str72;
                                                                                                    str15 = str26;
                                                                                                    arrayList22 = arrayList45;
                                                                                                    i7 = i24;
                                                                                                    String str123 = str86;
                                                                                                    str32 = str85;
                                                                                                    str33 = str89;
                                                                                                    str5 = str91;
                                                                                                    str34 = str102;
                                                                                                    arrayList13 = arrayList55;
                                                                                                    str19 = str104;
                                                                                                    i8 = i25;
                                                                                                    arrayList23 = arrayList52;
                                                                                                    arrayList47 = arrayList58;
                                                                                                    i9 = i6;
                                                                                                    str35 = str84;
                                                                                                    str36 = str95;
                                                                                                    str77 = str28;
                                                                                                    str37 = str90;
                                                                                                    f6 = f9;
                                                                                                    arrayList24 = arrayList53;
                                                                                                    long j52 = j35;
                                                                                                    arrayList2 = arrayList36;
                                                                                                    j4 = j34;
                                                                                                    j12 = j43;
                                                                                                    i1hVar3 = r(xmlPullParser, (e1h) i1hVar3, j51, j50, j44, f10, j52);
                                                                                                    j19 = j44;
                                                                                                    j20 = j50;
                                                                                                    j11 = j51;
                                                                                                    z2 = z;
                                                                                                    str38 = str69;
                                                                                                    str39 = str25;
                                                                                                    str42 = str88;
                                                                                                    str43 = str105;
                                                                                                    i10 = i26;
                                                                                                    arrayList26 = arrayList56;
                                                                                                    j13 = j52;
                                                                                                    arrayList25 = arrayList59;
                                                                                                    str41 = str87;
                                                                                                    j21 = f10;
                                                                                                    str40 = str123;
                                                                                                } else {
                                                                                                    str29 = str122;
                                                                                                    str30 = str106;
                                                                                                    f3 = l2;
                                                                                                    arrayList20 = arrayList50;
                                                                                                    str2 = str54;
                                                                                                    arrayList21 = arrayList18;
                                                                                                    long j53 = j37;
                                                                                                    arrayList7 = arrayList33;
                                                                                                    arrayList6 = arrayList34;
                                                                                                    String str124 = str69;
                                                                                                    str31 = str71;
                                                                                                    str14 = str72;
                                                                                                    str15 = str26;
                                                                                                    arrayList22 = arrayList45;
                                                                                                    i7 = i24;
                                                                                                    String str125 = str86;
                                                                                                    str32 = str85;
                                                                                                    str33 = str89;
                                                                                                    str5 = str91;
                                                                                                    str34 = str102;
                                                                                                    str19 = str104;
                                                                                                    i8 = i25;
                                                                                                    arrayList23 = arrayList52;
                                                                                                    ArrayList arrayList74 = arrayList56;
                                                                                                    arrayList47 = arrayList58;
                                                                                                    i9 = i6;
                                                                                                    str35 = str84;
                                                                                                    str36 = str95;
                                                                                                    str77 = str28;
                                                                                                    str37 = str90;
                                                                                                    f6 = f9;
                                                                                                    arrayList24 = arrayList53;
                                                                                                    long j54 = j35;
                                                                                                    arrayList2 = arrayList36;
                                                                                                    j19 = j44;
                                                                                                    j20 = k7;
                                                                                                    j4 = j34;
                                                                                                    j3 = j41;
                                                                                                    arrayList13 = arrayList55;
                                                                                                    j12 = j43;
                                                                                                    if (ufa.A(xmlPullParser, str124)) {
                                                                                                        j13 = j54;
                                                                                                        long f11 = f(xmlPullParser, j45);
                                                                                                        str38 = str124;
                                                                                                        z2 = z;
                                                                                                        i1hVar3 = s(xmlPullParser, (f1h) i1hVar3, arrayList47, j53, j20, j19, f11, j13);
                                                                                                        j20 = j20;
                                                                                                        j11 = j53;
                                                                                                        str39 = str25;
                                                                                                        str42 = str88;
                                                                                                        str43 = str105;
                                                                                                        i10 = i26;
                                                                                                        arrayList26 = arrayList74;
                                                                                                        str40 = str125;
                                                                                                        str41 = str87;
                                                                                                        j21 = f11;
                                                                                                        arrayList25 = arrayList59;
                                                                                                    } else {
                                                                                                        str38 = str124;
                                                                                                        z2 = z;
                                                                                                        j13 = j54;
                                                                                                        if (ufa.A(xmlPullParser, str37)) {
                                                                                                            Pair h2 = h(xmlPullParser);
                                                                                                            Object obj3 = h2.first;
                                                                                                            if (obj3 != null) {
                                                                                                                str105 = (String) obj3;
                                                                                                            }
                                                                                                            Object obj4 = h2.second;
                                                                                                            if (obj4 != null) {
                                                                                                                arrayList23.add((DrmInitData.SchemeData) obj4);
                                                                                                            }
                                                                                                            j11 = j53;
                                                                                                            str41 = str87;
                                                                                                            str39 = str25;
                                                                                                            str42 = str88;
                                                                                                            str43 = str105;
                                                                                                            arrayList25 = arrayList59;
                                                                                                            str40 = str125;
                                                                                                            j21 = j45;
                                                                                                            i10 = i26;
                                                                                                            arrayList26 = arrayList74;
                                                                                                        } else {
                                                                                                            str39 = str25;
                                                                                                            if (ufa.A(xmlPullParser, str39)) {
                                                                                                                arrayList24.add(j(xmlPullParser, str39));
                                                                                                                str41 = str87;
                                                                                                                arrayList25 = arrayList59;
                                                                                                                str40 = str125;
                                                                                                            } else {
                                                                                                                str40 = str125;
                                                                                                                if (ufa.A(xmlPullParser, str40)) {
                                                                                                                    arrayList25 = arrayList59;
                                                                                                                    arrayList25.add(j(xmlPullParser, str40));
                                                                                                                    str41 = str87;
                                                                                                                } else {
                                                                                                                    str41 = str87;
                                                                                                                    arrayList25 = arrayList59;
                                                                                                                    if (ufa.A(xmlPullParser, str41)) {
                                                                                                                        j21 = j45;
                                                                                                                        arrayList26 = arrayList74;
                                                                                                                        arrayList26.add(j(xmlPullParser, str41));
                                                                                                                    } else {
                                                                                                                        j21 = j45;
                                                                                                                        arrayList26 = arrayList74;
                                                                                                                        b(xmlPullParser);
                                                                                                                    }
                                                                                                                    j11 = j53;
                                                                                                                    str42 = str88;
                                                                                                                    str43 = str105;
                                                                                                                    i10 = i26;
                                                                                                                }
                                                                                                            }
                                                                                                            j21 = j45;
                                                                                                            arrayList26 = arrayList74;
                                                                                                            j11 = j53;
                                                                                                            str42 = str88;
                                                                                                            str43 = str105;
                                                                                                            i10 = i26;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (ufa.x(xmlPullParser, str42)) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    f3 = l2;
                                                                                    str2 = str54;
                                                                                    z2 = z;
                                                                                    arrayList21 = arrayList18;
                                                                                    arrayList7 = arrayList33;
                                                                                    arrayList6 = arrayList34;
                                                                                    str38 = str69;
                                                                                    str31 = str71;
                                                                                    str14 = str72;
                                                                                    str29 = str73;
                                                                                    str30 = str74;
                                                                                    str15 = str26;
                                                                                    arrayList22 = arrayList45;
                                                                                    i7 = i24;
                                                                                    str32 = str85;
                                                                                    str41 = str87;
                                                                                    str42 = str88;
                                                                                    str33 = str89;
                                                                                    str5 = str91;
                                                                                    str34 = str102;
                                                                                    i8 = i25;
                                                                                    arrayList23 = arrayList52;
                                                                                    i9 = i6;
                                                                                    arrayList19 = arrayList57;
                                                                                    arrayList20 = arrayList50;
                                                                                    str35 = str84;
                                                                                    str36 = str95;
                                                                                    str77 = str28;
                                                                                    str40 = str86;
                                                                                    str39 = str25;
                                                                                    str37 = str90;
                                                                                    f6 = f9;
                                                                                    str43 = str105;
                                                                                    arrayList24 = arrayList53;
                                                                                    arrayList47 = arrayList58;
                                                                                    j21 = j45;
                                                                                    j11 = j37;
                                                                                    str19 = str104;
                                                                                    arrayList26 = arrayList56;
                                                                                    i10 = i26;
                                                                                    long j462 = j35;
                                                                                    arrayList2 = arrayList36;
                                                                                    j19 = j44;
                                                                                    j20 = k7;
                                                                                    j4 = j34;
                                                                                    j3 = j41;
                                                                                    arrayList13 = arrayList55;
                                                                                    j12 = j43;
                                                                                    j13 = j462;
                                                                                    arrayList25 = arrayList59;
                                                                                    if (ufa.x(xmlPullParser, str42)) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList47 = arrayList51;
                                                                                str5 = str65;
                                                                                str11 = str82;
                                                                                str2 = str54;
                                                                                z2 = z;
                                                                                str12 = str70;
                                                                                j10 = k7;
                                                                                j11 = j37;
                                                                                arrayList7 = arrayList33;
                                                                                arrayList6 = arrayList34;
                                                                                String str126 = str69;
                                                                                str13 = str71;
                                                                                j3 = j41;
                                                                                str14 = str72;
                                                                                String str127 = str73;
                                                                                String str128 = str74;
                                                                                str15 = str78;
                                                                                str16 = str79;
                                                                                str17 = str81;
                                                                                str18 = str80;
                                                                                i3 = 0;
                                                                                arrayList13 = arrayList43;
                                                                                str19 = attributeValue14;
                                                                                arrayList14 = arrayList50;
                                                                                int i51 = i20;
                                                                                long j55 = j35;
                                                                                arrayList2 = arrayList36;
                                                                                j4 = j34;
                                                                                j12 = j43;
                                                                                j13 = j55;
                                                                                ArrayList arrayList75 = arrayList45;
                                                                                if (ufa.A(xmlPullParser, str128)) {
                                                                                    i1hVar2 = q(xmlPullParser, (h1h) i1hVar2);
                                                                                    arrayList12 = arrayList12;
                                                                                    arrayList15 = arrayList75;
                                                                                    i5 = i51;
                                                                                    arrayList16 = arrayList40;
                                                                                    str82 = str11;
                                                                                    str23 = str85;
                                                                                    str24 = str13;
                                                                                    str20 = str127;
                                                                                    str21 = str126;
                                                                                    str22 = str128;
                                                                                    arrayList17 = arrayList39;
                                                                                } else {
                                                                                    str20 = str127;
                                                                                    if (ufa.A(xmlPullParser, str20)) {
                                                                                        long f12 = f(xmlPullParser, j42);
                                                                                        arrayList12 = arrayList12;
                                                                                        j17 = j12;
                                                                                        i1hVar2 = r(xmlPullParser, (e1h) i1hVar2, j11, j10, j17, f12, j13);
                                                                                        j42 = f12;
                                                                                        j16 = j13;
                                                                                        i5 = i51;
                                                                                        str22 = str128;
                                                                                        arrayList17 = arrayList39;
                                                                                        arrayList16 = arrayList40;
                                                                                        arrayList15 = arrayList75;
                                                                                        str82 = str11;
                                                                                        str23 = str85;
                                                                                        str24 = str13;
                                                                                        str21 = str126;
                                                                                    } else {
                                                                                        arrayList12 = arrayList12;
                                                                                        j14 = j12;
                                                                                        j15 = j42;
                                                                                        if (ufa.A(xmlPullParser, str126)) {
                                                                                            long f13 = f(xmlPullParser, j15);
                                                                                            str21 = str126;
                                                                                            str22 = str128;
                                                                                            arrayList15 = arrayList75;
                                                                                            i1hVar2 = s(xmlPullParser, (f1h) i1hVar2, arrayList47, j11, j10, j14, f13, j13);
                                                                                            j17 = j14;
                                                                                            j42 = f13;
                                                                                            j16 = j13;
                                                                                            arrayList17 = arrayList39;
                                                                                            arrayList16 = arrayList40;
                                                                                            i5 = i51;
                                                                                            str82 = str11;
                                                                                            str23 = str85;
                                                                                            str24 = str13;
                                                                                        } else {
                                                                                            str21 = str126;
                                                                                            i4 = i51;
                                                                                            str22 = str128;
                                                                                            arrayList15 = arrayList75;
                                                                                            ArrayList arrayList76 = arrayList47;
                                                                                            if (ufa.A(xmlPullParser, "InbandEventStream")) {
                                                                                                arrayList16 = arrayList40;
                                                                                                arrayList16.add(j(xmlPullParser, "InbandEventStream"));
                                                                                                arrayList47 = arrayList76;
                                                                                                j16 = j13;
                                                                                                arrayList17 = arrayList39;
                                                                                                str23 = str85;
                                                                                            } else {
                                                                                                arrayList16 = arrayList40;
                                                                                                if (ufa.A(xmlPullParser, "Label")) {
                                                                                                    str23 = str85;
                                                                                                    String attributeValue32 = xmlPullParser.getAttributeValue(null, str23);
                                                                                                    String str129 = "";
                                                                                                    while (true) {
                                                                                                        xmlPullParser.next();
                                                                                                        arrayList47 = arrayList76;
                                                                                                        j16 = j13;
                                                                                                        if (xmlPullParser.getEventType() == 4) {
                                                                                                            str129 = xmlPullParser.getText();
                                                                                                        } else {
                                                                                                            b(xmlPullParser);
                                                                                                        }
                                                                                                        if (ufa.x(xmlPullParser, "Label")) {
                                                                                                            arrayList17 = arrayList39;
                                                                                                            arrayList17.add(new uka(attributeValue32, str129));
                                                                                                        } else {
                                                                                                            j13 = j16;
                                                                                                            arrayList76 = arrayList47;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    arrayList47 = arrayList76;
                                                                                                    j16 = j13;
                                                                                                    arrayList17 = arrayList39;
                                                                                                    str23 = str85;
                                                                                                    if (xmlPullParser.getEventType() == 2) {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            j42 = j15;
                                                                                            j43 = j14;
                                                                                            i5 = i4;
                                                                                            str82 = str11;
                                                                                            str24 = str13;
                                                                                            if (ufa.x(xmlPullParser, str24)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    j43 = j17;
                                                                                    if (ufa.x(xmlPullParser, str24)) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            j18 = j13;
                                                                            j43 = j12;
                                                                            j16 = j18;
                                                                            if (ufa.x(xmlPullParser, str24)) {
                                                                            }
                                                                        }
                                                                    }
                                                                    str5 = str65;
                                                                    str11 = str82;
                                                                    i4 = i20;
                                                                    str2 = str54;
                                                                    z2 = z;
                                                                    arrayList12 = arrayList41;
                                                                    str12 = str70;
                                                                    j10 = k7;
                                                                    j11 = j37;
                                                                    arrayList7 = arrayList33;
                                                                    arrayList6 = arrayList34;
                                                                    str21 = str69;
                                                                    str13 = str71;
                                                                    j3 = j41;
                                                                    str14 = str72;
                                                                    str20 = str73;
                                                                    str22 = str74;
                                                                    arrayList17 = arrayList39;
                                                                    arrayList16 = arrayList40;
                                                                    str15 = str78;
                                                                    str16 = str79;
                                                                    arrayList15 = arrayList45;
                                                                    str17 = str81;
                                                                    str18 = str80;
                                                                    j15 = j42;
                                                                    i3 = 0;
                                                                    arrayList13 = arrayList43;
                                                                    str19 = attributeValue14;
                                                                    arrayList14 = arrayList50;
                                                                    j14 = j43;
                                                                    str23 = str85;
                                                                }
                                                            }
                                                            long j56 = j35;
                                                            arrayList2 = arrayList36;
                                                            j4 = j34;
                                                            j16 = j56;
                                                            j42 = j15;
                                                            j43 = j14;
                                                            i5 = i4;
                                                            str82 = str11;
                                                            str24 = str13;
                                                            if (ufa.x(xmlPullParser, str24)) {
                                                            }
                                                        }
                                                    }
                                                    str23 = str55;
                                                    str5 = str65;
                                                    str2 = str54;
                                                    z2 = z;
                                                    arrayList12 = arrayList41;
                                                    str12 = str70;
                                                    j10 = k7;
                                                    j11 = j37;
                                                    arrayList7 = arrayList33;
                                                    arrayList6 = arrayList34;
                                                    j3 = j41;
                                                    str14 = str72;
                                                    str20 = str73;
                                                    str22 = str74;
                                                    arrayList17 = arrayList39;
                                                    arrayList16 = arrayList40;
                                                    str15 = str78;
                                                    str16 = str79;
                                                    arrayList15 = arrayList45;
                                                    str17 = str81;
                                                    str18 = str80;
                                                    arrayList14 = arrayList48;
                                                    i3 = 0;
                                                    arrayList13 = arrayList43;
                                                    str19 = attributeValue14;
                                                    arrayList11 = arrayList38;
                                                    str21 = str69;
                                                    str24 = str71;
                                                    i5 = i20;
                                                    j18 = j35;
                                                    arrayList2 = arrayList36;
                                                    j4 = j34;
                                                    j16 = j18;
                                                    if (ufa.x(xmlPullParser, str24)) {
                                                    }
                                                }
                                                str23 = str55;
                                                i5 = i20;
                                                arrayList17 = arrayList39;
                                                j18 = j35;
                                                arrayList2 = arrayList36;
                                                j4 = j34;
                                                j16 = j18;
                                                if (ufa.x(xmlPullParser, str24)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = arrayList32;
                                            String str130 = str65;
                                            str2 = str54;
                                            String str131 = str66;
                                            arrayList5 = arrayList35;
                                            z2 = z;
                                            long j57 = k7;
                                            long j58 = j37;
                                            ArrayList arrayList77 = arrayList33;
                                            arrayList6 = arrayList34;
                                            i3 = 0;
                                            j3 = j24;
                                            String str132 = str55;
                                            long j59 = j35;
                                            arrayList2 = arrayList31;
                                            j4 = j34;
                                            if (ufa.A(xmlPullParser, "EventStream")) {
                                                String str133 = str;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, str133);
                                                String str134 = attributeValue33 == null ? "" : attributeValue33;
                                                String str135 = str68;
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, str135);
                                                String str136 = attributeValue34 == null ? "" : attributeValue34;
                                                String attributeValue35 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong2 = attributeValue35 == null ? 1L : Long.parseLong(attributeValue35);
                                                String attributeValue36 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong3 = attributeValue36 == null ? 0L : Long.parseLong(attributeValue36);
                                                ArrayList arrayList78 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (ufa.A(xmlPullParser, "Event")) {
                                                        str10 = str130;
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, str10);
                                                        long parseLong4 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        str9 = str131;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, str9);
                                                        long parseLong5 = attributeValue38 == null ? C.TIME_UNSET : Long.parseLong(attributeValue38);
                                                        str = str133;
                                                        String attributeValue39 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong6 = attributeValue39 == null ? 0L : Long.parseLong(attributeValue39);
                                                        String str137 = nik.a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long b0 = nik.b0(parseLong5, 1000L, parseLong2, roundingMode);
                                                        long b02 = nik.b0(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                        j8 = parseLong2;
                                                        String attributeValue40 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue40 == null) {
                                                            attributeValue40 = null;
                                                        }
                                                        byteArrayOutputStream3.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        str68 = str135;
                                                        newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!ufa.x(xmlPullParser, "Event")) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    j9 = parseLong3;
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i52 = 0;
                                                                    while (i52 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i52), xmlPullParser.getAttributeName(i52), xmlPullParser.getAttributeValue(i52));
                                                                        i52++;
                                                                        byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                    }
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 3:
                                                                    j9 = parseLong3;
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                default:
                                                                    j9 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                                            parseLong3 = j9;
                                                        }
                                                        j7 = parseLong3;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(b02);
                                                        if (attributeValue40 != null) {
                                                            byteArray = attributeValue40.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        str7 = str134;
                                                        str8 = str136;
                                                        arrayList78.add(Pair.create(valueOf, new s36(str134, str136, b0, parseLong4, byteArray)));
                                                    } else {
                                                        str = str133;
                                                        str68 = str135;
                                                        j7 = parseLong3;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        str7 = str134;
                                                        str8 = str136;
                                                        j8 = parseLong2;
                                                        str9 = str131;
                                                        str10 = str130;
                                                        b(xmlPullParser);
                                                    }
                                                    if (ufa.x(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList78.size()];
                                                        s36[] s36VarArr = new s36[arrayList78.size()];
                                                        for (int i53 = 0; i53 < arrayList78.size(); i53++) {
                                                            Pair pair2 = (Pair) arrayList78.get(i53);
                                                            jArr[i53] = ((Long) pair2.first).longValue();
                                                            s36VarArr[i53] = (s36) pair2.second;
                                                        }
                                                        arrayList6.add(new dc6(str7, str8, jArr, s36VarArr));
                                                        str4 = str132;
                                                        str5 = str10;
                                                        arrayList7 = arrayList77;
                                                        str3 = str9;
                                                        j2 = j59;
                                                        j5 = j58;
                                                        j6 = j57;
                                                    } else {
                                                        str136 = str8;
                                                        str134 = str7;
                                                        str130 = str10;
                                                        str131 = str9;
                                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                                        str135 = str68;
                                                        str133 = str;
                                                        parseLong2 = j8;
                                                        parseLong3 = j7;
                                                    }
                                                }
                                            } else {
                                                str3 = str131;
                                                if (ufa.A(xmlPullParser, "SegmentBase")) {
                                                    i1hVar = q(xmlPullParser, null);
                                                    arrayList6 = arrayList6;
                                                    str4 = str132;
                                                    str5 = str130;
                                                    arrayList7 = arrayList77;
                                                    j2 = j59;
                                                    str6 = str67;
                                                    j39 = j40;
                                                    j5 = j58;
                                                    j6 = j57;
                                                    j = C.TIME_UNSET;
                                                } else if (ufa.A(xmlPullParser, "SegmentList")) {
                                                    str4 = str132;
                                                    long f14 = f(xmlPullParser, C.TIME_UNSET);
                                                    j = -9223372036854775807L;
                                                    arrayList6 = arrayList6;
                                                    str5 = str130;
                                                    j5 = j58;
                                                    j6 = j57;
                                                    i1hVar = r(xmlPullParser, null, j5, j6, j40, f14, j59);
                                                    j38 = f14;
                                                    arrayList7 = arrayList77;
                                                    str6 = str67;
                                                    j39 = j40;
                                                    j2 = j59;
                                                } else {
                                                    arrayList6 = arrayList6;
                                                    str4 = str132;
                                                    str5 = str130;
                                                    j5 = j58;
                                                    j6 = j57;
                                                    if (ufa.A(xmlPullParser, "SegmentTemplate")) {
                                                        long f15 = f(xmlPullParser, C.TIME_UNSET);
                                                        av9 av9Var = hv9.b;
                                                        j = -9223372036854775807L;
                                                        arrayList7 = arrayList77;
                                                        j2 = j59;
                                                        i1hVar = s(xmlPullParser, null, vvf.e, j5, j6, j40, f15, j2);
                                                        j5 = j5;
                                                        j6 = j6;
                                                        j38 = f15;
                                                    } else {
                                                        j = -9223372036854775807L;
                                                        arrayList7 = arrayList77;
                                                        j2 = j59;
                                                        if (ufa.A(xmlPullParser, "AssetIdentifier")) {
                                                            j(xmlPullParser, "AssetIdentifier");
                                                        } else {
                                                            b(xmlPullParser);
                                                        }
                                                    }
                                                    str6 = str67;
                                                    j39 = j40;
                                                }
                                            }
                                        }
                                        j = C.TIME_UNSET;
                                        str6 = str67;
                                        j39 = j40;
                                    }
                                    if (ufa.x(xmlPullParser, str6)) {
                                        Pair create = Pair.create(new ude(attributeValue11, k6, arrayList7, arrayList6), Long.valueOf(j6));
                                        ude udeVar = (ude) create.first;
                                        if (udeVar.b != j) {
                                            long longValue = ((Long) create.second).longValue();
                                            long j60 = longValue == j ? j : longValue + udeVar.b;
                                            arrayList3 = arrayList30;
                                            arrayList3.add(udeVar);
                                            j24 = j60;
                                        } else {
                                            if (!equals) {
                                                throw s9e.b("Unable to determine start of period " + arrayList30.size(), null);
                                            }
                                            arrayList3 = arrayList30;
                                            i17 = i2;
                                        }
                                    } else {
                                        str67 = str6;
                                        j24 = j3;
                                        arrayList31 = arrayList2;
                                        j34 = j4;
                                        str64 = str;
                                        arrayList32 = arrayList4;
                                        str66 = str3;
                                        str54 = str2;
                                        arrayList33 = arrayList7;
                                        arrayList34 = arrayList6;
                                        j37 = j5;
                                        k7 = j6;
                                        j35 = j2;
                                        z = z2;
                                        arrayList35 = arrayList5;
                                        str55 = str4;
                                        str65 = str5;
                                    }
                                }
                                j23 = j4;
                            } else {
                                z2 = z;
                                j = j25;
                                j2 = j35;
                                i3 = 0;
                                arrayList2 = arrayList31;
                                j3 = j24;
                                arrayList3 = arrayList30;
                                j4 = j34;
                                b(xmlPullParser);
                            }
                            j24 = j3;
                            j23 = j4;
                        }
                        if (!ufa.x(xmlPullParser, "MPD")) {
                            if (k == j) {
                                if (j24 != j) {
                                    k = j24;
                                } else if (!equals) {
                                    throw s9e.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw s9e.b("No periods found.", null);
                            }
                            return new zc4(W, k, k2, equals, k3, j2, k5, W2, acfVar, tm0Var, s5cVar, uri2, arrayList3);
                        }
                        arrayList30 = arrayList3;
                        k4 = j2;
                        i = i2;
                        i14 = i3;
                        arrayList31 = arrayList2;
                        K = arrayList;
                        z = z2;
                        j22 = j;
                        str53 = null;
                    }
                }
                i3 = 0;
            }
            j2 = k4;
            if (!ufa.x(xmlPullParser, "MPD")) {
            }
        }
    }

    public static jlf n(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new jlf(attributeValue, j, j2);
    }

    public static int o(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return a.o;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return NotificationCompat.FLAG_LOCAL_ONLY;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int p(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (rz8.C("http://dashif.org/guidelines/trickmode", ((cy4) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static h1h q(XmlPullParser xmlPullParser, h1h h1hVar) {
        long j = h1hVar != null ? h1hVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = h1hVar != null ? h1hVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = h1hVar != null ? h1hVar.d : 0L;
        long j6 = h1hVar != null ? h1hVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j5 = Long.parseLong(split[0]);
            j6 = (Long.parseLong(split[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        jlf jlfVar = h1hVar != null ? h1hVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (ufa.A(xmlPullParser, "Initialization")) {
                jlfVar = n(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            jlf jlfVar2 = jlfVar;
            if (ufa.x(xmlPullParser, "SegmentBase")) {
                return new h1h(jlfVar2, j2, j4, j8, j7);
            }
            jlfVar = jlfVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    public static e1h r(XmlPullParser xmlPullParser, e1h e1hVar, long j, long j2, long j3, long j4, long j5) {
        long j6 = e1hVar != null ? e1hVar.b : 1L;
        ArrayList arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = e1hVar != null ? e1hVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = e1hVar != null ? e1hVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = e1hVar != null ? e1hVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == C.TIME_UNSET ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        jlf jlfVar = null;
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (ufa.A(xmlPullParser, "Initialization")) {
                jlfVar = n(xmlPullParser, "sourceURL", "range");
            } else if (ufa.A(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = t(xmlPullParser, j7, j2);
            } else if (ufa.A(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(n(xmlPullParser, U3.i.I0, "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!ufa.x(xmlPullParser, "SegmentList"));
        if (e1hVar != null) {
            if (jlfVar == null) {
                jlfVar = e1hVar.a;
            }
            if (arrayList2 == null) {
                arrayList2 = e1hVar.f;
            }
            if (arrayList == null) {
                arrayList = e1hVar.j;
            }
        }
        return new e1h(jlfVar, j7, j9, j13, j11, arrayList2, j15, arrayList, nik.T(j5), nik.T(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    public static f1h s(XmlPullParser xmlPullParser, f1h f1hVar, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7 = f1hVar != null ? f1hVar.b : 1L;
        jlf jlfVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = f1hVar != null ? f1hVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = f1hVar != null ? f1hVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = f1hVar != null ? f1hVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            cy4 cy4Var = (cy4) list.get(i);
            if (rz8.C("http://dashif.org/guidelines/last-segment-number", cy4Var.a)) {
                j6 = Long.parseLong(cy4Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == C.TIME_UNSET ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        hcc u = u(xmlPullParser, U3.i.I0, f1hVar != null ? f1hVar.k : null);
        hcc u2 = u(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, f1hVar != null ? f1hVar.j : null);
        ArrayList arrayList = null;
        do {
            xmlPullParser.next();
            if (ufa.A(xmlPullParser, "Initialization")) {
                jlfVar = n(xmlPullParser, "sourceURL", "range");
            } else if (ufa.A(xmlPullParser, "SegmentTimeline")) {
                arrayList = t(xmlPullParser, j8, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!ufa.x(xmlPullParser, "SegmentTemplate"));
        if (f1hVar != null) {
            if (jlfVar == null) {
                jlfVar = f1hVar.a;
            }
            if (arrayList == null) {
                arrayList = f1hVar.f;
            }
        }
        return new f1h(jlfVar, j8, j10, j14, j15, j12, arrayList, j17, u2, u, nik.T(j5), nik.T(j));
    }

    public static ArrayList t(XmlPullParser xmlPullParser, long j, long j2) {
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (ufa.A(xmlPullParser, PlayerKt.VOLLEYBALL_SETTER)) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = parseLong;
                    j4 = a(arrayList, j4, j5, i2, j3);
                } else {
                    j3 = parseLong;
                }
                if (j3 != C.TIME_UNSET) {
                    j4 = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j5 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!ufa.x(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = nik.a;
            a(arrayList, j4, j5, i, nik.b0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00fc. Please report as an issue. */
    public static hcc u(XmlPullParser xmlPullParser, String str, hcc hccVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return hccVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i));
                i = attributeValue.length();
            } else if (indexOf != i) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i, indexOf));
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i += 2;
            } else {
                arrayList3.add("");
                int i2 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i2);
                String substring = attributeValue.substring(i2, indexOf2);
                if (substring.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    switch (substring) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            a70.p("Invalid template: ".concat(attributeValue));
                            return null;
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i = indexOf2 + 1;
            }
        }
        return new hcc(arrayList, arrayList2, arrayList3, false, 22);
    }

    @Override // defpackage.w9e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zc4 e(Uri uri, ue4 ue4Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(ue4Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m(newPullParser, uri);
            }
            throw s9e.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw s9e.b(null, e2);
        }
    }
}
