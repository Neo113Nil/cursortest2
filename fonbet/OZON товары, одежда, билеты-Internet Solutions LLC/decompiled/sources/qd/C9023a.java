package qd;

import java.util.ServiceLoader;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qd.InterfaceC9024b;

/* renamed from: qd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9023a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C9023a f81825a = new C9023a();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC9024b.a aVar = InterfaceC9024b.a.f81827a;
        ServiceLoader load = ServiceLoader.load(InterfaceC9024b.class, InterfaceC9024b.class.getClassLoader());
        Intrinsics.f(load);
        InterfaceC9024b interfaceC9024b = (InterfaceC9024b) C7714v.L(load);
        if (interfaceC9024b != null) {
            return interfaceC9024b;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
