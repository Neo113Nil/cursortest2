package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
final class j extends c {
    public j(Context context, b bVar, d dVar) {
        super(CrashType.JAVA, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a = super.a(i, aVar);
        if (i == 0) {
            a.a("app_count", (Object) 1);
            a.a("magic_tag", "ss_app_log");
            Header a2 = Header.a(this.b);
            a2.c();
            a.a(a2);
            com.apm.insight.a.a(a, a2, this.a);
            return a;
        }
        if (i == 1) {
            Header d = a.d();
            d.d();
            d.e();
            return a;
        }
        if (i == 2) {
            Header.a(a.d());
            return a;
        }
        if (i != 5) {
            return a;
        }
        Header.b(a.d());
        return a;
    }
}
