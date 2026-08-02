package t2;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import b1.AbstractC2335D;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.C3427g;
import com.google.common.collect.E;
import e1.AbstractC4134a;

/* renamed from: t2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6416q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3427g f65495a = C3427g.F();

    /* renamed from: t2.q0$a */
    public static final class a {
        public static boolean a(MediaCodecInfo mediaCodecInfo) {
            boolean isHardwareAccelerated;
            isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
            return isHardwareAccelerated;
        }

        public static boolean b(MediaCodecInfo mediaCodecInfo) {
            boolean isSoftwareOnly;
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
    }

    public static int a(int i10, int i11) {
        return i10 % 10 == 1 ? (int) (i11 * Math.floor(i10 / i11)) : i11 * Math.round(i10 / i11);
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i10) {
        int i11 = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i10) {
                i11 = Math.max(i11, codecProfileLevel.level);
            }
        }
        return i11;
    }

    public static com.google.common.collect.E c(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo.getCapabilitiesForType(str).profileLevels;
        E.a aVar = new E.a();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            aVar.a(Integer.valueOf(codecProfileLevel.profile));
        }
        return aVar.m();
    }

    public static int d(MediaCodecInfo mediaCodecInfo, String str, int i10) {
        MediaCodecInfo.AudioCapabilities audioCapabilities = (MediaCodecInfo.AudioCapabilities) AbstractC4134a.e(mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities());
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        if (supportedSampleRates != null) {
            int length = supportedSampleRates.length;
            while (i11 < length) {
                int i13 = supportedSampleRates[i11];
                if (Math.abs(i13 - i10) < Math.abs(i12 - i10)) {
                    i12 = i13;
                }
                i11++;
            }
            return i12;
        }
        Range<Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
        int length2 = supportedSampleRateRanges.length;
        while (i11 < length2) {
            int intValue = supportedSampleRateRanges[i11].clamp(Integer.valueOf(i10)).intValue();
            if (Math.abs(intValue - i10) < Math.abs(i12 - i10)) {
                i12 = intValue;
            }
            i11++;
        }
        return i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:
    
        if (r5.equals("video/hevc") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC3445z e(String str, int i10) {
        char c10 = 2;
        str.getClass();
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                if (i10 == 7) {
                    return AbstractC3445z.u(256);
                }
                break;
            case 1:
                if (i10 == 7) {
                    return AbstractC3445z.u(2);
                }
                if (i10 == 6) {
                    return AbstractC3445z.u(4096);
                }
                break;
            case 2:
                if (i10 == 7) {
                    return AbstractC3445z.u(2);
                }
                if (i10 == 6) {
                    return AbstractC3445z.u(4096);
                }
                break;
            case 3:
                if (i10 == 7) {
                    return AbstractC3445z.u(16);
                }
                break;
            case 4:
                if (i10 == 7 || i10 == 6) {
                    return AbstractC3445z.v(4096, 8192);
                }
        }
        return AbstractC3445z.t();
    }

    public static Range f(MediaCodecInfo mediaCodecInfo, String str) {
        return ((MediaCodecInfo.VideoCapabilities) AbstractC4134a.e(mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities())).getBitrateRange();
    }

    public static AbstractC3445z g(MediaCodecInfo mediaCodecInfo, String str) {
        return AbstractC3445z.o(com.google.common.primitives.f.c(mediaCodecInfo.getCapabilitiesForType(str).colorFormats));
    }

    public static synchronized AbstractC3445z h(String str) {
        AbstractC3445z o10;
        synchronized (AbstractC6416q0.class) {
            q();
            o10 = AbstractC3445z.o(f65495a.get(Ra.c.e(str)));
        }
        return o10;
    }

    public static AbstractC3445z i(String str, C2357k c2357k) {
        boolean isAlias;
        if (Build.VERSION.SDK_INT < 33 || c2357k == null) {
            return AbstractC3445z.t();
        }
        AbstractC3445z h10 = h(str);
        AbstractC3445z.a aVar = new AbstractC3445z.a();
        for (int i10 = 0; i10 < h10.size(); i10++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) h10.get(i10);
            isAlias = mediaCodecInfo.isAlias();
            if (!isAlias && n(mediaCodecInfo, str, c2357k)) {
                aVar.a(mediaCodecInfo);
            }
        }
        return aVar.m();
    }

    public static Size j(MediaCodecInfo mediaCodecInfo, String str, int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = (MediaCodecInfo.VideoCapabilities) AbstractC4134a.e(mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities());
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int a10 = a(i10, widthAlignment);
        int a11 = a(i11, heightAlignment);
        if (o(mediaCodecInfo, str, a10, a11)) {
            return new Size(a10, a11);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i12 = 0; i12 < 13; i12++) {
            float f10 = fArr[i12];
            int a12 = a(Math.round(i10 * f10), widthAlignment);
            int a13 = a(Math.round(i11 * f10), heightAlignment);
            if (o(mediaCodecInfo, str, a12, a13)) {
                return new Size(a12, a13);
            }
        }
        int intValue = videoCapabilities.getSupportedHeightsFor(videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i10)).intValue()).clamp(Integer.valueOf(i11)).intValue();
        if (intValue != i11) {
            i10 = a((int) Math.round((i10 * intValue) / i11), widthAlignment);
            i11 = a(intValue, heightAlignment);
        }
        if (o(mediaCodecInfo, str, i10, i11)) {
            return new Size(i10, i11);
        }
        return null;
    }

    public static boolean k(MediaCodecInfo mediaCodecInfo, String str, int i10) {
        return ((MediaCodecInfo.EncoderCapabilities) AbstractC4134a.e(mediaCodecInfo.getCapabilitiesForType(str).getEncoderCapabilities())).isBitrateModeSupported(i10);
    }

    public static boolean l(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        return mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported(str2);
    }

    public static boolean m(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? a.a(mediaCodecInfo) : !p(mediaCodecInfo, str);
    }

    public static boolean n(MediaCodecInfo mediaCodecInfo, String str, C2357k c2357k) {
        if (!str.equals("video/dolby-vision") && !l(mediaCodecInfo, str, "hdr-editing") && (c2357k.f24606c != 7 || Build.VERSION.SDK_INT < 35 || !l(mediaCodecInfo, str, "hlg-editing"))) {
            return false;
        }
        AbstractC3445z e10 = e(str, c2357k.f24606c);
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (e10.contains(Integer.valueOf(codecProfileLevel.profile))) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(MediaCodecInfo mediaCodecInfo, String str, int i10, int i11) {
        if (((MediaCodecInfo.VideoCapabilities) AbstractC4134a.e(mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities())).isSizeSupported(i10, i11)) {
            return true;
        }
        if (i10 == 1920 && i11 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i10 == 3840 && i11 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static boolean p(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.b(mediaCodecInfo);
        }
        if (AbstractC2335D.o(str)) {
            return true;
        }
        String e10 = Ra.c.e(mediaCodecInfo.getName());
        if (e10.startsWith("arc.")) {
            return false;
        }
        return e10.startsWith("omx.google.") || e10.startsWith("omx.ffmpeg.") || (e10.startsWith("omx.sec.") && e10.contains(".sw.")) || e10.equals("omx.qcom.video.decoder.hevcswvdec") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.") || !(e10.startsWith("omx.") || e10.startsWith("c2."));
    }

    public static synchronized void q() {
        synchronized (AbstractC6416q0.class) {
            if (f65495a.i()) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    if (mediaCodecInfo.isEncoder()) {
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            f65495a.put(Ra.c.e(str), mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }
}
