package nd;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import nd.X;
import td.C9856v;
import td.InterfaceC9839e;

/* renamed from: nd.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8506C implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X f76853a;

    public C8506C(X x11) {
        this.f76853a = x11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X x11 = this.f76853a;
        Sd.b K11 = X.K(x11);
        yd.j a11 = ((X.a) x11.N().getValue()).a();
        InterfaceC9839e b11 = (K11.i() && x11.c().isAnnotationPresent(Metadata.class)) ? a11.a().b(K11) : C9856v.a(a11.b(), K11);
        return b11 == null ? X.J(x11, K11, a11) : b11;
    }
}
