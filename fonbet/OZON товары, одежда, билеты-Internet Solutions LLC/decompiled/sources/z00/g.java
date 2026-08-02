package z00;

import i10.h;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z00.f;

/* loaded from: classes3.dex */
public final class g {
    @NotNull
    public static final f a(@NotNull Throwable th2, h.c cVar, String str) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (c(th2)) {
            return f.a.f106883a;
        }
        f.c.C2320c c2320c = null;
        f.c.a aVar = new f.c.a(cVar instanceof h.c.a ? ((h.c.a) cVar).c() : null, 11);
        long currentTimeMillis = System.currentTimeMillis();
        if (th2 instanceof P00.b) {
            P00.b bVar = (P00.b) th2;
            c2320c = new f.c.C2320c(Integer.valueOf(bVar.a()), bVar.b());
        }
        return new f.c(null, str, aVar, c2320c, Long.valueOf(currentTimeMillis), 13);
    }

    public static final boolean c(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return (th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException);
    }
}
