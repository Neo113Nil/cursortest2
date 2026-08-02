package m1;

import m3.r;
import t3.C9737c;
import u3.InterfaceC9928b;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements InterfaceC8038i, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f73979a;

    public /* synthetic */ o(q qVar) {
        this.f73979a = qVar;
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        q qVar = (q) this.f73979a;
        double a11 = qVar.a();
        double b11 = qVar.b();
        double c11 = qVar.c();
        return d11 >= qVar.d() ? Math.pow((a11 * d11) + b11, qVar.g()) + qVar.e() : (c11 * d11) + qVar.f();
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).a((C9737c) this.f73979a);
    }

    public /* synthetic */ o(InterfaceC9928b.a aVar, C9737c c9737c) {
        this.f73979a = c9737c;
    }
}
