package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class s3c {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        int i = 1;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            Collections.sort(arrayList, new rs2(new i3c(i), 6));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((a3c) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((a3c) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(b bVar) {
        Pair b;
        String str = bVar.o;
        String str2 = bVar.o;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(str2) && (b = wz2.b(bVar)) != null) {
            int intValue = ((Integer) b.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                w13 w13Var = bVar.E;
                if (w13Var != null && w13Var.c == 6 && w13Var.b == 1) {
                    return null;
                }
                return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

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

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (s3c.class) {
            try {
                k3c k3cVar = new k3c(str, z, z2);
                HashMap hashMap = a;
                List list = (List) hashMap.get(k3cVar);
                if (list != null) {
                    return list;
                }
                ArrayList f = f(k3cVar, new o3c(z, z2, str.equals("video/mv-hevc"), 1));
                if (z) {
                    f.isEmpty();
                }
                a(str, f);
                hv9 v = hv9.v(f);
                hashMap.put(k3cVar, v);
                return v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList f(k3c k3cVar, o3c o3cVar) {
        String d;
        String str;
        int i;
        k3c k3cVar2 = k3cVar;
        int i2 = o3cVar.a;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = k3cVar2.a;
            boolean z = k3cVar2.b;
            MediaCodecInfo[] mediaCodecInfoArr = o3cVar.b;
            if (mediaCodecInfoArr == null) {
                mediaCodecInfoArr = new MediaCodecList(i2).getCodecInfos();
                o3cVar.b = mediaCodecInfoArr;
            }
            int length = mediaCodecInfoArr.length;
            int i3 = 0;
            while (i3 < length) {
                MediaCodecInfo[] mediaCodecInfoArr2 = o3cVar.b;
                if (mediaCodecInfoArr2 == null) {
                    mediaCodecInfoArr2 = new MediaCodecList(i2).getCodecInfos();
                    o3cVar.b = mediaCodecInfoArr2;
                }
                MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr2[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfo.isAlias()) {
                    int i5 = i3;
                    String name = mediaCodecInfo.getName();
                    if (!mediaCodecInfo.isEncoder() && (d = d(mediaCodecInfo, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(d);
                            boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = k3cVar2.c;
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
                                        String W = rz8.W(mediaCodecInfo.getName());
                                        if (W.startsWith("omx.google.") || W.startsWith("c2.android.") || W.startsWith("c2.google.")) {
                                            z3 = false;
                                        }
                                    }
                                    if (z != isFeatureSupported2) {
                                        continue;
                                    } else {
                                        str = d;
                                        try {
                                            arrayList.add(a3c.i(name, str2, str, capabilitiesForType, z4, h, z3));
                                        } catch (Exception e) {
                                            e = e;
                                            tgj.z("Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = d;
                        }
                    }
                    i = i5;
                } else {
                    i = i3;
                }
                i3 = i + 1;
                k3cVar2 = k3cVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new m3c("Failed to query underlying media codecs", e3);
        }
    }

    public static vvf g(b bVar, boolean z, boolean z2) {
        Iterable e;
        List e2 = e(bVar.o, z, z2);
        String c = c(bVar);
        if (c == null) {
            av9 av9Var = hv9.b;
            e = vvf.e;
        } else {
            e = e(c, z, z2);
        }
        zu9 s = hv9.s();
        s.e(e2);
        s.e(e);
        return s.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (sjc.k(str)) {
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
}
