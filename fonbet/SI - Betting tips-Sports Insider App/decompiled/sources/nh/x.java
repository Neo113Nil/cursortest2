package nh;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import okio.AsyncTimeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class x extends AsyncTimeout {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f21032a;

    public x(y yVar) {
        this.f21032a = yVar;
    }

    public final void a() {
        if (exit()) {
            throw newTimeoutException(null);
        }
    }

    @Override // okio.AsyncTimeout
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
        this.f21032a.e(b.f20921h);
        q qVar = this.f21032a.f21034b;
        synchronized (qVar) {
            long j = qVar.f20993n;
            long j6 = qVar.f20992m;
            if (j < j6) {
                return;
            }
            qVar.f20992m = j6 + 1;
            qVar.f20994o = System.nanoTime() + 1000000000;
            Unit unit = Unit.f19194a;
            jh.c.c(qVar.f20988h, d9.e.l(new StringBuilder(), qVar.f20983c, " ping"), new me.a(3, qVar));
        }
    }
}
