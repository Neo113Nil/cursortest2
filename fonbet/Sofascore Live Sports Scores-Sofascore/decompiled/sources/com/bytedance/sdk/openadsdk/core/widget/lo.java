package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.utils.rj;
import defpackage.swm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo {
    private Context gm;
    private ViewGroup kj;
    private com.bytedance.sdk.openadsdk.core.jr.sf.pcc oo;
    private View pcc;
    private swm qf;
    private TextView sf;
    private sf vj;
    private boolean wh = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        boolean ork();

        void vh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        if (this.gm == null) {
            return;
        }
        oo();
    }

    private void oo() {
        View view = this.pcc;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void pcc(swm swmVar, boolean z) {
        View view;
        String str;
        View view2;
        if (swmVar == null || (view = this.pcc) == null || this.gm == null || view.getVisibility() == 0) {
            return;
        }
        sf sfVar = this.vj;
        if (sfVar != null) {
            sfVar.vh();
        }
        double ceil = Math.ceil((swmVar.c * 1.0d) / 1048576.0d);
        Context context = this.gm;
        if (z) {
            str = String.format(tz.pcc(context, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = tz.pcc(context, "tt_video_without_wifi_tips") + tz.pcc(this.gm, "tt_video_bytesize");
        }
        rj.pcc(this.pcc, 0);
        rj.pcc(this.sf, str);
        if (!rj.oo(this.pcc) || (view2 = this.pcc) == null) {
            return;
        }
        view2.bringToFront();
    }

    private void sf() {
        this.qf = null;
    }

    public void pcc(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.kj = viewGroup;
        this.gm = com.bytedance.sdk.openadsdk.core.lu.pcc().getApplicationContext();
    }

    private void pcc(Context context, View view, boolean z) {
        ViewGroup.LayoutParams pcc2;
        if (context == null || view == null || this.pcc != null || (pcc2 = pcc(this.kj)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.jr.vj vjVar = new com.bytedance.sdk.openadsdk.jr.vj(context);
        this.pcc = vjVar;
        vjVar.setLayoutParams(pcc2);
        this.kj.addView(this.pcc);
        this.sf = (TextView) this.pcc.findViewById(com.bytedance.sdk.openadsdk.utils.nac.fi);
        View findViewById = this.pcc.findViewById(com.bytedance.sdk.openadsdk.utils.nac.dk);
        if (z) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.lo.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    lo.this.gm();
                    if (lo.this.oo != null) {
                        lo.this.oo.pcc(pcc.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            findViewById.setOnClickListener(null);
            findViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams pcc(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.sf.pcc pccVar, sf sfVar) {
        this.vj = sfVar;
        this.oo = pccVar;
    }

    public boolean pcc(int i, swm swmVar, boolean z) {
        Context context = this.gm;
        if (context == null || swmVar == null) {
            return true;
        }
        pcc(context, this.kj, z);
        this.qf = swmVar;
        if (i == 1 || i == 2) {
            return pcc(i);
        }
        return true;
    }

    private boolean pcc(int i) {
        sf sfVar;
        if (pcc() || this.wh) {
            return true;
        }
        if (this.oo != null && (sfVar = this.vj) != null) {
            if (sfVar.ork()) {
                this.oo.vj(null, null);
            }
            this.oo.pcc(pcc.PAUSE_VIDEO, (String) null);
        }
        pcc(this.qf, true);
        return false;
    }

    public void pcc(boolean z) {
        if (z) {
            sf();
        }
        oo();
    }

    public boolean pcc() {
        View view = this.pcc;
        return view != null && view.getVisibility() == 0;
    }
}
