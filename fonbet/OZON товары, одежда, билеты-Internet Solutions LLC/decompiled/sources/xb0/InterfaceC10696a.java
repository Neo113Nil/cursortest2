package xb0;

import Ld0.e;
import We.B;
import We.InterfaceC4875q;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zb0.AbstractC11016a;

/* renamed from: xb0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC10696a extends e {
    boolean I();

    @NotNull
    AbstractC11016a M();

    @NotNull
    InterfaceC4875q getCookieJar();

    @NotNull
    List<B> getInterceptors();

    @NotNull
    List<B> getNetworkInterceptors();

    String getSessionId();

    long getUserId();

    void r(@NotNull Pb0.a aVar);
}
