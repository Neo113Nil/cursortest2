package kotlin.reflect;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {
    @NotNull
    public static final void a(@NotNull d dVar, Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.A(obj)) {
            Intrinsics.g(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        } else {
            throw new ClassCastException("Value cannot be cast to " + dVar.u());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T b(@NotNull d<T> dVar, Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!dVar.A(obj)) {
            return null;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
