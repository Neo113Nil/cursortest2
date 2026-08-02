package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.me4;
import defpackage.mio;
import defpackage.mz1;
import defpackage.rha;
import defpackage.zrj;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzvs {
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

    public zzvs(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = z4;
        this.i = zzas.b(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static zzvs a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        boolean isFeatureSupported = codecCapabilities.isFeatureSupported("adaptive-playback");
        codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean isFeatureSupported2 = codecCapabilities.isFeatureSupported("secure-playback");
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str4 = Build.MANUFACTURER;
            if (!str4.equals("Xiaomi") && !str4.equals("OPPO") && !str4.equals("realme") && !str4.equals("motorola") && !str4.equals("LENOVO") && !str4.equals("Fairphone")) {
                z2 = true;
            }
        }
        return new zzvs(str, str2, str3, codecCapabilities, z, isFeatureSupported, isFeatureSupported2, z2);
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point j = j(videoCapabilities, i, i2);
        int i3 = j.x;
        int i4 = j.y;
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

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfm.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(Context context, zzv zzvVar) {
        int i;
        String str = zzvVar.o;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(zzwl.d(zzvVar))) || !f(context, zzvVar, true) || !g(zzvVar)) {
            return false;
        }
        if (this.i) {
            int i2 = zzvVar.v;
            if (i2 > 0 && (i = zzvVar.w) > 0) {
                return e(i2, i, zzvVar.z);
            }
        } else {
            int i3 = zzvVar.J;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i3);
                    h(sb.toString());
                    return false;
                }
            }
            int i4 = zzvVar.H;
            if (i4 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2)) {
                    int i5 = MimeTypes.AUDIO_AC3.equals(str2) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
                    String str3 = this.a;
                    StringBuilder sb2 = new StringBuilder(mz1.d(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i5)));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i5);
                    sb2.append(U3.j.e);
                    zzeh.c(sb2.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i4);
                    h(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(zzv zzvVar) {
        boolean z;
        if (this.i) {
            return this.e;
        }
        zzdq c = zzdr.c(zzvVar);
        if (c == null || !(z = c.c)) {
            return false;
        }
        zzguk.f(z);
        return c.a == 42;
    }

    public final zzjf d(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i;
        String str = zzvVar.o;
        String str2 = zzvVar2.o;
        zzi zziVar = zzvVar2.F;
        int i2 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (zzvVar.A != zzvVar2.A) {
                i2 |= 1024;
            }
            boolean z = (zzvVar.v == zzvVar2.v && zzvVar.w == zzvVar2.w) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            zzi zziVar2 = zzvVar.F;
            if ((!zzi.a(zziVar2) || !zzi.a(zziVar)) && !Objects.equals(zziVar2, zziVar)) {
                i2 |= com.ironsource.mediationsdk.metadata.a.o;
            }
            boolean startsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.a;
            if (startsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.b(zzvVar2)) {
                i2 |= 2;
            }
            int i3 = zzvVar.x;
            if (i3 != -1 && (i = zzvVar.y) != -1 && i3 == zzvVar2.x && i == zzvVar2.y && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair b = zzdr.b(zzvVar);
                Pair b2 = zzdr.b(zzvVar2);
                if (b == null || b2 == null || !((Integer) b.first).equals(b2.first)) {
                    i2 = 2;
                }
            }
            if (i2 == 0) {
                return new zzjf(str3, zzvVar, zzvVar2, true == zzvVar.b(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.H != zzvVar4.H) {
                i2 |= 4096;
            }
            if (zzvVar3.J != zzvVar4.J) {
                i2 |= 8192;
            }
            if (zzvVar3.K != zzvVar4.K) {
                i2 |= 16384;
            }
            String str4 = this.b;
            if (i2 == 0 && (str4.equals(MimeTypes.AUDIO_AAC) || str4.equals("audio/ac4"))) {
                Pair b3 = zzdr.b(zzvVar3);
                Pair b4 = zzdr.b(zzvVar4);
                if (b3 != null && b4 != null) {
                    int intValue = ((Integer) b3.first).intValue();
                    int intValue2 = ((Integer) b4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzjf(this.a, zzvVar3, zzvVar4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && b3.equals(b4)) {
                        return new zzjf(this.a, zzvVar3, zzvVar4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str4.equals(MimeTypes.AUDIO_E_AC3_JOC) || str4.equals(MimeTypes.AUDIO_E_AC3))) {
                return new zzjf(this.a, zzvVar3, zzvVar4, 3, 0);
            }
            if (!zzvVar3.b(zzvVar4)) {
                i2 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str4)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzjf(this.a, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzjf(this.a, zzvVar3, zzvVar4, 0, i2);
    }

    public final boolean e(int i, int i2, double d) {
        Boolean bool;
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.d.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int l = (i3 < 29 || ((bool = rha.e) != null && bool.booleanValue())) ? 0 : zrj.l(videoCapabilities, i, i2, d);
            if (l != 2) {
                if (l == 1) {
                    StringBuilder sb = new StringBuilder(mz1.d(String.valueOf(i).length() + 20, 1, String.valueOf(i2)) + String.valueOf(d).length());
                    me4.r(sb, "sizeAndRate.cover, ", i, "x", i2);
                    sb.append("@");
                    sb.append(d);
                    h(sb.toString());
                    return false;
                }
            }
            return true;
        }
        if (!i(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && i(videoCapabilities, i2, i, d)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + fn0.a(i, 22) + 1 + String.valueOf(d).length());
                    me4.r(sb2, "sizeAndRate.rotated, ", i, "x", i2);
                    sb2.append("@");
                    sb2.append(d);
                    String sb3 = sb2.toString();
                    int length = str.length();
                    String str2 = zzfm.a;
                    String str3 = this.b;
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 19 + length + 2 + String.valueOf(str3).length() + 3 + String.valueOf(str2).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    bf3.v(sb4, ", ", str3, "] [", str2);
                    sb4.append(U3.j.e);
                    zzeh.a(sb4.toString());
                    return true;
                }
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(i2).length() + fn0.a(i, 22) + 1 + String.valueOf(d).length());
            me4.r(sb5, "sizeAndRate.support, ", i, "x", i2);
            sb5.append("@");
            sb5.append(d);
            h(sb5.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.equals("video/hevc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0134, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
    
        if (r5.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) != false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Context context, zzv zzvVar, boolean z) {
        boolean z2;
        zzdq zzdqVar;
        boolean z3;
        String str;
        zzdq c = zzdr.c(zzvVar);
        String str2 = zzvVar.o;
        int i = 3;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String h = zzas.h(str3);
            if (h.equals("video/mv-hevc")) {
                return true;
            }
            if (h.equals("video/hevc")) {
                HashMap hashMap = zzwl.a;
                List list = zzvVar.r;
                int i2 = 0;
                loop0: while (true) {
                    if (i2 >= list.size()) {
                        zzdqVar = null;
                        z3 = false;
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i2);
                    int length = bArr.length;
                    if (length > i) {
                        boolean[] zArr = new boolean[i];
                        mio mioVar = zzgxm.b;
                        zzgxj zzgxjVar = new zzgxj();
                        int i3 = 0;
                        z3 = false;
                        while (true) {
                            int length2 = bArr.length;
                            if (i3 >= length2) {
                                break;
                            }
                            int g = zzgr.g(bArr, i3, length2, zArr);
                            if (g != length2) {
                                zzgxjVar.c(Integer.valueOf(g));
                            }
                            i3 = g + 3;
                        }
                        s f = zzgxjVar.f();
                        int i4 = 0;
                        while (i4 < f.d) {
                            if (((Integer) f.get(i4)).intValue() + i < length) {
                                zzgz zzgzVar = new zzgz(bArr, ((Integer) f.get(i4)).intValue() + i, length);
                                zzgf i5 = zzgr.i(zzgzVar);
                                if (i5.a == 33 && i5.b == 0) {
                                    zzgzVar.b(4);
                                    int e = zzgzVar.e(3);
                                    zzgzVar.a();
                                    zzdqVar = null;
                                    zzgg j = zzgr.j(zzgzVar, true, e, null);
                                    str = zzdr.a(j.a, j.b, j.c, j.d, j.e, j.f);
                                    break loop0;
                                }
                            }
                            i4++;
                            i = 3;
                        }
                    }
                    i2++;
                    i = 3;
                }
                if (str == null) {
                    c = zzdqVar;
                    z2 = z3;
                } else {
                    String trim = str.trim();
                    String str4 = zzfm.a;
                    c = zzdr.d(str, trim.split("\\.", -1), zzvVar.F);
                    z2 = z3;
                }
                if (c != null) {
                    return true;
                }
                boolean z4 = c.c;
                if (!z4) {
                    return z2;
                }
                zzguk.f(z4);
                int i6 = c.a;
                zzguk.f(z4);
                int i7 = c.b;
                boolean equals = "video/dolby-vision".equals(str2);
                String str5 = this.b;
                int i8 = 8;
                if (equals) {
                    int hashCode = str5.hashCode();
                    if (hashCode != -1662735862) {
                        if (hashCode != -1662541442) {
                            i6 = (hashCode == 1331836730 && str5.equals("video/avc")) ? 8 : 2;
                        }
                    }
                    i7 = z2;
                }
                if (!this.i && !str5.equals("audio/ac4") && i6 != 42) {
                    return true;
                }
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
                if (codecProfileLevelArr == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[z2];
                }
                if (str5.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                        i8 = 16;
                    }
                    codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{zzwl.c(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i8)} : new MediaCodecInfo.CodecProfileLevel[]{zzwl.c(257, i8), zzwl.c(513, i8), zzwl.c(514, i8), zzwl.c(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i8), zzwl.c(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i8)};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel.profile == i6 && (codecProfileLevel.level >= i7 || !z)) {
                        if (!"video/hevc".equals(str5) || i6 != 2) {
                            return true;
                        }
                        String str6 = Build.DEVICE;
                        if (!"sailfish".equals(str6) && !"marlin".equals(str6)) {
                            return true;
                        }
                    }
                }
                String str7 = zzvVar.k;
                h(fc6.o(new StringBuilder(str3.length() + String.valueOf(str7).length() + 22), "codec.profileLevel, ", str7, ", ", str3));
                return false;
            }
        }
        z2 = 0;
        if (c != null) {
        }
    }

    public final boolean g(zzv zzvVar) {
        return (Objects.equals(zzvVar.o, MimeTypes.AUDIO_FLAC) && zzvVar.K == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = zzfm.a;
        String str3 = this.b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        bf3.v(sb, "NoSupport [", str, "] [", str4);
        bf3.v(sb, ", ", str3, "] [", str2);
        sb.append(U3.j.e);
        zzeh.a(sb.toString());
    }

    public final String toString() {
        return this.a;
    }
}
