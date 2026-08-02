package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n {
    private static File a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a {
        public String a;
        private String b;
        private long c;

        public a(String str) {
            String[] split = str.split("\\s+");
            if (split.length != 3) {
                com.apm.insight.c.a();
                j.a(new RuntimeException("err ProcessTrack line:".concat(str)), "NPTH_CATCH");
                return;
            }
            this.b = split[0];
            this.a = split[1];
            try {
                this.c = Long.parseLong(split[2]);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(new RuntimeException("err ProcessTrack line:".concat(str), th), "NPTH_CATCH");
            }
        }
    }

    @NonNull
    public static HashMap<String, a> a(long j, String str) {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a2 = com.apm.insight.l.f.a(file2, length > 1048576 ? length - 524288 : 0L);
                    int length2 = a2.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String optString = a2.optString(length2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(".txt", ""), new a(optString));
                                break;
                            }
                            length2--;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    public static File a(long j) {
        return new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    public static void a(String str, String str2) {
        try {
            File file = a;
            if (file == null) {
                com.apm.insight.e.g();
                String b = com.apm.insight.l.a.b();
                if (b == null) {
                    file = null;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    File file2 = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + '/' + b.replace(':', '_') + ".txt");
                    a = file2;
                    file = file2;
                }
            }
            if (file != null) {
                com.apm.insight.l.f.a(file, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
