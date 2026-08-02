package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.kap;
import defpackage.mio;
import defpackage.o3c;
import defpackage.o5i;
import defpackage.wkf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzwl {
    public static final HashMap a = new HashMap();

    public static synchronized List a(String str, boolean z, boolean z2) {
        synchronized (zzwl.class) {
            try {
                kap kapVar = new kap(str, z, z2);
                HashMap hashMap = a;
                List list = (List) hashMap.get(kapVar);
                if (list != null) {
                    return list;
                }
                ArrayList e = e(kapVar, new o3c(z, z2, str.equals("video/mv-hevc"), 2));
                if (z) {
                    e.isEmpty();
                }
                if (MimeTypes.AUDIO_RAW.equals(str)) {
                    Collections.sort(e, new o5i(wkf.o, 5));
                }
                if (Build.VERSION.SDK_INT < 32 && e.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvs) e.get(0)).a)) {
                    e.add((zzvs) e.remove(0));
                }
                zzgxm x = zzgxm.x(e);
                hashMap.put(kapVar, x);
                return x;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static s b(zzv zzvVar, boolean z, boolean z2) {
        Iterable a2;
        List a3 = a(zzvVar.o, z, z2);
        String d = d(zzvVar);
        if (d == null) {
            mio mioVar = zzgxm.b;
            a2 = s.e;
        } else {
            a2 = a(d, z, z2);
        }
        mio mioVar2 = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        zzgxjVar.d(a3);
        zzgxjVar.d(a2);
        return zzgxjVar.f();
    }

    public static MediaCodecInfo.CodecProfileLevel c(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String d(zzv zzvVar) {
        zzdq c;
        boolean z;
        String str = zzvVar.o;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (MimeTypes.AUDIO_DTS_HD.equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return MimeTypes.AUDIO_DTS;
        }
        if ("video/dolby-vision".equals(str) && (c = zzdr.c(zzvVar)) != null && (z = c.c)) {
            zzguk.f(z);
            int i = c.a;
            if (i == 16 || i == 256) {
                return "video/hevc";
            }
            if (i == 512) {
                return "video/avc";
            }
            if (i == 1024) {
                zzi zziVar = zzvVar.F;
                if (zziVar != null && zziVar.c == 6 && zziVar.b == 1) {
                    return null;
                }
                return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127 A[Catch: Exception -> 0x012c, TryCatch #1 {Exception -> 0x012c, blocks: (B:33:0x00fe, B:37:0x0109, B:43:0x011f, B:45:0x0127, B:46:0x0138, B:48:0x0141, B:52:0x0165, B:54:0x0145, B:56:0x0155, B:58:0x015d, B:59:0x012e), top: B:32:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141 A[Catch: Exception -> 0x012c, TryCatch #1 {Exception -> 0x012c, blocks: (B:33:0x00fe, B:37:0x0109, B:43:0x011f, B:45:0x0127, B:46:0x0138, B:48:0x0141, B:52:0x0165, B:54:0x0145, B:56:0x0155, B:58:0x015d, B:59:0x012e), top: B:32:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0165 A[Catch: Exception -> 0x012c, TRY_LEAVE, TryCatch #1 {Exception -> 0x012c, blocks: (B:33:0x00fe, B:37:0x0109, B:43:0x011f, B:45:0x0127, B:46:0x0138, B:48:0x0141, B:52:0x0165, B:54:0x0145, B:56:0x0155, B:58:0x015d, B:59:0x012e), top: B:32:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145 A[Catch: Exception -> 0x012c, TryCatch #1 {Exception -> 0x012c, blocks: (B:33:0x00fe, B:37:0x0109, B:43:0x011f, B:45:0x0127, B:46:0x0138, B:48:0x0141, B:52:0x0165, B:54:0x0145, B:56:0x0155, B:58:0x015d, B:59:0x012e), top: B:32:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e A[Catch: Exception -> 0x012c, TryCatch #1 {Exception -> 0x012c, blocks: (B:33:0x00fe, B:37:0x0109, B:43:0x011f, B:45:0x0127, B:46:0x0138, B:48:0x0141, B:52:0x0165, B:54:0x0145, B:56:0x0155, B:58:0x015d, B:59:0x012e), top: B:32:0x00fe }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(kap kapVar, o3c o3cVar) {
        String str;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean isFeatureSupported;
        boolean isFeatureRequired;
        boolean isFeatureSupported2;
        int i;
        boolean z;
        int i2;
        String str2;
        String str3;
        kap kapVar2 = kapVar;
        o3c o3cVar2 = o3cVar;
        int i3 = o3cVar2.a;
        String str4 = "secure-playback";
        String str5 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = kapVar2.a;
            MediaCodecInfo[] mediaCodecInfoArr = o3cVar2.b;
            if (mediaCodecInfoArr == null) {
                mediaCodecInfoArr = new MediaCodecList(i3).getCodecInfos();
                o3cVar2.b = mediaCodecInfoArr;
            }
            int length = mediaCodecInfoArr.length;
            int i4 = 0;
            while (i4 < length) {
                MediaCodecInfo[] mediaCodecInfoArr2 = o3cVar2.b;
                if (mediaCodecInfoArr2 == null) {
                    mediaCodecInfoArr2 = new MediaCodecList(i3).getCodecInfos();
                    o3cVar2.b = mediaCodecInfoArr2;
                }
                MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr2[i4];
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias()) {
                    String name = mediaCodecInfo.getName();
                    if (!mediaCodecInfo.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length2 = supportedTypes.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length2) {
                                int i6 = i5;
                                str = supportedTypes[i6];
                                if (str.equalsIgnoreCase(str6)) {
                                    break;
                                }
                                i5 = i6 + 1;
                            } else if (str6.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if (!"OMX.RTK.video.decoder".equals(name)) {
                                        if ("OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        }
                                        str = null;
                                    }
                                    str = "video/dv_hevc";
                                }
                            } else if (str6.equals("video/mv-hevc")) {
                                if ("c2.qti.mvhevc.decoder".equals(name) || "c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str = "video/x-mvhevc";
                                }
                                str = null;
                            } else if (str6.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str6.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str6.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str = null;
                            }
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                isFeatureSupported = capabilitiesForType.isFeatureSupported(str5);
                                isFeatureRequired = capabilitiesForType.isFeatureRequired(str5);
                            } catch (Exception e) {
                                e = e;
                            }
                            try {
                                if (kapVar2.c) {
                                    if (!isFeatureSupported) {
                                    }
                                    isFeatureSupported2 = capabilitiesForType.isFeatureSupported(str4);
                                    boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired(str4);
                                    i = i3;
                                    z = kapVar2.b;
                                    if (!z) {
                                    }
                                    if (z) {
                                    }
                                    i2 = Build.VERSION.SDK_INT;
                                    str2 = str4;
                                    if (i2 < 29) {
                                    }
                                    f(mediaCodecInfo, str6);
                                    str3 = str5;
                                    if (i2 < 29) {
                                    }
                                    if (z != isFeatureSupported2) {
                                    }
                                    i4++;
                                    kapVar2 = kapVar;
                                    o3cVar2 = o3cVar;
                                    str4 = str2;
                                    i3 = i;
                                    str5 = str3;
                                } else if (!isFeatureRequired) {
                                    isFeatureSupported2 = capabilitiesForType.isFeatureSupported(str4);
                                    boolean isFeatureRequired22 = capabilitiesForType.isFeatureRequired(str4);
                                    i = i3;
                                    z = kapVar2.b;
                                    if (!z || !isFeatureRequired22) {
                                        if (z) {
                                            if (isFeatureSupported2) {
                                                isFeatureSupported2 = true;
                                            }
                                        }
                                        i2 = Build.VERSION.SDK_INT;
                                        str2 = str4;
                                        boolean isHardwareAccelerated = i2 < 29 ? mediaCodecInfo.isHardwareAccelerated() : !f(mediaCodecInfo, str6);
                                        f(mediaCodecInfo, str6);
                                        str3 = str5;
                                        if (i2 < 29) {
                                            mediaCodecInfo.isVendor();
                                        } else {
                                            String a2 = zzgts.a(mediaCodecInfo.getName());
                                            if (!a2.startsWith("omx.google.") && !a2.startsWith("c2.android.")) {
                                                a2.startsWith("c2.google.");
                                            }
                                        }
                                        if (z != isFeatureSupported2) {
                                            arrayList.add(zzvs.a(name, str6, str, capabilitiesForType, isHardwareAccelerated));
                                        }
                                        i4++;
                                        kapVar2 = kapVar;
                                        o3cVar2 = o3cVar;
                                        str4 = str2;
                                        i3 = i;
                                        str5 = str3;
                                    }
                                    str2 = str4;
                                    str3 = str5;
                                    i4++;
                                    kapVar2 = kapVar;
                                    o3cVar2 = o3cVar;
                                    str4 = str2;
                                    i3 = i;
                                    str5 = str3;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + str.length() + 1);
                                sb.append("Failed to query codec ");
                                sb.append(name);
                                sb.append(" (");
                                sb.append(str);
                                sb.append(")");
                                zzeh.e(sb.toString());
                                throw e;
                            }
                        }
                    }
                }
                i = i3;
                str2 = str4;
                str3 = str5;
                i4++;
                kapVar2 = kapVar;
                o3cVar2 = o3cVar;
                str4 = str2;
                i3 = i;
                str5 = str3;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new zzwd("Failed to query underlying media codecs", e3);
        }
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.a(str)) {
            return true;
        }
        String a2 = zzgts.a(mediaCodecInfo.getName());
        if (a2.startsWith("arc.")) {
            return false;
        }
        if (a2.startsWith("omx.google.") || a2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((a2.startsWith("omx.sec.") && a2.contains(".sw.")) || a2.equals("omx.qcom.video.decoder.hevcswvdec") || a2.startsWith("c2.android.") || a2.startsWith("c2.google.")) {
            return true;
        }
        return (a2.startsWith("omx.") || a2.startsWith("c2.")) ? false : true;
    }
}
