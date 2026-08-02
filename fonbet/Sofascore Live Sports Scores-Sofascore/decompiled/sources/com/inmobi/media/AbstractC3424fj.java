package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import defpackage.joa;
import defpackage.ku3;
import defpackage.s9a;
import defpackage.te6;
import defpackage.wel;
import defpackage.ypa;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.fj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3424fj {
    public static Context a = null;
    public static String b = "";
    public static String c;
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final joa e = ypa.b(new wel(22));
    public static boolean f;
    public static final ExecutorService g;
    public static final ku3 h;
    public static int i;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new M9("fj", false));
        g = newSingleThreadExecutor;
        newSingleThreadExecutor.getClass();
        h = s9a.c(new te6(newSingleThreadExecutor));
    }

    public static void a(Context context) {
        context.getClass();
        try {
            AbstractC3309b7.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static String b(Context context) {
        Context applicationContext;
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e2) {
                try {
                    throw new C3918yl(e2.getMessage());
                } catch (C3918yl e3) {
                    e3.getMessage();
                    joa joaVar = AbstractC3286aa.a;
                    AbstractC3286aa.a(new Q2(e3));
                    try {
                        String property = System.getProperty("http.agent");
                        return property == null ? "" : property;
                    } catch (Exception e4) {
                        e4.getMessage();
                        joa joaVar2 = AbstractC3286aa.a;
                        AbstractC3776t9.a(e4);
                        return "";
                    }
                } catch (Exception e5) {
                    e5.getMessage();
                    return "";
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        defaultUserAgent.getClass();
        return defaultUserAgent;
    }

    public static final String c() {
        if (b.length() == 0) {
            b = b(a);
        }
        return b;
    }

    public static final boolean d() {
        return i == 2;
    }

    public static boolean c(Context context) {
        return true;
    }

    public static final Kc a() {
        return new Kc();
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.getClass();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static String b() {
        Context context = a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        return Pa.a(context, "coppa_store").a.getString("im_accid", null);
    }
}
