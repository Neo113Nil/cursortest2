package Qa;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class L extends H {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1516f f9569g;

    public L(C1516f c1516f) {
        this.f9569g = c1516f;
    }

    @Override // Qa.H
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        G g10;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        G g11;
        obj = this.f9569g.f9582f;
        synchronized (obj) {
            try {
                atomicInteger = this.f9569g.f9588l;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.f9569g.f9588l;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        g11 = this.f9569g.f9578b;
                        g11.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                C1516f c1516f = this.f9569g;
                iInterface = c1516f.f9590n;
                if (iInterface != null) {
                    g10 = c1516f.f9578b;
                    g10.d("Unbind from service.", new Object[0]);
                    C1516f c1516f2 = this.f9569g;
                    context = c1516f2.f9577a;
                    serviceConnection = c1516f2.f9589m;
                    context.unbindService(serviceConnection);
                    this.f9569g.f9583g = false;
                    this.f9569g.f9590n = null;
                    this.f9569g.f9589m = null;
                }
                this.f9569g.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
