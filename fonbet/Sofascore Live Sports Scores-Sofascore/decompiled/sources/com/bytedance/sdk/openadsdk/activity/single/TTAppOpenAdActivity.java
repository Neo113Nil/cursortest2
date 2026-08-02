package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.hc;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.jr;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.tsx;
import com.bytedance.sdk.openadsdk.utils.vy;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements tsz.pcc, pcc.InterfaceC0088pcc {
    private static com.bytedance.sdk.openadsdk.pcc.oo.sf vy;
    private AdSlot atb;
    private com.bytedance.sdk.openadsdk.oo.qf dax;
    private of fum;
    private boolean gpj;
    private TTAdDislikeToast hc;
    private FrameLayout jsj;
    protected boolean kj;
    private int lo;
    private long lq;
    private float lu;
    private com.bytedance.sdk.openadsdk.component.gm mk;
    private float nac;
    private boolean nn;
    private int qy;
    private gbb rnn;
    private nac tmg;
    private boolean tsz;
    private com.bytedance.sdk.openadsdk.pcc.oo.sf tz;
    private com.bytedance.sdk.openadsdk.component.wh.sf vh;
    private int yt;
    private ImageView zti;
    protected final AtomicBoolean pcc = new AtomicBoolean(false);
    protected final tsz sf = new tsz(Looper.getMainLooper(), this);
    final AtomicBoolean gm = new AtomicBoolean(false);
    final AtomicBoolean oo = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.kj.pcc ork = new com.bytedance.sdk.openadsdk.component.kj.pcc();
    protected boolean vj = false;
    private final AtomicBoolean gbb = new AtomicBoolean(false);
    private tsx jr = tsx.gm();
    private final AtomicBoolean of = new AtomicBoolean(false);
    long wh = 0;
    private volatile boolean ye = false;
    int qf = -1;
    private final com.bytedance.sdk.openadsdk.component.pcc tsx = new com.bytedance.sdk.openadsdk.component.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.pcc
        public void gm() {
            TTAppOpenAdActivity.this.wh();
            TTAppOpenAdActivity.this.jr.vj();
            TTAppOpenAdActivity.this.lo();
            if (TTAppOpenAdActivity.this.gpj) {
                TTAppOpenAdActivity.this.tmg();
            }
            if (TTAppOpenAdActivity.this.mk.qf() == null || TTAppOpenAdActivity.this.mk.qf().sf() == null) {
                return;
            }
            TTAppOpenAdActivity.this.mk.qf().sf().pcc(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc
        public void oo() {
            ork.pcc(TTAppOpenAdActivity.this.fum, "show_ad_fail", "open_ad", "render_failed");
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc, com.bytedance.sdk.openadsdk.component.wh.pcc
        public void pcc(int i, boolean z) {
            if (TTAppOpenAdActivity.this.mk != null) {
                TTAppOpenAdActivity.this.mk.pcc(i, z);
            }
            if (TTAppOpenAdActivity.this.gpj || !(TTAppOpenAdActivity.this.mk instanceof com.bytedance.sdk.openadsdk.component.sf) || TTAppOpenAdActivity.this.vh == null || TTAppOpenAdActivity.this.vh.pcc() <= 0) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.component.sf) TTAppOpenAdActivity.this.mk).pcc(TTAppOpenAdActivity.this.ork.gm(), (long) (TTAppOpenAdActivity.this.ork.sf() * 1000.0f));
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc, defpackage.fem
        public void sf(long j, int i) {
            com.bytedance.sdk.openadsdk.component.kj.gm qf;
            StringBuilder sb = new StringBuilder("onError() called with: totalPlayTime = [");
            sb.append(j);
            sb.append("], percent = [");
            sb.append(i);
            sb.append(U3.j.e);
            if (TTAppOpenAdActivity.this.mk != null && (qf = TTAppOpenAdActivity.this.mk.qf()) != null) {
                TTAppOpenAdActivity.this.mk();
                qf.pcc(true);
            }
            TTAppOpenAdActivity.this.yt();
            ork.pcc(TTAppOpenAdActivity.this.fum, "show_ad_fail", "open_ad", "play_video_error");
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc
        public void vj() {
            TTAppOpenAdActivity.this.of();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc, com.bytedance.sdk.openadsdk.component.wh.pcc
        public void sf(View view) {
            TTAppOpenAdActivity.this.pcc();
            com.bytedance.sdk.openadsdk.component.oo.pcc.pcc(TTAppOpenAdActivity.this.fum, TTAppOpenAdActivity.this.gpj());
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc, com.bytedance.sdk.openadsdk.component.wh.pcc
        public void sf() {
            TTAppOpenAdActivity.this.ye = true;
            if (com.bytedance.sdk.openadsdk.yt.vj.pcc("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.qf();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc, defpackage.fem
        public void pcc(long j, long j2) {
            TTAppOpenAdActivity.this.ork.gm(j);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.vj && tTAppOpenAdActivity.mk != null && TTAppOpenAdActivity.this.mk.qf() != null && TTAppOpenAdActivity.this.mk.qf().vj()) {
                TTAppOpenAdActivity.this.mk.qf().kj();
            }
            TTAppOpenAdActivity.this.hc();
            if (TTAppOpenAdActivity.this.mk instanceof com.bytedance.sdk.openadsdk.component.sf) {
                ((com.bytedance.sdk.openadsdk.component.sf) TTAppOpenAdActivity.this.mk).pcc(j, j2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc, com.bytedance.sdk.openadsdk.component.wh.pcc
        public void pcc(View view) {
            TTAppOpenAdActivity.this.qy();
        }

        @Override // com.bytedance.sdk.openadsdk.component.pcc, defpackage.fem
        public void pcc() {
            TTAppOpenAdActivity.this.mk();
            TTAppOpenAdActivity.this.yt();
            ork.pcc(TTAppOpenAdActivity.this.fum, "show_ad_fail", "open_ad", "play_video_time_out");
            TTAppOpenAdActivity.this.finish();
        }
    };
    private final Runnable kun = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.model.oo gto;
            com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
            boolean z = TTAppOpenAdActivity.this.gbb.get();
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (z) {
                ork.pcc(tTAppOpenAdActivity.fum, "show_ad_fail", "open_ad", "repeat_play");
                return;
            }
            if (tTAppOpenAdActivity.fum != null && (gto = TTAppOpenAdActivity.this.fum.gto()) != null && (pcc = gto.pcc()) != null) {
                pcc.pcc(0L);
            }
            TTAppOpenAdActivity.this.dax = new com.bytedance.sdk.openadsdk.oo.qf();
            TTAppOpenAdActivity.this.dax.pcc(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.jr.vj();
            if (TTAppOpenAdActivity.this.vh != null) {
                TTAppOpenAdActivity.this.vh.sf();
            }
            if (TTAppOpenAdActivity.this.mk != null) {
                TTAppOpenAdActivity.this.mk.vj();
            }
            TTAppOpenAdActivity.this.tz();
            View findViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (findViewById != null) {
                try {
                    jSONObject.put("width", findViewById.getWidth());
                    jSONObject.put("height", findViewById.getHeight());
                    jSONObject.put("alpha", findViewById.getAlpha());
                } catch (JSONException unused) {
                    ork.pcc(TTAppOpenAdActivity.this.fum, "show_ad_fail", "open_ad", "show_report_failed");
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.yt);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.gpj ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.vy.kj.gm() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.tsz || TTAppOpenAdActivity.this.fum.uxz()) {
                if (TTAppOpenAdActivity.this.fum() || com.bytedance.sdk.openadsdk.component.qf.pcc.vh()) {
                    jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.gpj());
                } else {
                    jSONObject2.put("dynamic_show_type", 1);
                }
                TTAppOpenAdActivity.this.pcc(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.fum.ye() ? 1 : 0);
            JSONObject jSONObject3 = new JSONObject();
            if (TTAppOpenAdActivity.this.yt == 1) {
                jSONObject3.putOpt("cache_duration", Long.valueOf(System.currentTimeMillis() - TTAppOpenAdActivity.this.lq));
            }
            if (TTAppOpenAdActivity.this.fum != null) {
                int ork = TTAppOpenAdActivity.this.fum.ork();
                jSONObject3.putOpt("start_type", Integer.valueOf(ork == 1 ? 1 : 2));
                jSONObject3.putOpt("load_index", Integer.valueOf(ork));
            }
            jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.qf.pcc.oo()));
            jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.qf.pcc.sf()));
            com.bytedance.sdk.openadsdk.oo.gm.pcc(TTAppOpenAdActivity.this.fum, "open_ad", jSONObject2, jSONObject3);
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.fum, new vj.pcc(TTAppOpenAdActivity.this.gpj()));
            com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(TTAppOpenAdActivity.this.fum);
            TTAppOpenAdActivity.this.gbb.set(true);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void dax() {
        this.hc.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fum() {
        if (!this.fum.zti()) {
            return false;
        }
        int rt = this.fum.rt();
        return ((rt == 0 || rt == 9) && (com.bytedance.sdk.component.adexpress.pcc.sf.gm.pcc(hc.gm(), "3.1.78") || com.bytedance.sdk.component.adexpress.pcc.sf.gm.pcc(hc.oo(), "3.1.78"))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int gpj() {
        if (this.fum.uxz()) {
            return 5;
        }
        if (this.tsz) {
            return this.mk.oo();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hc() {
        if (!this.gpj || this.fum.ye()) {
            return;
        }
        this.sf.removeMessages(100);
    }

    private void jr() {
        this.hc.show(TTAdDislikeToast.getDislikeTip());
    }

    private void jsj() {
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("aoa_force_show_close_enable", false)) {
            com.bytedance.sdk.openadsdk.core.widget.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.wh(this, 33, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.zti = whVar;
            whVar.setImageDrawable(tz.gm(this, "tt_ad_close_backup"));
            this.zti.setContentDescription(tz.pcc(this, "tt_close_backup_button_text"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            layoutParams.topMargin = rj.sf(this, 27.0f);
            layoutParams.rightMargin = rj.sf(this, 9.0f);
            this.zti.setVisibility(8);
            this.jsj.addView(this.zti, layoutParams);
            this.zti.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTAppOpenAdActivity.this.qy();
                }
            });
            gbb pcc = com.bytedance.sdk.openadsdk.utils.vy.pcc(this, new vy.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.8
                @Override // com.bytedance.sdk.openadsdk.utils.vy.pcc
                public View pcc() {
                    return TTAppOpenAdActivity.this.zti;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.vy.pcc
                public void sf() {
                }
            });
            this.rnn = pcc;
            pcc.pcc(com.bytedance.sdk.openadsdk.yt.vj.pcc("aoa_force_close_delay_time", 5000));
            this.rnn.pcc(new jr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.9
                @Override // com.bytedance.sdk.openadsdk.utils.jr
                public void pcc() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (TTAppOpenAdActivity.this.fum != null) {
                            jSONObject.putOpt("render_sequence", Integer.valueOf(TTAppOpenAdActivity.this.fum.rt()));
                        }
                        if (TTAppOpenAdActivity.this.mk != null) {
                            jSONObject.putOpt("dynamic_show_type", Integer.valueOf(TTAppOpenAdActivity.this.mk.oo()));
                        }
                    } catch (JSONException e) {
                        lo.gm("TTAppOpenAdActivity", e.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.component.oo.sf.pcc("aoa_backup_close_show", TTAppOpenAdActivity.this.fum, jSONObject);
                }
            });
            this.rnn.pcc((long) (Math.min(tsz(), this.ork.sf()) * 1000.0f));
        }
    }

    private void kj() {
        if (26 != Build.VERSION.SDK_INT) {
            this.qy = this.fum.ial();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.qy = 1;
        } else {
            this.qy = 2;
        }
        vy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lo() {
        if (this.gbb.get()) {
            ork.pcc(this.fum, "show_ad_fail", "open_ad", "repeat_play");
            return;
        }
        try {
            getWindow().getDecorView().post(this.kun);
        } catch (Throwable unused) {
            ork.pcc(this.fum, "show_ad_fail", "open_ad", "show_report_failed");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mk() {
        of ofVar;
        try {
            if (this.vh == null || (ofVar = this.fum) == null || ofVar.uk() == null) {
                return;
            }
            int sf = this.fum.uk().sf();
            if (sf == 1 || sf == 2) {
                this.vh.pcc(sf, this.fum.uk().pcc(), false);
                com.bytedance.sdk.openadsdk.component.gm gmVar = this.mk;
                if (gmVar == null || gmVar.qf() == null) {
                    return;
                }
                this.mk.qf().sf().pcc(this.ork.pcc());
                this.mk.qf().sf().pcc(1.0f);
            }
        } catch (Throwable th) {
            lo.gm("TTAppOpenAdActivity", th.getMessage());
        }
    }

    private void nac() {
        if (lu.oo().tz(String.valueOf(this.lo)) == 1) {
            if (this.ork.gm() >= lu.oo().of(String.valueOf(this.lo)) * 1000) {
                qy();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void of() {
        com.bytedance.sdk.openadsdk.component.kj.gm qf;
        com.bytedance.sdk.openadsdk.pcc.oo.sf sfVar = this.tz;
        if (sfVar != null) {
            sfVar.onAdClicked();
        }
        if (vh.sf().qy(String.valueOf(this.lo))) {
            this.of.set(true);
        }
        com.bytedance.sdk.openadsdk.component.gm gmVar = this.mk;
        if (gmVar == null || (qf = gmVar.qf()) == null) {
            return;
        }
        qf.dax();
    }

    private void ork() {
        if (this.qy != 2) {
            setRequestedOrientation(1);
        } else if (vj()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.qy == 2 || !rj.gm((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qf() {
        lo.pcc("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.pcc.oo.sf sfVar = this.tz;
        if (sfVar != null) {
            sfVar.gm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qy() {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        com.bytedance.sdk.openadsdk.component.gm gmVar;
        mk.gm(this.lo);
        yt();
        if (this.gpj && (gmVar = this.mk) != null && gmVar.qf() != null) {
            mk();
            this.mk.qf().pcc(4);
        }
        com.bytedance.sdk.openadsdk.component.oo.sf.pcc(this.fum, (int) this.ork.gm(), this.vh.pcc(), this.ork.sf());
        of ofVar = this.fum;
        if (ofVar != null && (gto = ofVar.gto()) != null && (pcc = gto.pcc()) != null) {
            com.bytedance.sdk.openadsdk.component.gm gmVar2 = this.mk;
            long hc = (gmVar2 == null || gmVar2.qf() == null) ? 0L : this.mk.qf().hc();
            pcc.wh(hc);
            pcc.vj(hc);
        }
        finish();
    }

    private boolean sf(Bundle bundle) {
        this.fum = atb.pcc().pcc(atb.pcc(getIntent()));
        if (this.nn) {
            this.mu = bundle != null ? bundle.getString("single_process_listener_key") : getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            this.tz = (com.bytedance.sdk.openadsdk.pcc.oo.sf) atb.pcc().pcc(this.mu, com.bytedance.sdk.openadsdk.pcc.oo.sf.class);
        } else {
            this.tz = atb.pcc().oo();
        }
        atb.pcc().vj();
        pcc(getIntent());
        pcc(bundle);
        of ofVar = this.fum;
        if (ofVar == null) {
            finish();
            return false;
        }
        this.atb = ofVar.gqd();
        this.fum.pcc(this.wh);
        this.lo = this.fum.kot();
        com.bytedance.sdk.openadsdk.utils.sf.pcc(this.fum);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tmg() {
        if (!this.gpj || this.fum.ye() || this.ye) {
            return;
        }
        this.sf.sendEmptyMessageDelayed(100, 5000L);
    }

    private int tsz() {
        of ofVar = this.fum;
        return (ofVar == null || ofVar.sf() < 0) ? lu.oo().of(String.valueOf(this.lo)) : this.fum.sf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tz() {
        com.bytedance.sdk.openadsdk.pcc.oo.sf sfVar = this.tz;
        if (sfVar != null) {
            sfVar.pcc();
        } else {
            ork.pcc(this.fum, "show", 0);
        }
        com.bytedance.sdk.openadsdk.component.oo.pcc.sf(this.fum, gpj());
    }

    private void vh() {
        if (this.tmg == null) {
            nac nacVar = new nac(this, this.fum);
            this.tmg = nacVar;
            nacVar.setDislikeSource("video_player");
            this.tmg.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void pcc(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.oo.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.oo.set(true);
                    TTAppOpenAdActivity.this.dax();
                }

                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void sf(View view) {
                    TTAppOpenAdActivity.this.gm.set(false);
                    TTAppOpenAdActivity.this.sf();
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(TTAppOpenAdActivity.this.fum, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void pcc(View view) {
                    TTAppOpenAdActivity.this.gm.set(true);
                    TTAppOpenAdActivity.this.gm();
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(TTAppOpenAdActivity.this.fum, 8);
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.tmg);
        if (this.hc == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.hc = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    private void vy() {
        int min;
        int max;
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            if (i == 27) {
                try {
                    ork();
                } catch (Throwable th) {
                    lo.gm("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                ork();
            }
        }
        Pair<Integer, Integer> vh = rj.vh(getApplicationContext());
        if (this.qy == 2) {
            min = Math.max(((Integer) vh.first).intValue(), ((Integer) vh.second).intValue());
            max = Math.min(((Integer) vh.first).intValue(), ((Integer) vh.second).intValue());
        } else {
            min = Math.min(((Integer) vh.first).intValue(), ((Integer) vh.second).intValue());
            max = Math.max(((Integer) vh.first).intValue(), ((Integer) vh.second).intValue());
        }
        this.nac = max;
        this.lu = min;
        float pcc = rj.pcc();
        if (rj.gm((Activity) this)) {
            int i2 = this.qy;
            if (i2 == 1) {
                this.nac -= pcc;
            } else if (i2 == 2) {
                this.lu -= pcc;
            }
        }
        com.bytedance.sdk.openadsdk.component.gm gmVar = this.mk;
        if (gmVar != null) {
            gmVar.pcc(this.lu, this.nac);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh() {
        int tsz = tsz();
        this.vh.pcc(this.ork.sf());
        this.vh.sf(tsz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yt() {
        com.bytedance.sdk.openadsdk.pcc.oo.sf sfVar = this.tz;
        if (sfVar != null) {
            sfVar.sf();
        } else {
            ork.pcc(this.fum, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void gm() {
        if (this.gpj) {
            com.bytedance.sdk.openadsdk.component.gm gmVar = this.mk;
            if (gmVar != null && gmVar.qf() != null && this.mk.qf().vj()) {
                this.mk.qf().kj();
            }
            hc();
        }
        com.bytedance.sdk.openadsdk.component.wh.sf sfVar = this.vh;
        if (sfVar != null) {
            sfVar.oo();
        }
        gbb gbbVar = this.rnn;
        if (gbbVar != null) {
            gbbVar.sf();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rj.pcc((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                rj.pcc((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        lo.gm("TTAppOpenAdActivity", e.getMessage());
                        ork.pcc(TTAppOpenAdActivity.this.fum, "show_ad_fail", "open_ad", "attach_to_window_failed");
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        nac();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        of ofVar;
        super.onCreate(bundle);
        lu.sf(getApplicationContext());
        this.nn = bundle != null ? bundle.getBoolean("enable_new_arch", false) : getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        lo.pcc("BVA", "onCreate: isEnableNewArch = " + this.nn);
        if (!sf(bundle)) {
            ork.pcc(this.fum, "show_ad_fail", "open_ad", "init_view_crash");
            finish();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.jr.vj()) {
            ork.pcc(this.fum, "show_ad_fail", "open_ad", "init_view_crash");
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.oo.gm.sf(this.fum, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        boolean vj = of.vj(this.fum);
        this.gpj = vj;
        if (!vj || (ofVar = this.fum) == null) {
            this.ork.pcc(lu.oo().yt(String.valueOf(this.lo)));
        } else {
            this.ork.pcc((float) ofVar.kez().d);
        }
        com.bytedance.sdk.openadsdk.component.wh.sf sfVar = new com.bytedance.sdk.openadsdk.component.wh.sf(this.ork);
        this.vh = sfVar;
        sfVar.pcc(this.tsx);
        kj();
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("aoa_ad_report_enable", 0) == 1) {
            ork.pcc(this.fum, "on_create", "open_ad", "activity_on_create");
        }
        FrameLayout frameLayout = new FrameLayout(this);
        this.jsj = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            lu();
            setContentView(this.jsj);
            this.jsj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        of ofVar2 = TTAppOpenAdActivity.this.fum;
                        TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                        if (ofVar2 == null) {
                            tTAppOpenAdActivity.finish();
                            return;
                        }
                        int rt = tTAppOpenAdActivity.fum.rt();
                        boolean vh = com.bytedance.sdk.openadsdk.component.qf.pcc.vh();
                        TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                        if (vh) {
                            tTAppOpenAdActivity2.tsz = rt != 1;
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity3.mk = new com.bytedance.sdk.openadsdk.component.sf(tTAppOpenAdActivity3, tTAppOpenAdActivity3.fum, TTAppOpenAdActivity.this.jsj, TTAppOpenAdActivity.this.tsx, TTAppOpenAdActivity.this.qy, TTAppOpenAdActivity.this.gpj, TTAppOpenAdActivity.this.ork, TTAppOpenAdActivity.this.vh);
                            if (!TTAppOpenAdActivity.this.tsz || !TTAppOpenAdActivity.this.fum()) {
                                TTAppOpenAdActivity.this.fum.gpj(1);
                                TTAppOpenAdActivity.this.fum.lo(1);
                            }
                        } else {
                            if (tTAppOpenAdActivity2.fum.ei() == 2 && rt != 1) {
                                r3 = true;
                            }
                            tTAppOpenAdActivity2.tsz = r3;
                            if (TTAppOpenAdActivity.this.tsz && TTAppOpenAdActivity.this.fum()) {
                                TTAppOpenAdActivity tTAppOpenAdActivity4 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity4.mk = new com.bytedance.sdk.openadsdk.component.sf(tTAppOpenAdActivity4, tTAppOpenAdActivity4.fum, TTAppOpenAdActivity.this.jsj, TTAppOpenAdActivity.this.tsx, TTAppOpenAdActivity.this.qy, TTAppOpenAdActivity.this.gpj, TTAppOpenAdActivity.this.ork, TTAppOpenAdActivity.this.vh);
                            } else {
                                TTAppOpenAdActivity tTAppOpenAdActivity5 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity5.mk = new com.bytedance.sdk.openadsdk.component.gm(tTAppOpenAdActivity5, tTAppOpenAdActivity5.fum, TTAppOpenAdActivity.this.jsj, TTAppOpenAdActivity.this.tsx, TTAppOpenAdActivity.this.qy, TTAppOpenAdActivity.this.gpj, TTAppOpenAdActivity.this.ork);
                                TTAppOpenAdActivity.this.mk.pcc(TTAppOpenAdActivity.this.lu, TTAppOpenAdActivity.this.nac);
                            }
                        }
                        TTAppOpenAdActivity.this.mk.pcc((ViewGroup) TTAppOpenAdActivity.this.jsj);
                        TTAppOpenAdActivity.this.mk.pcc();
                        TTAppOpenAdActivity.this.mk.sf();
                        TTAppOpenAdActivity tTAppOpenAdActivity6 = TTAppOpenAdActivity.this;
                        com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(tTAppOpenAdActivity6, tTAppOpenAdActivity6.jsj, com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(TTAppOpenAdActivity.this.fum.qxv()));
                    } catch (Throwable th) {
                        ork.pcc(TTAppOpenAdActivity.this.fum, "show_ad_fail", "open_ad", "init_view_crash");
                        TTAppOpenAdActivity.this.finish();
                        lo.gm("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    this.kj = true;
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List<Rect> boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                                return windowInsets;
                            } catch (Throwable unused) {
                                ork.pcc(TTAppOpenAdActivity.this.fum, "show_ad_fail", "open_ad", "init_view_crash");
                                return windowInsets;
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
                ork.pcc(this.fum, "show_ad_fail", "open_ad", "init_view_crash");
            }
            jsj();
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.dax.oo.sf();
            ork.pcc(this.fum, "show_ad_fail", "open_ad", "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        AdSlot adSlot;
        super.onDestroy();
        if (this.fum != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.fum);
        }
        this.sf.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.wh.sf sfVar = this.vh;
        if (sfVar != null) {
            sfVar.vj();
        }
        gbb gbbVar = this.rnn;
        if (gbbVar != null) {
            gbbVar.gm();
        }
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.fum);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(this.fum);
        boolean z = this.gpj;
        of ofVar = this.fum;
        if (z) {
            com.bytedance.sdk.openadsdk.component.oo.sf.pcc(ofVar, this.ork.oo(), this.ork.sf(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.oo.sf.pcc(ofVar, -1L, this.ork.sf(), false);
        }
        if (this.jr.wh() && this.gbb.get()) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(String.valueOf(this.jr.oo()), this.fum, "open_ad", this.dax);
            this.jr = tsx.gm();
        }
        com.bytedance.sdk.openadsdk.component.gm gmVar = this.mk;
        if (gmVar != null) {
            gmVar.gm();
        }
        qf();
        vy = null;
        if (this.nn && !TextUtils.isEmpty(this.mu)) {
            atb.pcc().pcc(this.mu, isFinishing(), isChangingConfigurations());
        }
        this.tz = null;
        nac nacVar = this.tmg;
        if (nacVar != null) {
            nacVar.setCallback(null);
        }
        of ofVar2 = this.fum;
        if (ofVar2 != null && !of.wh(ofVar2) && !this.fum.duh() && (adSlot = this.atb) != null) {
            adSlot.setCacheScene(1);
            com.bytedance.sdk.openadsdk.component.wh.pcc(lu.pcc()).pcc(this.atb);
        }
        com.bytedance.sdk.openadsdk.component.oo.pcc.pcc(this.fum);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.vj = false;
        gm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.gm gmVar;
        super.onResume();
        this.vj = true;
        if (this.pcc.getAndSet(true)) {
            if (!this.of.get()) {
                sf();
                return;
            }
            yt();
            if (this.gpj && (gmVar = this.mk) != null && gmVar.qf() != null) {
                mk();
                this.mk.qf().pcc(3);
            }
            ork.pcc(this.fum, "show_ad_fail", "open_ad", "activity_on_resume_skip");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            this.qf = this.fum != null ? atb.pcc().pcc(this.fum) : -1;
            if (!TextUtils.isEmpty(this.mu)) {
                bundle.putString("single_process_listener_key", this.mu);
            }
            bundle.putBoolean("enable_new_arch", this.nn);
            bundle.putInt("meta_index", this.qf);
            bundle.putInt("ad_source", this.yt);
            bundle.putLong("start_show_time", this.wh);
            bundle.putLong("cache_time", this.lq);
        } catch (Throwable th) {
            lo.gm("TTAppOpenAdActivity", th.getMessage());
            ork.pcc(this.fum, "show_ad_fail", "open_ad", "save_instance_state_failed");
        }
        if (!this.nn) {
            vy = this.tz;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.qf >= 0) {
            atb.pcc().gm(this.qf);
            this.qf = -1;
        }
        com.bytedance.sdk.openadsdk.utils.oo.pcc(this, this.fum);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.tsz) {
                this.jr.vj();
            }
            of ofVar = this.fum;
            if (ofVar != null && ofVar.qap() && !this.fum.tsz()) {
                this.fum.qf(true);
                of ofVar2 = this.fum;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar2, "open_ad", ofVar2.uij());
            }
        } else if (this.gbb.get()) {
            if (this.jr.wh()) {
                com.bytedance.sdk.openadsdk.oo.gm.pcc(String.valueOf(this.jr.oo()), this.fum, "open_ad", this.dax);
            }
            this.jr = tsx.gm();
        }
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.fum, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(this.fum, z);
    }

    public void pcc(Bundle bundle) {
        if (bundle != null) {
            if (!this.nn && this.tz == null) {
                this.tz = vy;
                vy = null;
            }
            try {
                int i = bundle.getInt("meta_index", -1);
                this.yt = bundle.getInt("ad_source", 0);
                this.wh = bundle.getLong("start_show_time", 0L);
                this.lq = bundle.getLong("cache_time", 0L);
                this.fum = atb.pcc().pcc(i);
            } catch (Throwable th) {
                lo.gm("TTAppOpenAdActivity", th.getMessage());
                ork.pcc(this.fum, "show_ad_fail", "open_ad", "get_bundle_info_failed");
            }
        }
    }

    public boolean vj() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e) {
            lo.gm("TTAppOpenAdActivity", e.getMessage());
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean oo() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void gbb() {
        nac();
    }

    public void pcc() {
        if (isFinishing()) {
            return;
        }
        if (this.oo.get()) {
            jr();
            return;
        }
        if (this.tmg == null) {
            try {
                vh();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        nac nacVar = this.tmg;
        if (nacVar != null) {
            nacVar.pcc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject pcc(JSONObject jSONObject) {
        if (gpj() == 0) {
            return this.mk.pcc(jSONObject);
        }
        return null;
    }

    public void pcc(Intent intent) {
        if (intent != null) {
            this.yt = intent.getIntExtra("ad_source", 0);
            this.lq = intent.getLongExtra("cache_time", 0L);
            this.wh = intent.getLongExtra("start_show_time", 0L);
        }
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        com.bytedance.sdk.openadsdk.component.gm gmVar;
        if (message.what == 100) {
            if (this.gpj && (gmVar = this.mk) != null && gmVar.qf() != null) {
                mk();
                this.mk.qf().pcc(1);
            }
            of ofVar = this.fum;
            if (ofVar != null && (gto = ofVar.gto()) != null && (pcc = gto.pcc()) != null) {
                pcc.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
            }
            yt();
            ork.pcc(this.fum, "show_ad_fail", "open_ad", "play_video_time_out");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.pcc.InterfaceC0088pcc
    public void pcc(int i) {
        if (i == 2 || i == 3 || i == 4) {
            mk();
        }
    }

    public void sf() {
        if (this.gm.get()) {
            return;
        }
        if (this.gpj) {
            com.bytedance.sdk.openadsdk.component.gm gmVar = this.mk;
            if (gmVar != null && gmVar.qf() != null && this.mk.qf().wh()) {
                this.mk.qf().vh();
            }
            tmg();
        }
        com.bytedance.sdk.openadsdk.component.wh.sf sfVar = this.vh;
        if (sfVar != null) {
            sfVar.gm();
        }
        gbb gbbVar = this.rnn;
        if (gbbVar != null) {
            gbbVar.pcc();
        }
    }
}
