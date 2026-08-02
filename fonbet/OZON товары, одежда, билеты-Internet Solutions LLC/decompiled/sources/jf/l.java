package jf;

import We.F;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    private m f69998a;

    /* renamed from: b, reason: collision with root package name */
    private final a f69999b;

    public interface a {
        boolean a(@NotNull SSLSocket sSLSocket);

        @NotNull
        m b(@NotNull SSLSocket sSLSocket);
    }

    public l(@NotNull a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f69999b = socketAdapterFactory;
    }

    private final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f69998a == null && this.f69999b.a(sSLSocket)) {
                this.f69998a = this.f69999b.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f69998a;
    }

    @Override // jf.m
    public final boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f69999b.a(sslSocket);
    }

    @Override // jf.m
    public final boolean b() {
        return true;
    }

    @Override // jf.m
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m e11 = e(sslSocket);
        if (e11 != null) {
            return e11.c(sslSocket);
        }
        return null;
    }

    @Override // jf.m
    public final void d(@NotNull SSLSocket sslSocket, String str, @NotNull List<? extends F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        m e11 = e(sslSocket);
        if (e11 != null) {
            e11.d(sslSocket, str, protocols);
        }
    }
}
