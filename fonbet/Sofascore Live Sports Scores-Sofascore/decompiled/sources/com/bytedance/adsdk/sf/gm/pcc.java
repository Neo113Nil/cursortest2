package com.bytedance.adsdk.sf.gm;

import android.graphics.PointF;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private final PointF gm;
    private final PointF pcc;
    private final PointF sf;

    public pcc() {
        this.pcc = new PointF();
        this.sf = new PointF();
        this.gm = new PointF();
    }

    public void gm(float f, float f2) {
        this.gm.set(f, f2);
    }

    public void pcc(float f, float f2) {
        this.pcc.set(f, f2);
    }

    public void sf(float f, float f2) {
        this.sf.set(f, f2);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.gm.x), Float.valueOf(this.gm.y), Float.valueOf(this.pcc.x), Float.valueOf(this.pcc.y), Float.valueOf(this.sf.x), Float.valueOf(this.sf.y));
    }

    public PointF gm() {
        return this.gm;
    }

    public PointF pcc() {
        return this.pcc;
    }

    public PointF sf() {
        return this.sf;
    }

    public pcc(PointF pointF, PointF pointF2, PointF pointF3) {
        this.pcc = pointF;
        this.sf = pointF2;
        this.gm = pointF3;
    }
}
