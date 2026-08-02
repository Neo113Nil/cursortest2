package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import defpackage.wv8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pq implements lq {
    private static final Map<Integer, String> sf = new HashMap<Integer, String>(59) { // from class: com.bytedance.sdk.openadsdk.core.pq.1
        {
            i.m(1, this, "is_init", 2, "abtest");
            i.m(3, this, "language", 4, "ad_sdk_version");
            i.m(5, this, "package_name", 6, "user_data");
            i.m(7, this, "ts", 8, "ipv4");
            i.m(9, this, "ipv6", 10, "adx_id");
            i.m(11, this, "target_region", 12, L6.X0);
            i.m(13, this, "did", 14, "banner");
            i.m(15, this, "app_reg", 16, "apk-sign");
            i.m(17, this, "screen_scale", 18, "app_set_id_scope");
            i.m(19, this, "app_set_id", 20, "installed_source");
            i.m(21, this, "app_running_time", 22, "js_render_ver");
            i.m(23, this, "js_render_v3_ver", 24, "gp_v_name");
            i.m(25, this, "gp_v_code", 26, "vendor");
            i.m(27, this, L6.B, 28, "user_agent_device");
            i.m(29, this, "user_agent_webview", 30, "sys_compiling_time");
            i.m(31, this, "screen_height", 32, "screen_width");
            i.m(33, this, "rom_version", 34, "carrier_name");
            i.m(35, this, "os_version", 36, "conn_type");
            i.m(37, this, "boot", 38, "oem_store");
            i.m(39, this, "board", 40, "timezone");
            i.m(41, this, "device_city", 42, "cpu_num");
            i.m(43, this, "density", 44, "bt_time");
            i.m(45, this, "bt_id", 46, "sec_did");
            i.m(47, this, "X-Armors", 48, "url");
            i.m(49, this, "pangle_m", 50, "ec");
            i.m(51, this, "pglx", 52, L6.u);
            i.m(53, this, "bp", 54, "t_ver");
            i.m(55, this, "is_fold", 56, CampaignEx.JSON_KEY_AAB);
            i.m(57, this, "abi", 58, "is_multi");
            i.m(59, this, "w_ver", 60, "feature_data");
        }
    };
    private final AtomicReference<JSONObject> pcc = new AtomicReference<>();
    private int gm = 0;

    private static void kj(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.pq.4
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("bidding_token");
                    e.qf(pq.vh(str).toString());
                    return e;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAdManagerImpl", th.getMessage());
        }
    }

    private static void ork(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.pq.6
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("bidding_token");
                    e.qf(pq.vh(str).toString());
                    return e;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAdManagerImpl", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject vh(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static void vy(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.pq.5
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("bidding_token");
                    e.qf(pq.vh(str).toString());
                    return e;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAdManagerImpl", th.getMessage());
        }
    }

    public static boolean wh(String str) {
        return "TX".equals(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq gm(int i) {
        ork.sf().gm(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public pq pcc(String str) {
        ork.sf().pcc(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public void pcc(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        long j;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.kun.tmg("getBiddingToken");
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            try {
                kj(adxId);
                String hpk = lu.oo().hpk();
                int i = 2;
                AdSlot adSlot = null;
                if (!com.bytedance.sdk.openadsdk.core.vh.sf.pcc().wh()) {
                    pAGBidError = new PAGBidError(40060, vy.pcc(40060));
                } else if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().oo()) {
                    pAGBidError = new PAGBidError(10007, vy.pcc(10007));
                } else if (!com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vy()) {
                    pAGBidError = new PAGBidError(10008, vy.pcc(10008));
                } else if (TextUtils.isEmpty(hpk)) {
                    pAGBidError = new PAGBidError(10011, vy.pcc(10011));
                    pcc(5, pAGBiddingRequest);
                } else if (!wh(hpk) || lu.oo().atb(adxId)) {
                    pAGBidError = null;
                } else {
                    pAGBidError = new PAGBidError(10006, vy.pcc(10006));
                    pcc(2, pAGBiddingRequest);
                }
                if (pAGBidError != null) {
                    pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                    ork(adxId);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vh() && ork.sf().vh()) {
                    pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, vy.pcc(10004)));
                    ork(adxId);
                    pcc(3, pAGBiddingRequest);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.tmg.gm.pcc();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_init", jr.vj() ? 1 : 0);
                String vy = lu.oo().vy();
                String mk = lu.oo().mk();
                if (vy != null && mk != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("version", vy);
                    jSONObject2.put("param", mk);
                    jSONObject.put("abtest", jSONObject2);
                }
                jSONObject.put("language", hc.sf());
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.kun.wh());
                if (pAGBiddingRequest != null) {
                    if (!TextUtils.isEmpty(pAGBiddingRequest.getSlotId())) {
                        adSlot = new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build();
                    }
                    jSONObject.put("user_data", yt.pcc(adSlot));
                }
                jSONObject.put("ts", System.currentTimeMillis() / 1000);
                String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                if (sf2.isEmpty()) {
                    String sf3 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", "key_ipv4", "");
                    if (!sf3.isEmpty()) {
                        jSONObject.put("ipv4", sf3);
                    }
                } else {
                    jSONObject.put("ipv6", sf2);
                }
                jSONObject.put("adx_id", adxId);
                Object rc = lu.oo().rc();
                jSONObject.put("target_region", rc);
                if (jSONObject.toString().getBytes().length <= 2680) {
                    com.bytedance.sdk.openadsdk.core.settings.vh oo = lu.oo();
                    com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(jSONObject);
                    String pcc = hc.pcc(lu.pcc());
                    if (TextUtils.isEmpty(pcc)) {
                        j = 1000;
                    } else {
                        j = 1000;
                        try {
                            jSONObject.put("did", Long.parseLong(pcc));
                        } catch (Throwable unused) {
                        }
                    }
                    if (pAGBiddingRequest != null) {
                        jSONObject.put("banner", pcc(pAGBiddingRequest));
                    }
                    jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.vh.sf.pcc().wh() ? 1 : 0);
                    Context pcc2 = lu.pcc();
                    jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.gm.vy());
                    jSONObject.put("screen_scale", rj.wh(pcc2));
                    jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.oo.sf());
                    jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.oo.gm());
                    jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.oo.oo());
                    jSONObject.put("app_running_time", (System.currentTimeMillis() - jr.pcc()) / j);
                    jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.ork.hc.gm());
                    jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.ork.hc.oo());
                    jSONObject.put("gp_v_name", DeviceUtils.vj(pcc2));
                    jSONObject.put("gp_v_code", DeviceUtils.wh(pcc2));
                    jSONObject.put("vendor", Build.MANUFACTURER);
                    jSONObject.put(L6.B, Build.MODEL);
                    jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.kun.sf());
                    jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.kun.oo());
                    jSONObject.put("sys_compiling_time", hc.sf(pcc2));
                    jSONObject.put("screen_height", rj.vj(pcc2));
                    jSONObject.put("screen_width", rj.gm(pcc2));
                    jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.mk.pcc());
                    jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.ye.pcc());
                    jSONObject.put("os_version", Build.VERSION.RELEASE);
                    jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.kun.kj(pcc2));
                    if (oo.mk("boot")) {
                        jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                    }
                    com.bytedance.sdk.openadsdk.utils.kun.pcc(jSONObject);
                    jSONObject.put("board", Build.BOARD);
                    jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.kun.tsz());
                    jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.kun.yt());
                    jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.ork.sf());
                    jSONObject.put("density", rj.kj(pcc2));
                    DeviceUtils.pcc(jSONObject);
                    com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(jSONObject);
                    com.bytedance.sdk.openadsdk.utils.kj.pcc(jSONObject, pcc2);
                    jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.fum.pcc(pcc2));
                    com.bytedance.sdk.openadsdk.utils.kj.sf(jSONObject, pcc2);
                    i = sf.size();
                }
                while (i > 0 && jSONObject.toString().getBytes().length > 2680) {
                    jSONObject.remove(sf.get(Integer.valueOf(i)));
                    i--;
                }
                com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc(jSONObject);
                JSONObject pcc3 = pcc(jSONObject);
                while (i > 0 && pcc3.toString().getBytes().length > 12288) {
                    jSONObject.remove(sf.get(Integer.valueOf(i)));
                    pcc3 = pcc(jSONObject);
                    i--;
                }
                if (pcc3.length() > 0) {
                    pcc3.put("target_region", rc);
                }
                if (com.bytedance.sdk.component.utils.jr.gm()) {
                    pcc3.toString();
                    int length = pcc3.toString().getBytes().length;
                }
                pcc3.toString();
                pAGBidCallback.onBiddingTokenCollected(pcc3.toString());
                vy(adxId);
            } catch (Throwable unused2) {
                str = adxId;
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
                pcc(4, pAGBiddingRequest);
                ork(str);
            }
        } catch (Throwable unused3) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq sf() {
        com.bytedance.sdk.component.utils.jr.pcc("PangleSDK-8105");
        com.bytedance.sdk.component.utils.lo.pcc("PangleSDK-8105");
        com.bytedance.sdk.component.utils.jr.pcc();
        com.bytedance.sdk.component.qf.pcc.pcc();
        com.bytedance.sdk.component.utils.lo.pcc();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public int vj() {
        return ork.sf().ork();
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public String gm() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq oo(int i) {
        ork.sf().oo(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq gm(String str) {
        ork.sf().kj(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public int oo() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    /* renamed from: vj, reason: merged with bridge method [inline-methods] */
    public pq sf(String str) {
        ork.sf().gm(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq sf(int i) {
        this.gm = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq pcc(int i) {
        ork.sf().vj(i);
        return this;
    }

    public void pcc(int i, PAGBiddingRequest pAGBiddingRequest) {
        try {
            String tz = ork.sf().tz();
            String str = "";
            String adxId = pAGBiddingRequest != null ? pAGBiddingRequest.getAdxId() : "";
            boolean xf = lu.oo().xf();
            Set<String> uae = lu.oo().uae();
            JSONArray jSONArray = new JSONArray();
            if (uae != null) {
                Iterator<String> it = uae.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            String hpk = com.bytedance.sdk.openadsdk.core.settings.vh.sf().hpk();
            int vj = vj();
            int oo = jr.oo();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_adx_id", tz);
            jSONObject.put("bidding_adx_id", adxId);
            jSONObject.put("token_enable", xf ? 1 : 0);
            if (!TextUtils.isEmpty(hpk)) {
                str = hpk;
            }
            jSONObject.put("setting_dc", str);
            jSONObject.put("setting_token_adx_ids", jSONArray);
            jSONObject.put("init_pa_consent", vj);
            jSONObject.put("init_state", oo);
            jSONObject.put("reason", i);
            if (jr.vj()) {
                com.bytedance.sdk.openadsdk.dax.oo.pcc("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.pq.2
                    @Override // com.bytedance.sdk.openadsdk.dax.sf
                    public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                        return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("biddingtoken_error").sf(jSONObject.toString());
                    }
                });
                final JSONObject andSet = this.pcc.getAndSet(null);
                if (andSet != null) {
                    com.bytedance.sdk.openadsdk.dax.oo.pcc("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.pq.3
                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                        public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                            return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("biddingtoken_error").sf(andSet.toString());
                        }
                    });
                    return;
                }
                return;
            }
            AtomicReference<JSONObject> atomicReference = this.pcc;
            while (!atomicReference.compareAndSet(null, jSONObject) && atomicReference.get() == null) {
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static JSONObject pcc(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static JSONObject pcc(JSONObject jSONObject) {
        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new qy(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
        jsj.pcc(encryptType4);
        return encryptType4 != null ? encryptType4 : new JSONObject();
    }
}
