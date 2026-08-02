package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xpg extends xh9 {
    public final byte[] g;
    public final boolean h;

    public xpg(vh9 vh9Var, xj9 xj9Var, aq4 aq4Var, byte[] bArr) {
        super(vh9Var);
        this.g = bArr;
        this.b = new ypg(this, xj9Var);
        this.c = new aq4(this, bArr, aq4Var);
        i2a.t(xw3.B(aq4Var), bArr.length, xj9Var.getMethod());
        this.h = true;
    }

    @Override // defpackage.xh9
    public final boolean b() {
        return this.h;
    }

    @Override // defpackage.xh9
    public final Object e() {
        return n9e.b(this.g);
    }
}
