package m0;

import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7992h<T, V extends AbstractC8015t> {
    boolean a();

    default boolean b(long j11) {
        return j11 >= c();
    }

    long c();

    @NotNull
    U0<T, V> d();

    T e(long j11);

    T f();

    @NotNull
    V g(long j11);
}
