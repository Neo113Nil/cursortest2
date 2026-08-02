package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.R;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.component.reward.pcc.vj;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.pcc;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh {
    private final com.bytedance.sdk.openadsdk.core.gm.vj gm;
    private final sf pcc;
    private final com.bytedance.sdk.openadsdk.core.gm.sf sf;

    public vh(sf sfVar) {
        this.pcc = sfVar;
        this.gm = pcc(sfVar, sfVar.sf);
        this.sf = new com.bytedance.sdk.openadsdk.core.gm.sf(sfVar.rnn, sfVar.sf, sfVar.vj, sfVar.oo ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.1
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                try {
                    vh.this.pcc(view, f, f2, f3, f4, sparseArray, this.mk, this.jsj, this.tsz);
                } catch (Exception e) {
                    lo.gm("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(vh.this.pcc.sf, 9);
                vh.this.pcc.fum.iv();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject kj() {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        sf sfVar = this.pcc;
        if (!sfVar.gdh || (kjVar = sfVar.ywp) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.oo.gm.pcc(kjVar.vh + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    private JSONObject ork() {
        try {
            long of = this.pcc.fum.of();
            int yt = this.pcc.fum.yt();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, of);
                jSONObject.put("percent", yt);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.qf) {
            pcc("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.wh || view.getId() == com.bytedance.sdk.openadsdk.utils.nac.vy) {
            pcc("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.vj) {
            pcc("click_play_source", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.oo) {
            pcc("click_play_logo", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.gbb || view.getId() == com.bytedance.sdk.openadsdk.utils.nac.gga || view.getId() == com.bytedance.sdk.openadsdk.utils.nac.lu) {
            pcc("click_start_play_bar", ork());
        } else if (view.getId() == 520093705) {
            pcc("click_start_play", ork());
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.nac.hc) {
            pcc("click_video", ork());
        } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.nac.ork) {
            pcc("fallback_endcard_click", ork());
        }
        sf(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    private boolean qf() {
        sf sfVar = this.pcc;
        if (sfVar == null) {
            return true;
        }
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar = sfVar.ywp;
        boolean z = kjVar != null && kjVar.rj().jsj();
        sf sfVar2 = this.pcc;
        boolean z2 = sfVar2.ri;
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar2 = sfVar2.ywp;
        return z && !z2 && (kjVar2 != null && !kjVar2.se());
    }

    private void sf(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3) {
        of ofVar;
        if (!vy() || (ofVar = this.pcc.sf) == null || view == null) {
            return;
        }
        boolean z = com.bytedance.sdk.openadsdk.core.model.lo.hc(ofVar) && (view instanceof TopLayoutDislike2) && this.pcc.zti.pcc.getITopLayout() == view;
        int id = view.getId();
        if (z || id == com.bytedance.sdk.openadsdk.utils.nac.qf || id == com.bytedance.sdk.openadsdk.utils.nac.wh || id == com.bytedance.sdk.openadsdk.utils.nac.vj || id == com.bytedance.sdk.openadsdk.utils.nac.oo || id == com.bytedance.sdk.openadsdk.utils.nac.gbb || id == com.bytedance.sdk.openadsdk.utils.nac.gga || id == com.bytedance.sdk.openadsdk.utils.nac.lu || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.nac.hc || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.nac.vy) {
            int ork = rj.ork(com.bytedance.sdk.openadsdk.core.lu.pcc());
            com.bytedance.sdk.openadsdk.core.model.tmg pcc = new tmg.pcc().wh(f).vj(f2).oo(f3).gm(f4).sf(System.currentTimeMillis()).pcc(0L).pcc(rj.pcc(this.pcc.mu.tmg())).sf(rj.gm(this.pcc.mu.tmg())).oo(i2).vj(i3).wh(i).pcc(sparseArray).sf(com.bytedance.sdk.openadsdk.core.ork.sf().pcc() ? 1 : 2).gm(ork).pcc(rj.kj(com.bytedance.sdk.openadsdk.core.lu.pcc())).sf(rj.vy(com.bytedance.sdk.openadsdk.core.lu.pcc())).pcc();
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.pcc.fum.hc()));
            sf sfVar = this.pcc;
            String str = sfVar.vj;
            if (z) {
                str = "landingpage_endcard";
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click_other", sfVar.sf, pcc, str, true, (Map<String, Object>) hashMap, -1);
        }
    }

    private boolean vy() {
        of ofVar = this.pcc.sf;
        return ofVar != null && ofVar.rc() == 1;
    }

    public com.bytedance.sdk.openadsdk.core.gm.vj gm() {
        com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
        this.gm.sf(this.pcc.rnn.findViewById(R.id.content));
        if (this.pcc.tz.gm() != null) {
            this.gm.pcc(this.pcc.tz.gm());
        }
        this.pcc.of.pcc(this.gm);
        this.gm.pcc(new pcc.InterfaceC0074pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.3
            @Override // com.bytedance.sdk.openadsdk.core.gm.pcc.InterfaceC0074pcc
            public long getVideoProgress() {
                return vh.this.pcc.fum.hc();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.vh vhVar = this.pcc.mu;
        com.bytedance.sdk.openadsdk.core.gm.vj vjVar = this.gm;
        vhVar.pcc(vjVar, vjVar, this.sf);
        this.pcc.pq.pcc(this.gm);
        if (com.bytedance.sdk.openadsdk.core.model.lo.hc(this.pcc.sf) && (gmVar = this.pcc.zti.pcc) != null && gmVar.getITopLayout() != null) {
            rj.pcc(this.pcc.zti.pcc.getITopLayout(), (View.OnClickListener) this.sf, "LandPage#TopLayoutEmptyClick");
        }
        return this.gm;
    }

    public com.bytedance.sdk.openadsdk.core.gm.sf oo() {
        return this.sf;
    }

    public com.bytedance.sdk.openadsdk.core.gm.vj vj() {
        return this.gm;
    }

    public void wh() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.pcc.vy.get()) {
                jSONObject.put("endcard_content", this.pcc.ye.gm() ? 1 : this.pcc.lq.oo() ? 3 : this.pcc.ye.oo() ? 2 : 0);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        sf sfVar = this.pcc;
        com.bytedance.sdk.openadsdk.oo.gm.sf(sfVar.sf, sfVar.vj, "click_close", jSONObject);
    }

    public void gm(boolean z) {
        sf sfVar = this.pcc;
        if (sfVar != null && z && sfVar.sf.qap() && !this.pcc.sf.tsz()) {
            this.pcc.sf.qf(true);
            sf sfVar2 = this.pcc;
            of ofVar = sfVar2.sf;
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, sfVar2.vj, ofVar.uij());
        }
    }

    public void pcc() {
        of ofVar;
        if (qf() || (ofVar = this.pcc.sf) == null || ofVar.iv()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject kj = kj();
        boolean z = false;
        int i = -1;
        try {
            if (this.pcc.gm()) {
                if (kj == null) {
                    kj = new JSONObject();
                }
                int pcc = this.pcc.pcc();
                if (1001 == pcc) {
                    jSONObject.put("dynamic_show_type", pcc + this.pcc.sf());
                } else {
                    jSONObject.put("dynamic_show_type", pcc);
                }
            } else if (this.pcc.sf.wh()) {
                sf sfVar = this.pcc;
                if (sfVar.yt != null && sfVar.sf.ei() == 2) {
                    jSONObject.put("dynamic_show_type", this.pcc.yt.vh());
                    this.pcc.yt.pcc(jSONObject);
                    i = this.pcc.yt.vh();
                    z = true;
                }
            }
        } catch (JSONException unused) {
        }
        pcc(jSONObject, kj, z, i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i, boolean z2) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        int i2;
        sf sfVar = this.pcc;
        of ofVar = sfVar.sf;
        if (sfVar.vr && (i2 = sfVar.bg) == 5) {
            ofVar.hc(i2);
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, this.pcc.vj, jSONObject, jSONObject2);
        this.pcc.tsx.ork();
        if (!z) {
            i = -1;
        }
        vj.pcc pccVar = new vj.pcc(i);
        pcc(pccVar);
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.pcc.rnn.findViewById(R.id.content), ofVar, pccVar);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(ofVar);
        if (!z2 || (gto = ofVar.gto()) == null) {
            return;
        }
        gto.pcc().pcc(0L);
    }

    public void pcc(final Map<String, Object> map) {
        if (qf()) {
            return;
        }
        of ofVar = this.pcc.sf;
        if (ofVar == null || !ofVar.iv()) {
            final View findViewById = this.pcc.rnn.findViewById(R.id.content);
            if (findViewById == null) {
                findViewById = this.pcc.rnn.getWindow().getDecorView();
            }
            int width = findViewById.getWidth();
            int height = findViewById.getHeight();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    int i;
                    Map map2;
                    sf unused = vh.this.pcc;
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", findViewById.getWidth());
                        jSONObject2.put("height", findViewById.getHeight());
                        jSONObject2.put("alpha", findViewById.getAlpha());
                        jSONObject.put("root_view", jSONObject2.toString());
                    } catch (Throwable th) {
                        lo.pcc("TTAD.RFReportManager", "run: ", th);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (vh.this.pcc.yt == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                        z = false;
                        i = -1;
                    } else {
                        i = vh.this.pcc.yt.vh();
                        z = true;
                    }
                    int i2 = i;
                    boolean z2 = z;
                    vh vhVar = vh.this;
                    vhVar.pcc(jSONObject3, vhVar.kj(), z2, i2, false);
                }
            };
            Thread.currentThread().getName();
            if (width > 0 && height > 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                    return;
                } else {
                    findViewById.post(runnable);
                    return;
                }
            }
            findViewById.post(runnable);
        }
    }

    private void pcc(vj.pcc pccVar) {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        sf sfVar = this.pcc;
        if (!sfVar.gdh || (kjVar = sfVar.ywp) == null) {
            return;
        }
        pccVar.sf = kjVar.vh;
    }

    public void pcc(boolean z) {
        of ofVar = this.pcc.sf;
        if (ofVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dax.pcc.oo vj = com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(z ? 7 : 8).gm(String.valueOf(ofVar.kot())).vj(this.pcc.sf.qxv());
        vj.sf(this.pcc.ye.lu()).wh(this.pcc.ye.gpj());
        vj.qf(this.pcc.sf.hl()).oo(this.pcc.sf.esn());
        com.bytedance.sdk.openadsdk.dax.oo.pcc().sf(vj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, JSONObject jSONObject) {
        sf sfVar = this.pcc;
        of ofVar = sfVar.sf;
        String str2 = sfVar.vj;
        if (!sfVar.oo) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.gm.vj pcc(final sf sfVar, final of ofVar) {
        return new com.bytedance.sdk.openadsdk.core.gm.vj(sfVar.rnn, ofVar, sfVar.vj, sfVar.oo ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.4
            @Override // com.bytedance.sdk.openadsdk.core.gm.vj
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3, boolean z) {
                if (ofVar.on() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        pcc((String) tag);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(sfVar.fum.hc()));
                if (sfVar.vy.get()) {
                    hashMap.put("click_scence", 2);
                } else {
                    hashMap.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.single.kj kjVar = sfVar.ywp;
                if (kjVar != null) {
                    kjVar.pcc(hashMap, f, f2);
                }
                pcc(hashMap);
                sfVar.tsx.pq();
                sfVar.tz.pcc(view, f, f2, f3, f4, sparseArray, i, i2, i3, new vj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.vh.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.vj.pcc
                    public void pcc(View view2, float f5, float f6, float f7, float f8, SparseArray<gm.pcc> sparseArray2, int i4, int i5, int i6) {
                        vh.this.pcc(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.vj.pcc
                    public void pcc(String str, JSONObject jSONObject) {
                        vh.this.pcc(str, jSONObject);
                    }
                });
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(ofVar, 9);
                sfVar.fum.iv();
            }
        };
    }

    public void sf() {
        if (qf()) {
            return;
        }
        of ofVar = this.pcc.sf;
        if (ofVar == null || !ofVar.iv()) {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            int i = -1;
            try {
                if (this.pcc.sf.wh()) {
                    sf sfVar = this.pcc;
                    if (sfVar.yt != null && sfVar.sf.ei() == 2) {
                        jSONObject.put("dynamic_show_type", this.pcc.yt.vh());
                        this.pcc.yt.pcc(jSONObject);
                        i = this.pcc.yt.vh();
                        z = true;
                    }
                }
                View findViewById = this.pcc.rnn.findViewById(R.id.content);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", findViewById.getWidth());
                jSONObject2.put("height", findViewById.getHeight());
                jSONObject2.put("alpha", findViewById.getAlpha());
                jSONObject.put("root_view", jSONObject2.toString());
            } catch (Throwable th) {
                lo.pcc("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th);
            }
            pcc(jSONObject, kj(), z, i, false);
        }
    }

    public void sf(boolean z) {
        of ofVar;
        sf sfVar = this.pcc;
        if (sfVar == null) {
            return;
        }
        if (!z && sfVar.qcw > 0 && (ofVar = sfVar.sf) != null && ofVar.iv()) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.pcc.qcw);
            sf sfVar2 = this.pcc;
            com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, sfVar2.sf, sfVar2.vj, sfVar2.fum.vj());
            this.pcc.qcw = 0L;
        } else {
            this.pcc.qcw = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.pcc.sf, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(this.pcc.sf, z ? 4 : 8);
    }
}
