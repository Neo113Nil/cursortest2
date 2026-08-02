package com.apm.insight.k;

import androidx.annotation.NonNull;
import com.apm.insight.runtime.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j {
    private static File a = null;
    private static boolean b = false;
    private static boolean c = false;
    private static Map<String, String> d;

    public static void a(JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), d);
        } catch (Throwable unused2) {
        }
    }

    public static boolean b() {
        return c;
    }

    public static void c() {
        if (b) {
            return;
        }
        c = true;
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.f.a(file, "\n")), false);
                b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (g()) {
            a.a();
        }
    }

    public static void e() {
        m.a().a(new Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.g()) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = d;
        if (map != null) {
            map.clear();
        }
    }

    public static boolean g() {
        File h = h();
        try {
            Map<String, String> map = d;
            if (map == null) {
                map = com.apm.insight.l.f.c(h);
            }
            d = map;
            if (map == null) {
                d = new HashMap();
                return true;
            }
            if (map.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!d.containsKey(it.next())) {
                    return true;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            for (Map.Entry<String, String> entry : d.entrySet()) {
                try {
                    if (currentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z = true;
                    }
                } catch (Throwable th) {
                    com.apm.insight.a.a(th);
                }
            }
            if (z) {
                com.apm.insight.a.a((Object) "config should be updated");
            } else {
                com.apm.insight.a.a((Object) "config should not be updated");
            }
            return z;
        } catch (Throwable unused) {
            return true;
        }
    }

    @NonNull
    private static File h() {
        File file = a;
        if (file != null) {
            return file;
        }
        File file2 = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        a = file2;
        return file2;
    }

    public static boolean a() {
        return b;
    }

    public static void a(String str) {
        Map map = d;
        if (map == null) {
            map = new HashMap();
            d = map;
        }
        map.put(str, String.valueOf(System.currentTimeMillis()));
    }
}
