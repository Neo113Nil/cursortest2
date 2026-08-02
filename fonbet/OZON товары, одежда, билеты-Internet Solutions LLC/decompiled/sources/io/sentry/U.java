package io.sentry;

import io.sentry.C7209u1;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7191g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface U {
    @NotNull
    Y A();

    @NotNull
    List<InterfaceC7227z> B();

    void C(@NotNull C7175n1 c7175n1);

    void D(@NotNull W2 w22);

    @NotNull
    List<io.sentry.internal.eventprocessor.a> E();

    @NotNull
    List<String> F();

    String G();

    @NotNull
    C7175n1 H();

    void I(@NotNull C7125b c7125b);

    @NotNull
    List<C7125b> J();

    @NotNull
    C7175n1 K(@NotNull C7209u1.a aVar);

    void L(@NotNull C7209u1.c cVar);

    void M(@NotNull io.sentry.protocol.t tVar);

    String a();

    void c(String str, String str2);

    void clear();

    @NotNull
    U clone();

    void d(io.sentry.protocol.E e11);

    void f(@NotNull C7141f c7141f);

    void g(@NotNull C7141f c7141f, E e11);

    @NotNull
    Map<String, Object> getExtras();

    C7191g getFeatureFlags();

    I2 getLevel();

    @NotNull
    W2 getOptions();

    io.sentry.protocol.o getRequest();

    @NotNull
    Map<String, String> getTags();

    io.sentry.protocol.E getUser();

    InterfaceC7142f0 i();

    void j(io.sentry.protocol.o oVar);

    void k(I2 i22);

    C7209u1.d l();

    InterfaceC7134d0 m();

    h3 n();

    void o(@NotNull io.sentry.protocol.t tVar);

    void p(@NotNull String str);

    @NotNull
    Queue<C7141f> q();

    h3 r(@NotNull C7209u1.b bVar);

    @NotNull
    C7187c s();

    void setTag(String str, String str2);

    void t(InterfaceC7142f0 interfaceC7142f0);

    void u(@NotNull ArrayList arrayList);

    void v();

    @NotNull
    io.sentry.featureflags.b w();

    h3 x();

    @NotNull
    io.sentry.protocol.t y();

    void z(String str);
}
