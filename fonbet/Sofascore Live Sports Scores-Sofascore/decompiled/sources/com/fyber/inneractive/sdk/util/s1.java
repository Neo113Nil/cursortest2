package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.ironsource.L6;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s1 {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public volatile String b = null;
    public Context c = null;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final p1 e = new p1(this);

    public final String a() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (this.e != null && this.a.get()) {
            Handler handler = r.b;
            handler.removeCallbacks(this.e);
            handler.postDelayed(this.e, 50L);
        }
        return System.getProperty("http.agent");
    }

    public final void b() {
        if (this.c == null || !TextUtils.isEmpty(this.b)) {
            return;
        }
        this.b = this.c.getSharedPreferences("fyber.ua", 0).getString(L6.d0, null);
        if (!TextUtils.isEmpty(this.b)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.d.compareAndSet(false, true);
        }
        r.a.execute(new r1(this));
    }

    public final void c() {
        String str;
        Context context = this.c;
        if (context != null) {
            try {
                str = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                this.a.set(false);
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.b = str;
            if (!TextUtils.isEmpty(this.b)) {
                IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.d.compareAndSet(false, true);
            }
            r.a.execute(new q1(this, str));
        }
    }
}
