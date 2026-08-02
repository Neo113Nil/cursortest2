package D9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: e, reason: collision with root package name */
    public static B f2597e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2598a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f2599b;

    /* renamed from: c, reason: collision with root package name */
    public v f2600c = new v(this, null);

    /* renamed from: d, reason: collision with root package name */
    public int f2601d = 1;

    public B(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f2599b = scheduledExecutorService;
        this.f2598a = context.getApplicationContext();
    }

    public static synchronized B b(Context context) {
        B b10;
        synchronized (B.class) {
            try {
                if (f2597e == null) {
                    zze.zza();
                    f2597e = new B(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new L9.b("MessengerIpcClient"))));
                }
                b10 = f2597e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new x(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new A(f(), i10, bundle));
    }

    public final synchronized int f() {
        int i10;
        i10 = this.f2601d;
        this.f2601d = i10 + 1;
        return i10;
    }

    public final synchronized Task g(y yVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(yVar.toString());
            }
            if (!this.f2600c.g(yVar)) {
                v vVar = new v(this, null);
                this.f2600c = vVar;
                vVar.g(yVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return yVar.f2656b.getTask();
    }
}
