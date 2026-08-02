package v1;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import b1.AbstractC2335D;
import b1.C2357k;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.util.Objects;
import lb.C5444x;
import m1.C5509h;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f66986a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66987b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66988c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f66989d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f66990e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66991f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f66992g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f66993h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f66994i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f66995j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f66996k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f66997l;

    /* renamed from: o, reason: collision with root package name */
    public float f67000o = -3.4028235E38f;

    /* renamed from: m, reason: collision with root package name */
    public int f66998m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f66999n = -1;

    public t(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f66986a = (String) AbstractC4134a.e(str);
        this.f66987b = str2;
        this.f66988c = str3;
        this.f66989d = codecCapabilities;
        this.f66993h = z10;
        this.f66994i = z11;
        this.f66995j = z12;
        this.f66990e = z13;
        this.f66991f = z14;
        this.f66992g = z15;
        this.f66996k = z16;
        this.f66997l = AbstractC2335D.t(str2);
    }

    public static boolean A() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    public static boolean B(String str) {
        return false;
    }

    public static boolean C(String str, int i10) {
        if (!"video/hevc".equals(str) || 2 != i10) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    public static boolean D(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static t E(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new t(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && t(codecCapabilities)), n(codecCapabilities));
    }

    public static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((Build.VERSION.SDK_INT >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        AbstractC4156x.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    public static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Z.k(i10, widthAlignment) * widthAlignment, Z.k(i11, heightAlignment) * heightAlignment);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point b10 = b(videoCapabilities, i10, i11);
        int i12 = b10.x;
        int i13 = b10.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double floor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean n(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !A();
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean y(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean z(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66989d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public C5509h e(androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        androidx.media3.common.a aVar3;
        androidx.media3.common.a aVar4;
        int i10;
        int i11 = !Objects.equals(aVar.f20543o, aVar2.f20543o) ? 8 : 0;
        if (this.f66997l) {
            if (aVar.f20513A != aVar2.f20513A) {
                i11 |= 1024;
            }
            boolean z10 = (aVar.f20550v == aVar2.f20550v && aVar.f20551w == aVar2.f20551w) ? false : true;
            if (!this.f66990e && z10) {
                i11 |= 512;
            }
            if ((!C2357k.h(aVar.f20516D) || !C2357k.h(aVar2.f20516D)) && !Objects.equals(aVar.f20516D, aVar2.f20516D)) {
                i11 |= 2048;
            }
            if (z(this.f66986a) && !aVar.f(aVar2)) {
                i11 |= 2;
            }
            int i12 = aVar.f20552x;
            if (i12 != -1 && (i10 = aVar.f20553y) != -1 && i12 == aVar2.f20552x && i10 == aVar2.f20553y && z10) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new C5509h(this.f66986a, aVar, aVar2, aVar.f(aVar2) ? 3 : 2, 0);
            }
            aVar3 = aVar;
            aVar4 = aVar2;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            if (aVar3.f20518F != aVar4.f20518F) {
                i11 |= 4096;
            }
            if (aVar3.f20519G != aVar4.f20519G) {
                i11 |= 8192;
            }
            if (aVar3.f20520H != aVar4.f20520H) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.f66987b)) {
                Pair j10 = AbstractC6610O.j(aVar3);
                Pair j11 = AbstractC6610O.j(aVar4);
                if (j10 != null && j11 != null) {
                    int intValue = ((Integer) j10.first).intValue();
                    int intValue2 = ((Integer) j11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C5509h(this.f66986a, aVar3, aVar4, 3, 0);
                    }
                }
            }
            if (!aVar3.f(aVar4)) {
                i11 |= 32;
            }
            if (y(this.f66987b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new C5509h(this.f66986a, aVar3, aVar4, 1, 0);
            }
        }
        return new C5509h(this.f66986a, aVar3, aVar4, 0, i11);
    }

    public final float f(int i10, int i11) {
        float f10 = 1024.0f;
        if (v(i10, i11, 1024.0f)) {
            return 1024.0f;
        }
        float f11 = 0.0f;
        while (true) {
            float f12 = f10 - f11;
            if (Math.abs(f12) <= 5.0f) {
                return f11;
            }
            float f13 = (f12 / 2.0f) + f11;
            if (v(i10, i11, f13)) {
                f11 = f13;
            } else {
                f10 = f13;
            }
        }
    }

    public float g(int i10, int i11) {
        if (!this.f66997l) {
            return -3.4028235E38f;
        }
        float f10 = this.f67000o;
        if (f10 != -3.4028235E38f && this.f66998m == i10 && this.f66999n == i11) {
            return f10;
        }
        float f11 = f(i10, i11);
        this.f67000o = f11;
        this.f66998m = i10;
        this.f66999n = i11;
        return f11;
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66989d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66989d;
        if (codecCapabilities == null) {
            x("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("channelCount.aCaps");
            return false;
        }
        if (a(this.f66986a, this.f66987b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        x("channelCount.support, " + i10);
        return false;
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66989d;
        if (codecCapabilities == null) {
            x("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        x("sampleRate.support, " + i10);
        return false;
    }

    public final boolean l(androidx.media3.common.a aVar, boolean z10) {
        Pair j10 = AbstractC6610O.j(aVar);
        String str = aVar.f20543o;
        if (str != null && str.equals("video/mv-hevc")) {
            String u10 = AbstractC2335D.u(this.f66988c);
            if (u10.equals("video/mv-hevc")) {
                return true;
            }
            if (u10.equals("video/hevc")) {
                j10 = AbstractC6610O.s(aVar);
            }
        }
        if (j10 == null) {
            return true;
        }
        int intValue = ((Integer) j10.first).intValue();
        int intValue2 = ((Integer) j10.second).intValue();
        if ("video/dolby-vision".equals(aVar.f20543o)) {
            String str2 = this.f66987b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    intValue2 = 0;
                    intValue = 2;
                    break;
                case "video/avc":
                    intValue = 8;
                    intValue2 = 0;
                    break;
            }
        }
        if (!this.f66997l && intValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z10) && !C(this.f66987b, intValue))) {
                return true;
            }
        }
        x("codec.profileLevel, " + aVar.f20539k + ", " + this.f66988c);
        return false;
    }

    public final boolean m(androidx.media3.common.a aVar) {
        return (Objects.equals(aVar.f20543o, "audio/flac") && aVar.f20520H == 22 && Build.VERSION.SDK_INT < 34 && this.f66986a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public boolean o(androidx.media3.common.a aVar) {
        return r(aVar) && l(aVar, false) && m(aVar);
    }

    public boolean p(androidx.media3.common.a aVar) {
        int i10;
        int i11;
        if (!r(aVar) || !l(aVar, true) || !m(aVar)) {
            return false;
        }
        if (!this.f66997l) {
            int i12 = aVar.f20519G;
            return (i12 == -1 || k(i12)) && ((i10 = aVar.f20518F) == -1 || j(i10));
        }
        int i13 = aVar.f20550v;
        if (i13 <= 0 || (i11 = aVar.f20551w) <= 0) {
            return true;
        }
        return v(i13, i11, aVar.f20554z);
    }

    public boolean q() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.f66987b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(androidx.media3.common.a aVar) {
        return this.f66987b.equals(aVar.f20543o) || this.f66987b.equals(AbstractC6610O.g(aVar));
    }

    public boolean s(androidx.media3.common.a aVar) {
        if (this.f66997l) {
            return this.f66990e;
        }
        Pair j10 = AbstractC6610O.j(aVar);
        return j10 != null && ((Integer) j10.first).intValue() == 42;
    }

    public String toString() {
        return this.f66986a;
    }

    public boolean v(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66989d;
        if (codecCapabilities == null) {
            x("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            x("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int c10 = z.c(videoCapabilities, i10, i11, d10);
            if (c10 == 2) {
                return true;
            }
            if (c10 == 1) {
                x("sizeAndRate.cover, " + i10 + C5444x.f55808b + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !D(this.f66986a) || !d(videoCapabilities, i11, i10, d10)) {
                x("sizeAndRate.support, " + i10 + C5444x.f55808b + i11 + "@" + d10);
                return false;
            }
            w("sizeAndRate.rotated, " + i10 + C5444x.f55808b + i11 + "@" + d10);
        }
        return true;
    }

    public final void w(String str) {
        AbstractC4156x.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f66986a + ", " + this.f66987b + "] [" + Z.f45507e + "]");
    }

    public final void x(String str) {
        AbstractC4156x.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f66986a + ", " + this.f66987b + "] [" + Z.f45507e + "]");
    }
}
