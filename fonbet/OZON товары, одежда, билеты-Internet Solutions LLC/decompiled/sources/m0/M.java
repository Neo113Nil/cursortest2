package m0;

import S0.C3961h0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class M {
    public static final Object a(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        androidx.compose.ui.platform.Y0 y02 = (androidx.compose.ui.platform.Y0) cVar.getContext().get(androidx.compose.ui.platform.Y0.f40783d0);
        if (y02 == null) {
            return C3961h0.a(cVar.getContext()).v(function1, cVar);
        }
        new L(function1, null);
        return y02.R();
    }
}
