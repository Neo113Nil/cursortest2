package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.wh.qy;
import com.bytedance.sdk.component.utils.tz;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gpj implements qf<qy> {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj gm;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.qf oo;
    private qy pcc;
    private Context sf;
    private String vj;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.ork wh;

    public gpj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, String str, com.bytedance.sdk.component.adexpress.dynamic.oo.ork orkVar) {
        this.sf = context;
        this.gm = vjVar;
        this.oo = qfVar;
        this.vj = str;
        this.wh = orkVar;
        vj();
    }

    private void vj() {
        int hpk = this.oo.hpk();
        final com.bytedance.sdk.component.adexpress.dynamic.wh.pcc dynamicClickListener = this.gm.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.vj)) {
            Context context = this.sf;
            qy qyVar = new qy(context, com.bytedance.sdk.component.adexpress.gm.pcc.vy(context), this.wh);
            this.pcc = qyVar;
            if (qyVar.getWriggleLayout() != null) {
                this.pcc.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.pcc.getTopTextView() != null) {
                boolean isEmpty = TextUtils.isEmpty(this.oo.gdh());
                qy qyVar2 = this.pcc;
                if (isEmpty) {
                    qyVar2.getTopTextView().setText(tz.sf(this.sf, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    qyVar2.getTopTextView().setText(this.oo.gdh());
                }
            }
        } else {
            Context context2 = this.sf;
            this.pcc = new qy(context2, com.bytedance.sdk.component.adexpress.gm.pcc.vy(context2), this.wh);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.pcc.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, hpk)));
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setShakeText(this.oo.erj());
        this.pcc.setClipChildren(false);
        final View wriggleProgressIv = this.pcc.getWriggleProgressIv();
        this.pcc.setOnShakeViewListener(new qy.pcc() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.gpj.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public qy gm() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        this.pcc.clearAnimation();
    }
}
