package com.bytedance.sdk.openadsdk.core.ork;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.bytedance.sdk.component.adexpress.sf.ork;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.pcc;
import com.bytedance.sdk.openadsdk.core.hc.wh.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.nn;
import com.bytedance.sdk.openadsdk.core.oo.qf;
import com.bytedance.sdk.openadsdk.core.rnn;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class fum extends com.bytedance.sdk.openadsdk.core.wh.gm implements com.bytedance.sdk.component.adexpress.dynamic.oo, com.bytedance.sdk.component.adexpress.sf.jr, com.bytedance.sdk.component.adexpress.sf.kj, pcc.InterfaceC0074pcc, dax {
    public com.bytedance.sdk.component.adexpress.sf.oo<? extends View> atb;
    private com.bytedance.sdk.component.adexpress.sf.hc bg;
    protected com.bytedance.sdk.component.adexpress.sf.gm dax;
    private long ei;
    private List<com.bytedance.sdk.component.adexpress.sf.ork> erj;
    private final SparseArray<gm.pcc> ew;
    private final Runnable fmh;
    protected HashSet<String> fum;
    protected boolean gbb;
    private ork.pcc gd;
    private float gdh;
    private float gh;
    private com.bytedance.sdk.openadsdk.gm.gm gm;
    protected int gpj;
    public FrameLayout hc;
    private com.bytedance.sdk.openadsdk.core.hc.sf.qf hoh;
    private final Runnable hpk;
    private gm iv;
    protected boolean jr;
    public com.bytedance.sdk.openadsdk.oo.qf jsj;
    private String kj;
    private boolean kun;
    private int kz;
    protected String lo;
    private float lq;
    private final AtomicBoolean lrr;
    boolean lu;
    protected com.bytedance.sdk.component.adexpress.sf.sf mk;
    private com.bytedance.sdk.openadsdk.core.hc.gm.sf mu;
    protected com.bytedance.sdk.openadsdk.oo.oo.vj nac;
    private boolean nn;
    public boolean of;
    private TTDislikeDialogAbstract oo;
    protected String ork;
    private float otd;
    private boolean pcc;
    private String pq;
    private com.bytedance.sdk.component.adexpress.sf.wh ptr;
    private com.bytedance.sdk.openadsdk.core.hc.wh.oo qcw;
    private ork qf;
    boolean qy;
    private final Runnable ri;
    private of rj;
    private String rnn;
    private com.bytedance.sdk.component.adexpress.sf.dax se;
    private int sf;
    protected com.bytedance.sdk.openadsdk.core.model.of tmg;
    private float tmh;
    private qf.pcc tsx;
    long tsz;
    protected ViewGroup tz;
    private com.bytedance.sdk.openadsdk.core.oo.vy vgx;
    protected AdSlot vh;
    private PAGExpressAdWrapperListener vj;
    private com.bytedance.sdk.component.adexpress.sf.vy vr;
    protected final Context vy;
    private vy wh;
    private final ViewTreeObserver.OnScrollChangedListener xb;
    protected Activity ye;
    int yt;
    private tsz zsj;
    private float zti;

    public fum(Activity activity, @NonNull Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, String str) {
        super(context);
        this.pcc = true;
        this.sf = 0;
        this.ork = "embeded_ad";
        this.kj = null;
        this.jr = false;
        this.lu = true;
        this.gpj = -1;
        this.pq = "";
        this.of = false;
        this.kun = true;
        this.yt = -1;
        this.jsj = new com.bytedance.sdk.openadsdk.oo.qf();
        this.tsz = 0L;
        this.lrr = new AtomicBoolean(false);
        this.xb = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                fum fumVar = fum.this;
                if (fumVar.lu && fumVar.ork()) {
                    fum.this.atb();
                    fum fumVar2 = fum.this;
                    fumVar2.removeCallbacks(fumVar2.ri);
                    fum fumVar3 = fum.this;
                    fumVar3.postDelayed(fumVar3.ri, 500L);
                }
            }
        };
        this.ri = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.2
            @Override // java.lang.Runnable
            public void run() {
                boolean pcc = nn.pcc(fum.this, 0, 5, false);
                fum fumVar = fum.this;
                if (pcc) {
                    fumVar.wh(fumVar.getVisibility());
                } else {
                    fumVar.wh(8);
                }
            }
        };
        this.hpk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.3
            @Override // java.lang.Runnable
            public void run() {
                fum.this.wh(0);
            }
        };
        this.fmh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.4
            @Override // java.lang.Runnable
            public void run() {
                fum.this.wh(8);
            }
        };
        this.kz = 8;
        this.ew = new SparseArray<>();
        this.tmh = -1.0f;
        this.gh = -1.0f;
        this.gdh = -1.0f;
        this.otd = -1.0f;
        this.ei = 0L;
        this.ye = activity;
        this.ork = str;
        this.vy = context;
        this.tmg = ofVar;
        this.vh = adSlot;
        this.of = false;
        qf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void atb() {
        if (this.lrr.get()) {
            this.jsj.pcc(System.currentTimeMillis(), nn.pcc(this));
        }
    }

    private void dax() {
        if (this.tmg.hh() == 1 && this.tmg.on()) {
            lu();
            this.gd = new com.bytedance.sdk.component.adexpress.sf.tmg(this.erj, this.vr);
            return;
        }
        if (pq()) {
            nac();
            return;
        }
        try {
            tsz();
            tsz tszVar = new tsz(this.vy, this.bg, this.nac, this.tmg);
            this.zsj = tszVar;
            com.bytedance.sdk.component.adexpress.sf.dax daxVar = new com.bytedance.sdk.component.adexpress.sf.dax(this.vy, this.bg, tszVar, this);
            this.se = daxVar;
            this.erj.add(daxVar);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.pcc("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        lu();
        this.gd = new com.bytedance.sdk.component.adexpress.sf.tmg(this.erj, this.vr);
    }

    private void gbb() {
        of.pcc kx = this.tmg.kx();
        if (!TextUtils.equals(this.ork, "embeded_ad") || kx == null) {
            return;
        }
        String ork = kx.ork();
        if (TextUtils.isEmpty(ork)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(ork);
            int optInt = jSONObject.optInt("width");
            int optInt2 = jSONObject.optInt("height");
            if (optInt == 0 || optInt2 == 0) {
                return;
            }
            this.zti = optInt2;
            this.lq = optInt;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|(2:2|3)|(2:5|(22:7|8|9|10|(2:12|(13:14|15|16|(2:22|23)|49|25|(1:27)(1:47)|28|(1:46)|32|(3:42|(1:44)|45)(1:38)|39|40))|52|15|16|(4:18|20|22|23)|49|25|(0)(0)|28|(1:30)|46|32|(1:34)|42|(0)|45|39|40))|55|8|9|10|(0)|52|15|16|(0)|49|25|(0)(0)|28|(0)|46|32|(0)|42|(0)|45|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r12.tmg.tqg() != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: Exception -> 0x007d, TRY_LEAVE, TryCatch #1 {Exception -> 0x007d, blocks: (B:10:0x003d, B:12:0x0045), top: B:9:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:16:0x0054, B:18:0x0060, B:20:0x0069, B:22:0x0072), top: B:15:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void jr() {
        long j;
        boolean z;
        hc.pcc pccVar;
        of.pcc kx;
        kj();
        this.vr = new gbb(this.nac, this.ork, this.tmg, this.kj, this.nn);
        final boolean jy = this.tmg.jy();
        try {
            kx = this.tmg.kx();
        } catch (Exception unused) {
        }
        if (kx != null) {
            String vy = kx.vy();
            if (!TextUtils.isEmpty(vy)) {
                j = new JSONObject(vy).optLong("render_delay_time");
                if (!com.bytedance.sdk.openadsdk.core.model.of.vj(this.tmg)) {
                    if (com.bytedance.sdk.openadsdk.core.lu.oo().gbb(this.kj) == 1) {
                        z = true;
                        if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().jr(this.kj) && this.tmg.bg() != 5 && this.tmg.bg() != 6) {
                        }
                        z = true;
                        long min = Math.min(Math.max(j, 0L), Ua.s);
                        int renderTimeout = getRenderTimeout();
                        double d = this.tmg.kez() != null ? this.tmg.kez().d * this.tmg.kez().r : 0.0d;
                        int i = this.yt;
                        this.qy = i == -1 && i < ((int) d);
                        if (!com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg) || com.bytedance.sdk.openadsdk.core.hc.vj.sf(this.tmg) || com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh.pcc(this.ork)) {
                            pcc.C0084pcc c0084pcc = new pcc.C0084pcc();
                            if (com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg)) {
                                c0084pcc.pcc(com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg, this.ork));
                            }
                            c0084pcc.pcc((com.bytedance.adsdk.ugeno.core.lu) this.vr);
                            c0084pcc.pcc(this.lq);
                            c0084pcc.sf(this.zti);
                            c0084pcc.qf(this.nn);
                            pccVar = c0084pcc;
                        } else {
                            pccVar = new hc.pcc();
                        }
                        pccVar.vj(jy);
                        pccVar.pcc(this.ork).sf(this.tmg.esn()).gm(this.tmg.ray()).oo(this.tmg.hl()).pcc(this.vr).oo(this.tmg.ef()).pcc(renderTimeout).sf(this.tmg.dk()).gm(this.kun).sf(this.tmg.bbd()).pcc(min).gm(this.tmg.az()).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.sf(this.tmg)).oo(z).vj(this.yt).pcc(this.qy).pcc(d).wh(com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj()).wh(com.bytedance.sdk.openadsdk.yt.vj.pcc("inject_data_reuse_open", 0)).qf(this.tmg.bo().pcc()).kj(this.tmg.bo().sf()).pcc(new com.bytedance.sdk.component.adexpress.sf.vj() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.5
                            @Override // com.bytedance.sdk.component.adexpress.sf.vj
                            public JSONObject pcc() {
                                try {
                                    fum fumVar = fum.this;
                                    com.bytedance.sdk.openadsdk.core.model.of ofVar = fumVar.tmg;
                                    if (ofVar == null) {
                                        fumVar.pq = "material is null";
                                        return null;
                                    }
                                    if (jy) {
                                        fumVar.rj = new of();
                                        float f = fum.this.lq;
                                        float f2 = fum.this.zti;
                                        fum fumVar2 = fum.this;
                                        JSONObject pcc = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(f, f2, fumVar2.jr, fumVar2.tmg, fumVar2.ork, fumVar2.rj);
                                        fum.this.pq = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc();
                                        return pcc;
                                    }
                                    boolean pcc2 = com.bytedance.sdk.openadsdk.core.hc.vj.pcc(ofVar);
                                    fum fumVar3 = fum.this;
                                    if (pcc2) {
                                        fumVar3.rj = new of();
                                        fum fumVar4 = fum.this;
                                        JSONObject pcc3 = com.bytedance.sdk.openadsdk.core.hc.vj.pcc(fumVar4.tmg, fumVar4.rj);
                                        fum.this.pq = com.bytedance.sdk.openadsdk.core.hc.vj.pcc();
                                        return pcc3;
                                    }
                                    float f3 = fumVar3.lq;
                                    float f4 = fum.this.zti;
                                    fum fumVar5 = fum.this;
                                    JSONObject pcc4 = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(f3, f4, fumVar5.jr, fumVar5.tmg);
                                    fum.this.gm(pcc4);
                                    return pcc4;
                                } catch (Throwable unused2) {
                                    return null;
                                }
                            }
                        });
                        pcc(pccVar);
                        this.bg = pccVar.pcc();
                    }
                }
                z = false;
                if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().jr(this.kj)) {
                }
                z = true;
                long min2 = Math.min(Math.max(j, 0L), Ua.s);
                int renderTimeout2 = getRenderTimeout();
                if (this.tmg.kez() != null) {
                }
                int i2 = this.yt;
                this.qy = i2 == -1 && i2 < ((int) d);
                if (com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg)) {
                }
                pcc.C0084pcc c0084pcc2 = new pcc.C0084pcc();
                if (com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg)) {
                }
                c0084pcc2.pcc((com.bytedance.adsdk.ugeno.core.lu) this.vr);
                c0084pcc2.pcc(this.lq);
                c0084pcc2.sf(this.zti);
                c0084pcc2.qf(this.nn);
                pccVar = c0084pcc2;
                pccVar.vj(jy);
                pccVar.pcc(this.ork).sf(this.tmg.esn()).gm(this.tmg.ray()).oo(this.tmg.hl()).pcc(this.vr).oo(this.tmg.ef()).pcc(renderTimeout2).sf(this.tmg.dk()).gm(this.kun).sf(this.tmg.bbd()).pcc(min2).gm(this.tmg.az()).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.sf(this.tmg)).oo(z).vj(this.yt).pcc(this.qy).pcc(d).wh(com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj()).wh(com.bytedance.sdk.openadsdk.yt.vj.pcc("inject_data_reuse_open", 0)).qf(this.tmg.bo().pcc()).kj(this.tmg.bo().sf()).pcc(new com.bytedance.sdk.component.adexpress.sf.vj() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.5
                    @Override // com.bytedance.sdk.component.adexpress.sf.vj
                    public JSONObject pcc() {
                        try {
                            fum fumVar = fum.this;
                            com.bytedance.sdk.openadsdk.core.model.of ofVar = fumVar.tmg;
                            if (ofVar == null) {
                                fumVar.pq = "material is null";
                                return null;
                            }
                            if (jy) {
                                fumVar.rj = new of();
                                float f = fum.this.lq;
                                float f2 = fum.this.zti;
                                fum fumVar2 = fum.this;
                                JSONObject pcc = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(f, f2, fumVar2.jr, fumVar2.tmg, fumVar2.ork, fumVar2.rj);
                                fum.this.pq = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc();
                                return pcc;
                            }
                            boolean pcc2 = com.bytedance.sdk.openadsdk.core.hc.vj.pcc(ofVar);
                            fum fumVar3 = fum.this;
                            if (pcc2) {
                                fumVar3.rj = new of();
                                fum fumVar4 = fum.this;
                                JSONObject pcc3 = com.bytedance.sdk.openadsdk.core.hc.vj.pcc(fumVar4.tmg, fumVar4.rj);
                                fum.this.pq = com.bytedance.sdk.openadsdk.core.hc.vj.pcc();
                                return pcc3;
                            }
                            float f3 = fumVar3.lq;
                            float f4 = fum.this.zti;
                            fum fumVar5 = fum.this;
                            JSONObject pcc4 = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(f3, f4, fumVar5.jr, fumVar5.tmg);
                            fum.this.gm(pcc4);
                            return pcc4;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
                pcc(pccVar);
                this.bg = pccVar.pcc();
            }
        }
        j = 0;
        if (!com.bytedance.sdk.openadsdk.core.model.of.vj(this.tmg)) {
        }
        z = false;
        if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().jr(this.kj)) {
        }
        z = true;
        long min22 = Math.min(Math.max(j, 0L), Ua.s);
        int renderTimeout22 = getRenderTimeout();
        if (this.tmg.kez() != null) {
        }
        int i22 = this.yt;
        this.qy = i22 == -1 && i22 < ((int) d);
        if (com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg)) {
        }
        pcc.C0084pcc c0084pcc22 = new pcc.C0084pcc();
        if (com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg)) {
        }
        c0084pcc22.pcc((com.bytedance.adsdk.ugeno.core.lu) this.vr);
        c0084pcc22.pcc(this.lq);
        c0084pcc22.sf(this.zti);
        c0084pcc22.qf(this.nn);
        pccVar = c0084pcc22;
        pccVar.vj(jy);
        pccVar.pcc(this.ork).sf(this.tmg.esn()).gm(this.tmg.ray()).oo(this.tmg.hl()).pcc(this.vr).oo(this.tmg.ef()).pcc(renderTimeout22).sf(this.tmg.dk()).gm(this.kun).sf(this.tmg.bbd()).pcc(min22).gm(this.tmg.az()).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.sf(this.tmg)).oo(z).vj(this.yt).pcc(this.qy).pcc(d).wh(com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj()).wh(com.bytedance.sdk.openadsdk.yt.vj.pcc("inject_data_reuse_open", 0)).qf(this.tmg.bo().pcc()).kj(this.tmg.bo().sf()).pcc(new com.bytedance.sdk.component.adexpress.sf.vj() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.5
            @Override // com.bytedance.sdk.component.adexpress.sf.vj
            public JSONObject pcc() {
                try {
                    fum fumVar = fum.this;
                    com.bytedance.sdk.openadsdk.core.model.of ofVar = fumVar.tmg;
                    if (ofVar == null) {
                        fumVar.pq = "material is null";
                        return null;
                    }
                    if (jy) {
                        fumVar.rj = new of();
                        float f = fum.this.lq;
                        float f2 = fum.this.zti;
                        fum fumVar2 = fum.this;
                        JSONObject pcc = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(f, f2, fumVar2.jr, fumVar2.tmg, fumVar2.ork, fumVar2.rj);
                        fum.this.pq = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc();
                        return pcc;
                    }
                    boolean pcc2 = com.bytedance.sdk.openadsdk.core.hc.vj.pcc(ofVar);
                    fum fumVar3 = fum.this;
                    if (pcc2) {
                        fumVar3.rj = new of();
                        fum fumVar4 = fum.this;
                        JSONObject pcc3 = com.bytedance.sdk.openadsdk.core.hc.vj.pcc(fumVar4.tmg, fumVar4.rj);
                        fum.this.pq = com.bytedance.sdk.openadsdk.core.hc.vj.pcc();
                        return pcc3;
                    }
                    float f3 = fumVar3.lq;
                    float f4 = fum.this.zti;
                    fum fumVar5 = fum.this;
                    JSONObject pcc4 = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(f3, f4, fumVar5.jr, fumVar5.tmg);
                    fum.this.gm(pcc4);
                    return pcc4;
                } catch (Throwable unused2) {
                    return null;
                }
            }
        });
        pcc(pccVar);
        this.bg = pccVar.pcc();
    }

    private void lq() {
        List<com.bytedance.sdk.component.adexpress.sf.ork> list = this.erj;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.sf.ork> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void lu() {
        if (com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh.pcc(this.ork)) {
            com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh(this.vy, this.tmg, this.of, (com.bytedance.sdk.openadsdk.core.hc.wh.pcc) this.bg, this, this.lq, this.zti, this.jr, this.ork);
            com.bytedance.sdk.openadsdk.core.hc.sf.qf qfVar = new com.bytedance.sdk.openadsdk.core.hc.sf.qf(this.vy, whVar, this, this.bg);
            whVar.pcc((dax) this);
            this.erj.add(qfVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.sf.wh whVar2 = new com.bytedance.sdk.component.adexpress.sf.wh(this.vy, this.bg, new tz(this, this.bg));
        this.ptr = whVar2;
        this.erj.add(whVar2);
    }

    private void mk() {
        fum fumVar;
        com.bytedance.sdk.openadsdk.core.hc.wh.oo ooVar;
        com.bytedance.sdk.openadsdk.core.model.of ofVar;
        com.bytedance.sdk.openadsdk.core.model.of ofVar2 = this.tmg;
        if (ofVar2 == null || ofVar2.hh() != 1 || this.tmg.ei() == 2) {
            if (!com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh.pcc(this.ork) || (ofVar = this.tmg) == null || ofVar.ei() == 2) {
                com.bytedance.sdk.openadsdk.core.kj.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.core.kj.pcc.pcc();
                int i = this.sf;
                if (i != 0) {
                    if (i == 3) {
                        com.bytedance.sdk.component.adexpress.dynamic.vj.qf qfVar = new com.bytedance.sdk.component.adexpress.dynamic.vj.qf();
                        Context applicationContext = this.vy.getApplicationContext();
                        com.bytedance.sdk.component.adexpress.sf.hc hcVar = this.bg;
                        boolean z = this.of;
                        com.bytedance.sdk.component.adexpress.sf.sf sfVar = new com.bytedance.sdk.component.adexpress.sf.sf(applicationContext, hcVar, z, qfVar, this, pccVar, new qf(this.vy, z, qfVar, hcVar, pccVar));
                        this.mk = sfVar;
                        this.erj.add(sfVar);
                        return;
                    }
                    if (i == 7) {
                        com.bytedance.sdk.openadsdk.core.hc.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.hc.wh.oo(this.vy, this.tmg, this.of, (com.bytedance.sdk.openadsdk.core.hc.wh.pcc) this.bg, this);
                        this.qcw = ooVar2;
                        com.bytedance.sdk.openadsdk.core.hc.sf.qf qfVar2 = new com.bytedance.sdk.openadsdk.core.hc.sf.qf(this.vy, ooVar2, this, this.bg);
                        this.hoh = qfVar2;
                        qfVar2.pcc(this);
                        this.erj.add(this.hoh);
                        return;
                    }
                    switch (i) {
                        case 10:
                            if (!this.nn || (ooVar = this.qcw) == null) {
                                fumVar = this;
                                fumVar.qcw = new com.bytedance.sdk.openadsdk.core.hc.wh.qf(this.vy, this.tmg, this.of, (com.bytedance.sdk.openadsdk.core.hc.wh.pcc) this.bg, this);
                            } else {
                                ooVar.pcc(this.tmg, this.of, (com.bytedance.sdk.openadsdk.core.hc.wh.pcc) this.bg, this);
                                fumVar = this;
                            }
                            com.bytedance.sdk.openadsdk.core.hc.sf.qf qfVar3 = new com.bytedance.sdk.openadsdk.core.hc.sf.qf(fumVar.vy, fumVar.qcw, fumVar, fumVar.bg);
                            fumVar.hoh = qfVar3;
                            qfVar3.pcc(fumVar);
                            fumVar.erj.add(fumVar.hoh);
                            break;
                        case 11:
                            qy qyVar = new qy(this.vy, this.bg, this.nac, this.tmg);
                            this.zsj = qyVar;
                            qyVar.sf(this.ye);
                            com.bytedance.sdk.component.adexpress.sf.dax daxVar = new com.bytedance.sdk.component.adexpress.sf.dax(this.vy, this.bg, this.zsj, this);
                            this.se = daxVar;
                            this.erj.add(daxVar);
                            break;
                    }
                    return;
                }
                tsz tszVar = new tsz(this.vy, this.bg, this.nac, this.tmg);
                this.zsj = tszVar;
                com.bytedance.sdk.component.adexpress.sf.dax daxVar2 = new com.bytedance.sdk.component.adexpress.sf.dax(this.vy, this.bg, tszVar, this);
                this.se = daxVar2;
                this.erj.add(daxVar2);
            }
        }
    }

    private void nac() {
        this.sf = this.tmg.rt();
        try {
            tsz();
            mk();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.pcc("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        this.pcc = this.tmg.qc() == 1;
        boolean pcc = com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(this.tmg);
        if (this.pcc && !pcc) {
            lu();
        }
        Objects.toString(this.erj);
        this.gd = new com.bytedance.sdk.component.adexpress.sf.tmg(this.erj, this.vr);
    }

    private boolean pq() {
        return TextUtils.equals(this.ork, "fullscreen_interstitial_ad") || TextUtils.equals(this.ork, "rewarded_video") || TextUtils.equals("open_ad", this.ork) || tsz.sf(this.ork) || TextUtils.equals(this.ork, "embeded_ad");
    }

    private void tsz() {
        if (com.bytedance.sdk.openadsdk.core.jr.vj()) {
            return;
        }
        hc.pcc();
    }

    private boolean ye() {
        return com.bytedance.sdk.openadsdk.core.model.of.vj(this.tmg);
    }

    private void zti() {
        List<com.bytedance.sdk.component.adexpress.sf.ork> list = this.erj;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.sf.ork> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.jr
    public void a_(int i) {
        com.bytedance.sdk.component.adexpress.sf.vy vyVar = this.vr;
        if (vyVar != null) {
            if (!this.pcc) {
                vyVar.qf();
            }
            this.vr.kj();
            ((gbb) this.vr).ork();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.vj;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.vy.pcc(i), i);
        }
        of ofVar = this.rj;
        if (ofVar != null) {
            ofVar.pcc(this.tmg, this.ork);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        vy vyVar = this.wh;
        if (vyVar != null) {
            vyVar.sf(motionEvent.getDeviceId());
            this.wh.pcc(motionEvent.getSource());
            this.wh.gm(motionEvent.getToolType(0));
        }
        ork orkVar = this.qf;
        if (orkVar != null) {
            orkVar.sf(motionEvent.getDeviceId());
            this.qf.pcc(motionEvent.getSource());
            this.qf.gm(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    i2 = actionMasked != 3 ? -1 : 4;
                } else {
                    this.gdh = Math.abs(motionEvent.getX() - this.tmh) + this.gdh;
                    this.otd = Math.abs(motionEvent.getY() - this.gh) + this.otd;
                    this.tmh = motionEvent.getX();
                    this.gh = motionEvent.getY();
                    i = (System.currentTimeMillis() - this.ei <= 200 || (this.gdh <= 8.0f && this.otd <= 8.0f)) ? 2 : 1;
                }
            }
            i = i2;
        } else {
            this.tmh = motionEvent.getRawX();
            this.gh = motionEvent.getRawY();
            this.ei = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(motionEvent);
            i = 0;
        }
        SparseArray<gm.pcc> sparseArray = this.ew;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new gm.pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void fum() {
        if (this.tmg == null) {
            return;
        }
        this.tsz = SystemClock.elapsedRealtime();
        if (this.tmg.uxz()) {
            gm gmVar = this.iv;
            if (gmVar == null) {
                a_(106);
                return;
            } else {
                gmVar.pcc((com.bytedance.sdk.component.adexpress.sf.jr) this);
                this.iv.pcc();
                return;
            }
        }
        this.nac.pcc();
        ork.pcc pccVar = this.gd;
        if (pccVar != null) {
            pccVar.pcc(this);
        }
        try {
            this.gd.pcc();
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.openadsdk.oo.qf getAdShowTime() {
        return this.jsj;
    }

    public gm getBrandBannerController() {
        return this.iv;
    }

    public vy getClickCreativeListener() {
        return this.wh;
    }

    public ork getClickListener() {
        return this.qf;
    }

    public String getClosedListenerKey() {
        return this.rnn;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar != null) {
            return ooVar.gm();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.zti).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.lq).intValue();
    }

    public PAGExpressAdWrapperListener getExpressInteractionListener() {
        return this.vj;
    }

    public mu getJsObject() {
        tsz tszVar = this.zsj;
        if (tszVar != null) {
            return tszVar.yt();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        vh of;
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (!(ooVar instanceof tsz) || (of = ((tsz) ooVar).of()) == null) {
            return 0;
        }
        return of.pcc();
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.lu.oo().pq();
    }

    public String getUgenTemplateErrorReason() {
        return this.pq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc.InterfaceC0074pcc
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.oo.vy vyVar = this.vgx;
        if (vyVar != null) {
            return vyVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.vy.qf getWebView() {
        tsz tszVar = this.zsj;
        if (tszVar == null) {
            return null;
        }
        return tszVar.oo();
    }

    public vj.pcc gm(int i) {
        return new vj.pcc(i);
    }

    public void gpj() {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar instanceof tsz) {
            if (ooVar == null) {
                return;
            }
            ((tsz) ooVar).vh();
            com.bytedance.sdk.component.utils.vy.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.6
                @Override // java.lang.Runnable
                public void run() {
                    fum.this.vj(1);
                }
            }, (this.tmg != null ? r0.jsj().oo() : 5) * 1000);
        } else if (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.qf) {
            ((com.bytedance.sdk.openadsdk.core.hc.wh.qf) ooVar).vh();
        }
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.tmg;
        if (ofVar != null && (gto = ofVar.gto()) != null && (pcc = gto.pcc()) != null) {
            pcc.pcc(0L);
        }
        if ((this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.qf) && com.bytedance.sdk.openadsdk.core.model.nac.pcc(this.tmg)) {
            pcc(this.atb);
        }
    }

    public void hc() {
        try {
            gm gmVar = this.iv;
            if (gmVar != null) {
                gmVar.sf();
            }
            yt();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.sf.ork> list = this.erj;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.sf.ork> it = list.iterator();
                while (it.hasNext()) {
                    it.next().pcc();
                }
            }
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.tmg);
            com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(this.tmg);
            this.gm = null;
            this.oo = null;
            this.vh = null;
            this.tmg = null;
            this.vj = null;
            this.wh = null;
            this.dax = null;
            this.qf = null;
            com.bytedance.sdk.openadsdk.core.hc.gm.sf sfVar = this.mu;
            if (sfVar != null) {
                sfVar.oo();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("NativeExpressView", "detach error", th);
        }
    }

    public void jsj() {
        com.bytedance.sdk.openadsdk.core.hc.gm.sf sfVar = new com.bytedance.sdk.openadsdk.core.hc.gm.sf(this.vy, this.tmg);
        this.mu = sfVar;
        sfVar.pcc(this);
        this.mu.pcc(new com.bytedance.sdk.openadsdk.core.hc.gm.pcc() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.7
            @Override // com.bytedance.sdk.openadsdk.core.hc.gm.pcc
            public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
                pcc(view, i, gmVar);
            }
        });
    }

    public void kj() {
        this.nac = new com.bytedance.sdk.openadsdk.oo.gpj(1, this.ork, this.tmg);
    }

    public boolean lo() {
        return true;
    }

    public boolean of() {
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        return ooVar != null && (ooVar instanceof tz);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        atb();
        lq();
        getViewTreeObserver().addOnScrollChangedListener(this.xb);
        com.bytedance.sdk.openadsdk.core.ork.sf().pcc(this.rnn, this.tsx);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.xb);
        com.bytedance.sdk.openadsdk.core.ork.sf().wh(this.rnn);
        zti();
        pcc(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        atb();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        onWindowVisibilityChanged(z ? getVisibility() : 8);
        atb();
        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(this.tmg, z);
        if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(this.tmg)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.tmg;
        if (z) {
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(ofVar, 4);
        } else {
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(ofVar, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (lo()) {
            pcc(i, true, false);
        }
    }

    public long oo() {
        return 0L;
    }

    public boolean ork() {
        return true;
    }

    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.lo.pcc("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i));
        if (i == -1 || gmVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (atb.gm(this.tmg)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        hashMap.put("dynamic_show_type", Integer.valueOf(getDynamicShowType()));
        com.bytedance.sdk.openadsdk.core.model.dax daxVar = (com.bytedance.sdk.openadsdk.core.model.dax) gmVar;
        if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(this.tmg)) {
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Integer.valueOf(daxVar.nac));
        }
        if (com.bytedance.sdk.openadsdk.core.model.lo.gm(this.tmg)) {
            try {
                JSONObject jSONObject2 = daxVar.hc;
                if (jSONObject2 != null) {
                    int optInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", optInt);
                    hashMap.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm(th.toString(), new Object[0]);
            }
        }
        vy vyVar = this.wh;
        if (vyVar != null) {
            vyVar.oo(getDynamicShowType());
            this.wh.pcc(hashMap);
        }
        ork orkVar = this.qf;
        if (orkVar != null) {
            orkVar.oo(getDynamicShowType());
            this.qf.pcc(hashMap);
        }
        float f = daxVar.pcc;
        float f2 = daxVar.sf;
        float f3 = daxVar.gm;
        float f4 = daxVar.oo;
        boolean z = daxVar.vh;
        SparseArray<gm.pcc> sparseArray = daxVar.ork;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.ew;
        }
        SparseArray<gm.pcc> sparseArray2 = sparseArray;
        String str = daxVar.qf;
        if (view == null) {
            view2 = this;
        } else {
            r6 = view != this ? pcc(view) : null;
            view2 = view;
        }
        daxVar.kj = i;
        if (r6 != null && daxVar.vy == null) {
            daxVar.vy = r6;
        }
        if (i == 13) {
            int i2 = daxVar.jr;
            if (i2 >= 0) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("switch", i2);
                    pcc(jSONObject4);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        switch (i) {
            case 1:
                FrameLayout frameLayout = this.hc;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.of ofVar = this.tmg;
                if (ofVar == null || ofVar.tmh() != 1 || z) {
                    ork orkVar2 = this.qf;
                    if (orkVar2 != null) {
                        orkVar2.pcc(daxVar);
                        this.qf.pcc(str);
                        this.qf.pcc(view2, f, f2, f3, f4, sparseArray2, z);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.vj;
                    if (pAGExpressAdWrapperListener != null && !daxVar.gbb) {
                        pAGExpressAdWrapperListener.onAdClicked();
                        break;
                    }
                }
                break;
            case 2:
                if (daxVar.tmg > 0) {
                    rnn.pcc(true);
                }
                vy vyVar2 = this.wh;
                if (vyVar2 != null) {
                    vyVar2.pcc(daxVar);
                    this.wh.pcc(str);
                    if (com.bytedance.sdk.openadsdk.core.model.lo.gm(this.tmg) && (jSONObject = daxVar.hc) != null) {
                        this.wh.oo(jSONObject.optBoolean("is_ceiling_page", false));
                    }
                    this.wh.pcc(view2, f, f2, f3, f4, sparseArray2, z);
                }
                PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.vj;
                if (pAGExpressAdWrapperListener2 != null && !daxVar.gbb) {
                    pAGExpressAdWrapperListener2.onAdClicked();
                }
                rnn.pcc(false);
                if (!com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(this.tmg)) {
                    com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.tmg, 9);
                    break;
                }
                break;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.oo;
                if (tTDislikeDialogAbstract == null) {
                    com.bytedance.sdk.openadsdk.gm.gm gmVar2 = this.gm;
                    if (gmVar2 == null) {
                        TTDelegateActivity.pcc(this.tmg, this.rnn);
                        break;
                    } else {
                        gmVar2.pcc();
                        break;
                    }
                } else {
                    tTDislikeDialogAbstract.show();
                    break;
                }
            case 4:
                FrameLayout frameLayout2 = this.hc;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.of ofVar2 = this.tmg;
                if (ofVar2 == null || ofVar2.tmh() != 1 || z) {
                    kun.gm(this.tmg);
                    if ("embeded_ad".equals(this.ork) && ye() && !this.gbb && kun.gm(this.tmg)) {
                        vy vyVar3 = this.wh;
                        if (vyVar3 != null) {
                            vyVar3.pcc(daxVar);
                            this.wh.pcc(str);
                            this.wh.pcc(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    } else {
                        ork orkVar3 = this.qf;
                        if (orkVar3 != null) {
                            orkVar3.pcc(daxVar);
                            this.qf.pcc(str);
                            this.qf.pcc(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.vj;
                    if (pAGExpressAdWrapperListener3 != null && !daxVar.gbb) {
                        pAGExpressAdWrapperListener3.onAdClicked();
                        break;
                    }
                }
                break;
            case 5:
                pcc(!this.of, "dynamicClick");
                break;
            case 6:
                pcc();
                break;
            case 7:
                if (!com.bytedance.sdk.openadsdk.utils.sf.wh() || !com.bytedance.sdk.openadsdk.core.lu.oo().atb()) {
                    TTWebsiteActivity.pcc(this.vy, this.tmg, this.ork);
                    break;
                } else {
                    IABLandingPageActivity.pcc(this.vy, this.tmg, this.ork);
                    break;
                }
        }
    }

    public void qf() {
        int of;
        this.fum = new HashSet<>();
        AdSlot adSlot = this.vh;
        if (adSlot != null) {
            this.lq = adSlot.getExpressViewAcceptedWidth();
            this.zti = this.vh.getExpressViewAcceptedHeight();
            gbb();
            this.kj = this.vh.getCodeId();
            if (TextUtils.equals(this.ork, "fullscreen_interstitial_ad")) {
                this.yt = this.tmg.bm();
            } else if (TextUtils.equals(this.ork, "rewarded_video")) {
                this.yt = this.tmg.quq();
            } else if (TextUtils.equals(this.ork, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.of ofVar = this.tmg;
                if (ofVar == null || ofVar.sf() < 0) {
                    of = com.bytedance.sdk.openadsdk.core.lu.oo().of(this.kj);
                    this.yt = of;
                } else {
                    of = this.tmg.sf();
                    this.yt = of;
                }
                if (of < 0) {
                    this.yt = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.tmg.uxz()) {
            this.iv = new gm(this.vy, this, this.tmg, this.ork);
            return;
        }
        jr();
        this.erj = new ArrayList();
        dax();
        com.bytedance.sdk.component.adexpress.sf.dax daxVar = this.se;
        if (daxVar != null) {
            this.zsj = (tsz) daxVar.sf();
        }
        mu jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.wh(this.ork);
        }
    }

    public boolean qy() {
        return this.lrr.get();
    }

    public void setActivity(Activity activity) {
        this.ye = activity;
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.sf.gm gmVar) {
        this.dax = gmVar;
        com.bytedance.sdk.component.adexpress.sf.wh whVar = this.ptr;
        if (whVar != null) {
            whVar.pcc(gmVar);
        }
    }

    public void setBannerClickClosedListener(qf.pcc pccVar) {
        this.tsx = pccVar;
    }

    public void setClickCreativeListener(vy vyVar) {
        this.wh = vyVar;
        if (vyVar != null) {
            vyVar.pcc((pcc.InterfaceC0074pcc) this);
        }
    }

    public void setClickListener(ork orkVar) {
        this.qf = orkVar;
    }

    public void setClosedListenerKey(String str) {
        this.rnn = str;
        gm gmVar = this.iv;
        if (gmVar != null) {
            gmVar.pcc(str);
        }
    }

    public void setDirectDestroyWebView(boolean z) {
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar instanceof com.bytedance.sdk.component.adexpress.vj.pcc) {
            ((com.bytedance.sdk.component.adexpress.vj.pcc) ooVar).sf(z);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.gm.gm gmVar) {
        pcc pccVar;
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar != null && (ooVar instanceof tz) && (pccVar = (pcc) ooVar.vj()) != null) {
            pccVar.setDislikeInner(gmVar);
        }
        gm gmVar2 = this.iv;
        if (gmVar2 != null) {
            gmVar2.pcc(gmVar);
        }
        this.gm = gmVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.vj = pAGExpressAdWrapperListener;
        gm gmVar = this.iv;
        if (gmVar != null) {
            gmVar.pcc(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.vj vjVar) {
        if (this.zsj != null && getJsObject() != null) {
            getJsObject().pcc(vjVar);
        }
        com.bytedance.sdk.openadsdk.core.hc.wh.oo ooVar = this.qcw;
        if (ooVar != null) {
            ooVar.pcc(vjVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        pcc pccVar;
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar != null && (ooVar instanceof tz) && (pccVar = (pcc) ooVar.vj()) != null) {
            pccVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        gm gmVar = this.iv;
        if (gmVar != null) {
            gmVar.pcc(tTDislikeDialogAbstract);
        }
        this.oo = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z) {
        this.of = z;
        com.bytedance.sdk.component.adexpress.sf.sf sfVar = this.mk;
        if (sfVar != null && sfVar.sf() != null) {
            this.mk.sf().setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) {
            ((com.bytedance.sdk.openadsdk.core.hc.wh.oo) ooVar).setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        try {
            int parseInt = Integer.parseInt(String.valueOf(charSequence));
            sf(parseInt, i);
            com.bytedance.sdk.openadsdk.core.hc.gm.sf sfVar = this.mu;
            if (sfVar != null) {
                sfVar.pcc(parseInt);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.oo.vy vyVar) {
        this.vgx = vyVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        tsz tszVar = this.zsj;
        if (tszVar != null) {
            tszVar.pcc(sfVar);
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.hc.kj kjVar) {
        if (this.zsj == null || getJsObject() == null) {
            return;
        }
        getJsObject().pcc(kjVar);
    }

    public void sf(int i, int i2) {
        int i3;
        if (TextUtils.equals(this.ork, "banner_ad")) {
            return;
        }
        String str = this.ork;
        int i4 = this.yt;
        int i5 = ((i2 < i4 || i4 < 0 || !(this.qy || TextUtils.equals(str, "open_ad"))) && !((i == 0 && TextUtils.equals(this.ork, "open_ad")) || vj() == 5)) ? 0 : 1;
        if (i2 <= this.yt) {
            com.bytedance.sdk.openadsdk.core.model.of ofVar = this.tmg;
            i3 = (ofVar == null || ofVar.kez() == null) ? this.yt - i2 : (int) (Math.min(this.yt, this.tmg.kez().d * this.tmg.kez().r) - i2);
        } else {
            i3 = 0;
        }
        com.bytedance.sdk.component.adexpress.sf.sf sfVar = this.mk;
        if (sfVar != null && sfVar.sf() != null) {
            this.mk.sf().setTime(String.valueOf(i), i5, i3, false);
        }
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) {
            ((com.bytedance.sdk.openadsdk.core.hc.wh.oo) ooVar).setTime(String.valueOf(i), i5, i3, false);
        }
    }

    public void tmg() {
        tsz tszVar = this.zsj;
        if (tszVar == null || tszVar.vj() == null) {
            return;
        }
        this.zsj.lu();
    }

    public void tz() {
        try {
            FrameLayout frameLayout = this.hc;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.hc);
        } catch (Throwable unused) {
        }
    }

    public void vh() {
        tsz tszVar = this.zsj;
        if (tszVar == null || tszVar.vj() == null) {
            return;
        }
        this.zsj.vy();
    }

    public void vj(int i) {
        if (com.bytedance.sdk.openadsdk.core.model.lo.gm(this.tmg)) {
            com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
            if (ooVar instanceof tsz) {
                ((tsz) ooVar).sf(i);
            }
        }
    }

    public boolean vy() {
        return true;
    }

    public void wh(int i) {
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar == null || !(ooVar instanceof tsz)) {
            return;
        }
        ((tsz) ooVar).pcc(i);
        this.kz = i;
    }

    public void yt() {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.tmg;
        if (ofVar == null || (gto = ofVar.gto()) == null || (pcc = gto.pcc()) == null) {
            return;
        }
        pcc.vj(getVideoProgress());
    }

    public void gm(JSONObject jSONObject) {
    }

    public long gm() {
        return 0L;
    }

    public void wh() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void onvideoComplate() {
    }

    public int vj() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setTimeUpdate(int i) {
    }

    public fum(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, String str) {
        super(context);
        this.pcc = true;
        this.sf = 0;
        this.ork = "embeded_ad";
        this.kj = null;
        this.jr = false;
        this.lu = true;
        this.gpj = -1;
        this.pq = "";
        this.of = false;
        this.kun = true;
        this.yt = -1;
        this.jsj = new com.bytedance.sdk.openadsdk.oo.qf();
        this.tsz = 0L;
        this.lrr = new AtomicBoolean(false);
        this.xb = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                fum fumVar = fum.this;
                if (fumVar.lu && fumVar.ork()) {
                    fum.this.atb();
                    fum fumVar2 = fum.this;
                    fumVar2.removeCallbacks(fumVar2.ri);
                    fum fumVar3 = fum.this;
                    fumVar3.postDelayed(fumVar3.ri, 500L);
                }
            }
        };
        this.ri = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.2
            @Override // java.lang.Runnable
            public void run() {
                boolean pcc = nn.pcc(fum.this, 0, 5, false);
                fum fumVar = fum.this;
                if (pcc) {
                    fumVar.wh(fumVar.getVisibility());
                } else {
                    fumVar.wh(8);
                }
            }
        };
        this.hpk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.3
            @Override // java.lang.Runnable
            public void run() {
                fum.this.wh(0);
            }
        };
        this.fmh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.4
            @Override // java.lang.Runnable
            public void run() {
                fum.this.wh(8);
            }
        };
        this.kz = 8;
        this.ew = new SparseArray<>();
        this.tmh = -1.0f;
        this.gh = -1.0f;
        this.gdh = -1.0f;
        this.otd = -1.0f;
        this.ei = 0L;
        this.ork = str;
        this.vy = context;
        this.tmg = ofVar;
        this.vh = adSlot;
        this.of = false;
        qf();
    }

    public void sf(int i) {
    }

    public boolean sf(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        return true;
    }

    public boolean sf(JSONObject jSONObject) {
        return false;
    }

    public void sf() {
    }

    public void sf(int i, String str) {
        mu yt;
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if (ooVar == null || !(ooVar instanceof tsz) || (yt = ((tsz) ooVar).yt()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i);
            jSONObject.put("flag", str);
            yt.pcc("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public fum(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        super(context);
        this.pcc = true;
        this.sf = 0;
        this.ork = "embeded_ad";
        this.kj = null;
        this.jr = false;
        this.lu = true;
        this.gpj = -1;
        this.pq = "";
        this.of = false;
        this.kun = true;
        this.yt = -1;
        this.jsj = new com.bytedance.sdk.openadsdk.oo.qf();
        this.tsz = 0L;
        this.lrr = new AtomicBoolean(false);
        this.xb = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                fum fumVar = fum.this;
                if (fumVar.lu && fumVar.ork()) {
                    fum.this.atb();
                    fum fumVar2 = fum.this;
                    fumVar2.removeCallbacks(fumVar2.ri);
                    fum fumVar3 = fum.this;
                    fumVar3.postDelayed(fumVar3.ri, 500L);
                }
            }
        };
        this.ri = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.2
            @Override // java.lang.Runnable
            public void run() {
                boolean pcc = nn.pcc(fum.this, 0, 5, false);
                fum fumVar = fum.this;
                if (pcc) {
                    fumVar.wh(fumVar.getVisibility());
                } else {
                    fumVar.wh(8);
                }
            }
        };
        this.hpk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.3
            @Override // java.lang.Runnable
            public void run() {
                fum.this.wh(0);
            }
        };
        this.fmh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.fum.4
            @Override // java.lang.Runnable
            public void run() {
                fum.this.wh(8);
            }
        };
        this.kz = 8;
        this.ew = new SparseArray<>();
        this.tmh = -1.0f;
        this.gh = -1.0f;
        this.gdh = -1.0f;
        this.otd = -1.0f;
        this.ei = 0L;
        this.ork = str;
        this.vy = context;
        this.tmg = ofVar;
        this.vh = adSlot;
        this.of = z;
        this.kun = z2;
        qf();
    }

    public void qf(int i) {
        com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar = this.atb;
        if ((ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.qf) && i == 4) {
            ((com.bytedance.sdk.openadsdk.core.hc.wh.qf) ooVar).ork();
        }
    }

    public void pcc(int i) {
    }

    public void pcc(int i, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
    }

    public void pcc(int i, String str) {
    }

    public void pcc(hc.pcc pccVar) {
    }

    public void pcc(String str, JSONObject jSONObject) {
    }

    public void pcc(boolean z, String str) {
    }

    public boolean pcc(JSONObject jSONObject) {
        return false;
    }

    public void pcc(int i, boolean z, boolean z2) {
        this.lu = z;
        removeCallbacks(this.fmh);
        removeCallbacks(this.hpk);
        if (i == 0) {
            Runnable runnable = this.hpk;
            if (z2) {
                runnable.run();
                return;
            } else {
                postDelayed(runnable, 50L);
                return;
            }
        }
        Runnable runnable2 = this.fmh;
        if (z2) {
            runnable2.run();
        } else {
            postDelayed(runnable2, 50L);
        }
    }

    public void pcc() {
    }

    public static JSONObject pcc(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put(PlayerKt.E_SPORTS_TOP, iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void pcc(com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar;
        this.lrr.set(true);
        this.atb = ooVar;
        ooVar.gm();
        if (this.kz != getWindowVisibility() && vy()) {
            wh(getWindowVisibility());
        }
        if (ooVar.gm() == 3 && (ofVar = this.tmg) != null && ofVar.bg() == 1) {
            this.tmg.tmg(0);
        }
        if (ooVar.gm() != 1 || (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo)) {
            View vj = ooVar.vj();
            if (vj.getParent() != null) {
                ((ViewGroup) vj.getParent()).removeView(vj);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                arrayList.add(getChildAt(i));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof com.bytedance.sdk.component.vy.qf) {
                    removeView((View) arrayList.get(i2));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.lo.gm(this.tmg)) {
                addView(ooVar.vj(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(ooVar.vj());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.of ofVar2 = this.tmg;
        if (ofVar2 != null) {
            com.bytedance.sdk.openadsdk.dax.oo.pcc(ofVar2.vy(), this.tsz, this.ork, ooVar.gm());
        }
        com.bytedance.sdk.component.adexpress.sf.vy vyVar = this.vr;
        if (vyVar != null) {
            ((gbb) vyVar).ork();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.vj;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) gbbVar.gm(), (float) gbbVar.oo());
        }
        if ((this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.qf) && com.bytedance.sdk.openadsdk.core.model.nac.pcc(this.tmg)) {
            jsj();
        }
        if (!com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(this.tmg) && sf(gbbVar)) {
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this, this.tmg, gm(getDynamicShowType()));
        }
        of ofVar3 = this.rj;
        if (ofVar3 != null) {
            ofVar3.pcc(this.tmg, this.ork);
        }
        com.bytedance.sdk.openadsdk.core.model.of ofVar4 = this.tmg;
        if (ofVar4 != null) {
            ofVar4.gh(ooVar.gm());
        }
    }

    public JSONObject pcc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (!(this.atb instanceof tsz)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (ofVar != null) {
                if (ofVar.kx() != null && ofVar.kx().tmg()) {
                    jSONObject.put("engine_version", ofVar.kx().vh());
                } else if (ofVar.uae() != null) {
                    if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar)) {
                        jSONObject.put("engine_version", "v4");
                    } else {
                        jSONObject.put("engine_version", "v3");
                    }
                } else if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar) && com.bytedance.sdk.openadsdk.core.model.lo.vj(ofVar)) {
                    jSONObject.put("engine_version", "v4");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e) {
            e.getMessage();
            return jSONObject;
        }
    }

    public void pcc(com.bytedance.sdk.component.adexpress.sf.oo ooVar) {
        if (this.mu == null) {
            return;
        }
        try {
            if (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.qf) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.hc.wh.qf) ooVar).wh().vh();
                this.tz = viewGroup;
                if (viewGroup != null) {
                    this.mu.sf();
                    View gm = this.mu.gm();
                    if (gm != null) {
                        ViewGroup viewGroup2 = (ViewGroup) gm.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(gm);
                        }
                        this.tz.addView(gm, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        if (ofVar == null) {
            return;
        }
        this.ork = str;
        this.tmg = ofVar;
        this.vh = adSlot;
        this.of = z;
        this.kun = z2;
        int rt = ofVar.rt();
        this.sf = rt;
        if (rt != 10) {
            return;
        }
        this.nn = true;
        qf();
        fum();
        this.nn = false;
    }
}
