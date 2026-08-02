package di;

import Zh.InterfaceC1901b;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class R0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f45322a = D0.i();

    public static final bi.f a(String serialName, bi.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        c(serialName);
        return new Q0(serialName, kind);
    }

    public static final InterfaceC1901b b(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (InterfaceC1901b) f45322a.get(kClass);
    }

    public static final void c(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        for (InterfaceC1901b interfaceC1901b : f45322a.values()) {
            if (Intrinsics.areEqual(serialName, interfaceC1901b.getDescriptor().h())) {
                throw new IllegalArgumentException(StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + Reflection.getOrCreateKotlinClass(interfaceC1901b.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
