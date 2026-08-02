package com.bytedance.sdk.component.adexpress.dynamic.pcc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mu;
import com.bytedance.sdk.component.adexpress.dynamic.oo.wh;
import com.bytedance.sdk.component.adexpress.dynamic.vj.kj;
import com.bytedance.sdk.component.adexpress.gm;
import com.bytedance.sdk.component.adexpress.sf.gbb;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.bytedance.sdk.component.adexpress.sf.oo;
import com.bytedance.sdk.component.adexpress.sf.qf;
import com.bytedance.sdk.component.adexpress.sf.vh;
import com.bytedance.sdk.component.utils.vy;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements oo<DynamicRootView>, vh {
    private Context gm;
    private AtomicBoolean kj = new AtomicBoolean(false);
    private qf oo;
    private DynamicRootView pcc;
    private ScheduledFuture<?> qf;
    private kj sf;
    private com.bytedance.sdk.component.adexpress.sf.kj vj;
    private hc wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc$pcc, reason: collision with other inner class name */
    public class RunnableC0041pcc implements Runnable {
        private int sf;

        public RunnableC0041pcc(int i) {
            this.sf = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.sf == 2) {
                pcc.this.pcc.callBackRenderFail(pcc.this.sf instanceof com.bytedance.sdk.component.adexpress.dynamic.vj.qf ? Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null);
            }
        }
    }

    public pcc(Context context, boolean z, kj kjVar, hc hcVar, com.bytedance.sdk.component.adexpress.dynamic.wh.pcc pccVar) {
        this.gm = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, z, hcVar, pccVar);
        this.pcc = dynamicRootView;
        this.sf = kjVar;
        this.wh = hcVar;
        dynamicRootView.setRenderListener(this);
        this.wh = hcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        if (kjVar == null) {
            this.pcc.callBackRenderFail(this.sf instanceof com.bytedance.sdk.component.adexpress.dynamic.vj.qf ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE : 113, "layoutUnit is null");
            return;
        }
        this.wh.vj().oo(gm());
        try {
            this.pcc.render(kjVar, gm());
        } catch (Exception e) {
            int i = this.sf instanceof com.bytedance.sdk.component.adexpress.dynamic.vj.qf ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            this.pcc.callBackRenderFail(i, "exception is " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kj() {
        try {
            ScheduledFuture<?> scheduledFuture = this.qf;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.qf.cancel(false);
            this.qf = null;
        } catch (Throwable unused) {
        }
    }

    private boolean qf() {
        DynamicRootView dynamicRootView = this.pcc;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        float f;
        float f2;
        List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> vh;
        if (kjVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> vh2 = kjVar.vh();
        if (vh2 == null || vh2.size() <= 0) {
            f = 0.0f;
        } else {
            f = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2 : vh2) {
                if (kjVar2.qf() > kjVar.qf() - kjVar2.vy() || (vh = kjVar2.vh()) == null || vh.size() <= 0) {
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar3 : vh) {
                        if (kjVar3.ork().sf().equals("logo-union")) {
                            f2 = kjVar3.ork().wh();
                            f = ((kjVar.qf() + (-f2)) - kjVar2.qf()) + kjVar2.ork().vj().rc();
                        }
                    }
                }
                sf(kjVar2);
                if (f2 <= -15.0f) {
                    kjVar2.wh(kjVar2.vy() - f2);
                    kjVar2.oo(kjVar2.qf() + f2);
                    for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar4 : kjVar2.vh()) {
                        kjVar4.oo(kjVar4.qf() - f2);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj tmg = kjVar.tmg();
        if (tmg == null) {
            return;
        }
        float wh = kjVar.wh() - tmg.wh();
        float qf = kjVar.qf() - tmg.qf();
        kjVar.gm(wh);
        kjVar.oo(qf);
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            kjVar.oo(kjVar.qf() - f);
            kjVar.wh(kjVar.vy() + f);
            for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar5 : kjVar.vh()) {
                kjVar5.oo(kjVar5.qf() + f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh() {
        this.wh.vj().sf(gm());
        JSONObject gm = this.wh.gm();
        boolean pcc = com.bytedance.sdk.component.adexpress.pcc.sf.sf.pcc(gm);
        kj kjVar = this.sf;
        if (pcc) {
            kjVar.pcc(new com.bytedance.sdk.component.adexpress.dynamic.wh.sf() { // from class: com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.wh.sf
                public void pcc(final com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2) {
                    pcc.this.kj();
                    pcc.this.wh.vj().gm(pcc.this.gm());
                    pcc.this.pcc(kjVar2);
                    pcc.this.sf(kjVar2);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        pcc.this.gm(kjVar2);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                pcc.this.gm(kjVar2);
                            }
                        });
                    }
                    if (pcc.this.pcc == null || kjVar2 == null) {
                        return;
                    }
                    pcc.this.pcc.setBgColor(kjVar2.pcc());
                    pcc.this.pcc.setBgMaterialCenterCalcColor(kjVar2.sf());
                }
            });
            this.sf.pcc(this.wh);
            return;
        }
        int i = kjVar instanceof com.bytedance.sdk.component.adexpress.dynamic.vj.qf ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE : 113;
        DynamicRootView dynamicRootView = this.pcc;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(gm == null);
        dynamicRootView.callBackRenderFail(i, sb.toString());
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public void pcc(qf qfVar) {
        this.oo = qfVar;
        int wh = this.wh.wh();
        if (wh < 0) {
            this.pcc.callBackRenderFail(this.sf instanceof com.bytedance.sdk.component.adexpress.dynamic.vj.qf ? Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "time is ".concat(String.valueOf(wh)));
            return;
        }
        this.qf = com.bytedance.sdk.component.adexpress.oo.oo.pcc(new RunnableC0041pcc(2), wh, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() != Looper.myLooper() || this.wh.vy() > 0) {
            vy.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.wh();
                }
            }, this.wh.vy());
        } else {
            wh();
        }
    }

    public DynamicRootView oo() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public int gm() {
        return this.sf instanceof com.bytedance.sdk.component.adexpress.dynamic.vj.qf ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> vh;
        if (kjVar == null || (vh = kjVar.vh()) == null || vh.size() <= 0) {
            return;
        }
        Collections.sort(vh, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.pcc.pcc.3
            @Override // java.util.Comparator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar3) {
                wh vj = kjVar2.ork().vj();
                wh vj2 = kjVar3.ork().vj();
                if (vj == null || vj2 == null) {
                    return 0;
                }
                return vj.jq() >= vj2.jq() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2 : vh) {
            if (kjVar2 != null) {
                pcc(kjVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public DynamicRootView vj() {
        return oo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void pcc(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                pcc(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof mu) {
            ((mu) view).sf();
        }
    }

    public void pcc(com.bytedance.sdk.component.adexpress.sf.kj kjVar) {
        this.vj = kjVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(gbb gbbVar) {
        if (this.kj.get()) {
            return;
        }
        this.kj.set(true);
        if (gbbVar.sf() && qf()) {
            this.pcc.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.oo.pcc(vj(), gbbVar);
            return;
        }
        this.oo.pcc(gbbVar.ork(), gbbVar.vy());
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(View view, int i, gm gmVar) {
        com.bytedance.sdk.component.adexpress.sf.kj kjVar = this.vj;
        if (kjVar != null) {
            kjVar.pcc(view, i, gmVar);
        }
    }

    public void sf() {
        pcc(vj());
    }
}
