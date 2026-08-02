package kotlin.coroutines;

import jg.x;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {
    public static CoroutineContext.Element a(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!Intrinsics.areEqual(element.getKey(), key)) {
            return null;
        }
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
        return element;
    }

    public static CoroutineContext b(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.areEqual(element.getKey(), key) ? g.f19227a : element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f19227a ? element : (CoroutineContext) context.O(element, new x(3));
    }
}
