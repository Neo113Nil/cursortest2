package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z2c {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public z2c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = rjc.i(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(lik.f(i, widthAlignment) * widthAlignment, lik.f(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z2c g(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z5;
        String str6;
        int i;
        if (codecCapabilities != null && (i = lik.a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i <= 22) {
                String str7 = lik.d;
                if (!"ODROID-XU3".equals(str7)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z3 = true;
            if (codecCapabilities != null && lik.a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            if (!z2 || (codecCapabilities != null && lik.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
                z4 = true;
                str4 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z5 = z;
                str6 = str2;
            } else {
                z4 = false;
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z5 = z;
                str4 = str;
            }
            return new z2c(str4, str6, str5, codecCapabilities2, z5, z3, z4);
        }
        z3 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z2) {
        }
        z4 = true;
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z5 = z;
        str6 = str2;
        return new z2c(str4, str6, str5, codecCapabilities2, z5, z3, z4);
    }

    public final km4 b(sm8 sm8Var, sm8 sm8Var2) {
        sm8 sm8Var3;
        sm8 sm8Var4;
        int i = !lik.a(sm8Var.l, sm8Var2.l) ? 8 : 0;
        if (this.h) {
            if (sm8Var.t != sm8Var2.t) {
                i |= 1024;
            }
            if (!this.e && (sm8Var.q != sm8Var2.q || sm8Var.r != sm8Var2.r)) {
                i |= 512;
            }
            if (!lik.a(sm8Var.x, sm8Var2.x)) {
                i |= a.o;
            }
            if (lik.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !sm8Var.b(sm8Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new km4(this.a, sm8Var, sm8Var2, sm8Var.b(sm8Var2) ? 3 : 2, 0);
            }
            sm8Var3 = sm8Var;
            sm8Var4 = sm8Var2;
        } else {
            sm8Var3 = sm8Var;
            sm8Var4 = sm8Var2;
            if (sm8Var3.y != sm8Var4.y) {
                i |= 4096;
            }
            if (sm8Var3.z != sm8Var4.z) {
                i |= 8192;
            }
            if (sm8Var3.A != sm8Var4.A) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(str)) {
                Pair d = r3c.d(sm8Var3);
                Pair d2 = r3c.d(sm8Var4);
                if (d != null && d2 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new km4(this.a, sm8Var3, sm8Var4, 3, 0);
                    }
                }
            }
            if (!sm8Var3.b(sm8Var4)) {
                i |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new km4(this.a, sm8Var3, sm8Var4, 1, 0);
            }
        }
        return new km4(this.a, sm8Var3, sm8Var4, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(sm8 sm8Var) {
        Pair d;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = sm8Var.l;
        int i = sm8Var.r;
        int i2 = sm8Var.q;
        String str2 = sm8Var.i;
        String str3 = this.b;
        if (!str3.equals(str) && !str3.equals(r3c.b(sm8Var))) {
            return false;
        }
        boolean z2 = this.h;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (str2 != null && (d = r3c.d(sm8Var)) != null) {
            int intValue = ((Integer) d.first).intValue();
            int intValue2 = ((Integer) d.second).intValue();
            if ("video/dolby-vision".equals(sm8Var.l)) {
                if ("video/avc".equals(str3)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(str3)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (z2 || intValue == 42) {
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                z = false;
                if (lik.a <= 23 && MimeTypes.VIDEO_VP9.equals(str3) && codecProfileLevelArr.length == 0) {
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    int i3 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? NotificationCompat.FLAG_LOCAL_ONLY : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i3;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                        if ("video/hevc".equals(str3) && 2 == intValue) {
                            String str4 = lik.b;
                            if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                            }
                        }
                        if (!z2) {
                            if (i2 <= 0 || i <= 0) {
                                return true;
                            }
                            if (lik.a >= 21) {
                                return e(i2, i, sm8Var.s);
                            }
                            boolean z3 = i2 * i <= r3c.i() ? true : z;
                            if (!z3) {
                                f("legacyFrameSize, " + i2 + "x" + i);
                            }
                            return z3;
                        }
                        int i4 = lik.a;
                        if (i4 < 21) {
                            return true;
                        }
                        int i5 = sm8Var.z;
                        if (i5 != -1) {
                            if (codecCapabilities == null) {
                                f("sampleRate.caps");
                                return z;
                            }
                            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                            if (audioCapabilities == null) {
                                f("sampleRate.aCaps");
                                return z;
                            }
                            if (!audioCapabilities.isSampleRateSupported(i5)) {
                                f("sampleRate.support, " + i5);
                                return z;
                            }
                        }
                        int i6 = sm8Var.y;
                        if (i6 == -1) {
                            return true;
                        }
                        if (codecCapabilities == null) {
                            f("channelCount.caps");
                            return z;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            f("channelCount.aCaps");
                            return z;
                        }
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i4 < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str3) && !MimeTypes.AUDIO_AMR_NB.equals(str3) && !MimeTypes.AUDIO_AMR_WB.equals(str3) && !MimeTypes.AUDIO_AAC.equals(str3) && !MimeTypes.AUDIO_VORBIS.equals(str3) && !MimeTypes.AUDIO_OPUS.equals(str3) && !MimeTypes.AUDIO_RAW.equals(str3) && !MimeTypes.AUDIO_FLAC.equals(str3) && !MimeTypes.AUDIO_ALAW.equals(str3) && !MimeTypes.AUDIO_MLAW.equals(str3) && !MimeTypes.AUDIO_MSGSM.equals(str3))) {
                            maxInputChannelCount = MimeTypes.AUDIO_AC3.equals(str3) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str3) ? 16 : 30;
                            m6k.f0();
                        }
                        if (maxInputChannelCount >= i6) {
                            return true;
                        }
                        f("channelCount.support, " + i6);
                        return z;
                    }
                }
                StringBuilder q = wt3.q("codec.profileLevel, ", str2, ", ");
                q.append(this.c);
                f(q.toString());
                return false;
            }
        }
        z = false;
        if (!z2) {
        }
    }

    public final boolean d(sm8 sm8Var) {
        if (this.h) {
            return this.e;
        }
        Pair d = r3c.d(sm8Var);
        return d != null && ((Integer) d.first).intValue() == 42;
    }

    public final boolean e(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        }
        if (lik.a >= 29) {
            int a = y2c.a(videoCapabilities, i, i2, d);
            if (a != 2) {
                if (a == 1) {
                    StringBuilder s = lnb.s(i, i2, "sizeAndRate.cover, ", "x", "@");
                    s.append(d);
                    f(s.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(lik.b)) || !a(videoCapabilities, i2, i, d))) {
                StringBuilder s2 = lnb.s(i, i2, "sizeAndRate.support, ", "x", "@");
                s2.append(d);
                f(s2.toString());
                return false;
            }
            lnb.s(i, i2, "sizeAndRate.rotated, ", "x", "@").append(d);
            int i3 = lik.a;
            m6k.A();
            return true;
        }
        return true;
    }

    public final void f(String str) {
        int i = lik.a;
        m6k.A();
    }

    public final String toString() {
        return this.a;
    }
}
