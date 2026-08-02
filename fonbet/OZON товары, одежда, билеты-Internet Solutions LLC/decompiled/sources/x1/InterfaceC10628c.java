package x1;

import androidx.compose.ui.platform.c2;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10628c extends Z1.d {
    default Object J0(long j11, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
        return function2.invoke(this, aVar);
    }

    default long W0() {
        return 0L;
    }

    long a();

    @NotNull
    c2 b();

    @NotNull
    C10638m b1();

    Object i0(@NotNull EnumC10640o enumC10640o, @NotNull kotlin.coroutines.jvm.internal.a aVar);

    default Object k1(long j11, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
        return function2.invoke(this, aVar);
    }
}
