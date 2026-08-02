package com.bytedance.sdk.component.adexpress.vj;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.bytedance.sdk.component.adexpress.sf.kj;
import com.bytedance.sdk.component.adexpress.sf.vh;
import com.bytedance.sdk.component.utils.gbb;
import com.bytedance.sdk.component.vy.qf;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc implements com.bytedance.sdk.component.adexpress.pcc, com.bytedance.sdk.component.adexpress.sf.oo<qf>, vh {
    private int gbb;
    protected boolean gm;
    private boolean hc;
    private Context kj;
    protected boolean oo;
    private String ork;
    protected JSONObject pcc;
    protected volatile com.bytedance.sdk.component.adexpress.sf.qf sf;
    private hc tmg;
    private kj vh;
    protected qf vj;
    private String vy;
    protected int wh = 8;
    protected AtomicBoolean qf = new AtomicBoolean(false);
    private AtomicBoolean jr = new AtomicBoolean(false);

    public pcc(Context context, hc hcVar) {
        this.gm = false;
        this.kj = context;
        this.tmg = hcVar;
        this.vy = hcVar.oo();
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            jr();
            return;
        }
        qf pcc = pcc(this.kj, this.vy);
        this.vj = pcc;
        if (pcc != null) {
            this.gm = true;
        } else if (com.bytedance.sdk.component.adexpress.oo.pcc() != null) {
            this.vj = new qf(com.bytedance.sdk.component.adexpress.oo.pcc(), qf.gm.ADS);
        }
    }

    private void jr() {
        if (this.kj == null && com.bytedance.sdk.component.adexpress.oo.pcc() != null) {
            this.kj = com.bytedance.sdk.component.adexpress.oo.pcc();
        }
        Context context = this.kj;
        if (context != null) {
            qf pcc = pcc(context, this.vy);
            this.vj = pcc;
            if (pcc == null) {
                this.vj = new qf(new MutableContextWrapper(this.kj.getApplicationContext()), pcc());
            } else {
                this.gm = true;
            }
        }
    }

    public hc gbb() {
        return this.tmg;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public int gm() {
        return 0;
    }

    public void kj() {
        if (this.qf.get()) {
            return;
        }
        this.qf.set(true);
        ork();
        if (this.vj.getParent() != null) {
            ((ViewGroup) this.vj.getParent()).removeView(this.vj);
        }
        this.jr.get();
        if (!this.oo || this.jr.get()) {
            vj.pcc().wh(this.vj);
        } else {
            sf();
        }
    }

    public qf oo() {
        return this.vj;
    }

    public abstract void ork();

    public abstract void pcc(int i);

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public void pcc(com.bytedance.sdk.component.adexpress.sf.qf qfVar) {
        String str;
        this.sf = qfVar;
        if (oo() == null || oo().getWebView() == null) {
            com.bytedance.sdk.component.adexpress.sf.qf qfVar2 = this.sf;
            StringBuilder sb = new StringBuilder("SSWebview null is ");
            sb.append(oo() == null);
            sb.append(" or Webview is null");
            qfVar2.pcc(102, sb.toString());
            return;
        }
        if (TextUtils.isEmpty(this.ork)) {
            this.sf.pcc(102, "url is empty");
            return;
        }
        if (!this.tmg.atb()) {
            if (this.tmg.of()) {
                if (gm() == 9 && !com.bytedance.sdk.component.adexpress.pcc.sf.sf.sf(this.pcc)) {
                    com.bytedance.sdk.component.adexpress.sf.qf qfVar3 = this.sf;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.pcc == null);
                    qfVar3.pcc(103, sb2.toString());
                    return;
                }
            } else if (!com.bytedance.sdk.component.adexpress.pcc.sf.sf.pcc(this.pcc)) {
                com.bytedance.sdk.component.adexpress.sf.qf qfVar4 = this.sf;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.pcc == null);
                qfVar4.pcc(103, sb3.toString());
                return;
            }
        }
        this.tmg.vj().pcc(this.gm);
        if (!this.gm) {
            qf oo = oo();
            oo.dax();
            this.tmg.vj();
            oo.a_(this.ork);
            return;
        }
        try {
            int qy = this.tmg.qy();
            if (this.tmg.of() && qy == 1) {
                this.tmg.gm();
                str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.tmg.gm() + ";") + "window.SDK_TRIGGER_RENDER();";
            } else {
                str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
            }
            wh();
            this.vj.dax();
            this.tmg.vj();
            gbb.pcc(this.vj.getWebView(), str);
        } catch (Exception e) {
            vj.pcc().wh(this.vj);
            this.sf.pcc(102, "load exception is " + e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    /* renamed from: qf, reason: merged with bridge method [inline-methods] */
    public qf vj() {
        return oo();
    }

    public void sf() {
        if (this.tmg.of()) {
            vj.pcc().oo(this.vj);
        } else {
            vj.pcc().vj(this.vj);
        }
    }

    public void vh() {
        tmg();
        Activity pcc = com.bytedance.sdk.component.utils.sf.pcc(this.vj);
        if (pcc != null) {
            this.gbb = sf(pcc);
        }
    }

    public void vy() {
        if (oo() == null) {
            return;
        }
        try {
            oo().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public void hc() {
    }

    public void tmg() {
    }

    public void wh() {
    }

    public boolean sf(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        return gbbVar.sf();
    }

    private int sf(Activity activity) {
        return activity.hashCode();
    }

    public void sf(boolean z) {
        this.jr.set(z);
    }

    public qf.gm pcc() {
        return this.tmg.of() ? qf.gm.ADS_V3 : qf.gm.ADS;
    }

    public qf pcc(Context context, String str) {
        if (this.tmg.of()) {
            return vj.pcc().sf(context, str);
        }
        return vj.pcc().gm(context, str);
    }

    public void pcc(String str) {
        this.ork = str;
    }

    public void pcc(kj kjVar) {
        this.vh = kjVar;
    }

    public void pcc(boolean z) {
        this.hc = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(final com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        if (gbbVar == null) {
            if (this.sf != null) {
                this.sf.pcc(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean sf = sf(gbbVar);
        final float gm = (float) gbbVar.gm();
        final float oo = (float) gbbVar.oo();
        if (gm() == 0 && (gm <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || oo <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            if (this.sf != null) {
                this.sf.pcc(105, "width is " + gm + "height is " + oo);
                return;
            }
            return;
        }
        this.oo = sf;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            pcc(gbbVar, gm, oo);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vj.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.pcc(gbbVar, gm, oo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar, float f, float f2) {
        gbbVar.ork();
        boolean z = this.oo;
        if (z && !this.hc) {
            pcc(f, f2);
            pcc(this.wh);
            if (this.sf != null) {
                this.sf.pcc(oo(), gbbVar);
                return;
            }
            return;
        }
        if (!z) {
            vj.pcc().wh(this.vj);
        }
        pcc(gbbVar.ork(), gbbVar.vy());
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        kj kjVar = this.vh;
        if (kjVar != null) {
            kjVar.pcc(view, i, gmVar);
        }
    }

    private void pcc(float f, float f2) {
        this.tmg.vj().vj();
        if (gm() != 9 && gm() != 11) {
            int pcc = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.kj, f);
            int pcc2 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.kj, f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oo().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(pcc, pcc2);
            }
            layoutParams.width = pcc;
            layoutParams.height = pcc2;
            oo().setLayoutParams(layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) oo().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        oo().setLayoutParams(layoutParams2);
    }

    private void pcc(int i, String str) {
        if (this.sf != null) {
            this.sf.pcc(i, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.pcc
    public void pcc(Activity activity) {
        if (this.gbb == 0 || activity == null || activity.hashCode() != this.gbb) {
            return;
        }
        kj();
        hc();
    }

    public void pcc(JSONObject jSONObject) {
        this.pcc = jSONObject;
    }
}
