package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.g;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xsna.ahn;
import xsna.hq10;
import xsna.io20;
import xsna.lq10;
import xsna.o19;
import xsna.tzf;
import xsna.urd0;
import xsna.xq;

@SuppressLint({"InlinedApi"})
/* loaded from: classes12.dex */
public final class MediaCodecUtil {
    public static final HashMap<a, List<hq10>> a = new HashMap<>();

    public static class DecoderQueryException extends Exception {
    }

    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((urd0.a(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    public static final class b {
        public final int a;

        @Nullable
        public MediaCodecInfo[] b;

        public b(boolean z, boolean z2, boolean z3) {
            this.a = (z || z2 || z3) ? 1 : 0;
        }
    }

    public interface c<T> {
        int a(T t);
    }

    public static void a(String str, ArrayList arrayList) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            Collections.sort(arrayList, new lq10(new xq(23)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((hq10) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((hq10) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    @Nullable
    public static String c(androidx.media3.common.a aVar) {
        Pair<Integer, Integer> b2;
        String str = aVar.n;
        String str2 = aVar.n;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(str2) && (b2 = tzf.b(aVar)) != null) {
            int intValue = ((Integer) b2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    @Nullable
    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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

    public static synchronized List<hq10> e(String str, boolean z, boolean z2) throws DecoderQueryException {
        synchronized (MediaCodecUtil.class) {
            try {
                a aVar = new a(str, z, z2);
                HashMap<a, List<hq10>> hashMap = a;
                List<hq10> list = hashMap.get(aVar);
                if (list != null) {
                    return list;
                }
                ArrayList f = f(aVar, new b(z, z2, str.equals("video/mv-hevc")));
                if (z) {
                    f.isEmpty();
                }
                a(str, f);
                ImmutableList m = ImmutableList.m(f);
                hashMap.put(aVar, m);
                return m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList f(a aVar, b bVar) throws DecoderQueryException {
        int i;
        String d;
        String str;
        boolean isAlias;
        a aVar2 = aVar;
        int i2 = bVar.a;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = aVar2.a;
            boolean z = aVar2.b;
            if (bVar.b == null) {
                bVar.b = new MediaCodecList(i2).getCodecInfos();
            }
            int length = bVar.b.length;
            int i3 = 0;
            while (i3 < length) {
                if (bVar.b == null) {
                    bVar.b = new MediaCodecList(i2).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = bVar.b[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    isAlias = mediaCodecInfo.isAlias();
                    if (isAlias) {
                        i = i3;
                        i3 = i + 1;
                        aVar2 = aVar;
                    }
                }
                int i5 = i3;
                String name = mediaCodecInfo.getName();
                if (!mediaCodecInfo.isEncoder() && (d = d(mediaCodecInfo, name, str2)) != null) {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(d);
                        boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                        boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                        boolean z2 = aVar2.c;
                        if ((z2 || !isFeatureRequired) && (!z2 || isFeatureSupported)) {
                            boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                            boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                            if ((z || !isFeatureRequired2) && (!z || isFeatureSupported2)) {
                                boolean z3 = true;
                                boolean isHardwareAccelerated = i4 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !h(mediaCodecInfo, str2);
                                i = i5;
                                boolean h = h(mediaCodecInfo, str2);
                                boolean z4 = isHardwareAccelerated;
                                if (i4 >= 29) {
                                    z3 = mediaCodecInfo.isVendor();
                                } else {
                                    String u = o19.u(mediaCodecInfo.getName());
                                    if (u.startsWith("omx.google.") || u.startsWith("c2.android.") || u.startsWith("c2.google.")) {
                                        z3 = false;
                                    }
                                }
                                if (z != isFeatureSupported2) {
                                    continue;
                                } else {
                                    str = d;
                                    try {
                                        arrayList.add(hq10.j(name, str2, str, capabilitiesForType, z4, h, z3, false));
                                    } catch (Exception e) {
                                        e = e;
                                        ahn.n("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                        throw e;
                                    }
                                }
                                i3 = i + 1;
                                aVar2 = aVar;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = d;
                    }
                }
                i = i5;
                i3 = i + 1;
                aVar2 = aVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new DecoderQueryException("Failed to query underlying media codecs", e3);
        }
    }

    public static g g(e eVar, androidx.media3.common.a aVar, boolean z, boolean z2) throws DecoderQueryException {
        List<hq10> decoderInfos = eVar.getDecoderInfos(aVar.n, z, z2);
        String c2 = c(aVar);
        List<hq10> decoderInfos2 = c2 == null ? g.f : eVar.getDecoderInfos(c2, z, z2);
        ImmutableList.a aVar2 = new ImmutableList.a();
        aVar2.e(decoderInfos);
        aVar2.e(decoderInfos2);
        return aVar2.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (io20.l(str)) {
            return true;
        }
        String u = o19.u(mediaCodecInfo.getName());
        if (u.startsWith("arc.")) {
            return false;
        }
        if (u.startsWith("omx.google.") || u.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((u.startsWith("omx.sec.") && u.contains(".sw.")) || u.equals("omx.qcom.video.decoder.hevcswvdec") || u.startsWith("c2.android.") || u.startsWith("c2.google.")) {
            return true;
        }
        return (u.startsWith("omx.") || u.startsWith("c2.")) ? false : true;
    }
}
