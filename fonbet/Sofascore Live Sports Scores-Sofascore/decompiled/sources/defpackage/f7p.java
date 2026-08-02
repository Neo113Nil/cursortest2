package defpackage;

import com.ironsource.U3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class f7p extends r7p implements Runnable {
    public static final /* synthetic */ int k = 0;
    public ddb i;
    public Object j;

    public f7p(ddb ddbVar, Object obj) {
        this.i = ddbVar;
        this.j = obj;
    }

    @Override // defpackage.t6p
    public final void f() {
        ddb ddbVar = this.i;
        if ((ddbVar != null) & isCancelled()) {
            ddbVar.cancel(l());
        }
        this.i = null;
        this.j = null;
    }

    @Override // defpackage.t6p
    public final String g() {
        String str;
        ddb ddbVar = this.i;
        Object obj = this.j;
        String g = super.g();
        if (ddbVar != null) {
            String obj2 = ddbVar.toString();
            str = wt3.m("inputFuture=[", obj2, new StringBuilder(obj2.length() + 16), "], ");
        } else {
            str = "";
        }
        if (obj == null) {
            if (g != null) {
                return str.concat(g);
            }
            return null;
        }
        int length = str.length();
        String obj3 = obj.toString();
        return fc6.o(new StringBuilder(obj3.length() + length + 10 + 1), str, "function=[", obj3, U3.j.e);
    }

    public abstract void q(Object obj);

    public abstract Object r(Object obj, Object obj2);

    @Override // java.lang.Runnable
    public final void run() {
        ddb ddbVar = this.i;
        Object obj = this.j;
        if ((isCancelled() | (ddbVar == null)) || (obj == null)) {
            return;
        }
        this.i = null;
        if (ddbVar.isCancelled()) {
            m(ddbVar);
            return;
        }
        try {
            try {
                Object r = r(obj, mha.J(ddbVar));
                this.j = null;
                q(r);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th);
                } finally {
                    this.j = null;
                }
            }
        } catch (Error e) {
            e(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            e(e2.getCause());
        } catch (Exception e3) {
            e(e3);
        }
    }
}
