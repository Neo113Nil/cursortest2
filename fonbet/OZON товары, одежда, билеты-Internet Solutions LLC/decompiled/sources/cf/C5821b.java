package cf;

import We.C4872n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: cf.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5821b {

    /* renamed from: a, reason: collision with root package name */
    private int f57067a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f57068b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f57069c;

    /* renamed from: d, reason: collision with root package name */
    private final List<C4872n> f57070d;

    public C5821b(@NotNull List<C4872n> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f57070d = connectionSpecs;
    }

    @NotNull
    public final C4872n a(@NotNull SSLSocket sslSocket) throws IOException {
        boolean z11;
        C4872n c4872n;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i11 = this.f57067a;
        List<C4872n> list = this.f57070d;
        int size = list.size();
        while (true) {
            z11 = true;
            if (i11 >= size) {
                c4872n = null;
                break;
            }
            c4872n = list.get(i11);
            if (c4872n.e(sslSocket)) {
                this.f57067a = i11 + 1;
                break;
            }
            i11++;
        }
        if (c4872n != null) {
            int i12 = this.f57067a;
            int size2 = list.size();
            while (true) {
                if (i12 >= size2) {
                    z11 = false;
                    break;
                }
                if (list.get(i12).e(sslSocket)) {
                    break;
                }
                i12++;
            }
            this.f57068b = z11;
            c4872n.c(sslSocket, this.f57069c);
            return c4872n;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f57069c);
        sb2.append(", modes=");
        sb2.append(list);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.f(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(@NotNull IOException e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.f57069c = true;
        if (!this.f57068b || (e11 instanceof ProtocolException) || (e11 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e11 instanceof SSLHandshakeException) && (e11.getCause() instanceof CertificateException)) || (e11 instanceof SSLPeerUnverifiedException) || !(e11 instanceof SSLException)) ? false : true;
    }
}
