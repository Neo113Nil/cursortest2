package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.lnb;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final MediaCodecInfo.CodecCapabilities e;

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        str.getClass();
        this.a = str;
        this.d = str2;
        this.e = codecCapabilities;
        boolean z2 = false;
        this.b = !z && codecCapabilities != null && z.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null && z.a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z2 = true;
        }
        this.c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        if ("2".equals(r9) != false) goto L47;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str) {
        String a;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer valueOf;
        Integer valueOf2;
        if (str == null || this.d == null || (a = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.d.equals(a)) {
            b("codec.mime " + str + ", " + a);
            return false;
        }
        Pattern pattern = j.a;
        String[] split = str.split("\\.");
        String str2 = split[0];
        str2.getClass();
        int i = 2;
        char c = 65535;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 1;
                    break;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 2;
                    break;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 3;
                    break;
                }
                break;
        }
        Pair pair = null;
        switch (c) {
            case 0:
            case 1:
                if (split.length < 2) {
                    "Ignoring malformed AVC codec string: ".concat(str);
                    break;
                } else {
                    try {
                        if (split[1].length() == 6) {
                            valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                            valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                        } else if (split.length < 3) {
                            "Ignoring malformed AVC codec string: ".concat(str);
                            break;
                        } else {
                            valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                            valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                        }
                        pair = new Pair(Integer.valueOf(j.c.get(valueOf.intValue())), Integer.valueOf(j.d.get(valueOf2.intValue())));
                        break;
                    } catch (NumberFormatException unused) {
                        "Ignoring malformed AVC codec string: ".concat(str);
                        break;
                    }
                }
            case 2:
            case 3:
                if (split.length < 4) {
                    "Ignoring malformed HEVC codec string: ".concat(str);
                    break;
                } else {
                    Matcher matcher = j.a.matcher(split[1]);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        if (!"1".equals(group)) {
                            break;
                        } else {
                            i = 1;
                        }
                        Integer num = (Integer) j.e.get(split[3]);
                        if (num == null) {
                            matcher.group(1);
                            break;
                        } else {
                            pair = new Pair(Integer.valueOf(i), num);
                            break;
                        }
                    } else {
                        "Ignoring malformed HEVC codec string: ".concat(str);
                        break;
                    }
                }
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + a);
        return false;
    }

    public final boolean b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        b("sampleRate.support, " + i);
        return false;
    }

    public final void b(String str) {
        int i = z.a;
    }

    public final boolean a(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d != -1.0d && d > 0.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i, i2, d);
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i, i2);
        }
        if (isSizeSupported) {
            return true;
        }
        if (i < i2) {
            if (d != -1.0d && d > 0.0d) {
                isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i2, i, d);
            } else {
                isSizeSupported2 = videoCapabilities.isSizeSupported(i2, i);
            }
            if (isSizeSupported2) {
                lnb.s(i, i2, "sizeAndRate.rotated, ", "x", "x").append(d);
                int i3 = z.a;
                return true;
            }
        }
        StringBuilder s = lnb.s(i, i2, "sizeAndRate.support, ", "x", "x");
        s.append(d);
        b(s.toString());
        return false;
    }

    public final Point a(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = z.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        String str = this.d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((z.a < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_AMR_NB.equals(str) && !MimeTypes.AUDIO_AMR_WB.equals(str) && !MimeTypes.AUDIO_AAC.equals(str) && !MimeTypes.AUDIO_VORBIS.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str) && !MimeTypes.AUDIO_RAW.equals(str) && !MimeTypes.AUDIO_FLAC.equals(str) && !MimeTypes.AUDIO_ALAW.equals(str) && !MimeTypes.AUDIO_MLAW.equals(str) && !MimeTypes.AUDIO_MSGSM.equals(str))) {
            if (MimeTypes.AUDIO_AC3.equals(str)) {
                maxInputChannelCount = 6;
            } else {
                maxInputChannelCount = MimeTypes.AUDIO_E_AC3.equals(str) ? 16 : 30;
            }
        }
        if (maxInputChannelCount >= i) {
            return true;
        }
        b("channelCount.support, " + i);
        return false;
    }
}
