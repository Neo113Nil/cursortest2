package com.inmobi.media;

import android.os.Debug;
import com.inmobi.media.core.config.models.CrashConfig;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3834vf {
    public static final CrashConfig a = (CrashConfig) AbstractC3435g4.a.a(CrashConfig.class);

    static {
        System.currentTimeMillis();
    }

    public static void a(JSONObject jSONObject, boolean z, boolean z2, long j) {
        int i;
        int i2;
        long j2;
        long j3;
        long[] jArr;
        jSONObject.getClass();
        if (a.getCrashConfig().getReportOOMInfo() && z) {
            AbstractC3410f5 abstractC3410f5 = z2 ? C3384e5.d : C3333c5.d;
            abstractC3410f5.getClass();
            Qa a2 = AbstractC3364da.a();
            if (a2 != null) {
                String str = abstractC3410f5.c;
                str.getClass();
                a2.a(abstractC3410f5.c, a2.a.getInt(str, 0) + 1, true);
            }
            abstractC3410f5.getClass();
            Qa a3 = AbstractC3364da.a();
            if (a3 != null) {
                String str2 = abstractC3410f5.a;
                str2.getClass();
                long j4 = a3.a.getLong(str2, 0L);
                String str3 = abstractC3410f5.b;
                if (j4 == 0) {
                    a3.a(str3, j, true);
                } else {
                    a3.a(str3, j - j4, true);
                }
            }
            if (z2) {
                C3384e5 c3384e5 = C3384e5.d;
                c3384e5.getClass();
                Qa a4 = AbstractC3364da.a();
                if (a4 != null) {
                    String str4 = c3384e5.c;
                    str4.getClass();
                    i = a4.a.getInt(str4, 0);
                } else {
                    i = 0;
                }
                C3333c5 c3333c5 = C3333c5.d;
                c3333c5.getClass();
                Qa a5 = AbstractC3364da.a();
                if (a5 != null) {
                    String str5 = c3333c5.c;
                    str5.getClass();
                    i2 = a5.a.getInt(str5, 0);
                } else {
                    i2 = 0;
                }
                int i3 = i + i2;
                float f = i3 > 0 ? (i * 100.0f) / i3 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                jSONObject.put("inmobiOOMCount", i);
                jSONObject.put("appOOMCount", i2);
                c3333c5.getClass();
                Qa a6 = AbstractC3364da.a();
                if (a6 != null) {
                    String str6 = c3333c5.b;
                    str6.getClass();
                    j2 = a6.a.getLong(str6, 0L);
                } else {
                    j2 = 0;
                }
                jSONObject.put("appOomCrashInterval", j2);
                c3384e5.getClass();
                Qa a7 = AbstractC3364da.a();
                if (a7 != null) {
                    String str7 = c3384e5.b;
                    str7.getClass();
                    j3 = a7.a.getLong(str7, 0L);
                } else {
                    j3 = 0;
                }
                jSONObject.put("inmOOMCrashInterval", j3);
                jSONObject.put("oomRatioInMobiToApp", Float.valueOf(f));
                F5.a.getClass();
                if (F5.y()) {
                    long j5 = 0;
                    long j6 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (Intrinsics.c(key, "art.gc.blocking-gc-count")) {
                            value.getClass();
                            Long k0 = StringsKt.k0(value);
                            j5 = k0 != null ? k0.longValue() : 0L;
                        } else if (Intrinsics.c(key, "art.gc.gc-count")) {
                            value.getClass();
                            Long k02 = StringsKt.k0(value);
                            j6 = k02 != null ? k02.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{j5, j6};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    jSONObject.put("blockingGcCount", jArr[0]);
                    jSONObject.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
