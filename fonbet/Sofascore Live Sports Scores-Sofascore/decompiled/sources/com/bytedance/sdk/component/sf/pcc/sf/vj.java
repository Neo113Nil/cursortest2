package com.bytedance.sdk.component.sf.pcc.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class vj {
    int gm;
    boolean oo;
    final byte[] pcc;
    vj qf;
    int sf;
    boolean vj;
    vj wh;

    public vj() {
        this.pcc = new byte[8192];
        this.vj = true;
        this.oo = false;
    }

    public final vj pcc() {
        this.oo = true;
        return new vj(this.pcc, this.sf, this.gm, true, false);
    }

    public final vj sf() {
        vj vjVar = this.wh;
        vj vjVar2 = vjVar != this ? vjVar : null;
        vj vjVar3 = this.qf;
        if (vjVar3 != null) {
            vjVar3.wh = vjVar;
        }
        vj vjVar4 = this.wh;
        if (vjVar4 != null) {
            vjVar4.qf = vjVar3;
        }
        this.wh = null;
        this.qf = null;
        return vjVar2;
    }

    public vj(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.pcc = bArr;
        this.sf = i;
        this.gm = i2;
        this.oo = z;
        this.vj = z2;
    }

    public final vj pcc(vj vjVar) {
        vjVar.qf = this;
        vjVar.wh = this.wh;
        this.wh.qf = vjVar;
        this.wh = vjVar;
        return vjVar;
    }
}
