package com.apm.insight.j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c extends a {
    public c(Handler handler) {
        super(handler, 15000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (e.c().b()) {
            return;
        }
        String d = e.a().d();
        if (TextUtils.isEmpty(d) || "0".equals(d)) {
            a(b());
            com.apm.insight.a.a((Object) "[DeviceIdTask] did is null, continue check.");
        } else {
            e.c().a(d);
            com.apm.insight.a.a((Object) "[DeviceIdTask] did is ".concat(String.valueOf(d)));
        }
    }
}
