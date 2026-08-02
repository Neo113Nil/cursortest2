package fi;

import Zh.InterfaceC1901b;
import bi.m;
import bi.n;
import ei.C4216f;
import ei.EnumC4211a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public final class I implements gi.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f46690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46691b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46692c;

    public I(C4216f configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f46690a = configuration.e();
        this.f46691b = configuration.p();
        this.f46692c = configuration.f() != EnumC4211a.f46075a;
    }

    @Override // gi.i
    public void c(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // gi.i
    public void d(KClass baseClass, KClass actualClass, InterfaceC1901b actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        bi.f descriptor = actualSerializer.getDescriptor();
        i(descriptor, actualClass);
        if (this.f46691b || !this.f46692c) {
            return;
        }
        h(descriptor, actualClass);
    }

    @Override // gi.i
    public void e(KClass baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // gi.i
    public void f(KClass kClass, InterfaceC1901b interfaceC1901b) {
        super.f(kClass, interfaceC1901b);
    }

    @Override // gi.i
    public void g(KClass kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    public final void h(bi.f fVar, KClass kClass) {
        int d10 = fVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            String e10 = fVar.e(i10);
            if (Intrinsics.areEqual(e10, this.f46690a)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + e10 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void i(bi.f fVar, KClass kClass) {
        bi.m kind = fVar.getKind();
        if ((kind instanceof bi.d) || Intrinsics.areEqual(kind, m.a.f25228a)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.f46691b && this.f46692c) {
            if (Intrinsics.areEqual(kind, n.b.f25231a) || Intrinsics.areEqual(kind, n.c.f25232a) || (kind instanceof bi.e) || (kind instanceof m.b)) {
                throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }
}
