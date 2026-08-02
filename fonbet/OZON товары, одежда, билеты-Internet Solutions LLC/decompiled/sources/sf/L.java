package sf;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
final class L extends C9677c {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Socket f98682m;

    public L(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f98682m = socket;
    }

    @Override // sf.C9677c
    @NotNull
    protected final IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // sf.C9677c
    protected final void u() {
        Logger logger;
        Logger logger2;
        Socket socket = this.f98682m;
        try {
            socket.close();
        } catch (AssertionError e11) {
            if (!z.e(e11)) {
                throw e11;
            }
            logger2 = C9673A.f98647a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        } catch (Exception e12) {
            logger = C9673A.f98647a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e12);
        }
    }
}
