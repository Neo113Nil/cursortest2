package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu {
    private static int gm = -1;
    private static volatile Context pcc;
    private static volatile of<com.bytedance.sdk.openadsdk.oo.pcc> sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private static volatile Application pcc;

        static {
            try {
                Object sf = sf();
                pcc = (Application) sf.getClass().getMethod("getApplication", null).invoke(sf, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.pcc("MyApplication", "application get failed", th);
            }
        }

        @Nullable
        public static Application pcc() {
            return pcc;
        }

        private static Object sf() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.pcc("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }

    public static of<com.bytedance.sdk.openadsdk.oo.pcc> gm() {
        if (sf == null) {
            synchronized (lu.class) {
                try {
                    if (sf == null) {
                        sf = new yt(pcc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sf;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.vh oo() {
        return com.bytedance.sdk.openadsdk.core.settings.vh.sf();
    }

    public static Context pcc(Context context) {
        if (context == null) {
            context = pcc();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static void sf(Context context) {
        if (pcc == null) {
            synchronized (lu.class) {
                try {
                    if (pcc == null) {
                        if (context != null) {
                            pcc = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                pcc = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application pcc2 = pcc.pcc();
                            if (pcc2 != null) {
                                pcc = pcc2;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.dax.sf.gm vj() {
        return !com.bytedance.sdk.openadsdk.core.settings.qf.pcc() ? com.bytedance.sdk.openadsdk.dax.sf.oo.pcc() : com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc();
    }

    public static Context pcc() {
        if (pcc == null) {
            sf(null);
        }
        return pcc;
    }

    public static int sf() {
        Context pcc2;
        if (gm < 0 && (pcc2 = pcc()) != null) {
            gm = ViewConfiguration.get(pcc2).getScaledTouchSlop();
        }
        return gm;
    }
}
