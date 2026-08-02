package ec;

import cc.InterfaceC2910b;
import dc.C4051a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2910b.C0446b f45926a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2910b.c f45927b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f45928c;

    @Override // ec.c
    public void a(InterfaceC2910b.C0446b c0446b, Throwable th2) {
        f(c0446b);
        h(th2);
    }

    @Override // ec.c
    public InterfaceC2910b.C0446b b() {
        return this.f45926a;
    }

    @Override // ec.c
    public void c(C4200a context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a(null, new C4051a("Non-interactive decryption mode."));
    }

    @Override // ec.c
    public InterfaceC2910b.c d() {
        return this.f45927b;
    }

    @Override // ec.c
    public void e(InterfaceC2910b.c cVar, Throwable th2) {
        g(cVar);
        h(th2);
    }

    public void f(InterfaceC2910b.C0446b c0446b) {
        this.f45926a = c0446b;
    }

    public void g(InterfaceC2910b.c cVar) {
        this.f45927b = cVar;
    }

    @Override // ec.c
    public Throwable getError() {
        return this.f45928c;
    }

    public void h(Throwable th2) {
        this.f45928c = th2;
    }
}
