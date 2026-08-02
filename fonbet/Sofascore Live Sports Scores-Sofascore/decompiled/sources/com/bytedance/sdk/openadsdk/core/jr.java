package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.U3;
import com.ironsource.Ua;
import defpackage.wv8;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr {
    public static long gm = 0;
    private static final Runnable kj;
    public static long oo = 0;
    public static volatile boolean pcc = false;
    private static volatile HandlerThread wh;
    public static AtomicBoolean sf = new AtomicBoolean(false);
    private static volatile int vj = 0;
    private static volatile Handler qf = null;

    static {
        HandlerThread handlerThread = new HandlerThread("pag_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.jr.1
            boolean pcc = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.pcc) {
                    return;
                }
                this.pcc = true;
                super.start();
            }
        };
        wh = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.kj.pcc(wh);
        oo = System.currentTimeMillis();
        kj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().vgx()) {
                    jr.wh();
                    return;
                }
                String sf2 = com.bytedance.sdk.openadsdk.core.settings.vh.sf(lu.pcc());
                int pcc2 = com.bytedance.sdk.openadsdk.core.settings.vh.pcc(lu.pcc());
                if (!TextUtils.equals(sf2, com.bytedance.sdk.openadsdk.core.settings.vh.oo) || pcc2 != com.bytedance.sdk.openadsdk.core.settings.vh.vj) {
                    com.bytedance.sdk.openadsdk.core.settings.vh.sf().pcc(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.vh.oo = sf2;
                    com.bytedance.sdk.openadsdk.core.settings.vh.vj = pcc2;
                }
                jr.wh();
            }
        };
    }

    public static Handler gm() {
        return new Handler(Looper.getMainLooper());
    }

    public static int oo() {
        return vj;
    }

    public static void pcc(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    ork.sf().sf(jSONObject.optString(U3.i.X, ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("InitHelper", th.getMessage());
        }
    }

    public static void qf() {
        sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.jr.3.1
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            return wv8.e("init");
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static Handler sf() {
        if (wh == null || !wh.isAlive()) {
            synchronized (jr.class) {
                try {
                    if (wh != null) {
                        if (!wh.isAlive()) {
                        }
                    }
                    wh = com.bytedance.sdk.component.utils.kj.pcc("pag_init_handle", -1);
                    qf = new Handler(wh.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (qf == null) {
            synchronized (jr.class) {
                try {
                    if (qf == null) {
                        qf = new Handler(wh.getLooper());
                    }
                } finally {
                }
            }
        }
        return qf;
    }

    public static boolean vj() {
        return oo() == 1;
    }

    public static void wh() {
        Handler sf2 = sf();
        Runnable runnable = kj;
        sf2.removeCallbacks(runnable);
        sf().postDelayed(runnable, Ua.s);
    }

    public static long pcc() {
        return oo;
    }

    public static void pcc(int i) {
        vj = i;
    }

    public static void pcc(long j) {
        oo = j;
    }
}
