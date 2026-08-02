package ch;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e {
    public static final void a(InterfaceC2925b interfaceC2925b, InterfaceC2925b other) {
        Intrinsics.checkNotNullParameter(interfaceC2925b, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (C2924a c2924a : other.a()) {
            Intrinsics.checkNotNull(c2924a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            interfaceC2925b.b(c2924a, other.g(c2924a));
        }
    }
}
