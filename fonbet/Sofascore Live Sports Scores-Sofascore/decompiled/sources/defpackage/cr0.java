package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cr0 implements sjd {
    public static final cr0 a = new cr0();
    public static final nz7 b = nz7.a("timestamp");
    public static final nz7 c = nz7.a("type");
    public static final nz7 d = nz7.a("app");
    public static final nz7 e = nz7.a(U3.i.G);
    public static final nz7 f = nz7.a("log");
    public static final nz7 g = nz7.a("rollouts");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        nx3 nx3Var = (nx3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.g(b, ((ft0) nx3Var).a);
        ft0 ft0Var = (ft0) nx3Var;
        tjdVar.a(c, ft0Var.b);
        tjdVar.a(d, ft0Var.c);
        tjdVar.a(e, ft0Var.d);
        tjdVar.a(f, ft0Var.e);
        tjdVar.a(g, ft0Var.f);
    }
}
