package sd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;

/* loaded from: classes10.dex */
final class s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final u f98608a;

    public s(u uVar) {
        this.f98608a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        InterfaceC9836b interfaceC9836b = (InterfaceC9836b) obj;
        if (interfaceC9836b.getKind() == InterfaceC9836b.a.DECLARATION) {
            this.f98608a.getClass();
            InterfaceC9845k d11 = interfaceC9836b.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC9839e mutable = (InterfaceC9839e) d11;
            Intrinsics.checkNotNullParameter(mutable, "mutable");
            int i11 = C9661c.f98575o;
            if (C9661c.h(Vd.i.k(mutable))) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
