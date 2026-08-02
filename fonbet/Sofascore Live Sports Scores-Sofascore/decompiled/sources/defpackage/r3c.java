package defpackage;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class r3c {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        int i = 7;
        int i2 = 0;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (lik.a < 26 && lik.b.equals("R9") && arrayList.size() == 1 && ((z2c) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(z2c.g("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, false));
            }
            Collections.sort(arrayList, new rs2(new sw9(29), i));
        }
        int i3 = lik.a;
        if (i3 < 21 && arrayList.size() > 1) {
            String str2 = ((z2c) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new rs2(new i3c(i2), i));
            }
        }
        if (i3 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((z2c) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((z2c) arrayList.remove(0));
    }

    public static String b(sm8 sm8Var) {
        Pair d;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(sm8Var.l)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (!"video/dolby-vision".equals(sm8Var.l) || (d = d(sm8Var)) == null) {
            return null;
        }
        int intValue = ((Integer) d.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x038f A[Catch: NumberFormatException -> 0x039e, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x039e, blocks: (B:204:0x033e, B:206:0x0352, B:217:0x0370, B:220:0x038f), top: B:203:0x033e }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(sm8 sm8Var) {
        char c2;
        int i;
        int i2;
        int parseInt;
        int parseInt2;
        int i3;
        int i4;
        int i5;
        char c3;
        Integer num;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num2;
        char c4;
        Integer num3;
        char c5;
        Integer num4;
        Integer valueOf = Integer.valueOf(a.o);
        Integer valueOf2 = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
        String str = sm8Var.i;
        if (str != null) {
            String[] split = str.split("\\.");
            boolean equals = "video/dolby-vision".equals(sm8Var.l);
            Pattern pattern = a;
            if (!equals) {
                String str2 = split[0];
                str2.getClass();
                switch (str2.hashCode()) {
                    case 3004662:
                        if (str2.equals("av01")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3006243:
                        if (str2.equals("avc1")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3006244:
                        if (str2.equals("avc2")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3199032:
                        if (str2.equals("hev1")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3214780:
                        if (str2.equals("hvc1")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3356560:
                        if (str2.equals("mp4a")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3624515:
                        if (str2.equals("vp09")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        int i10 = 16;
                        v13 v13Var = sm8Var.x;
                        if (split.length < 4) {
                            m6k.f0();
                            return null;
                        }
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 != 0) {
                                m6k.f0();
                                return null;
                            }
                            if (parseInt5 != 8 && parseInt5 != 10) {
                                m6k.f0();
                                return null;
                            }
                            int i11 = parseInt5 == 8 ? 1 : (v13Var == null || !(v13Var.d != null || (i = v13Var.c) == 7 || i == 6)) ? 2 : 4096;
                            switch (parseInt4) {
                                case 0:
                                    i10 = 1;
                                    break;
                                case 1:
                                    i10 = 2;
                                    break;
                                case 2:
                                    i10 = 4;
                                    break;
                                case 3:
                                    i10 = 8;
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    i10 = 32;
                                    break;
                                case 6:
                                    i10 = 64;
                                    break;
                                case 7:
                                    i10 = 128;
                                    break;
                                case 8:
                                    i10 = NotificationCompat.FLAG_LOCAL_ONLY;
                                    break;
                                case 9:
                                    i10 = 512;
                                    break;
                                case 10:
                                    i10 = 1024;
                                    break;
                                case 11:
                                    i10 = a.o;
                                    break;
                                case 12:
                                    i10 = 4096;
                                    break;
                                case 13:
                                    i10 = 8192;
                                    break;
                                case 14:
                                    i10 = 16384;
                                    break;
                                case 15:
                                    i10 = 32768;
                                    break;
                                case 16:
                                    i10 = 65536;
                                    break;
                                case 17:
                                    i10 = 131072;
                                    break;
                                case 18:
                                    i10 = 262144;
                                    break;
                                case 19:
                                    i10 = 524288;
                                    break;
                                case 20:
                                    i10 = 1048576;
                                    break;
                                case 21:
                                    i10 = 2097152;
                                    break;
                                case 22:
                                    i10 = 4194304;
                                    break;
                                case 23:
                                    i10 = 8388608;
                                    break;
                                default:
                                    i10 = -1;
                                    break;
                            }
                            if (i10 != -1) {
                                return new Pair(Integer.valueOf(i11), Integer.valueOf(i10));
                            }
                            m6k.f0();
                            return null;
                        } catch (NumberFormatException unused) {
                            m6k.f0();
                            return null;
                        }
                    case 1:
                    case 2:
                        if (split.length < 2) {
                            m6k.f0();
                            return null;
                        }
                        try {
                            if (split[1].length() == 6) {
                                i2 = 16;
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            } else {
                                i2 = 16;
                                if (split.length < 3) {
                                    m6k.f0();
                                    return null;
                                }
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                            if (parseInt == 66) {
                                i3 = -1;
                                i4 = 1;
                            } else if (parseInt == 77) {
                                i3 = -1;
                                i4 = 2;
                            } else if (parseInt == 88) {
                                i3 = -1;
                                i4 = 4;
                            } else if (parseInt == 100) {
                                i3 = -1;
                                i4 = 8;
                            } else if (parseInt == 110) {
                                i4 = i2;
                                i3 = -1;
                            } else if (parseInt == 122) {
                                i3 = -1;
                                i4 = 32;
                            } else if (parseInt != 244) {
                                i3 = -1;
                                i4 = -1;
                            } else {
                                i3 = -1;
                                i4 = 64;
                            }
                            if (i4 == i3) {
                                m6k.f0();
                                return null;
                            }
                            switch (parseInt2) {
                                case 10:
                                    i2 = 1;
                                    break;
                                case 11:
                                    i2 = 4;
                                    break;
                                case 12:
                                    i2 = 8;
                                    break;
                                case 13:
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i2 = 32;
                                            break;
                                        case 21:
                                            i2 = 64;
                                            break;
                                        case 22:
                                            i2 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i2 = NotificationCompat.FLAG_LOCAL_ONLY;
                                                    break;
                                                case 31:
                                                    i2 = 512;
                                                    break;
                                                case 32:
                                                    i2 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i2 = a.o;
                                                            break;
                                                        case 41:
                                                            i2 = 4096;
                                                            break;
                                                        case 42:
                                                            i2 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i2 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i2 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i2 = 65536;
                                                                    break;
                                                                default:
                                                                    i2 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i2 != -1) {
                                return new Pair(Integer.valueOf(i4), Integer.valueOf(i2));
                            }
                            m6k.f0();
                            return null;
                        } catch (NumberFormatException unused2) {
                            m6k.f0();
                            return null;
                        }
                    case 3:
                    case 4:
                        if (split.length < 4) {
                            m6k.f0();
                            return null;
                        }
                        Matcher matcher = pattern.matcher(split[1]);
                        if (!matcher.matches()) {
                            m6k.f0();
                            return null;
                        }
                        String group = matcher.group(1);
                        if ("1".equals(group)) {
                            i5 = 1;
                        } else {
                            if (!"2".equals(group)) {
                                m6k.f0();
                                return null;
                            }
                            i5 = 2;
                        }
                        String str3 = split[3];
                        if (str3 != null) {
                            switch (str3.hashCode()) {
                                case 70821:
                                    if (str3.equals("H30")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 70914:
                                    if (str3.equals("H60")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 70917:
                                    if (str3.equals("H63")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 71007:
                                    if (str3.equals("H90")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 71010:
                                    if (str3.equals("H93")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74665:
                                    if (str3.equals("L30")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74758:
                                    if (str3.equals("L60")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74761:
                                    if (str3.equals("L63")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74851:
                                    if (str3.equals("L90")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74854:
                                    if (str3.equals("L93")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193639:
                                    if (str3.equals("H120")) {
                                        c3 = '\n';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193642:
                                    if (str3.equals("H123")) {
                                        c3 = 11;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193732:
                                    if (str3.equals("H150")) {
                                        c3 = '\f';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193735:
                                    if (str3.equals("H153")) {
                                        c3 = '\r';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193738:
                                    if (str3.equals("H156")) {
                                        c3 = 14;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193825:
                                    if (str3.equals("H180")) {
                                        c3 = 15;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193828:
                                    if (str3.equals("H183")) {
                                        c3 = 16;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193831:
                                    if (str3.equals("H186")) {
                                        c3 = 17;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312803:
                                    if (str3.equals("L120")) {
                                        c3 = 18;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312806:
                                    if (str3.equals("L123")) {
                                        c3 = 19;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312896:
                                    if (str3.equals("L150")) {
                                        c3 = 20;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312899:
                                    if (str3.equals("L153")) {
                                        c3 = 21;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312902:
                                    if (str3.equals("L156")) {
                                        c3 = 22;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312989:
                                    if (str3.equals("L180")) {
                                        c3 = 23;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312992:
                                    if (str3.equals("L183")) {
                                        c3 = 24;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312995:
                                    if (str3.equals("L186")) {
                                        c3 = 25;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    num = 2;
                                    break;
                                case 1:
                                    num = 8;
                                    break;
                                case 2:
                                    num = 32;
                                    break;
                                case 3:
                                    num = 128;
                                    break;
                                case 4:
                                    num = 512;
                                    break;
                                case 5:
                                    num = 1;
                                    break;
                                case 6:
                                    num = 4;
                                    break;
                                case 7:
                                    num = 16;
                                    break;
                                case '\b':
                                    num = 64;
                                    break;
                                case '\t':
                                    num = valueOf2;
                                    break;
                                case '\n':
                                    num = valueOf;
                                    break;
                                case 11:
                                    num = 8192;
                                    break;
                                case '\f':
                                    num = 32768;
                                    break;
                                case '\r':
                                    num = 131072;
                                    break;
                                case 14:
                                    num = 524288;
                                    break;
                                case 15:
                                    num = 2097152;
                                    break;
                                case 16:
                                    num = 8388608;
                                    break;
                                case 17:
                                    num = 33554432;
                                    break;
                                case 18:
                                    num = 1024;
                                    break;
                                case 19:
                                    num = 4096;
                                    break;
                                case 20:
                                    num = 16384;
                                    break;
                                case 21:
                                    num = Integer.valueOf(C.DEFAULT_BUFFER_SEGMENT_SIZE);
                                    break;
                                case 22:
                                    num = 262144;
                                    break;
                                case 23:
                                    num = Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                                    break;
                                case 24:
                                    num = 4194304;
                                    break;
                                case 25:
                                    num = Integer.valueOf(C.DEFAULT_MUXED_BUFFER_SIZE);
                                    break;
                            }
                            if (num == null) {
                                return new Pair(Integer.valueOf(i5), num);
                            }
                            m6k.f0();
                            return null;
                        }
                        num = null;
                        if (num == null) {
                        }
                    case 5:
                        if (split.length != 3) {
                            m6k.f0();
                            return null;
                        }
                        try {
                            if (MimeTypes.AUDIO_AAC.equals(rjc.c(Integer.parseInt(split[1], 16)))) {
                                int parseInt6 = Integer.parseInt(split[2]);
                                int i12 = 17;
                                if (parseInt6 != 17) {
                                    if (parseInt6 != 20) {
                                        i12 = 23;
                                        if (parseInt6 != 23) {
                                            i12 = 29;
                                            if (parseInt6 != 29) {
                                                i12 = 39;
                                                if (parseInt6 != 39) {
                                                    i12 = 42;
                                                    if (parseInt6 != 42) {
                                                        switch (parseInt6) {
                                                            case 1:
                                                                i7 = -1;
                                                                i6 = 1;
                                                                break;
                                                            case 2:
                                                                i7 = -1;
                                                                i6 = 2;
                                                                break;
                                                            case 3:
                                                                i7 = -1;
                                                                i6 = 3;
                                                                break;
                                                            case 4:
                                                                i7 = -1;
                                                                i6 = 4;
                                                                break;
                                                            case 5:
                                                                i6 = 5;
                                                                break;
                                                            case 6:
                                                                i7 = -1;
                                                                i6 = 6;
                                                                break;
                                                            default:
                                                                i7 = -1;
                                                                i6 = -1;
                                                                break;
                                                        }
                                                        if (i6 != i7) {
                                                            return new Pair(Integer.valueOf(i6), 0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i6 = 20;
                                    }
                                    i7 = -1;
                                    if (i6 != i7) {
                                    }
                                }
                                i6 = i12;
                                i7 = -1;
                                if (i6 != i7) {
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            m6k.f0();
                            return null;
                        }
                        break;
                    case 6:
                        if (split.length < 3) {
                            m6k.f0();
                            return null;
                        }
                        try {
                            int parseInt7 = Integer.parseInt(split[1]);
                            int parseInt8 = Integer.parseInt(split[2]);
                            int i13 = parseInt7 != 0 ? parseInt7 != 1 ? parseInt7 != 2 ? parseInt7 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i13 == -1) {
                                m6k.f0();
                                return null;
                            }
                            if (parseInt8 == 10) {
                                i8 = -1;
                                i9 = 1;
                            } else if (parseInt8 == 11) {
                                i8 = -1;
                                i9 = 2;
                            } else if (parseInt8 == 20) {
                                i8 = -1;
                                i9 = 4;
                            } else if (parseInt8 == 21) {
                                i8 = -1;
                                i9 = 8;
                            } else if (parseInt8 == 30) {
                                i8 = -1;
                                i9 = 16;
                            } else if (parseInt8 == 31) {
                                i8 = -1;
                                i9 = 32;
                            } else if (parseInt8 == 40) {
                                i8 = -1;
                                i9 = 64;
                            } else if (parseInt8 == 41) {
                                i8 = -1;
                                i9 = 128;
                            } else if (parseInt8 == 50) {
                                i8 = -1;
                                i9 = NotificationCompat.FLAG_LOCAL_ONLY;
                            } else if (parseInt8 != 51) {
                                switch (parseInt8) {
                                    case 60:
                                        i8 = -1;
                                        i9 = a.o;
                                        break;
                                    case 61:
                                        i8 = -1;
                                        i9 = 4096;
                                        break;
                                    case 62:
                                        i9 = 8192;
                                        i8 = -1;
                                        break;
                                    default:
                                        i8 = -1;
                                        i9 = -1;
                                        break;
                                }
                            } else {
                                i8 = -1;
                                i9 = 512;
                            }
                            if (i9 != i8) {
                                return new Pair(Integer.valueOf(i13), Integer.valueOf(i9));
                            }
                            m6k.f0();
                            return null;
                        } catch (NumberFormatException unused4) {
                            m6k.f0();
                            return null;
                        }
                }
            } else {
                if (split.length < 3) {
                    m6k.f0();
                    return null;
                }
                Matcher matcher2 = pattern.matcher(split[1]);
                if (!matcher2.matches()) {
                    m6k.f0();
                    return null;
                }
                String group2 = matcher2.group(1);
                if (group2 == null) {
                    num2 = 1024;
                } else {
                    num2 = 1024;
                    switch (group2.hashCode()) {
                        case 1536:
                            if (group2.equals("00")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1537:
                            if (group2.equals("01")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1538:
                            if (group2.equals("02")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1539:
                            if (group2.equals("03")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1540:
                            if (group2.equals("04")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1541:
                            if (group2.equals("05")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1542:
                            if (group2.equals("06")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1543:
                            if (group2.equals("07")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1544:
                            if (group2.equals("08")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1545:
                            if (group2.equals("09")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            num3 = 1;
                            break;
                        case 1:
                            num3 = 2;
                            break;
                        case 2:
                            num3 = 4;
                            break;
                        case 3:
                            num3 = 8;
                            break;
                        case 4:
                            num3 = 16;
                            break;
                        case 5:
                            num3 = 32;
                            break;
                        case 6:
                            num3 = 64;
                            break;
                        case 7:
                            num3 = 128;
                            break;
                        case '\b':
                            num3 = valueOf2;
                            break;
                        case '\t':
                            num3 = 512;
                            break;
                    }
                    if (num3 != null) {
                        m6k.f0();
                        return null;
                    }
                    String str4 = split[2];
                    if (str4 != null) {
                        switch (str4.hashCode()) {
                            case 1537:
                                if (str4.equals("01")) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1538:
                                if (str4.equals("02")) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1539:
                                if (str4.equals("03")) {
                                    c5 = 2;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1540:
                                if (str4.equals("04")) {
                                    c5 = 3;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1541:
                                if (str4.equals("05")) {
                                    c5 = 4;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1542:
                                if (str4.equals("06")) {
                                    c5 = 5;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1543:
                                if (str4.equals("07")) {
                                    c5 = 6;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1544:
                                if (str4.equals("08")) {
                                    c5 = 7;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1545:
                                if (str4.equals("09")) {
                                    c5 = '\b';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1567:
                                if (str4.equals("10")) {
                                    c5 = '\t';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1568:
                                if (str4.equals("11")) {
                                    c5 = '\n';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1569:
                                if (str4.equals("12")) {
                                    c5 = 11;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1570:
                                if (str4.equals("13")) {
                                    c5 = '\f';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            default:
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case 0:
                                num4 = 1;
                                break;
                            case 1:
                                num4 = 2;
                                break;
                            case 2:
                                num4 = 4;
                                break;
                            case 3:
                                num4 = 8;
                                break;
                            case 4:
                                num4 = 16;
                                break;
                            case 5:
                                num4 = 32;
                                break;
                            case 6:
                                num4 = 64;
                                break;
                            case 7:
                                num4 = 128;
                                break;
                            case '\b':
                                num4 = valueOf2;
                                break;
                            case '\t':
                                num4 = 512;
                                break;
                            case '\n':
                                num4 = num2;
                                break;
                            case 11:
                                num4 = valueOf;
                                break;
                            case '\f':
                                num4 = 4096;
                                break;
                        }
                        if (num4 == null) {
                            return new Pair(num3, num4);
                        }
                        m6k.f0();
                        return null;
                    }
                    num4 = null;
                    if (num4 == null) {
                    }
                }
                num3 = null;
                if (num3 != null) {
                }
            }
        }
        return null;
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (r3c.class) {
            try {
                j3c j3cVar = new j3c(str, z, z2);
                HashMap hashMap = b;
                List list = (List) hashMap.get(j3cVar);
                if (list != null) {
                    return list;
                }
                int i = lik.a;
                ArrayList f = f(j3cVar, i >= 21 ? new o3c(z, z2) : new ccd());
                if (z && f.isEmpty() && 21 <= i && i <= 23) {
                    f = f(j3cVar, new ccd());
                    if (!f.isEmpty()) {
                        String str2 = ((z2c) f.get(0)).a;
                        m6k.f0();
                    }
                }
                a(str, f);
                hv9 v = hv9.v(f);
                hashMap.put(j3cVar, v);
                return v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList f(j3c j3cVar, n3c n3cVar) {
        String c2;
        j3c j3cVar2 = j3cVar;
        boolean z = j3cVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str = j3cVar2.a;
            int codecCount = n3cVar.getCodecCount();
            boolean secureDecodersExplicit = n3cVar.secureDecodersExplicit();
            int i = 0;
            while (i < codecCount) {
                MediaCodecInfo codecInfoAt = n3cVar.getCodecInfoAt(i);
                int i2 = lik.a;
                if (i2 < 29 || !codecInfoAt.isAlias()) {
                    String name = codecInfoAt.getName();
                    if (g(codecInfoAt, name, secureDecodersExplicit, str) && (c2 = c(codecInfoAt, name, str)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(c2);
                            boolean h = n3cVar.h("tunneled-playback", c2, capabilitiesForType);
                            boolean j = n3cVar.j("tunneled-playback", capabilitiesForType);
                            boolean z2 = j3cVar2.c;
                            if ((z2 || !j) && (!z2 || h)) {
                                boolean h2 = n3cVar.h("secure-playback", c2, capabilitiesForType);
                                boolean j2 = n3cVar.j("secure-playback", capabilitiesForType);
                                if ((z || !j2) && (!z || h2)) {
                                    boolean isHardwareAccelerated = i2 >= 29 ? codecInfoAt.isHardwareAccelerated() : !h(codecInfoAt, str);
                                    h(codecInfoAt, str);
                                    if (i2 >= 29) {
                                        codecInfoAt.isVendor();
                                    } else {
                                        String W = rz8.W(codecInfoAt.getName());
                                        if (!W.startsWith("omx.google.") && !W.startsWith("c2.android.")) {
                                            W.startsWith("c2.google.");
                                        }
                                    }
                                    if (secureDecodersExplicit) {
                                        if (z != h2) {
                                        }
                                        arrayList.add(z2c.g(name, str, c2, capabilitiesForType, isHardwareAccelerated, false));
                                    }
                                    if (secureDecodersExplicit || z) {
                                        boolean z3 = isHardwareAccelerated;
                                        if (!secureDecodersExplicit && h2) {
                                            arrayList.add(z2c.g(name + ".secure", str, c2, capabilitiesForType, z3, true));
                                            break;
                                        }
                                    } else {
                                        arrayList.add(z2c.g(name, str, c2, capabilitiesForType, isHardwareAccelerated, false));
                                    }
                                }
                            }
                        } catch (Exception e) {
                            if (lik.a > 23 || arrayList.isEmpty()) {
                                m6k.B();
                                throw e;
                            }
                            m6k.B();
                        }
                    }
                }
                i++;
                j3cVar2 = j3cVar;
            }
            return arrayList;
        } catch (Exception e2) {
            throw new l3c("Failed to query underlying media codecs", e2);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = lik.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = lik.b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(lik.c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = lik.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = lik.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Payload.SOURCE_SAMSUNG.equals(lik.c))) {
            String str6 = lik.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && Payload.SOURCE_SAMSUNG.equals(lik.c)) {
            String str7 = lik.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && lik.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (lik.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (rjc.g(str)) {
            return true;
        }
        String W = rz8.W(mediaCodecInfo.getName());
        if (W.startsWith("arc.")) {
            return false;
        }
        if (W.startsWith("omx.google.") || W.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((W.startsWith("omx.sec.") && W.contains(".sw.")) || W.equals("omx.qcom.video.decoder.hevcswvdec") || W.startsWith("c2.android.") || W.startsWith("c2.google.")) {
            return true;
        }
        return (W.startsWith("omx.") || W.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2 = c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        List e = e("video/avc", false, false);
        z2c z2cVar = e.isEmpty() ? null : (z2c) e.get(0);
        if (z2cVar != null) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = z2cVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i4 = 0;
            while (i3 < length) {
                int i5 = codecProfileLevelArr[i3].level;
                if (i5 != 1 && i5 != 2) {
                    switch (i5) {
                        case 8:
                        case 16:
                        case 32:
                            i = 101376;
                            break;
                        case 64:
                            i = 202752;
                            break;
                        case 128:
                        case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                            i = 414720;
                            break;
                        case 512:
                            i = 921600;
                            break;
                        case 1024:
                            i = 1310720;
                            break;
                        case a.o /* 2048 */:
                        case 4096:
                            i = 2097152;
                            break;
                        case 8192:
                            i = 2228224;
                            break;
                        case 16384:
                            i = 5652480;
                            break;
                        case 32768:
                        case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                            i = 9437184;
                            break;
                        case 131072:
                        case 262144:
                        case 524288:
                            i = 35651584;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = 25344;
                }
                i4 = Math.max(i, i4);
                i3++;
            }
            i3 = Math.max(i4, lik.a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
        }
        c = i3;
        return i3;
    }
}
