package defpackage;

import com.ironsource.U3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class g8 extends gd8 implements Runnable {
    public static final /* synthetic */ int k = 0;
    public ddb i;
    public Object j;

    public g8(ddb ddbVar, Object obj) {
        ddbVar.getClass();
        this.i = ddbVar;
        this.j = obj;
    }

    public static e8 q(ddb ddbVar, fj0 fj0Var, Executor executor) {
        executor.getClass();
        e8 e8Var = new e8(ddbVar, fj0Var);
        ddbVar.addListener(e8Var, oea.u(executor, e8Var));
        return e8Var;
    }

    @Override // defpackage.g4
    public final void c() {
        ddb ddbVar = this.i;
        if ((ddbVar != null) & (this.a instanceof u3)) {
            ddbVar.cancel(p());
        }
        this.i = null;
        this.j = null;
    }

    @Override // defpackage.g4
    public final String j() {
        String str;
        ddb ddbVar = this.i;
        Object obj = this.j;
        String j = super.j();
        if (ddbVar != null) {
            str = "inputFuture=[" + ddbVar + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (j != null) {
                return str.concat(j);
            }
            return null;
        }
        return str + "function=[" + obj + U3.j.e;
    }

    public abstract Object r(Object obj, Object obj2);

    @Override // java.lang.Runnable
    public final void run() {
        ddb ddbVar = this.i;
        Object obj = this.j;
        if (((this.a instanceof u3) | (ddbVar == null)) || (obj == null)) {
            return;
        }
        this.i = null;
        if (ddbVar.isCancelled()) {
            n(ddbVar);
            return;
        }
        try {
            try {
                Object r = r(obj, hkg.P(ddbVar));
                this.j = null;
                s(r);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.j = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }

    public abstract void s(Object obj);
}
