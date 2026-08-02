package bg;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class n extends m {
    public static a a(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        k kVar = new k(1, it);
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new a(kVar);
    }

    public static Sequence b(Function1 nextFunction, Object obj) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? e.f3203a : new r(new a2.q(5, obj), nextFunction);
    }
}
