package nd;

import java.lang.reflect.Type;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.X;
import td.InterfaceC9839e;
import td.InterfaceC9842h;

/* renamed from: nd.L, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8515L implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final je.N f76889a;

    /* renamed from: b, reason: collision with root package name */
    private final X.a f76890b;

    /* renamed from: c, reason: collision with root package name */
    private final X f76891c;

    public C8515L(je.N n11, X.a aVar, X x11) {
        this.f76889a = n11;
        this.f76890b = aVar;
        this.f76891c = x11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC9842h p11 = this.f76889a.H0().p();
        if (!(p11 instanceof InterfaceC9839e)) {
            throw new V0("Supertype not a class: " + p11);
        }
        Class<?> l11 = g1.l((InterfaceC9839e) p11);
        X.a aVar = this.f76890b;
        if (l11 == null) {
            throw new V0("Unsupported superclass of " + aVar + ": " + p11);
        }
        X x11 = this.f76891c;
        if (Intrinsics.d(x11.c().getSuperclass(), l11)) {
            Type genericSuperclass = x11.c().getGenericSuperclass();
            Intrinsics.f(genericSuperclass);
            return genericSuperclass;
        }
        Class<?>[] interfaces = x11.c().getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        int M11 = C7705l.M(interfaces, l11);
        if (M11 >= 0) {
            Type type = x11.c().getGenericInterfaces()[M11];
            Intrinsics.f(type);
            return type;
        }
        throw new V0("No superclass of " + aVar + " in Java reflection for " + p11);
    }
}
