package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class i {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            return "video/avc";
        }
        if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (trim.startsWith("vp9")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (trim.startsWith("vp8")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (trim.startsWith("mp4a")) {
            return MimeTypes.AUDIO_AAC;
        }
        if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            return MimeTypes.AUDIO_AC3;
        }
        if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            return MimeTypes.AUDIO_DTS;
        }
        if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            return MimeTypes.AUDIO_DTS_HD;
        }
        if (trim.startsWith("opus")) {
            return MimeTypes.AUDIO_OPUS;
        }
        if (trim.startsWith("vorbis")) {
            return MimeTypes.AUDIO_VORBIS;
        }
        return null;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        a70.p("Invalid mime type: ".concat(str));
        return null;
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(b(str))) {
            return 1;
        }
        if ("video".equals(b(str))) {
            return 2;
        }
        if ("text".equals(b(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        return (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) ? 4 : -1;
    }
}
