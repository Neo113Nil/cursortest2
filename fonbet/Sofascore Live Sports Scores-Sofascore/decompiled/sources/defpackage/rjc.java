package defpackage;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class rjc {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int a(String str, String str2) {
        uif d;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (d = d(str2)) == null) {
                    return 0;
                }
                return d.b();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String b(String str) {
        uif d;
        String str2 = null;
        if (str != null) {
            String W = rz8.W(str.trim());
            if (W.startsWith("avc1") || W.startsWith("avc3")) {
                return "video/avc";
            }
            if (W.startsWith("hev1") || W.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (W.startsWith("dvav") || W.startsWith("dva1") || W.startsWith("dvhe") || W.startsWith("dvh1")) {
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
                if (W.startsWith("mp4a.") && (d = d(W)) != null) {
                    str2 = c(d.b);
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

    public static String c(int i) {
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

    public static uif d(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new uif(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 6);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String e(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (i(str)) {
            return 2;
        }
        if (h(str)) {
            return 3;
        }
        if ("image".equals(e(str))) {
            return 4;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_ID3.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_EMSG.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SCTE35.equals(str)) {
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

    public static boolean g(String str) {
        return "audio".equals(e(str));
    }

    public static boolean h(String str) {
        return "text".equals(e(str)) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TX3G.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4VTT.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_RAWCC.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_PGS.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean i(String str) {
        return "video".equals(e(str));
    }
}
