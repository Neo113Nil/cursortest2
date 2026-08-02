package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class p71 implements q7a {
    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        String q = dmi.q("https://", uaa.c);
        il9 il9Var = new il9(0);
        il9Var.h(null, q);
        jl9 c = il9Var.c();
        epf epfVar = (epf) p7aVar;
        qzf qzfVar = epfVar.e;
        il9 g = qzfVar.a.g();
        g.i(c.a);
        String host = c.j().toURI().getHost();
        host.getClass();
        g.f(host);
        jl9 c2 = g.c();
        pzf b = qzfVar.b();
        b.a = c2;
        return epfVar.b(new qzf(b));
    }
}
