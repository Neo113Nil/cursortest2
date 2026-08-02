package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.SparseIntArray;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.ljg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class j {
    public static final Pattern a;
    public static final HashMap b;
    public static final SparseIntArray c;
    public static final SparseIntArray d;
    public static final HashMap e;
    public static int f;

    static {
        new a("OMX.google.raw.decoder", null, null, false);
        a = Pattern.compile("^\\D?(\\d+)$");
        b = new HashMap();
        f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, NotificationCompat.FLAG_LOCAL_ONLY);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, com.ironsource.mediationsdk.metadata.a.o);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        HashMap hashMap = new HashMap();
        e = hashMap;
        ljg.s(1, 4, "L30", "L60", hashMap);
        ljg.s(16, 64, "L63", "L90", hashMap);
        ljg.s(NotificationCompat.FLAG_LOCAL_ONLY, 1024, "L93", "L120", hashMap);
        ljg.s(4096, 16384, "L123", "L150", hashMap);
        ljg.s(C.DEFAULT_BUFFER_SEGMENT_SIZE, 262144, "L153", "L156", hashMap);
        ljg.s(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, 4194304, "L180", "L183", hashMap);
        ljg.s(C.DEFAULT_MUXED_BUFFER_SIZE, 2, "L186", "H30", hashMap);
        ljg.s(8, 32, "H60", "H63", hashMap);
        ljg.s(128, 512, "H90", "H93", hashMap);
        ljg.s(com.ironsource.mediationsdk.metadata.a.o, 8192, "H120", "H123", hashMap);
        ljg.s(32768, 131072, "H150", "H153", hashMap);
        ljg.s(524288, 2097152, "H156", "H180", hashMap);
        ljg.s(8388608, 33554432, "H183", "H186", hashMap);
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = z.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(z.b)) {
            return false;
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = z.b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = z.b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && Payload.SOURCE_SAMSUNG.equals(z.c)) {
            String str4 = z.b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        return (i <= 19 && z.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2 = f;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        a a2 = a(false, "video/avc");
        if (a2 != null) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = a2.e;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i4 = 0;
            while (i3 < length) {
                int i5 = codecProfileLevelArr[i3].level;
                if (i5 != 1 && i5 != 2) {
                    switch (i5) {
                        case 8:
                        case 16:
                        case 32:
                            i = 101376;
                            break;
                        case 64:
                            i = 202752;
                            break;
                        case 128:
                        case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                            i = 414720;
                            break;
                        case 512:
                            i = 921600;
                            break;
                        case 1024:
                            i = 1310720;
                            break;
                        case com.ironsource.mediationsdk.metadata.a.o /* 2048 */:
                        case 4096:
                            i = 2097152;
                            break;
                        case 8192:
                            i = 2228224;
                            break;
                        case 16384:
                            i = 5652480;
                            break;
                        case 32768:
                        case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                            i = 9437184;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = 25344;
                }
                i4 = Math.max(i, i4);
                i3++;
            }
            i3 = Math.max(i4, z.a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
        }
        f = i3;
        return i3;
    }

    public static ArrayList a(e eVar, g gVar) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            String str = eVar.a;
            int a2 = gVar.a();
            boolean b2 = gVar.b();
            loop0: for (int i = 0; i < a2; i++) {
                MediaCodecInfo a3 = gVar.a(i);
                String name = a3.getName();
                if (a(a3, name, b2)) {
                    for (String str2 : a3.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = a3.getCapabilitiesForType(str2);
                                boolean a4 = gVar.a(str, capabilitiesForType);
                                if (z.a <= 22) {
                                    String str3 = z.d;
                                    if (!str3.equals("ODROID-XU3")) {
                                        if (str3.equals("Nexus 10")) {
                                        }
                                    }
                                    if ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name)) {
                                        z = true;
                                        if ((b2 || eVar.b != a4) && (b2 || eVar.b)) {
                                            if (!b2 && a4) {
                                                arrayList.add(new a(name + ".secure", str, capabilitiesForType, z));
                                                break loop0;
                                            }
                                        } else {
                                            arrayList.add(new a(name, str, capabilitiesForType, z));
                                        }
                                    }
                                }
                                z = false;
                                if (b2) {
                                }
                                if (!b2) {
                                    arrayList.add(new a(name + ".secure", str, capabilitiesForType, z));
                                    break loop0;
                                    break loop0;
                                }
                                continue;
                            } catch (Exception e2) {
                                if (z.a > 23 || arrayList.isEmpty()) {
                                    throw e2;
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e3) {
            throw new f(e3);
        }
    }

    public static a a(boolean z, String str) {
        List list;
        synchronized (j.class) {
            try {
                e eVar = new e(z, str);
                list = (List) b.get(eVar);
                if (list == null) {
                    int i = z.a;
                    ArrayList a2 = a(eVar, i >= 21 ? new i(z) : new h());
                    if (z && a2.isEmpty() && 21 <= i && i <= 23) {
                        a2 = a(eVar, new h());
                        if (!a2.isEmpty()) {
                            String str2 = ((a) a2.get(0)).a;
                        }
                    }
                    if (i < 26) {
                        int i2 = 1;
                        if (a2.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((a) a2.get(0)).a)) {
                            while (true) {
                                if (i2 >= a2.size()) {
                                    break;
                                }
                                a aVar = (a) a2.get(i2);
                                if ("OMX.google.raw.decoder".equals(aVar.a)) {
                                    a2.remove(i2);
                                    a2.add(0, aVar);
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    list = Collections.unmodifiableList(a2);
                    b.put(eVar, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (a) list.get(0);
    }
}
