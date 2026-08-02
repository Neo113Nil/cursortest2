package lf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation a(Function2 function2, Continuation continuation, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((mf.a) function2).create(continuation, completion);
    }

    public static Continuation b(Continuation continuation) {
        Continuation<Object> intercepted;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        mf.c cVar = continuation instanceof mf.c ? (mf.c) continuation : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? continuation : intercepted;
    }

    public static Object c(Function2 function2, Object obj, Continuation completion) {
        Object cVar;
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        if (context == g.f19227a) {
            Intrinsics.checkNotNull(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            cVar = new b(completion);
        } else {
            Intrinsics.checkNotNull(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            cVar = new c(completion, context);
        }
        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, cVar);
    }
}
