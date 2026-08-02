package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzas {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return "audio".equals(zzj(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzj(str));
    }

    public static boolean zzc(String str) {
        return "image".equals(zzj(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzd(String str, String str2) {
        char c;
        zzar zzi;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1354451219:
                if (str.equals(MimeTypes.APPLICATION_AIT)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1348231605:
                if (str.equals(MimeTypes.APPLICATION_ICY)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1265048566:
                if (str.equals(MimeTypes.APPLICATION_CAMERA_MOTION)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1248341703:
                if (str.equals(MimeTypes.APPLICATION_ID3)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -43764892:
                if (str.equals("application/meta")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1154383568:
                if (str.equals(MimeTypes.APPLICATION_EMSG)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1652648887:
                if (str.equals(MimeTypes.APPLICATION_SCTE35)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 20:
                if (str2 != null && (zzi = zzi(str2)) != null && (zza2 = zzi.zza()) != 0 && zza2 != 16) {
                }
                break;
        }
        return false;
    }

    public static String zze(int i) {
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
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return MimeTypes.AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    public static int zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzj(str)) || "application/x-media3-cues".equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if (zzc(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzaq zzaqVar = (zzaq) arrayList.get(i);
            String str2 = zzaqVar.zza;
            if (str.equals(null)) {
                int i2 = zzaqVar.zzb;
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzg(String str, String str2) {
        char c;
        zzar zzi;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1365340241:
                if (str.equals(MimeTypes.AUDIO_DTS_EXPRESS)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals(MimeTypes.AUDIO_AC4)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 550520934:
                if (str.equals(MimeTypes.AUDIO_DTS_X)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (zzi = zzi(str2)) == null) {
                    return 0;
                }
                return zzi.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            case '\f':
                return 31;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzh(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String zza2 = zzgsf.zza(str);
        switch (zza2.hashCode()) {
            case -1833600100:
                if (zza2.equals("video/x-mvhevc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1007807498:
                if (zza2.equals("audio/x-flac")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -979095690:
                if (zza2.equals("application/x-mpegurl")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -586683234:
                if (zza2.equals("audio/x-wav")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -432836268:
                if (zza2.equals("audio/mpeg-l1")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -432836267:
                if (zza2.equals("audio/mpeg-l2")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187090231:
                if (zza2.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "video/mv-hevc";
            case 1:
                return MimeTypes.AUDIO_FLAC;
            case 2:
                return MimeTypes.AUDIO_MPEG;
            case 3:
                return MimeTypes.AUDIO_WAV;
            case 4:
                return MimeTypes.APPLICATION_M3U8;
            case 5:
                return MimeTypes.AUDIO_MPEG_L1;
            case 6:
                return MimeTypes.AUDIO_MPEG_L2;
            default:
                return zza2;
        }
    }

    static zzar zzi(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new zzar(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String zzj(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
