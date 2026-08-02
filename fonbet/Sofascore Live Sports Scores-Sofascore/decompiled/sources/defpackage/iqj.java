package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sofascore.model.mvvm.model.PlayerKt;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iqj {
    public final Context a;
    public final pic b;
    public final hcc c;
    public final ScheduledThreadPoolExecutor e;
    public final gqj g;
    public final dh0 d = new dh0(0);
    public boolean f = false;

    public iqj(pic picVar, gqj gqjVar, hcc hccVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = picVar;
        this.g = gqjVar;
        this.c = hccVar;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public final synchronized void a(boolean z) {
        this.f = z;
    }

    public final boolean b() {
        eqj a;
        while (true) {
            synchronized (this) {
                try {
                    a = this.g.a();
                    if (a == null) {
                        return true;
                    }
                } finally {
                }
            }
            hcc hccVar = this.c;
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        k48 k48Var = (k48) ((l48) hccVar.b);
                        String str3 = ((mu0) hcc.G(k48Var.d())).a;
                        ((FirebaseMessaging) hccVar.d).a();
                        hccVar.T(str2, str3, (String) hcc.G(k48Var.c()), "unsubscribe");
                    }
                } else if (str.equals(PlayerKt.VOLLEYBALL_SETTER)) {
                    k48 k48Var2 = (k48) ((l48) hccVar.b);
                    String str4 = ((mu0) hcc.G(k48Var2.d())).a;
                    ((FirebaseMessaging) hccVar.d).a();
                    hccVar.T(str2, str4, (String) hcc.G(k48Var2.c()), "subscribe");
                }
                gqj gqjVar = this.g;
                synchronized (gqjVar) {
                    ejg ejgVar = gqjVar.a;
                    String str5 = a.c;
                    synchronized (((ArrayDeque) ejgVar.b)) {
                        if (((ArrayDeque) ejgVar.b).remove(str5)) {
                            ((ScheduledThreadPoolExecutor) ejgVar.d).execute(new t4f(ejgVar, 6));
                        }
                    }
                }
                synchronized (this.d) {
                    try {
                        String str6 = a.c;
                        if (this.d.containsKey(str6)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.d.get(str6);
                            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                            if (taskCompletionSource != null) {
                                taskCompletionSource.setResult(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.d.remove(str6);
                            }
                        }
                    } finally {
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    e.getMessage();
                    return false;
                }
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    public final void c(long j) {
        this.e.schedule(new kqj(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        a(true);
    }
}
