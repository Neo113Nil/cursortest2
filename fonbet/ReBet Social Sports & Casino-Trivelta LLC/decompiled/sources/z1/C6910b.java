package z1;

import D1.o;
import H1.AbstractC1168a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import b1.C2338G;
import b2.p;
import b2.u;
import com.twilio.voice.OpusCodec;
import e1.AbstractC4134a;
import e1.AbstractC4144k;
import e1.Z;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import z1.C6909a;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6910b implements o.a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f68493a;

    /* renamed from: z1.b$b, reason: collision with other inner class name */
    public static class C0979b extends C2338G {
        public C0979b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* renamed from: z1.b$c */
    public static class c extends a {

        /* renamed from: e, reason: collision with root package name */
        public boolean f68498e;

        /* renamed from: f, reason: collision with root package name */
        public UUID f68499f;
        private byte[] initData;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static u[] q(byte[] bArr) {
            return new u[]{new u(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        public static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // z1.C6910b.a
        public Object b() {
            UUID uuid = this.f68499f;
            return new C6909a.C0978a(uuid, p.a(uuid, this.initData), q(this.initData));
        }

        @Override // z1.C6910b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // z1.C6910b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f68498e = false;
            }
        }

        @Override // z1.C6910b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f68498e = true;
                this.f68499f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // z1.C6910b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f68498e) {
                this.initData = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: z1.b$d */
    public static class d extends a {

        /* renamed from: e, reason: collision with root package name */
        public androidx.media3.common.a f68500e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] T10 = Z.T(str);
                byte[][] H10 = AbstractC4144k.H(T10);
                if (H10 == null) {
                    arrayList.add(T10);
                    return arrayList;
                }
                Collections.addAll(arrayList, H10);
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase(OpusCodec.NAME)) {
                return "audio/opus";
            }
            return null;
        }

        @Override // z1.C6910b.a
        public Object b() {
            return this.f68500e;
        }

        @Override // z1.C6910b.a
        public void n(XmlPullParser xmlPullParser) {
            int i10;
            a.b bVar = new a.b();
            String r10 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.W("video/mp4").F0(k(xmlPullParser, "MaxWidth")).h0(k(xmlPullParser, "MaxHeight")).k0(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r10 == null) {
                    r10 = "audio/mp4a-latm";
                }
                int k10 = k(xmlPullParser, "Channels");
                int k11 = k(xmlPullParser, "SamplingRate");
                List q10 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q10.isEmpty() && "audio/mp4a-latm".equals(r10)) {
                    q10 = Collections.singletonList(AbstractC1168a.a(k11, k10));
                }
                bVar.W("audio/mp4").T(k10).z0(k11).k0(q10);
            } else if (intValue == 3) {
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = 1024;
                    }
                    bVar.W("application/mp4").w0(i10);
                }
                i10 = 0;
                bVar.W("application/mp4").w0(i10);
            } else {
                bVar.W("application/mp4");
            }
            this.f68500e = bVar.j0(xmlPullParser.getAttributeValue(null, "Index")).l0((String) c("Name")).y0(r10).S(k(xmlPullParser, "Bitrate")).n0((String) c("Language")).P();
        }
    }

    /* renamed from: z1.b$e */
    public static class e extends a {

        /* renamed from: e, reason: collision with root package name */
        public final List f68501e;

        /* renamed from: f, reason: collision with root package name */
        public int f68502f;

        /* renamed from: g, reason: collision with root package name */
        public int f68503g;

        /* renamed from: h, reason: collision with root package name */
        public long f68504h;

        /* renamed from: i, reason: collision with root package name */
        public long f68505i;

        /* renamed from: j, reason: collision with root package name */
        public long f68506j;

        /* renamed from: k, reason: collision with root package name */
        public int f68507k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f68508l;

        /* renamed from: m, reason: collision with root package name */
        public C6909a.C0978a f68509m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f68507k = -1;
            this.f68509m = null;
            this.f68501e = new LinkedList();
        }

        @Override // z1.C6910b.a
        public void a(Object obj) {
            if (obj instanceof C6909a.b) {
                this.f68501e.add((C6909a.b) obj);
            } else if (obj instanceof C6909a.C0978a) {
                AbstractC4134a.g(this.f68509m == null);
                this.f68509m = (C6909a.C0978a) obj;
            }
        }

        @Override // z1.C6910b.a
        public Object b() {
            int size = this.f68501e.size();
            C6909a.b[] bVarArr = new C6909a.b[size];
            this.f68501e.toArray(bVarArr);
            if (this.f68509m != null) {
                C6909a.C0978a c0978a = this.f68509m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0978a.f68478a, "video/mp4", c0978a.data));
                for (int i10 = 0; i10 < size; i10++) {
                    C6909a.b bVar = bVarArr[i10];
                    int i11 = bVar.f68479a;
                    if (i11 == 2 || i11 == 1) {
                        androidx.media3.common.a[] aVarArr = bVar.formats;
                        for (int i12 = 0; i12 < aVarArr.length; i12++) {
                            aVarArr[i12] = aVarArr[i12].b().c0(drmInitData).P();
                        }
                    }
                }
            }
            return new C6909a(this.f68502f, this.f68503g, this.f68504h, this.f68505i, this.f68506j, this.f68507k, this.f68508l, this.f68509m, bVarArr);
        }

        @Override // z1.C6910b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f68502f = k(xmlPullParser, "MajorVersion");
            this.f68503g = k(xmlPullParser, "MinorVersion");
            this.f68504h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f68505i = l(xmlPullParser, "Duration");
            this.f68506j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f68507k = i(xmlPullParser, "LookaheadCount", -1);
            this.f68508l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f68504h));
        }
    }

    /* renamed from: z1.b$f */
    public static class f extends a {

        /* renamed from: e, reason: collision with root package name */
        public final String f68510e;

        /* renamed from: f, reason: collision with root package name */
        public final List f68511f;

        /* renamed from: g, reason: collision with root package name */
        public int f68512g;

        /* renamed from: h, reason: collision with root package name */
        public String f68513h;

        /* renamed from: i, reason: collision with root package name */
        public long f68514i;

        /* renamed from: j, reason: collision with root package name */
        public String f68515j;

        /* renamed from: k, reason: collision with root package name */
        public String f68516k;

        /* renamed from: l, reason: collision with root package name */
        public int f68517l;

        /* renamed from: m, reason: collision with root package name */
        public int f68518m;

        /* renamed from: n, reason: collision with root package name */
        public int f68519n;

        /* renamed from: o, reason: collision with root package name */
        public int f68520o;

        /* renamed from: p, reason: collision with root package name */
        public String f68521p;

        /* renamed from: q, reason: collision with root package name */
        public ArrayList f68522q;

        /* renamed from: r, reason: collision with root package name */
        public long f68523r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f68510e = str;
            this.f68511f = new LinkedList();
        }

        @Override // z1.C6910b.a
        public void a(Object obj) {
            if (obj instanceof androidx.media3.common.a) {
                this.f68511f.add((androidx.media3.common.a) obj);
            }
        }

        @Override // z1.C6910b.a
        public Object b() {
            androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[this.f68511f.size()];
            this.f68511f.toArray(aVarArr);
            return new C6909a.b(this.f68510e, this.f68516k, this.f68512g, this.f68513h, this.f68514i, this.f68515j, this.f68517l, this.f68518m, this.f68519n, this.f68520o, this.f68521p, aVarArr, this.f68522q, this.f68523r);
        }

        @Override // z1.C6910b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // z1.C6910b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) {
            int s10 = s(xmlPullParser);
            this.f68512g = s10;
            p("Type", Integer.valueOf(s10));
            if (this.f68512g == 3) {
                this.f68513h = m(xmlPullParser, "Subtype");
            } else {
                this.f68513h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f68513h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f68515j = attributeValue;
            p("Name", attributeValue);
            this.f68516k = m(xmlPullParser, "Url");
            this.f68517l = i(xmlPullParser, "MaxWidth", -1);
            this.f68518m = i(xmlPullParser, "MaxHeight", -1);
            this.f68519n = i(xmlPullParser, "DisplayWidth", -1);
            this.f68520o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f68521p = attributeValue2;
            p("Language", attributeValue2);
            long i10 = i(xmlPullParser, "TimeScale", -1);
            this.f68514i = i10;
            if (i10 == -1) {
                this.f68514i = ((Long) c("TimeScale")).longValue();
            }
            this.f68522q = new ArrayList();
        }

        public final void r(XmlPullParser xmlPullParser) {
            int size = this.f68522q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else {
                    if (this.f68523r == -1) {
                        throw C2338G.c("Unable to infer start time", null);
                    }
                    j10 = this.f68523r + ((Long) this.f68522q.get(size - 1)).longValue();
                }
            }
            this.f68522q.add(Long.valueOf(j10));
            this.f68523r = j(xmlPullParser, W9.d.f13160a, -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1L);
            if (j11 > 1 && this.f68523r == -9223372036854775807L) {
                throw C2338G.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f68522q.add(Long.valueOf((this.f68523r * j12) + j10));
                i10++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0979b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw C2338G.c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public C6910b() {
        try {
            this.f68493a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // D1.o.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6909a a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f68493a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C6909a) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw C2338G.c(null, e10);
        }
    }

    /* renamed from: z1.b$a */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f68494a;

        /* renamed from: b, reason: collision with root package name */
        public final String f68495b;

        /* renamed from: c, reason: collision with root package name */
        public final a f68496c;

        /* renamed from: d, reason: collision with root package name */
        public final List f68497d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f68496c = aVar;
            this.f68494a = str;
            this.f68495b = str2;
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i10 = 0; i10 < this.f68497d.size(); i10++) {
                Pair pair = (Pair) this.f68497d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f68496c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f68495b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e10 = e(this, name, this.f68494a);
                            if (e10 == null) {
                                i10 = 1;
                            } else {
                                a(e10.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw C2338G.c(null, e10);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw C2338G.c(null, e10);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0979b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw C2338G.c(null, e10);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0979b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw C2338G.c(null, e10);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0979b(str);
        }

        public abstract void n(XmlPullParser xmlPullParser);

        public final void p(String str, Object obj) {
            this.f68497d.add(Pair.create(str, obj));
        }

        public void a(Object obj) {
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public void o(XmlPullParser xmlPullParser) {
        }
    }
}
