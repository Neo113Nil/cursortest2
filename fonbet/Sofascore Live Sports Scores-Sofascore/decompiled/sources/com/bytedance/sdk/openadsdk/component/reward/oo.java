package com.bytedance.sdk.openadsdk.component.reward;

import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import defpackage.fem;
import defpackage.kwm;
import defpackage.nem;
import defpackage.oem;
import defpackage.otm;
import defpackage.rtm;
import defpackage.stm;
import defpackage.swm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo implements oem {
    private final otm gm;
    private pcc.InterfaceC0088pcc kj;
    private final pcc pcc;
    private long qf;
    private final of sf;
    private boolean oo = true;
    private long vj = 0;
    private boolean wh = false;

    public oo(of ofVar, com.bytedance.sdk.openadsdk.oo.qf qfVar) {
        otm otmVar = new otm() { // from class: com.bytedance.sdk.openadsdk.component.reward.oo.1
        };
        this.gm = otmVar;
        this.sf = ofVar;
        swm kez = ofVar.kez();
        long j = 10;
        long j2 = kez != null ? (long) kez.d : 10L;
        if (j2 <= 0) {
            kez.d = 10.0d;
        } else {
            j = j2;
        }
        this.pcc = new pcc(j * 1000, otmVar, qfVar);
    }

    public long dax() {
        return this.qf;
    }

    @Override // defpackage.oem
    public boolean gbb() {
        return false;
    }

    @Override // defpackage.oem
    public void gm() {
        this.pcc.vh();
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy());
        pccVar.gm(qf());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(this.gm, pccVar);
        pcc.InterfaceC0088pcc interfaceC0088pcc = this.kj;
        if (interfaceC0088pcc != null) {
            interfaceC0088pcc.pcc(1);
        }
    }

    @Override // defpackage.oem
    public boolean hc() {
        return this.pcc.sf();
    }

    @Override // defpackage.oem
    public boolean jr() {
        return false;
    }

    @Override // defpackage.oem
    public int kj() {
        return 0;
    }

    public otm nac() {
        return this.gm;
    }

    @Override // defpackage.oem
    public void oo() {
        this.pcc.hc();
    }

    @Override // defpackage.oem
    public int ork() {
        return rtm.a(this.pcc.kj, this.pcc.pcc);
    }

    @Override // defpackage.oem
    public boolean pcc(nem nemVar) {
        this.wh = nemVar.vh();
        if (nemVar.ork() > 0) {
            this.pcc.sf(nemVar.ork());
        }
        nemVar.sf(com.bytedance.sdk.openadsdk.yt.vj.pcc("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.sf, this.gm, nemVar);
        this.pcc.vh();
        pcc.InterfaceC0088pcc interfaceC0088pcc = this.kj;
        if (interfaceC0088pcc != null) {
            interfaceC0088pcc.pcc(1);
        }
        return true;
    }

    @Override // defpackage.oem
    public long qf() {
        return 0L;
    }

    @Override // defpackage.oem
    public void sf() {
        this.pcc.tmg();
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy());
        pccVar.gm(qf());
        pccVar.pcc(dax());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.gm, pccVar);
        pcc.InterfaceC0088pcc interfaceC0088pcc = this.kj;
        if (interfaceC0088pcc != null) {
            interfaceC0088pcc.pcc(2);
        }
    }

    @Override // defpackage.oem
    public kwm tmg() {
        return null;
    }

    @Override // defpackage.oem
    public stm vh() {
        return this.pcc;
    }

    @Override // defpackage.oem
    public void vj() {
        oo();
    }

    @Override // defpackage.oem
    public long vy() {
        return this.pcc.dax();
    }

    @Override // defpackage.oem
    public long wh() {
        return this.pcc.nac();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements stm {
        private final com.bytedance.sdk.openadsdk.oo.qf gm;
        private long kj;
        private long oo;
        private final long pcc;
        private fem qf;
        private final otm sf;
        private int vj = 0;
        private long vy;
        private CountDownTimer wh;

        public pcc(long j, otm otmVar, com.bytedance.sdk.openadsdk.oo.qf qfVar) {
            this.pcc = j;
            this.sf = otmVar;
            this.gm = qfVar;
        }

        public long dax() {
            return this.pcc;
        }

        public long gbb() {
            return 0L;
        }

        public void hc() {
            this.vj = 0;
            CountDownTimer countDownTimer = this.wh;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.wh = null;
            }
            if (this.qf != null) {
                this.qf = null;
            }
        }

        public int jr() {
            return 0;
        }

        @Override // defpackage.stm
        public boolean kj() {
            return this.vj == 0;
        }

        public long nac() {
            return this.kj;
        }

        public void ork() {
            this.kj = 0L;
            vh();
        }

        @Override // defpackage.stm
        public boolean qf() {
            return this.vj == 2;
        }

        @Override // defpackage.stm
        public boolean sf() {
            return this.vj == 4;
        }

        public void tmg() {
            this.vj = 2;
            this.oo = this.kj;
            CountDownTimer countDownTimer = this.wh;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.wh = null;
            }
        }

        public void vh() {
            if (this.vj == 1) {
                return;
            }
            this.vj = 1;
            final long dax = dax();
            long j = this.oo;
            if (j >= dax) {
                j = 0;
                this.oo = 0L;
            }
            final long j2 = dax - j;
            CountDownTimer countDownTimer = new CountDownTimer(j2, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.oo.pcc.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    if (pcc.this.qf != null) {
                        fem femVar = pcc.this.qf;
                        long j3 = dax;
                        femVar.pcc(j3, j3);
                    }
                    pcc.this.vj = 4;
                    pcc.this.kj = dax;
                    pcc.this.oo = dax;
                    if (pcc.this.qf != null) {
                        pcc.this.qf.pcc(pcc.this.nac(), 100);
                    }
                    jr.pcc pccVar = new jr.pcc();
                    pccVar.sf(dax);
                    pccVar.oo(dax);
                    pccVar.gm(pcc.this.gbb());
                    pccVar.oo(pcc.this.jr());
                    pccVar.pcc(pcc.this.vy());
                    com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(pcc.this.sf, pccVar, pcc.this.gm);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j3) {
                    long j4 = (j2 - j3) + pcc.this.oo;
                    pcc.this.kj = j4;
                    if (pcc.this.qf != null) {
                        pcc.this.qf.pcc(j4, dax);
                    }
                }
            };
            this.wh = countDownTimer;
            countDownTimer.start();
        }

        public long vy() {
            return this.vy;
        }

        @Override // defpackage.stm
        public boolean wh() {
            return this.vj == 1;
        }

        @Override // defpackage.stm
        public boolean gm() {
            return false;
        }

        @Override // defpackage.stm
        public int oo() {
            return 0;
        }

        @Override // defpackage.stm
        public boolean pcc() {
            return false;
        }

        @Override // defpackage.stm
        public int vj() {
            return 0;
        }

        public void pcc(long j) {
            this.vy = j;
        }

        public void pcc(fem femVar) {
            this.qf = femVar;
        }

        public void sf(long j) {
            this.oo = j;
        }
    }

    @Override // defpackage.oem
    public boolean pcc(float f) {
        return false;
    }

    @Override // defpackage.oem
    public void pcc(long j) {
        this.qf = j;
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.pcc(j);
        }
    }

    public void pcc(boolean z, int i) {
        oo();
    }

    @Override // defpackage.oem
    public void pcc(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.oem
    public void pcc(boolean z, String str) {
        this.wh = z;
    }

    @Override // defpackage.oem
    public void pcc(fem femVar) {
        this.pcc.pcc(femVar);
    }

    public void pcc(pcc.InterfaceC0088pcc interfaceC0088pcc) {
        this.kj = interfaceC0088pcc;
    }

    @Override // defpackage.oem
    public void pcc() {
        this.pcc.ork();
    }
}
