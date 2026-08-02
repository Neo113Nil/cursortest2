package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.openadsdk.core.model.of;
import defpackage.ltm;
import defpackage.nem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr {
    private int gm;
    private nem oo;
    private long pcc;
    private String sf;
    private of vj;

    public jr(long j, String str, int i, nem nemVar, of ofVar) {
        this.pcc = j;
        this.sf = str;
        this.gm = i;
        this.oo = nemVar;
        this.vj = ofVar;
    }

    public int gm() {
        return this.gm;
    }

    public nem oo() {
        return this.oo;
    }

    public long pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public of vj() {
        return this.vj;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private ltm gbb;
        private int kj;
        private boolean oo;
        private int ork;
        private int tmg;
        private int vh;
        private boolean vj;
        private int vy;
        private long pcc = 0;
        private long sf = 0;
        private long gm = 0;
        private long wh = 0;
        private boolean qf = false;
        private boolean hc = false;

        private void dax() {
            long j = this.gm;
            if (j > 0) {
                long j2 = this.pcc;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.pcc = j3;
                    if (j3 == 0) {
                        this.pcc = j;
                    }
                }
            }
        }

        public boolean gbb() {
            return this.oo;
        }

        public long gm() {
            return this.sf;
        }

        public ltm hc() {
            return this.gbb;
        }

        public boolean jr() {
            return this.vj;
        }

        public int kj() {
            return this.ork;
        }

        public void oo(long j) {
            this.gm = j;
            dax();
        }

        public int ork() {
            return this.tmg;
        }

        public long pcc() {
            return this.wh;
        }

        public int qf() {
            long j = this.gm;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.pcc * 100) / j), 100);
        }

        public void sf(long j) {
            this.pcc = j;
            dax();
        }

        public boolean tmg() {
            return this.qf;
        }

        public boolean vh() {
            return this.hc;
        }

        public int vj() {
            return this.kj;
        }

        public int vy() {
            return this.vh;
        }

        public int wh() {
            return this.vy;
        }

        public void gm(long j) {
            this.sf = j;
        }

        public void pcc(long j) {
            this.wh = j;
        }

        public void gm(int i) {
            this.ork = i;
        }

        public void pcc(int i) {
            this.kj = i;
        }

        public void gm(boolean z) {
            this.vj = z;
        }

        public void pcc(boolean z) {
            this.qf = z;
        }

        public long oo() {
            return this.gm;
        }

        public void pcc(ltm ltmVar) {
            this.gbb = ltmVar;
        }

        public long sf() {
            return this.pcc;
        }

        public void oo(int i) {
            this.tmg = i;
        }

        public void sf(int i) {
            this.vy = i;
        }

        public void sf(boolean z) {
            this.oo = z;
        }
    }
}
