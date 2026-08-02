package com.bytedance.sdk.component.gm.pcc;

import android.os.SystemClock;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    long gm;
    long kj;
    long oo;
    long pcc = SystemClock.elapsedRealtime();
    long qf;
    long sf;
    long vj;
    long wh;

    public long gbb() {
        return this.sf;
    }

    public void gm() {
        this.vj = SystemClock.elapsedRealtime();
    }

    public void hc() {
        this.kj = SystemClock.elapsedRealtime();
    }

    public void jr() {
        this.sf = SystemClock.elapsedRealtime();
    }

    public long kj() {
        return this.oo;
    }

    public long oo() {
        return this.pcc;
    }

    public long ork() {
        return this.qf;
    }

    public void pcc() {
        this.gm = SystemClock.elapsedRealtime();
    }

    public long qf() {
        return this.gm;
    }

    public void sf() {
        this.oo = SystemClock.elapsedRealtime();
    }

    public long tmg() {
        return this.kj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestHttpTime{requestBuildTs=");
        sb.append(this.pcc);
        sb.append(", asyncCallExecTs=");
        sb.append(this.sf);
        sb.append(", requestStartExecTs=");
        sb.append(this.gm);
        sb.append(", requestConnectStartTs=");
        sb.append(this.oo);
        sb.append(", requestConnectFinishTs=");
        sb.append(this.vj);
        sb.append(", reqCallServerStartTs=");
        sb.append(this.qf);
        sb.append(", reqCallServerFinishTs=");
        return fn0.n(sb, this.kj, '}');
    }

    public void vh() {
        this.qf = SystemClock.elapsedRealtime();
    }

    public void vj() {
        this.wh = SystemClock.elapsedRealtime();
    }

    public long vy() {
        return this.vj;
    }

    public long wh() {
        return this.wh;
    }
}
