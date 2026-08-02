package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wja {
    public final HashMap a = new HashMap();
    public final int b;

    public wja(int i) {
        this.b = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        String a = a(this.b, str);
        if (this.a.size() >= 64 && !this.a.containsKey(a)) {
            return false;
        }
        String a2 = a(this.b, str2);
        String str3 = (String) this.a.get(a);
        if (str3 == null ? a2 == null : str3.equals(a2)) {
            return false;
        }
        HashMap hashMap = this.a;
        if (str2 == null) {
            a2 = "";
        }
        hashMap.put(a, a2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String a = a(this.b, str);
                if (this.a.size() >= 64 && !this.a.containsKey(a)) {
                }
                String str2 = (String) entry.getValue();
                this.a.put(a, str2 == null ? "" : a(this.b, str2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
