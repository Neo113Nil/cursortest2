package defpackage;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class mof implements Runnable {
    public final qh2 a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ pof c;

    public mof(pof pofVar, qh2 qh2Var) {
        this.c = pofVar;
        this.a = qh2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w45 w45Var;
        String concat = "OkHttp ".concat(this.c.b.a.h());
        pof pofVar = this.c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            pofVar.e.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.a.onResponse(pofVar, pofVar.g());
                        w45Var = pofVar.a.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            gie gieVar = gie.a;
                            gie gieVar2 = gie.a;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append((pofVar.q ? "canceled " : "") + NotificationCompat.CATEGORY_CALL + " to " + pofVar.b.a.h());
                            gieVar2.i(4, sb.toString());
                        } else {
                            this.a.onFailure(pofVar, e);
                        }
                        w45Var = pofVar.a.a;
                        w45Var.getClass();
                        w45.c(w45Var, null, null, this, 3);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        pofVar.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.a.onFailure(pofVar, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        w45Var = pofVar.a.a;
                        w45Var.getClass();
                        w45.c(w45Var, null, null, this, 3);
                    }
                } catch (Throwable th2) {
                    w45 w45Var2 = pofVar.a.a;
                    w45Var2.getClass();
                    w45.c(w45Var2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            w45Var.getClass();
            w45.c(w45Var, null, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
