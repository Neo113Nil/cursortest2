package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vq0 implements sjd {
    public static final vq0 a = new vq0();
    public static final nz7 b = nz7.a("threads");
    public static final nz7 c = nz7.a("exception");
    public static final nz7 d = nz7.a("appExitInfo");
    public static final nz7 e = nz7.a("profilingManagerInfo");
    public static final nz7 f = nz7.a("signal");
    public static final nz7 g = nz7.a("binaries");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        fx3 fx3Var = (fx3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.a(b, ((it0) fx3Var).a);
        it0 it0Var = (it0) fx3Var;
        tjdVar.a(c, it0Var.b);
        tjdVar.a(d, it0Var.c);
        tjdVar.a(e, it0Var.d);
        tjdVar.a(f, it0Var.e);
        tjdVar.a(g, it0Var.f);
    }
}
