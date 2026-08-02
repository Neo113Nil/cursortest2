package com.inmobi.media;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3939zg {
    public static final C3347cj a = new C3347cj(1.0d - ((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getPingSamplingFactor());

    public static void a(String str, Map map) {
        str.getClass();
        map.getClass();
        if (Intrinsics.c(str, "PingDBMaxLimitReached")) {
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b(str, map, EnumC3943zk.SDK);
        } else if (a.a()) {
            C3694q4 c3694q4 = AbstractC3435g4.a;
            map.put("samplingRate", Integer.valueOf((int) ((1.0d - ((TelemetryConfig) c3694q4.a(TelemetryConfig.class)).getSamplingFactor()) * (1.0d - ((TelemetryConfig) c3694q4.a(TelemetryConfig.class)).getPingSamplingFactor()) * 100.0d)));
            C3839vk c3839vk2 = C3839vk.a;
            C3839vk.b(str, map, EnumC3943zk.SDK);
        }
    }
}
