package ie;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface o {
    @NotNull
    <T> InterfaceC7061j<T> a(@NotNull Function0<? extends T> function0);

    @NotNull
    <T> InterfaceC7062k<T> b(@NotNull Function0<? extends T> function0);

    @NotNull
    InterfaceC7061j c(Function1 function1, @NotNull Function0 function0, @NotNull Function1 function12);

    @NotNull
    <K, V> InterfaceC7059h<K, V> d(@NotNull Function1<? super K, ? extends V> function1);
}
