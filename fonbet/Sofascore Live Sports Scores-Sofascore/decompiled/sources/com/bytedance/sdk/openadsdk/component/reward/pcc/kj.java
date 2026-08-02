package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.tz.pcc.pcc;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends ork implements Handler.Callback {
    private boolean fum;
    int gm;
    private int jsj;
    private final Handler lo;
    private int of;
    int oo;
    boolean pcc;
    protected int qf;
    private int qy;
    long sf;
    private boolean tsz;
    private int tz;
    int vj;
    boolean wh;
    private boolean yt;

    public kj(sf sfVar) {
        super(sfVar);
        this.lo = new Handler(this);
        this.pcc = false;
        this.sf = 0L;
        this.gm = 0;
        this.oo = 0;
        this.vj = 0;
        this.wh = false;
        this.fum = false;
        this.tz = 0;
        this.yt = false;
        this.qy = 0;
        this.jsj = 0;
        this.tsz = false;
        this.qf = atb.vy(this.ork);
        this.oo = this.ork.jk();
        int ys = this.ork.ys();
        this.vj = ys;
        this.qy = Math.max(0, this.oo - ys);
    }

    private boolean dax() {
        if (this.tmg.gdh) {
            return false;
        }
        int i = this.qf;
        return 1 == i || 2 == i;
    }

    private boolean lu() {
        return this.kj && atb.gm(this.tmg.sf) && !this.gpj.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nac() {
        boolean z = this.yt;
        int i = this.vj;
        int i2 = !z ? i - this.gm : i + this.jsj;
        int i3 = com.bytedance.sdk.openadsdk.core.lu.oo().tsz(String.valueOf(this.tmg.wh)).wh;
        int i4 = this.oo;
        boolean z2 = false;
        boolean z3 = i4 <= 0 || (((float) i2) / ((float) i4)) * 100.0f >= ((float) i3);
        int pcc = com.bytedance.sdk.openadsdk.core.lu.oo().pcc(String.valueOf(this.tmg.wh));
        if (pcc == 0) {
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.lu;
            boolean wh = pccVar != null ? pccVar.wh() : false;
            if (this.jr) {
                wh = true;
            }
            if (z3 && wh) {
                z2 = true;
            }
        } else if (pcc == 1) {
            z2 = z3;
        }
        if (z2) {
            this.tmg.tsx.sf(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(int i) {
        pcc(this.vj);
        if (this.fum) {
            return;
        }
        Handler handler = this.lo;
        handler.sendMessage(handler.obtainMessage(900, this.vj, i));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void gm() {
        if (this.gbb) {
            this.kj = true;
            boolean dax = dax();
            if (dax) {
                this.lu.pcc(new pcc.InterfaceC0129pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.kj.2
                    @Override // com.bytedance.sdk.openadsdk.tz.pcc.pcc.InterfaceC0129pcc
                    public void pcc(int i) {
                        if (kj.this.tsz) {
                            return;
                        }
                        kj.this.tz = i;
                        kj.this.lu.pcc((pcc.InterfaceC0129pcc) null);
                        kj.this.sf(i);
                    }
                });
            }
            this.lu.pcc();
            if (atb.kj(this.ork)) {
                this.tmg.ye.wh();
            }
            this.sf = System.currentTimeMillis();
            if (!dax) {
                sf(0);
            }
            this.tmg.tsx.kz();
            com.bytedance.sdk.openadsdk.component.reward.tmg tmgVar = this.tmg.ra;
            if (tmgVar != null) {
                tmgVar.pcc(this.oo);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !lu()) {
            return true;
        }
        int i = message.arg1;
        boolean z = false;
        if (this.yt) {
            int i2 = this.vj;
            int i3 = this.jsj;
            int i4 = i2 + i3;
            int i5 = this.oo;
            if (i4 < i5) {
                this.jsj = i3 + 1;
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = 0;
                this.lo.sendMessageDelayed(obtain, 1000L);
            } else {
                this.jsj = i5 - i2;
            }
        } else if (i > 0) {
            if (this.tz == 0 && 2 == this.qf) {
                z = true;
            }
            this.tmg.zti.oo(true);
            if (!z) {
                this.tmg.zti.pcc(String.valueOf(i), null);
            }
            Message obtain2 = Message.obtain();
            obtain2.what = 900;
            int i6 = i - 1;
            obtain2.arg1 = i6;
            this.lo.sendMessageDelayed(obtain2, 1000L);
            this.gm = i6;
            this.of = i;
        } else {
            this.wh = true;
            if (!atb.kj(this.ork) || (atb.lo(this.ork) && this.lu.vj())) {
                this.tmg.zti.oo(false);
                this.tmg.dax.set(true);
                this.tmg.ew.hc();
            } else {
                this.tmg.zti.gm();
                this.tmg.zti.vj(true);
            }
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.lu;
            if (pccVar == null || pccVar.vj()) {
                this.jr = true;
            }
            if (this.qy > 0) {
                this.yt = true;
                this.jsj++;
                Message obtain3 = Message.obtain();
                obtain3.what = 900;
                obtain3.arg1 = 0;
                this.lo.sendMessageDelayed(obtain3, 1000L);
            }
            this.of = 0;
        }
        nac();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public int kj() {
        return this.of;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void oo() {
        com.bytedance.sdk.openadsdk.core.widget.sf sfVar;
        if (this.gbb) {
            super.oo();
            if (DeviceUtils.qf() == 0) {
                this.tmg.xb = true;
            }
            sf sfVar2 = this.tmg;
            if (sfVar2.xb) {
                sfVar2.zti.sf(true);
                gm(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar3 = this.tmg.ew;
            if ((sfVar3 == null || (sfVar = sfVar3.tmg) == null || !sfVar.isShowing()) && vh() && qf() > 0) {
                pcc(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public boolean ork() {
        return this.wh;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void pcc(boolean z) {
        if (this.nac != null) {
            try {
                com.bytedance.sdk.openadsdk.tz.pcc.sf pcc = com.bytedance.sdk.openadsdk.tz.pcc.oo.pcc().pcc(this.ork, this.nac, sf());
                this.lu = pcc;
                pcc.pcc(this.tmg.tsx);
            } catch (Throwable th) {
                lo.gm("RVIVPlayableNewManager", "PreRender injection exception" + th.getMessage());
            }
            if (this.lu == null) {
                super.pcc(z);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public int qf() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void vj() {
        if (this.gbb) {
            super.vj();
            vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void vy() {
        if (this.gbb) {
            this.fum = true;
            this.lo.removeMessages(900);
            this.lo.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void wh() {
        if (this.gbb && !this.dax) {
            super.wh();
            this.lo.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public com.bytedance.sdk.openadsdk.hc.qf sf() {
        return new com.bytedance.sdk.openadsdk.hc.qf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.kj.1
            @Override // com.bytedance.sdk.openadsdk.hc.qf
            public void pcc() {
                kj.this.nac();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void pcc() {
        if (this.gbb && !this.hc) {
            super.pcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void pcc(int i) {
        this.gm = i;
        this.of = i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void pcc(long j) {
        if (this.gbb && this.kj && !this.tmg.ork.get() && this.fum) {
            this.fum = false;
            Message obtain = Message.obtain();
            obtain.what = 900;
            obtain.arg1 = qf();
            obtain.arg2 = this.tz;
            this.lo.sendMessageDelayed(obtain, j);
        }
    }
}
