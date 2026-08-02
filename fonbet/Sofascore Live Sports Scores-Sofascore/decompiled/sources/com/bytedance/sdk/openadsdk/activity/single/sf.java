package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.component.reward.lu;
import com.bytedance.sdk.openadsdk.component.reward.nac;
import com.bytedance.sdk.openadsdk.component.reward.pcc.tmg;
import com.bytedance.sdk.openadsdk.component.reward.tmg;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.yt;
import com.bytedance.sdk.openadsdk.hc.ork;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private static com.bytedance.sdk.openadsdk.pcc.gm.sf gm;
    private static com.bytedance.sdk.openadsdk.pcc.vj.pcc sf;
    private Runnable dax;
    private int gbb;
    private boolean gpj;
    private Activity hc;
    private Bundle jr;
    private com.bytedance.sdk.openadsdk.pcc.gm.sf kj;
    private final boolean lo;
    private boolean lu;
    private final of oo;
    private final boolean ork;
    public tmg pcc;
    private com.bytedance.sdk.openadsdk.pcc.vj.pcc qf;
    private final boolean tmg;
    private com.bytedance.sdk.openadsdk.activity.single.gm vh;
    private final boolean vy;
    private final ork wh;
    private final Bundle vj = new Bundle();
    private final tmg.sf nac = new tmg.sf();
    private final boolean fum = com.bytedance.sdk.openadsdk.yt.vj.vh();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm implements Runnable {
        private final of pcc;

        public gm(of ofVar) {
            this.pcc = ofVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.pcc.duh() || of.wh(this.pcc)) {
                return;
            }
            if (this.pcc.tuy()) {
                if (com.bytedance.sdk.openadsdk.utils.sf.oo()) {
                    lu.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(this.pcc.gqd());
                    return;
                } else {
                    nac.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(this.pcc.gqd());
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.sf.oo()) {
                com.bytedance.sdk.openadsdk.component.reward.qf.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(this.pcc.gqd());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.wh.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(this.pcc.gqd());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends AbstractC0065sf {
        public pcc(sf sfVar, of ofVar, com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar) {
            super(sfVar, ofVar, gmVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.sf.AbstractC0065sf
        public int pcc(of ofVar) {
            if (ofVar != null) {
                return ofVar.cm();
            }
            return 5;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class vj {
        public final com.bytedance.sdk.openadsdk.component.reward.pcc.sf gm;
        public boolean oo;
        public final Bundle pcc = new Bundle();
        public final int sf;
        public boolean vj;

        public vj(int i, com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
            this.sf = i;
            this.gm = sfVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    public sf(Activity activity, of ofVar, boolean z) {
        this.oo = ofVar;
        this.gpj = z;
        this.hc = activity;
        this.wh = new ork(activity.getApplicationContext());
        boolean xb = ofVar.xb();
        this.vy = xb;
        boolean z2 = false;
        this.ork = xb && 39 == ofVar.bg();
        if (xb && 40 == ofVar.bg()) {
            z2 = true;
        }
        this.tmg = z2;
        int bg = ofVar.bg();
        if (bg == 43 || bg == 44) {
            this.vh = new com.bytedance.sdk.openadsdk.activity.single.oo(this.hc, ofVar, this);
        } else {
            this.vh = new vy(this.hc, ofVar, this);
        }
        this.lo = com.bytedance.sdk.openadsdk.utils.sf.pcc();
        this.vh.pcc();
        pq();
    }

    private void pq() {
        if (this.oo.tuy()) {
            this.pcc = new com.bytedance.sdk.openadsdk.component.reward.tmg(new tmg.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.sf.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.tmg.pcc
                public void pcc(int i, boolean z) {
                    kj vh;
                    if (sf.this.tmg().getBoolean("reward_verify", false) || sf.this.nac()) {
                        return;
                    }
                    if ((z || !sf.this.hc()) && (vh = sf.this.vh()) != null) {
                        vh.gm(i);
                    }
                }
            });
        }
    }

    public void atb() {
        this.vh.nac();
    }

    public void dax() {
        if (gpj()) {
            return;
        }
        fum();
        Objects.toString(this.qf);
        Objects.toString(this.kj);
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.qf;
        if (pccVar != null) {
            pccVar.pcc();
        } else {
            com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.kj;
            if (sfVar != null) {
                sfVar.pcc();
            } else {
                kj vh = vh();
                com.bytedance.sdk.openadsdk.oo.ork.pcc(this.oo, "show", vh != null ? vh.kun() : 0);
            }
        }
        Runnable runnable = this.dax;
        if (runnable != null) {
            runnable.run();
            this.dax = null;
        }
    }

    public void fum() {
        this.oo.kj(true);
        this.vh.dax();
    }

    public void gbb() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.qf;
        if (pccVar != null) {
            pccVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.kj;
        if (sfVar != null) {
            sfVar.onAdClicked();
        }
    }

    public void gm(TTAdActivity tTAdActivity) {
        this.gbb = 4;
        this.vh.gm();
        com.bytedance.sdk.openadsdk.component.reward.tmg tmgVar = this.pcc;
        if (tmgVar != null) {
            tmgVar.pcc();
        }
    }

    public boolean gpj() {
        return this.oo.kun();
    }

    public boolean hc() {
        return this.oo.dax();
    }

    public void jr() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.qf;
        if (pccVar != null) {
            pccVar.sf();
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.kj;
        if (sfVar != null) {
            sfVar.sf();
        } else {
            kj vh = vh();
            com.bytedance.sdk.openadsdk.oo.ork.pcc(this.oo, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, vh != null ? vh.kun() : 0);
        }
    }

    public boolean jsj() {
        return this.vh instanceof com.bytedance.sdk.openadsdk.activity.single.oo;
    }

    public Activity kj() {
        com.bytedance.sdk.openadsdk.activity.single.gm gmVar = this.vh;
        return gmVar == null ? this.hc : gmVar.pcc;
    }

    public boolean lo() {
        return this.vh.oo();
    }

    public void lq() {
        this.vh.gpj();
    }

    public void lu() {
        of ofVar = this.oo;
        if (ofVar != null) {
            ofVar.vy(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.tmg tmgVar = this.pcc;
        if (tmgVar != null) {
            tmgVar.gm();
        }
    }

    public List<of> mk() {
        return this.vh.jr();
    }

    public boolean nac() {
        of ofVar = this.oo;
        return ofVar != null && ofVar.rj();
    }

    public boolean of() {
        return this.vh.vj();
    }

    public void oo(TTAdActivity tTAdActivity) {
        this.gbb = 5;
        this.vh.qf();
    }

    public int ork() {
        return this.vh.ork();
    }

    public void pcc(final kj kjVar, final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        Activity activity;
        if (!gpj()) {
            this.dax = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.sf.2
                @Override // java.lang.Runnable
                public void run() {
                    sf.this.pcc(kjVar, z, i, str, i2, str2, i3);
                }
            };
            return;
        }
        if (nac()) {
            return;
        }
        lu();
        if (this.qf == null || (activity = this.hc) == null) {
            com.bytedance.sdk.openadsdk.component.reward.tmg.pcc(this.oo, false, i3);
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.sf.3
                @Override // java.lang.Runnable
                public void run() {
                    sf.this.qf.pcc(z, i, str, i2, str2);
                }
            });
            com.bytedance.sdk.openadsdk.component.reward.tmg.pcc(this.oo, z, i3);
        }
    }

    public void qf() {
        Activity activity = this.hc;
        if (activity != null) {
            activity.finish();
        }
    }

    public kj qy() {
        return this.vh.hc();
    }

    public void sf(kj kjVar) {
        kjVar.pcc(this.hc, this.jr);
        int i = this.gbb;
        if (i == 2) {
            kjVar.hc();
            return;
        }
        if (i == 3) {
            kjVar.hc();
            kjVar.gm();
            kjVar.gm(true);
        } else if (i == 4) {
            kjVar.gm(false);
            kjVar.gbb();
        } else {
            if (i != 5) {
                return;
            }
            kjVar.oo();
        }
    }

    public Bundle tmg() {
        return this.vj;
    }

    public boolean tsz() {
        return this.lu;
    }

    public ork tz() {
        return this.wh;
    }

    public kj vh() {
        return this.vh.vh();
    }

    public boolean vj() {
        if (this.oo != null && this.vy) {
            return this.ork || this.tmg;
        }
        return false;
    }

    public void vy() {
        this.vh.vy();
    }

    public boolean wh() {
        return this.vy;
    }

    public void ye() {
        this.vh.lu();
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.gm yt() {
        return this.vh.tmg();
    }

    public int zti() {
        return this.vh.kj();
    }

    public boolean oo() {
        return this.tmg;
    }

    public boolean gm() {
        return this.fum;
    }

    public void gm(boolean z) {
        this.lu = z;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.sf$sf, reason: collision with other inner class name */
    public static abstract class AbstractC0065sf implements Handler.Callback {
        private boolean atb;
        private boolean dax;
        private int fum;
        private boolean gbb;
        protected float gm;
        private boolean iv;
        private boolean jr;
        private boolean jsj;
        private int kun;
        private int lo;
        private int lrr;
        private float lu;
        private int mk;
        private int mu;
        private boolean nac;
        private boolean nn;
        private int of;
        protected int oo;
        protected final sf pcc;
        private int pq;
        private int qy;
        private boolean ri;
        private int rj;
        private boolean rnn;
        protected of sf;
        private final Context tmg;
        private boolean tsx;
        private boolean tsz;
        private int tz;
        private final com.bytedance.sdk.openadsdk.component.reward.top.gm vh;
        protected int vj;
        protected int wh;
        private boolean xb;
        private int ye;
        private int yt;
        private int zti;
        private final Handler ork = new Handler(Looper.getMainLooper(), this);
        private final int hc = 1000;
        protected int qf = -1;
        private int gpj = 1000;
        private boolean lq = false;
        boolean kj = false;
        public int vy = -1;

        public AbstractC0065sf(sf sfVar, of ofVar, com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar) {
            this.pcc = sfVar;
            this.sf = ofVar;
            this.vh = gmVar;
            this.tmg = gmVar.getContext();
            this.oo = pcc(ofVar);
        }

        private void gbb() {
            kj vh;
            this.xb = true;
            this.pq = 0;
            sf sfVar = this.pcc;
            if (sfVar == null || (vh = sfVar.vh()) == null || vh.vr()) {
                return;
            }
            tmg();
        }

        private void hc() {
            int i = this.pq;
            int i2 = this.kun;
            boolean z = this.xb;
            int i3 = this.lrr;
            int i4 = this.rj;
            if (i < i2 || z) {
                return;
            }
            if (i3 >= i4) {
                this.iv = false;
            } else {
                this.lrr = i3 + 1;
                gbb();
            }
        }

        private void ork() {
            int i = this.qf;
            if (i > 0) {
                i--;
                this.qf = i;
            }
            if (i == 0 && this.nac) {
                this.nac = false;
                sf sfVar = this.pcc;
                if (sfVar == null || sfVar.vh() == null) {
                    return;
                }
                kj vh = this.pcc.vh();
                if (vh instanceof com.bytedance.sdk.openadsdk.activity.single.vj) {
                    ((com.bytedance.sdk.openadsdk.activity.single.vj) vh).fum();
                }
            }
        }

        private void tmg() {
            com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar;
            if (this.atb || this.jr || this.dax || (gmVar = this.vh) == null) {
                return;
            }
            gmVar.setShowEndCardNextAd(true, this.sf);
        }

        private void vh() {
            if (this.pcc.lo()) {
                this.vh.showSkipButton();
                this.jr = true;
            } else {
                this.dax = true;
                this.vh.showCloseButton();
            }
            this.vh.setShowPlayableNextAd(false, this.sf);
        }

        public void gm(int i) {
            this.qf = i;
            if (i > 0) {
                this.nac = true;
                if (this.oo <= 0 || this.jr) {
                    oo(3);
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                pcc(message);
            } else if (i == 2) {
                pcc(message);
            } else if (i == 3) {
                if (this.qf > 0) {
                    ork();
                    if (this.qf >= 0) {
                        pcc(message.what, 1000);
                    }
                }
            } else if (i == 4) {
                if (this.ri) {
                    vj();
                    if (this.ri && !this.atb) {
                        pcc(message.what, 1000);
                    }
                }
            } else if (i == 5 && this.iv) {
                qf();
                if (this.iv && !this.atb) {
                    pcc(message.what, 1000);
                }
            }
            return true;
        }

        public void kj() {
            if (this.iv) {
                tmg();
                this.xb = false;
            }
        }

        public void oo() {
            if (this.jr || this.dax) {
                return;
            }
            pcc(-1);
            this.lq = true;
            com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.vh;
            if (gmVar != null) {
                gmVar.setCountDownFor1InN("", -1);
                this.vh.setShowEndCardNextAd(true, this.sf);
            }
        }

        public abstract int pcc(of ofVar);

        public void pcc(int i, of ofVar) {
            int i2;
            if (ofVar != null && ofVar.uk() != null) {
                this.lu = ofVar.uk().pcc();
                this.sf = ofVar;
            }
            int i3 = this.oo;
            boolean z = this.jr;
            boolean z2 = this.dax;
            int i4 = this.wh;
            if (z || z2) {
                return;
            }
            float f = i;
            this.gm = f;
            if (f <= i3) {
                this.wh = 2;
                int i5 = (int) f;
                this.oo = i5;
                i3 = i5;
                i2 = 2;
            } else if (i4 == 0) {
                this.wh = 1;
                i2 = 1;
            } else {
                i2 = i4;
            }
            if (!this.gbb) {
                this.vj = i3;
                this.gbb = true;
            }
            if (i4 == i2 && this.ork.hasMessages(i2)) {
                return;
            }
            this.ork.removeCallbacksAndMessages(null);
            this.ork.sendEmptyMessage(this.wh);
        }

        public void qf() {
            if (this.tsz && this.iv && !this.atb) {
                int i = this.zti;
                int i2 = this.pq;
                boolean z = this.jsj;
                int i3 = i + 1;
                this.zti = i3;
                this.pq = i2 + 1;
                if (z && i3 >= this.mu) {
                    tmg();
                }
                if (this.rnn || this.nn) {
                    hc();
                }
            }
        }

        public void sf(int i) {
            if (this.vy != 2 || i == 1) {
                if (i != -1) {
                    this.vy = i;
                }
                if (this.ork.hasMessages(this.wh) || this.lq) {
                    return;
                }
                sf sfVar = this.pcc;
                if (sfVar == null || sfVar.vh() == null || this.pcc.vh().yt() == null || !this.pcc.vh().yt().ork.get()) {
                    int i2 = this.oo;
                    boolean z = this.jr;
                    int i3 = this.wh;
                    if (i3 == 1 || i3 == 2) {
                        if (i2 < 0 || z || this.dax) {
                            return;
                        }
                        this.ork.sendEmptyMessageDelayed(i3, this.gpj);
                        return;
                    }
                    if (i3 == 3) {
                        oo(3);
                    } else if (i3 == 4) {
                        vj(4);
                    } else if (i3 == 5) {
                        pcc(5, true);
                    }
                }
            }
        }

        public void vj() {
            if (this.tsz && this.ri) {
                if (this.dax) {
                    this.ri = false;
                }
                if (this.atb) {
                    return;
                }
                int i = this.mk;
                boolean z = this.jsj;
                int i2 = i + 1;
                this.mk = i2;
                if (z) {
                    this.yt = this.of;
                } else {
                    this.yt = this.lo + this.fum;
                }
                if (i2 >= this.lo) {
                    if (!this.kj) {
                        this.ye++;
                        this.kj = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.oo);
                            jSONObject.put("hint_sequence", this.ye);
                            com.bytedance.sdk.openadsdk.oo.gm.oo(this.sf, this.pcc.vh().d_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.single.gm gmVar = this.pcc.vh;
                    int i3 = this.qy;
                    this.qy = i3 - 1;
                    gmVar.pcc(i3, this.oo);
                } else {
                    this.kj = false;
                    this.pcc.vh.pcc(-1, this.oo);
                }
                if (this.jsj && this.mk >= this.tz) {
                    boolean z2 = this.jr;
                    boolean z3 = this.dax;
                    if (!z2 && !z3) {
                        this.vh.setShowPlayableNextAd(true, this.sf);
                    }
                }
                if (this.mk < this.yt || this.pcc.vh() == null) {
                    return;
                }
                kj vh = this.pcc.vh();
                if (vh instanceof com.bytedance.sdk.openadsdk.activity.single.vj) {
                    this.ork.removeMessages(4);
                    ((com.bytedance.sdk.openadsdk.activity.single.vj) vh).fum();
                }
            }
        }

        public void vy() {
            if (this.iv) {
                this.xb = true;
            }
        }

        public void wh() {
            this.tsz = true;
        }

        public void gm() {
            this.ork.removeMessages(this.wh);
        }

        private void oo(int i) {
            if (this.qf > 0 && this.nac && i == 3) {
                this.wh = i;
                pcc(i, 1000);
            }
        }

        public int pcc() {
            return this.oo;
        }

        public void pcc(boolean z) {
            this.jsj = z;
            this.pq = 0;
            if (z) {
                int i = this.of;
                int i2 = this.fum;
                this.lo = i - i2;
                this.qy = i2;
                this.yt = i;
            }
        }

        public void pcc(int i) {
            int i2 = this.wh;
            if (i != -1) {
                this.vy = i;
            }
            this.ork.removeMessages(i2);
        }

        private void pcc(@NonNull Message message) {
            if (this.oo > 0) {
                int i = (int) (((r1 - r0) * 100.0d) / this.vj);
                com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.vh;
                StringBuilder sb = new StringBuilder();
                int i2 = this.oo;
                this.oo = i2 - 1;
                sb.append(i2);
                sb.append("s");
                gmVar.setCountDownFor1InN(sb.toString(), i);
                ork();
                vj();
                if (this.oo >= 0) {
                    pcc(message.what, this.gpj);
                }
                qf();
                return;
            }
            oo(3);
            vj(4);
            pcc(5, true);
            vh();
        }

        private void pcc(int i, int i2) {
            if (this.lq) {
                return;
            }
            this.ork.removeMessages(i);
            this.ork.sendEmptyMessageDelayed(i, i2);
        }

        private void pcc(int i, boolean z) {
            if (this.iv && i == 5) {
                this.wh = i;
                if (z) {
                    pcc(i, 1000);
                } else {
                    this.ork.sendEmptyMessage(i);
                }
            }
        }

        public void pcc(of ofVar, boolean z) {
            this.lo = atb.fum(ofVar);
            this.fum = atb.qy(ofVar);
            this.tz = atb.jsj(ofVar);
            this.of = atb.tsz(ofVar);
            this.qy = this.fum;
            this.tsz = false;
            this.jsj = false;
            this.mk = 0;
            this.ri = true;
            com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.vh;
            if (gmVar != null) {
                gmVar.setShowPlayableNextAd(false, ofVar);
            }
            this.atb = z;
            if (this.oo <= 0 || this.jr) {
                vj(4);
            }
        }

        public void sf() {
            this.ri = false;
            this.iv = false;
            this.kj = false;
            this.ye = 0;
            this.vy = -1;
            this.xb = false;
            this.rj = 0;
            this.pq = 0;
            this.zti = 0;
            this.jsj = false;
            this.lrr = 0;
            this.lq = false;
            com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar = this.vh;
            if (gmVar != null) {
                gmVar.setShowPlayableNextAd(false, this.sf);
            }
        }

        public void pcc(kj kjVar) {
            of ofVar;
            yt pcc;
            if (kjVar == null || (ofVar = kjVar.wh) == null || (pcc = ofVar.pcc()) == null) {
                return;
            }
            this.mu = pcc.gm();
            this.atb = kjVar.nac;
            this.rj = pcc.pcc();
            this.tsx = kjVar.dax;
            this.kun = pcc.sf();
            this.nn = lo.qf(kjVar.wh);
            this.rnn = lo.wh(kjVar.wh);
            this.iv = true;
            if ((this.oo <= 0 || this.jr) && !this.ork.hasMessages(5)) {
                pcc(5, false);
            }
        }

        public void sf(boolean z) {
            if (z) {
                this.gpj = (int) (1000.0f / this.lu);
            } else {
                this.gpj = 1000;
            }
        }

        private void vj(int i) {
            if (this.ri && i == 4) {
                this.wh = i;
                pcc(i, 1000);
            }
        }
    }

    public void vj(TTAdActivity tTAdActivity) {
        this.gbb = 6;
        this.vh.pcc(tTAdActivity);
        this.nac.pcc(tTAdActivity);
        this.hc = null;
    }

    public boolean sf() {
        return this.lo;
    }

    public void sf(TTAdActivity tTAdActivity) {
        this.gbb = 3;
        this.vh.sf();
        com.bytedance.sdk.openadsdk.component.reward.tmg tmgVar = this.pcc;
        if (tmgVar != null) {
            tmgVar.sf();
        }
        this.nac.pcc(tTAdActivity, this.oo.ial(), this.oo.zx(), this.lo);
    }

    public void sf(boolean z) {
        try {
            of ofVar = this.oo;
            if (ofVar != null) {
                ofVar.gm(z);
            }
            com.bytedance.sdk.openadsdk.component.reward.tmg.pcc(this.oo, false, 3);
        } catch (Throwable unused) {
        }
    }

    public void sf(kj kjVar, vj vjVar) {
        this.vh.pcc(kjVar, vjVar);
    }

    public void sf(kj kjVar, int i) {
        this.vh.sf(kjVar, i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class oo extends AbstractC0065sf {
        private final int ork;
        private boolean tmg;
        private int vh;

        public oo(sf sfVar, of ofVar, com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar) {
            super(sfVar, ofVar, gmVar);
            if (ofVar == null) {
                this.ork = 100;
            } else if (ofVar.vgx() >= 0) {
                this.ork = Math.min(100, ofVar.vgx());
            } else {
                this.ork = com.bytedance.sdk.openadsdk.core.lu.oo().tsz(String.valueOf(ofVar.kot())).wh;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.sf.AbstractC0065sf, android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (!this.tmg && this.oo <= this.vh) {
                this.tmg = true;
                kj vh = this.pcc.vh();
                if (vh != null) {
                    vh.zsj();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.sf.AbstractC0065sf
        public void pcc(int i, of ofVar) {
            boolean z = this.wh == 0;
            int i2 = this.oo;
            super.pcc(i, ofVar);
            if (!z) {
                if (this.gm < i2) {
                    this.vh = (int) ((1.0f - (this.ork / 100.0f)) * this.oo);
                    return;
                }
                return;
            }
            if (this.wh == 1) {
                this.vh = 3;
            } else {
                this.vh = (int) ((1.0f - (this.ork / 100.0f)) * this.gm);
            }
            com.bytedance.sdk.openadsdk.component.reward.tmg tmgVar = this.pcc.pcc;
            if (tmgVar != null) {
                tmgVar.pcc(this.oo);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.sf.AbstractC0065sf
        public int pcc(of ofVar) {
            if (ofVar != null) {
                return ofVar.jla();
            }
            return 30;
        }
    }

    public of pcc() {
        return this.oo;
    }

    public boolean pcc(of ofVar) {
        return (ofVar == null || lo.gbb(ofVar) || ofVar.jkt() || ofVar.nfv() == null || ofVar.nfv().oo() <= 0) ? false : true;
    }

    public void pcc(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar, com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar) {
        this.jr = bundle;
        this.gbb = 1;
        this.qf = pccVar;
        this.kj = sfVar;
        if (!this.gpj && bundle != null) {
            if (pccVar == null) {
                this.qf = sf;
                sf = null;
            }
            if (sfVar == null) {
                this.kj = gm;
                gm = null;
            }
        }
        this.vh.pcc(bundle);
    }

    public void pcc(TTAdActivity tTAdActivity) {
        this.gbb = 2;
        this.vh.wh();
    }

    public void pcc(boolean z) {
        this.vh.pcc(z);
    }

    public void pcc(TTAdActivity tTAdActivity, Bundle bundle, int i) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(this.oo, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i);
        if (this.gpj) {
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.qf;
        if (pccVar != null) {
            sf = pccVar;
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.kj;
        if (sfVar != null) {
            gm = sfVar;
        }
    }

    public void pcc(kj kjVar, vj vjVar) {
        this.vh.pcc(kjVar, null, vjVar);
    }

    public void pcc(Activity activity) {
        this.vh.sf(activity);
    }

    public void pcc(com.bytedance.sdk.openadsdk.activity.single.pcc pccVar, boolean z) {
        this.vh.pcc(pccVar, z);
    }

    public void pcc(kj kjVar) {
        com.bytedance.sdk.openadsdk.activity.single.gm gmVar = this.vh;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(kjVar);
    }

    public void pcc(kj kjVar, boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.gm gmVar = this.vh;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(kjVar, z);
    }

    public void pcc(View view) {
        this.vh.pcc(view);
    }

    public void pcc(View view, boolean z) {
        this.vh.pcc(view, z);
    }

    public boolean pcc(kj kjVar, int i) {
        return this.vh.pcc(kjVar, i);
    }

    public void pcc(float f) {
        this.vh.pcc(f);
    }

    public void pcc(Map<String, Object> map, kj kjVar, float f, float f2) {
        this.vh.pcc(map, kjVar, f, f2);
    }

    public void pcc(int i) {
        this.vh.pcc(i);
    }

    public void pcc(kj kjVar, boolean z, boolean z2, boolean z3, int i) {
        this.vh.pcc(kjVar, z, z2, z3, i);
    }
}
