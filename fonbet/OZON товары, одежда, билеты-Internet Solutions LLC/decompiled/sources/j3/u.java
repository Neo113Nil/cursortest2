package j3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.maplibre.android.log.Logger;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f69335a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f69336b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f69337c = 0;

    /* loaded from: classes8.dex */
    private static final class a {
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f69338a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69339b;

        public b(int i11, int i12) {
            this.f69338a = i11;
            this.f69339b = i12;
        }

        public final int a() {
            int i11 = this.f69339b;
            if (i11 == 2) {
                return 10;
            }
            if (i11 == 5) {
                return 11;
            }
            if (i11 == 29) {
                return 12;
            }
            if (i11 == 42) {
                return 16;
            }
            if (i11 != 22) {
                return i11 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        b f7;
        int a11;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (f7 = f(str2)) != null && (a11 = f7.a()) != 0 && a11 != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] d02 = m3.N.d0(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : d02) {
                if (str2.equals(d(str3))) {
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

    public static int c(String str, String str2) {
        b f7;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (f7 = f(str2)) == null) {
                    return 0;
                }
                return f7.a();
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

    public static String d(String str) {
        b f7;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String b11 = O7.b.b(str.trim());
        if (b11.startsWith("avc1") || b11.startsWith("avc3")) {
            return "video/avc";
        }
        if (b11.startsWith("hev1") || b11.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (b11.startsWith("dvav") || b11.startsWith("dva1") || b11.startsWith("dvhe") || b11.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (b11.startsWith("av01")) {
            return "video/av01";
        }
        if (b11.startsWith("vp9") || b11.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (b11.startsWith("vp8") || b11.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (b11.startsWith("mp4a")) {
            if (b11.startsWith("mp4a.") && (f7 = f(b11)) != null) {
                str2 = e(f7.f69338a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (b11.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (b11.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (b11.startsWith("ac-3") || b11.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (b11.startsWith("ec-3") || b11.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (b11.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (b11.startsWith("ac-4") || b11.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (b11.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (b11.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (b11.startsWith("dtsh") || b11.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (b11.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (b11.startsWith("opus")) {
            return "audio/opus";
        }
        if (b11.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (b11.startsWith("flac")) {
            return "audio/flac";
        }
        if (b11.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (b11.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (b11.contains("cea708")) {
            return "application/cea-708";
        }
        if (b11.contains("eia608") || b11.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList<a> arrayList = f69335a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).getClass();
            if (b11.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    public static String e(int i11) {
        if (i11 == 32) {
            return "video/mp4v-es";
        }
        if (i11 == 33) {
            return "video/avc";
        }
        if (i11 == 35) {
            return "video/hevc";
        }
        if (i11 == 64) {
            return "audio/mp4a-latm";
        }
        if (i11 == 163) {
            return "video/wvc1";
        }
        if (i11 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i11 == 221) {
            return "audio/vorbis";
        }
        if (i11 == 165) {
            return "audio/ac3";
        }
        if (i11 == 166) {
            return "audio/eac3";
        }
        switch (i11) {
            case 96:
            case 97:
            case 98:
            case Logger.NONE /* 99 */:
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
                return "image/jpeg";
            default:
                switch (i11) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    static b f(String str) {
        Matcher matcher = f69336b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if (j(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList<a> arrayList = f69335a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static boolean i(String str) {
        return "audio".equals(g(str));
    }

    public static boolean j(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean k(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return "video".equals(g(str));
    }

    public static String m(String str) {
        String b11;
        if (str == null) {
            return null;
        }
        b11 = O7.b.b(str);
        b11.getClass();
        switch (b11) {
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
                return b11;
        }
    }
}
