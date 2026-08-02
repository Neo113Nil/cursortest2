package xe;

import De.C2866i;
import Sc.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Q {
    @NotNull
    public static final String a(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static final String b(@NotNull kotlin.coroutines.d<?> dVar) {
        Object a11;
        if (dVar instanceof C2866i) {
            return ((C2866i) dVar).toString();
        }
        try {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = dVar + '@' + a(dVar);
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (Sc.r.b(a11) != null) {
            a11 = dVar.getClass().getName() + '@' + a(dVar);
        }
        return (String) a11;
    }
}
