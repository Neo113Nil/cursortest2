package ze;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface x<E> {
    void a(@NotNull Function1<? super Throwable, Unit> function1);

    @NotNull
    Object b(E e11);

    boolean g();

    boolean l(Throwable th2);

    Object n(E e11, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
