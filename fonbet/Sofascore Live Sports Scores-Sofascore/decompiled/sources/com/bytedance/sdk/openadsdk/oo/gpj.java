package com.bytedance.sdk.openadsdk.oo;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gpj implements com.bytedance.sdk.openadsdk.oo.oo.vj {
    private Boolean gm;
    private JSONArray kj;
    private Boolean oo;
    private String pcc;
    private JSONArray qf;
    private of sf;
    private AtomicBoolean vj;
    private JSONObject wh;

    public gpj(int i, String str, of ofVar) {
        this.pcc = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.gm = bool;
        this.oo = bool;
        this.vj = new AtomicBoolean(false);
        this.pcc = str;
        this.sf = ofVar;
        this.wh = new JSONObject();
        this.qf = new JSONArray();
        this.kj = new JSONArray();
        pcc(this.wh, "webview_source", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dax() {
        return this.oo.booleanValue() || this.gm.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.oo
    public void gbb() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.16
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.pcc
    public void gm(final int i, final String str) {
        try {
            com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.22
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    gpj.this.pcc(jSONObject, "code", Integer.valueOf(i));
                    gpj gpjVar = gpj.this;
                    gpjVar.pcc(gpjVar.wh, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.sf
    public void hc() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.15
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.oo
    public void jr() {
        try {
            com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.17
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    gpj gpjVar = gpj.this;
                    gpjVar.pcc(gpjVar.wh, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.gm
    public void kj() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.3
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj.this.pcc(jSONObject, "type", "native_enterBackground");
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.qf, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void oo() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.28
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.vj
    public void ork() {
        this.gm = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.gm
    public void qf() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.2
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void sf(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.6
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "start_ts", Long.valueOf(j));
                gpj.this.pcc(jSONObject, "end_ts", Long.valueOf(j2));
                gpj.this.pcc(jSONObject, "intercept_type", Integer.valueOf(i));
                gpj.this.pcc(jSONObject, "type", "intercept_js");
                gpj.this.pcc(jSONObject, "url", str);
                gpj.this.pcc(jSONObject, IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2 - j));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.kj, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.sf
    public void tmg() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.14
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "native_render_end", jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                gpj.this.pcc(jSONObject2, "ts", Long.valueOf(currentTimeMillis2));
                gpj gpjVar2 = gpj.this;
                gpjVar2.pcc(gpjVar2.wh, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.vj
    public void vh() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.10
            @Override // java.lang.Runnable
            public void run() {
                if (gpj.this.dax()) {
                    if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(gpj.this.sf) && gpj.this.vj.get()) {
                        return;
                    }
                    if (gpj.this.qf != null && gpj.this.qf.length() != 0) {
                        try {
                            gpj.this.wh.put("native_switchBackgroundAndForeground", gpj.this.qf);
                        } catch (Exception unused) {
                        }
                    }
                    if (gpj.this.kj != null && gpj.this.kj.length() != 0) {
                        try {
                            gpj.this.wh.put("intercept_source", gpj.this.kj);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", gpj.this.wh);
                    } catch (JSONException e) {
                        lo.pcc("WebviewTimeTrack", "trySendTrackInfo json error", e);
                    }
                    if (com.bytedance.sdk.openadsdk.core.ork.sf().jr() && gpj.this.wh != null) {
                        JSONObject unused3 = gpj.this.wh;
                    }
                    gpj.this.vj.set(true);
                    gm.sf(gpj.this.sf, gpj.this.pcc, "webview_time_track", jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.pcc
    public void vj(final String str) {
        try {
            com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.20
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    gpj gpjVar = gpj.this;
                    gpjVar.pcc(gpjVar.wh, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.gm
    public void vy() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.4
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj.this.pcc(jSONObject, "type", "native_enterForeground");
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.qf, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.pcc
    public void wh(final String str) {
        try {
            com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.21
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    gpj gpjVar = gpj.this;
                    gpjVar.pcc(gpjVar.wh, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.pcc
    public void oo(final String str) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.18
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.pcc
    public void qf(final String str) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.24
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.gm
    public void gm() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.27
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.oo
    public void sf() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.12
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void vj() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.29
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.gm
    public void wh() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.31
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.pcc
    public void gm(final String str) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.11
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void sf(final String str) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj.this.pcc(jSONObject, "jsb", str);
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void sf(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (gpj.this.wh == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    gpj gpjVar = gpj.this;
                    gpjVar.pcc(gpjVar.wh, next, jSONObject.opt(next));
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.pcc
    public void sf(final int i, final String str) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.13
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj.this.pcc(jSONObject, "code", Integer.valueOf(i));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void sf(final int i) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.25
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj.this.pcc(jSONObject, "isWebViewCache", Integer.valueOf(i));
                if (gpj.this.sf != null) {
                    boolean jy = gpj.this.sf.jy();
                    gpj gpjVar = gpj.this;
                    if (jy) {
                        gpjVar.pcc(jSONObject, "engine_version", "v3");
                    } else {
                        gpjVar.pcc(jSONObject, "engine_version", "v1");
                    }
                }
                gpj gpjVar2 = gpj.this;
                gpjVar2.pcc(gpjVar2.wh, "before_webview_request", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.oo
    public void pcc() {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(jSONObject, "render_sequence", Integer.valueOf(gpjVar.sf.rt()));
                if (gpj.this.sf != null) {
                    of.pcc kx = gpj.this.sf.kx();
                    gpj gpjVar2 = gpj.this;
                    if (kx != null) {
                        boolean tmg = gpjVar2.sf.kx().tmg();
                        gpj gpjVar3 = gpj.this;
                        if (tmg) {
                            gpjVar3.pcc(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.vj.vj.pcc().oo()));
                            gpj.this.pcc(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.vj.vj.pcc().oo()));
                        } else {
                            gpjVar3.pcc(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.vj.vj.pcc().gm()));
                            gpj.this.pcc(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.vj.vj.pcc().gm()));
                        }
                    } else if (gpjVar2.sf.uae() != null) {
                        gpj.this.pcc(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.vj.vj.pcc().oo()));
                        gpj.this.pcc(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.vj.vj.pcc().oo()));
                    }
                }
                gpj gpjVar4 = gpj.this;
                gpjVar4.pcc(gpjVar4.wh, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.oo
    public void pcc(final int i, final String str) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.23
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj.this.pcc(jSONObject, "code", Integer.valueOf(i));
                String str2 = str;
                if (str2 != null) {
                    gpj.this.pcc(jSONObject, "reason", str2);
                }
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.sf
    public void pcc(final int i) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.26
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj.this.pcc(jSONObject, "backup_type", Integer.valueOf(i));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void pcc(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.30
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                gpj.this.pcc(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void pcc(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "start_ts", Long.valueOf(j));
                gpj.this.pcc(jSONObject, "end_ts", Long.valueOf(j2));
                gpj.this.pcc(jSONObject, "intercept_type", Integer.valueOf(i));
                gpj.this.pcc(jSONObject, "type", "intercept_html");
                gpj.this.pcc(jSONObject, "url", str);
                gpj.this.pcc(jSONObject, IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2 - j));
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.kj, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.wh
    public void pcc(final String str) {
        com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                gpj.this.pcc(jSONObject, "jsb", str);
                gpj gpjVar = gpj.this;
                gpjVar.pcc(gpjVar.wh, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.vj
    public void pcc(boolean z) {
        this.oo = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(JSONObject jSONObject, String str, Object obj) {
        pcc(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oo.oo.pcc
    public void pcc(final String str, final boolean z) {
        try {
            com.bytedance.sdk.component.utils.vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.gpj.19
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    gpj.this.pcc(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                    gpj.this.pcc(jSONObject, "isReuse", Integer.valueOf(z ? 1 : 0));
                    gpj gpjVar = gpj.this;
                    gpjVar.pcc(gpjVar.wh, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public gpj() {
        this.pcc = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.gm = bool;
        this.oo = bool;
        this.vj = new AtomicBoolean(false);
    }
}
