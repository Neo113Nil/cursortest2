package bi;

import bi.n;
import di.R0;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class l {
    public static final f c(String serialName, e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return R0.a(serialName, kind);
    }

    public static final f d(String serialName, f[] typeParameters, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C2425a c2425a = new C2425a(serialName);
        builderAction.invoke(c2425a);
        return new h(serialName, n.a.f25230a, c2425a.f().size(), ArraysKt.toList(typeParameters), c2425a);
    }

    public static /* synthetic */ f e(String str, f[] fVarArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: bi.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit f10;
                    f10 = l.f((C2425a) obj2);
                    return f10;
                }
            };
        }
        return d(str, fVarArr, function1);
    }

    public static final Unit f(C2425a c2425a) {
        Intrinsics.checkNotNullParameter(c2425a, "<this>");
        return Unit.INSTANCE;
    }

    public static final f g(String serialName, m kind, f[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, n.a.f25230a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C2425a c2425a = new C2425a(serialName);
        builder.invoke(c2425a);
        return new h(serialName, kind, c2425a.f().size(), ArraysKt.toList(typeParameters), c2425a);
    }

    public static /* synthetic */ f h(String str, m mVar, f[] fVarArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: bi.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit i11;
                    i11 = l.i((C2425a) obj2);
                    return i11;
                }
            };
        }
        return g(str, mVar, fVarArr, function1);
    }

    public static final Unit i(C2425a c2425a) {
        Intrinsics.checkNotNullParameter(c2425a, "<this>");
        return Unit.INSTANCE;
    }
}
