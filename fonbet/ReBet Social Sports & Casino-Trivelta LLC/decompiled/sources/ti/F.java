package ti;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class F extends C6476f {

    /* renamed from: a, reason: collision with root package name */
    public final Socket f65846a;

    public F(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f65846a = socket;
    }

    @Override // ti.C6476f
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // ti.C6476f
    public void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f65846a.close();
        } catch (AssertionError e10) {
            if (!t.e(e10)) {
                throw e10;
            }
            logger2 = u.f65891a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f65846a, (Throwable) e10);
        } catch (Exception e11) {
            logger = u.f65891a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f65846a, (Throwable) e11);
        }
    }
}
