package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class n4d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4d b;

    public /* synthetic */ n4d(p4d p4dVar, ilg ilgVar) {
        this.a = 1;
        this.b = p4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final p4d p4dVar = this.b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = p4dVar.H;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        try {
                            p4dVar.i(true);
                        } catch (InterruptedException e) {
                            p4dVar.j0(e);
                            Thread.currentThread().interrupt();
                        }
                        return;
                    } finally {
                        atomicBoolean.set(false);
                    }
                }
                return;
            case 1:
                final yp5 yp5Var = p4dVar.a.n;
                yp5Var.getClass();
                yp5.a.severe(new Supplier() { // from class: wp5
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        yp5.this.getClass();
                        return yp5.a("socketWriteTimeout", p4dVar, null, new Object[0]);
                    }
                });
                return;
            case 2:
                if (!p4dVar.Z() || p4dVar.e) {
                    return;
                }
                try {
                    p4dVar.I0(false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                p4dVar.h();
                return;
        }
    }

    public /* synthetic */ n4d(p4d p4dVar, int i) {
        this.a = i;
        this.b = p4dVar;
    }
}
