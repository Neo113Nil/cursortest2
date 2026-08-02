package defpackage;

import com.ironsource.U3;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m6p extends r7p implements Runnable {
    public ddb i;
    public Class j;
    public Object k;

    @Override // defpackage.t6p
    public final void f() {
        ddb ddbVar = this.i;
        if ((ddbVar != null) & isCancelled()) {
            ddbVar.cancel(l());
        }
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override // defpackage.t6p
    public final String g() {
        String str;
        ddb ddbVar = this.i;
        Class cls = this.j;
        Object obj = this.k;
        String g = super.g();
        if (ddbVar != null) {
            String obj2 = ddbVar.toString();
            str = wt3.m("inputFuture=[", obj2, new StringBuilder(obj2.length() + 16), "], ");
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (g != null) {
                return str.concat(g);
            }
            return null;
        }
        int length = str.length();
        String obj3 = cls.toString();
        int length2 = obj3.length();
        String obj4 = obj.toString();
        StringBuilder sb = new StringBuilder(obj4.length() + length + 15 + length2 + 13 + 1);
        bf3.v(sb, str, "exceptionType=[", obj3, "], fallback=[");
        return mz1.o(sb, obj4, U3.j.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        ddb ddbVar = this.i;
        Class cls = this.j;
        Object obj2 = this.k;
        if (((obj2 == null) || ((ddbVar == 0) | (cls == null))) || (this.a instanceof n6p)) {
            return;
        }
        this.i = null;
        try {
            th = ddbVar instanceof z8p ? ((z8p) ddbVar).b() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(ddbVar.getClass());
                String valueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 19 + 16);
                bf3.v(sb, "Future type ", valueOf, " threw ", valueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = mha.J(ddbVar);
            if (th != null) {
                d(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                m(ddbVar);
                return;
            }
            try {
                Object apply = ((x1p) obj2).apply(th);
                this.j = null;
                this.k = null;
                d(apply);
                return;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th2);
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
