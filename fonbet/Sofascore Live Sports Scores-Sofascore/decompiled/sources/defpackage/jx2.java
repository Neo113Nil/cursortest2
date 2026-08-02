package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class jx2 {
    public static final Logger a = Logger.getLogger(jx2.class.getName());
    public static final boolean b;
    public static final ih2 c;

    static {
        b = !vha.M(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        c = new ih2("internal-stub-type", 0);
    }

    public static void a(wkn wknVar, Throwable th) {
        try {
            wknVar.q(null, th);
        } catch (Error | RuntimeException e) {
            a.log(Level.SEVERE, "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static fx2 b(wkn wknVar, ty7 ty7Var) {
        fx2 fx2Var = new fx2(wknVar);
        wknVar.P(new ix2(fx2Var), new qic());
        wknVar.L();
        try {
            wknVar.N(ty7Var);
            wknVar.D();
            return fx2Var;
        } catch (Error | RuntimeException e) {
            a(wknVar, e);
            throw null;
        }
    }

    public static Object c(fx2 fx2Var) {
        try {
            return fx2Var.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw xei.f.h("Thread interrupted").g(e).a();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            z1a.y(cause, "t");
            for (Throwable th = cause; th != null; th = th.getCause()) {
                if (th instanceof zei) {
                    throw new dfi(((zei) th).a, null);
                }
                if (th instanceof dfi) {
                    dfi dfiVar = (dfi) th;
                    throw new dfi(dfiVar.a, dfiVar.b);
                }
            }
            throw xei.g.h("unexpected exception").g(cause).a();
        }
    }
}
