package of;

import I0.C3173b;
import We.A;
import We.y;
import We.z;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* renamed from: of.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8730i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78313a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z f78314b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f78315c;

    /* renamed from: d, reason: collision with root package name */
    private final IOException f78316d;

    public C8730i(@NotNull String requestLine, @NotNull z headers, @NotNull List chunkSizes, @NotNull C9681g body, @NotNull Socket socket, IOException iOException) {
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(chunkSizes, "chunkSizes");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f78313a = requestLine;
        this.f78314b = headers;
        this.f78315c = chunkSizes;
        this.f78316d = iOException;
        boolean z11 = socket instanceof SSLSocket;
        if (z11) {
            try {
                y.a aVar = y.f33814e;
                SSLSession session = ((SSLSocket) socket).getSession();
                Intrinsics.checkNotNullExpressionValue(session, "socket.session");
                aVar.getClass();
                y.a.a(session);
            } catch (IOException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        if (requestLine.length() > 0) {
            int I11 = kotlin.text.h.I(' ', 0, 6, requestLine);
            int i11 = I11 + 1;
            int I12 = kotlin.text.h.I(' ', i11, 4, requestLine);
            Intrinsics.checkNotNullExpressionValue(requestLine.substring(0, I11), "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring = requestLine.substring(i11, I12);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            substring = kotlin.text.h.e0(substring, "/", false) ? substring : "/";
            String str = z11 ? "https" : "http";
            InetAddress inetAddress = socket.getLocalAddress();
            Intrinsics.checkNotNullExpressionValue(inetAddress, "inetAddress");
            String hostname = inetAddress.getHostName();
            if (inetAddress instanceof Inet6Address) {
                Intrinsics.checkNotNullExpressionValue(hostname, "hostname");
                if (kotlin.text.h.u(hostname, ':')) {
                    hostname = C3173b.a(']', "[", hostname);
                }
            }
            int localPort = socket.getLocalPort();
            A.f33515l.getClass();
            A.b.e(str + "://" + hostname + ':' + localPort + substring);
        }
    }

    public final IOException a() {
        return this.f78316d;
    }

    public final String b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (String) C7714v.M(this.f78314b.l(name));
    }

    @NotNull
    public final String c() {
        return this.f78313a;
    }

    @NotNull
    public final String toString() {
        return this.f78313a;
    }
}
