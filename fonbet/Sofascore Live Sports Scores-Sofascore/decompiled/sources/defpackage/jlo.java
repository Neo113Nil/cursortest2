package defpackage;

import com.google.android.gms.internal.ads.zzhcy;
import com.ironsource.U3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class jlo extends tlo implements Runnable {
    public static final /* synthetic */ int j = 0;
    public ddb h;
    public Object i;

    public jlo(ddb ddbVar, Object obj) {
        ddbVar.getClass();
        this.h = ddbVar;
        this.i = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void f() {
        n(this.h);
        this.h = null;
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String g() {
        String str;
        ddb ddbVar = this.h;
        Object obj = this.i;
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

    @Override // java.lang.Runnable
    public final void run() {
        ddb ddbVar = this.h;
        Object obj = this.i;
        if ((isCancelled() | (ddbVar == null)) || (obj == null)) {
            return;
        }
        this.h = null;
        if (ddbVar.isCancelled()) {
            m(ddbVar);
            return;
        }
        try {
            try {
                Object t = t(obj, zzhcy.j(ddbVar));
                this.i = null;
                s(t);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th);
                } finally {
                    this.i = null;
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

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Object obj2);
}
