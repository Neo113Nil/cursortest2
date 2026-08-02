package com.bytedance.sdk.component.wh.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gm;
    private vj kj;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc oo;
    private int ork;
    private com.bytedance.sdk.component.wh.pcc.pcc.vj pcc;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc qf;
    private com.bytedance.sdk.component.wh.pcc.sf.gm sf;
    private long tmg;
    private int vh;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vj;
    private boolean vy;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc wh;

    private pcc() {
        this.ork = 200;
        this.vh = 10;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc kj() {
        return this.oo;
    }

    public com.bytedance.sdk.component.wh.pcc.sf.gm ork() {
        return this.sf;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc qf() {
        return this.gm;
    }

    public int tmg() {
        return this.vh;
    }

    public int vh() {
        return this.ork;
    }

    public long vj() {
        return this.tmg;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vy() {
        return this.vj;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc wh() {
        return this.qf;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.wh.pcc.pcc$pcc, reason: collision with other inner class name */
    public static class C0058pcc {
        private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gm;
        private boolean kj;
        private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc oo;
        private com.bytedance.sdk.component.wh.pcc.sf.gm pcc;
        private com.bytedance.sdk.component.wh.pcc.pcc.vj qf;
        private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc sf;
        private long vh;
        private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vj;
        private vj wh;
        private int vy = 5000;
        private int ork = 10;

        public C0058pcc gm(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
            this.oo = pccVar;
            return this;
        }

        public pcc pcc() {
            pcc pccVar = new pcc();
            pccVar.sf = this.pcc;
            pccVar.gm = this.sf;
            pccVar.oo = this.gm;
            pccVar.vj = this.oo;
            pccVar.wh = this.vj;
            pccVar.kj = this.wh;
            pccVar.pcc = this.qf;
            pccVar.vy = this.kj;
            pccVar.vh = this.ork;
            pccVar.ork = this.vy;
            pccVar.tmg = this.vh;
            return pccVar;
        }

        public C0058pcc sf(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
            this.gm = pccVar;
            return this;
        }

        public C0058pcc sf(int i) {
            this.ork = i;
            return this;
        }

        public C0058pcc pcc(com.bytedance.sdk.component.wh.pcc.pcc.vj vjVar) {
            this.qf = vjVar;
            return this;
        }

        public C0058pcc pcc(vj vjVar) {
            this.wh = vjVar;
            return this;
        }

        public C0058pcc pcc(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
            this.sf = pccVar;
            return this;
        }

        public C0058pcc pcc(com.bytedance.sdk.component.wh.pcc.sf.gm gmVar) {
            this.pcc = gmVar;
            return this;
        }

        public C0058pcc pcc(int i) {
            this.vy = i;
            return this;
        }

        public C0058pcc pcc(long j) {
            this.vh = j;
            return this;
        }
    }

    public boolean gm() {
        return this.vy;
    }

    public vj oo() {
        return this.kj;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc sf() {
        return this.wh;
    }

    public com.bytedance.sdk.component.wh.pcc.pcc.vj pcc() {
        return this.pcc;
    }
}
