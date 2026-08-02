package com.bytedance.sdk.component.pcc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.pcc.wh;
import defpackage.mz1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc {
    protected qf gm;
    protected Context pcc;
    wh qf;
    protected vh sf;
    protected String vj;
    protected Handler oo = new Handler(Looper.getMainLooper());
    protected volatile boolean wh = false;
    private final Map<String, wh> kj = new HashMap();

    public final void gm(vy vyVar) {
        this.pcc = pcc(vyVar);
        this.gm = vyVar.oo;
        this.sf = vyVar.kj;
        this.qf = new wh(vyVar, this);
        this.vj = vyVar.ork;
        sf(vyVar);
    }

    public void invokeMethod(final String str) {
        if (this.wh) {
            return;
        }
        this.oo.post(new Runnable() { // from class: com.bytedance.sdk.component.pcc.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                gbb gbbVar;
                if (pcc.this.wh) {
                    return;
                }
                try {
                    gbbVar = pcc.this.pcc(new JSONObject(str));
                } catch (Exception unused) {
                    gbbVar = null;
                }
                if (!gbb.pcc(gbbVar)) {
                    pcc.this.pcc(gbbVar);
                    return;
                }
                Objects.toString(gbbVar);
                if (gbbVar != null) {
                    pcc.this.sf(gpj.pcc(new dax(gbbVar.pcc, "Failed to parse invocation.")), gbbVar);
                }
            }
        });
    }

    public abstract Context pcc(vy vyVar);

    public abstract String pcc();

    public final void pcc(gbb gbbVar) {
        String pcc;
        if (this.wh || (pcc = pcc()) == null) {
            return;
        }
        wh sf = sf(gbbVar.qf);
        if (sf == null) {
            gbbVar.toString();
            if (this.sf != null) {
                pcc();
            }
            sf(gpj.pcc(new dax(-4, mz1.o(new StringBuilder("Namespace "), gbbVar.qf, " unknown."))), gbbVar);
            return;
        }
        vj vjVar = new vj();
        vjVar.sf = pcc;
        vjVar.pcc = this.pcc;
        vjVar.gm = sf;
        try {
            wh.pcc pcc2 = sf.pcc(gbbVar, vjVar);
            if (pcc2 != null) {
                if (pcc2.pcc) {
                    sf(pcc2.sf, gbbVar);
                }
                if (this.sf != null) {
                    pcc();
                    return;
                }
                return;
            }
            gbbVar.toString();
            if (this.sf != null) {
                pcc();
            }
            sf(gpj.pcc(new dax(-2, "Function " + gbbVar.oo + " is not registered.")), gbbVar);
        } catch (Exception e) {
            gbbVar.toString();
            sf(gpj.pcc(e), gbbVar);
        }
    }

    public abstract void pcc(String str);

    public abstract void sf(vy vyVar);

    public final void sf(String str, gbb gbbVar) {
        JSONObject jSONObject;
        if (this.wh || TextUtils.isEmpty(gbbVar.wh)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            kj.pcc(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        pcc(hc.pcc().pcc("__msg_type", "callback").pcc("__callback_id", gbbVar.wh).pcc("__params", jSONObject).sf(), gbbVar);
    }

    public void sf() {
        this.qf.pcc();
        Iterator<wh> it = this.kj.values().iterator();
        while (it.hasNext()) {
            it.next().pcc();
        }
        this.oo.removeCallbacksAndMessages(null);
        this.wh = true;
    }

    private wh sf(String str) {
        if (!TextUtils.equals(str, this.vj) && !TextUtils.isEmpty(str)) {
            return this.kj.get(str);
        }
        return this.qf;
    }

    public void pcc(String str, gbb gbbVar) {
        pcc(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gbb pcc(JSONObject jSONObject) {
        String optString;
        Object opt;
        if (this.wh) {
            return null;
        }
        String optString2 = jSONObject.optString("__callback_id");
        String optString3 = jSONObject.optString("func");
        if (pcc() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String str = "";
            try {
                opt = jSONObject.opt("params");
            } catch (Throwable unused) {
                optString = jSONObject.optString("params");
            }
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    optString = String.valueOf((JSONObject) opt);
                    String string2 = jSONObject.getString("JSSDK");
                    String optString4 = jSONObject.optString("namespace");
                    return gbb.pcc().pcc(string2).sf(string).gm(optString3).oo(optString).vj(optString2).wh(optString4).qf(jSONObject.optString("__iframe_url")).pcc();
                }
                if (opt instanceof String) {
                    str = (String) opt;
                } else {
                    str = String.valueOf(opt);
                }
            }
            optString = str;
            String string22 = jSONObject.getString("JSSDK");
            String optString42 = jSONObject.optString("namespace");
            return gbb.pcc().pcc(string22).sf(string).gm(optString3).oo(optString).vj(optString2).wh(optString42).qf(jSONObject.optString("__iframe_url")).pcc();
        } catch (JSONException unused2) {
            return gbb.pcc(optString2, -1);
        }
    }
}
