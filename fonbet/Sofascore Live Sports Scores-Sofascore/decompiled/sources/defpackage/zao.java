package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zao {
    public final t3p a;
    public final rqn b;
    public final Context c;

    public zao(t3p t3pVar, rqn rqnVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = t3pVar;
        this.b = rqnVar;
        this.c = context;
    }

    public final void a() {
        String packageName = this.c.getPackageName();
        t3p t3pVar = this.a;
        qbp qbpVar = t3pVar.a;
        if (qbpVar != null) {
            t3p.e.f("completeUpdate(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            qbpVar.a().post(new zwo(qbpVar, taskCompletionSource, taskCompletionSource, new zwo(t3pVar, taskCompletionSource, taskCompletionSource, packageName, 1), 2));
            taskCompletionSource.getTask();
            return;
        }
        f79 f79Var = t3p.e;
        Object[] objArr = {-9};
        if (Log.isLoggable("PlayCore", 6)) {
            f79.g(f79Var.b, "onError(%d)", objArr);
        } else {
            f79Var.getClass();
        }
        Tasks.forException(new i5a(-9));
    }

    public final Task b() {
        String packageName = this.c.getPackageName();
        t3p t3pVar = this.a;
        qbp qbpVar = t3pVar.a;
        if (qbpVar != null) {
            t3p.e.f("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            qbpVar.a().post(new zwo(qbpVar, taskCompletionSource, taskCompletionSource, new zwo(t3pVar, taskCompletionSource, packageName, taskCompletionSource), 2));
            return taskCompletionSource.getTask();
        }
        f79 f79Var = t3p.e;
        Object[] objArr = {-9};
        if (Log.isLoggable("PlayCore", 6)) {
            f79.g(f79Var.b, "onError(%d)", objArr);
        } else {
            f79Var.getClass();
        }
        return Tasks.forException(new i5a(-9));
    }
}
