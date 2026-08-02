package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzvx {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzve zza() throws zzvp {
        List zzb2 = zzb(MimeTypes.AUDIO_RAW, false, false);
        if (zzb2.isEmpty()) {
            return null;
        }
        return (zzve) zzb2.get(0);
    }

    public static synchronized List zzb(String str, boolean z, boolean z2) throws zzvp {
        synchronized (zzvx.class) {
            zzvo zzvoVar = new zzvo(str, z, z2);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zzvoVar);
            if (list != null) {
                return list;
            }
            ArrayList zzh = zzh(zzvoVar, new zzvs(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                zzh.isEmpty();
            }
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && zzh.size() == 1 && ((zzve) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzve.zza("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
                }
                zzj(zzh, zzvt.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzve) zzh.get(0)).zza)) {
                zzh.add((zzve) zzh.remove(0));
            }
            zzgvz zzq = zzgvz.zzq(zzh);
            hashMap.put(zzvoVar, zzq);
            return zzq;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzc(zzvn zzvnVar, zzv zzvVar, boolean z, boolean z2) throws zzvp {
        List zza2 = zzvnVar.zza(zzvVar.zzp, z, z2);
        List zzd = zzd(zzvnVar, zzvVar, z, z2);
        int i = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        zzgvwVar.zzh(zza2);
        zzgvwVar.zzh(zzd);
        return zzgvwVar.zzi();
    }

    public static List zzd(zzvn zzvnVar, zzv zzvVar, boolean z, boolean z2) throws zzvp {
        String zzg = zzg(zzvVar);
        return zzg == null ? zzgvz.zzi() : zzvnVar.zza(zzg, z, z2);
    }

    public static List zze(final Context context, List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzvw() { // from class: com.google.android.gms.internal.ads.zzvv
            @Override // com.google.android.gms.internal.ads.zzvw
            public final /* synthetic */ int zza(Object obj) {
                int i = zzvx.zza;
                return ((zzve) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        Pair zze;
        String str = zzvVar.zzp;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str) && (zze = zzdp.zze(zzvVar)) != null) {
            int intValue = ((Integer) zze.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zziVar.zzd == 6 && zziVar.zzc == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128 A[Catch: Exception -> 0x01c7, TryCatch #2 {Exception -> 0x01c7, blocks: (B:28:0x00f0, B:32:0x010c, B:38:0x0120, B:40:0x0128, B:41:0x013a, B:43:0x0148, B:74:0x014d, B:76:0x015d, B:78:0x0165, B:82:0x012e), top: B:27:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148 A[Catch: Exception -> 0x01c7, TryCatch #2 {Exception -> 0x01c7, blocks: (B:28:0x00f0, B:32:0x010c, B:38:0x0120, B:40:0x0128, B:41:0x013a, B:43:0x0148, B:74:0x014d, B:76:0x015d, B:78:0x0165, B:82:0x012e), top: B:27:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d A[Catch: Exception -> 0x01c7, TryCatch #2 {Exception -> 0x01c7, blocks: (B:28:0x00f0, B:32:0x010c, B:38:0x0120, B:40:0x0128, B:41:0x013a, B:43:0x0148, B:74:0x014d, B:76:0x015d, B:78:0x0165, B:82:0x012e), top: B:27:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012e A[Catch: Exception -> 0x01c7, TryCatch #2 {Exception -> 0x01c7, blocks: (B:28:0x00f0, B:32:0x010c, B:38:0x0120, B:40:0x0128, B:41:0x013a, B:43:0x0148, B:74:0x014d, B:76:0x015d, B:78:0x0165, B:82:0x012e), top: B:27:0x00f0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zzvo zzvoVar, zzvq zzvqVar) throws zzvp {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        String str4;
        String str5;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean z2;
        boolean zzi;
        boolean z3;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z4;
        boolean z5;
        zzvo zzvoVar2 = zzvoVar;
        zzvq zzvqVar2 = zzvqVar;
        String str6 = "secure-playback";
        String str7 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str8 = zzvoVar2.zza;
            int zza2 = zzvqVar2.zza();
            boolean zzc = zzvqVar2.zzc();
            int i3 = 0;
            while (i3 < zza2) {
                MediaCodecInfo zzb2 = zzvqVar2.zzb(i3);
                if (Build.VERSION.SDK_INT < 29 || !zzb2.isAlias()) {
                    int i4 = zza2;
                    String name = zzb2.getName();
                    if (!zzb2.isEncoder() && (zzc || !name.endsWith(".secure"))) {
                        String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                int i6 = i5;
                                str3 = supportedTypes[i6];
                                if (str3.equalsIgnoreCase(str8)) {
                                    break;
                                }
                                i5 = i6 + 1;
                            } else if (str8.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str3 = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str3 = "video/dv_hevc";
                                    }
                                    str3 = null;
                                }
                            } else if (str8.equals("video/mv-hevc")) {
                                if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                    if ("c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    }
                                    str3 = null;
                                }
                                str3 = "video/x-mvhevc";
                            } else if (str8.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(name)) {
                                str3 = "audio/x-lg-alac";
                            } else if (str8.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(name)) {
                                str3 = "audio/x-lg-flac";
                            } else {
                                if (str8.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(name)) {
                                    str3 = "audio/lg-ac3";
                                }
                                str3 = null;
                            }
                        }
                        if (str3 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = zzb2.getCapabilitiesForType(str3);
                                boolean zzd = zzvqVar2.zzd(str7, str3, capabilitiesForType);
                                boolean zze = zzvqVar2.zze(str7, str3, capabilitiesForType);
                                str2 = str7;
                                if (zzvoVar2.zzc) {
                                    if (!zzd) {
                                        str = str6;
                                        i = i3;
                                        i2 = i4;
                                    }
                                    boolean zzd2 = zzvqVar2.zzd(str6, str3, capabilitiesForType);
                                    boolean zze2 = zzvqVar2.zze(str6, str3, capabilitiesForType);
                                    z = zzvoVar2.zzb;
                                    if (!z) {
                                    }
                                    if (z) {
                                    }
                                    str = str6;
                                    if (Build.VERSION.SDK_INT < 29) {
                                    }
                                    zzi = zzi(zzb2, str8);
                                    z3 = z2;
                                    codecCapabilities2 = codecCapabilities;
                                    if (Build.VERSION.SDK_INT < 29) {
                                    }
                                    if (zzc) {
                                    }
                                    z5 = z4;
                                    i = i3;
                                    i2 = i4;
                                    str4 = str3;
                                    str5 = name;
                                    if (!zzc) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 7);
                                        sb.append(str5);
                                        sb.append(".secure");
                                        arrayList.add(zzve.zza(sb.toString(), str8, str4, codecCapabilities2, z3, zzi, z5, false, true));
                                        return arrayList;
                                    }
                                    continue;
                                } else {
                                    if (!zze) {
                                        boolean zzd22 = zzvqVar2.zzd(str6, str3, capabilitiesForType);
                                        boolean zze22 = zzvqVar2.zze(str6, str3, capabilitiesForType);
                                        z = zzvoVar2.zzb;
                                        if (!z || !zze22) {
                                            if (z) {
                                                if (zzd22) {
                                                    zzd22 = true;
                                                }
                                            }
                                            str = str6;
                                            if (Build.VERSION.SDK_INT < 29) {
                                                z2 = zzb2.isHardwareAccelerated();
                                                codecCapabilities = capabilitiesForType;
                                            } else {
                                                codecCapabilities = capabilitiesForType;
                                                z2 = !zzi(zzb2, str8);
                                            }
                                            zzi = zzi(zzb2, str8);
                                            z3 = z2;
                                            codecCapabilities2 = codecCapabilities;
                                            if (Build.VERSION.SDK_INT < 29) {
                                                z4 = zzb2.isVendor();
                                            } else {
                                                String zza3 = zzgsf.zza(zzb2.getName());
                                                z4 = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                            }
                                            if ((zzc || z != zzd22) && (zzc || z)) {
                                                z5 = z4;
                                                i = i3;
                                                i2 = i4;
                                                str4 = str3;
                                                str5 = name;
                                                if (!zzc && zzd22) {
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 7);
                                                    sb2.append(str5);
                                                    sb2.append(".secure");
                                                    arrayList.add(zzve.zza(sb2.toString(), str8, str4, codecCapabilities2, z3, zzi, z5, false, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                i2 = i4;
                                                boolean z6 = z4;
                                                i = i3;
                                                str4 = str3;
                                                try {
                                                    str5 = name;
                                                    try {
                                                        arrayList.add(zzve.zza(name, str8, str4, codecCapabilities2, z3, zzi, z6, false, false));
                                                    } catch (Exception e) {
                                                        e = e;
                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 24 + str4.length() + 1);
                                                        sb3.append("Failed to query codec ");
                                                        sb3.append(str5);
                                                        sb3.append(" (");
                                                        sb3.append(str4);
                                                        sb3.append(")");
                                                        zzef.zze("MediaCodecUtil", sb3.toString());
                                                        throw e;
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    str5 = name;
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(str5).length() + 24 + str4.length() + 1);
                                                    sb32.append("Failed to query codec ");
                                                    sb32.append(str5);
                                                    sb32.append(" (");
                                                    sb32.append(str4);
                                                    sb32.append(")");
                                                    zzef.zze("MediaCodecUtil", sb32.toString());
                                                    throw e;
                                                }
                                            }
                                        }
                                    }
                                    str = str6;
                                    i = i3;
                                    i2 = i4;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str4 = str3;
                            }
                        }
                    }
                    str = str6;
                    str2 = str7;
                    i = i3;
                    i2 = i4;
                } else {
                    str = str6;
                    str2 = str7;
                    i2 = zza2;
                    i = i3;
                }
                i3 = i + 1;
                zzvoVar2 = zzvoVar;
                zza2 = i2;
                str6 = str;
                str7 = str2;
                zzvqVar2 = zzvqVar;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zzvp(e4, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String zza2 = zzgsf.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.") || ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google."))) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzvw zzvwVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvu
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i = zzvx.zza;
                zzvw zzvwVar2 = zzvw.this;
                return zzvwVar2.zza(obj2) - zzvwVar2.zza(obj);
            }
        });
    }
}
