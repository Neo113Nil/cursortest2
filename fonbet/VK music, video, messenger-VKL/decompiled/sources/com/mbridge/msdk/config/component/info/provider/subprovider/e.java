package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.he6;
import xsna.i5s;
import xsna.rm3;
import xsna.xe9;

/* compiled from: UserAgentProvider.java */
/* loaded from: classes13.dex */
public class e {
    static String d = "UserAgentProvider";
    private static volatile e e;
    String a = "";
    String b = "";
    public AtomicBoolean c = new AtomicBoolean(false);

    private e() {
    }

    private String c() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
        StringBuilder a = xe9.a("Mozilla/5.0 (Linux; Android ", str, "; ", str2, " Build/");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return i5s.a(a, str3, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
    }

    public static e d() {
        if (e == null) {
            synchronized (e.class) {
                try {
                    if (e == null) {
                        e = new e();
                    }
                } finally {
                }
            }
        }
        return e;
    }

    private String f() {
        try {
            return WebSettings.getDefaultUserAgent(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
            return "";
        }
    }

    public String e() {
        return (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b)) ? c() : TextUtils.isEmpty(this.a) ? TextUtils.isEmpty(this.b) ? "" : this.b : this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.a = f();
        b();
        if (!TextUtils.isEmpty(this.a)) {
            a(this.a);
        }
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
            a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("userAgent", this.a);
            aVar.a(hashMap);
        }
        this.c.set(true);
    }

    public void a(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new he6(10, this, aVar));
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
    }

    public String a() {
        try {
            String f = f();
            this.a = f;
            if (!TextUtils.isEmpty(f)) {
                a(this.a);
            } else {
                b();
            }
            if (TextUtils.isEmpty(this.a)) {
                this.a = c();
            }
            this.c.set(true);
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
        return c();
    }

    private void a(Context context) {
        if (TextUtils.isEmpty(this.a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new rm3(9, this, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
        } else {
            a(this.a);
        }
    }

    private void a(String str) {
        Context d2;
        if (TextUtils.isEmpty(str) || (d2 = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(d2).b("userAgent", str);
    }

    private void b() {
        Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
        if (d2 == null) {
            return;
        }
        this.b = com.mbridge.msdk.config.component.common.util.b.a(d2).a("userAgent", c());
    }
}
