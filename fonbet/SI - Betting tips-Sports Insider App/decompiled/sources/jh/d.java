package jh;

import com.google.android.gms.internal.measurement.y3;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f18550a;

    public d(e eVar) {
        this.f18550a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a b10;
        long j;
        a b11;
        e eVar = this.f18550a;
        synchronized (eVar) {
            eVar.f18559g++;
            b10 = eVar.b();
        }
        if (b10 == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(b10.f18538a);
                Logger logger = this.f18550a.f18554b;
                c cVar = b10.f18540c;
                Intrinsics.checkNotNull(cVar);
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    i2.d dVar = cVar.f18544a.f18553a;
                    j = System.nanoTime();
                    y3.c(logger, b10, cVar, "starting");
                } else {
                    j = -1;
                }
                try {
                    long a7 = b10.a();
                    if (isLoggable) {
                        i2.d dVar2 = cVar.f18544a.f18553a;
                        y3.c(logger, b10, cVar, "finished run in " + y3.l(System.nanoTime() - j));
                    }
                    e eVar2 = this.f18550a;
                    synchronized (eVar2) {
                        e.a(eVar2, b10, a7, true);
                        b11 = eVar2.b();
                    }
                    if (b11 == null) {
                        return;
                    } else {
                        b10 = b11;
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        i2.d dVar3 = cVar.f18544a.f18553a;
                        y3.c(logger, b10, cVar, "failed a run in " + y3.l(System.nanoTime() - j));
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    e eVar3 = this.f18550a;
                    synchronized (eVar3) {
                        e.a(eVar3, b10, -1L, false);
                        Unit unit = Unit.f19194a;
                        if (!(th3 instanceof InterruptedException)) {
                            throw th3;
                        }
                        Thread.currentThread().interrupt();
                        return;
                    }
                } finally {
                    currentThread.setName(name);
                }
            }
        }
    }
}
