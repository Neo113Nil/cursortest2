package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzch {
    public static List b;
    public static final HashMap a = new HashMap();
    public static final Object c = new Object();

    public static Integer[] a(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    public static List zza(String str) {
        ArrayList arrayList;
        Object obj = c;
        synchronized (obj) {
            HashMap hashMap = a;
            if (hashMap.containsKey(str)) {
                return (List) hashMap.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (b == null) {
                            b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                hashMap2.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    hashMap2.put("bitRatesBps", a(videoCapabilities.getBitrateRange()));
                                    hashMap2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                    hashMap2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                    hashMap2.put("frameRates", a(videoCapabilities.getSupportedFrameRates()));
                                    hashMap2.put("widths", a(videoCapabilities.getSupportedWidths()));
                                    hashMap2.put("heights", a(videoCapabilities.getSupportedHeights()));
                                }
                                hashMap2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(hashMap2);
                            }
                        }
                        a.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e) {
                e = e;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap3);
                a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e2) {
                e = e2;
                HashMap hashMap32 = new HashMap();
                hashMap32.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(hashMap32);
                a.put(str, arrayList32);
                return arrayList32;
            }
        }
    }
}
