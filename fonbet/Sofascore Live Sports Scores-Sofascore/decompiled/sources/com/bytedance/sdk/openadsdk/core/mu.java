package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.oo.pcc;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.ironsource.C4324ta;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class mu implements com.bytedance.sdk.component.adexpress.vj.sf, tsz.pcc, com.bytedance.sdk.openadsdk.vh.sf {
    private static final Map<String, Boolean> vy;
    private com.bytedance.sdk.openadsdk.hc.vh atb;
    private gm bg;
    private int dax;
    private com.bytedance.sdk.openadsdk.component.reward.gm.pcc erj;
    private com.bytedance.sdk.openadsdk.core.jr.oo.sf fmh;
    private com.bytedance.sdk.openadsdk.core.ork.dax fum;
    private int gbb;
    private com.bytedance.sdk.openadsdk.component.reward.gm.wh gd;
    private JSONObject gpj;
    private String hc;
    private com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm hoh;
    private Context hpk;
    private com.bytedance.sdk.openadsdk.hc.kj iv;
    private String jr;
    private JSONObject jsj;
    private com.bytedance.sdk.openadsdk.core.widget.vj kj;
    private String kun;
    private com.bytedance.sdk.component.adexpress.sf.vh lo;
    private HashMap<String, vh> lq;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.sf lrr;
    private com.bytedance.sdk.openadsdk.core.model.of lu;
    private com.bytedance.sdk.openadsdk.hc.gm mk;
    private com.bytedance.sdk.openadsdk.oo.oo.vj nn;
    private com.bytedance.sdk.openadsdk.vh.oo of;
    private com.bytedance.sdk.openadsdk.vh.gm ork;
    protected Map<String, Object> pcc;
    private com.bytedance.sdk.openadsdk.component.reward.gm.oo ptr;
    private tsz qcw;
    private String qf;
    private com.bytedance.sdk.openadsdk.hc.vj qy;
    private boolean ri;
    private com.bytedance.sdk.component.pcc.jr rnn;
    private com.bytedance.sdk.openadsdk.component.reward.gm.vy se;
    private WeakReference<View> tmg;
    private com.bytedance.sdk.openadsdk.hc.sf tsx;
    private com.bytedance.sdk.openadsdk.core.gm.oo tsz;
    private JSONObject tz;
    private String vh;
    private WeakReference<com.bytedance.sdk.component.vy.qf> vj;
    private pcc vr;
    private boolean xb;
    private com.bytedance.sdk.openadsdk.hc.pcc yt;
    private Activity zsj;
    private boolean nac = true;
    private boolean ye = true;
    private boolean zti = false;
    private boolean pq = false;
    private boolean mu = false;
    boolean sf = false;
    boolean gm = false;
    boolean oo = false;
    private boolean rj = false;
    private final com.bytedance.sdk.component.utils.tsz wh = new com.bytedance.sdk.component.utils.tsz(Looper.getMainLooper(), this);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm implements Runnable {
        private final com.bytedance.sdk.openadsdk.core.ork.dax pcc;
        private final JSONObject sf;

        public gm(com.bytedance.sdk.openadsdk.core.ork.dax daxVar, JSONObject jSONObject) {
            this.pcc = daxVar;
            this.sf = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            mu.sf(this.pcc, this.sf);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf {
        public String gm;
        public JSONObject oo;
        public String pcc;
        public String sf;
        public int vj;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        vy = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public mu(Context context) {
        this.hpk = context;
    }

    private void atb() {
        if (this.hpk == null || TextUtils.isEmpty(lu.oo().lrr())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
            IABLandingPageActivity.pcc(this.hpk, this.lu, this.kun);
        } else {
            TTWebsiteActivity.pcc(this.hpk, this.lu, this.kun);
        }
    }

    private void dax(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.hc.gm gmVar = this.mk;
        if (gmVar == null || jSONObject == null) {
            return;
        }
        gmVar.pcc(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    private void fum(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.lo.pcc(parse, this);
            }
        } catch (Exception unused) {
        }
    }

    private void gbb(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.atb.ork(this.lu))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.atb.ork(this.lu));
    }

    private JSONObject gm(com.bytedance.sdk.openadsdk.core.model.of ofVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put(BidResponsedEx.KEY_CID, ofVar.hpk());
        jSONObject2.put("req_id", ofVar.qxv());
        jSONObject2.put("ad_id", ofVar.esn());
        jSONObject2.put("log_extra", ofVar.hl());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.vh.sf().ywp());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", ofVar.fmh());
        jSONObject.put("dynamic_creative", ofVar.xf());
        jSONObject.put("title", ofVar.gmh());
        com.bytedance.sdk.openadsdk.core.model.of.pcc(ofVar, jSONObject);
        com.bytedance.sdk.openadsdk.core.model.of.sf(ofVar, jSONObject);
        jSONObject.put("source", ofVar.ofe());
        jSONObject.put("button_text", ofVar.dp());
        com.bytedance.sdk.openadsdk.core.model.hc dt = ofVar.dt();
        if (dt != null) {
            jSONObject.put("deeplink_url", dt.pcc());
        }
        jSONObject.put("app_name", ofVar.gpa());
        jSONObject.put("has_show", ofVar.iv() ? 1 : 0);
        jSONObject.put("has_click", ofVar.qap() ? 1 : 0);
        return jSONObject;
    }

    private void gpj(JSONObject jSONObject) {
        int i;
        String optString;
        double d;
        double d2;
        boolean z;
        double d3;
        double d4;
        int i2;
        String optString2;
        Objects.toString(jSONObject);
        if (this.lo == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.nn;
        if (vjVar != null) {
            vjVar.jr();
        }
        com.bytedance.sdk.component.adexpress.sf.gbb gbbVar = new com.bytedance.sdk.component.adexpress.sf.gbb();
        gbbVar.pcc(1);
        try {
            boolean optBoolean = jSONObject.optBoolean("isRenderSuc");
            optString = jSONObject.optString("engineType");
            JSONObject optJSONObject = jSONObject.optJSONObject("AdSize");
            if (optJSONObject != null) {
                d = optJSONObject.optDouble("width");
                d2 = optJSONObject.optDouble("height");
            } else {
                d = 0.0d;
                d2 = 0.0d;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (optJSONObject2 != null) {
                double optDouble = optJSONObject2.optDouble("x");
                z = optBoolean;
                i2 = 101;
                try {
                    double optDouble2 = optJSONObject2.optDouble("y");
                    d4 = d2;
                    double optDouble3 = optJSONObject2.optDouble("width");
                    double optDouble4 = optJSONObject2.optDouble("height");
                    if (lo(optJSONObject2)) {
                        d3 = d;
                        gbbVar.pcc((float) optJSONObject2.optDouble("borderRadiusTopLeft"));
                        gbbVar.sf((float) optJSONObject2.optDouble("borderRadiusTopRight"));
                        gbbVar.gm((float) optJSONObject2.optDouble("borderRadiusBottomLeft"));
                        gbbVar.oo((float) optJSONObject2.optDouble("borderRadiusBottomRight"));
                    } else {
                        d3 = d;
                    }
                    gbbVar.gm(optDouble);
                    gbbVar.oo(optDouble2);
                    gbbVar.vj(optDouble3);
                    gbbVar.wh(optDouble4);
                } catch (Exception unused) {
                    i = 101;
                    gbbVar.sf(i);
                    gbbVar.pcc(vy.pcc(i));
                    this.lo.pcc(gbbVar);
                }
            } else {
                z = optBoolean;
                d3 = d;
                d4 = d2;
                i2 = 101;
            }
            optString2 = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, vy.pcc(i2));
            i = i2;
        } catch (Exception unused2) {
            i = 101;
        }
        try {
            int optInt = jSONObject.optInt("code", i);
            gbbVar.pcc(z);
            gbbVar.pcc(d3);
            gbbVar.sf(d4);
            gbbVar.pcc(optString2);
            gbbVar.sf(optInt);
            gbbVar.sf(optString);
            this.lo.pcc(gbbVar);
        } catch (Exception unused3) {
            gbbVar.sf(i);
            gbbVar.pcc(vy.pcc(i));
            this.lo.pcc(gbbVar);
        }
    }

    private void jr(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar;
        if (jSONObject == null || (vjVar = this.nn) == null) {
            return;
        }
        vjVar.sf(jSONObject);
    }

    private void jsj() {
        com.bytedance.sdk.openadsdk.hc.vh vhVar = this.atb;
        if (vhVar == null) {
            return;
        }
        vhVar.pcc();
    }

    private void kj(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                sf sfVar = new sf();
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        sfVar.pcc = optJSONObject.optString("__msg_type", null);
                        sfVar.sf = optJSONObject.optString("__callback_id", null);
                        sfVar.gm = optJSONObject.optString("func");
                        sfVar.oo = optJSONObject.optJSONObject("params");
                        sfVar.vj = optJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(sfVar.pcc) && !TextUtils.isEmpty(sfVar.gm)) {
                    Message obtainMessage = this.wh.obtainMessage(11);
                    obtainMessage.obj = sfVar;
                    this.wh.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private boolean lo(@NonNull JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private boolean lq() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.lu;
        if (ofVar == null || ofVar.luz() == null || com.bytedance.sdk.openadsdk.core.model.atb.sf(this.lu) || this.zti || this.lu.luz().optInt("parent_type") != 2) {
            return false;
        }
        int hh = this.lu.hh();
        if (hh != 8 && hh != 7) {
            return false;
        }
        this.zti = true;
        return true;
    }

    private boolean lu(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
        if (daxVar != null && jSONObject != null) {
            double gm2 = daxVar.gm();
            double oo = this.fum.oo();
            int vj = this.fum.vj();
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "current:", Double.valueOf(gm2), "state", Integer.valueOf(vj), "countdownTime", Double.valueOf(oo));
            try {
                jSONObject.put("currentTime", gm2 / 1000.0d);
                if (oo > 0.0d) {
                    jSONObject.put("countDownTime", oo / 1000.0d);
                }
                jSONObject.put("state", vj);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mk() {
        com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
        if (daxVar != null) {
            daxVar.pcc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nac(JSONObject jSONObject) {
        if (this.fum == null || jSONObject == null) {
            return;
        }
        try {
            this.fum.pcc(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private JSONObject of() {
        WeakReference<View> weakReference;
        try {
            weakReference = this.tmg;
        } catch (Throwable unused) {
        }
        if (weakReference == null) {
            return null;
        }
        View view = weakReference.get();
        com.bytedance.sdk.component.vy.qf qfVar = this.vj.get();
        if (view != null && qfVar != null) {
            int[] sf2 = rj.sf(view);
            int[] sf3 = rj.sf((View) qfVar);
            if (sf2 != null && sf3 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", rj.gm(lu.pcc(), sf2[0] - sf3[0]));
                jSONObject.put("y", rj.gm(lu.pcc(), sf2[1] - sf3[1]));
                jSONObject.put("w", rj.gm(lu.pcc(), view.getWidth()));
                jSONObject.put(h.b, rj.gm(lu.pcc(), view.getHeight()));
                jSONObject.put("isExist", true);
                return jSONObject;
            }
        }
        return null;
    }

    private void ork(String str) {
        int indexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView tz = tz();
                    if (tz != null) {
                        com.bytedance.sdk.component.utils.gbb.pcc(tz, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (str.startsWith("bytedance://private/setresult/") && (indexOf = str.indexOf(38, 30)) > 0) {
                    String substring = str.substring(30, indexOf);
                    String substring2 = str.substring(indexOf + 1);
                    if (!substring.equals("SCENE_FETCHQUEUE") || substring2.length() <= 0) {
                        return;
                    }
                    kj(substring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    private Context qy() {
        WeakReference<com.bytedance.sdk.component.vy.qf> weakReference = this.vj;
        Activity pcc2 = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.sf.pcc(this.vj.get());
        return pcc2 == null ? this.hpk : pcc2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[Catch: Exception -> 0x0133, TryCatch #0 {Exception -> 0x0133, blocks: (B:54:0x0010, B:7:0x0018, B:9:0x0020, B:11:0x0028, B:12:0x002e, B:20:0x0054, B:21:0x006d, B:23:0x0085, B:26:0x008e, B:28:0x0095, B:29:0x009b, B:31:0x00b1, B:33:0x00b7, B:34:0x00c0, B:37:0x00c8, B:39:0x00d1, B:42:0x00d8, B:45:0x00cc, B:48:0x0061), top: B:53:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[Catch: Exception -> 0x0133, TRY_ENTER, TryCatch #0 {Exception -> 0x0133, blocks: (B:54:0x0010, B:7:0x0018, B:9:0x0020, B:11:0x0028, B:12:0x002e, B:20:0x0054, B:21:0x006d, B:23:0x0085, B:26:0x008e, B:28:0x0095, B:29:0x009b, B:31:0x00b1, B:33:0x00b7, B:34:0x00c0, B:37:0x00c8, B:39:0x00d1, B:42:0x00d8, B:45:0x00cc, B:48:0x0061), top: B:53:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: Exception -> 0x0133, TryCatch #0 {Exception -> 0x0133, blocks: (B:54:0x0010, B:7:0x0018, B:9:0x0020, B:11:0x0028, B:12:0x002e, B:20:0x0054, B:21:0x006d, B:23:0x0085, B:26:0x008e, B:28:0x0095, B:29:0x009b, B:31:0x00b1, B:33:0x00b7, B:34:0x00c0, B:37:0x00c8, B:39:0x00d1, B:42:0x00d8, B:45:0x00cc, B:48:0x0061), top: B:53:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject sf(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        int kot;
        boolean lu;
        JSONObject jSONObject = new JSONObject();
        if (lu.oo() != null) {
            int i = 0;
            if (ofVar != null) {
                try {
                    kot = ofVar.kot();
                } catch (Exception unused) {
                }
            } else {
                kot = 0;
            }
            int hh = ofVar != null ? ofVar.hh() : 0;
            int quq = ofVar != null ? ofVar.quq() : 0;
            int bm = ofVar != null ? ofVar.bm() : 0;
            boolean wh = lu.oo().wh(String.valueOf(kot));
            int gbb = lu.oo().gbb(String.valueOf(kot));
            boolean z = gbb == 1;
            if (hh != 7 && hh != 8) {
                lu = lu.oo().gm(String.valueOf(kot));
                jSONObject.put("voice_control", lu);
                jSONObject.put("rv_skip_time", quq);
                jSONObject.put("fv_skip_show", wh);
                jSONObject.put("iv_skip_time", bm);
                jSONObject.put("show_dislike", ofVar == null && ofVar.dk());
                jSONObject.put("video_adaptation", ofVar == null ? ofVar.bbd() : 0);
                jSONObject.put("splash_image_count_down_time", lu.oo().yt(String.valueOf(kot)));
                if (ofVar != null && ofVar.jkz() != null) {
                    jSONObject.put("dynamic_configs", ofVar.jkz());
                }
                if (com.bytedance.sdk.openadsdk.core.model.lo.gm(ofVar)) {
                    jSONObject.put("skip_change_to_close", z);
                } else {
                    jSONObject.put("skip_change_to_close", true);
                }
                if (ofVar != null && ofVar.xb()) {
                    i = 1;
                }
                jSONObject.put("bar_render_platform", i);
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("endcard_close_time", lu.oo().pcc(kot));
                jSONObject.put("video_skip_result", gbb);
                jSONObject.put("if_show_win", lu.oo().vy(String.valueOf(kot)));
                jSONObject.put("origin_rv_skip_time", lu.oo().vh(String.valueOf(kot)));
                jSONObject.put("origin_iv_skip_time", lu.oo().lo(String.valueOf(kot)));
                jSONObject.put("sdk_video_encode_type", !com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar) ? 1 : 0);
            }
            lu = lu.oo().lu(String.valueOf(kot));
            jSONObject.put("voice_control", lu);
            jSONObject.put("rv_skip_time", quq);
            jSONObject.put("fv_skip_show", wh);
            jSONObject.put("iv_skip_time", bm);
            jSONObject.put("show_dislike", ofVar == null && ofVar.dk());
            jSONObject.put("video_adaptation", ofVar == null ? ofVar.bbd() : 0);
            jSONObject.put("splash_image_count_down_time", lu.oo().yt(String.valueOf(kot)));
            if (ofVar != null) {
                jSONObject.put("dynamic_configs", ofVar.jkz());
            }
            if (com.bytedance.sdk.openadsdk.core.model.lo.gm(ofVar)) {
            }
            if (ofVar != null) {
                i = 1;
            }
            jSONObject.put("bar_render_platform", i);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("endcard_close_time", lu.oo().pcc(kot));
            jSONObject.put("video_skip_result", gbb);
            jSONObject.put("if_show_win", lu.oo().vy(String.valueOf(kot)));
            jSONObject.put("origin_rv_skip_time", lu.oo().vh(String.valueOf(kot)));
            jSONObject.put("origin_iv_skip_time", lu.oo().lo(String.valueOf(kot)));
            jSONObject.put("sdk_video_encode_type", !com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(ofVar) ? 1 : 0);
        }
        return jSONObject;
    }

    private void tsz() {
        com.bytedance.sdk.openadsdk.hc.vh vhVar = this.atb;
        if (vhVar == null) {
            return;
        }
        vhVar.sf();
    }

    private void tz(JSONObject jSONObject) {
        if (jSONObject == null || this.of == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                this.of.pcc(false, null);
            } else {
                this.of.pcc(true, optJSONArray);
            }
        } catch (Exception unused) {
            this.of.pcc(false, null);
        }
    }

    private JSONObject ye() {
        return sf(this.lu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject yt(JSONObject jSONObject) {
        if (this.pcc != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString("ad_extra_data", null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry<String, Object> entry : this.pcc.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm(e.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    private void zti() {
        if (this.ork == null) {
            this.ork = com.bytedance.sdk.openadsdk.vh.pcc.pcc(this, this.lu);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            hc(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            sf(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mu.3
                @Override // java.lang.Runnable
                public void run() {
                    mu.this.nac(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mu.4
                @Override // java.lang.Runnable
                public void run() {
                    mu.this.vj(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            fum(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        lu(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.tz.toString();
        }
        try {
            JSONObject pcc2 = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(this.tz, new JSONObject(str));
            return pcc2 == null ? this.tz.toString() : pcc2.toString();
        } catch (Exception unused) {
            return this.tz.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public String getTemplateInfo() {
        sf("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.tz;
            if (jSONObject != null) {
                jSONObject.put("setting", ye());
                com.bytedance.sdk.openadsdk.core.model.of ofVar = this.lu;
                if (ofVar != null && ofVar.jkz() != null) {
                    this.tz.put("dynamic_configs", this.lu.jkz());
                }
                com.bytedance.sdk.openadsdk.core.model.of ofVar2 = this.lu;
                if (ofVar2 != null) {
                    this.tz.put("extension", ofVar2.eud());
                }
            }
            sf("getTemplateInfo", false);
            return this.tz.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public void hc() {
        pcc pccVar = this.vr;
        if (pccVar != null) {
            pccVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mu.6
            @Override // java.lang.Runnable
            public void run() {
                if (mu.this.lrr != null) {
                    mu.this.lrr.pcc();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            gm gmVar = this.bg;
            if (gmVar != null) {
                com.bytedance.sdk.openadsdk.utils.rnn.sf(gmVar);
            }
            gm gmVar2 = new gm(this.fum, jSONObject);
            this.bg = gmVar2;
            com.bytedance.sdk.openadsdk.utils.rnn.pcc(gmVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.AndroidObject", "");
        }
    }

    public void oo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("zoom_type", 1);
        JSONObject optJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.sf.gbb gbbVar = new com.bytedance.sdk.component.adexpress.sf.gbb();
        if (optJSONObject != null) {
            double optDouble = optJSONObject.optDouble("x");
            double optDouble2 = optJSONObject.optDouble("y");
            double optDouble3 = optJSONObject.optDouble("width");
            double optDouble4 = optJSONObject.optDouble("height");
            gbbVar.gm(optDouble);
            gbbVar.oo(optDouble2);
            gbbVar.vj(optDouble3);
            gbbVar.wh(optDouble4);
        }
        com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
        if (daxVar != null) {
            daxVar.pcc(optInt, gbbVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03c1, code lost:
    
        if (r3 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03c3, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0411, code lost:
    
        if (r3 != null) goto L233;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject pcc(sf sfVar, int i) throws Exception {
        char c;
        JSONObject jSONObject;
        Context context;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.model.of ofVar;
        if (!NotificationCompat.CATEGORY_CALL.equals(sfVar.pcc)) {
            return null;
        }
        ork.sf().jr();
        JSONObject jSONObject3 = new JSONObject();
        String str = sfVar.gm;
        str.getClass();
        int i2 = 0;
        switch (str.hashCode()) {
            case -2036781162:
                if (str.equals("subscribe_app_ad")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1423303823:
                if (str.equals("adInfo")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1330994877:
                if (str.equals("pauseWebView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1169135450:
                if (str.equals("changeVideoState")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1023873614:
                if (str.equals("openAdLandPageLinks")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -844321441:
                if (str.equals("webview_time_track")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -800853518:
                if (str.equals("clickEvent")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -794273169:
                if (str.equals("appInfo")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -715147645:
                if (str.equals("getScreenSize")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -511324706:
                if (str.equals("openPrivacy")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -278382602:
                if (str.equals("send_temai_product_ids")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -173752734:
                if (str.equals("getTeMaiAds")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 27837080:
                if (str.equals("download_app_ad")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 94756344:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 105049135:
                if (str.equals("unsubscribe_app_ad")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 399543522:
                if (str.equals("getCloseButtonInfo")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 402955465:
                if (str.equals(U3.i.o)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 425443791:
                if (str.equals("getNativeSiteCustomData")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 442647767:
                if (str.equals("sendReward")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 571273292:
                if (str.equals("dynamicTrack")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 650209982:
                if (str.equals("getTemplateInfo")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 672928467:
                if (str.equals("cancel_download_app_ad")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 711635577:
                if (str.equals("getCurrentVideoState")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 885131792:
                if (str.equals("getVolume")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1107374321:
                if (str.equals("pauseWebViewTimers")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1151744482:
                if (str.equals(FyberMediationAdapter.KEY_MUTE_VIDEO)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1237100796:
                if (str.equals("renderDidFinish")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1532142616:
                if (str.equals("removeLoading")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1634511418:
                if (str.equals("endcard_load")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1713585602:
                if (str.equals("getNetworkData")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1731806400:
                if (str.equals("playable_style")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1979895452:
                if (str.equals("sendLog")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 2086000188:
                if (str.equals("skipVideo")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2105008900:
                if (str.equals("landscape_click")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        long j = 0;
        switch (c) {
            case 0:
                zti();
                com.bytedance.sdk.openadsdk.oo.gm.sf(this.lu, this.kun, 0, (JSONObject) null);
                Context context2 = this.hpk;
                if (context2 == null) {
                    com.bytedance.sdk.openadsdk.oo.gm.sf(this.lu, this.kun, -1, (JSONObject) null);
                    break;
                } else {
                    this.ork.pcc(context2, sfVar.oo, this.hc, this.gbb, this.nac);
                    break;
                }
            case 1:
                hc(jSONObject3);
                break;
            case 2:
                jsj();
                break;
            case 3:
                nac(sfVar.oo);
                break;
            case 4:
                JSONObject jSONObject4 = sfVar.oo;
                if (pcc(jSONObject4, jSONObject3)) {
                    gm(jSONObject4);
                    break;
                }
                break;
            case 5:
                jr(sfVar.oo);
                break;
            case 6:
                vj(sfVar.oo);
                break;
            case 7:
                sf(jSONObject3);
                break;
            case '\b':
                com.bytedance.sdk.openadsdk.hc.pcc pccVar = this.yt;
                if (pccVar != null) {
                    int sf2 = pccVar.sf();
                    int pcc2 = this.yt.pcc();
                    jSONObject3.put("width", sf2);
                    jSONObject3.put("height", pcc2);
                    break;
                }
                break;
            case '\t':
                atb();
                break;
            case '\n':
                tz(sfVar.oo);
                break;
            case 11:
                jSONObject = this.jsj;
                break;
            case '\f':
                this.rj = true;
                com.bytedance.sdk.openadsdk.oo.gm.sf(this.lu, this.kun, 1, (JSONObject) null);
                com.bytedance.sdk.openadsdk.core.gm.oo ooVar = this.tsz;
                if (ooVar == null) {
                    com.bytedance.sdk.openadsdk.vh.gm gmVar = this.ork;
                    if (gmVar != null && (context = this.hpk) != null) {
                        gmVar.pcc(context, sfVar.oo, this.kun);
                        com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar2 = this.fmh;
                        if (sfVar2 != null) {
                            sfVar2.qcw();
                        }
                        com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar2 = this.erj;
                        if (pccVar2 != null) {
                            pccVar2.pcc();
                            break;
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.oo.gm.sf(this.lu, this.kun, -2, (JSONObject) null);
                        break;
                    }
                } else {
                    ooVar.vj(this.ye);
                    break;
                }
                break;
            case '\r':
                qf();
                break;
            case 14:
                com.bytedance.sdk.openadsdk.vh.gm gmVar2 = this.ork;
                if (gmVar2 != null) {
                    gmVar2.pcc(sfVar.oo);
                    break;
                }
                break;
            case 15:
                jSONObject = of();
                break;
            case 16:
                jSONObject3.put("viewStatus", this.pq ? 1 : 0);
                jSONObject3.put("adFirstShow", this.mu ? 1 : 0);
                break;
            case 17:
                com.bytedance.sdk.openadsdk.core.model.of ofVar2 = this.lu;
                if (ofVar2 != null && !TextUtils.isEmpty(ofVar2.vo())) {
                    jSONObject3.put("data", this.lu.vo());
                    break;
                }
                break;
            case 18:
                this.sf = true;
                com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar3 = this.fmh;
                if (sfVar3 != null) {
                    sfVar3.mu();
                }
                if (this.gd != null) {
                    JSONObject jSONObject5 = sfVar.oo;
                    if (jSONObject5 != null) {
                        j = jSONObject5.optLong("play_start_ts");
                        i2 = jSONObject5.optInt("user_watched_time");
                    }
                    this.gd.pcc(j, i2);
                    break;
                }
                break;
            case 19:
                fum(sfVar.oo);
                break;
            case 20:
                JSONObject jSONObject6 = this.tz;
                if (jSONObject6 != null) {
                    jSONObject6.put("setting", ye());
                    com.bytedance.sdk.openadsdk.core.model.of ofVar3 = this.lu;
                    if (ofVar3 != null && ofVar3.jkz() != null) {
                        this.tz.put("dynamic_configs", this.lu.jkz());
                    }
                    com.bytedance.sdk.openadsdk.core.model.of ofVar4 = this.lu;
                    if (ofVar4 != null) {
                        this.tz.put("extension", ofVar4.eud());
                    }
                }
                jSONObject3 = this.tz;
                break;
            case 22:
                lu(jSONObject3);
                break;
            case 23:
                AudioManager audioManager = (AudioManager) lu.pcc().getSystemService("audio");
                jSONObject3.put("endcard_mute", (audioManager != null ? audioManager.getStreamVolume(3) : -1) <= 0);
                break;
            case 24:
                tsz();
                break;
            case 25:
                sf(this.fum, sfVar.oo);
                break;
            case 26:
                gpj(sfVar.oo);
                break;
            case 27:
                com.bytedance.sdk.openadsdk.hc.vj vjVar = this.qy;
                if (vjVar != null) {
                    vjVar.pcc();
                    break;
                }
                break;
            case 28:
                dax(sfVar.oo);
                break;
            case 29:
                pcc(sfVar, jSONObject3);
                break;
            case 30:
                gbb(jSONObject3);
                break;
            case 31:
                JSONObject jSONObject7 = sfVar.oo;
                if (jSONObject7 != null && (jSONObject2 = jSONObject7.getJSONObject("extJson")) != null && jSONObject2.has("category") && jSONObject2.has("tag") && jSONObject2.has("label")) {
                    String optString = jSONObject2.optString("category");
                    String optString2 = jSONObject2.optString("tag");
                    String optString3 = jSONObject2.optString("label");
                    long optLong = jSONObject7.optLong(U3.i.X);
                    long optLong2 = jSONObject7.optLong("extValue");
                    try {
                        jSONObject2.putOpt("ua_policy", Integer.valueOf(this.dax));
                    } catch (Exception unused) {
                    }
                    if ("click".equals(optString3)) {
                        jSONObject2 = yt(jSONObject2);
                    }
                    if ("insight_log".equals(optString3) && (ofVar = this.lu) != null && ofVar.ti()) {
                        jSONObject2.putOpt("page_visible", Integer.valueOf(this.lu.aq()));
                        jSONObject2.putOpt("time_to_leave", Long.valueOf(this.lu.ni() > 0 ? SystemClock.elapsedRealtime() - this.lu.ni() : -1L));
                        jSONObject2.putOpt("time_to_click", Long.valueOf(this.lu.zr() > 0 ? SystemClock.elapsedRealtime() - this.lu.zr() : -1L));
                    }
                    if (!com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(this.lu)) {
                        optString2 = pcc(optString2, optString3);
                    }
                    boolean kj = com.bytedance.sdk.openadsdk.core.model.lo.kj(this.lu);
                    pcc(jSONObject2, kj, optString3);
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(this.lu, optString, optString2, optString3, optLong, optLong2, jSONObject2, kj);
                    break;
                }
                break;
            case ' ':
                mk();
                break;
            case '!':
                Context context3 = this.hpk;
                if (context3 instanceof com.bytedance.sdk.openadsdk.core.jr.oo.sf) {
                    ((com.bytedance.sdk.openadsdk.core.jr.oo.sf) context3).qcw();
                }
                com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar3 = this.erj;
                if (pccVar3 != null) {
                    pccVar3.pcc();
                    break;
                }
                break;
        }
        if (i == 1 && !TextUtils.isEmpty(sfVar.sf)) {
            sf(sfVar.sf, jSONObject3);
            if (ork.sf().jr()) {
                Objects.toString(jSONObject3);
            }
        }
        return jSONObject3;
    }

    public void qf() {
        com.bytedance.sdk.openadsdk.hc.gm gmVar;
        if (this.ri && (gmVar = this.mk) != null) {
            gmVar.pcc();
            return;
        }
        Context context = this.hpk;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.yt.pcc((Activity) context)) {
            ((Activity) this.hpk).finish();
        }
        Activity activity = this.zsj;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.zsj.finish();
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            gpj(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mu.5
            @Override // java.lang.Runnable
            public void run() {
                mu.this.mk();
            }
        });
    }

    public void tmg() {
        com.bytedance.sdk.openadsdk.vh.gm gmVar = this.ork;
        if (gmVar != null) {
            gmVar.pcc();
        }
        gm gmVar2 = this.bg;
        if (gmVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.rnn.sf(gmVar2);
            this.bg = null;
        }
        this.hpk = null;
        this.fmh = null;
    }

    public void vh(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("status");
        tsz tszVar = this.qcw;
        if (tszVar != null) {
            if (optInt == 1) {
                tszVar.p_();
            } else if (optInt == 2) {
                tszVar.q_();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.iv == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.component.adexpress.sf.gbb gbbVar = new com.bytedance.sdk.component.adexpress.sf.gbb();
            JSONObject optJSONObject = jSONObject.optJSONObject("videoInfo");
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("x");
                double optDouble2 = optJSONObject.optDouble("y");
                double optDouble3 = optJSONObject.optDouble("width");
                double optDouble4 = optJSONObject.optDouble("height");
                if (lo(optJSONObject)) {
                    gbbVar.pcc((float) optJSONObject.optDouble("borderRadiusTopLeft"));
                    gbbVar.sf((float) optJSONObject.optDouble("borderRadiusTopRight"));
                    gbbVar.gm((float) optJSONObject.optDouble("borderRadiusBottomLeft"));
                    gbbVar.oo((float) optJSONObject.optDouble("borderRadiusBottomRight"));
                }
                gbbVar.gm(optDouble);
                gbbVar.oo(optDouble2);
                gbbVar.vj(optDouble3);
                gbbVar.wh(optDouble4);
            }
            com.bytedance.sdk.openadsdk.hc.kj kjVar = this.iv;
            if (kjVar != null) {
                kjVar.pcc(gbbVar);
            }
        } catch (Throwable unused) {
        }
    }

    public void vj(JSONObject jSONObject) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String optString = jSONObject.optString(f.b.c);
            int optInt = jSONObject.optInt("areaType", 1);
            String optString2 = jSONObject.optString("clickAreaType");
            JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
            int i = 0;
            double d6 = 0.0d;
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("down_x", 0.0d);
                d2 = optJSONObject.optDouble("down_y", 0.0d);
                double optDouble2 = optJSONObject.optDouble("up_x", 0.0d);
                double optDouble3 = optJSONObject.optDouble("up_y", 0.0d);
                double optDouble4 = optJSONObject.optDouble("down_time", 0.0d);
                double optDouble5 = optJSONObject.optDouble("up_time", 0.0d);
                jSONObject2 = optJSONObject.optJSONObject("rectInfo");
                i = optJSONObject.optInt(IronSourceConstants.EVENTS_DURATION, 0);
                d5 = optDouble5;
                d6 = optDouble;
                d = optDouble2;
                d3 = optDouble3;
                d4 = optDouble4;
            } else {
                d = 0.0d;
                d2 = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                d5 = 0.0d;
                jSONObject2 = null;
            }
            com.bytedance.sdk.openadsdk.core.model.dax pcc2 = new dax.pcc().oo((float) d6).gm((float) d2).sf((float) d).pcc((float) d3).sf((long) d4).pcc((long) d5).pcc(optString2).pcc((SparseArray<gm.pcc>) null).pcc(true).oo(i).sf(optInt).pcc(jSONObject2).pcc(jSONObject.optInt("clickAreaCategory", -1)).sf(optJSONObject).sf(jSONObject.optString("dislike_source")).pcc();
            com.bytedance.sdk.component.adexpress.sf.vh vhVar = this.lo;
            if (vhVar != null) {
                vhVar.pcc(null, optInt, pcc2);
            }
            pcc(optString, optInt, pcc2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.sf.vh vhVar2 = this.lo;
            if (vhVar2 != null) {
                vhVar2.pcc(null, -1, null);
            }
        }
    }

    public JSONObject vy(JSONObject jSONObject) {
        List<com.bytedance.sdk.openadsdk.core.model.of> ptr;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar = this.fmh;
            if (sfVar != null && (ptr = sfVar.ptr()) != null) {
                for (int i = 0; i < ptr.size(); i++) {
                    jSONArray.put(gm(ptr.get(i)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void wh(JSONObject jSONObject) {
        boolean z = false;
        com.bytedance.sdk.openadsdk.core.model.of pcc2 = com.bytedance.sdk.openadsdk.core.sf.pcc(jSONObject, null, null, null, 0);
        if (pcc2 != null) {
            boolean kj = com.bytedance.sdk.openadsdk.core.model.lo.kj(this.lu);
            String sf2 = kj ? com.bytedance.sdk.openadsdk.utils.kun.sf(this.gbb) : this.kun;
            if (!com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(pcc2) && !kj) {
                z = true;
            }
            pcc(pcc2, sf2, z);
        }
    }

    private void hc(JSONObject jSONObject) throws Exception {
        pcc(jSONObject, this.lu);
    }

    public void jr() {
        tsz tszVar = this.qcw;
        if (tszVar != null) {
            tszVar.m_();
        }
    }

    public JSONObject nac() {
        JSONObject jSONObject = new JSONObject();
        try {
            tsz tszVar = this.qcw;
            if (tszVar != null) {
                jSONObject.put("leftTime", tszVar.o_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void tmg(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.mu.2
            @Override // java.lang.Runnable
            public void run() {
                JSONObject optJSONObject = jSONObject.optJSONObject("extJson");
                if (optJSONObject != null && optJSONObject.has("category") && optJSONObject.has("tag") && optJSONObject.has("label")) {
                    String optString = optJSONObject.optString("category");
                    String optString2 = optJSONObject.optString("tag");
                    String optString3 = optJSONObject.optString("label");
                    long optLong = jSONObject.optLong(U3.i.X);
                    long optLong2 = jSONObject.optLong("extValue");
                    try {
                        optJSONObject.put("ua_policy", mu.this.dax);
                        String optString4 = optJSONObject.optString("ad_extra_data");
                        JSONObject jSONObject2 = TextUtils.isEmpty(optString4) ? new JSONObject() : new JSONObject(optString4);
                        String optString5 = jSONObject2.optString("pag_json_data");
                        JSONObject jSONObject3 = TextUtils.isEmpty(optString5) ? new JSONObject() : new JSONObject(optString5);
                        if (com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.sf()) {
                            jSONObject3.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc()));
                        }
                        jSONObject2.putOpt("pag_json_data", jSONObject3.toString());
                        optJSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    } catch (Exception unused) {
                    }
                    if (!TextUtils.isEmpty(hc.pcc(lu.pcc())) && TextUtils.equals(optString3, "click") && mu.this.lu != null) {
                        com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(mu.this.lu.oyx(), true), 2, mu.this.lu.esn());
                    }
                    new pcc.C0117pcc(System.currentTimeMillis(), mu.this.lu).oo(optString).sf(optString2).gm(optString3).pcc(mu.this.lu == null ? "" : mu.this.lu.bq()).pcc(mu.this.lu == null ? null : mu.this.lu.go()).vj(String.valueOf(optLong)).kj(mu.this.lu == null ? "" : mu.this.lu.hpk()).qf(mu.this.lu != null ? mu.this.lu.qxv() : "").wh(String.valueOf(optLong2)).pcc(optJSONObject).pcc((com.bytedance.sdk.openadsdk.oo.sf.pcc) null);
                }
            }
        });
    }

    public com.bytedance.sdk.openadsdk.core.jr.oo.sf gbb() {
        return this.fmh;
    }

    public void vh() {
        lq();
    }

    public void dax() {
        tsz tszVar = this.qcw;
        if (tszVar != null) {
            tszVar.n_();
        }
    }

    public void fum() {
        com.bytedance.sdk.openadsdk.component.reward.gm.oo ooVar = this.ptr;
        if (ooVar != null) {
            ooVar.pcc();
        }
    }

    public void lo() {
        try {
            pcc("requestHeartBeat", new JSONObject());
        } catch (Exception unused) {
        }
    }

    public void wh(String str) {
        this.kun = str;
    }

    public void wh(boolean z) {
        this.ri = z;
    }

    public boolean wh() {
        return this.sf;
    }

    private WebView tz() {
        com.bytedance.sdk.component.vy.qf qfVar;
        WeakReference<com.bytedance.sdk.component.vy.qf> weakReference = this.vj;
        if (weakReference == null || (qfVar = weakReference.get()) == null) {
            return null;
        }
        return qfVar.getWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vy(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return ork();
        }
        return true;
    }

    public JSONObject qf(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
        if (daxVar != null) {
            try {
                jSONObject2.put("state", daxVar.sf(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public boolean vy() {
        return this.rj;
    }

    public void qf(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            pcc("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void qf(String str) {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm gmVar = this.hoh;
        if (gmVar != null) {
            gmVar.pcc(str);
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.of oo() {
        return this.lu;
    }

    public mu oo(String str) {
        this.hc = str;
        return this;
    }

    public void oo(boolean z) {
        this.sf = z;
    }

    public void oo(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netType", i);
            pcc("netTypeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean ork() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.lu;
        return ofVar != null && ofVar.rc() == 1;
    }

    public void ork(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.pcc oo;
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.lu;
        if (ofVar == null || (oo = ofVar.oo()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.of> vj = oo.vj();
        if (optInt < 0 || optInt >= vj.size()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.of ofVar2 = vj.get(optInt);
        ofVar2.qcw(optInt);
        pcc(ofVar2, this.kun, false);
        com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar = this.fmh;
        if (sfVar != null) {
            sfVar.qcw();
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar = this.erj;
        if (pccVar != null) {
            pccVar.pcc();
        }
    }

    public void lu() {
        tsz tszVar = this.qcw;
        if (tszVar != null) {
            tszVar.r_();
        }
    }

    private static List<String> yt() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    public void kj() {
        com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
        if (daxVar != null) {
            daxVar.sf();
        }
    }

    public JSONObject kj(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
        if (daxVar != null) {
            try {
                jSONObject2.put("state", daxVar.pcc(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public void kj(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            pcc(U3.h.V, jSONObject);
        } catch (Exception unused) {
        }
    }

    private void of(JSONObject jSONObject) {
        WebView tz;
        if (jSONObject == null || (tz = tz()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.gbb.pcc(tz, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    public mu gm(boolean z) {
        this.mu = z;
        return this;
    }

    public mu gm(String str) {
        this.vh = str;
        return this;
    }

    public void gm() {
        com.bytedance.sdk.component.pcc.jr jrVar = this.rnn;
        if (jrVar == null) {
            return;
        }
        jrVar.pcc();
        this.rnn = null;
    }

    public void gm(JSONObject jSONObject) {
        gpj.pcc(qy(), this.hpk instanceof Activity, jSONObject, this.lu, this.kun, this.gbb, tz(), this.kj);
    }

    private void gm(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            of(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void gm(int i) {
        com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
        if (daxVar != null) {
            daxVar.sf(i);
        }
    }

    public boolean vj() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.lu;
        return ofVar != null && ofVar.ywp();
    }

    public mu vj(String str) {
        this.jr = str;
        return this;
    }

    public void vj(boolean z) {
        this.xb = z;
    }

    public void vj(int i) {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar;
        if (i == 0 || i != 1 || (pccVar = this.erj) == null) {
            return;
        }
        pccVar.pcc();
    }

    public void gpj() {
        com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar = this.fmh;
        if (sfVar != null) {
            sfVar.ye();
        }
    }

    public mu sf(String str) {
        this.qf = str;
        return this;
    }

    public com.bytedance.sdk.component.pcc.jr sf() {
        return this.rnn;
    }

    public mu sf(com.bytedance.sdk.component.vy.qf qfVar) {
        this.vj = new WeakReference<>(qfVar);
        return this;
    }

    public mu sf(boolean z) {
        this.pq = z;
        return this;
    }

    public mu sf(int i) {
        this.gbb = i;
        return this;
    }

    public static void sf(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = yt().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.gm.pcc());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.gm.qf());
        jSONObject.put(C4324ta.b, com.bytedance.sdk.openadsdk.common.gm.sf());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.gm.gm());
        jSONObject.put("formatSdkEdition", com.bytedance.sdk.openadsdk.common.gm.oo());
        jSONObject.put("fullSdkEdition", com.bytedance.sdk.openadsdk.common.gm.vj());
        jSONObject.put(U3.j.W, com.bytedance.sdk.openadsdk.common.gm.wh());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.gm.kj());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.gm.pcc(lu.pcc()));
        Object obj = Build.VERSION.RELEASE;
        jSONObject.put("os_version", obj);
        if (DeviceUtils.sf(lu.pcc())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", U3.d);
        }
        jSONObject.put("device_type", obj);
    }

    private void sf(String str, boolean z) {
        if (this.nn == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.nn;
        if (z) {
            vjVar.pcc(str);
        } else {
            vjVar.sf(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(com.bytedance.sdk.openadsdk.core.ork.dax daxVar, JSONObject jSONObject) {
        if (daxVar == null || jSONObject == null) {
            return;
        }
        try {
            daxVar.pcc(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false), !jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_MUTE) ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            of(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void sf(@NonNull final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    ork(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.mu.10
                @Override // java.lang.Runnable
                public void run() {
                    long j;
                    String str;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    mu.this.kun = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (mu.this.vy(queryParameter3)) {
                        long j2 = 0;
                        try {
                            j = Long.parseLong(uri.getQueryParameter(U3.i.X));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j3 = j2;
                        JSONObject jSONObject = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(mu.this.dax));
                                } catch (Throwable unused3) {
                                }
                                jSONObject = jSONObject2;
                            }
                        } catch (Throwable unused4) {
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject = mu.this.yt(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str2 : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str2)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str2)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str2, uri.getQueryParameter(str2));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                str = mu.this.qf;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            str = mu.this.pcc(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(mu.this.lu, queryParameter, str, queryParameter3, j, j3, jSONObject, com.bytedance.sdk.openadsdk.core.model.lo.kj(mu.this.lu));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public mu pcc(com.bytedance.sdk.openadsdk.core.widget.pcc.sf sfVar) {
        this.lrr = sfVar;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.core.widget.vj vjVar) {
        this.kj = vjVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.hc.sf pcc() {
        return this.tsx;
    }

    public void pcc(com.bytedance.sdk.openadsdk.hc.sf sfVar) {
        this.tsx = sfVar;
    }

    public mu pcc(boolean z) {
        this.gm = z;
        return this;
    }

    public mu pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        WebView webView;
        if (qfVar != null && (webView = qfVar.getWebView()) != null) {
            try {
                this.rnn = com.bytedance.sdk.component.pcc.jr.pcc(webView).pcc(this.gm ? new com.bytedance.sdk.openadsdk.tmg.sf() : new com.bytedance.sdk.openadsdk.tmg.pcc()).pcc("ToutiaoJSBridge").pcc(new com.bytedance.sdk.component.pcc.ork() { // from class: com.bytedance.sdk.openadsdk.core.mu.1
                    @Override // com.bytedance.sdk.component.pcc.ork
                    @NonNull
                    public <T> T pcc(@NonNull String str, @NonNull Type type) {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.pcc.ork
                    @NonNull
                    public <T> String pcc(@NonNull T t) {
                        return null;
                    }
                }).pcc(ork.sf().jr()).sf(true).pcc();
                boolean kj = com.bytedance.sdk.openadsdk.yt.vj.kj();
                com.bytedance.sdk.component.pcc.jr jrVar = this.rnn;
                if (kj) {
                    com.bytedance.sdk.openadsdk.tmg.pcc.kj.pcc(jrVar, this);
                    com.bytedance.sdk.openadsdk.tmg.pcc.ork.pcc(this.rnn, this);
                    com.bytedance.sdk.openadsdk.tmg.pcc.tz.pcc(this.rnn, qfVar, this, this.lu);
                } else {
                    com.bytedance.sdk.openadsdk.tmg.pcc.qf.pcc(jrVar, this);
                    com.bytedance.sdk.openadsdk.tmg.pcc.vy.pcc(this.rnn, this);
                    com.bytedance.sdk.openadsdk.tmg.pcc.fum.pcc(this.rnn, qfVar, this, this.lu);
                }
                com.bytedance.sdk.openadsdk.tmg.pcc.pcc.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.sf.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.gm.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.wh.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.vh.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.dax.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.hc.pcc(this.rnn, qfVar);
                com.bytedance.sdk.openadsdk.tmg.pcc.vj.pcc(this.rnn, this.tz);
                com.bytedance.sdk.openadsdk.tmg.pcc.oo.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.jr.pcc(this.rnn, this, this.lu);
                com.bytedance.sdk.openadsdk.tmg.pcc.nac.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.lu.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.tmg.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.lo.pcc(this.rnn, this.lu);
                com.bytedance.sdk.openadsdk.tmg.pcc.gbb.pcc(this.rnn, this);
                com.bytedance.sdk.openadsdk.tmg.pcc.gpj.pcc(this.rnn, this, this.lu);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.oo.oo.vj vjVar) {
        this.nn = vjVar;
        return this;
    }

    public mu pcc(View view) {
        this.tmg = new WeakReference<>(view);
        return this;
    }

    public mu pcc(int i) {
        this.dax = i;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        this.lu = ofVar;
        if (ofVar != null) {
            this.gpj = ofVar.luz();
        }
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.hc.gm gmVar) {
        this.mk = gmVar;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.hc.vh vhVar) {
        this.atb = vhVar;
        return this;
    }

    public mu pcc(Map<String, Object> map) {
        this.pcc = map;
        return this;
    }

    public mu pcc(com.bytedance.sdk.component.adexpress.sf.vh vhVar) {
        this.lo = vhVar;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.core.ork.dax daxVar) {
        this.fum = daxVar;
        return this;
    }

    public mu pcc(JSONObject jSONObject) {
        this.tz = jSONObject;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.hc.pcc pccVar) {
        this.yt = pccVar;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.hc.vj vjVar) {
        this.qy = vjVar;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.hc.kj kjVar) {
        this.iv = kjVar;
        return this;
    }

    public static void pcc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.of ofVar) throws Exception {
        String esn = ofVar.esn();
        if (!TextUtils.isEmpty(esn)) {
            jSONObject.put(BidResponsedEx.KEY_CID, esn);
        }
        String hl = ofVar.hl();
        if (!TextUtils.isEmpty(hl)) {
            jSONObject.put("log_extra", hl);
        }
        String ray = ofVar.ray();
        if (!TextUtils.isEmpty(ray)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, ray);
        }
        jSONObject.put("dc", TextUtils.isEmpty(lu.oo().ri()) ? lu.oo().ri() : "TX");
        jSONObject.put("language", hc.sf());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.vh.sf().ywp());
    }

    private void pcc(JSONObject jSONObject, boolean z, String str) {
        com.bytedance.sdk.openadsdk.core.widget.vj vjVar;
        if (z) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString) || new JSONObject(optString).optInt("agg_request_type", -1) != 1 || !"click".equals(str) || (vjVar = this.kj) == null) {
                    return;
                }
                vjVar.pcc();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        int i;
        String str2;
        if (jSONObject != null) {
            i = jSONObject.optInt("landingStyle");
            str = jSONObject.optString("url");
            str2 = jSONObject.optString("fallback_url");
        } else {
            str = null;
            i = -1;
            str2 = null;
        }
        if (i == 1) {
            if (!com.bytedance.sdk.component.utils.lu.pcc(str)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e) {
                    com.bytedance.sdk.component.utils.lo.pcc("TTAD.AndroidObject", "handleUrl, EX1->: ", e);
                }
                return false;
            }
        } else if (i == 2) {
            try {
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    jSONObject2.put("empty_url", 1);
                    return false;
                }
                if (!com.bytedance.sdk.component.utils.lu.pcc(str2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.AndroidObject", "handleUrl, EX2->: ", e2);
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.sf
    public void pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("time");
            String optString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
            if (daxVar != null) {
                daxVar.pcc(optInt, optString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    public void pcc(final sf sfVar, final JSONObject jSONObject) {
        if (sfVar == null) {
            return;
        }
        try {
            pcc(sfVar.oo, new com.bytedance.sdk.openadsdk.hc.oo() { // from class: com.bytedance.sdk.openadsdk.core.mu.7
                @Override // com.bytedance.sdk.openadsdk.hc.oo
                public void pcc(boolean z, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                    if (!z) {
                        mu.this.sf(sfVar.sf, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", mu.pcc(pccVar));
                        mu.this.sf(sfVar.sf, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean pcc(String str, int i, com.bytedance.sdk.openadsdk.core.model.dax daxVar) {
        HashMap<String, vh> hashMap;
        if (TextUtils.isEmpty(str) || (hashMap = this.lq) == null || hashMap.get(str) == null) {
            return false;
        }
        throw null;
    }

    public void pcc(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.hc.oo ooVar) {
        JSONObject optJSONObject;
        if (ooVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.hc.oo ooVar2 = new com.bytedance.sdk.openadsdk.hc.oo() { // from class: com.bytedance.sdk.openadsdk.core.mu.8
                @Override // com.bytedance.sdk.openadsdk.hc.oo
                public void pcc(final boolean z, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                    com.bytedance.sdk.openadsdk.utils.rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mu.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ooVar.pcc(z, pccVar);
                        }
                    });
                }
            };
            if (this.lu != null && !TextUtils.isEmpty(this.hc)) {
                int hh = this.lu.hh();
                AdSlot gqd = this.lu.gqd();
                com.bytedance.sdk.openadsdk.core.model.tsz tszVar = new com.bytedance.sdk.openadsdk.core.model.tsz();
                tszVar.wh = true;
                if (this.lu.kx() != null || this.lu.uae() != null) {
                    tszVar.vy = 2;
                }
                JSONObject jSONObject2 = this.gpj;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null && jSONObject.has("session_params") && (optJSONObject = jSONObject.optJSONObject("session_params")) != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, optJSONObject.opt(next));
                    }
                }
                tszVar.qf = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (tszVar.kj == null) {
                        tszVar.kj = new JSONObject();
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (optJSONObject2 != null) {
                        Iterator<String> keys2 = optJSONObject2.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            tszVar.kj.put(next2, optJSONObject2.opt(next2));
                        }
                    }
                }
                lu.gm().pcc(gqd, tszVar, hh, new tz() { // from class: com.bytedance.sdk.openadsdk.core.mu.9
                    @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
                    public void pcc(int i, String str) {
                        ooVar2.pcc(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
                    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                        mu.this.pcc(pccVar, gmVar, ooVar2);
                    }
                });
                return;
            }
            ooVar2.pcc(false, null);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.AndroidObject", "get ads error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar, com.bytedance.sdk.openadsdk.hc.oo ooVar) {
        if (pccVar.vj() != null && !pccVar.vj().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.of ofVar = pccVar.vj().get(0);
            if (ofVar != null) {
                this.gpj = ofVar.luz();
            }
            ooVar.pcc(true, pccVar);
            return;
        }
        ooVar.pcc(false, null);
        gmVar.pcc(-3);
        gmVar.gm(7);
        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
    }

    public static JSONArray pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        com.bytedance.sdk.openadsdk.core.model.of qf;
        if (pccVar == null || !pccVar.wh() || (qf = pccVar.qf()) == null || TextUtils.isEmpty(qf.qrz())) {
            return null;
        }
        try {
            return new JSONObject(qf.qrz()).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean pcc(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if ("bytedance".equals(uri.getScheme())) {
                return vy.containsKey(uri.getHost());
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String pcc(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.lo.kj(this.lu)) {
            if ("show".equals(str2)) {
                return com.bytedance.sdk.openadsdk.utils.kun.pcc(this.gbb);
            }
            return "aggregate_page";
        }
        if (com.bytedance.sdk.openadsdk.core.model.atb.vj(this.lu)) {
            return this.qf;
        }
        if (this.mk != null) {
            return com.bytedance.sdk.openadsdk.utils.kun.pcc(this.gbb);
        }
        return this.lo == null ? com.bytedance.sdk.openadsdk.utils.kun.sf(this.gbb) : str;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof sf) {
                try {
                    pcc((sf) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.vh.sf
    public void pcc(String str, JSONObject jSONObject) {
        Objects.toString(jSONObject);
        gm(str, jSONObject);
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(lu.pcc(), ofVar, str, this.gbb);
        pccVar.pcc(com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(lu.pcc(), str));
        if (!z) {
            pccVar.pcc(false);
        }
        pccVar.pcc((View) null);
    }

    public void pcc(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.fum;
        if (daxVar != null) {
            daxVar.pcc(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar = this.fmh;
        if (sfVar != null) {
            sfVar.pcc(str, jSONObject);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        this.fmh = sfVar;
    }

    public void pcc(tsz tszVar) {
        this.qcw = tszVar;
    }

    public void pcc(pcc pccVar) {
        this.vr = pccVar;
    }

    public void pcc(int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            pcc("resize", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void pcc(String str, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sessionID", str);
            jSONObject.put("status", i);
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i2);
            pcc("landingPageLoadStatus", jSONObject);
        } catch (Exception unused) {
        }
    }

    public mu pcc(Activity activity) {
        this.zsj = activity;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.component.reward.gm.wh whVar) {
        this.gd = whVar;
        return this;
    }

    public mu pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar) {
        this.erj = pccVar;
        return this;
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm gmVar) {
        this.hoh = gmVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.oo ooVar) {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm gmVar = this.hoh;
        if (gmVar != null) {
            gmVar.pcc(ooVar);
        }
    }

    public void pcc(String str, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm gmVar = this.hoh;
        if (gmVar != null) {
            gmVar.pcc(str, z);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.vy vyVar) {
        this.se = vyVar;
    }

    public void pcc(int i, JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.reward.gm.vy vyVar = this.se;
        if (vyVar != null) {
            vyVar.pcc(i, jSONObject);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.oo ooVar) {
        this.ptr = ooVar;
    }
}
