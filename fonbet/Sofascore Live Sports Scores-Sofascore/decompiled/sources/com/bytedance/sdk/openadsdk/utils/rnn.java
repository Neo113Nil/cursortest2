package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.kj.sf.qf;
import com.ironsource.Ua;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class rnn {
    private static volatile com.bytedance.sdk.component.kj.sf.qf gbb;
    private static volatile boolean gm;
    private static volatile com.bytedance.sdk.component.kj.sf.qf hc;
    private static volatile com.bytedance.sdk.component.kj.sf.qf kj;
    private static volatile com.bytedance.sdk.component.kj.sf.qf oo;
    private static volatile com.bytedance.sdk.component.kj.sf.qf ork;
    private static volatile ScheduledExecutorService pcc;
    private static volatile com.bytedance.sdk.component.kj.sf.qf qf;
    private static volatile ThreadPoolExecutor sf;
    private static volatile com.bytedance.sdk.component.kj.sf.qf tmg;
    private static volatile com.bytedance.sdk.component.kj.sf.qf vh;
    private static volatile com.bytedance.sdk.component.kj.sf.qf vj;
    private static volatile com.bytedance.sdk.component.kj.sf.qf vy;
    private static volatile com.bytedance.sdk.component.kj.sf.qf wh;

    static {
        com.bytedance.sdk.component.kj.sf.oo.pcc(new com.bytedance.sdk.component.kj.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.utils.rnn.1
            @Override // com.bytedance.sdk.component.kj.sf.pcc
            public void pcc(com.bytedance.sdk.component.kj.sf.qf qfVar, com.bytedance.sdk.component.kj.sf.gm gmVar) {
                gmVar.getName();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.kj.pcc.pcc(new com.bytedance.sdk.component.pcc() { // from class: com.bytedance.sdk.openadsdk.utils.rnn.2
            @Override // com.bytedance.sdk.component.pcc
            public void pcc(Runnable runnable) {
                rnn.gm(runnable);
            }
        });
        sf = null;
        gm = false;
    }

    private static com.bytedance.sdk.component.kj.sf.qf dax() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = kj;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(kj)) {
                    try {
                        kj = pcc("image", kj);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (kj == null) {
                        kj = gpj();
                    }
                }
                qfVar = kj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    private static ThreadPoolExecutor gbb() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = oo;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(oo)) {
                    try {
                        oo = pcc("ad", oo);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (oo == null) {
                        oo = gpj();
                    }
                }
                qfVar = oo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    public static void gm(com.bytedance.sdk.component.kj.sf.gm gmVar) {
        if (gmVar == null || mu.pcc) {
            return;
        }
        gbb().execute(gmVar);
    }

    private static com.bytedance.sdk.component.kj.sf.qf gpj() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = tmg;
        if (qfVar2 != null) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (tmg == null) {
                    try {
                        tmg = sf(BuildConfig.FLAVOR).pcc();
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                qfVar = tmg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    public static com.bytedance.sdk.component.kj.sf.qf hc() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = ork;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(ork)) {
                    try {
                        ork = pcc("net", ork);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (ork == null) {
                        ork = gpj();
                    }
                }
                qfVar = ork;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    private static com.bytedance.sdk.component.kj.sf.qf jr() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = vj;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(vj)) {
                    try {
                        vj = pcc("log", vj);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (vj == null) {
                        vj = gpj();
                    }
                }
                qfVar = vj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    public static ExecutorService kj() {
        return nac();
    }

    private static com.bytedance.sdk.component.kj.sf.qf lu() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = vh;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(vh)) {
                    try {
                        vh = pcc("imgdisk", vh);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (vh == null) {
                        vh = gpj();
                    }
                }
                qfVar = vh;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    private static com.bytedance.sdk.component.kj.sf.qf nac() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = qf;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(qf)) {
                    try {
                        qf = pcc("io", qf);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (qf == null) {
                        qf = gpj();
                    }
                }
                qfVar = qf;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    public static void oo(com.bytedance.sdk.component.kj.sf.gm gmVar) {
        if (mu.pcc) {
            return;
        }
        gbb().execute(gmVar);
    }

    public static com.bytedance.sdk.component.kj.sf.qf ork() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = vy;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(vy)) {
                    try {
                        vy = pcc("express", vy);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (vy == null) {
                        vy = gpj();
                    }
                }
                qfVar = vy;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    private static qf.pcc pcc(String str) {
        qf.pcc sf2 = sf(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.vh.bxz()) {
                sf2.sf(true);
                JSONObject wax = com.bytedance.sdk.openadsdk.core.settings.vh.sf().wax();
                JSONObject optJSONObject = wax != null ? wax.optJSONObject(str) : null;
                if (optJSONObject != null) {
                    sf2.sf(true);
                    if (optJSONObject.has("coreSize")) {
                        sf2.pcc(optJSONObject.optInt("coreSize"));
                    }
                    if (optJSONObject.has("maxSize")) {
                        sf2.sf(optJSONObject.optInt("maxSize"));
                    }
                    if (optJSONObject.has("createSize")) {
                        sf2.gm(optJSONObject.optInt("createSize"));
                    }
                    if (optJSONObject.has("keepAlive")) {
                        sf2.pcc(optJSONObject.optInt("keepAlive"));
                    }
                    if (optJSONObject.has("allowCoreTimeOut")) {
                        sf2.pcc(optJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (optJSONObject.has("reportLogThreshold")) {
                        optJSONObject.optInt("reportLogThreshold");
                    }
                    if (optJSONObject.has("logTaskCount")) {
                        optJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return sf2;
        } catch (Throwable th) {
            th.getMessage();
            return sf2;
        }
    }

    public static boolean qf() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static qf.pcc sf(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        qf.pcc pccVar = new qf.pcc();
        str.getClass();
        switch (str.hashCode()) {
            case -1308979344:
                if (str.equals("express")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3107:
                if (str.equals("ad")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3366:
                if (str.equals("io")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 108957:
                if (str.equals("net")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 94416770:
                if (str.equals("cache")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 569077010:
                if (str.equals("ad_log_up")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1236319578:
                if (str.equals("monitor")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1422089780:
                if (str.equals("ad_log_save")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1917389792:
                if (str.equals("imgdisk")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return pccVar.pcc(str).pcc(2).sf(4).gm(0).pcc(Ua.s).pcc(true).vj(-1).oo(10).sf(false);
            case 1:
                return pccVar.pcc(str).pcc(4).sf(4).gm(0).pcc(20000L).pcc(true).vj(-1).oo(10).sf(false);
            case 2:
                return pccVar.pcc(str).pcc(4).sf(10).gm(0).pcc(20000L).pcc(true).vj(-1).oo(10).sf(false);
            case 3:
                return pccVar.pcc(str).pcc(4).sf(6).gm(2).pcc(20000L).pcc(true).vj(-1).oo(10).sf(false);
            case 4:
                return pccVar.pcc(str).pcc(10).sf(10).gm(0).pcc(Ua.s).pcc(true).vj(-1).oo(10).sf(false);
            case 5:
                return pccVar.pcc(str).pcc(2).sf(4).gm(0).pcc(Ua.s).pcc(true).vj(-1).oo(10).sf(false);
            case 6:
                return pccVar.pcc(str).pcc(0).sf(0).gm(0).pcc(5000L).pcc(true).vj(-1).oo(20).sf(false);
            case 7:
                return pccVar.pcc(str).pcc(3).sf(3).gm(0).pcc(20000L).pcc(true).vj(-1).oo(10).sf(false);
            case '\b':
                return pccVar.pcc(str).pcc(1).sf(4).gm(0).pcc(Ua.s).pcc(true).vj(-1).oo(10).sf(false);
            case '\t':
                return pccVar.pcc(str).pcc(2).sf(2).gm(0).pcc(Ua.s).pcc(true).vj(-1).oo(10).sf(false);
            case '\n':
                return pccVar.pcc(str).pcc(1).sf(4).gm(0).pcc(Ua.s).pcc(new PriorityBlockingQueue()).pcc(true).vj(-1).oo(10).sf(false);
            case 11:
                return pccVar.pcc(str).pcc(1).sf(2).gm(3).pcc(Ua.s).pcc(true).vj(-1).oo(10).sf(false);
            default:
                return pccVar.pcc(str).pcc(8).sf(16).gm(2).pcc(20000L).pcc(true).vj(-1).oo(10).sf(false);
        }
    }

    public static com.bytedance.sdk.component.kj.sf.qf tmg() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = hc;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(hc)) {
                    try {
                        hc = pcc("ad_log_up", hc);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (hc == null) {
                        hc = gpj();
                    }
                }
                qfVar = hc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    public static ExecutorService vh() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = gbb;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(gbb)) {
                    try {
                        gbb = pcc("ad_log_save", gbb);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (gbb == null) {
                        gbb = gpj();
                    }
                }
                qfVar = gbb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    public static void vj(com.bytedance.sdk.component.kj.sf.gm gmVar) {
        hc().execute(gmVar);
    }

    public static com.bytedance.sdk.component.kj.sf.qf vy() {
        com.bytedance.sdk.component.kj.sf.qf qfVar;
        com.bytedance.sdk.component.kj.sf.qf qfVar2 = wh;
        if (!pcc(qfVar2)) {
            return qfVar2;
        }
        synchronized (rnn.class) {
            try {
                if (pcc(wh)) {
                    try {
                        wh = pcc("cache", wh);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (wh == null) {
                        wh = gpj();
                    }
                }
                qfVar = wh;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qfVar;
    }

    public static boolean wh() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService vj() {
        return vy();
    }

    public static ExecutorService oo() {
        return jr();
    }

    public static void gm(Runnable runnable) {
        if (mu.pcc) {
            return;
        }
        nac().execute(runnable);
    }

    public static ExecutorService gm() {
        return lu();
    }

    public static void pcc(Runnable runnable) {
        if (runnable == null || mu.pcc) {
            return;
        }
        if (wh()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.jr.gm().post(runnable);
        }
    }

    public static void pcc(com.bytedance.sdk.component.kj.sf.gm gmVar) {
        if (mu.pcc) {
            return;
        }
        vy().execute(gmVar);
    }

    public static void pcc(com.bytedance.sdk.component.kj.sf.gm gmVar, int i) {
        if (gmVar == null || mu.pcc) {
            return;
        }
        gmVar.setPriority(i);
        nac().execute(gmVar);
    }

    private static boolean pcc(com.bytedance.sdk.component.kj.sf.qf qfVar) {
        if (qfVar != null) {
            return !qfVar.sf() && com.bytedance.sdk.openadsdk.core.settings.vh.bxz();
        }
        return true;
    }

    private static com.bytedance.sdk.component.kj.sf.qf pcc(String str, com.bytedance.sdk.component.kj.sf.qf qfVar) {
        qf.pcc pcc2 = pcc(str);
        if (qfVar == null) {
            return pcc2.pcc();
        }
        qfVar.pcc(pcc2);
        return qfVar;
    }

    public static ScheduledExecutorService pcc() {
        if (pcc == null) {
            synchronized (rnn.class) {
                try {
                    if (pcc == null) {
                        pcc = Executors.newSingleThreadScheduledExecutor(new com.bytedance.sdk.component.kj.sf.vj("scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public static void sf(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.jr.gm().removeCallbacks(runnable);
    }

    public static void sf(com.bytedance.sdk.component.kj.sf.gm gmVar) {
        if (gmVar == null || mu.pcc) {
            return;
        }
        jr().execute(gmVar);
    }

    public static void sf(com.bytedance.sdk.component.kj.sf.gm gmVar, int i) {
        if (gmVar == null || mu.pcc) {
            return;
        }
        gmVar.setPriority(i);
        jr().execute(gmVar);
    }

    public static ExecutorService sf() {
        return dax();
    }
}
