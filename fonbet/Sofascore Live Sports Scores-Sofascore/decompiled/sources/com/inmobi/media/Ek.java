package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.core.config.models.TelemetryConfig;
import defpackage.kz3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ek {
    public TelemetryConfig a;

    public Ek(TelemetryConfig telemetryConfig) {
        telemetryConfig.getClass();
        this.a = telemetryConfig;
        ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{150, 152}, new kz3(this, 17));
    }

    public static final Unit a(Ek ek, N2 n2) {
        n2.getClass();
        switch (n2.a) {
            case 150:
                Map map = n2.c;
                Object obj = map != null ? map.get("data") : null;
                ek.a("CrashEventOccurred", obj instanceof C3307b5 ? (C3307b5) obj : null);
                break;
            case 151:
                Map map2 = n2.c;
                Object obj2 = map2 != null ? map2.get("data") : null;
                C3869wo c3869wo = obj2 instanceof C3869wo ? (C3869wo) obj2 : null;
                ek.getClass();
                if (c3869wo != null && Hl.a(c3869wo)) {
                    F5.a.getClass();
                    if (!F5.t()) {
                        ek.a("MainThreadBlockedEvent", c3869wo);
                        break;
                    }
                }
                break;
            case 152:
                Map map3 = n2.c;
                Object obj3 = map3 != null ? map3.get("data") : null;
                ek.a(obj3 instanceof D1 ? (D1) obj3 : null);
                break;
        }
        return Unit.a;
    }

    public final void a(D1 d1) {
        if (Build.VERSION.SDK_INT < 30 || d1 == null || d1.g != 6) {
            return;
        }
        a("ANREvent", d1);
    }

    public final void a(String str, C3312ba c3312ba) {
        if (this.a.getPriorityEventsList().contains(str) && c3312ba != null && Hl.a(c3312ba)) {
            C3839vk.b(str, new LinkedHashMap(), EnumC3943zk.SDK);
        }
    }
}
