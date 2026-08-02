package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import xsna.xzl;
import xsna.zz9;

/* compiled from: MBIdsMergeStoreUtil.java */
/* loaded from: classes13.dex */
public class d {
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
            b.a(d).b("c", str2);
        } catch (Throwable th) {
            q0.b("MBIdsMergeStoreUtil", th.getMessage());
        }
    }

    public void a(String str, String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new zz9(5, str, str2));
    }

    public void a() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new xzl(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (d == null) {
                return;
            }
            String a = b.a(d).a("b", "");
            String a2 = b.a(d).a("c", "");
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
}
