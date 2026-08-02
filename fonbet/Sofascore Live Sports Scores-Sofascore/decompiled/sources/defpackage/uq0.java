package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uq0 implements sjd {
    public static final uq0 a = new uq0();
    public static final nz7 b = nz7.a("baseAddress");
    public static final nz7 c = nz7.a("size");
    public static final nz7 d = nz7.a("name");
    public static final nz7 e = nz7.a("uuid");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        ax3 ax3Var = (ax3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.g(b, ((jt0) ax3Var).a);
        jt0 jt0Var = (jt0) ax3Var;
        tjdVar.g(c, jt0Var.b);
        tjdVar.a(d, jt0Var.c);
        String str = jt0Var.d;
        tjdVar.a(e, str != null ? str.getBytes(rx3.a) : null);
    }
}
