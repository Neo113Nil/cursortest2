package g6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f9834a;

    public /* synthetic */ f0(g0 g0Var) {
        this.f9834a = g0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == 0) {
            g0 g0Var = this.f9834a;
            synchronized (g0Var.f9838a) {
                try {
                    d0 d0Var = (d0) message.obj;
                    e0 e0Var = (e0) g0Var.f9838a.get(d0Var);
                    if (e0Var != null && e0Var.f9826a.isEmpty()) {
                        if (e0Var.f9828c) {
                            d0 d0Var2 = e0Var.f9830e;
                            g0 g0Var2 = e0Var.f9832g;
                            g0Var2.f9840c.removeMessages(1, d0Var2);
                            g0Var2.f9841d.c(g0Var2.f9839b, e0Var);
                            e0Var.f9828c = false;
                            e0Var.f9827b = 2;
                        }
                        g0Var.f9838a.remove(d0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i5 != 1) {
            return false;
        }
        g0 g0Var3 = this.f9834a;
        synchronized (g0Var3.f9838a) {
            try {
                d0 d0Var3 = (d0) message.obj;
                e0 e0Var2 = (e0) g0Var3.f9838a.get(d0Var3);
                if (e0Var2 != null && e0Var2.f9827b == 3) {
                    String valueOf = String.valueOf(d0Var3);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    w0.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = e0Var2.f9831f;
                    if (componentName == null) {
                        d0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = d0Var3.f9801b;
                        v.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    e0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
