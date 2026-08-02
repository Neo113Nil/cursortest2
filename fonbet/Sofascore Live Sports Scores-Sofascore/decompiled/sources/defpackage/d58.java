package defpackage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class d58 implements SuccessContinuation, Continuation {
    public final /* synthetic */ e58 a;

    public /* synthetic */ d58(e58 e58Var) {
        this.a = e58Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        e58 e58Var = this.a;
        boolean z = false;
        if (task.isSuccessful()) {
            di3 di3Var = e58Var.d;
            synchronized (di3Var) {
                di3Var.c = Tasks.forResult(null);
            }
            ri3 ri3Var = di3Var.b;
            synchronized (ri3Var) {
                ri3Var.a.deleteFile(ri3Var.b);
            }
            fi3 fi3Var = (fi3) task.getResult();
            if (fi3Var != null) {
                JSONArray jSONArray = fi3Var.d;
                l38 l38Var = e58Var.b;
                if (l38Var != null) {
                    try {
                        l38Var.c(e58.i(jSONArray));
                    } catch (a9 | JSONException unused) {
                    }
                }
                g7h g7hVar = e58Var.k;
                try {
                    av0 q = ((y3g) g7hVar.c).q(fi3Var);
                    Iterator it = ((Set) g7hVar.e).iterator();
                    while (it.hasNext()) {
                        ((Executor) g7hVar.d).execute(new z5g((pw3) it.next(), q, 0));
                    }
                } catch (g58 unused2) {
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        e58 e58Var = this.a;
        Task b = e58Var.d.b();
        Task b2 = e58Var.e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{b, b2}).continueWithTask(e58Var.c, new li3(5, e58Var, b, b2));
    }
}
