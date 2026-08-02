package s7;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f23148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f23149c;

    public /* synthetic */ v2(x2 x2Var, a0 a0Var, int i5) {
        this.f23147a = i5;
        this.f23148b = a0Var;
        this.f23149c = x2Var;
    }

    private final void a() {
        x2 x2Var = this.f23149c;
        synchronized (x2Var) {
            try {
                x2Var.f23239a = false;
                y2 y2Var = x2Var.f23241c;
                if (!y2Var.A()) {
                    n0 n0Var = ((f1) y2Var.f3328a).f22745f;
                    f1.m(n0Var);
                    n0Var.f22910n.a("Connected to service");
                    a0 a0Var = this.f23148b;
                    y2Var.j();
                    y2Var.f23257d = a0Var;
                    y2Var.w();
                    y2Var.y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23147a) {
            case 0:
                a();
                return;
            default:
                x2 x2Var = this.f23149c;
                synchronized (x2Var) {
                    try {
                        x2Var.f23239a = false;
                        y2 y2Var = x2Var.f23241c;
                        if (!y2Var.A()) {
                            n0 n0Var = ((f1) y2Var.f3328a).f22745f;
                            f1.m(n0Var);
                            n0Var.f22909m.a("Connected to remote service");
                            a0 a0Var = this.f23148b;
                            y2Var.j();
                            y2Var.f23257d = a0Var;
                            y2Var.w();
                            y2Var.y();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                y2 y2Var2 = this.f23149c.f23241c;
                ScheduledExecutorService scheduledExecutorService = y2Var2.f23260g;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    y2Var2.f23260g = null;
                    return;
                }
                return;
        }
    }
}
