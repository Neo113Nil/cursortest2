package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh {
    private com.bytedance.sdk.openadsdk.core.widget.kj gm;
    private com.bytedance.sdk.openadsdk.core.widget.nac oo;
    protected View pcc = vj();
    protected Context sf;
    private com.bytedance.sdk.openadsdk.core.wh.kj vj;

    public vh(Context context) {
        this.sf = context;
    }

    private View vj() {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this.sf);
        vjVar.setGravity(1);
        vjVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.nac nacVar = new com.bytedance.sdk.openadsdk.core.widget.nac(this.sf);
        this.oo = nacVar;
        nacVar.setId(520093745);
        int sf = rj.sf(this.sf, 64.0f);
        vjVar.addView(this.oo, new LinearLayout.LayoutParams(sf, sf));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(this.sf);
        this.vj = kjVar;
        kjVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rj.sf(this.sf, 219.0f), -2);
        layoutParams.topMargin = rj.sf(this.sf, 16.0f);
        this.vj.setLayoutParams(layoutParams);
        this.vj.setEllipsize(TextUtils.TruncateAt.END);
        this.vj.setGravity(17);
        this.vj.setMaxWidth(rj.sf(this.sf, 150.0f));
        this.vj.setMaxLines(2);
        this.vj.setTextColor(-1);
        this.vj.setTextSize(1, 16.0f);
        vjVar.addView(this.vj);
        this.gm = new com.bytedance.sdk.openadsdk.core.widget.kj(this.sf);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(rj.sf(this.sf, 219.0f), rj.sf(this.sf, 6.0f));
        layoutParams2.topMargin = rj.sf(this.sf, 32.0f);
        vjVar.addView(this.gm, layoutParams2);
        return vjVar;
    }

    public com.bytedance.sdk.openadsdk.core.wh.kj gm() {
        return this.vj;
    }

    public void oo() {
        this.pcc = null;
        this.sf = null;
    }

    public void pcc(int i) {
        this.gm.setProgress(i);
    }

    public com.bytedance.sdk.openadsdk.core.widget.nac sf() {
        return this.oo;
    }

    public View pcc() {
        return this.pcc;
    }
}
