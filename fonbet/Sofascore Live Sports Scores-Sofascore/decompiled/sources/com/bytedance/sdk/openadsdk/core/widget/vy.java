package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends FrameLayout {
    private TextView gm;
    private of kj;
    private dax oo;
    private boolean ork;
    private boolean pcc;
    private com.bytedance.sdk.openadsdk.core.wh.kj qf;
    private nac sf;
    private com.bytedance.sdk.openadsdk.core.gm.pcc vh;
    private TextView vj;
    private String vy;
    private PAGLogoView wh;

    public vy(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.nac.xf);
    }

    private void pcc() {
        if (this.pcc) {
            return;
        }
        this.pcc = true;
        sf();
        this.vj.setOnClickListener(this.vh);
        this.vj.setOnTouchListener(this.vh);
        String bgf = this.kj.bgf();
        if (!TextUtils.isEmpty(bgf)) {
            this.vj.setText(bgf);
        }
        if (this.sf != null && this.kj.zk() != null && !TextUtils.isEmpty(this.kj.zk().pcc())) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.kj.zk(), this.sf, this.kj);
        }
        dax daxVar = this.oo;
        if (daxVar != null) {
            rj.pcc((TextView) null, daxVar, this.kj);
            if (this.kj.xfm() != null) {
                this.oo.setVisibility(0);
            }
        }
        if (this.gm != null) {
            if (this.kj.xfm() == null || TextUtils.isEmpty(this.kj.xfm().sf())) {
                boolean isEmpty = TextUtils.isEmpty(this.kj.ofe());
                TextView textView = this.gm;
                if (isEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(this.kj.ofe());
                }
            } else {
                this.gm.setText(this.kj.xfm().sf());
            }
        }
        if (this.qf != null) {
            String gmh = this.kj.gmh();
            boolean isEmpty2 = TextUtils.isEmpty(gmh);
            com.bytedance.sdk.openadsdk.core.wh.kj kjVar = this.qf;
            if (isEmpty2) {
                kjVar.setVisibility(8);
            } else {
                kjVar.setText(gmh);
            }
        }
        this.wh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.vy.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    if (com.bytedance.sdk.openadsdk.utils.sf.wh() && com.bytedance.sdk.openadsdk.core.lu.oo().atb()) {
                        IABLandingPageActivity.pcc(vy.this.getContext(), vy.this.kj, vy.this.vy);
                    } else {
                        TTWebsiteActivity.pcc(vy.this.getContext(), vy.this.kj, vy.this.vy);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void sf() {
        Context context = getContext();
        boolean z = this.kj.ial() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setGravity(1);
        vjVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(rj.sf(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int sf = rj.sf(context, 24.0f);
        layoutParams.rightMargin = sf;
        layoutParams.leftMargin = sf;
        addView(vjVar, layoutParams);
        nac nacVar = new nac(context);
        this.sf = nacVar;
        nacVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(rj.sf(context, 80.0f), rj.sf(context, 80.0f));
        layoutParams2.bottomMargin = rj.sf(context, 12.0f);
        vjVar.addView(this.sf, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.gm = kjVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar.setEllipsize(truncateAt);
        this.gm.setGravity(17);
        this.gm.setMaxLines(2);
        this.gm.setMaxWidth(rj.sf(context, 180.0f));
        this.gm.setTextColor(-1);
        this.gm.setTextSize(2, 24.0f);
        vjVar.addView(this.gm, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.qf = kjVar2;
        kjVar2.setEllipsize(truncateAt);
        this.qf.setGravity(17);
        this.qf.setMaxLines(2);
        this.qf.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.qf.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = rj.sf(context, 8.0f);
        vjVar.addView(this.qf, layoutParams3);
        this.oo = new dax(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, rj.sf(context, 16.0f));
        layoutParams4.topMargin = rj.sf(context, 12.0f);
        this.oo.setVisibility(8);
        vjVar.addView(this.oo, layoutParams4);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vj = kjVar3;
        kjVar3.setId(520093707);
        this.vj.setGravity(17);
        this.vj.setText(tz.pcc(context, "tt_video_download_apk"));
        this.vj.setTextColor(-1);
        this.vj.setTextSize(2, 16.0f);
        this.vj.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, rj.sf(context, 44.0f));
        layoutParams5.topMargin = rj.sf(context, 54.0f);
        vjVar.addView(this.vj, layoutParams5);
        if (!this.ork && this.kj.aj() && atb.gm(this.kj)) {
            this.vj.setVisibility(8);
        }
        this.wh = PAGLogoView.createPAGLogoViewByMaterial(context, this.kj);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, rj.sf(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = rj.sf(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = rj.sf(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = rj.sf(context, 24.0f);
        }
        addView(this.wh, layoutParams6);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        this.vh = pccVar;
        TextView textView = this.vj;
        if (textView != null) {
            textView.setOnClickListener(pccVar);
            this.vj.setOnTouchListener(this.vh);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            pcc();
        }
    }

    public void pcc(of ofVar, String str, com.bytedance.sdk.openadsdk.core.gm.pcc pccVar, boolean z) {
        this.kj = ofVar;
        this.vy = str;
        this.ork = z;
        this.vh = pccVar;
    }
}
