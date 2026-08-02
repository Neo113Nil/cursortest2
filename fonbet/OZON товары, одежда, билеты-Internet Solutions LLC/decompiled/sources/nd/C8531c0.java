package nd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9831W;

/* renamed from: nd.c0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8531c0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8531c0 f76956a = new C8531c0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9831W descriptor = (InterfaceC9831W) obj;
        int i11 = AbstractC8537f0.f76966b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Ud.n.f27604c.E(descriptor) + " | " + c1.c(descriptor).a();
    }
}
