package nd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.AbstractC8537f0;

/* renamed from: nd.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8510G implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X f76865a;

    public C8510G(X x11) {
        this.f76865a = x11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X x11 = this.f76865a;
        ce.l q02 = x11.b().q0();
        Intrinsics.checkNotNullExpressionValue(q02, "getStaticScope(...)");
        return x11.z(q02, AbstractC8537f0.c.INHERITED);
    }
}
