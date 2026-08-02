package defpackage;

import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzhea;
import com.ironsource.U3;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class vko extends tlo implements Runnable {
    public static final /* synthetic */ int k = 0;
    public ddb h;
    public Class i;
    public Object j;

    public vko(ddb ddbVar, Class cls, Object obj) {
        ddbVar.getClass();
        this.h = ddbVar;
        this.i = cls;
        this.j = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void f() {
        n(this.h);
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String g() {
        String str;
        ddb ddbVar = this.h;
        Class cls = this.i;
        Object obj = this.j;
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
        ddb ddbVar = this.h;
        Class cls = this.i;
        Object obj2 = this.j;
        if (((obj2 == null) || ((ddbVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.h = null;
        try {
            th = ddbVar instanceof zzhea ? ((zzhea) ddbVar).b() : null;
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
            obj = zzhcy.j(ddbVar);
            if (th != null) {
                d(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                m(ddbVar);
                return;
            }
            try {
                Object t = t(obj2, th);
                this.i = null;
                this.j = null;
                s(t);
                return;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th2);
                    return;
                } finally {
                    this.i = null;
                    this.j = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Throwable th);
}
