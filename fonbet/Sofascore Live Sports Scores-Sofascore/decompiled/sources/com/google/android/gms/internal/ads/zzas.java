package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.pvd;
import defpackage.zid;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzas {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str) {
        return "audio".equals(j(str));
    }

    public static boolean b(String str) {
        return "video".equals(j(str));
    }

    public static boolean c(String str) {
        return "image".equals(j(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean d(String str, String str2) {
        zid i;
        int c;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                }
                break;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                }
                break;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                }
                break;
            case -1265048566:
                if (str.equals(MimeTypes.APPLICATION_CAMERA_MOTION)) {
                }
                break;
            case -1248341703:
                if (str.equals(MimeTypes.APPLICATION_ID3)) {
                }
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                }
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                }
                break;
            case -53558318:
                if (!str.equals(MimeTypes.AUDIO_AAC) || str2 == null || (i = i(str2)) == null || (c = i.c()) == 0 || c == 16) {
                }
                break;
            case -43764892:
                if (str.equals("application/meta")) {
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                }
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                }
                break;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                }
                break;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                }
                break;
            case 1154383568:
                if (str.equals(MimeTypes.APPLICATION_EMSG)) {
                }
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                }
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                }
                break;
            case 1652648887:
                if (str.equals(MimeTypes.APPLICATION_SCTE35)) {
                }
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                }
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                }
                break;
        }
        return false;
    }

    public static String e(int i) {
        if (i == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if ("text".equals(j(str)) || "application/x-media3-cues".equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if (c(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(String str, String str2) {
        zid i;
        switch (str.hashCode()) {
            case -2123537834:
                return str.equals(MimeTypes.AUDIO_E_AC3_JOC) ? 18 : 0;
            case -1365340241:
                if (str.equals(MimeTypes.AUDIO_DTS_EXPRESS)) {
                    return 8;
                }
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    return 7;
                }
                break;
            case -53558318:
                if (!str.equals(MimeTypes.AUDIO_AAC) || str2 == null || (i = i(str2)) == null) {
                    return 0;
                }
                return i.c();
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    return 5;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    return 17;
                }
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    return 31;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    return 30;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    return 6;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    return 9;
                }
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    return 20;
                }
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    return 8;
                }
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    return 14;
                }
                break;
        }
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        String a2 = zzgts.a(str);
        switch (a2.hashCode()) {
            case -1833600100:
                return a2.equals("video/x-mvhevc") ? "video/mv-hevc" : a2;
            case -1007807498:
                return a2.equals("audio/x-flac") ? MimeTypes.AUDIO_FLAC : a2;
            case -979095690:
                return a2.equals("application/x-mpegurl") ? MimeTypes.APPLICATION_M3U8 : a2;
            case -586683234:
                return a2.equals("audio/x-wav") ? "audio/wav" : a2;
            case -432836268:
                return a2.equals("audio/mpeg-l1") ? MimeTypes.AUDIO_MPEG_L1 : a2;
            case -432836267:
                return a2.equals("audio/mpeg-l2") ? MimeTypes.AUDIO_MPEG_L2 : a2;
            case 187090231:
                return a2.equals("audio/mp3") ? MimeTypes.AUDIO_MPEG : a2;
            default:
                return a2;
        }
    }

    public static zid i(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            Integer.parseInt(group, 16);
            return new zid(group2 != null ? Integer.parseInt(group2) : 0, 15);
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
}
