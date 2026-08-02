package defpackage;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class sjc {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        uif g;
        int b2;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (g = g(str2)) != null && (b2 = g.b()) != 0 && b2 != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : nik.f0(str)) {
            String e = e(str2);
            if (e != null && k(e)) {
                return e;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] f0 = nik.f0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : f0) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        uif g;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (g = g(str2)) == null) {
                    return 0;
                }
                return g.b();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
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

    public static String e(String str) {
        uif g;
        String str2 = null;
        if (str != null) {
            String W = rz8.W(str.trim());
            if (W.startsWith("avc1") || W.startsWith("avc3")) {
                return "video/avc";
            }
            if (W.startsWith("hev1") || W.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (W.startsWith("vvc1") || W.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (W.startsWith("dvav") || W.startsWith("dva1") || W.startsWith("dvhe") || W.startsWith("dvh1") || W.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (W.startsWith("av01")) {
                return MimeTypes.VIDEO_AV1;
            }
            if (W.startsWith("vp9") || W.startsWith("vp09")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9;
            }
            if (W.startsWith("vp8") || W.startsWith("vp08")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8;
            }
            if (W.startsWith("mp4a")) {
                if (W.startsWith("mp4a.") && (g = g(W)) != null) {
                    str2 = f(g.b);
                }
                return str2 == null ? com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC : str2;
            }
            if (W.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (W.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (W.startsWith("ac-3") || W.startsWith("dac3")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3;
            }
            if (W.startsWith("ec-3") || W.startsWith("dec3")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3;
            }
            if (W.startsWith("ec+3")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3_JOC;
            }
            if (W.startsWith("ac-4") || W.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (W.startsWith("dtsc")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS;
            }
            if (W.startsWith("dtse")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_EXPRESS;
            }
            if (W.startsWith("dtsh") || W.startsWith("dtsl")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_HD;
            }
            if (W.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (W.startsWith("opus")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS;
            }
            if (W.startsWith("vorbis")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS;
            }
            if (W.startsWith("flac")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_FLAC;
            }
            if (W.startsWith("stpp")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML;
            }
            if (W.startsWith("wvtt")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.TEXT_VTT;
            }
            if (W.contains("cea708")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708;
            }
            if (W.contains("eia608") || W.contains("cea608")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608;
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                pvd.j();
                return null;
            }
        }
        return null;
    }

    public static String f(int i) {
        if (i == 32) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9;
        }
        if (i == 221) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS;
        }
        if (i == 165) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG;
            case 106:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_HD;
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static uif g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new uif(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 7);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (o(str)) {
            return 2;
        }
        if (n(str)) {
            return 3;
        }
        if (m(str)) {
            return 4;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_ID3.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_EMSG.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        pvd.j();
        return 0;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : nik.f0(str)) {
            String e = e(str2);
            if (e != null && o(e)) {
                return e;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean m(String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean n(String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TX3G.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4VTT.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_RAWCC.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_PGS.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean o(String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        String W;
        if (str == null) {
            return null;
        }
        W = rz8.W(str);
        W.getClass();
        switch (W) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_FLAC;
            case "application/x-mpegurl":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_M3U8;
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG_L1;
            case "audio/mpeg-l2":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG_L2;
            case "audio/mp3":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG;
            default:
                return W;
        }
    }
}
