package defpackage;

import com.ironsource.U3;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class d1 extends gd8 implements Runnable {
    public static final /* synthetic */ int l = 0;
    public ddb i;
    public Class j;
    public Object k;

    public d1(ddb ddbVar, Class cls, Object obj) {
        ddbVar.getClass();
        this.i = ddbVar;
        this.j = cls;
        this.k = obj;
    }

    @Override // defpackage.g4
    public final void c() {
        ddb ddbVar = this.i;
        if ((ddbVar != null) & (this.a instanceof u3)) {
            ddbVar.cancel(p());
        }
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override // defpackage.g4
    public final String j() {
        String str;
        ddb ddbVar = this.i;
        Class cls = this.j;
        Object obj = this.k;
        String j = super.j();
        if (ddbVar != null) {
            str = "inputFuture=[" + ddbVar + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (j != null) {
                return str.concat(j);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + U3.j.e;
    }

    public abstract Object q(Object obj, Throwable th);

    public abstract void r(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        ddb ddbVar = this.i;
        Class cls = this.j;
        Object obj2 = this.k;
        if (((obj2 == null) || ((ddbVar == null) | (cls == null))) || (this.a instanceof u3)) {
            return;
        }
        this.i = null;
        try {
            th = ddbVar instanceof g4 ? ((g4) ddbVar).o() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + ddbVar.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = hkg.P(ddbVar);
            if (th != null) {
                l(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                n(ddbVar);
                return;
            }
            try {
                Object q = q(obj2, th);
                this.j = null;
                this.k = null;
                r(q);
                return;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th2);
                    return;
                } finally {
                    this.j = null;
                    this.k = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }
}
