package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.common.pcc;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb {
    private final Runnable gm;
    private final pcc.sf oo;
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;
    private pcc.InterfaceC0066pcc qf;
    private final String sf;
    private boolean vj;
    private dax wh;

    private gbb(pcc pccVar) {
        this.pcc = pccVar.pcc;
        this.sf = pccVar.sf;
        this.gm = pccVar.gm;
        this.oo = pccVar.oo;
        this.vj = pccVar.vj;
        this.wh = pccVar.wh;
        this.qf = pccVar.qf;
    }

    public Runnable gm() {
        return this.gm;
    }

    public pcc.sf oo() {
        return this.oo;
    }

    public com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc() {
        return this.pcc;
    }

    public pcc.InterfaceC0066pcc qf() {
        return this.qf;
    }

    public String sf() {
        return this.sf;
    }

    public boolean vj() {
        return this.vj;
    }

    public dax wh() {
        return this.wh;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private final Runnable gm;
        private final pcc.sf oo;
        private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;
        private final String sf;
        private boolean vj = false;
        private dax wh = null;
        private pcc.InterfaceC0066pcc qf = null;

        public pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, String str, Runnable runnable, pcc.sf sfVar2) {
            this.pcc = sfVar;
            this.sf = str;
            this.gm = runnable;
            this.oo = sfVar2;
        }

        public gbb pcc() {
            if (this.pcc == null) {
                a70.p("RewardFullContext cannot be null");
                return null;
            }
            if (this.gm == null) {
                a70.p("Runnable finishAction cannot be null");
                return null;
            }
            if (this.oo != null) {
                return new gbb(this);
            }
            a70.p("SkipResultHandler cannot be null");
            return null;
        }

        public pcc pcc(boolean z) {
            this.vj = z;
            return this;
        }

        public pcc pcc(dax daxVar) {
            this.wh = daxVar;
            return this;
        }

        public pcc pcc(pcc.InterfaceC0066pcc interfaceC0066pcc) {
            this.qf = interfaceC0066pcc;
            return this;
        }
    }
}
