package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.b;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a3c {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public a3c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = sjc.o(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(nik.g(i, widthAlignment) * widthAlignment, nik.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public static a3c i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean isFeatureSupported = codecCapabilities.isFeatureSupported("adaptive-playback");
        codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean isFeatureSupported2 = codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str4 = Build.MANUFACTURER;
            if (!str4.equals("Xiaomi") && !str4.equals("OPPO") && !str4.equals("realme") && !str4.equals("motorola") && !str4.equals("LENOVO")) {
                z4 = true;
                return new a3c(str, str2, str3, codecCapabilities, z, z2, z3, isFeatureSupported, isFeatureSupported2, z4);
            }
        }
        z4 = false;
        return new a3c(str, str2, str3, codecCapabilities, z, z2, z3, isFeatureSupported, isFeatureSupported2, z4);
    }

    public final lm4 b(b bVar, b bVar2) {
        b bVar3;
        b bVar4;
        int i;
        String str = bVar.o;
        w13 w13Var = bVar.E;
        String str2 = bVar2.o;
        w13 w13Var2 = bVar2.E;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (bVar.A != bVar2.A) {
                i2 |= 1024;
            }
            boolean z = (bVar.v == bVar2.v && bVar.w == bVar2.w) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!w13.e(w13Var) || !w13.e(w13Var2)) && !Objects.equals(w13Var, w13Var2)) {
                i2 |= a.o;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !bVar.b(bVar2)) {
                i2 |= 2;
            }
            int i3 = bVar.x;
            if (i3 != -1 && (i = bVar.y) != -1 && i3 == bVar2.x && i == bVar2.y && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(bVar2.o, "video/dolby-vision")) {
                Pair b = wz2.b(bVar);
                Pair b2 = wz2.b(bVar2);
                if (b == null || b2 == null || !((Integer) b.first).equals(b2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new lm4(this.a, bVar, bVar2, bVar.b(bVar2) ? 3 : 2, 0);
            }
            bVar3 = bVar;
            bVar4 = bVar2;
        } else {
            bVar3 = bVar;
            bVar4 = bVar2;
            if (bVar3.G != bVar4.G) {
                i2 |= 4096;
            }
            if (bVar3.H != bVar4.H) {
                i2 |= 8192;
            }
            if (bVar3.I != bVar4.I) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals(MimeTypes.AUDIO_AAC) || str3.equals("audio/ac4"))) {
                Pair b3 = wz2.b(bVar3);
                Pair b4 = wz2.b(bVar4);
                if (b3 != null && b4 != null) {
                    int intValue = ((Integer) b3.first).intValue();
                    int intValue2 = ((Integer) b4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new lm4(this.a, bVar3, bVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b3.equals(b4)) {
                        return new lm4(this.a, bVar3, bVar4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals(MimeTypes.AUDIO_E_AC3_JOC) || str3.equals(MimeTypes.AUDIO_E_AC3))) {
                return new lm4(this.a, bVar3, bVar4, 3, 0);
            }
            if (!bVar3.b(bVar4)) {
                i2 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new lm4(this.a, bVar3, bVar4, 1, 0);
            }
        }
        return new lm4(this.a, bVar3, bVar4, 0, i2);
    }

    public final boolean c(Context context, b bVar, boolean z) {
        Pair b = wz2.b(bVar);
        String str = bVar.o;
        String str2 = this.c;
        if (str != null && str.equals("video/mv-hevc")) {
            String p = sjc.p(str2);
            if (!p.equals("video/mv-hevc")) {
                if (p.equals("video/hevc")) {
                    HashMap hashMap = s3c.a;
                    String v = kik.v(bVar.r);
                    if (v == null) {
                        b = null;
                    } else {
                        String trim = v.trim();
                        String str3 = nik.a;
                        b = wz2.c(v, trim.split("\\.", -1), bVar.E);
                    }
                }
            }
            return true;
        }
        if (b != null) {
            int intValue = ((Integer) b.first).intValue();
            int intValue2 = ((Integer) b.second).intValue();
            boolean equals = "video/dolby-vision".equals(str);
            String str4 = this.b;
            if (equals) {
                str4.getClass();
                switch (str4) {
                    case "video/av01":
                    case "video/hevc":
                        intValue = 2;
                        break;
                    case "video/avc":
                        intValue = 8;
                        break;
                }
                intValue2 = 0;
            }
            if (this.i || str4.equals("audio/ac4") || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
                if (codecProfileLevelArr == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    int i = (audioCapabilities != null ? audioCapabilities.getMaxInputChannelCount() : 2) > 18 ? 16 : 8;
                    codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{s3c.b(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i)} : new MediaCodecInfo.CodecProfileLevel[]{s3c.b(257, i), s3c.b(513, i), s3c.b(514, i), s3c.b(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i), s3c.b(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i)};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                        if ("video/hevc".equals(str4) && 2 == intValue) {
                            String str5 = Build.DEVICE;
                            if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                            }
                        }
                    }
                }
                h("codec.profileLevel, " + bVar.k + ", " + str2);
                return false;
            }
        }
        return true;
    }

    public final boolean d(b bVar) {
        return (Objects.equals(bVar.o, MimeTypes.AUDIO_FLAC) && bVar.I == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, b bVar) {
        int i;
        String str = bVar.o;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(s3c.c(bVar))) || !c(context, bVar, true) || !d(bVar)) {
            return false;
        }
        if (this.i) {
            int i2 = bVar.v;
            if (i2 > 0 && (i = bVar.w) > 0) {
                return g(i2, i, bVar.z);
            }
        } else {
            int i3 = bVar.H;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    h("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = bVar.G;
            if (i4 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2)) {
                    int i5 = MimeTypes.AUDIO_AC3.equals(str2) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
                    StringBuilder q = mz1.q(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    q.append(i5);
                    q.append(U3.j.e);
                    tgj.d0(q.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    h("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(b bVar) {
        if (this.i) {
            return this.e;
        }
        Pair b = wz2.b(bVar);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    public final boolean g(int i, int i2, double d) {
        Boolean bool;
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.d.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int a = (i3 < 29 || ((bool = v8a.b) != null && bool.booleanValue())) ? 0 : eq3.a(videoCapabilities, i, i2, d);
            if (a != 2) {
                if (a == 1) {
                    StringBuilder s = lnb.s(i, i2, "sizeAndRate.cover, ", "x", "@");
                    s.append(d);
                    h(s.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder s2 = lnb.s(i, i2, "sizeAndRate.rotated, ", "x", "@");
                    s2.append(d);
                    StringBuilder s3 = mz1.s("AssumedSupport [", s2.toString(), "] [", str, ", ");
                    s3.append(this.b);
                    s3.append("] [");
                    s3.append(nik.a);
                    s3.append(U3.j.e);
                    tgj.y(s3.toString());
                    return true;
                }
            }
            StringBuilder s4 = lnb.s(i, i2, "sizeAndRate.support, ", "x", "@");
            s4.append(d);
            h(s4.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder q = wt3.q("NoSupport [", str, "] [");
        q.append(this.a);
        q.append(", ");
        q.append(this.b);
        q.append("] [");
        q.append(nik.a);
        q.append(U3.j.e);
        tgj.y(q.toString());
    }

    public final String toString() {
        return this.a;
    }
}
