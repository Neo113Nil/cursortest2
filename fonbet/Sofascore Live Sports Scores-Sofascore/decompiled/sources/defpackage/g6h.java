package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface g6h {
    void a(KClass kClass, KClass kClass2, KSerializer kSerializer);

    void b(KClass kClass, Function1 function1);

    default void c(KClass kClass, KSerializer kSerializer) {
        h(kClass, new qfg(kSerializer, 14));
    }

    void d(KClass kClass, Function1 function1);

    void h(KClass kClass, Function1 function1);
}
