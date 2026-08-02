package com.bytedance.sdk.openadsdk.core.model;

import com.ironsource.Ua;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class fum {
    private long pcc = Ua.s;
    private long sf = Ua.s;
    private long gm = 10;
    private long oo = 20;
    private String vj = "";

    public void gm(long j) {
        if (j <= 0) {
            this.gm = 10L;
        } else {
            this.gm = j;
        }
    }

    public void oo(long j) {
        if (j < 0) {
            this.oo = 20L;
        } else {
            this.oo = j;
        }
    }

    public void pcc(long j) {
        if (j <= 0) {
            this.pcc = 10L;
        } else {
            this.pcc = j;
        }
    }

    public void sf(long j) {
        if (j < 0) {
            this.sf = 20L;
        } else {
            this.sf = j;
        }
    }

    public String vj() {
        return this.vj;
    }

    public long gm() {
        return this.gm;
    }

    public long oo() {
        return this.oo;
    }

    public long pcc() {
        return this.pcc;
    }

    public long sf() {
        return this.sf;
    }

    public void pcc(String str) {
        this.vj = str;
    }
}
