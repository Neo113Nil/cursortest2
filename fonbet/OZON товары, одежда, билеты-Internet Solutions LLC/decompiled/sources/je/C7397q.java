package je;

import je.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10030h;

/* renamed from: je.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7397q {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f69910a = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.d(C7397q.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final qe.q f69911b;

    static {
        o0.a aVar = o0.f69907b;
        kotlin.reflect.d kClass = kotlin.jvm.internal.N.b(C7396p.class);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String u11 = kClass.u();
        Intrinsics.f(u11);
        f69911b = new qe.q(aVar.c(u11));
    }

    @NotNull
    public static final InterfaceC10030h a(@NotNull o0 o0Var) {
        InterfaceC10030h d11;
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        C7396p b11 = b(o0Var);
        return (b11 == null || (d11 = b11.d()) == null) ? InterfaceC10030h.a.b() : d11;
    }

    public static final C7396p b(@NotNull o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        return (C7396p) f69911b.getValue(o0Var, f69910a[0]);
    }
}
