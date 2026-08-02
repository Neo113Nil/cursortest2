package qd;

import kotlin.collections.C7714v;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import re.C9257a;
import td.C9819J;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import wd.L;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9819J f81851a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f81852b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f81853c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f81850e = {N.h(new E(N.b(r.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), N.h(new E(N.b(r.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), N.h(new E(N.b(r.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), N.h(new E(N.b(r.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), N.h(new E(N.b(r.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), N.h(new E(N.b(r.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), N.h(new E(N.b(r.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), N.h(new E(N.b(r.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f81849d = new b();

    private static final class a {
    }

    public static final class b {
    }

    public r(@NotNull L module, @NotNull C9819J notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f81851a = notFoundClasses;
        this.f81852b = Sc.k.a(Sc.n.PUBLICATION, new q(module));
        this.f81853c = new a();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final InterfaceC9839e a() {
        kotlin.reflect.m<Object> property = f81850e[0];
        this.f81853c.getClass();
        Intrinsics.checkNotNullParameter(this, "types");
        Intrinsics.checkNotNullParameter(property, "property");
        Sd.f f7 = Sd.f.f(C9257a.a(property.getName()));
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        InterfaceC9842h d11 = ((ce.l) this.f81852b.getValue()).d(f7, Bd.c.FROM_REFLECTION);
        InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
        if (interfaceC9839e == null) {
            return this.f81851a.c(new Sd.b(s.f81862i, f7), C7714v.a0(1));
        }
        return interfaceC9839e;
    }
}
