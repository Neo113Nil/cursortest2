package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.component.reward.pcc.nac;
import com.bytedance.sdk.openadsdk.component.reward.pcc.vh;
import com.bytedance.sdk.openadsdk.component.reward.pcc.wh;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.dax;
import com.bytedance.sdk.openadsdk.utils.rj;
import defpackage.fem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc extends kj implements tsz.pcc, wh.pcc {
    private boolean atb;
    private Bundle fum;
    protected int gm;
    private long jsj;
    private int lo;
    private CountDownTimer mk;
    private boolean of;
    protected boolean oo;
    protected final tsz pcc;
    private long qy;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.sf.sf sf;
    private boolean tsz;
    private int tz;
    protected boolean vj;
    private boolean yt;

    public pcc(sf sfVar, of ofVar, int i, int i2, boolean z) {
        super(sfVar, ofVar, i, i2, z);
        this.pcc = new tsz(Looper.getMainLooper(), this);
        this.lo = 1;
        this.tz = 0;
        this.of = false;
        this.oo = false;
        ew();
    }

    private void ei() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        if (this.wh.wh() || (sfVar = this.sf) == null) {
            return;
        }
        sfVar.pcc(this.vy.mu.wh());
        this.sf.of();
    }

    private void ew() {
        boolean z = atb.gm(this.wh) && this.wh.aj();
        this.tsz = z;
        if (z) {
            this.jsj = this.wh.jk() * 1000;
        }
    }

    private boolean gdh() {
        if (this.wh.wh()) {
            return this.vy.vy.get();
        }
        return true;
    }

    private void gh() {
        this.sf.yt();
        this.gm = (int) this.vy.fum.tsx();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar.gdh) {
            pcc(sfVar.jsj.vj());
            pcc(this.vy.jsj.oo());
        }
        a_();
        ei();
    }

    private void otd() {
        if (this.wh.wh() && !this.of) {
            this.of = true;
            pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.pcc.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] pcc;
                    boolean jsj = pcc.this.qf.jsj();
                    pcc pccVar = pcc.this;
                    if (jsj) {
                        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = pccVar.vy;
                        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = pcc.this.vy;
                        pcc = new float[]{rj.gm(sfVar.rnn, sfVar.nn.getWidth()), rj.gm(sfVar2.rnn, sfVar2.nn.getHeight())};
                    } else {
                        pcc = pccVar.vy.qy.pcc(pccVar.lo);
                    }
                    boolean pcc2 = pcc.this.vy.tsz.pcc();
                    pcc pccVar2 = pcc.this;
                    if (pcc2) {
                        pccVar2.vy.tsz.pcc(pccVar2.wh);
                    } else {
                        pccVar2.vy.tsz.pcc(pcc);
                    }
                }
            });
        }
    }

    private void pcc(Activity activity, of ofVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.component.reward.pcc.sf(activity, this.pcc, ofVar, this, 1, this.qf.sf(), this.vy);
        this.vy = sfVar;
        sfVar.gdh = this.qf.wh();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.vy;
        sfVar2.otd = this.hc;
        sfVar2.bbd = sfVar2.gdh && lo.wh(ofVar);
        this.vy.ei = this.qf.oo();
        this.vy.vgx = this.qf.yt();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.vy;
        sfVar3.ywp = this;
        sfVar3.atb = this.qf.tz();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(this.vy, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(intent, this.vy);
            ofVar.pcc(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.vy.hoh) {
            sf();
        }
        com.bytedance.sdk.openadsdk.component.reward.sf.sf pcc = com.bytedance.sdk.openadsdk.component.reward.sf.wh.pcc(this.vy);
        this.sf = pcc;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar4 = this.vy;
        sfVar4.ew = pcc;
        sfVar4.pq.pcc(this);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar5 = this.vy;
        if (sfVar5.gdh) {
            sfVar5.fum.pcc(new pcc.InterfaceC0088pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.pcc.1
                @Override // com.bytedance.sdk.openadsdk.core.jr.oo.pcc.InterfaceC0088pcc
                public void pcc(int i) {
                    pcc pccVar = pcc.this;
                    sf sfVar6 = pccVar.qf;
                    if (sfVar6 == null) {
                        return;
                    }
                    sfVar6.sf(pccVar, i);
                }
            });
            if (!this.qf.jsj()) {
                this.qf.yt().setShowSound(of.vj(ofVar));
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar6 = this.vy;
        dax.pcc(ofVar, sfVar6.kun, sfVar6.vj, sfVar6.tsx);
        Objects.toString(this.sf);
    }

    private void tmh() {
        this.vy.nn.pcc(this.sf);
        this.sf.pcc(this, this.pcc);
        this.sf.ork();
    }

    public void atb() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar != null && sfVar.fum.vy()) {
            this.vy.fum.fum();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final View dax() {
        return this.vy.fum.rj();
    }

    public void fum() {
        if (this.yt) {
            return;
        }
        this.yt = true;
        erj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gbb() {
        super.gbb();
        if (this.tsz) {
            this.qy = System.currentTimeMillis();
            CountDownTimer countDownTimer = this.mk;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.nac();
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.vy.yt;
        if (vyVar != null) {
            vyVar.kj();
        }
        if (this.qf.jsj()) {
            this.vy.yt.pcc(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gm() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        super.gm();
        if (this.vy == null || (sfVar = this.sf) == null) {
            return;
        }
        sfVar.jr();
        this.vy.ri = true;
        if (gdh()) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.vy;
            sfVar2.zti.pcc(sfVar2.sf.dk());
        }
        this.vy.mu.dax();
        this.vy.ye.nac();
        this.vy.of.vj();
        if (this.sf.sf()) {
            this.vy.fum.pcc(this.sf);
            boolean hpk = this.vy.fum.hpk();
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.vy;
            if (hpk) {
                pcc(sfVar3.fum.jr(), true);
            } else if (sfVar3.fum.qf() && this.qf.jsj()) {
                nn();
            } else {
                this.vy.fum.pcc(false, this, this.tz != 0);
            }
        }
        this.tz++;
        otd();
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.vy.yt;
        if (vyVar != null) {
            vyVar.qf();
        }
        this.vy.qy.pcc(this.pcc);
        if (this.qf.jsj()) {
            this.vy.yt.pcc(0, false);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.tsz) {
            long j = this.qy;
            if (j != 0 && currentTimeMillis - j > this.jsj) {
                rj().pcc(this, pcc(8));
                return;
            }
            if (j != 0) {
                this.jsj -= currentTimeMillis - j;
            }
            pcc(this.jsj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gpj() {
        super.gpj();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.sf(this.lu);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final void hc() {
        super.hc();
        if (this.vy == null || com.bytedance.sdk.component.utils.sf.pcc(lrr())) {
            return;
        }
        this.vy.ye.qy();
        com.bytedance.sdk.openadsdk.utils.oo.pcc(lrr(), this.vy.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void jr() {
        this.vy.fum.kun();
    }

    public void jsj() {
        otd();
    }

    public Map<String, Object> kj() {
        of ofVar;
        HashMap hashMap = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar != null && sfVar.yt != null && (ofVar = this.wh) != null && ofVar.ei() == 2) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.vy.yt.vh()));
            JSONObject pcc = this.vy.yt.pcc((JSONObject) null);
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void lo() {
        super.lo();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.lo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean lq() {
        return this.wh.rt() == 10 && !qy();
    }

    public final void lu() {
        this.pcc.removeMessages(400);
    }

    public void mk() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar == null) {
            return;
        }
        sfVar.fum.dax();
    }

    public void of() {
        this.qf.pcc(this, pcc(sf.C0122sf.sf));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void oo() {
        super.oo();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.lu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ork() {
        super.ork();
        if (this.wh.wh()) {
            this.vy.yt.hc();
        }
    }

    public abstract FrameLayout qf();

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean qy() {
        return this.vy.yt.vy();
    }

    public abstract void sf();

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void tmg() {
        sf sfVar = this.qf;
        if (sfVar == null) {
            return;
        }
        sfVar.sf(this, pcc(10));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void tsz() {
        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc;
        super.tsz();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar == null || (pcc = sfVar.yt.pcc()) == null || !pcc.qy()) {
            return;
        }
        kz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean tz() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        return sfVar != null && sfVar.fum.pq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void vh() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.vh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vj() {
        sf sfVar = this.qf;
        if (sfVar != null) {
            sfVar.pcc(this);
        }
    }

    public com.bytedance.sdk.openadsdk.oo.qf vy() {
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar;
        if (!this.wh.wh()) {
            com.bytedance.sdk.openadsdk.oo.qf qfVar = new com.bytedance.sdk.openadsdk.oo.qf();
            qfVar.pcc(System.currentTimeMillis(), 1.0f);
            return qfVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar != null && (vyVar = sfVar.yt) != null && vyVar.pcc() != null) {
            return this.vy.yt.pcc().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.oo.qf qfVar2 = new com.bytedance.sdk.openadsdk.oo.qf();
        qfVar2.pcc(System.currentTimeMillis(), 1.0f);
        return qfVar2;
    }

    public final void wh() {
        Message message = new Message();
        message.what = 400;
        if (this.wh.tuy()) {
            sf(10000);
        }
        this.pcc.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ye() {
        this.oo = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean zti() {
        return this.vy.yt.ork() && !qy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void oo(boolean z) {
        sf sfVar = this.qf;
        if (sfVar != null) {
            sfVar.pcc(this, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final void pcc(Activity activity, Bundle bundle) {
        this.fum = bundle;
        super.pcc(activity, bundle);
        pcc(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final com.bytedance.sdk.openadsdk.component.reward.view.kj pcc() {
        return this.vy.nn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Activity activity, sf.vj vjVar) {
        try {
            this.lo = this.wh.ial();
            pcc(activity, this.wh, this.fum);
            if (this.vy.gdh && this.wh.aj()) {
                this.vy.xb = vjVar.oo;
            }
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
            if (sfVar.gdh && this.ork > 0) {
                sfVar.xb = vjVar.oo;
            }
            tmh();
            gh();
            if (lo.wh(this.wh)) {
                bg();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.dax.oo.sf();
            iv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(boolean z) {
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.gm.sf sfVar) {
        if (sfVar != null) {
            HashMap hashMap = new HashMap();
            try {
                int i = this.vh + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                hashMap.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            sfVar.pcc(hashMap);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Activity activity) {
        super.pcc(activity);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar == null) {
            return;
        }
        sfVar.qy.pcc();
    }

    private void pcc(long j) {
        this.mk = new CountDownTimer(j, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.single.pcc.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                sf rj = pcc.this.rj();
                pcc pccVar = pcc.this;
                rj.pcc(pccVar, pccVar.pcc(8));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                pcc.this.jsj = j2;
            }
        }.start();
    }

    public final void pcc(boolean z, int i) {
        pcc(z, false, i);
    }

    public final void pcc(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        sfVar.pq.pcc(z, z2, false, sfVar.ew, i);
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(String str, JSONObject jSONObject) {
        sf sfVar;
        if (str == null || !"skipToNextAd".equals(str) || (sfVar = this.qf) == null) {
            return;
        }
        sfVar.sf(this, pcc(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public boolean pcc(long j, boolean z) {
        lo loVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar == null) {
            return false;
        }
        sfVar.yt.sf(false);
        this.vj = false;
        com.bytedance.sdk.openadsdk.oo.qf vy = vy();
        if (qf() == null) {
            return false;
        }
        this.vy.fum.pcc(qf(), vy);
        Map<String, Object> kj = this.wh.wh() ? kj() : null;
        fem femVar = new fem() { // from class: com.bytedance.sdk.openadsdk.activity.single.pcc.4
            @Override // defpackage.fem
            public void pcc(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar;
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = pcc.this.vy;
                if (!sfVar2.ri && sfVar2.fum.wh()) {
                    pcc.this.vy.fum.sf(true);
                }
                if (pcc.this.vy.vy.get()) {
                    return;
                }
                if (j2 != pcc.this.vy.fum.gbb()) {
                    pcc.this.lu();
                }
                boolean wh = pcc.this.vy.fum.wh();
                pcc pccVar = pcc.this;
                if (!wh) {
                    pccVar.pcc.removeMessages(300);
                    return;
                }
                pccVar.vy.fum.pcc(j2, j3);
                int i = (int) (j2 / 1000);
                if ((pcc.this.vy.nac.get() || pcc.this.vy.ork.get()) && pcc.this.vy.fum.wh()) {
                    pcc.this.vy.fum.tz();
                }
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = pcc.this.vy;
                if (sfVar3.oo) {
                    sfVar3.mu.vj(i);
                }
                if (pcc.this.wh.wh() && (vyVar = pcc.this.vy.yt) != null && vyVar.pcc() != null) {
                    pcc.this.vy.yt.pcc().setTime(String.valueOf(pcc.this.gm), i, 0, false);
                    pcc.this.vy.yt.pcc().pcc(j2, j3);
                }
                pcc.this.pcc((j2 * 1.0f) / j3);
                pcc.this.vy.pcc(true);
            }

            @Override // defpackage.fem
            public void sf(long j2, int i) {
                pcc.this.vy.fum.vh();
                lo loVar2 = pcc.this.vy.mu.dax;
                if (loVar2 != null) {
                    loVar2.ork();
                }
                boolean wh = pcc.this.vy.fum.wh();
                pcc pccVar = pcc.this;
                if (wh) {
                    pccVar.wh();
                    return;
                }
                pccVar.vy.fum.lo();
                if (pcc.this.wh.wh()) {
                    pcc.this.vy.yt.pcc(true);
                }
                pcc pccVar2 = pcc.this;
                pccVar2.qf.pcc(pccVar2, pccVar2.pcc(3));
            }

            @Override // defpackage.fem
            public void pcc() {
                pcc.this.vy.fum.vh();
                pcc.this.lu();
                pcc pccVar = pcc.this;
                pccVar.qf.pcc(pccVar, pccVar.pcc(6));
            }

            @Override // defpackage.fem
            public void pcc(long j2, int i) {
                pcc pccVar = pcc.this;
                if (pccVar.vj) {
                    return;
                }
                pccVar.vj = true;
                boolean wh = pccVar.wh.wh();
                pcc.this.pcc.removeMessages(300);
                pcc.this.lu();
                pcc.this.vy.fum.pcc(j2, j2);
                pcc pccVar2 = pcc.this;
                if (wh) {
                    pccVar2.vy.yt.sf(true);
                } else {
                    pccVar2.vy.dax.set(true);
                }
                if (pcc.this.vy.sf.bg() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = pcc.this.vy;
                    if (sfVar2.gm) {
                        sfVar2.tz.gm().pcc(pcc.this.vy.sf);
                        dax.sf();
                    }
                }
                if (!wh && pcc.this.vy.sf.giw()) {
                    pcc.this.vy.sf.zsj(1);
                    pcc.this.vy.mu.lu();
                }
                if (pcc.this.vy.sf.bg() == 21 && !pcc.this.vy.sf.gpj()) {
                    pcc.this.vy.sf.vj(true);
                    pcc.this.vy.mu.lu();
                }
                sf.vj pcc = pcc.this.pcc(5);
                pcc.vj = true;
                pcc pccVar3 = pcc.this;
                pccVar3.qf.pcc(pccVar3, pcc);
            }
        };
        this.vy.fum.pcc(femVar);
        if (!this.wh.wh() && (loVar = this.vy.mu.dax) != null) {
            loVar.pcc(femVar);
        }
        return this.vy.fum.pcc(j, z, kj, this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gm(boolean z) {
        vh vhVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vy;
        if (sfVar == null || (vhVar = sfVar.jsj) == null) {
            return;
        }
        vhVar.sf(z);
        this.vy.jsj.gm(z);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.wh.pcc
    public void pcc(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar, int i) {
        pcc(z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(kj kjVar, kj kjVar2, sf.vj vjVar) {
        super.pcc(kjVar, kjVar2, vjVar);
        if (kjVar == this && (kjVar2 instanceof vj)) {
            int i = vjVar.sf;
            if (i == 3) {
                nac nacVar = this.vy.fum;
                nacVar.pcc(!nacVar.rnn() ? 1 : 0, 2);
            } else if (i == 6) {
                nac nacVar2 = this.vy.fum;
                nacVar2.pcc(!nacVar2.rnn() ? 1 : 0, !this.vy.fum.rnn() ? 1 : 0);
            } else if (i == 5 && !of.vj(this.vy.sf) && vjVar.vj) {
                this.vy.fum.pcc("skip", true);
            }
            this.vy.zti.pcc(false);
            this.vy.zti.oo(false);
        }
    }

    public void pcc(float f) {
        sf sfVar = this.qf;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(f);
        if (this.yt || this.wh.bg() == 43 || f < this.wh.ri() / 100.0f) {
            return;
        }
        kj qy = this.qf.qy();
        if (qy instanceof pcc) {
            ((pcc) qy).fum();
        }
    }

    public sf.vj pcc(int i) {
        sf.vj vjVar = new sf.vj(i, this.vy);
        vjVar.oo = this.vy.xb;
        return vjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Map<String, Object> map, float f, float f2) {
        super.pcc(map, f, f2);
        this.qf.pcc(map, this, f, f2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(of ofVar, int i, int i2) {
        super.pcc(ofVar, i, i2);
        ew();
        this.of = false;
        this.atb = true;
    }
}
