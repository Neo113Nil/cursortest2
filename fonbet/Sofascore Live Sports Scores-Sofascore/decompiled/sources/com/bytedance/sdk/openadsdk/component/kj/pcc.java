package com.bytedance.sdk.openadsdk.component.kj;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pcc {
    private long gm;
    private boolean oo;
    private float pcc;
    private long sf;
    private long vj;

    public long gm() {
        return this.sf;
    }

    public long oo() {
        return this.gm;
    }

    public void pcc(float f) {
        StringBuilder sb = new StringBuilder("setTotalTime() called with: time = [");
        sb.append(f);
        sb.append(U3.j.e);
        this.pcc = f;
    }

    public float sf() {
        return this.pcc;
    }

    public void gm(long j) {
        this.gm = j;
    }

    public void sf(long j) {
        this.sf = j;
    }

    public long pcc() {
        return this.vj;
    }

    public void pcc(long j) {
        this.vj = j;
    }

    public void pcc(boolean z) {
        this.oo = z;
    }
}
