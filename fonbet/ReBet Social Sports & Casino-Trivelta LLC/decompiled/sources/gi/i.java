package gi;

import Zh.InterfaceC1901b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public interface i {
    static InterfaceC1901b a(InterfaceC1901b interfaceC1901b, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return interfaceC1901b;
    }

    void c(KClass kClass, Function1 function1);

    void d(KClass kClass, KClass kClass2, InterfaceC1901b interfaceC1901b);

    void e(KClass kClass, Function1 function1);

    default void f(KClass kClass, final InterfaceC1901b serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        g(kClass, new Function1() { // from class: gi.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                InterfaceC1901b a10;
                a10 = i.a(InterfaceC1901b.this, (List) obj);
                return a10;
            }
        });
    }

    void g(KClass kClass, Function1 function1);
}
