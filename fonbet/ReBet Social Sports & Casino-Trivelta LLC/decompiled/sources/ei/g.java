package ei;

import Zh.InterfaceC1900a;
import Zh.InterfaceC1901b;
import bi.d;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public abstract class g implements InterfaceC1901b {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f46121a;

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f46122b;

    public g(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f46121a = baseClass;
        this.f46122b = bi.l.h("JsonContentPolymorphicSerializer<" + baseClass.getSimpleName() + Typography.greater, d.b.f25204a, new bi.f[0], null, 8, null);
    }

    public abstract InterfaceC1900a b(JsonElement jsonElement);

    public final Void c(KClass kClass, KClass kClass2) {
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(kClass);
        }
        throw new Zh.o("Class '" + simpleName + "' is not registered for polymorphic serialization " + ("in the scope of '" + kClass2.getSimpleName() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // Zh.InterfaceC1900a
    public final Object deserialize(ci.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        h d10 = r.d(decoder);
        JsonElement j10 = d10.j();
        InterfaceC1900a b10 = b(j10);
        Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return d10.d().c((InterfaceC1901b) b10, j10);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f46122b;
    }

    @Override // Zh.p
    public final void serialize(ci.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Zh.p f10 = encoder.a().f(this.f46121a, value);
        if (f10 == null && (f10 = Zh.x.d(Reflection.getOrCreateKotlinClass(value.getClass()))) == null) {
            c(Reflection.getOrCreateKotlinClass(value.getClass()), this.f46121a);
            throw new KotlinNothingValueException();
        }
        ((InterfaceC1901b) f10).serialize(encoder, value);
    }
}
