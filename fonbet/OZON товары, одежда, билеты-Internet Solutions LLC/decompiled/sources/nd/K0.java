package nd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.J0;
import td.InterfaceC9833Y;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
final class K0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final J0.c f76888a;

    public K0(J0.c cVar) {
        this.f76888a = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        J0.c cVar = this.f76888a;
        InterfaceC9833Y setter = cVar.D().t().getSetter();
        if (setter != null) {
            return setter;
        }
        wd.T d11 = Vd.h.d(cVar.D().t(), InterfaceC10030h.a.b(), InterfaceC10030h.a.b());
        Intrinsics.checkNotNullExpressionValue(d11, "createDefaultSetter(...)");
        return d11;
    }
}
