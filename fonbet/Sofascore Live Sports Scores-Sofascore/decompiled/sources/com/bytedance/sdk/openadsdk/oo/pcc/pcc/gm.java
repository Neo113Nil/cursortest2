package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.yt.sf;
import com.ironsource.Ua;
import com.mbridge.msdk.foundation.entity.b;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static final gm kj = new gm();
    private static final sf.pcc<gm> vy = new sf.pcc<gm>() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.gm.1
        @Override // com.bytedance.sdk.openadsdk.yt.sf.pcc
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm sf(String str) {
            return new gm(str);
        }
    };
    public long gm;
    public boolean oo;
    private final HashMap<String, pcc> ork;
    public boolean pcc;
    public boolean qf;
    public boolean sf;
    public long vj;
    public boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf {
        public String vj;
        public long pcc = 5000;
        public int sf = 50;
        public long gm = 604800000;
        public boolean oo = false;
        public int wh = 5;
        public int qf = 5;
        public long kj = 5000;

        public sf(String str) {
            this.vj = str;
        }

        public void pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.pcc = jSONObject.optLong("u_d_t", this.pcc);
            this.sf = jSONObject.optInt("u_m_c", this.sf);
            this.gm = jSONObject.optLong("e_t", this.gm);
            this.oo = jSONObject.optBoolean("ena", this.oo);
            this.wh = jSONObject.optInt("n_e_b_u_n_d_c", this.wh);
            this.qf = jSONObject.optInt("b_s_e_c", this.qf);
            this.kj = jSONObject.optLong("b_s_d_t", this.kj);
        }

        public String toString() {
            return super.toString();
        }
    }

    public gm(String str) {
        this.ork = new HashMap<>();
        this.gm = 86400000L;
        this.vj = Ua.C;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.pcc = jSONObject.optBoolean("ena_mon", this.pcc);
            this.sf = jSONObject.optBoolean("ena_wal", this.sf);
            this.gm = jSONObject.optLong("mon_u_i_ms", this.gm);
            this.oo = jSONObject.optBoolean("ena_dy_adj", this.oo);
            this.vj = jSONObject.optLong("p_u_r_d_t", this.vj);
            this.wh = jSONObject.optBoolean("s_e_u_t_p", this.wh);
            this.qf = jSONObject.optBoolean("u_e_u_t_p", this.qf);
            JSONArray optJSONArray = jSONObject.optJSONArray("ins_confs");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    pcc pccVar = new pcc(optJSONArray.getJSONObject(i));
                    this.ork.put(pccVar.sf, pccVar);
                }
            }
        } catch (JSONException unused) {
        }
    }

    @NonNull
    public static pcc pcc() {
        pcc pcc2 = sf().pcc(b.JSON_KEY_ADS);
        return pcc2 != null ? pcc2 : pcc.pcc;
    }

    public static gm sf() {
        gm gmVar = kj;
        gm gmVar2 = (gm) com.bytedance.sdk.openadsdk.yt.vj.pcc("event_logger_config", gmVar, vy);
        return gmVar2 != null ? gmVar2 : gmVar;
    }

    @Nullable
    private pcc pcc(String str) {
        return this.ork.get(str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public static final pcc pcc = new pcc();
        private final sf gm;
        private final sf oo;
        public String sf;
        private final sf vj;

        public pcc(JSONObject jSONObject) {
            sf sfVar = new sf("applog");
            this.gm = sfVar;
            sf sfVar2 = new sf("stats");
            this.oo = sfVar2;
            sf sfVar3 = new sf("track");
            this.vj = sfVar3;
            try {
                this.sf = jSONObject.getString("name");
                sfVar.pcc(jSONObject.optJSONObject("applog"));
                sfVar2.pcc(jSONObject.optJSONObject("stats"));
                sfVar3.pcc(jSONObject.optJSONObject("track"));
            } catch (JSONException unused) {
            }
        }

        @NonNull
        public sf gm() {
            return this.vj;
        }

        @NonNull
        public sf pcc() {
            return this.gm;
        }

        @NonNull
        public sf sf() {
            return this.oo;
        }

        public String toString() {
            return super.toString();
        }

        public pcc() {
            this.gm = new sf("applog");
            this.oo = new sf("stats");
            this.vj = new sf("track");
        }
    }

    public gm() {
        this.ork = new HashMap<>();
        this.gm = 86400000L;
        this.vj = Ua.C;
    }
}
