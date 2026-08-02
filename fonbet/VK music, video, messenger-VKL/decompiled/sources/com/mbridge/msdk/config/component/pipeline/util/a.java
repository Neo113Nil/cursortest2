package com.mbridge.msdk.config.component.pipeline.util;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: PipelineUtil.java */
/* loaded from: classes13.dex */
public class a {
    public static long a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return str.contains(".") ? Math.round(Float.parseFloat(str) * 1000.0f) : Integer.parseInt(str) * 1000;
        } catch (Throwable unused) {
            q0.b("PipelineUtil", "Pipeline convert delay time error, will use 0");
            return 0L;
        }
    }

    public static String a() {
        int lastIndexOf;
        Package r0 = com.mbridge.msdk.config.component.pipeline.a.class.getPackage();
        if (r0 != null) {
            String name = r0.getName();
            if (!TextUtils.isEmpty(name) && (lastIndexOf = name.lastIndexOf(".")) != 0) {
                String substring = name.substring(0, lastIndexOf);
                return !TextUtils.isEmpty(substring) ? substring : "com.mbridge.msdk.config.component";
            }
            return "com.mbridge.msdk.config.component";
        }
        return "com.mbridge.msdk.config.component";
    }
}
