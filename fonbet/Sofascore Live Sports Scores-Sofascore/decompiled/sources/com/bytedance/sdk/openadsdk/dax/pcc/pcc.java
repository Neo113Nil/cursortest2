package com.bytedance.sdk.openadsdk.dax.pcc;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    float dax;
    int gbb;
    float gm;
    float hc;
    String jr;
    float kj;
    int nac;
    float oo;
    int ork;
    String pcc;
    float qf;
    int sf;
    float tmg;
    float vh;
    float vj;
    float vy;
    int wh;
    int lu = -1;
    String gpj = "";

    public int dax() {
        return this.gbb;
    }

    public float gbb() {
        return this.tmg;
    }

    public String gm() {
        return this.pcc;
    }

    public int gpj() {
        return this.nac;
    }

    public float hc() {
        return this.vh;
    }

    public BigDecimal jr() {
        return new BigDecimal(this.hc).setScale(3, RoundingMode.HALF_UP);
    }

    public int kj() {
        return this.wh;
    }

    public float lu() {
        return this.dax;
    }

    public String nac() {
        return this.jr;
    }

    public int oo() {
        return this.sf;
    }

    public float ork() {
        return this.kj;
    }

    public int pcc() {
        return this.lu;
    }

    public float qf() {
        return this.vj;
    }

    public String sf() {
        return this.gpj;
    }

    public int tmg() {
        return this.ork;
    }

    public float vh() {
        return this.vy;
    }

    public float vj() {
        return this.gm;
    }

    public float vy() {
        return this.qf;
    }

    public float wh() {
        return this.oo;
    }

    public void gm(float f) {
        this.vj = f;
    }

    public void kj(float f) {
        this.tmg = f;
    }

    public void oo(float f) {
        this.qf = f;
    }

    public void ork(float f) {
        this.dax = f;
    }

    public void pcc(int i) {
        this.lu = i;
    }

    public void qf(float f) {
        this.vh = f;
    }

    public void sf(String str) {
        this.pcc = str;
    }

    public void vj(float f) {
        this.kj = f;
    }

    public void vy(float f) {
        this.hc = f;
    }

    public void wh(float f) {
        this.vy = f;
    }

    public void gm(int i) {
        this.wh = i;
    }

    public void oo(int i) {
        this.ork = i;
    }

    public void pcc(String str) {
        this.gpj = str;
    }

    public void sf(int i) {
        this.sf = i;
    }

    public void vj(int i) {
        this.gbb = i;
    }

    public void wh(int i) {
        this.nac = i;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.dax.pcc.pcc$pcc, reason: collision with other inner class name */
    public static class C0106pcc {
        pcc pcc = new pcc();

        public C0106pcc gm(float f) {
            this.pcc.gm(f);
            return this;
        }

        public C0106pcc kj(float f) {
            this.pcc.kj(f);
            return this;
        }

        public C0106pcc oo(float f) {
            this.pcc.oo(f);
            return this;
        }

        public C0106pcc ork(float f) {
            this.pcc.ork(f);
            return this;
        }

        public C0106pcc pcc(String str) {
            this.pcc.sf(str);
            return this;
        }

        public C0106pcc qf(float f) {
            this.pcc.qf(f);
            return this;
        }

        public C0106pcc sf(float f) {
            this.pcc.sf(f);
            return this;
        }

        public C0106pcc vj(float f) {
            this.pcc.vj(f);
            return this;
        }

        public C0106pcc vy(float f) {
            this.pcc.vy(f);
            return this;
        }

        public C0106pcc wh(float f) {
            this.pcc.wh(f);
            return this;
        }

        public C0106pcc gm(int i) {
            this.pcc.wh(i);
            return this;
        }

        public C0106pcc pcc(int i) {
            this.pcc.sf(i);
            return this;
        }

        public C0106pcc sf(int i) {
            this.pcc.vj(i);
            return this;
        }

        public C0106pcc pcc(float f) {
            this.pcc.pcc(f);
            return this;
        }

        public C0106pcc sf(String str) {
            this.pcc.gm(str);
            return this;
        }

        public pcc pcc() {
            return this.pcc;
        }
    }

    public void gm(String str) {
        this.jr = str;
    }

    public void pcc(float f) {
        this.gm = f;
    }

    public void sf(float f) {
        this.oo = f;
    }
}
