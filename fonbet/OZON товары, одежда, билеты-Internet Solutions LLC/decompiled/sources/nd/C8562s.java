package nd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.J0;
import ud.InterfaceC10030h;

/* renamed from: nd.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8562s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77032a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8504A f77033b;

    public /* synthetic */ C8562s(AbstractC8504A abstractC8504A, int i11) {
        this.f77032a = i11;
        this.f77033b = abstractC8504A;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f77032a) {
            case 0:
                AbstractC8504A abstractC8504A = this.f77033b;
                je.N returnType = abstractC8504A.t().getReturnType();
                Intrinsics.f(returnType);
                return new R0(returnType, new C8576z(abstractC8504A));
            default:
                J0.b bVar = (J0.b) this.f77033b;
                wd.S getter = bVar.D().t().getGetter();
                if (getter != null) {
                    return getter;
                }
                wd.S c11 = Vd.h.c(bVar.D().t(), InterfaceC10030h.a.b());
                Intrinsics.checkNotNullExpressionValue(c11, "createDefaultGetter(...)");
                return c11;
        }
    }
}
