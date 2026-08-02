package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.vy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public com.bytedance.sdk.openadsdk.hc.ork atb;
    public boolean bbd;
    public int bg;
    public final AtomicBoolean dax;
    public boolean ei;
    public int erj;
    public com.bytedance.sdk.openadsdk.component.reward.sf.sf ew;
    public boolean fmh;

    @NonNull
    public final nac fum;
    private int fvk;
    public final AtomicBoolean gbb;
    public float gd;
    public boolean gdh;
    public com.bytedance.sdk.openadsdk.utils.gbb gh;
    public final boolean gm;
    public final AtomicBoolean gpj;
    private String gqd;
    public final AtomicBoolean hc;
    public boolean hoh;
    public int hpk;
    public String iv;
    private int jq;
    public final AtomicBoolean jr;
    public final vh jsj;
    public int kj;
    public final Context kun;
    public boolean kz;
    public final AtomicBoolean lo;
    public final gbb lq;
    public final boolean lrr;
    public final AtomicBoolean lu;
    public final oo mk;
    public final com.bytedance.sdk.openadsdk.component.reward.view.vh mu;
    private long mua;
    public final AtomicBoolean nac;
    public final com.bytedance.sdk.openadsdk.component.reward.view.kj nn;
    public final vy of;
    public final boolean oo;
    public final AtomicBoolean ork;
    public boolean otd;
    public final int pcc;
    public final wh pq;
    public boolean ptr;
    public final boolean pv;
    public boolean qc;
    public long qcw;
    public int qf;
    public final tmg qy;
    public com.bytedance.sdk.openadsdk.component.reward.tmg ra;
    public boolean ri;
    public final tsz rj;

    @NonNull
    public final Activity rnn;
    public boolean rt;
    public int se;
    public of sf;
    public final AtomicBoolean tmg;
    public boolean tmh;
    public final com.bytedance.sdk.openadsdk.core.jr.oo.sf tsx;
    public final qf tsz;
    public final vj tz;
    public com.bytedance.sdk.openadsdk.component.reward.top.gm vgx;
    public final AtomicBoolean vh;
    public final String vj;
    private long vo;
    public boolean vr;
    public final AtomicBoolean vy;
    public boolean wax;
    public final int wh;
    public boolean xb;
    public final lu ye;
    public final com.bytedance.sdk.openadsdk.component.reward.view.vy yt;

    @Nullable
    public com.bytedance.sdk.openadsdk.activity.single.kj ywp;
    public int zsj;

    @NonNull
    public final hc zti;

    public sf(@NonNull Activity activity, tsz tszVar, @NonNull of ofVar, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, int i, boolean z, @Nullable sf sfVar2) {
        this.qf = 0;
        this.kj = 0;
        this.vy = new AtomicBoolean(false);
        this.ork = new AtomicBoolean(false);
        this.vh = new AtomicBoolean(false);
        this.tmg = new AtomicBoolean(false);
        this.hc = new AtomicBoolean(false);
        this.gbb = new AtomicBoolean(false);
        this.jr = new AtomicBoolean(false);
        this.dax = new AtomicBoolean(false);
        this.nac = new AtomicBoolean(false);
        this.lu = new AtomicBoolean(false);
        this.gpj = new AtomicBoolean(false);
        this.lo = new AtomicBoolean(false);
        this.ri = false;
        this.zsj = 1;
        this.qcw = 0L;
        this.ywp = null;
        this.rt = true;
        this.wax = false;
        this.bbd = false;
        this.jq = -1;
        this.gqd = "";
        this.fvk = 0;
        this.rnn = activity;
        this.tsx = sfVar;
        Context pcc = com.bytedance.sdk.openadsdk.core.lu.pcc();
        this.kun = pcc;
        this.sf = ofVar;
        this.pcc = i;
        this.qc = sfVar2 != null;
        this.tmh = i == 0 || i == 1;
        this.lrr = i == 0 || i == 2;
        this.rj = tszVar;
        this.pv = z;
        boolean z2 = ofVar.gqd().getDurationSlotType() == 7;
        this.oo = z2;
        String str = z2 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.vj = str;
        this.kz = ofVar.wh();
        int kot = ofVar.kot();
        this.wh = kot;
        this.xb = com.bytedance.sdk.openadsdk.core.lu.oo().lu(String.valueOf(kot));
        this.gm = com.bytedance.sdk.openadsdk.core.settings.vh.sf().jr(String.valueOf(kot));
        this.qy = new tmg(this);
        this.mu = i == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.tmg(this) : ofVar.wh() ? new com.bytedance.sdk.openadsdk.component.reward.view.vh(this) : new com.bytedance.sdk.openadsdk.component.reward.view.ork(this);
        this.nn = new com.bytedance.sdk.openadsdk.component.reward.view.kj(this);
        this.fum = new nac(this);
        this.tz = new vj(ofVar, str, pcc, activity);
        this.of = new vy(this, ofVar);
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = sfVar2 != null ? sfVar2.yt : new com.bytedance.sdk.openadsdk.component.reward.view.vy(this);
        this.yt = vyVar;
        vyVar.pcc(this);
        this.ye = new lu(this);
        this.lq = new gbb(this);
        this.zti = new hc(this);
        this.pq = new wh(this);
        this.jsj = new vh(this);
        qf qfVar = sfVar2 != null ? sfVar2.tsz : new qf(this);
        this.tsz = qfVar;
        qfVar.pcc(this);
        this.mk = new oo(this);
        this.atb = new com.bytedance.sdk.openadsdk.hc.ork(pcc);
        ork();
    }

    private void ork() {
        com.bytedance.sdk.openadsdk.utils.gbb pcc = com.bytedance.sdk.openadsdk.utils.vy.pcc(this.rnn, new vy.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.sf.1
            @Override // com.bytedance.sdk.openadsdk.utils.vy.pcc
            public View pcc() {
                com.bytedance.sdk.openadsdk.component.reward.view.vh vhVar = sf.this.mu;
                if (vhVar != null) {
                    return vhVar.vh();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vy.pcc
            public void sf() {
                hc hcVar = sf.this.zti;
                if (hcVar != null) {
                    hcVar.vj();
                }
            }
        });
        this.gh = pcc;
        pcc.pcc(new com.bytedance.sdk.openadsdk.utils.jr() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.sf.2
            @Override // com.bytedance.sdk.openadsdk.utils.jr
            public void pcc() {
                com.bytedance.sdk.openadsdk.component.oo.sf.pcc("force_button_tracker", "show", sf.this.sf);
            }
        });
    }

    public boolean gm() {
        return this.fvk != 0;
    }

    public com.bytedance.sdk.openadsdk.oo.qf kj() {
        if (!this.sf.wh()) {
            com.bytedance.sdk.openadsdk.oo.qf qfVar = new com.bytedance.sdk.openadsdk.oo.qf();
            qfVar.pcc(System.currentTimeMillis(), 1.0f);
            return qfVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.yt;
        if (vyVar != null && vyVar.pcc() != null) {
            return this.yt.pcc().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.oo.qf qfVar2 = new com.bytedance.sdk.openadsdk.oo.qf();
        qfVar2.pcc(System.currentTimeMillis(), 1.0f);
        return qfVar2;
    }

    public void oo() {
        this.mua = SystemClock.elapsedRealtime();
    }

    public void pcc(boolean z) {
        this.hoh = z;
        this.zti.oo(z);
    }

    public boolean qf() {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        return !this.gdh || (kjVar = this.ywp) == null || !(kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.vj) || ((com.bytedance.sdk.openadsdk.activity.single.vj) kjVar).pcc;
    }

    public int sf() {
        return this.jq;
    }

    public void vj() {
        if (this.mua <= 0) {
            this.mua = SystemClock.elapsedRealtime();
        }
        this.vo = (SystemClock.elapsedRealtime() - this.mua) + this.vo;
    }

    public Map<String, Object> vy() {
        of ofVar;
        HashMap hashMap = new HashMap();
        if (this.yt != null && (ofVar = this.sf) != null && ofVar.ei() == 2) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.yt.vh()));
            JSONObject pcc = this.yt.pcc((JSONObject) null);
            if (pcc != null) {
                Iterator<String> keys = pcc.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        hashMap.put(next, pcc.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return hashMap;
    }

    public long wh() {
        return (SystemClock.elapsedRealtime() - this.mua) + this.vo;
    }

    public void pcc(int i, String str, int i2) {
        this.jq = i;
        this.gqd = str;
        this.fvk = i2;
    }

    public int pcc() {
        return this.fvk;
    }

    public sf(@NonNull Activity activity, tsz tszVar, @NonNull of ofVar, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, int i, boolean z) {
        this(activity, tszVar, ofVar, sfVar, i, z, null);
    }
}
