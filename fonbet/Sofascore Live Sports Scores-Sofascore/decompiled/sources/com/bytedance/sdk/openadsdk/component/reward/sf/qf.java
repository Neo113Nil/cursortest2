package com.bytedance.sdk.openadsdk.component.reward.sf;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.component.reward.pcc.hc;
import com.bytedance.sdk.openadsdk.component.reward.view.kj;
import com.bytedance.sdk.openadsdk.core.model.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.nac;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends sf {
    private String dax;
    private ViewGroup gbb;
    private final int hc;
    private com.bytedance.sdk.openadsdk.component.reward.view.wh jr;

    public qf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        super(sfVar);
        this.dax = "fullscreen_interstitial_ad";
        this.hc = this.sf.ct();
    }

    private void atb() {
        lu luVar;
        List<lu> by = this.sf.by();
        if (by == null || by.size() <= 0 || (luVar = by.get(0)) == null) {
            return;
        }
        try {
            int sf = luVar.sf();
            int gm = luVar.gm();
            if (sf != 0 && gm != 0) {
                this.jr.setRatio(sf / gm);
                return;
            }
            int i = this.hc;
            if (i == 33) {
                this.jr.setRatio(1.0f);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.view.wh whVar = this.jr;
            if (i == 3) {
                whVar.setRatio(1.91f);
            } else {
                whVar.setRatio(0.56f);
            }
        } catch (Exception e) {
            lo.gm("TTAD.RFTI", e.getMessage());
        }
    }

    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gm(of ofVar) {
        if (ofVar.az() == 4) {
            return new com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), this.dax);
        }
        return null;
    }

    private void mk() {
        if (this.gbb == null) {
            return;
        }
        pcc((View) this.jr);
    }

    private void sf(of ofVar) {
        if (ofVar == null || this.jr == null) {
            return;
        }
        atb();
        pcc((ImageView) this.jr);
    }

    private void tsz() {
        FrameLayout frameLayout = new FrameLayout(this.pcc.rnn);
        this.gbb = frameLayout;
        frameLayout.setId(nac.we);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.gbb.setLayoutParams(layoutParams);
        View tmg = this.pcc.mu.tmg();
        if (tmg != null) {
            layoutParams.bottomMargin = tmg.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.wh whVar = new com.bytedance.sdk.openadsdk.component.reward.view.wh(this.pcc.rnn);
        this.jr = whVar;
        whVar.setId(nac.gpa);
        FrameLayout.LayoutParams layoutParams2 = this.pcc.sf.ial() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        this.jr.setLayoutParams(layoutParams2);
        this.gbb.addView(this.jr);
        mk();
    }

    private boolean ye() {
        of ofVar = this.sf;
        return ofVar != null && ofVar.ei() == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public boolean oo() {
        return ye();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void pcc(kj kjVar) {
        gbb gbbVar;
        boolean sf = com.bytedance.sdk.openadsdk.core.model.lo.sf(this.sf);
        of ofVar = this.sf;
        if (sf) {
            oo.pcc(kjVar, ofVar);
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            gbb gbbVar2 = sfVar.gh;
            if (gbbVar2 != null) {
                gbbVar2.pcc(sfVar, (long) (sfVar.fum.tsx() * 1000.0d));
                return;
            }
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.lo.oo(ofVar) && !com.bytedance.sdk.openadsdk.core.model.lo.kj(this.sf)) {
            super.pcc(kjVar);
            return;
        }
        oo.sf(kjVar, this.sf);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.pcc;
        if (sfVar2.gdh || (gbbVar = sfVar2.gh) == null) {
            return;
        }
        gbbVar.pcc(sfVar2, (long) (sfVar2.fum.tsx() * 1000.0d));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public boolean vj() {
        return ye();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void wh() {
        if (com.bytedance.sdk.openadsdk.core.model.lo.sf(this.sf)) {
            this.wh.sf(8);
        }
        this.kj.gm(false);
        this.kj.oo(false);
        int ei = this.sf.ei();
        hc hcVar = this.kj;
        if (ei == 2) {
            hcVar.pcc(false);
            this.wh.wh(8);
            return;
        }
        hcVar.pcc(this.sf.dk());
        if (this.pcc.tmh) {
            Message obtain = Message.obtain();
            obtain.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            int tsx = (int) (sfVar.fum.tsx() * 1000.0d);
            sfVar.kj = tsx;
            obtain.arg1 = tsx;
            this.pcc.rj.sendMessage(obtain);
        }
    }

    public void pcc(View view) {
        if (view == null || this.pcc.rnn == null || this.sf == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar = this.vh;
        if (sfVar == null) {
            Activity activity = this.pcc.rnn;
            of ofVar = this.sf;
            String str = this.dax;
            sfVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(activity, ofVar, str, kun.pcc(str));
            sfVar.pcc(gm(this.sf));
            HashMap hashMap = new HashMap();
            hashMap.put("click_scence", 1);
            sfVar.pcc(hashMap);
        }
        Activity activity2 = this.pcc.rnn;
        if (activity2 != null) {
            sfVar.pcc(activity2);
        }
        view.setOnTouchListener(sfVar);
        view.setOnClickListener(sfVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void pcc(FrameLayout frameLayout) {
        try {
            tsz();
            sf(this.sf);
            frameLayout.addView(this.gbb);
        } catch (Exception unused) {
        }
    }

    private void pcc(ImageView imageView) {
        List<lu> by;
        lu luVar;
        of ofVar = this.sf;
        if (ofVar == null || (by = ofVar.by()) == null || by.size() <= 0 || (luVar = by.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ork.oo.pcc(by.get(0)).gm(1).pcc(com.bytedance.sdk.openadsdk.ork.gm.pcc(this.sf, luVar.pcc(), imageView));
    }

    public static boolean pcc(of ofVar) {
        return !of.vj(ofVar) && ofVar.zx() == 100.0f;
    }
}
