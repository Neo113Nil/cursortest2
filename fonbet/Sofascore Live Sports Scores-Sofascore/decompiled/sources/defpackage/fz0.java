package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class fz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fz0(Object obj, int i, long j, long j2, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                bn4 bn4Var = ((gz0) obj).b;
                ox9 ox9Var = bn4Var.d;
                pv u = bn4Var.u(((hv9) ox9Var.c).isEmpty() ? null : (rcc) jca.H((hv9) ox9Var.c));
                bn4Var.z(u, 1006, new wm4(u, this.b, this.c, this.d, 0));
                break;
            default:
                cn4 cn4Var = ((hz0) obj).b;
                vng vngVar = cn4Var.d;
                qv m = cn4Var.m(((hv9) vngVar.b).isEmpty() ? null : (scc) jca.H((hv9) vngVar.b));
                cn4Var.q(m, 1006, new wm4(m, this.b, this.c, this.d, 1));
                break;
        }
    }
}
