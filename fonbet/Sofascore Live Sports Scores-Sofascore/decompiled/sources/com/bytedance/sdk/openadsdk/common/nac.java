package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.gm.ork;
import com.bytedance.sdk.openadsdk.gm.tmg;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac extends com.bytedance.sdk.openadsdk.core.wh.gm implements ork.sf {
    private pcc gm;
    private Context oo;
    private View pcc;
    private final com.bytedance.sdk.openadsdk.gm.ork qf;
    private of sf;
    private String vj;
    private boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(View view);

        void pcc(FilterWord filterWord);

        void sf(View view);
    }

    public nac(@NonNull Context context, @NonNull of ofVar) {
        this(context.getApplicationContext());
        this.sf = ofVar;
        this.oo = context;
        oo();
        vj();
    }

    private void oo() {
        this.qf.pcc(this.sf.hl());
        this.qf.pcc(this);
    }

    private void pcc(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.nac.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.gm.ork orkVar = nac.this.qf;
                nac nacVar = nac.this;
                if (orkVar != null) {
                    nacVar.qf.vj();
                } else {
                    nacVar.sf();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.pcc = new com.bytedance.sdk.openadsdk.gm.vy(context, this.qf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = rj.sf(getContext(), 20.0f);
        layoutParams.rightMargin = rj.sf(getContext(), 20.0f);
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setClickable(true);
        vj();
    }

    private void vj() {
        com.bytedance.sdk.openadsdk.gm.ork orkVar;
        of ofVar = this.sf;
        if (ofVar == null || (orkVar = this.qf) == null) {
            return;
        }
        orkVar.pcc(ofVar.ywc());
    }

    private tmg.pcc wh() {
        return new tmg.pcc() { // from class: com.bytedance.sdk.openadsdk.common.nac.2
            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void gm() {
                nac.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void pcc(int i, FilterWord filterWord, String str) {
                nac.this.qf.gm(str);
                nac.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void sf() {
                nac.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void pcc() {
                nac.this.setVisibility(8);
            }
        };
    }

    public void gm() {
        Context context = this.oo;
        if (context instanceof Activity) {
            boolean isFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.gm.tmg tmgVar = new com.bytedance.sdk.openadsdk.gm.tmg(this.oo, this.qf);
            tmgVar.pcc(wh());
            tmgVar.pcc(this.sf);
            if (isFinishing || tmgVar.isShowing()) {
                return;
            }
            tmgVar.show();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.gm.ork orkVar = this.qf;
        if (orkVar != null) {
            orkVar.pcc();
        }
    }

    public void setCallback(pcc pccVar) {
        this.gm = pccVar;
    }

    public void setDislikeSource(String str) {
        this.vj = str;
        this.qf.sf(str);
    }

    public void sf() {
        setVisibility(8);
        this.wh = false;
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.sf(this);
        }
    }

    public nac(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public nac(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nac(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.wh = false;
        this.qf = new com.bytedance.sdk.openadsdk.gm.ork();
        pcc(context, attributeSet);
    }

    public void pcc() {
        if (this.pcc.getParent() == null) {
            addView(this.pcc);
        }
        setVisibility(0);
        this.wh = true;
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gm.ork.sf
    public void pcc(int i) {
        if (com.bytedance.sdk.openadsdk.gm.ork.sf == i) {
            FilterWord sf = this.qf.sf();
            if (sf == null || com.bytedance.sdk.openadsdk.gm.ork.pcc.equals(sf)) {
                return;
            }
            pcc pccVar = this.gm;
            if (pccVar != null) {
                try {
                    pccVar.pcc(sf);
                } catch (Throwable unused) {
                }
            }
            sf();
            return;
        }
        if (com.bytedance.sdk.openadsdk.gm.ork.gm == i) {
            sf();
        } else if (com.bytedance.sdk.openadsdk.gm.ork.vj == i) {
            gm();
        }
    }
}
