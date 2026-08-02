package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private List<Integer> gm;
    private int oo;
    private int pcc;
    private int qf;
    private int sf;
    private List<String> vj;
    private int wh;

    public List<String> gm() {
        return this.vj;
    }

    public int oo() {
        return this.pcc;
    }

    public boolean pcc() {
        return this.wh == 1;
    }

    public int qf() {
        return this.oo;
    }

    public int sf() {
        int i = this.qf;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public int vj() {
        return this.sf;
    }

    public List<Integer> wh() {
        return this.gm;
    }

    public void gm(int i) {
        this.pcc = i;
    }

    public void oo(int i) {
        this.sf = i;
    }

    public void vj(int i) {
        this.oo = i;
    }

    public void pcc(int i) {
        this.wh = i;
    }

    public void sf(int i) {
        this.qf = i;
    }

    public void pcc(List<String> list) {
        this.vj = list;
    }

    public void sf(List<Integer> list) {
        this.gm = list;
    }
}
