package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d {
    private List<a> a = new ArrayList(3);

    private d(Handler handler, Context context) {
        if (com.apm.insight.l.a.b(context)) {
            this.a.add(new c(handler));
        }
    }

    public final void a() {
        com.apm.insight.a.a((Object) ("[ScheduleTaskManager] execute, task size=" + this.a.size()));
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Throwable unused) {
            }
        }
    }

    public static d a(Handler handler, Context context) {
        return new d(handler, context);
    }
}
