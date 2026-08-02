package com.bytedance.sdk.openadsdk.core.jr.oo;

import defpackage.csm;
import defpackage.gtm;
import defpackage.ltm;
import defpackage.stm;
import defpackage.w1l;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends csm {
    private final pcc oo;
    private final List<sf> pcc = w1l.n();
    private int sf = 1;
    private int gm = 1;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf extends gtm {
        @Override // defpackage.gtm
        /* synthetic */ void gm(stm stmVar);

        @Override // defpackage.gtm
        /* synthetic */ void oo(stm stmVar);

        void pcc(int i, int i2);

        @Override // defpackage.gtm
        /* synthetic */ void pcc(stm stmVar);

        @Override // defpackage.gtm
        /* synthetic */ void pcc(stm stmVar, int i);

        @Override // defpackage.gtm
        /* synthetic */ void pcc(stm stmVar, int i, int i2);

        @Override // defpackage.gtm
        /* synthetic */ void pcc(stm stmVar, int i, int i2, int i3);

        @Override // defpackage.gtm
        /* synthetic */ void pcc(stm stmVar, long j);

        @Override // defpackage.gtm
        /* synthetic */ void pcc(stm stmVar, long j, long j2);

        @Override // defpackage.gtm
        /* synthetic */ void pcc(stm stmVar, ltm ltmVar);

        @Override // defpackage.gtm
        /* synthetic */ void pcc(stm stmVar, boolean z);

        @Override // defpackage.gtm
        /* synthetic */ void sf(stm stmVar);

        @Override // defpackage.gtm
        /* synthetic */ void sf(stm stmVar, int i);

        @Override // defpackage.gtm
        /* synthetic */ void vj(stm stmVar);
    }

    public gm() {
        pcc pccVar = new pcc();
        this.oo = pccVar;
        super.pcc(pccVar);
        pcc(500);
    }

    public int fum() {
        return this.gm;
    }

    public void gm(int i) {
        this.sf = Math.max(1, i);
    }

    @Override // defpackage.csm
    public long lu() {
        long lu = super.lu();
        return this.sf == 1 ? lu : ((this.gm - 1) * super.nac()) + lu;
    }

    @Override // defpackage.csm
    public long nac() {
        return super.nac() * this.sf;
    }

    @Override // defpackage.csm
    public void pcc(gtm gtmVar) {
        if (!(gtmVar instanceof sf)) {
            super.pcc(gtmVar);
        } else {
            if (this.pcc.contains(gtmVar)) {
                return;
            }
            this.pcc.add((sf) gtmVar);
        }
    }

    public static /* synthetic */ int pcc(gm gmVar) {
        int i = gmVar.gm;
        gmVar.gm = i + 1;
        return i;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc implements gtm {
        private pcc() {
        }

        @Override // defpackage.gtm
        public void gm(stm stmVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).gm(stmVar);
            }
        }

        @Override // defpackage.gtm
        public void oo(stm stmVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).oo(stmVar);
            }
        }

        @Override // defpackage.gtm
        public void pcc(stm stmVar) {
            gm.pcc(gm.this);
            int i = gm.this.gm;
            int i2 = gm.this.sf;
            gm gmVar = gm.this;
            if (i > i2) {
                Iterator it = gmVar.pcc.iterator();
                while (it.hasNext()) {
                    ((sf) it.next()).pcc(stmVar);
                }
            } else {
                Iterator it2 = gmVar.pcc.iterator();
                while (it2.hasNext()) {
                    ((sf) it2.next()).pcc(gm.this.gm, gm.this.sf);
                }
                gm.this.vy();
            }
        }

        @Override // defpackage.gtm
        public void sf(stm stmVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).sf(stmVar);
            }
        }

        @Override // defpackage.gtm
        public void vj(stm stmVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).vj(stmVar);
            }
        }

        @Override // defpackage.gtm
        public void sf(stm stmVar, int i) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).sf(stmVar, i);
            }
        }

        @Override // defpackage.gtm
        public void pcc(stm stmVar, long j) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(stmVar, j);
            }
        }

        @Override // defpackage.gtm
        public void pcc(stm stmVar, ltm ltmVar) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(stmVar, ltmVar);
            }
        }

        @Override // defpackage.gtm
        public void pcc(stm stmVar, boolean z) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(stmVar, z);
            }
        }

        @Override // defpackage.gtm
        public void pcc(stm stmVar, int i, int i2) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(stmVar, i, i2);
            }
        }

        @Override // defpackage.gtm
        public void pcc(stm stmVar, int i, int i2, int i3) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(stmVar, i, i2, i3);
            }
        }

        @Override // defpackage.gtm
        public void pcc(stm stmVar, int i) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(stmVar, i);
            }
        }

        @Override // defpackage.gtm
        public void pcc(stm stmVar, long j, long j2) {
            Iterator it = gm.this.pcc.iterator();
            while (it.hasNext()) {
                ((sf) it.next()).pcc(stmVar, j, j2);
            }
        }
    }
}
