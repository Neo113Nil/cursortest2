package io.sentry;

import io.sentry.protocol.C7187c;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface V {
    void a(@NotNull Collection<C7141f> collection);

    void b(@NotNull String str);

    void c(@NotNull String str, @NotNull String str2);

    void d(io.sentry.protocol.E e11);

    void e(@NotNull C7187c c7187c);

    void f(@NotNull C7141f c7141f);

    void g(@NotNull ConcurrentHashMap concurrentHashMap);

    void h(@NotNull List list);

    void i(j3 j3Var, @NotNull C7209u1 c7209u1);

    void j(io.sentry.protocol.o oVar);

    void k(I2 i22);

    void l(@NotNull String str);

    void m(@NotNull ConcurrentHashMap concurrentHashMap);

    void o(@NotNull io.sentry.protocol.t tVar);

    void p(String str);

    void setTag(@NotNull String str, @NotNull String str2);
}
