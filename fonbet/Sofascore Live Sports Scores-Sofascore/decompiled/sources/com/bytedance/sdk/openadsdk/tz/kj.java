package com.bytedance.sdk.openadsdk.tz;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.wt3;
import defpackage.wv8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private long atb;
    private int az;
    private int bbd;
    private int bg;
    private String bgf;
    private String bq;
    private String bxz;
    private String by;
    private volatile boolean ct;
    private int cz;
    private boolean dax;
    private String dp;
    private boolean dt;
    private pcc ei;
    private boolean eko;
    private int erj;
    private String esn;
    private long ew;
    private int fmh;
    private String fum;
    private String fvk;
    private JSONObject fy;
    private Runnable gbb;
    private int gd;
    private int gdh;
    private float gga;
    private JSONObject gh;
    public final String gm;
    private boolean gmh;
    private int gpa;
    private Set<String> gpj;
    private String gqd;
    private int gr;
    private boolean gye;
    private Runnable hc;
    private volatile boolean hl;
    private boolean hoh;
    private boolean hpk;
    private String iv;
    private int jmx;
    private JSONObject jq;
    private sf jr;
    private long jsj;
    private String jy;
    private int kez;
    private final Handler kj;
    private String kun;
    private String kx;
    private int kz;
    private boolean lc;
    private boolean ln;
    private String lo;
    private long lq;
    private String lrr;
    private boolean lu;
    private int mk;
    private long mu;
    private String mua;
    private boolean nac;
    private long nn;
    private boolean of;
    private int ofe;
    public final String oo;
    private Runnable ork;
    private int otd;
    private boolean oyx;
    public final String pcc;
    private long pq;
    private String ptr;
    private int pv;
    private boolean pzh;
    private com.bytedance.sdk.openadsdk.tz.pcc qc;
    private int qcw;
    private final String qf;
    private boolean qxq;
    private String qy;
    private WeakReference<View> ra;
    private float rc;
    private int ri;
    private String rj;
    private long rnn;
    private wh rt;
    private int rv;
    private int se;
    public final String sf;
    private final Handler tmg;
    private long tmh;
    private long tsx;
    private long tsz;
    private boolean tz;
    private float uae;
    private String vd;
    private Context vgx;
    private Runnable vh;
    public final String vj;
    private Map<String, String> vo;
    private int vr;
    private Runnable vy;
    private gm wax;
    private final String wh;
    private boolean wjv;
    private int xb;
    private JSONObject xf;
    private List<JSONObject> xfm;
    private int xy;
    private long ye;
    private boolean yt;
    private ViewTreeObserver.OnGlobalLayoutListener ywc;

    @Nullable
    private WebView ywp;
    private int zk;
    private int zpi;
    private int zsj;
    private long zti;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private kj(Context context, WebView webView, gm gmVar, com.bytedance.sdk.openadsdk.tz.pcc pccVar, pcc pccVar2) {
        this.wh = "playable_stuck_check_ping";
        this.qf = "playable_apply_media_permission_callback";
        this.kj = new Handler(Looper.getMainLooper());
        this.tmg = new Handler(Looper.getMainLooper());
        this.dax = true;
        this.nac = true;
        this.lu = true;
        this.pcc = "PL_sdk_playable_global_viewable";
        this.sf = "PL_sdk_page_screen_blank";
        this.gm = "PL_sdk_playable_destroy_analyze_summary";
        this.oo = "PL_sdk_playable_hardware_dialog_cancel";
        this.vj = "PL_sdk_playable_hardware_dialog_setting";
        this.gpj = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.lo = null;
        this.fum = "embeded_ad";
        this.tz = true;
        this.of = true;
        this.yt = false;
        this.qy = "";
        this.jsj = 10L;
        this.tsz = 10L;
        this.mk = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
        this.atb = 0L;
        this.ye = 0L;
        this.lq = -1L;
        this.zti = -1L;
        this.pq = -1L;
        this.mu = -1L;
        this.nn = -1L;
        this.rnn = -1L;
        this.tsx = -1L;
        this.kun = "";
        this.rj = "";
        this.lrr = "";
        this.iv = "";
        this.xb = 0;
        this.ri = 0;
        this.hpk = false;
        this.fmh = 0;
        this.zsj = -1;
        this.gd = 0;
        this.erj = 0;
        this.se = 0;
        this.ptr = null;
        this.hoh = false;
        this.qcw = 0;
        this.vr = 0;
        this.bg = 0;
        this.kz = 0;
        this.ew = 0L;
        this.tmh = 0L;
        this.gdh = -2;
        this.otd = 0;
        this.bbd = 0;
        this.pv = 0;
        this.jq = new JSONObject();
        this.vo = new HashMap();
        this.fy = new JSONObject();
        this.vd = "";
        this.uae = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.gga = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.oyx = false;
        this.lc = false;
        this.gye = false;
        this.xfm = new ArrayList();
        this.dt = true;
        this.hl = true;
        this.ct = true;
        this.ywc = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tz.kj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) kj.this.ra.get();
                    if (view == null) {
                        return;
                    }
                    kj.this.sf(view);
                } catch (Throwable th) {
                    qf.pcc("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.cz = -1;
        this.gdh = 0;
        this.ei = pccVar2;
        this.ywp = webView;
        vy.pcc(webView);
        pcc(webView);
        pcc(context, gmVar, pccVar);
    }

    private void iv() {
        Runnable runnable;
        Runnable runnable2;
        this.jr.pcc(System.currentTimeMillis());
        Handler handler = this.tmg;
        if (handler != null) {
            int i = this.gdh;
            if (i == 0 && (runnable2 = this.hc) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.gbb) != null) {
                handler.post(runnable);
            }
            this.jr.pcc(500);
        }
    }

    private void lrr() {
        String str;
        if (this.fy == null || (str = this.bxz) == null || str.contains("/cid_")) {
            return;
        }
        String optString = this.fy.optString(BidResponsedEx.KEY_CID);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        String host = Uri.parse(this.bxz).getHost();
        if (TextUtils.isEmpty(host)) {
            this.bxz = wt3.m(this.bxz, "/cid_", new StringBuilder(), optString);
        } else {
            this.bxz = this.bxz.replace(host, wv8.i(host, "/cid_", optString));
        }
    }

    private void rj() {
        this.jr = new sf(this, this.mk);
        this.vy = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.kj.5
            @Override // java.lang.Runnable
            public void run() {
                if (kj.this.tz) {
                    kj.this.tz = false;
                    kj.this.kj.removeCallbacks(kj.this.ork);
                    kj.this.pcc(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.ork = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.kj.6
            @Override // java.lang.Runnable
            public void run() {
                if (kj.this.tz) {
                    kj.this.tz = false;
                    kj.this.hl = false;
                    kj.this.kj.removeCallbacks(kj.this.vy);
                    kj.this.pcc(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.hc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.kj.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (kj.this.ywp != null) {
                    kj.this.ywp.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tz.kj.7.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (kj.this.jr != null) {
                                kj.this.jr.pcc(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (kj.this.tmg != null) {
                    kj.this.tmg.postDelayed(this, 500L);
                }
            }
        };
        this.gbb = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.kj.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                kj.this.pcc("playable_stuck_check_ping", new JSONObject());
                if (kj.this.tmg != null) {
                    kj.this.tmg.postDelayed(this, 500L);
                }
            }
        };
        this.vh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.kj.9
            @Override // java.lang.Runnable
            public void run() {
                long j = kj.this.tmh;
                kj kjVar = kj.this;
                if (j <= 0) {
                    kjVar.sf(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                long j2 = kjVar.tmh - kj.this.ew;
                long j3 = kj.this.mk;
                kj kjVar2 = kj.this;
                if (j2 > j3) {
                    kjVar2.sf(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                kjVar2.zti();
                kj.this.ew = 0L;
                kj.this.tmh = 0L;
            }
        };
    }

    private boolean tmg(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    private void vj(String str, JSONObject jSONObject) {
        try {
            int i = this.gdh;
            if (i == 0) {
                if (this.ei != pcc.LAND_PAGE && !tmg(this.bxz)) {
                    lrr();
                }
                jSONObject.put("playable_url", this.bxz);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", gm(this.bgf, this.dp));
                    }
                }
                jSONObject.put("playable_url", oo(this.esn, this.bq));
            }
            jSONObject.put("playable_render_type", this.gdh);
            if (this.qc != null) {
                if (this.gdh == 0 && (this.ei != pcc.LAND_PAGE || tmg(this.bxz))) {
                    this.qc.pcc(jSONObject);
                } else if (this.gdh != 0) {
                    this.qc.pcc(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void atb() {
        sf sfVar;
        this.tmh = System.currentTimeMillis();
        int i = this.gdh;
        if ((i == 1 || i == 2) && (sfVar = this.jr) != null) {
            sfVar.pcc(System.currentTimeMillis());
        }
    }

    public String dax() {
        com.bytedance.sdk.openadsdk.tz.pcc pccVar;
        if (TextUtils.isEmpty(this.lrr) && (pccVar = this.qc) != null) {
            this.lrr = pccVar.pcc().toString();
        }
        return this.lrr;
    }

    public void fum() {
        com.bytedance.sdk.openadsdk.tz.pcc pccVar = this.qc;
        if (pccVar != null) {
            pccVar.sf();
        }
    }

    public JSONObject gbb() {
        boolean pcc2;
        boolean z;
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.vgx;
            boolean z2 = true;
            if (i >= 33) {
                z = vj.pcc(context, "android.permission.READ_MEDIA_IMAGES");
                pcc2 = true;
            } else {
                boolean pcc3 = vj.pcc(context, "android.permission.READ_EXTERNAL_STORAGE");
                pcc2 = vj.pcc(this.vgx, "android.permission.WRITE_EXTERNAL_STORAGE");
                z = pcc3;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", z);
            jSONObject.put("isHasWrite", pcc2);
            if (!z || !pcc2) {
                z2 = false;
            }
            jSONObject.put("result", z2);
            return jSONObject;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void gm(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.hpk && this.ri > 0) {
                this.hpk = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.wjv ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.eko);
            jSONObject.put("playable_session_id", this.lo);
            int i = this.gdh;
            if (i == 0) {
                if (this.ei != pcc.LAND_PAGE && !tmg(this.bxz)) {
                    lrr();
                }
                jSONObject.put("playable_url", this.bxz);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", gm(this.bgf, this.dp));
                    }
                }
                jSONObject.put("playable_url", oo(this.esn, this.bq));
            }
            jSONObject.put("playable_full_url", this.vd);
            jSONObject.put("playable_replay_count", this.fmh);
            jSONObject.put("playable_is_prerender", this.gmh);
            jSONObject.put("playable_is_preload", this.hpk);
            jSONObject.put("playable_render_type", this.gdh);
            jSONObject.put("playable_scenes_type", this.ei.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.bgf) ? "" : this.bgf);
            if (!TextUtils.isEmpty(this.dp)) {
                str2 = this.dp;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.esn);
            jSONObject.put("playable_minigamelite_schema", this.bq);
            jSONObject.put("playable_is_debug", this.lc);
            jSONObject.put("playable_retry_count", this.gd);
            jSONObject.put("playable_enter_from", this.erj);
            jSONObject.put("playable_sequence", this.se);
            jSONObject.put("playable_current_section", this.ptr);
            jSONObject.put("is_playable_finish", this.hoh);
            jSONObject.put("playable_card_session", this.kun);
            jSONObject.put("playable_video_session", this.rj);
            jSONObject.put("playable_network_type", dax());
            jSONObject.put("playable_lynx_version", this.qy);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.fum);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put(U3.i.X, this.fy.opt(BidResponsedEx.KEY_CID));
            jSONObject2.put("log_extra", this.fy.opt("log_extra"));
            int i2 = this.gdh;
            if (i2 != -1 && i2 != -2) {
                if (this.qc != null) {
                    List<JSONObject> list = this.xfm;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.xfm.iterator();
                        while (it.hasNext()) {
                            JSONObject optJSONObject = it.next().optJSONObject("adExtraData");
                            if (optJSONObject != null) {
                                optJSONObject.put("playable_render_type", this.gdh);
                                optJSONObject.put("playable_url", this.bxz);
                            }
                            this.qc.pcc(optJSONObject);
                        }
                        this.xfm.clear();
                    }
                    if (this.gdh == 0 && (this.ei != pcc.LAND_PAGE || tmg(this.bxz))) {
                        this.qc.pcc(jSONObject);
                        return;
                    } else {
                        if (this.gdh != 0) {
                            this.qc.pcc(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            List list2 = this.xfm;
            if (list2 == null) {
                list2 = new ArrayList();
                this.xfm = list2;
            }
            list2.add(jSONObject2);
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "reportEvent error", th);
        }
    }

    public JSONObject gpj() {
        return this.fy;
    }

    public JSONObject hc() {
        try {
            boolean pcc2 = vj.pcc(this.vgx, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", pcc2);
            return jSONObject;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject jr() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.ei.ordinal());
            jSONObject.put("safe_area_top_height", this.uae);
            jSONObject.put("safe_area_bottom_height", this.gga);
            jSONObject.put("playable_enter_from", this.erj);
            jSONObject.put("playable_retry_count", this.gd);
            jSONObject.put("playable_card_session", this.kun);
            jSONObject.put("playable_video_session", this.rj);
            jSONObject.put("playable_network_type", dax());
            jSONObject.put("aweme_id", this.iv);
            return jSONObject;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void jsj() {
        if (this.qc != null) {
            pcc pccVar = pcc.LAND_PAGE;
        }
    }

    public void kj(String str) {
        this.otd = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.pq = currentTimeMillis;
            long j = this.zti;
            jSONObject.put("playable_page_show_duration", j != -1 ? currentTimeMillis - j : 0L);
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        gm("PL_sdk_html_load_start", jSONObject);
        this.hl = true;
        this.ct = true;
        if (this.dt) {
            ye();
            this.hl = false;
            this.ct = false;
        }
        if (this.nac) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (vj.pcc(this.vgx, vj.tmg)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (vj.sf(this.vgx, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (vj.pcc(this.vgx, vj.vh)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (vj.pcc(this.vgx, vj.ork)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (vj.pcc(this.vgx, vj.vy)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (vj.pcc(this.vgx, vj.kj)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (vj.sf(this.vgx, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (vj.pcc(this.vgx, vj.qf)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (vj.pcc(this.vgx)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                gm("PL_sdk_hardware_detect", jSONObject2);
                this.nac = false;
            } catch (Throwable th2) {
                qf.pcc("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public int kun() {
        return this.cz;
    }

    public JSONObject lo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.rc);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.kez);
            jSONObject2.put("height", this.ofe);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.az);
            jSONObject3.put("y", this.gpa);
            jSONObject3.put("width", this.gr);
            jSONObject3.put("height", this.zpi);
            jSONObject.put(U3.i.K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.zk);
            jSONObject4.put("y", this.jmx);
            jSONObject4.put("width", this.rv);
            jSONObject4.put("height", this.xy);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public void lq() {
        this.ct = false;
        this.kj.removeCallbacks(this.ork);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.pq > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.pq);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            gm("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public JSONObject lu() {
        if (this.jq.isNull("width")) {
            View view = this.ra.get();
            if (view == null) {
                return this.jq;
            }
            sf(view);
        }
        return this.jq;
    }

    public void mk() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.nn > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.nn);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.pq > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.pq);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            gm("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void mu() {
        this.bbd = 0;
        this.pv = 0;
        this.rc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.kez = 0;
        this.ofe = 0;
        this.gpa = 0;
        this.az = 0;
        this.gr = 0;
        this.zpi = 0;
        this.jmx = 0;
        this.zk = 0;
        this.rv = 0;
        this.xy = 0;
    }

    public com.bytedance.sdk.openadsdk.tz.pcc nac() {
        return this.qc;
    }

    public void nn() {
        if (this.gye) {
            return;
        }
        this.gye = true;
        this.ye = 0L;
        this.nac = true;
        mu();
        try {
            View view = this.ra.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.ywc);
            }
        } catch (Throwable unused) {
        }
        try {
            this.rt.sf();
        } catch (Throwable unused2) {
        }
        try {
            sf sfVar = this.jr;
            if (sfVar != null) {
                sfVar.pcc();
                this.jr = null;
            }
            Handler handler = this.tmg;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.bxz)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.xb);
                jSONObject.put("playable_hit_times", this.ri);
                int i = this.xb;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", this.ri / (i * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                gm("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.bxz)) {
                if (this.lq != -1) {
                    this.atb += System.currentTimeMillis() - this.lq;
                    this.lq = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.atb);
                gm("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.hl = false;
        this.ct = false;
        this.kj.removeCallbacks(this.vy);
        this.kj.removeCallbacks(this.ork);
        this.kj.removeCallbacksAndMessages(null);
    }

    public void of() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.nn > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.nn);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.pq > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.pq;
                this.tsx = currentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", currentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            gm("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public JSONObject oo(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (qf.pcc() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject pcc2 = this.rt.pcc(str, jSONObject);
        if (qf.pcc()) {
            System.currentTimeMillis();
            if (pcc2 != null) {
                pcc2.toString();
            }
        }
        return pcc2;
    }

    public JSONObject ork() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.pzh);
            return jSONObject;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public void pcc(boolean z, String str, int i) {
        if (z) {
            this.otd = -1;
            this.kx = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", rnn());
            } catch (Throwable th) {
                qf.pcc("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            gm("PL_sdk_html_load_error", jSONObject);
            if (this.tz) {
                this.tz = false;
                this.hl = false;
                this.ct = false;
                this.kj.removeCallbacks(this.vy);
                this.kj.removeCallbacks(this.ork);
                pcc(1, "ContainerLoadFail");
            }
        }
    }

    public void pq() {
        try {
            sf sfVar = this.jr;
            if (sfVar != null) {
                sfVar.pcc();
            }
            Handler handler = this.tmg;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public kj qf(String str) {
        Uri parse;
        String scheme;
        int indexOf;
        String decode;
        this.vd = str;
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Throwable unused) {
        }
        if (!"http".equalsIgnoreCase(scheme) && !HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
            String host = parse.getHost();
            if (!U3.i.K.equalsIgnoreCase(host) && (host == null || !host.contains(U3.i.K))) {
                if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.gdh == -1) {
                        sf(2);
                    } else {
                        sf(1);
                    }
                }
                this.bxz = str;
                return this;
            }
            sf(0);
            String queryParameter = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter) && (decode = Uri.decode(queryParameter)) != null) {
                int indexOf2 = decode.indexOf("?");
                str = indexOf2 != -1 ? decode.substring(0, indexOf2) : decode;
            }
            this.bxz = str;
            return this;
        }
        sf(0);
        if (str != null && (indexOf = str.indexOf("?")) != -1) {
            str = str.substring(0, indexOf);
        }
        this.bxz = str;
        return this;
    }

    public void qy() {
        this.hoh = true;
    }

    public int rnn() {
        return (this.zti == -1 || !this.eko) ? 1 : 2;
    }

    public void sf(int i, String str) {
        this.zsj = i;
        JSONObject jSONObject = this.gh;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            this.gh = jSONObject;
        }
        try {
            jSONObject.put("playable_stuck_type", i);
            this.gh.put("playable_stuck_reason", str);
            if (this.rnn > 0) {
                this.gh.put("playable_stuck_duration", System.currentTimeMillis() - this.rnn);
            } else {
                this.gh.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        gm("PL_sdk_page_stuck", this.gh);
        pq();
        if (this.qc == null || i != 2) {
            return;
        }
        this.gh = new JSONObject();
    }

    public String tsx() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public void tsz() {
        if (this.qc != null) {
            pcc pccVar = pcc.LAND_PAGE;
        }
    }

    public void tz() {
        com.bytedance.sdk.openadsdk.tz.pcc pccVar = this.qc;
        if (pccVar != null) {
            pccVar.gm();
        }
    }

    public void vh(String str) {
        this.kj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.kj.3
            @Override // java.lang.Runnable
            public void run() {
                kj.hc(kj.this);
            }
        });
    }

    public void vy(String str) {
        WebView webView;
        boolean z = this.otd == -1;
        this.otd = 2;
        if (!z) {
            this.kx = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.mu = currentTimeMillis;
                long j = this.pq;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? currentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", rnn());
            } catch (Throwable th) {
                qf.pcc("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            gm("PL_sdk_html_load_finish", jSONObject);
        }
        this.hl = false;
        this.kj.removeCallbacks(this.vy);
        try {
            if (this.gdh == 0) {
                if (this.dax && (webView = this.ywp) != null) {
                    this.dax = false;
                    webView.evaluateJavascript(tsx(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tz.kj.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                zti();
            }
        } catch (Throwable th2) {
            qf.pcc("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void wh(JSONObject jSONObject) {
        sf(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void ye() {
        int i;
        int i2 = this.gdh;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.hl) {
                this.kj.postDelayed(this.vy, this.jsj * 1000);
            }
            if ((this.ct && tmg(this.bxz)) || (i = this.gdh) == 1 || i == 2) {
                this.kj.postDelayed(this.ork, this.tsz * 1000);
            }
        }
    }

    public void yt() {
        this.zsj = 2;
    }

    public void zti() {
        if (this.of) {
            this.rnn = System.currentTimeMillis();
            pcc pccVar = this.ei;
            pcc pccVar2 = pcc.FEED_AWEME;
            boolean z = this.eko;
            if (pccVar == pccVar2) {
                if (z && this.otd == 3) {
                    sf sfVar = this.jr;
                    if (sfVar != null && sfVar.sf()) {
                        iv();
                        return;
                    } else {
                        if (this.jr == null) {
                            this.jr = new sf(this, this.mk);
                            iv();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (z && this.otd == 2) {
                sf sfVar2 = this.jr;
                if (sfVar2 != null && sfVar2.sf()) {
                    iv();
                } else if (this.jr == null) {
                    this.jr = new sf(this, this.mk);
                    iv();
                }
            }
        }
    }

    public Set<String> vh() {
        return this.rt.pcc();
    }

    public String wh() {
        return this.mua;
    }

    public kj wh(String str) {
        this.fum = str;
        return this;
    }

    public void wh(boolean z) {
        this.wjv = z;
    }

    public void ork(String str) {
        this.kj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.kj.2
            @Override // java.lang.Runnable
            public void run() {
                kj.tmg(kj.this);
            }
        });
    }

    public static /* synthetic */ int hc(kj kjVar) {
        int i = kjVar.ri;
        kjVar.ri = i + 1;
        return i;
    }

    public static /* synthetic */ int tmg(kj kjVar) {
        int i = kjVar.xb;
        kjVar.xb = i + 1;
        return i;
    }

    public String oo() {
        return this.fvk;
    }

    public JSONObject tmg() {
        try {
            boolean pcc2 = vj.pcc(this.vgx, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", pcc2);
            return jSONObject;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public kj oo(String str) {
        this.mua = str;
        return this;
    }

    public kj oo(boolean z) {
        this.pzh = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.pzh);
            pcc("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    public void oo(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.ptr = jSONObject.optString("section");
        }
    }

    private String oo(String str, String str2) {
        String format = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.bxz = format;
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.bbd == view.getWidth() && this.pv == view.getHeight()) {
                return;
            }
            this.bbd = view.getWidth();
            this.pv = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.bbd);
            jSONObject.put("height", this.pv);
            pcc("resize", jSONObject);
            this.jq = jSONObject;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    private void pcc(Context context, gm gmVar, com.bytedance.sdk.openadsdk.tz.pcc pccVar) {
        this.lo = UUID.randomUUID().toString();
        this.vgx = context;
        this.qc = pccVar;
        this.wax = gmVar;
        ork.pcc(pccVar);
        this.rt = new wh(this);
        rj();
        if (this.ywp == null) {
            this.cz = 4;
            this.kj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.kj.4
                @Override // java.lang.Runnable
                public void run() {
                    kj.this.pcc(5, "webview is null");
                }
            });
        }
    }

    public Map<String, String> sf() {
        return this.vo;
    }

    public kj sf(String str) {
        this.fvk = str;
        return this;
    }

    public kj sf(boolean z) {
        this.gmh = z;
        return this;
    }

    public kj sf(long j) {
        if (j <= 0) {
            this.tsz = 10L;
            return this;
        }
        this.tsz = j;
        return this;
    }

    public void sf(JSONObject jSONObject) {
        if (this.qc != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public void sf(String str, String str2) {
        Bitmap pcc2;
        if (TextUtils.isEmpty(str2) || (pcc2 = vj.pcc(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.vgx.getContentResolver(), pcc2, str, "");
    }

    public void pcc(View view) {
        if (view == null) {
            return;
        }
        try {
            this.ra = new WeakReference<>(view);
            sf(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.ywc);
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public kj sf(int i) {
        this.gdh = i;
        return this;
    }

    public Context pcc() {
        return this.vgx;
    }

    public void sf(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vj(str, jSONObject);
    }

    public kj pcc(String str, String str2) {
        this.vo.put(str, str2);
        return this;
    }

    public kj pcc(String str) {
        this.gqd = str;
        return this;
    }

    public kj pcc(boolean z) {
        this.ln = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.ln);
            pcc("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public kj pcc(long j) {
        if (j <= 0) {
            this.jsj = 10L;
            return this;
        }
        this.jsj = j;
        return this;
    }

    public String vj() {
        return this.gqd;
    }

    public void pcc(int i) {
        this.cz = i;
    }

    public kj vj(String str) {
        this.by = str;
        return this;
    }

    public void pcc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.tz.pcc pccVar = this.qc;
        if (pccVar == null || pccVar.sf(jSONObject) || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("resource_type", -1);
        String optString2 = jSONObject.optString("resource_name", "playable_media");
        if (optInt == 1) {
            sf(optString2, optString);
        }
    }

    public void vj(JSONObject jSONObject) {
        this.gh = jSONObject;
        this.se++;
        pq();
        this.kj.removeCallbacks(this.vh);
        if (this.of) {
            this.rnn = System.currentTimeMillis();
            this.ew = System.currentTimeMillis();
            this.tmh = 0L;
            int i = this.gdh;
            if (i == 0) {
                WebView webView = this.ywp;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tz.kj.10
                        @Override // android.webkit.ValueCallback
                        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            kj.this.tmh = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                pcc("playable_stuck_check_ping", new JSONObject());
            }
            this.kj.postDelayed(this.vh, this.mk);
        }
    }

    public boolean vy() {
        return this.eko;
    }

    public void vy(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("success", true);
            if (optBoolean) {
                this.otd = 3;
                zti();
            } else {
                this.otd = -2;
            }
            if (optBoolean || !this.tz) {
                return;
            }
            this.tz = false;
            this.hl = false;
            this.ct = false;
            this.kj.removeCallbacks(this.vy);
            this.kj.removeCallbacks(this.ork);
            pcc(4, "CaseRenderFail");
        }
    }

    public void pcc(String str, JSONObject jSONObject) {
        if (this.qxq) {
            if (!qf.pcc() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (qf.pcc() && jSONObject != null) {
            jSONObject.toString();
        }
        gm gmVar = this.wax;
        if (gmVar != null) {
            gmVar.pcc(str, jSONObject);
        }
    }

    public kj pcc(float f) {
        this.rc = f;
        return this;
    }

    public kj vj(boolean z) {
        this.dt = z;
        return this;
    }

    public void pcc(int i, String str) {
        pq();
        gm(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "reportRenderFatal error", th);
        }
        gm("PL_sdk_global_faild", jSONObject);
    }

    public void pcc(int i, String str, String str2) {
        this.otd = -1;
        this.kx = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", rnn());
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "onWebReceivedError error", th);
        }
        gm("PL_sdk_html_load_error", jSONObject);
        if (this.tz) {
            this.tz = false;
            this.hl = false;
            this.ct = false;
            this.kj.removeCallbacks(this.vy);
            this.kj.removeCallbacks(this.ork);
            pcc(1, "ContainerLoadFail");
        }
    }

    public String qf() {
        return this.by;
    }

    public JSONObject qf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            return tmg();
        }
        if (optInt != 2) {
            return optInt != 3 ? jSONObject2 : gbb();
        }
        return hc();
    }

    public void qf(boolean z) {
        this.qxq = z;
    }

    public static kj pcc(Context context, @Nullable WebView webView, gm gmVar, com.bytedance.sdk.openadsdk.tz.pcc pccVar) {
        if (gmVar == null || pccVar == null) {
            return null;
        }
        if (webView == null) {
            return new kj(context, 0, gmVar, pccVar);
        }
        return new kj(context, webView, gmVar, pccVar, pcc.LAND_PAGE);
    }

    private kj(Context context, int i, gm gmVar, com.bytedance.sdk.openadsdk.tz.pcc pccVar) {
        this.wh = "playable_stuck_check_ping";
        this.qf = "playable_apply_media_permission_callback";
        this.kj = new Handler(Looper.getMainLooper());
        this.tmg = new Handler(Looper.getMainLooper());
        this.dax = true;
        this.nac = true;
        this.lu = true;
        this.pcc = "PL_sdk_playable_global_viewable";
        this.sf = "PL_sdk_page_screen_blank";
        this.gm = "PL_sdk_playable_destroy_analyze_summary";
        this.oo = "PL_sdk_playable_hardware_dialog_cancel";
        this.vj = "PL_sdk_playable_hardware_dialog_setting";
        this.gpj = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.lo = null;
        this.fum = "embeded_ad";
        this.tz = true;
        this.of = true;
        this.yt = false;
        this.qy = "";
        this.jsj = 10L;
        this.tsz = 10L;
        this.mk = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
        this.atb = 0L;
        this.ye = 0L;
        this.lq = -1L;
        this.zti = -1L;
        this.pq = -1L;
        this.mu = -1L;
        this.nn = -1L;
        this.rnn = -1L;
        this.tsx = -1L;
        this.kun = "";
        this.rj = "";
        this.lrr = "";
        this.iv = "";
        this.xb = 0;
        this.ri = 0;
        this.hpk = false;
        this.fmh = 0;
        this.zsj = -1;
        this.gd = 0;
        this.erj = 0;
        this.se = 0;
        this.ptr = null;
        this.hoh = false;
        this.qcw = 0;
        this.vr = 0;
        this.bg = 0;
        this.kz = 0;
        this.ew = 0L;
        this.tmh = 0L;
        this.gdh = -2;
        this.otd = 0;
        this.bbd = 0;
        this.pv = 0;
        this.jq = new JSONObject();
        this.vo = new HashMap();
        this.fy = new JSONObject();
        this.vd = "";
        this.uae = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.gga = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.oyx = false;
        this.lc = false;
        this.gye = false;
        this.xfm = new ArrayList();
        this.dt = true;
        this.hl = true;
        this.ct = true;
        this.ywc = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tz.kj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) kj.this.ra.get();
                    if (view == null) {
                        return;
                    }
                    kj.this.sf(view);
                } catch (Throwable th) {
                    qf.pcc("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.cz = -1;
        this.gdh = i;
        this.ei = pcc.LAND_PAGE;
        pcc(context, gmVar, pccVar);
    }

    public boolean kj() {
        return this.ln;
    }

    public JSONObject kj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (optInt == 1) {
                jSONObject2.put("result", vj.sf(this.vgx, "android.permission.RECORD_AUDIO"));
            } else {
                if (optInt == 2) {
                    jSONObject2.put("result", vj.sf(this.vgx, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (optInt == 3) {
                    jSONObject2.put("result", vj.pcc(this.vgx));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public JSONObject gm() {
        return this.xf;
    }

    public kj gm(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.xf = jSONObject;
            return this;
        } catch (Throwable th) {
            qf.pcc("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    public kj gm(boolean z) {
        if (this.cz != -1 && this.eko != z) {
            this.eko = z;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.eko) {
                    jSONObject.put("playable_background_show_type", this.vr);
                }
            } catch (JSONException unused) {
            }
            gm(this.eko ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.zti == -1 && this.eko) {
                this.zti = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.cz == 1 ? 1 : 2);
                    int i = this.cz;
                    if (i != -1) {
                        jSONObject2.put("webview_state", i);
                    }
                } catch (JSONException unused2) {
                }
                gm("PL_sdk_page_show", jSONObject2);
            }
            if (this.zti != -1 && !this.eko && !this.oyx) {
                this.oyx = true;
            }
            if (this.eko) {
                this.lq = System.currentTimeMillis();
            } else if (this.lq != -1) {
                this.atb += System.currentTimeMillis() - this.lq;
                this.lq = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.eko);
                pcc(U3.h.V, jSONObject3);
            } catch (Throwable th) {
                qf.pcc("PlayablePlugin", "setViewable error", th);
            }
            if (this.eko) {
                zti();
            } else {
                pq();
            }
        }
        return this;
    }

    public kj gm(JSONObject jSONObject) {
        this.fy = jSONObject;
        return this;
    }

    private void gm(int i, String str) {
        com.bytedance.sdk.openadsdk.tz.pcc pccVar = this.qc;
        if (pccVar != null) {
            pccVar.pcc(i, str);
        }
    }

    private String gm(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.jy) && !TextUtils.isEmpty(this.vd)) {
            Uri parse = Uri.parse(this.vd);
            String host = parse.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = parse.getQueryParameter("surl");
                queryParameter2 = parse.getQueryParameter("playable_hash");
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(parse.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                appendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.jy = appendQueryParameter.toString();
        }
        return this.jy;
    }
}
