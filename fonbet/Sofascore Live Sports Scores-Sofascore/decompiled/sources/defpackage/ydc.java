package defpackage;

import com.ironsource.C4427z5;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ydc {
    public static final iv9 f;
    public static final zo2 g;
    public static final HashMap h;
    public static final ydc i;
    public static final dad j;
    public final String a;
    public final String b;
    public final iv9 c;
    public String d;
    public int e;

    static {
        iv9 iv9Var;
        String W = rz8.W(StandardCharsets.UTF_8.name());
        yqo.v(C4427z5.N, W);
        o53 d = o53.d();
        vu9 vu9Var = (vu9) d.get(C4427z5.N);
        if (vu9Var == null) {
            vu9Var = hv9.t(4);
            d.put(C4427z5.N, vu9Var);
        }
        vu9Var.a(W);
        Collection entrySet = d.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            iv9Var = hm5.g;
        } else {
            m53 m53Var = (m53) entrySet;
            b10 b10Var = new b10(m53Var.b.size());
            Iterator it = m53Var.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                vvf g2 = ((zu9) entry.getValue()).g();
                b10Var.A(key, g2);
                i2 += g2.d;
            }
            iv9Var = new iv9(b10Var.c(true), i2);
        }
        f = iv9Var;
        ap2 ap2Var = ap2.d;
        ap2 ap2Var2 = ap2.e;
        ap2Var2.getClass();
        gp2 gp2Var = new gp2(ap2Var2);
        ap2Var.getClass();
        g = new zo2(new zo2(new zo2(ap2Var, gp2Var), new dp2(' ', 1)), ip2.a("()<>@,;:\\\"/[]?=").c());
        ip2.a("\"\\\r").c().getClass();
        ip2.a(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        i = b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new dad(new ih2("; "), 29);
    }

    public ydc(String str, String str2, iv9 iv9Var) {
        this.a = str;
        this.b = str2;
        this.c = iv9Var;
    }

    public static void a(String str, String str2) {
        ydc ydcVar = new ydc(str, str2, hm5.g);
        h.put(ydcVar, ydcVar);
    }

    public static ydc b(String str, String str2) {
        ydc ydcVar = new ydc(str, str2, f);
        h.put(ydcVar, ydcVar);
        StandardCharsets.UTF_8.getClass();
        return ydcVar;
    }

    public final qub c() {
        return new qub(this.c.d(), new de0(new m72(13), 28));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ydc)) {
            return false;
        }
        ydc ydcVar = (ydc) obj;
        return this.a.equals(ydcVar.a) && this.b.equals(ydcVar.b) && c().equals(ydcVar.c());
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
        this.e = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        iv9 iv9Var = this.c;
        if (iv9Var.f != 0) {
            sb.append("; ");
            Collection l = new bzc(iv9Var, new de0(new m72(12), 28)).l();
            dad dadVar = j;
            dadVar.getClass();
            try {
                dadVar.t(sb, l.iterator());
            } catch (IOException e) {
                a70.j(e);
                return null;
            }
        }
        String sb2 = sb.toString();
        this.d = sb2;
        return sb2;
    }
}
