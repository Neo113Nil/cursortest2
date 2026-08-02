package b1;

import android.text.TextUtils;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.twilio.voice.OpusCodec;
import e1.AbstractC4134a;
import e1.Z;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: b1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2335D {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f24294a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f24295b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: b1.D$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24296a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24297b;

        public a(int i10, int i11) {
            this.f24296a = i10;
            this.f24297b = i11;
        }

        public int a() {
            int i10 = this.f24297b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        a i10;
        int a10;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (i10 = i(str2)) != null && (a10 = i10.a()) != 0 && a10 != 16) {
                }
                break;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Z.C1(str)) {
            String g10 = g(str2);
            if (g10 != null && o(g10)) {
                return g10;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str != null && str2 != null) {
            String[] C12 = Z.C1(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : C12) {
                if (str2.equals(g(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static String e(String str) {
        ArrayList arrayList = f24294a;
        if (arrayList.size() <= 0) {
            return null;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    public static int f(String str, String str2) {
        a i10;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (i10 = i(str2)) == null) {
                    return 0;
                }
                return i10.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        a i10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e10 = Ra.c.e(str.trim());
        if (e10.startsWith("avc1") || e10.startsWith("avc3")) {
            return "video/avc";
        }
        if (e10.startsWith("hev1") || e10.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e10.startsWith("dvav") || e10.startsWith("dva1") || e10.startsWith("dvhe") || e10.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e10.startsWith("av01")) {
            return "video/av01";
        }
        if (e10.startsWith("vp9") || e10.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e10.startsWith("vp8") || e10.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!e10.startsWith("mp4a")) {
            return e10.startsWith("mha1") ? "audio/mha1" : e10.startsWith("mhm1") ? "audio/mhm1" : (e10.startsWith("ac-3") || e10.startsWith("dac3")) ? "audio/ac3" : (e10.startsWith("ec-3") || e10.startsWith("dec3")) ? "audio/eac3" : e10.startsWith("ec+3") ? "audio/eac3-joc" : (e10.startsWith("ac-4") || e10.startsWith("dac4")) ? "audio/ac4" : e10.startsWith("dtsc") ? "audio/vnd.dts" : e10.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (e10.startsWith("dtsh") || e10.startsWith("dtsl")) ? "audio/vnd.dts.hd" : e10.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : e10.startsWith(OpusCodec.NAME) ? "audio/opus" : e10.startsWith("vorbis") ? "audio/vorbis" : e10.startsWith("flac") ? "audio/flac" : e10.startsWith("stpp") ? "application/ttml+xml" : e10.startsWith("wvtt") ? "text/vtt" : e10.contains("cea708") ? "application/cea-708" : (e10.contains("eia608") || e10.contains("cea608")) ? "application/cea-608" : e(e10);
        }
        if (e10.startsWith("mp4a.") && (i10 = i(e10)) != null) {
            str2 = h(i10.f24296a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return ClipboardModule.MIMETYPE_JPEG;
            default:
                switch (i10) {
                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                        return "audio/vnd.dts";
                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                        return "audio/vnd.dts.hd";
                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                        return "audio/opus";
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static a i(String str) {
        Matcher matcher = f24295b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) AbstractC4134a.e(matcher.group(1));
        String group = matcher.group(2);
        try {
            return new a(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (o(str)) {
            return 1;
        }
        if (t(str)) {
            return 2;
        }
        if (s(str)) {
            return 3;
        }
        if (q(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return l(str);
    }

    public static int l(String str) {
        ArrayList arrayList = f24294a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    public static int m(String str) {
        return k(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Z.C1(str)) {
            String g10 = g(str2);
            if (g10 != null && t(g10)) {
                return g10;
            }
        }
        return null;
    }

    public static boolean o(String str) {
        return "audio".equals(j(str));
    }

    public static boolean p(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean q(String str) {
        return "image".equals(j(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean r(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean s(String str) {
        return "text".equals(j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean t(String str) {
        return "video".equals(j(str));
    }

    public static String u(String str) {
        String e10;
        if (str == null) {
            return null;
        }
        e10 = Ra.c.e(str);
        e10.getClass();
        switch (e10) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return e10;
        }
    }
}
