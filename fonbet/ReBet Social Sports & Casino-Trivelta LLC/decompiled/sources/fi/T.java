package fi;

import bi.m;
import ei.AbstractC4212b;
import ei.EnumC4211a;
import ei.InterfaceC4215e;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public abstract class T {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4211a.values().length];
            try {
                iArr[EnumC4211a.f46075a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4211a.f46077c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4211a.f46076b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void b(bi.m kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof m.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof bi.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof bi.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(bi.f fVar, AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof InterfaceC4215e) {
                return ((InterfaceC4215e) annotation).discriminator();
            }
        }
        return json.f().e();
    }

    public static final Void d(String str, JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new C4284A("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + Reflection.getOrCreateKotlinClass(element.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final void e(Zh.p pVar, Zh.p pVar2, String str) {
        if ((pVar instanceof Zh.l) && di.Z.a(pVar2.getDescriptor()).contains(str)) {
            String h10 = ((Zh.l) pVar).getDescriptor().h();
            throw new IllegalStateException(("Sealed class '" + pVar2.getDescriptor().h() + "' cannot be serialized as base class '" + h10 + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
