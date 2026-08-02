package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.atb;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends com.bytedance.sdk.openadsdk.core.wh.qf {
    private kj gm;
    private com.bytedance.sdk.openadsdk.core.wh.kj oo;
    private nac pcc;
    private com.bytedance.sdk.openadsdk.core.wh.kj sf;
    private boolean vj;
    private boolean wh;

    public qf(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (pcc()) {
            sf();
        }
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.wh.kj getDownloadButton() {
        return this.oo;
    }

    @Nullable
    public kj getLoadingProgressBar() {
        return this.gm;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(of ofVar, int i) {
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar;
        if (!this.vj || ofVar == null || this.wh) {
            return;
        }
        this.wh = true;
        boolean z = !ofVar.zpi() || com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar);
        if (z && ofVar.zk() != null && !TextUtils.isEmpty(ofVar.zk().pcc())) {
            try {
                com.bytedance.sdk.openadsdk.ork.oo.pcc(ofVar.zk()).gm(1).pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, ofVar.zk().pcc(), new atb(this.pcc)));
            } catch (Throwable unused) {
            }
            if (z) {
                this.sf.setText("Loading");
            } else {
                boolean isEmpty = TextUtils.isEmpty(ofVar.gmh());
                com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = this.sf;
                if (isEmpty) {
                    kjVar2.setVisibility(8);
                } else {
                    kjVar2.setText(ofVar.gmh());
                }
            }
            kjVar = this.oo;
            if (kjVar == null) {
                kjVar.setText(ofVar.bgf());
                return;
            }
            return;
        }
        this.pcc.setVisibility(8);
        if (z) {
        }
        kjVar = this.oo;
        if (kjVar == null) {
        }
    }

    public void setProgress(int i) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.setProgress(i);
        }
    }

    public void sf() {
        if (this.vj) {
            return;
        }
        this.vj = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        nac nacVar = new nac(context);
        this.pcc = nacVar;
        nacVar.setId(520093745);
        int sf = rj.sf(context, 64.0f);
        this.pcc.setLayoutParams(new RelativeLayout.LayoutParams(sf, sf));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.sf = kjVar;
        kjVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(rj.sf(context, 219.0f), -2);
        layoutParams2.topMargin = rj.sf(context, 16.0f);
        this.sf.setLayoutParams(layoutParams2);
        this.sf.setEllipsize(TextUtils.TruncateAt.END);
        this.sf.setGravity(17);
        this.sf.setMaxWidth(rj.sf(context, 150.0f));
        this.sf.setMaxLines(2);
        this.sf.setTextColor(-1);
        this.sf.setTextSize(1, 16.0f);
        kj kjVar2 = new kj(context);
        this.gm = kjVar2;
        kjVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(rj.sf(context, 219.0f), rj.sf(context, 6.0f));
        layoutParams3.topMargin = rj.sf(context, 24.0f);
        this.gm.setLayoutParams(layoutParams3);
        this.oo = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(rj.sf(context, 138.0f), rj.sf(context, 42.0f));
        layoutParams4.topMargin = rj.sf(context, 48.0f);
        this.oo.setLayoutParams(layoutParams4);
        this.oo.setTextColor(-1);
        this.oo.setTextSize(16.0f);
        this.oo.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.oo.setBackground(gradientDrawable);
        linearLayout.addView(this.pcc);
        linearLayout.addView(this.sf);
        linearLayout.addView(this.gm);
        linearLayout.addView(this.oo);
        addView(linearLayout);
    }

    public boolean pcc() {
        return true;
    }

    public void pcc(final of ofVar, final Activity activity, final String str) {
        if (ofVar == null || activity == null) {
            return;
        }
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(getContext(), ofVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(12);
        layoutParams.leftMargin = rj.sf(activity, 16.0f);
        layoutParams.bottomMargin = rj.sf(activity, 21.0f);
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams);
        addView(createPAGLogoViewByMaterial, layoutParams);
        createPAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.qf.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.pcc(activity, ofVar, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm("PAGFullScreenLoadingLayout", th.getMessage());
                }
            }
        });
    }
}
