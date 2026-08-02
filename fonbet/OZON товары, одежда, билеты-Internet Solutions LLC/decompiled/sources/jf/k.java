package jf;

import We.F;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jf.l;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import p002if.C7070d;
import p002if.j;

/* loaded from: classes6.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f69997a = new a();

    public static final class a implements l.a {
        @Override // jf.l.a
        public final boolean a(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            C7070d.f66382f.getClass();
            return C7070d.a.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // jf.l.a
        @NotNull
        public final m b(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new k();
        }
    }

    @Override // jf.m
    public final boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // jf.m
    public final boolean b() {
        C7070d.f66382f.getClass();
        return C7070d.a.c();
    }

    @Override // jf.m
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // jf.m
    public final void d(@NotNull SSLSocket sslSocket, String str, @NotNull List<? extends F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            p002if.j.f66400c.getClass();
            Object[] array = j.a.a(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
