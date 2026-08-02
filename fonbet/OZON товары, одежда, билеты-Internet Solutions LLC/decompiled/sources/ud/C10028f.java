package ud;

import je.L0;
import je.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9815F;

/* renamed from: ud.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10028f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final qd.m f100645a;

    public C10028f(qd.m mVar) {
        this.f100645a = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9815F module = (InterfaceC9815F) obj;
        Intrinsics.checkNotNullParameter(module, "module");
        Y m11 = module.n().m(L0.INVARIANT, this.f100645a.N());
        Intrinsics.checkNotNullExpressionValue(m11, "getArrayType(...)");
        return m11;
    }
}
