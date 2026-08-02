package gi;

import Zh.InterfaceC1901b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f47458a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1901b f47459b;

    /* renamed from: c, reason: collision with root package name */
    public final List f47460c;

    /* renamed from: d, reason: collision with root package name */
    public Function1 f47461d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f47462e;

    public b(KClass baseClass, InterfaceC1901b interfaceC1901b) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f47458a = baseClass;
        this.f47459b = interfaceC1901b;
        this.f47460c = new ArrayList();
    }

    public final void a(f builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        InterfaceC1901b interfaceC1901b = this.f47459b;
        if (interfaceC1901b != null) {
            KClass kClass = this.f47458a;
            f.l(builder, kClass, kClass, interfaceC1901b, false, 8, null);
        }
        for (Pair pair : this.f47460c) {
            KClass kClass2 = (KClass) pair.component1();
            InterfaceC1901b interfaceC1901b2 = (InterfaceC1901b) pair.component2();
            KClass kClass3 = this.f47458a;
            Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            Intrinsics.checkNotNull(interfaceC1901b2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            f.l(builder, kClass3, kClass2, interfaceC1901b2, false, 8, null);
        }
        Function1 function1 = this.f47461d;
        if (function1 != null) {
            builder.j(this.f47458a, function1, false);
        }
        Function1 function12 = this.f47462e;
        if (function12 != null) {
            builder.i(this.f47458a, function12, false);
        }
    }

    public final void b(KClass subclass, InterfaceC1901b serializer) {
        Intrinsics.checkNotNullParameter(subclass, "subclass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f47460c.add(TuplesKt.to(subclass, serializer));
    }
}
