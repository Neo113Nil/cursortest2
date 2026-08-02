package n3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import e3.x;
import f3.j0;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f20847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f20848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3.p f20849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f20850d;

    public /* synthetic */ q(r rVar, UUID uuid, e3.p pVar, Context context) {
        this.f20847a = rVar;
        this.f20848b = uuid;
        this.f20849c = pVar;
        this.f20850d = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r rVar = this.f20847a;
        UUID uuid = this.f20848b;
        e3.p pVar = this.f20849c;
        Context context = this.f20850d;
        String uuid2 = uuid.toString();
        m3.o c2 = rVar.f20853c.c(uuid2);
        if (c2 == null || c2.f20332b.a()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        f3.f fVar = (f3.f) rVar.f20852b;
        synchronized (fVar.f9362k) {
            try {
                x.e().f(f3.f.f9352l, "Moving WorkSpec (" + uuid2 + ") to the foreground");
                j0 j0Var = (j0) fVar.f9359g.remove(uuid2);
                if (j0Var != null) {
                    if (fVar.f9353a == null) {
                        PowerManager.WakeLock a7 = n.a(fVar.f9354b);
                        fVar.f9353a = a7;
                        a7.acquire();
                    }
                    fVar.f9358f.put(uuid2, j0Var);
                    Intent c8 = l3.b.c(fVar.f9354b, m4.g.j(j0Var.f9377a), pVar);
                    Context context2 = fVar.f9354b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        d0.b.c(context2, c8);
                    } else {
                        context2.startService(c8);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m3.j j = m4.g.j(c2);
        String str = l3.b.j;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", pVar.f8557a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pVar.f8558b);
        intent.putExtra("KEY_NOTIFICATION", pVar.f8559c);
        intent.putExtra("KEY_WORKSPEC_ID", j.f20321a);
        intent.putExtra("KEY_GENERATION", j.f20322b);
        context.startService(intent);
        return null;
    }
}
