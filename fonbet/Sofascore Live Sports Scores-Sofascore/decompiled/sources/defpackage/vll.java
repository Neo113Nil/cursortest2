package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vll extends wtc implements oma {
    public l35 o;
    public boolean p;
    public Function2 q;

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        l35 l35Var = this.o;
        l35 l35Var2 = l35.a;
        int j2 = l35Var != l35Var2 ? 0 : an3.j(j);
        l35 l35Var3 = this.o;
        l35 l35Var4 = l35.b;
        qhe J = g1cVar.J(cn3.a(j2, (this.o == l35Var2 || !this.p) ? an3.h(j) : Integer.MAX_VALUE, l35Var3 == l35Var4 ? an3.i(j) : 0, (this.o == l35Var4 || !this.p) ? an3.g(j) : Integer.MAX_VALUE));
        int c = llf.c(J.a, an3.j(j), an3.h(j));
        int c2 = llf.c(J.b, an3.i(j), an3.g(j));
        return m1c.G0(m1cVar, c, c2, new i16(this, c, J, c2, m1cVar));
    }
}
