package ei;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class v {
    public static final AbstractC4212b a(AbstractC4212b from, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C4214d c4214d = new C4214d(from);
        builderAction.invoke(c4214d);
        return new u(c4214d.a(), c4214d.b());
    }

    public static /* synthetic */ AbstractC4212b b(AbstractC4212b abstractC4212b, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC4212b = AbstractC4212b.f46079d;
        }
        return a(abstractC4212b, function1);
    }
}
