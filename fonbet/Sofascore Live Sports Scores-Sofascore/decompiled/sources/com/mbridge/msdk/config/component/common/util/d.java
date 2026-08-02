package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.x;
import defpackage.ztk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d == null) {
                return;
            }
            String a = b.a(d).a("b", "");
            String a2 = b.a(d).a(com.mbridge.msdk.foundation.controller.a.q, "");
            if (!TextUtils.isEmpty(a)) {
                com.mbridge.msdk.foundation.same.a.V = a;
            }
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.g = a2;
        } catch (Throwable th) {
            q0.b("MBIdsMergeStoreUtil", th.getMessage());
        }
    }

    public void a() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new x(27));
    }

    public void a(String str, String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new ztk(str, str2, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, String str2) {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                b.a(d).b("b", str);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            b.a(d).b(com.mbridge.msdk.foundation.controller.a.q, str2);
        } catch (Throwable th) {
            q0.b("MBIdsMergeStoreUtil", th.getMessage());
        }
    }
}
