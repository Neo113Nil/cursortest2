package v0;

import a1.C4912a;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface G {
    static /* synthetic */ void c(G g10, int i11, Function1 function1, C4912a c4912a, int i12) {
        if ((i12 & 2) != 0) {
            function1 = null;
        }
        g10.a(i11, function1, F.f101461b, c4912a);
    }

    static /* synthetic */ void e(G g10, String str, C4912a c4912a, int i11) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        g10.d(str, c4912a);
    }

    default void a(int i11, Function1 function1, @NotNull Function1 function12, @NotNull C4912a c4912a) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void d(Object obj, @NotNull C4912a c4912a) {
        throw new IllegalStateException("The method is not implemented");
    }
}
