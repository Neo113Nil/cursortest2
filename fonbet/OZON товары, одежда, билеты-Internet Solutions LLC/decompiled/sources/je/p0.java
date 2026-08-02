package je;

import java.util.List;
import je.o0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class p0 {
    @NotNull
    public static final o0 a(@NotNull o0 o0Var, @NotNull InterfaceC10030h newAnnotations) {
        o0 m11;
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        if (C7397q.a(o0Var) == newAnnotations) {
            return o0Var;
        }
        C7396p b11 = C7397q.b(o0Var);
        if (b11 != null && (m11 = o0Var.m(b11)) != null) {
            o0Var = m11;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? o0Var.l(new C7396p(newAnnotations)) : o0Var;
    }

    @NotNull
    public static final o0 b(@NotNull InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            o0.f69907b.getClass();
            return o0.f69908c;
        }
        o0.a aVar = o0.f69907b;
        List a02 = C7714v.a0(new C7396p(annotations));
        aVar.getClass();
        return o0.a.f(a02);
    }
}
