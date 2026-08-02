package com.bytedance.sdk.openadsdk.kj;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.adsdk.ugeno.qf.oo;
import com.bytedance.sdk.component.sf;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.component.utils.kj;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.utils.of;
import com.bytedance.sdk.component.utils.qy;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.common.wh;
import com.bytedance.sdk.openadsdk.core.dax;
import com.bytedance.sdk.openadsdk.core.gbb;
import com.bytedance.sdk.openadsdk.core.hc.gm;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.ork.hc;
import com.bytedance.sdk.openadsdk.core.settings.qf;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.core.vy;
import com.bytedance.sdk.openadsdk.core.zti;
import com.bytedance.sdk.openadsdk.qf.sf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.gpj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.lq;
import com.bytedance.sdk.openadsdk.utils.mu;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.ironsource.C4331u;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.sea;
import defpackage.tem;
import defpackage.wv8;
import defpackage.zrj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static final List<PAGSdk.PAGInitCallback> pcc = new ArrayList();
    private static long sf = 0;

    private static void gm(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            tz.pcc((String) null);
            oo.pcc((String) null);
        } else {
            tz.pcc(initConfig.getPackageName());
            oo.pcc(initConfig.getPackageName());
        }
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc(context);
        try {
            if (sf(initConfig)) {
                zti.pcc().sf();
                gpj.pcc();
            }
        } catch (Throwable unused) {
        }
        lu.sf(context);
        hc.pcc();
        gm.pcc(context);
    }

    private static void oo(Context context, InitConfig initConfig) {
        if (qf.pcc()) {
            sf.gm();
            jr.sf.set(true);
            try {
                com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().pcc(new com.bytedance.sdk.openadsdk.ork.pcc());
            } catch (Exception e) {
                lo.gm("PAGSdk", e.getMessage());
            }
            gm(initConfig);
            sf(context, initConfig);
            tem.a = context;
            tem.b = null;
            tem.d = 2;
            tem.c = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().kj();
        }
    }

    public static void pcc(Context context, InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        int pa;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        sf = elapsedRealtime;
        jr.gm = elapsedRealtime;
        lu.sf(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = pcc;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (jr.oo() == 3) {
                        return;
                    }
                }
            }
        }
        if (wh.pcc()) {
            sf(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            wh();
            gm(initConfig);
            return;
        }
        if (initConfig == null) {
            sf(4000, "PAGConfig is null, please check.");
            return;
        }
        jr.pcc(3);
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vh() && ((pa = initConfig.getPA()) < -1 || pa > 1)) {
            sf(10004, vy.pcc(10004));
            return;
        }
        if (context == null) {
            sf(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        gm(context, initConfig);
        try {
            ApmHelper.initApm(context, initConfig.getAppId());
            ork.pcc(new gbb() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.4
                @Override // com.bytedance.sdk.openadsdk.core.gbb
                public void pcc(int i, String str) {
                    pcc.sf(i, str);
                }
            });
            try {
                tz.pcc(lu.pcc(), "tt_ad_logo_txt");
                if (tz.oo(context, "tt_ad_logo") == 0) {
                    pcc(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        wh();
                    }
                } else {
                    final com.bytedance.sdk.openadsdk.vj.pcc pccVar = new com.bytedance.sdk.openadsdk.vj.pcc();
                    SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.5
                        @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                        public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                            return com.bytedance.sdk.openadsdk.vj.pcc.this;
                        }
                    });
                    pcc(context, initConfig);
                }
            } catch (Throwable unused) {
                pcc(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            sf(4000, "Internal Error, setting exception. ");
        }
    }

    private static void sf(Context context, InitConfig initConfig) {
        jr.pcc = true;
        zti.pcc().pcc(initConfig.getAppId()).oo(initConfig.getPA()).gm(qy.pcc(context)).pcc(initConfig.getTitleBarTheme()).gm(initConfig.getAdxId());
        ork.fum();
        if (initConfig instanceof PAGConfig) {
            zti.pcc().sf(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        com.bytedance.sdk.component.utils.vy.pcc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vj() {
        ShortcutManager shortcutManager;
        try {
            Context pcc2 = lu.pcc();
            if (pcc2 == null || (shortcutManager = (ShortcutManager) pcc2.getSystemService(ShortcutManager.class)) == null) {
                return;
            }
            ork.sf().pcc(shortcutManager.isRequestPinShortcutSupported());
        } catch (Throwable unused) {
        }
    }

    private static void wh() {
        jr.pcc(1);
        try {
            List<PAGSdk.PAGInitCallback> list = pcc;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.8
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    return wv8.e("init");
                }
            });
        } catch (Throwable th2) {
            lo.gm(th2.getMessage(), new Object[0]);
        }
    }

    private static void vj(final Context context, final InitConfig initConfig) {
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("init_sync") { // from class: com.bytedance.sdk.openadsdk.kj.pcc.6
            @Override // java.lang.Runnable
            public void run() {
                jr.pcc(initConfig.getData());
                vj.pcc(context, initConfig.getAppId());
                vj.sf();
                com.bytedance.sdk.openadsdk.lu.gm.pcc();
                com.bytedance.sdk.openadsdk.lu.gm.sf();
                new nac();
                com.bytedance.sdk.component.adexpress.pcc.sf.wh.pcc(com.bytedance.sdk.openadsdk.utils.tz.pcc() * 10);
                com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(context);
                dax.pcc().sf();
                com.bytedance.sdk.openadsdk.core.tmg.gm.pcc();
                gm.pcc();
                vh.vj = vh.pcc(context);
                vh.oo = vh.sf(context);
                com.bytedance.sdk.openadsdk.qy.sf.qf.sf();
                JSONObject jSONObject = (JSONObject) vj.pcc("video_cache_config", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
                if (jSONObject != null) {
                    try {
                        sea.m = jSONObject.optInt("splash", 50);
                        sea.n = jSONObject.optInt(C4331u.j, 10);
                        sea.o = jSONObject.optInt("brand", 10);
                        int optInt = jSONObject.optInt("other", 10);
                        sea.p = optInt;
                        if (sea.m < 0) {
                            sea.m = 50;
                        }
                        if (sea.n < 0) {
                            sea.n = 10;
                        }
                        if (sea.o < 0) {
                            sea.o = 10;
                        }
                        if (optInt < 0) {
                            sea.p = 10;
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                sea.q = CacheDirFactory.getICacheDir(0);
                vh oo = lu.oo();
                if (!oo.qcw()) {
                    synchronized (oo) {
                        try {
                            if (!oo.qcw()) {
                                oo.gm();
                                oo.nn();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                jr.wh();
                DeviceUtils.vh();
                pcc.pcc(context);
                DeviceUtils.pcc(context);
                DeviceUtils.vh(context);
                DeviceUtils.tmg(context);
                com.bytedance.sdk.openadsdk.dax.pcc.pcc();
                com.bytedance.sdk.openadsdk.core.settings.oo.pcc();
                com.bytedance.sdk.openadsdk.dax.oo.oo();
                kun.vy(context);
                com.bytedance.sdk.openadsdk.oo.gm.pcc();
                pcc.vj();
                com.bytedance.sdk.openadsdk.core.tmg.gm.sf();
                com.bytedance.sdk.openadsdk.core.vj.pcc.pcc().sf();
                com.bytedance.sdk.component.kj.sf.oo.pcc(jr.sf());
                if (com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
                    com.bytedance.sdk.openadsdk.common.lu.pcc().oo();
                }
                com.bytedance.sdk.component.utils.sf.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.6.1
                    @Override // com.bytedance.sdk.component.utils.sf.pcc
                    public ExecutorService gm() {
                        return rnn.vy();
                    }

                    @Override // com.bytedance.sdk.component.utils.sf.pcc
                    public boolean pcc() {
                        return vj.pcc("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.sf.pcc
                    public boolean sf() {
                        return vj.pcc("start_act_asy", 0) == 1;
                    }
                });
                kun.gm();
                of.pcc(new of.sf() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.6.2
                    @Override // com.bytedance.sdk.component.utils.of.sf
                    public void pcc(final String str, boolean z, final of.pcc pccVar) {
                        com.bytedance.sdk.openadsdk.dax.oo.pcc(str, z, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.6.2.1
                            @Override // com.bytedance.sdk.openadsdk.dax.sf
                            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(str).sf(pccVar.sf());
                            }
                        });
                    }
                });
                mk.pcc(vj.pcc("webview_reuse_config", (String) null));
                String pcc2 = vj.pcc("video_play_config", (String) null);
                if (!TextUtils.isEmpty(pcc2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(pcc2);
                        sea.r = jSONObject2.optInt("check_moov", 0) == 1;
                        sea.s = jSONObject2.optInt("new_media_source", 1);
                        sea.t = jSONObject2.optInt("read_buffer_size_k", 8) * 1024;
                    } catch (JSONException unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.dax.gm.pcc();
                com.bytedance.sdk.openadsdk.component.oo.pcc.pcc();
                lq.pcc().sf();
            }
        });
    }

    private static void gm(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            ork.sf().gm(initConfig.getData());
        }
        ork.sf().gm(sf(initConfig));
    }

    private static void oo() {
        com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("uuid", tsz.pcc());
    }

    public static void sf() {
        lu.oo();
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_compliance_file", "a", 0);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("pag_sp_bad_par", "did");
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("pag_sp_bad_par", L6.X0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sf(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(int i, String str) {
        jr.pcc(2);
        try {
            List<PAGSdk.PAGInitCallback> list = pcc;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i, str);
                        }
                    }
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.9
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            return wv8.e("init");
                        }
                    });
                } finally {
                }
            }
        } catch (Throwable th) {
            lo.gm(th.getMessage(), new Object[0]);
        }
    }

    public static final void pcc() {
        try {
            com.bytedance.sdk.component.sf.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.1
                @Override // com.bytedance.sdk.component.sf.pcc
                public ExecutorService pcc() {
                    return rnn.vj();
                }

                @Override // com.bytedance.sdk.component.sf.pcc
                public HandlerThread pcc(String str, int i) {
                    return kj.pcc(str, i);
                }
            });
            rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.kj.pcc.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(false);
                    ApmHelper.initAPM();
                    pcc.sf();
                }
            });
            jr.pcc(System.currentTimeMillis());
            jr.sf();
            com.bytedance.sdk.component.vy.qf.setWebViewProvider(new qf.oo() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.3
                @Override // com.bytedance.sdk.component.vy.qf.oo
                public WebView pcc(Context context, AttributeSet attributeSet, int i, qf.gm gmVar) {
                    if (mk.sf(gmVar)) {
                        return mk.sf(context, attributeSet, i, gmVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i == 0 ? new com.bytedance.sdk.component.vy.wh(context, attributeSet) : new com.bytedance.sdk.component.vy.wh(context, attributeSet, i);
                    } catch (Exception unused) {
                        return i == 0 ? new com.bytedance.sdk.component.vy.wh(context, attributeSet) : new com.bytedance.sdk.component.vy.wh(context, attributeSet, i);
                    }
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void pcc(Context context) {
        com.bytedance.sdk.openadsdk.core.pcc.pcc.pcc(context);
        mu.pcc();
        rj.pcc(context);
        oo();
        lu.vj();
        String pcc2 = com.bytedance.sdk.openadsdk.core.hc.pcc(context);
        com.bytedance.sdk.openadsdk.core.tmg.gm.sf(pcc2);
        com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(pcc2, true);
        hc.sf();
        com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().sf();
    }

    private static void pcc(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        jr.pcc(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                sf(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                sf(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    private static void pcc(Context context, InitConfig initConfig) {
        long j;
        try {
        } catch (Throwable th) {
            th.getMessage();
            lo.gm("PAGSdk", th.getMessage());
            long elapsedRealtime = SystemClock.elapsedRealtime() - sf;
            sf(4000, th.getMessage());
            j = elapsedRealtime;
        }
        if (PAGSdk.isInitSuccess()) {
            wh();
            return;
        }
        oo(context, initConfig);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - sf;
        wh();
        vj(context, initConfig);
        j = elapsedRealtime2;
        pcc(context, PAGSdk.isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - sf, j);
    }

    private static void pcc(final Context context, final boolean z, final InitConfig initConfig, final long j, final long j2) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.kj.pcc.7
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean gm = ork.sf().gm();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", true ^ fum.pcc(context));
                    jSONObject.put("is_debug", pcc.sf(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", gm);
                    jSONObject.put("minSdkVersion", kun.qf(context));
                    jSONObject.put("targetSdkVersion", kun.wh(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z);
                    jSONObject.put("support_hevc_levels", zrj.d());
                    ork.sf().sf(false);
                } catch (Exception e) {
                    lo.pcc("PAGSdk", "run: ", e);
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("pangle_sdk_init").sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (wh.pcc()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, vy.pcc(10009)));
            return;
        }
        if (lu.pcc() == null) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Context is null, please check."));
            return;
        }
        com.bytedance.sdk.openadsdk.core.lq pcc2 = zti.pcc();
        if (pcc2 != null) {
            pcc2.pcc(pAGBiddingRequest, pAGBidCallback);
        } else {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Internal exception"));
        }
    }
}
