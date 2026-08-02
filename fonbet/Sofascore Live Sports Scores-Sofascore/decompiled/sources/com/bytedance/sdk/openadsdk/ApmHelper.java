package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.common.wh;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.qy;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.ironsource.C4324ta;
import com.ironsource.L6;
import com.ironsource.U3;
import com.ironsource.Y1;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.pgl.ssdk.ces.out.PglSSConfig;
import defpackage.lnb;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ApmHelper {
    private static String gm = null;
    private static boolean oo = false;
    private static volatile boolean pcc = false;
    private static final AtomicBoolean sf = new AtomicBoolean(false);
    private static sf vj;
    private static pcc wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public final Throwable gm;
        public final String pcc;
        public final String sf;

        public pcc(String str, String str2, Throwable th) {
            this.pcc = str;
            this.sf = str2;
            this.gm = th;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc(String str, String str2, Throwable th);
    }

    @NonNull
    public static Pair<String, String> generateRequestHeader() {
        String str = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
            jSONObject.put("ipv6", com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put(TtmlNode.TAG_REGION, lu.oo().ri());
        } catch (JSONException unused) {
        }
        JSONObject encryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new qy(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str2 = "0";
        if (encryptType4WithNoWrapBase64 != null) {
            int optInt = encryptType4WithNoWrapBase64.optInt("cypher");
            if (optInt == 4) {
                str = encryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str2 = "4";
            } else if (optInt == 3) {
                str = encryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str2 = "3";
            } else {
                str = jSONObject.toString();
            }
        }
        return new Pair<>(str2, str);
    }

    public static void initAPM() {
        if (wh.pcc()) {
            return;
        }
        try {
            String oo2 = ork.sf().oo();
            if (TextUtils.isEmpty(oo2)) {
                return;
            }
            initApm(lu.pcc(), oo2);
        } catch (Exception unused) {
        }
    }

    public static void initApm(final Context context, final String str) {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || !sf.compareAndSet(false, true) || pcc) {
            return;
        }
        rnn.pcc(new gm("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.pcc) {
                    vh oo2 = lu.oo();
                    boolean unused = ApmHelper.oo = oo2.ra();
                    String lu = kun.lu();
                    if (ApmHelper.oo && !TextUtils.isEmpty(lu)) {
                        String unused2 = ApmHelper.gm = str;
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String pcc2 = hc.pcc(context);
                        try {
                            Npth.setCrashWaitTime(vj.pcc("apm_crash_wait_time", 10000));
                            Npth.enableLoopMonitor(false);
                            Npth.enableAnrInfo(false);
                            Npth.enableNativeDump(false);
                            Npth.enableActivityDump(false);
                            Npth.enableMessageDump(false);
                            MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.CustomRequestHeader
                                public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                    Pair<String, String> generateRequestHeader = ApmHelper.generateRequestHeader();
                                    httpURLConnection.setRequestProperty("cypher", (String) generateRequestHeader.first);
                                    httpURLConnection.setRequestProperty("transfer-param", (String) generateRequestHeader.second);
                                    httpURLConnection.setRequestProperty("x-pangle-target-idc", lu.oo().rc());
                                }
                            });
                            final MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 8105L, BuildConfig.VERSION_NAME, strArr);
                            initSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.apm.insight.AttachUserData
                                @Nullable
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> qf = ApmHelper.qf();
                                    boolean containsKey = qf.containsKey("render_type");
                                    MonitorCrash monitorCrash = initSDK;
                                    if (containsKey) {
                                        monitorCrash.addTags("render_type", qf.get("render_type"));
                                        return qf;
                                    }
                                    monitorCrash.addTags("render_type", "-2");
                                    return qf;
                                }
                            });
                            if (oo2.erj()) {
                                initSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                            }
                            initSDK.config().setDeviceId(pcc2);
                            initSDK.setReportUrl(lu);
                            initSDK.addTags("host_appid", str);
                            initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            sf unused3 = ApmHelper.vj = new sf() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.sf
                                public void pcc(String str2, String str3, Throwable th) {
                                    initSDK.reportCustomErr(str2, str3, th);
                                }
                            };
                            boolean unused4 = ApmHelper.pcc = true;
                            ApmHelper.gm(pcc2, lu);
                            pcc pccVar = ApmHelper.wh;
                            pcc unused5 = ApmHelper.wh = null;
                            if (pccVar != null) {
                                ApmHelper.vj.pcc(pccVar.pcc, pccVar.sf, pccVar.gm);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.pcc = false;
                        }
                    }
                }
                ApmHelper.sf.set(false);
            }
        });
    }

    public static boolean isIsInit() {
        return pcc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> qf() {
        HashMap hashMap = new HashMap();
        of qf = com.bytedance.sdk.openadsdk.utils.sf.qf();
        if (qf != null) {
            hashMap.put("adType", String.valueOf(qf.tqg()));
            hashMap.put(C4324ta.b, String.valueOf(qf.wyd()));
            hashMap.put(BidResponsedEx.KEY_CID, qf.esn());
            hashMap.put("reqId", qf.qxv());
            hashMap.put("rit", qf.lq(Y1.f));
            int rt = qf.rt();
            if (qf.ei() != 2) {
                rt = -1;
            }
            hashMap.put("render_type", String.valueOf(rt));
        }
        return hashMap;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        sf sfVar = vj;
        if (sfVar != null) {
            sfVar.pcc(str, str2, th);
        } else {
            wh = new pcc(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (oo) {
            sf(hc.pcc(lu.pcc()), kun.lu());
        }
    }

    private static JSONObject sf(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", gm);
            jSONObject2.putOpt(Payload.CUSTOM, jSONObject3);
            jSONObject2.put(L6.F, U3.d);
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put(Payload.DEVICE_MODEL, Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(C4324ta.b, "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            lo.gm("ApmHelper", e.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm(String str, String str2) {
        sf(str, str2);
    }

    private static void sf(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || TextUtils.isEmpty(str2)) {
            return;
        }
        String o = lnb.o("https://", str2, "/monitor/collect/c/session?version_code=8105&device_platform=android&aid=10000001");
        lu.gm().pcc(sf(str), o);
    }
}
