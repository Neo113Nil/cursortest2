package com.bytedance.sdk.openadsdk.gbb;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.common.tz;
import com.bytedance.sdk.openadsdk.common.vy;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.wh.wh;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private View gm;
    private com.bytedance.sdk.openadsdk.gbb.pcc hc;
    private tz kj;
    private RelativeLayout oo;
    private int ork;
    private final of pcc;
    private ImageView qf;
    private pcc sf;
    private qf tmg = null;
    private wh vh;
    private final Context vj;
    private boolean vy;
    private qf wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(qf qfVar);
    }

    public sf(Context context, of ofVar, int i) {
        this.vy = false;
        this.vj = context;
        this.pcc = ofVar;
        this.vy = i == 1;
        this.ork = i;
        vy();
    }

    private com.bytedance.sdk.openadsdk.core.wh.gm pcc(Context context, boolean z) {
        of ofVar;
        com.bytedance.sdk.openadsdk.core.model.sf bo;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar.setBackgroundColor(-1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        gmVar.addView(relativeLayout, new FrameLayout.LayoutParams(-1, -2));
        vy vyVar = new vy(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        vyVar.setId(nac.wax);
        relativeLayout.addView(vyVar, layoutParams);
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(this.vj.getApplicationContext());
        qf qfVar = z ? new qf(mutableContextWrapper, qf.gm.PRIVACY) : pcc(mutableContextWrapper);
        qfVar.setId(nac.hpk);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = rj.sf(mutableContextWrapper, 44.0f);
        gmVar.addView(qfVar, layoutParams2);
        if (!z && (ofVar = this.pcc) != null && (bo = ofVar.bo()) != null) {
            String oo = bo.oo();
            if (!TextUtils.isEmpty(oo)) {
                com.bytedance.sdk.openadsdk.gbb.pcc pccVar = new com.bytedance.sdk.openadsdk.gbb.pcc(mutableContextWrapper);
                this.hc = pccVar;
                pccVar.setId(nac.ywp);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                this.hc.setPadding(rj.sf(this.vj, 16.0f), rj.sf(this.vj, 16.0f), rj.sf(this.vj, 16.0f), rj.sf(this.vj, 16.0f));
                this.hc.setPrivacyText(oo);
                layoutParams3.gravity = 80;
                gmVar.addView(this.hc, layoutParams3);
            }
        }
        return gmVar;
    }

    private void vy() {
        com.bytedance.sdk.openadsdk.core.wh.gm pcc2 = pcc(this.vj, this.vy);
        this.gm = pcc2;
        this.wh = (qf) pcc2.findViewById(nac.hpk);
        this.oo = (RelativeLayout) this.gm.findViewById(nac.wax);
        tz tzVar = new tz(this.vj, this.oo, this.pcc, this.wh, "iab_".concat(String.valueOf(pcc(this.ork))), this.vy);
        this.kj = tzVar;
        this.qf = tzVar.vj();
        this.vh = this.kj.oo();
        com.bytedance.sdk.openadsdk.gbb.pcc pccVar = this.hc;
        if (pccVar != null) {
            pccVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gbb.sf.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    sf.this.kj.oo("onSelectPrivacy");
                    IABLandingPageActivity.pcc(sf.this.vj, sf.this.pcc, sf.this.pcc.vj());
                }
            });
        }
    }

    public void gm() {
        tz tzVar = this.kj;
        if (tzVar != null) {
            tzVar.gm();
        }
    }

    public void kj() {
        qf qfVar = this.wh;
        if (qfVar != null) {
            mk.pcc(qfVar);
            this.wh = null;
        }
        this.kj = null;
    }

    public void qf() {
        qf qfVar = this.wh;
        if (qfVar != null) {
            qfVar.tmg();
        }
    }

    public void sf() {
        tz tzVar = this.kj;
        if (tzVar != null) {
            tzVar.sf();
        }
    }

    public View wh() {
        if (this.gm == null) {
            vy();
        }
        return this.gm;
    }

    public wh oo() {
        return this.vh;
    }

    public ImageView vj() {
        return this.qf;
    }

    public void sf(String str) {
        this.kj.sf(str);
    }

    public void pcc(pcc pccVar) {
        this.sf = pccVar;
        qf qfVar = this.wh;
        if (qfVar != null && qfVar.isAttachedToWindow()) {
            pccVar.pcc(this.wh);
            return;
        }
        qf qfVar2 = this.wh;
        if (qfVar2 != null) {
            qfVar2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.gbb.sf.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    if (sf.this.sf != null) {
                        sf.this.sf.pcc(sf.this.wh);
                    }
                    sf.this.wh.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
    }

    public void pcc(qf qfVar) {
        this.tmg = qfVar;
    }

    private qf pcc(Context context) {
        qf qfVar = this.tmg;
        if (qfVar != null) {
            this.tmg = null;
            return qfVar;
        }
        return new qf(context, qf.gm.LANDING_PAGE);
    }

    private String pcc(int i) {
        if (i < 0 || i > 2) {
            return "null";
        }
        if (i == 0) {
            return "landing_page";
        }
        if (i == 1) {
            return "private_browser";
        }
        if (i != 2) {
            return "null";
        }
        return "history_landing_page";
    }

    public RelativeLayout pcc() {
        return this.oo;
    }

    public void pcc(WebView webView, qf.pcc pccVar) {
        tz tzVar = this.kj;
        if (tzVar == null || webView == null) {
            return;
        }
        tzVar.pcc(webView, pccVar);
    }

    public void pcc(String str) {
        this.kj.pcc(str);
    }

    public void pcc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        boolean z = bundle.getBoolean("titleBarVisible", true);
        "restoreTitleBarState - visible: ".concat(String.valueOf(z));
        if (z) {
            sf();
        } else {
            gm();
        }
        if (this.kj != null) {
            String string = bundle.getString("mainTitle");
            String string2 = bundle.getString("subTitle");
            if (!TextUtils.isEmpty(string)) {
                pcc(string);
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            sf(string2);
        }
    }
}
