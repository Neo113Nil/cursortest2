package gi;

import Zh.InterfaceC1900a;
import Zh.InterfaceC1901b;
import Zh.p;
import gi.AbstractC4394a;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f47463a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f47464b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f47465c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f47466d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f47467e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47468f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f47463a = class2ContextualFactory;
        this.f47464b = polyBase2Serializers;
        this.f47465c = polyBase2DefaultSerializerProvider;
        this.f47466d = polyBase2NamedSerializers;
        this.f47467e = polyBase2DefaultDeserializerProvider;
        this.f47468f = z10;
    }

    @Override // gi.e
    public void a(i collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry entry : this.f47463a.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            AbstractC4394a abstractC4394a = (AbstractC4394a) entry.getValue();
            if (abstractC4394a instanceof AbstractC4394a.C0708a) {
                Intrinsics.checkNotNull(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC1901b b10 = ((AbstractC4394a.C0708a) abstractC4394a).b();
                Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.f(kClass, b10);
            } else {
                if (!(abstractC4394a instanceof AbstractC4394a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.g(kClass, ((AbstractC4394a.b) abstractC4394a).b());
            }
        }
        for (Map.Entry entry2 : this.f47464b.entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                InterfaceC1901b interfaceC1901b = (InterfaceC1901b) entry3.getValue();
                Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(kClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(interfaceC1901b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.d(kClass2, kClass3, interfaceC1901b);
            }
        }
        for (Map.Entry entry4 : this.f47465c.entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.checkNotNull(kClass4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.e(kClass4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
        }
        for (Map.Entry entry5 : this.f47467e.entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.checkNotNull(kClass5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.c(kClass5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function12, 1));
        }
    }

    @Override // gi.e
    public InterfaceC1901b b(KClass kClass, List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC4394a abstractC4394a = (AbstractC4394a) this.f47463a.get(kClass);
        InterfaceC1901b a10 = abstractC4394a != null ? abstractC4394a.a(typeArgumentsSerializers) : null;
        if (a10 != null) {
            return a10;
        }
        return null;
    }

    @Override // gi.e
    public boolean d() {
        return this.f47468f;
    }

    @Override // gi.e
    public InterfaceC1900a e(KClass baseClass, String str) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = (Map) this.f47466d.get(baseClass);
        InterfaceC1901b interfaceC1901b = map != null ? (InterfaceC1901b) map.get(str) : null;
        if (interfaceC1901b == null) {
            interfaceC1901b = null;
        }
        if (interfaceC1901b != null) {
            return interfaceC1901b;
        }
        Object obj = this.f47467e.get(baseClass);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (InterfaceC1900a) function1.invoke(str);
        }
        return null;
    }

    @Override // gi.e
    public p f(KClass baseClass, Object value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map map = (Map) this.f47464b.get(baseClass);
        InterfaceC1901b interfaceC1901b = map != null ? (InterfaceC1901b) map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
        if (interfaceC1901b == null) {
            interfaceC1901b = null;
        }
        if (interfaceC1901b != null) {
            return interfaceC1901b;
        }
        Object obj = this.f47465c.get(baseClass);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (p) function1.invoke(value);
        }
        return null;
    }
}
