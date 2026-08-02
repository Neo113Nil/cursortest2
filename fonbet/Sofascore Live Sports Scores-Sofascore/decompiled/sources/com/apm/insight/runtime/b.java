package com.apm.insight.runtime;

import com.inmobi.media.core.config.models.CrashConfig;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    private static long a = -30000;
    private static File b;

    public static void a(long j) {
        if (j - a < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return;
        }
        a = j;
        try {
            File file = b;
            if (file == null) {
                long currentTimeMillis = System.currentTimeMillis();
                File file2 = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + "/" + com.apm.insight.e.f());
                b = file2;
                file = file2;
            }
            com.apm.insight.l.f.a(file, String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    public static String a(long j, String str) {
        try {
            return com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str), "\n");
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                com.apm.insight.l.f.a(new File(file, list[i]));
            }
        }
    }
}
