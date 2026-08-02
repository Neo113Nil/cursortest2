package nd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9857w;

/* renamed from: nd.d0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8533d0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8533d0 f76960a = new C8533d0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9857w descriptor = (InterfaceC9857w) obj;
        int i11 = AbstractC8537f0.f76966b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Ud.n.f27604c.E(descriptor) + " | " + c1.d(descriptor).a();
    }
}
