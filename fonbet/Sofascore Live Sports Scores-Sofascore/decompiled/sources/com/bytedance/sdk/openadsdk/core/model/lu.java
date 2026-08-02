package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu {
    private int gm;
    private double oo;
    private String pcc;
    private int sf;
    private boolean vj;
    private String wh;

    public int gm() {
        return this.gm;
    }

    public double oo() {
        return this.oo;
    }

    public String pcc() {
        return this.pcc;
    }

    public String qf() {
        return this.wh;
    }

    public int sf() {
        return this.sf;
    }

    public boolean vj() {
        return !TextUtils.isEmpty(this.pcc) && this.sf > 0 && this.gm > 0;
    }

    public boolean wh() {
        return this.vj;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void sf(int i) {
        this.gm = i;
    }

    public void pcc(int i) {
        this.sf = i;
    }

    public void sf(String str) {
        this.wh = str;
    }

    public void pcc(boolean z) {
        this.vj = z;
    }
}
