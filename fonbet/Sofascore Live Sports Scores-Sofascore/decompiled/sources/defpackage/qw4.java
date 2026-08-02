package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qw4 extends bw4 implements ug3, tkd {
    public final /* synthetic */ int q;
    public final wzc r;
    public final boolean s;
    public final float t;
    public y20 u;
    public final c23 v;

    public qw4(wzc wzcVar, boolean z, pw4 pw4Var) {
        this.q = 1;
        this.r = wzcVar;
        this.s = z;
        this.t = Float.NaN;
        this.v = pw4Var;
    }

    @Override // defpackage.tkd
    public final void Z() {
        switch (this.q) {
            case 0:
                z1a.R(this, new nw4(this, 0));
                break;
            default:
                z1a.R(this, new ow4(this, 0));
                break;
        }
    }

    @Override // defpackage.wtc
    public final void c1() {
        switch (this.q) {
            case 0:
                z1a.R(this, new nw4(this, 0));
                break;
            default:
                z1a.R(this, new ow4(this, 0));
                break;
        }
    }

    public qw4(wzc wzcVar, boolean z, float f, pw4 pw4Var) {
        this.q = 0;
        this.r = wzcVar;
        this.s = z;
        this.t = f;
        this.v = pw4Var;
    }
}
