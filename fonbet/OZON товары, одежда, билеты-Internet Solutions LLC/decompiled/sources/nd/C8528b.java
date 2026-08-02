package nd;

import Sc.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: nd.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8528b {
    static {
        Object a11;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = Class.forName("java.lang.ClassValue");
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (!(a11 instanceof r.b)) {
            a11 = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (a11 instanceof r.b) {
            a11 = obj;
        }
    }

    @NotNull
    public static final <V> AbstractC8526a<V> a(@NotNull Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new C8542i(compute);
    }
}
