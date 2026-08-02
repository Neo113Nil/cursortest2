package p1;

import D1.o;
import Ra.r;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.AbstractC2356j;
import b1.C2338G;
import b1.C2370y;
import b2.p;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.L;
import com.twilio.voice.EventKeys;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.U;
import e1.Z;
import e1.a0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.LongCompanionObject;
import lb.C5444x;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p1.k;

/* renamed from: p1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6034d extends DefaultHandler implements o.a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f62916a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f62913b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f62914c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f62915d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: p1.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f62917a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC3445z f62918b;

        /* renamed from: c, reason: collision with root package name */
        public final k f62919c;

        /* renamed from: d, reason: collision with root package name */
        public final String f62920d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f62921e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f62922f;

        /* renamed from: g, reason: collision with root package name */
        public final long f62923g;

        /* renamed from: h, reason: collision with root package name */
        public final List f62924h;

        /* renamed from: i, reason: collision with root package name */
        public final List f62925i;

        public a(androidx.media3.common.a aVar, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j10) {
            this.f62917a = aVar;
            this.f62918b = AbstractC3445z.o(list);
            this.f62919c = kVar;
            this.f62920d = str;
            this.f62921e = arrayList;
            this.f62922f = arrayList2;
            this.f62924h = list2;
            this.f62925i = list3;
            this.f62923g = j10;
        }
    }

    public C6034d() {
        try {
            this.f62916a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static int D(List list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6035e c6035e = (C6035e) list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c6035e.f62926a) && (str = c6035e.f62927b) != null) {
                Matcher matcher = f62914c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC4156x.i("MpdParser", "Unable to parse CEA-608 channel number from: " + c6035e.f62927b);
            }
        }
        return -1;
    }

    public static int E(List list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6035e c6035e = (C6035e) list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c6035e.f62926a) && (str = c6035e.f62927b) != null) {
                Matcher matcher = f62915d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC4156x.i("MpdParser", "Unable to parse CEA-708 service block number from: " + c6035e.f62927b);
            }
        }
        return -1;
    }

    public static long H(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Z.i1(attributeValue);
    }

    public static C6035e I(XmlPullParser xmlPullParser, String str) {
        String u02 = u0(xmlPullParser, "schemeIdUri", "");
        String u03 = u0(xmlPullParser, EventKeys.VALUE_KEY, null);
        String u04 = u0(xmlPullParser, StackTraceHelper.ID_KEY, null);
        do {
            xmlPullParser.next();
        } while (!a0.d(xmlPullParser, str));
        return new C6035e(u02, u03, u04);
    }

    public static int J(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, EventKeys.VALUE_KEY);
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int parseInt = Integer.parseInt(attributeValue, 16);
        return (8388608 & parseInt) != 0 ? L(str) : K(parseInt);
    }

    public static int K(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING;
            if (i11 >= iArr.length) {
                break;
            }
            i12 += ((i10 >> i11) & 1) * iArr[i11];
            i11++;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public static int L(String str) {
        String[] C12 = Z.C1(str);
        if (C12.length == 0) {
            return -1;
        }
        List f10 = r.d('.').f(Ra.c.e(C12[0].trim()));
        if (f10.size() != 4 || !((String) f10.get(0)).equals("ac-4")) {
            return -1;
        }
        String str2 = (String) f10.get(3);
        str2.getClass();
        if (str2.equals("03")) {
            return 18;
        }
        return !str2.equals("04") ? -1 : 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int M(XmlPullParser xmlPullParser) {
        char c10;
        String attributeValue = xmlPullParser.getAttributeValue(null, EventKeys.VALUE_KEY);
        if (attributeValue == null) {
            return -1;
        }
        String e10 = Ra.c.e(attributeValue);
        e10.getClass();
        switch (e10.hashCode()) {
            case 1596796:
                if (e10.equals("4000")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2937391:
                if (e10.equals("a000")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3094034:
                if (e10.equals("f800")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3094035:
                if (e10.equals("f801")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3133436:
                if (e10.equals("fa01")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
        }
        return -1;
    }

    public static int N(XmlPullParser xmlPullParser) {
        int X10 = X(xmlPullParser, EventKeys.VALUE_KEY, -1);
        if (X10 <= 0 || X10 >= 33) {
            return -1;
        }
        return X10;
    }

    public static int O(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, EventKeys.VALUE_KEY);
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    public static long P(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Z.j1(attributeValue);
    }

    public static String Q(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6035e c6035e = (C6035e) list.get(i10);
            String str = c6035e.f62926a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(c6035e.f62927b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(c6035e.f62927b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float U(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    public static float V(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f62913b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f10;
    }

    public static int X(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    public static long Z(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6035e c6035e = (C6035e) list.get(i10);
            if (Ra.c.a("http://dashif.org/guidelines/last-segment-number", c6035e.f62926a)) {
                return Long.parseLong(c6035e.f62927b);
            }
        }
        return -1L;
    }

    public static long a0(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    public static int c0(XmlPullParser xmlPullParser) {
        int X10 = X(xmlPullParser, EventKeys.VALUE_KEY, -1);
        if (X10 >= 0) {
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (X10 < iArr.length) {
                return iArr[X10];
            }
        }
        return -1;
    }

    public static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        AbstractC4134a.g(i10 == i11);
        return i10;
    }

    public static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC4134a.g(str.equals(str2));
        return str;
    }

    public static void r(ArrayList arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i10);
            if (AbstractC2356j.f24593c.equals(schemeData.f20466b) && (str = schemeData.f20467c) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(i11);
            if (AbstractC2356j.f24592b.equals(schemeData2.f20466b) && schemeData2.f20467c == null) {
                arrayList.set(i11, new DrmInitData.SchemeData(AbstractC2356j.f24593c, str, schemeData2.f20468d, schemeData2.data));
            }
        }
    }

    public static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(size);
            if (!schemeData.c()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (((DrmInitData.SchemeData) arrayList.get(i10)).a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    public static long t(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == LongCompanionObject.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public static String u(String str, String str2) {
        if (AbstractC2335D.o(str)) {
            return AbstractC2335D.c(str2);
        }
        if (AbstractC2335D.t(str)) {
            return AbstractC2335D.n(str2);
        }
        if (AbstractC2335D.s(str) || AbstractC2335D.q(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g10 = AbstractC2335D.g(str2);
        return "text/vtt".equals(g10) ? "application/x-mp4-vtt" : g10;
    }

    public static String u0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String v0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!a0.d(xmlPullParser, str));
        return str2;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (a0.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (a0.e(xmlPullParser)) {
                    i10++;
                } else if (a0.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public int A(XmlPullParser xmlPullParser, String str) {
        char c10;
        String u02 = u0(xmlPullParser, "schemeIdUri", null);
        u02.getClass();
        int i10 = -1;
        switch (u02.hashCode()) {
            case -2128649360:
                if (u02.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -2060825028:
                if (u02.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1352850286:
                if (u02.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1138141449:
                if (u02.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -986633423:
                if (u02.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -79006963:
                if (u02.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 312179081:
                if (u02.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 2036691300:
                if (u02.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c10 = 7;
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
            case 5:
                i10 = N(xmlPullParser);
                break;
            case 1:
                i10 = J(xmlPullParser, str);
                break;
            case 2:
                i10 = X(xmlPullParser, EventKeys.VALUE_KEY, -1);
                break;
            case 3:
            case 7:
                i10 = M(xmlPullParser);
                break;
            case 4:
                i10 = c0(xmlPullParser);
                break;
            case 6:
                i10 = O(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!a0.d(xmlPullParser, "AudioChannelConfiguration"));
        return i10;
    }

    public long B(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        return attributeValue == null ? j10 : "INF".equals(attributeValue) ? LongCompanionObject.MAX_VALUE : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List C(XmlPullParser xmlPullParser, List list, boolean z10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String v02 = v0(xmlPullParser, "BaseURL");
        if (U.c(v02)) {
            if (attributeValue3 == null) {
                attributeValue3 = v02;
            }
            return L.j(new C6032b(v02, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6032b c6032b = (C6032b) list.get(i10);
            String f10 = U.f(c6032b.f62896a, v02);
            String str = attributeValue3 == null ? f10 : attributeValue3;
            if (z10) {
                parseInt = c6032b.f62898c;
                parseInt2 = c6032b.f62899d;
                str = c6032b.f62897b;
            }
            arrayList.add(new C6032b(f10, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pair F(XmlPullParser xmlPullParser) {
        String str;
        ?? r42;
        String str2;
        String str3;
        ?? r52;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String e10 = Ra.c.e(attributeValue);
            e10.getClass();
            switch (e10) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    r42 = AbstractC2356j.f24593c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r52 = str2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    r42 = AbstractC2356j.f24595e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r52 = str2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    r42 = AbstractC2356j.f24594d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r52 = str2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    str = xmlPullParser.getAttributeValue(null, EventKeys.VALUE_KEY);
                    String b10 = a0.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(b10) && !"00000000-0000-0000-0000-000000000000".equals(b10)) {
                        String[] split = b10.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i10 = 0; i10 < split.length; i10++) {
                            uuidArr[i10] = UUID.fromString(split[i10]);
                        }
                        r42 = AbstractC2356j.f24592b;
                        str3 = null;
                        r52 = p.b(r42, uuidArr, null);
                        break;
                    } else {
                        AbstractC4156x.i("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r42 = null;
                        str2 = r42;
                        str3 = str2;
                        r52 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!a0.f(xmlPullParser, "clearkey:Laurl") || a0.f(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r52 = r52;
                } else if (a0.f(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r52 = r52;
                } else if (r52 == 0 && a0.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                    byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                    UUID f10 = p.f(decode);
                    if (f10 == null) {
                        AbstractC4156x.i("MpdParser", "Skipping malformed cenc:pssh data");
                        r42 = f10;
                        r52 = 0;
                    } else {
                        r52 = decode;
                        r42 = f10;
                    }
                } else {
                    if (r52 == 0) {
                        ?? r72 = AbstractC2356j.f24595e;
                        if (r72.equals(r42) && a0.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r52 = p.a(r72, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    w(xmlPullParser);
                    r52 = r52;
                }
            } while (!a0.d(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r42 != null ? new DrmInitData.SchemeData(r42, str3, "video/mp4", r52) : null);
        }
        str = null;
        r42 = null;
        str2 = r42;
        str3 = str2;
        r52 = str2;
        do {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r52 = r52;
        } while (!a0.d(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r42 != null ? new DrmInitData.SchemeData(r42, str3, "video/mp4", r52) : null);
    }

    public int G(XmlPullParser xmlPullParser) {
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

    public Pair R(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) {
        long a02 = a0(xmlPullParser, StackTraceHelper.ID_KEY, 0L);
        long a03 = a0(xmlPullParser, "duration", -9223372036854775807L);
        long a04 = a0(xmlPullParser, "presentationTime", 0L);
        long p12 = Z.p1(a03, 1000L, j10);
        long p13 = Z.p1(a04 - j11, 1000000L, j10);
        String u02 = u0(xmlPullParser, "messageData", null);
        byte[] S10 = S(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(p13);
        if (u02 != null) {
            S10 = Z.B0(u02);
        }
        return Pair.create(valueOf, d(str, str2, a02, p12, S10));
    }

    public byte[] S(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!a0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public C6036f T(XmlPullParser xmlPullParser) {
        long j10;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String u02 = u0(xmlPullParser, "schemeIdUri", "");
        String u03 = u0(xmlPullParser, EventKeys.VALUE_KEY, "");
        long a02 = a0(xmlPullParser, "timescale", 1L);
        long a03 = a0(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "Event")) {
                j10 = a02;
                str = u03;
                str2 = u02;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(R(xmlPullParser2, str2, str, j10, a03, byteArrayOutputStream));
            } else {
                j10 = a02;
                str = u03;
                str2 = u02;
                xmlPullParser2 = xmlPullParser;
                w(xmlPullParser2);
            }
            if (a0.d(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            u02 = str2;
            u03 = str;
            a02 = j10;
        }
        long[] jArr = new long[arrayList.size()];
        S1.a[] aVarArr = new S1.a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            aVarArr[i10] = (S1.a) pair.second;
        }
        return e(str2, str, j10, jArr, aVarArr);
    }

    public i W(XmlPullParser xmlPullParser) {
        return g0(xmlPullParser, "sourceURL", "range");
    }

    public C2370y Y(XmlPullParser xmlPullParser) {
        return new C2370y(xmlPullParser.getAttributeValue(null, "lang"), v0(xmlPullParser, "Label"));
    }

    public final long b(List list, long j10, long j11, int i10, long j12) {
        int l10 = i10 >= 0 ? i10 + 1 : (int) Z.l(j12 - j10, j11);
        for (int i11 = 0; i11 < l10; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e0 A[LOOP:0: B:18:0x00a5->B:26:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6033c b0(XmlPullParser xmlPullParser, Uri uri) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j10;
        ArrayList arrayList4;
        long j11;
        ArrayList arrayList5;
        long j12;
        long j13;
        long j14;
        Throwable th2;
        long j15;
        C6034d c6034d = this;
        boolean v10 = c6034d.v(c6034d.e0(xmlPullParser, "profiles", new String[0]));
        long H10 = H(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long P10 = P(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long P11 = P(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long P12 = equals ? P(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long P13 = equals ? P(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long P14 = equals ? P(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long H11 = H(xmlPullParser, "publishTime", -9223372036854775807L);
        long j16 = equals ? 0L : -9223372036854775807L;
        ArrayList j17 = L.j(new C6032b(uri.toString(), uri.toString(), v10 ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j18 = equals ? -9223372036854775807L : 0L;
        ArrayList arrayList8 = j17;
        long j19 = j16;
        boolean z10 = false;
        boolean z11 = false;
        h hVar = null;
        o oVar = null;
        Uri uri2 = null;
        l lVar = null;
        while (true) {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "BaseURL")) {
                if (!z11) {
                    j19 = c6034d.B(xmlPullParser, j19);
                    z11 = true;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                arrayList7.addAll(c6034d.C(xmlPullParser, arrayList, v10));
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                if (a0.f(xmlPullParser, "ProgramInformation")) {
                    hVar = f0(xmlPullParser);
                } else if (a0.f(xmlPullParser, "UTCTiming")) {
                    oVar = z0(xmlPullParser);
                } else if (a0.f(xmlPullParser, "Location")) {
                    uri2 = U.g(uri.toString(), xmlPullParser.nextText());
                } else if (a0.f(xmlPullParser, "ServiceDescription")) {
                    lVar = t0(xmlPullParser);
                } else {
                    if (!a0.f(xmlPullParser, "Period") || z10) {
                        arrayList3 = arrayList7;
                        j10 = P10;
                        arrayList8 = arrayList;
                        long j20 = j18;
                        long j21 = j19;
                        arrayList4 = arrayList2;
                        w(xmlPullParser);
                        j18 = j20;
                        j11 = j21;
                    } else {
                        if (arrayList7.isEmpty()) {
                            arrayList3 = arrayList7;
                            arrayList5 = arrayList;
                            j12 = j18;
                            j13 = j19;
                            arrayList4 = arrayList2;
                            arrayList8 = arrayList5;
                        } else {
                            arrayList5 = arrayList7;
                            arrayList3 = arrayList5;
                            arrayList8 = arrayList;
                            j12 = j18;
                            j13 = j19;
                            arrayList4 = arrayList2;
                        }
                        Pair d02 = d0(xmlPullParser, arrayList5, j12, j13, H10, P13, v10);
                        g gVar = (g) d02.first;
                        j10 = P10;
                        if (gVar.f62933b != -9223372036854775807L) {
                            long longValue = ((Long) d02.second).longValue();
                            j14 = longValue == -9223372036854775807L ? -9223372036854775807L : gVar.f62933b + longValue;
                            arrayList4.add(gVar);
                        } else {
                            if (!equals) {
                                throw C2338G.c("Unable to determine start of period " + arrayList4.size(), null);
                            }
                            j14 = j12;
                            z10 = true;
                        }
                        j11 = j13;
                        j18 = j14;
                    }
                    if (a0.d(xmlPullParser, "MPD")) {
                        long j22 = P13;
                        long j23 = P11;
                        ArrayList arrayList9 = arrayList4;
                        c6034d = this;
                        equals = equals;
                        P12 = P12;
                        j19 = j11;
                        arrayList6 = arrayList9;
                        arrayList7 = arrayList3;
                        P11 = j23;
                        P13 = j22;
                        P10 = j10;
                    } else {
                        if (j10 == -9223372036854775807L) {
                            if (j18 != -9223372036854775807L) {
                                j15 = j18;
                                th2 = null;
                                if (arrayList4.isEmpty()) {
                                    return g(H10, j15, P11, equals, P12, P13, P14, H11, hVar, oVar, lVar, uri2, arrayList4);
                                }
                                throw C2338G.c("No periods found.", th2);
                            }
                            if (!equals) {
                                throw C2338G.c("Unable to determine duration of static manifest.", null);
                            }
                        }
                        th2 = null;
                        j15 = j10;
                        if (arrayList4.isEmpty()) {
                        }
                    }
                }
            }
            arrayList3 = arrayList7;
            j11 = j19;
            j10 = P10;
            arrayList4 = arrayList2;
            arrayList8 = arrayList;
            if (a0.d(xmlPullParser, "MPD")) {
            }
        }
    }

    public C6031a c(long j10, int i10, List list, List list2, List list3, List list4) {
        return new C6031a(j10, i10, list, list2, list3, list4);
    }

    public S1.a d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new S1.a(str, str2, j11, j10, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    public Pair d0(XmlPullParser xmlPullParser, List list, long j10, long j11, long j12, long j13, boolean z10) {
        List list2;
        long j14;
        k kVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j15;
        Object obj;
        long j16;
        XmlPullParser xmlPullParser2;
        long j17;
        long j18;
        k o02;
        long j19;
        C6035e c6035e;
        long j20;
        k kVar2;
        boolean z11;
        long j21;
        List list3;
        C6034d c6034d = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, StackTraceHelper.ID_KEY);
        long P10 = P(xmlPullParser3, ViewProps.START, j10);
        long j22 = j12 != -9223372036854775807L ? j12 + P10 : -9223372036854775807L;
        long P11 = P(xmlPullParser3, "duration", -9223372036854775807L);
        ArrayList arrayList3 = new ArrayList();
        long j23 = -9223372036854775807L;
        ArrayList arrayList4 = new ArrayList();
        boolean z12 = false;
        C6035e c6035e2 = null;
        long j24 = j11;
        ArrayList arrayList5 = arrayList3;
        k kVar3 = null;
        long j25 = -9223372036854775807L;
        ?? r10 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            if (a0.f(xmlPullParser3, "BaseURL")) {
                if (!z12) {
                    j24 = c6034d.B(xmlPullParser3, j24);
                    z12 = true;
                }
                r10.addAll(c6034d.C(xmlPullParser3, list, z10));
                arrayList2 = arrayList5;
                j19 = j24;
                arrayList = arrayList4;
                z11 = z12;
                j15 = j23;
                obj = null;
                j16 = P11;
                list2 = r10;
                c6035e = c6035e2;
                xmlPullParser2 = xmlPullParser3;
                kVar2 = kVar3;
                j21 = j25;
                j18 = j22;
            } else {
                ArrayList arrayList6 = arrayList5;
                if (a0.f(xmlPullParser3, "AdaptationSet")) {
                    if (r10.isEmpty()) {
                        list2 = r10;
                        list3 = list;
                    } else {
                        list3 = r10;
                        list2 = list3;
                    }
                    ArrayList arrayList7 = arrayList4;
                    long j26 = j24;
                    long j27 = j22;
                    long j28 = P11;
                    C6031a y10 = c6034d.y(xmlPullParser3, list3, kVar3, j28, j26, j25, j27, j13, z10);
                    j22 = j27;
                    j14 = j25;
                    arrayList6.add(y10);
                    kVar = kVar3;
                    j16 = j28;
                    arrayList = arrayList7;
                    obj = null;
                    xmlPullParser2 = xmlPullParser3;
                    j17 = j26;
                    arrayList2 = arrayList6;
                    j15 = -9223372036854775807L;
                } else {
                    list2 = r10;
                    ArrayList arrayList8 = arrayList4;
                    long j29 = j24;
                    j14 = j25;
                    if (a0.f(xmlPullParser3, "EventStream")) {
                        arrayList8.add(T(xmlPullParser));
                        kVar = kVar3;
                        j16 = P11;
                        arrayList = arrayList8;
                        arrayList2 = arrayList6;
                        j15 = -9223372036854775807L;
                        obj = null;
                        xmlPullParser2 = xmlPullParser3;
                        j17 = j29;
                    } else {
                        if (a0.f(xmlPullParser3, "SegmentBase")) {
                            o02 = c6034d.m0(xmlPullParser3, null);
                            j19 = j29;
                            obj = null;
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j15 = -9223372036854775807L;
                            j18 = j22;
                            j16 = P11;
                            c6035e = c6035e2;
                            xmlPullParser2 = xmlPullParser3;
                        } else if (a0.f(xmlPullParser3, "SegmentList")) {
                            long j30 = j22;
                            long j31 = P11;
                            long B10 = c6034d.B(xmlPullParser3, -9223372036854775807L);
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j15 = -9223372036854775807L;
                            k n02 = c6034d.n0(xmlPullParser3, null, j30, j31, j29, B10, j13);
                            j19 = j29;
                            obj = null;
                            j18 = j30;
                            j16 = j31;
                            c6035e = c6035e2;
                            xmlPullParser2 = xmlPullParser3;
                            j20 = B10;
                            kVar2 = n02;
                            z11 = z12;
                            j21 = j20;
                        } else {
                            kVar = kVar3;
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j15 = -9223372036854775807L;
                            if (a0.f(xmlPullParser3, "SegmentTemplate")) {
                                j14 = c6034d.B(xmlPullParser3, -9223372036854775807L);
                                obj = null;
                                o02 = c6034d.o0(xmlPullParser3, null, AbstractC3445z.t(), j22, P11, j29, j14, j13);
                                j16 = P11;
                                xmlPullParser2 = xmlPullParser3;
                                j18 = j22;
                                j19 = j29;
                                c6035e = c6035e2;
                            } else {
                                obj = null;
                                j16 = P11;
                                xmlPullParser2 = xmlPullParser3;
                                j17 = j29;
                                j18 = j22;
                                if (a0.f(xmlPullParser2, "AssetIdentifier")) {
                                    c6035e2 = I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    w(xmlPullParser2);
                                }
                                j19 = j17;
                                c6035e = c6035e2;
                                j20 = j14;
                                kVar2 = kVar;
                                z11 = z12;
                                j21 = j20;
                            }
                        }
                        j20 = j14;
                        kVar2 = o02;
                        z11 = z12;
                        j21 = j20;
                    }
                }
                j18 = j22;
                j19 = j17;
                c6035e = c6035e2;
                j20 = j14;
                kVar2 = kVar;
                z11 = z12;
                j21 = j20;
            }
            if (a0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, P10, arrayList2, arrayList, c6035e), Long.valueOf(j16));
            }
            c6034d = this;
            xmlPullParser3 = xmlPullParser2;
            j22 = j18;
            kVar3 = kVar2;
            j25 = j21;
            r10 = list2;
            arrayList5 = arrayList2;
            c6035e2 = c6035e;
            z12 = z11;
            P11 = j16;
            j23 = j15;
            j24 = j19;
            arrayList4 = arrayList;
        }
    }

    public C6036f e(String str, String str2, long j10, long[] jArr, S1.a[] aVarArr) {
        return new C6036f(str, str2, j10, jArr, aVarArr);
    }

    public String[] e0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public androidx.media3.common.a f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List list, List list2, String str4, String str5, String str6, List list3, List list4) {
        String str7 = str5;
        String str8 = str4;
        String u10 = u(str2, str8);
        if ("audio/eac3".equals(u10)) {
            u10 = Q(list4);
            if ("audio/eac3-joc".equals(u10)) {
                str8 = "ec+3";
            }
        }
        if (AbstractC2335D.p(str8, str7)) {
            if (str7 == null) {
                str7 = str8;
            }
            u10 = "video/dolby-vision";
            str8 = str7;
        }
        int s02 = s0(list);
        int l02 = l0(list) | i0(list2) | k0(list3) | k0(list4);
        Pair w02 = w0(list3);
        a.b n02 = new a.b().j0(str).W(str2).y0(u10).U(str8).t0(i14).A0(s02).w0(l02).n0(str3);
        int i15 = -1;
        a.b E02 = n02.D0(w02 != null ? ((Integer) w02.first).intValue() : -1).E0(w02 != null ? ((Integer) w02.second).intValue() : -1);
        if (AbstractC2335D.t(u10)) {
            E02.F0(i10).h0(i11).f0(f10);
        } else if (AbstractC2335D.o(u10)) {
            E02.T(i12).z0(i13);
        } else if (AbstractC2335D.s(u10)) {
            if ("application/cea-608".equals(u10)) {
                i15 = D(list2);
            } else if ("application/cea-708".equals(u10)) {
                i15 = E(list2);
            }
            E02.Q(i15);
        } else if (AbstractC2335D.q(u10)) {
            E02.F0(i10).h0(i11);
        }
        return E02.P();
    }

    public h f0(XmlPullParser xmlPullParser) {
        String str = null;
        String u02 = u0(xmlPullParser, "moreInformationURL", null);
        String u03 = u0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (a0.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (a0.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str2;
            String str5 = str;
            String str6 = str3;
            if (a0.d(xmlPullParser, "ProgramInformation")) {
                return new h(str5, str4, str6, u02, u03);
            }
            str = str5;
            str2 = str4;
            str3 = str6;
        }
    }

    public C6033c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        return new C6033c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    public i g0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j11 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
            }
        } else {
            j10 = 0;
        }
        return i(attributeValue, j10, j11);
    }

    public g h(String str, long j10, List list, List list2, C6035e c6035e) {
        return new g(str, j10, list, list2, c6035e);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x025f A[LOOP:0: B:2:0x007a->B:11:0x025f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0204 A[EDGE_INSN: B:12:0x0204->B:13:0x0204 BREAK  A[LOOP:0: B:2:0x007a->B:11:0x025f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a h0(XmlPullParser xmlPullParser, List list, String str, String str2, String str3, String str4, int i10, int i11, float f10, int i12, int i13, String str5, List list2, List list3, List list4, List list5, k kVar, long j10, long j11, long j12, long j13, long j14, boolean z10) {
        String str6;
        ArrayList arrayList;
        int i14;
        ArrayList arrayList2;
        XmlPullParser xmlPullParser2;
        String str7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j15;
        String str8;
        boolean z11;
        long j16;
        int i15;
        k kVar2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        C6034d c6034d = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, StackTraceHelper.ID_KEY);
        int X10 = X(xmlPullParser3, "bandwidth", -1);
        String u02 = u0(xmlPullParser3, "mimeType", str);
        String u03 = u0(xmlPullParser3, "codecs", str2);
        String u04 = u0(xmlPullParser3, "scte214:supplementalCodecs", str3);
        String u05 = u0(xmlPullParser3, "scte214:supplementalProfiles", str4);
        int X11 = X(xmlPullParser3, "width", i10);
        int X12 = X(xmlPullParser3, "height", i11);
        float V10 = V(xmlPullParser3, f10);
        int X13 = X(xmlPullParser3, "audioSamplingRate", i13);
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList(list4);
        ArrayList arrayList11 = new ArrayList(list5);
        ArrayList arrayList12 = new ArrayList();
        int i16 = i12;
        long j17 = j13;
        String str9 = null;
        boolean z12 = false;
        k kVar3 = kVar;
        long j18 = j12;
        while (true) {
            xmlPullParser3.next();
            ArrayList arrayList13 = arrayList8;
            if (a0.f(xmlPullParser3, "BaseURL")) {
                if (!z12) {
                    j18 = c6034d.B(xmlPullParser3, j18);
                    z12 = true;
                }
                k kVar4 = kVar3;
                str6 = attributeValue;
                arrayList12.addAll(c6034d.C(xmlPullParser3, list, z10));
                arrayList = arrayList13;
                xmlPullParser2 = xmlPullParser3;
                arrayList3 = arrayList10;
                arrayList4 = arrayList11;
                arrayList7 = arrayList12;
                j15 = j17;
                str7 = u03;
                i14 = X10;
                i15 = i16;
                str8 = str9;
                z11 = z12;
                kVar2 = kVar4;
            } else {
                k kVar5 = kVar3;
                str6 = attributeValue;
                if (a0.f(xmlPullParser3, "AudioChannelConfiguration")) {
                    int A10 = c6034d.A(xmlPullParser3, u03);
                    kVar2 = kVar5;
                    arrayList = arrayList13;
                    xmlPullParser2 = xmlPullParser3;
                    i15 = A10;
                    arrayList3 = arrayList10;
                    arrayList4 = arrayList11;
                    arrayList7 = arrayList12;
                    j15 = j17;
                    str7 = u03;
                    i14 = X10;
                    str8 = str9;
                    z11 = z12;
                } else if (a0.f(xmlPullParser3, "SegmentBase")) {
                    k.e m02 = c6034d.m0(xmlPullParser3, (k.e) kVar5);
                    arrayList = arrayList13;
                    xmlPullParser2 = xmlPullParser3;
                    arrayList3 = arrayList10;
                    arrayList6 = arrayList12;
                    j15 = j17;
                    str7 = u03;
                    i14 = X10;
                    i15 = i16;
                    str8 = str9;
                    z11 = z12;
                    kVar2 = m02;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList11;
                    j16 = j18;
                    arrayList5 = arrayList6;
                    if (a0.d(xmlPullParser2, "Representation")) {
                        break;
                    }
                    int i17 = X11;
                    ArrayList arrayList14 = arrayList2;
                    String str10 = u05;
                    X11 = i17;
                    arrayList9 = arrayList14;
                    arrayList10 = arrayList3;
                    arrayList11 = arrayList4;
                    arrayList8 = arrayList;
                    kVar3 = kVar2;
                    j18 = j16;
                    j17 = j15;
                    arrayList12 = arrayList5;
                    u03 = str7;
                    z12 = z11;
                    str9 = str8;
                    i16 = i15;
                    u04 = u04;
                    u05 = str10;
                    attributeValue = str6;
                    X10 = i14;
                    xmlPullParser3 = xmlPullParser2;
                    c6034d = this;
                } else {
                    if (a0.f(xmlPullParser3, "SegmentList")) {
                        long j19 = j18;
                        long B10 = c6034d.B(xmlPullParser3, j17);
                        arrayList = arrayList13;
                        arrayList5 = arrayList12;
                        i14 = X10;
                        arrayList2 = arrayList9;
                        k.b n02 = c6034d.n0(xmlPullParser3, (k.b) kVar5, j10, j11, j19, B10, j14);
                        xmlPullParser2 = xmlPullParser3;
                        str7 = u03;
                        str8 = str9;
                        z11 = z12;
                        arrayList4 = arrayList11;
                        j16 = j19;
                        i15 = i16;
                        kVar2 = n02;
                        arrayList3 = arrayList10;
                        j15 = B10;
                    } else {
                        arrayList = arrayList13;
                        ArrayList arrayList15 = arrayList10;
                        ArrayList arrayList16 = arrayList11;
                        ArrayList arrayList17 = arrayList12;
                        long j20 = j18;
                        i14 = X10;
                        arrayList2 = arrayList9;
                        if (a0.f(xmlPullParser3, "SegmentTemplate")) {
                            long B11 = c6034d.B(xmlPullParser3, j17);
                            str7 = u03;
                            k.c o02 = c6034d.o0(xmlPullParser3, (k.c) kVar5, list5, j10, j11, j20, B11, j14);
                            xmlPullParser2 = xmlPullParser3;
                            str8 = str9;
                            z11 = z12;
                            arrayList4 = arrayList16;
                            j16 = j20;
                            i15 = i16;
                            kVar2 = o02;
                            arrayList3 = arrayList15;
                            j15 = B11;
                            arrayList5 = arrayList17;
                        } else {
                            xmlPullParser2 = xmlPullParser3;
                            str7 = u03;
                            if (a0.f(xmlPullParser2, "ContentProtection")) {
                                Pair F10 = F(xmlPullParser);
                                Object obj = F10.first;
                                if (obj != null) {
                                    str9 = (String) obj;
                                }
                                Object obj2 = F10.second;
                                if (obj2 != null) {
                                    arrayList.add((DrmInitData.SchemeData) obj2);
                                }
                                str8 = str9;
                                z11 = z12;
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                                j16 = j20;
                                j15 = j17;
                            } else {
                                if (a0.f(xmlPullParser2, "InbandEventStream")) {
                                    arrayList2.add(I(xmlPullParser2, "InbandEventStream"));
                                    arrayList3 = arrayList15;
                                } else if (a0.f(xmlPullParser2, "EssentialProperty")) {
                                    arrayList3 = arrayList15;
                                    arrayList3.add(I(xmlPullParser2, "EssentialProperty"));
                                } else {
                                    arrayList3 = arrayList15;
                                    if (a0.f(xmlPullParser2, "SupplementalProperty")) {
                                        arrayList4 = arrayList16;
                                        arrayList4.add(I(xmlPullParser2, "SupplementalProperty"));
                                    } else {
                                        arrayList4 = arrayList16;
                                        w(xmlPullParser2);
                                    }
                                    j15 = j17;
                                    str8 = str9;
                                    z11 = z12;
                                    j16 = j20;
                                }
                                arrayList4 = arrayList16;
                                j15 = j17;
                                str8 = str9;
                                z11 = z12;
                                j16 = j20;
                            }
                            i15 = i16;
                            kVar2 = kVar5;
                            arrayList5 = arrayList17;
                        }
                    }
                    if (a0.d(xmlPullParser2, "Representation")) {
                    }
                }
            }
            arrayList2 = arrayList9;
            arrayList6 = arrayList7;
            j16 = j18;
            arrayList5 = arrayList6;
            if (a0.d(xmlPullParser2, "Representation")) {
            }
        }
        ArrayList arrayList18 = arrayList2;
        String str11 = u05;
        ArrayList arrayList19 = arrayList;
        String str12 = u04;
        ArrayList arrayList20 = arrayList4;
        ArrayList arrayList21 = arrayList3;
        androidx.media3.common.a f11 = f(str6, u02, X11, X12, V10, i15, X13, i14, str5, list2, list3, str7, str12, str11, arrayList21, arrayList20);
        if (kVar2 == null) {
            kVar2 = new k.e();
        }
        boolean isEmpty = arrayList5.isEmpty();
        List list6 = arrayList5;
        if (isEmpty) {
            list6 = list;
        }
        return new a(f11, list6, kVar2, str8, arrayList19, arrayList18, arrayList21, arrayList20, -1L);
    }

    public i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    public int i0(List list) {
        int x02;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C6035e c6035e = (C6035e) list.get(i11);
            if (Ra.c.a("urn:mpeg:dash:role:2011", c6035e.f62926a)) {
                x02 = j0(c6035e.f62927b);
            } else if (Ra.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", c6035e.f62926a)) {
                x02 = x0(c6035e.f62927b);
            }
            i10 |= x02;
        }
        return i10;
    }

    public j j(a aVar, String str, List list, String str2, ArrayList arrayList, ArrayList arrayList2) {
        a.b b10 = aVar.f62917a.b();
        if (str == null || !list.isEmpty()) {
            b10.m0(list);
        } else {
            b10.l0(str);
        }
        String str3 = aVar.f62920d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList arrayList3 = aVar.f62921e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            b10.c0(new DrmInitData(str3, arrayList3));
        }
        ArrayList arrayList4 = aVar.f62922f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f62923g, b10.P(), aVar.f62918b, aVar.f62919c, arrayList4, aVar.f62924h, aVar.f62925i, null);
    }

    public int j0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public k.b k(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, Z.a1(j15), Z.a1(j16));
    }

    public int k0(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (Ra.c.a("http://dashif.org/guidelines/trickmode", ((C6035e) list.get(i11)).f62926a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, Z.a1(j16), Z.a1(j17));
    }

    public int l0(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C6035e c6035e = (C6035e) list.get(i11);
            if (Ra.c.a("urn:mpeg:dash:role:2011", c6035e.f62926a)) {
                i10 |= j0(c6035e.f62927b);
            }
        }
        return i10;
    }

    public k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    public k.e m0(XmlPullParser xmlPullParser, k.e eVar) {
        long a02 = a0(xmlPullParser, "timescale", eVar != null ? eVar.f62961b : 1L);
        long a03 = a0(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f62962c : 0L);
        long j10 = eVar != null ? eVar.f62975d : 0L;
        long j11 = eVar != null ? eVar.f62976e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j10 = Long.parseLong(split[0]);
            j11 = (Long.parseLong(split[1]) - j10) + 1;
        }
        long j12 = j11;
        i iVar = eVar != null ? eVar.f62960a : null;
        while (true) {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "Initialization")) {
                iVar = W(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
            i iVar2 = iVar;
            if (a0.d(xmlPullParser, "SegmentBase")) {
                return n(iVar2, a02, a03, j10, j12);
            }
            iVar = iVar2;
        }
    }

    public k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    public k.b n0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        long a02 = a0(xmlPullParser, "timescale", bVar != null ? bVar.f62961b : 1L);
        long a03 = a0(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f62962c : 0L);
        long a04 = a0(xmlPullParser, "duration", bVar != null ? bVar.f62964e : -9223372036854775807L);
        long a05 = a0(xmlPullParser, "startNumber", bVar != null ? bVar.f62963d : 1L);
        long t10 = t(j12, j13);
        List list = null;
        i iVar = null;
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "Initialization")) {
                iVar = W(xmlPullParser);
                j15 = a02;
            } else if (a0.f(xmlPullParser, "SegmentTimeline")) {
                j15 = a02;
                list2 = p0(xmlPullParser, j15, j11);
            } else {
                j15 = a02;
                if (a0.f(xmlPullParser, "SegmentURL")) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(q0(xmlPullParser));
                } else {
                    w(xmlPullParser);
                }
            }
            if (a0.d(xmlPullParser, "SegmentList")) {
                break;
            }
            a02 = j15;
        }
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.f62960a;
            }
            if (list2 == null) {
                list2 = bVar.f62965f;
            }
            if (list == null) {
                list = bVar.f62969j;
            }
        }
        return k(iVar, j15, a03, a05, a04, list2, t10, list, j14, j10);
    }

    public o o(String str, String str2) {
        return new o(str, str2);
    }

    public k.c o0(XmlPullParser xmlPullParser, k.c cVar, List list, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        C6034d c6034d = this;
        long a02 = a0(xmlPullParser, "timescale", cVar != null ? cVar.f62961b : 1L);
        long a03 = a0(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f62962c : 0L);
        long a04 = a0(xmlPullParser, "duration", cVar != null ? cVar.f62964e : -9223372036854775807L);
        long a05 = a0(xmlPullParser, "startNumber", cVar != null ? cVar.f62963d : 1L);
        long Z10 = Z(list);
        long t10 = t(j12, j13);
        n y02 = c6034d.y0(xmlPullParser, "media", cVar != null ? cVar.f62971k : null);
        n y03 = c6034d.y0(xmlPullParser, "initialization", cVar != null ? cVar.f62970j : null);
        i iVar = null;
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "Initialization")) {
                iVar = W(xmlPullParser);
                j15 = a02;
            } else if (a0.f(xmlPullParser, "SegmentTimeline")) {
                j15 = a02;
                list2 = c6034d.p0(xmlPullParser, j15, j11);
            } else {
                j15 = a02;
                w(xmlPullParser);
            }
            if (a0.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            c6034d = this;
            t10 = t10;
            Z10 = Z10;
            a05 = a05;
            a03 = a03;
            a02 = j15;
        }
        if (cVar != null) {
            if (iVar == null) {
                iVar = cVar.f62960a;
            }
            if (list2 == null) {
                list2 = cVar.f62965f;
            }
        }
        return l(iVar, j15, a03, a05, Z10, a04, list2, t10, y03, y02, j14, j10);
    }

    public List p0(XmlPullParser xmlPullParser, long j10, long j11) {
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "S")) {
                long a02 = a0(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    ArrayList arrayList2 = arrayList;
                    j12 = b(arrayList2, j12, j13, i10, a02);
                    arrayList = arrayList2;
                }
                if (a02 != -9223372036854775807L) {
                    j12 = a02;
                }
                j13 = a0(xmlPullParser, W9.d.f13160a, -9223372036854775807L);
                i10 = X(xmlPullParser, "r", 0);
                z10 = true;
            } else {
                w(xmlPullParser);
            }
        } while (!a0.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, j12, j13, i10, Z.p1(j11, j10, 1000L));
        }
        return arrayList;
    }

    public i q0(XmlPullParser xmlPullParser) {
        return g0(xmlPullParser, "media", "mediaRange");
    }

    public int r0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int s0(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C6035e c6035e = (C6035e) list.get(i11);
            if (Ra.c.a("urn:mpeg:dash:role:2011", c6035e.f62926a)) {
                i10 |= r0(c6035e.f62927b);
            }
        }
        return i10;
    }

    public l t0(XmlPullParser xmlPullParser) {
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, "Latency")) {
                j10 = a0(xmlPullParser, "target", -9223372036854775807L);
                j11 = a0(xmlPullParser, "min", -9223372036854775807L);
                j12 = a0(xmlPullParser, "max", -9223372036854775807L);
            } else if (a0.f(xmlPullParser, "PlaybackRate")) {
                f10 = U(xmlPullParser, "min", -3.4028235E38f);
                f11 = U(xmlPullParser, "max", -3.4028235E38f);
            }
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float f12 = f10;
            float f13 = f11;
            if (a0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j13, j14, j15, f12, f13);
            }
            j10 = j13;
            j11 = j14;
            j12 = j15;
            f10 = f12;
            f11 = f13;
        }
    }

    public final boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public Pair w0(List list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6035e c6035e = (C6035e) list.get(i10);
            if ((Ra.c.a("http://dashif.org/thumbnail_tile", c6035e.f62926a) || Ra.c.a("http://dashif.org/guidelines/thumbnail_tile", c6035e.f62926a)) && (str = c6035e.f62927b) != null) {
                String[] A12 = Z.A1(str, C5444x.f55808b);
                if (A12.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(A12[0])), Integer.valueOf(Integer.parseInt(A12[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // D1.o.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C6033c a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f62916a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return b0(newPullParser, uri);
            }
            throw C2338G.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw C2338G.c(null, e10);
        }
    }

    public int x0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x03cb A[LOOP:0: B:2:0x00a2->B:10:0x03cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x037b A[EDGE_INSN: B:11:0x037b->B:12:0x037b BREAK  A[LOOP:0: B:2:0x00a2->B:10:0x03cb], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6031a y(XmlPullParser xmlPullParser, List list, k kVar, long j10, long j11, long j12, long j13, long j14, boolean z10) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str2;
        int i10;
        int i11;
        int i12;
        long j15;
        ArrayList arrayList6;
        k kVar2;
        List list2;
        ArrayList arrayList7;
        String str3;
        long j16;
        int i13;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        List list3;
        ArrayList arrayList12;
        k kVar3;
        ArrayList arrayList13;
        XmlPullParser xmlPullParser2;
        C6034d c6034d;
        int i14;
        int i15;
        long j17;
        ArrayList arrayList14;
        String str4;
        int i16;
        String str5;
        float f10;
        long j18;
        String str6;
        long j19;
        boolean z11;
        String str7;
        long j20;
        C6034d c6034d2 = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        long a02 = a0(xmlPullParser3, StackTraceHelper.ID_KEY, -1L);
        int G10 = G(xmlPullParser);
        String attributeValue = xmlPullParser3.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "codecs");
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "scte214:supplementalCodecs");
        String attributeValue4 = xmlPullParser3.getAttributeValue(null, "scte214:supplementalProfiles");
        int X10 = X(xmlPullParser3, "width", -1);
        int X11 = X(xmlPullParser3, "height", -1);
        float V10 = V(xmlPullParser3, -1.0f);
        int X12 = X(xmlPullParser3, "audioSamplingRate", -1);
        String str8 = "lang";
        String attributeValue5 = xmlPullParser3.getAttributeValue(null, "lang");
        String attributeValue6 = xmlPullParser3.getAttributeValue(null, AnnotatedPrivateKey.LABEL);
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = arrayList15;
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        ArrayList arrayList22 = arrayList17;
        ArrayList arrayList23 = new ArrayList();
        String str9 = attributeValue;
        ArrayList arrayList24 = new ArrayList();
        long j21 = j12;
        String str10 = attributeValue4;
        int i17 = X10;
        int i18 = X11;
        float f11 = V10;
        int i19 = G10;
        String str11 = attributeValue5;
        boolean z12 = false;
        int i20 = -1;
        String str12 = null;
        k kVar4 = kVar;
        String str13 = attributeValue3;
        long j22 = j11;
        ?? r32 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            int i21 = i20;
            if (a0.f(xmlPullParser3, "BaseURL")) {
                if (!z12) {
                    j22 = c6034d2.B(xmlPullParser3, j22);
                    z12 = true;
                }
                r32.addAll(c6034d2.C(xmlPullParser3, list, z10));
                ArrayList arrayList25 = arrayList18;
                arrayList5 = arrayList21;
                arrayList11 = arrayList25;
                i20 = i21;
                j22 = j22;
                list2 = r32;
                arrayList6 = arrayList16;
                str = str8;
                arrayList2 = arrayList19;
                kVar2 = kVar4;
                arrayList8 = arrayList24;
                arrayList9 = arrayList23;
                i10 = X12;
                arrayList7 = arrayList20;
                arrayList10 = arrayList22;
            } else {
                long j23 = j22;
                if (a0.f(xmlPullParser3, "ContentProtection")) {
                    Pair F10 = F(xmlPullParser);
                    arrayList = r32;
                    Object obj = F10.first;
                    if (obj != null) {
                        str12 = (String) obj;
                    }
                    Object obj2 = F10.second;
                    if (obj2 != null) {
                        arrayList16.add((DrmInitData.SchemeData) obj2);
                    }
                    ArrayList arrayList26 = arrayList18;
                    arrayList5 = arrayList21;
                    arrayList11 = arrayList26;
                    i20 = i21;
                    arrayList9 = arrayList23;
                    str = str8;
                    arrayList2 = arrayList19;
                    arrayList10 = arrayList22;
                    arrayList8 = arrayList24;
                    j22 = j23;
                    arrayList6 = arrayList16;
                    i10 = X12;
                    kVar2 = kVar4;
                } else {
                    arrayList = r32;
                    if (a0.f(xmlPullParser3, "ContentComponent")) {
                        String q10 = q(str11, xmlPullParser3.getAttributeValue(null, str8));
                        i19 = p(i19, G(xmlPullParser));
                        ArrayList arrayList27 = arrayList18;
                        arrayList5 = arrayList21;
                        arrayList11 = arrayList27;
                        i20 = i21;
                        str11 = q10;
                    } else {
                        if (a0.f(xmlPullParser3, "Role")) {
                            arrayList20.add(I(xmlPullParser3, "Role"));
                        } else if (a0.f(xmlPullParser3, "AudioChannelConfiguration")) {
                            ArrayList arrayList28 = arrayList18;
                            arrayList5 = arrayList21;
                            arrayList11 = arrayList28;
                            i20 = c6034d2.A(xmlPullParser3, attributeValue2);
                        } else if (a0.f(xmlPullParser3, "Accessibility")) {
                            arrayList19.add(I(xmlPullParser3, "Accessibility"));
                        } else if (a0.f(xmlPullParser3, "EssentialProperty")) {
                            arrayList21.add(I(xmlPullParser3, "EssentialProperty"));
                        } else if (a0.f(xmlPullParser3, "SupplementalProperty")) {
                            arrayList23.add(I(xmlPullParser3, "SupplementalProperty"));
                        } else {
                            if (a0.f(xmlPullParser3, "Representation")) {
                                if (arrayList.isEmpty()) {
                                    list3 = list;
                                    arrayList3 = arrayList18;
                                    arrayList12 = arrayList24;
                                    kVar3 = kVar4;
                                    arrayList13 = arrayList23;
                                    xmlPullParser2 = xmlPullParser3;
                                    c6034d = c6034d2;
                                    i14 = i19;
                                    i15 = i17;
                                    j17 = j23;
                                    list2 = arrayList;
                                    arrayList14 = arrayList21;
                                    str = str8;
                                    str4 = str10;
                                    arrayList4 = arrayList22;
                                    i16 = i18;
                                    i20 = i21;
                                    str5 = str11;
                                    f10 = f11;
                                    j18 = j14;
                                    arrayList6 = arrayList16;
                                    str6 = str9;
                                    j19 = j10;
                                    z11 = z10;
                                    str7 = str13;
                                    j20 = j13;
                                } else {
                                    arrayList3 = arrayList18;
                                    arrayList12 = arrayList24;
                                    list3 = arrayList;
                                    kVar3 = kVar4;
                                    arrayList13 = arrayList23;
                                    xmlPullParser2 = xmlPullParser3;
                                    c6034d = c6034d2;
                                    i14 = i19;
                                    i15 = i17;
                                    j17 = j23;
                                    list2 = list3;
                                    i20 = i21;
                                    arrayList14 = arrayList21;
                                    str = str8;
                                    str4 = str10;
                                    arrayList4 = arrayList22;
                                    i16 = i18;
                                    z11 = z10;
                                    str5 = str11;
                                    str7 = str13;
                                    f10 = f11;
                                    j20 = j13;
                                    j18 = j14;
                                    arrayList6 = arrayList16;
                                    str6 = str9;
                                    j19 = j10;
                                }
                                a h02 = c6034d.h0(xmlPullParser2, list3, str6, attributeValue2, str7, str4, i15, i16, f10, i20, X12, str5, arrayList20, arrayList19, arrayList14, arrayList13, kVar3, j20, j19, j17, j21, j18, z11);
                                str9 = str6;
                                str13 = str7;
                                str10 = str4;
                                i18 = i16;
                                f11 = f10;
                                String str14 = str5;
                                ArrayList arrayList29 = arrayList13;
                                kVar2 = kVar3;
                                arrayList7 = arrayList20;
                                arrayList5 = arrayList14;
                                str3 = attributeValue2;
                                arrayList2 = arrayList19;
                                i10 = X12;
                                i17 = i15;
                                i12 = p(i14, AbstractC2335D.k(h02.f62917a.f20543o));
                                ArrayList arrayList30 = arrayList12;
                                arrayList30.add(h02);
                                xmlPullParser3 = xmlPullParser2;
                                j22 = j17;
                                arrayList8 = arrayList30;
                                arrayList9 = arrayList29;
                                str11 = str14;
                            } else {
                                str = str8;
                                arrayList2 = arrayList19;
                                arrayList3 = arrayList18;
                                arrayList4 = arrayList22;
                                ArrayList arrayList31 = arrayList23;
                                arrayList5 = arrayList21;
                                str2 = str11;
                                i10 = X12;
                                ArrayList arrayList32 = arrayList24;
                                i11 = i21;
                                XmlPullParser xmlPullParser4 = xmlPullParser3;
                                C6034d c6034d3 = c6034d2;
                                i12 = i19;
                                j15 = j23;
                                arrayList6 = arrayList16;
                                kVar2 = kVar4;
                                list2 = arrayList;
                                arrayList7 = arrayList20;
                                str3 = attributeValue2;
                                j16 = j21;
                                if (a0.f(xmlPullParser4, "SegmentBase")) {
                                    k.e m02 = c6034d3.m0(xmlPullParser4, (k.e) kVar2);
                                    xmlPullParser3 = xmlPullParser4;
                                    kVar2 = m02;
                                    j21 = j16;
                                    j22 = j15;
                                    arrayList8 = arrayList32;
                                    arrayList9 = arrayList31;
                                    str11 = str2;
                                    i20 = i11;
                                } else if (a0.f(xmlPullParser4, "SegmentList")) {
                                    long B10 = c6034d3.B(xmlPullParser4, j16);
                                    arrayList8 = arrayList32;
                                    xmlPullParser3 = xmlPullParser;
                                    kVar2 = c6034d3.n0(xmlPullParser3, (k.b) kVar2, j13, j10, j15, B10, j14);
                                    j22 = j15;
                                    arrayList9 = arrayList31;
                                    i20 = i11;
                                    i19 = i12;
                                    arrayList10 = arrayList4;
                                    j21 = B10;
                                    str11 = str2;
                                    arrayList11 = arrayList3;
                                    if (!a0.d(xmlPullParser3, "AdaptationSet")) {
                                        break;
                                    }
                                    ArrayList arrayList33 = arrayList5;
                                    arrayList18 = arrayList11;
                                    arrayList21 = arrayList33;
                                    c6034d2 = this;
                                    arrayList24 = arrayList8;
                                    arrayList22 = arrayList10;
                                    arrayList23 = arrayList9;
                                    attributeValue2 = str3;
                                    X12 = i10;
                                    arrayList19 = arrayList2;
                                    arrayList20 = arrayList7;
                                    r32 = list2;
                                    str8 = str;
                                    kVar4 = kVar2;
                                    arrayList16 = arrayList6;
                                } else {
                                    i13 = i12;
                                    xmlPullParser3 = xmlPullParser4;
                                    arrayList8 = arrayList32;
                                    if (a0.f(xmlPullParser3, "SegmentTemplate")) {
                                        long B11 = c6034d3.B(xmlPullParser3, j16);
                                        arrayList9 = arrayList31;
                                        kVar2 = c6034d3.o0(xmlPullParser3, (k.c) kVar2, arrayList9, j13, j10, j15, B11, j14);
                                        j22 = j15;
                                        i19 = i13;
                                        arrayList11 = arrayList3;
                                        arrayList10 = arrayList4;
                                        j21 = B11;
                                        str11 = str2;
                                        i20 = i11;
                                        if (!a0.d(xmlPullParser3, "AdaptationSet")) {
                                        }
                                    } else {
                                        arrayList9 = arrayList31;
                                        if (a0.f(xmlPullParser3, "InbandEventStream")) {
                                            arrayList10 = arrayList4;
                                            arrayList10.add(I(xmlPullParser3, "InbandEventStream"));
                                            arrayList11 = arrayList3;
                                        } else {
                                            arrayList10 = arrayList4;
                                            if (a0.f(xmlPullParser3, "Label")) {
                                                arrayList11 = arrayList3;
                                                arrayList11.add(Y(xmlPullParser));
                                            } else {
                                                arrayList11 = arrayList3;
                                                if (a0.e(xmlPullParser3)) {
                                                    z(xmlPullParser);
                                                }
                                            }
                                        }
                                        i19 = i13;
                                        j21 = j16;
                                        j22 = j15;
                                        str11 = str2;
                                        i20 = i11;
                                        if (!a0.d(xmlPullParser3, "AdaptationSet")) {
                                        }
                                    }
                                }
                            }
                            arrayList11 = arrayList3;
                            arrayList10 = arrayList4;
                            i19 = i12;
                            if (!a0.d(xmlPullParser3, "AdaptationSet")) {
                            }
                        }
                        arrayList6 = arrayList16;
                        kVar2 = kVar4;
                        arrayList7 = arrayList20;
                        str3 = attributeValue2;
                        j16 = j21;
                        i13 = i19;
                        j15 = j23;
                        ArrayList arrayList34 = arrayList18;
                        arrayList5 = arrayList21;
                        arrayList11 = arrayList34;
                        str = str8;
                        arrayList2 = arrayList19;
                        arrayList8 = arrayList24;
                        list2 = arrayList;
                        i11 = i21;
                        arrayList9 = arrayList23;
                        i10 = X12;
                        arrayList10 = arrayList22;
                        str2 = str11;
                        i19 = i13;
                        j21 = j16;
                        j22 = j15;
                        str11 = str2;
                        i20 = i11;
                        if (!a0.d(xmlPullParser3, "AdaptationSet")) {
                        }
                    }
                    str = str8;
                    arrayList2 = arrayList19;
                    arrayList8 = arrayList24;
                    j22 = j23;
                    arrayList9 = arrayList23;
                    arrayList6 = arrayList16;
                    i10 = X12;
                    kVar2 = kVar4;
                    arrayList10 = arrayList22;
                }
                list2 = arrayList;
                arrayList7 = arrayList20;
            }
            str3 = attributeValue2;
            if (!a0.d(xmlPullParser3, "AdaptationSet")) {
            }
        }
        ArrayList arrayList35 = new ArrayList(arrayList8.size());
        int i22 = 0;
        while (i22 < arrayList8.size()) {
            ArrayList arrayList36 = arrayList10;
            ArrayList arrayList37 = arrayList11;
            String str15 = attributeValue6;
            arrayList35.add(j((a) arrayList8.get(i22), str15, arrayList37, str12, arrayList6, arrayList36));
            i22++;
            attributeValue6 = str15;
            arrayList10 = arrayList36;
            arrayList11 = arrayList37;
        }
        return c(a02, i19, arrayList35, arrayList2, arrayList5, arrayList9);
    }

    public n y0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    public void z(XmlPullParser xmlPullParser) {
        w(xmlPullParser);
    }

    public o z0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, EventKeys.VALUE_KEY));
    }
}
