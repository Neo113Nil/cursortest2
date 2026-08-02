package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e {
    private static final String a = "com.mbridge.msdk.mbnative.controller.e";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                n a2 = n.a(g.a(context));
                if (TextUtils.isEmpty(str) || a2 == null || a2.d() <= 0) {
                    return;
                }
                List<com.mbridge.msdk.foundation.entity.n> a3 = a2.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> a4 = a2.a("2000021");
                List<com.mbridge.msdk.foundation.entity.n> a5 = a2.a("m_download_end");
                o.e(a4);
                o.a(a3);
                o.b(a5);
            } catch (Exception e) {
                q0.b(a, e.getMessage());
            }
        }
    }
}
