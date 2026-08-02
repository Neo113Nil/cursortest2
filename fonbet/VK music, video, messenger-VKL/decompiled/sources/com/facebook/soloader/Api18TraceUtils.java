package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import xsna.fw3;
import xsna.pzl;

@DoNotOptimize
@TargetApi(18)
/* loaded from: classes12.dex */
class Api18TraceUtils {
    private static final int MAX_SECTION_NAME_LENGTH = 127;

    public static void beginTraceSection(String str, String str2, String str3) {
        String b = pzl.b(str, str2, str3);
        if (b.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder e = fw3.e(str);
            e.append(str2.substring(0, length));
            e.append(str3);
            b = e.toString();
        }
        Trace.beginSection(b);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
