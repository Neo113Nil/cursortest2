package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.text.TextUtils;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;

/* loaded from: classes12.dex */
public abstract class i {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith(VisualSampleEntry.TYPE3) || trim.startsWith(VisualSampleEntry.TYPE4)) {
            return "video/avc";
        }
        if (trim.startsWith(VisualSampleEntry.TYPE7) || trim.startsWith(VisualSampleEntry.TYPE6)) {
            return "video/hevc";
        }
        if (trim.startsWith(PeerVideoSettingsBitrateTable.CODEC_VP9)) {
            return MimeTypes.VIDEO_VP9;
        }
        if (trim.startsWith(PeerVideoSettingsBitrateTable.CODEC_VP8)) {
            return MimeTypes.VIDEO_VP8;
        }
        if (trim.startsWith(AudioSampleEntry.TYPE3)) {
            return "audio/mp4a-latm";
        }
        if (trim.startsWith(AudioSampleEntry.TYPE8) || trim.startsWith(AC3SpecificBox.TYPE)) {
            return MimeTypes.AUDIO_AC3;
        }
        if (trim.startsWith(AudioSampleEntry.TYPE9) || trim.startsWith(EC3SpecificBox.TYPE)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (trim.startsWith("dtsc") || trim.startsWith(AudioSampleEntry.TYPE13)) {
            return MimeTypes.AUDIO_DTS;
        }
        if (trim.startsWith(AudioSampleEntry.TYPE12) || trim.startsWith(AudioSampleEntry.TYPE11)) {
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
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
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
