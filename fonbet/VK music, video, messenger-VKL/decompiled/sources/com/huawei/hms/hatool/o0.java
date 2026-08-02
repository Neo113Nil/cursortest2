package com.huawei.hms.hatool;

import android.text.TextUtils;
import xsna.d61;
import xsna.kjp;

/* loaded from: classes13.dex */
public class o0 {
    private static o0 c;
    private String a;
    private String b;

    private String b(String str) {
        return f() ? d61.e("analytics_keystore", str) : n.b(str, e());
    }

    private String c() {
        String a = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(a)) {
            return a(a);
        }
        String c2 = kjp.c(16);
        c(b(c2));
        return c2;
    }

    public static o0 d() {
        if (c == null) {
            g();
        }
        return c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new x().a();
        }
        return this.b;
    }

    private boolean f() {
        return true;
    }

    private static synchronized void g() {
        synchronized (o0.class) {
            if (c == null) {
                c = new o0();
            }
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
        }
        return this.a;
    }

    private String a(String str) {
        String c2 = f() ? d61.c("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(c2)) {
            return c2;
        }
        v.c("hmsSdk", "deCrypt work key first");
        String a = n.a(str, e());
        if (!TextUtils.isEmpty(a)) {
            if (f()) {
                c(b(a));
                x.c();
            }
            return a;
        }
        String c3 = kjp.c(16);
        c(b(c3));
        if (f()) {
            x.c();
        }
        return c3;
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public void b() {
        String c2 = kjp.c(16);
        if (c(b(c2))) {
            this.a = c2;
        }
    }
}
