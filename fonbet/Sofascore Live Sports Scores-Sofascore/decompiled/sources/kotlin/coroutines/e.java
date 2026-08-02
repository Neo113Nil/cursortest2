package kotlin.coroutines;

import defpackage.xt3;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class e {
    public static Object a(CoroutineContext.Element element, Object obj, Function2 function2) {
        function2.getClass();
        return function2.invoke(obj, element);
    }

    public static CoroutineContext.Element b(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        if (Intrinsics.c(element.getKey(), fVar)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext c(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        return Intrinsics.c(element.getKey(), fVar) ? g.a : element;
    }

    public static CoroutineContext d(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.a ? element : (CoroutineContext) coroutineContext.fold(element, new xt3(0));
    }
}
