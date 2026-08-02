package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: kotlinx.coroutines.flow.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC5333o {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f54800a = new Function1() { // from class: kotlinx.coroutines.flow.m
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object d10;
            d10 = AbstractC5333o.d(obj);
            return d10;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final Function2 f54801b = new Function2() { // from class: kotlinx.coroutines.flow.n
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            boolean c10;
            c10 = AbstractC5333o.c(obj, obj2);
            return Boolean.valueOf(c10);
        }
    };

    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final Object d(Object obj) {
        return obj;
    }

    public static final InterfaceC5321f e(InterfaceC5321f interfaceC5321f) {
        return interfaceC5321f instanceof L ? interfaceC5321f : g(interfaceC5321f, f54800a, f54801b);
    }

    public static final InterfaceC5321f f(InterfaceC5321f interfaceC5321f, Function2 function2) {
        Function1 function1 = f54800a;
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return g(interfaceC5321f, function1, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
    }

    public static final InterfaceC5321f g(InterfaceC5321f interfaceC5321f, Function1 function1, Function2 function2) {
        if (interfaceC5321f instanceof C5320e) {
            C5320e c5320e = (C5320e) interfaceC5321f;
            if (c5320e.f54681b == function1 && c5320e.f54682c == function2) {
                return interfaceC5321f;
            }
        }
        return new C5320e(interfaceC5321f, function1, function2);
    }
}
