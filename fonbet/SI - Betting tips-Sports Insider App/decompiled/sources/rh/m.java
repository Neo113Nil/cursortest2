package rh;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f22536a;

    /* renamed from: b, reason: collision with root package name */
    public n f22537b;

    public m(l socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f22536a = socketAdapterFactory;
    }

    @Override // rh.n
    public final String a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        n d10 = d(sslSocket);
        if (d10 != null) {
            return d10.a(sslSocket);
        }
        return null;
    }

    @Override // rh.n
    public final boolean b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f22536a.b(sslSocket);
    }

    @Override // rh.n
    public final void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        n d10 = d(sslSocket);
        if (d10 != null) {
            d10.c(sslSocket, str, protocols);
        }
    }

    public final synchronized n d(SSLSocket sSLSocket) {
        try {
            if (this.f22537b == null && this.f22536a.b(sSLSocket)) {
                this.f22537b = this.f22536a.c(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f22537b;
    }

    @Override // rh.n
    public final boolean isSupported() {
        return true;
    }
}
