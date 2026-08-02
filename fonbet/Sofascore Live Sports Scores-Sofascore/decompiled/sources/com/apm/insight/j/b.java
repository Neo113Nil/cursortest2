package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.e;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b extends a {
    private static Runnable b = new Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public final void run() {
            m.a().a().removeCallbacks(this);
            m.a().a(new b(m.a().a(), e.g()));
        }
    };
    private Context a;

    public b(Handler handler, Context context) {
        super(handler, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        this.a = context;
    }

    public static void c() {
        m.a().a(b, 100L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map<String, Object> map;
        try {
            map = e.a().c().getCommonParams();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (com.apm.insight.nativecrash.b.a(map)) {
                    a(b());
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        o.a().a(map, com.apm.insight.entity.b.b());
    }
}
