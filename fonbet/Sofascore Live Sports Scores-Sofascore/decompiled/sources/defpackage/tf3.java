package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class tf3 extends fjg {
    public final yea d;
    public int e;

    public tf3(yz1 yz1Var, yea yeaVar) {
        super((Object) yz1Var, (byte) 0);
        this.d = yeaVar;
    }

    @Override // defpackage.fjg
    public final void d() {
        this.a = true;
        this.e++;
    }

    @Override // defpackage.fjg
    public final void g() {
        this.a = false;
        ((yz1) this.b).g("\n");
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            o(this.d.a.g);
        }
    }

    @Override // defpackage.fjg
    public final void i() {
        if (this.a) {
            this.a = false;
        } else {
            g();
        }
    }

    @Override // defpackage.fjg
    public final void s() {
        l(' ');
    }

    @Override // defpackage.fjg
    public final void t() {
        this.e--;
    }
}
